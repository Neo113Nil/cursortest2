package defpackage;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.common.network.Request;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;
import yads.bl2;
import yads.c01;
import yads.e01;
import yads.h30;

/* loaded from: classes7.dex */
public class v181 extends yd71 {
    public final k571 A;
    public final k571 B;
    public HttpURLConnection C;
    public InputStream D;
    public boolean E;
    public int F;
    public long G;
    public long H;
    public final int x;
    public final int y;
    public final String z;

    public v181(String str, int i, int i2, k571 k571Var) {
        super(true);
        this.z = str;
        this.x = i;
        this.y = i2;
        this.A = k571Var;
        this.B = new k571();
    }

    public static void l(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection == null || (i = rf71.a) < 19 || i > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x011f A[Catch: IOException -> 0x0129, TRY_LEAVE, TryCatch #0 {IOException -> 0x0129, blocks: (B:23:0x0117, B:25:0x011f), top: B:22:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0184  */
    @Override // defpackage.u871
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long Q(no71 no71Var) {
        long j;
        long parseLong;
        long j2;
        this.H = 0L;
        this.G = 0L;
        h();
        try {
            Uri uri = no71Var.a;
            long j3 = no71Var.f;
            long j4 = no71Var.e;
            HttpURLConnection j5 = j(new URL(uri.toString()), no71Var.c, no71Var.e, no71Var.f, (no71Var.h & 1) == 1, no71Var.d);
            this.C = j5;
            this.F = j5.getResponseCode();
            j5.getResponseMessage();
            int i = this.F;
            if (i < 200 || i > 299) {
                j5.getHeaderFields();
                if (this.F == 416) {
                    String headerField = j5.getHeaderField("Content-Range");
                    Pattern pattern = ox71.a;
                    if (!TextUtils.isEmpty(headerField)) {
                        Matcher matcher = ox71.b.matcher(headerField);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            group.getClass();
                            j = Long.parseLong(group);
                            if (j4 == j) {
                                this.E = true;
                                a(no71Var);
                                if (j3 != -1) {
                                    return j3;
                                }
                                return 0L;
                            }
                        }
                    }
                    j = -1;
                    if (j4 == j) {
                    }
                }
                InputStream errorStream = j5.getErrorStream();
                try {
                    if (errorStream != null) {
                        int i2 = rf71.a;
                        byte[] bArr = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int read = errorStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byteArrayOutputStream.toByteArray();
                    } else {
                        int i3 = rf71.a;
                    }
                } catch (IOException unused) {
                    int i4 = rf71.a;
                }
                m();
                throw new e01(this.F, this.F == 416 ? new h30() : null);
            }
            j5.getContentType();
            long j6 = (this.F != 200 || j4 == 0) ? 0L : j4;
            boolean equalsIgnoreCase = Request.PARAM_GZIP.equalsIgnoreCase(j5.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                this.G = j3;
            } else if (j3 != -1) {
                this.G = j3;
            } else {
                String headerField2 = j5.getHeaderField("Content-Length");
                String headerField3 = j5.getHeaderField("Content-Range");
                Pattern pattern2 = ox71.a;
                if (!TextUtils.isEmpty(headerField2)) {
                    try {
                        parseLong = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        nba1.c("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                    }
                    if (!TextUtils.isEmpty(headerField3)) {
                        Matcher matcher2 = ox71.a.matcher(headerField3);
                        if (matcher2.matches()) {
                            try {
                                String group2 = matcher2.group(2);
                                group2.getClass();
                                long parseLong2 = Long.parseLong(group2);
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                j2 = -1;
                                long parseLong3 = (parseLong2 - Long.parseLong(group3)) + 1;
                                if (parseLong < 0) {
                                    parseLong = parseLong3;
                                } else if (parseLong != parseLong3) {
                                    try {
                                        nba1.e();
                                        parseLong = Math.max(parseLong, parseLong3);
                                    } catch (NumberFormatException unused3) {
                                        nba1.c("HttpUtil", "Unexpected Content-Range [" + headerField3 + "]");
                                        this.G = parseLong == j2 ? parseLong - j6 : j2;
                                        this.D = j5.getInputStream();
                                        if (equalsIgnoreCase) {
                                        }
                                        this.E = true;
                                        a(no71Var);
                                        k(j6);
                                        return this.G;
                                    }
                                }
                            } catch (NumberFormatException unused4) {
                                j2 = -1;
                            }
                            this.G = parseLong == j2 ? parseLong - j6 : j2;
                        }
                    }
                    j2 = -1;
                    this.G = parseLong == j2 ? parseLong - j6 : j2;
                }
                parseLong = -1;
                if (!TextUtils.isEmpty(headerField3)) {
                }
                j2 = -1;
                this.G = parseLong == j2 ? parseLong - j6 : j2;
            }
            try {
                this.D = j5.getInputStream();
                if (equalsIgnoreCase) {
                    this.D = new GZIPInputStream(this.D);
                }
                this.E = true;
                a(no71Var);
                try {
                    k(j6);
                    return this.G;
                } catch (IOException e) {
                    m();
                    if (e instanceof c01) {
                        throw ((c01) e);
                    }
                    throw new c01(2000, 1, e);
                }
            } catch (IOException e2) {
                m();
                throw new c01(2000, 1, e2);
            }
        } catch (IOException e3) {
            m();
            throw c01.a(e3, 1);
        }
    }

    @Override // defpackage.u871
    public final Map b() {
        HttpURLConnection httpURLConnection = this.C;
        return httpURLConnection == null ? bl2.z : new jy71(httpURLConnection.getHeaderFields());
    }

    @Override // defpackage.u871
    public final void close() {
        try {
            InputStream inputStream = this.D;
            if (inputStream != null) {
                long j = this.G;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.H;
                }
                l(this.C, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    int i = rf71.a;
                    throw new c01(2000, 3, e);
                }
            }
        } finally {
            this.D = null;
            m();
            if (this.E) {
                this.E = false;
                g();
            }
        }
    }

    @Override // defpackage.u871
    public final Uri d() {
        HttpURLConnection httpURLConnection = this.C;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public HttpURLConnection i(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public final HttpURLConnection j(URL url, byte[] bArr, long j, long j2, boolean z, Map map) {
        Map map2;
        String sb;
        Map map3;
        HttpURLConnection i = i(url);
        i.setConnectTimeout(this.x);
        i.setReadTimeout(this.y);
        HashMap hashMap = new HashMap();
        k571 k571Var = this.A;
        if (k571Var != null) {
            synchronized (k571Var) {
                try {
                    if (k571Var.b == null) {
                        k571Var.b = Collections.unmodifiableMap(new HashMap(k571Var.a));
                    }
                    map3 = k571Var.b;
                } finally {
                }
            }
            hashMap.putAll(map3);
        }
        k571 k571Var2 = this.B;
        synchronized (k571Var2) {
            try {
                if (k571Var2.b == null) {
                    k571Var2.b = Collections.unmodifiableMap(new HashMap(k571Var2.a));
                }
                map2 = k571Var2.b;
            } finally {
            }
        }
        hashMap.putAll(map2);
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            i.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = ox71.a;
        if (j == 0 && j2 == -1) {
            sb = null;
        } else {
            StringBuilder w = unr0.w(j, "bytes=", "-");
            if (j2 != -1) {
                w.append((j + j2) - 1);
            }
            sb = w.toString();
        }
        if (sb != null) {
            i.setRequestProperty("Range", sb);
        }
        String str = this.z;
        if (str != null) {
            i.setRequestProperty(ExtFunctionsKt.HEADER_USER_AGENT, str);
        }
        i.setRequestProperty("Accept-Encoding", z ? Request.PARAM_GZIP : ClidProvider.IDENTITY);
        i.setInstanceFollowRedirects(true);
        i.setDoOutput(bArr != null);
        int i2 = no71.i;
        i.setRequestMethod("GET");
        if (bArr == null) {
            i.connect();
            return i;
        }
        i.setFixedLengthStreamingMode(bArr.length);
        i.connect();
        OutputStream outputStream = i.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return i;
    }

    public final void k(long j) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int min = (int) Math.min(j, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            InputStream inputStream = this.D;
            int i = rf71.a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new c01(2000, 1, new InterruptedIOException());
            }
            if (read == -1) {
                throw new c01();
            }
            j -= read;
            c(read);
        }
    }

    public final void m() {
        HttpURLConnection httpURLConnection = this.C;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                nba1.c("DefaultHttpDataSource", nba1.b("Unexpected error while disconnecting", e));
            }
            this.C = null;
        }
    }

    @Override // defpackage.jz61
    public final int v(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.G;
            if (j != -1) {
                long j2 = j - this.H;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.D;
            int i3 = rf71.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.H += read;
                c(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            int i4 = rf71.a;
            throw c01.a(e, 2);
        }
    }
}
