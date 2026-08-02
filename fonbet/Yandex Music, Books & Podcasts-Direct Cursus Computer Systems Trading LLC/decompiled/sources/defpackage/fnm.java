package defpackage;

import kotlin.collections.CollectionsKt;
import timber.log.Timber;

/* loaded from: classes6.dex */
public abstract class fnm {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r3 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static nb7 a(a0o a0oVar, whn whnVar, whn whnVar2) {
        a0oVar.getClass();
        if (whnVar != null) {
            yde ydeVar = a0oVar.b;
            ydeVar.getClass();
            whnVar2 = whnVar.a(whnVar2, ((mu2) CollectionsKt.Q(ydeVar)).a);
        }
        whnVar = whnVar2;
        whnVar.getClass();
        return vwb.H(a0oVar, whnVar);
    }

    public static boolean b(so3 so3Var, vp3 vp3Var, nb7 nb7Var) {
        vp3Var.getClass();
        nb7Var.getClass();
        String f = vp3Var.f(nb7Var);
        f.getClass();
        qc6 a = so3Var.a(f);
        a.getClass();
        tk7 tk7Var = (tk7) a;
        long d = tk7Var.d(-1L, "exo_len");
        if (d != -1) {
            long e = so3Var.e(0L, d, f);
            long h = so3Var.h(0L, d, f);
            Timber.Companion companion = Timber.INSTANCE;
            StringBuilder l = tlm.l(d, "preloadedLength=", " cachedLength=");
            l.append(e);
            ouj.C(l, " cachedBytes=", h, " dataSpec=");
            l.append(nb7Var);
            companion.d(l.toString(), new Object[0]);
        }
        Timber.Companion companion2 = Timber.INSTANCE;
        StringBuilder sb = new StringBuilder("isDataSpecPreloaded cacheKey=");
        sb.append(f);
        sb.append(" meta=");
        sb.append(tk7Var);
        sb.append(' ');
        sb.append(d);
        sb.append(" dataSpec=");
        sb.append(nb7Var);
        companion2.d(su4.o(sb, " cacheKey=", f), new Object[0]);
        boolean z = d != -1;
        companion2.d(String.valueOf(z), new Object[0]);
        return z;
    }
}
