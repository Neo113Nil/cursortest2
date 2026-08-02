package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class uvu {
    public final String a;
    public final Map b;

    public uvu(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvu)) {
            return false;
        }
        uvu uvuVar = (uvu) obj;
        return jl40.l(this.a, uvuVar.a) && jl40.l(this.b, uvuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpRequest(url=");
        sb.append(this.a);
        sb.append(", headers=");
        return smw0.n(sb, this.b, ')');
    }
}
