package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes6.dex */
public final class rkt {
    public final Drawable a;
    public final float b;
    public final int c;
    public final int d;

    public rkt(Drawable drawable, float f) {
        this.a = drawable;
        this.b = f;
        this.c = (int) (drawable.getMinimumWidth() * f);
        this.d = (int) (drawable.getMinimumHeight() * f);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
    }

    public /* synthetic */ rkt(Drawable drawable) {
        this(drawable, 1.0f);
    }
}
