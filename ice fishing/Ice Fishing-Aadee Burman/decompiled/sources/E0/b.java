package E0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import s3.C4972a;
import s3.C4974c;

/* loaded from: classes.dex */
public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4972a f657a;

    public b(C4972a c4972a) {
        this.f657a = c4972a;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f657a.f40461b.f40474H;
        if (colorStateList != null) {
            H.a.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C4974c c4974c = this.f657a.f40461b;
        ColorStateList colorStateList = c4974c.f40474H;
        if (colorStateList != null) {
            H.a.g(drawable, colorStateList.getColorForState(c4974c.f40477L, colorStateList.getDefaultColor()));
        }
    }
}
