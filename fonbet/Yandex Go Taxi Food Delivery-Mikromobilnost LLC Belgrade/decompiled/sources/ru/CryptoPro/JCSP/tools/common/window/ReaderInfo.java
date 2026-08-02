package ru.CryptoPro.JCSP.tools.common.window;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes4.dex */
public class ReaderInfo implements Parcelable {
    public static final Parcelable.Creator<ReaderInfo> CREATOR = new Parcelable.Creator<ReaderInfo>() { // from class: ru.CryptoPro.JCSP.tools.common.window.ReaderInfo.1
        @Override // android.os.Parcelable.Creator
        public ReaderInfo createFromParcel(Parcel parcel) {
            return new ReaderInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ReaderInfo[] newArray(int i) {
            return new ReaderInfo[i];
        }
    };
    private final List<AppletInfo> applets;
    private final String name;

    public ReaderInfo(Parcel parcel) {
        LinkedList linkedList = new LinkedList();
        this.applets = linkedList;
        this.name = parcel.readString();
        parcel.readList(linkedList, AppletInfo.class.getClassLoader());
    }

    public void addApplet(String str, int i) {
        this.applets.add(new AppletInfo(str, i));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<AppletInfo> getApplets() {
        return Collections.unmodifiableList(this.applets);
    }

    public String getName() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeList(this.applets);
    }

    public static class AppletInfo implements Parcelable {
        public static final Parcelable.Creator<AppletInfo> CREATOR = new Parcelable.Creator<AppletInfo>() { // from class: ru.CryptoPro.JCSP.tools.common.window.ReaderInfo.AppletInfo.1
            @Override // android.os.Parcelable.Creator
            public AppletInfo createFromParcel(Parcel parcel) {
                return new AppletInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public AppletInfo[] newArray(int i) {
                return new AppletInfo[i];
            }
        };
        private final int index;
        private final String name;

        public AppletInfo(Parcel parcel) {
            this.name = parcel.readString();
            this.index = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getIndex() {
            return this.index;
        }

        public String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeInt(this.index);
        }

        public AppletInfo(String str, int i) {
            this.name = str;
            this.index = i;
        }
    }

    public ReaderInfo(String str) {
        this.applets = new LinkedList();
        this.name = str;
    }
}
