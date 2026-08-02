package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e8o implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<e8o> CREATOR;
    public static final e8o a;
    public static final e8o b;
    public static final /* synthetic */ e8o[] c;

    static {
        e8o e8oVar = new e8o("SUCCESS", 0);
        a = e8oVar;
        e8o e8oVar2 = new e8o("FAILURE", 1);
        b = e8oVar2;
        c = new e8o[]{e8oVar, e8oVar2};
        CREATOR = new s2m(12);
    }

    public static e8o valueOf(String str) {
        return (e8o) Enum.valueOf(e8o.class, str);
    }

    public static e8o[] values() {
        return (e8o[]) c.clone();
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
