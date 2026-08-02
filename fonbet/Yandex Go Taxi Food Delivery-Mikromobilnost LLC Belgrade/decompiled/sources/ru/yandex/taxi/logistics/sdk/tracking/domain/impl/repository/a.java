package ru.yandex.taxi.logistics.sdk.tracking.domain.impl.repository;

import defpackage.h3y;
import defpackage.mw7;
import defpackage.ywh;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverycancelinfo.DeliveryCancelInfoRequestDto;
import ru.yandex.taxi.logistics.sdk.network.c;

/* loaded from: classes5.dex */
public final class a extends c {
    public final h3y i;

    public a(h3y h3yVar, ywh ywhVar) {
        super(new mw7(0, ywhVar), 0L, 14);
        this.i = h3yVar;
    }

    public final Object b(String str, Continuation continuation) {
        return a(new CancelOrderInfoRepositoryImpl$execute$2(this, new DeliveryCancelInfoRequestDto(str), null), continuation);
    }
}
