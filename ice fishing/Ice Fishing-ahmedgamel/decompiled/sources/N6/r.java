package N6;

import c7.InterfaceC0556a;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import p7.C4853a;

/* loaded from: classes2.dex */
public final class r implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public Map f2089a;

    /* renamed from: b, reason: collision with root package name */
    public K6.b f2090b;

    /* renamed from: c, reason: collision with root package name */
    public K6.b f2091c;

    /* renamed from: d, reason: collision with root package name */
    public j f2092d;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f2090b.getClass();
        InterfaceC0556a interfaceC0556a = (InterfaceC0556a) obj;
        C4853a k9 = interfaceC0556a.k();
        Map map = (Map) this.f2089a.get(k9);
        if (map == null) {
            map = (Map) this.f2092d.f2073k.a();
            this.f2089a.put(k9, map);
        }
        this.f2091c.getClass();
        Y6.a l9 = interfaceC0556a.l();
        List list = (List) map.get(l9);
        if (list == null) {
            list = (List) this.f2092d.f2074l.a();
            map.put(l9, list);
        }
        list.add(obj);
    }
}
