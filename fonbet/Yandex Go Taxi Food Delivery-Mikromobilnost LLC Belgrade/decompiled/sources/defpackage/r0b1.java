package defpackage;

import com.yandex.go.design.compose.icon.IconSpotSize;
import com.yandex.go.design.compose.icon.IconSpotStyle;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class r0b1 {
    public static final void a(nvi0 nvi0Var, f530 f530Var, IconSpotSize iconSpotSize, IconSpotStyle iconSpotStyle, wls wlsVar, wls wlsVar2, fid fidVar, int i) {
        wls wlsVar3;
        wls wlsVar4;
        IconSpotStyle iconSpotStyle2;
        hdu hduVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(748930955);
        int i2 = i | (btsVar.k(nvi0Var) ? 4 : 2) | (btsVar.k(f530Var) ? 32 : 16) | (btsVar.c(iconSpotSize == null ? -1 : iconSpotSize.ordinal()) ? 256 : 128) | HProv.ALG_TYPE_SECURECHANNEL;
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            IconSpotStyle iconSpotStyle3 = IconSpotStyle.Fill;
            int[] iArr = ba3.a;
            int i3 = iArr[iconSpotStyle3.ordinal()];
            tp2 tp2Var = null;
            if (i3 == 1) {
                hduVar = e5v.a;
            } else if (i3 == 2) {
                hduVar = e5v.b;
            } else {
                if (i3 != 3) {
                    w511.b();
                    return;
                }
                hduVar = null;
            }
            int i4 = iArr[iconSpotStyle3.ordinal()];
            if (i4 != 1 && i4 != 2) {
                if (i4 != 3) {
                    w511.b();
                    return;
                }
                tp2Var = tp2.a;
            }
            wlsVar3 = wlsVar;
            wlsVar4 = wlsVar2;
            e5v.a(f530Var, hduVar, tp2Var, iconSpotSize, wwg.S(1207912919, true, new qk30(6, nvi0Var, wlsVar3, wlsVar4), btsVar), btsVar, ((i2 >> 3) & 14) | HProv.ALG_CLASS_DATA_ENCRYPT | ((i2 << 3) & 7168), 0);
            iconSpotStyle2 = iconSpotStyle3;
        } else {
            wlsVar3 = wlsVar;
            wlsVar4 = wlsVar2;
            btsVar.Y();
            iconSpotStyle2 = iconSpotStyle;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t0(nvi0Var, f530Var, iconSpotSize, iconSpotStyle2, wlsVar3, wlsVar4, i);
        }
    }

    public static pxm0 b() {
        return new pxm0("ignition", "detailed_order");
    }
}
