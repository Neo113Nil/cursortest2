package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.slot.SlotSize;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class w5b1 {
    public static final void a(i611 i611Var, f530 f530Var, boolean z, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1058041262);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(i611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (!btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar.Y();
        } else if (z) {
            btsVar.e0(-657524815);
            c(i611Var, f530Var, tlsVar, null, btsVar, (i2 & HProv.PP_DELETE_SAVED_PASSWD) | ((i2 >> 3) & 896));
            btsVar.t(false);
        } else {
            btsVar.e0(-657452864);
            b(i611Var, f530Var, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0((Object) i611Var, (Object) f530Var, z, tlsVar, i, 2);
        }
    }

    public static final void b(final i611 i611Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1621350460);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(i611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        final int i4 = 0;
        final int i5 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            i611Var.getClass();
            boolean k = btsVar.k("");
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = ly3.h(0.0f, btsVar);
            }
            float f = ((y7m) Q).a;
            f530 c = ljs0.c(f530Var, 1.0f);
            boolean e = btsVar.e(i611Var);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new qj5(i611Var, i5);
                btsVar.o0(Q2);
            }
            ydb1.a(fnq0.a(c, (tls) Q2), wwg.S(987048786, true, new zls() { // from class: rj5
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i4;
                    zy11 zy11Var = zy11.a;
                    i611 i611Var2 = i611Var;
                    switch (i6) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                f530 k2 = an91.k(ljs0.m(c530.a, SlotSize.L.getSize()), 6.0f);
                                z910 d = pi6.d(x4c.y, false);
                                int hashCode = Long.hashCode(btsVar2.T);
                                r1b0 o = btsVar2.o();
                                f530 d2 = b.d(btsVar2, k2);
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                if (btsVar2.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar2.i0();
                                if (btsVar2.S) {
                                    btsVar2.n(slsVar);
                                } else {
                                    btsVar2.r0();
                                }
                                qje.W(btsVar2, d.f, d);
                                qje.W(btsVar2, d.e, o);
                                qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar2, d.h);
                                qje.W(btsVar2, d.d, d2);
                                i611Var2.getClass();
                                xtb1.a(null, i611Var2.c, null, null, btsVar2, 0, 12);
                                btsVar2.t(true);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(1 & intValue2, (intValue2 & 17) != 16)) {
                                ytb1.a(0, btsVar3, null, i611Var2.b);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), wwg.S(437740237, true, new sj5(f, i611Var, i4), btsVar), null, wwg.S(-844316409, true, new zls() { // from class: rj5
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i5;
                    zy11 zy11Var = zy11.a;
                    i611 i611Var2 = i611Var;
                    switch (i6) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                f530 k2 = an91.k(ljs0.m(c530.a, SlotSize.L.getSize()), 6.0f);
                                z910 d = pi6.d(x4c.y, false);
                                int hashCode = Long.hashCode(btsVar2.T);
                                r1b0 o = btsVar2.o();
                                f530 d2 = b.d(btsVar2, k2);
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                if (btsVar2.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar2.i0();
                                if (btsVar2.S) {
                                    btsVar2.n(slsVar);
                                } else {
                                    btsVar2.r0();
                                }
                                qje.W(btsVar2, d.f, d);
                                qje.W(btsVar2, d.e, o);
                                qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar2, d.h);
                                qje.W(btsVar2, d.d, d2);
                                i611Var2.getClass();
                                xtb1.a(null, i611Var2.c, null, null, btsVar2, 0, 12);
                                btsVar2.t(true);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(1 & intValue2, (intValue2 & 17) != 16)) {
                                ytb1.a(0, btsVar3, null, i611Var2.b);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), null, SlotSize.L, false, btsVar, 1597872, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(i611Var, f530Var, i, i3);
        }
    }

    public static final void c(i611 i611Var, f530 f530Var, tls tlsVar, ety0 ety0Var, fid fidVar, int i) {
        int i2;
        tls tlsVar2;
        bts btsVar;
        ety0 ety0Var2;
        ety0 ety0Var3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1855831222);
        if ((i & 6) == 0) {
            i2 = (btsVar2.e(i611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            tlsVar2 = tlsVar;
            i2 |= btsVar2.e(tlsVar2) ? 256 : 128;
        } else {
            tlsVar2 = tlsVar;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= 1024;
        }
        int i3 = 0;
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar2.a0();
            if ((i & 1) == 0 || btsVar2.C()) {
                ety0Var3 = xya1.d(btsVar2).f.c;
            } else {
                btsVar2.Y();
                ety0Var3 = ety0Var;
            }
            btsVar2.u();
            boolean c = hja1.c(btsVar2);
            String str = i611Var.b;
            boolean e = btsVar2.e(i611Var);
            Object Q = btsVar2.Q();
            if (e || Q == did.a) {
                Q = new qj5(i611Var, i3);
                btsVar2.o0(Q);
            }
            f530 b = fnq0.b(f530Var, true, (tls) Q);
            b3d.a.getClass();
            btsVar = btsVar2;
            a5l0.d(str, b, 0.0f, 0.0f, null, 0.0f, ety0Var3, null, b3d.b, wwg.S(-2005840730, true, new r2z0(i611Var, ety0Var3, c, tlsVar2, 2), btsVar2), btsVar, 906166272, 156);
            ety0Var2 = ety0Var3;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            ety0Var2 = ety0Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0((Object) i611Var, tlsVar, (Object) f530Var, (Object) ety0Var2, i, 8);
        }
    }

    public static final rbv d(ws51 ws51Var, int i) {
        String str = ws51Var.e;
        return str != null ? new pbv((dcv) new ccv(i), (dcv) null, (tev) rev.d, (vfv) h2b1.G, str, false) : new nbv(i, null);
    }

    public static final Object e(tls tlsVar, ContinuationImpl continuationImpl) {
        if (continuationImpl.get_context().get(msb1.J) == null) {
            return jl40.z(continuationImpl.get_context()).v(tlsVar, continuationImpl);
        }
        ny61.u();
        return null;
    }
}
