package defpackage;

/* loaded from: classes4.dex */
public final class cjk {
    public final wn5 a;

    public cjk(wn5 wn5Var) {
        this.a = wn5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cjk) && this.a.equals(((cjk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PaywallUiConfig(screenContainer=" + this.a + ")";
    }
}
