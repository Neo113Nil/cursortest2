package E0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import u3.C5068a;
import u3.C5070c;

/* loaded from: classes.dex */
public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5068a f637a;

    public b(C5068a c5068a) {
        this.f637a = c5068a;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f637a.f41018b.f41031H;
        if (colorStateList != null) {
            H.a.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C5070c c5070c = this.f637a.f41018b;
        ColorStateList colorStateList = c5070c.f41031H;
        if (colorStateList != null) {
            H.a.g(drawable, colorStateList.getColorForState(c5070c.f41034L, colorStateList.getDefaultColor()));
        }
    }
}
