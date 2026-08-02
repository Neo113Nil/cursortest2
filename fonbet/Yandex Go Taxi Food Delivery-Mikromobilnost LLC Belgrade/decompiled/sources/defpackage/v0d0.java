package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class v0d0 {
    public final boolean a;
    public final ArrayList b;

    public v0d0(ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = arrayList;
    }

    public final List a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0d0)) {
            return false;
        }
        v0d0 v0d0Var = (v0d0) obj;
        return this.a == v0d0Var.a && this.b.equals(v0d0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountInfo(isYandexEmployee=");
        sb.append(this.a);
        sb.append(", partitions=");
        return smw0.m(sb, this.b, ')');
    }
}
