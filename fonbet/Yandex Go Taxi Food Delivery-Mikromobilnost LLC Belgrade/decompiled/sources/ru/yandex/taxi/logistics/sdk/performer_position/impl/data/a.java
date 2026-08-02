package ru.yandex.taxi.logistics.sdk.performer_position.impl.data;

import defpackage.h3y;
import defpackage.jxa0;
import defpackage.y2s;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryperformerposition.PerformerPositionRequestDto;
import ru.yandex.taxi.logistics.sdk.network.c;

/* loaded from: classes9.dex */
public final class a extends c {
    public final h3y i;

    public a(h3y h3yVar, jxa0 jxa0Var) {
        super(new y2s(1, jxa0Var), 0L, 14);
        this.i = h3yVar;
    }

    public final Object b(String str, Continuation continuation) {
        return a(new PerformerPositionRequestInteractor$getPerformerPosition$2(this, new PerformerPositionRequestDto(str), null), continuation);
    }
}
