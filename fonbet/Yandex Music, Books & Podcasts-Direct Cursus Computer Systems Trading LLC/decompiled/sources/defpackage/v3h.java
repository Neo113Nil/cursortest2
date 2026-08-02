package defpackage;

/* loaded from: classes4.dex */
public final class v3h implements y3h {
    public final mn0 a;

    public v3h(mn0 mn0Var) {
        this.a = mn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3h) && this.a.equals(((v3h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Static(text=" + ((Object) this.a) + ")";
    }
}
