package com.squareup.cash.investing.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.investing.backend.api.InvestingPerformanceSyncerKt;
import com.squareup.cash.investing.db.Investment_performance;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.viewmodels.PerformanceViewModel;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.portfolios.syncvalues.PortfoliosPerformanceValue;
import com.squareup.protos.invest.ui.Section;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PerformancePresenter$models$lambda$1$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;
    public final /* synthetic */ PoolsListPresenter this$0;

    /* renamed from: com.squareup.cash.investing.presenters.PerformancePresenter$models$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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
            return PerformancePresenter$models$lambda$1$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ PerformancePresenter$models$lambda$1$$inlined$map$1$2(FlowCollector flowCollector, PoolsListPresenter poolsListPresenter, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.this$0 = poolsListPresenter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f0  */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        String str;
        ?? r4;
        List list;
        List list2;
        PerformancePresenter$models$lambda$1$$inlined$mapNotNull$1$2$1 performancePresenter$models$lambda$1$$inlined$mapNotNull$1$2$1;
        int i2;
        Object obj2;
        int i3 = this.$r8$classId;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        PoolsListPresenter poolsListPresenter = this.this$0;
        PerformanceViewModel performanceViewModel = null;
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
                            Investment_performance investment_performance = (Investment_performance) obj;
                            if (investment_performance == null || (str = investment_performance.title) == null) {
                                str = ((AndroidStringManager) poolsListPresenter.stringManager).get(R.string.performance_default_title);
                            }
                            List access$toSectionModels = (investment_performance == null || (list2 = investment_performance.sections) == null) ? EmptyList.INSTANCE : PoolsListPresenter.access$toSectionModels(poolsListPresenter, list2);
                            if (investment_performance == null || (list = investment_performance.sections) == null) {
                                r4 = EmptyList.INSTANCE;
                            } else {
                                List list3 = list;
                                r4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                                Iterator it = list3.iterator();
                                while (it.hasNext()) {
                                    r4.add(new PerformanceViewModel.Section((Section) it.next()));
                                }
                            }
                            PerformanceViewModel performanceViewModel2 = new PerformanceViewModel(str, access$toSectionModels, r4);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(performanceViewModel2, anonymousClass1) == coroutineSingletons) {
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
                InvestmentEntityToken investmentEntityToken = (InvestmentEntityToken) poolsListPresenter.flowToken;
                if (continuation instanceof PerformancePresenter$models$lambda$1$$inlined$mapNotNull$1$2$1) {
                    performancePresenter$models$lambda$1$$inlined$mapNotNull$1$2$1 = (PerformancePresenter$models$lambda$1$$inlined$mapNotNull$1$2$1) continuation;
                    int i5 = performancePresenter$models$lambda$1$$inlined$mapNotNull$1$2$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        performancePresenter$models$lambda$1$$inlined$mapNotNull$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj4 = performancePresenter$models$lambda$1$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = performancePresenter$models$lambda$1$$inlined$mapNotNull$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            Iterator it2 = ((List) obj).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    PortfoliosPerformanceValue portfoliosPerformanceValue = (PortfoliosPerformanceValue) obj2;
                                    String str2 = portfoliosPerformanceValue.investment_entity_token;
                                    if (((str2 != null && str2.length() != 0) || !Intrinsics.areEqual(investmentEntityToken, InvestingPerformanceSyncerKt.PORTFOLIO_TOKEN)) && !Intrinsics.areEqual(portfoliosPerformanceValue.investment_entity_token, investmentEntityToken.value)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            PortfoliosPerformanceValue portfoliosPerformanceValue2 = (PortfoliosPerformanceValue) obj2;
                            if (portfoliosPerformanceValue2 != null) {
                                List list4 = portfoliosPerformanceValue2.sections;
                                String str3 = portfoliosPerformanceValue2.title;
                                if (str3 == null) {
                                    str3 = ((AndroidStringManager) poolsListPresenter.stringManager).get(R.string.performance_default_title);
                                }
                                ArrayList access$toSectionModels2 = PoolsListPresenter.access$toSectionModels(poolsListPresenter, list4);
                                List list5 = list4;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                                Iterator it3 = list5.iterator();
                                while (it3.hasNext()) {
                                    arrayList.add(new PerformanceViewModel.Section((Section) it3.next()));
                                }
                                performanceViewModel = new PerformanceViewModel(str3, access$toSectionModels2, arrayList);
                            }
                            if (performanceViewModel != null) {
                                performancePresenter$models$lambda$1$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector.emit(performanceViewModel, performancePresenter$models$lambda$1$$inlined$mapNotNull$1$2$1) == coroutineSingletons3) {
                                    break;
                                }
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj4);
                        }
                        break;
                    }
                }
                performancePresenter$models$lambda$1$$inlined$mapNotNull$1$2$1 = new PerformancePresenter$models$lambda$1$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj42 = performancePresenter$models$lambda$1$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = performancePresenter$models$lambda$1$$inlined$mapNotNull$1$2$1.label;
                if (i2 != 0) {
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
