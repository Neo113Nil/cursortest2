package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class wo6 {
    public final Context a;

    public wo6(Context context) {
        this.a = context;
    }

    public final void a(String str) {
        pce pceVar = new pce(this.a);
        pceVar.c = str;
        rce a = pceVar.a();
        l18 l18Var = l18.b;
        bdt I = hag.I(cce.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        ((cce) qdcVar.C(I)).d(a);
    }

    public final void b(mqs mqsVar) {
        List q0;
        mqsVar.getClass();
        co6 co6Var = mqsVar.x0;
        String pathForSize = co6Var.a.getPathForSize(wct.s());
        pathForSize.getClass();
        a(pathForSize);
        String pathForSize2 = co6Var.a.getPathForSize(frv.b());
        pathForSize2.getClass();
        a(pathForSize2);
        String pathForSize3 = co6Var.a.getPathForSize(wct.F(this.a));
        pathForSize3.getClass();
        a(pathForSize3);
        List list = mqsVar.u;
        if (list == null || (q0 = CollectionsKt.q0(list, 2)) == null) {
            return;
        }
        Iterator it = q0.iterator();
        while (it.hasNext()) {
            String pathForSize4 = ((c01) it.next()).k.getPathForSize(wct.s());
            pathForSize4.getClass();
            a(pathForSize4);
        }
    }
}
