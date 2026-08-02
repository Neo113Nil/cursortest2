package com.squareup.cash.moneybot.presenters.plugins;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.instruments.screens.TransferOptionPickerQuestion;
import com.squareup.cash.instruments.screens.TransferOptionPickerSelection;
import com.squareup.cash.moneybot.analytics.TemplateCardInputFieldAnalyticsData;
import com.squareup.cash.moneybot.screens.MoneybotAmountInputQuestion;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerQuestion;
import com.squareup.cash.moneybot.screens.MoneybotTextInputQuestion;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PendingInput {

    public final class Amount implements PendingInput {
        public final TemplateCardInputFieldAnalyticsData analyticsData;
        public final String placeholderKey;
        public final MoneybotAmountInputQuestion question;

        public Amount(String str, TemplateCardInputFieldAnalyticsData templateCardInputFieldAnalyticsData, MoneybotAmountInputQuestion moneybotAmountInputQuestion) {
            str.getClass();
            this.placeholderKey = str;
            this.analyticsData = templateCardInputFieldAnalyticsData;
            this.question = moneybotAmountInputQuestion;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Amount)) {
                return false;
            }
            Amount amount = (Amount) obj;
            return Intrinsics.areEqual(this.placeholderKey, amount.placeholderKey) && this.analyticsData.equals(amount.analyticsData) && this.question.equals(amount.question);
        }

        @Override // com.squareup.cash.moneybot.presenters.plugins.PendingInput
        public final TemplateCardInputFieldAnalyticsData getAnalyticsData() {
            return this.analyticsData;
        }

        public final int hashCode() {
            return this.question.hashCode() + ((this.analyticsData.hashCode() + (this.placeholderKey.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Amount(placeholderKey=" + this.placeholderKey + ", analyticsData=" + this.analyticsData + ", question=" + this.question + ")";
        }
    }

    public final class StaticPicker implements PendingInput {
        public final TemplateCardInputFieldAnalyticsData analyticsData;
        public final String placeholderKey;
        public final MoneybotStaticPickerQuestion question;

        public StaticPicker(String str, TemplateCardInputFieldAnalyticsData templateCardInputFieldAnalyticsData, MoneybotStaticPickerQuestion moneybotStaticPickerQuestion) {
            str.getClass();
            this.placeholderKey = str;
            this.analyticsData = templateCardInputFieldAnalyticsData;
            this.question = moneybotStaticPickerQuestion;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StaticPicker)) {
                return false;
            }
            StaticPicker staticPicker = (StaticPicker) obj;
            return Intrinsics.areEqual(this.placeholderKey, staticPicker.placeholderKey) && this.analyticsData.equals(staticPicker.analyticsData) && this.question.equals(staticPicker.question);
        }

        @Override // com.squareup.cash.moneybot.presenters.plugins.PendingInput
        public final TemplateCardInputFieldAnalyticsData getAnalyticsData() {
            return this.analyticsData;
        }

        public final int hashCode() {
            return this.question.hashCode() + ((this.analyticsData.hashCode() + (this.placeholderKey.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "StaticPicker(placeholderKey=" + this.placeholderKey + ", analyticsData=" + this.analyticsData + ", question=" + this.question + ")";
        }
    }

    public final class Text implements PendingInput {
        public final String placeholderKey;
        public final MoneybotTextInputQuestion question;

        public Text(String str, MoneybotTextInputQuestion moneybotTextInputQuestion) {
            str.getClass();
            this.placeholderKey = str;
            this.question = moneybotTextInputQuestion;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Text)) {
                return false;
            }
            Text text = (Text) obj;
            return Intrinsics.areEqual(this.placeholderKey, text.placeholderKey) && this.question.equals(text.question);
        }

        @Override // com.squareup.cash.moneybot.presenters.plugins.PendingInput
        public final TemplateCardInputFieldAnalyticsData getAnalyticsData() {
            return null;
        }

        public final int hashCode() {
            return this.question.hashCode() + (this.placeholderKey.hashCode() * 961);
        }

        public final String toString() {
            return "Text(placeholderKey=" + this.placeholderKey + ", analyticsData=null, question=" + this.question + ")";
        }
    }

    public final class TransferOptionPicker implements PendingInput {
        public final Money amount;
        public final TemplateCardInputFieldAnalyticsData analyticsData;
        public final boolean balanceGatingEnabled;
        public final String cta;
        public final boolean forceDarkMode;
        public final List hiddenOptionValues;
        public final String placeholderKey;
        public final TransferOptionPickerSelection selectedOption;
        public final String title;
        public final List transferOptions;

        public TransferOptionPicker(String str, TemplateCardInputFieldAnalyticsData templateCardInputFieldAnalyticsData, Money money, List list, String str2, String str3, TransferOptionPickerSelection transferOptionPickerSelection, List list2, boolean z, boolean z2) {
            str.getClass();
            money.getClass();
            list2.getClass();
            this.placeholderKey = str;
            this.analyticsData = templateCardInputFieldAnalyticsData;
            this.amount = money;
            this.transferOptions = list;
            this.title = str2;
            this.cta = str3;
            this.selectedOption = transferOptionPickerSelection;
            this.hiddenOptionValues = list2;
            this.balanceGatingEnabled = z;
            this.forceDarkMode = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransferOptionPicker)) {
                return false;
            }
            TransferOptionPicker transferOptionPicker = (TransferOptionPicker) obj;
            if (!Intrinsics.areEqual(this.placeholderKey, transferOptionPicker.placeholderKey) || !this.analyticsData.equals(transferOptionPicker.analyticsData)) {
                return false;
            }
            TransferOptionPickerQuestion transferOptionPickerQuestion = TransferOptionPickerQuestion.INSTANCE;
            return transferOptionPickerQuestion.equals(transferOptionPickerQuestion) && Intrinsics.areEqual(this.amount, transferOptionPicker.amount) && this.transferOptions.equals(transferOptionPicker.transferOptions) && Intrinsics.areEqual(this.title, transferOptionPicker.title) && Intrinsics.areEqual(this.cta, transferOptionPicker.cta) && Intrinsics.areEqual(this.selectedOption, transferOptionPicker.selectedOption) && Intrinsics.areEqual(this.hiddenOptionValues, transferOptionPicker.hiddenOptionValues) && this.balanceGatingEnabled == transferOptionPicker.balanceGatingEnabled && this.forceDarkMode == transferOptionPicker.forceDarkMode;
        }

        @Override // com.squareup.cash.moneybot.presenters.plugins.PendingInput
        public final TemplateCardInputFieldAnalyticsData getAnalyticsData() {
            return this.analyticsData;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(NavAction$$ExternalSyntheticOutline0.m(this.amount, (((this.analyticsData.hashCode() + (this.placeholderKey.hashCode() * 31)) * 31) - 916978737) * 31, 31), 31, this.transferOptions);
            String str = this.title;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.cta;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            TransferOptionPickerSelection transferOptionPickerSelection = this.selectedOption;
            return Boolean.hashCode(this.forceDarkMode) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (transferOptionPickerSelection != null ? transferOptionPickerSelection.hashCode() : 0)) * 31, 31, this.hiddenOptionValues), 31, this.balanceGatingEnabled);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TransferOptionPicker(placeholderKey=");
            sb.append(this.placeholderKey);
            sb.append(", analyticsData=");
            sb.append(this.analyticsData);
            sb.append(", question=");
            sb.append(TransferOptionPickerQuestion.INSTANCE);
            sb.append(", amount=");
            sb.append(this.amount);
            sb.append(", transferOptions=");
            Recorder$$ExternalSyntheticOutline2.m(", title=", this.title, ", cta=", sb, this.transferOptions);
            sb.append(this.cta);
            sb.append(", selectedOption=");
            sb.append(this.selectedOption);
            sb.append(", hiddenOptionValues=");
            sb.append(this.hiddenOptionValues);
            sb.append(", balanceGatingEnabled=");
            sb.append(this.balanceGatingEnabled);
            sb.append(", forceDarkMode=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.forceDarkMode, ")");
        }
    }

    TemplateCardInputFieldAnalyticsData getAnalyticsData();
}
