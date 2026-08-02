package defpackage;

/* loaded from: classes6.dex */
public final class l8d {
    public final int a;
    public final int b;

    public l8d(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8d)) {
            return false;
        }
        l8d l8dVar = (l8d) obj;
        return this.a == l8dVar.a && this.b == l8dVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetEngineFromPausePlayerError(playerIndex=");
        sb.append(this.a);
        sb.append(", playerIndexWithDetachedEngine=");
        return vz1.r(sb, this.b, ')');
    }
}
