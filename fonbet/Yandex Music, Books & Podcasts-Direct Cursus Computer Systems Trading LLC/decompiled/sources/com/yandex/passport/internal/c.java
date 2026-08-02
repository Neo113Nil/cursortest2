package com.yandex.passport.internal;

import defpackage.dfi;
import defpackage.k5r;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class c {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;

    public c(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = arrayList4;
        this.e = arrayList5;
    }

    public final boolean a() {
        return (this.a.isEmpty() && this.b.isEmpty() && this.d.isEmpty()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !c.class.equals(obj.getClass())) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a.equals(cVar.a) && this.b.equals(cVar.b) && this.c.equals(cVar.c) && this.d.equals(cVar.d)) {
            return this.e.equals(cVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + dfi.b(this.d, dfi.b(this.c, dfi.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(c.class.getSimpleName());
        sb.append("{added=");
        sb.append(this.a);
        sb.append(", updated=");
        sb.append(this.b);
        sb.append(", masterTokenUpdated=");
        sb.append(this.c);
        sb.append(", removed=");
        sb.append(this.d);
        sb.append(", skipped=");
        return k5r.o(sb, this.e, '}');
    }
}
