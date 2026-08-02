package ru.yandex.taxi.plus.sdk.di;

import defpackage.d5d0;
import defpackage.ha2;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.v41;
import defpackage.wls;
import defpackage.z3d0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.plus.sdk.cache.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.sdk.di.PlusSdkLifecycleInitializer$onStart$1", f = "PlusSdkLifecycleInitializer.kt", l = {101, HProv.PP_SET_PIN}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PlusSdkLifecycleInitializer$onStart$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lz3d0;", "kotlin.jvm.PlatformType", "<anonymous>", "(Ltse;)Lz3d0;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.plus.sdk.di.PlusSdkLifecycleInitializer$onStart$1$1", f = "PlusSdkLifecycleInitializer.kt", l = {102}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.plus.sdk.di.PlusSdkLifecycleInitializer$onStart$1$1, reason: invalid class name */
    /* loaded from: classes6.dex */
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
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar = this.this$0.b;
                this.label = 1;
                if (cVar.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return this.this$0.i.get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusSdkLifecycleInitializer$onStart$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusSdkLifecycleInitializer$onStart$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusSdkLifecycleInitializer$onStart$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r8 == r0) goto L18;
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
            this.this$0.c.c.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            obj = tje.k0(mdhVar, anonymousClass1, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        d5d0 d5d0Var = (d5d0) ((com.yandex.plus.home.c) ((z3d0) obj)).f.i.getValue();
        tpr t = e.t(new ha2(13, d5d0Var.a.d(), d5d0Var));
        v41 v41Var = new v41(15, this.this$0.k);
        this.label = 2;
        Object collect = t.collect(new r(v41Var, new Ref$IntRef()), this);
        if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
