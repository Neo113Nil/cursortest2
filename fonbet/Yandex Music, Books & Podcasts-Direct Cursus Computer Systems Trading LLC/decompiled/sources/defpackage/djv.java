package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class djv {
    public final String a;
    public final String b;

    public djv(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djv)) {
            return false;
        }
        djv djvVar = (djv) obj;
        return Intrinsics.d(this.a, djvVar.a) && Intrinsics.d(this.b, djvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("WheelItemFeedback(id=", this.a, ", type=", this.b, ")");
    }
}
