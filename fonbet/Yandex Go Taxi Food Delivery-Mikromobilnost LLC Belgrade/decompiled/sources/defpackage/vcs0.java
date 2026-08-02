package defpackage;

import kotlinx.coroutines.channels.a;

/* loaded from: classes.dex */
public final class vcs0 {
    public final tse a;
    public final wls b;
    public final a c = sb2.a(Integer.MAX_VALUE, null, null, 6);
    public final gp50 d = new gp50(5);

    public vcs0(tse tseVar, d8 d8Var, yk ykVar, wls wlsVar) {
        this.a = tseVar;
        this.b = wlsVar;
        l8x l8xVar = (l8x) tseVar.getCoroutineContext().get(seu.C);
        if (l8xVar != null) {
            l8xVar.w(new ga1(15, d8Var, this, ykVar));
        }
    }
}
