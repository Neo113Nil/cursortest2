package com.squareup.cash.bitcoin.viewmodels.paidinbitcoin;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class PaidInBitcoinCardUpsellViewModel {
    public final String body;
    public final String buttonText;
    public final String header;
    public final List subItems;

    public final class SubItem {
        public final String body;
        public final int iconRes;
        public final String title;

        public SubItem(String str, String str2, int i) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.body = str2;
            this.iconRes = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubItem)) {
                return false;
            }
            SubItem subItem = (SubItem) obj;
            return Intrinsics.areEqual(this.title, subItem.title) && Intrinsics.areEqual(this.body, subItem.body) && this.iconRes == subItem.iconRes;
        }

        public final int hashCode() {
            return Integer.hashCode(this.iconRes) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.iconRes, ")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SubItem(title=", this.title, ", body=", this.body, ", iconRes="));
        }
    }

    public PaidInBitcoinCardUpsellViewModel(String str, String str2, String str3, List list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        this.header = str;
        this.body = str2;
        this.subItems = list;
        this.buttonText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidInBitcoinCardUpsellViewModel)) {
            return false;
        }
        PaidInBitcoinCardUpsellViewModel paidInBitcoinCardUpsellViewModel = (PaidInBitcoinCardUpsellViewModel) obj;
        return Intrinsics.areEqual(this.header, paidInBitcoinCardUpsellViewModel.header) && Intrinsics.areEqual(this.body, paidInBitcoinCardUpsellViewModel.body) && Intrinsics.areEqual(this.subItems, paidInBitcoinCardUpsellViewModel.subItems) && Intrinsics.areEqual(this.buttonText, paidInBitcoinCardUpsellViewModel.buttonText);
    }

    public final int hashCode() {
        return this.buttonText.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.header.hashCode() * 31, 31, this.body), 31, this.subItems);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaidInBitcoinCardUpsellViewModel(header=", this.header, ", body=", this.body, ", subItems=");
        m.append(this.subItems);
        m.append(", buttonText=");
        m.append(this.buttonText);
        m.append(")");
        return m.toString();
    }
}
