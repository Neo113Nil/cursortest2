package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.ui.debug.PreloadState;

/* loaded from: classes6.dex */
public final class gag {
    public final qdc a;
    public final nsh b;
    public final xdr c;
    public final fkn d;
    public final rar e;

    public gag(qdc qdcVar, nsh nshVar, vx6 vx6Var, tf6 tf6Var) {
        this.a = qdcVar;
        this.b = nshVar;
        xdr a = ydr.a(new eag());
        this.c = a;
        this.d = new fkn(a);
        this.e = zsd.r0(tf6Var, new ub7(12, (fkn) vx6Var.d, new nz5(this, (Continuation) null, 29)));
    }

    public final void a(int i, DecoderEventData decoderEventData) {
        Object value;
        xdr xdrVar = this.c;
        LinkedHashMap q = uah.q(((eag) xdrVar.getValue()).g);
        q.put(Integer.valueOf(i), decoderEventData);
        do {
            value = xdrVar.getValue();
        } while (!xdrVar.k(value, eag.a((eag) value, null, null, null, null, null, null, q, null, null, null, null, null, null, null, null, null, null, 131007)));
    }

    public final void b() {
        Object value;
        xdr xdrVar = this.c;
        List list = ((eag) xdrVar.getValue()).a;
        List list2 = ((eag) xdrVar.getValue()).b;
        int T = CollectionsKt.T(list, CollectionsKt.firstOrNull(list2));
        ArrayList arrayList = new ArrayList();
        if (T >= 0) {
            arrayList.addAll(list.subList(Integer.max(0, T - 1), Integer.min(list.size(), T + 6)));
        }
        Map map = ((eag) xdrVar.getValue()).d;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            imh imhVar = (imh) it.next();
            boolean contains = list2.contains(imhVar);
            u7b u7bVar = (u7b) ((eag) xdrVar.getValue()).f.get(imhVar);
            paw pawVar = u7bVar != null ? u7bVar.a : null;
            Integer num = (Integer) ((eag) xdrVar.getValue()).e.get(imhVar);
            PreloadState preloadState = (PreloadState) map.get(imhVar);
            if (preloadState == null) {
                preloadState = PreloadState.NONE;
            }
            arrayList2.add(new zye(imhVar, contains, pawVar, num, preloadState));
        }
        do {
            value = xdrVar.getValue();
        } while (!xdrVar.k(value, eag.a((eag) value, null, null, arrayList2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131067)));
    }
}
