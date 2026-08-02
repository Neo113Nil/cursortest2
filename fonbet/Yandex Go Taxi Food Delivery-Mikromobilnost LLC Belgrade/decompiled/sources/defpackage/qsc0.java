package defpackage;

/* loaded from: classes2.dex */
public final class qsc0 {
    public final String a;
    public final qrc0 b;

    public qsc0(String str, qrc0 qrc0Var) {
        this.a = str;
        this.b = qrc0Var;
    }

    public final qrc0 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsc0)) {
            return false;
        }
        qsc0 qsc0Var = (qsc0) obj;
        return this.a.equals(qsc0Var.a) && this.b.equals(qsc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextWidget(__typename=" + this.a + ", plaqueTextWidget=" + this.b + ')';
    }
}
