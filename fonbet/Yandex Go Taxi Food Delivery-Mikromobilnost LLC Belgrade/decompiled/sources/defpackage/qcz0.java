package defpackage;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import com.google.common.collect.ImmutableMap;
import com.yandex.messaging.input.g;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.ybsdk.feature.transactions.impl.data.c;
import com.ybsdk.feature.transactions.impl.data.network.TransactionsApi;
import com.ybsdk.feature.transfer.internal.screens.result.presentation.TransferResultFragment;
import com.ybsdk.feature.transfer.internal.screens.targets.presentation.TransferTargetsFragment;
import com.ybsdk.feature.transfer.version2.internal.data.d;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2MkkCashoutApi;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2TipsApi;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.data.a;
import com.ybsdk.screens.notice.presentation.b;
import java.util.Map;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.FeedbackApi;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.PollApi;
import ru.yandex.taxi.map_common.map.q;

/* loaded from: classes14.dex */
public final class qcz0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ qcz0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static qcz0 a(eqh eqhVar) {
        return new qcz0(eqhVar, 29);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 1;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return (g) xvf0Var.get();
            case 1:
                return new koz0((pho) xvf0Var.get());
            case 2:
                return new ftz0((pev0) xvf0Var.get());
            case 3:
                return new b((Map) xvf0Var.get());
            case 4:
                return new wpy0(7, (qdc) xvf0Var.get());
            case 5:
                return new c1x0((mus0) xvf0Var.get());
            case 6:
                return (FeedbackApi) ((t0k0) xvf0Var.get()).b(FeedbackApi.class);
            case 7:
                return (PollApi) ((t0k0) xvf0Var.get()).b(PollApi.class);
            case 8:
                return new q((el00) xvf0Var.get());
            case 9:
                return new com.yandex.go.taxi.order.map.overlay.traffic.b((d901) xvf0Var.get());
            case 10:
                return new erq((sf01) xvf0Var.get());
            case 11:
                return new com.ybsdk.feature.transactions.impl.data.b((TransactionsApi) xvf0Var.get());
            case 12:
                return new com.ybsdk.feature.transactions.impl.domain.interactors.b((c) xvf0Var.get());
            case 13:
                return new lg01((yf01) xvf0Var.get());
            case 14:
                return new com.ybsdk.feature.transfer.version2.internal.data.b((Transfer2Api) xvf0Var.get());
            case 15:
                return new com.ybsdk.feature.transfer.version2.internal.data.c((Transfer2MkkCashoutApi) xvf0Var.get());
            case 16:
                return new a((Transfer2Api) xvf0Var.get());
            case 17:
                return new d((Transfer2TipsApi) xvf0Var.get());
            case 18:
                tw51 tw51Var = (tw51) xvf0Var.get();
                int i3 = 15;
                hag hagVar = new hag(tw51Var, i3);
                int i4 = 14;
                xvf0 b = i5m.b(new y501(new hag(tw51Var, 21), i4));
                hag hagVar2 = new hag(tw51Var, 26);
                int i5 = 19;
                gpx0 gpx0Var = new gpx0((xvf0) hagVar, b, (xvf0) new y501(hagVar2, i5), 21, false);
                f380 f380Var = new f380(gpx0Var, i4);
                int i6 = 20;
                hag hagVar3 = new hag(tw51Var, i6);
                n3w a = n3w.a(new gh90(new p370(i3, gpx0Var, hagVar2, hagVar3)));
                hag hagVar4 = new hag(tw51Var, 16);
                ln01 ln01Var = new ln01(n3w.a(new xt01(new hwo0(f380Var, a, new qm01(hagVar4, i2), qt01.a, 27))), 3);
                hag hagVar5 = new hag(tw51Var, 18);
                y501 y501Var = new y501(new hag(tw51Var, i5), i6);
                n3w a2 = n3w.a(new it01(new cjw0(gpx0Var, hagVar3, hagVar)));
                hag hagVar6 = new hag(tw51Var, 17);
                int i7 = 23;
                flx0 flx0Var = new flx0(hagVar6, new qm01(hagVar4, 0), i7);
                hag hagVar7 = new hag(tw51Var, i7);
                int i8 = 24;
                return new ii01(new ys01(), ImmutableMap.j(TransferTargetsFragment.class, ln01Var, TransferResultFragment.class, new flx0(n3w.a(new rs01(new m(hagVar5, y501Var, a2, flx0Var, hagVar7, new hag(tw51Var, 27), new hag(tw51Var, i8), hagVar6, new hag(tw51Var, 22), new hag(tw51Var, 25)))), hagVar7, i8)));
            case 19:
                return new ulx0((rqo) xvf0Var.get(), 1);
            case 20:
                return new ru01((np51) xvf0Var.get());
            case 21:
                return new com.ybsdk.feature.transfer.version2.internal.screens.dashboard.data.a((Transfer2Api) xvf0Var.get());
            case 22:
                return new o7r0((pho) xvf0Var.get());
            case 23:
                return new ez01((Activity) xvf0Var.get());
            case 24:
                return new com.yandex.messaging.internal.view.timeline.translations.g((Lifecycle) xvf0Var.get());
            case 25:
                return new e311((pho) xvf0Var.get());
            case 26:
                return new s311((rqo) xvf0Var.get());
            case 27:
                return new ih01((pho) xvf0Var.get());
            case 28:
                return new com.yandex.go.taxi.summary.mobilityhub.mapper.c((ru.yandex.taxi.widget.c) xvf0Var.get());
            default:
                return new ih01((pho) xvf0Var.get());
        }
    }

    public /* synthetic */ qcz0(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
