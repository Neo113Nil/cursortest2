package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class r20 implements i9 {
    public final float qoPGr6Ce;

    public r20(float f) {
        this.qoPGr6Ce = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r20) && this.qoPGr6Ce == ((r20) obj).qoPGr6Ce;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.qoPGr6Ce)});
    }

    @Override // defpackage.i9
    public final float qoPGr6Ce(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.qoPGr6Ce;
    }

    public final String toString() {
        return ((int) (this.qoPGr6Ce * 100.0f)) + "%";
    }
}
