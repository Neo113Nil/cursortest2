package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.local.primitives.BrandToken;
import app.cash.local.primitives.CartToken;
import app.cash.local.screens.app.LocalLoyaltySheet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalCheckoutDeeplinkScreen implements LocalScreen, NeverInBackStackScreen {
    public static final Parcelable.Creator<LocalCheckoutDeeplinkScreen> CREATOR = new LocalLoyaltySheet.Creator(10);
    public final String brandToken;
    public final String cartToken;

    public LocalCheckoutDeeplinkScreen(String str, String str2) {
        str2.getClass();
        this.cartToken = str;
        this.brandToken = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalCheckoutDeeplinkScreen)) {
            return false;
        }
        LocalCheckoutDeeplinkScreen localCheckoutDeeplinkScreen = (LocalCheckoutDeeplinkScreen) obj;
        return this.cartToken.equals(localCheckoutDeeplinkScreen.cartToken) && Intrinsics.areEqual(this.brandToken, localCheckoutDeeplinkScreen.brandToken);
    }

    public final int hashCode() {
        return this.brandToken.hashCode() + (this.cartToken.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("LocalCheckoutDeeplinkScreen(cartToken=", CartToken.m1231toStringimpl(this.cartToken), ", brandToken=", BrandToken.m1229toStringimpl(this.brandToken), ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(new CartToken(this.cartToken), i);
        parcel.writeParcelable(new BrandToken(this.brandToken), i);
    }
}
