package ru.yandex.taxi.systemrequeirements.location;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p0u;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.systemrequeirements.location.LocationRequirementsResolveStrategyImpl$onFirstContentfulPaint$2", f = "LocationRequirementsResolveStrategyImpl.kt", l = {83}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class LocationRequirementsResolveStrategyImpl$onFirstContentfulPaint$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ l this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.systemrequeirements.location.LocationRequirementsResolveStrategyImpl$onFirstContentfulPaint$2$1", f = "LocationRequirementsResolveStrategyImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.systemrequeirements.location.LocationRequirementsResolveStrategyImpl$onFirstContentfulPaint$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            LocationRequirementsException locationRequirementsException = null;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            l lVar = this.this$0;
            n0 n0Var = lVar.r;
            zy11 zy11Var = zy11.a;
            n0Var.g(zy11Var);
            n nVar = lVar.h;
            if (nVar.c.g()) {
                nVar.e.g(zy11Var);
            }
            if (nVar.a.isLocationEnabled()) {
                nVar.f.g(zy11Var);
            }
            if (((com.yandex.go.permission.b) lVar.i.a).a(1) && !nVar.c()) {
                lVar.e(new LocationRequirementsResolveStrategyImpl$onResume$1(1, lVar, l.class, "checkRequirements", "checkRequirements(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), new p0u(21));
                return zy11Var;
            }
            if (!lVar.o.a()) {
                LocationRequirementsException.Companion.getClass();
                locationRequirementsException = e.d();
            } else if (nVar.c()) {
                LocationRequirementsException.Companion.getClass();
                locationRequirementsException = e.c();
            }
            if (locationRequirementsException != null) {
                lVar.d(locationRequirementsException);
            }
            return zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationRequirementsResolveStrategyImpl$onFirstContentfulPaint$2(l lVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationRequirementsResolveStrategyImpl$onFirstContentfulPaint$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationRequirementsResolveStrategyImpl$onFirstContentfulPaint$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            l lVar = this.this$0;
            Lifecycle lifecycle = lVar.c;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(lVar, null);
            this.label = 1;
            if (b0.b(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
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
