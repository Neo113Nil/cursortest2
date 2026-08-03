package f0;

import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2200a;

    /* renamed from: b, reason: collision with root package name */
    public String f2201b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2202c = false;

    /* renamed from: d, reason: collision with root package name */
    public d f2203d = null;

    public e(String str, String str2) {
        this.f2200a = str;
        this.f2201b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return j.a(this.f2200a, eVar.f2200a) && j.a(this.f2201b, eVar.f2201b) && this.f2202c == eVar.f2202c && j.a(this.f2203d, eVar.f2203d);
    }

    public final int hashCode() {
        int d10 = a4.d.d((this.f2201b.hashCode() + (this.f2200a.hashCode() * 31)) * 31, 31, this.f2202c);
        d dVar = this.f2203d;
        return d10 + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f2203d + ", isShowingSubstitution=" + this.f2202c + ')';
    }
}
