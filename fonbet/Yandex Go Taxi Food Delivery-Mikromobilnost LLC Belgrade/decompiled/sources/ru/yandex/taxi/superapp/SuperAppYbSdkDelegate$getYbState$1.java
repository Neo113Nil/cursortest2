package ru.yandex.taxi.superapp;

import com.yandex.go.yb.api.experiments.YbWalletEntryPointExperiment;
import defpackage.as51;
import defpackage.ck7;
import defpackage.g6u;
import defpackage.gcn;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.rx51;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.eatskit.dto.YbStateResponse$YbState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.SuperAppYbSdkDelegate$getYbState$1", f = "SuperAppYbSdkDelegate.kt", l = {49, 56, 59}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SuperAppYbSdkDelegate$getYbState$1 extends SuspendLambda implements wls {
    final /* synthetic */ gcn $callback;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ v this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.superapp.SuperAppYbSdkDelegate$getYbState$1$1", f = "SuperAppYbSdkDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.superapp.SuperAppYbSdkDelegate$getYbState$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ gcn $callback;
        final /* synthetic */ rx51 $response;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(gcn gcnVar, rx51 rx51Var, Continuation continuation) {
            super(2, continuation);
            this.$callback = gcnVar;
            this.$response = rx51Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$callback, this.$response, continuation);
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
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.$callback.a(new ck7(this.$response, null));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppYbSdkDelegate$getYbState$1(v vVar, gcn gcnVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vVar;
        this.$callback = gcnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperAppYbSdkDelegate$getYbState$1 superAppYbSdkDelegate$getYbState$1 = new SuperAppYbSdkDelegate$getYbState$1(this.this$0, this.$callback, continuation);
        superAppYbSdkDelegate$getYbState$1.L$0 = obj;
        return superAppYbSdkDelegate$getYbState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppYbSdkDelegate$getYbState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
    
        if (defpackage.tje.k0(r0, r2, r7) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
    
        if (r8 == r1) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        rx51 rx51Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            as51 as51Var = this.this$0.d;
            this.L$0 = tseVar;
            this.label = 1;
            obj = as51Var.a.b(this);
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
            rx51Var = (rx51) obj;
            this.this$0.c.getClass();
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$callback, rx51Var, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        if (((YbWalletEntryPointExperiment) obj).b) {
            v vVar = this.this$0;
            this.L$0 = null;
            this.label = 2;
            obj = v.a(vVar, tseVar, this);
        } else {
            rx51Var = new rx51(YbStateResponse$YbState.UNAVAILABLE, null, null);
            this.this$0.c.getClass();
            sjh sjhVar2 = uyj.a;
            g6u g6uVar2 = o400.a;
            AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.$callback, rx51Var, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
    }
}
