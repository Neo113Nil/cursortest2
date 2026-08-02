package ru.yandex.taxi.systemrequeirements.location;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p0u;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.systemrequeirements.location.LocationRequirementsResolveStrategyImpl$onFirstContentfulPaint$1", f = "LocationRequirementsResolveStrategyImpl.kt", l = {71}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class LocationRequirementsResolveStrategyImpl$onFirstContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ l this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.systemrequeirements.location.LocationRequirementsResolveStrategyImpl$onFirstContentfulPaint$1$1", f = "LocationRequirementsResolveStrategyImpl.kt", l = {74}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.systemrequeirements.location.LocationRequirementsResolveStrategyImpl$onFirstContentfulPaint$1$1, reason: invalid class name */
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
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    l lVar = this.this$0;
                    lVar.h.h = lVar.a;
                    lVar.e(new LocationRequirementsResolveStrategyImpl$runResolving$1(lVar, null), new p0u(21));
                    tje.N(lVar.b, null, null, new LocationRequirementsResolveStrategyImpl$attachActivity$$inlined$safeCollectIn$1(new i(lVar.l.a), null, lVar), 3);
                    this.label = 1;
                    if (kotlinx.coroutines.a.d(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                pzt0 pzt0Var = this.this$0.s;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                this.this$0.h.h = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationRequirementsResolveStrategyImpl$onFirstContentfulPaint$1(l lVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationRequirementsResolveStrategyImpl$onFirstContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationRequirementsResolveStrategyImpl$onFirstContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            l lVar = this.this$0;
            Lifecycle lifecycle = lVar.c;
            Lifecycle.State state = Lifecycle.State.STARTED;
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
