package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public final class cn7 extends lq2 implements k6e {
    public final int e;
    public final int f;
    public final j6e g;
    public final j6e h;
    public nb7 i;
    public HttpURLConnection j;
    public InputStream k;
    public boolean l;
    public int m;
    public long n;
    public long o;

    public cn7(int i, int i2, j6e j6eVar) {
        super(true);
        this.e = i;
        this.f = i2;
        this.g = j6eVar;
        this.h = new j6e(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0140 A[Catch: IOException -> 0x014a, TRY_LEAVE, TryCatch #1 {IOException -> 0x014a, blocks: (B:19:0x0138, B:21:0x0140), top: B:18:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012d  */
    @Override // defpackage.db7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(nb7 nb7Var) {
        long j;
        long j2;
        long parseLong;
        this.i = nb7Var;
        this.o = 0L;
        this.n = 0L;
        f(nb7Var);
        try {
            HttpURLConnection j3 = j(new URL(nb7Var.a.toString()), nb7Var.c, nb7Var.d, nb7Var.f, nb7Var.g, nb7Var.c(1), true, nb7Var.e);
            long j4 = nb7Var.g;
            long j5 = nb7Var.f;
            this.j = j3;
            this.m = j3.getResponseCode();
            j3.getResponseMessage();
            int i = this.m;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = j3.getHeaderFields();
                if (this.m == 416 && j5 == z7e.b(j3.getHeaderField("Content-Range"))) {
                    this.l = true;
                    g(nb7Var);
                    if (j4 != -1) {
                        return j4;
                    }
                    return 0L;
                }
                InputStream errorStream = j3.getErrorStream();
                try {
                    if (errorStream != null) {
                        zm3.b(errorStream);
                    } else {
                        int i2 = dvt.a;
                    }
                } catch (IOException unused) {
                    int i3 = dvt.a;
                }
                i();
                throw new i6e(this.m, this.m == 416 ? new hb7(2008) : null, headerFields, nb7Var);
            }
            j3.getContentType();
            if (this.m != 200 || j5 == 0) {
                j5 = 0;
            }
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(j3.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                j = j5;
                this.n = j4;
            } else if (j4 != -1) {
                this.n = j4;
                j = j5;
            } else {
                String headerField = j3.getHeaderField("Content-Length");
                String headerField2 = j3.getHeaderField("Content-Range");
                Pattern pattern = z7e.a;
                if (!TextUtils.isEmpty(headerField)) {
                    try {
                        j2 = 0;
                        parseLong = Long.parseLong(headerField);
                    } catch (NumberFormatException unused2) {
                        vq1.K("HttpUtil", "Unexpected Content-Length [" + headerField + "]");
                    }
                    if (!TextUtils.isEmpty(headerField2)) {
                        Matcher matcher = z7e.a.matcher(headerField2);
                        if (matcher.matches()) {
                            try {
                                String group = matcher.group(2);
                                group.getClass();
                                long parseLong2 = Long.parseLong(group);
                                String group2 = matcher.group(1);
                                group2.getClass();
                                j = j5;
                                long parseLong3 = (parseLong2 - Long.parseLong(group2)) + 1;
                                if (parseLong < j2) {
                                    parseLong = parseLong3;
                                } else if (parseLong != parseLong3) {
                                    try {
                                        vq1.n0("HttpUtil", "Inconsistent headers [" + headerField + "] [" + headerField2 + "]");
                                        parseLong = Math.max(parseLong, parseLong3);
                                    } catch (NumberFormatException unused3) {
                                        vq1.K("HttpUtil", "Unexpected Content-Range [" + headerField2 + "]");
                                        this.n = parseLong == -1 ? parseLong - j : -1L;
                                        this.k = j3.getInputStream();
                                        if (equalsIgnoreCase) {
                                        }
                                        this.l = true;
                                        g(nb7Var);
                                        try {
                                            k(j, nb7Var);
                                            return this.n;
                                        } catch (IOException e) {
                                            i();
                                            if (e instanceof g6e) {
                                                throw ((g6e) e);
                                            }
                                            throw new g6e(e, nb7Var, 2000, 1);
                                        }
                                    }
                                }
                            } catch (NumberFormatException unused4) {
                                j = j5;
                            }
                            this.n = parseLong == -1 ? parseLong - j : -1L;
                        }
                    }
                    j = j5;
                    this.n = parseLong == -1 ? parseLong - j : -1L;
                }
                j2 = 0;
                parseLong = -1;
                if (!TextUtils.isEmpty(headerField2)) {
                }
                j = j5;
                this.n = parseLong == -1 ? parseLong - j : -1L;
            }
            try {
                this.k = j3.getInputStream();
                if (equalsIgnoreCase) {
                    this.k = new GZIPInputStream(this.k);
                }
                this.l = true;
                g(nb7Var);
                k(j, nb7Var);
                return this.n;
            } catch (IOException e2) {
                i();
                throw new g6e(e2, nb7Var, 2000, 1);
            }
        } catch (IOException e3) {
            i();
            throw g6e.a(e3, nb7Var, 1);
        }
    }

    @Override // defpackage.db7
    public final Map b() {
        HttpURLConnection httpURLConnection = this.j;
        return httpURLConnection == null ? vsn.g : new bn7(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.db7
    public final void close() {
        try {
            InputStream inputStream = this.k;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    nb7 nb7Var = this.i;
                    int i = dvt.a;
                    throw new g6e(e, nb7Var, 2000, 3);
                }
            }
        } finally {
            this.k = null;
            i();
            if (this.l) {
                this.l = false;
                d();
            }
            this.j = null;
            this.i = null;
        }
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        nb7 nb7Var = this.i;
        if (nb7Var != null) {
            return nb7Var.a;
        }
        return null;
    }

    public final void i() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                vq1.L("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    public final HttpURLConnection j(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.e);
        httpURLConnection.setReadTimeout(this.f);
        HashMap hashMap = new HashMap();
        j6e j6eVar = this.g;
        if (j6eVar != null) {
            hashMap.putAll(j6eVar.g());
        }
        hashMap.putAll(this.h.g());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a = z7e.a(j, j2);
        if (a != null) {
            httpURLConnection.setRequestProperty("Range", a);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(nb7.b(i));
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void k(long j, nb7 nb7Var) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int min = (int) Math.min(j, 4096);
            InputStream inputStream = this.k;
            int i = dvt.a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new g6e(new InterruptedIOException(), nb7Var, 2000, 1);
            }
            if (read == -1) {
                throw new g6e(nb7Var, 2008, 1);
            }
            j -= read;
            c(read);
        }
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.n;
            if (j != -1) {
                long j2 = j - this.o;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.k;
            int i3 = dvt.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.o += read;
                c(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            nb7 nb7Var = this.i;
            int i4 = dvt.a;
            throw g6e.a(e, nb7Var, 2);
        }
    }
}
