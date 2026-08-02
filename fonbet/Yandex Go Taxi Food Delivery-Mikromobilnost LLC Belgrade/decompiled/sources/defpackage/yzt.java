package defpackage;

import com.yandex.plus.core.graphql.target.a;
import com.yandex.plus.log.api.LogPriority;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class yzt {
    public final sls a;
    public final sls b;
    public final rkd0 c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final ReentrantLock f;

    public yzt(qo2 qo2Var, a aVar, tho thoVar, mio mioVar, w1d0 w1d0Var, sls slsVar, sls slsVar2, xyj xyjVar, ike ikeVar, rkd0 rkd0Var, ybf ybfVar) {
        this.a = slsVar;
        this.b = slsVar2;
        this.c = rkd0Var;
        jzz jzzVar = new jzz(w1d0Var);
        tje.a(sbx.d, new suf(2));
        new w0s0();
        new s400(jzzVar);
        new x070();
        new sfc0(27);
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new ReentrantLock();
    }

    public final void a() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            rkd0 rkd0Var = this.c;
            LogPriority logPriority = LogPriority.DEBUG;
            if (rkd0Var.e(logPriority)) {
                rkd0Var.b(logPriority, "GraphQLPanelRepository", "clearCache()", null);
            }
            Iterator it = this.e.entrySet().iterator();
            while (it.hasNext()) {
                kotlinx.coroutines.a.h((l8x) ((Map.Entry) it.next()).getValue());
            }
            Iterator it2 = this.d.entrySet().iterator();
            while (it2.hasNext()) {
                ((r0) ((pz40) ((Map.Entry) it2.next()).getValue())).l(null);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
