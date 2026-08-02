package ru.yandex.taxi.logistics.sdk.delivery_launch.data;

import defpackage.h3y;
import defpackage.m0i;
import defpackage.xci;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.logistics.sdk.network.c;

/* loaded from: classes9.dex */
public final class b extends c {
    public final h3y i;

    public b(h3y h3yVar) {
        super(new xci(0), 0L, 14);
        this.i = h3yVar;
    }

    public final Object b(m0i m0iVar, Continuation continuation) {
        return a(new DeliveryLaunchRepositoryImpl$fetchConfigs$2(this, m0iVar, null), continuation);
    }
}
