package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.BrandToken;
import app.cash.local.screens.app.LocalLoyaltySheet;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class LocalMarketingMessagesScreen implements LocalScreen {
    public static final Parcelable.Creator<LocalMarketingMessagesScreen> CREATOR = new LocalLoyaltySheet.Creator(19);
    public final String brandToken;

    public LocalMarketingMessagesScreen(String str) {
        this.brandToken = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean m1227equalsimpl0;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalMarketingMessagesScreen)) {
            return false;
        }
        String str = ((LocalMarketingMessagesScreen) obj).brandToken;
        String str2 = this.brandToken;
        if (str2 == null) {
            if (str == null) {
                m1227equalsimpl0 = true;
            }
            m1227equalsimpl0 = false;
        } else {
            if (str != null) {
                m1227equalsimpl0 = BrandToken.m1227equalsimpl0(str2, str);
            }
            m1227equalsimpl0 = false;
        }
        return m1227equalsimpl0;
    }

    public final int hashCode() {
        String str = this.brandToken;
        if (str == null) {
            return 0;
        }
        return BrandToken.m1228hashCodeimpl(str);
    }

    public final String toString() {
        String str = this.brandToken;
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalMarketingMessagesScreen(brandToken=", str == null ? "null" : BrandToken.m1229toStringimpl(str), ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        String str = this.brandToken;
        parcel.writeParcelable(str != null ? BrandToken.m1226boximpl(str) : null, i);
    }
}
