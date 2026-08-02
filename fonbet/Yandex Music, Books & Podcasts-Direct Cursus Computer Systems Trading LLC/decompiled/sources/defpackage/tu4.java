package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class tu4 {
    public static i10 a(List list) {
        Object obj;
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((vbc) obj).b()) {
                break;
            }
        }
        vbc vbcVar = (vbc) obj;
        return vbcVar != null ? b(vbcVar) : i10.d;
    }

    public static i10 b(vbc vbcVar) {
        vbcVar.getClass();
        if (vbcVar instanceof kbc) {
            return i10.c;
        }
        if (vbcVar instanceof lbc) {
            return i10.b;
        }
        if (vbcVar instanceof nbc) {
            return i10.d;
        }
        if (vbcVar instanceof tbc) {
            return i10.a;
        }
        su4.s(2, null, "AlbumSortType cannot be returned", null);
        return i10.d;
    }
}
