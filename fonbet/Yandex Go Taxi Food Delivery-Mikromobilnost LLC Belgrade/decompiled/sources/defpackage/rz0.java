package defpackage;

import com.yandex.go.address.address_map_picker.experiment.AddressMapPickerExperiment;
import com.yandex.go.benefits_center.benefits.data.experiment.BenefitsCenterLoyaltyViewAvailabilityExperiment;
import com.yandex.go.requirements.comment.summary.ui.v3.data.experiment.SuggestForCommentExperiment;
import com.yandex.go.requirements.comment.summary.ui.v3.data.experiment.SummaryCommentValidationExperiment;
import com.yandex.go.requirements.experiment.ComposeCompoundOptionSelectExperiment;
import com.yandex.go.summary.requirements.list.requirementgroup.experiment.ComposeSpecialRequirementsExperiment;
import com.yandex.go.tariffcard.experiment.MulticlassCashbackShowExperiment;
import com.yandex.go.taxi.summary.experiments.UserLocationToSourcePointWalkRouteExperiment;

/* loaded from: classes6.dex */
public final class rz0 implements en11 {
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;
    public final /* synthetic */ int a;
    public final /* synthetic */ en11 b;

    public rz0(rqo rqoVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                BenefitsCenterLoyaltyViewAvailabilityExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).b(BenefitsCenterLoyaltyViewAvailabilityExperiment.c);
                break;
            case 2:
                qyb.Companion.getClass();
                this.b = ((jbh) rqoVar).b(qyb.d);
                break;
            case 3:
                ComposeCompoundOptionSelectExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).b(ComposeCompoundOptionSelectExperiment.c);
                break;
            case 4:
                ComposeSpecialRequirementsExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).b(ComposeSpecialRequirementsExperiment.c);
                break;
            case 5:
                bid.Companion.getClass();
                this.b = ((jbh) rqoVar).b(bid.c);
                break;
            case 6:
                MulticlassCashbackShowExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).b(MulticlassCashbackShowExperiment.c);
                break;
            case 7:
                SuggestForCommentExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).b(SuggestForCommentExperiment.d);
                break;
            case 8:
                SummaryCommentValidationExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).b(SummaryCommentValidationExperiment.e);
                break;
            case 9:
                UserLocationToSourcePointWalkRouteExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).b(UserLocationToSourcePointWalkRouteExperiment.l);
                break;
            default:
                this.b = ((jbh) rqoVar).b(new AddressMapPickerExperiment(2));
                break;
        }
    }

    @Override // defpackage.qqo
    public final tpr a() {
        switch (this.a) {
        }
        return this.b.a();
    }

    @Override // defpackage.qqo
    public final Object b() {
        switch (this.a) {
            case 0:
                return (AddressMapPickerExperiment) this.b.b();
            case 1:
                return (BenefitsCenterLoyaltyViewAvailabilityExperiment) this.b.b();
            case 2:
                return (qyb) this.b.b();
            case 3:
                return (ComposeCompoundOptionSelectExperiment) this.b.b();
            case 4:
                return (ComposeSpecialRequirementsExperiment) this.b.b();
            case 5:
                return (bid) this.b.b();
            case 6:
                return (MulticlassCashbackShowExperiment) this.b.b();
            case 7:
                return (SuggestForCommentExperiment) this.b.b();
            case 8:
                return (SummaryCommentValidationExperiment) this.b.b();
            default:
                return d();
        }
    }

    @Override // defpackage.en11
    public final tpr c() {
        switch (this.a) {
        }
        return this.b.c();
    }

    public UserLocationToSourcePointWalkRouteExperiment d() {
        return (UserLocationToSourcePointWalkRouteExperiment) this.b.b();
    }

    @Override // defpackage.en11
    public final boolean isEnabled() {
        switch (this.a) {
        }
        return this.b.isEnabled();
    }
}
