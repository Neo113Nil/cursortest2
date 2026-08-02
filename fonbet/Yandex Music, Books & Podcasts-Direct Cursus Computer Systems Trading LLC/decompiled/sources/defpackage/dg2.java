package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class dg2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<dg2> CREATOR;
    public static final ofc a;
    public static final dg2 b;
    public static final dg2 c;
    public static final dg2 d;
    public static final dg2 e;
    public static final /* synthetic */ dg2[] f;

    static {
        dg2 dg2Var = new dg2("OK", 0);
        b = dg2Var;
        dg2 dg2Var2 = new dg2("NOT_AVAILABLE", 1);
        c = dg2Var2;
        dg2 dg2Var3 = new dg2("NOT_FOUND", 2);
        d = dg2Var3;
        dg2 dg2Var4 = new dg2("NO_META", 3);
        e = dg2Var4;
        f = new dg2[]{dg2Var, dg2Var2, dg2Var3, dg2Var4};
        a = new ofc(15);
        CREATOR = new i02(4);
    }

    public static dg2 valueOf(String str) {
        return (dg2) Enum.valueOf(dg2.class, str);
    }

    public static dg2[] values() {
        return (dg2[]) f.clone();
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
