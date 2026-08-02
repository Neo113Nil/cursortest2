package com.squareup.cash.benefits.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BenefitsHomeViewEvent {

    public final class Exit implements BenefitsHomeViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return 765134993;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class OtherWaysToQualifyClicked implements BenefitsHomeViewEvent {
        public static final OtherWaysToQualifyClicked INSTANCE = new OtherWaysToQualifyClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OtherWaysToQualifyClicked);
        }

        public final int hashCode() {
            return -389320554;
        }

        public final String toString() {
            return "OtherWaysToQualifyClicked";
        }
    }

    public final class StickyCtaClicked implements BenefitsHomeViewEvent {
        public static final StickyCtaClicked INSTANCE = new StickyCtaClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof StickyCtaClicked);
        }

        public final int hashCode() {
            return -1916310093;
        }

        public final String toString() {
            return "StickyCtaClicked";
        }
    }

    public final class UrlTapped implements BenefitsHomeViewEvent {
        public final String url;

        public UrlTapped(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UrlTapped) && Intrinsics.areEqual(this.url, ((UrlTapped) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UrlTapped(url=", this.url, ")");
        }
    }

    public final class ViewTransactionsClicked implements BenefitsHomeViewEvent {
        public static final ViewTransactionsClicked INSTANCE = new ViewTransactionsClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewTransactionsClicked);
        }

        public final int hashCode() {
            return 1899920346;
        }

        public final String toString() {
            return "ViewTransactionsClicked";
        }
    }
}
