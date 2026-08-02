package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.design.compose.slot.body.BodyAlign;
import com.yandex.go.slot.api.ui.SlotItemUiState$Body$Ellipsize;
import java.util.Arrays;
import java.util.List;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class tdb1 {
    public static final void a(ebp0 ebp0Var, bss0 bss0Var, fid fidVar, int i) {
        ebp0 ebp0Var2 = ebp0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(66270262);
        int i2 = i | (btsVar.k(ebp0Var2) ? 4 : 2) | (btsVar.e(bss0Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            CharSequence charSequence = bss0Var.a;
            CharSequence charSequence2 = bss0Var.d;
            ass0 ass0Var = bss0Var.g;
            int i3 = ass0Var.b;
            int f = f(ass0Var.d);
            int i4 = ass0Var.c;
            int f2 = f(ass0Var.e);
            if (charSequence != null && charSequence2 == null) {
                btsVar.e0(-1427139445);
                m9b1.a(ebp0Var2, charSequence, null, null, null, f, i3, null, null, null, 0, 0, null, btsVar, i2 & 14, 0, 16334);
                btsVar.t(false);
            } else if (charSequence == null && charSequence2 != null) {
                btsVar.e0(-1426970526);
                m9b1.a(ebp0Var, charSequence2, null, null, null, f2, i4, null, null, null, 0, 0, null, btsVar, i2 & 14, 0, 16334);
                btsVar.t(false);
            } else if (charSequence == null || charSequence2 == null) {
                ebp0Var2 = ebp0Var;
                btsVar.e0(-1426539750);
                btsVar.t(false);
            } else {
                btsVar.e0(-1426789641);
                ebp0Var2 = ebp0Var;
                m9b1.b(ebp0Var2, charSequence, null, null, null, f, i3, charSequence2, null, null, f2, i4, null, btsVar, i2 & 14, 0, 29518);
                btsVar.t(false);
            }
            ebp0Var2 = ebp0Var;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c1p0(ebp0Var2, bss0Var, i, 13);
        }
    }

    public static final void b(final ebp0 ebp0Var, final xrs0 xrs0Var, fid fidVar, int i) {
        int i2;
        ebp0 ebp0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1788962953);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ebp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(xrs0Var) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            ebp0Var2 = ebp0Var;
            v9b1.a(ebp0Var2, wwg.S(939197001, true, new wls() { // from class: uqs0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    xrs0 xrs0Var2 = xrs0Var;
                    ebp0 ebp0Var3 = ebp0Var;
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar2.Y();
                                break;
                            } else {
                                tdb1.a(ebp0Var3, xrs0Var2.a, btsVar2, 0);
                                break;
                            }
                        default:
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar3.Y();
                                break;
                            } else {
                                tdb1.a(ebp0Var3, xrs0Var2.b, btsVar3, 0);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), wwg.S(-1425539446, true, new wls() { // from class: uqs0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    xrs0 xrs0Var2 = xrs0Var;
                    ebp0 ebp0Var3 = ebp0Var;
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar2.Y();
                                break;
                            } else {
                                tdb1.a(ebp0Var3, xrs0Var2.a, btsVar2, 0);
                                break;
                            }
                        default:
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar3.Y();
                                break;
                            } else {
                                tdb1.a(ebp0Var3, xrs0Var2.b, btsVar3, 0);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, 0.0f, null, null, btsVar, (i2 & 14) | 432);
        } else {
            ebp0Var2 = ebp0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(ebp0Var2, xrs0Var, i, 19);
        }
    }

    public static final void c(ebp0 ebp0Var, zrs0 zrs0Var, fid fidVar, int i) {
        int i2;
        BodyAlign bodyAlign;
        ebp0 ebp0Var2 = ebp0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1701868009);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(ebp0Var2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(zrs0Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            bss0 bss0Var = zrs0Var.a;
            CharSequence charSequence = bss0Var.a;
            CharSequence charSequence2 = bss0Var.d;
            ass0 ass0Var = bss0Var.g;
            int i3 = ass0Var.b;
            int f = f(ass0Var.d);
            int i4 = ass0Var.c;
            int f2 = f(ass0Var.e);
            int i5 = vqs0.a[ass0Var.a.ordinal()];
            if (i5 == 1) {
                bodyAlign = BodyAlign.End;
            } else if (i5 == 2) {
                bodyAlign = BodyAlign.Center;
            } else {
                if (i5 != 3) {
                    w511.b();
                    return;
                }
                bodyAlign = BodyAlign.Start;
            }
            BodyAlign bodyAlign2 = bodyAlign;
            if (charSequence != null && charSequence2 == null) {
                btsVar.e0(-1738520646);
                m9b1.a(ebp0Var2, charSequence, null, null, null, f, i3, null, null, null, 0, 0, bodyAlign2, btsVar, i2 & 14, 0, 12238);
                btsVar.t(false);
            } else if (charSequence == null && charSequence2 != null) {
                btsVar.e0(-1738321967);
                m9b1.a(ebp0Var, charSequence2, null, null, null, f2, i4, null, null, null, 0, 0, bodyAlign2, btsVar, i2 & 14, 0, 12238);
                btsVar.t(false);
            } else if (charSequence == null || charSequence2 == null) {
                ebp0Var2 = ebp0Var;
                btsVar.e0(-1737832601);
                btsVar.t(false);
            } else {
                btsVar.e0(-1738111322);
                ebp0Var2 = ebp0Var;
                m9b1.b(ebp0Var2, charSequence, null, null, null, f, i3, charSequence2, null, null, f2, i4, bodyAlign2, btsVar, i2 & 14, 0, 21326);
                btsVar.t(false);
            }
            ebp0Var2 = ebp0Var;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(ebp0Var2, zrs0Var, i, 20);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final ibp0 ibp0Var, final nvi0 nvi0Var, f530 f530Var, kfv kfvVar, jt1 jt1Var, nhe nheVar, float f, int i, wls wlsVar, fid fidVar, final int i2, final int i3) {
        int i4;
        f530 f530Var2;
        int i5;
        int i6;
        nhe nheVar2;
        int i7;
        int i8;
        wls wlsVar2;
        final nvi0 nvi0Var2;
        final kfv kfvVar2;
        final jt1 jt1Var2;
        final int i9;
        final f530 f530Var3;
        final nhe nheVar3;
        final float f2;
        aii0 v;
        final int i10;
        final f530 f530Var4;
        final nhe nheVar4;
        final float f3;
        final int i11;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1635235489);
        if ((i2 & 6) == 0) {
            i4 = (btsVar.k(ibp0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= btsVar.k(nvi0Var) ? 32 : 16;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            f530Var2 = f530Var;
            i4 |= btsVar.k(f530Var2) ? 256 : 128;
            int i13 = i4 | HProv.ALG_TYPE_SECURECHANNEL;
            i5 = i3 & 8;
            if (i5 == 0) {
                i13 = i4 | 27648;
            } else if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i13 |= (32768 & i2) == 0 ? btsVar.k(kfvVar) : btsVar.e(kfvVar) ? 16384 : 8192;
            }
            int i14 = 196608 | i13;
            i6 = i3 & 32;
            if (i6 == 0) {
                i14 = 1769472 | i13;
            } else if ((1572864 & i2) == 0) {
                nheVar2 = nheVar;
                i14 |= btsVar.k(nheVar2) ? 1048576 : 524288;
                i7 = 12582912 | i14;
                if ((i2 & 100663296) == 0) {
                    i7 = 46137344 | i14;
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i7 |= 805306368;
                    wlsVar2 = wlsVar;
                } else {
                    wlsVar2 = wlsVar;
                    if ((i2 & 805306368) == 0) {
                        i7 |= btsVar.e(wlsVar2) ? 536870912 : SelfTester_JCP.IMITA;
                    }
                }
                if (btsVar.V(i7 & 1, (i7 & 306783379) != 306783378)) {
                    btsVar.a0();
                    if ((i2 & 1) == 0 || btsVar.C()) {
                        if (i12 != 0) {
                            f530Var2 = c530.a;
                        }
                        kfv kfvVar3 = i5 != 0 ? null : kfvVar;
                        jt1Var2 = x4c.y;
                        if (i6 != 0) {
                            nheVar2 = mhe.b;
                        }
                        int i15 = (-234881025) & i7;
                        if (i8 != 0) {
                            i10 = 1;
                            f530Var4 = f530Var2;
                            nheVar4 = nheVar2;
                            f3 = 1.0f;
                            wlsVar2 = wwg.S(-45658104, true, new ofj(ibp0Var, 2), btsVar);
                        } else {
                            i10 = 1;
                            f530Var4 = f530Var2;
                            nheVar4 = nheVar2;
                            f3 = 1.0f;
                        }
                        i11 = i15;
                        kfvVar2 = kfvVar3;
                    } else {
                        btsVar.Y();
                        kfvVar2 = kfvVar;
                        jt1Var2 = jt1Var;
                        i10 = i;
                        i11 = i7 & (-234881025);
                        f530Var4 = f530Var2;
                        nheVar4 = nheVar2;
                        f3 = f;
                    }
                    btsVar.u();
                    zls zlsVar = new zls() { // from class: n8y
                        @Override // defpackage.zls
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            n8v n8vVar = (n8v) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ibp0 ibp0Var2 = ibp0.this;
                            f530 k = an91.k(ljs0.a(f530Var4, (ibp0Var2.c() == SlotSize.M ? SlotSize.L : ibp0Var2.c()).getSize(), ibp0Var2.c().getSize()), 2.0f);
                            z910 d = pi6.d(x4c.y, false);
                            bts btsVar2 = (bts) fidVar2;
                            int hashCode = Long.hashCode(btsVar2.T);
                            r1b0 o = btsVar2.o();
                            f530 d2 = b.d(fidVar2, k);
                            ohd.G1.getClass();
                            sls slsVar = d.b;
                            bts btsVar3 = (bts) fidVar2;
                            if (btsVar3.a == null) {
                                cma1.b0();
                                throw null;
                            }
                            btsVar3.i0();
                            if (btsVar3.S) {
                                btsVar3.n(slsVar);
                            } else {
                                btsVar3.r0();
                            }
                            qje.W(fidVar2, d.f, d);
                            qje.W(fidVar2, d.e, o);
                            qje.W(fidVar2, d.g, Integer.valueOf(hashCode));
                            qje.M(fidVar2, d.h);
                            qje.W(fidVar2, d.d, d2);
                            String a = nvi0Var.a();
                            int i16 = i11 >> 3;
                            j4b1.c(n8vVar, null, a, kfvVar2, jt1Var2, nheVar4, f3, i10, fidVar2, (intValue & 14) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (3670016 & i16) | (i16 & 29360128), 2);
                            btsVar3.t(true);
                            return zy11.a;
                        }
                    };
                    int i16 = i10;
                    float f4 = f3;
                    nhe nheVar5 = nheVar4;
                    f530 f530Var5 = f530Var4;
                    nvi0Var2 = nvi0Var;
                    int i17 = ((i11 >> 18) & 7168) | ((i11 >> 3) & 14);
                    ywy ywyVar = (ywy) ffb1.f(nvi0Var2, btsVar, i17 & 14).getValue();
                    if (jl40.l(ywyVar, wwy.a)) {
                        btsVar.e0(-576192361);
                        s8y.a(ibp0Var, f530Var5, btsVar, (i11 & 14) | ((i11 >> 3) & 112), 0);
                        btsVar.t(false);
                    } else if (ywyVar instanceof xwy) {
                        btsVar.e0(-576123541);
                        zlsVar.invoke(((xwy) ywyVar).a, btsVar, 0);
                        btsVar.t(false);
                    } else {
                        if (!jl40.l(ywyVar, vwy.a)) {
                            throw unr0.y(1505431128, btsVar, false);
                        }
                        btsVar.e0(-576049575);
                        xvz.u((i17 >> 9) & 14, wlsVar2, btsVar, false);
                    }
                    f530Var3 = f530Var5;
                    nheVar3 = nheVar5;
                    f2 = f4;
                    i9 = i16;
                } else {
                    nvi0Var2 = nvi0Var;
                    btsVar.Y();
                    kfvVar2 = kfvVar;
                    jt1Var2 = jt1Var;
                    i9 = i;
                    f530Var3 = f530Var2;
                    nheVar3 = nheVar2;
                    f2 = f;
                }
                final wls wlsVar3 = wlsVar2;
                v = btsVar.v();
                if (v != null) {
                    v.d = new wls() { // from class: o8y
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            tdb1.d(ibp0.this, nvi0Var2, f530Var3, kfvVar2, jt1Var2, nheVar3, f2, i9, wlsVar3, (fid) obj, vng.O(i2 | 1), i3);
                            return zy11.a;
                        }
                    };
                    return;
                }
                return;
            }
            nheVar2 = nheVar;
            i7 = 12582912 | i14;
            if ((i2 & 100663296) == 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            if (btsVar.V(i7 & 1, (i7 & 306783379) != 306783378)) {
            }
            final wls wlsVar32 = wlsVar2;
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        int i132 = i4 | HProv.ALG_TYPE_SECURECHANNEL;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        int i142 = 196608 | i132;
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        nheVar2 = nheVar;
        i7 = 12582912 | i142;
        if ((i2 & 100663296) == 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        if (btsVar.V(i7 & 1, (i7 & 306783379) != 306783378)) {
        }
        final wls wlsVar322 = wlsVar2;
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void e(ebp0 ebp0Var, css0 css0Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1569140730);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ebp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(css0Var) : btsVar.e(css0Var) ? 32 : 16;
        }
        int i3 = 18;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else if (css0Var instanceof zrs0) {
            btsVar.e0(410724400);
            c(ebp0Var, (zrs0) css0Var, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        } else if (css0Var instanceof xrs0) {
            btsVar.e0(410726544);
            b(ebp0Var, (xrs0) css0Var, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        } else {
            if (!(css0Var instanceof yrs0)) {
                throw unr0.y(410722776, btsVar, false);
            }
            btsVar.e0(410730398);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(ebp0Var, css0Var, i, i3);
        }
    }

    public static final int f(SlotItemUiState$Body$Ellipsize slotItemUiState$Body$Ellipsize) {
        int i = vqs0.b[slotItemUiState$Body$Ellipsize.ordinal()];
        if (i == 1) {
            return 5;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 1;
        }
        w511.b();
        return 0;
    }

    public static uo7 g(uo7... uo7VarArr) {
        List asList = Arrays.asList(uo7VarArr);
        return asList.isEmpty() ? new wo7() : asList.size() == 1 ? (uo7) asList.get(0) : new vo7(asList);
    }
}
