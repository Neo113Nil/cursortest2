package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fhi {
    public final String a;
    public final String b;
    public final ghi c;
    public final List d;
    public final dou e;
    public final lhi f;

    public fhi(String str, String str2, ghi ghiVar, List list, dou douVar, lhi lhiVar) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = ghiVar;
        this.d = list;
        this.e = douVar;
        this.f = lhiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhi)) {
            return false;
        }
        fhi fhiVar = (fhi) obj;
        return this.a.equals(fhiVar.a) && Intrinsics.d(this.b, fhiVar.b) && this.c.equals(fhiVar.c) && Intrinsics.d(this.d, fhiVar.d) && Intrinsics.d(this.e, fhiVar.e) && this.f == fhiVar.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int d = k5r.d((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d);
        dou douVar = this.e;
        return this.f.hashCode() + ((d + (douVar != null ? douVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("MultivibeGroup(id=", this.a, ", name=", this.b, ", owner=");
        m.append(this.c);
        m.append(", members=");
        m.append(this.d);
        m.append(", wave=");
        m.append(this.e);
        m.append(", status=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
