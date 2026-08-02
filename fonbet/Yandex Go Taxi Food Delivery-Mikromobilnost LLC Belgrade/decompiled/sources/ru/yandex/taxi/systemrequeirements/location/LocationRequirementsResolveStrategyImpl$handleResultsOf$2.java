package ru.yandex.taxi.systemrequeirements.location;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.EnumSet;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.statebar.data.LocationErrorReason;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.systemrequeirements.location.LocationRequirementsResolveStrategyImpl$handleResultsOf$2", f = "LocationRequirementsResolveStrategyImpl.kt", l = {195}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class LocationRequirementsResolveStrategyImpl$handleResultsOf$2 extends SuspendLambda implements wls {
    final /* synthetic */ EnumSet<LocationErrorReason> $errorReasons;
    final /* synthetic */ tls $onError;
    final /* synthetic */ tls $resolveFlow;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationRequirementsResolveStrategyImpl$handleResultsOf$2(tls tlsVar, l lVar, EnumSet enumSet, tls tlsVar2, Continuation continuation) {
        super(2, continuation);
        this.$resolveFlow = tlsVar;
        this.this$0 = lVar;
        this.$errorReasons = enumSet;
        this.$onError = tlsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationRequirementsResolveStrategyImpl$handleResultsOf$2(this.$resolveFlow, this.this$0, this.$errorReasons, this.$onError, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationRequirementsResolveStrategyImpl$handleResultsOf$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l lVar;
        tls tlsVar;
        l lVar2;
        EnumSet<LocationErrorReason> enumSet;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                tls tlsVar2 = this.$resolveFlow;
                lVar = this.this$0;
                EnumSet<LocationErrorReason> enumSet2 = this.$errorReasons;
                tls tlsVar3 = this.$onError;
                try {
                    this.L$0 = lVar;
                    this.L$1 = enumSet2;
                    this.L$2 = lVar;
                    this.L$3 = tlsVar3;
                    this.label = 1;
                    if (tlsVar2.invoke(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lVar2 = lVar;
                    enumSet = enumSet2;
                    tlsVar = tlsVar3;
                } catch (Throwable th) {
                    th = th;
                    tlsVar = tlsVar3;
                    lVar.d(th);
                    tlsVar.invoke(th);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tlsVar = (tls) this.L$3;
                lVar = (l) this.L$2;
                enumSet = (EnumSet) this.L$1;
                lVar2 = (l) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    lVar.d(th);
                    tlsVar.invoke(th);
                    return zy11.a;
                }
            }
            lVar2.p.q = null;
            lVar2.j.b(enumSet);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
