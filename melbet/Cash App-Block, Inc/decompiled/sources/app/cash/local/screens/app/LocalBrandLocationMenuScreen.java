package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.SingleInstanceScreen;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.MenuCategoryToken;
import app.cash.local.primitives.MenuToken;
import app.cash.local.screens.app.LocalLoyaltySheet;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class LocalBrandLocationMenuScreen implements LocalBrandProfileSubScreen, SingleInstanceScreen {
    public static final Parcelable.Creator<LocalBrandLocationMenuScreen> CREATOR = new LocalLoyaltySheet.Creator(4);
    public final AttributionKey attributionKey;
    public final BrandSpot brandSpot;
    public final boolean isProfileSheetInline;
    public final boolean navigateBackToProfile;
    public final String selectedMenu;
    public final String selectedMenuCategory;
    public final BrandSpotSyncTokens syncTokens;

    public /* synthetic */ LocalBrandLocationMenuScreen(BrandSpot brandSpot, boolean z, AttributionKey attributionKey, BrandSpotSyncTokens brandSpotSyncTokens, int i) {
        this(brandSpot, null, null, z, (i & 16) != 0 ? new AttributionKey(null) : attributionKey, true, (i & 64) != 0 ? new BrandSpotSyncTokens((String) null, (String) null, 7) : brandSpotSyncTokens);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean m1267equalsimpl0;
        boolean m1257equalsimpl0;
        if (this != obj) {
            if (obj instanceof LocalBrandLocationMenuScreen) {
                LocalBrandLocationMenuScreen localBrandLocationMenuScreen = (LocalBrandLocationMenuScreen) obj;
                if (Intrinsics.areEqual(this.brandSpot, localBrandLocationMenuScreen.brandSpot)) {
                    String str = localBrandLocationMenuScreen.selectedMenu;
                    String str2 = this.selectedMenu;
                    if (str2 == null) {
                        if (str == null) {
                            m1267equalsimpl0 = true;
                            if (m1267equalsimpl0) {
                                String str3 = localBrandLocationMenuScreen.selectedMenuCategory;
                                String str4 = this.selectedMenuCategory;
                                if (str4 == null) {
                                    if (str3 == null) {
                                        m1257equalsimpl0 = true;
                                        if (m1257equalsimpl0 && this.isProfileSheetInline == localBrandLocationMenuScreen.isProfileSheetInline && Intrinsics.areEqual(this.attributionKey, localBrandLocationMenuScreen.attributionKey) && this.navigateBackToProfile == localBrandLocationMenuScreen.navigateBackToProfile && Intrinsics.areEqual(this.syncTokens, localBrandLocationMenuScreen.syncTokens)) {
                                        }
                                    }
                                    m1257equalsimpl0 = false;
                                    if (m1257equalsimpl0) {
                                    }
                                } else {
                                    if (str3 != null) {
                                        m1257equalsimpl0 = MenuCategoryToken.m1257equalsimpl0(str4, str3);
                                        if (m1257equalsimpl0) {
                                        }
                                    }
                                    m1257equalsimpl0 = false;
                                    if (m1257equalsimpl0) {
                                    }
                                }
                            }
                        }
                        m1267equalsimpl0 = false;
                        if (m1267equalsimpl0) {
                        }
                    } else {
                        if (str != null) {
                            m1267equalsimpl0 = MenuToken.m1267equalsimpl0(str2, str);
                            if (m1267equalsimpl0) {
                            }
                        }
                        m1267equalsimpl0 = false;
                        if (m1267equalsimpl0) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
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
        int hashCode = this.brandSpot.hashCode() * 31;
        String str = this.selectedMenu;
        int m1268hashCodeimpl = (hashCode + (str == null ? 0 : MenuToken.m1268hashCodeimpl(str))) * 31;
        String str2 = this.selectedMenuCategory;
        return this.syncTokens.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.attributionKey.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m1268hashCodeimpl + (str2 != null ? MenuCategoryToken.m1258hashCodeimpl(str2) : 0)) * 31, 31, this.isProfileSheetInline)) * 31, 31, this.navigateBackToProfile);
    }

    @Override // app.cash.local.screens.app.LocalBrandProfileSubScreen
    public final boolean isProfileSheetInline() {
        return this.isProfileSheetInline;
    }

    public final String toString() {
        String str = this.selectedMenu;
        String m1269toStringimpl = str == null ? "null" : MenuToken.m1269toStringimpl(str);
        String str2 = this.selectedMenuCategory;
        String m1259toStringimpl = str2 != null ? MenuCategoryToken.m1259toStringimpl(str2) : "null";
        StringBuilder sb = new StringBuilder("LocalBrandLocationMenuScreen(brandSpot=");
        sb.append(this.brandSpot);
        sb.append(", selectedMenu=");
        sb.append(m1269toStringimpl);
        sb.append(", selectedMenuCategory=");
        NavAction$$ExternalSyntheticOutline0.m(sb, m1259toStringimpl, ", isProfileSheetInline=", this.isProfileSheetInline, ", attributionKey=");
        sb.append(this.attributionKey);
        sb.append(", navigateBackToProfile=");
        sb.append(this.navigateBackToProfile);
        sb.append(", syncTokens=");
        sb.append(this.syncTokens);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.brandSpot, i);
        String str = this.selectedMenu;
        parcel.writeParcelable(str != null ? MenuToken.m1266boximpl(str) : null, i);
        String str2 = this.selectedMenuCategory;
        parcel.writeParcelable(str2 != null ? MenuCategoryToken.m1256boximpl(str2) : null, i);
        parcel.writeInt(this.isProfileSheetInline ? 1 : 0);
        parcel.writeParcelable(this.attributionKey, i);
        parcel.writeInt(this.navigateBackToProfile ? 1 : 0);
        parcel.writeParcelable(this.syncTokens, i);
    }

    public LocalBrandLocationMenuScreen(BrandSpot brandSpot, String str, String str2, boolean z, AttributionKey attributionKey, boolean z2, BrandSpotSyncTokens brandSpotSyncTokens) {
        brandSpot.getClass();
        attributionKey.getClass();
        brandSpotSyncTokens.getClass();
        this.brandSpot = brandSpot;
        this.selectedMenu = str;
        this.selectedMenuCategory = str2;
        this.isProfileSheetInline = z;
        this.attributionKey = attributionKey;
        this.navigateBackToProfile = z2;
        this.syncTokens = brandSpotSyncTokens;
    }
}
