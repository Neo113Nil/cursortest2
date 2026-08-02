package defpackage;

import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.n;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import ru.yandex.common.network.Request;

/* loaded from: classes.dex */
public final class x2a1 implements Runnable {
    public final URL a;
    public final byte[] b;
    public final l2a1 c;
    public final String w;
    public final Map x;
    public final /* synthetic */ f3a1 y;

    public x2a1(f3a1 f3a1Var, String str, URL url, byte[] bArr, Map map, l2a1 l2a1Var) {
        Objects.requireNonNull(f3a1Var);
        this.y = f3a1Var;
        cvw.i(str);
        cvw.l(url);
        this.a = url;
        this.b = bArr;
        this.c = l2a1Var;
        this.w = str;
        this.x = map;
    }

    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0102: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:76:0x0100 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0105: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:73:0x0104 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int i2;
        Map map2;
        Throwable th;
        int responseCode;
        Map map3;
        Map map4;
        InputStream inputStream;
        String str = this.w;
        f3a1 f3a1Var = this.y;
        g gVar = (g) f3a1Var.b;
        g gVar2 = (g) f3a1Var.b;
        aaa1 aaa1Var = gVar.z;
        g.g(aaa1Var);
        aaa1Var.Kg();
        OutputStream outputStream = null;
        try {
            URLConnection openConnection = this.a.openConnection();
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            gVar2.getClass();
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map5 = this.x;
                if (map5 != null) {
                    for (Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                byte[] bArr = this.b;
                if (bArr != null) {
                    f3a1 f3a1Var2 = f3a1Var.c.z;
                    n.O(f3a1Var2);
                    byte[] sh = f3a1Var2.sh(bArr);
                    y1a1 y1a1Var = gVar2.y;
                    g.g(y1a1Var);
                    l1a1 l1a1Var = y1a1Var.H;
                    int length = sh.length;
                    l1a1Var.b(Integer.valueOf(length), "Uploading data. size");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", Request.PARAM_GZIP);
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(sh);
                        outputStream2.close();
                    } catch (IOException e) {
                        iOException = e;
                        i2 = 0;
                        map2 = null;
                        outputStream = outputStream2;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        aaa1 aaa1Var2 = gVar2.z;
                        g.g(aaa1Var2);
                        aaa1Var2.Pg(new e1a1(this.w, this.c, i2, iOException, (byte[]) null, map2));
                    } catch (Throwable th2) {
                        th = th2;
                        i = 0;
                        map = null;
                        outputStream = outputStream2;
                        th = th;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        aaa1 aaa1Var3 = gVar2.z;
                        g.g(aaa1Var3);
                        aaa1Var3.Pg(new e1a1(this.w, this.c, i, (IOException) null, (byte[]) null, map));
                        throw th;
                    }
                }
                responseCode = httpURLConnection.getResponseCode();
            } catch (IOException e2) {
                iOException = e2;
                i2 = 0;
                map2 = null;
            } catch (Throwable th3) {
                th = th3;
                i = 0;
                map = null;
            }
            try {
                try {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            byte[] bArr2 = new byte[1024];
                            while (true) {
                                int read = inputStream.read(bArr2);
                                if (read <= 0) {
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    inputStream.close();
                                    httpURLConnection.disconnect();
                                    aaa1 aaa1Var4 = gVar2.z;
                                    g.g(aaa1Var4);
                                    aaa1Var4.Pg(new e1a1(this.w, this.c, responseCode, (IOException) null, byteArray, headerFields));
                                    return;
                                }
                                byteArrayOutputStream.write(bArr2, 0, read);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        inputStream = null;
                    }
                } catch (IOException e3) {
                    e = e3;
                    i2 = responseCode;
                    map2 = map4;
                    iOException = e;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e4) {
                            y1a1 y1a1Var2 = gVar2.y;
                            g.g(y1a1Var2);
                            y1a1Var2.z.c("Error closing HTTP compressed POST connection output stream. appId", y1a1.Og(str), e4);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    aaa1 aaa1Var22 = gVar2.z;
                    g.g(aaa1Var22);
                    aaa1Var22.Pg(new e1a1(this.w, this.c, i2, iOException, (byte[]) null, map2));
                } catch (Throwable th6) {
                    th = th6;
                    i = responseCode;
                    map = map3;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e5) {
                            y1a1 y1a1Var3 = gVar2.y;
                            g.g(y1a1Var3);
                            y1a1Var3.z.c("Error closing HTTP compressed POST connection output stream. appId", y1a1.Og(str), e5);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    aaa1 aaa1Var32 = gVar2.z;
                    g.g(aaa1Var32);
                    aaa1Var32.Pg(new e1a1(this.w, this.c, i, (IOException) null, (byte[]) null, map));
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                map2 = null;
                i2 = responseCode;
                iOException = e;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                aaa1 aaa1Var222 = gVar2.z;
                g.g(aaa1Var222);
                aaa1Var222.Pg(new e1a1(this.w, this.c, i2, iOException, (byte[]) null, map2));
            } catch (Throwable th7) {
                th = th7;
                map = null;
                i = responseCode;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                aaa1 aaa1Var322 = gVar2.z;
                g.g(aaa1Var322);
                aaa1Var322.Pg(new e1a1(this.w, this.c, i, (IOException) null, (byte[]) null, map));
                throw th;
            }
        } catch (IOException e7) {
            iOException = e7;
            i2 = 0;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th8) {
            th = th8;
            i = 0;
            httpURLConnection = null;
            map = null;
        }
    }
}
