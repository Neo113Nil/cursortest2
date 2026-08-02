package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class yqh extends zqh {
    public final Object a = new Object();
    public Executor b;
    public oxa c;
    public dqh d;
    public ArrayList e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(dqh dqhVar, ArrayList arrayList) {
        if (dqhVar == null) {
            jj4.j("groupRoute must not be null");
            return;
        }
        synchronized (this.a) {
            try {
                try {
                    Executor executor = this.b;
                    if (executor != null) {
                        executor.execute(new t5(this, this.c, dqhVar, arrayList, 8));
                    } else {
                        this.d = dqhVar;
                        this.e = new ArrayList(arrayList);
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public abstract void m(String str);

    public abstract void n(String str);

    public abstract void o(List list);
}
