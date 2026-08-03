package qd;

import java.io.Serializable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    public final int f5851g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5852h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5853i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5854j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5855k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f5856l;

    /* renamed from: m, reason: collision with root package name */
    public final a f5857m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f5858n;

    public /* synthetic */ h() {
        this(0, 3, 0, 0, 1, false, null, false);
    }

    public static h a(h hVar, int i10, int i11, int i12, int i13, boolean z10, a aVar, boolean z11, int i14) {
        if ((i14 & 1) != 0) {
            i10 = hVar.f5851g;
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = hVar.f5852h;
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = hVar.f5853i;
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = hVar.f5854j;
        }
        int i18 = i13;
        int i19 = hVar.f5855k;
        if ((i14 & 32) != 0) {
            z10 = hVar.f5856l;
        }
        boolean z12 = z10;
        if ((i14 & 64) != 0) {
            aVar = hVar.f5857m;
        }
        return new h(i15, i16, i17, i18, i19, z12, aVar, (i14 & 128) != 0 ? hVar.f5858n : z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f5851g == hVar.f5851g && this.f5852h == hVar.f5852h && this.f5853i == hVar.f5853i && this.f5854j == hVar.f5854j && this.f5855k == hVar.f5855k && this.f5856l == hVar.f5856l && pc.j.a(this.f5857m, hVar.f5857m) && this.f5858n == hVar.f5858n;
    }

    public final int hashCode() {
        int d10 = a4.d.d(v.f.b(this.f5855k, v.f.b(this.f5854j, v.f.b(this.f5853i, v.f.b(this.f5852h, Integer.hashCode(this.f5851g) * 31, 31), 31), 31), 31), 31, this.f5856l);
        a aVar = this.f5857m;
        return Boolean.hashCode(this.f5858n) + ((d10 + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    public final String toString() {
        return "GameSession(score=" + this.f5851g + ", lives=" + this.f5852h + ", chipsEarned=" + this.f5853i + ", jokersCollected=" + this.f5854j + ", difficultyLevel=" + this.f5855k + ", isGameOver=" + this.f5856l + ", activePowerUp=" + this.f5857m + ", errorShieldActive=" + this.f5858n + ")";
    }

    public h(int i10, int i11, int i12, int i13, int i14, boolean z10, a aVar, boolean z11) {
        this.f5851g = i10;
        this.f5852h = i11;
        this.f5853i = i12;
        this.f5854j = i13;
        this.f5855k = i14;
        this.f5856l = z10;
        this.f5857m = aVar;
        this.f5858n = z11;
    }
}
