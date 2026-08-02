package ru.yandex.music.data.stores;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import defpackage.do6;
import defpackage.el6;
import defpackage.qgj;
import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class CoverPath implements Parcelable, Serializable {
    public static final String COVER_EXTRA = "extra.cover";
    private static final long serialVersionUID = -2128790691211383801L;
    protected el6 mCopyrightInfo;
    protected final String mUri;

    public CoverPath(Parcel parcel) {
        this.mUri = parcel.readString();
        this.mCopyrightInfo = (el6) parcel.readSerializable();
    }

    @NonNull
    public static CoverPath none() {
        return qgj.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoverPath)) {
            return false;
        }
        String str = this.mUri;
        String str2 = ((CoverPath) obj).mUri;
        return str == null ? str2 == null : str.equals(str2);
    }

    public el6 getCopyrightInfo() {
        return this.mCopyrightInfo;
    }

    @NonNull
    public abstract String getPathForSize(int i);

    @NonNull
    public abstract do6 getType();

    public String getUri() {
        return this.mUri;
    }

    public boolean hasCover() {
        return this.mUri != null;
    }

    public int hashCode() {
        String str = this.mUri;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public void setCopyrightInfo(el6 el6Var) {
        this.mCopyrightInfo = el6Var;
    }

    public String toString() {
        return "CoverPath{mUri='" + this.mUri + "', mCopyrightInfo=" + this.mCopyrightInfo + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUri);
        parcel.writeSerializable(this.mCopyrightInfo);
    }

    public CoverPath(String str) {
        this.mUri = str;
    }
}
