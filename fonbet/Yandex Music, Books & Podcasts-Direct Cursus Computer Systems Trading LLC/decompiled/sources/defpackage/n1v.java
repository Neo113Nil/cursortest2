package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class n1v implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ia0 b;

    public /* synthetic */ n1v(ia0 ia0Var, int i) {
        this.a = i;
        this.b = ia0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ia0 ia0Var = this.b;
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(k3v.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                rp7Var.E(new n1v(ia0Var, 1));
                o18Var.c = hag.I(b3v.class);
                rp7Var.getClass();
                rp7Var.E(new n1v(ia0Var, 2));
                o18Var.c = hag.I(xpl.class);
                rp7Var.getClass();
                rp7Var.E(new n1v(ia0Var, 3));
                o18Var.c = hag.I(i4v.class);
                rp7Var.getClass();
                rp7Var.E(new n1v(ia0Var, 4));
                o18Var.c = hag.I(y3v.class);
                rp7Var.getClass();
                rp7Var.E(new n1v(ia0Var, 5));
                o18Var.c = hag.I(e4v.class);
                rp7Var.getClass();
                rp7Var.E(new n1v(ia0Var, 6));
                o18Var.c = hag.I(f3v.class);
                rp7Var.getClass();
                rp7Var.E(new n1v(ia0Var, 7));
                o18Var.c = hag.I(s3v.class);
                rp7Var.getClass();
                rp7Var.E(new n1v(ia0Var, 8));
                return Unit.a;
            case 1:
                ia0 ia0Var2 = this.b;
                ((l13) obj).getClass();
                return new k3v(new t1f(new kpm(19, ia0Var2)));
            case 2:
                ia0 ia0Var3 = this.b;
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new b3v((tf6) ia0Var3.a, (k1l) ia0Var3.f, ((k3v) l13Var.a.D(hag.I(k3v.class), l13Var, l13Var.b)).a);
            case 3:
                ia0 ia0Var4 = this.b;
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                tf6 tf6Var = (tf6) ia0Var4.a;
                oq7 oq7Var = (oq7) ia0Var4.e;
                nml nmlVar = (nml) ((jyr) ((k3v) l13Var2.a.D(hag.I(k3v.class), l13Var2, l13Var2.b)).a.c).getValue();
                bdt I = hag.I(fil.class);
                qdc qdcVar = nmlVar.a;
                qdcVar.getClass();
                return new xpl(oq7Var, tf6Var, (fil) qdcVar.C(I), (k1l) ia0Var4.f);
            case 4:
                ia0 ia0Var5 = this.b;
                ((l13) obj).getClass();
                return new i4v(new d18(ia0Var5));
            case 5:
                ia0 ia0Var6 = this.b;
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                bdt I2 = hag.I(b3v.class);
                qdc qdcVar2 = l13Var3.a;
                Set set = l13Var3.b;
                return new y3v((b3v) qdcVar2.D(I2, l13Var3, set), (xpl) qdcVar2.D(hag.I(xpl.class), l13Var3, set), (oq7) ia0Var6.e);
            case 6:
                ia0 ia0Var7 = this.b;
                ((l13) obj).getClass();
                return new e4v((jac) ia0Var7.j);
            case 7:
                ia0 ia0Var8 = this.b;
                ((l13) obj).getClass();
                return new f3v((yks) ia0Var8.h);
            default:
                ia0 ia0Var9 = this.b;
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new s3v(new q04(ia0Var9, l13Var4));
        }
    }
}
