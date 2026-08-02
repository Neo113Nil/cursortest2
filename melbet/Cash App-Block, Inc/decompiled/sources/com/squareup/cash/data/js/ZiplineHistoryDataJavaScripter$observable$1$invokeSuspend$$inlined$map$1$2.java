package com.squareup.cash.data.js;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.db2.entities.ForToken;
import com.squareup.cash.history.backend.real.RealLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.payments.backend.api.RenderedPayment;
import com.squareup.cash.payments.backend.api.RenderedPayment$Companion$mapper$1;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Orientation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ZiplineHistoryDataJavaScripter$observable$1$invokeSuspend$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;
    public final /* synthetic */ ZiplineHistoryDataJavaScripter this$0;

    /* renamed from: com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter$observable$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
            return ZiplineHistoryDataJavaScripter$observable$1$invokeSuspend$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ ZiplineHistoryDataJavaScripter$observable$1$invokeSuspend$$inlined$map$1$2(FlowCollector flowCollector, ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.this$0 = ziplineHistoryDataJavaScripter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
    
        if (r4.emit(r0, r2) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        RealLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1 realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1;
        int i2;
        RenderedPayment renderedPayment;
        int i3;
        RealLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1 realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$12;
        int i4;
        int i5 = this.$r8$classId;
        ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter = this.this$0;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        switch (i5) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i6 = anonymousClass1.label;
                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i6 - PKIFailureInfo.systemUnavail;
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(ziplineHistoryDataJavaScripter, anonymousClass1) == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj2);
                        }
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj22 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
            default:
                if (continuation instanceof RealLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1) {
                    realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1 = (RealLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1) continuation;
                    int i7 = realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1.label;
                    if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                        realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1.label = i7 - PKIFailureInfo.systemUnavail;
                        Object obj3 = realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            ForToken forToken = (ForToken) obj;
                            if (forToken == null) {
                                renderedPayment = null;
                                i3 = 0;
                                realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1.L$4 = null;
                                realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1.I$0 = i3;
                                realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1.label = 2;
                                break;
                            } else {
                                ziplineHistoryDataJavaScripter.getClass();
                                RenderedPayment$Companion$mapper$1 renderedPayment$Companion$mapper$1 = new RenderedPayment$Companion$mapper$1(ziplineHistoryDataJavaScripter, null);
                                String str = forToken.token;
                                Long l = forToken.amount;
                                CurrencyCode currencyCode = forToken.amount_currency;
                                String str2 = forToken.their_id;
                                Role role = forToken.role;
                                Orientation orientation = forToken.orientation;
                                String str3 = forToken.payment_render_data;
                                String str4 = forToken.sender_render_data;
                                String str5 = forToken.recipient_render_data;
                                String str6 = forToken.receipt_render_data;
                                String str7 = forToken.loyalty_render_data;
                                Money money = forToken.boost_amount;
                                String str8 = forToken.lending_loan_token;
                                realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1.L$4 = flowCollector;
                                realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1.I$0 = 0;
                                realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1.label = 1;
                                realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$12 = realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1;
                                RenderedPayment$Companion$mapper$1 renderedPayment$Companion$mapper$12 = new RenderedPayment$Companion$mapper$1(renderedPayment$Companion$mapper$1.$javaScripter, realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1);
                                renderedPayment$Companion$mapper$12.L$0 = str;
                                renderedPayment$Companion$mapper$12.L$1 = l;
                                renderedPayment$Companion$mapper$12.L$2 = currencyCode;
                                renderedPayment$Companion$mapper$12.L$3 = str2;
                                renderedPayment$Companion$mapper$12.L$4 = role;
                                renderedPayment$Companion$mapper$12.L$5 = orientation;
                                renderedPayment$Companion$mapper$12.L$6 = str3;
                                renderedPayment$Companion$mapper$12.L$7 = str4;
                                renderedPayment$Companion$mapper$12.L$8 = str5;
                                renderedPayment$Companion$mapper$12.L$9 = str6;
                                renderedPayment$Companion$mapper$12.L$11 = money;
                                renderedPayment$Companion$mapper$12.L$12 = str8;
                                obj3 = renderedPayment$Companion$mapper$12.invokeSuspend(Unit.INSTANCE);
                                if (obj3 != coroutineSingletons3) {
                                    flowCollector = flowCollector;
                                    i4 = 0;
                                }
                                break;
                            }
                        } else if (i2 == 1) {
                            i4 = realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1.I$0;
                            flowCollector = realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1.L$4;
                            SafeTrace.throwOnFailure(obj3);
                            realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$12 = realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1;
                        } else if (i2 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                            break;
                        }
                        renderedPayment = (RenderedPayment) obj3;
                        i3 = i4;
                        realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1 = realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$12;
                        realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1.L$4 = null;
                        realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1.I$0 = i3;
                        realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1.label = 2;
                    }
                }
                realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1 = new RealLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj32 = realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
                renderedPayment = (RenderedPayment) obj32;
                i3 = i4;
                realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1 = realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$12;
                realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1.L$4 = null;
                realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1.I$0 = i3;
                realLegacyActivityEntityManager$renderedPaymentOptional$lambda$0$$inlined$map$1$2$1.label = 2;
        }
        return Unit.INSTANCE;
    }
}
