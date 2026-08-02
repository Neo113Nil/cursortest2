package com.squareup.cash.moneybot.views.plugins;

import com.squareup.cash.moneybot.viewmodels.plugins.SuggestionListViewEvent;
import com.squareup.cash.moneybot.viewmodels.plugins.SuggestionListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class SuggestionListKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ SuggestionListViewModel.HomeWidgetSuggestion f$1;

    public /* synthetic */ SuggestionListKt$$ExternalSyntheticLambda0(SuggestionListViewModel.HomeWidgetSuggestion homeWidgetSuggestion, Function1 function1) {
        this.f$1 = homeWidgetSuggestion;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        SuggestionListViewModel.HomeWidgetSuggestion homeWidgetSuggestion = this.f$1;
        switch (i) {
            case 0:
                function1.invoke(homeWidgetSuggestion.tapEvent);
                break;
            default:
                SuggestionListViewEvent.SuggestionRendered suggestionRendered = homeWidgetSuggestion.renderedEvent;
                if (suggestionRendered != null) {
                    function1.invoke(suggestionRendered);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SuggestionListKt$$ExternalSyntheticLambda0(Function1 function1, SuggestionListViewModel.HomeWidgetSuggestion homeWidgetSuggestion) {
        this.f$0 = function1;
        this.f$1 = homeWidgetSuggestion;
    }
}
