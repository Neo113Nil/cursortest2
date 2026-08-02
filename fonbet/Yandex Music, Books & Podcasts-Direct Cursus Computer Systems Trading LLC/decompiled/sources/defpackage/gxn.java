package defpackage;

/* loaded from: classes.dex */
public final class gxn {
    public static final gxn c = new gxn(0, false);
    public final int a;
    public final boolean b;

    public gxn(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gxn.class == obj.getClass()) {
            gxn gxnVar = (gxn) obj;
            if (this.a == gxnVar.a && this.b == gxnVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
