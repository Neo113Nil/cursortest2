package com.squareup.cash.bitcoin.viewmodels.applet.stackingtools;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.arcade.Icons;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinStackingToolsInfoViewModel {
    public final String buttonText;
    public final List items;
    public final String subtitle;
    public final String title;

    /* renamed from: type, reason: collision with root package name */
    public final BitcoinStackingToolsInfoType f1057type;
    public final boolean useBackArrow;

    public final class BitcoinStackingToolsInfoItem {
        public final Icons icon;
        public final BitcoinStackingToolsInfoType itemType;
        public final String subtitle;
        public final String title;

        public BitcoinStackingToolsInfoItem(Icons icons, String str, String str2, BitcoinStackingToolsInfoType bitcoinStackingToolsInfoType) {
            str.getClass();
            str2.getClass();
            this.icon = icons;
            this.title = str;
            this.subtitle = str2;
            this.itemType = bitcoinStackingToolsInfoType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BitcoinStackingToolsInfoItem)) {
                return false;
            }
            BitcoinStackingToolsInfoItem bitcoinStackingToolsInfoItem = (BitcoinStackingToolsInfoItem) obj;
            return this.icon == bitcoinStackingToolsInfoItem.icon && Intrinsics.areEqual(this.title, bitcoinStackingToolsInfoItem.title) && Intrinsics.areEqual(this.subtitle, bitcoinStackingToolsInfoItem.subtitle) && this.itemType == bitcoinStackingToolsInfoItem.itemType;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.title), 31, this.subtitle);
            BitcoinStackingToolsInfoType bitcoinStackingToolsInfoType = this.itemType;
            return m + (bitcoinStackingToolsInfoType == null ? 0 : bitcoinStackingToolsInfoType.hashCode());
        }

        public final String toString() {
            return "BitcoinStackingToolsInfoItem(icon=" + this.icon + ", title=" + this.title + ", subtitle=" + this.subtitle + ", itemType=" + this.itemType + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BitcoinStackingToolsInfoType {
        public static final /* synthetic */ BitcoinStackingToolsInfoType[] $VALUES;
        public static final BitcoinStackingToolsInfoType AUTO_INVEST;
        public static final BitcoinStackingToolsInfoType LEARN_MORE;
        public static final BitcoinStackingToolsInfoType PAID_IN_BITCOIN;
        public static final BitcoinStackingToolsInfoType RECEIVE_P2P_AS_BITCOIN;
        public static final BitcoinStackingToolsInfoType ROUND_UPS;

        static {
            BitcoinStackingToolsInfoType bitcoinStackingToolsInfoType = new BitcoinStackingToolsInfoType("ROUND_UPS", 0);
            ROUND_UPS = bitcoinStackingToolsInfoType;
            BitcoinStackingToolsInfoType bitcoinStackingToolsInfoType2 = new BitcoinStackingToolsInfoType("AUTO_INVEST", 1);
            AUTO_INVEST = bitcoinStackingToolsInfoType2;
            BitcoinStackingToolsInfoType bitcoinStackingToolsInfoType3 = new BitcoinStackingToolsInfoType("PAID_IN_BITCOIN", 2);
            PAID_IN_BITCOIN = bitcoinStackingToolsInfoType3;
            BitcoinStackingToolsInfoType bitcoinStackingToolsInfoType4 = new BitcoinStackingToolsInfoType("LEARN_MORE", 3);
            LEARN_MORE = bitcoinStackingToolsInfoType4;
            BitcoinStackingToolsInfoType bitcoinStackingToolsInfoType5 = new BitcoinStackingToolsInfoType("RECEIVE_P2P_AS_BITCOIN", 4);
            RECEIVE_P2P_AS_BITCOIN = bitcoinStackingToolsInfoType5;
            $VALUES = new BitcoinStackingToolsInfoType[]{bitcoinStackingToolsInfoType, bitcoinStackingToolsInfoType2, bitcoinStackingToolsInfoType3, bitcoinStackingToolsInfoType4, bitcoinStackingToolsInfoType5};
        }

        public static BitcoinStackingToolsInfoType valueOf(String str) {
            return (BitcoinStackingToolsInfoType) Enum.valueOf(BitcoinStackingToolsInfoType.class, str);
        }

        public static BitcoinStackingToolsInfoType[] values() {
            return (BitcoinStackingToolsInfoType[]) $VALUES.clone();
        }
    }

    public BitcoinStackingToolsInfoViewModel(boolean z, List list, String str, String str2, BitcoinStackingToolsInfoType bitcoinStackingToolsInfoType, String str3) {
        list.getClass();
        str.getClass();
        this.useBackArrow = z;
        this.items = list;
        this.title = str;
        this.subtitle = str2;
        this.f1057type = bitcoinStackingToolsInfoType;
        this.buttonText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinStackingToolsInfoViewModel)) {
            return false;
        }
        BitcoinStackingToolsInfoViewModel bitcoinStackingToolsInfoViewModel = (BitcoinStackingToolsInfoViewModel) obj;
        return this.useBackArrow == bitcoinStackingToolsInfoViewModel.useBackArrow && Intrinsics.areEqual(this.items, bitcoinStackingToolsInfoViewModel.items) && Intrinsics.areEqual(this.title, bitcoinStackingToolsInfoViewModel.title) && Intrinsics.areEqual(this.subtitle, bitcoinStackingToolsInfoViewModel.subtitle) && this.f1057type == bitcoinStackingToolsInfoViewModel.f1057type && Intrinsics.areEqual(this.buttonText, bitcoinStackingToolsInfoViewModel.buttonText);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Boolean.hashCode(this.useBackArrow) * 31, 31, this.items), 31, this.title);
        String str = this.subtitle;
        int hashCode = (this.f1057type.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.buttonText;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitcoinStackingToolsInfoViewModel(useBackArrow=");
        sb.append(this.useBackArrow);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", title=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", subtitle=", this.subtitle, ", type=");
        sb.append(this.f1057type);
        sb.append(", buttonText=");
        sb.append(this.buttonText);
        sb.append(")");
        return sb.toString();
    }
}
