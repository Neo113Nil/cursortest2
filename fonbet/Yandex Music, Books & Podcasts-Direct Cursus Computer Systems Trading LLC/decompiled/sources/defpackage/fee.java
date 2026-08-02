package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class fee extends pde {
    @Override // defpackage.pde
    public final pde b(Object obj) {
        obj.getClass();
        a(obj);
        return this;
    }

    public final hee f() {
        int i = this.b;
        if (i == 0) {
            int i2 = hee.c;
            return wsn.j;
        }
        Object[] objArr = this.a;
        if (i != 1) {
            hee u = hee.u(i, objArr);
            this.b = u.size();
            this.c = true;
            return u;
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        int i3 = hee.c;
        return new gmq(obj);
    }
}
