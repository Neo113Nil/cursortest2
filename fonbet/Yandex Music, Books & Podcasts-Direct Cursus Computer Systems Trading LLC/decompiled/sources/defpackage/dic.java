package defpackage;

import android.content.Context;

/* loaded from: classes4.dex */
public final class dic implements rzm {
    public final /* synthetic */ int a;
    public final szm b;
    public final szm c;
    public final szm d;
    public final szm e;
    public final szm f;

    public /* synthetic */ dic(Object obj, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, int i) {
        this.a = i;
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
        this.e = rzmVar4;
        this.f = rzmVar5;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                pxf pxfVar = (pxf) this.b.get();
                g0c g0cVar = (g0c) this.c.get();
                Context context = (Context) this.d.get();
                jdk jdkVar = (jdk) this.e.get();
                ln lnVar = (ln) this.f.get();
                pxfVar.getClass();
                g0cVar.getClass();
                context.getClass();
                jdkVar.getClass();
                lnVar.getClass();
                return new dj2(context, jdkVar, lnVar.k, pxfVar.a.a, g0cVar);
            default:
                jdk jdkVar2 = (jdk) this.b.get();
                pyh pyhVar = (pyh) this.c.get();
                t28 t28Var = (t28) this.d.get();
                int intValue = ((Integer) this.e.get()).intValue();
                g0c g0cVar2 = (g0c) this.f.get();
                jdkVar2.getClass();
                pyhVar.getClass();
                t28Var.getClass();
                g0cVar2.getClass();
                return new tbk(wxf.Q(jdkVar2), new yx3(pyhVar.a), t28Var, intValue, g0cVar2);
        }
    }
}
