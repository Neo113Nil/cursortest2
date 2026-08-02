package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.a;

/* loaded from: classes8.dex */
public abstract class vx21 {
    public static final i3y a = a.a(new gs21(9));
    public static final ix21 b = new ix21();

    public static final void a(Handler handler, sls slsVar) {
        if (jl40.l(Looper.myLooper(), handler.getLooper())) {
            slsVar.invoke();
        } else {
            handler.post(new c82(6, slsVar));
        }
    }

    public static final void b(sls slsVar) {
        a((Handler) a.getValue(), slsVar);
    }
}
