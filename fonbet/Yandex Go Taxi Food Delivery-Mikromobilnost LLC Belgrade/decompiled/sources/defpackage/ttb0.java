package defpackage;

import android.os.Looper;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.ServerMessageRef;

/* loaded from: classes15.dex */
public final class ttb0 extends ky4 {
    public final ServerMessageRef y;
    public x08 z;

    public ttb0(ChatRequest chatRequest, ServerMessageRef serverMessageRef) {
        super(chatRequest);
        this.y = serverMessageRef;
    }

    @Override // defpackage.ky4, defpackage.xx4, defpackage.hr
    public final void b() {
        super.b();
        x08 x08Var = this.z;
        if (x08Var != null) {
            x08Var.cancel();
            this.z = null;
        }
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        ServerMessageRef serverMessageRef = this.y;
        long timestamp = serverMessageRef == null ? 0L : serverMessageRef.getTimestamp();
        w2c0 w2c0Var = (w2c0) ((m8g) s020Var).k.get();
        wnb0 wnb0Var = new wnb0(2, this);
        z83.g(null, w2c0Var.f, Looper.myLooper());
        this.z = w2c0Var.a.f(new t6b(w2c0Var, timestamp, wnb0Var));
    }
}
