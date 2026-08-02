package com.squareup.cash.pools.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface StartPoolViewEvent {

    public final class AmountChanged implements StartPoolViewEvent {
        public final Money amount;

        public AmountChanged(Money money) {
            this.amount = money;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmountChanged) && this.amount.equals(((AmountChanged) obj).amount);
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final String toString() {
            return SVG$Unit$EnumUnboxingLocalUtility.m(this.amount, "AmountChanged(amount=", ")");
        }
    }

    public final class Back implements StartPoolViewEvent {
        public static final Back INSTANCE = new Back();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return -1155119672;
        }

        public final String toString() {
            return Constants.META_BACK_BUTTON;
        }
    }

    public final class Continue implements StartPoolViewEvent {
        public static final Continue INSTANCE = new Continue();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Continue);
        }

        public final int hashCode() {
            return -278129400;
        }

        public final String toString() {
            return "Continue";
        }
    }

    public final class DismissSheet implements StartPoolViewEvent {
        public static final DismissSheet INSTANCE = new DismissSheet();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissSheet);
        }

        public final int hashCode() {
            return -940011306;
        }

        public final String toString() {
            return "DismissSheet";
        }
    }

    public final class NameChanged implements StartPoolViewEvent {
        public final String name;

        public NameChanged(String str) {
            str.getClass();
            this.name = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NameChanged) && Intrinsics.areEqual(this.name, ((NameChanged) obj).name);
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NameChanged(name=", this.name, ")");
        }
    }

    public final class TermsOfService implements StartPoolViewEvent {
        public static final TermsOfService INSTANCE = new TermsOfService();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TermsOfService);
        }

        public final int hashCode() {
            return 1856395960;
        }

        public final String toString() {
            return "TermsOfService";
        }
    }
}
