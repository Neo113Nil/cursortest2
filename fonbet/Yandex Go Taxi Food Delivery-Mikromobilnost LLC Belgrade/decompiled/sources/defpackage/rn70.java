package defpackage;

import android.content.Context;
import android.graphics.Paint;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class rn70 extends un70 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e = f4h0.bg_order_trail_view_label_inverted;
    public final int f = xng0.textInvert;
    public final int g = aog0.trackingText;

    public rn70(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // defpackage.wn70
    public final int B(Context context) {
        return lhc.d(qje.t(aog0.trackingControlMain, context), qje.u(context.getTheme(), aog0.trackingBackground));
    }

    @Override // defpackage.wn70
    public final int C(Context context) {
        return qje.t(aog0.trackingControlMain, context);
    }

    @Override // defpackage.wn70
    public final Integer D(Context context) {
        return Integer.valueOf(qje.t(aog0.trackingText, context));
    }

    @Override // defpackage.wn70
    public final Integer E(Context context) {
        return Integer.valueOf(qje.t(aog0.trackingText, context));
    }

    @Override // defpackage.wn70
    public final Paint F(Context context) {
        if (qje.s(xng0.themeDarkMode, context)) {
            return null;
        }
        Paint paint = new Paint(1);
        paint.setShadowLayer(tje.w(16, context), 0.0f, tje.w(8, context), qje.u(context.getTheme(), aog0.trackingShadow));
        return paint;
    }

    @Override // defpackage.wn70
    public final float b(Context context) {
        return tje.w(8, context);
    }

    @Override // defpackage.wn70
    public final int d() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn70)) {
            return false;
        }
        rn70 rn70Var = (rn70) obj;
        return this.a == rn70Var.a && this.b == rn70Var.b && this.c == rn70Var.c && this.d == rn70Var.d;
    }

    @Override // defpackage.wn70
    public final int h(Context context) {
        return qje.t(aog0.trackingTextOnControlMain, context);
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    @Override // defpackage.wn70
    public final int i(Context context) {
        return qje.t(aog0.trackingText, context);
    }

    @Override // defpackage.wn70
    public final float j(Context context) {
        return tje.w(16, context);
    }

    @Override // defpackage.un70, defpackage.wn70
    public final int l() {
        return this.d;
    }

    @Override // defpackage.wn70
    public final int m() {
        return this.g;
    }

    @Override // defpackage.wn70
    public final int n(Context context) {
        return qje.t(aog0.trackingBackground, context);
    }

    @Override // defpackage.un70, defpackage.wn70
    public final int o() {
        return this.b;
    }

    @Override // defpackage.wn70
    public final int q() {
        return this.e;
    }

    @Override // defpackage.un70, defpackage.wn70
    public final int t() {
        return this.a;
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", headerSubtitleMaxLines=", Extension.C_BRAKE, b64.s(this.a, this.b, "Focus(headerMinHeight=", ", headerDefaultHorizontalPadding=", ", headerTitleMaxLines="));
    }

    @Override // defpackage.un70, defpackage.wn70
    public final int u() {
        return this.c;
    }

    @Override // defpackage.wn70
    public final int w(Context context) {
        return lhc.d(qje.t(aog0.trackingControlMinor, context), qje.u(context.getTheme(), aog0.trackingBackground));
    }

    @Override // defpackage.wn70
    public final int x(Context context) {
        return lhc.d(qje.t(aog0.trackingControlMinor, context), qje.u(context.getTheme(), aog0.trackingBackground));
    }
}
