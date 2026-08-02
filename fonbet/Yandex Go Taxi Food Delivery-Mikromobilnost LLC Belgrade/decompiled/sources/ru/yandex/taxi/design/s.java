package ru.yandex.taxi.design;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import defpackage.eps0;
import defpackage.ny6;
import defpackage.wh;
import defpackage.xso;
import java.util.ArrayList;
import ru.yandex.taxi.design.SliderButtonView;

/* loaded from: classes5.dex */
public final class s extends xso {
    public final /* synthetic */ SliderButtonView G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(SliderButtonView sliderButtonView, SliderButtonView sliderButtonView2) {
        super(sliderButtonView2);
        this.G = sliderButtonView;
    }

    @Override // defpackage.xso
    public final int e(float f, float f2) {
        RectF rectF;
        rectF = this.G.fullViewRect;
        return rectF.contains(f, f2) ? 0 : -1;
    }

    @Override // defpackage.xso
    public final void f(ArrayList arrayList) {
        arrayList.add(0);
    }

    @Override // defpackage.xso
    public final boolean k(int i, int i2, Bundle bundle) {
        boolean z;
        if (i2 != 16) {
            return false;
        }
        if (i != 0) {
            return true;
        }
        SliderButtonView sliderButtonView = this.G;
        eps0 slideFinishedListener = sliderButtonView.getSlideFinishedListener();
        if (slideFinishedListener != null) {
            slideFinishedListener.p(0, 0L);
        }
        z = sliderButtonView.hideToggleWhenSlided;
        if (z) {
            sliderButtonView.hideToggleButton();
        }
        sliderButtonView.showProgressState();
        sliderButtonView.sendAccessibilityEvent(4);
        return true;
    }

    @Override // defpackage.xso
    public final void m(int i, wh whVar) {
        SliderButtonView.State state;
        CharSequence activeItemsContentDescription;
        RectF rectF;
        if (i == 0) {
            SliderButtonView sliderButtonView = this.G;
            state = sliderButtonView.currentState;
            whVar.v(state == SliderButtonView.State.IDLE);
            whVar.q(true);
            whVar.a.setImportantForAccessibility(true);
            whVar.a(16);
            activeItemsContentDescription = sliderButtonView.getActiveItemsContentDescription();
            whVar.E(activeItemsContentDescription);
            whVar.p(ny6.class.getName());
            Rect rect = new Rect();
            rectF = sliderButtonView.fullViewRect;
            rectF.round(rect);
            whVar.k(rect);
        }
    }
}
