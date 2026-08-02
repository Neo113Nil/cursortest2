package defpackage;

import com.yandex.go.scooters.insurance.model.ScootersDisableInsuranceResult;
import com.yandex.go.scooters.offers.v2.newbie_guide.b;

/* loaded from: classes13.dex */
public final class x1o0 implements ntn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x1o0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void n1() {
    }

    private final void o1() {
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                bVar.H.c.a.g(zy11.a);
                bVar.r(new qu(9));
                break;
            case 1:
                b.P((b) obj);
                break;
            default:
                ((si3) obj).invoke(ScootersDisableInsuranceResult.CANCELED);
                break;
        }
    }

    @Override // defpackage.ntn0
    public final void o0() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                b.P((b) obj);
                break;
            case 1:
                break;
            default:
                ((si3) obj).invoke(ScootersDisableInsuranceResult.SKIPPED);
                break;
        }
    }

    @Override // defpackage.ntn0
    public final void q0() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                b.P((b) obj);
                break;
            case 1:
                break;
            default:
                ((si3) obj).invoke(ScootersDisableInsuranceResult.DISABLED);
                break;
        }
    }
}
