package defpackage;

/* loaded from: classes4.dex */
public final class nyv {
    public final int a;
    public final jtv b;
    public final ktv c;

    public nyv(int i, jtv jtvVar, ktv ktvVar) {
        this.a = i;
        this.b = jtvVar;
        this.c = ktvVar;
    }

    public static nyv a(nyv nyvVar, jtv jtvVar, ktv ktvVar, int i) {
        int i2 = nyvVar.a;
        if ((i & 2) != 0) {
            jtvVar = nyvVar.b;
        }
        return new nyv(i2, jtvVar, ktvVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyv)) {
            return false;
        }
        nyv nyvVar = (nyv) obj;
        return this.a == nyvVar.a && this.b.equals(nyvVar.b) && this.c.equals(nyvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "WizardMatrixItem(id=" + this.a + ", coordinates=" + this.b + ", artist=" + this.c + ")";
    }
}
