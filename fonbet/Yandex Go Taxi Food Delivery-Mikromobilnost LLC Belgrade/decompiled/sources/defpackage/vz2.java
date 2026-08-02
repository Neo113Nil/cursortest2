package defpackage;

import com.yandex.go.analytics.ApplicationAnalytics$OrderAddressActionV4;
import com.yandex.go.analytics.ApplicationAnalytics$OrderAddressMethodV4;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.video.m3.player.impl.tracking.StrmManagerImplKt;

/* loaded from: classes12.dex */
public final class vz2 {
    public final String a;
    public final boolean b;
    public final sz2 c;
    public final boolean d;
    public final boolean e;
    public final ApplicationAnalytics$OrderAddressActionV4 f;
    public final ApplicationAnalytics$OrderAddressMethodV4 g;
    public final tz2 h;
    public final uz2 i;
    public final String j;
    public final Integer k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final MapBuilder t;

    public vz2(String str, boolean z, sz2 sz2Var, boolean z2, boolean z3, ApplicationAnalytics$OrderAddressActionV4 applicationAnalytics$OrderAddressActionV4, ApplicationAnalytics$OrderAddressMethodV4 applicationAnalytics$OrderAddressMethodV4, tz2 tz2Var, uz2 uz2Var, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.a = str;
        this.b = z;
        this.c = sz2Var;
        this.d = z2;
        this.e = z3;
        this.f = applicationAnalytics$OrderAddressActionV4;
        this.g = applicationAnalytics$OrderAddressMethodV4;
        this.h = tz2Var;
        this.i = uz2Var;
        this.j = str2;
        this.k = num;
        this.l = str3;
        this.m = str4;
        this.n = str5;
        this.o = str6;
        this.p = str7;
        this.q = str8;
        this.r = str9;
        this.s = str10;
        MapBuilder y = qv10.y("api_endpoint", str);
        y.put("clarify_points", Boolean.valueOf(z));
        y.put("coordinate", sz2Var.c);
        y.put("needs_confirmation", Boolean.valueOf(z2));
        y.put("favorite", Boolean.valueOf(z3));
        if (applicationAnalytics$OrderAddressActionV4 != null) {
            y.put("action", applicationAnalytics$OrderAddressActionV4.getEventValue());
        }
        if (applicationAnalytics$OrderAddressMethodV4 != null) {
            y.put("method", applicationAnalytics$OrderAddressMethodV4.getEventValue());
        }
        if (tz2Var != null) {
            y.put("mylocation", tz2Var.d);
        }
        if (uz2Var != null) {
            y.put("original_coordinate", uz2Var.c);
        }
        if (str2 != null) {
            y.put(MetaDataField.SCREEN_FIELD, str2);
        }
        if (num != null) {
            y.put(StrmManagerImplKt.QUERY_PARAMETER_SOURCE_INDEX, num);
        }
        if (str3 != null) {
            y.put("zero_suggest_trace_id", str3);
        }
        if (str4 != null) {
            y.put("final_suggest_trace_id", str4);
        }
        if (str5 != null) {
            y.put("point_id", str5);
        }
        if (str6 != null) {
            y.put("choice_id", str6);
        }
        if (str7 != null) {
            y.put("shortcut_id", str7);
        }
        if (str8 != null) {
            y.put("grid_id", str8);
        }
        if (str9 != null) {
            y.put("shortcut_type", str9);
        }
        if (str10 != null) {
            y.put("update_time", str10);
        }
        this.t = y.j();
    }

    public final MapBuilder a() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz2)) {
            return false;
        }
        vz2 vz2Var = (vz2) obj;
        return jl40.l(this.a, vz2Var.a) && this.b == vz2Var.b && this.c.equals(vz2Var.c) && this.d == vz2Var.d && this.e == vz2Var.e && this.f == vz2Var.f && this.g == vz2Var.g && jl40.l(this.h, vz2Var.h) && jl40.l(this.i, vz2Var.i) && jl40.l(this.j, vz2Var.j) && jl40.l(this.k, vz2Var.k) && jl40.l(this.l, vz2Var.l) && jl40.l(this.m, vz2Var.m) && jl40.l(this.n, vz2Var.n) && jl40.l(this.o, vz2Var.o) && jl40.l(this.p, vz2Var.p) && jl40.l(this.q, vz2Var.q) && jl40.l(this.r, vz2Var.r) && jl40.l(this.s, vz2Var.s);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e((this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
        ApplicationAnalytics$OrderAddressActionV4 applicationAnalytics$OrderAddressActionV4 = this.f;
        int hashCode = (e + (applicationAnalytics$OrderAddressActionV4 == null ? 0 : applicationAnalytics$OrderAddressActionV4.hashCode())) * 31;
        ApplicationAnalytics$OrderAddressMethodV4 applicationAnalytics$OrderAddressMethodV4 = this.g;
        int hashCode2 = (hashCode + (applicationAnalytics$OrderAddressMethodV4 == null ? 0 : applicationAnalytics$OrderAddressMethodV4.hashCode())) * 31;
        tz2 tz2Var = this.h;
        int hashCode3 = (hashCode2 + (tz2Var == null ? 0 : tz2Var.hashCode())) * 31;
        uz2 uz2Var = this.i;
        int hashCode4 = (hashCode3 + (uz2Var == null ? 0 : uz2Var.hashCode())) * 31;
        String str = this.j;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.k;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.l;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.m;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.n;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.o;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.p;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.q;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.r;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.s;
        return hashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = oo31.l("DestinationV4(apiEndpoint=", this.a, ", clarifyPoints=", ", coordinate=", this.b);
        l.append(this.c);
        l.append(", needsConfirmation=");
        l.append(this.d);
        l.append(", favorite=");
        l.append(this.e);
        l.append(", action=");
        l.append(this.f);
        l.append(", method=");
        l.append(this.g);
        l.append(", mylocation=");
        l.append(this.h);
        l.append(", originalCoordinate=");
        l.append(this.i);
        l.append(", screen=");
        l.append(this.j);
        l.append(", sourceIndex=");
        tse0.w(this.k, ", zeroSuggestTraceId=", this.l, ", finalSuggestTraceId=", l);
        g8e.D(l, this.m, ", pointId=", this.n, ", choiceId=");
        g8e.D(l, this.o, ", shortcutId=", this.p, ", gridId=");
        g8e.D(l, this.q, ", shortcutType=", this.r, ", updateTime=");
        return oyr.t(l, this.s, Extension.C_BRAKE);
    }
}
