package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.MenuCategoryToken;
import app.cash.local.primitives.MenuItemToken;
import app.cash.local.primitives.MenuItemVariationToken;
import app.cash.local.primitives.analytics.LocalClientCartMenuItemAddedContext;
import app.cash.local.screens.app.LocalLoyaltySheet;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class LocalMenuItemDetailsScreen implements LocalBrandProfileSubScreen {
    public static final Parcelable.Creator<LocalMenuItemDetailsScreen> CREATOR = new LocalLoyaltySheet.Creator(24);
    public final LocalClientCartMenuItemAddedContext analyticsContext;
    public final AttributionKey attributionKey;
    public final boolean automaticallyAddToCart;
    public final BrandSpot brandSpot;
    public final ComboData comboData;
    public final boolean isProfileSheetInline;
    public final String itemToken;
    public final String menuCategoryToken;
    public final Mode mode;
    public final AskedQuestion question;
    public final boolean showQuantityStepper;
    public final BrandSpotSyncTokens syncTokens;

    /* loaded from: classes3.dex */
    public final class ComboData implements Parcelable {
        public static final Parcelable.Creator<ComboData> CREATOR = new LocalLoyaltySheet.Creator(23);
        public final String comboName;
        public final ArrayList priceAdjustments;

        public ComboData(String str, ArrayList arrayList) {
            str.getClass();
            this.comboName = str;
            this.priceAdjustments = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ComboData)) {
                return false;
            }
            ComboData comboData = (ComboData) obj;
            return Intrinsics.areEqual(this.comboName, comboData.comboName) && this.priceAdjustments.equals(comboData.priceAdjustments);
        }

        public final int hashCode() {
            return this.priceAdjustments.hashCode() + (this.comboName.hashCode() * 31);
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m(this.priceAdjustments, "ComboData(comboName=", this.comboName, ", priceAdjustments=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.comboName);
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.priceAdjustments, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
        }
    }

    public /* synthetic */ LocalMenuItemDetailsScreen(BrandSpot brandSpot, String str, boolean z, ComboData comboData, String str2, LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext, Mode mode, AskedQuestion askedQuestion, BrandSpotSyncTokens brandSpotSyncTokens, int i) {
        this(brandSpot, str, z, (i & 8) != 0 ? null : comboData, (i & 16) != 0 ? null : str2, localClientCartMenuItemAddedContext, mode, (i & 128) != 0, (i & 256) != 0, (i & 512) != 0 ? null : askedQuestion, brandSpotSyncTokens);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean m1257equalsimpl0;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalMenuItemDetailsScreen)) {
            return false;
        }
        LocalMenuItemDetailsScreen localMenuItemDetailsScreen = (LocalMenuItemDetailsScreen) obj;
        if (!Intrinsics.areEqual(this.brandSpot, localMenuItemDetailsScreen.brandSpot) || !MenuItemToken.m1262equalsimpl0(this.itemToken, localMenuItemDetailsScreen.itemToken) || this.isProfileSheetInline != localMenuItemDetailsScreen.isProfileSheetInline || !Intrinsics.areEqual(this.comboData, localMenuItemDetailsScreen.comboData)) {
            return false;
        }
        String str = localMenuItemDetailsScreen.menuCategoryToken;
        String str2 = this.menuCategoryToken;
        if (str2 == null) {
            if (str == null) {
                m1257equalsimpl0 = true;
            }
            m1257equalsimpl0 = false;
        } else {
            if (str != null) {
                m1257equalsimpl0 = MenuCategoryToken.m1257equalsimpl0(str2, str);
            }
            m1257equalsimpl0 = false;
        }
        return m1257equalsimpl0 && Intrinsics.areEqual(this.analyticsContext, localMenuItemDetailsScreen.analyticsContext) && Intrinsics.areEqual(this.mode, localMenuItemDetailsScreen.mode) && this.automaticallyAddToCart == localMenuItemDetailsScreen.automaticallyAddToCart && this.showQuantityStepper == localMenuItemDetailsScreen.showQuantityStepper && Intrinsics.areEqual(this.question, localMenuItemDetailsScreen.question) && Intrinsics.areEqual(this.syncTokens, localMenuItemDetailsScreen.syncTokens);
    }

    @Override // app.cash.local.screens.app.HasAttributionKeyScreenScreen
    public final AttributionKey getAttributionKey() {
        return this.attributionKey;
    }

    @Override // app.cash.local.screens.app.LocalBrandProfileSubScreen
    public final BrandSpot getBrandSpot() {
        return this.brandSpot;
    }

    @Override // app.cash.local.screens.app.LocalBrandProfileSubScreen
    public final BrandSpotSyncTokens getSyncTokens() {
        return this.syncTokens;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((MenuItemToken.m1263hashCodeimpl(this.itemToken) + (this.brandSpot.hashCode() * 31)) * 31, 31, this.isProfileSheetInline);
        ComboData comboData = this.comboData;
        int hashCode = (m + (comboData == null ? 0 : comboData.hashCode())) * 31;
        String str = this.menuCategoryToken;
        int m1258hashCodeimpl = (hashCode + (str == null ? 0 : MenuCategoryToken.m1258hashCodeimpl(str))) * 31;
        LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext = this.analyticsContext;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.mode.hashCode() + ((m1258hashCodeimpl + (localClientCartMenuItemAddedContext == null ? 0 : localClientCartMenuItemAddedContext.hashCode())) * 31)) * 31, 31, this.automaticallyAddToCart), 31, this.showQuantityStepper);
        AskedQuestion askedQuestion = this.question;
        return this.syncTokens.hashCode() + ((m2 + (askedQuestion != null ? askedQuestion.hashCode() : 0)) * 31);
    }

    @Override // app.cash.local.screens.app.LocalBrandProfileSubScreen
    public final boolean isProfileSheetInline() {
        return this.isProfileSheetInline;
    }

    public final String toString() {
        String m1264toStringimpl = MenuItemToken.m1264toStringimpl(this.itemToken);
        StringBuilder sb = new StringBuilder("LocalMenuItemDetailsScreen(brandSpot=");
        sb.append(this.brandSpot);
        sb.append(", itemToken=");
        sb.append(m1264toStringimpl);
        sb.append(", isProfileSheetInline=");
        sb.append(this.isProfileSheetInline);
        sb.append(", comboData=");
        sb.append(this.comboData);
        sb.append(", menuCategoryToken=██, analyticsContext=");
        sb.append(this.analyticsContext);
        sb.append(", mode=");
        sb.append(this.mode);
        sb.append(", automaticallyAddToCart=");
        re$$ExternalSyntheticOutline0.m(sb, this.automaticallyAddToCart, ", showQuantityStepper=", this.showQuantityStepper, ", question=");
        sb.append(this.question);
        sb.append(", syncTokens=");
        sb.append(this.syncTokens);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.brandSpot, i);
        parcel.writeParcelable(MenuItemToken.m1261boximpl(this.itemToken), i);
        parcel.writeInt(this.isProfileSheetInline ? 1 : 0);
        ComboData comboData = this.comboData;
        if (comboData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            comboData.writeToParcel(parcel, i);
        }
        String str = this.menuCategoryToken;
        parcel.writeParcelable(str != null ? MenuCategoryToken.m1256boximpl(str) : null, i);
        parcel.writeParcelable(this.analyticsContext, i);
        parcel.writeParcelable(this.mode, i);
        parcel.writeInt(this.automaticallyAddToCart ? 1 : 0);
        parcel.writeInt(this.showQuantityStepper ? 1 : 0);
        parcel.writeParcelable(this.question, i);
        parcel.writeParcelable(this.syncTokens, i);
    }

    /* loaded from: classes3.dex */
    public interface Mode extends Parcelable {

        public final class EditFromCart implements Mode {
            public static final Parcelable.Creator<EditFromCart> CREATOR = new LocalLoyaltySheet.Creator(26);
            public final int itemIndexInCart;

            public EditFromCart(int i) {
                this.itemIndexInCart = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EditFromCart) && this.itemIndexInCart == ((EditFromCart) obj).itemIndexInCart;
            }

            public final int hashCode() {
                return Integer.hashCode(this.itemIndexInCart);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.itemIndexInCart, "EditFromCart(itemIndexInCart=", ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(this.itemIndexInCart);
            }
        }

        public final class Update implements Mode {
            public static final Parcelable.Creator<Update> CREATOR = new LocalLoyaltySheet.Creator(27);
            public final List selectedModifiers;
            public final List selectedTextModifiers;
            public final String selectedVariant;

            public Update(String str, List list, List list2) {
                list.getClass();
                list2.getClass();
                this.selectedVariant = str;
                this.selectedModifiers = list;
                this.selectedTextModifiers = list2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                boolean areEqual;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Update)) {
                    return false;
                }
                Update update = (Update) obj;
                String str = update.selectedVariant;
                String str2 = this.selectedVariant;
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
                return areEqual && Intrinsics.areEqual(this.selectedModifiers, update.selectedModifiers) && Intrinsics.areEqual(this.selectedTextModifiers, update.selectedTextModifiers);
            }

            public final int hashCode() {
                String str = this.selectedVariant;
                return this.selectedTextModifiers.hashCode() + Recorder$$ExternalSyntheticOutline2.m((str == null ? 0 : str.hashCode()) * 31, 31, this.selectedModifiers);
            }

            public final String toString() {
                String str = this.selectedVariant;
                return CameraState$Type$EnumUnboxingLocalUtility.m(NavAction$$ExternalSyntheticOutline0.m("Update(selectedVariant=", str == null ? "null" : MenuItemVariationToken.m1265toStringimpl(str), ", selectedModifiers=", ", selectedTextModifiers=", this.selectedModifiers), this.selectedTextModifiers, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                String str = this.selectedVariant;
                parcel.writeParcelable(str != null ? new MenuItemVariationToken(str) : null, i);
                Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.selectedModifiers, parcel);
                while (m.hasNext()) {
                    parcel.writeParcelable((Parcelable) m.next(), i);
                }
                Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.selectedTextModifiers, parcel);
                while (m2.hasNext()) {
                    parcel.writeParcelable((Parcelable) m2.next(), i);
                }
            }
        }

        public final class Add implements Mode {
            public static final Parcelable.Creator<Add> CREATOR = new LocalLoyaltySheet.Creator(25);
            public final List selectedModifiers;
            public final List selectedTextModifiers;
            public final String selectedVariant;

            public Add(String str, List list, List list2) {
                list.getClass();
                list2.getClass();
                this.selectedVariant = str;
                this.selectedModifiers = list;
                this.selectedTextModifiers = list2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                boolean areEqual;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Add)) {
                    return false;
                }
                Add add = (Add) obj;
                String str = add.selectedVariant;
                String str2 = this.selectedVariant;
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
                return areEqual && Intrinsics.areEqual(this.selectedModifiers, add.selectedModifiers) && Intrinsics.areEqual(this.selectedTextModifiers, add.selectedTextModifiers);
            }

            public final int hashCode() {
                String str = this.selectedVariant;
                return this.selectedTextModifiers.hashCode() + Recorder$$ExternalSyntheticOutline2.m((str == null ? 0 : str.hashCode()) * 31, 31, this.selectedModifiers);
            }

            public final String toString() {
                String str = this.selectedVariant;
                return CameraState$Type$EnumUnboxingLocalUtility.m(NavAction$$ExternalSyntheticOutline0.m("Add(selectedVariant=", str == null ? "null" : MenuItemVariationToken.m1265toStringimpl(str), ", selectedModifiers=", ", selectedTextModifiers=", this.selectedModifiers), this.selectedTextModifiers, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                String str = this.selectedVariant;
                parcel.writeParcelable(str != null ? new MenuItemVariationToken(str) : null, i);
                Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.selectedModifiers, parcel);
                while (m.hasNext()) {
                    parcel.writeParcelable((Parcelable) m.next(), i);
                }
                Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.selectedTextModifiers, parcel);
                while (m2.hasNext()) {
                    parcel.writeParcelable((Parcelable) m2.next(), i);
                }
            }

            public Add(String str, EmptyList emptyList) {
                this(str, emptyList, EmptyList.INSTANCE);
            }
        }
    }

    public LocalMenuItemDetailsScreen(BrandSpot brandSpot, String str, boolean z, ComboData comboData, String str2, LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext, Mode mode, boolean z2, boolean z3, AskedQuestion askedQuestion, BrandSpotSyncTokens brandSpotSyncTokens) {
        brandSpot.getClass();
        str.getClass();
        mode.getClass();
        brandSpotSyncTokens.getClass();
        this.brandSpot = brandSpot;
        this.itemToken = str;
        this.isProfileSheetInline = z;
        this.comboData = comboData;
        this.menuCategoryToken = str2;
        this.analyticsContext = localClientCartMenuItemAddedContext;
        this.mode = mode;
        this.automaticallyAddToCart = z2;
        this.showQuantityStepper = z3;
        this.question = askedQuestion;
        this.syncTokens = brandSpotSyncTokens;
        this.attributionKey = new AttributionKey(null);
    }
}
