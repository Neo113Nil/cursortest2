package com.anythink.expressad.foundation.g.f;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public abstract class j<T> implements Comparable<j<T>> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f20151c = "j";

    /* renamed from: a, reason: collision with root package name */
    protected ConcurrentHashMap<String, String> f20152a;

    /* renamed from: b, reason: collision with root package name */
    protected e<T> f20153b;

    /* renamed from: d, reason: collision with root package name */
    private final int f20154d;

    /* renamed from: e, reason: collision with root package name */
    private final String f20155e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f20156f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f20157g;

    /* renamed from: h, reason: collision with root package name */
    private k f20158h;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private m f20159j;

    /* renamed from: k, reason: collision with root package name */
    private Object f20160k;

    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f20161a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f20162b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f20163c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f20164d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f20165e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static final int f20166f = 5;

        /* renamed from: g, reason: collision with root package name */
        public static final int f20167g = 6;

        /* renamed from: h, reason: collision with root package name */
        public static final int f20168h = 7;
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f20169a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f20170b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f20171c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f20172d = 4;

        private b() {
        }
    }

    public j(int i, String str, e<T> eVar) {
        this.f20152a = new ConcurrentHashMap<>();
        this.i = false;
        this.f20155e = str;
        this.f20154d = i;
        this.f20153b = eVar;
        this.f20156f = false;
        this.f20159j = new com.anythink.expressad.foundation.g.f.b();
    }

    public static com.anythink.expressad.foundation.g.f.a.a a(com.anythink.expressad.foundation.g.f.a.a aVar) {
        return aVar;
    }

    private int p() {
        Integer num = this.f20157g;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    private static void q() {
    }

    private static void r() {
    }

    public abstract l<T> a(com.anythink.expressad.foundation.g.f.f.c cVar);

    public final Object b() {
        return this.f20160k;
    }

    public final void c() {
        k kVar = this.f20158h;
        if (kVar != null) {
            kVar.b(this);
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        j jVar = (j) obj;
        int j6 = j();
        int j9 = jVar.j();
        return j6 == j9 ? this.f20157g.intValue() - jVar.f20157g.intValue() : j9 - j6;
    }

    public final String d() {
        return this.f20155e;
    }

    public final void e() {
        this.i = true;
    }

    public final boolean f() {
        return this.i;
    }

    public final Map<String, String> g() {
        return this.f20152a;
    }

    public byte[] h() {
        return null;
    }

    public void i() {
        a("Charset", "UTF-8");
        if (this.f20156f) {
            a("Connection", "keep-alive");
        } else {
            a("Connection", com.anythink.expressad.foundation.d.d.cs);
        }
    }

    public int j() {
        return 2;
    }

    public final int k() {
        return this.f20159j.b();
    }

    public final m l() {
        return this.f20159j;
    }

    public final void m() {
        e<T> eVar = this.f20153b;
        if (eVar != null) {
            eVar.c();
        }
    }

    public final void n() {
        e<T> eVar = this.f20153b;
        if (eVar != null) {
            eVar.b();
        }
    }

    public final void o() {
        e<T> eVar = this.f20153b;
        if (eVar != null) {
            eVar.a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.i ? "[X] " : "[ ] ");
        sb.append(this.f20155e);
        sb.append(" ");
        sb.append(j());
        sb.append(" ");
        sb.append(this.f20157g);
        return sb.toString();
    }

    public void a(OutputStream outputStream) {
    }

    public final void b(com.anythink.expressad.foundation.g.f.a.a aVar) {
        e<T> eVar = this.f20153b;
        if (eVar != null) {
            eVar.a(aVar);
        }
    }

    public final int a() {
        return this.f20154d;
    }

    public final void a(e<T> eVar) {
        this.f20153b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private j<?> a(Object obj) {
        this.f20160k = obj;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j<?> a(m mVar) {
        this.f20159j = mVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j<?> a(k kVar) {
        this.f20158h = kVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j<?> a(int i) {
        this.f20157g = Integer.valueOf(i);
        return this;
    }

    public final void a(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public j(int i, String str, e<T> eVar, boolean z6) {
        this.f20152a = new ConcurrentHashMap<>();
        this.i = false;
        this.f20155e = str;
        this.f20154d = i;
        this.f20153b = eVar;
        this.f20156f = z6;
        this.f20159j = new com.anythink.expressad.foundation.g.f.b();
    }

    private void a(String str) {
        this.f20152a.remove(str);
    }

    public byte[] a(com.anythink.expressad.foundation.g.f.f.b bVar, c cVar) {
        if (bVar.c() != null) {
            return a(bVar);
        }
        return new byte[0];
    }

    private static byte[] a(com.anythink.expressad.foundation.g.f.f.b bVar) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            InputStream c9 = bVar.c();
            try {
                if (com.anythink.expressad.foundation.g.f.g.d.b(bVar.b()) && !(c9 instanceof GZIPInputStream)) {
                    c9 = new GZIPInputStream(c9);
                }
                if (c9 != null) {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = c9.read(bArr);
                            if (read != -1) {
                                byteArrayOutputStream2.write(bArr, 0, read);
                            } else {
                                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                try {
                                    c9.close();
                                    byteArrayOutputStream2.close();
                                    return byteArray;
                                } catch (IOException e9) {
                                    e9.getMessage();
                                    return byteArray;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        inputStream = c9;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        th = th;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e10) {
                                e10.getMessage();
                                throw th;
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th;
                    }
                } else {
                    throw new com.anythink.expressad.foundation.g.f.a.a(7, null);
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = c9;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    public j(String str) {
        this.f20152a = new ConcurrentHashMap<>();
        this.f20153b = null;
        this.i = false;
        this.f20155e = str;
        this.f20154d = 0;
        this.f20156f = false;
        this.f20159j = new com.anythink.expressad.foundation.g.f.b();
    }

    public final void a(l<T> lVar) {
        e<T> eVar = this.f20153b;
        if (eVar != null) {
            eVar.a(lVar);
        }
    }

    public final void a(long j6, long j9) {
        e<T> eVar = this.f20153b;
        if (eVar != null) {
            eVar.a(j6, j9);
        }
    }

    private int a(j<T> jVar) {
        int j6 = j();
        int j9 = jVar.j();
        return j6 == j9 ? this.f20157g.intValue() - jVar.f20157g.intValue() : j9 - j6;
    }

    public final void a(String str, String str2) {
        this.f20152a.remove(str);
        this.f20152a.put(str, str2);
    }
}
