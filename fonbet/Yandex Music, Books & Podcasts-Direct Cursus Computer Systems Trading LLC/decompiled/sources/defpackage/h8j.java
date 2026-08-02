package defpackage;

import kotlinx.coroutines.internal.a;

/* loaded from: classes5.dex */
public final class h8j extends a implements iie {
    @Override // defpackage.iie
    public final boolean b() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.a
    public final boolean i() {
        return false;
    }

    public final String j(String str) {
        StringBuilder u = ouj.u("List{", str, "}[");
        Object obj = a.a.get(this);
        obj.getClass();
        boolean z = true;
        for (a aVar = (a) obj; !aVar.equals(this); aVar = aVar.h()) {
            if (aVar instanceof y2f) {
                if (z) {
                    z = false;
                } else {
                    u.append(", ");
                }
                u.append(aVar);
            }
        }
        u.append("]");
        return u.toString();
    }

    @Override // kotlinx.coroutines.internal.a
    public final String toString() {
        return ve7.a() ? j("Active") : super.toString();
    }

    @Override // defpackage.iie
    public final h8j d() {
        return this;
    }
}
