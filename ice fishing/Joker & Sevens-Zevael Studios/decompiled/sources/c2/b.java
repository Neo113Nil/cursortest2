package c2;

import android.content.res.Resources;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Resources.Theme f1219a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1220b;

    public b(Resources.Theme theme, int i10) {
        this.f1219a = theme;
        this.f1220b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f1219a, bVar.f1219a) && this.f1220b == bVar.f1220b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1220b) + (this.f1219a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.f1219a);
        sb.append(", id=");
        return a4.d.l(sb, this.f1220b, ')');
    }
}
