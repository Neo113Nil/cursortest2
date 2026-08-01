package q0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F0.a f4238a;

    public b(F0.a aVar) {
        this.f4238a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f4238a.f233b.f247o;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        F0.d dVar = this.f4238a.f233b;
        ColorStateList colorStateList = dVar.f247o;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(dVar.f251s, colorStateList.getDefaultColor()));
        }
    }
}
