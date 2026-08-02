package defpackage;

import com.yandex.delivery.mapper.model.SelectDestinationPolicy;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ygg extends hhg {
    public final String a;
    public final String b;
    public final SelectDestinationPolicy c;
    public final Map d;
    public final q8s0 e;
    public final zi8 f;

    public ygg(String str, String str2, SelectDestinationPolicy selectDestinationPolicy, Map map, q8s0 q8s0Var, zi8 zi8Var) {
        this.a = str;
        this.b = str2;
        this.c = selectDestinationPolicy;
        this.d = map;
        this.e = q8s0Var;
        this.f = zi8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygg)) {
            return false;
        }
        ygg yggVar = (ygg) obj;
        return jl40.l(this.a, yggVar.a) && jl40.l(this.b, yggVar.b) && this.c == yggVar.c && jl40.l(this.d, yggVar.d) && jl40.l(this.e, yggVar.e) && this.f.equals(yggVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SelectDestinationPolicy selectDestinationPolicy = this.c;
        int hashCode3 = (hashCode2 + (selectDestinationPolicy == null ? 0 : selectDestinationPolicy.hashCode())) * 31;
        Map map = this.d;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        q8s0 q8s0Var = this.e;
        return this.f.hashCode() + ((hashCode4 + (q8s0Var != null ? q8s0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("OpenOrderFormAction(mode=", this.a, ", storyId=", this.b, ", selectDestinationPolicy=");
        v.append(this.c);
        v.append(", clientState=");
        v.append(this.d);
        v.append(", storyShowPolicy=");
        v.append(this.e);
        v.append(", cardMode=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
