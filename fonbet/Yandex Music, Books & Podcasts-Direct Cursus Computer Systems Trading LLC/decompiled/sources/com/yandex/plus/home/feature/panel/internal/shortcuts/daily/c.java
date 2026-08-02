package com.yandex.plus.home.feature.panel.internal.shortcuts.daily;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.core.data.common.k;
import defpackage.b6;
import defpackage.eb;
import defpackage.eup;
import defpackage.h5;
import defpackage.hr2;
import defpackage.iz7;
import defpackage.jyr;
import defpackage.rvf;
import defpackage.tf6;
import defpackage.wdu;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public abstract class c extends b6 {
    public final com.yandex.plus.core.imageloader.b d;
    public final float e;
    public final com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view, com.yandex.plus.core.imageloader.b bVar, boolean z, kotlinx.coroutines.a aVar) {
        super(view, aVar);
        view.getClass();
        bVar.getClass();
        aVar.getClass();
        this.d = bVar;
        this.e = view.getResources().getDimension(R.dimen.plus_sdk_panel_daily_action_button_corner_radius);
        this.f = new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.b(z);
        wdu.q(view, new eb(9));
    }

    public static void Q(f fVar, TextView textView, Function1 function1) {
        textView.getClass();
        textView.setVisibility((fVar == null || StringsKt.U(fVar.a)) ? 8 : 0);
        if (fVar != null) {
            com.yandex.plus.bdui.flex.ui.a.D(textView, fVar.b, function1);
            textView.setText(fVar.a);
        }
    }

    @Override // defpackage.b6
    public final void C() {
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.b bVar = this.f;
        jyr jyrVar = bVar.d;
        if (bVar.a) {
            ((ValueAnimator) jyrVar.getValue()).removeAllUpdateListeners();
            ((ValueAnimator) jyrVar.getValue()).cancel();
        }
        com.yandex.plus.bdui.plus.analytics.b.d((tf6) this.c);
    }

    public final void O(d dVar, TextView textView) {
        textView.getClass();
        textView.setVisibility(dVar != null ? 0 : 8);
        if (dVar != null) {
            textView.setText(dVar.a);
            com.yandex.plus.bdui.flex.ui.a.D(textView, dVar.b, new com.yandex.plus.bdui.plus.webview.navigation.a(15));
            k kVar = dVar.c;
            float f = this.e;
            textView.setBackground(com.yandex.plus.bdui.plus.analytics.b.B(kVar, f, f, f, f));
        }
    }

    public final void P(e eVar, ShapeableImageView shapeableImageView) {
        shapeableImageView.getClass();
        shapeableImageView.setVisibility(eVar != null ? 0 : 8);
        if (eVar != null) {
            ((com.yandex.plus.coil.b) this.d).b(eVar.a).i(shapeableImageView);
            if (r1.q(shapeableImageView)) {
                eVar = new e(eVar.a, eVar.c, eVar.b, eVar.e, eVar.d);
            }
            iz7 h = shapeableImageView.getShapeAppearanceModel().h();
            float f = eVar.c;
            h.b = rvf.y(0);
            h.f = new h5(f);
            float f2 = eVar.b;
            h.a = rvf.y(0);
            h.e = new h5(f2);
            float f3 = eVar.d;
            h.d = rvf.y(0);
            h.h = new h5(f3);
            float f4 = eVar.e;
            h.c = rvf.y(0);
            h.g = new h5(f4);
            eup e = h.e();
            if (!shapeableImageView.isLaidOut() || shapeableImageView.isLayoutRequested()) {
                shapeableImageView.addOnLayoutChangeListener(new b(0, shapeableImageView, e));
            } else {
                shapeableImageView.setShapeAppearanceModel(e);
            }
        }
    }

    public final void S(ShapeableImageView shapeableImageView, Function2 function2) {
        shapeableImageView.getClass();
        if ((shapeableImageView.getVisibility() == 0 ? shapeableImageView : null) != null) {
            com.yandex.plus.bdui.templating.render.a aVar = new com.yandex.plus.bdui.templating.render.a(6, function2, shapeableImageView);
            com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.b bVar = this.f;
            bVar.getClass();
            if (bVar.a) {
                ((ValueAnimator) bVar.d.getValue()).addUpdateListener(new hr2(24, aVar));
            }
        }
    }
}
