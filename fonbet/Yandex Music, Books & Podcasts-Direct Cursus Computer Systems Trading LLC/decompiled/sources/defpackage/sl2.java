package defpackage;

import android.content.Context;
import java.util.Map;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class sl2 implements rzm {
    public final /* synthetic */ int a = 1;
    public final szm b;
    public final szm c;
    public final szm d;
    public final Object e;
    public final Object f;

    public sl2(toe toeVar, rzm rzmVar, rzm rzmVar2, toe toeVar2, toe toeVar3) {
        this.b = toeVar;
        this.f = rzmVar;
        this.c = rzmVar2;
        this.d = toeVar2;
        this.e = toeVar3;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new rl2((Context) this.b.get(), (ggj) ((rzm) this.f).get(), (pxf) this.c.get(), (g86) this.d.get(), (g0c) ((szm) this.e).get());
            case 1:
                cr crVar = (cr) this.f;
                pxf pxfVar = (pxf) this.b.get();
                g86 g86Var = (g86) this.c.get();
                g0c g0cVar = (g0c) this.d.get();
                b0j b0jVar = (b0j) ((szm) this.e).get();
                pxfVar.getClass();
                g86Var.getClass();
                g0cVar.getClass();
                b0jVar.getClass();
                ln lnVar = (ln) crVar.f;
                return vnj.k(pxfVar, lnVar.h, g86Var, lnVar.i, g0cVar, b0jVar, (Context) crVar.b, (jdk) crVar.c, lnVar.k, gxd.b);
            case 2:
                cr crVar2 = (cr) this.e;
                pxf pxfVar2 = (pxf) this.b.get();
                g86 g86Var2 = (g86) this.c.get();
                g0c g0cVar2 = (g0c) this.d.get();
                b0j b0jVar2 = (b0j) ((rzm) this.f).get();
                efs efsVar = new efs();
                pxfVar2.getClass();
                g86Var2.getClass();
                g0cVar2.getClass();
                b0jVar2.getClass();
                Context context = (Context) crVar2.b;
                jdk jdkVar = (jdk) crVar2.c;
                pyh pyhVar = (pyh) crVar2.e;
                ln lnVar2 = (ln) crVar2.f;
                return vnj.l(context, jdkVar, pyhVar, lnVar2.k, lnVar2.f, lnVar2.h, pxfVar2, g86Var2, lnVar2.i, g0cVar2, b0jVar2, lnVar2.A, gxd.b, lnVar2.y, efsVar);
            default:
                if (this.b.get() != null) {
                    l1j.f();
                    return null;
                }
                Map map = (Map) this.c.get();
                g0c g0cVar3 = (g0c) this.d.get();
                OkHttpClient okHttpClient = (OkHttpClient) ((rzm) this.f).get();
                ((qp2) this.e).get();
                map.getClass();
                g0cVar3.getClass();
                okHttpClient.getClass();
                return new n9t();
        }
    }

    public sl2(cr crVar, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4) {
        this.f = crVar;
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
        this.e = rzmVar4;
    }

    public sl2(rzm rzmVar, o9h o9hVar, rzm rzmVar2, rzm rzmVar3, qp2 qp2Var) {
        this.b = rzmVar;
        this.c = o9hVar;
        this.d = rzmVar2;
        this.f = rzmVar3;
        this.e = qp2Var;
    }

    public sl2(cr crVar, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, os2 os2Var) {
        this.e = crVar;
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
        this.f = rzmVar4;
    }
}
