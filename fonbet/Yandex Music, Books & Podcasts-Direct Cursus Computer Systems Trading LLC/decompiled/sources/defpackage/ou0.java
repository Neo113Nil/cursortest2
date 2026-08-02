package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ou0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ou0> CREATOR;
    public static final klx a;
    public static final xdr b;
    public static final ou0 c;
    public static final ou0 d;
    public static final /* synthetic */ ou0[] e;

    static {
        ou0 ou0Var = new ou0("DARK", 0);
        c = ou0Var;
        ou0 ou0Var2 = new ou0("LIGHT", 1);
        d = ou0Var2;
        e = new ou0[]{ou0Var, ou0Var2};
        a = new klx(13);
        CREATOR = new l(21);
        b = ydr.a(null);
    }

    public static ou0 valueOf(String str) {
        return (ou0) Enum.valueOf(ou0.class, str);
    }

    public static ou0[] values() {
        return (ou0[]) e.clone();
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
