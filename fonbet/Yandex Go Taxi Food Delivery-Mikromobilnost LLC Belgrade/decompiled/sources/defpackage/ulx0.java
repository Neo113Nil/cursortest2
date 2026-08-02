package defpackage;

import com.yandex.go.tariffcard.experiment.TariffRedirectAnimationExperiment;
import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import com.yandex.go.transfer_requirement.experiment.u;

/* loaded from: classes14.dex */
public final class ulx0 implements qqo {
    public final /* synthetic */ int a;
    public final en11 b;

    public ulx0(rqo rqoVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                TransferRequirementExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).b(TransferRequirementExperiment.k);
                break;
            default:
                this.b = ((jbh) rqoVar).b(new TariffRedirectAnimationExperiment(0));
                break;
        }
    }

    @Override // defpackage.qqo
    public final tpr a() {
        switch (this.a) {
            case 0:
                return this.b.a();
            default:
                return new u(this.b.a(), this);
        }
    }

    @Override // defpackage.qqo
    public final Object b() {
        switch (this.a) {
            case 0:
                return (TariffRedirectAnimationExperiment) this.b.b();
            default:
                return d();
        }
    }

    public TransferRequirementExperiment d() {
        return (TransferRequirementExperiment) this.b.b();
    }
}
