package ac;

import java.io.Serializable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    public final Object f270g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f271h;

    public i(Object obj, Object obj2) {
        this.f270g = obj;
        this.f271h = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return pc.j.a(this.f270g, iVar.f270g) && pc.j.a(this.f271h, iVar.f271h);
    }

    public final int hashCode() {
        Object obj = this.f270g;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f271h;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f270g + ", " + this.f271h + ')';
    }
}
