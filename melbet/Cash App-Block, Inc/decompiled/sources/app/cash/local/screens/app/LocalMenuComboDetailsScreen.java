package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.MenuCategoryToken;
import app.cash.local.primitives.MenuItemToken;
import app.cash.local.primitives.analytics.LocalClientCartMenuItemAddedContext;
import app.cash.local.screens.app.LocalLoyaltySheet;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class LocalMenuComboDetailsScreen implements LocalBrandProfileSubScreen {
    public static final Parcelable.Creator<LocalMenuComboDetailsScreen> CREATOR = new LocalLoyaltySheet.Creator(20);
    public final LocalClientCartMenuItemAddedContext analyticsContext;
    public final AttributionKey attributionKey;
    public final BrandSpot brandSpot;
    public final boolean isProfileSheetInline;
    public final String itemToken;
    public final String menuCategoryToken;
    public final Mode mode;
    public final BrandSpotSyncTokens syncTokens;

    /* loaded from: classes3.dex */
    public interface Mode extends Parcelable {

        public final class Add implements Mode {
            public static final Parcelable.Creator<Add> CREATOR = new LocalLoyaltySheet.Creator(21);
            public final List slotSelections;

            public Add(List list) {
                list.getClass();
                this.slotSelections = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Add) && Intrinsics.areEqual(this.slotSelections, ((Add) obj).slotSelections);
            }

            public final int hashCode() {
                return this.slotSelections.hashCode();
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("Add(slotSelections=", ")", this.slotSelections);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.slotSelections, parcel);
                while (m.hasNext()) {
                    parcel.writeParcelable((Parcelable) m.next(), i);
                }
            }
        }

        public final class Edit implements Mode {
            public static final Parcelable.Creator<Edit> CREATOR = new LocalLoyaltySheet.Creator(22);
            public final int itemIndexInCart;

            public Edit(int i) {
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
                return (obj instanceof Edit) && this.itemIndexInCart == ((Edit) obj).itemIndexInCart;
            }

            public final int hashCode() {
                return Integer.hashCode(this.itemIndexInCart);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.itemIndexInCart, "Edit(itemIndexInCart=", ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(this.itemIndexInCart);
            }
        }
    }

    public LocalMenuComboDetailsScreen(BrandSpot brandSpot, String str, boolean z, String str2, LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext, Mode mode, BrandSpotSyncTokens brandSpotSyncTokens) {
        brandSpot.getClass();
        str.getClass();
        mode.getClass();
        brandSpotSyncTokens.getClass();
        this.brandSpot = brandSpot;
        this.itemToken = str;
        this.isProfileSheetInline = z;
        this.menuCategoryToken = str2;
        this.analyticsContext = localClientCartMenuItemAddedContext;
        this.mode = mode;
        this.syncTokens = brandSpotSyncTokens;
        this.attributionKey = new AttributionKey(null);
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
        if (!(obj instanceof LocalMenuComboDetailsScreen)) {
            return false;
        }
        LocalMenuComboDetailsScreen localMenuComboDetailsScreen = (LocalMenuComboDetailsScreen) obj;
        if (!Intrinsics.areEqual(this.brandSpot, localMenuComboDetailsScreen.brandSpot) || !MenuItemToken.m1262equalsimpl0(this.itemToken, localMenuComboDetailsScreen.itemToken) || this.isProfileSheetInline != localMenuComboDetailsScreen.isProfileSheetInline) {
            return false;
        }
        String str = localMenuComboDetailsScreen.menuCategoryToken;
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
        return m1257equalsimpl0 && Intrinsics.areEqual(this.analyticsContext, localMenuComboDetailsScreen.analyticsContext) && Intrinsics.areEqual(this.mode, localMenuComboDetailsScreen.mode) && Intrinsics.areEqual(this.syncTokens, localMenuComboDetailsScreen.syncTokens);
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
        String str = this.menuCategoryToken;
        int m1258hashCodeimpl = (m + (str == null ? 0 : MenuCategoryToken.m1258hashCodeimpl(str))) * 31;
        LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext = this.analyticsContext;
        return this.syncTokens.hashCode() + ((this.mode.hashCode() + ((m1258hashCodeimpl + (localClientCartMenuItemAddedContext != null ? localClientCartMenuItemAddedContext.hashCode() : 0)) * 31)) * 31);
    }

    @Override // app.cash.local.screens.app.LocalBrandProfileSubScreen
    public final boolean isProfileSheetInline() {
        return this.isProfileSheetInline;
    }

    public final String toString() {
        return "LocalMenuComboDetailsScreen(brandSpot=" + this.brandSpot + ", itemToken=" + MenuItemToken.m1264toStringimpl(this.itemToken) + ", isProfileSheetInline=" + this.isProfileSheetInline + ", menuCategoryToken=██, analyticsContext=" + this.analyticsContext + ", mode=" + this.mode + ", syncTokens=" + this.syncTokens + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.brandSpot, i);
        parcel.writeParcelable(MenuItemToken.m1261boximpl(this.itemToken), i);
        parcel.writeInt(this.isProfileSheetInline ? 1 : 0);
        String str = this.menuCategoryToken;
        parcel.writeParcelable(str != null ? MenuCategoryToken.m1256boximpl(str) : null, i);
        parcel.writeParcelable(this.analyticsContext, i);
        parcel.writeParcelable(this.mode, i);
        parcel.writeParcelable(this.syncTokens, i);
    }
}
