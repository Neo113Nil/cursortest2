package defpackage;

import com.yandex.go.chargers.notification.ChargersNotification;
import com.yandex.go.overdraft.data.model.TopNotification;
import com.yandex.go.overdraft.domain.d;
import com.yandex.go.payments.data.model.response.PaymentsNotification;
import com.yandex.go.personal_goals_v2.ui.PersonalGoalsNotification;
import com.yandex.go.shortcuts.impl.repository.i;
import com.yandex.go.taxi.order.chat.call_feedback.navigation.a;
import com.yandex.go.taxi.order.chat.call_feedback.ui.CallFeedbackTimedNotification;
import com.yandex.go.taxi.order.models.api.car.CopyInfoType;
import ru.yandex.taxi.communications.benefitscenter.BenefitsCenterNotification;
import ru.yandex.taxi.communications.benefitscenter.b;
import ru.yandex.taxi.hiredriver.HireDriverNotification;
import ru.yandex.taxi.masstransit.paymentcards.MtTransportCardNotification;
import ru.yandex.taxi.masstransit.stop.ui.MtErrorNotification;
import ru.yandex.taxi.notifications.local.LocalNotificationItemComponent;
import ru.yandex.taxi.order.f;
import ru.yandex.taxi.order.view.OrderCancelSupportNotifiedNotification;
import ru.yandex.taxi.surge.dialog.price_complain.ErrorNotification;

/* loaded from: classes14.dex */
public final /* synthetic */ class qn5 implements xj60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qn5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.xj60
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((b) obj2).d.c(((BenefitsCenterNotification) obj).getId());
                break;
            case 1:
                ((a) obj2).G.c(((CallFeedbackTimedNotification) obj).getId());
                break;
            case 2:
                ((m48) obj2).b.c(((CopyInfoType) obj).getId());
                break;
            case 3:
                ((j6a) obj2).c.c(((ChargersNotification) obj).getId());
                break;
            case 4:
                ((d) obj2).d.c(((TopNotification) obj).a);
                break;
            case 5:
                ((i) obj2).d.c((String) obj);
                break;
            case 6:
                ((tj60) ((j4a) obj2).I).c(((HireDriverNotification) obj).getId());
                break;
            case 7:
                ((tj60) ((boj0) obj2).c).c(((CopyInfoType) obj).getId());
                break;
            case 8:
                ((tj60) obj2).c(((MtErrorNotification) obj).getId());
                break;
            case 9:
                ((tj60) obj2).c(((MtTransportCardNotification) obj).getId());
                break;
            case 10:
                ((f) obj2).Z.c(((OrderCancelSupportNotifiedNotification) obj).getId());
                break;
            case 11:
                ((com.yandex.go.payments.notifications.a) obj2).d.c(((PaymentsNotification) obj).a);
                break;
            case 12:
                ((f4b0) obj2).b.c(((PersonalGoalsNotification) obj).getId());
                break;
            case 13:
                ((a4v0) obj2).b.c(((LocalNotificationItemComponent) obj).getId());
                break;
            default:
                ((wuw0) obj2).E.c(((ErrorNotification) obj).getId());
                break;
        }
    }
}
