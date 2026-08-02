package ru.yandex.taxi.logistics.explicit_comment_courier.comment.ui;

import defpackage.p8i;
import defpackage.r8i;
import defpackage.s8i;
import defpackage.sls;
import defpackage.vni;
import defpackage.wth;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.DeliveryExplicitCommentCourierFlowType;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.ShowAlertInteractor$AnalyticsTrigger;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.Screen;

/* loaded from: classes5.dex */
public final class a implements vni {
    public final /* synthetic */ DeliveryExplicitCommentCourierView a;

    public a(DeliveryExplicitCommentCourierView deliveryExplicitCommentCourierView) {
        this.a = deliveryExplicitCommentCourierView;
    }

    public final void a() {
        s8i s8iVar;
        s8iVar = this.a.presenter;
        ((p8i) s8iVar.Dg()).close();
        s8iVar.Kg();
        if (!s8iVar.C.p(Screen.EXPLICIT_COMMENT, s8iVar.y.a.c, ShowAlertInteractor$AnalyticsTrigger.SUMMARY, new DeliveryExplicitCommentCourierPresenter$saveCommentIfPossible$1(0, s8iVar, s8i.class, "saveComment", "saveComment()V", 0))) {
            s8iVar.Lg();
        }
        s8iVar.A.a.r(new wth(19));
    }

    public final sls b() {
        r8i r8iVar;
        s8i s8iVar;
        DeliveryExplicitCommentCourierView deliveryExplicitCommentCourierView = this.a;
        r8iVar = deliveryExplicitCommentCourierView.params;
        if (r8iVar.b != DeliveryExplicitCommentCourierFlowType.REQUIRED_COMMENT) {
            return null;
        }
        s8iVar = deliveryExplicitCommentCourierView.presenter;
        return new DeliveryExplicitCommentCourierView$engine$1$onDismissButtonClick$1(0, s8iVar, s8i.class, "dismissCommentWithoutSaving", "dismissCommentWithoutSaving()V", 0);
    }
}
