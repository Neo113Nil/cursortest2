package ru.yandex.taxi.logistics.sdk.mission_details.data;

import defpackage.a0t;
import defpackage.h3y;
import defpackage.mw7;
import defpackage.tj20;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.api.clientapi.MissionRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.CoordinateDto;
import ru.yandex.taxi.logistics.sdk.network.c;

/* loaded from: classes5.dex */
public final class a extends c {
    public final h3y i;

    public a(h3y h3yVar, tj20 tj20Var) {
        super(new mw7(6, tj20Var), 0L, 14);
        this.i = h3yVar;
    }

    public final Object b(String str, a0t a0tVar, Continuation continuation) {
        return a(new MissionDetailsDataSourceImpl$getMissionDetailsScreenData$2(this, new MissionRequestDto(str, a0tVar != null ? new CoordinateDto(a0tVar.a, a0tVar.b) : null), null), continuation);
    }
}
