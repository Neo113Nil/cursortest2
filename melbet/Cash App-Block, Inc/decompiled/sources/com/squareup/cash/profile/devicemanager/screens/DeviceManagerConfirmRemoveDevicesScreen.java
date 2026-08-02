package com.squareup.cash.profile.devicemanager.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.cash.screens.Redacted;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DeviceManagerConfirmRemoveDevicesScreen implements DialogScreen {
    public static final Parcelable.Creator<DeviceManagerConfirmRemoveDevicesScreen> CREATOR = new PdfScreen.Creator(25);
    public final Redacted deviceName;

    /* loaded from: classes7.dex */
    public interface Result extends Parcelable {

        /* loaded from: classes6.dex */
        public final class Cancel implements Result {
            public static final Cancel INSTANCE = new Cancel();
            public static final Parcelable.Creator<Cancel> CREATOR = new PdfScreen.Creator(26);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Cancel);
            }

            public final int hashCode() {
                return -301550940;
            }

            public final String toString() {
                return "Cancel";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        /* loaded from: classes6.dex */
        public final class Remove implements Result {
            public static final Remove INSTANCE = new Remove();
            public static final Parcelable.Creator<Remove> CREATOR = new PdfScreen.Creator(27);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Remove);
            }

            public final int hashCode() {
                return 131562670;
            }

            public final String toString() {
                return "Remove";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }
    }

    public DeviceManagerConfirmRemoveDevicesScreen(Redacted redacted) {
        redacted.getClass();
        this.deviceName = redacted;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeviceManagerConfirmRemoveDevicesScreen) && Intrinsics.areEqual(this.deviceName, ((DeviceManagerConfirmRemoveDevicesScreen) obj).deviceName);
    }

    public final int hashCode() {
        return this.deviceName.hashCode();
    }

    public final String toString() {
        return "DeviceManagerConfirmRemoveDevicesScreen(deviceName=" + this.deviceName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.deviceName, i);
    }
}
