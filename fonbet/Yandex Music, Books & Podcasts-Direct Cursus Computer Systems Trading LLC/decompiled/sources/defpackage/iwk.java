package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes6.dex */
public final class iwk extends ou2 {
    private static final long serialVersionUID = 299321385654161537L;
    public final euo g = euo.x0;
    public final jyr h = btf.b(new d1j(16, this));

    @Override // defpackage.ypt
    public final cqt T() {
        return (cqt) this.h.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        r2 = kotlin.text.StringsKt__StringsKt.split$default(r2, new java.lang.String[]{io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA}, false, 0, 6, null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List b() {
        List split$default;
        String Q = Q("stationId");
        c5b c5bVar = null;
        if (Q == null || StringsKt.U(Q)) {
            Q = null;
        }
        String Q2 = Q("seeds");
        if (Q2 != null && split$default != null) {
            List list = split$default;
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(StringsKt.t0((String) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((String) next).length() > 0) {
                    arrayList2.add(next);
                }
            }
            c5bVar = arrayList2;
        }
        if (c5bVar == null) {
            c5bVar = c5b.a;
        }
        if (Q == null) {
            return !c5bVar.isEmpty() ? c5bVar : t75.c("user:onyourwave");
        }
        List c = StationId.c(Q, c5bVar);
        c.getClass();
        return c;
    }

    @Override // defpackage.ypt
    public final euo getType() {
        return this.g;
    }
}
