package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class bea {
    public static qda a(List list) {
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
        return vbcVar != null ? b(vbcVar) : qda.a;
    }

    public static qda b(vbc vbcVar) {
        vbcVar.getClass();
        if (vbcVar instanceof kbc) {
            return qda.b;
        }
        if (vbcVar instanceof pbc) {
            return qda.a;
        }
        su4.s(2, null, "DownloadedArtistSortType cannot be returned", null);
        return qda.a;
    }
}
