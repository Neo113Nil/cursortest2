package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class lu2 {
    public final String a;

    public lu2(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lu2) && Intrinsics.d(this.a, ((lu2) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return su4.o(new StringBuilder("BaseUrl(url="), this.a, ", index=0)");
    }
}
