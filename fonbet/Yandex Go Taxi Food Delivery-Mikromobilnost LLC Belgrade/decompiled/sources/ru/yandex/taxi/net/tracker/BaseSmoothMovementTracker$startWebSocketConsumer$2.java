package ru.yandex.taxi.net.tracker;

import com.yandex.go.taxi.order.net.xiva.i;
import com.yandex.go.taxi.order.net.xiva.k;
import com.yandex.go.taxi.order.net.xiva.m;
import com.yandex.go.taxi.order.net.xiva.n;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.qv10;
import defpackage.tje;
import defpackage.tse;
import defpackage.u201;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.net.tracker.BaseSmoothMovementTracker$startWebSocketConsumer$2", f = "BaseSmoothMovementTracker.kt", l = {328, 348}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class BaseSmoothMovementTracker$startWebSocketConsumer$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.net.tracker.BaseSmoothMovementTracker$startWebSocketConsumer$2$1", f = "BaseSmoothMovementTracker.kt", l = {333}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.net.tracker.BaseSmoothMovementTracker$startWebSocketConsumer$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ tse $$this$launch;
        final /* synthetic */ Ref$ObjectRef<l8x> $fallbackJob;
        Object L$0;
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e eVar, Ref$ObjectRef ref$ObjectRef, tse tseVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
            this.$fallbackJob = ref$ObjectRef;
            this.$$this$launch = tseVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$fallbackJob, this.$$this$launch, continuation);
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
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                e eVar = this.this$0;
                i iVar = new i(((n) eVar.z).b.l);
                c cVar = new c(ref$BooleanRef, this.$fallbackJob, eVar, this.$$this$launch);
                this.L$0 = null;
                this.label = 1;
                if (iVar.collect(cVar, this) == coroutineSingletons) {
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
    public BaseSmoothMovementTracker$startWebSocketConsumer$2(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    public static final pzt0 i(tse tseVar, e eVar, long j) {
        return tje.N(tseVar, null, null, new BaseSmoothMovementTracker$startWebSocketConsumer$2$scheduleFallback$1(j, eVar, null), 3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseSmoothMovementTracker$startWebSocketConsumer$2 baseSmoothMovementTracker$startWebSocketConsumer$2 = new BaseSmoothMovementTracker$startWebSocketConsumer$2(this.this$0, continuation);
        baseSmoothMovementTracker$startWebSocketConsumer$2.L$0 = obj;
        return baseSmoothMovementTracker$startWebSocketConsumer$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseSmoothMovementTracker$startWebSocketConsumer$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0093, code lost:
    
        if (r4.collect(r2, r10) == r1) goto L16;
     */
    /* JADX WARN: Type inference failed for: r11v6, types: [T, pzt0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef z;
        e eVar;
        tse tseVar;
        Ref$ObjectRef ref$ObjectRef;
        tse tseVar2 = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            z = qv10.z(obj);
            eVar = this.this$0;
            u201 u201Var = eVar.z;
            this.L$0 = tseVar2;
            this.L$1 = z;
            this.L$2 = z;
            this.L$3 = tseVar2;
            this.L$4 = eVar;
            this.label = 1;
            obj = ((n) u201Var).a(this);
            if (obj != coroutineSingletons) {
                tseVar = tseVar2;
                ref$ObjectRef = z;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11.a;
        }
        eVar = (e) this.L$4;
        tseVar = (tse) this.L$3;
        z = (Ref$ObjectRef) this.L$2;
        ref$ObjectRef = (Ref$ObjectRef) this.L$1;
        kotlin.b.b(obj);
        z.element = i(tseVar, eVar, ((Number) obj).longValue());
        tje.N(tseVar2, null, null, new AnonymousClass1(this.this$0, ref$ObjectRef, tseVar2, null), 3);
        e eVar2 = this.this$0;
        n nVar = (n) eVar2.z;
        m mVar = new m(new k(nVar.b.n), nVar);
        d dVar = new d(ref$ObjectRef, eVar2, tseVar2);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
    }
}
