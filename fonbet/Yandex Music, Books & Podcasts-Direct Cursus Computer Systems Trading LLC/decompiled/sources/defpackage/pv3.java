package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class pv3 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<pv3> CREATOR = new i02(17);
    public static final pv3 c;
    public final List a;
    public final String b;

    static {
        ArrayList arrayList = new ArrayList();
        c = arrayList.isEmpty() ? new pv3(null, null) : new pv3(null, arrayList);
    }

    public pv3(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
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
                parcel.writeSerializable((Serializable) v.next());
            }
        }
        parcel.writeString(this.b);
    }
}
