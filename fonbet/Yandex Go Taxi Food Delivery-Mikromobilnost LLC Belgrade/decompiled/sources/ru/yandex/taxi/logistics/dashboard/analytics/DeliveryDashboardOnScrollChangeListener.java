package ru.yandex.taxi.logistics.dashboard.analytics;

import android.view.View;
import defpackage.zrv0;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0011\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/dashboard/analytics/DeliveryDashboardOnScrollChangeListener;", "Landroid/view/View$OnScrollChangeListener;", "Lzrv0;", "superAppAnalytics", "<init>", "(Lzrv0;)V", "", "dy", "Lzy11;", "onDashboardScrolled", "(I)V", "Landroid/view/View;", "p0", "p1", "p2", "p3", "p4", "onScrollChange", "(Landroid/view/View;IIII)V", "Lzrv0;", "", "isUpLastSendScrollDirection", "Ljava/lang/Boolean;", "delivery_dashboard"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryDashboardOnScrollChangeListener implements View.OnScrollChangeListener {
    private Boolean isUpLastSendScrollDirection;
    private final zrv0 superAppAnalytics;

    public DeliveryDashboardOnScrollChangeListener(zrv0 zrv0Var) {
        this.superAppAnalytics = zrv0Var;
    }

    private final void onDashboardScrolled(int dy) {
        boolean z = dy > 0;
        Boolean bool = this.isUpLastSendScrollDirection;
        if (bool == null || !bool.equals(Boolean.valueOf(z))) {
            zrv0 zrv0Var = this.superAppAnalytics;
            if (z) {
                zrv0Var.getClass();
                zrv0Var.a.a("SuperApp.Delivery.PultOrder.UpScroll", new HashMap(), 1, new HashMap());
            } else {
                zrv0Var.getClass();
                zrv0Var.a.a("SuperApp.Delivery.PultOrder.DownScroll", new HashMap(), 1, new HashMap());
            }
            this.isUpLastSendScrollDirection = Boolean.valueOf(z);
        }
    }

    @Override // android.view.View.OnScrollChangeListener
    public void onScrollChange(View p0, int p1, int p2, int p3, int p4) {
        onDashboardScrolled(p2 - p4);
    }
}
