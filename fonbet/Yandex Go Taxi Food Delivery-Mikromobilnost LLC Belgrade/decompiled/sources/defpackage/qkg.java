package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qkg {
    public final List a;
    public final List b;
    public final Object c;
    public final String d;
    public final boolean e;

    public qkg(List list, List list2, Object obj, String str, int i) {
        list2 = (i & 2) != 0 ? EmptyList.a : list2;
        obj = (i & 4) != 0 ? null : obj;
        str = (i & 8) != 0 ? null : str;
        List list3 = list;
        boolean z = false;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((g2q0) it.next()).i) {
                    z = true;
                    break;
                }
            }
        }
        this.a = list;
        this.b = list2;
        this.c = obj;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkg)) {
            return false;
        }
        qkg qkgVar = (qkg) obj;
        return jl40.l(this.a, qkgVar.a) && jl40.l(this.b, qkgVar.b) && jl40.l(this.c, qkgVar.c) && jl40.l(this.d, qkgVar.d) && this.e == qkgVar.e;
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        Object obj = this.c;
        int hashCode = (c + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.d;
        return Boolean.hashCode(this.e) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = qv10.v("DashboardModel(sections=", this.a, ", stickyWidgets=", this.b, ", meta=");
        v.append(this.c);
        v.append(", metricaLabel=");
        v.append(this.d);
        v.append(", isScrollDisabled=");
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}
