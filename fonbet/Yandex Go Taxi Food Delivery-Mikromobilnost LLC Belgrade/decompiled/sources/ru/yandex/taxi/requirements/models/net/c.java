package ru.yandex.taxi.requirements.models.net;

import defpackage.b64;
import defpackage.f1b0;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.hgh;
import defpackage.i3y;
import defpackage.jbj0;
import defpackage.je70;
import defpackage.jl40;
import defpackage.kk4;
import defpackage.nmw0;
import defpackage.noj0;
import defpackage.rej0;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.wej0;
import defpackage.xlw0;
import defpackage.yg70;
import defpackage.ylx0;
import java.util.HashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/requirements/models/net/c;", "", "Companion", "mmw0", "nmw0", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class c {
    public static final nmw0 Companion = new nmw0();
    public static final i3y[] E;
    public final Boolean A;
    public final List B;
    public final noj0 C;
    public HashMap D;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final yg70 g;
    public final boolean h;
    public final Number i;
    public final boolean j;
    public final boolean k;
    public final hgh l;
    public final ylx0 m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final List r;
    public final CompoundSelectDto s;
    public final String t;
    public final f1b0 u;
    public final wej0 v;
    public final rej0 w;
    public final String x;
    public final jbj0 y;
    public final kk4 z;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        E = new i3y[]{null, null, null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new xlw0(2)), null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new xlw0(3)), null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new xlw0(4)), null};
    }

    public /* synthetic */ c(int i, String str, String str2, String str3, String str4, String str5, String str6, yg70 yg70Var, boolean z, Number number, boolean z2, boolean z3, hgh hghVar, ylx0 ylx0Var, String str7, String str8, String str9, String str10, List list, CompoundSelectDto compoundSelectDto, String str11, f1b0 f1b0Var, wej0 wej0Var, rej0 rej0Var, String str12, jbj0 jbj0Var, kk4 kk4Var, Boolean bool, List list2, noj0 noj0Var) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = "boolean";
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = yg70.e;
        } else {
            this.g = yg70Var;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z;
        }
        if ((i & 256) == 0) {
            this.i = 0;
        } else {
            this.i = number;
        }
        if ((i & 512) == 0) {
            this.j = false;
        } else {
            this.j = z2;
        }
        if ((i & 1024) == 0) {
            this.k = false;
        } else {
            this.k = z3;
        }
        if ((i & 2048) == 0) {
            this.l = new hgh(0);
        } else {
            this.l = hghVar;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = ylx0Var;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str7;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str8;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = str9;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str10;
        }
        int i2 = 131072 & i;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.r = emptyList;
        } else {
            this.r = list;
        }
        this.s = (262144 & i) == 0 ? new CompoundSelectDto(0) : compoundSelectDto;
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = str11;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = f1b0Var;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = wej0Var;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = rej0Var;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = str12;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = jbj0Var;
        }
        if ((33554432 & i) == 0) {
            this.z = null;
        } else {
            this.z = kk4Var;
        }
        if ((67108864 & i) == 0) {
            this.A = null;
        } else {
            this.A = bool;
        }
        if ((134217728 & i) == 0) {
            this.B = emptyList;
        } else {
            this.B = list2;
        }
        this.C = (i & SelfTester_JCP.IMITA) == 0 ? new noj0(0) : noj0Var;
    }

    public static c a(c cVar, String str, yg70 yg70Var, Integer num, boolean z, boolean z2, CompoundSelectDto compoundSelectDto, String str2, f1b0 f1b0Var, List list, int i) {
        String str3;
        List list2;
        String str4 = cVar.a;
        String str5 = cVar.b;
        String str6 = cVar.c;
        String str7 = cVar.d;
        String str8 = (i & 16) != 0 ? cVar.e : str;
        String str9 = cVar.f;
        yg70 yg70Var2 = (i & 64) != 0 ? cVar.g : yg70Var;
        boolean z3 = cVar.h;
        Number number = (i & 256) != 0 ? cVar.i : num;
        boolean z4 = (i & 512) != 0 ? cVar.j : z;
        boolean z5 = (i & 1024) != 0 ? cVar.k : z2;
        hgh hghVar = cVar.l;
        String str10 = str8;
        yg70 yg70Var3 = yg70Var2;
        Number number2 = number;
        boolean z6 = z4;
        boolean z7 = z5;
        ylx0 ylx0Var = cVar.m;
        String str11 = cVar.n;
        String str12 = cVar.o;
        String str13 = cVar.p;
        String str14 = cVar.q;
        if ((i & 131072) != 0) {
            str3 = str14;
            list2 = cVar.r;
        } else {
            str3 = str14;
            list2 = EmptyList.a;
        }
        List list3 = list2;
        CompoundSelectDto compoundSelectDto2 = (i & 262144) != 0 ? cVar.s : compoundSelectDto;
        String str15 = (i & 524288) != 0 ? cVar.t : str2;
        wej0 wej0Var = cVar.v;
        rej0 rej0Var = cVar.w;
        String str16 = cVar.x;
        jbj0 jbj0Var = cVar.y;
        kk4 kk4Var = cVar.z;
        Boolean bool = cVar.A;
        List list4 = (i & SelfTester_JCP.DECRYPT_CNT) != 0 ? cVar.B : list;
        noj0 noj0Var = cVar.C;
        cVar.getClass();
        return new c(str4, str5, str6, str7, str10, str9, yg70Var3, z3, number2, z6, z7, hghVar, ylx0Var, str11, str12, str13, str3, list3, compoundSelectDto2, str15, f1b0Var, wej0Var, rej0Var, str16, jbj0Var, kk4Var, bool, list4, noj0Var);
    }

    public final je70 b(String str) {
        if (this.D == null) {
            yg70 yg70Var = this.g;
            HashMap hashMap = new HashMap(yg70Var.c.size());
            for (je70 je70Var : yg70Var.c) {
                hashMap.put(je70Var.c, je70Var);
            }
            this.D = hashMap;
        }
        HashMap hashMap2 = this.D;
        if (hashMap2 == null) {
            hashMap2 = null;
        }
        return (je70) hashMap2.get(str);
    }

    public final boolean c() {
        String str = this.f;
        return "select".equals(str) || "compoundselect".equals(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return jl40.l(this.a, cVar.a) && jl40.l(this.b, cVar.b) && jl40.l(this.c, cVar.c) && jl40.l(this.d, cVar.d) && jl40.l(this.e, cVar.e) && jl40.l(this.f, cVar.f) && jl40.l(this.g, cVar.g) && this.h == cVar.h && jl40.l(this.i, cVar.i) && this.j == cVar.j && this.k == cVar.k && jl40.l(this.l, cVar.l) && jl40.l(this.m, cVar.m) && jl40.l(this.n, cVar.n) && jl40.l(this.o, cVar.o) && jl40.l(this.p, cVar.p) && jl40.l(this.q, cVar.q) && jl40.l(this.r, cVar.r) && jl40.l(this.s, cVar.s) && jl40.l(this.t, cVar.t) && jl40.l(this.u, cVar.u) && jl40.l(this.v, cVar.v) && jl40.l(this.w, cVar.w) && jl40.l(this.x, cVar.x) && jl40.l(this.y, cVar.y) && jl40.l(this.z, cVar.z) && jl40.l(this.A, cVar.A) && jl40.l(this.B, cVar.B) && jl40.l(this.C, cVar.C);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int c = unr0.c(unr0.e(unr0.e((this.i.hashCode() + unr0.e((this.g.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h)) * 31, 31, this.j), 31, this.k), 31, this.l.a);
        ylx0 ylx0Var = this.m;
        int hashCode2 = (c + (ylx0Var == null ? 0 : ylx0Var.hashCode())) * 31;
        String str2 = this.n;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.p;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.q;
        int hashCode6 = (this.s.hashCode() + unr0.c((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.r)) * 31;
        String str6 = this.t;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        f1b0 f1b0Var = this.u;
        int hashCode8 = (hashCode7 + (f1b0Var == null ? 0 : f1b0Var.hashCode())) * 31;
        wej0 wej0Var = this.v;
        int hashCode9 = (hashCode8 + (wej0Var == null ? 0 : wej0Var.hashCode())) * 31;
        rej0 rej0Var = this.w;
        int hashCode10 = (hashCode9 + (rej0Var == null ? 0 : rej0Var.hashCode())) * 31;
        String str7 = this.x;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        jbj0 jbj0Var = this.y;
        int hashCode12 = (hashCode11 + (jbj0Var == null ? 0 : jbj0Var.hashCode())) * 31;
        kk4 kk4Var = this.z;
        int hashCode13 = (hashCode12 + (kk4Var == null ? 0 : kk4Var.hashCode())) * 31;
        Boolean bool = this.A;
        return this.C.hashCode() + unr0.c((hashCode13 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.B);
    }

    public final String toString() {
        StringBuilder v = b64.v("SupportedRequirementDto(label=", this.a, ", subLabel=", this.b, ", name=");
        g8e.D(v, this.c, ", description=", this.d, ", unavailableText=");
        g8e.D(v, this.e, ", type=", this.f, ", optionsInfo=");
        v.append(this.g);
        v.append(", multiSelect=");
        v.append(this.h);
        v.append(", _maxWeight=");
        v.append(this.i);
        v.append(", glued=");
        v.append(this.j);
        v.append(", gluedOptional=");
        v.append(this.k);
        v.append(", defaultOptions=");
        v.append(this.l);
        v.append(", tariffRedirect=");
        v.append(this.m);
        v.append(", driverName=");
        v.append(this.n);
        v.append(", dialogTitle=");
        g8e.D(v, this.o, ", dialogSubtitle=", this.p, ", trailImage=");
        tse0.x(this.q, ", optionDropSequence=", ", compoundSelect=", v, this.r);
        v.append(this.s);
        v.append(", unsetOrderButton=");
        v.append(this.t);
        v.append(", persistencePolicy=");
        v.append(this.u);
        v.append(", communication=");
        v.append(this.v);
        v.append(", comment=");
        v.append(this.w);
        v.append(", accessibilityAlert=");
        v.append(this.x);
        v.append(", actions=");
        v.append(this.y);
        v.append(", badge=");
        v.append(this.z);
        v.append(", invertedUi=");
        v.append(this.A);
        v.append(", restrictedToClasses=");
        v.append(this.B);
        v.append(", images=");
        v.append(this.C);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6, yg70 yg70Var, boolean z, Number number, boolean z2, boolean z3, hgh hghVar, ylx0 ylx0Var, String str7, String str8, String str9, String str10, List list, CompoundSelectDto compoundSelectDto, String str11, f1b0 f1b0Var, wej0 wej0Var, rej0 rej0Var, String str12, jbj0 jbj0Var, kk4 kk4Var, Boolean bool, List list2, noj0 noj0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = yg70Var;
        this.h = z;
        this.i = number;
        this.j = z2;
        this.k = z3;
        this.l = hghVar;
        this.m = ylx0Var;
        this.n = str7;
        this.o = str8;
        this.p = str9;
        this.q = str10;
        this.r = list;
        this.s = compoundSelectDto;
        this.t = str11;
        this.u = f1b0Var;
        this.v = wej0Var;
        this.w = rej0Var;
        this.x = str12;
        this.y = jbj0Var;
        this.z = kk4Var;
        this.A = bool;
        this.B = list2;
        this.C = noj0Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c() {
        this("", null, "", "", "", "boolean", r7, false, 0, false, false, r12, null, null, null, null, null, r18, r1, null, null, null, null, null, null, null, null, r18, r2);
        yg70 yg70Var = yg70.e;
        hgh hghVar = new hgh(0);
        CompoundSelectDto compoundSelectDto = new CompoundSelectDto(0);
        noj0 noj0Var = new noj0(0);
        EmptyList emptyList = EmptyList.a;
    }
}
