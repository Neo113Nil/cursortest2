package ru.yandex.taxi.scooters.presentation.feedback.comment;

import com.yandex.go.design.view.GoFrameLayout;
import defpackage.jl40;
import defpackage.kho0;
import defpackage.lpm0;
import defpackage.lys;
import defpackage.mpm0;
import defpackage.msg0;
import defpackage.npm0;
import defpackage.opm0;
import defpackage.pav;
import defpackage.ppm0;
import defpackage.tls;
import defpackage.w511;
import defpackage.xpb1;
import defpackage.xw90;
import defpackage.zo31;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes6.dex */
public final class a extends lys {
    public static final /* synthetic */ int W = 0;
    public final pav S;
    public final int T;
    public final int U;
    public ppm0 V;

    public a(kho0 kho0Var, tls tlsVar, pav pavVar) {
        super(kho0Var);
        this.S = pavVar;
        GoFrameLayout goFrameLayout = kho0Var.a;
        this.T = c.d(msg0.scooter_photo_on_comment_item_size, goFrameLayout);
        this.U = c.d(msg0.scooter_photo_on_comment_item_size, goFrameLayout);
        c.z(new xw90(14, this, tlsVar), kho0Var.c);
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.wys
    public final void Y() {
        super.Y();
        this.V = null;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        ppm0 ppm0Var = (ppm0) obj;
        this.V = ppm0Var;
        ((kho0) ((zo31) this.R)).c.setVisibility(4);
        b0(new PhotoItemViewHolder$bind$1(this, ppm0Var, null));
    }

    public final void c0(ppm0 ppm0Var) {
        this.V = ppm0Var;
        ScootersPhotoRemoveButton scootersPhotoRemoveButton = ((kho0) ((zo31) this.R)).c;
        opm0 opm0Var = ppm0Var.b;
        if ((opm0Var instanceof mpm0) || jl40.l(opm0Var, xpb1.P)) {
            scootersPhotoRemoveButton.showLoading();
        } else if (opm0Var instanceof npm0) {
            scootersPhotoRemoveButton.showError();
        } else {
            if (!(opm0Var instanceof lpm0)) {
                w511.b();
                return;
            }
            scootersPhotoRemoveButton.showLoaded();
        }
        scootersPhotoRemoveButton.setVisibility(0);
    }
}
