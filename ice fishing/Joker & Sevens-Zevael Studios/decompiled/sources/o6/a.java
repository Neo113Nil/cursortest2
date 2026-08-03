package o6;

import java.util.Arrays;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5227a;

    /* renamed from: b, reason: collision with root package name */
    public final n6.c f5228b;

    /* renamed from: c, reason: collision with root package name */
    public final p6.l f5229c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5230d;

    public a(n6.c cVar, p6.l lVar, String str) {
        this.f5228b = cVar;
        this.f5229c = lVar;
        this.f5230d = str;
        this.f5227a = Arrays.hashCode(new Object[]{cVar, lVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p6.u.j(this.f5228b, aVar.f5228b) && p6.u.j(this.f5229c, aVar.f5229c) && p6.u.j(this.f5230d, aVar.f5230d);
    }

    public final int hashCode() {
        return this.f5227a;
    }
}
