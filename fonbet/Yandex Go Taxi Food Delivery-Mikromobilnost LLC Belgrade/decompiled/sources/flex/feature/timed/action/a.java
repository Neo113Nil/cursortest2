package flex.feature.timed.action;

import defpackage.dtg;
import defpackage.dw;
import defpackage.etg;
import defpackage.ftg;
import defpackage.kr;
import defpackage.l8x;
import defpackage.n6u;
import defpackage.tje;
import defpackage.tse;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class a implements dw {
    public final tse a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();

    public a(tse tseVar) {
        this.a = tseVar;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        dtg dtgVar = (dtg) krVar;
        ftg ftgVar = new ftg(dtgVar);
        LinkedHashMap linkedHashMap = this.b;
        boolean containsKey = linkedHashMap.containsKey(ftgVar);
        tse tseVar = this.a;
        LinkedHashMap linkedHashMap2 = this.c;
        if (!containsKey) {
            linkedHashMap.put(ftgVar, new etg(dtgVar.c, n6uVar));
            linkedHashMap2.put(ftgVar, tje.N(tseVar, null, null, new DebounceActionHandler$startDebounce$currentJob$1(ftgVar, this, null), 3));
            return;
        }
        linkedHashMap.put(ftgVar, new etg(dtgVar.c, n6uVar));
        l8x l8xVar = (l8x) linkedHashMap2.get(ftgVar);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        linkedHashMap2.put(ftgVar, tje.N(tseVar, null, null, new DebounceActionHandler$startDebounce$currentJob$1(ftgVar, this, null), 3));
    }
}
