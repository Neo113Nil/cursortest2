package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vrg extends org {
    public final Exception a;
    public final String b;

    public vrg(String str, Exception exc) {
        str.getClass();
        this.a = exc;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrg)) {
            return false;
        }
        vrg vrgVar = (vrg) obj;
        return this.a.equals(vrgVar.a) && Intrinsics.d(this.b, vrgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Public key for log server " + this.b + " cannot be used with " + vut.U(this.a);
    }
}
