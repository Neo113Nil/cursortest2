package app.cash.local.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.primitives.ComboSlotToken;
import app.cash.local.primitives.MenuHours;
import app.cash.local.primitives.MenuItemPreorderingSummary;
import app.cash.local.primitives.MenuItemToken;
import app.cash.local.primitives.MenuItemVariationToken;
import app.cash.local.viewmodels.internal.CanWorkAsync;
import app.cash.local.viewmodels.toasts.ToastData;
import app.cash.passcode.screens.EndAppLock;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalMenuComboDetailsViewModel implements CanWorkAsync {
    public final MenuItemAvailability availability;
    public final Integer calories;
    public final LocalBottomModalViewModel checkoutModal;
    public final List comboSlots;
    public final String descriptionText;
    public final List dietaryPreferences;
    public final List discountSummaries;
    public final LocalImage image;
    public final List ingredients;
    public final String itemName;
    public final MenuHours menuHours;
    public final MenuItemPreorderingSummary preorderingSummary;
    public final ToastData showToastData;

    public final class ComboSlot {
        public final String name;
        public final ArrayList options;
        public final int sectionIndex;
        public final String subtitleLeading;
        public final String subtitleTrailing;
        public final String token;
        public final ValidationStatus validationStatus;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class ValidationStatus {
            public static final /* synthetic */ ValidationStatus[] $VALUES;
            public static final ValidationStatus CustomizationRequired;
            public static final ValidationStatus MissingSelection;
            public static final ValidationStatus NotValidated;
            public static final ValidationStatus Validated;

            static {
                ValidationStatus validationStatus = new ValidationStatus("NotValidated", 0);
                NotValidated = validationStatus;
                ValidationStatus validationStatus2 = new ValidationStatus("CustomizationRequired", 1);
                CustomizationRequired = validationStatus2;
                ValidationStatus validationStatus3 = new ValidationStatus("MissingSelection", 2);
                MissingSelection = validationStatus3;
                ValidationStatus validationStatus4 = new ValidationStatus("Validated", 3);
                Validated = validationStatus4;
                $VALUES = new ValidationStatus[]{validationStatus, validationStatus2, validationStatus3, validationStatus4};
            }

            public static ValidationStatus valueOf(String str) {
                return (ValidationStatus) Enum.valueOf(ValidationStatus.class, str);
            }

            public static ValidationStatus[] values() {
                return (ValidationStatus[]) $VALUES.clone();
            }
        }

        public ComboSlot(int i, String str, String str2, String str3, String str4, ArrayList arrayList, ValidationStatus validationStatus) {
            Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
            this.sectionIndex = i;
            this.token = str;
            this.name = str2;
            this.subtitleLeading = str3;
            this.subtitleTrailing = str4;
            this.options = arrayList;
            this.validationStatus = validationStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ComboSlot)) {
                return false;
            }
            ComboSlot comboSlot = (ComboSlot) obj;
            return this.sectionIndex == comboSlot.sectionIndex && Intrinsics.areEqual(this.token, comboSlot.token) && Intrinsics.areEqual(this.name, comboSlot.name) && Intrinsics.areEqual(this.subtitleLeading, comboSlot.subtitleLeading) && Intrinsics.areEqual(this.subtitleTrailing, comboSlot.subtitleTrailing) && this.options.equals(comboSlot.options) && this.validationStatus == comboSlot.validationStatus;
        }

        public final int hashCode() {
            return this.validationStatus.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.options, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Integer.hashCode(this.sectionIndex) * 31, 31, this.token), 31, this.name), 31, this.subtitleLeading), 31, this.subtitleTrailing), 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ComboSlot(sectionIndex=", SectionIndex.m1294toStringimpl(this.sectionIndex), ", token=", ComboSlotToken.m1233toStringimpl(this.token), ", name=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.name, ", subtitleLeading=", this.subtitleLeading, ", subtitleTrailing=");
            m.append(this.subtitleTrailing);
            m.append(", options=");
            m.append(this.options);
            m.append(", validationStatus=");
            m.append(this.validationStatus);
            m.append(")");
            return m.toString();
        }
    }

    public final class ComboSlotOption {
        public final OptionAvailability availability;
        public final LocalImage image;
        public final String itemToken;
        public final String subtitle;
        public final String title;

        /* renamed from: type, reason: collision with root package name */
        public final OptionType f920type;
        public final String variationToken;

        public interface OptionAvailability {

            public final class Available implements OptionAvailability {
                public final String priceAdjustment;

                public Available(String str) {
                    this.priceAdjustment = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Available) && Intrinsics.areEqual(this.priceAdjustment, ((Available) obj).priceAdjustment);
                }

                public final int hashCode() {
                    String str = this.priceAdjustment;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Available(priceAdjustment=", this.priceAdjustment, ")");
                }
            }

            public final class SoldOut implements OptionAvailability {
                public static final SoldOut INSTANCE = new SoldOut();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof SoldOut);
                }

                public final int hashCode() {
                    return -1787609629;
                }

                public final String toString() {
                    return "SoldOut";
                }
            }
        }

        public interface OptionType {

            public final class Customize implements OptionType {
                public final boolean selected;

                public Customize(boolean z) {
                    this.selected = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Customize) && this.selected == ((Customize) obj).selected;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.selected);
                }

                public final String toString() {
                    return Fragment$5$$ExternalSyntheticOutline0.m("Customize(selected=", ")", this.selected);
                }
            }

            public final class Radio implements OptionType {
                public final boolean selected;

                public Radio(boolean z) {
                    this.selected = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Radio) && this.selected == ((Radio) obj).selected;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.selected);
                }

                public final String toString() {
                    return Fragment$5$$ExternalSyntheticOutline0.m("Radio(selected=", ")", this.selected);
                }
            }
        }

        public ComboSlotOption(String str, String str2, LocalImage localImage, String str3, String str4, OptionAvailability optionAvailability, OptionType optionType) {
            str.getClass();
            str3.getClass();
            this.itemToken = str;
            this.variationToken = str2;
            this.image = localImage;
            this.title = str3;
            this.subtitle = str4;
            this.availability = optionAvailability;
            this.f920type = optionType;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(Object obj) {
            boolean equals;
            if (this != obj) {
                if (obj instanceof ComboSlotOption) {
                    ComboSlotOption comboSlotOption = (ComboSlotOption) obj;
                    if (Intrinsics.areEqual(this.itemToken, comboSlotOption.itemToken)) {
                        String str = comboSlotOption.variationToken;
                        String str2 = this.variationToken;
                        if (str2 == null) {
                            if (str == null) {
                                equals = true;
                                if (equals && Intrinsics.areEqual(this.image, comboSlotOption.image) && Intrinsics.areEqual(this.title, comboSlotOption.title) && Intrinsics.areEqual(this.subtitle, comboSlotOption.subtitle) && this.availability.equals(comboSlotOption.availability) && this.f920type.equals(comboSlotOption.f920type)) {
                                }
                            }
                            equals = false;
                            if (equals) {
                            }
                        } else {
                            if (str != null) {
                                equals = str2.equals(str);
                                if (equals) {
                                }
                            }
                            equals = false;
                            if (equals) {
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode = this.itemToken.hashCode() * 31;
            String str = this.variationToken;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            LocalImage localImage = this.image;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (localImage == null ? 0 : localImage.hashCode())) * 31, 31, this.title);
            String str2 = this.subtitle;
            return this.f920type.hashCode() + ((this.availability.hashCode() + ((m + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            String m1264toStringimpl = MenuItemToken.m1264toStringimpl(this.itemToken);
            String str = this.variationToken;
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ComboSlotOption(itemToken=", m1264toStringimpl, ", variationToken=", str == null ? "null" : MenuItemVariationToken.m1265toStringimpl(str), ", image=");
            m.append(this.image);
            m.append(", title=");
            m.append(this.title);
            m.append(", subtitle=");
            m.append(this.subtitle);
            m.append(", availability=");
            m.append(this.availability);
            m.append(", type=");
            m.append(this.f920type);
            m.append(")");
            return m.toString();
        }
    }

    public final class SectionIndex implements Parcelable {
        public static final Parcelable.Creator<SectionIndex> CREATOR = new EndAppLock.Creator(18);
        public final int value;

        public /* synthetic */ SectionIndex(int i) {
            this.value = i;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1294toStringimpl(int i) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "SectionIndex(value=", ")");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof SectionIndex) {
                return this.value == ((SectionIndex) obj).value;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.value);
        }

        public final String toString() {
            return m1294toStringimpl(this.value);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.getClass();
            parcel.writeInt(this.value);
        }
    }

    public LocalMenuComboDetailsViewModel(LocalImage localImage, String str, MenuItemAvailability menuItemAvailability, Integer num, List list, MenuItemPreorderingSummary menuItemPreorderingSummary, MenuHours menuHours, String str2, List list2, List list3, List list4, LocalBottomModalViewModel localBottomModalViewModel, ToastData toastData) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        localBottomModalViewModel.getClass();
        this.image = localImage;
        this.itemName = str;
        this.availability = menuItemAvailability;
        this.calories = num;
        this.discountSummaries = list;
        this.preorderingSummary = menuItemPreorderingSummary;
        this.menuHours = menuHours;
        this.descriptionText = str2;
        this.dietaryPreferences = list2;
        this.ingredients = list3;
        this.comboSlots = list4;
        this.checkoutModal = localBottomModalViewModel;
        this.showToastData = toastData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalMenuComboDetailsViewModel)) {
            return false;
        }
        LocalMenuComboDetailsViewModel localMenuComboDetailsViewModel = (LocalMenuComboDetailsViewModel) obj;
        return Intrinsics.areEqual(this.image, localMenuComboDetailsViewModel.image) && Intrinsics.areEqual(this.itemName, localMenuComboDetailsViewModel.itemName) && this.availability.equals(localMenuComboDetailsViewModel.availability) && Intrinsics.areEqual(this.calories, localMenuComboDetailsViewModel.calories) && Intrinsics.areEqual(this.discountSummaries, localMenuComboDetailsViewModel.discountSummaries) && Intrinsics.areEqual(this.preorderingSummary, localMenuComboDetailsViewModel.preorderingSummary) && Intrinsics.areEqual(this.menuHours, localMenuComboDetailsViewModel.menuHours) && Intrinsics.areEqual(this.descriptionText, localMenuComboDetailsViewModel.descriptionText) && Intrinsics.areEqual(this.dietaryPreferences, localMenuComboDetailsViewModel.dietaryPreferences) && Intrinsics.areEqual(this.ingredients, localMenuComboDetailsViewModel.ingredients) && Intrinsics.areEqual(this.comboSlots, localMenuComboDetailsViewModel.comboSlots) && Intrinsics.areEqual(this.checkoutModal, localMenuComboDetailsViewModel.checkoutModal) && Intrinsics.areEqual(this.showToastData, localMenuComboDetailsViewModel.showToastData);
    }

    public final int hashCode() {
        LocalImage localImage = this.image;
        int hashCode = (this.availability.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((localImage == null ? 0 : localImage.hashCode()) * 31, 31, this.itemName)) * 31;
        Integer num = this.calories;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.discountSummaries);
        MenuItemPreorderingSummary menuItemPreorderingSummary = this.preorderingSummary;
        int hashCode2 = (m + (menuItemPreorderingSummary == null ? 0 : menuItemPreorderingSummary.hashCode())) * 31;
        MenuHours menuHours = this.menuHours;
        int hashCode3 = (hashCode2 + (menuHours == null ? 0 : menuHours.hashCode())) * 31;
        String str = this.descriptionText;
        int hashCode4 = (this.checkoutModal.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.dietaryPreferences), 31, this.ingredients), 31, this.comboSlots)) * 31;
        ToastData toastData = this.showToastData;
        return hashCode4 + (toastData != null ? toastData.hashCode() : 0);
    }

    @Override // app.cash.local.viewmodels.internal.CanWorkAsync
    public final boolean isWorkingAsync() {
        return this.checkoutModal.isLoading;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalMenuComboDetailsViewModel(image=");
        sb.append(this.image);
        sb.append(", itemName=");
        sb.append(this.itemName);
        sb.append(", availability=");
        sb.append(this.availability);
        sb.append(", calories=");
        sb.append(this.calories);
        sb.append(", discountSummaries=");
        sb.append(this.discountSummaries);
        sb.append(", preorderingSummary=");
        sb.append(this.preorderingSummary);
        sb.append(", menuHours=");
        sb.append(this.menuHours);
        sb.append(", descriptionText=");
        sb.append(this.descriptionText);
        sb.append(", dietaryPreferences=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.dietaryPreferences, ", ingredients=", this.ingredients, ", comboSlots=");
        sb.append(this.comboSlots);
        sb.append(", checkoutModal=");
        sb.append(this.checkoutModal);
        sb.append(", showToastData=");
        sb.append(this.showToastData);
        sb.append(")");
        return sb.toString();
    }
}
