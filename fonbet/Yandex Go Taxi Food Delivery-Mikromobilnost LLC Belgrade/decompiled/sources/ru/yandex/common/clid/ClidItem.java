package ru.yandex.common.clid;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.oyr;

/* loaded from: classes9.dex */
public class ClidItem implements Parcelable {
    public static final Parcelable.Creator<ClidItem> CREATOR = new Parcelable.Creator<ClidItem>() { // from class: ru.yandex.common.clid.ClidItem.1
        @Override // android.os.Parcelable.Creator
        public ClidItem createFromParcel(Parcel parcel) {
            return new ClidItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public ClidItem[] newArray(int i) {
            return new ClidItem[i];
        }
    };
    String application;
    String clid;
    String identity;
    long time;
    String type;
    int version;

    public ClidItem(String str, String str2, String str3, int i, long j, String str4) {
        this.identity = str;
        this.type = str2;
        this.application = str3;
        this.version = i;
        this.time = j;
        this.clid = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ClidItem)) {
            return false;
        }
        ClidItem clidItem = (ClidItem) obj;
        return this.identity.equals(clidItem.identity) && this.type.equals(clidItem.type) && this.application.equals(clidItem.application) && this.version == clidItem.version && this.time == clidItem.time && this.clid.equals(clidItem.clid);
    }

    public String getApplication() {
        return this.application;
    }

    public String getClid() {
        return this.clid;
    }

    public String getIdentity() {
        return this.identity;
    }

    public long getTime() {
        return this.time;
    }

    public String getType() {
        return this.type;
    }

    public int getVersion() {
        return this.version;
    }

    public String toLog() {
        StringBuilder sb = new StringBuilder("{ identity :");
        sb.append(this.identity);
        sb.append(" | type :");
        sb.append(this.type);
        sb.append(" | application :");
        sb.append(this.application);
        sb.append(" | version :");
        sb.append(this.version);
        sb.append(" | timestamp :");
        sb.append(this.time);
        sb.append(" | clid :");
        return oyr.t(sb, this.clid, " }");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.identity);
        parcel.writeString(this.application);
        parcel.writeString(this.type);
        parcel.writeInt(this.version);
        parcel.writeLong(this.time);
        parcel.writeString(this.clid);
    }
}
