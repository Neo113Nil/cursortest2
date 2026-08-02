package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class s4k {
    public final fmq a = new fmq(5);

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public abstract Object c(t4k t4kVar);

    public final void d() {
        imp impVar;
        fmq fmqVar = this.a;
        ArrayList arrayList = (ArrayList) fmqVar.d;
        boolean z = false;
        if (!fmqVar.b) {
            ReentrantLock reentrantLock = (ReentrantLock) fmqVar.c;
            reentrantLock.lock();
            try {
                if (!fmqVar.b) {
                    z = true;
                    fmqVar.b = true;
                    List<Function0> w0 = CollectionsKt.w0(arrayList);
                    arrayList.clear();
                    if (w0 != null) {
                        for (Function0 function0 : w0) {
                            function0.getClass();
                            function0.invoke();
                        }
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        if (z && (impVar = hyf.a) != null && Log.isLoggable("Paging", 3)) {
            impVar.getClass();
            Log.d("Paging", "Invalidated PagingSource " + this);
        }
    }

    public abstract Object e(o4k o4kVar, cg6 cg6Var);
}
