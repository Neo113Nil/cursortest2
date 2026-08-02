package defpackage;

import com.yandex.payment.divkit.cvv_confirm.b;
import com.yandex.payment.divkit.usecases.f;

/* loaded from: classes2.dex */
public final class rof implements hs31 {
    public final f a;
    public final oy90 b;
    public final vv90 c;
    public final nx w;
    public final abe x;

    public rof(f fVar, oy90 oy90Var, vv90 vv90Var, nx nxVar, abe abeVar) {
        this.a = fVar;
        this.b = oy90Var;
        this.c = vv90Var;
        this.w = nxVar;
        this.x = abeVar;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        if (!cls.equals(b.class)) {
            ny61.r("Unknown view model");
            return null;
        }
        return new b(this.a, this.b, this.c, this.w, this.x);
    }
}
