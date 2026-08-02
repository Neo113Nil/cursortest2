package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.qv10;
import defpackage.unr0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class zp1 implements Parcelable {
    public static final vp1 CREATOR = new vp1();
    public final String b;
    public final Map c;
    public final List d;
    public final List e;
    public final List f;
    public final w4 g;
    public final Map h;
    public final xp2 i;

    public zp1(String str, Map map, List list, List list2, List list3, w4 w4Var, Map map2, xp2 xp2Var) {
        this.b = str;
        this.c = map;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = w4Var;
        this.h = map2;
        this.i = xp2Var;
    }

    public final String c() {
        return this.b;
    }

    public final Map d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp1)) {
            return false;
        }
        zp1 zp1Var = (zp1) obj;
        return jl40.l(this.b, zp1Var.b) && jl40.l(this.c, zp1Var.c) && jl40.l(this.d, zp1Var.d) && jl40.l(this.e, zp1Var.e) && jl40.l(this.f, zp1Var.f) && jl40.l(this.g, zp1Var.g) && jl40.l(this.h, zp1Var.h) && jl40.l(this.i, zp1Var.i);
    }

    public final int hashCode() {
        int d = unr0.d(this.b.hashCode() * 31, 31, this.c);
        List list = this.d;
        int hashCode = (d + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        w4 w4Var = this.g;
        int hashCode4 = (hashCode3 + (w4Var == null ? 0 : w4Var.b.hashCode())) * 31;
        Map map = this.h;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        xp2 xp2Var = this.i;
        return hashCode5 + (xp2Var != null ? xp2Var.hashCode() : 0);
    }

    public final String toString() {
        String str = this.b;
        Map map = this.c;
        List list = this.d;
        List list2 = this.e;
        List list3 = this.f;
        w4 w4Var = this.g;
        Map map2 = this.h;
        xp2 xp2Var = this.i;
        StringBuilder sb = new StringBuilder("MediationNetwork(adapter=");
        sb.append(str);
        sb.append(", networkData=");
        sb.append(map);
        sb.append(", impressionTrackingUrls=");
        nnm.w(sb, list, ", clickTrackingUrls=", list2, ", adResponseTrackingUrls=");
        sb.append(list3);
        sb.append(", adImpressionData=");
        sb.append(w4Var);
        sb.append(", biddingInfo=");
        sb.append(map2);
        sb.append(", formatParameters=");
        sb.append(xp2Var);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        vp1 vp1Var = CREATOR;
        Map map = this.c;
        vp1Var.getClass();
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
        parcel.writeStringList(this.d);
        parcel.writeStringList(this.e);
        parcel.writeStringList(this.f);
        parcel.writeParcelable(this.g, i);
        vp1 vp1Var2 = CREATOR;
        Map map2 = this.h;
        vp1Var2.getClass();
        if (map2 == null) {
            parcel.writeInt(-1);
        } else {
            Iterator x = qv10.x(map2, parcel);
            while (x.hasNext()) {
                Map.Entry entry2 = (Map.Entry) x.next();
                String str3 = (String) entry2.getKey();
                String str4 = (String) entry2.getValue();
                parcel.writeString(str3);
                parcel.writeString(str4);
            }
        }
        parcel.writeParcelable(this.i, i);
    }
}
