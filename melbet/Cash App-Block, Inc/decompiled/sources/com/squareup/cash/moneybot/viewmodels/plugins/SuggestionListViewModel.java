package com.squareup.cash.moneybot.viewmodels.plugins;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.moneybot.viewmodels.SuggestionRowIcon;
import com.squareup.cash.moneybot.viewmodels.SuggestionRowModel;
import com.squareup.cash.moneybot.viewmodels.plugins.SuggestionListViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SuggestionListViewModel {
    public final ArrayList suggestions;

    public final class HomeWidgetSuggestion implements SuggestionRowModel {
        public final String body;
        public final SuggestionListViewEvent.SuggestionRendered renderedEvent;
        public final SuggestionListViewEvent.SuggestionTapped tapEvent;
        public final String title;

        public HomeWidgetSuggestion(String str, String str2, SuggestionListViewEvent.SuggestionTapped suggestionTapped, SuggestionListViewEvent.SuggestionRendered suggestionRendered) {
            this.title = str;
            this.body = str2;
            this.tapEvent = suggestionTapped;
            this.renderedEvent = suggestionRendered;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HomeWidgetSuggestion)) {
                return false;
            }
            HomeWidgetSuggestion homeWidgetSuggestion = (HomeWidgetSuggestion) obj;
            return this.title.equals(homeWidgetSuggestion.title) && this.body.equals(homeWidgetSuggestion.body) && this.tapEvent.equals(homeWidgetSuggestion.tapEvent) && Intrinsics.areEqual(this.renderedEvent, homeWidgetSuggestion.renderedEvent);
        }

        @Override // com.squareup.cash.moneybot.viewmodels.SuggestionRowModel
        public final String getBody() {
            return this.body;
        }

        @Override // com.squareup.cash.moneybot.viewmodels.SuggestionRowModel
        public final SuggestionRowIcon getIcon() {
            return null;
        }

        @Override // com.squareup.cash.moneybot.viewmodels.SuggestionRowModel
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int hashCode = (this.tapEvent.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body)) * 31;
            SuggestionListViewEvent.SuggestionRendered suggestionRendered = this.renderedEvent;
            return hashCode + (suggestionRendered == null ? 0 : suggestionRendered.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("HomeWidgetSuggestion(title=", this.title, ", body=", this.body, ", tapEvent=");
            m.append(this.tapEvent);
            m.append(", renderedEvent=");
            m.append(this.renderedEvent);
            m.append(")");
            return m.toString();
        }
    }

    public SuggestionListViewModel(ArrayList arrayList) {
        this.suggestions = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SuggestionListViewModel) && this.suggestions.equals(((SuggestionListViewModel) obj).suggestions);
    }

    public final int hashCode() {
        return this.suggestions.hashCode();
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("SuggestionListViewModel(suggestions=", ")", this.suggestions);
    }
}
