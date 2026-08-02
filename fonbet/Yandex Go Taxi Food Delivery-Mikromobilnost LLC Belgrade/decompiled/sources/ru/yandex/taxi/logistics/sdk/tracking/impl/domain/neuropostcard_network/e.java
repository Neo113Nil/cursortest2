package ru.yandex.taxi.logistics.sdk.tracking.impl.domain.neuropostcard_network;

import defpackage.cc7;
import defpackage.h3y;
import defpackage.k360;
import defpackage.rol0;
import defpackage.st2;
import defpackage.tpr;
import defpackage.u7i;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

/* loaded from: classes5.dex */
public final class e {
    public final h3y a;
    public final u7i b;
    public final AppVisibilitySubscriptionImpl c;
    public final st2 d;
    public final ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e e;
    public final k360 f;

    public e(h3y h3yVar, u7i u7iVar, AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl, st2 st2Var, ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e eVar, k360 k360Var) {
        this.a = h3yVar;
        this.b = u7iVar;
        this.c = appVisibilitySubscriptionImpl;
        this.d = st2Var;
        this.e = eVar;
        this.f = k360Var;
    }

    public final Object a(String str, boolean z, SuspendLambda suspendLambda) {
        tpr rol0Var;
        if (z) {
            rol0Var = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.K(new rol0(new NeuroPostcardSubmitTask$getNeuroPostcardPollingFlow$1(this, str, false, null)), new cc7(this.b.a(), UUID.randomUUID().toString(), 11)), this.d.a);
        } else {
            rol0Var = new rol0(new NeuroPostcardSubmitTask$getNeuroPostcardPollingFlow$1(this, str, true, null));
        }
        return kotlinx.coroutines.flow.e.y(rol0Var, suspendLambda);
    }
}
