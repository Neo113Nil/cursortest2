package com.squareup.cash.investing.components.news;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.encoding.AbstractDecoder;

/* loaded from: classes9.dex */
public final /* synthetic */ class InvestingNewsKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ InvestingCryptoNewsViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ InvestingNewsKt$$ExternalSyntheticLambda2(InvestingCryptoNewsViewModel investingCryptoNewsViewModel, Function1 function1) {
        this.f$0 = investingCryptoNewsViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        InvestingCryptoNewsViewModel investingCryptoNewsViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                AbstractDecoder.InvestingNews(investingCryptoNewsViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
            default:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    AbstractDecoder.InvestingNews(investingCryptoNewsViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InvestingNewsKt$$ExternalSyntheticLambda2(InvestingCryptoNewsViewModel investingCryptoNewsViewModel, Function1 function1, int i) {
        this.f$0 = investingCryptoNewsViewModel;
        this.f$1 = function1;
    }
}
