package defpackage;

/* loaded from: classes4.dex */
public final class mjv {
    public final ljv a;
    public final c1 b;
    public final bjv c;

    public mjv(ljv ljvVar, c1 c1Var, bjv bjvVar) {
        this.a = ljvVar;
        this.b = c1Var;
        this.c = bjvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjv)) {
            return false;
        }
        mjv mjvVar = (mjv) obj;
        return this.a.equals(mjvVar.a) && this.b.equals(mjvVar.b) && this.c.equals(mjvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WheelItemUiModel(uiData=" + this.a + ", wheelItemAnalyticsAndFeedbackPayload=" + this.b + ", domainData=" + this.c + ")";
    }
}
