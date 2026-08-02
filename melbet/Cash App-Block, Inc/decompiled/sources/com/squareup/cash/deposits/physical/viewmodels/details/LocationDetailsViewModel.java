package com.squareup.cash.deposits.physical.viewmodels.details;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public class LocationDetailsViewModel {
    public final String address;
    public final String avatarUrl;
    public final FeeViewModel feeViewModel;
    public final String locationDescription;
    public final String primaryButtonText;
    public final String secondaryButtonText;
    public final String title;

    public final class DepositMethod {
        public final String body;
        public final boolean enabled;
        public final LocationDetailsIcon icon;
        public final String title;

        public DepositMethod(boolean z, LocationDetailsIcon locationDetailsIcon, String str, String str2) {
            str.getClass();
            str2.getClass();
            this.enabled = z;
            this.icon = locationDetailsIcon;
            this.title = str;
            this.body = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DepositMethod)) {
                return false;
            }
            DepositMethod depositMethod = (DepositMethod) obj;
            return this.enabled == depositMethod.enabled && this.icon == depositMethod.icon && Intrinsics.areEqual(this.title, depositMethod.title) && Intrinsics.areEqual(this.body, depositMethod.body);
        }

        public final int hashCode() {
            return this.body.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.icon.hashCode() + (Boolean.hashCode(this.enabled) * 31)) * 31, 31, this.title);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DepositMethod(enabled=");
            sb.append(this.enabled);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", title=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.title, ", body=", this.body, ")");
        }
    }

    public final class FeeViewModel {
        public final String body;
        public final LocationDetailsIcon icon;
        public final String subtitle;
        public final String title;

        public FeeViewModel(LocationDetailsIcon locationDetailsIcon, String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.icon = locationDetailsIcon;
            this.title = str;
            this.body = str2;
            this.subtitle = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeeViewModel)) {
                return false;
            }
            FeeViewModel feeViewModel = (FeeViewModel) obj;
            return this.icon == feeViewModel.icon && Intrinsics.areEqual(this.title, feeViewModel.title) && Intrinsics.areEqual(this.body, feeViewModel.body) && Intrinsics.areEqual(this.subtitle, feeViewModel.subtitle);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.title), 31, this.body);
            String str = this.subtitle;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FeeViewModel(icon=");
            sb.append(this.icon);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", body=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.body, ", subtitle=", this.subtitle, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LocationDetailsIcon {
        public static final /* synthetic */ LocationDetailsIcon[] $VALUES;
        public static final LocationDetailsIcon Barcode;
        public static final LocationDetailsIcon Card;
        public static final LocationDetailsIcon Currency;
        public static final LocationDetailsIcon Zero;

        static {
            LocationDetailsIcon locationDetailsIcon = new LocationDetailsIcon("Currency", 0);
            Currency = locationDetailsIcon;
            LocationDetailsIcon locationDetailsIcon2 = new LocationDetailsIcon("Zero", 1);
            Zero = locationDetailsIcon2;
            LocationDetailsIcon locationDetailsIcon3 = new LocationDetailsIcon("Barcode", 2);
            Barcode = locationDetailsIcon3;
            LocationDetailsIcon locationDetailsIcon4 = new LocationDetailsIcon("Card", 3);
            Card = locationDetailsIcon4;
            $VALUES = new LocationDetailsIcon[]{locationDetailsIcon, locationDetailsIcon2, locationDetailsIcon3, locationDetailsIcon4};
        }

        public static LocationDetailsIcon valueOf(String str) {
            return (LocationDetailsIcon) Enum.valueOf(LocationDetailsIcon.class, str);
        }

        public static LocationDetailsIcon[] values() {
            return (LocationDetailsIcon[]) $VALUES.clone();
        }
    }

    public final class PaperMoneyDepositMerchantViewModel extends LocationDetailsViewModel {
        public final Color accentColor;
        public final String address;
        public final String addressCopied;
        public final String avatarUrl;
        public final Color buttonTextColor;
        public final String copyAddressText;
        public final List depositMethods;
        public final FeeViewModel feeViewModel;
        public final String locationDescription;
        public final String primaryButtonText;
        public final String secondaryButtonText;
        public final String supportButtonText;
        public final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaperMoneyDepositMerchantViewModel(String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, FeeViewModel feeViewModel, String str8, String str9, Color color, Color color2) {
            super(str2, str3, str4, str5, str6, str7, feeViewModel);
            re$$ExternalSyntheticOutline0.m1432m(str4, str6, str7);
            this.addressCopied = str;
            this.depositMethods = list;
            this.avatarUrl = str2;
            this.address = str3;
            this.title = str4;
            this.locationDescription = str5;
            this.primaryButtonText = str6;
            this.secondaryButtonText = str7;
            this.feeViewModel = feeViewModel;
            this.copyAddressText = str8;
            this.supportButtonText = str9;
            this.accentColor = color;
            this.buttonTextColor = color2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaperMoneyDepositMerchantViewModel)) {
                return false;
            }
            PaperMoneyDepositMerchantViewModel paperMoneyDepositMerchantViewModel = (PaperMoneyDepositMerchantViewModel) obj;
            return Intrinsics.areEqual(this.addressCopied, paperMoneyDepositMerchantViewModel.addressCopied) && Intrinsics.areEqual(this.depositMethods, paperMoneyDepositMerchantViewModel.depositMethods) && Intrinsics.areEqual(this.avatarUrl, paperMoneyDepositMerchantViewModel.avatarUrl) && Intrinsics.areEqual(this.address, paperMoneyDepositMerchantViewModel.address) && Intrinsics.areEqual(this.title, paperMoneyDepositMerchantViewModel.title) && Intrinsics.areEqual(this.locationDescription, paperMoneyDepositMerchantViewModel.locationDescription) && Intrinsics.areEqual(this.primaryButtonText, paperMoneyDepositMerchantViewModel.primaryButtonText) && Intrinsics.areEqual(this.secondaryButtonText, paperMoneyDepositMerchantViewModel.secondaryButtonText) && Intrinsics.areEqual(this.feeViewModel, paperMoneyDepositMerchantViewModel.feeViewModel) && Intrinsics.areEqual(this.copyAddressText, paperMoneyDepositMerchantViewModel.copyAddressText) && Intrinsics.areEqual(this.supportButtonText, paperMoneyDepositMerchantViewModel.supportButtonText) && Intrinsics.areEqual(this.accentColor, paperMoneyDepositMerchantViewModel.accentColor) && Intrinsics.areEqual(this.buttonTextColor, paperMoneyDepositMerchantViewModel.buttonTextColor);
        }

        @Override // com.squareup.cash.deposits.physical.viewmodels.details.LocationDetailsViewModel
        public final String getAddress() {
            return this.address;
        }

        @Override // com.squareup.cash.deposits.physical.viewmodels.details.LocationDetailsViewModel
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        @Override // com.squareup.cash.deposits.physical.viewmodels.details.LocationDetailsViewModel
        public final FeeViewModel getFeeViewModel() {
            return this.feeViewModel;
        }

        @Override // com.squareup.cash.deposits.physical.viewmodels.details.LocationDetailsViewModel
        public final String getLocationDescription() {
            return this.locationDescription;
        }

        @Override // com.squareup.cash.deposits.physical.viewmodels.details.LocationDetailsViewModel
        public final String getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        @Override // com.squareup.cash.deposits.physical.viewmodels.details.LocationDetailsViewModel
        public final String getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        @Override // com.squareup.cash.deposits.physical.viewmodels.details.LocationDetailsViewModel
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.addressCopied;
            int m = Recorder$$ExternalSyntheticOutline2.m((str == null ? 0 : str.hashCode()) * 31, 31, this.depositMethods);
            String str2 = this.avatarUrl;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.address), 31, this.title);
            String str3 = this.locationDescription;
            int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.primaryButtonText), 31, this.secondaryButtonText);
            FeeViewModel feeViewModel = this.feeViewModel;
            int hashCode = (m3 + (feeViewModel == null ? 0 : feeViewModel.hashCode())) * 31;
            String str4 = this.copyAddressText;
            int hashCode2 = (hashCode + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.supportButtonText;
            int hashCode3 = (hashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Color color = this.accentColor;
            int hashCode4 = (hashCode3 + (color == null ? 0 : color.hashCode())) * 31;
            Color color2 = this.buttonTextColor;
            return hashCode4 + (color2 != null ? color2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("PaperMoneyDepositMerchantViewModel(addressCopied=", this.addressCopied, ", depositMethods=", ", avatarUrl=", this.depositMethods);
            Boxes$$ExternalSyntheticOutline1.m(m, this.avatarUrl, ", address=", this.address, ", title=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.title, ", locationDescription=", this.locationDescription, ", primaryButtonText=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.primaryButtonText, ", secondaryButtonText=", this.secondaryButtonText, ", feeViewModel=");
            m.append(this.feeViewModel);
            m.append(", copyAddressText=");
            m.append(this.copyAddressText);
            m.append(", supportButtonText=");
            m.append(this.supportButtonText);
            m.append(", accentColor=");
            m.append(this.accentColor);
            m.append(", buttonTextColor=");
            m.append(this.buttonTextColor);
            m.append(")");
            return m.toString();
        }
    }

    public LocationDetailsViewModel(String str, String str2, String str3, String str4, String str5, String str6, FeeViewModel feeViewModel) {
        re$$ExternalSyntheticOutline0.m1432m(str3, str5, str6);
        this.avatarUrl = str;
        this.address = str2;
        this.title = str3;
        this.locationDescription = str4;
        this.primaryButtonText = str5;
        this.secondaryButtonText = str6;
        this.feeViewModel = feeViewModel;
    }

    public String getAddress() {
        return this.address;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public FeeViewModel getFeeViewModel() {
        return this.feeViewModel;
    }

    public String getLocationDescription() {
        return this.locationDescription;
    }

    public String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    public String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    public String getTitle() {
        return this.title;
    }
}
