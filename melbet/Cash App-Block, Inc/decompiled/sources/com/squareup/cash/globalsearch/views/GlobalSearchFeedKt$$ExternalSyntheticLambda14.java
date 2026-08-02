package com.squareup.cash.globalsearch.views;

import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewEvent;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class GlobalSearchFeedKt$$ExternalSyntheticLambda14 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GlobalSearchViewModel.Section f$0;

    public /* synthetic */ GlobalSearchFeedKt$$ExternalSyntheticLambda14(GlobalSearchViewModel.Section section, int i) {
        this.$r8$classId = i;
        this.f$0 = section;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        GlobalSearchViewEvent.LoadMore loadMore = GlobalSearchViewEvent.LoadMore.INSTANCE;
        GlobalSearchViewModel.Section section = this.f$0;
        switch (i) {
            case 0:
                section.getOnEvent().invoke(loadMore);
                break;
            default:
                section.getOnEvent().invoke(loadMore);
                break;
        }
        return Unit.INSTANCE;
    }
}
