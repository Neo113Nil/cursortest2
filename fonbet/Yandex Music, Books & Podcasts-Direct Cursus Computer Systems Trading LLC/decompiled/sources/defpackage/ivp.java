package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ivp {
    public final tgo a;
    public final tgo b;
    public final tgo c;

    public ivp() {
        tgo a = ugo.a(4);
        tgo a2 = ugo.a(4);
        tgo a3 = ugo.a(0);
        this.a = a;
        this.b = a2;
        this.c = a3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivp)) {
            return false;
        }
        ivp ivpVar = (ivp) obj;
        return Intrinsics.d(this.a, ivpVar.a) && Intrinsics.d(this.b, ivpVar.b) && Intrinsics.d(this.c, ivpVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.b + ", large=" + this.c + ')';
    }
}
