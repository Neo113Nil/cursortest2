package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.SingleInstanceScreen;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.Fulfillment;
import app.cash.local.primitives.LocalErrorResponse;
import app.cash.local.screens.app.LocalLoyaltySheet;
import com.squareup.protos.cash.local.client.v1.OrderWorkflow;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalBrandLocationCheckoutScreen implements LocalBrandProfileSubScreen, SingleInstanceScreen {
    public static final Parcelable.Creator<LocalBrandLocationCheckoutScreen> CREATOR = new LocalLoyaltySheet.Creator(3);
    public final AttributionKey attributionKey;
    public final BrandSpot brandSpot;
    public final String earningsConfigurationFinePrint;
    public final LocalErrorResponse errors;
    public final Fulfillment fulfillment;
    public final boolean isProfileSheetInline;
    public final OrderWorkflow orderWorkflow;
    public final ReviewMode reviewMode;
    public final BrandSpotSyncTokens syncTokens;
    public final boolean tippingEnabled;
    public final String tippingSubtitle;
    public final List tippingSuggestions;
    public final String tippingTitle;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ReviewMode {
        public static final /* synthetic */ ReviewMode[] $VALUES;
        public static final ReviewMode IN_STORE_OPEN_TAB;
        public static final ReviewMode STANDARD;

        static {
            ReviewMode reviewMode = new ReviewMode("STANDARD", 0);
            STANDARD = reviewMode;
            ReviewMode reviewMode2 = new ReviewMode("IN_STORE_OPEN_TAB", 1);
            IN_STORE_OPEN_TAB = reviewMode2;
            $VALUES = new ReviewMode[]{reviewMode, reviewMode2};
        }

        public static ReviewMode valueOf(String str) {
            return (ReviewMode) Enum.valueOf(ReviewMode.class, str);
        }

        public static ReviewMode[] values() {
            return (ReviewMode[]) $VALUES.clone();
        }
    }

    public LocalBrandLocationCheckoutScreen(BrandSpot brandSpot, AttributionKey attributionKey, boolean z, Fulfillment fulfillment, LocalErrorResponse localErrorResponse, OrderWorkflow orderWorkflow, boolean z2, String str, List list, String str2, String str3, ReviewMode reviewMode, BrandSpotSyncTokens brandSpotSyncTokens) {
        brandSpot.getClass();
        attributionKey.getClass();
        list.getClass();
        reviewMode.getClass();
        brandSpotSyncTokens.getClass();
        this.brandSpot = brandSpot;
        this.attributionKey = attributionKey;
        this.isProfileSheetInline = z;
        this.fulfillment = fulfillment;
        this.errors = localErrorResponse;
        this.orderWorkflow = orderWorkflow;
        this.tippingEnabled = z2;
        this.tippingTitle = str;
        this.tippingSuggestions = list;
        this.tippingSubtitle = str2;
        this.earningsConfigurationFinePrint = str3;
        this.reviewMode = reviewMode;
        this.syncTokens = brandSpotSyncTokens;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalBrandLocationCheckoutScreen)) {
            return false;
        }
        LocalBrandLocationCheckoutScreen localBrandLocationCheckoutScreen = (LocalBrandLocationCheckoutScreen) obj;
        return Intrinsics.areEqual(this.brandSpot, localBrandLocationCheckoutScreen.brandSpot) && Intrinsics.areEqual(this.attributionKey, localBrandLocationCheckoutScreen.attributionKey) && this.isProfileSheetInline == localBrandLocationCheckoutScreen.isProfileSheetInline && Intrinsics.areEqual(this.fulfillment, localBrandLocationCheckoutScreen.fulfillment) && Intrinsics.areEqual(this.errors, localBrandLocationCheckoutScreen.errors) && this.orderWorkflow == localBrandLocationCheckoutScreen.orderWorkflow && this.tippingEnabled == localBrandLocationCheckoutScreen.tippingEnabled && Intrinsics.areEqual(this.tippingTitle, localBrandLocationCheckoutScreen.tippingTitle) && Intrinsics.areEqual(this.tippingSuggestions, localBrandLocationCheckoutScreen.tippingSuggestions) && Intrinsics.areEqual(this.tippingSubtitle, localBrandLocationCheckoutScreen.tippingSubtitle) && Intrinsics.areEqual(this.earningsConfigurationFinePrint, localBrandLocationCheckoutScreen.earningsConfigurationFinePrint) && this.reviewMode == localBrandLocationCheckoutScreen.reviewMode && Intrinsics.areEqual(this.syncTokens, localBrandLocationCheckoutScreen.syncTokens);
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
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.attributionKey.hashCode() + (this.brandSpot.hashCode() * 31)) * 31, 31, this.isProfileSheetInline);
        Fulfillment fulfillment = this.fulfillment;
        int hashCode = (m + (fulfillment == null ? 0 : fulfillment.hashCode())) * 31;
        LocalErrorResponse localErrorResponse = this.errors;
        int hashCode2 = (hashCode + (localErrorResponse == null ? 0 : localErrorResponse.errors.hashCode())) * 31;
        OrderWorkflow orderWorkflow = this.orderWorkflow;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (orderWorkflow == null ? 0 : orderWorkflow.hashCode())) * 31, 31, this.tippingEnabled);
        String str = this.tippingTitle;
        int m3 = Recorder$$ExternalSyntheticOutline2.m((m2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.tippingSuggestions);
        String str2 = this.tippingSubtitle;
        int hashCode3 = (m3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.earningsConfigurationFinePrint;
        return this.syncTokens.hashCode() + ((this.reviewMode.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31);
    }

    @Override // app.cash.local.screens.app.LocalBrandProfileSubScreen
    public final boolean isProfileSheetInline() {
        return this.isProfileSheetInline;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalBrandLocationCheckoutScreen(brandSpot=");
        sb.append(this.brandSpot);
        sb.append(", attributionKey=");
        sb.append(this.attributionKey);
        sb.append(", isProfileSheetInline=");
        sb.append(this.isProfileSheetInline);
        sb.append(", fulfillment=");
        sb.append(this.fulfillment);
        sb.append(", errors=");
        sb.append(this.errors);
        sb.append(", orderWorkflow=");
        sb.append(this.orderWorkflow);
        sb.append(", tippingEnabled=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.tippingEnabled, ", tippingTitle=", this.tippingTitle, ", tippingSuggestions=");
        Recorder$$ExternalSyntheticOutline2.m(", tippingSubtitle=", this.tippingSubtitle, ", earningsConfigurationFinePrint=", sb, this.tippingSuggestions);
        sb.append(this.earningsConfigurationFinePrint);
        sb.append(", reviewMode=");
        sb.append(this.reviewMode);
        sb.append(", syncTokens=");
        sb.append(this.syncTokens);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.brandSpot, i);
        parcel.writeParcelable(this.attributionKey, i);
        parcel.writeInt(this.isProfileSheetInline ? 1 : 0);
        parcel.writeParcelable(this.fulfillment, i);
        parcel.writeParcelable(this.errors, i);
        OrderWorkflow orderWorkflow = this.orderWorkflow;
        if (orderWorkflow == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(orderWorkflow.name());
        }
        parcel.writeInt(this.tippingEnabled ? 1 : 0);
        parcel.writeString(this.tippingTitle);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.tippingSuggestions, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        parcel.writeString(this.tippingSubtitle);
        parcel.writeString(this.earningsConfigurationFinePrint);
        parcel.writeString(this.reviewMode.name());
        parcel.writeParcelable(this.syncTokens, i);
    }

    public LocalBrandLocationCheckoutScreen(BrandSpot brandSpot, AttributionKey attributionKey, boolean z, Fulfillment fulfillment, OrderWorkflow orderWorkflow, boolean z2, String str, List list, String str2, String str3, ReviewMode reviewMode, BrandSpotSyncTokens brandSpotSyncTokens, int i) {
        this(brandSpot, attributionKey, z, fulfillment, (LocalErrorResponse) null, (i & 32) != 0 ? null : orderWorkflow, z2, str, list, str2, str3, reviewMode, (i & 4096) != 0 ? new BrandSpotSyncTokens((String) null, (String) null, 7) : brandSpotSyncTokens);
    }
}
