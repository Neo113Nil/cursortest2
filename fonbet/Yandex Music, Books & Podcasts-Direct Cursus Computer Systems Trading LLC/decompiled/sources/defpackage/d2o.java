package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d2o implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<d2o> CREATOR;
    public static final d2o a;
    public static final d2o b;
    public static final d2o c;
    public static final /* synthetic */ d2o[] d;

    static {
        d2o d2oVar = new d2o("Expanded", 0);
        a = d2oVar;
        d2o d2oVar2 = new d2o("HalfExpanded", 1);
        b = d2oVar2;
        d2o d2oVar3 = new d2o("Closed", 2);
        c = d2oVar3;
        d = new d2o[]{d2oVar, d2oVar2, d2oVar3};
        CREATOR = new s2m(11);
    }

    public static d2o valueOf(String str) {
        return (d2o) Enum.valueOf(d2o.class, str);
    }

    public static d2o[] values() {
        return (d2o[]) d.clone();
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
