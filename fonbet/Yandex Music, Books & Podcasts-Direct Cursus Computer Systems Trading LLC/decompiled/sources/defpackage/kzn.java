package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.player.report.DebugReportImpl;
import ru.yandex.video.m3.player.report.DebugReportReason;

/* loaded from: classes6.dex */
public final class kzn extends bt2 {
    public Map e;
    public final LinkedHashMap a = new LinkedHashMap();
    public final anf b = new anf(50);
    public final anf c = new anf(10);
    public final LinkedHashMap d = new LinkedHashMap();
    public final knn f = new knn(0);

    @Override // defpackage.bt2
    public final DebugReportImpl a() {
        boolean isEmpty;
        ArrayList e = e(this.b);
        Map map = this.e;
        ArrayList e2 = e(this.c);
        Map o = uah.o(this.d);
        f9h f9hVar = new f9h();
        LinkedHashMap linkedHashMap = this.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            anf anfVar = (anf) entry.getValue();
            synchronized (anfVar) {
                isEmpty = anfVar.b.isEmpty();
            }
            if (!isEmpty) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            f9hVar.put((String) entry2.getKey(), e((anf) entry2.getValue()));
        }
        return new DebugReportImpl(e, f9hVar.b(), map, e2, o);
    }

    @Override // defpackage.bt2
    public final mnn c(String str, anf anfVar) {
        this.a.put(str, anfVar);
        return new nnn(str, anfVar, this);
    }

    @Override // defpackage.bt2
    public final void d(Map map) {
        map.getClass();
        this.e = map;
    }

    public final ArrayList e(anf anfVar) {
        List w0;
        String i;
        synchronized (anfVar) {
            w0 = CollectionsKt.w0(anfVar.b);
        }
        List<inn> o0 = CollectionsKt.o0(w0, new t1n(1));
        ArrayList arrayList = new ArrayList(v75.o(o0, 10));
        for (inn innVar : o0) {
            knn knnVar = this.f;
            knnVar.getClass();
            innVar.getClass();
            if (innVar instanceof dnn) {
                StringBuilder sb = new StringBuilder();
                dnn dnnVar = (dnn) innVar;
                sb.append(knnVar.r(dnnVar.c));
                sb.append(' ');
                sb.append(dnnVar.a);
                sb.append(": ");
                sb.append(dnnVar.b);
                i = sb.toString();
            } else if (innVar instanceof fnn) {
                StringBuilder sb2 = new StringBuilder();
                fnn fnnVar = (fnn) innVar;
                RuntimeException runtimeException = fnnVar.c;
                sb2.append(knnVar.r(fnnVar.d));
                sb2.append(' ');
                sb2.append(fnnVar.a);
                sb2.append('$');
                sb2.append(fnnVar.b);
                sb2.append(": ");
                sb2.append(runtimeException.getClass().getName());
                sb2.append(' ');
                sb2.append(runtimeException.getMessage());
                i = sb2.toString();
            } else if (innVar instanceof enn) {
                StringBuilder sb3 = new StringBuilder();
                enn ennVar = (enn) innVar;
                sb3.append(knnVar.r(ennVar.b));
                sb3.append(": ");
                sb3.append(ennVar.a);
                i = sb3.toString();
            } else {
                if (!(innVar instanceof hnn)) {
                    b6e.s();
                    return null;
                }
                StringBuilder sb4 = new StringBuilder();
                hnn hnnVar = (hnn) innVar;
                sb4.append(knnVar.r(hnnVar.a));
                sb4.append('-');
                sb4.append(knnVar.r(hnnVar.b));
                sb4.append(": prepareSynchronouslyInternal (");
                String m = hrg.m(hnnVar.c, " ms", new StringBuilder("duration="));
                String str = hnnVar.d;
                i = dfi.i(sb4, CollectionsKt.X(xz0.w(new String[]{m, str != null ? "interrupted by ".concat(str) : null}), null, null, null, null, 63), ')');
            }
            arrayList.add(i);
        }
        return arrayList;
    }

    @Override // defpackage.bt2
    public final void b(DebugReportReason debugReportReason) {
    }
}
