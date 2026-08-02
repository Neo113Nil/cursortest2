package ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection;

import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.RouteMetadata;
import com.yandex.mapkit.transport.masstransit.Weight;
import defpackage.e1f0;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.mym0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x33;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.ScootersArbitraryDestinationSelectionPresenter$listenRoutePrice$1", f = "ScootersArbitraryDestinationSelectionPresenter.kt", l = {191}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersArbitraryDestinationSelectionPresenter$listenRoutePrice$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx33;", "it", "Lzy11;", "<anonymous>", "(Lx33;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.ScootersArbitraryDestinationSelectionPresenter$listenRoutePrice$1$1", f = "ScootersArbitraryDestinationSelectionPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.ScootersArbitraryDestinationSelectionPresenter$listenRoutePrice$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, d dVar) {
            super(2, continuation);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, this.this$0);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((x33) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RouteMetadata metadata;
            Weight weight;
            LocalizedValue time;
            x33 x33Var = (x33) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            Double d = null;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            d dVar = this.this$0;
            zuo0 zuo0Var = dVar.O;
            Route route = x33Var.b;
            if (route != null && (metadata = route.getMetadata()) != null && (weight = metadata.getWeight()) != null && (time = weight.getTime()) != null) {
                d = Double.valueOf(time.getValue() / 60.0d);
            }
            if (zuo0Var == null || d == null) {
                ((mym0) dVar.Dg()).Qd();
            } else {
                double doubleValue = d.doubleValue() * (dVar.O != null ? r0.g() : 0);
                ((mym0) dVar.Dg()).oa(dVar.E.a(zuo0Var.s(), kyh0.scooters_start_price_about, new e1f0((100.0d - (doubleValue % 100.0d)) + doubleValue)));
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersArbitraryDestinationSelectionPresenter$listenRoutePrice$1(Continuation continuation, d dVar) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersArbitraryDestinationSelectionPresenter$listenRoutePrice$1(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersArbitraryDestinationSelectionPresenter$listenRoutePrice$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            n0 n0Var = dVar.H.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, dVar);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(n0Var, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
