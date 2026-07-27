package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import m1.C4728c;
import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.p5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3709p5 {

    /* renamed from: a, reason: collision with root package name */
    public long f33029a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33030b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f33031c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f33032d;

    public C3709p5(String str, String str2, int i, long j6) {
        this.f33029a = j6;
        this.f33031c = str;
        this.f33032d = str2;
        this.f33030b = i;
    }

    public static int B(C3601n5 c3601n5) {
        int read = c3601n5.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public static final String C(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public static String c(String str) {
        int length = str.length() / 2;
        StringBuilder b9 = AbstractC5049e.b(String.valueOf(str.substring(0, length).hashCode()));
        b9.append(String.valueOf(str.substring(length).hashCode()));
        return b9.toString();
    }

    public static int h(C3601n5 c3601n5) {
        int read = c3601n5.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public static int i(C3601n5 c3601n5) {
        return (h(c3601n5) << 24) | h(c3601n5) | (h(c3601n5) << 8) | (h(c3601n5) << 16);
    }

    public static long j(C3601n5 c3601n5) {
        return (h(c3601n5) & 255) | ((h(c3601n5) & 255) << 8) | ((h(c3601n5) & 255) << 16) | ((h(c3601n5) & 255) << 24) | ((h(c3601n5) & 255) << 32) | ((h(c3601n5) & 255) << 40) | ((h(c3601n5) & 255) << 48) | ((255 & h(c3601n5)) << 56);
    }

    public static String k(C3601n5 c3601n5) {
        return new String(l(c3601n5, j(c3601n5)), "UTF-8");
    }

    public static byte[] l(C3601n5 c3601n5, long j6) {
        long j9 = c3601n5.f32685u - c3601n5.f32686v;
        if (j6 >= 0 && j6 <= j9) {
            int i = (int) j6;
            if (i == j6) {
                byte[] bArr = new byte[i];
                new DataInputStream(c3601n5).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j6 + ", maxLength=" + j9);
    }

    public static void m(BufferedOutputStream bufferedOutputStream, int i) {
        bufferedOutputStream.write(i & com.anythink.basead.exoplayer.k.p.f8473b);
        bufferedOutputStream.write((i >> 8) & com.anythink.basead.exoplayer.k.p.f8473b);
        bufferedOutputStream.write((i >> 16) & com.anythink.basead.exoplayer.k.p.f8473b);
        bufferedOutputStream.write((i >> 24) & com.anythink.basead.exoplayer.k.p.f8473b);
    }

    public static void n(BufferedOutputStream bufferedOutputStream, long j6) {
        bufferedOutputStream.write((byte) j6);
        bufferedOutputStream.write((byte) (j6 >>> 8));
        bufferedOutputStream.write((byte) (j6 >>> 16));
        bufferedOutputStream.write((byte) (j6 >>> 24));
        bufferedOutputStream.write((byte) (j6 >>> 32));
        bufferedOutputStream.write((byte) (j6 >>> 40));
        bufferedOutputStream.write((byte) (j6 >>> 48));
        bufferedOutputStream.write((byte) (j6 >>> 56));
    }

    public static void o(BufferedOutputStream bufferedOutputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        n(bufferedOutputStream, bytes.length);
        bufferedOutputStream.write(bytes, 0, bytes.length);
    }

    public static byte[] t(C3601n5 c3601n5, long j6) {
        long j9 = c3601n5.f32685u - c3601n5.f32686v;
        if (j6 >= 0 && j6 <= j9) {
            int i = (int) j6;
            if (i == j6) {
                byte[] bArr = new byte[i];
                new DataInputStream(c3601n5).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + 33 + String.valueOf(j9).length());
        D.y.x(sb, "streamToBytes length=", j6, ", maxLength=");
        sb.append(j9);
        throw new IOException(sb.toString());
    }

    public static void u(BufferedOutputStream bufferedOutputStream, int i) {
        bufferedOutputStream.write(i & com.anythink.basead.exoplayer.k.p.f8473b);
        bufferedOutputStream.write((i >> 8) & com.anythink.basead.exoplayer.k.p.f8473b);
        bufferedOutputStream.write((i >> 16) & com.anythink.basead.exoplayer.k.p.f8473b);
        bufferedOutputStream.write((i >> 24) & com.anythink.basead.exoplayer.k.p.f8473b);
    }

    public static int v(C3601n5 c3601n5) {
        return (B(c3601n5) << 24) | B(c3601n5) | (B(c3601n5) << 8) | (B(c3601n5) << 16);
    }

    public static void w(BufferedOutputStream bufferedOutputStream, long j6) {
        bufferedOutputStream.write((byte) j6);
        bufferedOutputStream.write((byte) (j6 >>> 8));
        bufferedOutputStream.write((byte) (j6 >>> 16));
        bufferedOutputStream.write((byte) (j6 >>> 24));
        bufferedOutputStream.write((byte) (j6 >>> 32));
        bufferedOutputStream.write((byte) (j6 >>> 40));
        bufferedOutputStream.write((byte) (j6 >>> 48));
        bufferedOutputStream.write((byte) (j6 >>> 56));
    }

    public static long x(C3601n5 c3601n5) {
        return (B(c3601n5) & 255) | ((B(c3601n5) & 255) << 8) | ((B(c3601n5) & 255) << 16) | ((B(c3601n5) & 255) << 24) | ((B(c3601n5) & 255) << 32) | ((B(c3601n5) & 255) << 40) | ((B(c3601n5) & 255) << 48) | ((B(c3601n5) & 255) << 56);
    }

    public static void y(BufferedOutputStream bufferedOutputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        w(bufferedOutputStream, length);
        bufferedOutputStream.write(bytes, 0, length);
    }

    public static String z(C3601n5 c3601n5) {
        return new String(t(c3601n5, x(c3601n5)), "UTF-8");
    }

    public void A(String str, C3547m5 c3547m5) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f33031c;
        if (linkedHashMap.containsKey(str)) {
            this.f33029a = (c3547m5.f31898a - ((C3547m5) linkedHashMap.get(str)).f31898a) + this.f33029a;
        } else {
            this.f33029a += c3547m5.f31898a;
        }
        linkedHashMap.put(str, c3547m5);
    }

    public synchronized W4 a(String str) {
        C4728c c4728c = (C4728c) ((LinkedHashMap) this.f33031c).get(str);
        if (c4728c == null) {
            return null;
        }
        File b9 = b(str);
        try {
            C3601n5 c3601n5 = new C3601n5(new BufferedInputStream(new FileInputStream(b9)), b9.length(), 3);
            try {
                C4728c a9 = C4728c.a(c3601n5);
                if (TextUtils.equals(str, a9.f39280b)) {
                    return c4728c.b(l(c3601n5, c3601n5.f32685u - c3601n5.f32686v));
                }
                l1.j.b("%s: key=%s, found=%s", b9.getAbsolutePath(), str, a9.f39280b);
                C4728c c4728c2 = (C4728c) ((LinkedHashMap) this.f33031c).remove(str);
                if (c4728c2 != null) {
                    this.f33029a -= c4728c2.f39279a;
                }
                return null;
            } finally {
                c3601n5.close();
            }
        } catch (IOException e9) {
            l1.j.b("%s: %s", b9.getAbsolutePath(), e9.toString());
            synchronized (this) {
                boolean delete = b(str).delete();
                C4728c c4728c3 = (C4728c) ((LinkedHashMap) this.f33031c).remove(str);
                if (c4728c3 != null) {
                    this.f33029a -= c4728c3.f39279a;
                }
                if (!delete) {
                    l1.j.b("Could not delete cache entry for key=%s, filename=%s", str, c(str));
                }
                return null;
            }
        }
    }

    public File b(String str) {
        return new File(((m1.e) this.f33032d).d(), c(str));
    }

    public synchronized void d() {
        File d2 = ((m1.e) this.f33032d).d();
        if (!d2.exists()) {
            if (!d2.mkdirs()) {
                l1.j.c("Unable to create cache dir %s", d2.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = d2.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            try {
                long length = file.length();
                C3601n5 c3601n5 = new C3601n5(new BufferedInputStream(new FileInputStream(file)), length, 3);
                try {
                    C4728c a9 = C4728c.a(c3601n5);
                    a9.f39279a = length;
                    g(a9.f39280b, a9);
                    c3601n5.close();
                } catch (Throwable th) {
                    c3601n5.close();
                    throw th;
                }
            } catch (IOException unused) {
                file.delete();
            }
        }
    }

    public void e() {
        long j6 = this.f33029a;
        int i = this.f33030b;
        if (j6 < i) {
            return;
        }
        int i6 = 0;
        if (l1.j.f38901a) {
            l1.j.d("Pruning old cache entries.", new Object[0]);
        }
        long j9 = this.f33029a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = ((LinkedHashMap) this.f33031c).entrySet().iterator();
        while (it.hasNext()) {
            C4728c c4728c = (C4728c) ((Map.Entry) it.next()).getValue();
            if (b(c4728c.f39280b).delete()) {
                this.f33029a -= c4728c.f39279a;
            } else {
                String str = c4728c.f39280b;
                l1.j.b("Could not delete cache entry for key=%s, filename=%s", str, c(str));
            }
            it.remove();
            i6++;
            if (this.f33029a < i * 0.9f) {
                break;
            }
        }
        if (l1.j.f38901a) {
            l1.j.d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i6), Long.valueOf(this.f33029a - j9), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    public synchronized void f(String str, W4 w42) {
        BufferedOutputStream bufferedOutputStream;
        C4728c c4728c;
        long j6 = this.f33029a;
        byte[] bArr = w42.f28313a;
        long length = j6 + bArr.length;
        int i = this.f33030b;
        if (length <= i || bArr.length <= i * 0.9f) {
            File b9 = b(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(b9));
                c4728c = new C4728c(str, w42);
            } catch (IOException unused) {
                if (!b9.delete()) {
                    l1.j.b("Could not clean up file %s", b9.getAbsolutePath());
                }
                if (!((m1.e) this.f33032d).d().exists()) {
                    l1.j.b("Re-initializing cache after external clearing.", new Object[0]);
                    ((LinkedHashMap) this.f33031c).clear();
                    this.f33029a = 0L;
                    d();
                }
            }
            if (!c4728c.c(bufferedOutputStream)) {
                bufferedOutputStream.close();
                l1.j.b("Failed to write header for %s", b9.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(w42.f28313a);
            bufferedOutputStream.close();
            c4728c.f39279a = b9.length();
            g(str, c4728c);
            e();
        }
    }

    public void g(String str, C4728c c4728c) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f33031c;
        if (linkedHashMap.containsKey(str)) {
            this.f33029a = (c4728c.f39279a - ((C4728c) linkedHashMap.get(str)).f39279a) + this.f33029a;
        } else {
            this.f33029a += c4728c.f39279a;
        }
        linkedHashMap.put(str, c4728c);
    }

    public synchronized W4 p(String str) {
        C3547m5 c3547m5 = (C3547m5) ((LinkedHashMap) this.f33031c).get(str);
        if (c3547m5 == null) {
            return null;
        }
        File s9 = s(str);
        try {
            C3601n5 c3601n5 = new C3601n5(new BufferedInputStream(new FileInputStream(s9)), s9.length(), 0);
            try {
                String str2 = C3547m5.a(c3601n5).f31899b;
                if (!TextUtils.equals(str, str2)) {
                    AbstractC3439k5.b("%s: key=%s, found=%s", s9.getAbsolutePath(), str, str2);
                    C3547m5 c3547m52 = (C3547m5) ((LinkedHashMap) this.f33031c).remove(str);
                    if (c3547m52 != null) {
                        this.f33029a -= c3547m52.f31898a;
                    }
                    return null;
                }
                byte[] t6 = t(c3601n5, c3601n5.f32685u - c3601n5.f32686v);
                W4 w42 = new W4(0);
                w42.f28313a = t6;
                w42.f28314b = c3547m5.f31900c;
                w42.f28315c = c3547m5.f31901d;
                w42.f28316d = c3547m5.f31902e;
                w42.f28317e = c3547m5.f31903f;
                w42.f28318f = c3547m5.f31904g;
                List<Z4> list = c3547m5.f31905h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (Z4 z42 : list) {
                    treeMap.put(z42.f28837a, z42.f28838b);
                }
                w42.f28319g = treeMap;
                w42.f28320h = Collections.unmodifiableList(list);
                return w42;
            } finally {
                c3601n5.close();
            }
        } catch (IOException e9) {
            AbstractC3439k5.b("%s: %s", s9.getAbsolutePath(), e9.toString());
            synchronized (this) {
                boolean delete = s(str).delete();
                C3547m5 c3547m53 = (C3547m5) ((LinkedHashMap) this.f33031c).remove(str);
                if (c3547m53 != null) {
                    this.f33029a -= c3547m53.f31898a;
                }
                if (!delete) {
                    AbstractC3439k5.b("Could not delete cache entry for key=%s, filename=%s", str, C(str));
                }
                return null;
            }
        }
    }

    public synchronized void q(String str, W4 w42) {
        float f3;
        try {
            long j6 = this.f33029a;
            int length = w42.f28313a.length;
            long j9 = j6 + length;
            int i = this.f33030b;
            float f9 = 0.9f;
            if (j9 <= i || length <= i * 0.9f) {
                File s9 = s(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(s9));
                    C3547m5 c3547m5 = new C3547m5(str, w42);
                    try {
                        u(bufferedOutputStream, 538247942);
                        y(bufferedOutputStream, str);
                        String str2 = c3547m5.f31900c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        y(bufferedOutputStream, str2);
                        w(bufferedOutputStream, c3547m5.f31901d);
                        w(bufferedOutputStream, c3547m5.f31902e);
                        w(bufferedOutputStream, c3547m5.f31903f);
                        w(bufferedOutputStream, c3547m5.f31904g);
                        List<Z4> list = c3547m5.f31905h;
                        if (list != null) {
                            u(bufferedOutputStream, list.size());
                            for (Z4 z42 : list) {
                                y(bufferedOutputStream, z42.f28837a);
                                y(bufferedOutputStream, z42.f28838b);
                            }
                        } else {
                            u(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(w42.f28313a);
                        bufferedOutputStream.close();
                        c3547m5.f31898a = s9.length();
                        A(str, c3547m5);
                        long j10 = this.f33029a;
                        int i6 = this.f33030b;
                        if (j10 >= i6) {
                            boolean z3 = AbstractC3439k5.f31377a;
                            if (z3) {
                                AbstractC3439k5.a("Pruning old cache entries.", new Object[0]);
                            }
                            long j11 = this.f33029a;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = ((LinkedHashMap) this.f33031c).entrySet().iterator();
                            int i9 = 0;
                            while (it.hasNext()) {
                                C3547m5 c3547m52 = (C3547m5) ((Map.Entry) it.next()).getValue();
                                String str3 = c3547m52.f31899b;
                                if (s(str3).delete()) {
                                    f3 = f9;
                                    this.f33029a -= c3547m52.f31898a;
                                } else {
                                    f3 = f9;
                                    AbstractC3439k5.b("Could not delete cache entry for key=%s, filename=%s", str3, C(str3));
                                }
                                it.remove();
                                i9++;
                                if (this.f33029a < i6 * f3) {
                                    break;
                                } else {
                                    f9 = f3;
                                }
                            }
                            if (z3) {
                                AbstractC3439k5.a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i9), Long.valueOf(this.f33029a - j11), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                            }
                        }
                    } catch (IOException e9) {
                        AbstractC3439k5.b("%s", e9.toString());
                        bufferedOutputStream.close();
                        AbstractC3439k5.b("Failed to write header for %s", s9.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!s9.delete()) {
                        AbstractC3439k5.b("Could not clean up file %s", s9.getAbsolutePath());
                    }
                    if (!((InterfaceC3655o5) this.f33032d).c().exists()) {
                        AbstractC3439k5.b("Re-initializing cache after external clearing.", new Object[0]);
                        ((LinkedHashMap) this.f33031c).clear();
                        this.f33029a = 0L;
                        r();
                    }
                }
            }
        } finally {
        }
    }

    public synchronized void r() {
        long length;
        C3601n5 c3601n5;
        File c9 = ((InterfaceC3655o5) this.f33032d).c();
        if (c9.exists()) {
            File[] listFiles = c9.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        length = file.length();
                        c3601n5 = new C3601n5(new BufferedInputStream(new FileInputStream(file)), length, 0);
                    } catch (IOException unused) {
                        file.delete();
                    }
                    try {
                        C3547m5 a9 = C3547m5.a(c3601n5);
                        a9.f31898a = length;
                        A(a9.f31899b, a9);
                        c3601n5.close();
                    } catch (Throwable th) {
                        c3601n5.close();
                        throw th;
                    }
                }
            }
        } else if (!c9.mkdirs()) {
            AbstractC3439k5.c("Unable to create cache dir %s", c9.getAbsolutePath());
        }
    }

    public File s(String str) {
        return new File(((InterfaceC3655o5) this.f33032d).c(), C(str));
    }

    public C3709p5(S0.c cVar) {
        this.f33031c = new LinkedHashMap(16, 0.75f, true);
        this.f33029a = 0L;
        this.f33032d = cVar;
        this.f33030b = 5242880;
    }

    public C3709p5(File file) {
        this.f33031c = new LinkedHashMap(16, 0.75f, true);
        this.f33029a = 0L;
        this.f33032d = new C3657o7(this, file);
        this.f33030b = 20971520;
    }

    public C3709p5(m1.e eVar) {
        this.f33031c = new LinkedHashMap(16, 0.75f, true);
        this.f33029a = 0L;
        this.f33032d = eVar;
        this.f33030b = 5242880;
    }
}
