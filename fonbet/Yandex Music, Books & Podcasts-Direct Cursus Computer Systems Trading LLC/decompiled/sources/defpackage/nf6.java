package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nf6 {
    public final x6k a = szf.g0(kf6.a);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nf6) {
            return Intrinsics.d((mf6) ((nf6) obj).a.getValue(), (mf6) this.a.getValue());
        }
        return false;
    }

    public final int hashCode() {
        return ((mf6) this.a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((mf6) this.a.getValue()) + ')';
    }
}
