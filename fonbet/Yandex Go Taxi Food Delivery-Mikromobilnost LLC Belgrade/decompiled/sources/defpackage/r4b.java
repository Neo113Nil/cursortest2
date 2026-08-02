package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.messaging.ui.chatlist.ChatListFragment;
import com.yandex.messaging.ui.timeline.TimelineFragment;

/* loaded from: classes15.dex */
public final /* synthetic */ class r4b implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ r4b(Activity activity, int i) {
        this.a = i;
        this.b = activity;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        pk3 authBrick_delegate$lambda$0;
        pk3 authBrick_delegate$lambda$02;
        int i = this.a;
        Activity activity = this.b;
        switch (i) {
            case 0:
                authBrick_delegate$lambda$0 = ChatListFragment.authBrick_delegate$lambda$0(activity);
                return authBrick_delegate$lambda$0;
            case 1:
                return new CompositePaymentIconsView(this.b, null, 0, 6, null);
            case 2:
                return (ViewGroup) activity.findViewById(teh0.top_fullscreen_modal_views_container);
            default:
                authBrick_delegate$lambda$02 = TimelineFragment.authBrick_delegate$lambda$0(activity);
                return authBrick_delegate$lambda$02;
        }
    }
}
