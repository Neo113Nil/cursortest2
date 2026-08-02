package defpackage;

import com.yandex.go.zone.dto.objects.VerticalType;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lybl0;", "", "Companion", "wbl0", "xbl0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ybl0 {
    public static final xbl0 Companion = new xbl0();
    public static final i3y[] o;
    public final String a;
    public final String b;
    public final VerticalType c;
    public final String d;
    public final String e;
    public final List f;
    public final String g;
    public final n7v h;
    public final n7v i;
    public final n7v j;
    public final String k;
    public final String l;
    public final bcl0 m;
    public final Boolean n;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        o = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new ibl0(7)), null, null, a.b(lazyThreadSafetyMode, new ibl0(8)), null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ ybl0(int i, String str, String str2, VerticalType verticalType, String str3, String str4, List list, String str5, n7v n7vVar, n7v n7vVar2, n7v n7vVar3, String str6, String str7, bcl0 bcl0Var, Boolean bool) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = VerticalType.NONE;
        } else {
            this.c = verticalType;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = EmptyList.a;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = n7vVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = n7vVar2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = n7vVar3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str6;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str7;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = bcl0Var;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybl0)) {
            return false;
        }
        ybl0 ybl0Var = (ybl0) obj;
        return jl40.l(this.a, ybl0Var.a) && jl40.l(this.b, ybl0Var.b) && this.c == ybl0Var.c && jl40.l(this.d, ybl0Var.d) && jl40.l(this.e, ybl0Var.e) && jl40.l(this.f, ybl0Var.f) && jl40.l(this.g, ybl0Var.g) && jl40.l(this.h, ybl0Var.h) && jl40.l(this.i, ybl0Var.i) && jl40.l(this.j, ybl0Var.j) && jl40.l(this.k, ybl0Var.k) && jl40.l(this.l, ybl0Var.l) && jl40.l(this.m, ybl0Var.m) && jl40.l(this.n, ybl0Var.n);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.b(unr0.b((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        n7v n7vVar = this.h;
        int hashCode2 = (hashCode + (n7vVar == null ? 0 : n7vVar.hashCode())) * 31;
        n7v n7vVar2 = this.i;
        int hashCode3 = (hashCode2 + (n7vVar2 == null ? 0 : n7vVar2.hashCode())) * 31;
        n7v n7vVar3 = this.j;
        int hashCode4 = (hashCode3 + (n7vVar3 == null ? 0 : n7vVar3.hashCode())) * 31;
        String str2 = this.k;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        bcl0 bcl0Var = this.m;
        int hashCode7 = (hashCode6 + (bcl0Var == null ? 0 : bcl0Var.hashCode())) * 31;
        Boolean bool = this.n;
        return hashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("RouteStatsVertical(id=", this.a, ", tariffClass=", this.b, ", type=");
        v.append(this.c);
        v.append(", title=");
        v.append(this.d);
        v.append(", titleTemplate=");
        tse0.x(this.e, ", tariffs=", ", defaultTariff=", v, this.f);
        v.append(this.g);
        v.append(", image=");
        v.append(this.h);
        v.append(", icon=");
        v.append(this.i);
        v.append(", headerIcon=");
        v.append(this.j);
        v.append(", headerTitle=");
        g8e.D(v, this.k, ", price=", this.l, ", multiclass=");
        v.append(this.m);
        v.append(", trapOnly=");
        v.append(this.n);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ybl0(String str, String str2, VerticalType verticalType, String str3, String str4, List list, String str5, n7v n7vVar, n7v n7vVar2, n7v n7vVar3, String str6, String str7, bcl0 bcl0Var, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = verticalType;
        this.d = str3;
        this.e = str4;
        this.f = list;
        this.g = str5;
        this.h = n7vVar;
        this.i = n7vVar2;
        this.j = n7vVar3;
        this.k = str6;
        this.l = str7;
        this.m = bcl0Var;
        this.n = bool;
    }

    public ybl0() {
        this("", "", VerticalType.NONE, "", "", EmptyList.a, null, null, null, null, null, null, null, null);
    }
}
