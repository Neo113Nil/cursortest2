package defpackage;

import kotlinx.serialization.modules.a;

/* loaded from: classes12.dex */
public final class sx implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ndx b;

    public /* synthetic */ sx(ndx ndxVar, int i) {
        this.a = i;
        this.b = ndxVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ndx ndxVar = this.b;
        switch (i) {
            case 0:
                kf5 kf5Var = ndxVar.a.b;
                a aVar = new a();
                bvf0.b0(aVar);
                ((acx) obj).n = itq0.a(kf5Var, aVar.a());
                break;
            case 1:
                kf5 kf5Var2 = ndxVar.a.b;
                a aVar2 = new a();
                bvf0.b0(aVar2);
                ((acx) obj).n = itq0.a(kf5Var2, aVar2.a());
                break;
            default:
                kf5 kf5Var3 = ndxVar.a.b;
                a aVar3 = new a();
                bvf0.b0(aVar3);
                ((acx) obj).n = itq0.a(kf5Var3, aVar3.a());
                break;
        }
        return zy11Var;
    }
}
