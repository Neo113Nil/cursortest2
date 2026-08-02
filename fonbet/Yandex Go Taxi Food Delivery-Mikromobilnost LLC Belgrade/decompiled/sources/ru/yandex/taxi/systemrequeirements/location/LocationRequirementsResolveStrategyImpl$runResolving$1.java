package ru.yandex.taxi.systemrequeirements.location;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.systemrequeirements.location.LocationRequirementsResolveStrategyImpl$runResolving$1", f = "LocationRequirementsResolveStrategyImpl.kt", l = {162}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class LocationRequirementsResolveStrategyImpl$runResolving$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ l this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.systemrequeirements.location.LocationRequirementsResolveStrategyImpl$runResolving$1$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements tls {
        public AnonymousClass1(Object obj) {
            super(1, obj, l.class, "checkRequirements", "checkRequirements(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return l.a((l) this.receiver, (Continuation) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationRequirementsResolveStrategyImpl$runResolving$1(l lVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LocationRequirementsResolveStrategyImpl$runResolving$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((LocationRequirementsResolveStrategyImpl$runResolving$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            l lVar = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (l.b(lVar, anonymousClass1, this) == coroutineSingletons) {
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
