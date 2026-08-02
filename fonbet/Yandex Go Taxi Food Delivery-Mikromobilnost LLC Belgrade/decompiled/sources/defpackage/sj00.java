package defpackage;

import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.mainscreen.superapp.api.presentation.AdditionalAction;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.f;
import com.yandex.go.places.api.navigation.OpenNavigatorActionSubtype;
import com.yandex.mapkit.map.Map;

/* loaded from: classes12.dex */
public final class sj00 extends kl80 {
    public final /* synthetic */ int b = 1;
    public final Object c;
    public final Object w;
    public final /* synthetic */ Object x;

    public sj00(f fVar, AdditionalAction additionalAction, String str) {
        this.c = fVar;
        this.w = additionalAction;
        this.x = str;
    }

    @Override // defpackage.sy60
    public final void a() {
        switch (this.b) {
            case 0:
                uj00 uj00Var = (uj00) this.x;
                Map map = uj00Var.U;
                if (map != null) {
                    map.deselectGeoObject();
                }
                sls slsVar = (sls) this.w;
                if (slsVar != null) {
                    slsVar.invoke();
                }
                ((oj00) uj00Var.n()).b.invoke();
                break;
            default:
                ((f) this.c).R(false);
                break;
        }
    }

    @Override // defpackage.kl80
    public void n1(OpenNavigatorActionSubtype openNavigatorActionSubtype, String str) {
        switch (this.b) {
            case 0:
                sls slsVar = (sls) this.w;
                if (slsVar != null) {
                    slsVar.invoke();
                }
                ((uj00) this.x).r(new vmz(9, openNavigatorActionSubtype, this));
                break;
        }
    }

    @Override // defpackage.kl80
    public void o1(String str) {
        switch (this.b) {
            case 1:
                f.P((f) this.c, (AdditionalAction) this.w, (String) this.x);
                break;
        }
    }

    public sj00(uj00 uj00Var, PlainAddress plainAddress, sls slsVar) {
        this.x = uj00Var;
        this.c = plainAddress;
        this.w = slsVar;
    }
}
