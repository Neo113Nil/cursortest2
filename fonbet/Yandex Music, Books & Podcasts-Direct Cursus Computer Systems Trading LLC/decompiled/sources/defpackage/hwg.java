package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hwg implements kwg {

    @NotNull
    public static final Parcelable.Creator<hwg> CREATOR = new pnf(9);
    public final lt a;
    public final boolean b;
    public final List c;

    public hwg(lt ltVar, List list, boolean z) {
        ltVar.getClass();
        this.a = ltVar;
        this.b = z;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
        List list = this.c;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator v = hrg.v(parcel, 1, list);
        while (v.hasNext()) {
            parcel.writeParcelable((Parcelable) v.next(), i);
        }
    }
}
