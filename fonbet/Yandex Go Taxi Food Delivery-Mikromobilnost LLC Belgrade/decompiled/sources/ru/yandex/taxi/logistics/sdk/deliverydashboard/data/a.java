package ru.yandex.taxi.logistics.sdk.deliverydashboard.data;

import defpackage.a0t;
import defpackage.f5i;
import defpackage.g2a0;
import defpackage.h3y;
import defpackage.j5i;
import defpackage.mw7;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.api.clientapi.DashboardContentRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.CoordinateDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.PaymentInfoDto;
import ru.yandex.taxi.logistics.sdk.network.c;

/* loaded from: classes5.dex */
public final class a extends c {
    public final h3y i;

    public a(h3y h3yVar, f5i f5iVar, j5i j5iVar, long j) {
        super(new mw7(2, j5iVar), j, 6);
        this.i = h3yVar;
    }

    public final Object b(a0t a0tVar, List list, List list2, String str, g2a0 g2a0Var, Continuation continuation) {
        return a(new DeliveryDashboardDataSourceImpl$fetchDashboardContent$2(this, new DashboardContentRequestDto(new CoordinateDto(a0tVar.a, a0tVar.b), a0tVar.c, str, g2a0Var != null ? new PaymentInfoDto(g2a0Var.a, g2a0Var.b) : null, list, list2, Boolean.FALSE), null), continuation);
    }
}
