package ru.yandex.taxi.scooters.data;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.data.ScootersDestinationNavigationRepository", f = "ScootersDestinationNavigationRepository.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 34}, m = "getSavedDestinationForSession", v = 2)
/* loaded from: classes6.dex */
final class ScootersDestinationNavigationRepository$getSavedDestinationForSession$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDestinationNavigationRepository$getSavedDestinationForSession$1(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
