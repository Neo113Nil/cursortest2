package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class kg {
    public final String a;

    public kg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kg) {
            return Intrinsics.d(this.a, ((kg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
