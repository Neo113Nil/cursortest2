package ru.yandex.taxi.scooters.presentation.finish_info;

import defpackage.ajl0;
import defpackage.amn0;
import defpackage.cln0;
import defpackage.eho0;
import defpackage.g18;
import defpackage.iln0;
import defpackage.imn0;
import defpackage.jwo0;
import defpackage.kyh0;
import defpackage.nac;
import defpackage.onn0;
import defpackage.pav;
import defpackage.pzt0;
import defpackage.qmn0;
import defpackage.rln0;
import defpackage.rmn0;
import defpackage.rx3;
import defpackage.smn0;
import defpackage.tje;
import defpackage.wmn0;
import defpackage.xmn0;
import defpackage.y1o0;
import defpackage.zkn0;
import java.util.List;
import ru.yandex.taxi.scooters.presentation.feedback.ScootersFeedbackCard;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackAttachments;
import ru.yandex.taxi.scooters.presentation.finish_info.info.ScootersFinishInfoCard;
import ru.yandex.taxi.scooters.presentation.finish_info.statistics.ScootersFinishInfoStatisticsCard;
import ru.yandex.taxi.scooters.presentation.personal_goals.promo_plate.ScootersPersonalGoalsPromoPlateView;

/* loaded from: classes6.dex */
public final class a implements wmn0 {
    public final String a;
    public final /* synthetic */ ScootersFinishInfoModalView b;

    public a(ScootersFinishInfoModalView scootersFinishInfoModalView) {
        this.b = scootersFinishInfoModalView;
        this.a = scootersFinishInfoModalView.getContext().getString(kyh0.scooters_requires_input);
    }

    @Override // defpackage.wmn0
    public final void I1() {
        ScootersFinishInfoModalView.access$getBinding(this.b).f.scrollToFirstPhoto();
    }

    @Override // defpackage.wmn0
    public final void I2(String str, String str2, List list, boolean z) {
        pav pavVar;
        rln0 rln0Var;
        boolean z2;
        ScootersFinishInfoModalView scootersFinishInfoModalView = this.b;
        ScootersFinishInfoCard scootersFinishInfoCard = ScootersFinishInfoModalView.access$getBinding(scootersFinishInfoModalView).g;
        rmn0 rmn0Var = new rmn0(scootersFinishInfoModalView, 2);
        smn0 smn0Var = new smn0(scootersFinishInfoModalView, 1);
        rmn0 rmn0Var2 = new rmn0(scootersFinishInfoModalView, 3);
        pavVar = scootersFinishInfoModalView.imageLoader;
        scootersFinishInfoCard.render(z, str, str2, list, rmn0Var, smn0Var, rmn0Var2, pavVar);
        rln0Var = scootersFinishInfoModalView.roundSectionsHandler;
        rln0Var.b();
        z2 = scootersFinishInfoModalView.isShowFinishInfoListInvokes;
        if (z2) {
            return;
        }
        scootersFinishInfoModalView.isShowFinishInfoListInvokes = true;
        scootersFinishInfoModalView.performanceAnalyticsFinishLoading();
    }

    @Override // defpackage.wmn0
    public final void J9(amn0 amn0Var) {
        d dVar;
        g18 g18Var;
        pav pavVar;
        ScootersFinishInfoModalView scootersFinishInfoModalView = this.b;
        if (amn0Var == null) {
            ScootersFinishInfoModalView.access$getBinding(scootersFinishInfoModalView).k.setVisibility(8);
            return;
        }
        ScootersFinishInfoModalView.access$getBinding(scootersFinishInfoModalView).k.setVisibility(0);
        dVar = scootersFinishInfoModalView.scootersFinishInfoPresenter;
        pzt0 pzt0Var = dVar.R;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        dVar.R = tje.N(dVar.x, null, null, new ScootersFinishInfoPresenter$reportPromoPlateShown$1(dVar, amn0Var, null), 3);
        g18Var = scootersFinishInfoModalView.promoPlateImageLoadCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        String str = amn0Var.a;
        if (str != null) {
            pavVar = scootersFinishInfoModalView.imageLoader;
            scootersFinishInfoModalView.promoPlateImageLoadCancellable = ((nac) pavVar.a(ScootersFinishInfoModalView.access$getBinding(scootersFinishInfoModalView).k.getLeadImageView())).c(str);
        }
        ScootersFinishInfoModalView.access$getBinding(scootersFinishInfoModalView).k.setTitle(amn0Var.b);
        ScootersFinishInfoModalView.access$getBinding(scootersFinishInfoModalView).k.setSubtitle(amn0Var.c);
        ScootersFinishInfoModalView.access$getBinding(scootersFinishInfoModalView).k.setDebounceClickListener(new ajl0(24, scootersFinishInfoModalView, amn0Var));
    }

    @Override // defpackage.wmn0
    public final void T5(onn0 onn0Var) {
        ru.yandex.taxi.widget.utils.e eVar;
        ScootersFinishInfoModalView scootersFinishInfoModalView = this.b;
        ScootersFinishInfoStatisticsCard scootersFinishInfoStatisticsCard = ScootersFinishInfoModalView.access$getBinding(scootersFinishInfoModalView).o;
        eVar = scootersFinishInfoModalView.mediaInfoConverter;
        scootersFinishInfoStatisticsCard.render(onn0Var, eVar);
    }

    @Override // defpackage.wmn0
    public final void V1(eho0 eho0Var) {
        rln0 rln0Var;
        ScootersPersonalGoalsPromoPlateView sharingPersonalGoalsPromoPlateView;
        rln0 rln0Var2;
        ScootersFinishInfoModalView scootersFinishInfoModalView = this.b;
        if (eho0Var == null || eho0Var.getTitle().length() == 0) {
            ScootersFinishInfoModalView.access$getBinding(scootersFinishInfoModalView).m.setVisibility(8);
            rln0Var = scootersFinishInfoModalView.roundSectionsHandler;
            rln0Var.b();
        } else {
            ScootersFinishInfoModalView.access$getBinding(scootersFinishInfoModalView).m.setVisibility(0);
            sharingPersonalGoalsPromoPlateView = scootersFinishInfoModalView.getSharingPersonalGoalsPromoPlateView();
            sharingPersonalGoalsPromoPlateView.setState(eho0Var, new qmn0(scootersFinishInfoModalView, 3));
            rln0Var2 = scootersFinishInfoModalView.roundSectionsHandler;
            rln0Var2.b();
        }
    }

    @Override // defpackage.wmn0
    public final void Ve(boolean z) {
        ScootersFinishInfoModalView scootersFinishInfoModalView = this.b;
        ScootersFinishInfoModalView.access$getBinding(scootersFinishInfoModalView).e.setEnabled(z);
        androidx.core.view.b.t(ScootersFinishInfoModalView.access$getBinding(scootersFinishInfoModalView).e, ScootersFinishInfoModalView.access$getBinding(scootersFinishInfoModalView).e.isEnabled() ? null : this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // defpackage.wmn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Zc(boolean z, imn0 imn0Var, boolean z2, jwo0 jwo0Var) {
        boolean z3;
        boolean z4;
        FeedbackAttachments.Requirement requirement;
        FeedbackAttachments.Requirement requirement2;
        boolean z5;
        boolean z6;
        boolean z7;
        y1o0 y1o0Var;
        ScootersFinishInfoModalView scootersFinishInfoModalView = this.b;
        ScootersFeedbackCard scootersFeedbackCard = ScootersFinishInfoModalView.access$getBinding(scootersFinishInfoModalView).f;
        z3 = scootersFinishInfoModalView.isStatisticsCardVisible;
        if (!z3) {
            y1o0Var = scootersFinishInfoModalView.newbieProgressInfo;
            if (y1o0Var == null) {
                z4 = true;
                scootersFeedbackCard.bindTitle(z4, new rx3(scootersFinishInfoModalView, z, imn0Var, 13));
                scootersFeedbackCard.bindRatingBar(z2);
                iln0 iln0Var = jwo0Var.a;
                FeedbackAttachments feedbackAttachments = jwo0Var.b;
                scootersFeedbackCard.bindItemsSelection(iln0Var == null ? new zkn0(iln0Var, jwo0Var.c) : null);
                requirement = feedbackAttachments.a;
                requirement.getClass();
                requirement2 = FeedbackAttachments.Requirement.NONE;
                if (!(requirement != requirement2)) {
                    z7 = scootersFinishInfoModalView.isCommentVisibleByExperiment;
                    if (z7) {
                        z5 = true;
                        FeedbackAttachments.Requirement requirement3 = feedbackAttachments.b;
                        requirement3.getClass();
                        scootersFeedbackCard.bindComment(z5, !(requirement3 == requirement2));
                        z6 = scootersFinishInfoModalView.isSetFeedbackCardContentInvokes;
                        if (z6) {
                            return;
                        }
                        scootersFinishInfoModalView.isSetFeedbackCardContentInvokes = true;
                        scootersFinishInfoModalView.performanceAnalyticsFinishLoading();
                        return;
                    }
                }
                z5 = false;
                FeedbackAttachments.Requirement requirement32 = feedbackAttachments.b;
                requirement32.getClass();
                scootersFeedbackCard.bindComment(z5, !(requirement32 == requirement2));
                z6 = scootersFinishInfoModalView.isSetFeedbackCardContentInvokes;
                if (z6) {
                }
            }
        }
        z4 = false;
        scootersFeedbackCard.bindTitle(z4, new rx3(scootersFinishInfoModalView, z, imn0Var, 13));
        scootersFeedbackCard.bindRatingBar(z2);
        iln0 iln0Var2 = jwo0Var.a;
        FeedbackAttachments feedbackAttachments2 = jwo0Var.b;
        scootersFeedbackCard.bindItemsSelection(iln0Var2 == null ? new zkn0(iln0Var2, jwo0Var.c) : null);
        requirement = feedbackAttachments2.a;
        requirement.getClass();
        requirement2 = FeedbackAttachments.Requirement.NONE;
        if (!(requirement != requirement2)) {
        }
        z5 = false;
        FeedbackAttachments.Requirement requirement322 = feedbackAttachments2.b;
        requirement322.getClass();
        scootersFeedbackCard.bindComment(z5, !(requirement322 == requirement2));
        z6 = scootersFinishInfoModalView.isSetFeedbackCardContentInvokes;
        if (z6) {
        }
    }

    @Override // defpackage.wmn0
    public final void d6(cln0 cln0Var) {
        ScootersFinishInfoModalView.access$getBinding(this.b).f.bindNewbieUiState(cln0Var);
    }

    @Override // defpackage.wmn0
    public final void dd() {
        ScootersFinishInfoModalView.access$getBinding(this.b).f.changeRatingBarTitleVisibility(false, true);
    }

    @Override // defpackage.wmn0
    public final void mg(List list) {
        int i;
        ScootersFinishInfoModalView scootersFinishInfoModalView = this.b;
        ScootersFeedbackCard scootersFeedbackCard = ScootersFinishInfoModalView.access$getBinding(scootersFinishInfoModalView).f;
        int size = list.size();
        i = scootersFinishInfoModalView.damagePhotoLimit;
        scootersFeedbackCard.setPhotoButtonVisibility(size < i);
        scootersFeedbackCard.updatePhotos(list);
    }

    @Override // defpackage.wmn0
    public final void n7(xmn0 xmn0Var) {
        rln0 rln0Var;
        ScootersFinishInfoModalView scootersFinishInfoModalView = this.b;
        ScootersFinishInfoModalView.access$getBinding(scootersFinishInfoModalView).i.setVisibility(0);
        ScootersFinishInfoModalView.access$getBinding(scootersFinishInfoModalView).j.setVisibility(0);
        ScootersFinishInfoModalView.access$getBinding(scootersFinishInfoModalView).j.setTitle(xmn0Var.a);
        ScootersFinishInfoModalView.access$getBinding(scootersFinishInfoModalView).j.setSubtitle(xmn0Var.b);
        ScootersFinishInfoModalView.access$getBinding(scootersFinishInfoModalView).j.setLeadImage(xmn0Var.c);
        ScootersFinishInfoModalView.access$getBinding(scootersFinishInfoModalView).j.setDebounceClickListener(new ajl0(25, scootersFinishInfoModalView, xmn0Var));
        rln0Var = scootersFinishInfoModalView.roundSectionsHandler;
        rln0Var.b();
    }

    @Override // defpackage.wmn0
    public final void qg(boolean z) {
        ScootersFinishInfoModalView.access$getBinding(this.b).f.bindSupport(z);
    }

    @Override // defpackage.wmn0
    public final void ve(String str) {
        ScootersFinishInfoModalView.access$getBinding(this.b).f.updateComment(str);
    }
}
