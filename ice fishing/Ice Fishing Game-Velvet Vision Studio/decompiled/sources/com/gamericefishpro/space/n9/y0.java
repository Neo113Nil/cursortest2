package com.gamericefishpro.space.n9;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements Runnable {
    public final /* synthetic */ int d = 1;
    public final URL e;
    public final byte[] i;
    public final String v;
    public final Map w;
    public final Object y;
    public final /* synthetic */ com.gamericefishpro.space.g1.b z;

    public y0(z0 z0Var, String str, URL url, byte[] bArr, Map map, x0 x0Var) {
        Objects.requireNonNull(z0Var);
        this.z = z0Var;
        com.gamericefishpro.space.v8.c0.d(str);
        com.gamericefishpro.space.v8.c0.g(url);
        this.e = url;
        this.i = bArr;
        this.y = x0Var;
        this.v = str;
        this.w = map;
    }

    public void a(int i, IOException iOException, byte[] bArr, Map map) {
        p1 p1Var = ((r1) ((x2) this.z).d).z;
        r1.l(p1Var);
        p1Var.A(new w2(this, i, iOException, bArr, map));
    }

    /* JADX WARN: Code duplicated, block: B:163:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:173:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:177:0x02ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0154  */
    /* JADX WARN: Code duplicated, block: B:90:0x0176  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0285: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:646), block:B:141:0x0283 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0288: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:649), block:B:142:0x0287 */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.gamericefishpro.space.n9.y0] */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int responseCode;
        Map map2;
        Throwable th;
        Map map3;
        Map map4;
        InputStream inputStream;
        HttpURLConnection httpURLConnection2;
        OutputStream outputStream;
        OutputStream outputStream2;
        OutputStream outputStream3;
        OutputStream outputStream4;
        OutputStream outputStream5;
        Throwable th2;
        OutputStream outputStream6;
        IOException iOException2;
        ?? r9;
        OutputStream outputStream7;
        ?? r10;
        OutputStream outputStream8;
        InputStream inputStream2;
        boolean zHasNext;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = this.v;
                z0 z0Var = (z0) this.z;
                r1 r1Var = (r1) z0Var.d;
                r1 r1Var2 = (r1) z0Var.d;
                p1 p1Var = r1Var.z;
                r1.l(p1Var);
                p1Var.v();
                int i = 0;
                OutputStream outputStream9 = null;
                try {
                    URLConnection uRLConnectionOpenConnection = this.e.openConnection();
                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setDefaultUseCaches(false);
                    r1Var2.getClass();
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(61000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoInput(true);
                    try {
                        Map map5 = this.w;
                        if (map5 != null) {
                            for (Map.Entry entry : map5.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        byte[] bArr = this.i;
                        if (bArr != null) {
                            z0 z0Var2 = z0Var.e.z;
                            m4.T(z0Var2);
                            byte[] bArrD0 = z0Var2.d0(bArr);
                            v0 v0Var = r1Var2.y;
                            r1.l(v0Var);
                            t0 t0Var = v0Var.G;
                            int length = bArrD0.length;
                            t0Var.b(Integer.valueOf(length), "Uploading data. size");
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream10 = httpURLConnection.getOutputStream();
                            try {
                                outputStream10.write(bArrD0);
                                outputStream10.close();
                            } catch (IOException e) {
                                iOException = e;
                                responseCode = 0;
                                map2 = null;
                                outputStream9 = outputStream10;
                                if (outputStream9 != null) {
                                    try {
                                        outputStream9.close();
                                    } catch (IOException e2) {
                                        v0 v0Var2 = r1Var2.y;
                                        r1.l(v0Var2);
                                        v0Var2.y.c("Error closing HTTP compressed POST connection output stream. appId", v0.z(str), e2);
                                    }
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                x0 x0Var = (x0) this.y;
                                p1 p1Var2 = r1Var2.z;
                                r1.l(p1Var2);
                                p1Var2.A(new s0(this.v, x0Var, responseCode, iOException, (byte[]) null, map2));
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                map = null;
                                outputStream9 = outputStream10;
                                th = th;
                                if (outputStream9 != null) {
                                    try {
                                        outputStream9.close();
                                    } catch (IOException e3) {
                                        v0 v0Var3 = r1Var2.y;
                                        r1.l(v0Var3);
                                        v0Var3.y.c("Error closing HTTP compressed POST connection output stream. appId", v0.z(str), e3);
                                    }
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                x0 x0Var2 = (x0) this.y;
                                p1 p1Var3 = r1Var2.z;
                                r1.l(p1Var3);
                                p1Var3.A(new s0(this.v, x0Var2, i, (IOException) null, (byte[]) null, map));
                                throw th;
                            }
                        }
                        responseCode = httpURLConnection.getResponseCode();
                        try {
                            try {
                                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    inputStream = httpURLConnection.getInputStream();
                                    try {
                                        byte[] bArr2 = new byte[1024];
                                        while (true) {
                                            int i2 = inputStream.read(bArr2);
                                            if (i2 <= 0) {
                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                inputStream.close();
                                                httpURLConnection.disconnect();
                                                x0 x0Var3 = (x0) this.y;
                                                p1 p1Var4 = r1Var2.z;
                                                r1.l(p1Var4);
                                                p1Var4.A(new s0(this.v, x0Var3, responseCode, (IOException) null, byteArray, headerFields));
                                                return;
                                            }
                                            byteArrayOutputStream.write(bArr2, 0, i2);
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
                            } catch (IOException e4) {
                                e = e4;
                                map2 = map4;
                                iOException = e;
                                if (outputStream9 != null) {
                                    outputStream9.close();
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                x0 x0Var4 = (x0) this.y;
                                p1 p1Var5 = r1Var2.z;
                                r1.l(p1Var5);
                                p1Var5.A(new s0(this.v, x0Var4, responseCode, iOException, (byte[]) null, map2));
                                return;
                            } catch (Throwable th6) {
                                th = th6;
                                i = responseCode;
                                map = map3;
                                if (outputStream9 != null) {
                                    outputStream9.close();
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                x0 x0Var5 = (x0) this.y;
                                p1 p1Var6 = r1Var2.z;
                                r1.l(p1Var6);
                                p1Var6.A(new s0(this.v, x0Var5, i, (IOException) null, (byte[]) null, map));
                                throw th;
                            }
                        } catch (IOException e5) {
                            e = e5;
                            map2 = null;
                            iOException = e;
                            if (outputStream9 != null) {
                                outputStream9.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            x0 x0Var6 = (x0) this.y;
                            p1 p1Var7 = r1Var2.z;
                            r1.l(p1Var7);
                            p1Var7.A(new s0(this.v, x0Var6, responseCode, iOException, (byte[]) null, map2));
                            return;
                        } catch (Throwable th7) {
                            th = th7;
                            map = null;
                            i = responseCode;
                            if (outputStream9 != null) {
                                outputStream9.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            x0 x0Var7 = (x0) this.y;
                            p1 p1Var8 = r1Var2.z;
                            r1.l(p1Var8);
                            p1Var8.A(new s0(this.v, x0Var7, i, (IOException) null, (byte[]) null, map));
                            throw th;
                        }
                    } catch (IOException e6) {
                        iOException = e6;
                        responseCode = 0;
                        map2 = null;
                    } catch (Throwable th8) {
                        th = th8;
                        map = null;
                    }
                } catch (IOException e7) {
                    iOException = e7;
                    responseCode = 0;
                    httpURLConnection = null;
                    map2 = null;
                } catch (Throwable th9) {
                    th = th9;
                    httpURLConnection = null;
                    map = null;
                }
                break;
            default:
                String str2 = this.v;
                x2 x2Var = (x2) this.z;
                r1 r1Var3 = (r1) x2Var.d;
                r1 r1Var4 = (r1) x2Var.d;
                p1 p1Var9 = r1Var3.z;
                r1.l(p1Var9);
                p1Var9.v();
                int responseCode2 = 0;
                try {
                    URLConnection uRLConnectionOpenConnection2 = this.e.openConnection();
                    if (!(uRLConnectionOpenConnection2 instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection2;
                    httpURLConnection2.setDefaultUseCaches(false);
                    r1Var4.getClass();
                    httpURLConnection2.setConnectTimeout(60000);
                    httpURLConnection2.setReadTimeout(61000);
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    httpURLConnection2.setDoInput(true);
                    try {
                        try {
                            Map map6 = this.w;
                            if (map6 != null) {
                                Iterator it = map6.entrySet().iterator();
                                while (true) {
                                    zHasNext = it.hasNext();
                                    if (zHasNext) {
                                        Map.Entry entry2 = (Map.Entry) it.next();
                                        httpURLConnection2.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                    }
                                }
                            }
                            byte[] bArr3 = this.i;
                            ?? r8 = zHasNext;
                            if (bArr3 != null) {
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                                    gZIPOutputStream.write(bArr3);
                                    gZIPOutputStream.close();
                                    byteArrayOutputStream2.close();
                                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                    v0 v0Var4 = r1Var4.y;
                                    r1.l(v0Var4);
                                    t0 t0Var2 = v0Var4.G;
                                    int length2 = byteArray2.length;
                                    t0Var2.b(Integer.valueOf(length2), "Uploading data. size");
                                    httpURLConnection2.setDoOutput(true);
                                    httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
                                    httpURLConnection2.setFixedLengthStreamingMode(length2);
                                    httpURLConnection2.connect();
                                    OutputStream outputStream11 = httpURLConnection2.getOutputStream();
                                    try {
                                        outputStream11.write(byteArray2);
                                        outputStream11.close();
                                        r8 = outputStream11;
                                    } catch (IOException e8) {
                                        e = e8;
                                        responseCode2 = 0;
                                        outputStream4 = null;
                                        outputStream6 = outputStream11;
                                        iOException2 = e;
                                        outputStream8 = outputStream6;
                                        r10 = outputStream4;
                                        if (outputStream8 != null) {
                                            try {
                                                outputStream8.close();
                                            } catch (IOException e9) {
                                                v0 v0Var5 = r1Var4.y;
                                                r1.l(v0Var5);
                                                v0Var5.y.c("Error closing HTTP compressed POST connection output stream. appId", v0.z(str2), e9);
                                            }
                                            break;
                                        }
                                        if (httpURLConnection2 != null) {
                                            httpURLConnection2.disconnect();
                                        }
                                        a(responseCode2, iOException2, null, r10);
                                        return;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        responseCode2 = 0;
                                        outputStream3 = null;
                                        outputStream5 = outputStream11;
                                        th2 = th;
                                        outputStream7 = outputStream5;
                                        r9 = outputStream3;
                                        if (outputStream7 != null) {
                                            try {
                                                outputStream7.close();
                                            } catch (IOException e10) {
                                                v0 v0Var6 = r1Var4.y;
                                                r1.l(v0Var6);
                                                v0Var6.y.c("Error closing HTTP compressed POST connection output stream. appId", v0.z(str2), e10);
                                            }
                                            break;
                                        }
                                        if (httpURLConnection2 != null) {
                                            httpURLConnection2.disconnect();
                                        }
                                        a(responseCode2, null, null, r9);
                                        throw th2;
                                    }
                                } catch (IOException e11) {
                                    v0 v0Var7 = r1Var4.y;
                                    r1.l(v0Var7);
                                    v0Var7.y.b(e11, "Failed to gzip post request content");
                                    throw e11;
                                }
                            }
                            responseCode2 = httpURLConnection2.getResponseCode();
                            try {
                                try {
                                    Map<String, List<String>> headerFields2 = httpURLConnection2.getHeaderFields();
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                        inputStream2 = httpURLConnection2.getInputStream();
                                        try {
                                            byte[] bArr4 = new byte[1024];
                                            while (true) {
                                                int i3 = inputStream2.read(bArr4);
                                                if (i3 <= 0) {
                                                    byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                                    inputStream2.close();
                                                    httpURLConnection2.disconnect();
                                                    a(responseCode2, null, byteArray3, headerFields2);
                                                    return;
                                                }
                                                byteArrayOutputStream3.write(bArr4, 0, i3);
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            if (inputStream2 != null) {
                                                inputStream2.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        inputStream2 = null;
                                    }
                                } catch (IOException e12) {
                                    iOException2 = e12;
                                    r10 = r8;
                                    outputStream8 = null;
                                    if (outputStream8 != null) {
                                        outputStream8.close();
                                        break;
                                    }
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection2.disconnect();
                                    }
                                    a(responseCode2, iOException2, null, r10);
                                    return;
                                } catch (Throwable th13) {
                                    th2 = th13;
                                    r9 = r8;
                                    outputStream7 = null;
                                    if (outputStream7 != null) {
                                        outputStream7.close();
                                        break;
                                    }
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection2.disconnect();
                                    }
                                    a(responseCode2, null, null, r9);
                                    throw th2;
                                }
                            } catch (IOException e13) {
                                iOException2 = e13;
                                outputStream8 = null;
                                r10 = 0;
                                if (outputStream8 != null) {
                                    outputStream8.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                a(responseCode2, iOException2, null, r10);
                                return;
                            } catch (Throwable th14) {
                                th2 = th14;
                                outputStream7 = null;
                                r9 = 0;
                                if (outputStream7 != null) {
                                    outputStream7.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                a(responseCode2, null, null, r9);
                                throw th2;
                            }
                        } catch (IOException e14) {
                            e = e14;
                            outputStream2 = null;
                            outputStream4 = outputStream2;
                            outputStream6 = outputStream2;
                            iOException2 = e;
                            outputStream8 = outputStream6;
                            r10 = outputStream4;
                            if (outputStream8 != null) {
                                outputStream8.close();
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            a(responseCode2, iOException2, null, r10);
                            return;
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        outputStream = null;
                        outputStream3 = outputStream;
                        outputStream5 = outputStream;
                        th2 = th;
                        outputStream7 = outputStream5;
                        r9 = outputStream3;
                        if (outputStream7 != null) {
                            outputStream7.close();
                            break;
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        a(responseCode2, null, null, r9);
                        throw th2;
                    }
                } catch (IOException e15) {
                    e = e15;
                    httpURLConnection2 = null;
                    outputStream2 = null;
                } catch (Throwable th16) {
                    th = th16;
                    httpURLConnection2 = null;
                    outputStream = null;
                }
                break;
        }
    }

    public y0(x2 x2Var, String str, URL url, byte[] bArr, HashMap map, v2 v2Var) {
        Objects.requireNonNull(x2Var);
        this.z = x2Var;
        com.gamericefishpro.space.v8.c0.d(str);
        this.e = url;
        this.i = bArr;
        this.y = v2Var;
        this.v = str;
        this.w = map;
    }
}
