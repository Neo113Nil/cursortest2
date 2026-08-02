package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.m;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.input.InputState;
import com.yandex.go.design.compose.slot.SlotSize;
import java.lang.reflect.Method;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class rcb1 {
    /* JADX WARN: Removed duplicated region for block: B:105:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final tls tlsVar, final f530 f530Var, boolean z, ety0 ety0Var, wp2 wp2Var, osy0 osy0Var, wp2 wp2Var2, final String str2, wp2 wp2Var3, String str3, wp2 wp2Var4, ety0 ety0Var2, String str4, wp2 wp2Var5, boolean z2, float f, a07 a07Var, gy31 gy31Var, lkx lkxVar, xjx xjxVar, boolean z3, int i, int i2, zx40 zx40Var, tls tlsVar2, ButtonSize buttonSize, bms bmsVar, bms bmsVar2, bms bmsVar3, fid fidVar, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        boolean z4;
        int i8;
        int i9;
        int i10;
        int i11;
        String str5;
        int i12;
        int i13;
        boolean z5;
        int i14;
        int i15;
        int i16;
        boolean z6;
        int i17;
        int i18;
        zx40 zx40Var2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        final ety0 ety0Var3;
        final wp2 wp2Var6;
        final wp2 wp2Var7;
        final wp2 wp2Var8;
        final wp2 wp2Var9;
        final ety0 ety0Var4;
        final float f2;
        final a07 a07Var2;
        final gy31 gy31Var2;
        final lkx lkxVar2;
        final xjx xjxVar2;
        final boolean z7;
        final int i24;
        final int i25;
        final tls tlsVar3;
        final ButtonSize buttonSize2;
        final bms bmsVar4;
        final bms bmsVar5;
        final bms bmsVar6;
        final zx40 zx40Var3;
        final String str6;
        final boolean z8;
        final osy0 osy0Var2;
        final wp2 wp2Var10;
        final boolean z9;
        final String str7;
        aii0 v;
        ety0 ety0Var5;
        bms bmsVar7;
        ButtonSize buttonSize3;
        int i26;
        final wp2 wp2Var11;
        final wp2 wp2Var12;
        osy0 osy0Var3;
        final ety0 ety0Var6;
        final gy31 gy31Var3;
        final lkx lkxVar3;
        final xjx xjxVar3;
        final ety0 ety0Var7;
        final bms bmsVar8;
        wp2 wp2Var13;
        final float f3;
        final int i27;
        ButtonSize buttonSize4;
        final wp2 wp2Var14;
        final boolean z10;
        final bms bmsVar9;
        final a07 a07Var3;
        final String str8;
        final int i28;
        final tls tlsVar4;
        int i29;
        final wp2 wp2Var15;
        int i30;
        final boolean z11;
        wp2 wp2Var16;
        final oz40 oz40Var;
        ButtonSize buttonSize5;
        final InputState inputState;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1102901787);
        if ((i3 & 6) == 0) {
            i7 = (btsVar.k(str) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i7 |= btsVar.k(f530Var) ? 256 : 128;
        }
        int i31 = i6 & 8;
        if (i31 != 0) {
            i7 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            z4 = z;
            i7 |= btsVar.a(z4) ? 2048 : 1024;
            int i32 = i7 | HProv.ALG_CLASS_DATA_ENCRYPT;
            if ((i3 & ImageMetadata.EDGE_MODE) == 0) {
                i32 = 90112 | i7;
            }
            i8 = 1572864 | i32;
            if ((i3 & 12582912) == 0) {
                i8 = 5767168 | i32;
            }
            i9 = i3 & 100663296;
            int i33 = SelfTester_JCP.DECRYPT_CFB;
            if (i9 == 0) {
                i8 |= SelfTester_JCP.DECRYPT_CFB;
            }
            if ((i3 & 805306368) == 0) {
                i8 |= btsVar.k(str2) ? 536870912 : 268435456;
            }
            i10 = i6 & 16384;
            if (i10 == 0) {
                i12 = 26038;
                i11 = 100663296;
                str5 = str4;
            } else {
                i11 = 100663296;
                str5 = str4;
                i12 = 1462 | (btsVar.k(str5) ? (char) 16384 : (char) 8192);
            }
            int i34 = i12 | ImageMetadata.EDGE_MODE;
            if ((i6 & 65536) != 0) {
                i13 = 196608;
                z5 = z2;
                if (btsVar.a(z5)) {
                    i14 = 1048576;
                    i15 = i34 | i14 | 851443712;
                    int i35 = i4 | 54;
                    i16 = i6 & SelfTester_JCP.ENCRYPT_CBC;
                    if (i16 != 0) {
                        i17 = i4 | 438;
                        z6 = z3;
                    } else {
                        if ((i4 & 384) == 0) {
                            z6 = z3;
                            i35 |= btsVar.a(z6) ? 256 : 128;
                        } else {
                            z6 = z3;
                        }
                        i17 = i35;
                    }
                    int i36 = i17 | 25600;
                    i18 = i6 & SelfTester_JCP.DECRYPT_CFB;
                    if (i18 != 0) {
                        i36 = 222208 | i17;
                    } else if ((i4 & i13) == 0) {
                        zx40Var2 = zx40Var;
                        i36 |= btsVar.k(zx40Var2) ? 131072 : 65536;
                        int i37 = i36 | 14155776;
                        i19 = i6 & SelfTester_JCP.IMITA;
                        if (i19 == 0) {
                            i37 = i36 | 114819072;
                        } else if ((i4 & i11) == 0) {
                            if (btsVar.e(bmsVar)) {
                                i33 = SelfTester_JCP.DECRYPT_CBC;
                            }
                            i37 |= i33;
                        }
                        i20 = i37 | 805306368;
                        i21 = i6 & 1073741824;
                        if (i21 == 0) {
                            i22 = 6;
                        } else if ((i5 & 6) == 0) {
                            i22 = i5 | (btsVar.e(bmsVar3) ? 4 : 2);
                        } else {
                            i22 = i5;
                        }
                        i23 = i8;
                        if (btsVar.V(i23 & 1, ((i8 & 306783379) != 306783378 && (i15 & 306783379) == 306783378 && (i20 & 306783379) == 306783378 && (i22 & 3) == 2) ? false : true)) {
                            btsVar.Y();
                            ety0Var3 = ety0Var;
                            wp2Var6 = wp2Var;
                            wp2Var7 = wp2Var2;
                            wp2Var8 = wp2Var3;
                            wp2Var9 = wp2Var4;
                            ety0Var4 = ety0Var2;
                            f2 = f;
                            a07Var2 = a07Var;
                            gy31Var2 = gy31Var;
                            lkxVar2 = lkxVar;
                            xjxVar2 = xjxVar;
                            z7 = z3;
                            i24 = i;
                            i25 = i2;
                            tlsVar3 = tlsVar2;
                            buttonSize2 = buttonSize;
                            bmsVar4 = bmsVar;
                            bmsVar5 = bmsVar2;
                            bmsVar6 = bmsVar3;
                            zx40Var3 = zx40Var2;
                            str6 = str5;
                            z8 = z5;
                            osy0Var2 = osy0Var;
                            wp2Var10 = wp2Var5;
                            z9 = z4;
                            str7 = str3;
                        } else {
                            btsVar.a0();
                            int i38 = i3 & 1;
                            o430 o430Var = did.a;
                            if (i38 == 0 || btsVar.C()) {
                                if (i31 != 0) {
                                    z4 = true;
                                }
                                ety0 ety0Var8 = xya1.e(btsVar).g.a;
                                osy0 d = f7b1.d(btsVar, 6);
                                up2 up2Var = new up2(aq2.a);
                                int i39 = i23 & (-264699905);
                                AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
                                ety0 ety0Var9 = xya1.e(btsVar).h.a;
                                if (i10 != 0) {
                                    str5 = "";
                                }
                                AppColor$Palette appColor$Palette2 = AppColor$Palette.Error;
                                if ((i6 & 65536) != 0) {
                                    z5 = str5.length() > 0;
                                }
                                a07 a07Var4 = b07.a;
                                dy31 dy31Var = zoy0.w;
                                lkx lkxVar4 = lkx.f;
                                xjx xjxVar4 = xjx.g;
                                boolean z12 = i16 != 0 ? false : z3;
                                int i40 = z12 ? 1 : Integer.MAX_VALUE;
                                int i41 = i20 & (-7169);
                                if (i18 != 0) {
                                    Object Q = btsVar.Q();
                                    if (Q == o430Var) {
                                        Q = ly3.i(btsVar);
                                    }
                                    zx40Var2 = (zx40) Q;
                                }
                                Object Q2 = btsVar.Q();
                                if (Q2 == o430Var) {
                                    ety0Var5 = ety0Var9;
                                    Q2 = new wk6(6);
                                    btsVar.o0(Q2);
                                } else {
                                    ety0Var5 = ety0Var9;
                                }
                                tls tlsVar5 = (tls) Q2;
                                ButtonSize buttonSize6 = ButtonSize.L;
                                if (i19 != 0) {
                                    t3d.a.getClass();
                                    bmsVar7 = t3d.b;
                                } else {
                                    bmsVar7 = bmsVar;
                                }
                                t3d.a.getClass();
                                a aVar = t3d.c;
                                tp2 tp2Var = tp2.a;
                                if (i21 != 0) {
                                    buttonSize3 = buttonSize6;
                                    i26 = i39;
                                    bmsVar6 = wwg.S(-365598474, true, new alb0(4, appColor$Palette2), btsVar);
                                } else {
                                    buttonSize3 = buttonSize6;
                                    i26 = i39;
                                    bmsVar6 = bmsVar3;
                                }
                                wp2Var11 = appColor$Palette;
                                wp2Var12 = wp2Var11;
                                osy0Var3 = d;
                                ety0Var6 = ety0Var8;
                                gy31Var3 = dy31Var;
                                lkxVar3 = lkxVar4;
                                xjxVar3 = xjxVar4;
                                ety0Var7 = ety0Var5;
                                bmsVar8 = aVar;
                                wp2Var13 = tp2Var;
                                f3 = 7.0f;
                                i27 = 1;
                                buttonSize4 = buttonSize3;
                                wp2Var14 = appColor$Palette2;
                                z10 = z5;
                                bmsVar9 = bmsVar7;
                                a07Var3 = a07Var4;
                                str8 = "";
                                i28 = i40;
                                tlsVar4 = tlsVar5;
                                i29 = i26;
                                str6 = str5;
                                z9 = z4;
                                wp2Var15 = up2Var;
                                i30 = i41;
                                z11 = z12;
                            } else {
                                btsVar.Y();
                                ety0Var6 = ety0Var;
                                wp2Var12 = wp2Var3;
                                str8 = str3;
                                wp2Var11 = wp2Var4;
                                ety0Var7 = ety0Var2;
                                wp2Var14 = wp2Var5;
                                f3 = f;
                                a07Var3 = a07Var;
                                gy31Var3 = gy31Var;
                                lkxVar3 = lkxVar;
                                xjxVar3 = xjxVar;
                                i28 = i;
                                i27 = i2;
                                tlsVar4 = tlsVar2;
                                bmsVar9 = bmsVar;
                                bmsVar8 = bmsVar2;
                                bmsVar6 = bmsVar3;
                                i30 = i20 & (-7169);
                                i29 = i23 & (-264699905);
                                z11 = z6;
                                str6 = str5;
                                z10 = z5;
                                wp2Var13 = wp2Var;
                                osy0Var3 = osy0Var;
                                buttonSize4 = buttonSize;
                                z9 = z4;
                                wp2Var15 = wp2Var2;
                            }
                            btsVar.u();
                            oz40 b = androidx.compose.foundation.interaction.a.b(zx40Var2, btsVar, (i30 >> 15) & 14);
                            InputState inputState2 = z10 ? ((Boolean) b.getValue()).booleanValue() ? InputState.ErrorFocused : InputState.ErrorUnfocused : str.length() > 0 ? ((Boolean) b.getValue()).booleanValue() ? InputState.FillFocused : InputState.FillUnfocused : ((Boolean) b.getValue()).booleanValue() ? InputState.EmptyFocused : InputState.EmptyUnfocused;
                            Object Q3 = btsVar.Q();
                            if (Q3 == o430Var) {
                                Q3 = f.j(inputState2);
                                btsVar.o0(Q3);
                            }
                            oz40 oz40Var2 = (oz40) Q3;
                            oz40Var2.setValue(inputState2);
                            final ety0 e = ety0.e(ety0Var6, tje.n(inputState2 == InputState.ErrorUnfocused ? wp2Var14 : wp2Var13, btsVar), 0L, null, null, null, 0L, null, 0, 0L, 16777214);
                            Object Q4 = btsVar.Q();
                            if (Q4 == o430Var) {
                                wp2Var16 = wp2Var13;
                                int length = str.length();
                                oz40Var = oz40Var2;
                                buttonSize5 = buttonSize4;
                                Q4 = f.j(new hoy0(str, eja1.c(length, length), 4));
                                btsVar.o0(Q4);
                            } else {
                                wp2Var16 = wp2Var13;
                                oz40Var = oz40Var2;
                                buttonSize5 = buttonSize4;
                            }
                            final oz40 oz40Var3 = (oz40) Q4;
                            final zx40 zx40Var4 = zx40Var2;
                            final hoy0 b2 = hoy0.b((hoy0) oz40Var3.getValue(), str, 0L, 6);
                            boolean k = btsVar.k(b2);
                            Object Q5 = btsVar.Q();
                            if (k || Q5 == o430Var) {
                                Q5 = new le5(b2, oz40Var3, 1);
                                inputState = inputState2;
                                btsVar.o0(Q5);
                            } else {
                                inputState = inputState2;
                            }
                            zpn.i((sls) Q5, btsVar);
                            boolean z13 = (i29 & 14) == 4;
                            Object Q6 = btsVar.Q();
                            if (z13 || Q6 == o430Var) {
                                Q6 = f.j(str);
                                btsVar.o0(Q6);
                            }
                            final oz40 oz40Var4 = (oz40) Q6;
                            final ButtonSize buttonSize7 = buttonSize5;
                            sb2.b(psy0.a.a(osy0Var3), wwg.S(-1969798875, true, new wls() { // from class: h07
                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    fid fidVar2 = (fid) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    bts btsVar2 = (bts) fidVar2;
                                    if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                        oz40 oz40Var5 = oz40Var4;
                                        boolean k2 = btsVar2.k(oz40Var5);
                                        tls tlsVar6 = tlsVar;
                                        boolean k3 = k2 | btsVar2.k(tlsVar6);
                                        Object Q7 = btsVar2.Q();
                                        if (k3 || Q7 == did.a) {
                                            Q7 = new me5(tlsVar6, oz40Var3, oz40Var5, 1);
                                            btsVar2.o0(Q7);
                                        }
                                        tls tlsVar7 = (tls) Q7;
                                        f530 e2 = pmb1.e(f530Var);
                                        a6t0 a6t0Var = new a6t0(tje.n(wp2Var15, btsVar2));
                                        final ButtonSize buttonSize8 = buttonSize7;
                                        final oz40 oz40Var6 = oz40Var;
                                        final a07 a07Var5 = a07Var3;
                                        final boolean z14 = z10;
                                        final String str9 = str6;
                                        final wp2 wp2Var17 = wp2Var14;
                                        final bms bmsVar10 = bmsVar9;
                                        final float f4 = f3;
                                        final String str10 = str8;
                                        final String str11 = str2;
                                        final ety0 ety0Var10 = ety0Var6;
                                        final ety0 ety0Var11 = ety0Var7;
                                        final wp2 wp2Var18 = wp2Var11;
                                        final InputState inputState3 = inputState;
                                        final wp2 wp2Var19 = wp2Var12;
                                        final bms bmsVar11 = bmsVar8;
                                        final bms bmsVar12 = bmsVar6;
                                        ne5.a(hoy0.this, tlsVar7, e2, z9, false, e, lkxVar3, xjxVar3, z11, i28, i27, gy31Var3, tlsVar4, zx40Var4, a6t0Var, wwg.S(1001988936, true, new zls() { // from class: f07
                                            @Override // defpackage.zls
                                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                f530 a;
                                                wls wlsVar = (wls) obj3;
                                                fid fidVar3 = (fid) obj4;
                                                int intValue2 = ((Integer) obj5).intValue();
                                                if ((intValue2 & 6) == 0) {
                                                    intValue2 |= fidVar3.e(wlsVar) ? 4 : 2;
                                                }
                                                bts btsVar3 = (bts) fidVar3;
                                                if (btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                                    sic a2 = qic.a(lr20.c, x4c.G, btsVar3, 0);
                                                    int hashCode = Long.hashCode(btsVar3.T);
                                                    r1b0 o = btsVar3.o();
                                                    c530 c530Var = c530.a;
                                                    f530 d2 = b.d(btsVar3, c530Var);
                                                    ohd.G1.getClass();
                                                    sls slsVar = d.b;
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
                                                    qje.W(btsVar3, d.f, a2);
                                                    qje.W(btsVar3, d.e, o);
                                                    qje.W(btsVar3, d.g, Integer.valueOf(hashCode));
                                                    qje.M(btsVar3, d.h);
                                                    qje.W(btsVar3, d.d, d2);
                                                    ButtonSize buttonSize9 = ButtonSize.this;
                                                    SlotSize b3 = vcb1.b(buttonSize9);
                                                    oz40 oz40Var7 = oz40Var6;
                                                    a = b.a(c530Var, m.a(), new qk30(10, oz40Var7, a07Var5, buttonSize9));
                                                    ydb1.a(a, wwg.S(1422940220, true, new e07(bmsVar10, oz40Var7, 0), btsVar3), wwg.S(-551788895, true, new g07(oz40Var7, f4, str10, str11, ety0Var10, ety0Var11, wp2Var18, inputState3, wp2Var19, wlsVar, 0), btsVar3), wwg.S(277893002, true, new e07(bmsVar11, oz40Var7, 1), btsVar3), wwg.S(-1043049817, true, new e07(bmsVar12, oz40Var7, 2), btsVar3), null, b3, false, btsVar3, 28080, 160);
                                                    if (z14) {
                                                        btsVar3.e0(829416367);
                                                        float a3 = deb1.a(b3);
                                                        jeb1.f(str9, an91.o(c530Var, a3, 4.0f, a3, 0.0f, 8), wp2Var17, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).h.a, btsVar3, 0, 0, 16376);
                                                        btsVar3.t(false);
                                                    } else {
                                                        btsVar3.e0(829694096);
                                                        btsVar3.t(false);
                                                    }
                                                    btsVar3.t(true);
                                                } else {
                                                    btsVar3.Y();
                                                }
                                                return zy11.a;
                                            }
                                        }, btsVar2), btsVar2, 0, ImageMetadata.EDGE_MODE, 0);
                                    } else {
                                        btsVar2.Y();
                                    }
                                    return zy11.a;
                                }
                            }, btsVar), btsVar, 56);
                            wp2Var6 = wp2Var16;
                            osy0Var2 = osy0Var3;
                            zx40Var3 = zx40Var4;
                            wp2Var7 = wp2Var15;
                            buttonSize2 = buttonSize7;
                            wp2Var10 = wp2Var14;
                            str7 = str8;
                            ety0Var3 = ety0Var6;
                            ety0Var4 = ety0Var7;
                            wp2Var9 = wp2Var11;
                            wp2Var8 = wp2Var12;
                            i24 = i28;
                            i25 = i27;
                            gy31Var2 = gy31Var3;
                            tlsVar3 = tlsVar4;
                            lkxVar2 = lkxVar3;
                            xjxVar2 = xjxVar3;
                            z7 = z11;
                            a07Var2 = a07Var3;
                            z8 = z10;
                            bmsVar4 = bmsVar9;
                            f2 = f3;
                            bmsVar5 = bmsVar8;
                        }
                        v = btsVar.v();
                        if (v == null) {
                            final boolean z14 = z9;
                            final String str9 = str6;
                            final bms bmsVar10 = bmsVar6;
                            v.d = new wls() { // from class: i07
                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(i3 | 1);
                                    int O2 = vng.O(i4);
                                    int O3 = vng.O(i5);
                                    rcb1.a(str, tlsVar, f530Var, z14, ety0Var3, wp2Var6, osy0Var2, wp2Var7, str2, wp2Var8, str7, wp2Var9, ety0Var4, str9, wp2Var10, z8, f2, a07Var2, gy31Var2, lkxVar2, xjxVar2, z7, i24, i25, zx40Var3, tlsVar3, buttonSize2, bmsVar4, bmsVar5, bmsVar10, (fid) obj, O, O2, O3, i6);
                                    return zy11.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    zx40Var2 = zx40Var;
                    int i372 = i36 | 14155776;
                    i19 = i6 & SelfTester_JCP.IMITA;
                    if (i19 == 0) {
                    }
                    i20 = i372 | 805306368;
                    i21 = i6 & 1073741824;
                    if (i21 == 0) {
                    }
                    i23 = i8;
                    if (btsVar.V(i23 & 1, ((i8 & 306783379) != 306783378 && (i15 & 306783379) == 306783378 && (i20 & 306783379) == 306783378 && (i22 & 3) == 2) ? false : true)) {
                    }
                    v = btsVar.v();
                    if (v == null) {
                    }
                }
            } else {
                i13 = 196608;
                z5 = z2;
            }
            i14 = 524288;
            i15 = i34 | i14 | 851443712;
            int i352 = i4 | 54;
            i16 = i6 & SelfTester_JCP.ENCRYPT_CBC;
            if (i16 != 0) {
            }
            int i362 = i17 | 25600;
            i18 = i6 & SelfTester_JCP.DECRYPT_CFB;
            if (i18 != 0) {
            }
            zx40Var2 = zx40Var;
            int i3722 = i362 | 14155776;
            i19 = i6 & SelfTester_JCP.IMITA;
            if (i19 == 0) {
            }
            i20 = i3722 | 805306368;
            i21 = i6 & 1073741824;
            if (i21 == 0) {
            }
            i23 = i8;
            if (btsVar.V(i23 & 1, ((i8 & 306783379) != 306783378 && (i15 & 306783379) == 306783378 && (i20 & 306783379) == 306783378 && (i22 & 3) == 2) ? false : true)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        z4 = z;
        int i322 = i7 | HProv.ALG_CLASS_DATA_ENCRYPT;
        if ((i3 & ImageMetadata.EDGE_MODE) == 0) {
        }
        i8 = 1572864 | i322;
        if ((i3 & 12582912) == 0) {
        }
        i9 = i3 & 100663296;
        int i332 = SelfTester_JCP.DECRYPT_CFB;
        if (i9 == 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        i10 = i6 & 16384;
        if (i10 == 0) {
        }
        int i342 = i12 | ImageMetadata.EDGE_MODE;
        if ((i6 & 65536) != 0) {
        }
        i14 = 524288;
        i15 = i342 | i14 | 851443712;
        int i3522 = i4 | 54;
        i16 = i6 & SelfTester_JCP.ENCRYPT_CBC;
        if (i16 != 0) {
        }
        int i3622 = i17 | 25600;
        i18 = i6 & SelfTester_JCP.DECRYPT_CFB;
        if (i18 != 0) {
        }
        zx40Var2 = zx40Var;
        int i37222 = i3622 | 14155776;
        i19 = i6 & SelfTester_JCP.IMITA;
        if (i19 == 0) {
        }
        i20 = i37222 | 805306368;
        i21 = i6 & 1073741824;
        if (i21 == 0) {
        }
        i23 = i8;
        if (btsVar.V(i23 & 1, ((i8 & 306783379) != 306783378 && (i15 & 306783379) == 306783378 && (i20 & 306783379) == 306783378 && (i22 & 3) == 2) ? false : true)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void b(f530 f530Var, a aVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(883668699);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(aVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new quq0(i3, aVar);
                btsVar.o0(Q);
            }
            tls tlsVar = (tls) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new ukr0(11);
                btsVar.o0(Q2);
            }
            f530Var2 = f530Var;
            androidx.compose.ui.viewinterop.b.b(tlsVar, f530Var2, (tls) Q2, null, null, btsVar, ((i2 << 3) & 112) | 384, 24);
        } else {
            f530Var2 = f530Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tc2(f530Var2, aVar, i, 5);
        }
    }

    public static final void c(f530 f530Var, boolean z, int i, rbn rbnVar, final wls wlsVar, fid fidVar, final int i2, final int i3) {
        int i4;
        final f530 f530Var2;
        final boolean z2;
        final int i5;
        final rbn rbnVar2;
        aii0 v;
        wls wlsVar2;
        int i6;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2137124520);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (btsVar.k(f530Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= btsVar.a(z) ? 32 : 16;
        }
        int i9 = i4 | 384;
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i9 = i4 | 1408;
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i9 |= btsVar.e(wlsVar) ? 16384 : 8192;
        }
        if (btsVar.V(i9 & 1, (i9 & 9363) != 9362)) {
            btsVar.a0();
            if ((i2 & 1) == 0 || btsVar.C()) {
                if (i7 != 0) {
                    f530Var = c530.a;
                }
                if (i8 != 0) {
                    z = true;
                }
                f530Var2 = f530Var;
                i6 = i9 & (-7169);
                rbnVar2 = ubn.d;
                i5 = 2000;
            } else {
                btsVar.Y();
                f530Var2 = f530Var;
                i6 = i9 & (-7169);
                i5 = i;
                rbnVar2 = rbnVar;
            }
            z2 = z;
            btsVar.u();
            if (!z2) {
                btsVar.e0(-1518398126);
                wlsVar.invoke(btsVar, Integer.valueOf((i6 >> 12) & 14));
                btsVar.t(false);
                v = btsVar.v();
                if (v != null) {
                    final int i10 = 0;
                    wlsVar2 = new wls() { // from class: lvr0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i11 = i10;
                            zy11 zy11Var = zy11.a;
                            int i12 = i2;
                            switch (i11) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(i12 | 1);
                                    rcb1.c(f530Var2, z2, i5, rbnVar2, wlsVar, (fid) obj, O, i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int O2 = vng.O(i12 | 1);
                                    rcb1.c(f530Var2, z2, i5, rbnVar2, wlsVar, (fid) obj, O2, i3);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar2;
                }
                return;
            }
            btsVar.e0(-1518359686);
            btsVar.t(false);
            b(f530Var2, wwg.S(-1225927466, true, new ogo0(i5, rbnVar2, f530Var2, wlsVar), btsVar), btsVar, (i6 & 14) | 48);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            z2 = z;
            i5 = i;
            rbnVar2 = rbnVar;
        }
        v = btsVar.v();
        if (v != null) {
            final int i11 = 1;
            wlsVar2 = new wls() { // from class: lvr0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i112 = i11;
                    zy11 zy11Var = zy11.a;
                    int i12 = i2;
                    switch (i112) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int O = vng.O(i12 | 1);
                            rcb1.c(f530Var2, z2, i5, rbnVar2, wlsVar, (fid) obj, O, i3);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int O2 = vng.O(i12 | 1);
                            rcb1.c(f530Var2, z2, i5, rbnVar2, wlsVar, (fid) obj, O2, i3);
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar2;
        }
    }

    public static final void d(StringBuilder sb, Class cls) {
        while (cls.isArray()) {
            sb.append("[");
            cls = cls.getComponentType();
        }
        if (cls.equals(Void.TYPE)) {
            sb.append(CA20Status.STATUS_CERTIFICATE_V);
            return;
        }
        if (cls.equals(Integer.TYPE)) {
            sb.append(CA20Status.STATUS_USER_I);
            return;
        }
        if (cls.equals(Long.TYPE)) {
            sb.append("J");
            return;
        }
        if (cls.equals(Short.TYPE)) {
            sb.append("S");
            return;
        }
        if (cls.equals(Byte.TYPE)) {
            sb.append("B");
            return;
        }
        if (cls.equals(Boolean.TYPE)) {
            sb.append("Z");
            return;
        }
        if (cls.equals(Character.TYPE)) {
            sb.append(CA20Status.STATUS_REQUEST_C);
            return;
        }
        if (cls.equals(Float.TYPE)) {
            sb.append("F");
        } else {
            if (cls.equals(Double.TYPE)) {
                sb.append(CA20Status.STATUS_REQUEST_D);
                return;
            }
            sb.append("L");
            sb.append((CharSequence) cls.getName().replace('.', '/'));
            sb.append(";");
        }
    }

    public static final Method e(mfx mfxVar, String str) {
        if (!(mfxVar instanceof zzb)) {
            return null;
        }
        String f0 = evu0.f0('(', str, str);
        if (f0.equals("<init>")) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + mfxVar + '/' + str);
        }
        for (Method method : ((zzb) mfxVar).a().getDeclaredMethods()) {
            if (jl40.l(method.getName(), f0)) {
                StringBuilder sb = new StringBuilder();
                sb.append(method.getName());
                sb.append(Extension.O_BRAKE);
                for (Class<?> cls : method.getParameterTypes()) {
                    d(sb, cls);
                }
                sb.append(Extension.C_BRAKE);
                d(sb, method.getReturnType());
                if (sb.toString().equals(str)) {
                    return method;
                }
            }
        }
        return null;
    }
}
