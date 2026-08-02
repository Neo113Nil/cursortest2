package ru.yandex.taxi.scooters.presentation.ontheway.damage;

import com.yandex.go.design.view.GoFrameLayout;
import defpackage.lys;
import defpackage.msg0;
import defpackage.pav;
import defpackage.ppm0;
import defpackage.sls;
import defpackage.tls;
import defpackage.xbn0;
import defpackage.zy11;

/* loaded from: classes6.dex */
public final class b extends lys {
    public static final /* synthetic */ int a0 = 0;
    public final pav S;
    public final boolean T;
    public final tls U;
    public final int V;
    public final int W;
    public ppm0 Z;

    public b(xbn0 xbn0Var, pav pavVar, boolean z, tls tlsVar) {
        super(xbn0Var);
        this.S = pavVar;
        this.T = z;
        this.U = tlsVar;
        GoFrameLayout goFrameLayout = xbn0Var.a;
        this.V = ru.yandex.taxi.design.utils.c.d(msg0.scooter_damage_item_width, goFrameLayout);
        this.W = ru.yandex.taxi.design.utils.c.d(msg0.scooter_damage_item_height, goFrameLayout);
        ru.yandex.taxi.design.utils.c.z(new sls() { // from class: ru.yandex.taxi.scooters.presentation.ontheway.damage.a
            @Override // defpackage.sls
            public final Object invoke() {
                b bVar = b.this;
                ppm0 ppm0Var = bVar.Z;
                if (ppm0Var != null) {
                    ((ScootersDamageView$requireDamageAdapter$1) bVar.U).invoke(ppm0Var);
                }
                return zy11.a;
            }
        }, xbn0Var.c);
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.wys
    public final void Y() {
        super.Y();
        this.Z = null;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        ppm0 ppm0Var = (ppm0) obj;
        this.Z = ppm0Var;
        b0(new DamageItemViewHolder$bind$1(this, ppm0Var, null));
    }
}
