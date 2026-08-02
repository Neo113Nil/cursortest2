package defpackage;

import com.yandex.go.superapp.order.multi.old.provider.g;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.messenger.domain.MessengerChatOwner;

/* loaded from: classes9.dex */
public final class x020 {
    public final v220 a;
    public final g b;

    public x020(v220 v220Var, g gVar) {
        this.a = v220Var;
        this.b = gVar;
    }

    public final MessengerChatOwner a(String str) {
        List W;
        Object obj;
        Object obj2;
        W = evu0.W(str, new String[]{"/"}, (r2 & 4) != 0 ? 0 : 2);
        String str2 = (String) a.S(1, W);
        Iterator it = this.b.a().a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((o2y0) obj).b().V().q0, str)) {
                break;
            }
        }
        if (((o2y0) obj) != null) {
            return MessengerChatOwner.TAXI_ORDER;
        }
        if (str2 != null) {
            Iterator it2 = ((u220) this.a.c()).b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (jl40.l(((a250) obj2).a, str2)) {
                    break;
                }
            }
            a250 a250Var = (a250) obj2;
            if (a250Var != null) {
                return a250Var.b;
            }
        }
        return null;
    }
}
