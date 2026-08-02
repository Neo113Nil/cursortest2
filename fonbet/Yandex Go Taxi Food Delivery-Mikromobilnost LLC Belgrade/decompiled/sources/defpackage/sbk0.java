package defpackage;

import android.view.View;
import com.yandex.go.taxi.order.details.v2.analytics.g;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardAiBubbleView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardCompanionSectionView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardPhotoView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.companion_buffer_serch.RideCardCompanionBufferSearchView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.cost_breakdown.RideCardCostBreakdownView;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.a;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.c;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.i;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.j;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.k;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.r;

/* loaded from: classes14.dex */
public final /* synthetic */ class sbk0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ sbk0(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        g gVar = this.b;
        switch (i) {
            case 0:
                return new c((RideCardAiBubbleView) obj, gVar);
            case 1:
                return new a((yqs0) ((View) obj), gVar);
            case 2:
                return new i((RideCardCompanionBufferSearchView) obj, gVar);
            case 3:
                return new j((RideCardCompanionSectionView) obj, gVar);
            case 4:
                return new k((RideCardCostBreakdownView) obj, gVar);
            default:
                return new r((RideCardPhotoView) obj, gVar);
        }
    }
}
