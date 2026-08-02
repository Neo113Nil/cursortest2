package defpackage;

import android.content.Context;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.ui.core.theme.PlusTheme;

/* loaded from: classes2.dex */
public final class q7d0 {
    public PlusTheme a;
    public Context b;

    public final int a() {
        return vng.p(rng0.plus_sdk_panelDefaultBackgroundColor, this.b);
    }

    public final f2d0 b() {
        return new f2d0(vng.p(rng0.plus_sdk_panelDefaultTextColor, this.b));
    }

    public final String c(PlusThemedImage plusThemedImage) {
        return (String) (tpd0.a(this.b, this.a) ? plusThemedImage.getDark() : plusThemedImage.getLight());
    }

    public final PlusColor d(PlusThemedColor plusThemedColor) {
        return (PlusColor) (tpd0.a(this.b, this.a) ? plusThemedColor.getDark() : plusThemedColor.getLight());
    }

    public final PlusColor e(PlusThemedColor plusThemedColor) {
        PlusColor.Color color = new PlusColor.Color(vng.p(rng0.plus_sdk_panelDefaultTextColor, this.b));
        PlusColor plusColor = (PlusColor) (tpd0.a(this.b, this.a) ? plusThemedColor.getDark() : plusThemedColor.getLight());
        return plusColor == null ? color : plusColor;
    }

    public final h2d0 f(PlusThemedColor plusThemedColor) {
        PlusColor plusColor = (PlusColor) (tpd0.a(this.b, this.a) ? plusThemedColor.getDark() : plusThemedColor.getLight());
        h2d0 f2d0Var = plusColor instanceof PlusColor.Color ? new f2d0(((PlusColor.Color) plusColor).getColor()) : plusColor instanceof PlusColor.Gradient ? new g2d0(s2d0.c(((PlusColor.Gradient) plusColor).getGradients())) : null;
        return f2d0Var == null ? b() : f2d0Var;
    }
}
