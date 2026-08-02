package defpackage;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.yandex.go.navigator.BaseNavigatorModalView;
import com.yandex.go.navigator.alt_select.AltSelectModalView;
import com.yandex.go.taxi.order.cancel.reasons.view.v2.CancelReasonsV2View;
import com.yandex.go.taxi.order.util.accordion.AccordionComponent;
import com.yandex.go.trusted_contacts.ui.BaseTrustedContactsModalView;
import ru.yandex.taxi.fragment.common.BaseWebChromeClient;
import ru.yandex.taxi.fragment.preorder.AddressMapFragment;
import ru.yandex.taxi.overdraft.ChangePaymentModalView;
import ru.yandex.taxi.widget.dialog.BaseDialog;

/* loaded from: classes14.dex */
public final /* synthetic */ class zi implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ zi(int i) {
        this.a = i;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AccordionComponent.updateContainerAnimated$lambda$0();
                break;
            case 1:
                AccordionComponent.expandAnimated$lambda$0();
                break;
            case 2:
                AddressMapFragment.createPanoramaButtonIfNeed$lambda$0$0();
                break;
            case 3:
                AlarmManagerSchedulerBroadcastReceiver.lambda$onReceive$0();
                break;
            case 4:
                AltSelectModalView.renderLoadingState$lambda$1$0();
                break;
            case 5:
            case 6:
                break;
            case 7:
                BaseDialog.dismissListener$lambda$0();
                break;
            case 8:
                BaseDialog.onHideAnimationEndListener$lambda$0();
                break;
            case 9:
                BaseDialog.setOnHideAnimationEndListener$lambda$0();
                break;
            case 10:
                ftn.a().g();
                break;
            case 11:
                BaseNavigatorModalView.dismissWithAction$lambda$0();
                break;
            case 12:
                BaseTrustedContactsModalView.animateShowLeftToRight$lambda$0();
                break;
            case 13:
                BaseTrustedContactsModalView.animateShowLeftToRight$lambda$1();
                break;
            case 14:
                BaseTrustedContactsModalView.animateDismissRightToLeft$lambda$0();
                break;
            case 15:
                BaseTrustedContactsModalView.animateDismissRightToLeft$lambda$1();
                break;
            case 16:
                BaseTrustedContactsModalView.animateShowRightToLeft$lambda$0();
                break;
            case 17:
                BaseTrustedContactsModalView.animateShowRightToLeft$lambda$1();
                break;
            case 18:
                BaseTrustedContactsModalView.animateDismissLeftToRight$lambda$0();
                break;
            case 19:
                BaseTrustedContactsModalView.animateDismissLeftToRight$lambda$1();
                break;
            case 20:
                BaseWebChromeClient._init_$lambda$0();
                break;
            case 21:
                break;
            case 22:
                ea20 ea20Var = nl7.y;
                if (ea20Var != null) {
                    ea20Var.a("onAcceptCallNotificationActionClick", null, null);
                    break;
                }
                break;
            case 23:
                ea20 ea20Var2 = nl7.y;
                if (ea20Var2 != null) {
                    ea20Var2.a("onRejectCallNotificationActionClick", null, null);
                    break;
                }
                break;
            case 24:
                CancelReasonsV2View.onAttachedToWindow$lambda$0();
                break;
            case 25:
                CancelReasonsV2View.onAttachedToWindow$lambda$1();
                break;
            case 26:
                CancelReasonsV2View.onAttachedToWindow$lambda$2();
                break;
            case 27:
                CancelReasonsV2View.onAttachedToWindow$lambda$3();
                break;
            case 28:
                ChangePaymentModalView.onPayLaterRunnable$lambda$0();
                break;
            default:
                ChangePaymentModalView.onPaymentChangedRunnable$lambda$0();
                break;
        }
    }

    public /* synthetic */ zi(int i, Object obj) {
        this.a = i;
    }
}
