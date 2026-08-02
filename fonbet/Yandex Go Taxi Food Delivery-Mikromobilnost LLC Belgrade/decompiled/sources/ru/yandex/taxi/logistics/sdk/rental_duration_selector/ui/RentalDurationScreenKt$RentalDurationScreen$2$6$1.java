package ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui;

import defpackage.jwh;
import defpackage.kzi0;
import defpackage.m8h;
import defpackage.qu;
import defpackage.sls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class RentalDurationScreenKt$RentalDurationScreen$2$6$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        d dVar = (d) this.receiver;
        Object value = dVar.A.getValue();
        kzi0 kzi0Var = (kzi0) kotlin.collections.a.S(((Number) value).intValue(), dVar.W());
        if (kzi0Var != null) {
            m8h m8hVar = dVar.y;
            int i = kzi0Var.a;
            jwh jwhVar = m8hVar.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("selected_time_option", Integer.valueOf(i));
            jwhVar.a.o("DeliveryCargoHour.SelectTimeScreen.Submit.Tapped", null, linkedHashMap);
            dVar.b.x.a.r(new qu(9));
        }
        return zy11.a;
    }
}
