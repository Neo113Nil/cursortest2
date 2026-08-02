package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ava implements bva {
    public final String a;
    public final String b;

    public ava(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ava)) {
            return false;
        }
        ava avaVar = (ava) obj;
        return Intrinsics.d(this.a, avaVar.a) && Intrinsics.d(this.b, avaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("OpenUri(uri=", this.a, ", actionId=", this.b, ")");
    }
}
