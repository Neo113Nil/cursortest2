package defpackage;

import com.yandex.go.walking.navigation.impl.order.WalkNavLocalOrderTrackingInteractor$startOrderTracking$$inlined$safeCollectIn$1;
import com.yandex.go.walking.navigation.impl.order.a;
import com.yandex.go.walking.navigation.impl.order.c;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public final class v341 {
    public final tse a;
    public final a341 b;
    public final n241 c;
    public final j241 d;
    public final r341 e;
    public final a640 f;
    public final q541 g;
    public pzt0 h;

    public v341(tse tseVar, a341 a341Var, n241 n241Var, j241 j241Var, r341 r341Var, a640 a640Var, q541 q541Var) {
        this.a = tseVar;
        this.b = a341Var;
        this.c = n241Var;
        this.d = j241Var;
        this.e = r341Var;
        this.f = a640Var;
        this.g = q541Var;
    }

    public final void a() {
        pzt0 pzt0Var = this.h;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            int i = 6;
            mth mthVar = new mth(this.d.b, i);
            a341 a341Var = this.b;
            mth mthVar2 = new mth(a341Var.d, i);
            tpr e = a341Var.e();
            n241 n241Var = this.c;
            this.h = tje.N(this.a, null, null, new WalkNavLocalOrderTrackingInteractor$startOrderTracking$$inlined$safeCollectIn$1(new c(e.t(e.N(new a(new tpr[]{mthVar, mthVar2, e, n241Var.e, n241Var.g, this.g.h}), 1000L)), ref$ObjectRef, this), null, this), 3);
        }
    }

    public final void b() {
        pzt0 pzt0Var = this.h;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.h = null;
        this.e.a.l(null);
    }
}
