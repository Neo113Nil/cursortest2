package org.altbeacon.beacon.distance;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.Settings;
import defpackage.b64;
import defpackage.unr0;
import defpackage.w430;
import defpackage.z1k;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import ru.yandex.common.startup.StartupRequest;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes4.dex */
public class ModelSpecificDistanceUpdater extends AsyncTask<Void, Void, Void> {
    private static final String TAG = "ModelSpecificDistanceUpdater";
    private w430 mCompletionHandler;
    private Context mContext;
    private z1k mDistanceConfigFetcher;
    private Exception exception = null;
    private String urlString = null;
    private String response = null;

    public ModelSpecificDistanceUpdater(Context context, String str, w430 w430Var) {
        this.mContext = context;
        String userAgentString = getUserAgentString();
        z1k z1kVar = new z1k();
        z1kVar.b = -1;
        z1kVar.c = str;
        z1kVar.d = userAgentString;
        this.mDistanceConfigFetcher = z1kVar;
    }

    private String getInstallId() {
        return Settings.Secure.getString(this.mContext.getContentResolver(), StartupRequest.PARAM_ANDROID_ID);
    }

    private String getModel() {
        String str = Build.VERSION.RELEASE;
        return unr0.r(b64.v("", Build.MANUFACTURER, ";", Build.MODEL, ";"), Build.ID, ";", str);
    }

    private String getPackage() {
        return this.mContext.getPackageName();
    }

    private String getUserAgentString() {
        return "Android Beacon Library;" + getVersion() + ";" + getPackage() + ";" + getInstallId() + ";" + getModel();
    }

    private String getVersion() {
        return "2.21.0-beta3";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f A[ADDED_TO_REGION, EDGE_INSN: B:37:0x006f->B:19:0x006f BREAK  A[LOOP:0: B:2:0x000a->B:34:0x000a], SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Void doInBackground(Void... voidArr) {
        URL url;
        HttpURLConnection httpURLConnection;
        SecurityException e;
        IOException e2;
        FileNotFoundException e3;
        int i;
        z1k z1kVar = this.mDistanceConfigFetcher;
        z1kVar.getClass();
        String str = z1kVar.c;
        int i2 = 0;
        HttpURLConnection httpURLConnection2 = null;
        while (true) {
            if (i2 != 0) {
                httpURLConnection2.getHeaderField("Location");
                str = httpURLConnection2.getHeaderField("Location");
            }
            i2++;
            z1kVar.b = -1;
            try {
                url = new URL(str);
            } catch (Exception e4) {
                z1kVar.a = e4;
                url = null;
            }
            if (url != null) {
                try {
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                    try {
                        httpURLConnection.addRequestProperty(ExtFunctionsKt.HEADER_USER_AGENT, z1kVar.d);
                        z1kVar.b = httpURLConnection.getResponseCode();
                        httpURLConnection.getResponseCode();
                    } catch (FileNotFoundException e5) {
                        e3 = e5;
                        z1kVar.a = e3;
                        httpURLConnection2 = httpURLConnection;
                        if (i2 >= 10) {
                            break;
                        }
                        break;
                        if (z1kVar.a == null) {
                        }
                        return null;
                    } catch (IOException e6) {
                        e2 = e6;
                        z1kVar.a = e2;
                        httpURLConnection2 = httpURLConnection;
                        if (i2 >= 10) {
                        }
                        if (z1kVar.a == null) {
                        }
                        return null;
                    } catch (SecurityException e7) {
                        e = e7;
                        z1kVar.a = e;
                        httpURLConnection2 = httpURLConnection;
                        if (i2 >= 10) {
                        }
                        if (z1kVar.a == null) {
                        }
                        return null;
                    }
                } catch (FileNotFoundException e8) {
                    httpURLConnection = httpURLConnection2;
                    e3 = e8;
                } catch (IOException e9) {
                    httpURLConnection = httpURLConnection2;
                    e2 = e9;
                } catch (SecurityException e10) {
                    httpURLConnection = httpURLConnection2;
                    e = e10;
                }
                httpURLConnection2 = httpURLConnection;
            }
            if (i2 >= 10 || ((i = z1kVar.b) != 302 && i != 301 && i != 303)) {
                break;
            }
        }
        if (z1kVar.a == null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream()));
                while (bufferedReader.readLine() != null) {
                }
                bufferedReader.close();
            } catch (Exception e11) {
                z1kVar.a = e11;
            }
        }
        return null;
    }

    public void onPostExecute() {
    }
}
