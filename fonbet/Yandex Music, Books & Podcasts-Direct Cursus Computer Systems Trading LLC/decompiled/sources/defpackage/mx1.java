package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class mx1 {
    public final String a;
    public final kx1 b;

    public mx1(String str, kx1 kx1Var) {
        this.a = str;
        this.b = kx1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx1)) {
            return false;
        }
        mx1 mx1Var = (mx1) obj;
        return Intrinsics.d(this.a, mx1Var.a) && this.b == mx1Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "AudioOutputDevice(name=" + this.a + ", type=" + this.b + ")";
    }
}
