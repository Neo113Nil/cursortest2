package app.cash.local.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.local.primitives.MenuCategoryToken;
import app.cash.local.primitives.MenuHours;
import app.cash.local.viewmodels.internal.CanWorkAsync;
import app.cash.local.viewmodels.internal.MenuSelectorOption;
import app.cash.local.viewmodels.toasts.ToastData;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalBrandLocationMenuViewModel implements CanWorkAsync {
    public final String defaultSelectedMenuCategory;
    public final boolean isLoading;
    public final boolean isSearching;
    public final List menuCategories;
    public final List menuOptions;
    public final LocalBottomModalViewModel modal;
    public final MenuSelectorOption selectedMenuOption;
    public final ToastData showToastData;

    public final class MenuCategory {
        public final List items;
        public final String label;
        public final MenuHours menuHours;
        public final boolean showUnavailable;
        public final String token;

        public final class MenuItem {
            public final MenuItemAvailability availability;
            public final CartItemCounterViewModel counterModel;
            public final String description;
            public final String discountText;
            public final LocalImage image;
            public final boolean isPreorder;
            public final String label;
            public final MenuHours menuHours;

            public MenuItem(LocalImage localImage, String str, MenuItemAvailability menuItemAvailability, String str2, boolean z, MenuHours menuHours, CartItemCounterViewModel cartItemCounterViewModel, String str3) {
                str.getClass();
                this.image = localImage;
                this.label = str;
                this.availability = menuItemAvailability;
                this.discountText = str2;
                this.isPreorder = z;
                this.menuHours = menuHours;
                this.counterModel = cartItemCounterViewModel;
                this.description = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MenuItem)) {
                    return false;
                }
                MenuItem menuItem = (MenuItem) obj;
                return Intrinsics.areEqual(this.image, menuItem.image) && Intrinsics.areEqual(this.label, menuItem.label) && this.availability.equals(menuItem.availability) && Intrinsics.areEqual(this.discountText, menuItem.discountText) && this.isPreorder == menuItem.isPreorder && Intrinsics.areEqual(this.menuHours, menuItem.menuHours) && this.counterModel.equals(menuItem.counterModel) && Intrinsics.areEqual(this.description, menuItem.description);
            }

            public final int hashCode() {
                LocalImage localImage = this.image;
                int hashCode = (this.availability.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((localImage == null ? 0 : localImage.hashCode()) * 31, 31, this.label)) * 31;
                String str = this.discountText;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isPreorder);
                MenuHours menuHours = this.menuHours;
                int hashCode2 = (this.counterModel.hashCode() + ((m + (menuHours == null ? 0 : menuHours.hashCode())) * 31)) * 31;
                String str2 = this.description;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return "MenuItem(image=" + this.image + ", label=" + this.label + ", availability=" + this.availability + ", discountText=" + this.discountText + ", isPreorder=" + this.isPreorder + ", menuHours=" + this.menuHours + ", counterModel=" + this.counterModel + ", description=" + this.description + ")";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Style {
            public static final /* synthetic */ Style[] $VALUES;
            public static final Style LIST;

            static {
                Style style = new Style("LIST", 0);
                LIST = style;
                $VALUES = new Style[]{style, new Style("CAROUSEL", 1)};
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) $VALUES.clone();
            }
        }

        public MenuCategory(String str, String str2, MenuHours menuHours, boolean z, List list) {
            Style style = Style.LIST;
            Request$Priority$EnumUnboxingLocalUtility.m(str, str2, list);
            this.token = str;
            this.label = str2;
            this.menuHours = menuHours;
            this.showUnavailable = z;
            this.items = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MenuCategory)) {
                return false;
            }
            MenuCategory menuCategory = (MenuCategory) obj;
            if (!Intrinsics.areEqual(this.token, menuCategory.token) || !Intrinsics.areEqual(this.label, menuCategory.label) || !Intrinsics.areEqual(this.menuHours, menuCategory.menuHours) || this.showUnavailable != menuCategory.showUnavailable || !Intrinsics.areEqual(this.items, menuCategory.items)) {
                return false;
            }
            Style style = Style.LIST;
            return true;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.label);
            MenuHours menuHours = this.menuHours;
            return Style.LIST.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (menuHours == null ? 0 : menuHours.hashCode())) * 31, 31, this.showUnavailable), 31, this.items);
        }

        public final String toString() {
            String m1259toStringimpl = MenuCategoryToken.m1259toStringimpl(this.token);
            Style style = Style.LIST;
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MenuCategory(token=", m1259toStringimpl, ", label=", this.label, ", menuHours=");
            m.append(this.menuHours);
            m.append(", showUnavailable=");
            m.append(this.showUnavailable);
            m.append(", items=");
            m.append(this.items);
            m.append(", style=");
            m.append(style);
            m.append(")");
            return m.toString();
        }
    }

    public LocalBrandLocationMenuViewModel(boolean z, List list, MenuSelectorOption menuSelectorOption, LocalBottomModalViewModel localBottomModalViewModel, List list2, String str, boolean z2, ToastData toastData) {
        list.getClass();
        list2.getClass();
        this.isLoading = z;
        this.menuOptions = list;
        this.selectedMenuOption = menuSelectorOption;
        this.modal = localBottomModalViewModel;
        this.menuCategories = list2;
        this.defaultSelectedMenuCategory = str;
        this.isSearching = z2;
        this.showToastData = toastData;
    }

    public final boolean equals(Object obj) {
        boolean areEqual;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalBrandLocationMenuViewModel)) {
            return false;
        }
        LocalBrandLocationMenuViewModel localBrandLocationMenuViewModel = (LocalBrandLocationMenuViewModel) obj;
        if (this.isLoading != localBrandLocationMenuViewModel.isLoading || !Intrinsics.areEqual(this.menuOptions, localBrandLocationMenuViewModel.menuOptions) || !Intrinsics.areEqual(this.selectedMenuOption, localBrandLocationMenuViewModel.selectedMenuOption) || !Intrinsics.areEqual(this.modal, localBrandLocationMenuViewModel.modal) || !Intrinsics.areEqual(this.menuCategories, localBrandLocationMenuViewModel.menuCategories)) {
            return false;
        }
        String str = localBrandLocationMenuViewModel.defaultSelectedMenuCategory;
        String str2 = this.defaultSelectedMenuCategory;
        if (str2 == null) {
            if (str == null) {
                areEqual = true;
            }
            areEqual = false;
        } else {
            if (str != null) {
                areEqual = Intrinsics.areEqual(str2, str);
            }
            areEqual = false;
        }
        return areEqual && this.isSearching == localBrandLocationMenuViewModel.isSearching && Intrinsics.areEqual(this.showToastData, localBrandLocationMenuViewModel.showToastData);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(Boolean.hashCode(this.isLoading) * 31, 31, this.menuOptions);
        MenuSelectorOption menuSelectorOption = this.selectedMenuOption;
        int hashCode = (m + (menuSelectorOption == null ? 0 : menuSelectorOption.hashCode())) * 31;
        LocalBottomModalViewModel localBottomModalViewModel = this.modal;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode + (localBottomModalViewModel == null ? 0 : localBottomModalViewModel.hashCode())) * 31, 31, this.menuCategories);
        String str = this.defaultSelectedMenuCategory;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isSearching);
        ToastData toastData = this.showToastData;
        return m3 + (toastData != null ? toastData.hashCode() : 0);
    }

    @Override // app.cash.local.viewmodels.internal.CanWorkAsync
    public final boolean isWorkingAsync() {
        if (this.isLoading) {
            return true;
        }
        LocalBottomModalViewModel localBottomModalViewModel = this.modal;
        return localBottomModalViewModel != null ? localBottomModalViewModel.isLoading : false;
    }

    public final String toString() {
        String str = this.defaultSelectedMenuCategory;
        String m1259toStringimpl = str == null ? "null" : MenuCategoryToken.m1259toStringimpl(str);
        StringBuilder sb = new StringBuilder("LocalBrandLocationMenuViewModel(isLoading=");
        sb.append(this.isLoading);
        sb.append(", menuOptions=");
        sb.append(this.menuOptions);
        sb.append(", selectedMenuOption=");
        sb.append(this.selectedMenuOption);
        sb.append(", modal=");
        sb.append(this.modal);
        sb.append(", menuCategories=");
        Recorder$$ExternalSyntheticOutline2.m(", defaultSelectedMenuCategory=", m1259toStringimpl, ", isSearching=", sb, this.menuCategories);
        sb.append(this.isSearching);
        sb.append(", showToastData=");
        sb.append(this.showToastData);
        sb.append(")");
        return sb.toString();
    }
}
