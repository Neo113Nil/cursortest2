package qd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f5863a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5864b;

    public j(int i10, int i11) {
        this.f5863a = i10;
        this.f5864b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f5863a == jVar.f5863a && this.f5864b == jVar.f5864b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5864b) + (Integer.hashCode(this.f5863a) * 31);
    }

    public final String toString() {
        return "PlayerData(chips=" + this.f5863a + ", totalJokersCollected=" + this.f5864b + ")";
    }
}
