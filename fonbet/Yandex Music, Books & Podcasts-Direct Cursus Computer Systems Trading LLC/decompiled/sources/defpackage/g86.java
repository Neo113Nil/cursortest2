package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g86 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<g86> CREATOR;
    public static final g86 a;
    public static final g86 b;
    public static final /* synthetic */ g86[] c;

    /* JADX INFO: Fake field, exist only in values array */
    g86 EF0;

    static {
        g86 g86Var = new g86("ENABLED", 0);
        g86 g86Var2 = new g86("DISABLED", 1);
        a = g86Var2;
        g86 g86Var3 = new g86("AUTOMATIC", 2);
        b = g86Var3;
        c = new g86[]{g86Var, g86Var2, g86Var3};
        CREATOR = new kg4(13);
    }

    public static g86 valueOf(String str) {
        return (g86) Enum.valueOf(g86.class, str);
    }

    public static g86[] values() {
        return (g86[]) c.clone();
    }

    public final boolean a(ugk ugkVar) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return false;
        }
        if (ordinal == 2) {
            return ugkVar.a;
        }
        b6e.s();
        return false;
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
