package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class fxb {
    public final List a;
    public final String b;

    public fxb(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxb)) {
            return false;
        }
        fxb fxbVar = (fxb) obj;
        return this.a.equals(fxbVar.a) && this.b.equals(fxbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Values(values=" + this.a + ", defaultValue=" + this.b + ")";
    }
}
