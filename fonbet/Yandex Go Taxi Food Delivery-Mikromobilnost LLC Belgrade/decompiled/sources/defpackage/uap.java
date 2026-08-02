package defpackage;

import com.yandex.go.payments.shared.family.experiments.FamilyGroupV2Experiment;

/* loaded from: classes8.dex */
public final class uap implements qqo {
    public final /* synthetic */ qqo a;

    public uap(rqo rqoVar) {
        FamilyGroupV2Experiment.Companion.getClass();
        this.a = ((jbh) rqoVar).c(FamilyGroupV2Experiment.g);
    }

    @Override // defpackage.qqo
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.qqo
    public final Object b() {
        return (FamilyGroupV2Experiment) this.a.b();
    }

    public final boolean isEnabled() {
        FamilyGroupV2Experiment familyGroupV2Experiment = (FamilyGroupV2Experiment) this.a.b();
        if (!familyGroupV2Experiment.b) {
            return false;
        }
        String a = familyGroupV2Experiment.d.b.a();
        if (a == null) {
            a = "";
        }
        return (evu0.J(d6z.Y(familyGroupV2Experiment, a)) || evu0.J(familyGroupV2Experiment.e)) ? false : true;
    }
}
