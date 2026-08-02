package com.squareup.cash.data.profile;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.profile.CustomerLimitsManager;
import com.squareup.cash.db2.profile.Effective_limits;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalancesStore$convertTo$lambda$1$$inlined$map$1$2$1;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.LimitedAction;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealCustomerLimitsManager$getBuyCryptocurrencyLimit$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ CurrencyCode $currencyCode$inlined;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;

    /* renamed from: com.squareup.cash.data.profile.RealCustomerLimitsManager$getBuyCryptocurrencyLimit$$inlined$map$1$2$1, reason: invalid class name */
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
            return RealCustomerLimitsManager$getBuyCryptocurrencyLimit$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public RealCustomerLimitsManager$getBuyCryptocurrencyLimit$$inlined$map$1$2(FlowCollector flowCollector, RealCustomerLimitsManager realCustomerLimitsManager, CurrencyCode currencyCode) {
        this.$this_unsafeFlow = flowCollector;
        this.$currencyCode$inlined = currencyCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        Money money;
        RealDependentBalancesStore$convertTo$lambda$1$$inlined$map$1$2$1 realDependentBalancesStore$convertTo$lambda$1$$inlined$map$1$2$1;
        int i2;
        int i3 = this.$r8$classId;
        CurrencyCode currencyCode = this.$currencyCode$inlined;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        Object obj2 = null;
        switch (i3) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i4 = anonymousClass1.label;
                    if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i4 - PKIFailureInfo.systemUnavail;
                        Object obj3 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            Iterator it = ((List) obj).iterator();
                            boolean z = false;
                            Object obj4 = null;
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (((Effective_limits) next).limited_action == LimitedAction.BUY_CRYPTOCURRENCY) {
                                        if (!z) {
                                            obj4 = next;
                                            z = true;
                                        }
                                    }
                                } else if (z) {
                                    obj2 = obj4;
                                }
                            }
                            Effective_limits effective_limits = (Effective_limits) obj2;
                            if (effective_limits == null || (money = effective_limits.limit_amount) == null) {
                                money = new Money((Long) 10000000L, currencyCode, 4);
                            }
                            CustomerLimitsManager.TransactionLimit transactionLimit = new CustomerLimitsManager.TransactionLimit(effective_limits, money);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(transactionLimit, anonymousClass1) == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                        }
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj32 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
                break;
            default:
                if (continuation instanceof RealDependentBalancesStore$convertTo$lambda$1$$inlined$map$1$2$1) {
                    realDependentBalancesStore$convertTo$lambda$1$$inlined$map$1$2$1 = (RealDependentBalancesStore$convertTo$lambda$1$$inlined$map$1$2$1) continuation;
                    int i5 = realDependentBalancesStore$convertTo$lambda$1$$inlined$map$1$2$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        realDependentBalancesStore$convertTo$lambda$1$$inlined$map$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj5 = realDependentBalancesStore$convertTo$lambda$1$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = realDependentBalancesStore$convertTo$lambda$1$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            Long l = ((Money) obj).amount;
                            l.getClass();
                            Money money2 = new Money(l, currencyCode, 4);
                            realDependentBalancesStore$convertTo$lambda$1$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(money2, realDependentBalancesStore$convertTo$lambda$1$$inlined$map$1$2$1) == coroutineSingletons3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj5);
                        }
                        break;
                    }
                }
                realDependentBalancesStore$convertTo$lambda$1$$inlined$map$1$2$1 = new RealDependentBalancesStore$convertTo$lambda$1$$inlined$map$1$2$1(this, continuation);
                Object obj52 = realDependentBalancesStore$convertTo$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = realDependentBalancesStore$convertTo$lambda$1$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
        }
        return Unit.INSTANCE;
    }

    public RealCustomerLimitsManager$getBuyCryptocurrencyLimit$$inlined$map$1$2(FlowCollector flowCollector, CurrencyCode currencyCode) {
        this.$this_unsafeFlow = flowCollector;
        this.$currencyCode$inlined = currencyCode;
    }
}
