package defpackage;

import androidx.compose.animation.k;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import java.util.ArrayList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class qfj {
    public static final void a(ggj ggjVar, qor qorVar, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1860607856);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(ggjVar) : btsVar.e(ggjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(qorVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        int i4 = 1;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            int i5 = i3;
            f530 m = ymb1.m(c530Var);
            Object Q = btsVar.Q();
            int i6 = 29;
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new ur70(i6);
                btsVar.o0(Q);
            }
            w2o a = k.q(1, (tls) Q, null).a(k.d(null, null, 15)).a(k.e(null, 3));
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new ur70(i6);
                btsVar.o0(Q2);
            }
            ttb1.a(ggjVar, m, a, k.v(1, (tls) Q2, null).a(k.l(null, null, 15)).a(k.f(null, 3)), "AnimatedDialogueItem", wwg.S(-5302760, true, new lfj(qorVar, tlsVar, i4), btsVar), btsVar, 224640 | (i5 & 14), 0);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0(ggjVar, qorVar, f530Var2, tlsVar, i, 19);
        }
    }

    public static final void b(ebp0 ebp0Var, jfj jfjVar, f530 f530Var, fid fidVar, int i) {
        ebp0 ebp0Var2;
        int i2;
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-456335001);
        if ((i & 6) == 0) {
            ebp0Var2 = ebp0Var;
            i2 = i | (btsVar2.k(ebp0Var2) ? 4 : 2);
        } else {
            ebp0Var2 = ebp0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(jfjVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar2.V(i3 & 1, (i3 & 147) != 146)) {
            CharSequence charSequence = jfjVar.a;
            ety0 ety0Var = xya1.e(btsVar2).h.b;
            AppColor$Palette appColor$Palette = AppColor$Palette.EverFront;
            int i4 = (i3 & 14) | HProv.ALG_TYPE_SECURECHANNEL | (i3 & 896);
            c530 c530Var = c530.a;
            btsVar = btsVar2;
            m9b1.a(ebp0Var2, charSequence, c530Var, appColor$Palette, ety0Var, 0, 0, null, null, null, 0, 0, null, btsVar, i4, 0, 16368);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09(ebp0Var, jfjVar, f530Var2, i, 24);
        }
    }

    public static final void c(ggj ggjVar, f530 f530Var, tls tlsVar, qor qorVar, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1498156047);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(ggjVar) : btsVar.e(ggjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(qorVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(aVar) ? 16384 : 8192;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            int i4 = ((i2 >> 3) & 14) | 384;
            int i5 = i2 << 3;
            o4p.a(f530Var, ggjVar, wwg.S(-458059827, true, new lfj(qorVar, tlsVar, i3), btsVar), ggjVar instanceof egj ? ((egj) ggjVar).d : o4p.a, aVar, btsVar, i4 | (i5 & 112) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0(i, 12, tlsVar, f530Var, ggjVar, qorVar, aVar);
        }
    }

    public static final void d(ggj ggjVar, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-400456898);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(ggjVar) : btsVar.e(ggjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (!btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.Y();
        } else if (ggjVar instanceof egj) {
            btsVar.e0(1407921932);
            g((egj) ggjVar, f530Var, tlsVar, btsVar, i2 & 1022);
            btsVar.t(false);
        } else if (ggjVar instanceof fgj) {
            btsVar.e0(1408111342);
            h(f530Var, btsVar, (i2 >> 3) & 14);
            btsVar.t(false);
        } else {
            if (ggjVar != null) {
                throw unr0.y(1707982861, btsVar, false);
            }
            btsVar.e0(1408177186);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09((Object) ggjVar, (Object) f530Var, tlsVar, i, 26);
        }
    }

    public static final void e(ibp0 ibp0Var, rfj rfjVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(453352673);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(ibp0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(rfjVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            btsVar.e0(-1842444537);
            c530 c530Var = c530.a;
            tdb1.d(ibp0Var, rfjVar.a, an91.o(c530Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), null, null, null, 0.0f, 0, wwg.S(439105133, true, new ofj(rfjVar, ibp0Var), btsVar), btsVar, (i3 & 14) | 805306368, 252);
            btsVar.t(false);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09(ibp0Var, rfjVar, f530Var2, i, 25);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(ibp0 ibp0Var, yfj yfjVar, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        c530 c530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1684433412);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(yfjVar) : btsVar.e(yfjVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        int i4 = 2048;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        int i5 = 0;
        boolean z = true;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            c530 c530Var2 = c530.a;
            if (yfjVar == null) {
                btsVar.e0(-462154383);
                x901.a.invoke(ibp0Var, btsVar, Integer.valueOf(i3 & 14));
                btsVar.t(false);
                c530Var = c530Var2;
            } else {
                btsVar.e0(-1441802732);
                f530 o = an91.o(c530Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                c530Var = c530Var2;
                lhl0 a = khl0.a(new i43(4.0f, true, new m6(9, x4c.H)), x4c.E, btsVar, 54);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d = b.d(btsVar, o);
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
                qje.W(btsVar, d.e, o2);
                qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                qje.M(btsVar, d.h);
                qje.W(btsVar, d.d, d);
                btsVar.e0(-1825359558);
                ArrayList arrayList = yfjVar.a;
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    kfj kfjVar = (kfj) arrayList.get(i6);
                    int i7 = size;
                    ButtonSize buttonSize = ButtonSize.XS;
                    gz6 gz6Var = new gz6(kfjVar.c, kfjVar.b);
                    ButtonForm buttonForm = ButtonForm.Circle;
                    int i8 = ((i3 & 7168) == i4 ? 1 : i5) | (btsVar.k(kfjVar) ? 1 : 0);
                    Object Q = btsVar.Q();
                    if (i8 != 0 || Q == did.a) {
                        Q = new pfj(tlsVar, kfjVar, i5);
                        btsVar.o0(Q);
                    }
                    d17.d(null, false, buttonSize, gz6Var, buttonForm, (sls) Q, wwg.S(11717042, true, new ota(16, kfjVar), btsVar), btsVar, 1597824, 3);
                    i6++;
                    i5 = 0;
                    z = true;
                    i4 = 2048;
                    i3 = i3;
                    size = i7;
                }
                boolean z2 = i5;
                tse0.t(btsVar, z2, z, z2);
            }
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0(ibp0Var, yfjVar, f530Var2, tlsVar, i, 18);
        }
    }

    public static final void g(final egj egjVar, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1464650903);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(egjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            String str = egjVar.e;
            yfj yfjVar = egjVar.c;
            boolean k = ((i2 & 896) == 256) | btsVar.k(str) | btsVar.e(yfjVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new f89(23, (Object) yfjVar, (Object) tlsVar, str);
                btsVar.o0(Q);
            }
            ydb1.a(an91.m(fnq0.a(f530Var, (tls) Q), 2.0f, 0.0f, 2), wwg.S(-1354657619, true, new zls() { // from class: mfj
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    egj egjVar2 = egjVar;
                    switch (i5) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                qfj.e(ibp0Var, egjVar2.a, null, btsVar2, intValue & 14);
                                break;
                            }
                        default:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                qfj.b(ebp0Var, egjVar2.b, null, btsVar3, intValue2 & 14);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), wwg.S(609675432, true, new zls() { // from class: mfj
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    egj egjVar2 = egjVar;
                    switch (i5) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                qfj.e(ibp0Var, egjVar2.a, null, btsVar2, intValue & 14);
                                break;
                            }
                        default:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                qfj.b(ebp0Var, egjVar2.b, null, btsVar3, intValue2 & 14);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), wwg.S(-335953505, true, new nfj(i3, egjVar, tlsVar), btsVar), null, null, SlotSize.S, false, btsVar, 1576368, 176);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09((Object) egjVar, (Object) f530Var, tlsVar, i, 23);
        }
    }

    public static final void h(f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-659202094);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            SlotSize slotSize = SlotSize.S;
            r6d.a.getClass();
            f530Var2 = f530Var;
            ydb1.a(f530Var2, null, r6d.b, null, null, null, slotSize, false, btsVar, (i2 & 14) | 1573248, 186);
        } else {
            f530Var2 = f530Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dc0(f530Var2, i, 9);
        }
    }
}
