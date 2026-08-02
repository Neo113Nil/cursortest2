package com.squareup.cash.benefits.viewmodels;

import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BankingBenefitsBookletViewEvent {

    public final class Close implements BankingBenefitsBookletViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1374212496;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class PrimaryFooterButtonClick implements BankingBenefitsBookletViewEvent {
        public static final PrimaryFooterButtonClick INSTANCE = new PrimaryFooterButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrimaryFooterButtonClick);
        }

        public final int hashCode() {
            return 1645509729;
        }

        public final String toString() {
            return "PrimaryFooterButtonClick";
        }
    }

    public final class UrlClick implements BankingBenefitsBookletViewEvent {
        public final String url;

        public UrlClick(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UrlClick) && Intrinsics.areEqual(this.url, ((UrlClick) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UrlClick(url=", this.url, ")");
        }
    }
}
