package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.k;
import j$.time.ZonedDateTime;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes5.dex */
public final class us5 implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<us5> CREATOR = new kg4(8);
    private static final long serialVersionUID = 124;
    public final String a;
    public final List b;
    public final String c;
    public final List d;
    public final uy5 e;
    public final String f;
    public final Integer g;
    public final ZonedDateTime h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final List m;
    public final String n;
    public final String o;
    public final String p;
    public final ru5 q;
    public final co6 r;

    public us5(String str, List list, String str2, List list2, uy5 uy5Var, String str3, Integer num, ZonedDateTime zonedDateTime, String str4, String str5, String str6, String str7, List list3, String str8, String str9, String str10, ru5 ru5Var) {
        str.getClass();
        list.getClass();
        str2.getClass();
        list2.getClass();
        zonedDateTime.getClass();
        str4.getClass();
        list3.getClass();
        ru5Var.getClass();
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = list2;
        this.e = uy5Var;
        this.f = str3;
        this.g = num;
        this.h = zonedDateTime;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = list3;
        this.n = str8;
        this.o = str9;
        this.p = str10;
        this.q = ru5Var;
        CoverPath coverPath = (CoverPath) CollectionsKt.firstOrNull(list2);
        if (coverPath == null) {
            coverPath = CoverPath.none();
            coverPath.getClass();
        }
        this.r = new co6(coverPath, qo6.f, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us5)) {
            return false;
        }
        us5 us5Var = (us5) obj;
        return Intrinsics.d(this.a, us5Var.a) && Intrinsics.d(this.b, us5Var.b) && Intrinsics.d(this.c, us5Var.c) && Intrinsics.d(this.d, us5Var.d) && Intrinsics.d(this.e, us5Var.e) && Intrinsics.d(this.f, us5Var.f) && Intrinsics.d(this.g, us5Var.g) && Intrinsics.d(this.h, us5Var.h) && Intrinsics.d(this.i, us5Var.i) && Intrinsics.d(this.j, us5Var.j) && Intrinsics.d(this.k, us5Var.k) && Intrinsics.d(this.l, us5Var.l) && Intrinsics.d(this.m, us5Var.m) && Intrinsics.d(this.n, us5Var.n) && Intrinsics.d(this.o, us5Var.o) && Intrinsics.d(this.p, us5Var.p) && Intrinsics.d(this.q, us5Var.q);
    }

    public final int hashCode() {
        int d = k5r.d(k5r.c(k5r.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        uy5 uy5Var = this.e;
        int hashCode = (d + (uy5Var == null ? 0 : uy5Var.hashCode())) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.g;
        int c = k5r.c((this.h.hashCode() + ((hashCode2 + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.i);
        String str2 = this.j;
        int hashCode3 = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        int d2 = k5r.d((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.m);
        String str5 = this.n;
        int hashCode5 = (d2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.o;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.p;
        return this.q.a.hashCode() + ((hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = ouj.v("Concert(id=", this.a, ", metroStations=", ", title=", this.b);
        v.append(this.c);
        v.append(", images=");
        v.append(this.d);
        v.append(", minPrice=");
        v.append(this.e);
        v.append(", cashback=");
        v.append(this.f);
        v.append(", cashbackPercentValue=");
        v.append(this.g);
        v.append(", date=");
        v.append(this.h);
        v.append(", city=");
        su4.v(v, this.i, ", place=", this.j, ", address=");
        su4.v(v, this.k, ", contentRating=", this.l, ", popularConcerts=");
        v.append(this.m);
        v.append(", dataSessionId=");
        v.append(this.n);
        v.append(", mapCoverUrl=");
        su4.v(v, this.o, ", mapUrl=", this.p, ", eventInfo=");
        v.append(this.q);
        v.append(")");
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        Iterator n = f1d.n(parcel, this.b);
        while (n.hasNext()) {
            ((f5i) n.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.c);
        Iterator n2 = f1d.n(parcel, this.d);
        while (n2.hasNext()) {
            parcel.writeParcelable((Parcelable) n2.next(), i);
        }
        uy5 uy5Var = this.e;
        if (uy5Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uy5Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f);
        Integer num = this.g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            k.v(parcel, 1, num);
        }
        parcel.writeSerializable(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        Iterator n3 = f1d.n(parcel, this.m);
        while (n3.hasNext()) {
            ((us5) n3.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        ru5 ru5Var = this.q;
        ru5Var.getClass();
        parcel.writeString(ru5Var.a);
    }
}
