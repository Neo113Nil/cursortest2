package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class byf implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<byf> CREATOR;
    public static final byf a;
    public static final /* synthetic */ byf[] b;

    /* JADX INFO: Fake field, exist only in values array */
    byf EF0;

    static {
        byf byfVar = new byf("GENERAL", 0);
        byf byfVar2 = new byf("SBP", 1);
        a = byfVar2;
        b = new byf[]{byfVar, byfVar2};
        CREATOR = new pnf(2);
    }

    public static byf valueOf(String str) {
        return (byf) Enum.valueOf(byf.class, str);
    }

    public static byf[] values() {
        return (byf[]) b.clone();
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
