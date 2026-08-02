package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.neuropostcard_network.c;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

/* loaded from: classes5.dex */
public final class w360 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final gbg c;
    public final ibg d;
    public final gbg e;
    public final mzf f;
    public final gbg g;

    public /* synthetic */ w360(xvf0 xvf0Var, gbg gbgVar, ibg ibgVar, gbg gbgVar2, mzf mzfVar, gbg gbgVar3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = gbgVar;
        this.d = ibgVar;
        this.e = gbgVar2;
        this.f = mzfVar;
        this.g = gbgVar3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        gbg gbgVar = this.g;
        mzf mzfVar = this.f;
        gbg gbgVar2 = this.e;
        ibg ibgVar = this.d;
        gbg gbgVar3 = this.c;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new c(i5m.a(xvf0Var), (u7i) gbgVar3.get(), (AppVisibilitySubscriptionImpl) ibgVar.get(), (st2) gbgVar2.get(), (e) mzfVar.get(), (k360) gbgVar.get());
            default:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.domain.neuropostcard_network.e(i5m.a(xvf0Var), (u7i) gbgVar3.get(), (AppVisibilitySubscriptionImpl) ibgVar.get(), (st2) gbgVar2.get(), (e) mzfVar.get(), (k360) gbgVar.get());
        }
    }
}
