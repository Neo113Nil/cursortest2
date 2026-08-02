package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes10.dex */
public class sgv extends xys {
    public final ImageView b;

    public sgv(ImageView imageView) {
        this.b = imageView;
    }

    @Override // defpackage.xys
    public final void a(Drawable drawable) {
        this.b.setImageDrawable(drawable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sgv) {
            return jl40.l(this.b, ((sgv) obj).b);
        }
        return false;
    }

    @Override // defpackage.nv31
    public final View getView() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.xys, defpackage.qy01
    public final Drawable n() {
        return this.b.getDrawable();
    }
}
