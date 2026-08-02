package ru.yandex.logistics.sdk.cargo_form.impl.ui.common;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import defpackage.aii0;
import defpackage.avs0;
import defpackage.b64;
import defpackage.bts;
import defpackage.bvs0;
import defpackage.c1p0;
import defpackage.c36;
import defpackage.c530;
import defpackage.clb1;
import defpackage.cma1;
import defpackage.cvs0;
import defpackage.did;
import defpackage.dvs0;
import defpackage.e3k0;
import defpackage.e3o0;
import defpackage.el51;
import defpackage.evs0;
import defpackage.f530;
import defpackage.fa6;
import defpackage.fid;
import defpackage.fj91;
import defpackage.fnq0;
import defpackage.fvs0;
import defpackage.gl51;
import defpackage.gvs0;
import defpackage.gxv;
import defpackage.gza1;
import defpackage.hvs0;
import defpackage.i43;
import defpackage.ib51;
import defpackage.iib;
import defpackage.ivs0;
import defpackage.j76;
import defpackage.jl40;
import defpackage.jvs0;
import defpackage.jz2;
import defpackage.kfr0;
import defpackage.khl0;
import defpackage.l27;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lvi0;
import defpackage.nvs0;
import defpackage.o360;
import defpackage.o430;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.ovs0;
import defpackage.oz40;
import defpackage.ppr0;
import defpackage.qeg0;
import defpackage.qje;
import defpackage.quq0;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.rma1;
import defpackage.rsb1;
import defpackage.rzh0;
import defpackage.s3b1;
import defpackage.scs0;
import defpackage.sls;
import defpackage.teb;
import defpackage.tls;
import defpackage.tm91;
import defpackage.tra1;
import defpackage.ttm;
import defpackage.unr0;
import defpackage.vus0;
import defpackage.w01;
import defpackage.w0f;
import defpackage.w3b1;
import defpackage.w7o0;
import defpackage.wls;
import defpackage.wu60;
import defpackage.wus0;
import defpackage.wwg;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.xlp0;
import defpackage.xus0;
import defpackage.yus0;
import defpackage.zoa1;
import defpackage.zpn;
import defpackage.zus0;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.control.CounterSize;
import ru.yandex.taxi.logistics.sdk.ui.component.control.e;

/* loaded from: classes5.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(jvs0 jvs0Var, boolean z, boolean z2, tls tlsVar, tls tlsVar2, fid fidVar, int i, int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        tls tlsVar3;
        tls tlsVar4;
        boolean z5;
        boolean z6;
        aii0 v;
        zy11 zy11Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1495899105);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? btsVar.k(jvs0Var) : btsVar.e(jvs0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z3 = z;
            i3 |= btsVar.a(z3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z4 = z2;
                i3 |= btsVar.a(z4) ? 256 : 128;
                if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    tlsVar3 = tlsVar;
                    i3 |= btsVar.e(tlsVar3) ? 2048 : 1024;
                } else {
                    tlsVar3 = tlsVar;
                }
                if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    tlsVar4 = tlsVar2;
                    i3 |= btsVar.e(tlsVar4) ? 16384 : 8192;
                } else {
                    tlsVar4 = tlsVar2;
                }
                if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
                    boolean z7 = i5 != 0 ? false : z3;
                    boolean z8 = i4 != 0 ? false : z4;
                    androidx.compose.runtime.internal.a S = wwg.S(2146686590, true, new kfr0(z7 ? jvs0Var.a() : 0.0f, z8 ? jvs0Var.c() : 0.0f, jvs0Var, tlsVar3, tlsVar4), btsVar);
                    String d = jvs0Var.d();
                    if (d == null) {
                        btsVar.e0(252525221);
                        btsVar.t(false);
                        zy11Var = null;
                    } else {
                        btsVar.e0(252525222);
                        ib51.a(d, wwg.S(1858690504, true, new jz2(S, 4), btsVar), btsVar, 48);
                        btsVar.t(false);
                        zy11Var = zy11.a;
                    }
                    if (zy11Var == null) {
                        btsVar.e0(1255074984);
                        S.invoke(btsVar, 6);
                    } else {
                        btsVar.e0(1255071295);
                    }
                    btsVar.t(false);
                    z5 = z7;
                    z6 = z8;
                } else {
                    btsVar.Y();
                    z5 = z3;
                    z6 = z4;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new o360(jvs0Var, z5, z6, tlsVar, tlsVar2, i, i2);
                    return;
                }
                return;
            }
            z4 = z2;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            }
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            }
            if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        z3 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z4 = z2;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void b(final vus0 vus0Var, final tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2101375268);
        final int i2 = 2;
        int i3 = i | (btsVar.k(vus0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        final int i4 = 0;
        final int i5 = 1;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            androidx.compose.runtime.internal.a S = wwg.S(1738397380, true, new e3o0(22, vus0Var), btsVar);
            int i6 = i3 & 14;
            boolean z = i6 == 4;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new quq0(20, vus0Var);
                btsVar.o0(Q);
            }
            l27 l27Var = new l27((tls) Q);
            int i7 = ovs0.a[vus0Var.c.ordinal()];
            if (i7 == 1) {
                btsVar.e0(787020213);
                boolean z2 = (i6 == 4) | ((i3 & 112) == 32);
                Object Q2 = btsVar.Q();
                if (z2 || Q2 == o430Var) {
                    Q2 = new sls() { // from class: kvs0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i8 = i4;
                            zy11 zy11Var = zy11.a;
                            vus0 vus0Var2 = vus0Var;
                            tls tlsVar2 = tlsVar;
                            switch (i8) {
                                case 0:
                                    tlsVar2.invoke(vus0Var2.d);
                                    break;
                                case 1:
                                    tlsVar2.invoke(vus0Var2.d);
                                    break;
                                default:
                                    tlsVar2.invoke(vus0Var2.d);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar.o0(Q2);
                }
                ru.yandex.taxi.logistics.sdk.ui.component.control.a.a((sls) Q2, null, null, 0L, 0L, null, false, null, null, l27Var, wwg.S(289344981, true, new jz2(S, 1), btsVar), btsVar, 0, 2046);
                btsVar = btsVar;
                btsVar.t(false);
            } else if (i7 == 2) {
                btsVar.e0(787026934);
                boolean z3 = (i6 == 4) | ((i3 & 112) == 32);
                Object Q3 = btsVar.Q();
                if (z3 || Q3 == o430Var) {
                    Q3 = new sls() { // from class: kvs0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i8 = i5;
                            zy11 zy11Var = zy11.a;
                            vus0 vus0Var2 = vus0Var;
                            tls tlsVar2 = tlsVar;
                            switch (i8) {
                                case 0:
                                    tlsVar2.invoke(vus0Var2.d);
                                    break;
                                case 1:
                                    tlsVar2.invoke(vus0Var2.d);
                                    break;
                                default:
                                    tlsVar2.invoke(vus0Var2.d);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar.o0(Q3);
                }
                ru.yandex.taxi.logistics.sdk.ui.component.control.a.f((sls) Q3, null, null, 0L, 0L, null, null, false, null, null, l27Var, wwg.S(-1037506436, true, new jz2(S, 2), btsVar), btsVar, 0, 2046);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                if (i7 != 3) {
                    throw unr0.y(787017935, btsVar, false);
                }
                btsVar.e0(787033615);
                boolean z4 = ((i3 & 112) == 32) | (i6 == 4);
                Object Q4 = btsVar.Q();
                if (z4 || Q4 == o430Var) {
                    Q4 = new sls() { // from class: kvs0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i8 = i2;
                            zy11 zy11Var = zy11.a;
                            vus0 vus0Var2 = vus0Var;
                            tls tlsVar2 = tlsVar;
                            switch (i8) {
                                case 0:
                                    tlsVar2.invoke(vus0Var2.d);
                                    break;
                                case 1:
                                    tlsVar2.invoke(vus0Var2.d);
                                    break;
                                default:
                                    tlsVar2.invoke(vus0Var2.d);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar.o0(Q4);
                }
                ru.yandex.taxi.logistics.sdk.ui.component.control.a.b((sls) Q4, null, null, 0L, 0L, null, null, null, false, null, null, l27Var, wwg.S(-1613443357, true, new jz2(S, 3), btsVar), btsVar, 0, 384, 2046);
                btsVar = btsVar;
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c1p0(vus0Var, tlsVar, i, 16);
        }
    }

    public static final void c(wus0 wus0Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1250451285);
        int i2 = i | (btsVar2.k(wus0Var) ? 4 : 2) | (btsVar2.e(tlsVar) ? 32 : 16) | (btsVar2.e(tlsVar2) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean z = ((i2 & 112) == 32) | (i3 == 4);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new SlotTrailKt$TrailCheckbox$1$1(tlsVar, wus0Var, null);
                btsVar2.o0(Q);
            }
            zpn.e(btsVar2, (wls) Q, zy11.a);
            boolean z2 = wus0Var.e;
            f530 f530Var = c530.a;
            if (z2) {
                f530Var = fnq0.a(f530Var, new teb(20));
            }
            fa6 fa6Var = wus0Var.a;
            boolean z3 = fa6Var.a;
            boolean z4 = fa6Var.b;
            boolean z5 = ((i2 & 896) == 256) | (i3 == 4);
            Object Q2 = btsVar2.Q();
            if (z5 || Q2 == o430Var) {
                Q2 = new scs0(5, tlsVar2, wus0Var);
                btsVar2.o0(Q2);
            }
            btsVar = btsVar2;
            clb1.a(f530Var, z3, z4, null, iib.d, 0L, 0L, 0L, (tls) Q2, null, 0, btsVar, 0, 1768);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0((Object) wus0Var, (Object) tlsVar, (Object) tlsVar2, i, 26);
        }
    }

    public static final void d(final xus0 xus0Var, final tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-530871804);
        int i2 = (btsVar.k(xus0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            w0f w0fVar = xus0Var.a;
            String str = w0fVar.a;
            CounterSize counterSize = CounterSize.S;
            boolean z = w0fVar.b;
            boolean z2 = w0fVar.c;
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z3 = (i3 == 32) | (i4 == 4);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z3 || Q == o430Var) {
                Q = new sls() { // from class: lvs0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = r3;
                        zy11 zy11Var = zy11.a;
                        xus0 xus0Var2 = xus0Var;
                        tls tlsVar2 = tlsVar;
                        switch (i5) {
                            case 0:
                                tlsVar2.invoke(xus0Var2.a.d);
                                break;
                            default:
                                tlsVar2.invoke(xus0Var2.a.e);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q);
            }
            sls slsVar = (sls) Q;
            int i5 = (i3 == 32 ? 1 : 0) | (i4 == 4 ? 1 : 0);
            Object Q2 = btsVar.Q();
            if (i5 != 0 || Q2 == o430Var) {
                final int i6 = 1;
                Q2 = new sls() { // from class: lvs0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i52 = i6;
                        zy11 zy11Var = zy11.a;
                        xus0 xus0Var2 = xus0Var;
                        tls tlsVar2 = tlsVar;
                        switch (i52) {
                            case 0:
                                tlsVar2.invoke(xus0Var2.a.d);
                                break;
                            default:
                                tlsVar2.invoke(xus0Var2.a.e);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q2);
            }
            rsb1.a(null, str, slsVar, (sls) Q2, z, z2, 0L, 0L, counterSize, btsVar, 100663296, 193);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c1p0(xus0Var, tlsVar, i, 17);
        }
    }

    public static final void e(yus0 yus0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(630965507);
        int i2 = (btsVar.k(yus0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            s3b1.f(yus0Var.a, null, null, btsVar, 0, 6);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e3o0(yus0Var, i, 23);
        }
    }

    public static final void f(zus0 zus0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(71972658);
        int i2 = (btsVar.k(zus0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            lvi0 lvi0Var = zus0Var.a;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ppr0(18, tlsVar, zus0Var);
                btsVar.o0(Q);
            }
            s3b1.c(lvi0Var, null, false, null, false, null, (sls) Q, btsVar, 0, 62);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c1p0(zus0Var, tlsVar, i, 19);
        }
    }

    public static final void g(avs0 avs0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2114486591);
        int i2 = (btsVar.k(avs0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            w3b1.a(avs0Var.a, null, null, btsVar, 0, 6);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e3o0(avs0Var, i, 25);
        }
    }

    public static final void h(bvs0 bvs0Var, fid fidVar, int i) {
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(27613713);
        int i2 = (btsVar.k(bvs0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            ldc ldcVar = bvs0Var != null ? bvs0Var.a : null;
            if (ldcVar == null) {
                btsVar.e0(766979225);
                j = ((el51) btsVar.m(gl51.a)).j();
                btsVar.t(false);
            } else {
                btsVar.e0(766978016);
                btsVar.t(false);
                j = ldcVar.a;
            }
            j76.c(null, null, null, 0.0f, new c36(j, 5), btsVar, 0, 31);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e3o0(bvs0Var, i, 24);
        }
    }

    public static final void i(cvs0 cvs0Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(509394743);
        int i2 = i | (btsVar2.k(cvs0Var) ? 4 : 2) | (btsVar2.e(tlsVar) ? 32 : 16) | (btsVar2.e(tlsVar2) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean z = ((i2 & 112) == 32) | (i3 == 4);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new SlotTrailKt$TrailRadio$1$1(tlsVar, cvs0Var, null);
                btsVar2.o0(Q);
            }
            zpn.e(btsVar2, (wls) Q, zy11.a);
            boolean z2 = cvs0Var.e;
            f530 f530Var = c530.a;
            if (z2) {
                f530Var = fnq0.a(f530Var, new teb(20));
            }
            fa6 fa6Var = cvs0Var.a;
            boolean z3 = fa6Var.a;
            boolean z4 = fa6Var.b;
            boolean z5 = ((i2 & 896) == 256) | (i3 == 4);
            Object Q2 = btsVar2.Q();
            if (z5 || Q2 == o430Var) {
                Q2 = new scs0(6, tlsVar2, cvs0Var);
                btsVar2.o0(Q2);
            }
            btsVar = btsVar2;
            clb1.a(f530Var, z3, z4, null, iib.f, 0L, 0L, 0L, (tls) Q2, null, 3, btsVar, 0, 744);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0((Object) cvs0Var, (Object) tlsVar, (Object) tlsVar2, i, 29);
        }
    }

    public static final void j(dvs0 dvs0Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1772407431);
        int i2 = i | (btsVar.k(dvs0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.e(tlsVar2) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean z = ((i2 & 112) == 32) | (i3 == 4);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new SlotTrailKt$TrailRichCheckControl$1$1(tlsVar, dvs0Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            boolean z2 = dvs0Var.f;
            f530 f530Var = c530.a;
            if (z2) {
                f530Var = fnq0.a(f530Var, new teb(20));
            }
            f530 f530Var2 = f530Var;
            float f = dvs0Var.a;
            e3k0 e3k0Var = dvs0Var.b;
            CharSequence charSequence = e3k0Var.a;
            boolean z3 = e3k0Var.b.a;
            boolean z4 = ((i2 & 896) == 256) | (i3 == 4);
            Object Q2 = btsVar.Q();
            if (z4 || Q2 == o430Var) {
                Q2 = new scs0(7, tlsVar2, dvs0Var);
                btsVar.o0(Q2);
            }
            zoa1.a(charSequence, f530Var2, f, z3, 0L, 0L, 0L, (tls) Q2, btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nvs0((Object) dvs0Var, (Object) tlsVar, (Object) tlsVar2, i, 0);
        }
    }

    public static final void k(evs0 evs0Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1060885113);
        int i2 = i | (btsVar.k(evs0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.e(tlsVar2) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.j(evs0Var.a, null, 0L, 0L, 0.0f, tlsVar, tlsVar2, btsVar, (i2 << 12) & 4128768, 30);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0((Object) evs0Var, (Object) tlsVar, (Object) tlsVar2, i, 28);
        }
    }

    public static final void l(fvs0 fvs0Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1220498931);
        int i2 = i | (btsVar.k(fvs0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.e(tlsVar2) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean z = ((i2 & 112) == 32) | (i3 == 4);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new SlotTrailKt$TrailSwitch$1$1(tlsVar, fvs0Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            f530 b = gza1.b(ljs0.e(ljs0.q(tra1.b(c530.a, fvs0Var.a.b ? 1.0f : 0.5f), 52.0f), 34.0f), 1.0f, 1.0f);
            if (fvs0Var.e) {
                b = fnq0.a(b, new teb(20));
            }
            fa6 fa6Var = fvs0Var.a;
            f530 f530Var = b;
            boolean z2 = fa6Var.a;
            boolean z3 = fa6Var.b;
            boolean z4 = ((i2 & 896) == 256) | (i3 == 4);
            Object Q2 = btsVar.Q();
            if (z4 || Q2 == o430Var) {
                Q2 = new scs0(4, tlsVar2, fvs0Var);
                btsVar.o0(Q2);
            }
            e.a(f530Var, z2, z3, 0L, 0L, 0L, (tls) Q2, null, btsVar, 0, 184);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0((Object) fvs0Var, (Object) tlsVar, (Object) tlsVar2, i, 25);
        }
    }

    public static final void m(gvs0 gvs0Var, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(695850518);
        int i2 = i | (btsVar2.k(gvs0Var) ? 4 : 2) | (btsVar2.e(tlsVar) ? 32 : 16) | (btsVar2.k(f530Var) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new quq0(21, gvs0Var);
                btsVar2.o0(Q);
            }
            l27 l27Var = new l27((tls) Q);
            boolean z2 = ((i2 & 112) == 32) | (i3 == 4);
            Object Q2 = btsVar2.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new ppr0(19, tlsVar, gvs0Var);
                btsVar2.o0(Q2);
            }
            btsVar = btsVar2;
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.b((sls) Q2, f530Var, null, 0L, 0L, null, null, null, false, null, null, l27Var, wwg.S(-1967598857, true, new w7o0(18, gvs0Var), btsVar2), btsVar, (i2 >> 3) & 112, 384, 2044);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0(gvs0Var, tlsVar, f530Var, i, 27);
        }
    }

    public static final void n(hvs0 hvs0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(99059614);
        int i2 = (btsVar.k(hvs0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 d = fj91.d(c530.a, IntrinsicSize.Max);
            lhl0 a = khl0.a(new i43(4.0f, true, new quz(11)), x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, d);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            gvs0 gvs0Var = hvs0Var.a;
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            int i3 = i2 & 112;
            m(gvs0Var, tlsVar, new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), btsVar, i3);
            gvs0 gvs0Var2 = hvs0Var.b;
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            m(gvs0Var2, tlsVar, new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), btsVar, i3);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c1p0(hvs0Var, tlsVar, i, 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(final ivs0 ivs0Var, final tls tlsVar, fid fidVar, int i) {
        o430 o430Var;
        boolean z;
        boolean z2;
        Object Q;
        Object Q2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1867718286);
        int i2 = (btsVar.k(ivs0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q3 = btsVar.Q();
            o430 o430Var2 = did.a;
            if (Q3 == o430Var2) {
                Q3 = f.j(Boolean.FALSE);
                btsVar.o0(Q3);
            }
            oz40 oz40Var = (oz40) Q3;
            Object Q4 = btsVar.Q();
            if (Q4 == o430Var2) {
                Q4 = f.j(new wu60(0L));
                btsVar.o0(Q4);
            }
            oz40 oz40Var2 = (oz40) Q4;
            f530 b = tra1.b(c530.a, ivs0Var.b ? 1.0f : 0.5f);
            Object Q5 = btsVar.Q();
            if (Q5 == o430Var2) {
                Q5 = new ttm(26, oz40Var2);
                btsVar.o0(Q5);
            }
            f530 b2 = tm91.b(b, (tls) Q5);
            lvi0 lvi0Var = ivs0Var.a;
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z3 = (i3 == 32) | (i4 == 4);
            Object Q6 = btsVar.Q();
            if (z3 || Q6 == o430Var2) {
                Q6 = new xlp0(8, tlsVar, ivs0Var, oz40Var);
                btsVar.o0(Q6);
            }
            s3b1.c(lvi0Var, b2, false, null, false, null, (sls) Q6, btsVar, 0, 60);
            if (((Boolean) oz40Var.getValue()).booleanValue()) {
                btsVar.e0(106610416);
                String e = ohb1.e(btsVar, rzh0.cargo_form_address_details_make_photo);
                String e2 = ohb1.e(btsVar, rzh0.cargo_form_address_details_select_files);
                long j = ((wu60) oz40Var2.getValue()).a;
                boolean z4 = (i3 == 32) | (i4 == 4);
                Object Q7 = btsVar.Q();
                if (z4) {
                    o430Var = o430Var2;
                } else {
                    o430Var = o430Var2;
                    if (Q7 != o430Var) {
                        z = false;
                        sls slsVar = (sls) Q7;
                        z2 = (i4 != 4 ? true : z) | (i3 != 32 ? true : z);
                        Q = btsVar.Q();
                        if (!z2 || Q == o430Var) {
                            final int i5 = 1;
                            Q = new sls() { // from class: mvs0
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i6 = i5;
                                    zy11 zy11Var = zy11.a;
                                    ivs0 ivs0Var2 = ivs0Var;
                                    tls tlsVar2 = tlsVar;
                                    switch (i6) {
                                        case 0:
                                            tlsVar2.invoke(ivs0Var2.d);
                                            break;
                                        default:
                                            tlsVar2.invoke(ivs0Var2.e);
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            btsVar.o0(Q);
                        }
                        sls slsVar2 = (sls) Q;
                        Q2 = btsVar.Q();
                        if (Q2 == o430Var) {
                            Q2 = new w01(25, oz40Var);
                            btsVar.o0(Q2);
                        }
                        rma1.a(e, e2, slsVar, slsVar2, (sls) Q2, j, btsVar, 196992);
                        btsVar.t(z);
                    }
                }
                z = false;
                final Object[] objArr = 0 == true ? 1 : 0;
                Q7 = new sls() { // from class: mvs0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i6 = objArr;
                        zy11 zy11Var = zy11.a;
                        ivs0 ivs0Var2 = ivs0Var;
                        tls tlsVar2 = tlsVar;
                        switch (i6) {
                            case 0:
                                tlsVar2.invoke(ivs0Var2.d);
                                break;
                            default:
                                tlsVar2.invoke(ivs0Var2.e);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q7);
                sls slsVar3 = (sls) Q7;
                if (i3 != 32) {
                }
                z2 = (i4 != 4 ? true : z) | (i3 != 32 ? true : z);
                Q = btsVar.Q();
                if (!z2) {
                }
                final int i52 = 1;
                Q = new sls() { // from class: mvs0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i6 = i52;
                        zy11 zy11Var = zy11.a;
                        ivs0 ivs0Var2 = ivs0Var;
                        tls tlsVar2 = tlsVar;
                        switch (i6) {
                            case 0:
                                tlsVar2.invoke(ivs0Var2.d);
                                break;
                            default:
                                tlsVar2.invoke(ivs0Var2.e);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q);
                sls slsVar22 = (sls) Q;
                Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                }
                rma1.a(e, e2, slsVar3, slsVar22, (sls) Q2, j, btsVar, 196992);
                btsVar.t(z);
            } else {
                btsVar.e0(107108400);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c1p0(ivs0Var, tlsVar, i, 18);
        }
    }
}
