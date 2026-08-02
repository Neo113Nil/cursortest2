package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public abstract class t35 {
    public volatile Object a;
    public final Object b = new Object();
    public ArrayList c;

    public final Object a(ContinuationImpl continuationImpl) {
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        j18 j18Var = new j18(1, dvw.b(continuationImpl));
        j18Var.u();
        b(new vmz(10, j18Var.x, new si3(j18Var, 2)), true);
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    public final void b(tls tlsVar, boolean z) {
        Object obj = this.a;
        if (obj != null) {
            tlsVar.invoke(obj);
            return;
        }
        synchronized (this.b) {
            Object obj2 = this.a;
            if (obj2 != null) {
                tlsVar.invoke(obj2);
                return;
            }
            ArrayList arrayList = this.c;
            if (arrayList != null) {
                arrayList.add(tlsVar);
                return;
            }
            if (z) {
                this.c = scc.i(tlsVar);
                try {
                    c(new j24(7, this));
                } catch (Throwable th) {
                    synchronized (this.b) {
                        this.c = null;
                        throw th;
                    }
                }
            }
        }
    }

    public abstract void c(j24 j24Var);
}
