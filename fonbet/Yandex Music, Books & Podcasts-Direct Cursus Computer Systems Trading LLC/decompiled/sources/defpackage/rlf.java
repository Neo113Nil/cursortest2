package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rlf implements tlf {
    public final String a;
    public final boolean b;

    public rlf(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlf)) {
            return false;
        }
        rlf rlfVar = (rlf) obj;
        return Intrinsics.d(this.a, rlfVar.a) && this.b == rlfVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return v3w.e("SuggestsAndSettings(context=", this.a, ", showNotificationDot=", ")", this.b);
    }
}
