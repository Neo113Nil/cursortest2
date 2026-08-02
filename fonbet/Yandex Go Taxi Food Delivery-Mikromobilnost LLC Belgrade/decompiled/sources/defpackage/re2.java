package defpackage;

import com.yandex.go.taxi.order.bubble.model.Bubble$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class re2 extends tl6 {
    public final zzs a;
    public final Bubble$Type b;
    public final qe2 c;
    public final String d = toString();

    public re2(zzs zzsVar, Bubble$Type bubble$Type, qe2 qe2Var) {
        this.a = zzsVar;
        this.b = bubble$Type;
        this.c = qe2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re2)) {
            return false;
        }
        re2 re2Var = (re2) obj;
        return jl40.l(this.a, re2Var.a) && this.b == re2Var.b && this.c.equals(re2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AnimatedBubble(geoPoint=" + this.a + ", type=" + this.b + ", icon=" + this.c + Extension.C_BRAKE;
    }
}
