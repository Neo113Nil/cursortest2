package defpackage;

/* loaded from: classes.dex */
public final class u70 {
    public int a;
    public int b;
    public Object c;
    public int d;

    public u70(int i, Object obj, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof u70)) {
                return false;
            }
            u70 u70Var = (u70) obj;
            int i = this.a;
            if (i != u70Var.a) {
                return false;
            }
            if (i != 8 || Math.abs(this.d - this.b) != 1 || this.d != u70Var.b || this.b != u70Var.d) {
                if (this.d != u70Var.d || this.b != u70Var.b) {
                    return false;
                }
                Object obj2 = this.c;
                Object obj3 = u70Var.c;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        return x4e.h(sb, this.c, "]");
    }
}
