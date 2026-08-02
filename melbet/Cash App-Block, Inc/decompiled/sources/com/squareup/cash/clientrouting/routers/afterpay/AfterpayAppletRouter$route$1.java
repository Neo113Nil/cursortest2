package com.squareup.cash.clientrouting.routers.afterpay;

import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class AfterpayAppletRouter$route$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ AfterpayAppletRouter this$0;

    /* renamed from: com.squareup.cash.clientrouting.routers.afterpay.AfterpayAppletRouter$route$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function1 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ AfterpayAppletRouter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(AfterpayAppletRouter afterpayAppletRouter, Continuation continuation, int i) {
            super(1, continuation);
            this.$r8$classId = i;
            this.this$0 = afterpayAppletRouter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            switch (this.$r8$classId) {
                case 0:
                    return new AnonymousClass1(this.this$0, continuation, 0);
                case 1:
                    return new AnonymousClass1(this.this$0, continuation, 1);
                default:
                    return new AnonymousClass1(this.this$0, continuation, 2);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Continuation continuation = (Continuation) obj;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            AfterpayAppletRouter afterpayAppletRouter = this.this$0;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    RealAfterpayAppletRepository realAfterpayAppletRepository = afterpayAppletRouter.afterpayAppletRepository;
                    this.label = 1;
                    Object refreshAfterpayApplet = realAfterpayAppletRepository.refreshAfterpayApplet(this);
                    return refreshAfterpayApplet == coroutineSingletons ? coroutineSingletons : refreshAfterpayApplet;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 != 0) {
                        if (i3 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    RealAfterpayAppletRepository realAfterpayAppletRepository2 = afterpayAppletRouter.afterpayAppletRepository;
                    this.label = 1;
                    Object refreshAfterpayApplet2 = realAfterpayAppletRepository2.refreshAfterpayApplet(this);
                    return refreshAfterpayApplet2 == coroutineSingletons2 ? coroutineSingletons2 : refreshAfterpayApplet2;
                default:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    RealAfterpayAppletRepository realAfterpayAppletRepository3 = afterpayAppletRouter.afterpayAppletRepository;
                    this.label = 1;
                    Object refreshAfterpayApplet3 = realAfterpayAppletRepository3.refreshAfterpayApplet(this);
                    return refreshAfterpayApplet3 == coroutineSingletons3 ? coroutineSingletons3 : refreshAfterpayApplet3;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AfterpayAppletRouter$route$1(AfterpayAppletRouter afterpayAppletRouter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = afterpayAppletRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new AfterpayAppletRouter$route$1(this.this$0, continuation, 0);
            case 1:
                return new AfterpayAppletRouter$route$1(this.this$0, continuation, 1);
            default:
                return new AfterpayAppletRouter$route$1(this.this$0, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AfterpayAppletRouter$route$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        AfterpayAppletRouter afterpayAppletRouter = this.this$0;
        int i2 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(afterpayAppletRouter, continuation, 0);
                    this.label = 1;
                    if (PlatformKt.retryWhenRetryable$default(null, anonymousClass1, this, 3) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(afterpayAppletRouter, continuation, i2);
                    this.label = 1;
                    if (PlatformKt.retryWhenRetryable$default(null, anonymousClass12, this, 3) == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AnonymousClass1 anonymousClass13 = new AnonymousClass1(afterpayAppletRouter, continuation, 2);
                    this.label = 1;
                    if (PlatformKt.retryWhenRetryable$default(null, anonymousClass13, this, 3) == coroutineSingletons3) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
