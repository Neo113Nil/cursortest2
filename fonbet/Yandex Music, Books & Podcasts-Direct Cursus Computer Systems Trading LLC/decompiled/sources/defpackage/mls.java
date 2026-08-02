package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class mls implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<mls> CREATOR;
    public static final mls a;
    public static final /* synthetic */ mls[] b;

    static {
        mls mlsVar = new mls("TOP", 0);
        a = mlsVar;
        b = new mls[]{mlsVar, new mls("BOTTOM", 1)};
        CREATOR = new b3s(5);
    }

    public static mls valueOf(String str) {
        return (mls) Enum.valueOf(mls.class, str);
    }

    public static mls[] values() {
        return (mls[]) b.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
