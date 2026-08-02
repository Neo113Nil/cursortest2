package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kd6 {
    public final String a;
    public final boolean b;

    public kd6(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public static kd6 a(kd6 kd6Var, boolean z) {
        String str = kd6Var.a;
        kd6Var.getClass();
        str.getClass();
        return new kd6(str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd6)) {
            return false;
        }
        kd6 kd6Var = (kd6) obj;
        return Intrinsics.d(this.a, kd6Var.a) && this.b == kd6Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return v3w.e("ContentScreenshotState(slideId=", this.a, ", takeScreenshotTrigger=", ")", this.b);
    }
}
