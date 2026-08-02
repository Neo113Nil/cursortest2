package com.squareup.cash.sharesheet;

import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$multiStatementAccountViewModel$$inlined$map$1$2;
import com.squareup.cash.card.onboarding.CardPreviewPresenter$cashtag$$inlined$map$1;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.investing.backend.api.data.FilterGroup;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.primitives.FilterConfiguration;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.payments.presenters.NearbyPayRequestPresenter$models$10$1$1$1;
import com.squareup.protos.cash.registrar.api.StatementType;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.stripe.hcaptcha.HCaptcha;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2;

/* loaded from: classes6.dex */
public final class RealShareableAssetsManager$download$lambda$0$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;
    public final /* synthetic */ Object $token$inlined;
    public final /* synthetic */ Object $url$inlined;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ RealShareableAssetsManager$download$lambda$0$$inlined$map$1(Flow flow, Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flow;
        this.this$0 = obj;
        this.$token$inlined = obj2;
        this.$url$inlined = obj3;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.$url$inlined;
        Object obj2 = this.$token$inlined;
        Object obj3 = this.this$0;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flow.collect(new ChannelFlowMerge$collectTo$2(flowCollector, (HCaptcha) obj3, (String) obj2, (String) obj, 2), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = ((FlowQuery$mapToList$$inlined$map$1) flow).collect(new AccountDocumentsPresenter$multiStatementAccountViewModel$$inlined$map$1$2(flowCollector, (StatementType) obj3, (AccountDocumentsPresenter) obj, (String) obj2, 0), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = ((FlowKt__MergeKt$flatMapConcat$$inlined$map$1) flow).collect(new NearbyPayRequestPresenter$models$10$1$1$1(flowCollector, (PersistentHistoricalDataCache) obj3, (CurrencyCode) obj2, (HistoricalRange) obj, 12), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = flow.collect(new NearbyPayRequestPresenter$models$10$1$1$1(flowCollector, (RealInvestingHistoricalData) obj3, (InvestmentEntityToken) obj2, (HistoricalRange) obj, 13), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = flow.collect(new NearbyPayRequestPresenter$models$10$1$1$1(flowCollector, (RealInvestingHistoricalData) obj3, (HistoricalRange) obj, (String) obj2, 14), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = ((CardPreviewPresenter$cashtag$$inlined$map$1) flow).collect(new NearbyPayRequestPresenter$models$10$1$1$1(flowCollector, (FilterConfiguration.Categories) obj3, (FilterGroup) obj2, (ColorModel) obj, 16), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect7 = ((CardPreviewPresenter$cashtag$$inlined$map$1) flow).collect(new NearbyPayRequestPresenter$models$10$1$1$1(flowCollector, (ArrayList) obj3, (FilterGroup) obj2, (ColorModel) obj, 17), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ RealShareableAssetsManager$download$lambda$0$$inlined$map$1(Flow flow, Object obj, Object obj2, String str, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flow;
        this.this$0 = obj;
        this.$url$inlined = obj2;
        this.$token$inlined = str;
    }
}
