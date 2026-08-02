package defpackage;

import android.widget.TextView;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;

/* loaded from: classes2.dex */
public final /* synthetic */ class que0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PreselectActivity b;

    public /* synthetic */ que0(PreselectActivity preselectActivity, int i) {
        this.a = i;
        this.b = preselectActivity;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        TextView orCreateSelectCallbacks$lambda$0;
        PaymentButtonView orCreateSelectCallbacks$lambda$1;
        bqr0 activityViewModel_delegate$lambda$0;
        y8h componentDispatcher_delegate$lambda$0;
        int i = this.a;
        PreselectActivity preselectActivity = this.b;
        switch (i) {
            case 0:
                orCreateSelectCallbacks$lambda$0 = PreselectActivity.getOrCreateSelectCallbacks$lambda$0(preselectActivity);
                return orCreateSelectCallbacks$lambda$0;
            case 1:
                orCreateSelectCallbacks$lambda$1 = PreselectActivity.getOrCreateSelectCallbacks$lambda$1(preselectActivity);
                return orCreateSelectCallbacks$lambda$1;
            case 2:
                activityViewModel_delegate$lambda$0 = PreselectActivity.activityViewModel_delegate$lambda$0(preselectActivity);
                return activityViewModel_delegate$lambda$0;
            default:
                componentDispatcher_delegate$lambda$0 = PreselectActivity.componentDispatcher_delegate$lambda$0(preselectActivity);
                return componentDispatcher_delegate$lambda$0;
        }
    }
}
