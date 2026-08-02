package defpackage;

/* loaded from: classes.dex */
public final class f40 {
    public static final f40 c = new f40(0, 0);
    public static final f40 d = new f40(2, 0);
    public static final f40 e = new f40(0, 1);
    public static final f40 f = new f40(1, 1);
    public static final f40 g = new f40(2, 1);
    public static final f40 h = new f40(1, 2);
    public final int a;
    public final int b;

    public f40(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f40.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        f40 f40Var = (f40) obj;
        return this.a == f40Var.a && this.b == f40Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Alignment(horizontal=" + ((Object) d40.b(this.a)) + ", vertical=" + ((Object) e40.b(this.b)) + ')';
    }
}
