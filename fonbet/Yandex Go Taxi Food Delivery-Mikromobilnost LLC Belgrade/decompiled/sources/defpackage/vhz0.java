package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.tipssuggest.experiment.TipsSuggestModalExperiment;
import java.util.HashMap;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class vhz0 extends ad5 {
    public final jhu0 A;
    public final e B;
    public final n2v0 C;
    public int D;
    public final TaxiOrder x;
    public final TipsSuggestModalExperiment y;
    public final uio0 z;

    public vhz0(TaxiOrder taxiOrder, TipsSuggestModalExperiment tipsSuggestModalExperiment, uio0 uio0Var, jhu0 jhu0Var, e eVar, n2v0 n2v0Var) {
        super(uhz0.class);
        this.x = taxiOrder;
        this.y = tipsSuggestModalExperiment;
        this.z = uio0Var;
        this.A = jhu0Var;
        this.B = eVar;
        this.C = n2v0Var;
        this.D = tipsSuggestModalExperiment.e;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        String str = this.x.a;
        o61 o61Var = (o61) this.A.a;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("order_id", str);
        }
        o61Var.a.a("DefaultTipsModalCard.Closed", hashMap, 1, new HashMap());
    }
}
