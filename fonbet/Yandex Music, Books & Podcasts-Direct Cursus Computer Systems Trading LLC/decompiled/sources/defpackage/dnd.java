package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class dnd implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<dnd> CREATOR = new a5c(13);
    public static final dnd b = new dnd(u75.h("VISA", "MASTERCARD"));
    public final List a;

    public dnd(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeStringList(this.a);
    }
}
