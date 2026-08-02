package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class flf implements jlf {
    public final String a;
    public final boolean b;

    public flf(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flf)) {
            return false;
        }
        flf flfVar = (flf) obj;
        return Intrinsics.d(this.a, flfVar.a) && this.b == flfVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return v3w.e("ContextAndSettings(context=", this.a, ", showNotificationDot=", ")", this.b);
    }
}
