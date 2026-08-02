package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.slot.body.BodyAlign;
import kotlin.Pair;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class q9b1 {
    public static final void a(final ebp0 ebp0Var, final a aVar, final a aVar2, final a aVar3, f530 f530Var, float f, to5 to5Var, to5 to5Var2, to5 to5Var3, fid fidVar, final int i) {
        int i2;
        final float f2;
        final to5 to5Var4;
        final to5 to5Var5;
        final to5 to5Var6;
        float f3;
        final to5 to5Var7;
        final to5 to5Var8;
        f530 f530Var2;
        to5 to5Var9 = x4c.E;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-716592492);
        if ((i & 48) == 0) {
            i2 = (btsVar.e(aVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(aVar2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(aVar3) ? 2048 : 1024;
        }
        int i3 = i2 | HProv.ALG_CLASS_DATA_ENCRYPT;
        if ((196608 & i) == 0) {
            i3 = 90112 | i2;
        }
        int i4 = 114819072 | i3;
        if (btsVar.V(i4 & 1, (38347921 & i4) != 38347920)) {
            btsVar.a0();
            int i5 = i & 1;
            c530 c530Var = c530.a;
            if (i5 == 0 || btsVar.C()) {
                f3 = 8.0f;
                to5Var4 = to5Var9;
                to5Var7 = to5Var4;
                to5Var8 = to5Var7;
                f530Var2 = c530Var;
            } else {
                btsVar.Y();
                f530Var2 = f530Var;
                f3 = f;
                to5Var4 = to5Var;
                to5Var7 = to5Var2;
                to5Var8 = to5Var3;
            }
            btsVar.u();
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            f530Var = f530Var2;
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
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            qwd qwdVar = u76.a;
            final int i6 = 0;
            final int i7 = 1;
            sb2.b(qwdVar.a(BodyAlign.Start), wwg.S(482351600, true, new wls() { // from class: d86
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i8 = i6;
                    zy11 zy11Var = zy11.a;
                    a aVar4 = aVar;
                    to5 to5Var10 = to5Var4;
                    switch (i8) {
                        case 0:
                            fid fidVar2 = (fid) obj;
                            int intValue = ((Integer) obj2).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                if (1.0f <= 0.0d) {
                                    gxv.a("invalid weight; must be greater than zero");
                                }
                                f530 k = new x2y(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true).k(new pa31(to5Var10));
                                z910 d2 = pi6.d(x4c.x, false);
                                int hashCode2 = Long.hashCode(btsVar2.T);
                                r1b0 o2 = btsVar2.o();
                                f530 d3 = b.d(btsVar2, k);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (btsVar2.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar2.i0();
                                if (btsVar2.S) {
                                    btsVar2.n(slsVar2);
                                } else {
                                    btsVar2.r0();
                                }
                                qje.W(btsVar2, d.f, d2);
                                qje.W(btsVar2, d.e, o2);
                                qje.W(btsVar2, d.g, Integer.valueOf(hashCode2));
                                qje.M(btsVar2, d.h);
                                qje.W(btsVar2, d.d, d3);
                                nnm.p(0, aVar4, btsVar2, true);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        case 1:
                            fid fidVar3 = (fid) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                if (1.0f <= 0.0d) {
                                    gxv.a("invalid weight; must be greater than zero");
                                }
                                f530 k2 = new x2y(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true).k(new pa31(to5Var10));
                                z910 d4 = pi6.d(x4c.y, false);
                                int hashCode3 = Long.hashCode(btsVar3.T);
                                r1b0 o3 = btsVar3.o();
                                f530 d5 = b.d(btsVar3, k2);
                                ohd.G1.getClass();
                                sls slsVar3 = d.b;
                                if (btsVar3.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar3);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, d.f, d4);
                                qje.W(btsVar3, d.e, o3);
                                qje.W(btsVar3, d.g, Integer.valueOf(hashCode3));
                                qje.M(btsVar3, d.h);
                                qje.W(btsVar3, d.d, d5);
                                nnm.p(0, aVar4, btsVar3, true);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar4 = (fid) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            bts btsVar4 = (bts) fidVar4;
                            if (btsVar4.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                if (1.0f <= 0.0d) {
                                    gxv.a("invalid weight; must be greater than zero");
                                }
                                f530 k3 = new x2y(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true).k(new pa31(to5Var10));
                                z910 d6 = pi6.d(x4c.z, false);
                                int hashCode4 = Long.hashCode(btsVar4.T);
                                r1b0 o4 = btsVar4.o();
                                f530 d7 = b.d(btsVar4, k3);
                                ohd.G1.getClass();
                                sls slsVar4 = d.b;
                                if (btsVar4.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar4.i0();
                                if (btsVar4.S) {
                                    btsVar4.n(slsVar4);
                                } else {
                                    btsVar4.r0();
                                }
                                qje.W(btsVar4, d.f, d6);
                                qje.W(btsVar4, d.e, o4);
                                qje.W(btsVar4, d.g, Integer.valueOf(hashCode4));
                                qje.M(btsVar4, d.h);
                                qje.W(btsVar4, d.d, d7);
                                nnm.p(0, aVar4, btsVar4, true);
                            } else {
                                btsVar4.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), btsVar, 56);
            oeb1.c(btsVar, ljs0.q(c530Var, f3));
            sb2.b(qwdVar.a(BodyAlign.Center), wwg.S(870830681, true, new wls() { // from class: d86
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i8 = i7;
                    zy11 zy11Var = zy11.a;
                    a aVar4 = aVar2;
                    to5 to5Var10 = to5Var7;
                    switch (i8) {
                        case 0:
                            fid fidVar2 = (fid) obj;
                            int intValue = ((Integer) obj2).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                if (1.0f <= 0.0d) {
                                    gxv.a("invalid weight; must be greater than zero");
                                }
                                f530 k = new x2y(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true).k(new pa31(to5Var10));
                                z910 d2 = pi6.d(x4c.x, false);
                                int hashCode2 = Long.hashCode(btsVar2.T);
                                r1b0 o2 = btsVar2.o();
                                f530 d3 = b.d(btsVar2, k);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (btsVar2.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar2.i0();
                                if (btsVar2.S) {
                                    btsVar2.n(slsVar2);
                                } else {
                                    btsVar2.r0();
                                }
                                qje.W(btsVar2, d.f, d2);
                                qje.W(btsVar2, d.e, o2);
                                qje.W(btsVar2, d.g, Integer.valueOf(hashCode2));
                                qje.M(btsVar2, d.h);
                                qje.W(btsVar2, d.d, d3);
                                nnm.p(0, aVar4, btsVar2, true);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        case 1:
                            fid fidVar3 = (fid) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                if (1.0f <= 0.0d) {
                                    gxv.a("invalid weight; must be greater than zero");
                                }
                                f530 k2 = new x2y(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true).k(new pa31(to5Var10));
                                z910 d4 = pi6.d(x4c.y, false);
                                int hashCode3 = Long.hashCode(btsVar3.T);
                                r1b0 o3 = btsVar3.o();
                                f530 d5 = b.d(btsVar3, k2);
                                ohd.G1.getClass();
                                sls slsVar3 = d.b;
                                if (btsVar3.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar3);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, d.f, d4);
                                qje.W(btsVar3, d.e, o3);
                                qje.W(btsVar3, d.g, Integer.valueOf(hashCode3));
                                qje.M(btsVar3, d.h);
                                qje.W(btsVar3, d.d, d5);
                                nnm.p(0, aVar4, btsVar3, true);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar4 = (fid) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            bts btsVar4 = (bts) fidVar4;
                            if (btsVar4.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                if (1.0f <= 0.0d) {
                                    gxv.a("invalid weight; must be greater than zero");
                                }
                                f530 k3 = new x2y(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true).k(new pa31(to5Var10));
                                z910 d6 = pi6.d(x4c.z, false);
                                int hashCode4 = Long.hashCode(btsVar4.T);
                                r1b0 o4 = btsVar4.o();
                                f530 d7 = b.d(btsVar4, k3);
                                ohd.G1.getClass();
                                sls slsVar4 = d.b;
                                if (btsVar4.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar4.i0();
                                if (btsVar4.S) {
                                    btsVar4.n(slsVar4);
                                } else {
                                    btsVar4.r0();
                                }
                                qje.W(btsVar4, d.f, d6);
                                qje.W(btsVar4, d.e, o4);
                                qje.W(btsVar4, d.g, Integer.valueOf(hashCode4));
                                qje.M(btsVar4, d.h);
                                qje.W(btsVar4, d.d, d7);
                                nnm.p(0, aVar4, btsVar4, true);
                            } else {
                                btsVar4.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), btsVar, 56);
            oeb1.c(btsVar, ljs0.q(c530Var, f3));
            final int i8 = 2;
            sb2.b(qwdVar.a(BodyAlign.End), wwg.S(1643872632, true, new wls() { // from class: d86
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i82 = i8;
                    zy11 zy11Var = zy11.a;
                    a aVar4 = aVar3;
                    to5 to5Var10 = to5Var8;
                    switch (i82) {
                        case 0:
                            fid fidVar2 = (fid) obj;
                            int intValue = ((Integer) obj2).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                if (1.0f <= 0.0d) {
                                    gxv.a("invalid weight; must be greater than zero");
                                }
                                f530 k = new x2y(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true).k(new pa31(to5Var10));
                                z910 d2 = pi6.d(x4c.x, false);
                                int hashCode2 = Long.hashCode(btsVar2.T);
                                r1b0 o2 = btsVar2.o();
                                f530 d3 = b.d(btsVar2, k);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (btsVar2.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar2.i0();
                                if (btsVar2.S) {
                                    btsVar2.n(slsVar2);
                                } else {
                                    btsVar2.r0();
                                }
                                qje.W(btsVar2, d.f, d2);
                                qje.W(btsVar2, d.e, o2);
                                qje.W(btsVar2, d.g, Integer.valueOf(hashCode2));
                                qje.M(btsVar2, d.h);
                                qje.W(btsVar2, d.d, d3);
                                nnm.p(0, aVar4, btsVar2, true);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        case 1:
                            fid fidVar3 = (fid) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                if (1.0f <= 0.0d) {
                                    gxv.a("invalid weight; must be greater than zero");
                                }
                                f530 k2 = new x2y(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true).k(new pa31(to5Var10));
                                z910 d4 = pi6.d(x4c.y, false);
                                int hashCode3 = Long.hashCode(btsVar3.T);
                                r1b0 o3 = btsVar3.o();
                                f530 d5 = b.d(btsVar3, k2);
                                ohd.G1.getClass();
                                sls slsVar3 = d.b;
                                if (btsVar3.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar3);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, d.f, d4);
                                qje.W(btsVar3, d.e, o3);
                                qje.W(btsVar3, d.g, Integer.valueOf(hashCode3));
                                qje.M(btsVar3, d.h);
                                qje.W(btsVar3, d.d, d5);
                                nnm.p(0, aVar4, btsVar3, true);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar4 = (fid) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            bts btsVar4 = (bts) fidVar4;
                            if (btsVar4.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                if (1.0f <= 0.0d) {
                                    gxv.a("invalid weight; must be greater than zero");
                                }
                                f530 k3 = new x2y(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true).k(new pa31(to5Var10));
                                z910 d6 = pi6.d(x4c.z, false);
                                int hashCode4 = Long.hashCode(btsVar4.T);
                                r1b0 o4 = btsVar4.o();
                                f530 d7 = b.d(btsVar4, k3);
                                ohd.G1.getClass();
                                sls slsVar4 = d.b;
                                if (btsVar4.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar4.i0();
                                if (btsVar4.S) {
                                    btsVar4.n(slsVar4);
                                } else {
                                    btsVar4.r0();
                                }
                                qje.W(btsVar4, d.f, d6);
                                qje.W(btsVar4, d.e, o4);
                                qje.W(btsVar4, d.g, Integer.valueOf(hashCode4));
                                qje.M(btsVar4, d.h);
                                qje.W(btsVar4, d.d, d7);
                                nnm.p(0, aVar4, btsVar4, true);
                            } else {
                                btsVar4.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), btsVar, 56);
            btsVar.t(true);
            f2 = f3;
            to5Var5 = to5Var7;
            to5Var6 = to5Var8;
        } else {
            btsVar.Y();
            f2 = f;
            to5Var4 = to5Var;
            to5Var5 = to5Var2;
            to5Var6 = to5Var3;
        }
        final f530 f530Var3 = f530Var;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: e86
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q9b1.a(ebp0.this, aVar, aVar2, aVar3, f530Var3, f2, to5Var4, to5Var5, to5Var6, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(f530 f530Var, pa90 pa90Var, fid fidVar, int i, int i2) {
        int i3;
        int i4;
        pa90 m;
        pa90 pa90Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(799570524);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (((i2 & 2) == 0 && btsVar.e(pa90Var)) ? 32 : 16);
        if ((i5 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
            pa90Var2 = pa90Var;
        } else {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                }
            } else if ((i2 & 2) != 0) {
                i4 = i5 & (-113);
                m = mt71.m(wwg0.msg_invite_link_image, 0, btsVar);
                btsVar.u();
                o4b1.b(m, null, f530Var, null, null, 0.0f, null, btsVar, ((i4 >> 3) & 14) | 48 | ((i4 << 6) & 896), 120);
                pa90Var2 = m;
            }
            i4 = i5;
            m = pa90Var;
            btsVar.u();
            o4b1.b(m, null, f530Var, null, null, 0.0f, null, btsVar, ((i4 >> 3) & 14) | 48 | ((i4 << 6) & 896), 120);
            pa90Var2 = m;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q12(i, i2, 4, f530Var, pa90Var2);
        }
    }

    public static final nkc c(String str) {
        return new nkc("type", new nng(new c(kotlin.collections.b.i(new Pair("name", qcx.c("type")), new Pair("type", qcx.c("client_action")), new Pair("payload", new c(gw00.e(new Pair("text", qcx.c(str))))))).toString(), null));
    }
}
