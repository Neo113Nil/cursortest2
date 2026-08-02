package com.squareup.cash.investingcrypto.viewmodels.common;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.recurring.db.RecurringPreferenceId;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes6.dex */
public final class InvestingCryptoRecurringPurchaseTileViewModel {
    public final List items;
    public final String title;

    public final class Item {
        public final ColorModel accentColor;
        public final String amount;
        public final String frequency;
        public final LinkScanner icon;
        public final String preferenceId;
        public final String timestamp;

        public Item(String str, LinkScanner linkScanner, String str2, String str3, String str4, ColorModel colorModel) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str4);
            this.preferenceId = str;
            this.icon = linkScanner;
            this.frequency = str2;
            this.timestamp = str3;
            this.amount = str4;
            this.accentColor = colorModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.areEqual(this.preferenceId, item.preferenceId) && Intrinsics.areEqual(this.icon, item.icon) && Intrinsics.areEqual(this.frequency, item.frequency) && this.timestamp.equals(item.timestamp) && Intrinsics.areEqual(this.amount, item.amount) && this.accentColor.equals(item.accentColor);
        }

        public final int hashCode() {
            int hashCode = this.preferenceId.hashCode() * 31;
            LinkScanner linkScanner = this.icon;
            return this.accentColor.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (linkScanner == null ? 0 : linkScanner.hashCode())) * 31, 31, this.frequency), 31, this.timestamp), 31, this.amount);
        }

        public final String toString() {
            String m3732toStringimpl = RecurringPreferenceId.m3732toStringimpl(this.preferenceId);
            StringBuilder sb = new StringBuilder("Item(preferenceId=");
            sb.append(m3732toStringimpl);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", frequency=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.frequency, ", timestamp=", this.timestamp, ", amount=");
            sb.append(this.amount);
            sb.append(", accentColor=");
            sb.append(this.accentColor);
            sb.append(")");
            return sb.toString();
        }
    }

    public InvestingCryptoRecurringPurchaseTileViewModel(String str, Item item) {
        str.getClass();
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(item);
        listOf.getClass();
        this.title = str;
        this.items = listOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingCryptoRecurringPurchaseTileViewModel)) {
            return false;
        }
        InvestingCryptoRecurringPurchaseTileViewModel investingCryptoRecurringPurchaseTileViewModel = (InvestingCryptoRecurringPurchaseTileViewModel) obj;
        return Intrinsics.areEqual(this.title, investingCryptoRecurringPurchaseTileViewModel.title) && Intrinsics.areEqual(this.items, investingCryptoRecurringPurchaseTileViewModel.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("InvestingCryptoRecurringPurchaseTileViewModel(title=", this.title, ", items=", ")", this.items);
    }
}
