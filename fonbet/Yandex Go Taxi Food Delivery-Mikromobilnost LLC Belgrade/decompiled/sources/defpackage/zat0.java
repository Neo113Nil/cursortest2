package defpackage;

import android.content.Context;
import com.yandex.go.address_confirmation.SourceAddressConfirmationMapFragment;
import com.yandex.go.address_confirmation.analytics.a;
import com.yandex.go.address_confirmation.modal.SourceAddressConfirmationModalView;
import com.yandex.go.address_confirmation.modal.d;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes12.dex */
public final class zat0 extends m230 {
    public final Context E;
    public final h3y F;
    public final yvf0 G;
    public final yvf0 H;
    public final w030 I;
    public final oy80 J;
    public final SourceAddressConfirmationMapFragment K;
    public final xat0 L;
    public final a M;
    public final hnb0 N;
    public final jpb0 O;
    public final yvf0 P;
    public final ysd0 Q;
    public final f7r R;
    public final AddressResolveRepository S;

    public zat0(Context context, h3y h3yVar, aag aagVar, aag aagVar2, w030 w030Var, oy80 oy80Var, SourceAddressConfirmationMapFragment sourceAddressConfirmationMapFragment, xat0 xat0Var, a aVar, hnb0 hnb0Var, jpb0 jpb0Var, aag aagVar3, ysd0 ysd0Var, f7r f7rVar, AddressResolveRepository addressResolveRepository) {
        super(null);
        this.E = context;
        this.F = h3yVar;
        this.G = aagVar;
        this.H = aagVar2;
        this.I = w030Var;
        this.J = oy80Var;
        this.K = sourceAddressConfirmationMapFragment;
        this.L = xat0Var;
        this.M = aVar;
        this.N = hnb0Var;
        this.O = jpb0Var;
        this.P = aagVar3;
        this.Q = ysd0Var;
        this.R = f7rVar;
        this.S = addressResolveRepository;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.I;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        wor0 wor0Var = new wor0(this);
        s14 s14Var = this.L.a;
        return new SourceAddressConfirmationModalView(this.E, new d((ah00) ((aag) s14Var.c).get(), (com.yandex.go.address_confirmation.modal.a) ((gaq0) s14Var.d).get(), (pwy0) ((aag) s14Var.e).get(), wor0Var, (i) ((aag) s14Var.f).get(), (hhs0) ((fat0) s14Var.g).get(), (cbt0) ((xvf0) s14Var.a).get(), (wat0) obj, (ru.yandex.taxi.preorder.source.sourcepointzone.a) ((aag) s14Var.h).get(), (a821) ((d701) s14Var.i).get(), (kr0) ((aag) s14Var.j).get(), (a) ((l9t0) s14Var.k).get(), (w6r) ((aag) s14Var.l).get(), (mob0) ((aag) s14Var.m).get(), (pav) ((aag) s14Var.n).get(), (ru.yandex.taxi.favorites.address.api.experiment.a) ((aag) s14Var.b).get(), (ru.yandex.taxi.favorites.address.impl.data.a) ((aag) s14Var.o).get()), this.N, this.O, this.Q, this.R, this.S);
    }
}
