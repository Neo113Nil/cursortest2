package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zh20 implements pre {
    public final String a;
    public final Integer b;
    public final trb1 c;
    public final tq00 d;
    public final o690 e;
    public final boolean f;
    public final String g;
    public final Map h;

    public zh20(String str, Integer num, trb1 trb1Var, tq00 tq00Var, o690 o690Var, boolean z, String str2, Map map) {
        this.a = str;
        this.b = num;
        this.c = trb1Var;
        this.d = tq00Var;
        this.e = o690Var;
        this.f = z;
        this.g = str2;
        this.h = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh20)) {
            return false;
        }
        zh20 zh20Var = (zh20) obj;
        return jl40.l(this.a, zh20Var.a) && jl40.l(this.b, zh20Var.b) && jl40.l(this.c, zh20Var.c) && jl40.l(this.d, zh20Var.d) && this.e.equals(zh20Var.e) && this.f == zh20Var.f && jl40.l(this.g, zh20Var.g) && jl40.l(this.h, zh20Var.h);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "mini-map";
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        trb1 trb1Var = this.c;
        int hashCode3 = (hashCode2 + (trb1Var == null ? 0 : trb1Var.hashCode())) * 31;
        tq00 tq00Var = this.d;
        int e = unr0.e((this.e.hashCode() + ((hashCode3 + (tq00Var == null ? 0 : tq00Var.hashCode())) * 31)) * 31, 31, this.f);
        String str = this.g;
        int hashCode4 = (e + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.h;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder q = n.q("MiniMapRemoteCoreWidget(id=", this.b, this.a, ", zoom=", ", coordinateSource=");
        q.append(this.c);
        q.append(", mapPin=");
        q.append(this.d);
        q.append(", padding=");
        q.append(this.e);
        q.append(", enabled=");
        q.append(this.f);
        q.append(", metricaLabel=");
        q.append(this.g);
        q.append(", meta=");
        q.append(this.h);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }
}
