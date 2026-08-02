package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.persuggest.api.LocationProvider;
import ru.yandex.taxi.persuggest.api.MainScreenVersion;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lv03;", "", "Companion", "r03", "t03", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class v03 {
    public static final i3y[] B;
    public static final t03 Companion = new t03();
    public final List A;
    public final String a;
    public final uc4 b;
    public final List c;
    public final List d;
    public final List e;
    public final String f;
    public final List g;
    public final uc4 h;
    public final Boolean i;
    public final rrx j;
    public final zzs k;
    public final Integer l;
    public final String m;
    public final LocationProvider n;
    public final Double o;
    public final Integer p;
    public final hp40 q;
    public final String r;
    public final fv2 s;
    public final Boolean t;
    public final Boolean u;
    public final Float v;
    public final fe61 w;
    public final MainScreenVersion x;
    public final Map y;
    public final List z;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        B = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new i22(25)), a.b(lazyThreadSafetyMode, new i22(26)), a.b(lazyThreadSafetyMode, new i22(27)), null, a.b(lazyThreadSafetyMode, new i22(28)), null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new i22(29)), null, null, null, null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new q03(0)), a.b(lazyThreadSafetyMode, new q03(1)), a.b(lazyThreadSafetyMode, new q03(2)), a.b(lazyThreadSafetyMode, new q03(3))};
    }

    public /* synthetic */ v03(int i, String str, uc4 uc4Var, List list, List list2, List list3, String str2, List list4, uc4 uc4Var2, Boolean bool, rrx rrxVar, zzs zzsVar, Integer num, String str3, LocationProvider locationProvider, Double d, Integer num2, hp40 hp40Var, String str4, fv2 fv2Var, Boolean bool2, Boolean bool3, Float f, fe61 fe61Var, MainScreenVersion mainScreenVersion, Map map, List list5, List list6) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = uc4Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = uc4Var2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = rrxVar;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = zzsVar;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str3;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = locationProvider;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = d;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = num2;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = hp40Var;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = str4;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = fv2Var;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = bool2;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = bool3;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = f;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = fe61Var;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = mainScreenVersion;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = map;
        }
        if ((33554432 & i) == 0) {
            this.z = null;
        } else {
            this.z = list5;
        }
        if ((i & SelfTester_JCP.DECRYPT_CBC) == 0) {
            this.A = null;
        } else {
            this.A = list6;
        }
    }

    public static v03 a(v03 v03Var, List list, List list2, int i) {
        List list3;
        List list4;
        String str = v03Var.a;
        uc4 uc4Var = (i & 2) != 0 ? v03Var.b : null;
        List list5 = (i & 4) != 0 ? v03Var.c : list;
        List list6 = v03Var.d;
        List list7 = v03Var.e;
        String str2 = v03Var.f;
        List list8 = v03Var.g;
        uc4 uc4Var2 = v03Var.h;
        Boolean bool = v03Var.i;
        rrx rrxVar = v03Var.j;
        zzs zzsVar = v03Var.k;
        Integer num = v03Var.l;
        String str3 = v03Var.m;
        LocationProvider locationProvider = v03Var.n;
        Double d = v03Var.o;
        Integer num2 = v03Var.p;
        hp40 hp40Var = v03Var.q;
        String str4 = v03Var.r;
        fv2 fv2Var = v03Var.s;
        Boolean bool2 = v03Var.t;
        Boolean bool3 = v03Var.u;
        Float f = v03Var.v;
        fe61 fe61Var = v03Var.w;
        MainScreenVersion mainScreenVersion = v03Var.x;
        Map map = v03Var.y;
        List list9 = v03Var.z;
        if ((i & SelfTester_JCP.DECRYPT_CBC) != 0) {
            list3 = list9;
            list4 = v03Var.A;
        } else {
            list3 = list9;
            list4 = list2;
        }
        v03Var.getClass();
        return new v03(str, uc4Var, list5, list6, list7, str2, list8, uc4Var2, bool, rrxVar, zzsVar, num, str3, locationProvider, d, num2, hp40Var, str4, fv2Var, bool2, bool3, f, fe61Var, mainScreenVersion, map, list3, list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v03)) {
            return false;
        }
        v03 v03Var = (v03) obj;
        return jl40.l(this.a, v03Var.a) && jl40.l(this.b, v03Var.b) && jl40.l(this.c, v03Var.c) && jl40.l(this.d, v03Var.d) && jl40.l(this.e, v03Var.e) && jl40.l(this.f, v03Var.f) && jl40.l(this.g, v03Var.g) && jl40.l(this.h, v03Var.h) && jl40.l(this.i, v03Var.i) && jl40.l(this.j, v03Var.j) && jl40.l(this.k, v03Var.k) && jl40.l(this.l, v03Var.l) && jl40.l(this.m, v03Var.m) && this.n == v03Var.n && jl40.l(this.o, v03Var.o) && jl40.l(this.p, v03Var.p) && jl40.l(this.q, v03Var.q) && jl40.l(this.r, v03Var.r) && jl40.l(this.s, v03Var.s) && jl40.l(this.t, v03Var.t) && jl40.l(this.u, v03Var.u) && jl40.l(this.v, v03Var.v) && jl40.l(this.w, v03Var.w) && this.x == v03Var.x && jl40.l(this.y, v03Var.y) && jl40.l(this.z, v03Var.z) && jl40.l(this.A, v03Var.A);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        uc4 uc4Var = this.b;
        int hashCode2 = (hashCode + (uc4Var == null ? 0 : uc4Var.hashCode())) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.e;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str2 = this.f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list4 = this.g;
        int hashCode7 = (hashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        uc4 uc4Var2 = this.h;
        int hashCode8 = (hashCode7 + (uc4Var2 == null ? 0 : uc4Var2.hashCode())) * 31;
        Boolean bool = this.i;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        rrx rrxVar = this.j;
        int hashCode10 = (hashCode9 + (rrxVar == null ? 0 : rrxVar.hashCode())) * 31;
        zzs zzsVar = this.k;
        int hashCode11 = (hashCode10 + (zzsVar == null ? 0 : zzsVar.hashCode())) * 31;
        Integer num = this.l;
        int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.m;
        int hashCode13 = (hashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LocationProvider locationProvider = this.n;
        int hashCode14 = (hashCode13 + (locationProvider == null ? 0 : locationProvider.hashCode())) * 31;
        Double d = this.o;
        int hashCode15 = (hashCode14 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.p;
        int hashCode16 = (hashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        hp40 hp40Var = this.q;
        int hashCode17 = (hashCode16 + (hp40Var == null ? 0 : hp40Var.hashCode())) * 31;
        String str4 = this.r;
        int hashCode18 = (hashCode17 + (str4 == null ? 0 : str4.hashCode())) * 31;
        fv2 fv2Var = this.s;
        int hashCode19 = (hashCode18 + (fv2Var == null ? 0 : fv2Var.hashCode())) * 31;
        Boolean bool2 = this.t;
        int hashCode20 = (hashCode19 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.u;
        int hashCode21 = (hashCode20 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Float f = this.v;
        int hashCode22 = (hashCode21 + (f == null ? 0 : f.hashCode())) * 31;
        fe61 fe61Var = this.w;
        int hashCode23 = (hashCode22 + (fe61Var == null ? 0 : fe61Var.hashCode())) * 31;
        MainScreenVersion mainScreenVersion = this.x;
        int hashCode24 = (hashCode23 + (mainScreenVersion == null ? 0 : mainScreenVersion.hashCode())) * 31;
        Map map = this.y;
        int hashCode25 = (hashCode24 + (map == null ? 0 : map.hashCode())) * 31;
        List list5 = this.z;
        int hashCode26 = (hashCode25 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.A;
        return hashCode26 + (list6 != null ? list6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApplicationState(screen=");
        sb.append(this.a);
        sb.append(", bbox=");
        sb.append(this.b);
        sb.append(", coordProviders=");
        nnm.w(sb, this.c, ", wifiNetworks=", this.d, ", mobileCells=");
        oyr.D(", currentMode=", this.f, ", fields=", sb, this.e);
        sb.append(this.g);
        sb.append(", goldBbox=");
        sb.append(this.h);
        sb.append(", hasSpecialRequirements=");
        sb.append(this.i);
        sb.append(", languageInfo=");
        sb.append(this.j);
        sb.append(", location=");
        sb.append(this.k);
        sb.append(", accuracy=");
        sb.append(this.l);
        sb.append(", updateTime=");
        sb.append(this.m);
        sb.append(", locationProvider=");
        sb.append(this.n);
        sb.append(", altitude=");
        sb.append(this.o);
        sb.append(", altitudeAccuracy=");
        sb.append(this.p);
        sb.append(", multiclassOptions=");
        sb.append(this.q);
        sb.append(", selectedClass=");
        sb.append(this.r);
        sb.append(", appMetrica=");
        sb.append(this.s);
        sb.append(", locationAvailable=");
        sb.append(this.t);
        sb.append(", preciseLocationAvailable=");
        sb.append(this.u);
        sb.append(", zoom=");
        sb.append(this.v);
        sb.append(", zones=");
        sb.append(this.w);
        sb.append(", mainScreenVersion=");
        sb.append(this.x);
        sb.append(", actualSelectedRequirements=");
        sb.append(this.y);
        sb.append(", photoCoordinates=");
        sb.append(this.z);
        sb.append(", fingerprint=");
        return ly3.s(sb, this.A, Extension.C_BRAKE);
    }

    public v03() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217727);
    }

    public v03(String str, uc4 uc4Var, List list, List list2, List list3, String str2, List list4, uc4 uc4Var2, Boolean bool, rrx rrxVar, zzs zzsVar, Integer num, String str3, LocationProvider locationProvider, Double d, Integer num2, hp40 hp40Var, String str4, fv2 fv2Var, Boolean bool2, Boolean bool3, Float f, fe61 fe61Var, MainScreenVersion mainScreenVersion, Map map, List list5, List list6) {
        this.a = str;
        this.b = uc4Var;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = str2;
        this.g = list4;
        this.h = uc4Var2;
        this.i = bool;
        this.j = rrxVar;
        this.k = zzsVar;
        this.l = num;
        this.m = str3;
        this.n = locationProvider;
        this.o = d;
        this.p = num2;
        this.q = hp40Var;
        this.r = str4;
        this.s = fv2Var;
        this.t = bool2;
        this.u = bool3;
        this.v = f;
        this.w = fe61Var;
        this.x = mainScreenVersion;
        this.y = map;
        this.z = list5;
        this.A = list6;
    }

    public /* synthetic */ v03(String str, uc4 uc4Var, ArrayList arrayList, List list, List list2, String str2, List list3, Boolean bool, rrx rrxVar, zzs zzsVar, Integer num, String str3, LocationProvider locationProvider, Double d, Integer num2, hp40 hp40Var, String str4, fv2 fv2Var, Boolean bool2, Boolean bool3, Float f, fe61 fe61Var, MainScreenVersion mainScreenVersion, Map map, List list4, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : uc4Var, (i & 4) != 0 ? null : arrayList, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : list3, null, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : rrxVar, (i & 1024) != 0 ? null : zzsVar, (i & 2048) != 0 ? null : num, (i & 4096) != 0 ? null : str3, (i & 8192) != 0 ? null : locationProvider, (i & 16384) != 0 ? null : d, (32768 & i) != 0 ? null : num2, (65536 & i) != 0 ? null : hp40Var, (131072 & i) != 0 ? null : str4, (262144 & i) != 0 ? null : fv2Var, (524288 & i) != 0 ? null : bool2, (1048576 & i) != 0 ? null : bool3, (2097152 & i) != 0 ? null : f, (4194304 & i) != 0 ? null : fe61Var, (8388608 & i) != 0 ? null : mainScreenVersion, (16777216 & i) != 0 ? null : map, (i & SelfTester_JCP.DECRYPT_CFB) != 0 ? null : list4, null);
    }

    public v03(zzs zzsVar, ArrayList arrayList, boolean z) {
        this(null, null, null, null, null, null, arrayList, null, null, zzsVar, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z), null, null, null, null, null, 133166015);
    }
}
