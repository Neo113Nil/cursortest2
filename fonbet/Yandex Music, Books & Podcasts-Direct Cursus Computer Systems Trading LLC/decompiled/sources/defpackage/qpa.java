package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qpa extends h8c {
    public final Drawable a;
    public final boolean b;
    public final bb7 c;

    public qpa(Drawable drawable, boolean z, bb7 bb7Var) {
        this.a = drawable;
        this.b = z;
        this.c = bb7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpa)) {
            return false;
        }
        qpa qpaVar = (qpa) obj;
        return Intrinsics.d(this.a, qpaVar.a) && this.b == qpaVar.b && this.c == qpaVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }
}
