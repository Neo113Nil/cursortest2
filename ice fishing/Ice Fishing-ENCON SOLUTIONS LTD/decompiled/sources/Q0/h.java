package Q0;

import P0.AbstractActivityC0072e;
import io.flutter.embedding.engine.FlutterEngine;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1549a = new ArrayList();

    public h(AbstractActivityC0072e abstractActivityC0072e, String[] strArr) {
        U0.c cVar = (U0.c) I0.b.F().f721b;
        if (cVar.f1819b) {
            return;
        }
        cVar.d(abstractActivityC0072e.getApplicationContext());
        cVar.a(abstractActivityC0072e.getApplicationContext(), strArr);
    }

    public final FlutterEngine a(g gVar) {
        R0.a aVar;
        FlutterEngine flutterEngine;
        AbstractActivityC0072e abstractActivityC0072e = gVar.f1543a;
        R0.a aVar2 = gVar.f1544b;
        String str = gVar.f1545c;
        List<String> list = gVar.f1546d;
        io.flutter.plugin.platform.k kVar = new io.flutter.plugin.platform.k();
        boolean z2 = gVar.f1547e;
        boolean z3 = gVar.f1548f;
        if (aVar2 == null) {
            U0.c cVar = (U0.c) I0.b.F().f721b;
            if (!cVar.f1819b) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            aVar = new R0.a((String) cVar.f1822e.f1169c, "main");
        } else {
            aVar = aVar2;
        }
        ArrayList arrayList = this.f1549a;
        if (arrayList.size() == 0) {
            flutterEngine = new FlutterEngine(abstractActivityC0072e, null, kVar, z2, z3);
            if (str != null) {
                flutterEngine.f7714i.f1952a.G("setInitialRoute", str, null);
            }
            flutterEngine.f7708c.a(aVar, list);
        } else {
            FlutterEngine flutterEngine2 = (FlutterEngine) arrayList.get(0);
            if (!flutterEngine2.f7706a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            long j2 = FlutterEngine.f7704y;
            flutterEngine = new FlutterEngine(abstractActivityC0072e, flutterEngine2.f7706a.spawn(aVar.f1706c, aVar.f1705b, str, list, j2), kVar, z2, z3);
        }
        arrayList.add(flutterEngine);
        flutterEngine.f7726v.add(new f(this, flutterEngine));
        return flutterEngine;
    }
}
