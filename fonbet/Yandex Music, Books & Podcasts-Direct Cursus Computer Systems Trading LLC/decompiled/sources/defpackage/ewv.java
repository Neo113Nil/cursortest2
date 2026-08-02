package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ewv implements gwv {
    public final hwv a;

    public ewv(hwv hwvVar) {
        hwvVar.getClass();
        this.a = hwvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ewv) && Intrinsics.d(this.a, ((ewv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loaded(genre=" + this.a + ")";
    }
}
