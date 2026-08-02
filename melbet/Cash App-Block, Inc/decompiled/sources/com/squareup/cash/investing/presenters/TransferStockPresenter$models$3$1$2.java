package com.squareup.cash.investing.presenters;

import androidx.paging.PageFetcher$flow$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.franklin.investing.InitiateInvestmentOrderRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.Channel;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class TransferStockPresenter$models$3$1$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Channel $initiateRequestEvent;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TransferStockPresenter$models$3$1$2(Channel channel, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$initiateRequestEvent = channel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                TransferStockPresenter$models$3$1$2 transferStockPresenter$models$3$1$2 = new TransferStockPresenter$models$3$1$2(this.$initiateRequestEvent, continuation, 0);
                transferStockPresenter$models$3$1$2.L$0 = obj;
                return transferStockPresenter$models$3$1$2;
            case 1:
                TransferStockPresenter$models$3$1$2 transferStockPresenter$models$3$1$22 = new TransferStockPresenter$models$3$1$2(this.$initiateRequestEvent, continuation, 1);
                transferStockPresenter$models$3$1$22.L$0 = obj;
                return transferStockPresenter$models$3$1$22;
            case 2:
                TransferStockPresenter$models$3$1$2 transferStockPresenter$models$3$1$23 = new TransferStockPresenter$models$3$1$2(this.$initiateRequestEvent, continuation, 2);
                transferStockPresenter$models$3$1$23.L$0 = obj;
                return transferStockPresenter$models$3$1$23;
            case 3:
                TransferStockPresenter$models$3$1$2 transferStockPresenter$models$3$1$24 = new TransferStockPresenter$models$3$1$2(this.$initiateRequestEvent, continuation, 3);
                transferStockPresenter$models$3$1$24.L$0 = obj;
                return transferStockPresenter$models$3$1$24;
            default:
                TransferStockPresenter$models$3$1$2 transferStockPresenter$models$3$1$25 = new TransferStockPresenter$models$3$1$2(this.$initiateRequestEvent, continuation, 4);
                transferStockPresenter$models$3$1$25.L$0 = obj;
                return transferStockPresenter$models$3$1$25;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((TransferStockPresenter$models$3$1$2) create((InitiateInvestmentOrderRequest) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Job job;
        int i = this.$r8$classId;
        Channel channel = this.$initiateRequestEvent;
        switch (i) {
            case 0:
                InitiateInvestmentOrderRequest initiateInvestmentOrderRequest = (InitiateInvestmentOrderRequest) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (channel.send(initiateInvestmentOrderRequest, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StandaloneCoroutine launch$default = JobKt.launch$default((CoroutineScope) this.L$0, null, null, new PageFetcher$flow$1.AnonymousClass1(2, null, 1), 3);
                    try {
                        this.L$0 = launch$default;
                        this.label = 1;
                        Object receive = channel.receive(this);
                        if (receive == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        obj = receive;
                        job = launch$default;
                    } catch (Throwable th2) {
                        th = th2;
                        job = launch$default;
                        job.cancel(null);
                        throw th;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    job = (Job) this.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        job.cancel(null);
                        throw th;
                    }
                }
                job.cancel(null);
                return obj;
            case 2:
                InitiateInvestmentOrderRequest initiateInvestmentOrderRequest2 = (InitiateInvestmentOrderRequest) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (channel.send(initiateInvestmentOrderRequest2, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                InitiateInvestmentOrderRequest initiateInvestmentOrderRequest3 = (InitiateInvestmentOrderRequest) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (channel.send(initiateInvestmentOrderRequest3, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                InitiateInvestmentOrderRequest initiateInvestmentOrderRequest4 = (InitiateInvestmentOrderRequest) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (channel.send(initiateInvestmentOrderRequest4, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
