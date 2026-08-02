package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class wma0 {
    public final List a;

    public wma0(List list) {
        this.a = list;
    }

    public final zz90 a(String str) {
        Object obj;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((zz90) obj).b(), str)) {
                break;
            }
        }
        return (zz90) obj;
    }
}
