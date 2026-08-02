package ru.yandex.taxi.requirements.interactor;

import androidx.lifecycle.Lifecycle;
import defpackage.etq0;
import defpackage.j5e0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.w3r0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.requirements.interactor.UpdateRequirementsInteractor$onLargestContentfulPaint$1", f = "UpdateRequirementsInteractor.kt", l = {23}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class UpdateRequirementsInteractor$onLargestContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ j0 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.requirements.interactor.UpdateRequirementsInteractor$onLargestContentfulPaint$1$1", f = "UpdateRequirementsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.requirements.interactor.UpdateRequirementsInteractor$onLargestContentfulPaint$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ j0 this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "ru.yandex.taxi.requirements.interactor.UpdateRequirementsInteractor$onLargestContentfulPaint$1$1$1", f = "UpdateRequirementsInteractor.kt", l = {25}, m = "invokeSuspend", v = 2)
        /* renamed from: ru.yandex.taxi.requirements.interactor.UpdateRequirementsInteractor$onLargestContentfulPaint$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C01141 extends SuspendLambda implements wls {
            int label;
            final /* synthetic */ j0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01141(j0 j0Var, Continuation continuation) {
                super(2, continuation);
                this.this$0 = j0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C01141(this.this$0, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((C01141) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    w3r0 w3r0Var = this.this$0.a;
                    this.label = 1;
                    mth b = ((com.yandex.go.taxi.tariffs.internal.repository.k) w3r0Var.a).j.b();
                    g0 g0Var = new g0(w3r0Var.f.a, w3r0Var);
                    w3r0Var.g.getClass();
                    if (new i0(kotlinx.coroutines.flow.e.s(new m0(b, com.yandex.go.coroutines.b.d(g0Var, new SetRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$start$1(Long.valueOf(System.currentTimeMillis()), null)), new SetRequirementsInteractor$updateRequirementsWhenReloadOrSelectedTariffChanged$2(3, null)), new etq0(2))).collect(new j5e0(14, w3r0Var), this) == coroutineSingletons) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(j0 j0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = j0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.this$0.b.getClass();
            tje.N(tseVar, uyj.a, null, new C01141(this.this$0, null), 2);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateRequirementsInteractor$onLargestContentfulPaint$1(j0 j0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = j0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpdateRequirementsInteractor$onLargestContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateRequirementsInteractor$onLargestContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            j0 j0Var = this.this$0;
            Lifecycle lifecycle = j0Var.c;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(j0Var, null);
            this.label = 1;
            if (androidx.lifecycle.b0.b(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
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
