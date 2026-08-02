package ru.yandex.common.startup;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.m9z;
import ru.yandex.common.location.LocationProvider;

/* loaded from: classes4.dex */
public class StartupHelper$LocationInfoHolder implements LocationProvider {
    public static final Parcelable.Creator<StartupHelper$LocationInfoHolder> CREATOR = new Parcelable.Creator<StartupHelper$LocationInfoHolder>() { // from class: ru.yandex.common.startup.StartupHelper$LocationInfoHolder.1
        @Override // android.os.Parcelable.Creator
        public StartupHelper$LocationInfoHolder createFromParcel(Parcel parcel) {
            return new StartupHelper$LocationInfoHolder();
        }

        @Override // android.os.Parcelable.Creator
        public StartupHelper$LocationInfoHolder[] newArray(int i) {
            return new StartupHelper$LocationInfoHolder[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // ru.yandex.common.location.LocationProvider
    public m9z getLocationInfo() {
        throw null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
