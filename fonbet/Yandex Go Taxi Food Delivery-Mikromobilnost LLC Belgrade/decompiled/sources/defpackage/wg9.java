package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.analytics.OrganizationChangeReporter$ChangeType;
import com.yandex.messaging.analytics.OrganizationChangeSource;
import com.yandex.messaging.data.e;
import com.yandex.messaging.domain.chat.b;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes15.dex */
public final class wg9 extends ky4 {
    public final ai80 y;
    public final e z;

    public wg9(ChatRequest chatRequest, ai80 ai80Var, e eVar) {
        super(chatRequest);
        this.y = ai80Var;
        this.z = eVar;
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        Object obj;
        w4b0[] w4b0VarArr;
        b bVar = (b) ((m8g) s020Var).E0.get();
        kse.a(bVar.e);
        k020 k020Var = bVar.c;
        o1b0 o1b0Var = bVar.b;
        j3b l = k020Var.l(o1b0Var.b);
        Long l2 = null;
        if (l != null && !l.K && !l.H) {
            boolean v = k020Var.v();
            List o = k020Var.o(o1b0Var);
            if (!o.isEmpty()) {
                long c = bVar.d.c();
                if (o.contains(Long.valueOf(c))) {
                    l2 = Long.valueOf(c);
                } else {
                    x4b0 A = k020Var.A();
                    Iterator it = ((A == null || (w4b0VarArr = A.j) == null) ? EmptyList.a : j73.d0(w4b0VarArr)).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (o.contains(Long.valueOf(((w4b0) obj).a))) {
                                break;
                            }
                        }
                    }
                    w4b0 w4b0Var = (w4b0) obj;
                    if (w4b0Var != null) {
                        l2 = Long.valueOf(w4b0Var.d ? 0L : w4b0Var.a);
                    }
                }
            } else if (!v) {
                l2 = 0L;
            }
        }
        if (l2 != null) {
            long longValue = l2.longValue();
            e eVar = this.z;
            Long a = eVar.a();
            eVar.a.edit().putLong("user_current_org_id", longValue).apply();
            OrganizationChangeReporter$ChangeType organizationChangeReporter$ChangeType = OrganizationChangeReporter$ChangeType.ChatOpened;
            ai80 ai80Var = this.y;
            ai80Var.getClass();
            ai80Var.a(a, longValue, organizationChangeReporter$ChangeType, OrganizationChangeSource.AutoChange);
        }
        h();
    }
}
