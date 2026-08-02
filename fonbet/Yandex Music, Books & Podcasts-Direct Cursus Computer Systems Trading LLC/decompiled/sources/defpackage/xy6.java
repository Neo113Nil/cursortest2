package defpackage;

/* loaded from: classes4.dex */
public final class xy6 extends zy6 {
    public final tv8 a;

    public xy6(tv8 tv8Var) {
        this.a = tv8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xy6) && this.a.equals(((xy6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(divDataForRendering=" + this.a + ")";
    }
}
