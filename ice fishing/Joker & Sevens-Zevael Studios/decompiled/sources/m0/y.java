package m0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y implements u {
    public int A;

    /* renamed from: g, reason: collision with root package name */
    public final v f4813g;

    /* renamed from: h, reason: collision with root package name */
    public final a5.c f4814h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f4815i = new AtomicReference(null);

    /* renamed from: j, reason: collision with root package name */
    public final Object f4816j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final s.j0 f4817k;

    /* renamed from: l, reason: collision with root package name */
    public final j2 f4818l;

    /* renamed from: m, reason: collision with root package name */
    public final s.g0 f4819m;

    /* renamed from: n, reason: collision with root package name */
    public final s.h0 f4820n;

    /* renamed from: o, reason: collision with root package name */
    public final s.h0 f4821o;

    /* renamed from: p, reason: collision with root package name */
    public final s.g0 f4822p;

    /* renamed from: q, reason: collision with root package name */
    public final n0.a f4823q;

    /* renamed from: r, reason: collision with root package name */
    public final n0.a f4824r;

    /* renamed from: s, reason: collision with root package name */
    public final s.g0 f4825s;

    /* renamed from: t, reason: collision with root package name */
    public s.g0 f4826t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4827u;

    /* renamed from: v, reason: collision with root package name */
    public y f4828v;

    /* renamed from: w, reason: collision with root package name */
    public int f4829w;

    /* renamed from: x, reason: collision with root package name */
    public final f8.c f4830x;

    /* renamed from: y, reason: collision with root package name */
    public final x4.q f4831y;

    /* renamed from: z, reason: collision with root package name */
    public final r f4832z;

    public y(v vVar, a5.c cVar) {
        this.f4813g = vVar;
        this.f4814h = cVar;
        s.j0 j0Var = new s.j0(new s.h0());
        this.f4817k = j0Var;
        j2 j2Var = new j2();
        if (vVar.c()) {
            j2Var.f4641q = new s.u();
        }
        if (vVar.e()) {
            j2Var.b();
        }
        this.f4818l = j2Var;
        this.f4819m = v6.a.p();
        this.f4820n = new s.h0();
        this.f4821o = new s.h0();
        this.f4822p = v6.a.p();
        n0.a aVar = new n0.a();
        this.f4823q = aVar;
        n0.a aVar2 = new n0.a();
        this.f4824r = aVar2;
        this.f4825s = v6.a.p();
        this.f4826t = v6.a.p();
        f8.c cVar2 = new f8.c(28, vVar);
        this.f4830x = cVar2;
        this.f4831y = new x4.q();
        r rVar = new r(cVar, vVar, j2Var, j0Var, aVar, aVar2, cVar2, this);
        vVar.m(rVar);
        this.f4832z = rVar;
        int i10 = i.f4609a;
    }

    public final void A(oc.e eVar) {
        boolean i10 = i();
        p();
        v vVar = this.f4813g;
        if (!i10) {
            vVar.a(this, eVar);
            return;
        }
        r rVar = this.f4832z;
        rVar.f4746z = 100;
        rVar.f4745y = true;
        vVar.a(this, eVar);
        rVar.u();
    }

    public final void a() {
        this.f4815i.set(null);
        this.f4823q.f4978d.J();
        this.f4824r.f4978d.J();
        s.j0 j0Var = this.f4817k;
        if (j0Var.f6293g.g()) {
            return;
        }
        x4.q qVar = this.f4831y;
        try {
            qVar.m(j0Var, this.f4832z.A());
            qVar.b();
        } finally {
            qVar.a();
        }
    }

    public final void b(Object obj, boolean z10) {
        int i10;
        Object g8 = this.f4819m.g(obj);
        if (g8 == null) {
            return;
        }
        boolean z11 = g8 instanceof s.h0;
        t0 t0Var = t0.f4763g;
        s.h0 h0Var = this.f4820n;
        s.h0 h0Var2 = this.f4821o;
        s.g0 g0Var = this.f4825s;
        if (!z11) {
            x1 x1Var = (x1) g8;
            if (v6.a.O(g0Var, obj, x1Var) || x1Var.c(obj) == t0Var) {
                return;
            }
            if (x1Var.f4812g == null || z10) {
                h0Var.a(x1Var);
                return;
            } else {
                h0Var2.a(x1Var);
                return;
            }
        }
        s.h0 h0Var3 = (s.h0) g8;
        Object[] objArr = h0Var3.f6275b;
        long[] jArr = h0Var3.f6274a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j3 = jArr[i11];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((j3 & 255) < 128) {
                        x1 x1Var2 = (x1) objArr[(i11 << 3) + i14];
                        if (!v6.a.O(g0Var, obj, x1Var2)) {
                            i10 = i12;
                            if (x1Var2.c(obj) != t0Var) {
                                if (x1Var2.f4812g == null || z10) {
                                    h0Var.a(x1Var2);
                                } else {
                                    h0Var2.a(x1Var2);
                                }
                            }
                            j3 >>= i10;
                            i14++;
                            i12 = i10;
                        }
                    }
                    i10 = i12;
                    j3 >>= i10;
                    i14++;
                    i12 = i10;
                }
                if (i13 != i12) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void c(Set set, boolean z10) {
        long j3;
        long j6;
        long j10;
        char c3;
        int i10;
        long[] jArr;
        long[] jArr2;
        long j11;
        boolean c7;
        long[] jArr3;
        long j12;
        long[] jArr4;
        long[] jArr5;
        int i11;
        long j13;
        boolean z11;
        int i12;
        long j14;
        long[] jArr6;
        long[] jArr7;
        char c10;
        long j15;
        int i13;
        int i14;
        long[] jArr8;
        boolean z12 = set instanceof o0.h;
        s.g0 g0Var = this.f4822p;
        Object obj = null;
        int i15 = 8;
        if (z12) {
            s.h0 h0Var = ((o0.h) set).f5148g;
            Object[] objArr = h0Var.f6275b;
            long[] jArr9 = h0Var.f6274a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i16 = 0;
                j3 = 128;
                j6 = 255;
                while (true) {
                    long j16 = jArr9[i16];
                    char c11 = 7;
                    j10 = -9187201950435737472L;
                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((j16 & 255) < 128) {
                                Object obj2 = objArr[(i16 << 3) + i18];
                                c10 = c11;
                                if (obj2 instanceof x1) {
                                    ((x1) obj2).c(obj);
                                } else {
                                    b(obj2, z10);
                                    Object g8 = g0Var.g(obj2);
                                    if (g8 != null) {
                                        if (g8 instanceof s.h0) {
                                            s.h0 h0Var2 = (s.h0) g8;
                                            Object[] objArr2 = h0Var2.f6275b;
                                            long[] jArr10 = h0Var2.f6274a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i19 = i15;
                                                i13 = length;
                                                int i20 = 0;
                                                while (true) {
                                                    long j17 = jArr10[i20];
                                                    j15 = j16;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j17) << c10) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                                        int i22 = 0;
                                                        while (i22 < i21) {
                                                            if ((j17 & 255) < 128) {
                                                                jArr8 = jArr9;
                                                                b((i0) objArr2[(i20 << 3) + i22], z10);
                                                            } else {
                                                                jArr8 = jArr9;
                                                            }
                                                            j17 >>= i19;
                                                            i22++;
                                                            jArr9 = jArr8;
                                                        }
                                                        jArr7 = jArr9;
                                                        if (i21 != i19) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr9;
                                                    }
                                                    if (i20 == length2) {
                                                        break;
                                                    }
                                                    i20++;
                                                    jArr10 = jArr11;
                                                    j16 = j15;
                                                    jArr9 = jArr7;
                                                    i19 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr9;
                                            j15 = j16;
                                            i13 = length;
                                            b((i0) g8, z10);
                                        }
                                        i14 = 8;
                                    }
                                }
                                jArr7 = jArr9;
                                j15 = j16;
                                i13 = length;
                                i14 = 8;
                            } else {
                                jArr7 = jArr9;
                                c10 = c11;
                                j15 = j16;
                                i13 = length;
                                i14 = i15;
                            }
                            j16 = j15 >> i14;
                            i18++;
                            length = i13;
                            i15 = i14;
                            c11 = c10;
                            jArr9 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr9;
                        c3 = c11;
                        int i23 = length;
                        if (i17 != i15) {
                            break;
                        } else {
                            length = i23;
                        }
                    } else {
                        jArr6 = jArr9;
                        c3 = 7;
                    }
                    if (i16 == length) {
                        break;
                    }
                    i16++;
                    jArr9 = jArr6;
                    obj = null;
                    i15 = 8;
                }
            } else {
                j3 = 128;
                j6 = 255;
                j10 = -9187201950435737472L;
                c3 = 7;
            }
        } else {
            j3 = 128;
            j6 = 255;
            j10 = -9187201950435737472L;
            c3 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof x1) {
                    ((x1) obj3).c(null);
                } else {
                    b(obj3, z10);
                    Object g10 = g0Var.g(obj3);
                    if (g10 != null) {
                        if (g10 instanceof s.h0) {
                            s.h0 h0Var3 = (s.h0) g10;
                            Object[] objArr3 = h0Var3.f6275b;
                            long[] jArr12 = h0Var3.f6274a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j18 = jArr12[i10];
                                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i24 = 8 - ((~(i10 - length3)) >>> 31);
                                        for (int i25 = 0; i25 < i24; i25++) {
                                            if ((j18 & 255) < 128) {
                                                b((i0) objArr3[(i10 << 3) + i25], z10);
                                            }
                                            j18 >>= 8;
                                        }
                                        if (i24 != 8) {
                                            break;
                                        }
                                    }
                                    i10 = i10 != length3 ? i10 + 1 : 0;
                                }
                            }
                        } else {
                            b((i0) g10, z10);
                        }
                    }
                }
            }
        }
        s.g0 g0Var2 = this.f4819m;
        s.h0 h0Var4 = this.f4820n;
        if (z10) {
            s.h0 h0Var5 = this.f4821o;
            if (h0Var5.h()) {
                long[] jArr13 = g0Var2.f6266a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i26 = 0;
                    while (true) {
                        long j19 = jArr13[i26];
                        if ((((~j19) << c3) & j19 & j10) != j10) {
                            int i27 = 8 - ((~(i26 - length4)) >>> 31);
                            int i28 = 0;
                            while (i28 < i27) {
                                if ((j19 & j6) < j3) {
                                    int i29 = (i26 << 3) + i28;
                                    Object obj4 = g0Var2.f6267b[i29];
                                    Object obj5 = g0Var2.f6268c[i29];
                                    if (obj5 instanceof s.h0) {
                                        s.h0 h0Var6 = (s.h0) obj5;
                                        Object[] objArr4 = h0Var6.f6275b;
                                        long[] jArr14 = h0Var6.f6274a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j13 = j19;
                                            int i30 = 0;
                                            while (true) {
                                                long j20 = jArr14[i30];
                                                jArr5 = jArr13;
                                                i11 = length4;
                                                if ((((~j20) << c3) & j20 & j10) != j10) {
                                                    int i31 = 8 - ((~(i30 - length5)) >>> 31);
                                                    for (int i32 = 0; i32 < i31; i32 = i12 + 1) {
                                                        if ((j20 & j6) < j3) {
                                                            i12 = i32;
                                                            int i33 = (i30 << 3) + i12;
                                                            j14 = j20;
                                                            x1 x1Var = (x1) objArr4[i33];
                                                            if (h0Var5.c(x1Var) || h0Var4.c(x1Var)) {
                                                                h0Var6.l(i33);
                                                            }
                                                        } else {
                                                            i12 = i32;
                                                            j14 = j20;
                                                        }
                                                        j20 = j14 >> 8;
                                                    }
                                                    if (i31 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i30 == length5) {
                                                    break;
                                                }
                                                i30++;
                                                length4 = i11;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            i11 = length4;
                                            j13 = j19;
                                        }
                                        z11 = h0Var6.g();
                                    } else {
                                        jArr5 = jArr13;
                                        i11 = length4;
                                        j13 = j19;
                                        pc.j.c(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        x1 x1Var2 = (x1) obj5;
                                        z11 = h0Var5.c(x1Var2) || h0Var4.c(x1Var2);
                                    }
                                    if (z11) {
                                        g0Var2.l(i29);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    i11 = length4;
                                    j13 = j19;
                                }
                                j19 = j13 >> 8;
                                i28++;
                                length4 = i11;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            int i34 = length4;
                            if (i27 != 8) {
                                break;
                            } else {
                                length4 = i34;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i26 == length4) {
                            break;
                        }
                        i26++;
                        jArr13 = jArr4;
                    }
                }
                h0Var5.b();
                h();
                return;
            }
        }
        if (h0Var4.h()) {
            long[] jArr15 = g0Var2.f6266a;
            int length6 = jArr15.length - 2;
            if (length6 >= 0) {
                int i35 = 0;
                while (true) {
                    long j21 = jArr15[i35];
                    if ((((~j21) << c3) & j21 & j10) != j10) {
                        int i36 = 8 - ((~(i35 - length6)) >>> 31);
                        int i37 = 0;
                        while (i37 < i36) {
                            if ((j21 & j6) < j3) {
                                int i38 = (i35 << 3) + i37;
                                Object obj6 = g0Var2.f6267b[i38];
                                Object obj7 = g0Var2.f6268c[i38];
                                if (obj7 instanceof s.h0) {
                                    s.h0 h0Var7 = (s.h0) obj7;
                                    Object[] objArr5 = h0Var7.f6275b;
                                    long[] jArr16 = h0Var7.f6274a;
                                    int length7 = jArr16.length - 2;
                                    if (length7 >= 0) {
                                        j11 = j21;
                                        int i39 = 0;
                                        while (true) {
                                            long j22 = jArr16[i39];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr17 = jArr16;
                                            if ((((~j22) << c3) & j22 & j10) != j10) {
                                                int i40 = 8 - ((~(i39 - length7)) >>> 31);
                                                int i41 = 0;
                                                while (i41 < i40) {
                                                    if ((j22 & j6) < j3) {
                                                        jArr3 = jArr15;
                                                        int i42 = (i39 << 3) + i41;
                                                        j12 = j22;
                                                        if (h0Var4.c((x1) objArr6[i42])) {
                                                            h0Var7.l(i42);
                                                        }
                                                    } else {
                                                        jArr3 = jArr15;
                                                        j12 = j22;
                                                    }
                                                    i41++;
                                                    jArr15 = jArr3;
                                                    j22 = j12 >> 8;
                                                }
                                                jArr2 = jArr15;
                                                if (i40 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr15;
                                            }
                                            if (i39 == length7) {
                                                break;
                                            }
                                            i39++;
                                            objArr5 = objArr6;
                                            jArr16 = jArr17;
                                            jArr15 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr15;
                                        j11 = j21;
                                    }
                                    c7 = h0Var7.g();
                                } else {
                                    jArr2 = jArr15;
                                    j11 = j21;
                                    pc.j.c(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    c7 = h0Var4.c((x1) obj7);
                                }
                                if (c7) {
                                    g0Var2.l(i38);
                                }
                            } else {
                                jArr2 = jArr15;
                                j11 = j21;
                            }
                            i37++;
                            j21 = j11 >> 8;
                            jArr15 = jArr2;
                        }
                        jArr = jArr15;
                        if (i36 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr15;
                    }
                    if (i35 == length6) {
                        break;
                    }
                    i35++;
                    jArr15 = jArr;
                }
            }
            h();
            h0Var4.b();
        }
    }

    public final void d() {
        synchronized (this.f4816j) {
            try {
                e(this.f4823q);
                n();
            } catch (Throwable th) {
                try {
                    if (!this.f4817k.f6293g.g()) {
                        x4.q qVar = this.f4831y;
                        try {
                            qVar.m(this.f4817k, this.f4832z.A());
                            qVar.b();
                            qVar.a();
                        } catch (Throwable th2) {
                            qVar.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x01d3 A[Catch: all -> 0x01d7, TRY_LEAVE, TryCatch #5 {all -> 0x01d7, blocks: (B:140:0x01cb, B:142:0x01d3), top: B:139:0x01cb }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(n0.a aVar) {
        x4.q qVar;
        long[] jArr;
        int i10;
        long[] jArr2;
        x4.q qVar2;
        long j3;
        char c3;
        long j6;
        int i11;
        boolean z10;
        n0.a aVar2 = this.f4824r;
        r rVar = this.f4832z;
        x0.b A = rVar.A();
        x4.q qVar3 = this.f4831y;
        qVar3.m(this.f4817k, A);
        try {
            if (aVar.f4978d.L()) {
                try {
                    if (aVar2.f4978d.L()) {
                        qVar3.b();
                    }
                    return;
                } finally {
                }
            }
            try {
                Trace.beginSection("Compose:applyChanges");
                try {
                    a5.c cVar = this.f4814h;
                    m2 d10 = this.f4818l.d();
                    int i12 = 0;
                    try {
                        aVar.J(cVar, d10, qVar3, rVar.A());
                        d10.e(true);
                        cVar.h();
                        Trace.endSection();
                        qVar3.c();
                        o0.e eVar = (o0.e) qVar3.f8348g;
                        if (eVar.f5136i != 0) {
                            Trace.beginSection("Compose:sideeffects");
                            try {
                                Object[] objArr = eVar.f5134g;
                                int i13 = eVar.f5136i;
                                for (int i14 = 0; i14 < i13; i14++) {
                                    ((oc.a) objArr[i14]).invoke();
                                }
                                eVar.g();
                                Trace.endSection();
                            } finally {
                                Trace.endSection();
                            }
                        }
                        if (this.f4827u) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f4827u = false;
                                s.g0 g0Var = this.f4819m;
                                long[] jArr3 = g0Var.f6266a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i15 = 0;
                                    while (true) {
                                        long j10 = jArr3[i15];
                                        char c7 = 7;
                                        long j11 = -9187201950435737472L;
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i16 = 8;
                                            int i17 = 8 - ((~(i15 - length)) >>> 31);
                                            int i18 = i12;
                                            while (i18 < i17) {
                                                if ((j10 & 255) < 128) {
                                                    c3 = c7;
                                                    int i19 = (i15 << 3) + i18;
                                                    j6 = j11;
                                                    Object obj = g0Var.f6267b[i19];
                                                    Object obj2 = g0Var.f6268c[i19];
                                                    if (obj2 instanceof s.h0) {
                                                        s.h0 h0Var = (s.h0) obj2;
                                                        Object[] objArr2 = h0Var.f6275b;
                                                        long[] jArr4 = h0Var.f6274a;
                                                        int i20 = i16;
                                                        int length2 = jArr4.length - 2;
                                                        i10 = i18;
                                                        jArr2 = jArr3;
                                                        qVar2 = qVar3;
                                                        if (length2 >= 0) {
                                                            int i21 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j12 = jArr4[i21];
                                                                    j3 = j10;
                                                                    if ((((~j12) << c3) & j12 & j6) != j6) {
                                                                        int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                                                        for (int i23 = 0; i23 < i22; i23++) {
                                                                            if ((j12 & 255) < 128) {
                                                                                int i24 = (i21 << 3) + i23;
                                                                                if (!((x1) objArr2[i24]).b()) {
                                                                                    h0Var.l(i24);
                                                                                }
                                                                            }
                                                                            j12 >>= i20;
                                                                        }
                                                                        if (i22 != i20) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i21 == length2) {
                                                                        break;
                                                                    }
                                                                    i21++;
                                                                    i20 = 8;
                                                                    j10 = j3;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j3 = j10;
                                                        }
                                                        z10 = h0Var.g();
                                                    } else {
                                                        i10 = i18;
                                                        jArr2 = jArr3;
                                                        qVar2 = qVar3;
                                                        j3 = j10;
                                                        pc.j.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                        z10 = !((x1) obj2).b();
                                                    }
                                                    if (z10) {
                                                        g0Var.l(i19);
                                                    }
                                                    i11 = 8;
                                                } else {
                                                    i10 = i18;
                                                    jArr2 = jArr3;
                                                    qVar2 = qVar3;
                                                    j3 = j10;
                                                    c3 = c7;
                                                    j6 = j11;
                                                    i11 = i16;
                                                }
                                                j10 = j3 >> i11;
                                                i18 = i10 + 1;
                                                i16 = i11;
                                                c7 = c3;
                                                j11 = j6;
                                                qVar3 = qVar2;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            qVar = qVar3;
                                            if (i17 != i16) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            qVar = qVar3;
                                        }
                                        if (i15 == length) {
                                            break;
                                        }
                                        i15++;
                                        qVar3 = qVar;
                                        jArr3 = jArr;
                                        i12 = 0;
                                    }
                                } else {
                                    qVar = qVar3;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            qVar = qVar3;
                        }
                        try {
                            if (aVar2.f4978d.L()) {
                                qVar.b();
                            }
                        } finally {
                            qVar.a();
                        }
                    } catch (Throwable th3) {
                        try {
                            d10.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                try {
                    if (aVar2.f4978d.L()) {
                        qVar3.b();
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th7) {
            th = th7;
            if (aVar2.f4978d.L()) {
            }
            throw th;
        }
    }

    public final void f() {
        synchronized (this.f4816j) {
            try {
                if (this.f4824r.f4978d.M()) {
                    e(this.f4824r);
                }
            } catch (Throwable th) {
                try {
                    if (!this.f4817k.f6293g.g()) {
                        x4.q qVar = this.f4831y;
                        try {
                            qVar.m(this.f4817k, this.f4832z.A());
                            qVar.b();
                            qVar.a();
                        } catch (Throwable th2) {
                            qVar.a();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void g() {
        x4.q qVar;
        synchronized (this.f4816j) {
            try {
                this.f4832z.f4742v = null;
                if (!this.f4817k.f6293g.g()) {
                    qVar = this.f4831y;
                    try {
                        qVar.m(this.f4817k, this.f4832z.A());
                        qVar.b();
                        qVar.a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.f4817k.f6293g.g()) {
                        qVar = this.f4831y;
                        try {
                            qVar.m(this.f4817k, this.f4832z.A());
                            qVar.b();
                            qVar.a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void h() {
        char c3;
        long j3;
        long j6;
        long j10;
        long[] jArr;
        long[] jArr2;
        int i10;
        long j11;
        char c7;
        long j12;
        long j13;
        int i11;
        boolean z10;
        int i12;
        long j14;
        s.g0 g0Var = this.f4822p;
        long[] jArr3 = g0Var.f6266a;
        int length = jArr3.length - 2;
        char c10 = 7;
        long j15 = -9187201950435737472L;
        int i13 = 8;
        if (length >= 0) {
            int i14 = 0;
            long j16 = 128;
            while (true) {
                long j17 = jArr3[i14];
                j6 = 255;
                if ((((~j17) << c10) & j17 & j15) != j15) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j17 & 255) < j16) {
                            c7 = c10;
                            int i17 = (i14 << 3) + i16;
                            j12 = j15;
                            Object obj = g0Var.f6267b[i17];
                            Object obj2 = g0Var.f6268c[i17];
                            boolean z11 = obj2 instanceof s.h0;
                            s.g0 g0Var2 = this.f4819m;
                            if (z11) {
                                s.h0 h0Var = (s.h0) obj2;
                                Object[] objArr = h0Var.f6275b;
                                long[] jArr4 = h0Var.f6274a;
                                j13 = j16;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j11 = j17;
                                    int i18 = i13;
                                    int i19 = 0;
                                    while (true) {
                                        long j18 = jArr4[i19];
                                        jArr2 = jArr3;
                                        i10 = length;
                                        if ((((~j18) << c7) & j18 & j12) != j12) {
                                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                            int i21 = 0;
                                            while (i21 < i20) {
                                                if ((j18 & 255) < j13) {
                                                    i12 = i21;
                                                    int i22 = (i19 << 3) + i12;
                                                    j14 = j18;
                                                    if (!g0Var2.c((i0) objArr[i22])) {
                                                        h0Var.l(i22);
                                                    }
                                                } else {
                                                    i12 = i21;
                                                    j14 = j18;
                                                }
                                                j18 = j14 >> i18;
                                                i21 = i12 + 1;
                                            }
                                            if (i20 != i18) {
                                                break;
                                            }
                                        }
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        jArr3 = jArr2;
                                        length = i10;
                                        i18 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i10 = length;
                                    j11 = j17;
                                }
                                z10 = h0Var.g();
                            } else {
                                jArr2 = jArr3;
                                i10 = length;
                                j11 = j17;
                                j13 = j16;
                                pc.j.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                z10 = !g0Var2.c((i0) obj2);
                            }
                            if (z10) {
                                g0Var.l(i17);
                            }
                            i11 = 8;
                        } else {
                            jArr2 = jArr3;
                            i10 = length;
                            j11 = j17;
                            c7 = c10;
                            j12 = j15;
                            j13 = j16;
                            i11 = i13;
                        }
                        j17 = j11 >> i11;
                        i16++;
                        i13 = i11;
                        c10 = c7;
                        j15 = j12;
                        j16 = j13;
                        jArr3 = jArr2;
                        length = i10;
                    }
                    jArr = jArr3;
                    int i23 = length;
                    c3 = c10;
                    j3 = j15;
                    j10 = j16;
                    if (i15 != i13) {
                        break;
                    } else {
                        length = i23;
                    }
                } else {
                    jArr = jArr3;
                    c3 = c10;
                    j3 = j15;
                    j10 = j16;
                }
                if (i14 == length) {
                    break;
                }
                i14++;
                c10 = c3;
                j15 = j3;
                j16 = j10;
                jArr3 = jArr;
                i13 = 8;
            }
        } else {
            c3 = 7;
            j3 = -9187201950435737472L;
            j6 = 255;
            j10 = 128;
        }
        s.h0 h0Var2 = this.f4821o;
        if (!h0Var2.h()) {
            return;
        }
        Object[] objArr2 = h0Var2.f6275b;
        long[] jArr5 = h0Var2.f6274a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i24 = 0;
        while (true) {
            long j19 = jArr5[i24];
            if ((((~j19) << c3) & j19 & j3) != j3) {
                int i25 = 8 - ((~(i24 - length3)) >>> 31);
                for (int i26 = 0; i26 < i25; i26++) {
                    if ((j19 & j6) < j10) {
                        int i27 = (i24 << 3) + i26;
                        if (!(((x1) objArr2[i27]).f4812g != null)) {
                            h0Var2.l(i27);
                        }
                    }
                    j19 >>= 8;
                }
                if (i25 != 8) {
                    return;
                }
            }
            if (i24 == length3) {
                return;
            } else {
                i24++;
            }
        }
    }

    public final boolean i() {
        boolean z10;
        synchronized (this.f4816j) {
            z10 = true;
            if (this.A != 1) {
                z10 = false;
            }
            if (z10) {
                this.A = 0;
            }
        }
        return z10;
    }

    public final void j(oc.e eVar) {
        try {
            synchronized (this.f4816j) {
                m();
                s.g0 g0Var = this.f4826t;
                this.f4826t = v6.a.p();
                try {
                    r rVar = this.f4832z;
                    if (!rVar.f4725e.f4978d.L()) {
                        t.c("Expected applyChanges() to have been called");
                    }
                    rVar.P = null;
                    try {
                        rVar.o(g0Var, eVar);
                    } finally {
                        rVar.P = null;
                    }
                } catch (Throwable th) {
                    this.f4826t = g0Var;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f4817k.f6293g.g()) {
                    x4.q qVar = this.f4831y;
                    try {
                        qVar.m(this.f4817k, this.f4832z.A());
                        qVar.b();
                        qVar.a();
                    } catch (Throwable th3) {
                        qVar.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final void k() {
        x4.q qVar;
        synchronized (this.f4816j) {
            try {
                boolean z10 = this.f4818l.f4632h > 0;
                try {
                    try {
                        if (!z10) {
                            if (!this.f4817k.f6293g.g()) {
                            }
                            this.f4819m.a();
                            this.f4822p.a();
                            this.f4826t.a();
                            this.f4823q.f4978d.J();
                            this.f4824r.f4978d.J();
                            r rVar = this.f4832z;
                            rVar.E.clear();
                            rVar.f4739s.clear();
                            rVar.f4725e.f4978d.J();
                            rVar.f4742v = null;
                            this.A = 1;
                        }
                        qVar.m(this.f4817k, this.f4832z.A());
                        if (z10) {
                            m2 d10 = this.f4818l.d();
                            try {
                                d10.n(d10.f4677t, new s(this.f4831y, d10));
                                d10.e(true);
                                this.f4814h.h();
                                qVar.c();
                            } catch (Throwable th) {
                                d10.e(false);
                                throw th;
                            }
                        }
                        qVar.b();
                        qVar.a();
                        this.f4819m.a();
                        this.f4822p.a();
                        this.f4826t.a();
                        this.f4823q.f4978d.J();
                        this.f4824r.f4978d.J();
                        r rVar2 = this.f4832z;
                        rVar2.E.clear();
                        rVar2.f4739s.clear();
                        rVar2.f4725e.f4978d.J();
                        rVar2.f4742v = null;
                        this.A = 1;
                    } catch (Throwable th2) {
                        qVar.a();
                        throw th2;
                    }
                    qVar = this.f4831y;
                } finally {
                    Trace.endSection();
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void l() {
        synchronized (this.f4816j) {
            try {
                if (this.f4832z.F) {
                    s1.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.A != 3) {
                    this.A = 3;
                    int i10 = i.f4609a;
                    n0.a aVar = this.f4832z.L;
                    if (aVar != null) {
                        e(aVar);
                    }
                    boolean z10 = this.f4818l.f4632h > 0;
                    if (z10 || !this.f4817k.f6293g.g()) {
                        x4.q qVar = this.f4831y;
                        try {
                            qVar.m(this.f4817k, this.f4832z.A());
                            if (z10) {
                                m2 d10 = this.f4818l.d();
                                try {
                                    d10.n(d10.f4677t, new ae.b(2, this.f4831y));
                                    d10.G();
                                    d10.e(true);
                                    this.f4814h.p();
                                    this.f4814h.h();
                                    qVar.c();
                                } catch (Throwable th) {
                                    d10.e(false);
                                    throw th;
                                }
                            }
                            qVar.b();
                            qVar.a();
                        } catch (Throwable th2) {
                            qVar.a();
                            throw th2;
                        }
                    }
                    r rVar = this.f4832z;
                    rVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        rVar.f4722b.p(rVar);
                        rVar.E.clear();
                        rVar.f4739s.clear();
                        rVar.f4725e.f4978d.J();
                        rVar.f4742v = null;
                        rVar.f4721a.p();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f4813g.q(this);
    }

    public final void m() {
        Object obj = z.f4838a;
        AtomicReference atomicReference = this.f4815i;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                t.d("pending composition has not been applied");
                throw new ac.d();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                t.d("corrupt pendingModifications drain: " + atomicReference);
                throw new ac.d();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void n() {
        AtomicReference atomicReference = this.f4815i;
        Object andSet = atomicReference.getAndSet(null);
        if (pc.j.a(andSet, z.f4838a)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            t.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new ac.d();
        }
        t.d("corrupt pendingModifications drain: " + atomicReference);
        throw new ac.d();
    }

    public final void o() {
        bc.x xVar = bc.x.f1069g;
        AtomicReference atomicReference = this.f4815i;
        Object andSet = atomicReference.getAndSet(xVar);
        if (pc.j.a(andSet, z.f4838a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            t.d("corrupt pendingModifications drain: " + atomicReference);
            throw new ac.d();
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void p() {
        int i10 = this.A;
        if (i10 == 0) {
            return;
        }
        s1.b(i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
    }

    public final void q(ArrayList arrayList) {
        s.j0 j0Var = this.f4817k;
        r rVar = this.f4832z;
        if (arrayList.size() > 0) {
            ((c1) ((ac.i) arrayList.get(0)).f270g).getClass();
            throw null;
        }
        try {
            rVar.getClass();
            try {
                rVar.C(arrayList);
                rVar.i();
            } catch (Throwable th) {
                rVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!j0Var.f6293g.g()) {
                    x4.q qVar = this.f4831y;
                    try {
                        qVar.m(j0Var, rVar.A());
                        qVar.b();
                        qVar.a();
                    } catch (Throwable th3) {
                        qVar.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final t0 r(x1 x1Var, Object obj) {
        y yVar;
        int i10 = x1Var.f4807b;
        if ((i10 & 2) != 0) {
            x1Var.f4807b = i10 | 4;
        }
        a aVar = x1Var.f4808c;
        if (aVar == null || !aVar.a()) {
            return t0.f4763g;
        }
        if (this.f4818l.e(aVar)) {
            if (x1Var.f4809d == null) {
                return t0.f4763g;
            }
            t0 t3 = t(x1Var, aVar, obj);
            if (t3 != t0.f4763g) {
                this.f4830x.n();
            }
            return t3;
        }
        synchronized (this.f4816j) {
            yVar = this.f4828v;
        }
        if (yVar != null) {
            r rVar = yVar.f4832z;
            if (rVar.F && rVar.d0(x1Var, obj)) {
                return t0.f4766j;
            }
        }
        return t0.f4763g;
    }

    public final void s() {
        y yVar;
        synchronized (this.f4816j) {
            try {
                for (Object obj : this.f4818l.f4633i) {
                    x1 x1Var = obj instanceof x1 ? (x1) obj : null;
                    if (x1Var != null && (yVar = x1Var.f4806a) != null) {
                        yVar.r(x1Var, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final t0 t(x1 x1Var, a aVar, Object obj) {
        y yVar;
        int i10;
        synchronized (this.f4816j) {
            try {
                y yVar2 = this.f4828v;
                if (yVar2 != null) {
                    j2 j2Var = this.f4818l;
                    int i11 = this.f4829w;
                    if (j2Var.f4637m) {
                        t.c("Writer is active");
                    }
                    if (i11 < 0 || i11 >= j2Var.f4632h) {
                        t.c("Invalid group index");
                    }
                    if (j2Var.e(aVar)) {
                        int i12 = j2Var.f4631g[(i11 * 5) + 3] + i11;
                        int i13 = aVar.f4509a;
                        yVar = (i11 <= i13 && i13 < i12) ? yVar2 : null;
                    }
                    yVar2 = null;
                }
                if (yVar == null) {
                    r rVar = this.f4832z;
                    if (rVar.F && rVar.d0(x1Var, obj)) {
                        return t0.f4766j;
                    }
                    if (obj == null) {
                        this.f4826t.m(x1Var, z0.f4843k);
                    } else if (obj instanceof i0) {
                        Object g8 = this.f4826t.g(x1Var);
                        if (g8 != null) {
                            if (g8 instanceof s.h0) {
                                s.h0 h0Var = (s.h0) g8;
                                Object[] objArr = h0Var.f6275b;
                                long[] jArr = h0Var.f6274a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i14 = 0;
                                    loop0: while (true) {
                                        long j3 = jArr[i14];
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i15 = 8;
                                            int i16 = 8 - ((~(i14 - length)) >>> 31);
                                            int i17 = 0;
                                            while (i17 < i16) {
                                                if ((j3 & 255) < 128) {
                                                    i10 = i15;
                                                    if (objArr[(i14 << 3) + i17] == z0.f4843k) {
                                                        break loop0;
                                                    }
                                                } else {
                                                    i10 = i15;
                                                }
                                                j3 >>= i10;
                                                i17++;
                                                i15 = i10;
                                            }
                                            if (i16 != i15) {
                                                break;
                                            }
                                        }
                                        if (i14 == length) {
                                            break;
                                        }
                                        i14++;
                                    }
                                }
                            } else if (g8 == z0.f4843k) {
                            }
                        }
                        v6.a.m(this.f4826t, x1Var, obj);
                    } else {
                        this.f4826t.m(x1Var, z0.f4843k);
                    }
                }
                if (yVar != null) {
                    return yVar.t(x1Var, aVar, obj);
                }
                this.f4813g.j(this);
                return this.f4832z.F ? t0.f4765i : t0.f4764h;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(Object obj) {
        Object g8 = this.f4819m.g(obj);
        if (g8 == null) {
            return;
        }
        boolean z10 = g8 instanceof s.h0;
        s.g0 g0Var = this.f4825s;
        if (!z10) {
            x1 x1Var = (x1) g8;
            if (x1Var.c(obj) == t0.f4766j) {
                v6.a.m(g0Var, obj, x1Var);
                return;
            }
            return;
        }
        s.h0 h0Var = (s.h0) g8;
        Object[] objArr = h0Var.f6275b;
        long[] jArr = h0Var.f6274a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j3 = jArr[i10];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j3) < 128) {
                        x1 x1Var2 = (x1) objArr[(i10 << 3) + i12];
                        if (x1Var2.c(obj) == t0.f4766j) {
                            v6.a.m(g0Var, obj, x1Var2);
                        }
                    }
                    j3 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(Set set) {
        boolean z10 = set instanceof o0.h;
        s.g0 g0Var = this.f4822p;
        s.g0 g0Var2 = this.f4819m;
        if (z10) {
            s.h0 h0Var = ((o0.h) set).f5148g;
            Object[] objArr = h0Var.f6275b;
            long[] jArr = h0Var.f6274a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                loop0: while (true) {
                    long j3 = jArr[i10];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j3) < 128) {
                                Object obj = objArr[(i10 << 3) + i12];
                                if (g0Var2.c(obj) || g0Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j3 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (g0Var2.c(obj2) || g0Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean w() {
        boolean M;
        synchronized (this.f4816j) {
            m();
            try {
                s.g0 g0Var = this.f4826t;
                this.f4826t = v6.a.p();
                try {
                    r rVar = this.f4832z;
                    n0.l0 l0Var = rVar.f4725e.f4978d;
                    if (!l0Var.L()) {
                        t.c("Expected applyChanges() to have been called");
                    }
                    if (g0Var.f6270e > 0 || !rVar.f4739s.isEmpty()) {
                        rVar.P = null;
                        try {
                            rVar.o(g0Var, null);
                            rVar.P = null;
                            M = l0Var.M();
                        } catch (Throwable th) {
                            rVar.P = null;
                            throw th;
                        }
                    } else {
                        M = false;
                    }
                    if (!M) {
                        n();
                    }
                } catch (Throwable th2) {
                    this.f4826t = g0Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f4817k.f6293g.g()) {
                        x4.q qVar = this.f4831y;
                        try {
                            qVar.m(this.f4817k, this.f4832z.A());
                            qVar.b();
                            qVar.a();
                        } catch (Throwable th4) {
                            qVar.a();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    a();
                    throw th5;
                }
            }
        }
        return M;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Set[]] */
    public final void x(o0.h hVar) {
        o0.h hVar2;
        while (true) {
            Object obj = this.f4815i.get();
            if (obj == null || obj.equals(z.f4838a)) {
                hVar2 = hVar;
            } else if (obj instanceof Set) {
                hVar2 = new Set[]{obj, hVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f4815i).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = hVar;
                hVar2 = copyOf;
            }
            AtomicReference atomicReference = this.f4815i;
            while (!atomicReference.compareAndSet(obj, hVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f4816j) {
                    n();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(Object obj) {
        x1 y10;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        r rVar = this.f4832z;
        if (rVar.A > 0 || (y10 = rVar.y()) == null) {
            return;
        }
        boolean z13 = true;
        int i12 = y10.f4807b | 1;
        y10.f4807b = i12;
        if ((i12 & 32) == 0) {
            s.z zVar = y10.f4811f;
            if (zVar == null) {
                zVar = new s.z();
                y10.f4811f = zVar;
            }
            int i13 = y10.f4810e;
            int c3 = zVar.c(obj);
            if (c3 < 0) {
                c3 = ~c3;
                i10 = -1;
            } else {
                i10 = zVar.f6364c[c3];
            }
            zVar.f6363b[c3] = obj;
            zVar.f6364c[c3] = i13;
            if (i10 == y10.f4810e) {
                z10 = true;
                this.f4830x.n();
                if (z10) {
                    if (obj instanceof w0.w) {
                        ((w0.w) obj).f(1);
                    }
                    v6.a.m(this.f4819m, obj, y10);
                    if (obj instanceof i0) {
                        i0 i0Var = (i0) obj;
                        h0 h10 = i0Var.h();
                        s.g0 g0Var = this.f4822p;
                        v6.a.P(g0Var, obj);
                        s.z zVar2 = h10.f4601e;
                        Object[] objArr = zVar2.f6363b;
                        long[] jArr = zVar2.f6362a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i14 = 0;
                            while (true) {
                                long j3 = jArr[i14];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i15 = 8;
                                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                                    int i17 = 0;
                                    while (i17 < i16) {
                                        if ((j3 & 255) < 128) {
                                            i11 = i15;
                                            w0.v vVar = (w0.v) objArr[(i14 << 3) + i17];
                                            if (vVar instanceof w0.w) {
                                                z12 = true;
                                                ((w0.w) vVar).f(1);
                                            } else {
                                                z12 = true;
                                            }
                                            v6.a.m(g0Var, vVar, obj);
                                        } else {
                                            z12 = z13;
                                            i11 = i15;
                                        }
                                        j3 >>= i11;
                                        i17++;
                                        z13 = z12;
                                        i15 = i11;
                                    }
                                    z11 = z13;
                                    if (i16 != i15) {
                                        break;
                                    }
                                } else {
                                    z11 = z13;
                                }
                                if (i14 == length) {
                                    break;
                                }
                                i14++;
                                z13 = z11;
                            }
                        }
                        Object obj2 = h10.f4602f;
                        s.g0 g0Var2 = y10.f4812g;
                        if (g0Var2 == null) {
                            g0Var2 = new s.g0();
                            y10.f4812g = g0Var2;
                        }
                        g0Var2.m(i0Var, obj2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z10 = false;
        this.f4830x.n();
        if (z10) {
        }
    }

    public final void z(Object obj) {
        synchronized (this.f4816j) {
            try {
                u(obj);
                Object g8 = this.f4822p.g(obj);
                if (g8 != null) {
                    if (g8 instanceof s.h0) {
                        s.h0 h0Var = (s.h0) g8;
                        Object[] objArr = h0Var.f6275b;
                        long[] jArr = h0Var.f6274a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i10 = 0;
                            while (true) {
                                long j3 = jArr[i10];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        if ((255 & j3) < 128) {
                                            u((i0) objArr[(i10 << 3) + i12]);
                                        }
                                        j3 >>= 8;
                                    }
                                    if (i11 != 8) {
                                        break;
                                    }
                                }
                                if (i10 == length) {
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    } else {
                        u((i0) g8);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
