package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class slf implements tlf {
    public final String a;
    public final boolean b;

    public slf(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slf)) {
            return false;
        }
        slf slfVar = (slf) obj;
        return Intrinsics.d(this.a, slfVar.a) && this.b == slfVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return v3w.e("SuggestsOnly(context=", this.a, ", showNotificationDot=", ")", this.b);
    }
}
