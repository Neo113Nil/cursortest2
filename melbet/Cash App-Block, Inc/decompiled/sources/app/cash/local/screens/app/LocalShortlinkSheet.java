package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import app.cash.local.primitives.ShortlinkKey;
import app.cash.passcode.screens.EndAppLock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalShortlinkSheet implements LocalScreen, Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<LocalShortlinkSheet> CREATOR = new EndAppLock.Creator(9);
    public final String nextShortlinkFlowState;
    public final String shortlinkKey;

    public LocalShortlinkSheet(String str, String str2) {
        str.getClass();
        this.shortlinkKey = str;
        this.nextShortlinkFlowState = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalShortlinkSheet)) {
            return false;
        }
        LocalShortlinkSheet localShortlinkSheet = (LocalShortlinkSheet) obj;
        return Intrinsics.areEqual(this.shortlinkKey, localShortlinkSheet.shortlinkKey) && Intrinsics.areEqual(this.nextShortlinkFlowState, localShortlinkSheet.nextShortlinkFlowState);
    }

    public final int hashCode() {
        int hashCode = this.shortlinkKey.hashCode() * 31;
        String str = this.nextShortlinkFlowState;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("LocalShortlinkSheet(shortlinkKey=", ShortlinkKey.m1285toStringimpl(this.shortlinkKey), ", nextShortlinkFlowState=", this.nextShortlinkFlowState, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(new ShortlinkKey(this.shortlinkKey), i);
        parcel.writeString(this.nextShortlinkFlowState);
    }
}
