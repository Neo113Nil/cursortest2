package defpackage;

import com.yandex.go.analytics.ApplicationAnalytics$OrderAddressActionV4;
import com.yandex.go.analytics.ApplicationAnalytics$OrderAddressMethodV4;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes12.dex */
public final class yz2 {
    public final String a;
    public final boolean b;
    public final wz2 c;
    public final boolean d;
    public final boolean e;
    public final ApplicationAnalytics$OrderAddressActionV4 f;
    public final ApplicationAnalytics$OrderAddressMethodV4 g;
    public final xz2 h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final MapBuilder n;

    public yz2(String str, boolean z, wz2 wz2Var, boolean z2, boolean z3, ApplicationAnalytics$OrderAddressActionV4 applicationAnalytics$OrderAddressActionV4, ApplicationAnalytics$OrderAddressMethodV4 applicationAnalytics$OrderAddressMethodV4, xz2 xz2Var, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = z;
        this.c = wz2Var;
        this.d = z2;
        this.e = z3;
        this.f = applicationAnalytics$OrderAddressActionV4;
        this.g = applicationAnalytics$OrderAddressMethodV4;
        this.h = xz2Var;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.l = str5;
        this.m = str6;
        MapBuilder y = qv10.y("api_endpoint", str);
        y.put("clarify_points", Boolean.valueOf(z));
        y.put("coordinate", wz2Var.c);
        y.put("needs_confirmation", Boolean.valueOf(z2));
        y.put("favorite", Boolean.valueOf(z3));
        if (applicationAnalytics$OrderAddressActionV4 != null) {
            y.put("action", applicationAnalytics$OrderAddressActionV4.getEventValue());
        }
        if (applicationAnalytics$OrderAddressMethodV4 != null) {
            y.put("method", applicationAnalytics$OrderAddressMethodV4.getEventValue());
        }
        if (xz2Var != null) {
            y.put("mylocation", xz2Var.d);
        }
        if (str2 != null) {
            y.put("pin_drop_trace_id", str2);
        }
        if (str3 != null) {
            y.put("zero_suggest_trace_id", str3);
        }
        if (str4 != null) {
            y.put("pickup_point_id", str4);
        }
        if (str5 != null) {
            y.put(MetaDataField.SCREEN_FIELD, str5);
        }
        if (str6 != null) {
            y.put("update_time", str6);
        }
        this.n = y.j();
    }

    public final MapBuilder a() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz2)) {
            return false;
        }
        yz2 yz2Var = (yz2) obj;
        return jl40.l(this.a, yz2Var.a) && this.b == yz2Var.b && this.c.equals(yz2Var.c) && this.d == yz2Var.d && this.e == yz2Var.e && this.f == yz2Var.f && this.g == yz2Var.g && jl40.l(this.h, yz2Var.h) && jl40.l(this.i, yz2Var.i) && jl40.l(this.j, yz2Var.j) && jl40.l(this.k, yz2Var.k) && jl40.l(this.l, yz2Var.l) && jl40.l(this.m, yz2Var.m);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e((this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
        ApplicationAnalytics$OrderAddressActionV4 applicationAnalytics$OrderAddressActionV4 = this.f;
        int hashCode = (e + (applicationAnalytics$OrderAddressActionV4 == null ? 0 : applicationAnalytics$OrderAddressActionV4.hashCode())) * 31;
        ApplicationAnalytics$OrderAddressMethodV4 applicationAnalytics$OrderAddressMethodV4 = this.g;
        int hashCode2 = (hashCode + (applicationAnalytics$OrderAddressMethodV4 == null ? 0 : applicationAnalytics$OrderAddressMethodV4.hashCode())) * 31;
        xz2 xz2Var = this.h;
        int hashCode3 = (hashCode2 + (xz2Var == null ? 0 : xz2Var.hashCode())) * 31;
        String str = this.i;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.m;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = oo31.l("StartingV4(apiEndpoint=", this.a, ", clarifyPoints=", ", coordinate=", this.b);
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
        l.append(", pinDropTraceId=");
        g8e.D(l, this.i, ", zeroSuggestTraceId=", this.j, ", pickupPointId=");
        g8e.D(l, this.k, ", screen=", this.l, ", updateTime=");
        return oyr.t(l, this.m, Extension.C_BRAKE);
    }
}
