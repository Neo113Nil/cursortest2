package com.squareup.cash.investing.components.news;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import app.cash.local.views.internal.LocalBottomModalKt$$ExternalSyntheticLambda1;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsArticleViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import com.squareup.cash.work.views.shift.ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingNewsKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InvestingCryptoNewsViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ InvestingNewsKt$$ExternalSyntheticLambda1(InvestingCryptoNewsViewModel investingCryptoNewsViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = investingCryptoNewsViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        InvestingCryptoNewsViewModel investingCryptoNewsViewModel = this.f$0;
        int i2 = 1;
        LazyListScope lazyListScope = (LazyListScope) obj;
        switch (i) {
            case 0:
                lazyListScope.getClass();
                List list = investingCryptoNewsViewModel.articles;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new LocalBottomModalKt$$ExternalSyntheticLambda1(i3, i2, (InvestingCryptoNewsArticleViewModel) list.get(i3), function1), true, 1463721829), 3);
                }
                break;
            default:
                lazyListScope.getClass();
                List list2 = investingCryptoNewsViewModel.articles;
                lazyListScope.items(list2.size(), null, new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list2, 26), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(13, function1, list2), true, 2039820996));
                break;
        }
        return Unit.INSTANCE;
    }
}
