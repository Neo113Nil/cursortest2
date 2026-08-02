package com.squareup.cash.payments.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PersonalizePaymentToolbarViewModel {
    public final boolean isSender;
    public final List recipients;
    public final SendButtonConfiguration sendButtonConfiguration;
    public final boolean showRemoveButton;

    public final class SendButtonConfiguration {
        public final boolean isSendEnabled;
        public final String sendButtonLabel;

        public SendButtonConfiguration(boolean z, String str) {
            this.isSendEnabled = z;
            this.sendButtonLabel = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SendButtonConfiguration)) {
                return false;
            }
            SendButtonConfiguration sendButtonConfiguration = (SendButtonConfiguration) obj;
            return this.isSendEnabled == sendButtonConfiguration.isSendEnabled && Intrinsics.areEqual(this.sendButtonLabel, sendButtonConfiguration.sendButtonLabel);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.isSendEnabled) * 31;
            String str = this.sendButtonLabel;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "SendButtonConfiguration(isSendEnabled=" + this.isSendEnabled + ", sendButtonLabel=" + this.sendButtonLabel + ")";
        }
    }

    public PersonalizePaymentToolbarViewModel(List list, SendButtonConfiguration sendButtonConfiguration, boolean z, boolean z2) {
        list.getClass();
        this.recipients = list;
        this.sendButtonConfiguration = sendButtonConfiguration;
        this.isSender = z;
        this.showRemoveButton = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalizePaymentToolbarViewModel)) {
            return false;
        }
        PersonalizePaymentToolbarViewModel personalizePaymentToolbarViewModel = (PersonalizePaymentToolbarViewModel) obj;
        return Intrinsics.areEqual(this.recipients, personalizePaymentToolbarViewModel.recipients) && Intrinsics.areEqual(this.sendButtonConfiguration, personalizePaymentToolbarViewModel.sendButtonConfiguration) && this.isSender == personalizePaymentToolbarViewModel.isSender && this.showRemoveButton == personalizePaymentToolbarViewModel.showRemoveButton;
    }

    public final int hashCode() {
        int hashCode = this.recipients.hashCode() * 31;
        SendButtonConfiguration sendButtonConfiguration = this.sendButtonConfiguration;
        return Boolean.hashCode(this.showRemoveButton) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (sendButtonConfiguration == null ? 0 : sendButtonConfiguration.hashCode())) * 31, 31, this.isSender);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersonalizePaymentToolbarViewModel(recipients=");
        sb.append(this.recipients);
        sb.append(", sendButtonConfiguration=");
        sb.append(this.sendButtonConfiguration);
        sb.append(", isSender=");
        return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.isSender, ", showRemoveButton=", this.showRemoveButton, ")");
    }
}
