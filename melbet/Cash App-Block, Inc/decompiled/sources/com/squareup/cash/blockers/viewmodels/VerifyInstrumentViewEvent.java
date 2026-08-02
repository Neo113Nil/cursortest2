package com.squareup.cash.blockers.viewmodels;

import com.squareup.protos.franklin.api.HelpItem;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class VerifyInstrumentViewEvent {

    public final class GoBack extends VerifyInstrumentViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 1482224164;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class SelectHelpItem extends VerifyInstrumentViewEvent {
        public final HelpItem helpItem;

        public SelectHelpItem(HelpItem helpItem) {
            helpItem.getClass();
            this.helpItem = helpItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectHelpItem) && Intrinsics.areEqual(this.helpItem, ((SelectHelpItem) obj).helpItem);
        }

        public final int hashCode() {
            return this.helpItem.hashCode();
        }

        public final String toString() {
            return "SelectHelpItem(helpItem=" + this.helpItem + ")";
        }
    }

    public final class ShowHelpItems extends VerifyInstrumentViewEvent {
        public static final ShowHelpItems INSTANCE = new ShowHelpItems();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowHelpItems);
        }

        public final int hashCode() {
            return -1316682579;
        }

        public final String toString() {
            return "ShowHelpItems";
        }
    }

    public final class SubmitCardNumber extends VerifyInstrumentViewEvent {
        public final String cardNumber;

        public SubmitCardNumber(String str) {
            str.getClass();
            this.cardNumber = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmitCardNumber) && Intrinsics.areEqual(this.cardNumber, ((SubmitCardNumber) obj).cardNumber);
        }

        public final int hashCode() {
            return this.cardNumber.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SubmitCardNumber(cardNumber=", this.cardNumber, ")");
        }
    }
}
