package com.yandex.plus.core.benchmark;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class a implements v {
    public final Class a;

    public a(Class cls) {
        this.a = cls;
    }

    public abstract void b(l lVar, m mVar, Map map);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Class] */
    @Override // com.yandex.plus.core.benchmark.v
    public final void c(l lVar, Map map) {
        m mVar;
        lVar.getClass();
        Object obj = lVar.d.a.get();
        obj.getClass();
        if (((d) obj) == d.c) {
            Iterator it = lVar.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    mVar = 0;
                    break;
                } else {
                    mVar = it.next();
                    if (this.a.isInstance(mVar)) {
                        break;
                    }
                }
            }
            m mVar2 = mVar instanceof m ? mVar : null;
            if (mVar2 != null) {
                b(lVar, mVar2, map);
            }
        }
    }
}
