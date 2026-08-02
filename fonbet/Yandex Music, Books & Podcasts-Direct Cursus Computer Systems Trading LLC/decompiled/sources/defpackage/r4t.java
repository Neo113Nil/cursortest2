package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r4t {
    public final int a;
    public final wjb b;
    public final ArrayList c;

    public r4t(int i, wjb wjbVar, ArrayList arrayList) {
        this.a = i;
        this.b = wjbVar;
        this.c = arrayList;
    }

    public final int a(mqs mqsVar) {
        Iterator it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.d(((i0r) it.next()).b, mqsVar.a)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4t)) {
            return false;
        }
        r4t r4tVar = (r4t) obj;
        return this.a == r4tVar.a && this.b == r4tVar.b && this.c.equals(r4tVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrailerAnalyticsEntity(objectsCount=");
        sb.append(this.a);
        sb.append(", navigateTo=");
        sb.append(this.b);
        sb.append(", smartPreviews=");
        return vz1.t(sb, this.c, ")");
    }
}
