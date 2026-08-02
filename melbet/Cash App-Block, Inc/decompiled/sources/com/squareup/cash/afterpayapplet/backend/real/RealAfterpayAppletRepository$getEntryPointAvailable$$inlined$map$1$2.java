package com.squareup.cash.afterpayapplet.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.afterpayapplet.backend.HomeResult;
import com.squareup.cash.afterpayapplet.db.AfterpayApplet;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHome;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealAfterpayAppletRepository$getEntryPointAvailable$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;
    public final /* synthetic */ RealAfterpayAppletRepository this$0;

    /* renamed from: com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository$getEntryPointAvailable$$inlined$map$1$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return RealAfterpayAppletRepository$getEntryPointAvailable$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ RealAfterpayAppletRepository$getEntryPointAvailable$$inlined$map$1$2(FlowCollector flowCollector, RealAfterpayAppletRepository realAfterpayAppletRepository, int i) {
        this.$r8$classId = i;
        this.this$0 = realAfterpayAppletRepository;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00db, code lost:
    
        if (r1.emit(r4, r0) != r15) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0142, code lost:
    
        if (com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository.access$refreshOrEmitError(r7, r5, r0) == r15) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00eb, code lost:
    
        if (r5.emit(r6, r0) == r15) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0111, code lost:
    
        if (r7.emitHomeData(r5, r14, r0) == r15) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0120, code lost:
    
        if (r5.emit(r6, r0) == r15) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0132, code lost:
    
        if (r5.emit(com.squareup.cash.afterpayapplet.backend.HomeResult.HomeLoading.INSTANCE, r0) == r15) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0171  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        AfterpayAppletResponse afterpayAppletResponse;
        Long l;
        AfterpayAppletResponse afterpayAppletResponse2;
        RealAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1 realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1;
        AfterpayApplet afterpayApplet;
        Object obj2;
        AfterpayAppletHome.OnDisplayMessage onDisplayMessage;
        AfterpayAppletResponse afterpayAppletResponse3;
        Serializable eligibleRetroTransactions;
        int i2;
        FlowCollector flowCollector;
        Object obj3;
        int i3 = this.$r8$classId;
        int i4 = 0;
        int i5 = 0;
        FlowCollector flowCollector2 = this.$this_unsafeFlow;
        RealAfterpayAppletRepository realAfterpayAppletRepository = this.this$0;
        AfterpayAppletEntrypoint afterpayAppletEntrypoint = null;
        switch (i3) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i6 = anonymousClass1.label;
                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i6 - PKIFailureInfo.systemUnavail;
                        Object obj4 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            AfterpayApplet afterpayApplet2 = (AfterpayApplet) obj;
                            if (afterpayApplet2 != null && (afterpayAppletResponse2 = afterpayApplet2.afterpay_applet_response) != null) {
                                afterpayAppletEntrypoint = afterpayAppletResponse2.entrypoint;
                            }
                            boolean z = afterpayAppletEntrypoint != null;
                            if (afterpayApplet2 != null && (afterpayAppletResponse = afterpayApplet2.afterpay_applet_response) != null && (l = afterpayAppletResponse.expired_at_ms) != null) {
                                r2 = l.longValue();
                            }
                            Pair pair = new Pair(Boolean.valueOf(z), Boolean.valueOf(r2 >= realAfterpayAppletRepository.clock.millis()));
                            anonymousClass1.label = 1;
                            if (flowCollector2.emit(pair, anonymousClass1) == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj4);
                        }
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj42 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
                break;
            default:
                if (continuation instanceof RealAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1) {
                    realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1 = (RealAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1) continuation;
                    int i7 = realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.label;
                    if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                        realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.label = i7 - PKIFailureInfo.systemUnavail;
                        Object obj5 = realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        switch (realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.label) {
                            case 0:
                                SafeTrace.throwOnFailure(obj5);
                                Pair pair2 = (Pair) obj;
                                AfterpayApplet afterpayApplet3 = (AfterpayApplet) pair2.first;
                                AfterpayAppletResponse afterpayAppletResponse4 = (AfterpayAppletResponse) pair2.second;
                                HomeResult.Empty empty = HomeResult.Empty.INSTANCE;
                                if (afterpayApplet3 != null) {
                                    AfterpayAppletResponse afterpayAppletResponse5 = afterpayApplet3.afterpay_applet_response;
                                    Long l2 = afterpayApplet3.ttl_in_millis;
                                    if ((l2 != null ? l2.longValue() : 0L) >= realAfterpayAppletRepository.clock.millis()) {
                                        afterpayAppletResponse5.getClass();
                                        if (afterpayAppletResponse5.credit_line_snapshot != null && afterpayAppletResponse5.home != null) {
                                            realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$2 = flowCollector2;
                                            realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$3 = afterpayApplet3;
                                            realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.I$0 = 0;
                                            realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.label = 6;
                                            Serializable displayMessage = realAfterpayAppletRepository.displayMessage(afterpayAppletResponse5, realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1);
                                            if (displayMessage != coroutineSingletons3) {
                                                afterpayApplet = afterpayApplet3;
                                                obj2 = displayMessage;
                                                onDisplayMessage = (AfterpayAppletHome.OnDisplayMessage) obj2;
                                                afterpayAppletResponse3 = afterpayApplet.afterpay_applet_response;
                                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$2 = null;
                                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$3 = null;
                                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$5 = onDisplayMessage;
                                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$6 = afterpayAppletResponse3;
                                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$7 = flowCollector2;
                                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.I$0 = i4;
                                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.label = 7;
                                                eligibleRetroTransactions = realAfterpayAppletRepository.getEligibleRetroTransactions(afterpayAppletResponse3, realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1);
                                                if (eligibleRetroTransactions != coroutineSingletons3) {
                                                    i2 = i4;
                                                    flowCollector = flowCollector2;
                                                    obj3 = eligibleRetroTransactions;
                                                    HomeResult.HomeData homeData = new HomeResult.HomeData(afterpayAppletResponse3, (List) obj3, onDisplayMessage);
                                                    realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$2 = null;
                                                    realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$3 = null;
                                                    realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$5 = null;
                                                    realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$6 = null;
                                                    realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$7 = null;
                                                    realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.I$0 = i2;
                                                    realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.label = 8;
                                                    break;
                                                }
                                            }
                                        } else {
                                            realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$2 = null;
                                            realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$3 = null;
                                            realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.I$0 = 0;
                                            realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.label = 5;
                                            break;
                                        }
                                        break;
                                    }
                                }
                                ((RealAfterpayEligibleRetroTransactionsProvider) realAfterpayAppletRepository.retroTransactions).transactionsCache = new ArrayList();
                                if (afterpayAppletResponse4 == null) {
                                    realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$2 = flowCollector2;
                                    realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$3 = null;
                                    realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.I$0 = 0;
                                    realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.label = 3;
                                    break;
                                } else if (afterpayAppletResponse4.credit_line_snapshot != null && afterpayAppletResponse4.home != null) {
                                    realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$2 = null;
                                    realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$3 = null;
                                    realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.I$0 = 0;
                                    realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.label = 2;
                                    break;
                                } else {
                                    realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$2 = null;
                                    realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$3 = null;
                                    realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.I$0 = 0;
                                    realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.label = 1;
                                    break;
                                }
                                break;
                            case 1:
                            case 2:
                            case 4:
                            case 5:
                            case 8:
                                SafeTrace.throwOnFailure(obj5);
                                break;
                            case 3:
                                i5 = realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.I$0;
                                flowCollector2 = realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$2;
                                SafeTrace.throwOnFailure(obj5);
                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$2 = null;
                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$3 = null;
                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.I$0 = i5;
                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.label = 4;
                                break;
                            case 6:
                                i4 = realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.I$0;
                                afterpayApplet = realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$3;
                                flowCollector2 = realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$2;
                                SafeTrace.throwOnFailure(obj5);
                                obj2 = obj5;
                                onDisplayMessage = (AfterpayAppletHome.OnDisplayMessage) obj2;
                                afterpayAppletResponse3 = afterpayApplet.afterpay_applet_response;
                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$2 = null;
                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$3 = null;
                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$5 = onDisplayMessage;
                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$6 = afterpayAppletResponse3;
                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$7 = flowCollector2;
                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.I$0 = i4;
                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.label = 7;
                                eligibleRetroTransactions = realAfterpayAppletRepository.getEligibleRetroTransactions(afterpayAppletResponse3, realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1);
                                if (eligibleRetroTransactions != coroutineSingletons3) {
                                }
                                break;
                            case 7:
                                i2 = realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.I$0;
                                flowCollector = realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$7;
                                afterpayAppletResponse3 = realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$6;
                                onDisplayMessage = realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$5;
                                SafeTrace.throwOnFailure(obj5);
                                obj3 = obj5;
                                HomeResult.HomeData homeData2 = new HomeResult.HomeData(afterpayAppletResponse3, (List) obj3, onDisplayMessage);
                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$2 = null;
                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$3 = null;
                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$5 = null;
                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$6 = null;
                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.L$7 = null;
                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.I$0 = i2;
                                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.label = 8;
                                break;
                            default:
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                        }
                    }
                }
                realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1 = new RealAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1(this, continuation);
                Object obj52 = realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (realAfterpayAppletRepository$emitCacheOrRefresh$$inlined$transform$1$1$1.label) {
                }
        }
        return Unit.INSTANCE;
    }
}
