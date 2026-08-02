package com.squareup.cash.bitcoin.viewmodels.applet.sendreceive;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinSendReceiveBottomSheetViewModel {
    public final String closeButtonText;
    public final String receiveButtonText;
    public final String sendButtonText;
    public final String subtitle;
    public final String title;

    public BitcoinSendReceiveBottomSheetViewModel(String str, String str2, String str3, String str4, String str5) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        this.title = str;
        this.subtitle = str2;
        this.sendButtonText = str3;
        this.receiveButtonText = str4;
        this.closeButtonText = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinSendReceiveBottomSheetViewModel)) {
            return false;
        }
        BitcoinSendReceiveBottomSheetViewModel bitcoinSendReceiveBottomSheetViewModel = (BitcoinSendReceiveBottomSheetViewModel) obj;
        return Intrinsics.areEqual(this.title, bitcoinSendReceiveBottomSheetViewModel.title) && Intrinsics.areEqual(this.subtitle, bitcoinSendReceiveBottomSheetViewModel.subtitle) && Intrinsics.areEqual(this.sendButtonText, bitcoinSendReceiveBottomSheetViewModel.sendButtonText) && Intrinsics.areEqual(this.receiveButtonText, bitcoinSendReceiveBottomSheetViewModel.receiveButtonText) && Intrinsics.areEqual(this.closeButtonText, bitcoinSendReceiveBottomSheetViewModel.closeButtonText);
    }

    public final int hashCode() {
        return this.closeButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle), 31, this.sendButtonText), 31, this.receiveButtonText);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BitcoinSendReceiveBottomSheetViewModel(title=", this.title, ", subtitle=", this.subtitle, ", sendButtonText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.sendButtonText, ", receiveButtonText=", this.receiveButtonText, ", closeButtonText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.closeButtonText, ")");
    }
}
