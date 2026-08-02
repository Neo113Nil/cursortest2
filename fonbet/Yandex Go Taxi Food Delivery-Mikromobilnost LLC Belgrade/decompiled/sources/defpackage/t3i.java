package defpackage;

import androidx.compose.runtime.f;
import ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.d;

/* loaded from: classes5.dex */
public final /* synthetic */ class t3i implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ d b;
    public final /* synthetic */ w3i c;
    public final /* synthetic */ v3i w;

    public /* synthetic */ t3i(w3i w3iVar, d dVar, v3i v3iVar) {
        this.c = w3iVar;
        this.b = dVar;
        this.w = v3iVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        v3i v3iVar = this.w;
        w3i w3iVar = this.c;
        d dVar = this.b;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    qti.a((hwy0) w3iVar.x, wwg.S(-999429263, true, new t3i(dVar, w3iVar, v3iVar), btsVar), btsVar, 56);
                    break;
                }
            default:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    w3iVar.a((qkg) f.b(dVar.z, btsVar2).getValue(), v3iVar.b, btsVar2, 0);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ t3i(d dVar, w3i w3iVar, v3i v3iVar) {
        this.b = dVar;
        this.c = w3iVar;
        this.w = v3iVar;
    }
}
