package N6;

import c7.InterfaceC0545a;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import p7.C4853a;

/* loaded from: classes2.dex */
public final class r implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public Map f2001a;

    /* renamed from: b, reason: collision with root package name */
    public K6.b f2002b;

    /* renamed from: c, reason: collision with root package name */
    public K6.b f2003c;

    /* renamed from: d, reason: collision with root package name */
    public j f2004d;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f2002b.getClass();
        InterfaceC0545a interfaceC0545a = (InterfaceC0545a) obj;
        C4853a k9 = interfaceC0545a.k();
        Map map = (Map) this.f2001a.get(k9);
        if (map == null) {
            map = (Map) this.f2004d.f1985k.a();
            this.f2001a.put(k9, map);
        }
        this.f2003c.getClass();
        Y6.a l9 = interfaceC0545a.l();
        List list = (List) map.get(l9);
        if (list == null) {
            list = (List) this.f2004d.f1986l.a();
            map.put(l9, list);
        }
        list.add(obj);
    }
}
