package com.squareup.cash.globalsearch.views;

import com.squareup.cash.activity.viewmodels.ContactHeaderViewEvent;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewEvent;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class GlobalSearchFeedKt$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ GlobalSearchViewModel.Section f$1;

    public /* synthetic */ GlobalSearchFeedKt$$ExternalSyntheticLambda5(Function0 function0, GlobalSearchViewModel.Section section, int i) {
        this.$r8$classId = i;
        this.f$0 = function0;
        this.f$1 = section;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        GlobalSearchViewModel.Section section = this.f$1;
        Function0 function0 = this.f$0;
        switch (i) {
            case 0:
                GlobalSearchViewEvent.RowSectionEvent rowSectionEvent = (GlobalSearchViewEvent.RowSectionEvent) obj;
                rowSectionEvent.getClass();
                if ((rowSectionEvent instanceof GlobalSearchViewEvent.RowSectionEvent.RowClicked) || (rowSectionEvent instanceof GlobalSearchViewEvent.RowSectionEvent.AccessoryClicked)) {
                    function0.invoke();
                    ((GlobalSearchViewModel.RowSection) section).onEvent.invoke(rowSectionEvent);
                } else {
                    ((GlobalSearchViewModel.RowSection) section).onEvent.invoke(rowSectionEvent);
                }
                break;
            default:
                ContactHeaderViewEvent contactHeaderViewEvent = (ContactHeaderViewEvent) obj;
                contactHeaderViewEvent.getClass();
                function0.invoke();
                ((GlobalSearchViewModel.QabSection) section).onEvent.invoke(contactHeaderViewEvent);
                break;
        }
        return Unit.INSTANCE;
    }
}
