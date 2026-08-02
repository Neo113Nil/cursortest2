package defpackage;

import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class w221 {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Map d;
    public final Map e;

    public w221(Integer num, Integer num2, Integer num3, MapBuilder mapBuilder, MapBuilder mapBuilder2) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = mapBuilder;
        this.e = mapBuilder2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w221)) {
            return false;
        }
        w221 w221Var = (w221) obj;
        return jl40.l(this.a, w221Var.a) && jl40.l(this.b, w221Var.b) && jl40.l(this.c, w221Var.c) && jl40.l(this.d, w221Var.d) && jl40.l(this.e, w221Var.e);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Map map = this.d;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.e;
        return hashCode4 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnreadCounters(messageCount=");
        sb.append(this.a);
        sb.append(", messageCountInChat=");
        sb.append(this.b);
        sb.append(", chatCount=");
        sb.append(this.c);
        sb.append(", namespaces=");
        sb.append(this.d);
        sb.append(", guids=");
        return b64.r(sb, this.e, Extension.C_BRAKE);
    }
}
