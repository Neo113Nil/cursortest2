package ru.yandex.taxi.masstransit.overlay.onmap;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.overlay.onmap.StopVehicleMapFocusKt", f = "StopVehicleMapFocus.kt", l = {HProv.PP_CIPHEROID}, m = "fetchMassTransitVehiclePoint", v = 2)
/* loaded from: classes6.dex */
final class StopVehicleMapFocusKt$fetchMassTransitVehiclePoint$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return j.a(null, null, this);
    }
}
