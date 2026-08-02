package com.squareup.cash.family.safetyhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.google.android.gms.common.zza;
import com.squareup.cash.fileupload.api.UriString;
import com.squareup.protos.cash.aegis.core.SafetyEducationPage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class SafetyHubScreens implements Screen {

    public final class SafetyEducationPageScreen extends SafetyHubScreens {
        public static final Parcelable.Creator<SafetyEducationPageScreen> CREATOR = new UriString.Creator(2);
        public final SafetyEducationPage page;

        public SafetyEducationPageScreen(SafetyEducationPage safetyEducationPage) {
            safetyEducationPage.getClass();
            this.page = safetyEducationPage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SafetyEducationPageScreen) && Intrinsics.areEqual(this.page, ((SafetyEducationPageScreen) obj).page);
        }

        public final int hashCode() {
            return this.page.hashCode();
        }

        public final String toString() {
            return "SafetyEducationPageScreen(page=" + this.page + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.page, i);
        }
    }

    public final class SafetyHubScreen extends SafetyHubScreens {
        public static final SafetyHubScreen INSTANCE = new SafetyHubScreen();
        public static final Parcelable.Creator<SafetyHubScreen> CREATOR = new zza(18);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SafetyHubScreen);
        }

        public final int hashCode() {
            return 206021935;
        }

        public final String toString() {
            return "SafetyHubScreen";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
