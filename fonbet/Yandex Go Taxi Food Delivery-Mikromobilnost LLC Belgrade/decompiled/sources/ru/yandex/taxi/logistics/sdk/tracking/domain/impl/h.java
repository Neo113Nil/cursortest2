package ru.yandex.taxi.logistics.sdk.tracking.domain.impl;

import defpackage.cdz0;
import defpackage.ffx;
import defpackage.rol0;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

/* loaded from: classes5.dex */
public final class h {
    public final AppVisibilitySubscriptionImpl a;
    public long b;
    public long c;
    public final n0 d = ffx.c(0, 1, null, 5);
    public final cdz0 e;

    public h(AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl, com.yandex.delivery.utils.push.impl.a aVar) {
        this.a = appVisibilitySubscriptionImpl;
        this.e = new cdz0(aVar.y, 8);
    }

    public final rol0 a(String str) {
        return new rol0(new UpdateEmitter$updateFlow$1(this, str, null));
    }
}
