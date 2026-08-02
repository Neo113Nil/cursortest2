package defpackage;

import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.model.ZoneMode;
import com.yandex.go.zone.model.h;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final class srj0 {
    public final dqe0 a;
    public final pte0 b;

    public srj0(dqe0 dqe0Var, pte0 pte0Var) {
        this.a = dqe0Var;
        this.b = pte0Var;
    }

    public final boolean a() {
        List list;
        Object obj;
        Zone c = this.a.c();
        if (c != null && (list = c.v) != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                h hVar = ZoneMode.Companion;
                String str = ((ZoneMode) obj).a;
                hVar.getClass();
                if (h.a(str)) {
                    break;
                }
            }
            ZoneMode zoneMode = (ZoneMode) obj;
            if (zoneMode == null) {
                zoneMode = (ZoneMode) a.P(list);
            }
            pte0 pte0Var = this.b;
            String b = pte0Var.b();
            String str2 = zoneMode.a;
            if (!jl40.l(b, str2)) {
                if (pte0Var.b() == null) {
                    h hVar2 = ZoneMode.Companion;
                    String str3 = zoneMode.a;
                    hVar2.getClass();
                    if (h.a(str3)) {
                        pte0Var.a(str2);
                        return false;
                    }
                }
                pte0Var.a(str2);
                return true;
            }
        }
        return false;
    }
}
