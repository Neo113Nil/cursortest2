package ru.yandex.taxi.logistics.sdk.delivery_sdd_slots_selector.ui;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.g8e;
import defpackage.jwh;
import defpackage.m8h;
import defpackage.poi;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class DeliverySddSlotsRoot$getView$1$1$1$1$1$2$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        poi poiVar = (poi) this.receiver;
        m8h m8hVar = poiVar.x;
        String str = poiVar.b.a;
        jwh jwhVar = m8hVar.a;
        LinkedHashMap x = g8e.x(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
        x.put("number_slots", Integer.valueOf(intValue));
        x.put("number_visible_slots", Integer.valueOf(intValue2));
        jwhVar.a.o("DetailedTariffSettings.Option.SDDslotPopup.Shown", null, x);
        return zy11.a;
    }
}
