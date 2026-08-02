package com.squareup.cash.bitcoin.viewmodels.map;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinLocationViewModel {
    public final String address;
    public final String description;
    public final boolean descriptionInitiallyExpanded;
    public final String iconUrl;
    public final boolean isSquareSeller;
    public final double latitude;
    public final double longitude;
    public final String name;
    public final EnumSet paymentMethods;
    public final boolean showPayButton;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PaymentMethod {
        public static final /* synthetic */ PaymentMethod[] $VALUES;
        public static final PaymentMethod LIGHTNING;

        static {
            PaymentMethod paymentMethod = new PaymentMethod("LIGHTNING", 0);
            LIGHTNING = paymentMethod;
            $VALUES = new PaymentMethod[]{paymentMethod};
        }

        public static PaymentMethod valueOf(String str) {
            return (PaymentMethod) Enum.valueOf(PaymentMethod.class, str);
        }

        public static PaymentMethod[] values() {
            return (PaymentMethod[]) $VALUES.clone();
        }
    }

    public BitcoinLocationViewModel(double d, double d2, String str, String str2, EnumSet enumSet, boolean z, String str3, String str4, boolean z2, boolean z3) {
        str2.getClass();
        enumSet.getClass();
        this.latitude = d;
        this.longitude = d2;
        this.address = str;
        this.name = str2;
        this.paymentMethods = enumSet;
        this.isSquareSeller = z;
        this.iconUrl = str3;
        this.description = str4;
        this.showPayButton = z2;
        this.descriptionInitiallyExpanded = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinLocationViewModel)) {
            return false;
        }
        BitcoinLocationViewModel bitcoinLocationViewModel = (BitcoinLocationViewModel) obj;
        return Double.compare(this.latitude, bitcoinLocationViewModel.latitude) == 0 && Double.compare(this.longitude, bitcoinLocationViewModel.longitude) == 0 && Intrinsics.areEqual(this.address, bitcoinLocationViewModel.address) && Intrinsics.areEqual(this.name, bitcoinLocationViewModel.name) && Intrinsics.areEqual(this.paymentMethods, bitcoinLocationViewModel.paymentMethods) && this.isSquareSeller == bitcoinLocationViewModel.isSquareSeller && Intrinsics.areEqual(this.iconUrl, bitcoinLocationViewModel.iconUrl) && Intrinsics.areEqual(this.description, bitcoinLocationViewModel.description) && this.showPayButton == bitcoinLocationViewModel.showPayButton && this.descriptionInitiallyExpanded == bitcoinLocationViewModel.descriptionInitiallyExpanded;
    }

    public final int hashCode() {
        int m = Fragment$5$$ExternalSyntheticOutline0.m(this.longitude, Double.hashCode(this.latitude) * 31, 31);
        String str = this.address;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.paymentMethods.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.name)) * 31, 31, this.isSquareSeller);
        String str2 = this.iconUrl;
        int hashCode = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        return Boolean.hashCode(this.descriptionInitiallyExpanded) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.showPayButton);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("BitcoinLocationViewModel(latitude=", ", longitude=", this.latitude);
        m.append(this.longitude);
        m.append(", address=");
        m.append(this.address);
        m.append(", name=");
        m.append(this.name);
        m.append(", paymentMethods=");
        m.append(this.paymentMethods);
        m.append(", isSquareSeller=");
        m.append(this.isSquareSeller);
        m.append(", iconUrl=");
        m.append(this.iconUrl);
        m.append(", description=");
        m.append(this.description);
        m.append(", showPayButton=");
        m.append(this.showPayButton);
        m.append(", descriptionInitiallyExpanded=");
        m.append(this.descriptionInitiallyExpanded);
        m.append(")");
        return m.toString();
    }
}
