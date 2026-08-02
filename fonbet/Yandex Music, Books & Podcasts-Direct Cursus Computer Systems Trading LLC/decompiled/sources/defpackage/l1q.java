package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l1q implements g1q {
    public final String a;

    public l1q(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1q) && Intrinsics.d(this.a, ((l1q) obj).a);
    }

    @Override // defpackage.g1q
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return hrg.q("SharedGlagolOtherId(otherId=", this.a, ")");
    }
}
