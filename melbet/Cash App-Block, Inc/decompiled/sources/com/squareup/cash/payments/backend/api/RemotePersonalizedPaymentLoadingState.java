package com.squareup.cash.payments.backend.api;

import com.squareup.cash.mosaic.personalization.api.v1.Personalization;
import com.squareup.cash.reactions.api.ReactionsData;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface RemotePersonalizedPaymentLoadingState {

    public final class ErrorLoadingPersonalizedPayment implements RemotePersonalizedPaymentLoadingState {
        public static final ErrorLoadingPersonalizedPayment INSTANCE = new ErrorLoadingPersonalizedPayment();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ErrorLoadingPersonalizedPayment);
        }

        public final int hashCode() {
            return -866813508;
        }

        public final String toString() {
            return "ErrorLoadingPersonalizedPayment";
        }
    }

    public final class LoadingPersonalizedPayment implements RemotePersonalizedPaymentLoadingState {
        public static final LoadingPersonalizedPayment INSTANCE = new LoadingPersonalizedPayment();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LoadingPersonalizedPayment);
        }

        public final int hashCode() {
            return 586695840;
        }

        public final String toString() {
            return "LoadingPersonalizedPayment";
        }
    }

    /* loaded from: classes7.dex */
    public final class LocallyStoredPersonalizedPayment implements RemotePersonalizedPaymentLoadingState {
        public final Money amount;
        public final boolean isSender;
        public final String note;
        public final Personalization personalization;
        public final com.squareup.cash.mosaic.personalization.api.v2.Personalization personalizationPayload;
        public final ReactionsData reactionsData;
        public final String senderCustomerToken;
        public final String senderFullName;
        public final Image senderPhoto;

        public LocallyStoredPersonalizedPayment(String str, String str2, Image image, Money money, Personalization personalization, com.squareup.cash.mosaic.personalization.api.v2.Personalization personalization2, boolean z, ReactionsData reactionsData, String str3) {
            this.senderCustomerToken = str;
            this.senderFullName = str2;
            this.senderPhoto = image;
            this.amount = money;
            this.personalization = personalization;
            this.personalizationPayload = personalization2;
            this.isSender = z;
            this.reactionsData = reactionsData;
            this.note = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocallyStoredPersonalizedPayment)) {
                return false;
            }
            LocallyStoredPersonalizedPayment locallyStoredPersonalizedPayment = (LocallyStoredPersonalizedPayment) obj;
            return this.senderCustomerToken.equals(locallyStoredPersonalizedPayment.senderCustomerToken) && Intrinsics.areEqual(this.senderFullName, locallyStoredPersonalizedPayment.senderFullName) && Intrinsics.areEqual(this.senderPhoto, locallyStoredPersonalizedPayment.senderPhoto) && Intrinsics.areEqual(this.amount, locallyStoredPersonalizedPayment.amount) && Intrinsics.areEqual(this.personalization, locallyStoredPersonalizedPayment.personalization) && Intrinsics.areEqual(this.personalizationPayload, locallyStoredPersonalizedPayment.personalizationPayload) && this.isSender == locallyStoredPersonalizedPayment.isSender && this.reactionsData.equals(locallyStoredPersonalizedPayment.reactionsData) && Intrinsics.areEqual(this.note, locallyStoredPersonalizedPayment.note);
        }

        public final int hashCode() {
            int hashCode = this.senderCustomerToken.hashCode() * 31;
            String str = this.senderFullName;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Image image = this.senderPhoto;
            int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
            Money money = this.amount;
            int hashCode4 = (hashCode3 + (money == null ? 0 : money.hashCode())) * 31;
            Personalization personalization = this.personalization;
            int hashCode5 = (hashCode4 + (personalization == null ? 0 : personalization.hashCode())) * 31;
            com.squareup.cash.mosaic.personalization.api.v2.Personalization personalization2 = this.personalizationPayload;
            int hashCode6 = (this.reactionsData.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode5 + (personalization2 == null ? 0 : personalization2.hashCode())) * 31, 31, this.isSender)) * 31;
            String str2 = this.note;
            return hashCode6 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocallyStoredPersonalizedPayment(senderCustomerToken=", this.senderCustomerToken, ", senderFullName=", this.senderFullName, ", senderPhoto=");
            m.append(this.senderPhoto);
            m.append(", amount=");
            m.append(this.amount);
            m.append(", personalization=");
            m.append(this.personalization);
            m.append(", personalizationPayload=");
            m.append(this.personalizationPayload);
            m.append(", isSender=");
            m.append(this.isSender);
            m.append(", reactionsData=");
            m.append(this.reactionsData);
            m.append(", note=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.note, ")");
        }
    }
}
