package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0k implements dm4 {
    public final Class a;

    public d0k(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // defpackage.dm4
    public final Class b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0k) {
            return Intrinsics.d(this.a, ((d0k) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
