package ru.yandex.taxi.communications;

import defpackage.cay0;
import defpackage.j5e0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.communications.TaxiScreenProvider$addCurrentScreenListener$$inlined$safeCollectIn$1", f = "TaxiScreenProvider.kt", l = {100}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class TaxiScreenProvider$addCurrentScreenListener$$inlined$safeCollectIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_safeCollectIn;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ cay0 this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lvpr;", "", "cause", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.communications.TaxiScreenProvider$addCurrentScreenListener$$inlined$safeCollectIn$1$1", f = "TaxiScreenProvider.kt", l = {35}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.communications.TaxiScreenProvider$addCurrentScreenListener$$inlined$safeCollectIn$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements zls {
        final /* synthetic */ wls $onError;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(wls wlsVar, Continuation continuation) {
            super(3, continuation);
            this.$onError = wlsVar;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onError, (Continuation) obj3);
            anonymousClass1.L$0 = (Throwable) obj2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th = (Throwable) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                wls wlsVar = this.$onError;
                this.L$0 = null;
                this.label = 1;
                if (wlsVar.invoke(th, this) == coroutineSingletons) {
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
    public TaxiScreenProvider$addCurrentScreenListener$$inlined$safeCollectIn$1(tpr tprVar, Continuation continuation, cay0 cay0Var) {
        super(2, continuation);
        this.$this_safeCollectIn = tprVar;
        this.this$0 = cay0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiScreenProvider$addCurrentScreenListener$$inlined$safeCollectIn$1(this.$this_safeCollectIn, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiScreenProvider$addCurrentScreenListener$$inlined$safeCollectIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(this.$this_safeCollectIn, new AnonymousClass1(com.yandex.go.coroutines.b.e(), null));
            j5e0 j5e0Var = new j5e0(27, this.this$0);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (oVar.collect(j5e0Var, this) == coroutineSingletons) {
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
