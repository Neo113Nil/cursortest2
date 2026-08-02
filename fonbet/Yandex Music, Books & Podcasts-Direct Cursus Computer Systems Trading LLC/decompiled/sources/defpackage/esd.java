package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class esd extends ito {
    public final Handler a;
    public volatile boolean b;

    public esd(Handler handler) {
        this.a = handler;
    }

    @Override // defpackage.ka8
    public final void a() {
        this.b = true;
        this.a.removeCallbacksAndMessages(this);
    }

    @Override // defpackage.ito
    public final ka8 b(Runnable runnable, long j, TimeUnit timeUnit) {
        t4b t4bVar = t4b.a;
        if (timeUnit == null) {
            jj4.j("unit == null");
            return null;
        }
        if (this.b) {
            return t4bVar;
        }
        Handler handler = this.a;
        fsd fsdVar = new fsd(handler, runnable);
        Message obtain = Message.obtain(handler, fsdVar);
        obtain.obj = this;
        this.a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
        if (!this.b) {
            return fsdVar;
        }
        this.a.removeCallbacks(fsdVar);
        return t4bVar;
    }
}
