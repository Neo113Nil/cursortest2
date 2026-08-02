package defpackage;

import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;
import com.yandex.go.places.impl.navigation.map.PlacesMapMode;

/* loaded from: classes13.dex */
public abstract class t75 extends h55 {
    public final dgc0 D;
    public final z0j E;
    public PlacesNavigationMode F;
    public PlacesMapMode G;
    public h55 H;

    public t75(dgc0 dgc0Var, z0j z0jVar) {
        super(null);
        this.D = dgc0Var;
        this.E = z0jVar;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        P();
    }

    public void P() {
        PlacesNavigationMode placesNavigationMode = this.F;
        int i = placesNavigationMode == null ? -1 : q75.a[placesNavigationMode.ordinal()];
        if (i != -1) {
            if (i == 1) {
                this.E.c(this);
            } else if (i != 2) {
                w511.b();
                return;
            }
        }
        h55 h55Var = this.H;
        if (h55Var != null) {
            h55Var.i();
        }
        this.H = null;
        this.G = null;
        this.F = null;
    }

    public final PlacesMapMode Q() {
        PlacesMapMode placesMapMode = this.G;
        if (placesMapMode != null) {
            return placesMapMode;
        }
        ny61.r("Never should happen - mapMode type is always non nullable");
        return null;
    }

    public void R(dm80 dm80Var) {
        je80 je80Var;
        PlacesNavigationMode placesNavigationMode;
        je80 je80Var2;
        P();
        this.G = (dm80Var == null || (dm80Var instanceof xl80)) ? (dm80Var != null && (dm80Var instanceof xl80) && ((je80Var = ((xl80) dm80Var).i) == null || je80Var.a)) ? PlacesMapMode.WITH_MAP : PlacesMapMode.NO_MAP : PlacesMapMode.WITH_MAP;
        PlacesMapMode Q = Q();
        if ((dm80Var instanceof xl80) && (je80Var2 = ((xl80) dm80Var).i) != null && je80Var2.t) {
            placesNavigationMode = PlacesNavigationMode.NATIVE_NAVIGATION;
        } else {
            int i = q75.b[Q.ordinal()];
            if (i == 1) {
                placesNavigationMode = PlacesNavigationMode.DEEPLINK_NAVIGATION;
            } else {
                if (i != 2) {
                    w511.b();
                    return;
                }
                placesNavigationMode = ((Boolean) ((t1b0) this.D.b.getValue()).c()).booleanValue() ? PlacesNavigationMode.NATIVE_NAVIGATION : PlacesNavigationMode.DEEPLINK_NAVIGATION;
            }
        }
        this.F = placesNavigationMode;
        int i2 = placesNavigationMode == null ? -1 : q75.a[placesNavigationMode.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                this.E.a(this);
            } else {
                if (i2 == 2) {
                    return;
                }
                w511.b();
            }
        }
    }
}
