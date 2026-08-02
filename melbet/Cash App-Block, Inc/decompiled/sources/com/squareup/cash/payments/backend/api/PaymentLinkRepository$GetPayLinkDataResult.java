package com.squareup.cash.payments.backend.api;

import com.squareup.cash.db.contacts.Recipient;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PaymentLinkRepository$GetPayLinkDataResult {

    public final class Failed implements PaymentLinkRepository$GetPayLinkDataResult {
        public static final Failed INSTANCE = new Failed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public final int hashCode() {
            return -1206874569;
        }

        public final String toString() {
            return "Failed";
        }
    }

    public final class OwnLink implements PaymentLinkRepository$GetPayLinkDataResult {
        public static final OwnLink INSTANCE = new OwnLink();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OwnLink);
        }

        public final int hashCode() {
            return 1272702438;
        }

        public final String toString() {
            return "OwnLink";
        }
    }

    public final class Success implements PaymentLinkRepository$GetPayLinkDataResult {
        public final Money amount;
        public final String note;
        public final Recipient recipient;

        public Success(Recipient recipient, String str, Money money) {
            money.getClass();
            this.recipient = recipient;
            this.note = str;
            this.amount = money;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return this.recipient.equals(success.recipient) && this.note.equals(success.note) && Intrinsics.areEqual(this.amount, success.amount);
        }

        public final int hashCode() {
            return this.amount.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.recipient.hashCode() * 31, 31, this.note);
        }

        public final String toString() {
            return "Success(recipient=" + this.recipient + ", note=" + this.note + ", amount=" + this.amount + ")";
        }
    }
}
