package ru.yandex.taxi.masstransit.overlay.onmap;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.overlay.onmap.NearestTransportTrackingInteractor", f = "NearestTransportTrackingInteractor.kt", l = {50, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "focusOnStopAndVehicle", v = 2)
/* loaded from: classes6.dex */
final class NearestTransportTrackingInteractor$focusOnStopAndVehicle$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearestTransportTrackingInteractor$focusOnStopAndVehicle$1(i iVar, Continuation continuation) {
        super(continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return i.a(this.this$0, null, null, this);
    }
}
