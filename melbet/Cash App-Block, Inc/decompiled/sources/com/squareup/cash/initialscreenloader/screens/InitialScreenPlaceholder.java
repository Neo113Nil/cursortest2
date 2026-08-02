package com.squareup.cash.initialscreenloader.screens;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.google.android.gms.common.zza;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class InitialScreenPlaceholder implements Screen {
    public static final Parcelable.Creator<InitialScreenPlaceholder> CREATOR = new zza(19);
    public final TriggeredBy triggeredBy;

    public interface TriggeredBy extends Parcelable {

        public final class ActivityLaunch implements TriggeredBy {
            public static final Parcelable.Creator<ActivityLaunch> CREATOR = new zza(20);
            public final Intent launchingIntent;

            public ActivityLaunch(Intent intent) {
                intent.getClass();
                this.launchingIntent = intent;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActivityLaunch) && Intrinsics.areEqual(this.launchingIntent, ((ActivityLaunch) obj).launchingIntent);
            }

            public final int hashCode() {
                return this.launchingIntent.hashCode();
            }

            public final String toString() {
                return "ActivityLaunch(launchingIntent=" + this.launchingIntent + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.launchingIntent, i);
            }
        }

        public final class SignOut implements TriggeredBy {
            public static final SignOut INSTANCE = new SignOut();
            public static final Parcelable.Creator<SignOut> CREATOR = new zza(21);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SignOut);
            }

            public final int hashCode() {
                return -2097713366;
            }

            public final String toString() {
                return "SignOut";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }
    }

    public InitialScreenPlaceholder(TriggeredBy triggeredBy) {
        triggeredBy.getClass();
        this.triggeredBy = triggeredBy;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InitialScreenPlaceholder) && Intrinsics.areEqual(this.triggeredBy, ((InitialScreenPlaceholder) obj).triggeredBy);
    }

    public final TriggeredBy getTriggeredBy() {
        return this.triggeredBy;
    }

    public final int hashCode() {
        return this.triggeredBy.hashCode();
    }

    public final String toString() {
        return "InitialScreenPlaceholder(triggeredBy=" + this.triggeredBy + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.triggeredBy, i);
    }
}
