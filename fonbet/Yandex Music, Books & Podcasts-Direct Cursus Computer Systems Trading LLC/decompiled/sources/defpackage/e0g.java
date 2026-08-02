package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e0g {
    public final String a;
    public final boolean b;

    public e0g(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0g)) {
            return false;
        }
        e0g e0gVar = (e0g) obj;
        return Intrinsics.d(this.a, e0gVar.a) && this.b == e0gVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return v3w.e("LikeMessageInfo(message=", this.a, ", showOnlyOnce=", ")", this.b);
    }
}
