package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class sy11 implements p651 {
    public final p651 a;
    public final p651 b;

    public sy11(p651 p651Var, p651 p651Var2) {
        this.a = p651Var;
        this.b = p651Var2;
    }

    @Override // defpackage.p651
    public final int a(fwi fwiVar) {
        return Math.max(this.a.a(fwiVar), this.b.a(fwiVar));
    }

    @Override // defpackage.p651
    public final int b(fwi fwiVar, LayoutDirection layoutDirection) {
        return Math.max(this.a.b(fwiVar, layoutDirection), this.b.b(fwiVar, layoutDirection));
    }

    @Override // defpackage.p651
    public final int c(fwi fwiVar) {
        return Math.max(this.a.c(fwiVar), this.b.c(fwiVar));
    }

    @Override // defpackage.p651
    public final int d(fwi fwiVar, LayoutDirection layoutDirection) {
        return Math.max(this.a.d(fwiVar, layoutDirection), this.b.d(fwiVar, layoutDirection));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy11)) {
            return false;
        }
        sy11 sy11Var = (sy11) obj;
        return jl40.l(sy11Var.a, this.a) && jl40.l(sy11Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return Extension.O_BRAKE + this.a + " ∪ " + this.b + ')';
    }
}
