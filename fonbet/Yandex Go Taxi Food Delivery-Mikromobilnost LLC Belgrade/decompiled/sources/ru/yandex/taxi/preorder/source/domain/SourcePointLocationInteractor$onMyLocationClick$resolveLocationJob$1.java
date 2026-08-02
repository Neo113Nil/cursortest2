package ru.yandex.taxi.preorder.source.domain;

import defpackage.avj0;
import defpackage.kyh0;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.nwx0;
import defpackage.ny61;
import defpackage.s8z;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.analytics.LocationRequestAnalytics$Source;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.domain.SourcePointLocationInteractor$onMyLocationClick$resolveLocationJob$1", f = "SourcePointLocationInteractor.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SourcePointLocationInteractor$onMyLocationClick$resolveLocationJob$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointLocationInteractor$onMyLocationClick$resolveLocationJob$1(s sVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SourcePointLocationInteractor$onMyLocationClick$resolveLocationJob$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SourcePointLocationInteractor$onMyLocationClick$resolveLocationJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s sVar;
        s sVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                s sVar3 = this.this$0;
                ((nwx0) sVar3.l).a.c();
                ((avj0) sVar3.b).h(kyh0.address_determine_current_location);
                s sVar4 = this.this$0;
                ((nwx0) sVar4.l).a.c().M0();
                sVar4.i.b(AddressResolveRepository.State.LOADING);
                s sVar5 = this.this$0;
                try {
                    ru.yandex.taxi.location.autolocation.a aVar = sVar5.f;
                    this.L$0 = sVar5;
                    this.L$1 = sVar5;
                    this.label = 1;
                    Object o = ((ru.yandex.taxi.preorder.source.userposition.e) aVar.a).o(this);
                    if (o == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    sVar = sVar5;
                    obj = o;
                    sVar2 = sVar;
                } catch (Throwable th) {
                    th = th;
                    sVar = sVar5;
                    sVar.p.b(LocationRequestAnalytics$Source.MY_LOCATION_CLICK, th);
                    sVar.h.getClass();
                    s8z.a("onMyLocationClickErrorGettingCurrentLocation", th);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sVar = (s) this.L$1;
                sVar2 = (s) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    sVar.p.b(LocationRequestAnalytics$Source.MY_LOCATION_CLICK, th);
                    sVar.h.getClass();
                    s8z.a("onMyLocationClickErrorGettingCurrentLocation", th);
                    return zy11.a;
                }
            }
            s.a(sVar2, (mo21) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
