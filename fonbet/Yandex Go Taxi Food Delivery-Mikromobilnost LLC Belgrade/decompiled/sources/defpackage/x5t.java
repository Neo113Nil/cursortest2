package defpackage;

import com.ybsdk.feature.dashboard.internal.domain.entities.DashboardCardInfoEntity;
import com.ybsdk.feature.dashboard.internal.domain.entities.NextPageLoadingStatus;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class x5t {
    public final List a;
    public final List b;
    public final nhg c;
    public final String d;
    public final skg e;
    public final List f;
    public final String g;
    public final NextPageLoadingStatus h;
    public final DashboardCardInfoEntity i;
    public final phg j;

    public x5t(List list, List list2, nhg nhgVar, String str, skg skgVar, List list3, String str2, NextPageLoadingStatus nextPageLoadingStatus, DashboardCardInfoEntity dashboardCardInfoEntity, phg phgVar) {
        this.a = list;
        this.b = list2;
        this.c = nhgVar;
        this.d = str;
        this.e = skgVar;
        this.f = list3;
        this.g = str2;
        this.h = nextPageLoadingStatus;
        this.i = dashboardCardInfoEntity;
        this.j = phgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    public static x5t a(x5t x5tVar, ArrayList arrayList, ArrayList arrayList2, NextPageLoadingStatus nextPageLoadingStatus, int i) {
        ArrayList arrayList3 = arrayList;
        if ((i & 1) != 0) {
            arrayList3 = x5tVar.a;
        }
        ArrayList arrayList4 = arrayList3;
        List list = x5tVar.b;
        nhg nhgVar = x5tVar.c;
        String str = x5tVar.d;
        skg skgVar = x5tVar.e;
        ArrayList arrayList5 = arrayList2;
        if ((i & 32) != 0) {
            arrayList5 = x5tVar.f;
        }
        ArrayList arrayList6 = arrayList5;
        String str2 = x5tVar.g;
        if ((i & 128) != 0) {
            nextPageLoadingStatus = x5tVar.h;
        }
        DashboardCardInfoEntity dashboardCardInfoEntity = x5tVar.i;
        phg phgVar = x5tVar.j;
        x5tVar.getClass();
        return new x5t(arrayList4, list, nhgVar, str, skgVar, arrayList6, str2, nextPageLoadingStatus, dashboardCardInfoEntity, phgVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5t)) {
            return false;
        }
        x5t x5tVar = (x5t) obj;
        return jl40.l(this.a, x5tVar.a) && jl40.l(this.b, x5tVar.b) && this.c.equals(x5tVar.c) && jl40.l(this.d, x5tVar.d) && jl40.l(this.e, x5tVar.e) && this.f.equals(x5tVar.f) && jl40.l(this.g, x5tVar.g) && this.h == x5tVar.h && jl40.l(this.i, x5tVar.i) && jl40.l(this.j, x5tVar.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        skg skgVar = this.e;
        int c = unr0.c((hashCode3 + (skgVar == null ? 0 : skgVar.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        int hashCode4 = (this.h.hashCode() + ((c + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        DashboardCardInfoEntity dashboardCardInfoEntity = this.i;
        int hashCode5 = (hashCode4 + (dashboardCardInfoEntity == null ? 0 : dashboardCardInfoEntity.hashCode())) * 31;
        phg phgVar = this.j;
        return hashCode5 + (phgVar != null ? phgVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = qv10.v("GetDashboardEntity(itemsDivKit=", this.a, ", fullScreens=", this.b, ", balanceEntity=");
        v.append(this.c);
        v.append(", agreementId=");
        v.append(this.d);
        v.append(", navigationItem=");
        v.append(this.e);
        v.append(", topButtonsList=");
        v.append(this.f);
        v.append(", cursor=");
        v.append(this.g);
        v.append(", nextPageLoadingStatus=");
        v.append(this.h);
        v.append(", cardInfo=");
        v.append(this.i);
        v.append(", bottomButtonEntity=");
        v.append(this.j);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
