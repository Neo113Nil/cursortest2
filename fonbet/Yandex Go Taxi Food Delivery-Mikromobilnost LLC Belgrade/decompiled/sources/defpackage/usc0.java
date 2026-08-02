package defpackage;

/* loaded from: classes2.dex */
public final class usc0 {
    public final String a;
    public final i2u b;

    public usc0(String str, i2u i2uVar) {
        this.a = str;
        this.b = i2uVar;
    }

    public final i2u a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usc0)) {
            return false;
        }
        usc0 usc0Var = (usc0) obj;
        return this.a.equals(usc0Var.a) && this.b.equals(usc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GroupDisplayRules(__typename=" + this.a + ", groupDisplayRules=" + this.b + ')';
    }
}
