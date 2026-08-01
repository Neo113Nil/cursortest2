package com.anythink.core.common.s.a;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.anythink.core.common.s.a.b;
import com.anythink.core.common.s.a.e;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class a implements SharedPreferences, SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f16260a = "both files error";

    /* renamed from: b, reason: collision with root package name */
    protected static final String f16261b = "parse dara failed";

    /* renamed from: c, reason: collision with root package name */
    protected static final String f16262c = "open file failed";

    /* renamed from: d, reason: collision with root package name */
    protected static final String f16263d = "map failed";

    /* renamed from: e, reason: collision with root package name */
    protected static final String f16264e = "miss cipher";

    /* renamed from: f, reason: collision with root package name */
    protected static final String f16265f = "Encrypt failed";

    /* renamed from: g, reason: collision with root package name */
    static final String f16266g = "truncate finish";

    /* renamed from: h, reason: collision with root package name */
    static final String f16267h = "gc finish";
    protected static final String i = ".kva";

    /* renamed from: j, reason: collision with root package name */
    protected static final String f16268j = ".kvb";

    /* renamed from: k, reason: collision with root package name */
    protected static final String f16269k = ".kvc";

    /* renamed from: l, reason: collision with root package name */
    protected static final String f16270l = ".tmp";

    /* renamed from: m, reason: collision with root package name */
    protected static final int f16271m = 268435456;

    /* renamed from: n, reason: collision with root package name */
    protected static final int f16272n = 1073741824;

    /* renamed from: p, reason: collision with root package name */
    protected static final int f16274p = 12;

    /* renamed from: r, reason: collision with root package name */
    protected static final int f16275r;

    /* renamed from: s, reason: collision with root package name */
    protected static final int f16276s;

    /* renamed from: t, reason: collision with root package name */
    protected static final int f16277t = 8192;

    /* renamed from: u, reason: collision with root package name */
    protected static final int f16278u = 80;

    /* renamed from: A, reason: collision with root package name */
    protected int f16279A;

    /* renamed from: B, reason: collision with root package name */
    protected long f16280B;

    /* renamed from: E, reason: collision with root package name */
    protected f f16283E;

    /* renamed from: F, reason: collision with root package name */
    protected int f16284F;

    /* renamed from: G, reason: collision with root package name */
    protected int f16285G;

    /* renamed from: K, reason: collision with root package name */
    protected String f16288K;

    /* renamed from: P, reason: collision with root package name */
    protected int f16293P;

    /* renamed from: v, reason: collision with root package name */
    protected final String f16298v;

    /* renamed from: w, reason: collision with root package name */
    protected final String f16299w;

    /* renamed from: x, reason: collision with root package name */
    protected final Map<String, com.anythink.core.common.s.a.a.b> f16300x;

    /* renamed from: z, reason: collision with root package name */
    protected final com.anythink.core.common.s.a.a.a f16302z;

    /* renamed from: S, reason: collision with root package name */
    private static final byte[] f16259S = new byte[0];

    /* renamed from: o, reason: collision with root package name */
    protected static final int[] f16273o = {0, 1, 4, 4, 8, 8};

    /* renamed from: q, reason: collision with root package name */
    protected final int f16297q = h.f16352c;

    /* renamed from: y, reason: collision with root package name */
    protected final com.anythink.core.common.s.a.a.c f16301y = h.f16350a;

    /* renamed from: C, reason: collision with root package name */
    protected final HashMap<String, b.AbstractC0098b> f16281C = new HashMap<>();

    /* renamed from: D, reason: collision with root package name */
    protected volatile boolean f16282D = false;

    /* renamed from: H, reason: collision with root package name */
    protected final List<String> f16286H = new ArrayList();

    /* renamed from: I, reason: collision with root package name */
    protected boolean f16287I = false;
    protected boolean J = false;

    /* renamed from: L, reason: collision with root package name */
    protected final m f16289L = new m();

    /* renamed from: M, reason: collision with root package name */
    protected final m f16290M = new m();

    /* renamed from: N, reason: collision with root package name */
    protected final e f16291N = new e();

    /* renamed from: O, reason: collision with root package name */
    protected final Executor f16292O = new i();

    /* renamed from: Q, reason: collision with root package name */
    protected final ArrayList<C0097a> f16294Q = new ArrayList<>();

    /* renamed from: R, reason: collision with root package name */
    protected final ArrayList<SharedPreferences.OnSharedPreferenceChangeListener> f16295R = new ArrayList<>();

    /* renamed from: T, reason: collision with root package name */
    private final Handler f16296T = new Handler(Looper.getMainLooper());

    /* renamed from: com.anythink.core.common.s.a.a$a, reason: collision with other inner class name */
    public static class C0097a implements Comparable<C0097a> {

        /* renamed from: a, reason: collision with root package name */
        int f16303a;

        /* renamed from: b, reason: collision with root package name */
        int f16304b;

        public C0097a(int i, int i6) {
            this.f16303a = i;
            this.f16304b = i6;
        }

        private int a(C0097a c0097a) {
            return this.f16303a - c0097a.f16303a;
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(C0097a c0097a) {
            return this.f16303a - c0097a.f16303a;
        }
    }

    static {
        int b9 = l.b();
        f16275r = b9;
        f16276s = Math.max(b9, 32768);
    }

    public a(String str, String str2, com.anythink.core.common.s.a.a.b[] bVarArr, com.anythink.core.common.s.a.a.a aVar) {
        this.f16298v = str;
        this.f16299w = str2;
        this.f16302z = aVar;
        HashMap hashMap = new HashMap();
        if (bVarArr != null) {
            for (com.anythink.core.common.s.a.a.b bVar : bVarArr) {
                String a9 = bVar.a();
                if (hashMap.containsKey(a9)) {
                    b("duplicate encoder tag:".concat(String.valueOf(a9)));
                } else {
                    hashMap.put(a9, bVar);
                }
            }
        }
        hashMap.put("StringSet", k.f16370a);
        this.f16300x = hashMap;
    }

    private static int e(int i6) {
        return i6 & (-1073741825);
    }

    private static void f(int i6) {
        if (i6 > 255) {
            throw new IllegalArgumentException("key's length must less than 256");
        }
    }

    private static void h(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("key is empty");
        }
    }

    private synchronized boolean i(String str) {
        return getBoolean(str, false);
    }

    private void j() {
        f fVar = this.f16283E;
        if (fVar == null || fVar.f16334a.length != f16275r) {
            this.f16283E = new f(f16275r);
        } else {
            fVar.a(4, 0L);
        }
        this.f16283E.a(0, a(0));
    }

    private float k(String str) {
        return getFloat(str, 0.0f);
    }

    private long l(String str) {
        return getLong(str, 0L);
    }

    private double m(String str) {
        return a(str, 0.0d);
    }

    private String n(String str) {
        return getString(str, "");
    }

    private byte[] o(String str) {
        return b(str, f16259S);
    }

    private synchronized Set<String> p(String str) {
        return (Set) d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(String str) {
        if (this.f16291N.a(str)) {
            return;
        }
        l.c(new File(this.f16298v + this.f16299w, str));
    }

    public abstract void a(byte b9, int i6);

    public abstract void a(int i6, int i9, int i10);

    public abstract void a(int i6, long j6, int i9);

    public abstract void a(long j6, long j9, int i6);

    public abstract void a(g gVar);

    @Override // android.content.SharedPreferences
    public synchronized boolean contains(String str) {
        return this.f16281C.containsKey(str);
    }

    public void d() {
        this.f16279A = 12;
        this.f16280B = 0L;
        this.f16281C.clear();
        this.f16290M.a();
        this.f16289L.a();
        e();
    }

    public abstract void d(int i6);

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this;
    }

    public abstract void f(String str);

    public void g() {
    }

    public abstract void g(String str);

    @Override // android.content.SharedPreferences
    public synchronized Map<String, Object> getAll() {
        Object valueOf;
        int size = this.f16281C.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry<String, b.AbstractC0098b> entry : this.f16281C.entrySet()) {
            String key = entry.getKey();
            b.AbstractC0098b value = entry.getValue();
            switch (value.a()) {
                case 1:
                    valueOf = Boolean.valueOf(((b.c) value).f16306b);
                    break;
                case 2:
                    valueOf = Integer.valueOf(((b.f) value).f16309b);
                    break;
                case 3:
                    valueOf = Float.valueOf(((b.e) value).f16308b);
                    break;
                case 4:
                    valueOf = Long.valueOf(((b.g) value).f16310b);
                    break;
                case 5:
                    valueOf = Double.valueOf(((b.d) value).f16307b);
                    break;
                case 6:
                    b.i iVar = (b.i) value;
                    if (iVar.f16315f) {
                        valueOf = a(iVar, this.f16302z);
                        break;
                    } else {
                        valueOf = iVar.f16312c;
                        break;
                    }
                case 7:
                    b.a aVar = (b.a) value;
                    if (aVar.f16315f) {
                        valueOf = a(aVar, this.f16302z);
                        break;
                    } else {
                        valueOf = aVar.f16312c;
                        break;
                    }
                case 8:
                    b.h hVar = (b.h) value;
                    if (hVar.f16315f) {
                        valueOf = a(hVar, this.f16302z);
                        break;
                    } else {
                        valueOf = ((b.h) value).f16312c;
                        break;
                    }
                default:
                    valueOf = null;
                    break;
            }
            if (valueOf != null) {
                hashMap.put(key, valueOf);
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public synchronized boolean getBoolean(String str, boolean z3) {
        b.AbstractC0098b abstractC0098b = this.f16281C.get(str);
        if (abstractC0098b != null && abstractC0098b.a() == 1) {
            return ((b.c) abstractC0098b).f16306b;
        }
        return z3;
    }

    @Override // android.content.SharedPreferences
    public synchronized float getFloat(String str, float f3) {
        b.AbstractC0098b abstractC0098b = this.f16281C.get(str);
        if (abstractC0098b != null && abstractC0098b.a() == 3) {
            return ((b.e) abstractC0098b).f16308b;
        }
        return f3;
    }

    @Override // android.content.SharedPreferences
    public synchronized int getInt(String str, int i6) {
        b.AbstractC0098b abstractC0098b = this.f16281C.get(str);
        if (abstractC0098b != null && abstractC0098b.a() == 2) {
            return ((b.f) abstractC0098b).f16309b;
        }
        return i6;
    }

    @Override // android.content.SharedPreferences
    public synchronized long getLong(String str, long j6) {
        b.AbstractC0098b abstractC0098b = this.f16281C.get(str);
        if (abstractC0098b != null && abstractC0098b.a() == 4) {
            return ((b.g) abstractC0098b).f16310b;
        }
        return j6;
    }

    @Override // android.content.SharedPreferences
    public synchronized String getString(String str, String str2) {
        b.AbstractC0098b abstractC0098b = this.f16281C.get(str);
        if (abstractC0098b != null && abstractC0098b.a() == 6) {
            b.i iVar = (b.i) abstractC0098b;
            if (!iVar.f16315f) {
                return (String) iVar.f16312c;
            }
            Object a9 = this.f16290M.a(str);
            if (a9 instanceof String) {
                return (String) a9;
            }
            String a10 = a(iVar, this.f16302z);
            if (a10 != null && !a10.isEmpty()) {
                this.f16290M.a(str, a10);
                return a10;
            }
            remove(str);
            return str2;
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> p9 = p(str);
        return p9 != null ? p9 : set;
    }

    public abstract void h();

    public abstract void i();

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putBoolean(String str, boolean z3) {
        try {
            if (this.J) {
                return this;
            }
            h(str);
            g();
            b.AbstractC0098b abstractC0098b = this.f16281C.get(str);
            if (abstractC0098b != null && abstractC0098b.a() != 1) {
                remove(str);
                abstractC0098b = null;
            }
            b.c cVar = (b.c) abstractC0098b;
            if (cVar == null) {
                if (!a(str, (byte) 1)) {
                    return this;
                }
                f fVar = this.f16283E;
                int i6 = fVar.f16335b;
                fVar.a(z3 ? (byte) 1 : (byte) 0);
                i();
                this.f16281C.put(str, new b.c(i6, z3));
                f(str);
            } else if (cVar.f16306b != z3) {
                cVar.f16306b = z3;
                a(z3 ? (byte) 1 : (byte) 0, cVar.f16305a);
                f(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putFloat(String str, float f3) {
        try {
            if (this.J) {
                return this;
            }
            h(str);
            g();
            b.AbstractC0098b abstractC0098b = this.f16281C.get(str);
            if (abstractC0098b != null && abstractC0098b.a() != 3) {
                remove(str);
                abstractC0098b = null;
            }
            b.e eVar = (b.e) abstractC0098b;
            if (eVar == null) {
                if (!a(str, (byte) 3)) {
                    return this;
                }
                f fVar = this.f16283E;
                int i6 = fVar.f16335b;
                fVar.b(a(f3));
                i();
                this.f16281C.put(str, new b.e(i6, f3));
                f(str);
            } else if (eVar.f16308b != f3) {
                eVar.f16308b = f3;
                a(a(f3), (this.f16283E.a(eVar.f16305a) ^ r1) & 4294967295L, eVar.f16305a);
                f(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putInt(String str, int i6) {
        try {
            if (this.J) {
                return this;
            }
            h(str);
            g();
            b.AbstractC0098b abstractC0098b = this.f16281C.get(str);
            if (abstractC0098b != null && abstractC0098b.a() != 2) {
                remove(str);
                abstractC0098b = null;
            }
            b.f fVar = (b.f) abstractC0098b;
            if (fVar == null) {
                if (!a(str, (byte) 2)) {
                    return this;
                }
                f fVar2 = this.f16283E;
                int i9 = fVar2.f16335b;
                com.anythink.core.common.s.a.a.a aVar = this.f16302z;
                fVar2.b(aVar != null ? aVar.c() : i6);
                i();
                this.f16281C.put(str, new b.f(i9, i6));
                f(str);
            } else if (fVar.f16309b != i6) {
                com.anythink.core.common.s.a.a.a aVar2 = this.f16302z;
                int c9 = aVar2 != null ? aVar2.c() : i6;
                int a9 = this.f16302z != null ? this.f16283E.a(fVar.f16305a) : fVar.f16309b;
                fVar.f16309b = i6;
                a(c9, (a9 ^ c9) & 4294967295L, fVar.f16305a);
                f(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putLong(String str, long j6) {
        Throwable th;
        a aVar;
        try {
            try {
                if (this.J) {
                    return this;
                }
                h(str);
                g();
                b.AbstractC0098b abstractC0098b = this.f16281C.get(str);
                if (abstractC0098b != null) {
                    try {
                        if (abstractC0098b.a() != 4) {
                            remove(str);
                            abstractC0098b = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                b.g gVar = (b.g) abstractC0098b;
                if (gVar == null) {
                    if (!a(str, (byte) 4)) {
                        return this;
                    }
                    f fVar = this.f16283E;
                    int i6 = fVar.f16335b;
                    com.anythink.core.common.s.a.a.a aVar2 = this.f16302z;
                    fVar.a(aVar2 != null ? aVar2.e() : j6);
                    i();
                    this.f16281C.put(str, new b.g(i6, j6));
                    f(str);
                } else if (gVar.f16310b != j6) {
                    com.anythink.core.common.s.a.a.a aVar3 = this.f16302z;
                    long e9 = aVar3 != null ? aVar3.e() : j6;
                    long c9 = (this.f16302z != null ? this.f16283E.c(gVar.f16305a) : gVar.f16310b) ^ e9;
                    gVar.f16310b = j6;
                    aVar = this;
                    aVar.a(e9, c9, gVar.f16305a);
                    f(str);
                    return aVar;
                }
                aVar = this;
                return aVar;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putString(String str, String str2) {
        try {
            if (this.J) {
                return this;
            }
            h(str);
            if (str2 == null) {
                remove(str);
            } else {
                b.AbstractC0098b abstractC0098b = this.f16281C.get(str);
                b.AbstractC0098b abstractC0098b2 = abstractC0098b;
                if (abstractC0098b != null) {
                    byte a9 = abstractC0098b.a();
                    abstractC0098b2 = abstractC0098b;
                    if (a9 != 6) {
                        remove(str);
                        abstractC0098b2 = null;
                    }
                }
                b.i iVar = (b.i) abstractC0098b2;
                if (iVar != null && !iVar.f16315f && str2.equals(iVar.f16312c)) {
                    return this;
                }
                g();
                if (this.f16302z != null || str2.length() * 3 >= this.f16297q) {
                    byte[] bytes = str2.isEmpty() ? f16259S : str2.getBytes(StandardCharsets.UTF_8);
                    com.anythink.core.common.s.a.a.a aVar = this.f16302z;
                    if (aVar != null) {
                        bytes = aVar.a();
                    }
                    byte[] bArr = bytes;
                    if (bArr == null) {
                        a(new Exception(f16265f));
                        return this;
                    }
                    a(str, str2, bArr, iVar, (byte) 6);
                } else {
                    int b9 = f.b(str2);
                    if (iVar == null) {
                        int b10 = f.b(str);
                        f(b10);
                        int i6 = b10 + 4;
                        this.f16285G = i6 + b9;
                        k();
                        this.f16283E.a((byte) 6);
                        a(str, b10);
                        b(str2, b9);
                        HashMap<String, b.AbstractC0098b> hashMap = this.f16281C;
                        int i9 = this.f16284F;
                        hashMap.put(str, new b.i(i9, i6 + i9, str2, b9, false));
                        i();
                    } else {
                        int i10 = iVar.f16305a;
                        int i11 = i10 - iVar.f16313d;
                        int i12 = iVar.f16314e;
                        boolean z3 = false;
                        if (i12 == b9) {
                            this.f16280B = this.f16283E.b(i10, i12) ^ this.f16280B;
                            if (b9 == str2.length()) {
                                str2.getBytes(0, b9, this.f16283E.f16334a, iVar.f16305a);
                            } else {
                                f fVar = this.f16283E;
                                fVar.f16335b = iVar.f16305a;
                                fVar.a(str2);
                            }
                            this.f16284F = iVar.f16305a;
                            this.f16285G = b9;
                        } else {
                            this.f16285G = i11 + b9;
                            k();
                            this.f16283E.a((byte) 6);
                            int i13 = i11 - 3;
                            f fVar2 = this.f16283E;
                            byte[] bArr2 = fVar2.f16334a;
                            System.arraycopy(bArr2, iVar.f16313d + 1, bArr2, fVar2.f16335b, i13);
                            this.f16283E.f16335b += i13;
                            b(str2, b9);
                            a((byte) 6, iVar.f16313d, iVar.f16305a + iVar.f16314e);
                            r1 = iVar.f16315f ? (String) iVar.f16312c : null;
                            iVar.f16315f = false;
                            int i14 = this.f16284F;
                            iVar.f16313d = i14;
                            iVar.f16305a = i14 + i11;
                            iVar.f16314e = b9;
                            z3 = true;
                        }
                        iVar.f16312c = str2;
                        i();
                        if (z3) {
                            h();
                        }
                        if (r1 != null) {
                            g(r1);
                        }
                    }
                }
                f(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        try {
            if (this.J) {
                return this;
            }
            if (set == null) {
                remove(str);
            } else {
                a(str, (String) set, (com.anythink.core.common.s.a.a.b<String>) k.f16370a);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences
    public synchronized void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (onSharedPreferenceChangeListener == null) {
            return;
        }
        if (!this.f16295R.contains(onSharedPreferenceChangeListener)) {
            this.f16295R.add(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences
    public synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f16295R.remove(onSharedPreferenceChangeListener);
    }

    public static long a(long j6, int i6) {
        int i9 = (i6 & 7) << 3;
        return (j6 >>> (64 - i9)) | (j6 << i9);
    }

    public static boolean b(int i6) {
        return (i6 & 1073741824) != 0;
    }

    private void k() {
        d(this.f16285G);
        int i6 = this.f16279A;
        this.f16284F = i6;
        this.f16279A = this.f16285G + i6;
        this.f16283E.f16335b = i6;
    }

    public final void c(int i6) {
        ArrayList<C0097a> arrayList = this.f16294Q;
        Collections.sort(arrayList);
        C0097a c0097a = arrayList.get(0);
        int size = arrayList.size();
        boolean z3 = true;
        int i9 = 0;
        for (int i10 = 1; i10 < size; i10++) {
            C0097a c0097a2 = arrayList.get(i10);
            if (c0097a2.f16303a == c0097a.f16304b) {
                c0097a.f16304b = c0097a2.f16304b;
            } else {
                i9++;
                if (i9 != i10) {
                    arrayList.set(i9, c0097a2);
                }
                c0097a = c0097a2;
            }
        }
        int i11 = i9 + 1;
        if (size > i11) {
            arrayList.subList(i11, size).clear();
        }
        C0097a c0097a3 = this.f16294Q.get(0);
        int i12 = c0097a3.f16303a;
        int i13 = this.f16279A;
        int i14 = i13 - this.f16293P;
        int i15 = i14 - 12;
        int i16 = i14 - i12;
        int i17 = i13 - i12;
        boolean z6 = i15 < i17 + i16;
        if (!z6) {
            this.f16280B ^= this.f16283E.b(i12, i17);
        }
        int size2 = this.f16294Q.size();
        int i18 = size2 - 1;
        int i19 = this.f16279A - this.f16294Q.get(i18).f16304b;
        int i20 = i19 > 0 ? size2 : i18;
        int[] iArr = new int[i20];
        int[] iArr2 = new int[i20];
        int i21 = c0097a3.f16303a;
        int i22 = c0097a3.f16304b;
        int i23 = 1;
        while (i23 < size2) {
            boolean z9 = z3;
            C0097a c0097a4 = this.f16294Q.get(i23);
            int i24 = i23;
            int i25 = c0097a4.f16303a - i22;
            int i26 = size2;
            byte[] bArr = this.f16283E.f16334a;
            System.arraycopy(bArr, i22, bArr, i21, i25);
            int i27 = i24 - 1;
            iArr[i27] = i22;
            iArr2[i27] = i22 - i21;
            i21 += i25;
            i22 = c0097a4.f16304b;
            i23 = i24 + 1;
            z3 = z9;
            size2 = i26;
        }
        if (i19 > 0) {
            byte[] bArr2 = this.f16283E.f16334a;
            System.arraycopy(bArr2, i22, bArr2, i21, i19);
            iArr[i18] = i22;
            iArr2[i18] = i22 - i21;
        }
        e();
        if (z6) {
            this.f16280B = this.f16283E.b(12, i15);
        } else {
            this.f16280B ^= this.f16283E.b(i12, i16);
        }
        this.f16279A = i14;
        a(i12, i6, i16);
        for (b.AbstractC0098b abstractC0098b : this.f16281C.values()) {
            int i28 = abstractC0098b.f16305a;
            if (i28 > i12) {
                int i29 = i20 - 1;
                int i30 = 0;
                while (true) {
                    if (i30 > i29) {
                        break;
                    }
                    int i31 = (i30 + i29) >>> 1;
                    int i32 = iArr[i31];
                    if (i32 >= i28) {
                        if (i32 <= i28) {
                            i29 = i31;
                            break;
                        }
                        i29 = i31 - 1;
                    } else {
                        i30 = i31 + 1;
                    }
                }
                int i33 = iArr2[i29];
                abstractC0098b.f16305a -= i33;
                if (abstractC0098b.a() >= 6) {
                    ((b.j) abstractC0098b).f16313d -= i33;
                }
            }
        }
        c(f16267h);
    }

    public final void e() {
        this.f16293P = 0;
        this.f16294Q.clear();
    }

    public final int f() {
        if (this.f16279A <= 16384) {
            return f16277t;
        }
        return 16384;
    }

    public final int a(int i6) {
        return this.f16302z == null ? i6 : i6 | 1073741824;
    }

    public final void b() {
        try {
            l.c(new File(this.f16298v, this.f16299w + f16269k));
            l.c(new File(this.f16298v, this.f16299w + f16270l));
        } catch (Exception e9) {
            a(e9);
        }
    }

    public static int a(int i6, int i9) {
        if (i9 < f16271m) {
            int i10 = f16275r;
            if (i9 <= i10) {
                return i10;
            }
            while (i6 < i9) {
                i6 <<= 1;
            }
            return i6;
        }
        throw new IllegalStateException("data size out of limit");
    }

    public final synchronized void e(String str) {
        if (this.f16295R.isEmpty()) {
            return;
        }
        Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = this.f16295R.iterator();
        while (it.hasNext()) {
            this.f16296T.post(new androidx.emoji2.text.k(3, this, it.next(), str));
        }
    }

    private int j(String str) {
        return getInt(str, 0);
    }

    private void b(int i6, int i9) {
        this.f16293P = (i9 - i6) + this.f16293P;
        this.f16294Q.add(new C0097a(i6, i9));
    }

    public final void a() {
        com.anythink.core.common.s.a.a.b bVar;
        com.anythink.core.common.s.a.a.b[] bVarArr = (com.anythink.core.common.s.a.a.b[]) this.f16300x.values().toArray(new com.anythink.core.common.s.a.a.b[this.f16300x.size()]);
        String str = "temp_" + this.f16299w;
        g gVar = new g(this.f16298v, str, bVarArr, this.f16302z, 2);
        gVar.f16341V = false;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b.AbstractC0098b> entry : this.f16281C.entrySet()) {
            String key = entry.getKey();
            b.AbstractC0098b value = entry.getValue();
            if (value instanceof b.i) {
                b.i iVar = (b.i) value;
                if (iVar.f16315f) {
                    arrayList.add((String) iVar.f16312c);
                    String a9 = a(iVar, (com.anythink.core.common.s.a.a.a) null);
                    if (a9 != null) {
                        gVar.putString(key, a9);
                    }
                } else {
                    gVar.putString(key, (String) iVar.f16312c);
                }
            } else if (value instanceof b.c) {
                gVar.putBoolean(key, ((b.c) value).f16306b);
            } else if (value instanceof b.f) {
                gVar.putInt(key, ((b.f) value).f16309b);
            } else if (value instanceof b.g) {
                gVar.putLong(key, ((b.g) value).f16310b);
            } else if (value instanceof b.e) {
                gVar.putFloat(key, ((b.e) value).f16308b);
            } else if (value instanceof b.d) {
                gVar.b(key, ((b.d) value).f16307b);
            } else if (value instanceof b.a) {
                b.a aVar = (b.a) value;
                if (aVar.f16315f) {
                    arrayList.add((String) aVar.f16312c);
                    byte[] a10 = a(aVar, (com.anythink.core.common.s.a.a.a) null);
                    if (a10 != null) {
                        gVar.a(key, a10);
                    }
                } else {
                    gVar.a(key, (byte[]) aVar.f16312c);
                }
            } else if (value instanceof b.h) {
                b.h hVar = (b.h) value;
                if (hVar.f16315f) {
                    arrayList.add((String) hVar.f16312c);
                    Object a11 = a(hVar, (com.anythink.core.common.s.a.a.a) null);
                    if (a11 != null && (bVar = hVar.f16311b) != null) {
                        gVar.a(key, (String) a11, (com.anythink.core.common.s.a.a.b<String>) bVar);
                    }
                } else {
                    com.anythink.core.common.s.a.a.b bVar2 = hVar.f16311b;
                    if (bVar2 != null) {
                        gVar.a(key, (String) hVar.f16312c, (com.anythink.core.common.s.a.a.b<String>) bVar2);
                    }
                }
            }
        }
        gVar.contains("");
        this.f16283E = gVar.f16283E;
        this.f16280B = gVar.f16280B;
        this.f16279A = gVar.f16279A;
        e();
        this.f16281C.clear();
        this.f16281C.putAll(gVar.f16281C);
        a(gVar);
        while (gVar.f16291N.a()) {
            try {
                Thread.sleep(10L);
            } catch (Exception unused) {
            }
        }
        File file = new File(this.f16298v, str);
        String str2 = this.f16298v + this.f16299w;
        l.a(file, str2);
        l.c(file);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l.c(new File(str2, (String) it.next()));
        }
        this.f16287I = false;
    }

    public final synchronized <T> T d(String str) {
        b.AbstractC0098b abstractC0098b = this.f16281C.get(str);
        if (abstractC0098b != null && abstractC0098b.a() == 8) {
            b.h hVar = (b.h) abstractC0098b;
            if (hVar.f16315f) {
                T t6 = (T) this.f16290M.a(str);
                if (t6 != null) {
                    return t6;
                }
                T t9 = (T) a(hVar, this.f16302z);
                if (t9 == null) {
                    remove(str);
                    return null;
                }
                this.f16290M.a(str, t9);
                return t9;
            }
            return (T) hVar.f16312c;
        }
        return null;
    }

    public final void b(String str) {
        com.anythink.core.common.s.a.a.c cVar = this.f16301y;
        if (cVar != null) {
            cVar.b(this.f16299w, new Exception(str));
        }
    }

    public final void b(Exception exc) {
        com.anythink.core.common.s.a.a.c cVar = this.f16301y;
        if (cVar != null) {
            cVar.a(this.f16299w, exc);
        }
    }

    private synchronized byte[] b(String str, byte[] bArr) {
        b.AbstractC0098b abstractC0098b = this.f16281C.get(str);
        if (abstractC0098b != null && abstractC0098b.a() == 7) {
            b.a aVar = (b.a) abstractC0098b;
            if (aVar.f16315f) {
                Object a9 = this.f16290M.a(str);
                if (a9 instanceof byte[]) {
                    return (byte[]) a9;
                }
                byte[] a10 = a(aVar, this.f16302z);
                if (a10 != null && a10.length != 0) {
                    this.f16290M.a(str, a10);
                    return a10;
                }
                remove(str);
                return bArr;
            }
            return (byte[]) aVar.f16312c;
        }
        return bArr;
    }

    public final synchronized SharedPreferences.Editor b(String str, double d2) {
        Throwable th;
        a aVar;
        try {
            try {
                if (this.J) {
                    return this;
                }
                h(str);
                g();
                b.AbstractC0098b abstractC0098b = this.f16281C.get(str);
                if (abstractC0098b != null) {
                    try {
                        if (abstractC0098b.a() != 5) {
                            remove(str);
                            abstractC0098b = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                b.d dVar = (b.d) abstractC0098b;
                if (dVar == null) {
                    if (!a(str, (byte) 5)) {
                        return this;
                    }
                    f fVar = this.f16283E;
                    int i6 = fVar.f16335b;
                    fVar.a(a(d2));
                    i();
                    this.f16281C.put(str, new b.d(i6, d2));
                    f(str);
                } else if (dVar.f16307b != d2) {
                    long a9 = a(d2);
                    long c9 = a9 ^ this.f16283E.c(dVar.f16305a);
                    dVar.f16307b = d2;
                    aVar = this;
                    aVar.a(a9, c9, dVar.f16305a);
                    f(str);
                    return aVar;
                }
                aVar = this;
                return aVar;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final void c() {
        d();
        j();
    }

    public final void c(String str) {
        com.anythink.core.common.s.a.a.c cVar = this.f16301y;
        if (cVar != null) {
            cVar.a(this.f16299w, str);
        }
    }

    private void b(String str, int i6) {
        this.f16283E.a((short) i6);
        if (i6 == str.length()) {
            f fVar = this.f16283E;
            str.getBytes(0, i6, fVar.f16334a, fVar.f16335b);
        } else {
            this.f16283E.a(str);
        }
    }

    private int b(String str, byte[] bArr, byte b9) {
        if (!a(str, b9, bArr.length + 2)) {
            return 0;
        }
        this.f16283E.a((short) bArr.length);
        f fVar = this.f16283E;
        int i6 = fVar.f16335b;
        fVar.a(bArr);
        return i6;
    }

    public final boolean a(File file) {
        long length = file.length();
        if (length != 0 && length < 268435456) {
            int i6 = (int) length;
            int a9 = a(f16275r, i6);
            f fVar = this.f16283E;
            if (fVar != null && fVar.f16334a.length == a9) {
                fVar.f16335b = 0;
            } else {
                fVar = new f(new byte[a9]);
                this.f16283E = fVar;
            }
            l.a(file, fVar.f16334a, i6);
            int c9 = fVar.c();
            if (c9 < 0) {
                return false;
            }
            int i9 = (-1073741825) & c9;
            boolean b9 = b(c9);
            long d2 = fVar.d();
            this.f16279A = i9 + 12;
            if (i9 >= 0 && i9 <= i6 - 12 && d2 == fVar.b(12, i9) && a(b9)) {
                this.f16280B = d2;
                return true;
            }
        }
        return false;
    }

    public final void a(String str) {
        h.a().execute(new o(1, this, str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x01cb, code lost:
    
        throw new java.lang.Exception(com.anythink.core.common.s.a.a.f16261b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z3) {
        int length;
        f fVar;
        Object obj;
        boolean z6 = false;
        if (z3 && this.f16302z == null) {
            b(f16264e);
            return false;
        }
        com.anythink.core.common.s.a.a.a aVar = z3 ? this.f16302z : null;
        f fVar2 = this.f16283E;
        fVar2.f16335b = 12;
        while (true) {
            try {
                int i6 = fVar2.f16335b;
                int i9 = this.f16279A;
                boolean z9 = true;
                if (i6 >= i9) {
                    if (i6 != i9) {
                        a(new Exception(f16261b));
                        return false;
                    }
                    if (!z3 && this.f16302z != null && i9 != 12) {
                        z6 = true;
                    }
                    this.f16287I = z6;
                    return true;
                }
                byte a9 = fVar2.a();
                byte b9 = (byte) (a9 & c.f16318c);
                if (b9 <= 0 || b9 > 8) {
                    break;
                }
                int a10 = fVar2.a() & 255;
                if (a10 == 0) {
                    throw new IllegalStateException("invalid key size");
                }
                if (a9 < 0) {
                    fVar2.f16335b += a10;
                    int b10 = fVar2.f16335b + (b9 <= 5 ? f16273o[b9] : fVar2.b() & 65535);
                    fVar2.f16335b = b10;
                    b(i6, b10);
                } else {
                    String a11 = fVar2.a(aVar, a10);
                    int i10 = fVar2.f16335b;
                    if (b9 > 5) {
                        int b11 = fVar2.b() & 65535;
                        boolean z10 = (a9 & c.f16317b) != 0;
                        if (z10 && b11 != 32) {
                            throw new IllegalStateException("name size not match");
                        }
                        if (b9 == 6) {
                            this.f16281C.put(a11, new b.i(i6, i10 + 2, z10 ? fVar2.d(b11) : fVar2.a(aVar, b11), b11, z10));
                        } else if (b9 == 7) {
                            if (z10) {
                                obj = fVar2.d(b11);
                            } else {
                                obj = new byte[b11];
                                System.arraycopy(fVar2.f16334a, fVar2.f16335b, obj, 0, b11);
                                fVar2.f16335b += b11;
                                if (aVar != null) {
                                    obj = aVar.b();
                                }
                            }
                            this.f16281C.put(a11, new b.a(i6, i10 + 2, obj, b11, z10));
                        } else if (z10) {
                            this.f16281C.put(a11, new b.h(i6, i10 + 2, fVar2.d(b11), b11, true));
                        } else {
                            if (aVar == null) {
                                fVar = this.f16283E;
                                length = b11;
                            } else {
                                f fVar3 = this.f16283E;
                                System.arraycopy(fVar3.f16334a, fVar3.f16335b, new byte[b11], 0, b11);
                                byte[] b12 = aVar.b();
                                f fVar4 = new f(b12);
                                length = b12.length;
                                fVar = fVar4;
                            }
                            int a12 = fVar.a() & 255;
                            String d2 = fVar.d(a12);
                            com.anythink.core.common.s.a.a.b bVar = this.f16300x.get(d2);
                            int i11 = length - (a12 + 1);
                            if (i11 >= 0) {
                                if (bVar != null) {
                                    try {
                                        b.h hVar = new b.h(i6, i10 + 2, bVar.a(fVar.f16334a, fVar.f16335b, i11), b11, false);
                                        hVar.f16311b = bVar;
                                        this.f16281C.put(a11, hVar);
                                    } catch (Exception e9) {
                                        a(e9);
                                    }
                                } else {
                                    b("object with tag: " + d2 + " without encoder");
                                }
                                fVar2.f16335b = i10 + 2 + b11;
                            } else {
                                throw new Exception(f16261b);
                            }
                        }
                    } else if (b9 == 1) {
                        HashMap<String, b.AbstractC0098b> hashMap = this.f16281C;
                        if (fVar2.a() != 1) {
                            z9 = false;
                        }
                        hashMap.put(a11, new b.c(i10, z9));
                    } else if (b9 == 2) {
                        this.f16281C.put(a11, new b.f(i10, fVar2.a(aVar)));
                    } else if (b9 == 3) {
                        this.f16281C.put(a11, new b.e(i10, Float.intBitsToFloat(fVar2.a(aVar))));
                    } else if (b9 != 4) {
                        this.f16281C.put(a11, new b.d(i10, Double.longBitsToDouble(fVar2.b(aVar))));
                    } else {
                        this.f16281C.put(a11, new b.g(i10, fVar2.b(aVar)));
                    }
                }
            } catch (Exception e10) {
                a(e10);
                return false;
            }
        }
    }

    private void a(int i6, String str, int i9, int i10, com.anythink.core.common.s.a.a.a aVar) {
        int length;
        f fVar;
        if (aVar == null) {
            fVar = this.f16283E;
            length = i6;
        } else {
            f fVar2 = this.f16283E;
            System.arraycopy(fVar2.f16334a, fVar2.f16335b, new byte[i6], 0, i6);
            byte[] b9 = aVar.b();
            f fVar3 = new f(b9);
            length = b9.length;
            fVar = fVar3;
        }
        int a9 = fVar.a() & 255;
        String d2 = fVar.d(a9);
        com.anythink.core.common.s.a.a.b bVar = this.f16300x.get(d2);
        int i11 = length - (a9 + 1);
        if (i11 < 0) {
            throw new Exception(f16261b);
        }
        if (bVar != null) {
            try {
                b.h hVar = new b.h(i9, i10 + 2, bVar.a(fVar.f16334a, fVar.f16335b, i11), i6, false);
                hVar.f16311b = bVar;
                this.f16281C.put(str, hVar);
                return;
            } catch (Exception e9) {
                a(e9);
                return;
            }
        }
        b("object with tag: " + d2 + " without encoder");
    }

    private static void a(ArrayList<C0097a> arrayList) {
        Collections.sort(arrayList);
        int i6 = 0;
        C0097a c0097a = arrayList.get(0);
        int size = arrayList.size();
        for (int i9 = 1; i9 < size; i9++) {
            C0097a c0097a2 = arrayList.get(i9);
            if (c0097a2.f16303a == c0097a.f16304b) {
                c0097a.f16304b = c0097a2.f16304b;
            } else {
                i6++;
                if (i6 != i9) {
                    arrayList.set(i6, c0097a2);
                }
                c0097a = c0097a2;
            }
        }
        int i10 = i6 + 1;
        if (size > i10) {
            arrayList.subList(i10, size).clear();
        }
    }

    private void a(int i6, int[] iArr, int[] iArr2) {
        for (b.AbstractC0098b abstractC0098b : this.f16281C.values()) {
            int i9 = abstractC0098b.f16305a;
            if (i9 > i6) {
                int length = iArr.length - 1;
                int i10 = 0;
                while (true) {
                    if (i10 > length) {
                        break;
                    }
                    int i11 = (i10 + length) >>> 1;
                    int i12 = iArr[i11];
                    if (i12 >= i9) {
                        if (i12 <= i9) {
                            length = i11;
                            break;
                        }
                        length = i11 - 1;
                    } else {
                        i10 = i11 + 1;
                    }
                }
                int i13 = iArr2[length];
                abstractC0098b.f16305a -= i13;
                if (abstractC0098b.a() >= 6) {
                    ((b.j) abstractC0098b).f16313d -= i13;
                }
            }
        }
    }

    public final void a(File file, File file2) {
        try {
            if (a(file)) {
                return;
            }
        } catch (IOException e9) {
            b(e9);
        }
        c();
        try {
            if (a(file2)) {
                return;
            }
        } catch (IOException e10) {
            b(e10);
        }
        c();
    }

    public final void a(Exception exc) {
        com.anythink.core.common.s.a.a.c cVar = this.f16301y;
        if (cVar != null) {
            cVar.b(this.f16299w, exc);
        }
    }

    public final synchronized double a(String str, double d2) {
        b.AbstractC0098b abstractC0098b = this.f16281C.get(str);
        if (abstractC0098b != null && abstractC0098b.a() == 5) {
            return ((b.d) abstractC0098b).f16307b;
        }
        return d2;
    }

    private String a(b.i iVar, com.anythink.core.common.s.a.a.a aVar) {
        String str = (String) iVar.f16312c;
        byte[] bArr = (byte[]) this.f16289L.a(str);
        if (bArr == null) {
            try {
                bArr = l.b(new File(this.f16298v + this.f16299w, str));
            } catch (Exception e9) {
                a(e9);
            }
        }
        if (bArr != null) {
            if (aVar != null) {
                bArr = aVar.b();
            }
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        }
        return null;
    }

    private byte[] a(b.a aVar, com.anythink.core.common.s.a.a.a aVar2) {
        String str = (String) aVar.f16312c;
        byte[] bArr = (byte[]) this.f16289L.a(str);
        if (bArr == null) {
            try {
                bArr = l.b(new File(this.f16298v + this.f16299w, str));
            } catch (Exception e9) {
                a(e9);
                return null;
            }
        }
        if (bArr != null) {
            return aVar2 != null ? aVar2.b() : bArr;
        }
        return null;
    }

    private Object a(b.h hVar, com.anythink.core.common.s.a.a.a aVar) {
        String str = (String) hVar.f16312c;
        byte[] bArr = (byte[]) this.f16289L.a(str);
        if (bArr == null) {
            try {
                bArr = l.b(new File(this.f16298v + this.f16299w, str));
            } catch (Exception e9) {
                a(e9);
                return null;
            }
        }
        if (bArr != null) {
            if (aVar != null) {
                bArr = aVar.b();
            }
            int i6 = bArr[0] & 255;
            String a9 = this.f16283E.a(bArr, 1, i6);
            com.anythink.core.common.s.a.a.b bVar = this.f16300x.get(a9);
            if (bVar != null) {
                hVar.f16311b = bVar;
                int i9 = i6 + 1;
                return bVar.a(bArr, i9, bArr.length - i9);
            }
            b(new Exception("No encoder for tag:".concat(String.valueOf(a9))));
            return null;
        }
        b(new Exception("Read object data failed"));
        return null;
    }

    private void a(String str, String str2, b.i iVar) {
        int b9 = f.b(str2);
        if (iVar == null) {
            int b10 = f.b(str);
            f(b10);
            int i6 = b10 + 4;
            this.f16285G = i6 + b9;
            k();
            this.f16283E.a((byte) 6);
            a(str, b10);
            b(str2, b9);
            HashMap<String, b.AbstractC0098b> hashMap = this.f16281C;
            int i9 = this.f16284F;
            hashMap.put(str, new b.i(i9, i6 + i9, str2, b9, false));
            i();
            return;
        }
        int i10 = iVar.f16305a;
        int i11 = i10 - iVar.f16313d;
        int i12 = iVar.f16314e;
        boolean z3 = false;
        if (i12 == b9) {
            this.f16280B = this.f16283E.b(i10, i12) ^ this.f16280B;
            if (b9 == str2.length()) {
                str2.getBytes(0, b9, this.f16283E.f16334a, iVar.f16305a);
            } else {
                f fVar = this.f16283E;
                fVar.f16335b = iVar.f16305a;
                fVar.a(str2);
            }
            this.f16284F = iVar.f16305a;
            this.f16285G = b9;
        } else {
            this.f16285G = i11 + b9;
            k();
            this.f16283E.a((byte) 6);
            int i13 = i11 - 3;
            f fVar2 = this.f16283E;
            byte[] bArr = fVar2.f16334a;
            System.arraycopy(bArr, iVar.f16313d + 1, bArr, fVar2.f16335b, i13);
            this.f16283E.f16335b += i13;
            b(str2, b9);
            a((byte) 6, iVar.f16313d, iVar.f16305a + iVar.f16314e);
            r2 = iVar.f16315f ? (String) iVar.f16312c : null;
            iVar.f16315f = false;
            int i14 = this.f16284F;
            iVar.f16313d = i14;
            iVar.f16305a = i14 + i11;
            iVar.f16314e = b9;
            z3 = true;
        }
        iVar.f16312c = str2;
        i();
        if (z3) {
            h();
        }
        if (r2 != null) {
            g(r2);
        }
    }

    public final synchronized SharedPreferences.Editor a(String str, byte[] bArr) {
        Throwable th;
        a aVar;
        try {
            try {
                if (this.J) {
                    return this;
                }
                h(str);
                try {
                    if (bArr == null) {
                        remove(str);
                        aVar = this;
                    } else {
                        g();
                        b.AbstractC0098b abstractC0098b = this.f16281C.get(str);
                        b.AbstractC0098b abstractC0098b2 = abstractC0098b;
                        if (abstractC0098b != null) {
                            byte a9 = abstractC0098b.a();
                            abstractC0098b2 = abstractC0098b;
                            if (a9 != 7) {
                                remove(str);
                                abstractC0098b2 = null;
                            }
                        }
                        b.a aVar2 = (b.a) abstractC0098b2;
                        com.anythink.core.common.s.a.a.a aVar3 = this.f16302z;
                        byte[] a10 = aVar3 != null ? aVar3.a() : bArr;
                        if (a10 == null) {
                            a(new Exception(f16265f));
                            return this;
                        }
                        aVar = this;
                        aVar.a(str, bArr, a10, aVar2, (byte) 7);
                        f(str);
                    }
                    return aVar;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized <T> SharedPreferences.Editor a(String str, T t6, com.anythink.core.common.s.a.a.b<T> bVar) {
        Throwable th;
        byte[] bArr;
        try {
            try {
                if (this.J) {
                    return this;
                }
                h(str);
                if (bVar != null) {
                    String a9 = bVar.a();
                    if (!a9.isEmpty() && a9.length() <= 50) {
                        if (!this.f16300x.containsKey(a9)) {
                            throw new IllegalArgumentException("Encoder hasn't been registered");
                        }
                        try {
                            if (t6 == null) {
                                remove(str);
                                return this;
                            }
                            b.AbstractC0098b abstractC0098b = null;
                            try {
                                bArr = bVar.a(t6);
                            } catch (Exception e9) {
                                a(e9);
                                bArr = null;
                            }
                            if (bArr == null) {
                                remove(str);
                                return this;
                            }
                            g();
                            b.AbstractC0098b abstractC0098b2 = this.f16281C.get(str);
                            if (abstractC0098b2 == null || abstractC0098b2.a() == 8) {
                                abstractC0098b = abstractC0098b2;
                            } else {
                                remove(str);
                            }
                            b.h hVar = (b.h) abstractC0098b;
                            int b9 = f.b(a9);
                            f fVar = new f(b9 + 1 + bArr.length);
                            fVar.a((byte) b9);
                            fVar.a(a9);
                            fVar.a(bArr);
                            byte[] bArr2 = fVar.f16334a;
                            com.anythink.core.common.s.a.a.a aVar = this.f16302z;
                            if (aVar != null) {
                                bArr2 = aVar.a();
                            }
                            byte[] bArr3 = bArr2;
                            if (bArr3 == null) {
                                return this;
                            }
                            a(str, t6, bArr3, hVar, (byte) 8);
                            f(str);
                            return this;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    throw new IllegalArgumentException("Invalid encoder tag:".concat(a9));
                }
                throw new IllegalArgumentException("Encoder is null");
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener, String str) {
        onSharedPreferenceChangeListener.onSharedPreferenceChanged(this, str);
    }

    public synchronized void a(Map<String, Object> map, Map<Class, com.anythink.core.common.s.a.a.b> map2) {
        try {
            if (this.J) {
                return;
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (key != null && !key.isEmpty()) {
                    if (value instanceof String) {
                        putString(key, (String) value);
                    } else if (value instanceof Boolean) {
                        putBoolean(key, ((Boolean) value).booleanValue());
                    } else if (value instanceof Integer) {
                        putInt(key, ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        putLong(key, ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        putFloat(key, ((Float) value).floatValue());
                    } else if (value instanceof Double) {
                        b(key, ((Double) value).doubleValue());
                    } else if (value instanceof byte[]) {
                        a(key, (byte[]) value);
                    } else {
                        if (value instanceof Set) {
                            Set<String> set = (Set) value;
                            if (set.isEmpty() || (set.iterator().next() instanceof String)) {
                                putStringSet(key, set);
                            }
                        }
                        if (map2 != null) {
                            com.anythink.core.common.s.a.a.b bVar = map2.get(value.getClass());
                            if (bVar != null) {
                                a(key, (String) value, (com.anythink.core.common.s.a.a.b<String>) bVar);
                            } else {
                                b(new Exception("missing encoder for type:" + value.getClass()));
                            }
                        } else {
                            b(new Exception("missing encoders"));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(Map<String, Object> map) {
        a(map, (Map<Class, com.anythink.core.common.s.a.a.b>) null);
    }

    private void a(String str, Object obj, Map<Class, com.anythink.core.common.s.a.a.b> map) {
        if (obj instanceof Set) {
            Set<String> set = (Set) obj;
            if (set.isEmpty() || (set.iterator().next() instanceof String)) {
                putStringSet(str, set);
                return;
            }
        }
        if (map != null) {
            com.anythink.core.common.s.a.a.b bVar = map.get(obj.getClass());
            if (bVar != null) {
                a(str, (String) obj, (com.anythink.core.common.s.a.a.b<String>) bVar);
                return;
            }
            b(new Exception("missing encoder for type:" + obj.getClass()));
            return;
        }
        b(new Exception("missing encoders"));
    }

    private boolean a(String str, byte b9) {
        return a(str, b9, f16273o[b9]);
    }

    private boolean a(String str, byte b9, int i6) {
        com.anythink.core.common.s.a.a.a aVar = this.f16302z;
        if (aVar != null) {
            str.getBytes(StandardCharsets.UTF_8);
            byte[] a9 = aVar.a();
            if (a9 == null) {
                a(new Exception(f16265f));
                return false;
            }
            int length = a9.length;
            a(length, i6, b9);
            this.f16283E.a((byte) length);
            f fVar = this.f16283E;
            System.arraycopy(a9, 0, fVar.f16334a, fVar.f16335b, length);
            this.f16283E.f16335b += length;
            return true;
        }
        int b10 = f.b(str);
        a(b10, i6, b9);
        a(str, b10);
        return true;
    }

    private void a(int i6, int i9, byte b9) {
        f(i6);
        this.f16285G = i6 + 2 + i9;
        k();
        this.f16283E.a(b9);
    }

    private void a(String str, int i6) {
        this.f16283E.a((byte) i6);
        if (i6 == str.length()) {
            f fVar = this.f16283E;
            str.getBytes(0, i6, fVar.f16334a, fVar.f16335b);
            this.f16283E.f16335b += i6;
            return;
        }
        this.f16283E.a(str);
    }

    public void a(byte b9, int i6, int i9) {
        b(i6, i9);
        byte b10 = (byte) (b9 | c.f16316a);
        byte[] bArr = this.f16283E.f16334a;
        this.f16280B = (((bArr[i6] ^ b10) & 255) << ((i6 & 7) << 3)) ^ this.f16280B;
        bArr[i6] = b10;
    }

    public void a(int i6, byte[] bArr) {
        int length = bArr.length;
        this.f16280B ^= this.f16283E.b(i6, length);
        f fVar = this.f16283E;
        fVar.f16335b = i6;
        fVar.a(bArr);
        this.f16280B = this.f16283E.b(i6, length) ^ this.f16280B;
    }

    private int a(float f3) {
        int floatToRawIntBits = Float.floatToRawIntBits(f3);
        com.anythink.core.common.s.a.a.a aVar = this.f16302z;
        return aVar != null ? aVar.c() : floatToRawIntBits;
    }

    private long a(double d2) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d2);
        com.anythink.core.common.s.a.a.a aVar = this.f16302z;
        return aVar != null ? aVar.e() : doubleToRawLongBits;
    }

    private void a(String str, Object obj, byte[] bArr, b.j jVar, byte b9) {
        if (jVar == null) {
            a(str, obj, bArr, b9);
        } else if (!jVar.f16315f && jVar.f16314e == bArr.length) {
            a(jVar.f16305a, bArr);
            jVar.f16312c = obj;
        } else {
            a(str, obj, bArr, jVar);
        }
    }

    private void a(String str, Object obj, byte[] bArr, byte b9) {
        int length;
        b.AbstractC0098b hVar;
        int a9 = a(str, bArr, b9);
        if (a9 > 0) {
            boolean z3 = this.f16288K != null;
            if (z3) {
                this.f16290M.a(str, obj);
                obj = this.f16288K;
                this.f16288K = null;
                length = 32;
            } else {
                length = bArr.length;
            }
            Object obj2 = obj;
            int i6 = length;
            if (b9 == 6) {
                hVar = new b.i(this.f16284F, a9, (String) obj2, i6, z3);
            } else if (b9 == 7) {
                hVar = new b.a(this.f16284F, a9, obj2, i6, z3);
            } else {
                hVar = new b.h(this.f16284F, a9, obj2, i6, z3);
            }
            this.f16281C.put(str, hVar);
            i();
        }
    }

    private void a(String str, Object obj, byte[] bArr, b.j jVar) {
        int a9 = a(str, bArr, jVar.a());
        if (a9 > 0) {
            String str2 = jVar.f16315f ? (String) jVar.f16312c : null;
            a(jVar.a(), jVar.f16313d, jVar.f16305a + jVar.f16314e);
            boolean z3 = this.f16288K != null;
            jVar.f16313d = this.f16284F;
            jVar.f16305a = a9;
            jVar.f16315f = z3;
            if (z3) {
                this.f16290M.a(str, obj);
                jVar.f16312c = this.f16288K;
                jVar.f16314e = 32;
                this.f16288K = null;
            } else {
                jVar.f16312c = obj;
                jVar.f16314e = bArr.length;
            }
            i();
            h();
            if (str2 != null) {
                g(str2);
            }
        }
    }

    private int a(final String str, final byte[] bArr, byte b9) {
        this.f16288K = null;
        if (bArr.length < this.f16297q) {
            return b(str, bArr, b9);
        }
        StringBuilder j6 = AbstractC4404f.j("Large value, key: ", str, ", size: ");
        j6.append(bArr.length);
        c(j6.toString());
        final String a9 = l.a();
        byte[] bArr2 = new byte[32];
        a9.getBytes(0, 32, bArr2, 0);
        int b10 = b(str, bArr2, (byte) (b9 | c.f16317b));
        if (b10 > 0) {
            this.f16289L.a(a9, bArr);
            this.f16291N.a(a9, new e.a() { // from class: com.anythink.core.common.s.a.n
                @Override // com.anythink.core.common.s.a.e.a
                public final void execute(AtomicBoolean atomicBoolean) {
                    a.this.a(a9, bArr, str, atomicBoolean);
                }
            });
            this.f16288K = a9;
        }
        return b10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, byte[] bArr, String str2, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.get()) {
            return;
        }
        if (l.a(new File(this.f16298v + this.f16299w, str), bArr, atomicBoolean)) {
            return;
        }
        c("Write large value with key:" + str2 + " failed");
    }
}
