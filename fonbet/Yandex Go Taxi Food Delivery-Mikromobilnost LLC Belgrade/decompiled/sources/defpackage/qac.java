package defpackage;

import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import coil.drawable.MovieDrawable;

/* loaded from: classes11.dex */
public final class qac extends Animatable2Compat.a {
    public final /* synthetic */ sls b;
    public final /* synthetic */ MovieDrawable c;

    public qac(sls slsVar, MovieDrawable movieDrawable) {
        this.b = slsVar;
        this.c = movieDrawable;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.a
    public final void a(Drawable drawable) {
        this.b.invoke();
        this.c.unregisterAnimationCallback(this);
    }
}
