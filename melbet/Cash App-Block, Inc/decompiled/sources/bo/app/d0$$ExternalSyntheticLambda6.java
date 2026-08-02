package bo.app;

import com.braze.events.BrazeUserChangeEvent;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class d0$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BrazeUserChangeEvent f$0;

    public /* synthetic */ d0$$ExternalSyntheticLambda6(BrazeUserChangeEvent brazeUserChangeEvent, int i) {
        this.$r8$classId = i;
        this.f$0 = brazeUserChangeEvent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String createBrazeUserChangeEventSubscriber$lambda$0$0;
        int i = this.$r8$classId;
        BrazeUserChangeEvent brazeUserChangeEvent = this.f$0;
        switch (i) {
            case 0:
                return d0.a(brazeUserChangeEvent);
            case 1:
                return d0.b(brazeUserChangeEvent);
            default:
                createBrazeUserChangeEventSubscriber$lambda$0$0 = BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$0$0(brazeUserChangeEvent);
                return createBrazeUserChangeEventSubscriber$lambda$0$0;
        }
    }
}
