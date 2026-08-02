package defpackage;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.adjust.sdk.Constants;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.common.network.Request;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes10.dex */
public final class rch extends nz4 implements xuu {
    public HttpURLConnection A;
    public InputStream B;
    public boolean C;
    public int D;
    public long E;
    public long F;
    public final boolean a;
    public final int b;
    public final int c;
    public final String w;
    public final wuu x;
    public final wuu y;
    public npg z;

    public rch(String str, int i, int i2, boolean z, wuu wuuVar) {
        super(true);
        this.w = str;
        this.b = i;
        this.c = i2;
        this.a = z;
        this.x = wuuVar;
        this.y = new wuu();
    }

    @Override // defpackage.xuu
    public final void clearAllRequestProperties() {
        this.y.a();
    }

    @Override // defpackage.xuu
    public final void clearRequestProperty(String str) {
        str.getClass();
        this.y.d(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kpg
    public final void close() {
        try {
            InputStream inputStream = this.B;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    npg npgVar = this.z;
                    int i = tw21.a;
                    throw new HttpDataSource$HttpDataSourceException(e, npgVar, 2000, 3);
                }
            }
        } finally {
            this.B = null;
            closeConnectionQuietly();
            if (this.C) {
                this.C = false;
                transferEnded();
            }
            this.A = null;
            this.z = null;
        }
    }

    public final void closeConnectionQuietly() {
        HttpURLConnection httpURLConnection = this.A;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                lk91.f("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // defpackage.xuu
    public final int getResponseCode() {
        int i;
        if (this.A == null || (i = this.D) <= 0) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.kpg
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.A;
        return httpURLConnection == null ? ImmutableMap.f() : new qch(httpURLConnection.getHeaderFields());
    }

    @Override // defpackage.kpg
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.A;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        npg npgVar = this.z;
        if (npgVar != null) {
            return npgVar.a;
        }
        return null;
    }

    public final URL handleRedirect(URL url, String str, npg npgVar) {
        if (str == null) {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", npgVar, 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!Constants.SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource$HttpDataSourceException(g8e.o("Unsupported protocol redirect: ", protocol), npgVar, 2001);
            }
            if (this.a || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + Extension.C_BRAKE, npgVar, 2001);
        } catch (MalformedURLException e) {
            throw new HttpDataSource$HttpDataSourceException(e, npgVar, 2001, 1);
        }
    }

    public final HttpURLConnection makeConnection(npg npgVar) {
        HttpURLConnection makeConnection;
        URL url = new URL(npgVar.a.toString());
        int i = npgVar.c;
        byte[] bArr = npgVar.d;
        long j = npgVar.f;
        long j2 = npgVar.g;
        int i2 = 1;
        boolean c = npgVar.c(1);
        if (!this.a) {
            return makeConnection(url, i, bArr, j, j2, c, true, npgVar.e);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 > 20) {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException(oyr.i(i4, "Too many redirects: ")), npgVar, 2001, 1);
            }
            makeConnection = makeConnection(url, i, bArr, j, j2, c, false, npgVar.e);
            int responseCode = makeConnection.getResponseCode();
            String headerField = makeConnection.getHeaderField("Location");
            if ((i == i2 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                makeConnection.disconnect();
                url = handleRedirect(url, headerField, npgVar);
            } else {
                if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                makeConnection.disconnect();
                url = handleRedirect(url, headerField, npgVar);
                bArr = null;
                i = 1;
            }
            i3 = i4;
            i2 = 1;
        }
        return makeConnection;
    }

    @Override // defpackage.kpg
    public final long open(npg npgVar) {
        byte[] bArr;
        this.z = npgVar;
        this.F = 0L;
        this.E = 0L;
        transferInitializing(npgVar);
        try {
            HttpURLConnection makeConnection = makeConnection(npgVar);
            long j = npgVar.g;
            long j2 = npgVar.f;
            this.A = makeConnection;
            this.D = makeConnection.getResponseCode();
            String responseMessage = makeConnection.getResponseMessage();
            int i = this.D;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = makeConnection.getHeaderFields();
                if (this.D == 416 && j2 == pwu.c(makeConnection.getHeaderField("Content-Range"))) {
                    this.C = true;
                    transferStarted(npgVar);
                    if (j != -1) {
                        return j;
                    }
                    return 0L;
                }
                InputStream errorStream = makeConnection.getErrorStream();
                try {
                    bArr = errorStream != null ? p77.b(errorStream) : tw21.c;
                } catch (IOException unused) {
                    bArr = tw21.c;
                }
                byte[] bArr2 = bArr;
                closeConnectionQuietly();
                throw new HttpDataSource$InvalidResponseCodeException(this.D, responseMessage, this.D == 416 ? new DataSourceException(2008) : null, headerFields, npgVar, bArr2);
            }
            makeConnection.getContentType();
            long j3 = (this.D != 200 || j2 == 0) ? 0L : j2;
            boolean equalsIgnoreCase = Request.PARAM_GZIP.equalsIgnoreCase(makeConnection.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                this.E = j;
            } else if (j != -1) {
                this.E = j;
            } else {
                long b = pwu.b(makeConnection.getHeaderField("Content-Length"), makeConnection.getHeaderField("Content-Range"));
                this.E = b != -1 ? b - j3 : -1L;
            }
            try {
                this.B = makeConnection.getInputStream();
                if (equalsIgnoreCase) {
                    this.B = new GZIPInputStream(this.B);
                }
                this.C = true;
                transferStarted(npgVar);
                try {
                    skipFully(j3, npgVar);
                    return this.E;
                } catch (IOException e) {
                    closeConnectionQuietly();
                    if (e instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e, npgVar, 2000, 1);
                }
            } catch (IOException e2) {
                closeConnectionQuietly();
                throw new HttpDataSource$HttpDataSourceException(e2, npgVar, 2000, 1);
            }
        } catch (IOException e3) {
            closeConnectionQuietly();
            throw HttpDataSource$HttpDataSourceException.a(e3, npgVar, 1);
        }
    }

    @Override // defpackage.apg
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.E;
            if (j != -1) {
                long j2 = j - this.F;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.B;
            int i3 = tw21.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.F += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            npg npgVar = this.z;
            int i4 = tw21.a;
            throw HttpDataSource$HttpDataSourceException.a(e, npgVar, 2);
        }
    }

    @Override // defpackage.xuu
    public final void setRequestProperty(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.y.e(str, str2);
    }

    public final void skipFully(long j, npg npgVar) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int min = (int) Math.min(j, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            InputStream inputStream = this.B;
            int i = tw21.a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), npgVar, 2000, 1);
            }
            if (read == -1) {
                throw new HttpDataSource$HttpDataSourceException(npgVar, 2008);
            }
            j -= read;
            bytesTransferred(read);
        }
    }

    public final HttpURLConnection makeConnection(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.b);
        httpURLConnection.setReadTimeout(this.c);
        HashMap hashMap = new HashMap();
        wuu wuuVar = this.x;
        if (wuuVar != null) {
            hashMap.putAll(wuuVar.c());
        }
        hashMap.putAll(this.y.c());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a = pwu.a(j, j2);
        if (a != null) {
            httpURLConnection.setRequestProperty("Range", a);
        }
        String str = this.w;
        if (str != null) {
            httpURLConnection.setRequestProperty(ExtFunctionsKt.HEADER_USER_AGENT, str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? Request.PARAM_GZIP : ClidProvider.IDENTITY);
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(npg.b(i));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return httpURLConnection;
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }
}
