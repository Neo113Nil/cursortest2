package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class yne0 {
    public final lbl0 a;
    public final cbl0 b;

    public yne0(lbl0 lbl0Var, cbl0 cbl0Var) {
        this.a = lbl0Var;
        this.b = cbl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yne0) {
            yne0 yne0Var = (yne0) obj;
            return this.a.equals(yne0Var.a) && this.b == yne0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PrefetchRequest(param=" + this.a + ", comparisonKey=" + this.b + Extension.C_BRAKE;
    }
}
