package defpackage;

import android.graphics.drawable.PictureDrawable;

/* loaded from: classes11.dex */
public final class ydv implements zdv {
    public final PictureDrawable a;

    public /* synthetic */ ydv(PictureDrawable pictureDrawable) {
        this.a = pictureDrawable;
    }

    public static final /* synthetic */ ydv a(PictureDrawable pictureDrawable) {
        return new ydv(pictureDrawable);
    }

    public final /* synthetic */ PictureDrawable b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ydv) {
            return this.a.equals(((ydv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PictureDrawable(value=" + this.a + ')';
    }
}
