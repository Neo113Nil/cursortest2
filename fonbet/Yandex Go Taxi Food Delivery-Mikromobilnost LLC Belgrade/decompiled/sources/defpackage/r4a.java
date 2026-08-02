package defpackage;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveMultiOrderCardButtonName;
import com.yandex.go.chargers.domain.b;
import com.yandex.go.chargers.multiorder.ui.f;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class r4a extends ad5 {
    public final cyx A;
    public final ArrayList B;
    public final hh5 C;
    public final em9 x;
    public final f y;
    public final b z;

    public r4a(em9 em9Var, f fVar, b bVar, cyx cyxVar, ArrayList arrayList, hh5 hh5Var) {
        super(o4a.class);
        this.x = em9Var;
        this.y = fVar;
        this.z = bVar;
        this.A = cyxVar;
        this.B = arrayList;
        this.C = hh5Var;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.y.e.a.l(null);
    }

    public final void Kg(q3a q3aVar) {
        boolean z = q3aVar instanceof p3a;
        em9 em9Var = this.x;
        if (z) {
            ((j4a) this.C.b).r(new ew9(17));
            em9Var.a(ChargersAnalytics$ChargersActiveMultiOrderCardButtonName.TakeMore, null);
        } else if (q3aVar instanceof o3a) {
            em9Var.a(ChargersAnalytics$ChargersActiveMultiOrderCardButtonName.Unknown, null);
        } else {
            w511.b();
        }
    }
}
