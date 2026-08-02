package ru.yandex.taxi.layers.domain;

import defpackage.hit;
import defpackage.l8x;
import defpackage.lm00;
import defpackage.pzt0;
import defpackage.uud0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ru.yandex.taxi.common_models.net.map_object.Trigger;

/* loaded from: classes9.dex */
public final class a {
    public final ru.yandex.taxi.layers.domain.links.a a;
    public final hit b;
    public final com.yandex.go.layers.domain.g c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public a(ru.yandex.taxi.layers.domain.links.a aVar, hit hitVar, com.yandex.go.layers.domain.g gVar) {
        this.a = aVar;
        this.b = hitVar;
        this.c = gVar;
    }

    public final void a(boolean z, lm00 lm00Var) {
        List c = lm00Var.d.c();
        hit hitVar = this.b;
        if (z) {
            com.yandex.go.coroutines.b.g(hitVar.a, null, null, new AdvertObjectsInteractor$trackDirectPixelShowUrls$1(c, this, null), 3);
        }
        String str = lm00Var.a;
        List list = lm00Var.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((uud0) obj).getB() == Trigger.SHOW) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
        if (arrayList2 == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.d;
        l8x l8xVar = (l8x) concurrentHashMap.get(str);
        if (l8xVar != null && l8xVar.isActive()) {
            l8xVar.a(null);
        }
        if (z) {
            pzt0 g = com.yandex.go.coroutines.b.g(hitVar.a, null, null, new AdvertObjectsInteractor$notifyDirectPixelShowUrl$job$1(this, str, lm00Var, arrayList2, null), 3);
            g.w(new defpackage.q(8, this, str, g));
            concurrentHashMap.put(str, g);
        }
    }
}
