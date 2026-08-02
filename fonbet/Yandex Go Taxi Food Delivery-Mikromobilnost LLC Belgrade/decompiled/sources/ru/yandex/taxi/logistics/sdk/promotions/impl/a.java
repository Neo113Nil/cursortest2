package ru.yandex.taxi.logistics.sdk.promotions.impl;

import defpackage.btf0;
import defpackage.doe;
import defpackage.mw7;
import defpackage.sbp0;
import defpackage.tbp0;
import defpackage.ubp0;
import defpackage.vbp0;
import defpackage.vsf0;
import defpackage.w511;
import defpackage.xbp0;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.CoordinateDto;
import ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.api.v1deliverypromotions.DeliveryRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions.CorpDashboardDto;
import ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions.DashboardDto;
import ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions.OrderFormDto;
import ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions.OrderTrackingDto;
import ru.yandex.taxi.logistics.sdk.network.c;

/* loaded from: classes5.dex */
public final class a extends c {
    public final PromotionsApi i;
    public final vsf0 j;

    public a(PromotionsApi promotionsApi, vsf0 vsf0Var, btf0 btf0Var) {
        super(new mw7(5, btf0Var), 0L, 14);
        this.i = promotionsApi;
        this.j = vsf0Var;
    }

    public final Object b(doe doeVar, xbp0 xbp0Var, Continuation continuation) {
        DeliveryRequestDto.ScreenDto screen_CorpDashboardDto;
        DeliveryRequestDto.ScreenDto screen_FormDto;
        this.j.getClass();
        if (xbp0Var.equals(tbp0.a)) {
            screen_CorpDashboardDto = new DeliveryRequestDto.ScreenDto.Screen_DashboardDto("dashboard", new DashboardDto());
        } else {
            if (xbp0Var instanceof vbp0) {
                vbp0 vbp0Var = (vbp0) xbp0Var;
                screen_FormDto = new DeliveryRequestDto.ScreenDto.Screen_TrackingDto("tracking", new OrderTrackingDto(vbp0Var.a, vbp0Var.b, vbp0Var.c));
            } else if (xbp0Var instanceof ubp0) {
                screen_FormDto = new DeliveryRequestDto.ScreenDto.Screen_FormDto("form", new OrderFormDto(((ubp0) xbp0Var).a));
            } else {
                if (!(xbp0Var instanceof sbp0)) {
                    w511.b();
                    return null;
                }
                screen_CorpDashboardDto = new DeliveryRequestDto.ScreenDto.Screen_CorpDashboardDto("corp-dashboard", new CorpDashboardDto());
            }
            screen_CorpDashboardDto = screen_FormDto;
        }
        return a(new GetPromotionBannersInteractorImpl$getBanners$2(this, new DeliveryRequestDto(screen_CorpDashboardDto, new CoordinateDto(doeVar.a, doeVar.b)), null), continuation);
    }
}
