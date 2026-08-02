package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class eic implements rzm {
    public final cic a;
    public final szm b;
    public final szm c;
    public final szm d;
    public final szm e;
    public final szm f;
    public final szm g;
    public final szm h;
    public final rzm i;

    public eic(cic cicVar, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, rzm rzmVar6, rzm rzmVar7, rzm rzmVar8) {
        this.a = cicVar;
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
        this.e = rzmVar4;
        this.f = rzmVar5;
        this.g = rzmVar6;
        this.h = rzmVar7;
        this.i = rzmVar8;
    }

    @Override // defpackage.szm
    public final Object get() {
        cic cicVar = this.a;
        jdk jdkVar = (jdk) this.b.get();
        pyh pyhVar = (pyh) this.c.get();
        Context context = (Context) this.d.get();
        g0c g0cVar = (g0c) this.e.get();
        wm wmVar = (wm) this.f.get();
        dj2 dj2Var = (dj2) this.g.get();
        pxf pxfVar = (pxf) this.h.get();
        bhg bhgVar = (bhg) this.i.get();
        jdkVar.getClass();
        pyhVar.getClass();
        context.getClass();
        g0cVar.getClass();
        wmVar.getClass();
        dj2Var.getClass();
        pxfVar.getClass();
        bhgVar.getClass();
        joj jojVar = new joj();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        jojVar.e(10L, timeUnit);
        jojVar.c(10L, timeUnit);
        jojVar.c.add(new bic(dj2Var, pyhVar, wmVar, cicVar, g0cVar, jdkVar, context, bhgVar));
        if (pxfVar.a.a) {
            y6e y6eVar = new y6e();
            y6eVar.c = 4;
            jojVar.c.add(y6eVar);
        }
        return new OkHttpClient(jojVar);
    }
}
