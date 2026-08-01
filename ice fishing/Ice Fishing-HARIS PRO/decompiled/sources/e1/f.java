package e1;

import D1.h;
import D1.i;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f2846a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2847b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2848c;

    public f(String str, String str2, String str3) {
        i.e(str2, "title");
        i.e(str3, "description");
        this.f2846a = str;
        this.f2847b = str2;
        this.f2848c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return i.a(this.f2846a, fVar.f2846a) && i.a(this.f2847b, fVar.f2847b) && i.a(this.f2848c, fVar.f2848c);
    }

    public final int hashCode() {
        return this.f2848c.hashCode() + h.b(this.f2847b, this.f2846a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListCardItem(icon=");
        sb.append(this.f2846a);
        sb.append(", title=");
        sb.append(this.f2847b);
        sb.append(", description=");
        return h.h(sb, this.f2848c, ")");
    }
}
