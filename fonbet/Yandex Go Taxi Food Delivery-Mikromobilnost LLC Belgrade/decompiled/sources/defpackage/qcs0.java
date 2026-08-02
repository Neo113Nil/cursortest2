package defpackage;

/* loaded from: classes2.dex */
public final class qcs0 implements rcs0 {
    public final fed0 a;

    public qcs0(fed0 fed0Var) {
        this.a = fed0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qcs0) && this.a.equals(((qcs0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PaymentLoading(loadingContent=" + this.a + ')';
    }
}
