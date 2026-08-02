package com.squareup.cash.investing.viewmodels.holdings;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface InvestingEtfHoldingsViewEvent {

    public final class HoldingClicked implements InvestingEtfHoldingsViewEvent {
        public final String token;

        public HoldingClicked(String str) {
            str.getClass();
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HoldingClicked) && Intrinsics.areEqual(this.token, ((HoldingClicked) obj).token);
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("HoldingClicked(token=", this.token, ")");
        }
    }

    public final class ShowMoreClicked implements InvestingEtfHoldingsViewEvent {
        public static final ShowMoreClicked INSTANCE = new ShowMoreClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowMoreClicked);
        }

        public final int hashCode() {
            return 663010704;
        }

        public final String toString() {
            return "ShowMoreClicked";
        }
    }
}
