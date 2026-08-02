package com.squareup.cash.bitcoin.viewmodels.applet.stackingtools;

import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinStackingToolsViewModel implements BitcoinHomeWidgetViewModel {
    public final BitcoinStackingToolsItem autoInvestItem;
    public final BitcoinStackingToolsItem paidInBitcoinItem;
    public final BitcoinStackingToolsItem receiveP2PAsBitcoinItem;
    public final BitcoinStackingToolsItem roundUpsItem;
    public final boolean showLearnMore;

    public final class BitcoinStackingToolsItem {
        public final Boolean enabled;
        public final String subtitle;
        public final String title;

        public BitcoinStackingToolsItem(Boolean bool, String str, String str2) {
            str.getClass();
            str2.getClass();
            this.enabled = bool;
            this.title = str;
            this.subtitle = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BitcoinStackingToolsItem)) {
                return false;
            }
            BitcoinStackingToolsItem bitcoinStackingToolsItem = (BitcoinStackingToolsItem) obj;
            return this.enabled.equals(bitcoinStackingToolsItem.enabled) && Intrinsics.areEqual(this.title, bitcoinStackingToolsItem.title) && Intrinsics.areEqual(this.subtitle, bitcoinStackingToolsItem.subtitle);
        }

        public final int hashCode() {
            return this.subtitle.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.enabled.hashCode() * 31, 31, this.title);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BitcoinStackingToolsItem(enabled=");
            sb.append(this.enabled);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", subtitle=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.subtitle, ")");
        }
    }

    public BitcoinStackingToolsViewModel(BitcoinStackingToolsItem bitcoinStackingToolsItem, BitcoinStackingToolsItem bitcoinStackingToolsItem2, BitcoinStackingToolsItem bitcoinStackingToolsItem3, BitcoinStackingToolsItem bitcoinStackingToolsItem4, boolean z) {
        this.receiveP2PAsBitcoinItem = bitcoinStackingToolsItem;
        this.roundUpsItem = bitcoinStackingToolsItem2;
        this.autoInvestItem = bitcoinStackingToolsItem3;
        this.paidInBitcoinItem = bitcoinStackingToolsItem4;
        this.showLearnMore = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinStackingToolsViewModel)) {
            return false;
        }
        BitcoinStackingToolsViewModel bitcoinStackingToolsViewModel = (BitcoinStackingToolsViewModel) obj;
        return Intrinsics.areEqual(this.receiveP2PAsBitcoinItem, bitcoinStackingToolsViewModel.receiveP2PAsBitcoinItem) && this.roundUpsItem.equals(bitcoinStackingToolsViewModel.roundUpsItem) && this.autoInvestItem.equals(bitcoinStackingToolsViewModel.autoInvestItem) && Intrinsics.areEqual(this.paidInBitcoinItem, bitcoinStackingToolsViewModel.paidInBitcoinItem) && this.showLearnMore == bitcoinStackingToolsViewModel.showLearnMore;
    }

    public final int hashCode() {
        BitcoinStackingToolsItem bitcoinStackingToolsItem = this.receiveP2PAsBitcoinItem;
        int hashCode = (this.autoInvestItem.hashCode() + ((this.roundUpsItem.hashCode() + ((bitcoinStackingToolsItem == null ? 0 : bitcoinStackingToolsItem.hashCode()) * 31)) * 31)) * 31;
        BitcoinStackingToolsItem bitcoinStackingToolsItem2 = this.paidInBitcoinItem;
        return Boolean.hashCode(this.showLearnMore) + ((hashCode + (bitcoinStackingToolsItem2 != null ? bitcoinStackingToolsItem2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitcoinStackingToolsViewModel(receiveP2PAsBitcoinItem=");
        sb.append(this.receiveP2PAsBitcoinItem);
        sb.append(", roundUpsItem=");
        sb.append(this.roundUpsItem);
        sb.append(", autoInvestItem=");
        sb.append(this.autoInvestItem);
        sb.append(", paidInBitcoinItem=");
        sb.append(this.paidInBitcoinItem);
        sb.append(", showLearnMore=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showLearnMore, ")");
    }
}
