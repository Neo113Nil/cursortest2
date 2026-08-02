package ru.yandex.taxi.systemrequeirements.location;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.systemrequeirements.location.LocationRequirementsResolveStrategyImpl", f = "LocationRequirementsResolveStrategyImpl.kt", l = {176, 177}, m = "checkRequirements", v = 2)
/* loaded from: classes10.dex */
final class LocationRequirementsResolveStrategyImpl$checkRequirements$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationRequirementsResolveStrategyImpl$checkRequirements$1(l lVar, Continuation continuation) {
        super(continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return l.a(this.this$0, this);
    }
}
