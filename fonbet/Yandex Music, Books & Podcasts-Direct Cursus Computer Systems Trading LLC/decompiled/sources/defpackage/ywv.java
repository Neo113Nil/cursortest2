package defpackage;

/* loaded from: classes4.dex */
public final class ywv implements axv {
    public final jtv a;
    public final jtv b;

    public ywv(jtv jtvVar, jtv jtvVar2) {
        this.a = jtvVar;
        this.b = jtvVar2;
    }

    @Override // defpackage.axv
    public final jtv a() {
        return this.a;
    }

    @Override // defpackage.axv
    public final jtv b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywv)) {
            return false;
        }
        ywv ywvVar = (ywv) obj;
        return this.a.equals(ywvVar.a) && this.b.equals(ywvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WithRecommendations(insertionInitiator=" + this.a + ", insertionCenter=" + this.b + ")";
    }
}
