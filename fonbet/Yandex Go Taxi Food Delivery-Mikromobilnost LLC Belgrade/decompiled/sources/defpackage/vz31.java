package defpackage;

import androidx.room.util.a;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.poll.d;
import java.util.Iterator;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final class vz31 extends ky4 {
    public final nxd0 y;

    public vz31(ChatRequest chatRequest, nxd0 nxd0Var) {
        super(chatRequest);
        this.y = nxd0Var;
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        oxd0 oxd0Var = (oxd0) ((m8g) s020Var).x0.get();
        nxd0 nxd0Var = this.y;
        long j = nxd0Var.a;
        String str = nxd0Var.b;
        xxd0 xxd0Var = oxd0Var.b;
        eta0 eta0Var = xxd0Var.a;
        long j2 = nxd0Var.a;
        String str2 = nxd0Var.b;
        Iterator it = nxd0Var.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= 1 << ((Number) it.next()).intValue();
        }
        if (((Number) a.b(eta0Var.a, false, true, new ww90(5, eta0Var, new dta0(j2, str2, i, nxd0Var.d.getType(), nxd0Var.e, nxd0Var.f)))).longValue() != -1) {
            xxd0Var.b.put(new Pair(str, Long.valueOf(j)), nxd0Var);
            xxd0Var.c.g(new wxd0(str, j, true));
        }
        oxd0Var.a.f(new d(nxd0Var, oxd0Var, oxd0Var, oxd0Var));
    }
}
