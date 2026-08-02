package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class lce implements oce {
    public final Bitmap a;

    public final boolean equals(Object obj) {
        if (obj instanceof lce) {
            return Intrinsics.d(this.a, ((lce) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Bitmap(value=" + this.a + ')';
    }
}
