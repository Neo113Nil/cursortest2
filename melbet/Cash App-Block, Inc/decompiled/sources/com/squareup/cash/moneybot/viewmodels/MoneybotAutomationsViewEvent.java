package com.squareup.cash.moneybot.viewmodels;

import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MoneybotAutomationsViewEvent {

    public final class SuggestionTapped implements MoneybotAutomationsViewEvent {
        public final String suggestion;

        public SuggestionTapped(String str) {
            str.getClass();
            this.suggestion = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuggestionTapped) && Intrinsics.areEqual(this.suggestion, ((SuggestionTapped) obj).suggestion);
        }

        public final int hashCode() {
            return this.suggestion.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SuggestionTapped(suggestion=", this.suggestion, ")");
        }
    }

    public final class TabToolbarEvent implements MoneybotAutomationsViewEvent {
        public final TabToolbarInternalViewEvent tabToolbarEvent;

        public TabToolbarEvent(TabToolbarInternalViewEvent tabToolbarInternalViewEvent) {
            tabToolbarInternalViewEvent.getClass();
            this.tabToolbarEvent = tabToolbarInternalViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TabToolbarEvent) && Intrinsics.areEqual(this.tabToolbarEvent, ((TabToolbarEvent) obj).tabToolbarEvent);
        }

        public final int hashCode() {
            return this.tabToolbarEvent.hashCode();
        }

        public final String toString() {
            return "TabToolbarEvent(tabToolbarEvent=" + this.tabToolbarEvent + ")";
        }
    }
}
