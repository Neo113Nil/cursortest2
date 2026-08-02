package defpackage;

/* loaded from: classes2.dex */
public final class vnc0 {
    public final String a;
    public final mrc0 b;

    public vnc0(String str, mrc0 mrc0Var) {
        this.a = str;
        this.b = mrc0Var;
    }

    public final mrc0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnc0)) {
            return false;
        }
        vnc0 vnc0Var = (vnc0) obj;
        return this.a.equals(vnc0Var.a) && this.b.equals(vnc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Description(__typename=" + this.a + ", plaqueTextProperty=" + this.b + ')';
    }
}
