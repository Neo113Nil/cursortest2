package defpackage;

import io.grpc.internal.b;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class jjp extends bt1 {
    public final /* synthetic */ qe6 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ tjp e;
    public final /* synthetic */ fjp f;
    public final /* synthetic */ xop g;
    public final /* synthetic */ qgr h;
    public final /* synthetic */ s2i i;
    public final /* synthetic */ Executor j;
    public final /* synthetic */ sfm k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjp(sfm sfmVar, qe6 qe6Var, String str, tjp tjpVar, fjp fjpVar, xop xopVar, qgr qgrVar, s2i s2iVar, Executor executor) {
        super(1, qe6Var);
        this.k = sfmVar;
        this.c = qe6Var;
        this.d = str;
        this.e = tjpVar;
        this.f = fjpVar;
        this.g = xopVar;
        this.h = qgrVar;
        this.i = s2iVar;
        this.j = executor;
    }

    @Override // defpackage.bt1
    public final void b() {
        jkk.c();
        try {
            jkk.a();
            jee jeeVar = jkk.a;
            jeeVar.getClass();
            d();
            jeeVar.getClass();
        } catch (Throwable th) {
            try {
                jkk.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d() {
        qe6 qe6Var = this.c;
        fjp fjpVar = this.f;
        String str = this.d;
        xop xopVar = this.g;
        sfm sfmVar = this.k;
        b bVar = (b) sfmVar.c;
        tjp tjpVar = this.e;
        try {
            pjp pjpVar = (pjp) bVar.e.j.get(str);
            if (pjpVar == null) {
                ljp ljpVar = bVar.f;
                tjpVar.b0();
                ljpVar.getClass();
                pjpVar = null;
            }
            if (pjpVar == null) {
                sgr i = sgr.m.i("Method not found: " + str);
                fjpVar.c(b.x);
                tjpVar.Q(i, new s2i());
                qe6Var.Q(null);
                xopVar.cancel(false);
                return;
            }
            pjp j = sfm.j(sfmVar, tjpVar, pjpVar, this.h);
            s2i s2iVar = this.i;
            k3i k3iVar = j.a;
            b bVar2 = (b) sfmVar.c;
            xip xipVar = new xip(tjpVar, k3iVar, s2iVar, qe6Var, bVar2.s, bVar2.u);
            vip vipVar = j.b;
            kjp kjpVar = new kjp();
            kjpVar.a = xipVar;
            kjpVar.b = vipVar;
            xopVar.l(kjpVar);
        } catch (Throwable th) {
            fjpVar.c(b.x);
            tjpVar.Q(sgr.f(th), new s2i());
            qe6Var.Q(null);
            xopVar.cancel(false);
            throw th;
        }
    }
}
