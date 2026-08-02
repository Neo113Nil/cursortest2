package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public final class y2m0 implements qy01 {
    public final /* synthetic */ ImageView a;

    public y2m0(ImageView imageView) {
        this.a = imageView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jax0
    public final void b(Drawable drawable) {
        this.a.setImageDrawable(drawable);
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.qy01
    public final Drawable n() {
        return this.a.getDrawable();
    }
}
