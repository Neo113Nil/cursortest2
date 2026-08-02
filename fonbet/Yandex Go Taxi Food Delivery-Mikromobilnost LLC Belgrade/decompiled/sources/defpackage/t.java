package defpackage;

import android.content.Context;
import com.yandex.go.requirements.comment.summary.ui.v3.domain.a;
import com.yandex.go.requirements.comment.summary.ui.v3.domain.b;
import defpackage.agd;
import defpackage.cx7;
import defpackage.g4d;
import defpackage.h7p0;
import defpackage.rol0;
import defpackage.t;
import defpackage.uyo0;
import defpackage.xcd;
import defpackage.yfd;
import defpackage.z6p0;
import defpackage.zy11;

/* loaded from: classes13.dex */
public final class t extends pgd {
    public final /* synthetic */ int F;
    public final Context G;
    public final w030 H;
    public final mu5 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, w030 w030Var, int i) {
        super(0);
        this.F = i;
        switch (i) {
            case 3:
                super(0);
                this.G = context;
                this.H = w030Var;
                this.I = new mu5(new ft20(10, this));
                break;
            case 4:
                super(0);
                this.G = context;
                this.H = w030Var;
                this.I = new mu5(new dn30(this, 0));
                break;
            case 6:
                super(0);
                this.G = context;
                this.H = w030Var;
                this.I = new mu5(new ohk0(13, this));
                break;
            case 10:
                super(0);
                this.G = context;
                this.H = w030Var;
                this.I = new mu5(new mzw0(this, 0));
                break;
            default:
                this.G = context;
                this.H = w030Var;
                this.I = new mu5(new tls() { // from class: com.yandex.go.payments.cards.verification.failed.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        yfd yfdVar = (yfd) obj;
                        ((agd) yfdVar).c = new rol0(new Card3dsFailedRouter$content$1$1(yfdVar, null));
                        agd agdVar = (agd) yfdVar;
                        agdVar.e = new cx7(5, t.this);
                        g4d.a.getClass();
                        agdVar.g = g4d.b;
                        return zy11.a;
                    }
                });
                break;
        }
    }

    @Override // defpackage.pgd
    public final wfd P() {
        switch (this.F) {
        }
        return this.I;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        switch (this.F) {
        }
        return this.G;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        switch (this.F) {
        }
        return this.H;
    }

    @Override // defpackage.pgd
    public boolean T() {
        switch (this.F) {
            case 6:
                return false;
            default:
                return super.T();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(final h7p0 h7p0Var, Context context, w030 w030Var) {
        super(0);
        this.F = 8;
        this.G = context;
        this.H = w030Var;
        this.I = new mu5(new tls() { // from class: com.yandex.go.scooters.misc.vehicle_actual_photo.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                yfd yfdVar = (yfd) obj;
                String str = ((z6p0) ((agd) yfdVar).a).a;
                agd agdVar = (agd) yfdVar;
                z6p0 z6p0Var = (z6p0) agdVar.a;
                CharSequence charSequence = z6p0Var.b;
                CharSequence charSequence2 = z6p0Var.c;
                h7p0 h7p0Var2 = h7p0.this;
                h7p0Var2.getClass();
                agdVar.c = new rol0(new ScootersVehicleActualPhotoUiStateInteractor$uiStateFlow$1(h7p0Var2, str, charSequence, charSequence2, null));
                agdVar.e = new uyo0(3, this);
                xcd.a.getClass();
                agdVar.g = xcd.b;
                return zy11.a;
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, w030 w030Var, b bVar, a aVar) {
        super(0);
        this.F = 0;
        this.G = context;
        this.H = w030Var;
        this.I = new mu5(new q(0, this, bVar, aVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(amp0 amp0Var, dgs0 dgs0Var, Context context, w030 w030Var) {
        super(0);
        this.F = 9;
        this.G = context;
        this.H = w030Var;
        this.I = new mu5(new com.yandex.go.navigator.settings.debug_panel.a(this, amp0Var, dgs0Var));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(dea deaVar, Context context, w030 w030Var) {
        super(0);
        this.F = 2;
        this.G = context;
        this.H = w030Var;
        this.I = new mu5(new cs8(16, this, deaVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(xxo0 xxo0Var, qxo0 qxo0Var, Context context, w030 w030Var) {
        super(0);
        this.F = 7;
        this.G = context;
        this.H = w030Var;
        this.I = new mu5(new lxo0(0, this, xxo0Var, qxo0Var));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, w030 w030Var, o8g0 o8g0Var) {
        super(0);
        this.F = 5;
        this.G = context;
        this.H = w030Var;
        this.I = new mu5(new ugd0(28, this, o8g0Var));
    }
}
