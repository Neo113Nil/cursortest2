package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class gc2 extends eq6 {
    public final hc2 a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final dq6 e;
    public final List f;
    public final int g;

    public gc2(hc2 hc2Var, List list, List list2, Boolean bool, dq6 dq6Var, List list3, int i) {
        this.a = hc2Var;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = dq6Var;
        this.f = list3;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eq6)) {
            return false;
        }
        gc2 gc2Var = (gc2) ((eq6) obj);
        if (!this.a.equals(gc2Var.a)) {
            return false;
        }
        List list = gc2Var.b;
        List list2 = this.b;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        List list3 = gc2Var.c;
        List list4 = this.c;
        if (list4 == null) {
            if (list3 != null) {
                return false;
            }
        } else if (!list4.equals(list3)) {
            return false;
        }
        Boolean bool = gc2Var.d;
        Boolean bool2 = this.d;
        if (bool2 == null) {
            if (bool != null) {
                return false;
            }
        } else if (!bool2.equals(bool)) {
            return false;
        }
        dq6 dq6Var = gc2Var.e;
        dq6 dq6Var2 = this.e;
        if (dq6Var2 == null) {
            if (dq6Var != null) {
                return false;
            }
        } else if (!dq6Var2.equals(dq6Var)) {
            return false;
        }
        List list5 = gc2Var.f;
        List list6 = this.f;
        if (list6 == null) {
            if (list5 != null) {
                return false;
            }
        } else if (!list6.equals(list5)) {
            return false;
        }
        return this.g == gc2Var.g;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        List list = this.b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        dq6 dq6Var = this.e;
        int hashCode5 = (hashCode4 ^ (dq6Var == null ? 0 : dq6Var.hashCode())) * 1000003;
        List list3 = this.f;
        return ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.e);
        sb.append(", appProcessDetails=");
        sb.append(this.f);
        sb.append(", uiOrientation=");
        return f1d.i(sb, this.g, "}");
    }
}
