package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yw implements zw {
    public final tw a;

    public yw(tw twVar) {
        twVar.getClass();
        this.a = twVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yw) && Intrinsics.d(this.a, ((yw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Unseen(promo=" + this.a + ")";
    }
}
