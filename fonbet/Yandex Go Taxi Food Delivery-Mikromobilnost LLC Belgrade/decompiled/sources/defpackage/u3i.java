package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.d;

/* loaded from: classes5.dex */
public final /* synthetic */ class u3i implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3i b;
    public final /* synthetic */ v3i c;

    public /* synthetic */ u3i(w3i w3iVar, v3i v3iVar, int i) {
        this.a = i;
        this.b = w3iVar;
        this.c = v3iVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        v3i v3iVar = this.c;
        w3i w3iVar = this.b;
        int i2 = 1;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    xi91.a(wwg.S(1316655048, true, new u3i(w3iVar, v3iVar, i2), btsVar), btsVar, 6);
                    break;
                }
            default:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    String str = (String) w3iVar.B;
                    yt0 yt0Var = new yt0((j2m0) btsVar2.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), (d) w3iVar.z, 7);
                    rs31 a = f5z.a(btsVar2);
                    if (a == null) {
                        ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        break;
                    } else {
                        sb2.c(new vvf0[]{nnm.f((hwy0) w3iVar.x, btsVar2, qti.e), ua3.a.a((dci) w3iVar.c), mhg.a.a((lhg) w3iVar.w), l290.a.a(null)}, wwg.S(1421395080, true, new t3i(w3iVar, (d) ooc.G(qoi0.a(d.class), a, str, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar2), v3iVar), btsVar2), btsVar2, 56);
                        ((rpb) w3iVar.A).a(btsVar2, 0);
                        break;
                    }
                }
        }
        return zy11Var;
    }
}
