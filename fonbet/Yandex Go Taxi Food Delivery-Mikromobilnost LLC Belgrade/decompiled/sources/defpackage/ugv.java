package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes11.dex */
public final class ugv extends sgv {
    public final tls c;

    public ugv(ImageView imageView, tls tlsVar) {
        super(imageView);
        this.c = tlsVar;
    }

    @Override // defpackage.xys, defpackage.jax0
    public final void b(Drawable drawable) {
        this.c.invoke(drawable);
        d(drawable);
    }
}
