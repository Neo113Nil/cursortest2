package defpackage;

import android.os.Trace;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wr5 implements ymn, sr5 {
    public final tr5 a;
    public final j5 b;
    public final AtomicReference c = new AtomicReference(null);
    public final Object d = new Object();
    public final wpi e;
    public final fxq f;
    public final tpi g;
    public final upi h;
    public final upi i;
    public final tpi j;
    public final wb4 k;
    public final wb4 l;
    public final tpi m;
    public tpi n;
    public boolean o;
    public wr5 p;
    public int q;
    public final y9w r;
    public final oq5 s;
    public boolean t;

    public wr5(tr5 tr5Var, j5 j5Var) {
        this.a = tr5Var;
        this.b = j5Var;
        upi upiVar = new upi();
        wpi wpiVar = upiVar.e;
        if (wpiVar == null) {
            wpiVar = new wpi(upiVar);
            upiVar.e = wpiVar;
        }
        wpi wpiVar2 = wpiVar;
        this.e = wpiVar2;
        fxq fxqVar = new fxq();
        if (tr5Var.d()) {
            fxqVar.k = new soi();
        }
        if (tr5Var.f()) {
            fxqVar.g();
        }
        this.f = fxqVar;
        this.g = ldg.n();
        this.h = new upi();
        this.i = new upi();
        this.j = ldg.n();
        wb4 wb4Var = new wb4();
        this.k = wb4Var;
        wb4 wb4Var2 = new wb4();
        this.l = wb4Var2;
        this.m = ldg.n();
        this.n = ldg.n();
        this.r = new y9w(17);
        oq5 oq5Var = new oq5(j5Var, tr5Var, fxqVar, wpiVar2, wb4Var, wb4Var2, this);
        tr5Var.o(oq5Var);
        this.s = oq5Var;
        wn5 wn5Var = ho5.a;
    }

    @Override // defpackage.ymn
    public final void a() {
        this.o = true;
    }

    @Override // defpackage.ymn
    public final gye b(xmn xmnVar, Object obj) {
        wr5 wr5Var;
        int i = xmnVar.a;
        if ((i & 2) != 0) {
            xmnVar.a = i | 4;
        }
        w80 w80Var = xmnVar.c;
        if (w80Var == null || !w80Var.a()) {
            return gye.a;
        }
        if (this.f.q(w80Var)) {
            return xmnVar.d != null ? u(xmnVar, w80Var, obj) : gye.a;
        }
        synchronized (this.d) {
            wr5Var = this.p;
        }
        if (wr5Var != null) {
            oq5 oq5Var = wr5Var.s;
            if (oq5Var.E && oq5Var.f0(xmnVar, obj)) {
                return gye.d;
            }
        }
        return gye.a;
    }

    @Override // defpackage.sr5
    public final void c() {
        synchronized (this.d) {
            try {
                if (this.s.E) {
                    llm.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.t) {
                    this.t = true;
                    wn5 wn5Var = ho5.b;
                    wb4 wb4Var = this.s.K;
                    if (wb4Var != null) {
                        i(wb4Var);
                    }
                    boolean z = this.f.b > 0;
                    if (z || !this.e.a.h()) {
                        m mVar = new m(this.e);
                        if (z) {
                            oxq o = this.f.o();
                            try {
                                pq5.i(o, mVar);
                                o.e(true);
                                this.b.g();
                                this.b.f();
                                mVar.h();
                            } catch (Throwable th) {
                                o.e(false);
                                throw th;
                            }
                        }
                        mVar.g();
                    }
                    oq5 oq5Var = this.s;
                    oq5Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        oq5Var.b.r(oq5Var);
                        oq5Var.D.clear();
                        oq5Var.r.clear();
                        oq5Var.e.a.C0();
                        oq5Var.u = null;
                        oq5Var.a.g();
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.a.s(this);
    }

    public final void d() {
        this.c.set(null);
        this.k.a.C0();
        this.l.a.C0();
        wpi wpiVar = this.e;
        if (wpiVar.a.h()) {
            return;
        }
        new ArrayList();
        if (wpiVar.a.h()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            g5d g5dVar = new g5d(wpiVar);
            while (g5dVar.hasNext()) {
                eun eunVar = (eun) g5dVar.next();
                g5dVar.remove();
                eunVar.d();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void e(Object obj, boolean z) {
        int i;
        Object g = this.g.g(obj);
        if (g == null) {
            return;
        }
        boolean z2 = g instanceof upi;
        upi upiVar = this.h;
        upi upiVar2 = this.i;
        tpi tpiVar = this.m;
        if (!z2) {
            xmn xmnVar = (xmn) g;
            if (ldg.D(tpiVar, obj, xmnVar) || xmnVar.b(obj) == gye.a) {
                return;
            }
            if (xmnVar.g == null || z) {
                upiVar.a(xmnVar);
                return;
            } else {
                upiVar2.a(xmnVar);
                return;
            }
        }
        upi upiVar3 = (upi) g;
        Object[] objArr = upiVar3.b;
        long[] jArr = upiVar3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((255 & j) < 128) {
                        xmn xmnVar2 = (xmn) objArr[(i2 << 3) + i5];
                        if (!ldg.D(tpiVar, obj, xmnVar2)) {
                            i = i3;
                            if (xmnVar2.b(obj) != gye.a) {
                                if (xmnVar2.g == null || z) {
                                    upiVar.a(xmnVar2);
                                } else {
                                    upiVar2.a(xmnVar2);
                                }
                            }
                            j >>= i;
                            i5++;
                            i3 = i;
                        }
                    }
                    i = i3;
                    j >>= i;
                    i5++;
                    i3 = i;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.ymn
    public final void f(Object obj) {
        xmn x;
        boolean z;
        boolean z2;
        int i;
        int i2;
        oq5 oq5Var = this.s;
        if (oq5Var.z <= 0 && (x = oq5Var.x()) != null) {
            boolean z3 = true;
            int i3 = x.a | 1;
            x.a = i3;
            if ((i3 & 32) == 0) {
                cpi cpiVar = x.f;
                if (cpiVar == null) {
                    cpiVar = new cpi();
                    x.f = cpiVar;
                }
                int i4 = x.e;
                int c = cpiVar.c(obj);
                if (c < 0) {
                    c = ~c;
                    i2 = -1;
                } else {
                    i2 = cpiVar.c[c];
                }
                cpiVar.b[c] = obj;
                cpiVar.c[c] = i4;
                if (i2 == x.e) {
                    return;
                }
            }
            if (obj instanceof ner) {
                ((ner) obj).c(1);
            }
            ldg.l(this.g, obj, x);
            if (obj instanceof zx7) {
                zx7 zx7Var = (zx7) obj;
                xx7 i5 = zx7Var.i();
                tpi tpiVar = this.j;
                ldg.E(tpiVar, obj);
                cpi cpiVar2 = i5.e;
                Object[] objArr = cpiVar2.b;
                long[] jArr = cpiVar2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j = jArr[i6];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8;
                            int i8 = 8 - ((~(i6 - length)) >>> 31);
                            int i9 = 0;
                            while (i9 < i8) {
                                if ((j & 255) < 128) {
                                    i = i7;
                                    mer merVar = (mer) objArr[(i6 << 3) + i9];
                                    if (merVar instanceof ner) {
                                        z2 = true;
                                        ((ner) merVar).c(1);
                                    } else {
                                        z2 = true;
                                    }
                                    ldg.l(tpiVar, merVar, obj);
                                } else {
                                    z2 = z3;
                                    i = i7;
                                }
                                j >>= i;
                                i9++;
                                z3 = z2;
                                i7 = i;
                            }
                            z = z3;
                            if (i8 != i7) {
                                break;
                            }
                        } else {
                            z = z3;
                        }
                        if (i6 == length) {
                            break;
                        }
                        i6++;
                        z3 = z;
                    }
                }
                Object obj2 = i5.f;
                tpi tpiVar2 = x.g;
                if (tpiVar2 == null) {
                    tpiVar2 = new tpi();
                    x.g = tpiVar2;
                }
                tpiVar2.m(zx7Var, obj2);
            }
        }
    }

    public final void g(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        int i;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean d;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        int i2;
        long j6;
        boolean z2;
        int i3;
        long j7;
        long[] jArr6;
        long[] jArr7;
        char c2;
        long j8;
        int i4;
        int i5;
        long[] jArr8;
        boolean z3 = set instanceof yso;
        tpi tpiVar = this.j;
        Object obj = null;
        int i6 = 8;
        if (z3) {
            upi upiVar = ((yso) set).a;
            Object[] objArr = upiVar.b;
            long[] jArr9 = upiVar.a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i7 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i7];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i7 << 3) + i9];
                                c2 = c3;
                                if (obj2 instanceof xmn) {
                                    ((xmn) obj2).b(obj);
                                } else {
                                    e(obj2, z);
                                    Object g = tpiVar.g(obj2);
                                    if (g != null) {
                                        if (g instanceof upi) {
                                            upi upiVar2 = (upi) g;
                                            Object[] objArr2 = upiVar2.b;
                                            long[] jArr10 = upiVar2.a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i10 = i6;
                                                i4 = length;
                                                int i11 = 0;
                                                while (true) {
                                                    long j10 = jArr10[i11];
                                                    j8 = j9;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                                        int i13 = 0;
                                                        while (i13 < i12) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr8 = jArr9;
                                                                e((zx7) objArr2[(i11 << 3) + i13], z);
                                                            } else {
                                                                jArr8 = jArr9;
                                                            }
                                                            j10 >>= i10;
                                                            i13++;
                                                            jArr9 = jArr8;
                                                        }
                                                        jArr7 = jArr9;
                                                        if (i12 != i10) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr9;
                                                    }
                                                    if (i11 == length2) {
                                                        break;
                                                    }
                                                    i11++;
                                                    jArr10 = jArr11;
                                                    j9 = j8;
                                                    jArr9 = jArr7;
                                                    i10 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr9;
                                            j8 = j9;
                                            i4 = length;
                                            e((zx7) g, z);
                                        }
                                        i5 = 8;
                                    }
                                }
                                jArr7 = jArr9;
                                j8 = j9;
                                i4 = length;
                                i5 = 8;
                            } else {
                                jArr7 = jArr9;
                                c2 = c3;
                                j8 = j9;
                                i4 = length;
                                i5 = i6;
                            }
                            j9 = j8 >> i5;
                            i9++;
                            length = i4;
                            i6 = i5;
                            c3 = c2;
                            jArr9 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr9;
                        c = c3;
                        int i14 = length;
                        if (i8 != i6) {
                            break;
                        } else {
                            length = i14;
                        }
                    } else {
                        jArr6 = jArr9;
                        c = 7;
                    }
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                    jArr9 = jArr6;
                    obj = null;
                    i6 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof xmn) {
                    ((xmn) obj3).b(null);
                } else {
                    e(obj3, z);
                    Object g2 = tpiVar.g(obj3);
                    if (g2 != null) {
                        if (g2 instanceof upi) {
                            upi upiVar3 = (upi) g2;
                            Object[] objArr3 = upiVar3.b;
                            long[] jArr12 = upiVar3.a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j11 = jArr12[i];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i15 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            if ((j11 & 255) < 128) {
                                                e((zx7) objArr3[(i << 3) + i16], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i15 != 8) {
                                            break;
                                        }
                                    }
                                    i = i != length3 ? i + 1 : 0;
                                }
                            }
                        } else {
                            e((zx7) g2, z);
                        }
                    }
                }
            }
        }
        tpi tpiVar2 = this.g;
        upi upiVar4 = this.h;
        if (z) {
            upi upiVar5 = this.i;
            if (upiVar5.i()) {
                long[] jArr13 = tpiVar2.a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j12 = jArr13[i17];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i18 = 8 - ((~(i17 - length4)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j12 & j2) < j) {
                                    int i20 = (i17 << 3) + i19;
                                    Object obj4 = tpiVar2.b[i20];
                                    Object obj5 = tpiVar2.c[i20];
                                    if (obj5 instanceof upi) {
                                        upi upiVar6 = (upi) obj5;
                                        Object[] objArr4 = upiVar6.b;
                                        long[] jArr14 = upiVar6.a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i21 = 0;
                                            while (true) {
                                                long j13 = jArr14[i21];
                                                jArr5 = jArr13;
                                                i2 = length4;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i22 = 8 - ((~(i21 - length5)) >>> 31);
                                                    for (int i23 = 0; i23 < i22; i23 = i3 + 1) {
                                                        if ((j13 & j2) < j) {
                                                            i3 = i23;
                                                            int i24 = (i21 << 3) + i3;
                                                            j7 = j13;
                                                            xmn xmnVar = (xmn) objArr4[i24];
                                                            if (upiVar5.d(xmnVar) || upiVar4.d(xmnVar)) {
                                                                upiVar6.n(i24);
                                                            }
                                                        } else {
                                                            i3 = i23;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                    }
                                                    if (i22 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i21 == length5) {
                                                    break;
                                                }
                                                i21++;
                                                length4 = i2;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            i2 = length4;
                                            j6 = j12;
                                        }
                                        z2 = upiVar6.h();
                                    } else {
                                        jArr5 = jArr13;
                                        i2 = length4;
                                        j6 = j12;
                                        obj5.getClass();
                                        xmn xmnVar2 = (xmn) obj5;
                                        z2 = upiVar5.d(xmnVar2) || upiVar4.d(xmnVar2);
                                    }
                                    if (z2) {
                                        tpiVar2.l(i20);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    i2 = length4;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i19++;
                                length4 = i2;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            int i25 = length4;
                            if (i18 != 8) {
                                break;
                            } else {
                                length4 = i25;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i17 == length4) {
                            break;
                        }
                        i17++;
                        jArr13 = jArr4;
                    }
                }
                upiVar5.c();
                l();
                return;
            }
        }
        if (upiVar4.i()) {
            long[] jArr15 = tpiVar2.a;
            int length6 = jArr15.length - 2;
            if (length6 >= 0) {
                int i26 = 0;
                while (true) {
                    long j14 = jArr15[i26];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i27 = 8 - ((~(i26 - length6)) >>> 31);
                        int i28 = 0;
                        while (i28 < i27) {
                            if ((j14 & j2) < j) {
                                int i29 = (i26 << 3) + i28;
                                Object obj6 = tpiVar2.b[i29];
                                Object obj7 = tpiVar2.c[i29];
                                if (obj7 instanceof upi) {
                                    upi upiVar7 = (upi) obj7;
                                    Object[] objArr5 = upiVar7.b;
                                    long[] jArr16 = upiVar7.a;
                                    int length7 = jArr16.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i30 = 0;
                                        while (true) {
                                            long j15 = jArr16[i30];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr17 = jArr16;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i31 = 8 - ((~(i30 - length7)) >>> 31);
                                                int i32 = 0;
                                                while (i32 < i31) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr15;
                                                        int i33 = (i30 << 3) + i32;
                                                        j5 = j15;
                                                        if (upiVar4.d((xmn) objArr6[i33])) {
                                                            upiVar7.n(i33);
                                                        }
                                                    } else {
                                                        jArr3 = jArr15;
                                                        j5 = j15;
                                                    }
                                                    i32++;
                                                    jArr15 = jArr3;
                                                    j15 = j5 >> 8;
                                                }
                                                jArr2 = jArr15;
                                                if (i31 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr15;
                                            }
                                            if (i30 == length7) {
                                                break;
                                            }
                                            i30++;
                                            objArr5 = objArr6;
                                            jArr16 = jArr17;
                                            jArr15 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr15;
                                        j4 = j14;
                                    }
                                    d = upiVar7.h();
                                } else {
                                    jArr2 = jArr15;
                                    j4 = j14;
                                    obj7.getClass();
                                    d = upiVar4.d((xmn) obj7);
                                }
                                if (d) {
                                    tpiVar2.l(i29);
                                }
                            } else {
                                jArr2 = jArr15;
                                j4 = j14;
                            }
                            i28++;
                            j14 = j4 >> 8;
                            jArr15 = jArr2;
                        }
                        jArr = jArr15;
                        if (i27 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr15;
                    }
                    if (i26 == length6) {
                        break;
                    }
                    i26++;
                    jArr15 = jArr;
                }
            }
            l();
            upiVar4.c();
        }
    }

    public final void h() {
        synchronized (this.d) {
            try {
                i(this.k);
                q();
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.e.a.h()) {
                            wpi wpiVar = this.e;
                            new ArrayList();
                            if (!wpiVar.a.h()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    g5d g5dVar = new g5d(wpiVar);
                                    while (((xgp) g5dVar.c).hasNext()) {
                                        eun eunVar = (eun) ((xgp) g5dVar.c).next();
                                        g5dVar.remove();
                                        eunVar.d();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e) {
                        d();
                        throw e;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void i(wb4 wb4Var) {
        long[] jArr;
        int i;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i2;
        boolean z;
        wb4 wb4Var2 = this.l;
        m mVar = new m(this.e);
        try {
            if (wb4Var.a.E0()) {
                if (wb4Var2.a.E0()) {
                    mVar.g();
                    return;
                }
                return;
            }
            Trace.beginSection("Compose:applyChanges");
            try {
                j5 j5Var = this.b;
                oxq o = this.f.o();
                int i3 = 0;
                try {
                    wb4Var.C0(j5Var, o, mVar);
                    o.e(true);
                    j5Var.f();
                    Trace.endSection();
                    mVar.h();
                    eqi eqiVar = (eqi) mVar.f;
                    if (eqiVar.c != 0) {
                        Trace.beginSection("Compose:sideeffects");
                        try {
                            Object[] objArr = eqiVar.a;
                            int i4 = eqiVar.c;
                            for (int i5 = 0; i5 < i4; i5++) {
                                ((Function0) objArr[i5]).invoke();
                            }
                            eqiVar.i();
                            Trace.endSection();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (this.o) {
                        Trace.beginSection("Compose:unobserve");
                        try {
                            this.o = false;
                            tpi tpiVar = this.g;
                            long[] jArr3 = tpiVar.a;
                            int length = jArr3.length - 2;
                            if (length >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j3 = jArr3[i6];
                                    char c2 = 7;
                                    long j4 = -9187201950435737472L;
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8;
                                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                                        int i9 = i3;
                                        while (i9 < i8) {
                                            if ((j3 & 255) < 128) {
                                                c = c2;
                                                int i10 = (i6 << 3) + i9;
                                                j2 = j4;
                                                Object obj = tpiVar.b[i10];
                                                Object obj2 = tpiVar.c[i10];
                                                if (obj2 instanceof upi) {
                                                    upi upiVar = (upi) obj2;
                                                    Object[] objArr2 = upiVar.b;
                                                    long[] jArr4 = upiVar.a;
                                                    int i11 = i7;
                                                    int length2 = jArr4.length - 2;
                                                    i = i9;
                                                    jArr2 = jArr3;
                                                    if (length2 >= 0) {
                                                        int i12 = 0;
                                                        while (true) {
                                                            long j5 = jArr4[i12];
                                                            j = j3;
                                                            if ((((~j5) << c) & j5 & j2) != j2) {
                                                                int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                                for (int i14 = 0; i14 < i13; i14++) {
                                                                    if ((j5 & 255) < 128) {
                                                                        int i15 = (i12 << 3) + i14;
                                                                        if (!((xmn) objArr2[i15]).a()) {
                                                                            upiVar.n(i15);
                                                                        }
                                                                    }
                                                                    j5 >>= i11;
                                                                }
                                                                if (i13 != i11) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i12 == length2) {
                                                                break;
                                                            }
                                                            i12++;
                                                            i11 = 8;
                                                            j3 = j;
                                                        }
                                                    } else {
                                                        j = j3;
                                                    }
                                                    z = upiVar.h();
                                                } else {
                                                    i = i9;
                                                    jArr2 = jArr3;
                                                    j = j3;
                                                    obj2.getClass();
                                                    z = !((xmn) obj2).a();
                                                }
                                                if (z) {
                                                    tpiVar.l(i10);
                                                }
                                                i2 = 8;
                                            } else {
                                                i = i9;
                                                jArr2 = jArr3;
                                                j = j3;
                                                c = c2;
                                                j2 = j4;
                                                i2 = i7;
                                            }
                                            j3 = j >> i2;
                                            i9 = i + 1;
                                            i7 = i2;
                                            c2 = c;
                                            j4 = j2;
                                            jArr3 = jArr2;
                                        }
                                        jArr = jArr3;
                                        if (i8 != i7) {
                                            break;
                                        }
                                    } else {
                                        jArr = jArr3;
                                    }
                                    if (i6 == length) {
                                        break;
                                    }
                                    i6++;
                                    jArr3 = jArr;
                                    i3 = 0;
                                }
                            }
                            l();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (wb4Var2.a.E0()) {
                        mVar.g();
                    }
                } catch (Throwable th3) {
                    o.e(false);
                    throw th3;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th4) {
            if (wb4Var2.a.E0()) {
                mVar.g();
            }
            throw th4;
        }
    }

    public final void j() {
        synchronized (this.d) {
            try {
                if (this.l.a.F0()) {
                    i(this.l);
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.e.a.h()) {
                            wpi wpiVar = this.e;
                            new ArrayList();
                            if (!wpiVar.a.h()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    g5d g5dVar = new g5d(wpiVar);
                                    while (((xgp) g5dVar.c).hasNext()) {
                                        eun eunVar = (eun) ((xgp) g5dVar.c).next();
                                        g5dVar.remove();
                                        eunVar.d();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e) {
                        d();
                        throw e;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final void k() {
        synchronized (this.d) {
            try {
                this.s.u = null;
                if (!this.e.a.h()) {
                    wpi wpiVar = this.e;
                    new ArrayList();
                    if (!wpiVar.a.h()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            g5d g5dVar = new g5d(wpiVar);
                            while (g5dVar.hasNext()) {
                                eun eunVar = (eun) g5dVar.next();
                                g5dVar.remove();
                                eunVar.d();
                            }
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.e.a.h()) {
                            wpi wpiVar2 = this.e;
                            new ArrayList();
                            if (!wpiVar2.a.h()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    g5d g5dVar2 = new g5d(wpiVar2);
                                    while (g5dVar2.hasNext()) {
                                        eun eunVar2 = (eun) g5dVar2.next();
                                        g5dVar2.remove();
                                        eunVar2.d();
                                    }
                                    Trace.endSection();
                                } finally {
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e) {
                        d();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void l() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        char c2;
        long j5;
        long j6;
        int i2;
        boolean z;
        int i3;
        long j7;
        tpi tpiVar = this.j;
        long[] jArr3 = tpiVar.a;
        int length = jArr3.length - 2;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            long j9 = 128;
            while (true) {
                long j10 = jArr3[i5];
                j2 = 255;
                if ((((~j10) << c3) & j10 & j8) != j8) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j10 & 255) < j9) {
                            c2 = c3;
                            int i8 = (i5 << 3) + i7;
                            j5 = j8;
                            Object obj = tpiVar.b[i8];
                            Object obj2 = tpiVar.c[i8];
                            boolean z2 = obj2 instanceof upi;
                            tpi tpiVar2 = this.g;
                            if (z2) {
                                upi upiVar = (upi) obj2;
                                Object[] objArr = upiVar.b;
                                long[] jArr4 = upiVar.a;
                                j6 = j9;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j4 = j10;
                                    int i9 = i4;
                                    int i10 = 0;
                                    while (true) {
                                        long j11 = jArr4[i10];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j11) << c2) & j11 & j5) != j5) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                if ((j11 & 255) < j6) {
                                                    i3 = i12;
                                                    int i13 = (i10 << 3) + i3;
                                                    j7 = j11;
                                                    if (!tpiVar2.c((zx7) objArr[i13])) {
                                                        upiVar.n(i13);
                                                    }
                                                } else {
                                                    i3 = i12;
                                                    j7 = j11;
                                                }
                                                j11 = j7 >> i9;
                                                i12 = i3 + 1;
                                            }
                                            if (i11 != i9) {
                                                break;
                                            }
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    j4 = j10;
                                }
                                z = upiVar.h();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                j4 = j10;
                                j6 = j9;
                                obj2.getClass();
                                z = !tpiVar2.c((zx7) obj2);
                            }
                            if (z) {
                                tpiVar.l(i8);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            j4 = j10;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i2 = i4;
                        }
                        j10 = j4 >> i2;
                        i7++;
                        i4 = i2;
                        c3 = c2;
                        j8 = j5;
                        j9 = j6;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i14 = length;
                    c = c3;
                    j = j8;
                    j3 = j9;
                    if (i6 != i4) {
                        break;
                    } else {
                        length = i14;
                    }
                } else {
                    jArr = jArr3;
                    c = c3;
                    j = j8;
                    j3 = j9;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                c3 = c;
                j8 = j;
                j9 = j3;
                jArr3 = jArr;
                i4 = 8;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        upi upiVar2 = this.i;
        if (!upiVar2.i()) {
            return;
        }
        Object[] objArr2 = upiVar2.b;
        long[] jArr5 = upiVar2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j12 = jArr5[i15];
            if ((((~j12) << c) & j12 & j) != j) {
                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((j12 & j2) < j3) {
                        int i18 = (i15 << 3) + i17;
                        if (!(((xmn) objArr2[i18]).g != null)) {
                            upiVar2.n(i18);
                        }
                    }
                    j12 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length3) {
                return;
            } else {
                i15++;
            }
        }
    }

    public final void m(wn5 wn5Var) {
        try {
            synchronized (this.d) {
                p();
                tpi tpiVar = this.n;
                this.n = ldg.n();
                try {
                    this.r.getClass();
                    this.a.getClass();
                    oq5 oq5Var = this.s;
                    if (!oq5Var.e.a.E0()) {
                        pq5.c("Expected applyChanges() to have been called");
                    }
                    oq5Var.n(tpiVar, wn5Var);
                } catch (Exception e) {
                    this.n = tpiVar;
                    throw e;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.e.a.h()) {
                    wpi wpiVar = this.e;
                    new ArrayList();
                    if (!wpiVar.a.h()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            g5d g5dVar = new g5d(wpiVar);
                            while (((xgp) g5dVar.c).hasNext()) {
                                eun eunVar = (eun) ((xgp) g5dVar.c).next();
                                g5dVar.remove();
                                eunVar.d();
                            }
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                }
                throw th;
            } catch (Exception e2) {
                d();
                throw e2;
            }
        }
    }

    public final void n(wn5 wn5Var) {
        if (this.t) {
            llm.b("The composition is disposed");
        }
        this.a.a(this, wn5Var);
    }

    public final void o() {
        synchronized (this.d) {
            try {
                boolean z = this.f.b > 0;
                try {
                    if (!z) {
                        if (!this.e.a.h()) {
                        }
                        this.g.a();
                        this.j.a();
                        this.n.a();
                        this.k.a.C0();
                        this.l.a.C0();
                        oq5 oq5Var = this.s;
                        oq5Var.D.clear();
                        oq5Var.r.clear();
                        oq5Var.e.a.C0();
                        oq5Var.u = null;
                    }
                    m mVar = new m(this.e);
                    if (z) {
                        oxq o = this.f.o();
                        try {
                            pq5.e(o, mVar);
                            o.e(true);
                            this.b.f();
                            mVar.h();
                        } catch (Throwable th) {
                            o.e(false);
                            throw th;
                        }
                    }
                    mVar.g();
                    Trace.endSection();
                    this.g.a();
                    this.j.a();
                    this.n.a();
                    this.k.a.C0();
                    this.l.a.C0();
                    oq5 oq5Var2 = this.s;
                    oq5Var2.D.clear();
                    oq5Var2.r.clear();
                    oq5Var2.e.a.C0();
                    oq5Var2.u = null;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void p() {
        Object obj = bow.j;
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                pq5.d("pending composition has not been applied");
                rj7.f();
                return;
            }
            if (andSet instanceof Set) {
                g((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                pq5.d("corrupt pendingModifications drain: " + atomicReference);
                rj7.f();
                return;
            }
            for (Set set : (Set[]) andSet) {
                g(set, true);
            }
        }
    }

    public final void q() {
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(null);
        if (Intrinsics.d(andSet, bow.j)) {
            return;
        }
        if (andSet instanceof Set) {
            g((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                g(set, false);
            }
            return;
        }
        if (andSet == null) {
            pq5.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            rj7.f();
        } else {
            pq5.d("corrupt pendingModifications drain: " + atomicReference);
            rj7.f();
        }
    }

    public final void r() {
        q5b q5bVar = q5b.a;
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(q5bVar);
        if (Intrinsics.d(andSet, bow.j) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            g((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            pq5.d("corrupt pendingModifications drain: " + atomicReference);
            rj7.f();
            return;
        }
        for (Set set : (Set[]) andSet) {
            g(set, false);
        }
    }

    public final void s(ArrayList arrayList) {
        wpi wpiVar = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((mfi) ((Pair) arrayList.get(i)).a).c.equals(this)) {
                pq5.c("Check failed");
                break;
            }
        }
        try {
            oq5 oq5Var = this.s;
            oq5Var.getClass();
            try {
                oq5Var.A(arrayList);
                oq5Var.i();
            } catch (Throwable th) {
                oq5Var.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!wpiVar.a.h()) {
                    new ArrayList();
                    if (!wpiVar.a.h()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            g5d g5dVar = new g5d(wpiVar);
                            while (g5dVar.hasNext()) {
                                eun eunVar = (eun) g5dVar.next();
                                g5dVar.remove();
                                eunVar.d();
                            }
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                }
                throw th2;
            } catch (Exception e) {
                d();
                throw e;
            }
        }
    }

    public final void t() {
        ymn ymnVar;
        synchronized (this.d) {
            try {
                for (Object obj : this.f.c) {
                    xmn xmnVar = obj instanceof xmn ? (xmn) obj : null;
                    if (xmnVar != null && (ymnVar = xmnVar.b) != null) {
                        ymnVar.b(xmnVar, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final gye u(xmn xmnVar, w80 w80Var, Object obj) {
        wr5 wr5Var;
        int i;
        synchronized (this.d) {
            try {
                wr5 wr5Var2 = this.p;
                if (wr5Var2 != null) {
                    fxq fxqVar = this.f;
                    int i2 = this.q;
                    if (fxqVar.g) {
                        pq5.c("Writer is active");
                    }
                    if (i2 < 0 || i2 >= fxqVar.b) {
                        pq5.c("Invalid group index");
                    }
                    if (fxqVar.q(w80Var)) {
                        int i3 = fxqVar.a[(i2 * 5) + 3] + i2;
                        int i4 = w80Var.a;
                        wr5Var = (i2 <= i4 && i4 < i3) ? wr5Var2 : null;
                    }
                    wr5Var2 = null;
                }
                if (wr5Var == null) {
                    oq5 oq5Var = this.s;
                    if (oq5Var.E && oq5Var.f0(xmnVar, obj)) {
                        return gye.d;
                    }
                    this.r.getClass();
                    this.a.getClass();
                    if (obj == null) {
                        this.n.m(xmnVar, ehv.g);
                    } else {
                        boolean z = obj instanceof zx7;
                        tpi tpiVar = this.n;
                        if (z) {
                            Object g = tpiVar.g(xmnVar);
                            if (g != null) {
                                if (g instanceof upi) {
                                    upi upiVar = (upi) g;
                                    Object[] objArr = upiVar.b;
                                    long[] jArr = upiVar.a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i5 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i5];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i6 = 8;
                                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                                int i8 = 0;
                                                while (i8 < i7) {
                                                    if ((j & 255) < 128) {
                                                        i = i6;
                                                        if (objArr[(i5 << 3) + i8] == ehv.g) {
                                                            break loop0;
                                                        }
                                                    } else {
                                                        i = i6;
                                                    }
                                                    j >>= i;
                                                    i8++;
                                                    i6 = i;
                                                }
                                                if (i7 != i6) {
                                                    break;
                                                }
                                            }
                                            if (i5 == length) {
                                                break;
                                            }
                                            i5++;
                                        }
                                    }
                                } else if (g == ehv.g) {
                                }
                            }
                            ldg.l(this.n, xmnVar, obj);
                        } else {
                            tpiVar.m(xmnVar, ehv.g);
                        }
                    }
                }
                if (wr5Var != null) {
                    return wr5Var.u(xmnVar, w80Var, obj);
                }
                this.a.k(this);
                return this.s.E ? gye.c : gye.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(Object obj) {
        Object g = this.g.g(obj);
        if (g == null) {
            return;
        }
        boolean z = g instanceof upi;
        tpi tpiVar = this.m;
        if (!z) {
            xmn xmnVar = (xmn) g;
            if (xmnVar.b(obj) == gye.d) {
                ldg.l(tpiVar, obj, xmnVar);
                return;
            }
            return;
        }
        upi upiVar = (upi) g;
        Object[] objArr = upiVar.b;
        long[] jArr = upiVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        xmn xmnVar2 = (xmn) objArr[(i << 3) + i3];
                        if (xmnVar2.b(obj) == gye.d) {
                            ldg.l(tpiVar, obj, xmnVar2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(Set set) {
        boolean z = set instanceof yso;
        tpi tpiVar = this.j;
        tpi tpiVar2 = this.g;
        if (z) {
            upi upiVar = ((yso) set).a;
            Object[] objArr = upiVar.b;
            long[] jArr = upiVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (tpiVar2.c(obj) || tpiVar.c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (tpiVar2.c(obj2) || tpiVar.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean x() {
        boolean E;
        synchronized (this.d) {
            try {
                p();
                try {
                    tpi tpiVar = this.n;
                    this.n = ldg.n();
                    try {
                        this.r.getClass();
                        this.a.getClass();
                        E = this.s.E(tpiVar);
                        if (!E) {
                            q();
                        }
                    } catch (Exception e) {
                        this.n = tpiVar;
                        throw e;
                    }
                } catch (Throwable th) {
                    try {
                        if (!this.e.a.h()) {
                            wpi wpiVar = this.e;
                            new ArrayList();
                            if (!wpiVar.a.h()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    g5d g5dVar = new g5d(wpiVar);
                                    while (((xgp) g5dVar.c).hasNext()) {
                                        eun eunVar = (eun) ((xgp) g5dVar.c).next();
                                        g5dVar.remove();
                                        eunVar.d();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e2) {
                        d();
                        throw e2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.Set[]] */
    public final void y(yso ysoVar) {
        Object obj;
        boolean z;
        yso ysoVar2;
        do {
            obj = this.c.get();
            z = true;
            if (obj == null ? true : obj.equals(bow.j)) {
                ysoVar2 = ysoVar;
            } else if (obj instanceof Set) {
                ysoVar2 = new Set[]{obj, ysoVar};
            } else {
                if (!(obj instanceof Object[])) {
                    e7o.i(this.c, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = ysoVar;
                ysoVar2 = copyOf;
            }
            AtomicReference atomicReference = this.c;
            while (true) {
                if (atomicReference.compareAndSet(obj, ysoVar2)) {
                    break;
                } else if (atomicReference.get() != obj) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (obj == null) {
            synchronized (this.d) {
                q();
            }
        }
    }

    public final void z(Object obj) {
        synchronized (this.d) {
            try {
                v(obj);
                Object g = this.j.g(obj);
                if (g != null) {
                    if (g instanceof upi) {
                        upi upiVar = (upi) g;
                        Object[] objArr = upiVar.b;
                        long[] jArr = upiVar.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            v((zx7) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                }
                                if (i == length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else {
                        v((zx7) g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
