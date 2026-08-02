package defpackage;

/* loaded from: classes4.dex */
public final class ne5 {
    public final zil a;
    public final ime b;

    public ne5(zil zilVar, ime imeVar) {
        this.a = zilVar;
        this.b = imeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne5)) {
            return false;
        }
        ne5 ne5Var = (ne5) obj;
        return this.a.equals(ne5Var.a) && this.b.equals(ne5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonPlayerScreenAnalyticsState(analyticsQueueState=" + this.a + ", playerParametersCreator=" + this.b + ")";
    }
}
