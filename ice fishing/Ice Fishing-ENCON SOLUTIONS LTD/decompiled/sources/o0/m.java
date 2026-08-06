package o0;

import java.util.Arrays;
import p0.AbstractC1021r;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final C0997a f8287a;

    /* renamed from: b, reason: collision with root package name */
    public final m0.d f8288b;

    public /* synthetic */ m(C0997a c0997a, m0.d dVar) {
        this.f8287a = c0997a;
        this.f8288b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof m)) {
            m mVar = (m) obj;
            if (AbstractC1021r.e(this.f8287a, mVar.f8287a) && AbstractC1021r.e(this.f8288b, mVar.f8288b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8287a, this.f8288b});
    }

    public final String toString() {
        o.b bVar = new o.b(this);
        bVar.a(this.f8287a, "key");
        bVar.a(this.f8288b, "feature");
        return bVar.toString();
    }
}
