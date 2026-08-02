package com.squareup.cash.bitcoin.viewmodels.applet.onramp;

import com.squareup.cash.arcade.Icons;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinOnRampOptionViewModel {
    public final String accessoryLabel;
    public final Icons icon;
    public final String subtitle;
    public final String title;

    /* renamed from: type, reason: collision with root package name */
    public final BitcoinOnRampOptionType f1053type;

    public BitcoinOnRampOptionViewModel(Icons icons, String str, String str2, BitcoinOnRampOptionType bitcoinOnRampOptionType, String str3) {
        str.getClass();
        str2.getClass();
        this.icon = icons;
        this.title = str;
        this.subtitle = str2;
        this.f1053type = bitcoinOnRampOptionType;
        this.accessoryLabel = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinOnRampOptionViewModel)) {
            return false;
        }
        BitcoinOnRampOptionViewModel bitcoinOnRampOptionViewModel = (BitcoinOnRampOptionViewModel) obj;
        return this.icon == bitcoinOnRampOptionViewModel.icon && Intrinsics.areEqual(this.title, bitcoinOnRampOptionViewModel.title) && Intrinsics.areEqual(this.subtitle, bitcoinOnRampOptionViewModel.subtitle) && this.f1053type == bitcoinOnRampOptionViewModel.f1053type && Intrinsics.areEqual(this.accessoryLabel, bitcoinOnRampOptionViewModel.accessoryLabel);
    }

    public final int hashCode() {
        int hashCode = (this.f1053type.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.title), 31, this.subtitle)) * 31;
        String str = this.accessoryLabel;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitcoinOnRampOptionViewModel(icon=");
        sb.append(this.icon);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", type=");
        sb.append(this.f1053type);
        sb.append(", accessoryLabel=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.accessoryLabel, ")");
    }
}
