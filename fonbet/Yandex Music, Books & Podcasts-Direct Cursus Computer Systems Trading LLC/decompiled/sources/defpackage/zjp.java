package defpackage;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zjp {
    public final String a;
    public final Map b;

    public zjp(String str, Map map) {
        o2g.O(str, "policyName");
        this.a = str;
        o2g.O(map, "rawConfigValue");
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zjp) {
            zjp zjpVar = (zjp) obj;
            if (this.a.equals(zjpVar.a) && this.b.equals(zjpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(this.a, "policyName");
        Y.q(this.b, "rawConfigValue");
        return Y.toString();
    }
}
