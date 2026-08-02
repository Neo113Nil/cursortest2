package com.squareup.cash.prepurchasecashcard.viewmodels;

import androidx.credentials.Credential;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PrepurchaseCashCardPlanningViewEvent {

    public final class Close implements PrepurchaseCashCardPlanningViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1574088065;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class OpenLink implements PrepurchaseCashCardPlanningViewEvent {
        public final String url;

        public OpenLink(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenLink) && Intrinsics.areEqual(this.url, ((OpenLink) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenLink(url=", this.url, ")");
        }
    }

    public final class SelectLocale implements PrepurchaseCashCardPlanningViewEvent {
        public final String localeDisplayName;

        public SelectLocale(String str) {
            str.getClass();
            this.localeDisplayName = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectLocale) && Intrinsics.areEqual(this.localeDisplayName, ((SelectLocale) obj).localeDisplayName);
        }

        public final int hashCode() {
            return this.localeDisplayName.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelectLocale(localeDisplayName=", this.localeDisplayName, ")");
        }
    }

    public final class SelectOption implements PrepurchaseCashCardPlanningViewEvent {
        public final String identifier;

        public SelectOption(String str) {
            str.getClass();
            this.identifier = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectOption) && Intrinsics.areEqual(this.identifier, ((SelectOption) obj).identifier);
        }

        public final int hashCode() {
            return this.identifier.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelectOption(identifier=", this.identifier, ")");
        }
    }

    public final class TapButton implements PrepurchaseCashCardPlanningViewEvent {
        public final PrepurchaseCashCardPlanningViewModel.ButtonAction action;

        public TapButton(PrepurchaseCashCardPlanningViewModel.ButtonAction buttonAction) {
            this.action = buttonAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapButton) && this.action.equals(((TapButton) obj).action);
        }

        public final int hashCode() {
            return this.action.hashCode();
        }

        public final String toString() {
            return "TapButton(action=" + this.action + ")";
        }
    }

    public final class TapInfoRow implements PrepurchaseCashCardPlanningViewEvent {
        public final Credential action;

        public TapInfoRow(Credential credential) {
            credential.getClass();
            this.action = credential;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapInfoRow) && Intrinsics.areEqual(this.action, ((TapInfoRow) obj).action);
        }

        public final int hashCode() {
            return this.action.hashCode();
        }

        public final String toString() {
            return "TapInfoRow(action=" + this.action + ")";
        }
    }
}
