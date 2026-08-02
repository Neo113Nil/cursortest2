package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes6.dex */
public final class yz01 {
    public final wz01 a;
    public final String b;
    public final xz01 c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final MapBuilder l;

    public yz01(wz01 wz01Var, String str, xz01 xz01Var, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = wz01Var;
        this.b = str;
        this.c = xz01Var;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        MapBuilder mapBuilder = new MapBuilder();
        if (wz01Var != null) {
            mapBuilder.put("coordinate", wz01Var.c);
        }
        if (str != null) {
            mapBuilder.put("method", str);
        }
        if (xz01Var != null) {
            mapBuilder.put("original_coordinate", xz01Var.c);
        }
        if (str2 != null) {
            mapBuilder.put(MetaDataField.SCREEN_FIELD, str2);
        }
        if (str3 != null) {
            mapBuilder.put("final_suggest_trace_id", str3);
        }
        if (str4 != null) {
            mapBuilder.put("point_id", str4);
        }
        if (str5 != null) {
            mapBuilder.put("choice_id", str5);
        }
        if (str6 != null) {
            mapBuilder.put("shortcut_id", str6);
        }
        if (str7 != null) {
            mapBuilder.put("grid_id", str7);
        }
        if (str8 != null) {
            mapBuilder.put("shortcut_type", str8);
        }
        if (str9 != null) {
            mapBuilder.put("update_time", str9);
        }
        this.l = mapBuilder.j();
    }

    public final MapBuilder a() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz01)) {
            return false;
        }
        yz01 yz01Var = (yz01) obj;
        return jl40.l(this.a, yz01Var.a) && jl40.l(this.b, yz01Var.b) && jl40.l(this.c, yz01Var.c) && jl40.l(this.d, yz01Var.d) && jl40.l(this.e, yz01Var.e) && jl40.l(this.f, yz01Var.f) && jl40.l(this.g, yz01Var.g) && jl40.l(this.h, yz01Var.h) && jl40.l(this.i, yz01Var.i) && jl40.l(this.j, yz01Var.j) && jl40.l(this.k, yz01Var.k);
    }

    public final int hashCode() {
        wz01 wz01Var = this.a;
        int hashCode = (wz01Var == null ? 0 : wz01Var.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        xz01 xz01Var = this.c;
        int hashCode3 = (hashCode2 + (xz01Var == null ? 0 : xz01Var.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.j;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.k;
        return hashCode10 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Destination(coordinate=");
        sb.append(this.a);
        sb.append(", method=");
        sb.append(this.b);
        sb.append(", originalCoordinate=");
        sb.append(this.c);
        sb.append(", screen=");
        sb.append(this.d);
        sb.append(", finalSuggestTraceId=");
        g8e.D(sb, this.e, ", pointId=", this.f, ", choiceId=");
        g8e.D(sb, this.g, ", shortcutId=", this.h, ", gridId=");
        g8e.D(sb, this.i, ", shortcutType=", this.j, ", updateTime=");
        return oyr.t(sb, this.k, Extension.C_BRAKE);
    }

    public /* synthetic */ yz01(int i) {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public yz01() {
        this(0);
    }
}
