package com.squareup.cash.directdeposit.viewmodels;

import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface DirectDepositSetupEvent {

    public final class AccountNumberClick implements DirectDepositSetupEvent {
        public static final AccountNumberClick INSTANCE = new AccountNumberClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AccountNumberClick);
        }

        public final int hashCode() {
            return 1445329986;
        }

        public final String toString() {
            return "AccountNumberClick";
        }
    }

    public final class Close implements DirectDepositSetupEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1287378168;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class DisclosureUrlClicked implements DirectDepositSetupEvent {
        public final String url;

        public DisclosureUrlClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisclosureUrlClicked) && Intrinsics.areEqual(this.url, ((DisclosureUrlClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisclosureUrlClicked(url=", this.url, ")");
        }
    }

    public final class GuidedSetupClick implements DirectDepositSetupEvent {
        public static final GuidedSetupClick INSTANCE = new GuidedSetupClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GuidedSetupClick);
        }

        public final int hashCode() {
            return -1223259901;
        }

        public final String toString() {
            return "GuidedSetupClick";
        }
    }

    public final class HelpClick implements DirectDepositSetupEvent {
        public static final HelpClick INSTANCE = new HelpClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HelpClick);
        }

        public final int hashCode() {
            return 945269719;
        }

        public final String toString() {
            return "HelpClick";
        }
    }

    public final class ManualSetupClick implements DirectDepositSetupEvent {
        public static final ManualSetupClick INSTANCE = new ManualSetupClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ManualSetupClick);
        }

        public final int hashCode() {
            return -1010512287;
        }

        public final String toString() {
            return "ManualSetupClick";
        }
    }

    public final class RoutingNumberClick implements DirectDepositSetupEvent {
        public static final RoutingNumberClick INSTANCE = new RoutingNumberClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RoutingNumberClick);
        }

        public final int hashCode() {
            return -823378935;
        }

        public final String toString() {
            return "RoutingNumberClick";
        }
    }
}
