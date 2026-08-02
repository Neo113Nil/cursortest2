package com.squareup.cash.phoneplans;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface WirelessProviderListViewEvent {

    public final class HelpButtonClicked implements WirelessProviderListViewEvent {
        public static final HelpButtonClicked INSTANCE = new HelpButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HelpButtonClicked);
        }

        public final int hashCode() {
            return -1999054226;
        }

        public final String toString() {
            return "HelpButtonClicked";
        }
    }

    public final class ProviderSelected implements WirelessProviderListViewEvent {
        public final String id;

        public ProviderSelected(String str) {
            this.id = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProviderSelected) && this.id.equals(((ProviderSelected) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ProviderSelected(id=", this.id, ")");
        }
    }

    public final class SearchTextChanged implements WirelessProviderListViewEvent {
        public final String text;

        public SearchTextChanged(String str) {
            str.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchTextChanged) && Intrinsics.areEqual(this.text, ((SearchTextChanged) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SearchTextChanged(text=", this.text, ")");
        }
    }

    public final class SubmitClicked implements WirelessProviderListViewEvent {
        public static final SubmitClicked INSTANCE = new SubmitClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SubmitClicked);
        }

        public final int hashCode() {
            return -674169463;
        }

        public final String toString() {
            return "SubmitClicked";
        }
    }

    public final class TitleBarButtonClicked implements WirelessProviderListViewEvent {
        public static final TitleBarButtonClicked INSTANCE = new TitleBarButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TitleBarButtonClicked);
        }

        public final int hashCode() {
            return -1083675564;
        }

        public final String toString() {
            return "TitleBarButtonClicked";
        }
    }
}
