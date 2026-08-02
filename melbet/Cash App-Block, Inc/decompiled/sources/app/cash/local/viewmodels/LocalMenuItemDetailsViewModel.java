package app.cash.local.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.MenuHours;
import app.cash.local.primitives.MenuItemModifierListToken;
import app.cash.local.primitives.MenuItemPreorderingSummary;
import app.cash.local.viewmodels.InputError;
import app.cash.local.viewmodels.internal.CanWorkAsync;
import app.cash.local.viewmodels.toasts.ToastData;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalMenuItemDetailsViewModel implements CanWorkAsync {
    public final MenuItemAvailability availability;
    public final Integer calories;
    public final LocalBottomModalViewModel checkoutModal;
    public final String comboName;
    public final String descriptionText;
    public final List dietaryPreferences;
    public final List discountSummaries;
    public final LocalImage image;
    public final List ingredients;
    public final List itemModifiers;
    public final String itemName;
    public final MenuHours menuHours;
    public final MenuItemPreorderingSummary preorderingSummary;
    public final ToastData showToastData;

    public interface ItemModifier {

        public final class FreeTextEntry implements ItemModifier {
            public final InputError.TextTooLong inputError;
            public final boolean isRequired;
            public final int maxLength;
            public final String title;
            public final String token;
            public final String value;
            public final boolean warn;

            public FreeTextEntry(String str, String str2, int i, InputError.TextTooLong textTooLong, boolean z, boolean z2, String str3) {
                str.getClass();
                str2.getClass();
                this.token = str;
                this.title = str2;
                this.maxLength = i;
                this.inputError = textTooLong;
                this.isRequired = z;
                this.warn = z2;
                this.value = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FreeTextEntry)) {
                    return false;
                }
                FreeTextEntry freeTextEntry = (FreeTextEntry) obj;
                return Intrinsics.areEqual(this.token, freeTextEntry.token) && Intrinsics.areEqual(this.title, freeTextEntry.title) && this.maxLength == freeTextEntry.maxLength && Intrinsics.areEqual(this.inputError, freeTextEntry.inputError) && this.isRequired == freeTextEntry.isRequired && this.warn == freeTextEntry.warn && this.value.equals(freeTextEntry.value);
            }

            @Override // app.cash.local.viewmodels.LocalMenuItemDetailsViewModel.ItemModifier
            public final String getSubtitle() {
                return null;
            }

            @Override // app.cash.local.viewmodels.LocalMenuItemDetailsViewModel.ItemModifier
            public final String getTitle() {
                return this.title;
            }

            @Override // app.cash.local.viewmodels.LocalMenuItemDetailsViewModel.ItemModifier
            /* renamed from: getToken-Qpp493U */
            public final String mo1295getTokenQpp493U() {
                return this.token;
            }

            @Override // app.cash.local.viewmodels.LocalMenuItemDetailsViewModel.ItemModifier
            public final boolean getWarn() {
                return this.warn;
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxLength, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 961, this.title), 31);
                InputError.TextTooLong textTooLong = this.inputError;
                return this.value.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (textTooLong == null ? 0 : Integer.hashCode(textTooLong.maxLength))) * 31, 31, this.isRequired), 31, this.warn);
            }

            @Override // app.cash.local.viewmodels.LocalMenuItemDetailsViewModel.ItemModifier
            public final boolean isRequired() {
                return this.isRequired;
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FreeTextEntry(token=", MenuItemModifierListToken.m1260toStringimpl(this.token), ", title=", this.title, ", subtitle=null, maxLength=");
                m.append(this.maxLength);
                m.append(", inputError=");
                m.append(this.inputError);
                m.append(", isRequired=");
                re$$ExternalSyntheticOutline0.m(m, this.isRequired, ", warn=", this.warn, ", value=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.value, ")");
            }
        }

        public final class SelectFromList implements ItemModifier {
            public final boolean isRequired;
            public final ArrayList options;
            public final String subtitle;
            public final String title;
            public final String token;
            public final boolean warn;

            public final class Option {
                public final MenuItemAvailability availability;
                public final boolean enabled;
                public final boolean selected;
                public final String title;
                public final String token;

                /* renamed from: type, reason: collision with root package name */
                public final Type f921type;

                public interface Type {

                    public final class CheckBox implements Type {
                        public static final CheckBox INSTANCE = new CheckBox();

                        public final boolean equals(Object obj) {
                            return this == obj || (obj instanceof CheckBox);
                        }

                        public final int hashCode() {
                            return -1250128319;
                        }

                        public final String toString() {
                            return "CheckBox";
                        }
                    }

                    public final class Quantity implements Type {
                        public final int current;
                        public final int max;

                        public Quantity(int i, int i2) {
                            this.current = i;
                            this.max = i2;
                            if (i < 0) {
                                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                                throw null;
                            }
                            if (i2 < 0) {
                                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                                throw null;
                            }
                            if (i <= i2) {
                                return;
                            }
                            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                            throw null;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Quantity)) {
                                return false;
                            }
                            Quantity quantity = (Quantity) obj;
                            return this.current == quantity.current && this.max == quantity.max;
                        }

                        public final int hashCode() {
                            return Integer.hashCode(this.max) + (Integer.hashCode(this.current) * 31);
                        }

                        public final String toString() {
                            return Recorder$$ExternalSyntheticOutline2.m(this.current, this.max, "Quantity(current=", ", max=", ")");
                        }
                    }

                    public final class Radio implements Type {
                        public static final Radio INSTANCE = new Radio();

                        public final boolean equals(Object obj) {
                            return this == obj || (obj instanceof Radio);
                        }

                        public final int hashCode() {
                            return 1420123677;
                        }

                        public final String toString() {
                            return "Radio";
                        }
                    }
                }

                public Option(String str, String str2, MenuItemAvailability menuItemAvailability, boolean z, Type type2, boolean z2) {
                    str.getClass();
                    str2.getClass();
                    this.title = str;
                    this.token = str2;
                    this.availability = menuItemAvailability;
                    this.selected = z;
                    this.f921type = type2;
                    this.enabled = z2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Option)) {
                        return false;
                    }
                    Option option = (Option) obj;
                    return Intrinsics.areEqual(this.title, option.title) && Intrinsics.areEqual(this.token, option.token) && this.availability.equals(option.availability) && this.selected == option.selected && this.f921type.equals(option.f921type) && this.enabled == option.enabled;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.enabled) + ((this.f921type.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.availability.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.token)) * 31, 31, this.selected)) * 31);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Option(title=", this.title, ", token=", this.token, ", availability=");
                    m.append(this.availability);
                    m.append(", selected=");
                    m.append(this.selected);
                    m.append(", type=");
                    m.append(this.f921type);
                    m.append(", enabled=");
                    m.append(this.enabled);
                    m.append(")");
                    return m.toString();
                }
            }

            public SelectFromList(String str, String str2, String str3, ArrayList arrayList, boolean z, boolean z2) {
                str.getClass();
                str2.getClass();
                this.token = str;
                this.title = str2;
                this.subtitle = str3;
                this.options = arrayList;
                this.isRequired = z;
                this.warn = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SelectFromList)) {
                    return false;
                }
                SelectFromList selectFromList = (SelectFromList) obj;
                return Intrinsics.areEqual(this.token, selectFromList.token) && Intrinsics.areEqual(this.title, selectFromList.title) && Intrinsics.areEqual(this.subtitle, selectFromList.subtitle) && this.options.equals(selectFromList.options) && this.isRequired == selectFromList.isRequired && this.warn == selectFromList.warn;
            }

            @Override // app.cash.local.viewmodels.LocalMenuItemDetailsViewModel.ItemModifier
            public final String getSubtitle() {
                return this.subtitle;
            }

            @Override // app.cash.local.viewmodels.LocalMenuItemDetailsViewModel.ItemModifier
            public final String getTitle() {
                return this.title;
            }

            @Override // app.cash.local.viewmodels.LocalMenuItemDetailsViewModel.ItemModifier
            /* renamed from: getToken-Qpp493U */
            public final String mo1295getTokenQpp493U() {
                return this.token;
            }

            @Override // app.cash.local.viewmodels.LocalMenuItemDetailsViewModel.ItemModifier
            public final boolean getWarn() {
                return this.warn;
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.title);
                String str = this.subtitle;
                return Boolean.hashCode(this.warn) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.options, (m + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.isRequired);
            }

            @Override // app.cash.local.viewmodels.LocalMenuItemDetailsViewModel.ItemModifier
            public final boolean isRequired() {
                return this.isRequired;
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelectFromList(token=", MenuItemModifierListToken.m1260toStringimpl(this.token), ", title=", this.title, ", subtitle=");
                m.append(this.subtitle);
                m.append(", options=");
                m.append(this.options);
                m.append(", isRequired=");
                return Request$Priority$EnumUnboxingLocalUtility.m(m, this.isRequired, ", warn=", this.warn, ")");
            }
        }

        String getSubtitle();

        String getTitle();

        /* renamed from: getToken-Qpp493U, reason: not valid java name */
        String mo1295getTokenQpp493U();

        boolean getWarn();

        boolean isRequired();
    }

    public LocalMenuItemDetailsViewModel(LocalImage localImage, String str, String str2, MenuItemAvailability menuItemAvailability, Integer num, List list, MenuItemPreorderingSummary menuItemPreorderingSummary, MenuHours menuHours, String str3, List list2, List list3, List list4, LocalBottomModalViewModel localBottomModalViewModel, ToastData toastData) {
        str2.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        localBottomModalViewModel.getClass();
        this.image = localImage;
        this.comboName = str;
        this.itemName = str2;
        this.availability = menuItemAvailability;
        this.calories = num;
        this.discountSummaries = list;
        this.preorderingSummary = menuItemPreorderingSummary;
        this.menuHours = menuHours;
        this.descriptionText = str3;
        this.dietaryPreferences = list2;
        this.ingredients = list3;
        this.itemModifiers = list4;
        this.checkoutModal = localBottomModalViewModel;
        this.showToastData = toastData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalMenuItemDetailsViewModel)) {
            return false;
        }
        LocalMenuItemDetailsViewModel localMenuItemDetailsViewModel = (LocalMenuItemDetailsViewModel) obj;
        return Intrinsics.areEqual(this.image, localMenuItemDetailsViewModel.image) && Intrinsics.areEqual(this.comboName, localMenuItemDetailsViewModel.comboName) && Intrinsics.areEqual(this.itemName, localMenuItemDetailsViewModel.itemName) && Intrinsics.areEqual(this.availability, localMenuItemDetailsViewModel.availability) && Intrinsics.areEqual(this.calories, localMenuItemDetailsViewModel.calories) && Intrinsics.areEqual(this.discountSummaries, localMenuItemDetailsViewModel.discountSummaries) && Intrinsics.areEqual(this.preorderingSummary, localMenuItemDetailsViewModel.preorderingSummary) && Intrinsics.areEqual(this.menuHours, localMenuItemDetailsViewModel.menuHours) && Intrinsics.areEqual(this.descriptionText, localMenuItemDetailsViewModel.descriptionText) && Intrinsics.areEqual(this.dietaryPreferences, localMenuItemDetailsViewModel.dietaryPreferences) && Intrinsics.areEqual(this.ingredients, localMenuItemDetailsViewModel.ingredients) && Intrinsics.areEqual(this.itemModifiers, localMenuItemDetailsViewModel.itemModifiers) && Intrinsics.areEqual(this.checkoutModal, localMenuItemDetailsViewModel.checkoutModal) && Intrinsics.areEqual(this.showToastData, localMenuItemDetailsViewModel.showToastData);
    }

    public final int hashCode() {
        LocalImage localImage = this.image;
        int hashCode = (localImage == null ? 0 : localImage.hashCode()) * 31;
        String str = this.comboName;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.itemName);
        MenuItemAvailability menuItemAvailability = this.availability;
        int hashCode2 = (m + (menuItemAvailability == null ? 0 : menuItemAvailability.hashCode())) * 31;
        Integer num = this.calories;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.discountSummaries);
        MenuItemPreorderingSummary menuItemPreorderingSummary = this.preorderingSummary;
        int hashCode3 = (m2 + (menuItemPreorderingSummary == null ? 0 : menuItemPreorderingSummary.hashCode())) * 31;
        MenuHours menuHours = this.menuHours;
        int hashCode4 = (hashCode3 + (menuHours == null ? 0 : menuHours.hashCode())) * 31;
        String str2 = this.descriptionText;
        int hashCode5 = (this.checkoutModal.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.dietaryPreferences), 31, this.ingredients), 31, this.itemModifiers)) * 31;
        ToastData toastData = this.showToastData;
        return hashCode5 + (toastData != null ? toastData.hashCode() : 0);
    }

    @Override // app.cash.local.viewmodels.internal.CanWorkAsync
    public final boolean isWorkingAsync() {
        return this.checkoutModal.isLoading;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalMenuItemDetailsViewModel(image=");
        sb.append(this.image);
        sb.append(", comboName=");
        sb.append(this.comboName);
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
        NavAction$$ExternalSyntheticOutline0.m(this.descriptionText, ", dietaryPreferences=", ", ingredients=", sb, this.dietaryPreferences);
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.ingredients, ", itemModifiers=", this.itemModifiers, ", checkoutModal=");
        sb.append(this.checkoutModal);
        sb.append(", showToastData=");
        sb.append(this.showToastData);
        sb.append(")");
        return sb.toString();
    }
}
