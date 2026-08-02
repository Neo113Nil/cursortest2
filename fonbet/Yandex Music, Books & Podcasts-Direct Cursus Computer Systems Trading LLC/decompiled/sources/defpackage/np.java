package defpackage;

/* loaded from: classes5.dex */
public final class np {
    public final String a;
    public final op b;
    public final elu c;

    public np(String str, op opVar, elu eluVar) {
        this.a = str;
        this.b = opVar;
        this.c = eluVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np)) {
            return false;
        }
        np npVar = (np) obj;
        return this.a.equals(npVar.a) && this.b.equals(npVar.b) && this.c == npVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Agent(animationUri=" + this.a + ", cover=" + this.b + ", entityType=" + this.c + ")";
    }
}
