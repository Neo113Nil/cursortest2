package ru.yandex.taxi.logistics.sdk.delivery_sdd_slots_selector.ui;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.bms;
import defpackage.g8e;
import defpackage.jwh;
import defpackage.m8h;
import defpackage.poi;
import defpackage.wwb;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class DeliverySddSlotsRoot$getView$1$1$1$1$1$1$1 extends FunctionReferenceImpl implements bms {
    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        com.yandex.go.delivery.sdd_slots_selector.a aVar;
        poi poiVar = (poi) this.receiver;
        m8h m8hVar = poiVar.x;
        String str = poiVar.b.a;
        jwh jwhVar = m8hVar.a;
        LinkedHashMap y = g8e.y(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str, "pickup_time", (String) obj2);
        y.put("dropoff_time", (String) obj3);
        y.put("price_slot", (String) obj4);
        jwhVar.a.o("DetailedTariffSettings.Option.SDDslotPopup.TappedSlot", null, y);
        aVar = poiVar.c.a.presenter;
        aVar.z.a.r(new wwb((String) obj, 11));
        return zy11.a;
    }
}
