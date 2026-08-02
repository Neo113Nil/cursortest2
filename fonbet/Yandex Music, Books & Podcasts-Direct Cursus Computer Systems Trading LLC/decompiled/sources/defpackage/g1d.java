package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g1d implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<g1d> CREATOR = new a5c(10);
    public final List a;
    public final String b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public g1d(int i, String str, List list, boolean z, boolean z2) {
        list.getClass();
        this.a = list;
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1d)) {
            return false;
        }
        g1d g1dVar = (g1d) obj;
        return Intrinsics.d(this.a, g1dVar.a) && Intrinsics.d(this.b, g1dVar.b) && this.c == g1dVar.c && this.d == g1dVar.d && this.e == g1dVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.e) + k5r.e(f1d.a(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GalleryWidgetScreenArgs(photoList=");
        sb.append(this.a);
        sb.append(", videoUrl=");
        sb.append(this.b);
        sb.append(", initialPage=");
        sb.append(this.c);
        sb.append(", isAutoscrollEnabled=");
        sb.append(this.d);
        sb.append(", isFullscreen=");
        return ouj.r(sb, this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator n = f1d.n(parcel, this.a);
        while (n.hasNext()) {
            parcel.writeParcelable((Parcelable) n.next(), i);
        }
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
