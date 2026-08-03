package td;

import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f6548a;

    /* renamed from: b, reason: collision with root package name */
    public final a f6549b;

    public b(String str, a aVar) {
        this.f6548a = str;
        this.f6549b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f6548a, bVar.f6548a) && this.f6549b == bVar.f6549b;
    }

    public final int hashCode() {
        return this.f6549b.hashCode() + (this.f6548a.hashCode() * 31);
    }

    public final String toString() {
        return "MainMenuOption(title=" + this.f6548a + ", destination=" + this.f6549b + ")";
    }
}
