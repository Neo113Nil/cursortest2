package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class hzr {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public hzr(Handler handler) {
        this.a = handler;
    }

    public static gzr d() {
        gzr gzrVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                gzrVar = arrayList.isEmpty() ? new gzr() : (gzr) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return gzrVar;
    }

    public final gzr a(int i, int i2, int i3) {
        gzr d = d();
        d.a = this.a.obtainMessage(i, i2, i3);
        return d;
    }

    public final gzr b(int i, int i2, Object obj, int i3) {
        gzr d = d();
        d.a = this.a.obtainMessage(i, i2, i3, obj);
        return d;
    }

    public final gzr c(int i, Object obj) {
        gzr d = d();
        d.a = this.a.obtainMessage(i, obj);
        return d;
    }

    public final void e(Runnable runnable) {
        this.a.post(runnable);
    }

    public final void f(int i) {
        vq1.v(i != 0);
        this.a.removeMessages(i);
    }

    public final void g(int i) {
        this.a.sendEmptyMessage(i);
    }
}
