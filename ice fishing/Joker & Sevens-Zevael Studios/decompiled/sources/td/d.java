package td;

import java.util.List;
import qd.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f6551a;

    /* renamed from: b, reason: collision with root package name */
    public final j f6552b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6553c;

    public d(List list, j jVar, int i10) {
        this.f6551a = list;
        this.f6552b = jVar;
        this.f6553c = i10;
    }

    public static d a(d dVar, j jVar, int i10, int i11) {
        List list = dVar.f6551a;
        if ((i11 & 2) != 0) {
            jVar = dVar.f6552b;
        }
        if ((i11 & 4) != 0) {
            i10 = dVar.f6553c;
        }
        dVar.getClass();
        pc.j.e(jVar, "playerData");
        return new d(list, jVar, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return pc.j.a(this.f6551a, dVar.f6551a) && pc.j.a(this.f6552b, dVar.f6552b) && this.f6553c == dVar.f6553c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6553c) + ((this.f6552b.hashCode() + (this.f6551a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MainState(menuOptions=" + this.f6551a + ", playerData=" + this.f6552b + ", bestScore=" + this.f6553c + ")";
    }
}
