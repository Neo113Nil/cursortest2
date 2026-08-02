package ru.yandex.taxi.layers.source.requesttrigger;

import defpackage.gyx;
import defpackage.lb7;
import defpackage.sls;
import defpackage.tpr;
import kotlinx.coroutines.flow.n;

/* loaded from: classes9.dex */
public final class g {
    public final lb7 a;

    public g(lb7 lb7Var) {
        this.a = lb7Var;
    }

    public final tpr a(gyx gyxVar, sls slsVar) {
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(new n((tpr) slsVar.invoke(), new CameraEventRepository$listenToTriggerEvent$1(gyxVar, null)), new CameraEventRepository$listenToTriggerEvent$$inlined$flatMapLatest$1(null, this)));
    }
}
