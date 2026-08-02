package ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.route_point;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import defpackage.mvg;
import defpackage.n351;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.pey;
import defpackage.q71;
import defpackage.tse;
import defpackage.wls;
import defpackage.x7l0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.address_details.impl.ui.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.route_point.RoutePointWidget$Content$2$1", f = "RoutePointWidget.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class RoutePointWidget$Content$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ n351 $model;
    final /* synthetic */ pey $owner;
    final /* synthetic */ oz40 $staticMapState$delegate;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq71;", "it", "Lzy11;", "<anonymous>", "(Lq71;)V"}, k = 3, mv = {2, 3, 0})
    @mvg(c = "ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.route_point.RoutePointWidget$Content$2$1$1", f = "RoutePointWidget.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.route_point.RoutePointWidget$Content$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ oz40 $staticMapState$delegate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(oz40 oz40Var, Continuation continuation) {
            super(2, continuation);
            this.$staticMapState$delegate = oz40Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$staticMapState$delegate, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((q71) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            q71 q71Var = (q71) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.$staticMapState$delegate.setValue(q71Var);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutePointWidget$Content$2$1(b bVar, n351 n351Var, pey peyVar, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$model = n351Var;
        this.$owner = peyVar;
        this.$staticMapState$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RoutePointWidget$Content$2$1(this.this$0, this.$model, this.$owner, this.$staticMapState$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RoutePointWidget$Content$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0.b;
            kotlinx.coroutines.flow.b a = g.a(eVar.x.a(((x7l0) this.$model).f), this.$owner.getLifecycle(), Lifecycle.State.RESUMED);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$staticMapState$delegate, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(a, anonymousClass1, this) == coroutineSingletons) {
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
