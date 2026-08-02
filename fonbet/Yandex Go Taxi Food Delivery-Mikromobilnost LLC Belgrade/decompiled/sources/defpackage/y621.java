package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.proto.BoolFlag;
import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import com.yandex.messaging.data.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes15.dex */
public final class y621 extends ky4 {
    public final z621 y;
    public x08 z;

    public y621(ChatRequest chatRequest, z621 z621Var) {
        super(chatRequest);
        this.y = z621Var;
    }

    @Override // defpackage.ky4, defpackage.xx4, defpackage.hr
    public final void b() {
        super.b();
        x08 x08Var = this.z;
        if (x08Var != null) {
            x08Var.cancel();
        }
        this.z = null;
    }

    @Override // defpackage.hr
    public final boolean f(hr hrVar) {
        if (!(hrVar instanceof y621)) {
            return false;
        }
        y621 y621Var = (y621) hrVar;
        return jl40.l(y621Var.w, this.w) && y621Var.y.a == this.y.a;
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        ax10 ax10Var = (ax10) ((m8g) s020Var).y0.get();
        z621 z621Var = this.y;
        Boolean bool = z621Var.b;
        ax10Var.getClass();
        boolean booleanValue = bool.booleanValue();
        BoolFlag.INSTANCE.getClass();
        Integer valueOf = Integer.valueOf((booleanValue ? BoolFlag.SET : BoolFlag.UNSET).getValue());
        MessageRef a = MessageRef.a(z621Var.a, ax10Var.b.b);
        boolean booleanValue2 = bool.booleanValue();
        a aVar = ax10Var.d;
        kse.a(aVar.a);
        int incrementAndGet = aVar.b.incrementAndGet();
        ota0 ota0Var = new ota0(incrementAndGet, booleanValue2);
        aVar.d.put(a, ota0Var);
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) aVar.e.get(a);
        if (copyOnWriteArraySet != null) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((tls) it.next()).invoke(ota0Var);
            }
        }
        aVar.c.put(Integer.valueOf(incrementAndGet), a);
        this.z = ax10Var.a.f(new ab6(ax10Var, z621Var, valueOf, Integer.valueOf(incrementAndGet), 2));
    }
}
