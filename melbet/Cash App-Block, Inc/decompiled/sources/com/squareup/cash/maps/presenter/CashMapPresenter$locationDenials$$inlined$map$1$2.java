package com.squareup.cash.maps.presenter;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CashMapPresenter$locationDenials$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;
    public final /* synthetic */ CashMapPresenter this$0;

    /* renamed from: com.squareup.cash.maps.presenter.CashMapPresenter$locationDenials$$inlined$map$1$2$1, reason: invalid class name */
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
            return CashMapPresenter$locationDenials$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ CashMapPresenter$locationDenials$$inlined$map$1$2(FlowCollector flowCollector, CashMapPresenter cashMapPresenter, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.this$0 = cashMapPresenter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r2.emit(r10, r0) != r12) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r10 == r12) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        CashMapPresenter$currentLocationModel$$inlined$map$1$2$1 cashMapPresenter$currentLocationModel$$inlined$map$1$2$1;
        int i2;
        int i3 = this.$r8$classId;
        CashMapPresenter cashMapPresenter = this.this$0;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        int i4 = 0;
        switch (i3) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i5 = anonymousClass1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            Boolean valueOf = Boolean.valueOf(cashMapPresenter.coarseLocationPermissions.$readonly.check() || cashMapPresenter.preciseLocationPermissions.$readonly.check());
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(valueOf, anonymousClass1) == coroutineSingletons) {
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
                break;
            default:
                if (continuation instanceof CashMapPresenter$currentLocationModel$$inlined$map$1$2$1) {
                    cashMapPresenter$currentLocationModel$$inlined$map$1$2$1 = (CashMapPresenter$currentLocationModel$$inlined$map$1$2$1) continuation;
                    int i6 = cashMapPresenter$currentLocationModel$$inlined$map$1$2$1.label;
                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                        cashMapPresenter$currentLocationModel$$inlined$map$1$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                        Object obj3 = cashMapPresenter$currentLocationModel$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = cashMapPresenter$currentLocationModel$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            ((Boolean) obj).getClass();
                            cashMapPresenter$currentLocationModel$$inlined$map$1$2$1.L$4 = flowCollector;
                            cashMapPresenter$currentLocationModel$$inlined$map$1$2$1.I$0 = 0;
                            cashMapPresenter$currentLocationModel$$inlined$map$1$2$1.label = 1;
                            obj3 = CashMapPresenter.access$getLastLocationViewModel(cashMapPresenter, cashMapPresenter$currentLocationModel$$inlined$map$1$2$1);
                            break;
                        } else if (i2 == 1) {
                            i4 = cashMapPresenter$currentLocationModel$$inlined$map$1$2$1.I$0;
                            flowCollector = cashMapPresenter$currentLocationModel$$inlined$map$1$2$1.L$4;
                            SafeTrace.throwOnFailure(obj3);
                        } else if (i2 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                            break;
                        }
                        cashMapPresenter$currentLocationModel$$inlined$map$1$2$1.L$4 = null;
                        cashMapPresenter$currentLocationModel$$inlined$map$1$2$1.I$0 = i4;
                        cashMapPresenter$currentLocationModel$$inlined$map$1$2$1.label = 2;
                        break;
                    }
                }
                cashMapPresenter$currentLocationModel$$inlined$map$1$2$1 = new CashMapPresenter$currentLocationModel$$inlined$map$1$2$1(this, continuation);
                Object obj32 = cashMapPresenter$currentLocationModel$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = cashMapPresenter$currentLocationModel$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
                cashMapPresenter$currentLocationModel$$inlined$map$1$2$1.L$4 = null;
                cashMapPresenter$currentLocationModel$$inlined$map$1$2$1.I$0 = i4;
                cashMapPresenter$currentLocationModel$$inlined$map$1$2$1.label = 2;
        }
        return Unit.INSTANCE;
    }
}
