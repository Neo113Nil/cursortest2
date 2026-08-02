package com.anythink.core.common.s.a;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.anythink.core.common.s.a.b;
import com.anythink.core.common.s.a.e;
import com.google.android.gms.internal.ads.Wv;
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
    protected static final String f17047a = "both files error";

    /* renamed from: b, reason: collision with root package name */
    protected static final String f17048b = "parse dara failed";

    /* renamed from: c, reason: collision with root package name */
    protected static final String f17049c = "open file failed";

    /* renamed from: d, reason: collision with root package name */
    protected static final String f17050d = "map failed";

    /* renamed from: e, reason: collision with root package name */
    protected static final String f17051e = "miss cipher";

    /* renamed from: f, reason: collision with root package name */
    protected static final String f17052f = "Encrypt failed";

    /* renamed from: g, reason: collision with root package name */
    static final String f17053g = "truncate finish";

    /* renamed from: h, reason: collision with root package name */
    static final String f17054h = "gc finish";
    protected static final String i = ".kva";

    /* renamed from: j, reason: collision with root package name */
    protected static final String f17055j = ".kvb";

    /* renamed from: k, reason: collision with root package name */
    protected static final String f17056k = ".kvc";

    /* renamed from: l, reason: collision with root package name */
    protected static final String f17057l = ".tmp";

    /* renamed from: m, reason: collision with root package name */
    protected static final int f17058m = 268435456;

    /* renamed from: n, reason: collision with root package name */
    protected static final int f17059n = 1073741824;

    /* renamed from: p, reason: collision with root package name */
    protected static final int f17061p = 12;

    /* renamed from: r, reason: collision with root package name */
    protected static final int f17062r;

    /* renamed from: s, reason: collision with root package name */
    protected static final int f17063s;

    /* renamed from: t, reason: collision with root package name */
    protected static final int f17064t = 8192;

    /* renamed from: u, reason: collision with root package name */
    protected static final int f17065u = 80;

    /* renamed from: A, reason: collision with root package name */
    protected int f17066A;

    /* renamed from: B, reason: collision with root package name */
    protected long f17067B;

    /* renamed from: E, reason: collision with root package name */
    protected f f17070E;

    /* renamed from: F, reason: collision with root package name */
    protected int f17071F;

    /* renamed from: G, reason: collision with root package name */
    protected int f17072G;

    /* renamed from: K, reason: collision with root package name */
    protected String f17075K;

    /* renamed from: P, reason: collision with root package name */
    protected int f17080P;

    /* renamed from: v, reason: collision with root package name */
    protected final String f17085v;

    /* renamed from: w, reason: collision with root package name */
    protected final String f17086w;

    /* renamed from: x, reason: collision with root package name */
    protected final Map<String, com.anythink.core.common.s.a.a.b> f17087x;

    /* renamed from: z, reason: collision with root package name */
    protected final com.anythink.core.common.s.a.a.a f17089z;

    /* renamed from: S, reason: collision with root package name */
    private static final byte[] f17046S = new byte[0];

    /* renamed from: o, reason: collision with root package name */
    protected static final int[] f17060o = {0, 1, 4, 4, 8, 8};

    /* renamed from: q, reason: collision with root package name */
    protected final int f17084q = h.f17139c;

    /* renamed from: y, reason: collision with root package name */
    protected final com.anythink.core.common.s.a.a.c f17088y = h.f17137a;

    /* renamed from: C, reason: collision with root package name */
    protected final HashMap<String, b.AbstractC0098b> f17068C = new HashMap<>();

    /* renamed from: D, reason: collision with root package name */
    protected volatile boolean f17069D = false;

    /* renamed from: H, reason: collision with root package name */
    protected final List<String> f17073H = new ArrayList();

    /* renamed from: I, reason: collision with root package name */
    protected boolean f17074I = false;
    protected boolean J = false;

    /* renamed from: L, reason: collision with root package name */
    protected final m f17076L = new m();

    /* renamed from: M, reason: collision with root package name */
    protected final m f17077M = new m();

    /* renamed from: N, reason: collision with root package name */
    protected final e f17078N = new e();

    /* renamed from: O, reason: collision with root package name */
    protected final Executor f17079O = new i();

    /* renamed from: Q, reason: collision with root package name */
    protected final ArrayList<C0097a> f17081Q = new ArrayList<>();

    /* renamed from: R, reason: collision with root package name */
    protected final ArrayList<SharedPreferences.OnSharedPreferenceChangeListener> f17082R = new ArrayList<>();

    /* renamed from: T, reason: collision with root package name */
    private final Handler f17083T = new Handler(Looper.getMainLooper());

    /* renamed from: com.anythink.core.common.s.a.a$a, reason: collision with other inner class name */
    public static class C0097a implements Comparable<C0097a> {

        /* renamed from: a, reason: collision with root package name */
        int f17090a;

        /* renamed from: b, reason: collision with root package name */
        int f17091b;

        public C0097a(int i, int i4) {
            this.f17090a = i;
            this.f17091b = i4;
        }

        private int a(C0097a c0097a) {
            return this.f17090a - c0097a.f17090a;
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(C0097a c0097a) {
            return this.f17090a - c0097a.f17090a;
        }
    }

    static {
        int b9 = l.b();
        f17062r = b9;
        f17063s = Math.max(b9, 32768);
    }

    public a(String str, String str2, com.anythink.core.common.s.a.a.b[] bVarArr, com.anythink.core.common.s.a.a.a aVar) {
        this.f17085v = str;
        this.f17086w = str2;
        this.f17089z = aVar;
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
        hashMap.put("StringSet", k.f17157a);
        this.f17087x = hashMap;
    }

    private static int e(int i4) {
        return i4 & (-1073741825);
    }

    private static void f(int i4) {
        if (i4 > 255) {
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
        f fVar = this.f17070E;
        if (fVar == null || fVar.f17121a.length != f17062r) {
            this.f17070E = new f(f17062r);
        } else {
            fVar.a(4, 0L);
        }
        this.f17070E.a(0, a(0));
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
        return b(str, f17046S);
    }

    private synchronized Set<String> p(String str) {
        return (Set) d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(String str) {
        if (this.f17078N.a(str)) {
            return;
        }
        l.c(new File(this.f17085v + this.f17086w, str));
    }

    public abstract void a(byte b9, int i4);

    public abstract void a(int i4, int i6, int i9);

    public abstract void a(int i4, long j6, int i6);

    public abstract void a(long j6, long j9, int i4);

    public abstract void a(g gVar);

    @Override // android.content.SharedPreferences
    public synchronized boolean contains(String str) {
        return this.f17068C.containsKey(str);
    }

    public void d() {
        this.f17066A = 12;
        this.f17067B = 0L;
        this.f17068C.clear();
        this.f17077M.a();
        this.f17076L.a();
        e();
    }

    public abstract void d(int i4);

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
        int size = this.f17068C.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry<String, b.AbstractC0098b> entry : this.f17068C.entrySet()) {
            String key = entry.getKey();
            b.AbstractC0098b value = entry.getValue();
            switch (value.a()) {
                case 1:
                    valueOf = Boolean.valueOf(((b.c) value).f17093b);
                    break;
                case 2:
                    valueOf = Integer.valueOf(((b.f) value).f17096b);
                    break;
                case 3:
                    valueOf = Float.valueOf(((b.e) value).f17095b);
                    break;
                case 4:
                    valueOf = Long.valueOf(((b.g) value).f17097b);
                    break;
                case 5:
                    valueOf = Double.valueOf(((b.d) value).f17094b);
                    break;
                case 6:
                    b.i iVar = (b.i) value;
                    if (iVar.f17102f) {
                        valueOf = a(iVar, this.f17089z);
                        break;
                    } else {
                        valueOf = iVar.f17099c;
                        break;
                    }
                case 7:
                    b.a aVar = (b.a) value;
                    if (aVar.f17102f) {
                        valueOf = a(aVar, this.f17089z);
                        break;
                    } else {
                        valueOf = aVar.f17099c;
                        break;
                    }
                case 8:
                    b.h hVar = (b.h) value;
                    if (hVar.f17102f) {
                        valueOf = a(hVar, this.f17089z);
                        break;
                    } else {
                        valueOf = ((b.h) value).f17099c;
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
    public synchronized boolean getBoolean(String str, boolean z6) {
        b.AbstractC0098b abstractC0098b = this.f17068C.get(str);
        if (abstractC0098b != null && abstractC0098b.a() == 1) {
            return ((b.c) abstractC0098b).f17093b;
        }
        return z6;
    }

    @Override // android.content.SharedPreferences
    public synchronized float getFloat(String str, float f2) {
        b.AbstractC0098b abstractC0098b = this.f17068C.get(str);
        if (abstractC0098b != null && abstractC0098b.a() == 3) {
            return ((b.e) abstractC0098b).f17095b;
        }
        return f2;
    }

    @Override // android.content.SharedPreferences
    public synchronized int getInt(String str, int i4) {
        b.AbstractC0098b abstractC0098b = this.f17068C.get(str);
        if (abstractC0098b != null && abstractC0098b.a() == 2) {
            return ((b.f) abstractC0098b).f17096b;
        }
        return i4;
    }

    @Override // android.content.SharedPreferences
    public synchronized long getLong(String str, long j6) {
        b.AbstractC0098b abstractC0098b = this.f17068C.get(str);
        if (abstractC0098b != null && abstractC0098b.a() == 4) {
            return ((b.g) abstractC0098b).f17097b;
        }
        return j6;
    }

    @Override // android.content.SharedPreferences
    public synchronized String getString(String str, String str2) {
        b.AbstractC0098b abstractC0098b = this.f17068C.get(str);
        if (abstractC0098b != null && abstractC0098b.a() == 6) {
            b.i iVar = (b.i) abstractC0098b;
            if (!iVar.f17102f) {
                return (String) iVar.f17099c;
            }
            Object a9 = this.f17077M.a(str);
            if (a9 instanceof String) {
                return (String) a9;
            }
            String a10 = a(iVar, this.f17089z);
            if (a10 != null && !a10.isEmpty()) {
                this.f17077M.a(str, a10);
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
    public synchronized SharedPreferences.Editor putBoolean(String str, boolean z6) {
        try {
            if (this.J) {
                return this;
            }
            h(str);
            g();
            b.AbstractC0098b abstractC0098b = this.f17068C.get(str);
            if (abstractC0098b != null && abstractC0098b.a() != 1) {
                remove(str);
                abstractC0098b = null;
            }
            b.c cVar = (b.c) abstractC0098b;
            if (cVar == null) {
                if (!a(str, (byte) 1)) {
                    return this;
                }
                f fVar = this.f17070E;
                int i4 = fVar.f17122b;
                fVar.a(z6 ? (byte) 1 : (byte) 0);
                i();
                this.f17068C.put(str, new b.c(i4, z6));
                f(str);
            } else if (cVar.f17093b != z6) {
                cVar.f17093b = z6;
                a(z6 ? (byte) 1 : (byte) 0, cVar.f17092a);
                f(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putFloat(String str, float f2) {
        try {
            if (this.J) {
                return this;
            }
            h(str);
            g();
            b.AbstractC0098b abstractC0098b = this.f17068C.get(str);
            if (abstractC0098b != null && abstractC0098b.a() != 3) {
                remove(str);
                abstractC0098b = null;
            }
            b.e eVar = (b.e) abstractC0098b;
            if (eVar == null) {
                if (!a(str, (byte) 3)) {
                    return this;
                }
                f fVar = this.f17070E;
                int i4 = fVar.f17122b;
                fVar.b(a(f2));
                i();
                this.f17068C.put(str, new b.e(i4, f2));
                f(str);
            } else if (eVar.f17095b != f2) {
                eVar.f17095b = f2;
                a(a(f2), (this.f17070E.a(eVar.f17092a) ^ r1) & 4294967295L, eVar.f17092a);
                f(str);
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putInt(String str, int i4) {
        try {
            if (this.J) {
                return this;
            }
            h(str);
            g();
            b.AbstractC0098b abstractC0098b = this.f17068C.get(str);
            if (abstractC0098b != null && abstractC0098b.a() != 2) {
                remove(str);
                abstractC0098b = null;
            }
            b.f fVar = (b.f) abstractC0098b;
            if (fVar == null) {
                if (!a(str, (byte) 2)) {
                    return this;
                }
                f fVar2 = this.f17070E;
                int i6 = fVar2.f17122b;
                com.anythink.core.common.s.a.a.a aVar = this.f17089z;
                fVar2.b(aVar != null ? aVar.c() : i4);
                i();
                this.f17068C.put(str, new b.f(i6, i4));
                f(str);
            } else if (fVar.f17096b != i4) {
                com.anythink.core.common.s.a.a.a aVar2 = this.f17089z;
                int c9 = aVar2 != null ? aVar2.c() : i4;
                int a9 = this.f17089z != null ? this.f17070E.a(fVar.f17092a) : fVar.f17096b;
                fVar.f17096b = i4;
                a(c9, (a9 ^ c9) & 4294967295L, fVar.f17092a);
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
                b.AbstractC0098b abstractC0098b = this.f17068C.get(str);
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
                    f fVar = this.f17070E;
                    int i4 = fVar.f17122b;
                    com.anythink.core.common.s.a.a.a aVar2 = this.f17089z;
                    fVar.a(aVar2 != null ? aVar2.e() : j6);
                    i();
                    this.f17068C.put(str, new b.g(i4, j6));
                    f(str);
                } else if (gVar.f17097b != j6) {
                    com.anythink.core.common.s.a.a.a aVar3 = this.f17089z;
                    long e9 = aVar3 != null ? aVar3.e() : j6;
                    long c9 = (this.f17089z != null ? this.f17070E.c(gVar.f17092a) : gVar.f17097b) ^ e9;
                    gVar.f17097b = j6;
                    aVar = this;
                    aVar.a(e9, c9, gVar.f17092a);
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
                b.AbstractC0098b abstractC0098b = this.f17068C.get(str);
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
                if (iVar != null && !iVar.f17102f && str2.equals(iVar.f17099c)) {
                    return this;
                }
                g();
                if (this.f17089z != null || str2.length() * 3 >= this.f17084q) {
                    byte[] bytes = str2.isEmpty() ? f17046S : str2.getBytes(StandardCharsets.UTF_8);
                    com.anythink.core.common.s.a.a.a aVar = this.f17089z;
                    if (aVar != null) {
                        bytes = aVar.a();
                    }
                    byte[] bArr = bytes;
                    if (bArr == null) {
                        a(new Exception(f17052f));
                        return this;
                    }
                    a(str, str2, bArr, iVar, (byte) 6);
                } else {
                    int b9 = f.b(str2);
                    if (iVar == null) {
                        int b10 = f.b(str);
                        f(b10);
                        int i4 = b10 + 4;
                        this.f17072G = i4 + b9;
                        k();
                        this.f17070E.a((byte) 6);
                        a(str, b10);
                        b(str2, b9);
                        HashMap<String, b.AbstractC0098b> hashMap = this.f17068C;
                        int i6 = this.f17071F;
                        hashMap.put(str, new b.i(i6, i4 + i6, str2, b9, false));
                        i();
                    } else {
                        int i9 = iVar.f17092a;
                        int i10 = i9 - iVar.f17100d;
                        int i11 = iVar.f17101e;
                        boolean z6 = false;
                        if (i11 == b9) {
                            this.f17067B = this.f17070E.b(i9, i11) ^ this.f17067B;
                            if (b9 == str2.length()) {
                                str2.getBytes(0, b9, this.f17070E.f17121a, iVar.f17092a);
                            } else {
                                f fVar = this.f17070E;
                                fVar.f17122b = iVar.f17092a;
                                fVar.a(str2);
                            }
                            this.f17071F = iVar.f17092a;
                            this.f17072G = b9;
                        } else {
                            this.f17072G = i10 + b9;
                            k();
                            this.f17070E.a((byte) 6);
                            int i12 = i10 - 3;
                            f fVar2 = this.f17070E;
                            byte[] bArr2 = fVar2.f17121a;
                            System.arraycopy(bArr2, iVar.f17100d + 1, bArr2, fVar2.f17122b, i12);
                            this.f17070E.f17122b += i12;
                            b(str2, b9);
                            a((byte) 6, iVar.f17100d, iVar.f17092a + iVar.f17101e);
                            r1 = iVar.f17102f ? (String) iVar.f17099c : null;
                            iVar.f17102f = false;
                            int i13 = this.f17071F;
                            iVar.f17100d = i13;
                            iVar.f17092a = i13 + i10;
                            iVar.f17101e = b9;
                            z6 = true;
                        }
                        iVar.f17099c = str2;
                        i();
                        if (z6) {
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
                a(str, (String) set, (com.anythink.core.common.s.a.a.b<String>) k.f17157a);
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
        if (!this.f17082R.contains(onSharedPreferenceChangeListener)) {
            this.f17082R.add(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences
    public synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f17082R.remove(onSharedPreferenceChangeListener);
    }

    public static long a(long j6, int i4) {
        int i6 = (i4 & 7) << 3;
        return (j6 >>> (64 - i6)) | (j6 << i6);
    }

    public static boolean b(int i4) {
        return (i4 & 1073741824) != 0;
    }

    private void k() {
        d(this.f17072G);
        int i4 = this.f17066A;
        this.f17071F = i4;
        this.f17066A = this.f17072G + i4;
        this.f17070E.f17122b = i4;
    }

    public final void c(int i4) {
        ArrayList<C0097a> arrayList = this.f17081Q;
        Collections.sort(arrayList);
        C0097a c0097a = arrayList.get(0);
        int size = arrayList.size();
        boolean z6 = true;
        int i6 = 0;
        for (int i9 = 1; i9 < size; i9++) {
            C0097a c0097a2 = arrayList.get(i9);
            if (c0097a2.f17090a == c0097a.f17091b) {
                c0097a.f17091b = c0097a2.f17091b;
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
        C0097a c0097a3 = this.f17081Q.get(0);
        int i11 = c0097a3.f17090a;
        int i12 = this.f17066A;
        int i13 = i12 - this.f17080P;
        int i14 = i13 - 12;
        int i15 = i13 - i11;
        int i16 = i12 - i11;
        boolean z9 = i14 < i16 + i15;
        if (!z9) {
            this.f17067B ^= this.f17070E.b(i11, i16);
        }
        int size2 = this.f17081Q.size();
        int i17 = size2 - 1;
        int i18 = this.f17066A - this.f17081Q.get(i17).f17091b;
        int i19 = i18 > 0 ? size2 : i17;
        int[] iArr = new int[i19];
        int[] iArr2 = new int[i19];
        int i20 = c0097a3.f17090a;
        int i21 = c0097a3.f17091b;
        int i22 = 1;
        while (i22 < size2) {
            boolean z10 = z6;
            C0097a c0097a4 = this.f17081Q.get(i22);
            int i23 = i22;
            int i24 = c0097a4.f17090a - i21;
            int i25 = size2;
            byte[] bArr = this.f17070E.f17121a;
            System.arraycopy(bArr, i21, bArr, i20, i24);
            int i26 = i23 - 1;
            iArr[i26] = i21;
            iArr2[i26] = i21 - i20;
            i20 += i24;
            i21 = c0097a4.f17091b;
            i22 = i23 + 1;
            z6 = z10;
            size2 = i25;
        }
        if (i18 > 0) {
            byte[] bArr2 = this.f17070E.f17121a;
            System.arraycopy(bArr2, i21, bArr2, i20, i18);
            iArr[i17] = i21;
            iArr2[i17] = i21 - i20;
        }
        e();
        if (z9) {
            this.f17067B = this.f17070E.b(12, i14);
        } else {
            this.f17067B ^= this.f17070E.b(i11, i15);
        }
        this.f17066A = i13;
        a(i11, i4, i15);
        for (b.AbstractC0098b abstractC0098b : this.f17068C.values()) {
            int i27 = abstractC0098b.f17092a;
            if (i27 > i11) {
                int i28 = i19 - 1;
                int i29 = 0;
                while (true) {
                    if (i29 > i28) {
                        break;
                    }
                    int i30 = (i29 + i28) >>> 1;
                    int i31 = iArr[i30];
                    if (i31 >= i27) {
                        if (i31 <= i27) {
                            i28 = i30;
                            break;
                        }
                        i28 = i30 - 1;
                    } else {
                        i29 = i30 + 1;
                    }
                }
                int i32 = iArr2[i28];
                abstractC0098b.f17092a -= i32;
                if (abstractC0098b.a() >= 6) {
                    ((b.j) abstractC0098b).f17100d -= i32;
                }
            }
        }
        c(f17054h);
    }

    public final void e() {
        this.f17080P = 0;
        this.f17081Q.clear();
    }

    public final int f() {
        if (this.f17066A <= 16384) {
            return f17064t;
        }
        return 16384;
    }

    public final int a(int i4) {
        return this.f17089z == null ? i4 : i4 | 1073741824;
    }

    public final void b() {
        try {
            l.c(new File(this.f17085v, this.f17086w + f17056k));
            l.c(new File(this.f17085v, this.f17086w + f17057l));
        } catch (Exception e9) {
            a(e9);
        }
    }

    public static int a(int i4, int i6) {
        if (i6 < f17058m) {
            int i9 = f17062r;
            if (i6 <= i9) {
                return i9;
            }
            while (i4 < i6) {
                i4 <<= 1;
            }
            return i4;
        }
        throw new IllegalStateException("data size out of limit");
    }

    public final synchronized void e(String str) {
        if (this.f17082R.isEmpty()) {
            return;
        }
        Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = this.f17082R.iterator();
        while (it.hasNext()) {
            this.f17083T.post(new androidx.emoji2.text.k(3, this, it.next(), str));
        }
    }

    private int j(String str) {
        return getInt(str, 0);
    }

    private void b(int i4, int i6) {
        this.f17080P = (i6 - i4) + this.f17080P;
        this.f17081Q.add(new C0097a(i4, i6));
    }

    public final void a() {
        com.anythink.core.common.s.a.a.b bVar;
        com.anythink.core.common.s.a.a.b[] bVarArr = (com.anythink.core.common.s.a.a.b[]) this.f17087x.values().toArray(new com.anythink.core.common.s.a.a.b[this.f17087x.size()]);
        String str = "temp_" + this.f17086w;
        g gVar = new g(this.f17085v, str, bVarArr, this.f17089z, 2);
        gVar.f17128V = false;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b.AbstractC0098b> entry : this.f17068C.entrySet()) {
            String key = entry.getKey();
            b.AbstractC0098b value = entry.getValue();
            if (value instanceof b.i) {
                b.i iVar = (b.i) value;
                if (iVar.f17102f) {
                    arrayList.add((String) iVar.f17099c);
                    String a9 = a(iVar, (com.anythink.core.common.s.a.a.a) null);
                    if (a9 != null) {
                        gVar.putString(key, a9);
                    }
                } else {
                    gVar.putString(key, (String) iVar.f17099c);
                }
            } else if (value instanceof b.c) {
                gVar.putBoolean(key, ((b.c) value).f17093b);
            } else if (value instanceof b.f) {
                gVar.putInt(key, ((b.f) value).f17096b);
            } else if (value instanceof b.g) {
                gVar.putLong(key, ((b.g) value).f17097b);
            } else if (value instanceof b.e) {
                gVar.putFloat(key, ((b.e) value).f17095b);
            } else if (value instanceof b.d) {
                gVar.b(key, ((b.d) value).f17094b);
            } else if (value instanceof b.a) {
                b.a aVar = (b.a) value;
                if (aVar.f17102f) {
                    arrayList.add((String) aVar.f17099c);
                    byte[] a10 = a(aVar, (com.anythink.core.common.s.a.a.a) null);
                    if (a10 != null) {
                        gVar.a(key, a10);
                    }
                } else {
                    gVar.a(key, (byte[]) aVar.f17099c);
                }
            } else if (value instanceof b.h) {
                b.h hVar = (b.h) value;
                if (hVar.f17102f) {
                    arrayList.add((String) hVar.f17099c);
                    Object a11 = a(hVar, (com.anythink.core.common.s.a.a.a) null);
                    if (a11 != null && (bVar = hVar.f17098b) != null) {
                        gVar.a(key, (String) a11, (com.anythink.core.common.s.a.a.b<String>) bVar);
                    }
                } else {
                    com.anythink.core.common.s.a.a.b bVar2 = hVar.f17098b;
                    if (bVar2 != null) {
                        gVar.a(key, (String) hVar.f17099c, (com.anythink.core.common.s.a.a.b<String>) bVar2);
                    }
                }
            }
        }
        gVar.contains("");
        this.f17070E = gVar.f17070E;
        this.f17067B = gVar.f17067B;
        this.f17066A = gVar.f17066A;
        e();
        this.f17068C.clear();
        this.f17068C.putAll(gVar.f17068C);
        a(gVar);
        while (gVar.f17078N.a()) {
            try {
                Thread.sleep(10L);
            } catch (Exception unused) {
            }
        }
        File file = new File(this.f17085v, str);
        String str2 = this.f17085v + this.f17086w;
        l.a(file, str2);
        l.c(file);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l.c(new File(str2, (String) it.next()));
        }
        this.f17074I = false;
    }

    public final synchronized <T> T d(String str) {
        b.AbstractC0098b abstractC0098b = this.f17068C.get(str);
        if (abstractC0098b != null && abstractC0098b.a() == 8) {
            b.h hVar = (b.h) abstractC0098b;
            if (hVar.f17102f) {
                T t6 = (T) this.f17077M.a(str);
                if (t6 != null) {
                    return t6;
                }
                T t9 = (T) a(hVar, this.f17089z);
                if (t9 == null) {
                    remove(str);
                    return null;
                }
                this.f17077M.a(str, t9);
                return t9;
            }
            return (T) hVar.f17099c;
        }
        return null;
    }

    public final void b(String str) {
        com.anythink.core.common.s.a.a.c cVar = this.f17088y;
        if (cVar != null) {
            cVar.b(this.f17086w, new Exception(str));
        }
    }

    public final void b(Exception exc) {
        com.anythink.core.common.s.a.a.c cVar = this.f17088y;
        if (cVar != null) {
            cVar.a(this.f17086w, exc);
        }
    }

    private synchronized byte[] b(String str, byte[] bArr) {
        b.AbstractC0098b abstractC0098b = this.f17068C.get(str);
        if (abstractC0098b != null && abstractC0098b.a() == 7) {
            b.a aVar = (b.a) abstractC0098b;
            if (aVar.f17102f) {
                Object a9 = this.f17077M.a(str);
                if (a9 instanceof byte[]) {
                    return (byte[]) a9;
                }
                byte[] a10 = a(aVar, this.f17089z);
                if (a10 != null && a10.length != 0) {
                    this.f17077M.a(str, a10);
                    return a10;
                }
                remove(str);
                return bArr;
            }
            return (byte[]) aVar.f17099c;
        }
        return bArr;
    }

    public final synchronized SharedPreferences.Editor b(String str, double d9) {
        Throwable th;
        a aVar;
        try {
            try {
                if (this.J) {
                    return this;
                }
                h(str);
                g();
                b.AbstractC0098b abstractC0098b = this.f17068C.get(str);
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
                    f fVar = this.f17070E;
                    int i4 = fVar.f17122b;
                    fVar.a(a(d9));
                    i();
                    this.f17068C.put(str, new b.d(i4, d9));
                    f(str);
                } else if (dVar.f17094b != d9) {
                    long a9 = a(d9);
                    long c9 = a9 ^ this.f17070E.c(dVar.f17092a);
                    dVar.f17094b = d9;
                    aVar = this;
                    aVar.a(a9, c9, dVar.f17092a);
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
        com.anythink.core.common.s.a.a.c cVar = this.f17088y;
        if (cVar != null) {
            cVar.a(this.f17086w, str);
        }
    }

    private void b(String str, int i4) {
        this.f17070E.a((short) i4);
        if (i4 == str.length()) {
            f fVar = this.f17070E;
            str.getBytes(0, i4, fVar.f17121a, fVar.f17122b);
        } else {
            this.f17070E.a(str);
        }
    }

    private int b(String str, byte[] bArr, byte b9) {
        if (!a(str, b9, bArr.length + 2)) {
            return 0;
        }
        this.f17070E.a((short) bArr.length);
        f fVar = this.f17070E;
        int i4 = fVar.f17122b;
        fVar.a(bArr);
        return i4;
    }

    public final boolean a(File file) {
        long length = file.length();
        if (length != 0 && length < 268435456) {
            int i4 = (int) length;
            int a9 = a(f17062r, i4);
            f fVar = this.f17070E;
            if (fVar != null && fVar.f17121a.length == a9) {
                fVar.f17122b = 0;
            } else {
                fVar = new f(new byte[a9]);
                this.f17070E = fVar;
            }
            l.a(file, fVar.f17121a, i4);
            int c9 = fVar.c();
            if (c9 < 0) {
                return false;
            }
            int i6 = (-1073741825) & c9;
            boolean b9 = b(c9);
            long d9 = fVar.d();
            this.f17066A = i6 + 12;
            if (i6 >= 0 && i6 <= i4 - 12 && d9 == fVar.b(12, i6) && a(b9)) {
                this.f17067B = d9;
                return true;
            }
        }
        return false;
    }

    public final void a(String str) {
        h.a().execute(new o(1, this, str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x01cb, code lost:
    
        throw new java.lang.Exception(com.anythink.core.common.s.a.a.f17048b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z6) {
        int length;
        f fVar;
        Object obj;
        boolean z9 = false;
        if (z6 && this.f17089z == null) {
            b(f17051e);
            return false;
        }
        com.anythink.core.common.s.a.a.a aVar = z6 ? this.f17089z : null;
        f fVar2 = this.f17070E;
        fVar2.f17122b = 12;
        while (true) {
            try {
                int i4 = fVar2.f17122b;
                int i6 = this.f17066A;
                boolean z10 = true;
                if (i4 >= i6) {
                    if (i4 != i6) {
                        a(new Exception(f17048b));
                        return false;
                    }
                    if (!z6 && this.f17089z != null && i6 != 12) {
                        z9 = true;
                    }
                    this.f17074I = z9;
                    return true;
                }
                byte a9 = fVar2.a();
                byte b9 = (byte) (a9 & c.f17105c);
                if (b9 <= 0 || b9 > 8) {
                    break;
                }
                int a10 = fVar2.a() & 255;
                if (a10 == 0) {
                    throw new IllegalStateException("invalid key size");
                }
                if (a9 < 0) {
                    fVar2.f17122b += a10;
                    int b10 = fVar2.f17122b + (b9 <= 5 ? f17060o[b9] : fVar2.b() & 65535);
                    fVar2.f17122b = b10;
                    b(i4, b10);
                } else {
                    String a11 = fVar2.a(aVar, a10);
                    int i9 = fVar2.f17122b;
                    if (b9 > 5) {
                        int b11 = fVar2.b() & 65535;
                        boolean z11 = (a9 & c.f17104b) != 0;
                        if (z11 && b11 != 32) {
                            throw new IllegalStateException("name size not match");
                        }
                        if (b9 == 6) {
                            this.f17068C.put(a11, new b.i(i4, i9 + 2, z11 ? fVar2.d(b11) : fVar2.a(aVar, b11), b11, z11));
                        } else if (b9 == 7) {
                            if (z11) {
                                obj = fVar2.d(b11);
                            } else {
                                obj = new byte[b11];
                                System.arraycopy(fVar2.f17121a, fVar2.f17122b, obj, 0, b11);
                                fVar2.f17122b += b11;
                                if (aVar != null) {
                                    obj = aVar.b();
                                }
                            }
                            this.f17068C.put(a11, new b.a(i4, i9 + 2, obj, b11, z11));
                        } else if (z11) {
                            this.f17068C.put(a11, new b.h(i4, i9 + 2, fVar2.d(b11), b11, true));
                        } else {
                            if (aVar == null) {
                                fVar = this.f17070E;
                                length = b11;
                            } else {
                                f fVar3 = this.f17070E;
                                System.arraycopy(fVar3.f17121a, fVar3.f17122b, new byte[b11], 0, b11);
                                byte[] b12 = aVar.b();
                                f fVar4 = new f(b12);
                                length = b12.length;
                                fVar = fVar4;
                            }
                            int a12 = fVar.a() & 255;
                            String d9 = fVar.d(a12);
                            com.anythink.core.common.s.a.a.b bVar = this.f17087x.get(d9);
                            int i10 = length - (a12 + 1);
                            if (i10 >= 0) {
                                if (bVar != null) {
                                    try {
                                        b.h hVar = new b.h(i4, i9 + 2, bVar.a(fVar.f17121a, fVar.f17122b, i10), b11, false);
                                        hVar.f17098b = bVar;
                                        this.f17068C.put(a11, hVar);
                                    } catch (Exception e9) {
                                        a(e9);
                                    }
                                } else {
                                    b("object with tag: " + d9 + " without encoder");
                                }
                                fVar2.f17122b = i9 + 2 + b11;
                            } else {
                                throw new Exception(f17048b);
                            }
                        }
                    } else if (b9 == 1) {
                        HashMap<String, b.AbstractC0098b> hashMap = this.f17068C;
                        if (fVar2.a() != 1) {
                            z10 = false;
                        }
                        hashMap.put(a11, new b.c(i9, z10));
                    } else if (b9 == 2) {
                        this.f17068C.put(a11, new b.f(i9, fVar2.a(aVar)));
                    } else if (b9 == 3) {
                        this.f17068C.put(a11, new b.e(i9, Float.intBitsToFloat(fVar2.a(aVar))));
                    } else if (b9 != 4) {
                        this.f17068C.put(a11, new b.d(i9, Double.longBitsToDouble(fVar2.b(aVar))));
                    } else {
                        this.f17068C.put(a11, new b.g(i9, fVar2.b(aVar)));
                    }
                }
            } catch (Exception e10) {
                a(e10);
                return false;
            }
        }
    }

    private void a(int i4, String str, int i6, int i9, com.anythink.core.common.s.a.a.a aVar) {
        int length;
        f fVar;
        if (aVar == null) {
            fVar = this.f17070E;
            length = i4;
        } else {
            f fVar2 = this.f17070E;
            System.arraycopy(fVar2.f17121a, fVar2.f17122b, new byte[i4], 0, i4);
            byte[] b9 = aVar.b();
            f fVar3 = new f(b9);
            length = b9.length;
            fVar = fVar3;
        }
        int a9 = fVar.a() & 255;
        String d9 = fVar.d(a9);
        com.anythink.core.common.s.a.a.b bVar = this.f17087x.get(d9);
        int i10 = length - (a9 + 1);
        if (i10 < 0) {
            throw new Exception(f17048b);
        }
        if (bVar != null) {
            try {
                b.h hVar = new b.h(i6, i9 + 2, bVar.a(fVar.f17121a, fVar.f17122b, i10), i4, false);
                hVar.f17098b = bVar;
                this.f17068C.put(str, hVar);
                return;
            } catch (Exception e9) {
                a(e9);
                return;
            }
        }
        b("object with tag: " + d9 + " without encoder");
    }

    private static void a(ArrayList<C0097a> arrayList) {
        Collections.sort(arrayList);
        int i4 = 0;
        C0097a c0097a = arrayList.get(0);
        int size = arrayList.size();
        for (int i6 = 1; i6 < size; i6++) {
            C0097a c0097a2 = arrayList.get(i6);
            if (c0097a2.f17090a == c0097a.f17091b) {
                c0097a.f17091b = c0097a2.f17091b;
            } else {
                i4++;
                if (i4 != i6) {
                    arrayList.set(i4, c0097a2);
                }
                c0097a = c0097a2;
            }
        }
        int i9 = i4 + 1;
        if (size > i9) {
            arrayList.subList(i9, size).clear();
        }
    }

    private void a(int i4, int[] iArr, int[] iArr2) {
        for (b.AbstractC0098b abstractC0098b : this.f17068C.values()) {
            int i6 = abstractC0098b.f17092a;
            if (i6 > i4) {
                int length = iArr.length - 1;
                int i9 = 0;
                while (true) {
                    if (i9 > length) {
                        break;
                    }
                    int i10 = (i9 + length) >>> 1;
                    int i11 = iArr[i10];
                    if (i11 >= i6) {
                        if (i11 <= i6) {
                            length = i10;
                            break;
                        }
                        length = i10 - 1;
                    } else {
                        i9 = i10 + 1;
                    }
                }
                int i12 = iArr2[length];
                abstractC0098b.f17092a -= i12;
                if (abstractC0098b.a() >= 6) {
                    ((b.j) abstractC0098b).f17100d -= i12;
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
        com.anythink.core.common.s.a.a.c cVar = this.f17088y;
        if (cVar != null) {
            cVar.b(this.f17086w, exc);
        }
    }

    public final synchronized double a(String str, double d9) {
        b.AbstractC0098b abstractC0098b = this.f17068C.get(str);
        if (abstractC0098b != null && abstractC0098b.a() == 5) {
            return ((b.d) abstractC0098b).f17094b;
        }
        return d9;
    }

    private String a(b.i iVar, com.anythink.core.common.s.a.a.a aVar) {
        String str = (String) iVar.f17099c;
        byte[] bArr = (byte[]) this.f17076L.a(str);
        if (bArr == null) {
            try {
                bArr = l.b(new File(this.f17085v + this.f17086w, str));
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
        String str = (String) aVar.f17099c;
        byte[] bArr = (byte[]) this.f17076L.a(str);
        if (bArr == null) {
            try {
                bArr = l.b(new File(this.f17085v + this.f17086w, str));
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
        String str = (String) hVar.f17099c;
        byte[] bArr = (byte[]) this.f17076L.a(str);
        if (bArr == null) {
            try {
                bArr = l.b(new File(this.f17085v + this.f17086w, str));
            } catch (Exception e9) {
                a(e9);
                return null;
            }
        }
        if (bArr != null) {
            if (aVar != null) {
                bArr = aVar.b();
            }
            int i4 = bArr[0] & 255;
            String a9 = this.f17070E.a(bArr, 1, i4);
            com.anythink.core.common.s.a.a.b bVar = this.f17087x.get(a9);
            if (bVar != null) {
                hVar.f17098b = bVar;
                int i6 = i4 + 1;
                return bVar.a(bArr, i6, bArr.length - i6);
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
            int i4 = b10 + 4;
            this.f17072G = i4 + b9;
            k();
            this.f17070E.a((byte) 6);
            a(str, b10);
            b(str2, b9);
            HashMap<String, b.AbstractC0098b> hashMap = this.f17068C;
            int i6 = this.f17071F;
            hashMap.put(str, new b.i(i6, i4 + i6, str2, b9, false));
            i();
            return;
        }
        int i9 = iVar.f17092a;
        int i10 = i9 - iVar.f17100d;
        int i11 = iVar.f17101e;
        boolean z6 = false;
        if (i11 == b9) {
            this.f17067B = this.f17070E.b(i9, i11) ^ this.f17067B;
            if (b9 == str2.length()) {
                str2.getBytes(0, b9, this.f17070E.f17121a, iVar.f17092a);
            } else {
                f fVar = this.f17070E;
                fVar.f17122b = iVar.f17092a;
                fVar.a(str2);
            }
            this.f17071F = iVar.f17092a;
            this.f17072G = b9;
        } else {
            this.f17072G = i10 + b9;
            k();
            this.f17070E.a((byte) 6);
            int i12 = i10 - 3;
            f fVar2 = this.f17070E;
            byte[] bArr = fVar2.f17121a;
            System.arraycopy(bArr, iVar.f17100d + 1, bArr, fVar2.f17122b, i12);
            this.f17070E.f17122b += i12;
            b(str2, b9);
            a((byte) 6, iVar.f17100d, iVar.f17092a + iVar.f17101e);
            r2 = iVar.f17102f ? (String) iVar.f17099c : null;
            iVar.f17102f = false;
            int i13 = this.f17071F;
            iVar.f17100d = i13;
            iVar.f17092a = i13 + i10;
            iVar.f17101e = b9;
            z6 = true;
        }
        iVar.f17099c = str2;
        i();
        if (z6) {
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
                        b.AbstractC0098b abstractC0098b = this.f17068C.get(str);
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
                        com.anythink.core.common.s.a.a.a aVar3 = this.f17089z;
                        byte[] a10 = aVar3 != null ? aVar3.a() : bArr;
                        if (a10 == null) {
                            a(new Exception(f17052f));
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
                        if (!this.f17087x.containsKey(a9)) {
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
                            b.AbstractC0098b abstractC0098b2 = this.f17068C.get(str);
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
                            byte[] bArr2 = fVar.f17121a;
                            com.anythink.core.common.s.a.a.a aVar = this.f17089z;
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
        return a(str, b9, f17060o[b9]);
    }

    private boolean a(String str, byte b9, int i4) {
        com.anythink.core.common.s.a.a.a aVar = this.f17089z;
        if (aVar != null) {
            str.getBytes(StandardCharsets.UTF_8);
            byte[] a9 = aVar.a();
            if (a9 == null) {
                a(new Exception(f17052f));
                return false;
            }
            int length = a9.length;
            a(length, i4, b9);
            this.f17070E.a((byte) length);
            f fVar = this.f17070E;
            System.arraycopy(a9, 0, fVar.f17121a, fVar.f17122b, length);
            this.f17070E.f17122b += length;
            return true;
        }
        int b10 = f.b(str);
        a(b10, i4, b9);
        a(str, b10);
        return true;
    }

    private void a(int i4, int i6, byte b9) {
        f(i4);
        this.f17072G = i4 + 2 + i6;
        k();
        this.f17070E.a(b9);
    }

    private void a(String str, int i4) {
        this.f17070E.a((byte) i4);
        if (i4 == str.length()) {
            f fVar = this.f17070E;
            str.getBytes(0, i4, fVar.f17121a, fVar.f17122b);
            this.f17070E.f17122b += i4;
            return;
        }
        this.f17070E.a(str);
    }

    public void a(byte b9, int i4, int i6) {
        b(i4, i6);
        byte b10 = (byte) (b9 | c.f17103a);
        byte[] bArr = this.f17070E.f17121a;
        this.f17067B = (((bArr[i4] ^ b10) & 255) << ((i4 & 7) << 3)) ^ this.f17067B;
        bArr[i4] = b10;
    }

    public void a(int i4, byte[] bArr) {
        int length = bArr.length;
        this.f17067B ^= this.f17070E.b(i4, length);
        f fVar = this.f17070E;
        fVar.f17122b = i4;
        fVar.a(bArr);
        this.f17067B = this.f17070E.b(i4, length) ^ this.f17067B;
    }

    private int a(float f2) {
        int floatToRawIntBits = Float.floatToRawIntBits(f2);
        com.anythink.core.common.s.a.a.a aVar = this.f17089z;
        return aVar != null ? aVar.c() : floatToRawIntBits;
    }

    private long a(double d9) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d9);
        com.anythink.core.common.s.a.a.a aVar = this.f17089z;
        return aVar != null ? aVar.e() : doubleToRawLongBits;
    }

    private void a(String str, Object obj, byte[] bArr, b.j jVar, byte b9) {
        if (jVar == null) {
            a(str, obj, bArr, b9);
        } else if (!jVar.f17102f && jVar.f17101e == bArr.length) {
            a(jVar.f17092a, bArr);
            jVar.f17099c = obj;
        } else {
            a(str, obj, bArr, jVar);
        }
    }

    private void a(String str, Object obj, byte[] bArr, byte b9) {
        int length;
        b.AbstractC0098b hVar;
        int a9 = a(str, bArr, b9);
        if (a9 > 0) {
            boolean z6 = this.f17075K != null;
            if (z6) {
                this.f17077M.a(str, obj);
                obj = this.f17075K;
                this.f17075K = null;
                length = 32;
            } else {
                length = bArr.length;
            }
            Object obj2 = obj;
            int i4 = length;
            if (b9 == 6) {
                hVar = new b.i(this.f17071F, a9, (String) obj2, i4, z6);
            } else if (b9 == 7) {
                hVar = new b.a(this.f17071F, a9, obj2, i4, z6);
            } else {
                hVar = new b.h(this.f17071F, a9, obj2, i4, z6);
            }
            this.f17068C.put(str, hVar);
            i();
        }
    }

    private void a(String str, Object obj, byte[] bArr, b.j jVar) {
        int a9 = a(str, bArr, jVar.a());
        if (a9 > 0) {
            String str2 = jVar.f17102f ? (String) jVar.f17099c : null;
            a(jVar.a(), jVar.f17100d, jVar.f17092a + jVar.f17101e);
            boolean z6 = this.f17075K != null;
            jVar.f17100d = this.f17071F;
            jVar.f17092a = a9;
            jVar.f17102f = z6;
            if (z6) {
                this.f17077M.a(str, obj);
                jVar.f17099c = this.f17075K;
                jVar.f17101e = 32;
                this.f17075K = null;
            } else {
                jVar.f17099c = obj;
                jVar.f17101e = bArr.length;
            }
            i();
            h();
            if (str2 != null) {
                g(str2);
            }
        }
    }

    private int a(final String str, final byte[] bArr, byte b9) {
        this.f17075K = null;
        if (bArr.length < this.f17084q) {
            return b(str, bArr, b9);
        }
        StringBuilder l9 = Wv.l("Large value, key: ", str, ", size: ");
        l9.append(bArr.length);
        c(l9.toString());
        final String a9 = l.a();
        byte[] bArr2 = new byte[32];
        a9.getBytes(0, 32, bArr2, 0);
        int b10 = b(str, bArr2, (byte) (b9 | c.f17104b));
        if (b10 > 0) {
            this.f17076L.a(a9, bArr);
            this.f17078N.a(a9, new e.a() { // from class: com.anythink.core.common.s.a.n
                @Override // com.anythink.core.common.s.a.e.a
                public final void execute(AtomicBoolean atomicBoolean) {
                    a.this.a(a9, bArr, str, atomicBoolean);
                }
            });
            this.f17075K = a9;
        }
        return b10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, byte[] bArr, String str2, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.get()) {
            return;
        }
        if (l.a(new File(this.f17085v + this.f17086w, str), bArr, atomicBoolean)) {
            return;
        }
        c("Write large value with key:" + str2 + " failed");
    }
}
