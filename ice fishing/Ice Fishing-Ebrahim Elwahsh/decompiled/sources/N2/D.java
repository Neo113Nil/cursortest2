package N2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final C0315a f1995a;

    /* renamed from: b, reason: collision with root package name */
    public final L2.d f1996b;

    public /* synthetic */ D(C0315a c0315a, L2.d dVar) {
        this.f1995a = c0315a;
        this.f1996b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof D)) {
            D d2 = (D) obj;
            if (O2.w.l(this.f1995a, d2.f1995a) && O2.w.l(this.f1996b, d2.f1996b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1995a, this.f1996b});
    }

    public final String toString() {
        S0.l lVar = new S0.l(this);
        lVar.j(this.f1995a, "key");
        lVar.j(this.f1996b, "feature");
        return lVar.toString();
    }
}
