package defpackage;

import com.yandex.mob.domain.e;
import com.yandex.mob.domain.k;
import com.yandex.mob.domain.u;
import java.util.Collections;

/* loaded from: classes8.dex */
public final class so20 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ xo20 b;

    public /* synthetic */ so20(xo20 xo20Var, int i) {
        this.a = i;
        this.b = xo20Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        xo20 xo20Var = this.b;
        switch (i) {
            case 0:
                return new k(xo20Var.a());
            default:
                return new e(xo20Var.a(), (u) xo20Var.y.getValue(), Collections.singleton("contour_integration"));
        }
    }
}
