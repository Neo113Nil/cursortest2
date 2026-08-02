package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import ru.yandex.taxi.order.view.HorizontalButtonsView;
import ru.yandex.taxi.tollroad.alert.card.TollRoadInfoModalView;
import ru.yandex.taxi.tollroad.alert.item.TollRoadRideInfoView;

/* loaded from: classes6.dex */
public final class yqz0 implements wqz0 {
    public final /* synthetic */ TollRoadRideInfoView a;

    public yqz0(TollRoadRideInfoView tollRoadRideInfoView) {
        this.a = tollRoadRideInfoView;
    }

    @Override // defpackage.wqz0
    public final void D5(loz0 loz0Var) {
        koz0 koz0Var;
        w030 w030Var;
        TollRoadRideInfoView tollRoadRideInfoView = this.a;
        Context context = tollRoadRideInfoView.getContext();
        koz0Var = tollRoadRideInfoView.tollRoadAlertAnalytics;
        TollRoadInfoModalView tollRoadInfoModalView = new TollRoadInfoModalView(context, loz0Var, koz0Var);
        w030Var = tollRoadRideInfoView.modalViewCoordinator;
        w030Var.s(tollRoadInfoModalView, true);
    }

    @Override // defpackage.wqz0
    public final void J4(boolean z) {
        qw31 qw31Var;
        FrameLayout frameLayout;
        int i = z ? 0 : 8;
        TollRoadRideInfoView tollRoadRideInfoView = this.a;
        tollRoadRideInfoView.setVisibility(i);
        qw31Var = tollRoadRideInfoView.visibilityChangedSubscriber;
        frameLayout = ((HorizontalButtonsView) ((reu) qw31Var).b).tollRoadRideInfoContainer;
        frameLayout.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.wqz0
    public final void Nf(String str, String str2) {
        TollRoadRideInfoView tollRoadRideInfoView = this.a;
        tollRoadRideInfoView.setTitle(str);
        tollRoadRideInfoView.setSubtitle(str2);
    }

    @Override // defpackage.wqz0
    public final void V2(boolean z) {
        int i = z ? 2 : 0;
        TollRoadRideInfoView tollRoadRideInfoView = this.a;
        tollRoadRideInfoView.setTrailMode(i);
        tollRoadRideInfoView.setClickable(z);
    }

    @Override // defpackage.wqz0
    public final void c5(int i) {
        this.a.setLeadImage(i);
    }
}
