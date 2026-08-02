package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.passcode.screens.EndAppLock;
import com.squareup.protos.cash.local.client.v1.POSBrandOnboarding;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class LocalPosBrandOnboardingScreen implements LocalScreen, NeverInBackStackScreen {
    public static final Parcelable.Creator<LocalPosBrandOnboardingScreen> CREATOR = new EndAppLock.Creator(5);
    public final POSBrandOnboarding posBrandOnboarding;

    public LocalPosBrandOnboardingScreen(POSBrandOnboarding pOSBrandOnboarding) {
        pOSBrandOnboarding.getClass();
        this.posBrandOnboarding = pOSBrandOnboarding;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalPosBrandOnboardingScreen) && Intrinsics.areEqual(this.posBrandOnboarding, ((LocalPosBrandOnboardingScreen) obj).posBrandOnboarding);
    }

    public final int hashCode() {
        return this.posBrandOnboarding.hashCode();
    }

    public final String toString() {
        return "LocalPosBrandOnboardingScreen(posBrandOnboarding=" + this.posBrandOnboarding + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.posBrandOnboarding, i);
    }
}
