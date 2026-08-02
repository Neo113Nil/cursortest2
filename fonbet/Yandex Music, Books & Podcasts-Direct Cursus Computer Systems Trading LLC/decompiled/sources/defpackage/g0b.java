package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g0b implements h0b {
    public final zh a;

    public g0b(zh zhVar) {
        zhVar.getClass();
        this.a = zhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0b) && Intrinsics.d(this.a, ((g0b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RegularEasyLoginLauncher(activityLauncher=" + this.a + ")";
    }
}
