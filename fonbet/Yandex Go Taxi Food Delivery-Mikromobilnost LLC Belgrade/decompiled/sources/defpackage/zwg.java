package defpackage;

/* loaded from: classes6.dex */
public final class zwg implements cxg {
    public final String a;
    public final ywg b;

    public zwg(String str, ywg ywgVar) {
        this.a = str;
        this.b = ywgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zwg) {
            zwg zwgVar = (zwg) obj;
            return this.a.equals(zwgVar.a) && this.b == zwgVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Details(errorsAndWarningsOverview=" + this.a + ", hotReload=" + this.b + ')';
    }
}
