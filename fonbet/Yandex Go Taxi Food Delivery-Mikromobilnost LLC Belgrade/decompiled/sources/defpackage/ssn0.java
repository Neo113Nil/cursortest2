package defpackage;

import com.yandex.go.scooters.ignition.domain.ScootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1;
import com.yandex.go.scooters.ignition.domain.q;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.scooters.data.h;

/* loaded from: classes8.dex */
public final class ssn0 implements jy60 {
    public final tt2 a;
    public final tse b;
    public final h3y c;
    public final h d;
    public final h3y e;

    public ssn0(tt2 tt2Var, tse tseVar, h3y h3yVar, h hVar, h3y h3yVar2) {
        this.a = tt2Var;
        this.b = tseVar;
        this.c = h3yVar;
        this.d = hVar;
        this.e = h3yVar2;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ScootersIgnitionUserStateProcessingInteractor";
    }

    @Override // defpackage.jy60
    public final void h() {
        tpr t = e.t(new mth(new q(this.d.b(false)), 6));
        this.a.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.b, null, null, new ScootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1(e.F(t, mdh.b), null, this), 3);
    }
}
