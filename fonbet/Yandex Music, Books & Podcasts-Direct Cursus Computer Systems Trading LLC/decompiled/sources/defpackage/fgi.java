package defpackage;

/* loaded from: classes.dex */
public final class fgi {
    public Class a;
    public Class b;
    public Class c;

    public fgi(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fgi.class != obj.getClass()) {
            return false;
        }
        fgi fgiVar = (fgi) obj;
        return this.a.equals(fgiVar.a) && this.b.equals(fgiVar.b) && xut.b(this.c, fgiVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class cls = this.c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }
}
