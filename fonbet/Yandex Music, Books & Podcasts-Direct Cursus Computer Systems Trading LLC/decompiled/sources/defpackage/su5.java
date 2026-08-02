package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class su5 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<su5> CREATOR;
    public static final hs4 b;
    public static final su5 c;
    public static final /* synthetic */ su5[] d;
    public static final /* synthetic */ rdb e;
    public final String a;

    static {
        su5 su5Var = new su5("CONCERT", 0, "concert");
        su5 su5Var2 = new su5("FESTIVAL", 1, "festival");
        su5 su5Var3 = new su5("TRIBUTE", 2, "tribute");
        su5 su5Var4 = new su5("MUSICAL", 3, "musical");
        su5 su5Var5 = new su5("UNSPECIFIED", 4, "unspecified");
        c = su5Var5;
        su5[] su5VarArr = {su5Var, su5Var2, su5Var3, su5Var4, su5Var5};
        d = su5VarArr;
        e = new rdb(su5VarArr);
        b = new hs4(18);
        CREATOR = new kg4(11);
    }

    public su5(String str, int i, String str2) {
        this.a = str2;
    }

    public static su5 valueOf(String str) {
        return (su5) Enum.valueOf(su5.class, str);
    }

    public static su5[] values() {
        return (su5[]) d.clone();
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
