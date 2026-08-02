package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o15 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<o15> CREATOR;
    public static final o15 a;
    public static final o15 b;
    public static final /* synthetic */ o15[] c;

    static {
        o15 o15Var = new o15("AUDIOBOOK", 0);
        a = o15Var;
        o15 o15Var2 = new o15("PODCAST", 1);
        b = o15Var2;
        c = new o15[]{o15Var, o15Var2};
        CREATOR = new kg4(3);
    }

    public static o15 valueOf(String str) {
        return (o15) Enum.valueOf(o15.class, str);
    }

    public static o15[] values() {
        return (o15[]) c.clone();
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
