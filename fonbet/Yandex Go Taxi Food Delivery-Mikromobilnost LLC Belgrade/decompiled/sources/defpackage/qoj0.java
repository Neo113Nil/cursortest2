package defpackage;

import com.yandex.go.zone.model.Zone;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;

/* loaded from: classes8.dex */
public final class qoj0 {
    public final dqe0 a;
    public final RequirementsChangedNotifier b;
    public final bte0 c;
    public final jti0 d;

    public qoj0(dqe0 dqe0Var, RequirementsChangedNotifier requirementsChangedNotifier, bte0 bte0Var, jti0 jti0Var) {
        this.a = dqe0Var;
        this.b = requirementsChangedNotifier;
        this.c = bte0Var;
        this.d = jti0Var;
    }

    public final List a(Zone zone, List list) {
        LinkedHashMap c = this.c.c(zone, list);
        ArrayList arrayList = new ArrayList(c.size());
        for (Map.Entry entry : c.entrySet()) {
            String str = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            RequirementsParam.Companion.getClass();
            arrayList.add(new kmx0(str, rpj0.a(null, list2)));
        }
        return a.x0(arrayList, new poj0());
    }
}
