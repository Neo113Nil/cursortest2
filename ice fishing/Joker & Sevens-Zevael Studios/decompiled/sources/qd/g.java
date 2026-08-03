package qd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f5846a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5847b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5848c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5849d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5850e;

    public g(int i10, long j3, long j6, int i11, float f10) {
        this.f5846a = i10;
        this.f5847b = j3;
        this.f5848c = j6;
        this.f5849d = i11;
        this.f5850e = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f5846a == gVar.f5846a && this.f5847b == gVar.f5847b && this.f5848c == gVar.f5848c && this.f5849d == gVar.f5849d && Float.compare(this.f5850e, gVar.f5850e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5850e) + v.f.b(this.f5849d, a4.d.c(a4.d.c(Integer.hashCode(this.f5846a) * 31, 31, this.f5847b), 31, this.f5848c), 31);
    }

    public final String toString() {
        return "GameDifficulty(level=" + this.f5846a + ", spawnIntervalMillis=" + this.f5847b + ", cardLifetimeMillis=" + this.f5848c + ", maxCardsOnScreen=" + this.f5849d + ", groupSpawnChance=" + this.f5850e + ")";
    }
}
