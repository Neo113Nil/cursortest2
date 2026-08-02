package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;

/* loaded from: classes9.dex */
public final class rpj0 {
    public static RequirementsParam a(String str, List list) {
        RequirementsParam requirementsParam = new RequirementsParam();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b580 b580Var = (b580) it.next();
            requirementsParam.put(b580Var.a, q5z.k0(b580Var.b()));
        }
        if (str != null) {
            requirementsParam.put("coupon", str);
        }
        if (requirementsParam.isEmpty()) {
            return null;
        }
        return requirementsParam;
    }

    public final KSerializer serializer() {
        return new spj0();
    }
}
