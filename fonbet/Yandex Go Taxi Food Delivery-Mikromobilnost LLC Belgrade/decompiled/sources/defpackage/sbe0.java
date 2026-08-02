package defpackage;

import java.util.concurrent.CancellationException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class sbe0 implements peo {
    public final u1m a;
    public final wbe0 b;
    public final CancellationException c;

    public sbe0(u1m u1mVar, wbe0 wbe0Var, CancellationException cancellationException) {
        this.a = u1mVar;
        this.b = wbe0Var;
        this.c = cancellationException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!sbe0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        sbe0 sbe0Var = (sbe0) obj;
        return jl40.l(this.a, sbe0Var.a) && jl40.l(this.b, sbe0Var.b) && this.c.equals(sbe0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Cancelled(query=" + this.a + ", portionParams=" + this.b + ", cause=" + this.c + Extension.C_BRAKE;
    }
}
