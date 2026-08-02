package com.squareup.cash.moneybot.viewmodels.plugins;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface SuggestionListViewEvent {

    public final class SuggestionRendered implements SuggestionListViewEvent {
        public final String clientSuggestionId;
        public final List viewCdfEvents;

        public SuggestionRendered(String str, List list) {
            list.getClass();
            this.clientSuggestionId = str;
            this.viewCdfEvents = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuggestionRendered)) {
                return false;
            }
            SuggestionRendered suggestionRendered = (SuggestionRendered) obj;
            return this.clientSuggestionId.equals(suggestionRendered.clientSuggestionId) && Intrinsics.areEqual(this.viewCdfEvents, suggestionRendered.viewCdfEvents);
        }

        public final int hashCode() {
            return this.viewCdfEvents.hashCode() + (this.clientSuggestionId.hashCode() * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("SuggestionRendered(clientSuggestionId=", this.clientSuggestionId, ", viewCdfEvents=", ")", this.viewCdfEvents);
        }
    }

    public final class SuggestionTapped implements SuggestionListViewEvent {
        public final String clientSuggestionId;
        public final String prompt;
        public final String suggestionsId;
        public final List tapCdfEvents;

        public SuggestionTapped(String str, String str2, String str3, List list) {
            str3.getClass();
            list.getClass();
            this.prompt = str;
            this.suggestionsId = str2;
            this.clientSuggestionId = str3;
            this.tapCdfEvents = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuggestionTapped)) {
                return false;
            }
            SuggestionTapped suggestionTapped = (SuggestionTapped) obj;
            return this.prompt.equals(suggestionTapped.prompt) && Intrinsics.areEqual(this.suggestionsId, suggestionTapped.suggestionsId) && Intrinsics.areEqual(this.clientSuggestionId, suggestionTapped.clientSuggestionId) && Intrinsics.areEqual(this.tapCdfEvents, suggestionTapped.tapCdfEvents);
        }

        public final int hashCode() {
            int hashCode = this.prompt.hashCode() * 31;
            String str = this.suggestionsId;
            return this.tapCdfEvents.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.clientSuggestionId);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SuggestionTapped(prompt=", this.prompt, ", suggestionsId=", this.suggestionsId, ", clientSuggestionId=");
            m.append(this.clientSuggestionId);
            m.append(", tapCdfEvents=");
            m.append(this.tapCdfEvents);
            m.append(")");
            return m.toString();
        }
    }
}
