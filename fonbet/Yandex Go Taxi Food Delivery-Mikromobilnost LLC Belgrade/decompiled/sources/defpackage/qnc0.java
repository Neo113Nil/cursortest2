package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class qnc0 {
    public final ArrayList a;
    public final pnc0 b;
    public final onc0 c;

    public qnc0(ArrayList arrayList, pnc0 pnc0Var, onc0 onc0Var) {
        this.a = arrayList;
        this.b = pnc0Var;
        this.c = onc0Var;
    }

    public final List a() {
        return this.a;
    }

    public final onc0 b() {
        return this.c;
    }

    public final pnc0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnc0)) {
            return false;
        }
        qnc0 qnc0Var = (qnc0) obj;
        return this.a.equals(qnc0Var.a) && this.b.equals(qnc0Var.b) && this.c.equals(qnc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlaqueLinearGradient(colors=" + this.a + ", startPoint=" + this.b + ", endPoint=" + this.c + ')';
    }
}
