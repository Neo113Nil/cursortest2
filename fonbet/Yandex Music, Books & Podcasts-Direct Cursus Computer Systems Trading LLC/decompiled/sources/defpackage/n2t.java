package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.DrmType;

/* loaded from: classes6.dex */
public final class n2t {
    public final String a;
    public final String b;
    public final wt0 c;
    public final Map d;
    public final String e;
    public final String f;
    public final List g;
    public final Map h;
    public final String i;
    public final DrmType j;
    public final int k;
    public final Set l;
    public final String m;
    public final LinkedHashMap n;

    public n2t(String str, String str2, wt0 wt0Var, Map map, String str3, String str4, List list, Map map2, String str5, DrmType drmType, int i, Set set, String str6) {
        wt0Var.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = wt0Var;
        this.d = map;
        this.e = str3;
        this.f = str4;
        this.g = list;
        this.h = map2;
        this.i = str5;
        this.j = drmType;
        this.k = i;
        this.l = set;
        this.m = str6;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("displays", set);
        this.n = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2t)) {
            return false;
        }
        n2t n2tVar = (n2t) obj;
        return this.a.equals(n2tVar.a) && this.b.equals(n2tVar.b) && Intrinsics.d(this.c, n2tVar.c) && Intrinsics.d(this.d, n2tVar.d) && Intrinsics.d(this.e, n2tVar.e) && Intrinsics.d(this.f, n2tVar.f) && Intrinsics.d(this.g, n2tVar.g) && Intrinsics.d(this.h, n2tVar.h) && Intrinsics.d(this.i, n2tVar.i) && this.j == n2tVar.j && this.k == n2tVar.k && Intrinsics.d(this.l, n2tVar.l) && Intrinsics.d(this.m, n2tVar.m);
    }

    public final int hashCode() {
        int b = f1d.b(this.d, (this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.g;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.h;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.i;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DrmType drmType = this.j;
        int a = f1d.a(this.k, (hashCode5 + (drmType == null ? 0 : drmType.hashCode())) * 31, 31);
        Set set = this.l;
        int hashCode6 = (a + (set == null ? 0 : set.hashCode())) * 31;
        String str4 = this.m;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackingCommonArguments(service=");
        sb.append(this.a);
        sb.append(", vsid=");
        sb.append(this.b);
        sb.append(", appInfo=");
        sb.append(this.c);
        sb.append(", deviceInfo=");
        sb.append(this.d);
        sb.append(", puid=");
        sb.append(this.e);
        sb.append(", slots=");
        sb.append(this.f);
        sb.append(", testIds=");
        sb.append(this.g);
        sb.append(", additionalParameters=");
        sb.append(this.h);
        sb.append(", from=");
        sb.append(this.i);
        sb.append(", drmType=");
        sb.append(this.j);
        sb.append(", playerIndex=");
        sb.append(this.k);
        sb.append(", displayInfo=");
        sb.append(this.l);
        sb.append(", vpuid=");
        return dfi.i(sb, this.m, ')');
    }
}
