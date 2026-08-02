package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class ywi0 extends kr {
    public static final xwi0 Companion = new xwi0();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new lqi0(4)), null};
    public final u1m a;
    public final String b;

    public /* synthetic */ ywi0(int i, u1m u1mVar, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, wwi0.a.getDescriptor());
            throw null;
        }
        this.a = u1mVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ywi0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ywi0 ywi0Var = (ywi0) obj;
        return jl40.l(this.a, ywi0Var.a) && jl40.l(this.b, ywi0Var.b);
    }

    public final int hashCode() {
        u1m u1mVar = this.a;
        int hashCode = (u1mVar != null ? u1mVar.hashCode() : 0) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RemovePreloadedAction(query=" + this.a + ", tag=" + this.b + Extension.C_BRAKE;
    }
}
