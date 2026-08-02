package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class yki0 extends kr {
    public static final uki0 Companion = new uki0();
    public static final i3y[] c;
    public final u1m a;
    public final ywl b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new hkg0(18)), a.b(lazyThreadSafetyMode, new hkg0(19))};
    }

    public /* synthetic */ yki0(int i, u1m u1mVar, ywl ywlVar) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, rki0.a.getDescriptor());
            throw null;
        }
        this.a = u1mVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ywlVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yki0.class != obj.getClass()) {
            return false;
        }
        yki0 yki0Var = (yki0) obj;
        return jl40.l(this.a, yki0Var.a) && jl40.l(this.b, yki0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ywl ywlVar = this.b;
        return hashCode + (ywlVar != null ? ywlVar.hashCode() : 0);
    }

    public final String toString() {
        return "RedirectAction(query=" + this.a + ", document=" + this.b + Extension.C_BRAKE;
    }
}
