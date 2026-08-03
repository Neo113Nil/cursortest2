package o6;

import java.util.Arrays;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f5249a;

    /* renamed from: b, reason: collision with root package name */
    public final m6.d f5250b;

    public /* synthetic */ c0(a aVar, m6.d dVar) {
        this.f5249a = aVar;
        this.f5250b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof c0)) {
            c0 c0Var = (c0) obj;
            if (p6.u.j(this.f5249a, c0Var.f5249a) && p6.u.j(this.f5250b, c0Var.f5250b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5249a, this.f5250b});
    }

    public final String toString() {
        x4.s sVar = new x4.s(this);
        sVar.b(this.f5249a, "key");
        sVar.b(this.f5250b, "feature");
        return sVar.toString();
    }
}
