package com.squareup.cash.family.familyhub.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public abstract class AllowanceViewEvent {

    public final class TapAllowanceDetail extends AllowanceViewEvent {
        public final String allowanceToken;

        public TapAllowanceDetail(String str) {
            this.allowanceToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapAllowanceDetail) && this.allowanceToken.equals(((TapAllowanceDetail) obj).allowanceToken);
        }

        public final int hashCode() {
            return this.allowanceToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TapAllowanceDetail(allowanceToken=", this.allowanceToken, ")");
        }
    }

    public final class TapNoAllowanceInDependentDetail extends AllowanceViewEvent {
        public static final TapNoAllowanceInDependentDetail INSTANCE = new TapNoAllowanceInDependentDetail();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapNoAllowanceInDependentDetail);
        }

        public final int hashCode() {
            return 721118736;
        }

        public final String toString() {
            return "TapNoAllowanceInDependentDetail";
        }
    }

    public final class TapNoAllowanceInSponsorDetail extends AllowanceViewEvent {
        public static final TapNoAllowanceInSponsorDetail INSTANCE = new TapNoAllowanceInSponsorDetail();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapNoAllowanceInSponsorDetail);
        }

        public final int hashCode() {
            return 489776619;
        }

        public final String toString() {
            return "TapNoAllowanceInSponsorDetail";
        }
    }
}
