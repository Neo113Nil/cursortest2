package com.fillr.service;

import android.app.IntentService;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.Log;
import com.fillr.browsersdk.Fillr;
import com.fillr.core.utilities.ConnectionUtil;
import com.fillr.q0;
import com.squareup.cash.R;
import dev.chrisbanes.haze.Pool;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import net.idrnd.misnap.iad.Payload;
import net.oneformapp.DLog;
import net.oneformapp.schema.Schema_;

/* loaded from: classes4.dex */
public class DownloadSchemaService extends IntentService {
    public Pool authStore;
    public int mCheckcount;
    public Schema_ schema;

    public DownloadSchemaService() {
        super("schema Checker");
    }

    public final void checkXSD() {
        boolean z;
        boolean z2 = true;
        this.mCheckcount++;
        Resources resources = getResources();
        HttpURLConnection httpURLConnection = null;
        String string2 = resources != null ? resources.getString(R.string.schema_language) : null;
        if (string2 == null && Locale.getDefault() != null && Locale.getDefault().getCountry().equalsIgnoreCase("IN")) {
            string2 = "in";
        }
        if (string2 == null) {
            string2 = "en";
        }
        Pool pool = this.authStore;
        String str = "https://schema.fillr.com/v5/fillr-schema" + "-".concat(string2) + ".xsd.gz";
        Log.d("FillrSchemaConfig", "getEndPoint: ".concat(str));
        try {
            try {
                try {
                    try {
                    } catch (MalformedURLException e) {
                        DLog.d(this, e.toString());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                } catch (IOException e2) {
                    DLog.d(this, e2.toString());
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            } catch (q0 e3) {
                Log.e(getClass().getName(), "Couldn't parse schema", e3);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
            if (ConnectionUtil.isConnected(this)) {
                URL url = new URL(str);
                Fillr fillr = Fillr.getInstance();
                httpURLConnection = fillr != null ? fillr.globalTlsProxyEnabled : false ? (HttpURLConnection) url.openConnection(Proxy.NO_PROXY) : (HttpURLConnection) url.openConnection();
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                if (((SharedPreferences) ((Payload) pool.pool).a).getString("xsdETag", "") != null) {
                    httpURLConnection.addRequestProperty("If-None-Match", ((SharedPreferences) ((Payload) pool.pool).a).getString("xsdETag", ""));
                }
                httpURLConnection.setUseCaches(false);
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    String headerField = httpURLConnection.getHeaderField("Content-Encoding");
                    if (headerField != null && "gzip".equalsIgnoreCase(headerField)) {
                        inputStream = new GZIPInputStream(inputStream);
                    }
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                    deleteFile("fillr-schema.xsd");
                    FileOutputStream openFileOutput = openFileOutput("fillr-schema.xsd", 0);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        } else {
                            openFileOutput.write(bArr, 0, read);
                        }
                    }
                    openFileOutput.flush();
                    openFileOutput.close();
                    bufferedInputStream.close();
                    pool.setXsdETag(httpURLConnection.getHeaderField("ETag"));
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openFileInput("fillr-schema.xsd")));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            z = false;
                            break;
                        } else if (readLine.trim().equalsIgnoreCase("</xs:schema>")) {
                            z = true;
                            break;
                        }
                    }
                    bufferedReader.close();
                    if (z) {
                        httpURLConnection.disconnect();
                    }
                } else if (responseCode == 304) {
                    z2 = false;
                }
                httpURLConnection.disconnect();
                if (z2 || this.mCheckcount >= 2) {
                    this.schema.forceLoadSchema(this);
                } else {
                    checkXSD();
                    return;
                }
            }
            z2 = false;
            if (z2) {
            }
            this.schema.forceLoadSchema(this);
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        Pool pool = new Pool();
        pool.pool = new Payload(this);
        this.authStore = pool;
        this.schema = Schema_.getInstance_(this);
        checkXSD();
    }
}
