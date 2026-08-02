package ru.yandex.taxi.am.early_authorization;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.jj3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.um3;
import defpackage.wls;
import defpackage.zan;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.early_authorization.EarlyAuthorizationOnActivityCreateListener$onActivityCreate$1", f = "EarlyAuthorizationOnActivityCreateListener.kt", l = {29, 34}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class EarlyAuthorizationOnActivityCreateListener$onActivityCreate$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ zan this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.am.early_authorization.EarlyAuthorizationOnActivityCreateListener$onActivityCreate$1$1", f = "EarlyAuthorizationOnActivityCreateListener.kt", l = {39}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.am.early_authorization.EarlyAuthorizationOnActivityCreateListener$onActivityCreate$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ zan this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(zan zanVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = zanVar;
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
            zy11 zy11Var = zy11.a;
            if (i == 0) {
                kotlin.b.b(obj);
                if (this.this$0.a.f()) {
                    return zy11Var;
                }
                g gVar = (g) this.this$0.g.get();
                this.label = 1;
                if (gVar.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            this.this$0.f.a.set(true);
            ((jj3) this.this$0.e.get()).c(new um3(Events$Zalogin$LoginContext.AGREEMENT, null, false, false, 30));
            return zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarlyAuthorizationOnActivityCreateListener$onActivityCreate$1(zan zanVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zanVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EarlyAuthorizationOnActivityCreateListener$onActivityCreate$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EarlyAuthorizationOnActivityCreateListener$onActivityCreate$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        if (r3 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.preload.e eVar = this.this$0.b;
            this.label = 1;
            eVar.c(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (!this.this$0.a.f()) {
            zan zanVar = this.this$0;
            Lifecycle lifecycle = zanVar.c;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(zanVar, null);
            this.label = 2;
            if (b0.b(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
