package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e8u implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<e8u> CREATOR = new b3s(22);
    public final List a;
    public final List b;
    public final int c;
    public final wmn d;

    public e8u(List list, List list2, int i, wmn wmnVar) {
        wmnVar.getClass();
        this.a = list;
        this.b = list2;
        this.c = i;
        this.d = wmnVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        List list = this.a;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator v = hrg.v(parcel, 1, list);
            while (v.hasNext()) {
                parcel.writeParcelable((Parcelable) v.next(), i);
            }
        }
        parcel.writeStringList(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d.name());
    }
}
