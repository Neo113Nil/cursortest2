package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes5.dex */
public final class x1u implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<x1u> CREATOR = new b3s(21);
    public final String a;
    public final String b;
    public final String c;
    public final CoverPath d;
    public final String e;
    public final long f;
    public final List g;
    public final List h;
    public final boolean i;
    public final List j;
    public final List k;
    public final j1g l;
    public final Date m;
    public final jzb n;
    public final co6 o;

    public x1u(String str, String str2, String str3, CoverPath coverPath, String str4, long j, List list, List list2, boolean z, List list3, List list4, j1g j1gVar, Date date) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        coverPath.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = coverPath;
        this.e = str4;
        this.f = j;
        this.g = list;
        this.h = list2;
        this.i = z;
        this.j = list3;
        this.k = list4;
        this.l = j1gVar;
        this.m = date;
        jzb.b.getClass();
        this.n = h1b.K(list3, list4);
        this.o = new co6(coverPath, qo6.j, null);
    }

    public static x1u a(x1u x1uVar, j1g j1gVar, Date date) {
        String str = x1uVar.a;
        String str2 = x1uVar.b;
        String str3 = x1uVar.c;
        CoverPath coverPath = x1uVar.d;
        String str4 = x1uVar.e;
        long j = x1uVar.f;
        List list = x1uVar.g;
        List list2 = x1uVar.h;
        boolean z = x1uVar.i;
        List list3 = x1uVar.j;
        List list4 = x1uVar.k;
        x1uVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        coverPath.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        return new x1u(str, str2, str3, coverPath, str4, j, list, list2, z, list3, list4, j1gVar, date);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1u)) {
            return false;
        }
        x1u x1uVar = (x1u) obj;
        return Intrinsics.d(this.a, x1uVar.a) && Intrinsics.d(this.b, x1uVar.b) && Intrinsics.d(this.c, x1uVar.c) && Intrinsics.d(this.d, x1uVar.d) && Intrinsics.d(this.e, x1uVar.e) && this.f == x1uVar.f && Intrinsics.d(this.g, x1uVar.g) && Intrinsics.d(this.h, x1uVar.h) && this.i == x1uVar.i && Intrinsics.d(this.j, x1uVar.j) && Intrinsics.d(this.k, x1uVar.k) && this.l == x1uVar.l && Intrinsics.d(this.m, x1uVar.m);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        String str = this.e;
        int d = k5r.d(k5r.d(k5r.e(k5r.d(k5r.d(tlm.c(this.f, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        j1g j1gVar = this.l;
        int hashCode2 = (d + (j1gVar == null ? 0 : j1gVar.hashCode())) * 31;
        Date date = this.m;
        return hashCode2 + (date != null ? date.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("VideoClip(id=", this.a, ", title=", this.b, ", playerId=");
        m.append(this.c);
        m.append(", thumbnail=");
        m.append(this.d);
        m.append(", previewUrl=");
        m.append(this.e);
        m.append(", duration=");
        m.append(this.f);
        m.append(", trackIds=");
        m.append(this.g);
        m.append(", artists=");
        m.append(this.h);
        m.append(", explicit=");
        m.append(this.i);
        m.append(", disclaimersOld=");
        m.append(this.j);
        m.append(", disclaimers=");
        m.append(this.k);
        m.append(", likeState=");
        m.append(this.l);
        m.append(", likeTimestamp=");
        m.append(this.m);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeLong(this.f);
        parcel.writeStringList(this.g);
        Iterator n = f1d.n(parcel, this.h);
        while (n.hasNext()) {
            ((c01) n.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.i ? 1 : 0);
        Iterator n2 = f1d.n(parcel, this.j);
        while (n2.hasNext()) {
            parcel.writeString(((h94) n2.next()).name());
        }
        Iterator n3 = f1d.n(parcel, this.k);
        while (n3.hasNext()) {
            ((hs5) n3.next()).writeToParcel(parcel, i);
        }
        j1g j1gVar = this.l;
        if (j1gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(j1gVar.name());
        }
        parcel.writeSerializable(this.m);
    }
}
