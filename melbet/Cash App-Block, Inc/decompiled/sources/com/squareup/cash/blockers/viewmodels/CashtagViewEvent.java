package com.squareup.cash.blockers.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class CashtagViewEvent {

    public final class DialogNegativeResult extends CashtagViewEvent {
        public static final DialogNegativeResult INSTANCE = new DialogNegativeResult();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DialogNegativeResult);
        }

        public final int hashCode() {
            return -541387042;
        }

        public final String toString() {
            return "DialogNegativeResult";
        }
    }

    public final class DialogPositiveResult extends CashtagViewEvent {
        public final String cashtag;

        public DialogPositiveResult(String str) {
            str.getClass();
            this.cashtag = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DialogPositiveResult) && Intrinsics.areEqual(this.cashtag, ((DialogPositiveResult) obj).cashtag);
        }

        public final int hashCode() {
            return this.cashtag.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DialogPositiveResult(cashtag=", this.cashtag, ")");
        }
    }

    public final class Dismiss extends CashtagViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return -872424122;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    /* loaded from: classes7.dex */
    public final class InputChange extends CashtagViewEvent {
        public final String input;

        public InputChange(String str) {
            str.getClass();
            this.input = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InputChange) && Intrinsics.areEqual(this.input, ((InputChange) obj).input);
        }

        public final int hashCode() {
            return this.input.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InputChange(input=", this.input, ")");
        }
    }

    public final class NextClick extends CashtagViewEvent {
        public final String cashtagInput;

        public NextClick(String str) {
            str.getClass();
            this.cashtagInput = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NextClick) && Intrinsics.areEqual(this.cashtagInput, ((NextClick) obj).cashtagInput);
        }

        public final int hashCode() {
            return this.cashtagInput.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NextClick(cashtagInput=", this.cashtagInput, ")");
        }
    }
}
