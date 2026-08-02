package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lu6r;", "Llwj0;", "Companion", "s6r", "t6r", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class u6r extends lwj0 {
    public static final t6r Companion = new t6r();
    public static final i3y[] o;
    public final List a;
    public final String b;
    public final List c;
    public final sxq0 d;
    public final k56 e;
    public final pq1 f;
    public final cub0 g;
    public final dde0 h;
    public final List i;
    public final List j;
    public final List k;
    public final h8j0 l;
    public final xa7 m;
    public final String n;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        o = new i3y[]{a.b(lazyThreadSafetyMode, new n6r(1)), null, a.b(lazyThreadSafetyMode, new n6r(2)), null, null, null, null, null, a.b(lazyThreadSafetyMode, new n6r(3)), a.b(lazyThreadSafetyMode, new n6r(4)), a.b(lazyThreadSafetyMode, new n6r(5)), null, null};
    }

    public /* synthetic */ u6r(int i, List list, String str, List list2, sxq0 sxq0Var, k56 k56Var, pq1 pq1Var, cub0 cub0Var, dde0 dde0Var, List list3, List list4, List list5, h8j0 h8j0Var, xa7 xa7Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = sxq0Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = k56Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = pq1Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = cub0Var;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = dde0Var;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list4;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list5;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = h8j0Var;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = xa7Var;
        }
        this.n = null;
    }

    public static u6r g(u6r u6rVar, String str) {
        List list = u6rVar.a;
        String str2 = u6rVar.b;
        List list2 = u6rVar.c;
        sxq0 sxq0Var = u6rVar.d;
        k56 k56Var = u6rVar.e;
        pq1 pq1Var = u6rVar.f;
        cub0 cub0Var = u6rVar.g;
        dde0 dde0Var = u6rVar.h;
        List list3 = u6rVar.i;
        List list4 = u6rVar.j;
        List list5 = u6rVar.k;
        h8j0 h8j0Var = u6rVar.l;
        xa7 xa7Var = u6rVar.m;
        u6rVar.getClass();
        return new u6r(list, str2, list2, sxq0Var, k56Var, pq1Var, cub0Var, dde0Var, list3, list4, list5, h8j0Var, xa7Var, str);
    }

    @Override // defpackage.lwj0
    /* renamed from: e */
    public final zn11 getG() {
        xa7 xa7Var = this.m;
        if (xa7Var != null) {
            return xa7Var.c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6r)) {
            return false;
        }
        u6r u6rVar = (u6r) obj;
        return jl40.l(this.a, u6rVar.a) && jl40.l(this.b, u6rVar.b) && jl40.l(this.c, u6rVar.c) && jl40.l(this.d, u6rVar.d) && jl40.l(this.e, u6rVar.e) && jl40.l(this.f, u6rVar.f) && jl40.l(this.g, u6rVar.g) && jl40.l(this.h, u6rVar.h) && jl40.l(this.i, u6rVar.i) && jl40.l(this.j, u6rVar.j) && jl40.l(this.k, u6rVar.k) && jl40.l(this.l, u6rVar.l) && jl40.l(this.m, u6rVar.m) && jl40.l(this.n, u6rVar.n);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list2 = this.c;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        sxq0 sxq0Var = this.d;
        int hashCode4 = (hashCode3 + (sxq0Var == null ? 0 : sxq0Var.hashCode())) * 31;
        k56 k56Var = this.e;
        int hashCode5 = (hashCode4 + (k56Var == null ? 0 : k56Var.hashCode())) * 31;
        pq1 pq1Var = this.f;
        int hashCode6 = (hashCode5 + (pq1Var == null ? 0 : pq1Var.hashCode())) * 31;
        cub0 cub0Var = this.g;
        int hashCode7 = (hashCode6 + (cub0Var == null ? 0 : cub0Var.hashCode())) * 31;
        dde0 dde0Var = this.h;
        int hashCode8 = (hashCode7 + (dde0Var == null ? 0 : dde0Var.hashCode())) * 31;
        List list3 = this.i;
        int hashCode9 = (hashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.j;
        int hashCode10 = (hashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.k;
        int hashCode11 = (hashCode10 + (list5 == null ? 0 : list5.hashCode())) * 31;
        h8j0 h8j0Var = this.l;
        int hashCode12 = (hashCode11 + (h8j0Var == null ? 0 : h8j0Var.hashCode())) * 31;
        xa7 xa7Var = this.m;
        int hashCode13 = (hashCode12 + (xa7Var == null ? 0 : xa7Var.hashCode())) * 31;
        String str2 = this.n;
        return hashCode13 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = xvz.s("FinalSuggestResponse(points=", this.a, ", pointsIconImageTag=", this.b, ", results=");
        s.append(this.c);
        s.append(", services=");
        s.append(this.d);
        s.append(", zones=");
        s.append(this.e);
        s.append(", alert=");
        s.append(this.f);
        s.append(", pinAlert=");
        s.append(this.g);
        s.append(", positionChoices=");
        s.append(this.h);
        s.append(", immediateActions=");
        nnm.w(s, this.i, ", conditionActions=", this.j, ", conditionalActions=");
        s.append(this.k);
        s.append(", requestPositionInfo=");
        s.append(this.l);
        s.append(", cacheAwareTypedExperiments=");
        s.append(this.m);
        s.append(", traceId=");
        s.append(this.n);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }

    public u6r(List list, String str, List list2, sxq0 sxq0Var, k56 k56Var, pq1 pq1Var, cub0 cub0Var, dde0 dde0Var, List list3, List list4, List list5, h8j0 h8j0Var, xa7 xa7Var, String str2) {
        this.a = list;
        this.b = str;
        this.c = list2;
        this.d = sxq0Var;
        this.e = k56Var;
        this.f = pq1Var;
        this.g = cub0Var;
        this.h = dde0Var;
        this.i = list3;
        this.j = list4;
        this.k = list5;
        this.l = h8j0Var;
        this.m = xa7Var;
        this.n = str2;
    }

    public u6r() {
        this((List) null, (String) null, (List) null, (sxq0) null, (k56) null, (pq1) null, (cub0) null, (dde0) null, (List) null, (List) null, (List) null, (h8j0) null, (xa7) null, (String) null);
    }
}
