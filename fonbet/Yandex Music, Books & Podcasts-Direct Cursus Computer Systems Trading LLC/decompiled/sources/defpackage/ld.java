package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ld {
    public final String a;

    public ld(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ld) && Intrinsics.d(this.a, ((ld) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 1100064758;
    }

    public final String toString() {
        return hrg.q("Action(log_id=payment_sdk_select_method_screen_select_method, url=", this.a, ")");
    }
}
