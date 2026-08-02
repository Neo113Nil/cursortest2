package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class u34 {
    public final String a;
    public final Class b;
    public final jyq0 c;
    public final xi21 d;
    public final Size e;
    public final lru0 f;
    public final List g;

    public u34(String str, Class cls, jyq0 jyq0Var, xi21 xi21Var, Size size, lru0 lru0Var, ArrayList arrayList) {
        this.a = str;
        this.b = cls;
        if (jyq0Var == null) {
            ny61.t("Null sessionConfig");
            throw null;
        }
        this.c = jyq0Var;
        if (xi21Var == null) {
            ny61.t("Null useCaseConfig");
            throw null;
        }
        this.d = xi21Var;
        this.e = size;
        this.f = lru0Var;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u34)) {
            return false;
        }
        u34 u34Var = (u34) obj;
        if (!this.a.equals(u34Var.a) || !this.b.equals(u34Var.b) || !this.c.equals(u34Var.c) || !this.d.equals(u34Var.d)) {
            return false;
        }
        Size size = u34Var.e;
        Size size2 = this.e;
        if (size2 == null) {
            if (size != null) {
                return false;
            }
        } else if (!size2.equals(size)) {
            return false;
        }
        lru0 lru0Var = u34Var.f;
        lru0 lru0Var2 = this.f;
        if (lru0Var2 == null) {
            if (lru0Var != null) {
                return false;
            }
        } else if (!lru0Var2.equals(lru0Var)) {
            return false;
        }
        List list = u34Var.g;
        List list2 = this.g;
        return list2 == null ? list == null : list2.equals(list);
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        Size size = this.e;
        int hashCode2 = (hashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        lru0 lru0Var = this.f;
        int hashCode3 = (hashCode2 ^ (lru0Var == null ? 0 : lru0Var.hashCode())) * 1000003;
        List list = this.g;
        return hashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UseCaseInfo{useCaseId=");
        sb.append(this.a);
        sb.append(", useCaseType=");
        sb.append(this.b);
        sb.append(", sessionConfig=");
        sb.append(this.c);
        sb.append(", useCaseConfig=");
        sb.append(this.d);
        sb.append(", surfaceResolution=");
        sb.append(this.e);
        sb.append(", streamSpec=");
        sb.append(this.f);
        sb.append(", captureTypes=");
        return ly3.s(sb, this.g, "}");
    }
}
