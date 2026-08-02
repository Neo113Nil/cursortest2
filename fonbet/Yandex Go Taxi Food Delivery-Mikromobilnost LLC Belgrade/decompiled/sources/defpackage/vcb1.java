package defpackage;

import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public abstract class vcb1 {
    public static final void a(final sls slsVar, final f530 f530Var, final boolean z, ButtonSize buttonSize, final ButtonStyle buttonStyle, ButtonForm buttonForm, zls zlsVar, final zls zlsVar2, zls zlsVar3, zls zlsVar4, to5 to5Var, fid fidVar, final int i, final int i2, final int i3) {
        int i4;
        f530 f530Var2;
        boolean z2;
        zls zlsVar5;
        zls zlsVar6;
        zls zlsVar7;
        to5 to5Var2;
        int i5;
        final ButtonSize buttonSize2;
        final zls zlsVar8;
        final zls zlsVar9;
        final to5 to5Var3;
        bts btsVar;
        final zls zlsVar10;
        final ButtonForm buttonForm2;
        zls zlsVar11;
        zls zlsVar12;
        ButtonSize buttonSize3;
        int i6;
        zls zlsVar13;
        to5 to5Var4;
        ButtonForm buttonForm3;
        zls zlsVar14;
        zls zlsVar15;
        int i7;
        int i8;
        int i9;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-796816575);
        if ((i & 6) == 0) {
            i4 = (btsVar2.e(slsVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i4 |= btsVar2.k(f530Var2) ? 32 : 16;
        } else {
            f530Var2 = f530Var;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i4 |= btsVar2.a(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i4 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 |= btsVar2.c(buttonSize == null ? -1 : buttonSize.ordinal()) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 |= btsVar2.c(buttonStyle == null ? -1 : buttonStyle.ordinal()) ? 16384 : 8192;
        }
        int i11 = i3 & 32;
        if (i11 != 0) {
            i4 |= ImageMetadata.EDGE_MODE;
        } else if ((196608 & i) == 0) {
            i4 |= btsVar2.c(buttonForm != null ? buttonForm.ordinal() : -1) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            if ((i3 & 64) == 0) {
                zlsVar5 = zlsVar;
                if (btsVar2.e(zlsVar5)) {
                    i9 = 1048576;
                    i4 |= i9;
                }
            } else {
                zlsVar5 = zlsVar;
            }
            i9 = 524288;
            i4 |= i9;
        } else {
            zlsVar5 = zlsVar;
        }
        if ((12582912 & i) == 0) {
            zlsVar6 = zlsVar2;
            i4 |= btsVar2.e(zlsVar6) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        } else {
            zlsVar6 = zlsVar2;
        }
        if ((i & 100663296) == 0) {
            if ((i3 & 256) == 0 && btsVar2.e(zlsVar3)) {
                i8 = SelfTester_JCP.DECRYPT_CBC;
                i4 |= i8;
            }
            i8 = SelfTester_JCP.DECRYPT_CFB;
            i4 |= i8;
        }
        if ((i & 805306368) == 0) {
            if ((i3 & 512) == 0) {
                zlsVar7 = zlsVar4;
                if (btsVar2.e(zlsVar7)) {
                    i7 = 536870912;
                    i4 |= i7;
                }
            } else {
                zlsVar7 = zlsVar4;
            }
            i7 = SelfTester_JCP.IMITA;
            i4 |= i7;
        } else {
            zlsVar7 = zlsVar4;
        }
        int i12 = i3 & 1024;
        if (i12 != 0) {
            i5 = i2 | 6;
            to5Var2 = to5Var;
        } else {
            to5Var2 = to5Var;
            if ((i2 & 6) == 0) {
                i5 = i2 | (btsVar2.k(to5Var2) ? 4 : 2);
            } else {
                i5 = i2;
            }
        }
        int i13 = i4;
        if ((i3 & 2048) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= btsVar2.a(false) ? 32 : 16;
        }
        if (btsVar2.V(i13 & 1, ((i13 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            btsVar2.a0();
            if ((i & 1) == 0 || btsVar2.C()) {
                ButtonSize buttonSize4 = i10 != 0 ? ButtonSize.L : buttonSize;
                ButtonForm buttonForm4 = i11 != 0 ? ButtonForm.Squircle : buttonForm;
                if ((i3 & 64) != 0) {
                    zlsVar11 = p8y.a;
                    i13 &= -3670017;
                } else {
                    zlsVar11 = zlsVar5;
                }
                if ((i3 & 256) != 0) {
                    zlsVar12 = x901.a;
                    i13 &= -234881025;
                } else {
                    zlsVar12 = zlsVar3;
                }
                if ((i3 & 512) != 0) {
                    zlsVar7 = ka01.a;
                    i13 &= -1879048193;
                }
                zls zlsVar16 = zlsVar7;
                buttonSize3 = buttonSize4;
                i6 = i13;
                zlsVar13 = zlsVar16;
                to5Var4 = i12 != 0 ? x4c.E : to5Var2;
                buttonForm3 = buttonForm4;
                zlsVar14 = zlsVar11;
                zlsVar15 = zlsVar12;
            } else {
                btsVar2.Y();
                i6 = (i3 & 64) != 0 ? i13 & (-3670017) : i13;
                if ((i3 & 256) != 0) {
                    i6 &= -234881025;
                }
                if ((i3 & 512) != 0) {
                    i6 &= -1879048193;
                }
                buttonForm3 = buttonForm;
                zlsVar15 = zlsVar3;
                zlsVar13 = zlsVar7;
                to5Var4 = to5Var2;
                zlsVar14 = zlsVar5;
                buttonSize3 = buttonSize;
            }
            btsVar2.u();
            int i14 = i6 >> 3;
            d17.c(f530Var2, z2, buttonSize3, buttonStyle, buttonForm3, slsVar, wwg.S(-1796936739, true, new ags0(zlsVar14, zlsVar15, zlsVar13, to5Var4, buttonSize3, zlsVar6, 2), btsVar2), btsVar2, ((i6 << 15) & ImageMetadata.JPEG_GPS_COORDINATES) | (i14 & HProv.ALG_CLASS_ALL) | (i14 & 14) | 1572864 | (i14 & 112) | (i14 & 896) | (i14 & 7168), 0);
            buttonForm2 = buttonForm3;
            btsVar = btsVar2;
            zlsVar10 = zlsVar14;
            zlsVar8 = zlsVar15;
            zlsVar9 = zlsVar13;
            to5Var3 = to5Var4;
            buttonSize2 = buttonSize3;
        } else {
            btsVar2.Y();
            buttonSize2 = buttonSize;
            zlsVar8 = zlsVar3;
            zlsVar9 = zlsVar7;
            to5Var3 = to5Var2;
            btsVar = btsVar2;
            zlsVar10 = zlsVar5;
            buttonForm2 = buttonForm;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: o27
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i | 1);
                    int O2 = vng.O(i2);
                    vcb1.a(sls.this, f530Var, z, buttonSize2, buttonStyle, buttonForm2, zlsVar10, zlsVar2, zlsVar8, zlsVar9, to5Var3, (fid) obj, O, O2, i3);
                    return zy11.a;
                }
            };
        }
    }

    public static final SlotSize b(ButtonSize buttonSize) {
        int i = p27.a[buttonSize.ordinal()];
        if (i == 1) {
            return SlotSize.L;
        }
        if (i == 2) {
            return SlotSize.M;
        }
        if (i == 3) {
            return SlotSize.S;
        }
        if (i == 4) {
            return SlotSize.XS;
        }
        w511.b();
        return null;
    }

    public static final String c(zk4 zk4Var) {
        return g8e.p(zk4Var.c.a, " ", a.X(zk4Var.d.a, null, null, null, new ukr0(12), 31));
    }

    public static final zk4 d(ga5 ga5Var) {
        List list = ga5Var.getBase().l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof zk4) {
                arrayList.add(obj);
            }
        }
        return (zk4) a.R(arrayList);
    }

    public static final pxm0 e(Mode mode, Screen screen, yxn0 yxn0Var) {
        int i = czx.b[screen.ordinal()];
        if (i == 1) {
            if (yxn0Var instanceof xxn0) {
                return new pxm0("main", "scooter_from_map");
            }
            if (yxn0Var instanceof wxn0) {
                return new pxm0("main", "parking_from_map");
            }
            w511.b();
            return null;
        }
        if (i == 2) {
            if (yxn0Var instanceof xxn0) {
                return new pxm0("multiorder", "scooter_from_map");
            }
            if (yxn0Var instanceof wxn0) {
                return new pxm0("multiorder", "parking_from_map");
            }
            w511.b();
            return null;
        }
        if (i != 3) {
            return new pxm0("unsupported", "unsupported");
        }
        int i2 = czx.a[mode.ordinal()];
        if (i2 == 1) {
            if (yxn0Var instanceof xxn0) {
                return new pxm0("scooters_discovery", "scooter_from_map");
            }
            if (yxn0Var instanceof wxn0) {
                return new pxm0("scooters_discovery", "parking_from_map");
            }
            w511.b();
            return null;
        }
        if (i2 != 2) {
            return new pxm0("unsupported", "unsupported");
        }
        if (yxn0Var instanceof xxn0) {
            return new pxm0("city_mode", "scooter_from_map");
        }
        if (yxn0Var instanceof wxn0) {
            return new pxm0("city_mode", "parking_from_map");
        }
        w511.b();
        return null;
    }
}
