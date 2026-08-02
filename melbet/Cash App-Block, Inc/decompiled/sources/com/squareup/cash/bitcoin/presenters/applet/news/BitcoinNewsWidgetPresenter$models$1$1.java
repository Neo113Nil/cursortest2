package com.squareup.cash.bitcoin.presenters.applet.news;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.boost.backend.RealBoostSyncer$refresh$1;
import com.squareup.cash.investing.backend.real.RealInvestingSyncer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BitcoinNewsWidgetPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BitcoinNewsWidgetPresenter$models$1$1(int i, n nVar, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        n nVar = this.this$0;
        switch (i) {
            case 0:
                return new BitcoinNewsWidgetPresenter$models$1$1(0, nVar, continuation);
            default:
                return new BitcoinNewsWidgetPresenter$models$1$1(1, nVar, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BitcoinNewsWidgetPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        n nVar = this.this$0;
        int i2 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineContext coroutineContext = (CoroutineContext) nVar.c;
                    BitcoinNewsWidgetPresenter$models$1$1 bitcoinNewsWidgetPresenter$models$1$1 = new BitcoinNewsWidgetPresenter$models$1$1(i2, nVar, continuation);
                    this.label = 1;
                    if (JobKt.withContext(coroutineContext, bitcoinNewsWidgetPresenter$models$1$1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealInvestingSyncer realInvestingSyncer = (RealInvestingSyncer) nVar.b;
                    this.label = 1;
                    Object withContext = JobKt.withContext(realInvestingSyncer.ioDispatcher, new RealBoostSyncer$refresh$1(false, (Object) realInvestingSyncer, (Continuation) null, 6), this);
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext == obj2) {
                        break;
                    }
                } else if (i4 != 1) {
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
