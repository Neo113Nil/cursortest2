package defpackage;

/* loaded from: classes4.dex */
public final class bwu implements mwu, xvu {
    public final tyu a;
    public final e5q b;
    public final awu c;
    public final b3l d;

    public bwu(tyu tyuVar, e5q e5qVar, awu awuVar, b3l b3lVar) {
        this.a = tyuVar;
        this.b = e5qVar;
        this.c = awuVar;
        this.d = b3lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwu)) {
            return false;
        }
        bwu bwuVar = (bwu) obj;
        return this.a.equals(bwuVar.a) && this.b.equals(bwuVar.b) && this.c == bwuVar.c && this.d.equals(bwuVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        awu awuVar = this.c;
        return this.d.hashCode() + ((hashCode + (awuVar == null ? 0 : awuVar.hashCode())) * 31);
    }

    public final String toString() {
        return "LoadingRecommendations(navigator=" + this.a + ", waveEntity=" + this.b + ", awaitingExternalCommand=" + this.c + ", action=" + this.d + ")";
    }
}
