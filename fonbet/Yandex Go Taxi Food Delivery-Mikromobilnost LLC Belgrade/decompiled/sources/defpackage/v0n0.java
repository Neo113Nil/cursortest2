package defpackage;

import android.content.Context;
import com.yandex.go.flex.common.facade.b;
import com.yandex.go.scooters.bdui.api.ScootersBduiScreenType;
import com.yandex.go.scooters.bdui.data.a;
import com.yandex.go.scooters.bdui.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes13.dex */
public final class v0n0 {
    public final yhr a;
    public final i0n0 b;
    public final a c;
    public final w0n0 d;

    public v0n0(yhr yhrVar, i0n0 i0n0Var, a aVar, w0n0 w0n0Var) {
        this.a = yhrVar;
        this.b = i0n0Var;
        this.c = aVar;
        this.d = w0n0Var;
    }

    public final ss9 a(o0n0 o0n0Var) {
        rhr nhrVar;
        rol0 a = this.c.a(o0n0Var, new e(o0n0Var.b));
        i0n0 i0n0Var = this.b;
        i0n0Var.getClass();
        d0n0 d0n0Var = o0n0Var.a;
        String str = d0n0Var.b;
        k6x k6xVar = o0n0Var.d;
        if (k6xVar == null) {
            k6xVar = new k6x();
        }
        k6x k6xVar2 = k6xVar;
        List list = o0n0Var.c;
        i0n0Var.c.getClass();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : EmptyList.a) {
            ((m0n0) obj).getClass();
            if (hashSet.add("scooters_bdui_loading_state_section")) {
                arrayList.add(obj);
            }
        }
        int d = gw00.d(tcc.n(arrayList, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            ((m0n0) next).getClass();
            linkedHashMap.put("scooters_bdui_loading_state_section", next);
        }
        ListBuilder a2 = rcc.a();
        m0n0 m0n0Var = (m0n0) linkedHashMap.get("scooters_bdui_loading_state_section");
        if (m0n0Var == null) {
            m0n0Var = m0n0.a;
        }
        a2.add(x0n0.a(m0n0Var));
        Collection values = linkedHashMap.values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = values.iterator();
        while (it2.hasNext()) {
            ((m0n0) it2.next()).getClass();
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            a2.add(x0n0.a((m0n0) it3.next()));
        }
        vlr vlrVar = new vlr(str, new ncw(1, i0n0Var), null, new g0p(null, a2.j(), list, null, null, null, null, null, 1013), null, null, null, null, null, null, k6xVar2, null, null, null, null, null, null, null, null, 1046506);
        int i = h0n0.a[d0n0Var.c.ordinal()];
        if (i == 1) {
            nhrVar = new nhr(vlrVar, null, a, null, null, null, null, i0n0Var.a, null, null, 7930);
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            nhrVar = new qhr(vlrVar, a, null, false, null, null, false, null, false, false, null, null, null, null, 4194298);
        }
        nhr nhrVar2 = nhrVar instanceof nhr ? (nhr) nhrVar : null;
        ljr ljrVar = nhrVar2 != null ? nhrVar2.i : null;
        b a3 = ((nir) this.a).a(nhrVar);
        ScootersBduiScreenType scootersBduiScreenType = d0n0Var.c;
        ewn0 ewn0Var = d0n0Var.e;
        gus gusVar = this.d.a;
        return new ss9((Context) gusVar.a.get(), (w030) gusVar.b.get(), scootersBduiScreenType, a3, ljrVar, ewn0Var);
    }
}
