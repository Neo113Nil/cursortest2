package ru.yandex.taxi.systemrequeirements.location;

import defpackage.mvg;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/yandex/taxi/systemrequeirements/location/LocationRequirementsException;", "it", "Lzy11;", "<anonymous>", "(Lru/yandex/taxi/systemrequeirements/location/LocationRequirementsException;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.systemrequeirements.location.LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2$1$4", f = "LocationRequirementsResolverImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2$1$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2$1$4 locationRequirementsResolverImpl$waitLocationServiceEnablingResult$2$1$4 = new LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2$1$4(2, continuation);
        locationRequirementsResolverImpl$waitLocationServiceEnablingResult$2$1$4.L$0 = obj;
        return locationRequirementsResolverImpl$waitLocationServiceEnablingResult$2$1$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2$1$4) create((LocationRequirementsException) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LocationRequirementsException locationRequirementsException = (LocationRequirementsException) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        throw locationRequirementsException;
    }
}
