package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.Typing;

/* loaded from: classes15.dex */
public final class z821 extends ky4 {
    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        if (j3bVar.H || j3bVar.I) {
            h();
            return;
        }
        ex80 ex80Var = (ex80) ((m8g) s020Var).R.get();
        z83.g(null, ex80Var.a.getLooper(), Looper.myLooper());
        wor0 wor0Var = ex80Var.x;
        if (wor0Var != null) {
            ex80Var.b.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - ex80Var.w >= 2000) {
                ex80Var.w = currentTimeMillis;
                ((n5t0) wor0Var.a).d(new ClientMessage(new Typing(ex80Var.c.b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, 268435454, null));
            }
        }
        h();
    }
}
