package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class sd2 implements p651 {
    public final int a;
    public final String b;
    public final oz40 c = f.j(u1w.e);
    public final oz40 d = f.j(Boolean.TRUE);

    public sd2(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.p651
    public final int a(fwi fwiVar) {
        return e().d;
    }

    @Override // defpackage.p651
    public final int b(fwi fwiVar, LayoutDirection layoutDirection) {
        return e().c;
    }

    @Override // defpackage.p651
    public final int c(fwi fwiVar) {
        return e().b;
    }

    @Override // defpackage.p651
    public final int d(fwi fwiVar, LayoutDirection layoutDirection) {
        return e().a;
    }

    public final u1w e() {
        return (u1w) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sd2) {
            return this.a == ((sd2) obj).a;
        }
        return false;
    }

    public final boolean f() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final void g(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void h(n751 n751Var, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            this.c.setValue(n751Var.a.g(i2));
            g(n751Var.a.q(i2));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('(');
        sb.append(e().a);
        sb.append(Extension.FIX_SPACE);
        sb.append(e().b);
        sb.append(Extension.FIX_SPACE);
        sb.append(e().c);
        sb.append(Extension.FIX_SPACE);
        return oyr.s(sb, e().d, ')');
    }
}
