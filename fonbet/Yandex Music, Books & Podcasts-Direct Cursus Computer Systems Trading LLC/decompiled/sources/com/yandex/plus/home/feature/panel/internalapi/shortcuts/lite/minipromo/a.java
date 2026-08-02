package com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.minipromo;

import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.plus.core.insets.d;
import com.yandex.plus.home.feature.webviews.internal.container.g;
import com.yandex.plus.home.feature.webviews.internal.container.r;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.f;
import defpackage.eeh;
import defpackage.hrg;
import defpackage.xdr;
import defpackage.zne;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes5.dex */
public final class a implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public a(com.yandex.plus.plaquesdk.plaque.c cVar, com.yandex.plus.plaquesdk.plaque.api.dependencies.c cVar2) {
        this.a = 6;
        this.b = cVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        TextView topTextView;
        TextView bottomTextView;
        TextView topTextView2;
        TextView topTextView3;
        TextView bottomTextView2;
        TextView topTextView4;
        TextView mainActionTextView;
        TextView additionalActionTextView;
        TextView mainActionTextView2;
        TextView additionalActionTextView2;
        TextView mainActionTextView3;
        TextView additionalActionTextView3;
        switch (this.a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                c cVar = (c) this.b;
                topTextView = cVar.getTopTextView();
                TextPaint paint = topTextView.getPaint();
                float descent = paint.descent() - paint.ascent();
                if (descent < 1.0f) {
                    descent = 1.0f;
                }
                int height = (int) ((cVar.getHeight() - (cVar.u * 2)) / descent);
                if (!cVar.x) {
                    bottomTextView = cVar.getBottomTextView();
                    bottomTextView.setMaxLines(height);
                    return;
                }
                topTextView2 = cVar.getTopTextView();
                int b = eeh.b(topTextView2.getHeight() / descent);
                topTextView3 = cVar.getTopTextView();
                topTextView3.setMaxLines(Math.min(height, b));
                bottomTextView2 = cVar.getBottomTextView();
                topTextView4 = cVar.getTopTextView();
                bottomTextView2.setMaxLines(height - topTextView4.getMaxLines());
                return;
            case 1:
                view.removeOnLayoutChangeListener(this);
                com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.redalert.b bVar = (com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.redalert.b) this.b;
                mainActionTextView = bVar.getMainActionTextView();
                if (mainActionTextView.getVisibility() == 0) {
                    additionalActionTextView = bVar.getAdditionalActionTextView();
                    if (additionalActionTextView.getVisibility() == 0) {
                        mainActionTextView2 = bVar.getMainActionTextView();
                        int measuredHeight = mainActionTextView2.getMeasuredHeight();
                        additionalActionTextView2 = bVar.getAdditionalActionTextView();
                        int max = Math.max(measuredHeight, additionalActionTextView2.getMeasuredHeight());
                        if (max > 0) {
                            mainActionTextView3 = bVar.getMainActionTextView();
                            mainActionTextView3.setHeight(max);
                            additionalActionTextView3 = bVar.getAdditionalActionTextView();
                            additionalActionTextView3.setHeight(max);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                view.removeOnLayoutChangeListener(this);
                ((g) this.b).C.setPeekHeight(view.getHeight());
                return;
            case 3:
                view.removeOnLayoutChangeListener(this);
                t tVar = (t) this.b;
                if (!t.c(tVar, view)) {
                    xdr xdrVar = tVar.J;
                    xdrVar.getClass();
                    xdrVar.m(null, zne.e);
                    return;
                }
                d dVar = new d(0);
                r rVar = new r(tVar);
                com.yandex.plus.core.insets.a aVar = new com.yandex.plus.core.insets.a();
                aVar.b = new LinkedHashSet(2);
                aVar.d();
                aVar.c();
                dVar.b.put(rVar, aVar);
                dVar.b(view);
                return;
            case 4:
                view.removeOnLayoutChangeListener(this);
                ((com.yandex.plus.home.feature.webviews.internal.container.a) ((ViewGroup) this.b)).f();
                return;
            case 5:
                view.removeOnLayoutChangeListener(this);
                f fVar = (f) this.b;
                f.a(fVar);
                f.c(fVar);
                f.b(fVar);
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                Iterator it = ((com.yandex.plus.plaquesdk.plaque.c) this.b).i.iterator();
                if (it.hasNext()) {
                    throw hrg.j(it);
                }
                return;
        }
    }

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
