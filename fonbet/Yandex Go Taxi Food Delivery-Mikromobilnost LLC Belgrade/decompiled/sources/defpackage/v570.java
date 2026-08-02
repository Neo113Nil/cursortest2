package defpackage;

/* loaded from: classes5.dex */
public final class v570 implements b151 {
    public final int a;
    public final int b;
    public final int c;
    public final r5s d;

    public v570(int i, int i2, int i3, r5s r5sVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = r5sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v570)) {
            return false;
        }
        v570 v570Var = (v570) obj;
        return this.a == v570Var.a && this.b == v570Var.b && this.c == v570Var.c && this.d.equals(v570Var.d);
    }

    public final int hashCode() {
        return (this.d.a.hashCode() + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31)) * 31;
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "OpenGalleryAction(maxWidth=", ", maxHeight=", ", maxCount=");
        s.append(this.c);
        s.append(", position=");
        s.append(this.d);
        s.append(", analyticsData=null)");
        return s.toString();
    }
}
