package com.squareup.cash.blockers.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.squareup.cash.securitysignals.models.SignalsContext;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.HelpItem;

/* loaded from: classes4.dex */
public abstract class RegisterAliasViewEvent {

    public final class AcknowledgeErrorScreen extends RegisterAliasViewEvent {
        public static final AcknowledgeErrorScreen INSTANCE = new AcknowledgeErrorScreen();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AcknowledgeErrorScreen);
        }

        public final int hashCode() {
            return 836528386;
        }

        public final String toString() {
            return "AcknowledgeErrorScreen";
        }
    }

    public final class GoBack extends RegisterAliasViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 2131274393;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class HelpItemClick extends RegisterAliasViewEvent {
        public final HelpItem item;

        public HelpItemClick(HelpItem helpItem) {
            this.item = helpItem;
        }
    }

    public final class OnNewCountrySelected extends RegisterAliasViewEvent {
        public final Country country;

        public OnNewCountrySelected(Country country) {
            country.getClass();
            this.country = country;
        }

        public final Country getCountry() {
            return this.country;
        }
    }

    public final class SecondaryButtonClicked extends RegisterAliasViewEvent {
        public static final SecondaryButtonClicked INSTANCE = new SecondaryButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SecondaryButtonClicked);
        }

        public final int hashCode() {
            return -2035096533;
        }

        public final String toString() {
            return "SecondaryButtonClicked";
        }
    }

    public final class Submit extends RegisterAliasViewEvent {
        public final String alias;
        public final SignalsContext signalsContext;

        public Submit(String str, SignalsContext signalsContext) {
            str.getClass();
            this.alias = str;
            this.signalsContext = signalsContext;
        }

        public final String getAlias() {
            return this.alias;
        }

        public final SignalsContext getSignalsContext() {
            return this.signalsContext;
        }
    }

    public final class SwitchToEmail extends RegisterAliasViewEvent {
        public static final SwitchToEmail INSTANCE = new SwitchToEmail();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SwitchToEmail);
        }

        public final int hashCode() {
            return -962251741;
        }

        public final String toString() {
            return "SwitchToEmail";
        }
    }

    public final class SwitchToSms extends RegisterAliasViewEvent {
        public static final SwitchToSms INSTANCE = new SwitchToSms();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SwitchToSms);
        }

        public final int hashCode() {
            return -1413276768;
        }

        public final String toString() {
            return "SwitchToSms";
        }
    }

    public final class Terms extends RegisterAliasViewEvent {
        public final String url;

        public Terms(String str) {
            str.getClass();
            this.url = str;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    public final class HelpClick extends RegisterAliasViewEvent {
        public final boolean isInlineLink;

        public HelpClick(boolean z) {
            this.isInlineLink = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HelpClick) && this.isInlineLink == ((HelpClick) obj).isInlineLink;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isInlineLink);
        }

        public final boolean isInlineLink() {
            return this.isInlineLink;
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("HelpClick(isInlineLink=", ")", this.isInlineLink);
        }

        public /* synthetic */ HelpClick() {
            this(false);
        }
    }
}
