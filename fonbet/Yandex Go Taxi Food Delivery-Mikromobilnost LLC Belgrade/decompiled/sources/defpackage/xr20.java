package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lxr20;", "", "Companion", "vr20", "wr20", "datastore"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class xr20 {
    public static final wr20 Companion = new wr20();
    public static final i3y[] q;
    public final String a;
    public final String b;
    public final tn20 c;
    public final String d;
    public final Integer e;
    public final dp20 f;
    public final List g;
    public final List h;
    public final em20 i;
    public final cs20 j;
    public final kp20 k;
    public final Map l;
    public final Map m;
    public final Set n;
    public final tm20 o;
    public final List p;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        q = new i3y[]{null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new um20(7)), a.b(lazyThreadSafetyMode, new um20(8)), null, null, null, a.b(lazyThreadSafetyMode, new um20(9)), a.b(lazyThreadSafetyMode, new um20(10)), a.b(lazyThreadSafetyMode, new um20(11)), null, a.b(lazyThreadSafetyMode, new um20(12))};
    }

    public /* synthetic */ xr20(int i, String str, String str2, tn20 tn20Var, String str3, Integer num, dp20 dp20Var, List list, List list2, em20 em20Var, cs20 cs20Var, kp20 kp20Var, Map map, Map map2, Set set, tm20 tm20Var, List list3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = tn20Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = dp20Var;
        }
        int i2 = i & 64;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.g = emptyList;
        } else {
            this.g = list;
        }
        if ((i & 128) == 0) {
            this.h = emptyList;
        } else {
            this.h = list2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = em20Var;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = cs20Var;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = kp20Var;
        }
        if ((i & 2048) == 0) {
            this.l = b.f();
        } else {
            this.l = map;
        }
        this.m = (i & 4096) == 0 ? b.f() : map2;
        this.n = (i & 8192) == 0 ? EmptySet.a : set;
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = tm20Var;
        }
        if ((i & 32768) == 0) {
            this.p = emptyList;
        } else {
            this.p = list3;
        }
    }

    public static xr20 a(xr20 xr20Var, String str, String str2, tn20 tn20Var, String str3, Integer num, dp20 dp20Var, List list, List list2, em20 em20Var, cs20 cs20Var, kp20 kp20Var, Map map, Map map2, Set set, tm20 tm20Var, List list3, int i) {
        String str4 = (i & 1) != 0 ? xr20Var.a : str;
        String str5 = (i & 2) != 0 ? xr20Var.b : str2;
        tn20 tn20Var2 = (i & 4) != 0 ? xr20Var.c : tn20Var;
        String str6 = (i & 8) != 0 ? xr20Var.d : str3;
        Integer num2 = (i & 16) != 0 ? xr20Var.e : num;
        dp20 dp20Var2 = (i & 32) != 0 ? xr20Var.f : dp20Var;
        List list4 = (i & 64) != 0 ? xr20Var.g : list;
        List list5 = (i & 128) != 0 ? xr20Var.h : list2;
        em20 em20Var2 = (i & 256) != 0 ? xr20Var.i : em20Var;
        cs20 cs20Var2 = (i & 512) != 0 ? xr20Var.j : cs20Var;
        kp20 kp20Var2 = (i & 1024) != 0 ? xr20Var.k : kp20Var;
        Map map3 = (i & 2048) != 0 ? xr20Var.l : map;
        Map map4 = (i & 4096) != 0 ? xr20Var.m : map2;
        Set set2 = (i & 8192) != 0 ? xr20Var.n : set;
        String str7 = str4;
        tm20 tm20Var2 = (i & 16384) != 0 ? xr20Var.o : tm20Var;
        List list6 = (i & 32768) != 0 ? xr20Var.p : list3;
        xr20Var.getClass();
        return new xr20(str7, str5, tn20Var2, str6, num2, dp20Var2, list4, list5, em20Var2, cs20Var2, kp20Var2, map3, map4, set2, tm20Var2, list6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr20)) {
            return false;
        }
        xr20 xr20Var = (xr20) obj;
        return jl40.l(this.a, xr20Var.a) && jl40.l(this.b, xr20Var.b) && jl40.l(this.c, xr20Var.c) && jl40.l(this.d, xr20Var.d) && jl40.l(this.e, xr20Var.e) && jl40.l(this.f, xr20Var.f) && jl40.l(this.g, xr20Var.g) && jl40.l(this.h, xr20Var.h) && jl40.l(this.i, xr20Var.i) && jl40.l(this.j, xr20Var.j) && jl40.l(this.k, xr20Var.k) && jl40.l(this.l, xr20Var.l) && jl40.l(this.m, xr20Var.m) && jl40.l(this.n, xr20Var.n) && jl40.l(this.o, xr20Var.o) && jl40.l(this.p, xr20Var.p);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        tn20 tn20Var = this.c;
        int hashCode3 = (hashCode2 + (tn20Var == null ? 0 : tn20Var.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        dp20 dp20Var = this.f;
        int c = unr0.c(unr0.c((hashCode5 + (dp20Var == null ? 0 : dp20Var.hashCode())) * 31, 31, this.g), 31, this.h);
        em20 em20Var = this.i;
        int hashCode6 = (c + (em20Var == null ? 0 : em20Var.hashCode())) * 31;
        cs20 cs20Var = this.j;
        int hashCode7 = (hashCode6 + (cs20Var == null ? 0 : cs20Var.hashCode())) * 31;
        kp20 kp20Var = this.k;
        int e = g8e.e(this.n, unr0.d(unr0.d((hashCode7 + (kp20Var == null ? 0 : kp20Var.hashCode())) * 31, 31, this.l), 31, this.m), 31);
        tm20 tm20Var = this.o;
        return this.p.hashCode() + ((e + (tm20Var != null ? tm20Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("MobStorageData(mobId=", this.a, ", countryIso=", this.b, ", currentContourState=");
        v.append(this.c);
        v.append(", ipToGeoCountryIso=");
        v.append(this.d);
        v.append(", notificationsPollingInterval=");
        v.append(this.e);
        v.append(", metricaData=");
        v.append(this.f);
        v.append(", notifications=");
        nnm.w(v, this.g, ", hostsForDetailReport=", this.h, ", availabilityReportState=");
        v.append(this.i);
        v.append(", vpnState=");
        v.append(this.j);
        v.append(", networkTypeState=");
        v.append(this.k);
        v.append(", cronJobStates=");
        v.append(this.l);
        v.append(", triggerJobStates=");
        v.append(this.m);
        v.append(", completedConfigMigrationTags=");
        v.append(this.n);
        v.append(", config=");
        v.append(this.o);
        v.append(", selectedProxies=");
        v.append(this.p);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public xr20() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 65535);
    }

    public xr20(String str, String str2, tn20 tn20Var, String str3, Integer num, dp20 dp20Var, List list, List list2, em20 em20Var, cs20 cs20Var, kp20 kp20Var, Map map, Map map2, Set set, tm20 tm20Var, List list3) {
        this.a = str;
        this.b = str2;
        this.c = tn20Var;
        this.d = str3;
        this.e = num;
        this.f = dp20Var;
        this.g = list;
        this.h = list2;
        this.i = em20Var;
        this.j = cs20Var;
        this.k = kp20Var;
        this.l = map;
        this.m = map2;
        this.n = set;
        this.o = tm20Var;
        this.p = list3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ xr20(String str, String str2, String str3, Integer num, dp20 dp20Var, List list, List list2, em20 em20Var, cs20 cs20Var, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, tm20 tm20Var, List list3, int i) {
        this(r4, r5, null, r7, r8, r9, r1 != 0 ? r3 : list, (i & 128) != 0 ? r3 : list2, (i & 256) != 0 ? null : em20Var, (i & 512) != 0 ? null : cs20Var, null, (i & 2048) != 0 ? b.f() : linkedHashMap, (i & 4096) != 0 ? b.f() : linkedHashMap2, EmptySet.a, (i & 16384) != 0 ? null : tm20Var, (i & 32768) != 0 ? r3 : list3);
        String str4 = (i & 1) != 0 ? null : str;
        String str5 = (i & 2) != 0 ? null : str2;
        String str6 = (i & 8) != 0 ? null : str3;
        Integer num2 = (i & 16) != 0 ? null : num;
        dp20 dp20Var2 = (i & 32) != 0 ? null : dp20Var;
        int i2 = i & 64;
        EmptyList emptyList = EmptyList.a;
    }
}
