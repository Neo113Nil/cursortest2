package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ujt implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ujt> CREATOR;
    public static final ujt a;
    public static final ujt b;
    public static final /* synthetic */ ujt[] c;

    static {
        ujt ujtVar = new ujt("Common", 0);
        a = ujtVar;
        ujt ujtVar2 = new ujt("MetaTag", 1);
        b = ujtVar2;
        c = new ujt[]{ujtVar, ujtVar2};
        CREATOR = new b3s(14);
    }

    public static ujt valueOf(String str) {
        return (ujt) Enum.valueOf(ujt.class, str);
    }

    public static ujt[] values() {
        return (ujt[]) c.clone();
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
