package defpackage;

import android.app.Activity;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.navigator.compose.button.CustomButtonStyle;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class y4b1 {
    public static mgv a;

    public static final void a(f530 f530Var, CustomButtonStyle customButtonStyle, ButtonSize buttonSize, sls slsVar, zls zlsVar, fid fidVar, int i, int i2) {
        int i3;
        CustomButtonStyle customButtonStyle2;
        CustomButtonStyle customButtonStyle3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1175337971);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.c(customButtonStyle == null ? -1 : customButtonStyle.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.c(buttonSize != null ? buttonSize.ordinal() : -1) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(slsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.e(zlsVar) ? 16384 : 8192;
        }
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                customButtonStyle3 = i4 != 0 ? CustomButtonStyle.Fill : customButtonStyle;
            } else {
                btsVar.Y();
                customButtonStyle3 = customButtonStyle;
            }
            btsVar.u();
            int i5 = (i3 & 910) | ((i3 << 6) & 7168);
            int i6 = i3 << 3;
            bqa1.b(f530Var, false, buttonSize, customButtonStyle3, slsVar, zlsVar, btsVar, i5 | (57344 & i6) | (i6 & ImageMetadata.JPEG_GPS_COORDINATES));
            customButtonStyle2 = customButtonStyle3;
        } else {
            btsVar.Y();
            customButtonStyle2 = customButtonStyle;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xg0(f530Var, customButtonStyle2, buttonSize, slsVar, zlsVar, i, i2, 3);
        }
    }

    public static final wjh b(Activity activity) {
        return new wjh(activity);
    }
}
