package ru.yandex.taxi.orders;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xsa0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.orders.PendingOrdersRepositoryImpl$onLargestContentfulPaint$1", f = "PendingOrdersRepositoryImpl.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PendingOrdersRepositoryImpl$onLargestContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ g this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.orders.PendingOrdersRepositoryImpl$onLargestContentfulPaint$1$1", f = "PendingOrdersRepositoryImpl.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.orders.PendingOrdersRepositoryImpl$onLargestContentfulPaint$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ g this$0;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvpr;", "Lkotlin/Pair;", "Lxsa0;", "", "", "e", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "ru.yandex.taxi.orders.PendingOrdersRepositoryImpl$onLargestContentfulPaint$1$1$3", f = "PendingOrdersRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: ru.yandex.taxi.orders.PendingOrdersRepositoryImpl$onLargestContentfulPaint$1$1$3, reason: invalid class name */
        final class AnonymousClass3 extends SuspendLambda implements zls {
            /* synthetic */ Object L$0;
            int label;

            @Override // defpackage.zls
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(3, (Continuation) obj3);
                anonymousClass3.L$0 = (Throwable) obj2;
                zy11 zy11Var = zy11.a;
                anonymousClass3.invokeSuspend(zy11Var);
                return zy11Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Throwable th = (Throwable) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                jst.e.h("PendingOrdersFetching", "Pending polling produced error", th);
                return zy11.a;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lxsa0;", "", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "ru.yandex.taxi.orders.PendingOrdersRepositoryImpl$onLargestContentfulPaint$1$1$4", f = "PendingOrdersRepositoryImpl.kt", l = {HProv.PP_HASHOID}, m = "invokeSuspend", v = 2)
        /* renamed from: ru.yandex.taxi.orders.PendingOrdersRepositoryImpl$onLargestContentfulPaint$1$1$4, reason: invalid class name */
        final class AnonymousClass4 extends SuspendLambda implements wls {
            /* synthetic */ Object L$0;
            Object L$1;
            boolean Z$0;
            int label;
            final /* synthetic */ g this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(Continuation continuation, g gVar) {
                super(2, continuation);
                this.this$0 = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation, this.this$0);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass4) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Pair pair = (Pair) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    xsa0 xsa0Var = (xsa0) pair.getFirst();
                    boolean booleanValue = ((Boolean) pair.getSecond()).booleanValue();
                    if (booleanValue) {
                        this.this$0.g.set(xsa0Var.c);
                        g gVar = this.this$0;
                        boolean andSet = gVar.h.getAndSet(false);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.Z$0 = booleanValue;
                        this.label = 1;
                        if (g.d(gVar, andSet, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        public AnonymousClass1(Continuation continuation, g gVar) {
            super(2, continuation);
            this.this$0 = gVar;
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
            if (i == 0) {
                kotlin.b.b(obj);
                o oVar = new o(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(com.yandex.go.coroutines.b.d(new d(this.this$0.b.h()), new PendingOrdersRepositoryImpl$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$start$1(Boolean.valueOf(this.this$0.b.a.Kg()), null))), new PendingOrdersRepositoryImpl$onLargestContentfulPaint$1$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0)), new AnonymousClass3(3, null));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(null, this.this$0);
                this.label = 1;
                if (kotlinx.coroutines.flow.e.k(oVar, anonymousClass4, this) == coroutineSingletons) {
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
    public PendingOrdersRepositoryImpl$onLargestContentfulPaint$1(Continuation continuation, g gVar) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PendingOrdersRepositoryImpl$onLargestContentfulPaint$1(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PendingOrdersRepositoryImpl$onLargestContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0;
            Lifecycle lifecycle = gVar.a;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, gVar);
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
