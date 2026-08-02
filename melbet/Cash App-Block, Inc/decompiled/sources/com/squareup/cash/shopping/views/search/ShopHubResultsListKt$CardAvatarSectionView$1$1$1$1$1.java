package com.squareup.cash.shopping.views.search;

import app.cash.directoryui.viewmodels.DirectoryAnalyticsData;
import com.squareup.cash.shopping.viewmodels.SearchResultsViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class ShopHubResultsListKt$CardAvatarSectionView$1$1$1$1$1 implements Function0 {
    public final /* synthetic */ DirectoryAnalyticsData $dataWithPosition;
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ShopHubResultsListKt$CardAvatarSectionView$1$1$1$1$1(Function1 function1, DirectoryAnalyticsData directoryAnalyticsData, int i) {
        this.$r8$classId = i;
        this.$onEvent = function1;
        this.$dataWithPosition = directoryAnalyticsData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        DirectoryAnalyticsData directoryAnalyticsData = this.$dataWithPosition;
        Function1 function1 = this.$onEvent;
        switch (i) {
            case 0:
                function1.invoke(new SearchResultsViewEvent.ViewItem(directoryAnalyticsData));
                break;
            default:
                function1.invoke(new SearchResultsViewEvent.ViewQuery(directoryAnalyticsData));
                break;
        }
        return Unit.INSTANCE;
    }
}
