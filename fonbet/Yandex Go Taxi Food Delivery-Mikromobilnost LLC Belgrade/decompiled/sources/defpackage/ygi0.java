package defpackage;

import android.content.Context;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$PhotoPickUpSource;
import com.yandex.go.scooters.passes.active.v3.renew.menu.c;
import java.util.HashMap;
import ru.yandex.taxi.orderforanother.interactor.f;
import ru.yandex.taxi.orderforanother.repository.a;

/* loaded from: classes13.dex */
public final class ygi0 extends pgd {
    public final /* synthetic */ int F = 0;
    public final Context G;
    public final w030 H;
    public final mu5 I;
    public final Object J;
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;

    public ygi0(Context context, w030 w030Var, ahi0 ahi0Var, sue0 sue0Var, umb0 umb0Var, epb0 epb0Var) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.J = ahi0Var;
        this.K = sue0Var;
        this.L = umb0Var;
        this.M = epb0Var;
        this.N = new aye0(11, this);
        this.I = new mu5(new xgi0(this, 0));
    }

    @Override // defpackage.pgd, defpackage.h55
    public void H(Object obj) {
        switch (this.F) {
            case 2:
                ((a) this.L).e.a = false;
                super.H((zy11) obj);
                break;
            default:
                super.H(obj);
                break;
        }
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        switch (this.F) {
            case 0:
                nhb0 nhb0Var = ((umb0) this.L).a;
                nhb0Var.getClass();
                nhb0Var.a.a("PhotoPickUp.ErrorModal.Closed", new HashMap(), 1, new HashMap());
                break;
        }
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        switch (this.F) {
            case 0:
                ((epb0) this.M).e = PhotoPickUpAnalytics$PhotoPickUpSource.ErrorModal;
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

    public ygi0(Context context, w030 w030Var, f fVar, vz41 vz41Var, a aVar, eqh eqhVar) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.J = fVar;
        this.K = vz41Var;
        this.L = aVar;
        this.M = eqhVar;
        this.N = new ji41(8, this);
        this.I = new mu5(new pz41(this, 0));
    }

    public ygi0(dtm0 dtm0Var, c cVar, Context context, w030 w030Var, yvf0 yvf0Var, yvf0 yvf0Var2, zmm0 zmm0Var, zmm0 zmm0Var2, zmm0 zmm0Var3) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.J = yvf0Var;
        this.K = yvf0Var2;
        this.L = zmm0Var;
        this.M = zmm0Var2;
        this.N = zmm0Var3;
        this.I = new mu5(new zdk0(19, this, dtm0Var, cVar));
    }
}
