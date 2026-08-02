package defpackage;

import com.yandex.go.places.impl.domain.interactors.common.a;
import com.yandex.go.places.impl.ui.organizations.v2.f;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import java.util.HashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class tn80 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ tn80(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        f fVar = this.b;
        switch (i) {
            case 0:
                jio jioVar = fVar.T;
                bn80 bn80Var = (bn80) fVar.U.a.getValue();
                String str = bn80Var != null ? bn80Var.a : null;
                hsj hsjVar = jioVar.b;
                String i2 = jioVar.i();
                hsjVar.getClass();
                HashMap hashMap = new HashMap();
                if (str != null) {
                    hashMap.put("geosearch_context", str);
                }
                hsjVar.a.a("Discovery.OrganisationList.RetryTapped", hashMap, 3, tse0.r("source", hashMap, i2));
                break;
            case 1:
                fVar.Mg().U(new gjp0(Boolean.TRUE));
                break;
            case 2:
                fVar.R.a((fr) obj, null);
                break;
            case 3:
                c9c0 Mg = fVar.Mg();
                s7c0 s7c0Var = fVar.H;
                Mg.V(new o8c0(s7c0Var.b, s7c0Var.c), fVar.r0);
                break;
            case 4:
                uc4 uc4Var = (uc4) obj;
                fVar.d0 = true;
                q3v q3vVar = fVar.x;
                zzs zzsVar = uc4Var.a;
                Point point = new Point(zzsVar.a, zzsVar.b);
                zzs zzsVar2 = uc4Var.b;
                ((gh00) ((a) q3vVar).a).F(new BoundingBox(point, new Point(zzsVar2.a, zzsVar2.b)));
                break;
            default:
                ((rn80) fVar.Dg()).F6();
                break;
        }
        return zy11Var;
    }
}
