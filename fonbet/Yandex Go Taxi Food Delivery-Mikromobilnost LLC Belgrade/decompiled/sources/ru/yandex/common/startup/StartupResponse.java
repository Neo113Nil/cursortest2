package ru.yandex.common.startup;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.lvj0;
import ru.yandex.common.network.ErrorResponse;

/* loaded from: classes4.dex */
public class StartupResponse extends lvj0 implements Parcelable {
    public static final Parcelable.Creator<StartupResponse> CREATOR = new Parcelable.Creator<StartupResponse>() { // from class: ru.yandex.common.startup.StartupResponse.1
        @Override // android.os.Parcelable.Creator
        public StartupResponse createFromParcel(Parcel parcel) {
            parcel.readInt();
            StartupResponse startupResponse = new StartupResponse(parcel.readInt());
            if (parcel.readInt() != 0) {
                startupResponse.setError((ErrorResponse) parcel.readParcelable(ErrorResponse.class.getClassLoader()));
            }
            startupResponse.uuid = parcel.readString();
            startupResponse.versionCurrent = parcel.readString();
            startupResponse.versionMin = parcel.readString();
            return startupResponse;
        }

        @Override // android.os.Parcelable.Creator
        public StartupResponse[] newArray(int i) {
            return new StartupResponse[i];
        }
    };
    public static final int PARCEL_VERSION_NUMBER = 1;
    public static final String TAG = "[YaWeather:StartupResponse]";
    String uuid;
    String versionCurrent;
    String versionMin;

    public StartupResponse(int i) {
        super(i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getUuid() {
        return this.uuid;
    }

    public String getVersionCurrent() {
        return this.versionCurrent;
    }

    public String getVersionMin() {
        return this.versionMin;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(describeContents());
        parcel.writeInt(this.code);
        if (hasError()) {
            parcel.writeInt(1);
            parcel.writeParcelable(this.error, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.uuid);
        parcel.writeString(this.versionCurrent);
        parcel.writeString(this.versionMin);
    }
}
