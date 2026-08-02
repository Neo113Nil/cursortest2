package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.EditorialToken;
import app.cash.local.screens.app.LocalLoyaltySheet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class LocalEditorialScreen implements LocalScreen, HasAttributionKeyScreenScreen {
    public static final Parcelable.Creator<LocalEditorialScreen> CREATOR = new LocalLoyaltySheet.Creator(12);
    public final AttributionKey attributionKey;
    public final String editorialToken;

    public LocalEditorialScreen(String str, AttributionKey attributionKey) {
        attributionKey.getClass();
        this.editorialToken = str;
        this.attributionKey = attributionKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalEditorialScreen)) {
            return false;
        }
        LocalEditorialScreen localEditorialScreen = (LocalEditorialScreen) obj;
        return EditorialToken.m1235equalsimpl0(this.editorialToken, localEditorialScreen.editorialToken) && Intrinsics.areEqual(this.attributionKey, localEditorialScreen.attributionKey);
    }

    @Override // app.cash.local.screens.app.HasAttributionKeyScreenScreen
    public final AttributionKey getAttributionKey() {
        return this.attributionKey;
    }

    public final int hashCode() {
        return this.attributionKey.hashCode() + (EditorialToken.m1236hashCodeimpl(this.editorialToken) * 31);
    }

    public final String toString() {
        return "LocalEditorialScreen(editorialToken=" + EditorialToken.m1237toStringimpl(this.editorialToken) + ", attributionKey=" + this.attributionKey + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(EditorialToken.m1234boximpl(this.editorialToken), i);
        parcel.writeParcelable(this.attributionKey, i);
    }
}
