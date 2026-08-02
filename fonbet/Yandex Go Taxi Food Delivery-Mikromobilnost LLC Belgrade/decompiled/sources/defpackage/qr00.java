package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes6.dex */
public final class qr00 {
    public final pdc a;
    public final Context b;
    public final ValueAnimator c = new ValueAnimator();
    public final LinearInterpolator d = new LinearInterpolator();
    public final AccelerateDecelerateInterpolator e = new AccelerateDecelerateInterpolator();

    public qr00(pdc pdcVar, Context context) {
        this.a = pdcVar;
        this.b = context;
    }
}
