package defpackage;

import com.yandex.go.address.position_confirmation.j;
import com.yandex.go.preorder.map.CameraAnimationFinishType;
import com.yandex.mapkit.map.Map;
import ru.yandex.taxi.map.utils.a;
import ru.yandex.taxi.preorder.CameraAnimationUpdateType;
import ru.yandex.taxi.preorder.source.data.c;
import ru.yandex.taxi.preorder.source.domain.r;

/* loaded from: classes13.dex */
public final class uy41 {
    public final c a;
    public final j b;
    public final tft0 c;
    public final ah00 d;
    public final r e;
    public final h3y f;

    public uy41(c cVar, j jVar, tft0 tft0Var, ah00 ah00Var, r rVar, h3y h3yVar) {
        this.a = cVar;
        this.b = jVar;
        this.c = tft0Var;
        this.d = ah00Var;
        this.e = rVar;
        this.f = h3yVar;
    }

    public final void a(zzs zzsVar, final boolean z) {
        this.b.d();
        c cVar = this.a;
        boolean z2 = cVar.d.d() != null;
        if (z2) {
            cVar.f = true;
        }
        if (z2) {
            ((gh00) this.d).D(a.F(zzsVar), 17.0f, 300.0f, new Map.CameraCallback() { // from class: ty41
                @Override // com.yandex.mapkit.map.Map.CameraCallback
                public final void onMoveFinished(boolean z3) {
                    uy41 uy41Var = uy41.this;
                    uy41Var.e.b(CameraAnimationUpdateType.ANIMATE_TAP_ON_PICKUP_POINT);
                    if (z && z3) {
                        ((yet0) uy41Var.f.get()).a(CameraAnimationFinishType.ANIMATE_TAP_ON_PICKUP_POINT, true, null);
                    }
                }
            });
        }
        ((wit0) this.c.a(true)).c(zzsVar, "manual", null);
    }
}
