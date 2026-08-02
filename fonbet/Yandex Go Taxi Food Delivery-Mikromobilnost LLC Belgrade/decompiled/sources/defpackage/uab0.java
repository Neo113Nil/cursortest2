package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.bottomsheet.h;

/* loaded from: classes3.dex */
public final class uab0 {
    public final gdb0 a;

    public uab0(gdb0 gdb0Var) {
        this.a = gdb0Var;
    }

    public static h a(ycb0 ycb0Var) {
        Text.Constant constant = ycb0Var.a;
        ColorModel colorModel = ycb0Var.b;
        if (colorModel == null) {
            colorModel = y390.f;
        }
        return new h(colorModel, constant);
    }
}
