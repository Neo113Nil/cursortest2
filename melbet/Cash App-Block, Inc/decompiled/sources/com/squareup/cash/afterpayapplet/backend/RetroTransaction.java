package com.squareup.cash.afterpayapplet.backend;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class RetroTransaction {
    public final String amountFormatted;
    public final String date;
    public final Button inlineButton;
    public final StackedAvatarViewModel retroAvatar;
    public final String subtitle;
    public final List tapEventSpec;
    public final String tertiaryLabel;
    public final String title;
    public final String urlToOpen;
    public final List viewEventSpec;

    public final class Button {
        public final String accessibilityText;
        public final String actionUrl;
        public final Icons icon;
        public final PaymentHistoryData.InlineButtonProminence prominence;
        public final String text;

        public Button(String str, Icons icons, PaymentHistoryData.InlineButtonProminence inlineButtonProminence, String str2, String str3) {
            inlineButtonProminence.getClass();
            str3.getClass();
            this.text = str;
            this.icon = icons;
            this.prominence = inlineButtonProminence;
            this.accessibilityText = str2;
            this.actionUrl = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return this.text.equals(button.text) && this.icon == button.icon && this.prominence == button.prominence && Intrinsics.areEqual(this.accessibilityText, button.accessibilityText) && Intrinsics.areEqual(this.actionUrl, button.actionUrl);
        }

        public final int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            Icons icons = this.icon;
            int hashCode2 = (this.prominence.hashCode() + ((hashCode + (icons == null ? 0 : icons.hashCode())) * 31)) * 31;
            String str = this.accessibilityText;
            return this.actionUrl.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Button(text=");
            sb.append(this.text);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", prominence=");
            sb.append(this.prominence);
            sb.append(", accessibilityText=");
            sb.append(this.accessibilityText);
            sb.append(", actionUrl=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.actionUrl, ")");
        }
    }

    public RetroTransaction(String str, String str2, String str3, Button button, String str4, StackedAvatarViewModel stackedAvatarViewModel, String str5, List list, List list2, String str6) {
        this.title = str;
        this.subtitle = str2;
        this.tertiaryLabel = str3;
        this.inlineButton = button;
        this.date = str4;
        this.retroAvatar = stackedAvatarViewModel;
        this.amountFormatted = str5;
        this.tapEventSpec = list;
        this.viewEventSpec = list2;
        this.urlToOpen = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RetroTransaction)) {
            return false;
        }
        RetroTransaction retroTransaction = (RetroTransaction) obj;
        return Intrinsics.areEqual(this.title, retroTransaction.title) && Intrinsics.areEqual(this.subtitle, retroTransaction.subtitle) && Intrinsics.areEqual(this.tertiaryLabel, retroTransaction.tertiaryLabel) && Intrinsics.areEqual(this.inlineButton, retroTransaction.inlineButton) && Intrinsics.areEqual(this.date, retroTransaction.date) && Intrinsics.areEqual(this.retroAvatar, retroTransaction.retroAvatar) && Intrinsics.areEqual(this.amountFormatted, retroTransaction.amountFormatted) && Intrinsics.areEqual(this.tapEventSpec, retroTransaction.tapEventSpec) && Intrinsics.areEqual(this.viewEventSpec, retroTransaction.viewEventSpec) && Intrinsics.areEqual(this.urlToOpen, retroTransaction.urlToOpen);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle), 31, this.tertiaryLabel);
        Button button = this.inlineButton;
        int hashCode = (m + (button == null ? 0 : button.hashCode())) * 31;
        String str = this.date;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        StackedAvatarViewModel stackedAvatarViewModel = this.retroAvatar;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (stackedAvatarViewModel == null ? 0 : stackedAvatarViewModel.hashCode())) * 31, 31, this.amountFormatted);
        List list = this.tapEventSpec;
        int hashCode3 = (m2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.viewEventSpec;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.urlToOpen;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RetroTransaction(title=", this.title, ", subtitle=", this.subtitle, ", tertiaryLabel=");
        m.append(this.tertiaryLabel);
        m.append(", inlineButton=");
        m.append(this.inlineButton);
        m.append(", date=");
        m.append(this.date);
        m.append(", retroAvatar=");
        m.append(this.retroAvatar);
        m.append(", amountFormatted=");
        NavAction$$ExternalSyntheticOutline0.m(this.amountFormatted, ", tapEventSpec=", ", viewEventSpec=", m, this.tapEventSpec);
        m.append(this.viewEventSpec);
        m.append(", urlToOpen=");
        m.append(this.urlToOpen);
        m.append(")");
        return m.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RetroTransaction(String str, String str2, String str3, StackedAvatarViewModel.Single single, String str4, String str5) {
        this(str, "Cash App Card", str2, null, str3, single, str4, r8, r8, str5);
        EmptyList emptyList = EmptyList.INSTANCE;
    }
}
