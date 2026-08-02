package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class zee implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<zee> CREATOR;
    public static final zee a;
    public static final /* synthetic */ zee[] b;

    static {
        zee zeeVar = new zee("Paywall", 0);
        a = zeeVar;
        b = new zee[]{zeeVar, new zee("Profile", 1)};
        CREATOR = new a5c(23);
    }

    public static zee valueOf(String str) {
        return (zee) Enum.valueOf(zee.class, str);
    }

    public static zee[] values() {
        return (zee[]) b.clone();
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
