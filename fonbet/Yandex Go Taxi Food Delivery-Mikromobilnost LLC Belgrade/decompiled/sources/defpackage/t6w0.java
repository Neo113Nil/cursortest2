package defpackage;

import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment;
import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment$SearchbarAction$Deeplink;
import com.yandex.go.superapp.discovery.map.impl.experiments.l;
import com.yandex.go.superapp.discovery.map.impl.experiments.n;
import com.yandex.go.superapp.discovery.map.impl.experiments.o;
import com.yandex.go.superapp.discovery.map.impl.experiments.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;

/* loaded from: classes14.dex */
public final class t6w0 {
    public final k7x0 a;

    public t6w0(k7x0 k7x0Var) {
        this.a = k7x0Var;
    }

    public static y4w0 a(p pVar) {
        if (pVar instanceof l) {
            return v4w0.a;
        }
        if (pVar instanceof n) {
            return x4w0.a;
        }
        if (pVar instanceof SuperAppDiscoveryMapExperiment$SearchbarAction$Deeplink) {
            return new w4w0(((SuperAppDiscoveryMapExperiment$SearchbarAction$Deeplink) pVar).a);
        }
        if (pVar instanceof o) {
            return null;
        }
        w511.b();
        return null;
    }

    public final List b(List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SuperAppDiscoveryMapExperiment.Button button = (SuperAppDiscoveryMapExperiment.Button) it.next();
            String str = button.a;
            u4w0 u4w0Var = null;
            if (evu0.J(str)) {
                str = null;
            }
            if (str != null) {
                String a = ((m7x0) this.a).a(str);
                String str2 = (String) map.get(button.b);
                if (str2 == null) {
                    str2 = "";
                }
                u4w0Var = new u4w0(a, str2, a(button.c));
            }
            if (u4w0Var != null) {
                arrayList.add(u4w0Var);
            }
        }
        return a.A0(arrayList, 2);
    }
}
