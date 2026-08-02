package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class gsd extends jto {
    public final Handler a;

    public gsd(Handler handler) {
        this.a = handler;
    }

    @Override // defpackage.jto
    public final ito a() {
        return new esd(this.a);
    }

    @Override // defpackage.jto
    public final ka8 c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            jj4.j("run == null");
            return null;
        }
        if (timeUnit == null) {
            jj4.j("unit == null");
            return null;
        }
        Handler handler = this.a;
        fsd fsdVar = new fsd(handler, runnable);
        handler.sendMessageDelayed(Message.obtain(handler, fsdVar), timeUnit.toMillis(j));
        return fsdVar;
    }
}
