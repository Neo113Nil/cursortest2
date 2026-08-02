package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.target.ViewTarget;

/* loaded from: classes10.dex */
public abstract class rgv extends ViewTarget {
    private Animatable animatable;

    public final void b(Object obj) {
        setResource(obj);
        if (!(obj instanceof Animatable)) {
            this.animatable = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.animatable = animatable;
        animatable.start();
    }

    public Drawable getCurrentDrawable() {
        return ((ImageView) this.view).getDrawable();
    }

    @Override // com.bumptech.glide.request.target.ViewTarget, defpackage.jb5, defpackage.iax0
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.stop();
        }
        setResource(null);
        this.animatable = null;
        setDrawable(drawable);
    }

    @Override // defpackage.jb5, defpackage.iax0
    public void onLoadFailed(Drawable drawable) {
        setResource(null);
        this.animatable = null;
        setDrawable(drawable);
    }

    @Override // defpackage.jb5, defpackage.iax0
    public void onLoadStarted(Drawable drawable) {
        a();
        setResource(null);
        this.animatable = null;
        setDrawable(drawable);
    }

    @Override // defpackage.iax0
    public void onResourceReady(Object obj, xx01 xx01Var) {
        setResource(obj);
        if (!(obj instanceof Animatable)) {
            this.animatable = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.animatable = animatable;
        animatable.start();
    }

    @Override // defpackage.jb5, defpackage.hey
    public void onStart() {
        Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.jb5, defpackage.hey
    public void onStop() {
        Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public void setDrawable(Drawable drawable) {
        ((ImageView) this.view).setImageDrawable(drawable);
    }

    public abstract void setResource(Object obj);
}
