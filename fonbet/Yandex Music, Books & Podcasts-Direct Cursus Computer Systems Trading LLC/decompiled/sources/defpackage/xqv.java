package defpackage;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xqv {
    public final mg3 a;
    public final kqv b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xqv(Rect rect, kqv kqvVar) {
        this(new mg3(rect), kqvVar);
        rect.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xqv.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        xqv xqvVar = (xqv) obj;
        return Intrinsics.d(this.a, xqvVar.a) && Intrinsics.d(this.b, xqvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.a + ", windowInsetsCompat=" + this.b + ')';
    }

    public xqv(mg3 mg3Var, kqv kqvVar) {
        kqvVar.getClass();
        this.a = mg3Var;
        this.b = kqvVar;
    }
}
