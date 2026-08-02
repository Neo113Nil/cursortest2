package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class iiv {
    public final String a;
    public final int b;
    public final bjv c;

    public iiv(String str, int i, bjv bjvVar) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = bjvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iiv)) {
            return false;
        }
        iiv iivVar = (iiv) obj;
        return Intrinsics.d(this.a, iivVar.a) && this.b == iivVar.b && this.c.equals(iivVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder l = f1d.l(this.b, "WheelInteraction(wheelId=", this.a, ", index=", ", wheelItem=");
        l.append(this.c);
        l.append(")");
        return l.toString();
    }
}
