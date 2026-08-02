package defpackage;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes9.dex */
public final class v5x {
    public final String a;
    public final char[] b;
    public final Map c;

    public v5x(String str, char[] cArr, Map map) {
        this.a = str;
        this.b = cArr;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!v5x.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        v5x v5xVar = (v5x) obj;
        return jl40.l(this.a, v5xVar.a) && Arrays.equals(this.b, v5xVar.b) && this.c.equals(v5xVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JasonScenario(name=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(Arrays.toString(this.b));
        sb.append(", props=");
        return smw0.n(sb, this.c, ')');
    }
}
