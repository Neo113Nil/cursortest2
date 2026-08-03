package k2;

import com.onesignal.core.activities.PermissionsActivity;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l implements Comparable {

    /* renamed from: h, reason: collision with root package name */
    public static final l f3611h;

    /* renamed from: i, reason: collision with root package name */
    public static final l f3612i;

    /* renamed from: j, reason: collision with root package name */
    public static final l f3613j;

    /* renamed from: k, reason: collision with root package name */
    public static final l f3614k;

    /* renamed from: g, reason: collision with root package name */
    public final int f3615g;

    static {
        l lVar = new l(100);
        l lVar2 = new l(200);
        l lVar3 = new l(300);
        l lVar4 = new l(400);
        l lVar5 = new l(PermissionsActivity.DELAY_TIME_CALLBACK_CALL);
        l lVar6 = new l(600);
        f3611h = lVar6;
        l lVar7 = new l(700);
        l lVar8 = new l(800);
        l lVar9 = new l(900);
        f3612i = lVar4;
        f3613j = lVar5;
        f3614k = lVar7;
        bc.n.L(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9);
    }

    public l(int i10) {
        this.f3615g = i10;
        boolean z10 = false;
        if (1 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        m2.a.a("Font weight can be in range [1, 1000]. Current value: " + i10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return pc.j.f(this.f3615g, ((l) obj).f3615g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f3615g == ((l) obj).f3615g;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3615g;
    }

    public final String toString() {
        return a4.d.l(new StringBuilder("FontWeight(weight="), this.f3615g, ')');
    }
}
