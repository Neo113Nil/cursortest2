package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class zje0 implements hle0 {
    public static final yje0 Companion = new yje0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(8))};
    public final String a;
    public final uie0 b;

    public /* synthetic */ zje0(int i, String str, uie0 uie0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, xje0.a.getDescriptor());
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
        if (!(obj instanceof zje0)) {
            return false;
        }
        zje0 zje0Var = (zje0) obj;
        return jl40.l(this.a, zje0Var.a) && jl40.l(this.b, zje0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Equal(argName=" + this.a + ", value=" + this.b + ')';
    }

    public zje0(String str, uie0 uie0Var) {
        this.a = str;
        this.b = uie0Var;
    }
}
