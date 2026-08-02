package ru.yandex.taxi.maas.impl.ride.exitchoice;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.go.zone.repository.o;
import com.yandex.runtime.image.ImageProvider;
import defpackage.ah00;
import defpackage.b2l0;
import defpackage.bdc;
import defpackage.bvf0;
import defpackage.czo0;
import defpackage.el00;
import defpackage.et00;
import defpackage.f4c0;
import defpackage.hbp0;
import defpackage.iqz0;
import defpackage.jbh;
import defpackage.leh;
import defpackage.lr00;
import defpackage.mrg0;
import defpackage.mth;
import defpackage.opz0;
import defpackage.qje;
import defpackage.rjt0;
import defpackage.rol0;
import defpackage.rqo;
import defpackage.sgu0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.ugu0;
import defpackage.xm00;
import defpackage.xng0;
import defpackage.xw31;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.styling.f;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class d extends ru.yandex.taxi.routes.presentation.c {
    public final com.yandex.go.route.interactor.c V;
    public final com.yandex.go.pin.api.widget.b W;
    public final f Z;
    public final hbp0 a0;
    public f4c0 b0;
    public final ImageProvider c0;
    public xm00 d0;
    public final BubbleComponent e0;
    public final RobotoTextView f0;
    public final r0 g0;
    public final r0 h0;
    public List i0;

    public d(ah00 ah00Var, Context context, xm00 xm00Var, leh lehVar, b2l0 b2l0Var, o oVar, el00 el00Var, ru.yandex.taxi.map_common.map.o oVar2, sgu0 sgu0Var, com.yandex.go.route.interactor.c cVar, com.yandex.go.pin.api.widget.b bVar, f fVar, tt2 tt2Var, lr00 lr00Var, et00 et00Var, rqo rqoVar, opz0 opz0Var, iqz0 iqz0Var, rjt0 rjt0Var) {
        super(ah00Var, context, xm00Var, lehVar, b2l0Var, oVar, el00Var, oVar2, sgu0Var, lr00Var, tt2Var, et00Var, opz0Var, iqz0Var, ((jbh) rqoVar).a(SimpleBooleanExperiment.ROUTE_AVOID_TOLLS), rjt0Var);
        this.V = cVar;
        this.W = bVar;
        this.Z = fVar;
        this.a0 = new hbp0(new czo0(14), "", null);
        this.c0 = ImageProvider.fromBitmap(((ugu0) sgu0Var).a(-1));
        RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
        this.f0 = robotoTextView;
        this.g0 = bvf0.c(EmptyList.a);
        this.h0 = bvf0.c(null);
        robotoTextView.setGravity(17);
        robotoTextView.setTextColor(qje.u(context.getTheme(), xng0.textMain));
        robotoTextView.setTextSize(0, context.getResources().getDimensionPixelSize(mrg0.component_text_size_caption));
        xw31.G(context.getResources().getDimensionPixelSize(mrg0.go_design_s_space), robotoTextView);
        robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        BubbleComponent bubbleComponent = new BubbleComponent(context, null, 0, 6, null);
        this.e0 = bubbleComponent;
        bubbleComponent.setBubbleColor(new bdc(xng0.bgMain));
        bubbleComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        bubbleComponent.addView(robotoTextView);
    }

    @Override // ru.yandex.taxi.routes.presentation.c
    public final boolean Ig() {
        return true;
    }

    @Override // ru.yandex.taxi.routes.presentation.c
    public final tpr Og() {
        return this.V.f();
    }

    @Override // ru.yandex.taxi.routes.presentation.c
    public final boolean Pg() {
        return true;
    }

    @Override // ru.yandex.taxi.routes.presentation.c
    public final void attach() {
        super.attach();
        hbp0 hbp0Var = this.a0;
        hbp0Var.a();
        tje.N(hbp0Var, null, null, new MaasExitChooseOverlay$attach$$inlined$safeCollectIn$1(Ng(), null, this), 3);
        tje.N(hbp0Var, null, null, new MaasExitChooseOverlay$attach$$inlined$safeCollectIn$2(e.n(this.g0, new mth(this.h0, 6), new rol0(new MaasExitChooseOverlay$pinIconFlow$1(this, null)), MaasExitChooseOverlay$attach$3.a), null, this), 3);
    }

    @Override // ru.yandex.taxi.routes.presentation.c
    public final void detach() {
        super.detach();
        this.a0.b();
        this.b0 = null;
    }
}
