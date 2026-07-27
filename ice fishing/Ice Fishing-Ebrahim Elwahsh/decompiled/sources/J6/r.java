package J6;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import l7.C4707a;

/* loaded from: classes2.dex */
public final class r implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public Map f1448a;

    /* renamed from: b, reason: collision with root package name */
    public G6.b f1449b;

    /* renamed from: c, reason: collision with root package name */
    public G6.b f1450c;

    /* renamed from: d, reason: collision with root package name */
    public j f1451d;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f1449b.getClass();
        Y6.a aVar = (Y6.a) obj;
        C4707a k6 = aVar.k();
        Map map = (Map) this.f1448a.get(k6);
        if (map == null) {
            map = (Map) this.f1451d.f1432k.a();
            this.f1448a.put(k6, map);
        }
        this.f1450c.getClass();
        U6.a l9 = aVar.l();
        List list = (List) map.get(l9);
        if (list == null) {
            list = (List) this.f1451d.f1433l.a();
            map.put(l9, list);
        }
        list.add(obj);
    }
}
