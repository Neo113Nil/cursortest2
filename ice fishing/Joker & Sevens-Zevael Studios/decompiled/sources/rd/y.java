package rd;

import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final qd.j f6205a;

    /* renamed from: b, reason: collision with root package name */
    public final qd.h f6206b;

    /* renamed from: c, reason: collision with root package name */
    public final List f6207c;

    /* renamed from: d, reason: collision with root package name */
    public final List f6208d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6209e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6210f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6211g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6212h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6213i;

    /* renamed from: j, reason: collision with root package name */
    public final e0 f6214j;

    public y(qd.j jVar, qd.h hVar, List list, List list2, boolean z10, boolean z11, boolean z12, boolean z13, String str, e0 e0Var) {
        pc.j.e(list, "activeCards");
        pc.j.e(list2, "availablePowerUps");
        this.f6205a = jVar;
        this.f6206b = hVar;
        this.f6207c = list;
        this.f6208d = list2;
        this.f6209e = z10;
        this.f6210f = z11;
        this.f6211g = z12;
        this.f6212h = z13;
        this.f6213i = str;
        this.f6214j = e0Var;
    }

    public static y a(y yVar, qd.j jVar, qd.h hVar, List list, List list2, boolean z10, boolean z11, boolean z12, String str, e0 e0Var, int i10) {
        if ((i10 & 1) != 0) {
            jVar = yVar.f6205a;
        }
        qd.j jVar2 = jVar;
        if ((i10 & 2) != 0) {
            hVar = yVar.f6206b;
        }
        qd.h hVar2 = hVar;
        if ((i10 & 4) != 0) {
            list = yVar.f6207c;
        }
        List list3 = list;
        if ((i10 & 8) != 0) {
            list2 = yVar.f6208d;
        }
        List list4 = list2;
        boolean z13 = (i10 & 16) != 0 ? yVar.f6209e : true;
        boolean z14 = (i10 & 32) != 0 ? yVar.f6210f : z10;
        boolean z15 = (i10 & 64) != 0 ? yVar.f6211g : z11;
        boolean z16 = (i10 & 128) != 0 ? yVar.f6212h : z12;
        String str2 = (i10 & 256) != 0 ? yVar.f6213i : str;
        e0 e0Var2 = (i10 & 512) != 0 ? yVar.f6214j : e0Var;
        yVar.getClass();
        pc.j.e(jVar2, "playerData");
        pc.j.e(hVar2, "gameSession");
        pc.j.e(list3, "activeCards");
        pc.j.e(list4, "availablePowerUps");
        return new y(jVar2, hVar2, list3, list4, z13, z14, z15, z16, str2, e0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return pc.j.a(this.f6205a, yVar.f6205a) && pc.j.a(this.f6206b, yVar.f6206b) && pc.j.a(this.f6207c, yVar.f6207c) && pc.j.a(this.f6208d, yVar.f6208d) && this.f6209e == yVar.f6209e && this.f6210f == yVar.f6210f && this.f6211g == yVar.f6211g && this.f6212h == yVar.f6212h && pc.j.a(this.f6213i, yVar.f6213i) && this.f6214j == yVar.f6214j;
    }

    public final int hashCode() {
        int d10 = a4.d.d(a4.d.d(a4.d.d(a4.d.d((this.f6208d.hashCode() + ((this.f6207c.hashCode() + ((this.f6206b.hashCode() + (this.f6205a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f6209e), 31, this.f6210f), 31, this.f6211g), 31, this.f6212h);
        String str = this.f6213i;
        int hashCode = (d10 + (str == null ? 0 : str.hashCode())) * 31;
        e0 e0Var = this.f6214j;
        return hashCode + (e0Var != null ? e0Var.hashCode() : 0);
    }

    public final String toString() {
        return "GameState(playerData=" + this.f6205a + ", gameSession=" + this.f6206b + ", activeCards=" + this.f6207c + ", availablePowerUps=" + this.f6208d + ", isPlaying=" + this.f6209e + ", isPaused=" + this.f6210f + ", isGameOver=" + this.f6211g + ", gameOverHandled=" + this.f6212h + ", lastTappedCardId=" + this.f6213i + ", tapResult=" + this.f6214j + ")";
    }
}
