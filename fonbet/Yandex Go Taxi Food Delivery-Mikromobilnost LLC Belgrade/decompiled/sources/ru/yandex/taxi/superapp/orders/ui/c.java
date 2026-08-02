package ru.yandex.taxi.superapp.orders.ui;

import android.content.Context;
import android.view.View;
import defpackage.gtq0;
import defpackage.h2i0;
import defpackage.hgr0;
import defpackage.i3y;
import defpackage.mrg0;
import defpackage.q;
import defpackage.q48;
import defpackage.qje;
import defpackage.r48;
import defpackage.sls;
import defpackage.tje;
import defpackage.xng0;
import kotlin.LazyThreadSafetyMode;
import ru.yandex.taxi.models.CopySource;

/* loaded from: classes6.dex */
public final class c {
    public final ru.yandex.taxi.design.utils.a a;
    public final int b;
    public final i3y c;
    public final i3y d;
    public r48 e;

    public c(final Context context, ru.yandex.taxi.design.utils.a aVar) {
        this.a = aVar;
        this.b = tje.r(mrg0.go_design_m_space, context);
        final int i = 0;
        sls slsVar = new sls(this) { // from class: ru.yandex.taxi.superapp.orders.ui.a
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                c cVar = this.b;
                switch (i2) {
                    case 0:
                        return new CarDataCopyPopup$PopupView(cVar, context);
                    default:
                        i3y i3yVar = cVar.c;
                        PopupWindowAboveFromView popupWindowAboveFromView = new PopupWindowAboveFromView((CarDataCopyPopup$PopupView) i3yVar.getValue());
                        popupWindowAboveFromView.setAnimationStyle(h2i0.Animation_AppCompat_DropDownUp);
                        CarDataCopyPopup$PopupView carDataCopyPopup$PopupView = (CarDataCopyPopup$PopupView) i3yVar.getValue();
                        ru.yandex.taxi.design.utils.a aVar2 = cVar.a;
                        int i3 = cVar.b;
                        int i4 = xng0.effectShadowBottom;
                        Context context2 = context;
                        carDataCopyPopup$PopupView.setBackground(gtq0.v(aVar2, context2, i3, new hgr0(0.0f, tje.w(8, context2), tje.w(20, context2), qje.u(context2.getTheme(), i4)), 0, 16));
                        return popupWindowAboveFromView;
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        final int i2 = 1;
        this.d = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ru.yandex.taxi.superapp.orders.ui.a
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                c cVar = this.b;
                switch (i22) {
                    case 0:
                        return new CarDataCopyPopup$PopupView(cVar, context);
                    default:
                        i3y i3yVar = cVar.c;
                        PopupWindowAboveFromView popupWindowAboveFromView = new PopupWindowAboveFromView((CarDataCopyPopup$PopupView) i3yVar.getValue());
                        popupWindowAboveFromView.setAnimationStyle(h2i0.Animation_AppCompat_DropDownUp);
                        CarDataCopyPopup$PopupView carDataCopyPopup$PopupView = (CarDataCopyPopup$PopupView) i3yVar.getValue();
                        ru.yandex.taxi.design.utils.a aVar2 = cVar.a;
                        int i3 = cVar.b;
                        int i4 = xng0.effectShadowBottom;
                        Context context2 = context;
                        carDataCopyPopup$PopupView.setBackground(gtq0.v(aVar2, context2, i3, new hgr0(0.0f, tje.w(8, context2), tje.w(20, context2), qje.u(context2.getTheme(), i4)), 0, 16));
                        return popupWindowAboveFromView;
                }
            }
        });
    }

    public final void a(q48 q48Var, View view, int i, int i2, CopySource copySource, int i3) {
        i3y i3yVar = this.d;
        if (((PopupWindowAboveFromView) i3yVar.getValue()).isShowing()) {
            return;
        }
        i3y i3yVar2 = this.c;
        ((CarDataCopyPopup$PopupView) i3yVar2.getValue()).setItemClickedListener(new q(27, this, q48Var, copySource));
        ((CarDataCopyPopup$PopupView) i3yVar2.getValue()).setInfo(q48Var);
        ((PopupWindowAboveFromView) i3yVar.getValue()).showFromAbove(view, i, i2, i3);
    }
}
