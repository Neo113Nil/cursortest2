package com.squareup.cash.investing.presenters;

import androidx.compose.ui.text.style.TextGeometricTransformKt;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter;
import com.squareup.cash.recipients.backend.real.RealRecipientSuggestionsProvider$sections$lambda$1$$inlined$map$1$2;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomerForId$$inlined$map$1;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class InvestingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1 implements Flow {
    public final /* synthetic */ Object $accentColor$inlined;
    public final /* synthetic */ boolean $isFirstDayTrading$inlined;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object $range$inlined;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;
    public final /* synthetic */ Object this$0;

    public InvestingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1(RealCustomerStore$getCustomerForId$$inlined$map$1 realCustomerStore$getCustomerForId$$inlined$map$1, boolean z, String str, AccountDocumentsPresenter accountDocumentsPresenter, String str2) {
        this.$this_unsafeTransform$inlined = realCustomerStore$getCustomerForId$$inlined$map$1;
        this.$isFirstDayTrading$inlined = z;
        this.this$0 = str;
        this.$range$inlined = accountDocumentsPresenter;
        this.$accentColor$inlined = str2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.$accentColor$inlined;
        Object obj2 = this.$range$inlined;
        Object obj3 = this.this$0;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flow.collect(new RealRecipientSuggestionsProvider$sections$lambda$1$$inlined$map$1$2(flowCollector, (InvestingPortfolioPresenter) obj3, (HistoricalRange) obj2, (TextGeometricTransformKt) obj, this.$isFirstDayTrading$inlined), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = ((RealCustomerStore$getCustomerForId$$inlined$map$1) flow).collect(new RealRecipientSuggestionsProvider$sections$lambda$1$$inlined$map$1$2(flowCollector, this.$isFirstDayTrading$inlined, (String) obj3, (AccountDocumentsPresenter) obj2, (String) obj), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public InvestingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1(Flow flow, InvestingPortfolioPresenter investingPortfolioPresenter, HistoricalRange historicalRange, TextGeometricTransformKt textGeometricTransformKt, boolean z) {
        this.$this_unsafeTransform$inlined = flow;
        this.this$0 = investingPortfolioPresenter;
        this.$range$inlined = historicalRange;
        this.$accentColor$inlined = textGeometricTransformKt;
        this.$isFirstDayTrading$inlined = z;
    }
}
