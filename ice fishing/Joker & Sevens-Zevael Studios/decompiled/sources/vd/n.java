package vd;

import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f7350a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7351b;

    public n(int i10, List list) {
        pc.j.e(list, "powerUps");
        this.f7350a = i10;
        this.f7351b = list;
    }

    public static n a(n nVar, int i10, List list, int i11) {
        if ((i11 & 1) != 0) {
            i10 = nVar.f7350a;
        }
        if ((i11 & 2) != 0) {
            list = nVar.f7351b;
        }
        nVar.getClass();
        pc.j.e(list, "powerUps");
        return new n(i10, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f7350a == nVar.f7350a && pc.j.a(this.f7351b, nVar.f7351b);
    }

    public final int hashCode() {
        return this.f7351b.hashCode() + (Integer.hashCode(this.f7350a) * 31);
    }

    public final String toString() {
        return "ShopState(playerChips=" + this.f7350a + ", powerUps=" + this.f7351b + ")";
    }
}
