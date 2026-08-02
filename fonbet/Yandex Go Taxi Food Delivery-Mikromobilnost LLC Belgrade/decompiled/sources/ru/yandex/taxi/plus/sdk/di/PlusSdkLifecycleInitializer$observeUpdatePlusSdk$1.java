package ru.yandex.taxi.plus.sdk.di;

import androidx.lifecycle.Lifecycle;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ocz;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i0;
import kotlinx.coroutines.flow.n0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.lifecycle.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.sdk.di.PlusSdkLifecycleInitializer$observeUpdatePlusSdk$1", f = "PlusSdkLifecycleInitializer.kt", l = {85}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PlusSdkLifecycleInitializer$observeUpdatePlusSdk$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lzy11;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.plus.sdk.di.PlusSdkLifecycleInitializer$observeUpdatePlusSdk$1$1", f = "PlusSdkLifecycleInitializer.kt", l = {HProv.ALG_SID_NO_HASH}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.plus.sdk.di.PlusSdkLifecycleInitializer$observeUpdatePlusSdk$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((zy11) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                Lifecycle lifecycle = this.this$0.c.p;
                Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
                this.label = 1;
                if (c.e(lifecycle, event, this) == coroutineSingletons) {
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
    public PlusSdkLifecycleInitializer$observeUpdatePlusSdk$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusSdkLifecycleInitializer$observeUpdatePlusSdk$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusSdkLifecycleInitializer$observeUpdatePlusSdk$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj3 = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj3;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        n0 n0Var = bVar.c.B.b;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(bVar, null);
        ocz oczVar = new ocz(26, this.this$0);
        this.label = 1;
        i0 i0Var = new i0(oczVar, anonymousClass1);
        n0Var.getClass();
        Object m = n0.m(n0Var, i0Var, this);
        if (m != obj2) {
            m = obj3;
        }
        return m == obj2 ? obj2 : obj3;
    }
}
