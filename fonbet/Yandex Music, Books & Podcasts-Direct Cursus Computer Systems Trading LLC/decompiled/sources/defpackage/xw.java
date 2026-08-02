package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xw implements zw {
    public final tw a;

    public xw(tw twVar) {
        twVar.getClass();
        this.a = twVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xw) && Intrinsics.d(this.a, ((xw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Seen(promo=" + this.a + ")";
    }
}
