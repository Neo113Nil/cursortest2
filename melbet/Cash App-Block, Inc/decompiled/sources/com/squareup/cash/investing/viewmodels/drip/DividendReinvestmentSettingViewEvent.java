package com.squareup.cash.investing.viewmodels.drip;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class DividendReinvestmentSettingViewEvent {

    public final class BackClicked extends DividendReinvestmentSettingViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return 517996025;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class CtaClicked extends DividendReinvestmentSettingViewEvent {
        public static final CtaClicked INSTANCE = new CtaClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CtaClicked);
        }

        public final int hashCode() {
            return 1786469406;
        }

        public final String toString() {
            return "CtaClicked";
        }
    }

    public final class EntryToggled extends DividendReinvestmentSettingViewEvent {
        public final boolean check;

        public EntryToggled(boolean z) {
            this.check = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EntryToggled) && this.check == ((EntryToggled) obj).check;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.check);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("EntryToggled(check=", ")", this.check);
        }
    }

    public final class TermsOfServiceClicked extends DividendReinvestmentSettingViewEvent {
        public final String url;

        public TermsOfServiceClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TermsOfServiceClicked) && Intrinsics.areEqual(this.url, ((TermsOfServiceClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TermsOfServiceClicked(url=", this.url, ")");
        }
    }
}
