package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class rke0 implements hle0 {
    public static final qke0 Companion = new qke0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(13))};
    public final String a;
    public final uie0 b;

    public /* synthetic */ rke0(int i, String str, uie0 uie0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, pke0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = uie0Var;
    }

    public final String a() {
        return this.a;
    }

    public final uie0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rke0)) {
            return false;
        }
        rke0 rke0Var = (rke0) obj;
        return jl40.l(this.a, rke0Var.a) && jl40.l(this.b, rke0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LesserOrEqual(argName=" + this.a + ", value=" + this.b + ')';
    }

    public rke0(String str, uie0 uie0Var) {
        this.a = str;
        this.b = uie0Var;
    }
}
