package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fde extends y5d {
    public final ImageView b;

    public fde(ImageView imageView) {
        this.b = imageView;
    }

    @Override // defpackage.y5d
    public final void a(Drawable drawable) {
        this.b.setImageDrawable(drawable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fde) {
            return Intrinsics.d(this.b, ((fde) obj).b);
        }
        return false;
    }

    @Override // defpackage.lhu
    public final View getView() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.y5d, defpackage.z8t
    public final Drawable q() {
        return this.b.getDrawable();
    }
}
