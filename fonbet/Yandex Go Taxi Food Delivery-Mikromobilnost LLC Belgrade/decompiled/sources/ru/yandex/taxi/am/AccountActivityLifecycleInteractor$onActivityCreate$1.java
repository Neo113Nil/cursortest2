package ru.yandex.taxi.am;

import androidx.lifecycle.Lifecycle;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjy;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.AccountActivityLifecycleInteractor$onActivityCreate$1", f = "AccountActivityLifecycleInteractor.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class AccountActivityLifecycleInteractor$onActivityCreate$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.am.AccountActivityLifecycleInteractor$onActivityCreate$1$1", f = "AccountActivityLifecycleInteractor.kt", l = {67}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.am.AccountActivityLifecycleInteractor$onActivityCreate$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, d dVar) {
            super(2, continuation);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(continuation, this.this$0);
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
                    this.this$0.c.e();
                    ru.yandex.taxi.activity.f a = this.this$0.e.a(BuildConfig.API_LEVEL);
                    d dVar = this.this$0;
                    tje.N(dVar.a, null, null, new AccountActivityLifecycleInteractor$onActivityCreate$1$1$invokeSuspend$$inlined$safeCollectIn$1(a, null, dVar), 3);
                    ru.yandex.taxi.activity.f a2 = this.this$0.e.a(HProv.PP_NK_SYNC);
                    d dVar2 = this.this$0;
                    tje.N(dVar2.a, null, null, new AccountActivityLifecycleInteractor$onActivityCreate$1$1$invokeSuspend$$inlined$safeCollectIn$2(a2, null, dVar2), 3);
                    ru.yandex.taxi.activity.f a3 = this.this$0.e.a(HProv.PP_INFO);
                    d dVar3 = this.this$0;
                    tje.N(dVar3.a, null, null, new AccountActivityLifecycleInteractor$onActivityCreate$1$1$invokeSuspend$$inlined$safeCollectIn$3(a3, null, dVar3), 3);
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
                ru.yandex.taxi.zalogin.d dVar4 = this.this$0.c;
                dVar4.d(false);
                dVar4.a();
                ((sjy) dVar4.h.get()).c();
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountActivityLifecycleInteractor$onActivityCreate$1(Continuation continuation, d dVar) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountActivityLifecycleInteractor$onActivityCreate$1(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountActivityLifecycleInteractor$onActivityCreate$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            Lifecycle lifecycle = dVar.b;
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, dVar);
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
