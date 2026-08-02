package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class y7s0 extends kr {
    public static final x7s0 Companion = new x7s0();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new wyr0(10)), null, null};
    public final ywl a;
    public final String b;
    public final s9i0 c;

    public y7s0(int i, ywl ywlVar, String str, s9i0 s9i0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, w7s0.a.getDescriptor());
            throw null;
        }
        this.a = ywlVar;
        this.b = str;
        if ((i & 4) != 0) {
            this.c = s9i0Var;
        } else {
            s9i0.Companion.getClass();
            this.c = s9i0.b;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!y7s0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        y7s0 y7s0Var = (y7s0) obj;
        return jl40.l(this.a, y7s0Var.a) && jl40.l(this.b, y7s0Var.b) && jl40.l(this.c, y7s0Var.c);
    }

    public final int hashCode() {
        ywl ywlVar = this.a;
        return this.c.a.hashCode() + unr0.b((ywlVar != null ? ywlVar.hashCode() : 0) * 31, 31, this.b);
    }

    public final String toString() {
        return "ShowOverlayAction(document=" + this.a + ", tag=" + this.b + ", customProps=" + this.c + Extension.C_BRAKE;
    }
}
