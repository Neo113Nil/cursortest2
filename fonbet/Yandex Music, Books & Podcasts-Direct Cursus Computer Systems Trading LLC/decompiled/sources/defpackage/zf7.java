package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zf7 {
    public final Drawable a;
    public final boolean b;

    public zf7(Drawable drawable, boolean z) {
        this.a = drawable;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf7)) {
            return false;
        }
        zf7 zf7Var = (zf7) obj;
        return Intrinsics.d(this.a, zf7Var.a) && this.b == zf7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
