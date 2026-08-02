package defpackage;

/* loaded from: classes.dex */
public final class lue extends qae {
    public final String b;
    public final String c;
    public final String d;

    public lue(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lue.class != obj.getClass()) {
            return false;
        }
        lue lueVar = (lue) obj;
        return this.c.equals(lueVar.c) && this.b.equals(lueVar.b) && this.d.equals(lueVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c(k5r.c(527, 31, this.b), 31, this.c);
    }

    @Override // defpackage.qae
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
