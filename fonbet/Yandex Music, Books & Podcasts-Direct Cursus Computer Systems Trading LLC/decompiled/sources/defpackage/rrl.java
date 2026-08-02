package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class rrl implements Parcelable, Serializable, nu1 {

    @NotNull
    public static final Parcelable.Creator<rrl> CREATOR = new tgk(16);
    private static final long serialVersionUID = 1;
    public final cvl a;
    public final List b;
    public final List c;

    public rrl(cvl cvlVar, List list, List list2) {
        cvlVar.getClass();
        list.getClass();
        this.a = cvlVar;
        this.b = list;
        this.c = list2;
    }

    @Override // defpackage.nu1
    public final ou1 W() {
        this.a.getClass();
        return ou1.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrl)) {
            return false;
        }
        rrl rrlVar = (rrl) obj;
        return Intrinsics.d(this.a, rrlVar.a) && Intrinsics.d(this.b, rrlVar.b) && Intrinsics.d(this.c, rrlVar.c);
    }

    public final int hashCode() {
        int d = k5r.d(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        return d + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Playlist(header=");
        sb.append(this.a);
        sb.append(", tracks=");
        sb.append(this.b);
        sb.append(", fullTracks=");
        return vz1.u(sb, this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        Iterator n = f1d.n(parcel, this.b);
        while (n.hasNext()) {
            ((t2m) n.next()).writeToParcel(parcel, i);
        }
        List list = this.c;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator v = hrg.v(parcel, 1, list);
        while (v.hasNext()) {
            ((mqs) v.next()).writeToParcel(parcel, i);
        }
    }
}
