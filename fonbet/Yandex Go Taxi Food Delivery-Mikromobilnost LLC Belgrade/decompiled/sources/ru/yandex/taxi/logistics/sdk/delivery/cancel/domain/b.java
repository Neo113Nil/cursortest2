package ru.yandex.taxi.logistics.sdk.delivery.cancel.domain;

import com.yandex.delivery.mapper.model.CancelType;
import defpackage.cc7;
import defpackage.h3y;
import defpackage.rol0;
import defpackage.st2;
import defpackage.u7i;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

/* loaded from: classes9.dex */
public final class b {
    public final h3y a;
    public final u7i b;
    public final AppVisibilitySubscriptionImpl c;
    public final st2 d;

    public b(h3y h3yVar, u7i u7iVar, AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl, st2 st2Var) {
        this.a = h3yVar;
        this.b = u7iVar;
        this.c = appVisibilitySubscriptionImpl;
        this.d = st2Var;
    }

    public final Object a(String str, CancelType cancelType, Continuation continuation) {
        String uuid = UUID.randomUUID().toString();
        return e.y(e.F(e.K(new rol0(new CancelDeliveryOnBackendImpl$getCancellingPollingFlow$1(this, cancelType, str, uuid, null)), new cc7(this.b.a(), uuid, 1)), this.d.b), continuation);
    }
}
