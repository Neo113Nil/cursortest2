package defpackage;

/* loaded from: classes6.dex */
public abstract class p7w {
    public final Object a;
    public final Object b;

    public p7w(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p7w p7wVar = (p7w) obj;
        if (!this.a.equals(p7wVar.a)) {
            return false;
        }
        Object obj2 = p7wVar.b;
        Object obj3 = this.b;
        return obj3 != null ? obj3.equals(obj2) : obj2 == null;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YPair{first=");
        sb.append(this.a);
        sb.append(", second=");
        return f1d.j(sb, this.b, '}');
    }
}
