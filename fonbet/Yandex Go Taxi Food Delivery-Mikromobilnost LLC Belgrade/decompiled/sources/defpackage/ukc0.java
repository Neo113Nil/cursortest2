package defpackage;

/* loaded from: classes2.dex */
public final class ukc0 {
    public final String a;
    public final vkc0 b;

    public ukc0(String str, vkc0 vkc0Var) {
        this.a = str;
        this.b = vkc0Var;
    }

    public final vkc0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ukc0)) {
            return false;
        }
        ukc0 ukc0Var = (ukc0) obj;
        return this.a.equals(ukc0Var.a) && this.b.equals(ukc0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DisplayRules(__typename=" + this.a + ", onPlaqueNotificationDisplayRules=" + this.b + ')';
    }
}
