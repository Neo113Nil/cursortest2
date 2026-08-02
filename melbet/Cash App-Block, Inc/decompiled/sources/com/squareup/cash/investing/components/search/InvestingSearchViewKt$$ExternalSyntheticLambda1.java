package com.squareup.cash.investing.components.search;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import coil3.RealImageLoader;
import com.squareup.cash.cashapppay.settings.views.CashAppPaySettingsViewKt$BusinessList$lambda$1$0$$inlined$items$default$4;
import com.squareup.cash.cashapppay.settings.views.UnlinkResultViewKt;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt$$ExternalSyntheticLambda67;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingSearchViewKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ RealImageLoader f$2;

    public /* synthetic */ InvestingSearchViewKt$$ExternalSyntheticLambda1(List list, RealImageLoader realImageLoader, Function1 function1) {
        this.f$0 = list;
        this.f$2 = realImageLoader;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        RealImageLoader realImageLoader = this.f$2;
        List list = this.f$0;
        LazyListScope lazyListScope = (LazyListScope) obj;
        switch (i) {
            case 0:
                lazyListScope.getClass();
                lazyListScope.items(list.size(), null, new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list, 25), new ComposableLambdaImpl(new CashAppPaySettingsViewKt$BusinessList$lambda$1$0$$inlined$items$default$4(list, function1, realImageLoader), true, 802480018));
                break;
            default:
                lazyListScope.getClass();
                LazyListScope.item$default(lazyListScope, null, null, UnlinkResultViewKt.lambda$1696709199, 3);
                LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new FidesmoProvisioningViewKt$$ExternalSyntheticLambda67(list, 1), true, -871685434), 3);
                lazyListScope.items(list.size(), null, new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list, 14), new ComposableLambdaImpl(new CashAppPaySettingsViewKt$BusinessList$lambda$1$0$$inlined$items$default$4(list, realImageLoader, function1), true, 802480018));
                LazyListScope.item$default(lazyListScope, null, null, UnlinkResultViewKt.lambda$1727258503, 3);
                LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new FidesmoProvisioningViewKt$$ExternalSyntheticLambda67(list, 2), true, 31235144), 3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InvestingSearchViewKt$$ExternalSyntheticLambda1(List list, Function1 function1, RealImageLoader realImageLoader) {
        this.f$0 = list;
        this.f$1 = function1;
        this.f$2 = realImageLoader;
    }
}
