package defpackage;

/* loaded from: classes10.dex */
public final class vrw extends x5v {
    public final String b;
    public final String c;
    public final String w;

    public vrw(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.w = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vrw.class != obj.getClass()) {
            return false;
        }
        vrw vrwVar = (vrw) obj;
        return this.c.equals(vrwVar.c) && this.b.equals(vrwVar.b) && this.w.equals(vrwVar.w);
    }

    public final int hashCode() {
        return this.w.hashCode() + unr0.b(unr0.b(527, 31, this.b), 31, this.c);
    }

    @Override // defpackage.x5v
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
