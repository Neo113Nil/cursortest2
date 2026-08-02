package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class val0 {
    public final String a;
    public final String b;
    public final String c;
    public final MapBuilder d;

    public val0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        MapBuilder mapBuilder = new MapBuilder();
        if (str != null) {
            mapBuilder.put("tariffId", str);
        }
        if (str2 != null) {
            mapBuilder.put("priceFormatKey", str2);
        }
        if (str3 != null) {
            mapBuilder.put("error", str3);
        }
        this.d = mapBuilder.j();
    }

    public final MapBuilder a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof val0)) {
            return false;
        }
        val0 val0Var = (val0) obj;
        return jl40.l(this.a, val0Var.a) && jl40.l(this.b, val0Var.b) && jl40.l(this.c, val0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("Errors(tariffId=", this.a, ", priceFormatKey=", this.b, ", error="), this.c, Extension.C_BRAKE);
    }

    public val0() {
        this(null, null, null);
    }
}
