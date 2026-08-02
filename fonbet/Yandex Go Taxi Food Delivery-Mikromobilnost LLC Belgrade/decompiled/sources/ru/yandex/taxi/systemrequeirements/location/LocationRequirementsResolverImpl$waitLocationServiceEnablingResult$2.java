package ru.yandex.taxi.systemrequeirements.location;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.systemrequeirements.location.LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2", f = "LocationRequirementsResolverImpl.kt", l = {141}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2(n nVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2 locationRequirementsResolverImpl$waitLocationServiceEnablingResult$2 = new LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2(this.this$0, continuation);
        locationRequirementsResolverImpl$waitLocationServiceEnablingResult$2.L$0 = obj;
        return locationRequirementsResolverImpl$waitLocationServiceEnablingResult$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n nVar = this.this$0;
            kotlinx.coroutines.selects.b bVar = new kotlinx.coroutines.selects.b(get_context());
            bVar.h(tje.h(tseVar, null, null, new LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2$1$1(nVar, null), 3).H(), new LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2$1$2(2, null));
            bVar.h(tje.h(tseVar, null, null, new LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2$1$3(nVar, null), 3).H(), new LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2$1$4(2, null));
            this.L$0 = tseVar;
            this.L$1 = null;
            this.label = 1;
            if (bVar.e(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        kotlinx.coroutines.a.g(tseVar.getCoroutineContext(), null);
        return zy11.a;
    }
}
