package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tns0 implements sg2 {
    public final AccelerateInterpolator a;
    public final DecelerateInterpolator b;
    public final float c;

    public tns0(int i) {
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        float f = (i & 4) != 0 ? 1.0f : 0.3f;
        this.a = accelerateInterpolator;
        this.b = decelerateInterpolator;
        this.c = f;
    }

    @Override // defpackage.sg2
    public final ValueAnimator a(View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c, 0.0f);
        ofFloat.setInterpolator(this.b);
        ofFloat.addUpdateListener(new wd2(view, 13));
        return ofFloat;
    }

    @Override // defpackage.sg2
    public final ValueAnimator b(View view, uo31 uo31Var) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -this.c);
        ofFloat.setInterpolator(this.a);
        ofFloat.addUpdateListener(new wd2(view, 13));
        return ofFloat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tns0)) {
            return false;
        }
        tns0 tns0Var = (tns0) obj;
        return jl40.l(this.a, tns0Var.a) && jl40.l(this.b, tns0Var.b) && Float.compare(this.c, tns0Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlideForwardAnimation(disappearInterpolator=");
        sb.append(this.a);
        sb.append(", appearInterpolator=");
        sb.append(this.b);
        sb.append(", middleMultiplier=");
        return uw51.i(sb, this.c, Extension.C_BRAKE);
    }

    public tns0() {
        this(7);
    }
}
