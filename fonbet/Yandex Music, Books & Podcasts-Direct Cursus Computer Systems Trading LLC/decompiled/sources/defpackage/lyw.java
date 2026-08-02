package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class lyw implements Handler.Callback {
    public final gao a;
    public final fsn h;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e = false;
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean g = false;
    public final Object i = new Object();

    public lyw(Looper looper, gao gaoVar) {
        this.a = gaoVar;
        this.h = new fsn(looper, this);
    }

    public final void a(smd smdVar) {
        y1g.G(smdVar);
        synchronized (this.i) {
            try {
                if (this.d.contains(smdVar)) {
                    Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + String.valueOf(smdVar) + " is already registered");
                } else {
                    this.d.add(smdVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.wtf("GmsClientEvents", k5r.i(i, "Don't know how to handle message: "), new Exception());
            return false;
        }
        rmd rmdVar = (rmd) message.obj;
        synchronized (this.i) {
            try {
                if (this.e && this.a.L() && this.b.contains(rmdVar)) {
                    rmdVar.R(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
