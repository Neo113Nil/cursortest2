package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class r8j implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wwf b;

    public /* synthetic */ r8j(wwf wwfVar, int i) {
        this.a = i;
        this.b = wwfVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wwf wwfVar = this.b;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    qti.a((hwy0) wwfVar.c, wwg.S(245773280, true, new r8j(wwfVar, i3), btsVar), btsVar, 56);
                    break;
                }
            case 1:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    xi91.a(wwg.S(-1618146743, true, new r8j(wwfVar, i2), btsVar2), btsVar2, 6);
                    break;
                }
            default:
                o9j o9jVar = (o9j) wwfVar.b;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    String obj3 = o9jVar.toString();
                    yt0 yt0Var = new yt0((j2m0) btsVar3.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), o9jVar, 10);
                    rs31 a = f5z.a(btsVar3);
                    if (a == null) {
                        ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        break;
                    } else {
                        y891.a((o9j) ooc.G(qoi0.a(o9j.class), a, obj3, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar3), btsVar3, 0);
                        break;
                    }
                }
        }
        return zy11Var;
    }
}
