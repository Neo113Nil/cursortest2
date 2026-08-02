package defpackage;

import java.util.List;
import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class yp00 {
    public final byx a;
    public final List b;
    public final String c;

    public yp00(byx byxVar, List list) {
        String uuid = UUID.randomUUID().toString();
        this.a = byxVar;
        this.b = list;
        this.c = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp00)) {
            return false;
        }
        yp00 yp00Var = (yp00) obj;
        return jl40.l(this.a, yp00Var.a) && jl40.l(this.b, yp00Var.b) && jl40.l(this.c, yp00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapObjectsRenderState(layersCondition=");
        sb.append(this.a);
        sb.append(", commands=");
        sb.append(this.b);
        sb.append(", stateId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
