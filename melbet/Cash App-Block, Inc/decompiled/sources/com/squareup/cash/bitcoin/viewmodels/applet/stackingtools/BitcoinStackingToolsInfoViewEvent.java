package com.squareup.cash.bitcoin.viewmodels.applet.stackingtools;

import com.squareup.cash.bitcoin.viewmodels.applet.stackingtools.BitcoinStackingToolsInfoViewModel;

/* loaded from: classes5.dex */
public interface BitcoinStackingToolsInfoViewEvent {

    public final class BackClicked implements BitcoinStackingToolsInfoViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return -1845141614;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    /* loaded from: classes4.dex */
    public final class ContinueClicked implements BitcoinStackingToolsInfoViewEvent {

        /* renamed from: type, reason: collision with root package name */
        public final BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoType f1055type;

        public ContinueClicked(BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoType bitcoinStackingToolsInfoType) {
            this.f1055type = bitcoinStackingToolsInfoType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContinueClicked) && this.f1055type == ((ContinueClicked) obj).f1055type;
        }

        public final int hashCode() {
            return this.f1055type.hashCode();
        }

        public final String toString() {
            return "ContinueClicked(type=" + this.f1055type + ")";
        }
    }

    /* loaded from: classes4.dex */
    public final class ItemClicked implements BitcoinStackingToolsInfoViewEvent {

        /* renamed from: type, reason: collision with root package name */
        public final BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoType f1056type;

        public ItemClicked(BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoType bitcoinStackingToolsInfoType) {
            bitcoinStackingToolsInfoType.getClass();
            this.f1056type = bitcoinStackingToolsInfoType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ItemClicked) && this.f1056type == ((ItemClicked) obj).f1056type;
        }

        public final int hashCode() {
            return this.f1056type.hashCode();
        }

        public final String toString() {
            return "ItemClicked(type=" + this.f1056type + ")";
        }
    }
}
