package defpackage;

import android.os.Trace;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.f;
import androidx.compose.ui.semantics.g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class yjy0 extends e530 implements v0y, pam, gnq0 {
    public int A;
    public List B;
    public tls C;
    public lkq0 D;
    public xfc E;
    public xt3 F;
    public tls G;
    public Map H;
    public km40 I;
    public wjy0 J;
    public xjy0 K;
    public kk2 a;
    public ety0 b;
    public dyr c;
    public tls w;
    public int x;
    public boolean y;
    public int z;

    public yjy0(kk2 kk2Var, ety0 ety0Var, dyr dyrVar, tls tlsVar, int i, boolean z, int i2, int i3, List list, tls tlsVar2, lkq0 lkq0Var, xfc xfcVar, xt3 xt3Var, tls tlsVar3) {
        this.a = kk2Var;
        this.b = ety0Var;
        this.c = dyrVar;
        this.w = tlsVar;
        this.x = i;
        this.y = z;
        this.z = i2;
        this.A = i3;
        this.B = list;
        this.C = tlsVar2;
        this.D = lkq0Var;
        this.E = xfcVar;
        this.F = xt3Var;
        this.G = tlsVar3;
    }

    public final void E0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            km40 F0 = F0();
            kk2 kk2Var = this.a;
            ety0 ety0Var = this.b;
            dyr dyrVar = this.c;
            int i = this.x;
            boolean z5 = this.y;
            int i2 = this.z;
            int i3 = this.A;
            List list = this.B;
            xt3 xt3Var = this.F;
            F0.a = kk2Var;
            F0.f(ety0Var);
            F0.b = dyrVar;
            F0.c = i;
            F0.d = z5;
            F0.e = i2;
            F0.f = i3;
            F0.g = list;
            F0.h = xt3Var;
            F0.s = (F0.s << 2) | 2;
            F0.m = null;
            F0.o = null;
            F0.q = -1;
            F0.p = -1;
            F0.r = null;
        }
        if (isAttached()) {
            if (z2 || (z && this.J != null)) {
                qje.P(this).D();
            }
            if (z2 || z3 || z4) {
                qje.P(this).C();
                rzo.D(this);
            }
            if (z) {
                rzo.D(this);
            }
        }
    }

    public final km40 F0() {
        if (this.I == null) {
            this.I = new km40(this.a, this.b, this.c, this.x, this.y, this.z, this.A, this.B, this.F);
        }
        return this.I;
    }

    public final km40 G0(fwi fwiVar) {
        km40 km40Var;
        xjy0 xjy0Var = this.K;
        if (xjy0Var != null && xjy0Var.c && (km40Var = xjy0Var.d) != null) {
            km40Var.d(fwiVar);
            return km40Var;
        }
        km40 F0 = F0();
        F0.d(fwiVar);
        return F0;
    }

    public final boolean H0(tls tlsVar, tls tlsVar2, lkq0 lkq0Var, tls tlsVar3) {
        boolean z;
        if (this.w != tlsVar) {
            this.w = tlsVar;
            z = true;
        } else {
            z = false;
        }
        if (this.C != tlsVar2) {
            this.C = tlsVar2;
            z = true;
        }
        if (!jl40.l(this.D, lkq0Var)) {
            this.D = lkq0Var;
            z = true;
        }
        if (this.G == tlsVar3) {
            return z;
        }
        this.G = tlsVar3;
        return true;
    }

    public final boolean I0(ety0 ety0Var, List list, int i, int i2, boolean z, dyr dyrVar, int i3, xt3 xt3Var) {
        boolean z2 = !this.b.c(ety0Var);
        this.b = ety0Var;
        if (!jl40.l(this.B, list)) {
            this.B = list;
            z2 = true;
        }
        if (this.A != i) {
            this.A = i;
            z2 = true;
        }
        if (this.z != i2) {
            this.z = i2;
            z2 = true;
        }
        if (this.y != z) {
            this.y = z;
            z2 = true;
        }
        if (!jl40.l(this.c, dyrVar)) {
            this.c = dyrVar;
            z2 = true;
        }
        if (this.x != i3) {
            this.x = i3;
            z2 = true;
        }
        if (jl40.l(this.F, xt3Var)) {
            return z2;
        }
        this.F = xt3Var;
        return true;
    }

    public final boolean J0(kk2 kk2Var) {
        boolean l = jl40.l(this.a.b, kk2Var.b);
        boolean z = (l && jl40.l(this.a.a, kk2Var.a)) ? false : true;
        if (z) {
            this.a = kk2Var;
        }
        if (!l) {
            this.K = null;
        }
        return z;
    }

    @Override // defpackage.v0y
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return jlb1.a(G0(lookaheadCapablePlaceable).e(lookaheadCapablePlaceable.getLayoutDirection()).d());
    }

    @Override // defpackage.v0y
    public final int b(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return jlb1.a(G0(lookaheadCapablePlaceable).e(lookaheadCapablePlaceable.getLayoutDirection()).b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [i28] */
    /* JADX WARN: Type inference failed for: r18v6 */
    @Override // defpackage.pam
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(c1y c1yVar) {
        long j;
        dry0 dry0Var;
        ?? r18;
        i28 i28Var;
        List list;
        ckq0 ckq0Var;
        nfh nfhVar;
        long j2;
        dry0 dry0Var2;
        k28 k28Var = c1yVar.a;
        if (!isAttached()) {
            return;
        }
        lkq0 lkq0Var = this.D;
        if (lkq0Var != null && (ckq0Var = (ckq0) lkq0Var.b.a().e(lkq0Var.a)) != null) {
            bkq0 bkq0Var = ckq0Var.b;
            bkq0 bkq0Var2 = ckq0Var.a;
            boolean z = ckq0Var.c;
            int i = !z ? bkq0Var2.b : bkq0Var.b;
            int i2 = !z ? bkq0Var.b : bkq0Var2.b;
            if (i != i2) {
                ho40 ho40Var = lkq0Var.x;
                int b = (ho40Var == null || (dry0Var2 = (dry0) ho40Var.c.invoke()) == null) ? 0 : ho40Var.b(dry0Var2);
                if (i > b) {
                    i = b;
                }
                if (i2 > b) {
                    i2 = b;
                }
                dry0 dry0Var3 = (dry0) lkq0Var.w.c;
                jb2 m = dry0Var3 != null ? dry0Var3.m(i, i2) : null;
                if (m != null) {
                    dry0 dry0Var4 = (dry0) lkq0Var.w.c;
                    if (dry0Var4 == null || dry0Var4.a.f == 3 || !dry0Var4.f()) {
                        j = 4294967295L;
                        qam.Y(c1yVar, m, lkq0Var.c, null, 60);
                    } else {
                        float intBitsToFloat = Float.intBitsToFloat((int) (k28Var.c() >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (k28Var.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                        nfh nfhVar2 = k28Var.b;
                        long v = nfhVar2.v();
                        nfhVar2.q().save();
                        try {
                            r18 = 1;
                            ((cot) nfhVar2.a).f(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, 1);
                            nfhVar = nfhVar2;
                            try {
                                j = 4294967295L;
                                j2 = v;
                                try {
                                    qam.Y(c1yVar, m, lkq0Var.c, null, 60);
                                    b64.C(nfhVar, j2);
                                } catch (Throwable th) {
                                    th = th;
                                    b64.C(nfhVar, j2);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                j2 = v;
                                b64.C(nfhVar, j2);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            nfhVar = nfhVar2;
                        }
                    }
                    i28 q = k28Var.b.q();
                    km40 G0 = G0(c1yVar);
                    dry0Var = G0.o;
                    if (dry0Var != null) {
                        yci0.k(G0, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ");
                        return;
                    }
                    hm40 hm40Var = dry0Var.b;
                    boolean z2 = dry0Var.f() && this.x != 3;
                    if (z2) {
                        long j3 = dry0Var.c;
                        zii0 b2 = wwg.b(0L, (Float.floatToRawIntBits((int) (j3 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j3 & j)) & j));
                        q.save();
                        i28.g(q, b2);
                    }
                    try {
                        bmt0 bmt0Var = this.b.a;
                        rly0 rly0Var = bmt0Var.m;
                        if (rly0Var == null) {
                            rly0Var = rly0.b;
                        }
                        rly0 rly0Var2 = rly0Var;
                        bgr0 bgr0Var = bmt0Var.n;
                        if (bgr0Var == null) {
                            bgr0Var = bgr0.d;
                        }
                        bgr0 bgr0Var2 = bgr0Var;
                        ram ramVar = bmt0Var.p;
                        if (ramVar == null) {
                            ramVar = i3r.a;
                        }
                        ram ramVar2 = ramVar;
                        ml6 c = bmt0Var.a.c();
                        try {
                            if (c != null) {
                                i28Var = q;
                                hm40Var.j(i28Var, c, this.b.a.a.a(), bgr0Var2, rly0Var2, ramVar2);
                            } else {
                                i28Var = q;
                                xfc xfcVar = this.E;
                                long a = xfcVar != null ? xfcVar.a() : ldc.m;
                                if (a == 16) {
                                    a = this.b.b() != 16 ? this.b.b() : ldc.b;
                                }
                                hm40Var.i(i28Var, a, bgr0Var2, rly0Var2, ramVar2);
                            }
                            if (z2) {
                                i28Var.n();
                            }
                            xjy0 xjy0Var = this.K;
                            if (((xjy0Var == null || !xjy0Var.c) ? ilb1.b(this.a) : false) || !((list = this.B) == null || list.isEmpty())) {
                                c1yVar.a();
                                return;
                            }
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            if (z2) {
                                r18.n();
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r18 = q;
                    }
                }
            }
        }
        j = 4294967295L;
        i28 q2 = k28Var.b.q();
        km40 G02 = G0(c1yVar);
        dry0Var = G02.o;
        if (dry0Var != null) {
        }
    }

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            km40 G0 = G0(kVar);
            boolean c = G0.c(j, kVar.getLayoutDirection());
            dry0 dry0Var = G0.o;
            if (dry0Var == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + G0);
            }
            long j2 = dry0Var.c;
            dry0Var.b.a.a();
            if (c) {
                qje.N(this, 2).i1();
                tls tlsVar = this.w;
                if (tlsVar != null) {
                    tlsVar.invoke(dry0Var);
                }
                lkq0 lkq0Var = this.D;
                if (lkq0Var != null) {
                    lkq0Var.a(dry0Var);
                }
                Map map = this.H;
                if (map == null) {
                    map = new LinkedHashMap(2);
                }
                map.put(a.a, Integer.valueOf(Math.round(dry0Var.d)));
                map.put(a.b, Integer.valueOf(Math.round(dry0Var.e)));
                this.H = map;
            }
            tls tlsVar2 = this.C;
            if (tlsVar2 != null) {
                tlsVar2.invoke(dry0Var.f);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            return kVar.w(i, i2, this.H, new q83(x910Var.l0(qje.m(i, i, i2, i2)), 12));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.v0y
    public final int l0(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return G0(lookaheadCapablePlaceable).a(i, lookaheadCapablePlaceable.getLayoutDirection());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [wjy0] */
    @Override // defpackage.gnq0
    public final void u(mnq0 mnq0Var) {
        wjy0 wjy0Var = this.J;
        wjy0 wjy0Var2 = wjy0Var;
        if (wjy0Var == null) {
            final int i = 0;
            ?? r0 = new tls(this) { // from class: wjy0
                public final /* synthetic */ yjy0 b;

                {
                    this.b = this;
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    boolean z;
                    int i2 = i;
                    dry0 dry0Var = null;
                    yjy0 yjy0Var = this.b;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            dry0 dry0Var2 = yjy0Var.F0().o;
                            if (dry0Var2 != null) {
                                cry0 cry0Var = dry0Var2.a;
                                kk2 kk2Var = cry0Var.a;
                                ety0 ety0Var = yjy0Var.b;
                                xfc xfcVar = yjy0Var.E;
                                dry0 dry0Var3 = new dry0(new cry0(kk2Var, ety0.e(ety0Var, xfcVar != null ? xfcVar.a() : ldc.m, 0L, null, null, null, 0L, null, 0, 0L, 16777214), cry0Var.c, cry0Var.d, cry0Var.e, cry0Var.f, cry0Var.g, cry0Var.h, cry0Var.i, cry0Var.j), dry0Var2.b, dry0Var2.c);
                                list.add(dry0Var3);
                                dry0Var = dry0Var3;
                            }
                            return Boolean.valueOf(dry0Var != null);
                        case 1:
                            kk2 kk2Var2 = (kk2) obj;
                            xjy0 xjy0Var = yjy0Var.K;
                            EmptyList emptyList = EmptyList.a;
                            if (xjy0Var == null) {
                                xjy0 xjy0Var2 = new xjy0(yjy0Var.a, kk2Var2);
                                km40 km40Var = new km40(kk2Var2, yjy0Var.b, yjy0Var.c, yjy0Var.x, yjy0Var.y, yjy0Var.z, yjy0Var.A, emptyList, yjy0Var.F);
                                km40Var.d(yjy0Var.F0().k);
                                xjy0Var2.d = km40Var;
                                yjy0Var.K = xjy0Var2;
                            } else if (!jl40.l(kk2Var2, xjy0Var.b)) {
                                xjy0Var.b = kk2Var2;
                                km40 km40Var2 = xjy0Var.d;
                                if (km40Var2 != null) {
                                    ety0 ety0Var2 = yjy0Var.b;
                                    dyr dyrVar = yjy0Var.c;
                                    int i3 = yjy0Var.x;
                                    boolean z2 = yjy0Var.y;
                                    int i4 = yjy0Var.z;
                                    int i5 = yjy0Var.A;
                                    xt3 xt3Var = yjy0Var.F;
                                    km40Var2.a = kk2Var2;
                                    km40Var2.f(ety0Var2);
                                    km40Var2.b = dyrVar;
                                    km40Var2.c = i3;
                                    km40Var2.d = z2;
                                    km40Var2.e = i4;
                                    km40Var2.f = i5;
                                    km40Var2.g = emptyList;
                                    km40Var2.h = xt3Var;
                                    km40Var2.s = (km40Var2.s << 2) | 2;
                                    km40Var2.m = null;
                                    km40Var2.o = null;
                                    km40Var2.q = -1;
                                    km40Var2.p = -1;
                                    km40Var2.r = null;
                                }
                            }
                            qje.P(yjy0Var).D();
                            qje.P(yjy0Var).C();
                            rzo.D(yjy0Var);
                            return Boolean.TRUE;
                        default:
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            xjy0 xjy0Var3 = yjy0Var.K;
                            if (xjy0Var3 == null) {
                                z = false;
                            } else {
                                tls tlsVar = yjy0Var.G;
                                if (tlsVar != null) {
                                    tlsVar.invoke(xjy0Var3);
                                }
                                xjy0 xjy0Var4 = yjy0Var.K;
                                if (xjy0Var4 != null) {
                                    xjy0Var4.c = booleanValue;
                                }
                                qje.P(yjy0Var).D();
                                qje.P(yjy0Var).C();
                                rzo.D(yjy0Var);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.J = r0;
            wjy0Var2 = r0;
        }
        f.t(mnq0Var, this.a);
        xjy0 xjy0Var = this.K;
        if (xjy0Var != null) {
            kk2 kk2Var = xjy0Var.b;
            g gVar = d.D;
            kgx[] kgxVarArr = f.a;
            kgx kgxVar = kgxVarArr[16];
            mnq0Var.a(gVar, kk2Var);
            boolean z = xjy0Var.c;
            g gVar2 = d.E;
            kgx kgxVar2 = kgxVarArr[17];
            mnq0Var.a(gVar2, Boolean.valueOf(z));
        }
        final int i2 = 1;
        mnq0Var.a(androidx.compose.ui.semantics.a.l, new ag(null, new tls(this) { // from class: wjy0
            public final /* synthetic */ yjy0 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                boolean z2;
                int i22 = i2;
                dry0 dry0Var = null;
                yjy0 yjy0Var = this.b;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        dry0 dry0Var2 = yjy0Var.F0().o;
                        if (dry0Var2 != null) {
                            cry0 cry0Var = dry0Var2.a;
                            kk2 kk2Var2 = cry0Var.a;
                            ety0 ety0Var = yjy0Var.b;
                            xfc xfcVar = yjy0Var.E;
                            dry0 dry0Var3 = new dry0(new cry0(kk2Var2, ety0.e(ety0Var, xfcVar != null ? xfcVar.a() : ldc.m, 0L, null, null, null, 0L, null, 0, 0L, 16777214), cry0Var.c, cry0Var.d, cry0Var.e, cry0Var.f, cry0Var.g, cry0Var.h, cry0Var.i, cry0Var.j), dry0Var2.b, dry0Var2.c);
                            list.add(dry0Var3);
                            dry0Var = dry0Var3;
                        }
                        return Boolean.valueOf(dry0Var != null);
                    case 1:
                        kk2 kk2Var22 = (kk2) obj;
                        xjy0 xjy0Var2 = yjy0Var.K;
                        EmptyList emptyList = EmptyList.a;
                        if (xjy0Var2 == null) {
                            xjy0 xjy0Var22 = new xjy0(yjy0Var.a, kk2Var22);
                            km40 km40Var = new km40(kk2Var22, yjy0Var.b, yjy0Var.c, yjy0Var.x, yjy0Var.y, yjy0Var.z, yjy0Var.A, emptyList, yjy0Var.F);
                            km40Var.d(yjy0Var.F0().k);
                            xjy0Var22.d = km40Var;
                            yjy0Var.K = xjy0Var22;
                        } else if (!jl40.l(kk2Var22, xjy0Var2.b)) {
                            xjy0Var2.b = kk2Var22;
                            km40 km40Var2 = xjy0Var2.d;
                            if (km40Var2 != null) {
                                ety0 ety0Var2 = yjy0Var.b;
                                dyr dyrVar = yjy0Var.c;
                                int i3 = yjy0Var.x;
                                boolean z22 = yjy0Var.y;
                                int i4 = yjy0Var.z;
                                int i5 = yjy0Var.A;
                                xt3 xt3Var = yjy0Var.F;
                                km40Var2.a = kk2Var22;
                                km40Var2.f(ety0Var2);
                                km40Var2.b = dyrVar;
                                km40Var2.c = i3;
                                km40Var2.d = z22;
                                km40Var2.e = i4;
                                km40Var2.f = i5;
                                km40Var2.g = emptyList;
                                km40Var2.h = xt3Var;
                                km40Var2.s = (km40Var2.s << 2) | 2;
                                km40Var2.m = null;
                                km40Var2.o = null;
                                km40Var2.q = -1;
                                km40Var2.p = -1;
                                km40Var2.r = null;
                            }
                        }
                        qje.P(yjy0Var).D();
                        qje.P(yjy0Var).C();
                        rzo.D(yjy0Var);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        xjy0 xjy0Var3 = yjy0Var.K;
                        if (xjy0Var3 == null) {
                            z2 = false;
                        } else {
                            tls tlsVar = yjy0Var.G;
                            if (tlsVar != null) {
                                tlsVar.invoke(xjy0Var3);
                            }
                            xjy0 xjy0Var4 = yjy0Var.K;
                            if (xjy0Var4 != null) {
                                xjy0Var4.c = booleanValue;
                            }
                            qje.P(yjy0Var).D();
                            qje.P(yjy0Var).C();
                            rzo.D(yjy0Var);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final int i3 = 2;
        mnq0Var.a(androidx.compose.ui.semantics.a.m, new ag(null, new tls(this) { // from class: wjy0
            public final /* synthetic */ yjy0 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                boolean z2;
                int i22 = i3;
                dry0 dry0Var = null;
                yjy0 yjy0Var = this.b;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        dry0 dry0Var2 = yjy0Var.F0().o;
                        if (dry0Var2 != null) {
                            cry0 cry0Var = dry0Var2.a;
                            kk2 kk2Var2 = cry0Var.a;
                            ety0 ety0Var = yjy0Var.b;
                            xfc xfcVar = yjy0Var.E;
                            dry0 dry0Var3 = new dry0(new cry0(kk2Var2, ety0.e(ety0Var, xfcVar != null ? xfcVar.a() : ldc.m, 0L, null, null, null, 0L, null, 0, 0L, 16777214), cry0Var.c, cry0Var.d, cry0Var.e, cry0Var.f, cry0Var.g, cry0Var.h, cry0Var.i, cry0Var.j), dry0Var2.b, dry0Var2.c);
                            list.add(dry0Var3);
                            dry0Var = dry0Var3;
                        }
                        return Boolean.valueOf(dry0Var != null);
                    case 1:
                        kk2 kk2Var22 = (kk2) obj;
                        xjy0 xjy0Var2 = yjy0Var.K;
                        EmptyList emptyList = EmptyList.a;
                        if (xjy0Var2 == null) {
                            xjy0 xjy0Var22 = new xjy0(yjy0Var.a, kk2Var22);
                            km40 km40Var = new km40(kk2Var22, yjy0Var.b, yjy0Var.c, yjy0Var.x, yjy0Var.y, yjy0Var.z, yjy0Var.A, emptyList, yjy0Var.F);
                            km40Var.d(yjy0Var.F0().k);
                            xjy0Var22.d = km40Var;
                            yjy0Var.K = xjy0Var22;
                        } else if (!jl40.l(kk2Var22, xjy0Var2.b)) {
                            xjy0Var2.b = kk2Var22;
                            km40 km40Var2 = xjy0Var2.d;
                            if (km40Var2 != null) {
                                ety0 ety0Var2 = yjy0Var.b;
                                dyr dyrVar = yjy0Var.c;
                                int i32 = yjy0Var.x;
                                boolean z22 = yjy0Var.y;
                                int i4 = yjy0Var.z;
                                int i5 = yjy0Var.A;
                                xt3 xt3Var = yjy0Var.F;
                                km40Var2.a = kk2Var22;
                                km40Var2.f(ety0Var2);
                                km40Var2.b = dyrVar;
                                km40Var2.c = i32;
                                km40Var2.d = z22;
                                km40Var2.e = i4;
                                km40Var2.f = i5;
                                km40Var2.g = emptyList;
                                km40Var2.h = xt3Var;
                                km40Var2.s = (km40Var2.s << 2) | 2;
                                km40Var2.m = null;
                                km40Var2.o = null;
                                km40Var2.q = -1;
                                km40Var2.p = -1;
                                km40Var2.r = null;
                            }
                        }
                        qje.P(yjy0Var).D();
                        qje.P(yjy0Var).C();
                        rzo.D(yjy0Var);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        xjy0 xjy0Var3 = yjy0Var.K;
                        if (xjy0Var3 == null) {
                            z2 = false;
                        } else {
                            tls tlsVar = yjy0Var.G;
                            if (tlsVar != null) {
                                tlsVar.invoke(xjy0Var3);
                            }
                            xjy0 xjy0Var4 = yjy0Var.K;
                            if (xjy0Var4 != null) {
                                xjy0Var4.c = booleanValue;
                            }
                            qje.P(yjy0Var).D();
                            qje.P(yjy0Var).C();
                            rzo.D(yjy0Var);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        mnq0Var.a(androidx.compose.ui.semantics.a.n, new ag(null, new oew0(15, this)));
        f.c(mnq0Var, wjy0Var2);
    }

    @Override // defpackage.v0y
    public final int v(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return G0(lookaheadCapablePlaceable).a(i, lookaheadCapablePlaceable.getLayoutDirection());
    }
}
