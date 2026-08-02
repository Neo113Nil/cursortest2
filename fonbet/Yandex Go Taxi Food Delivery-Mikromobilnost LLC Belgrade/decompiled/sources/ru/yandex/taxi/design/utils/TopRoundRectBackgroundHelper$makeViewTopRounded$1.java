package ru.yandex.taxi.design.utils;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ru/yandex/taxi/design/utils/TopRoundRectBackgroundHelper$makeViewTopRounded$1", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "Lzy11;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TopRoundRectBackgroundHelper$makeViewTopRounded$1 extends ViewOutlineProvider {
    final /* synthetic */ int $roundSize;

    public TopRoundRectBackgroundHelper$makeViewTopRounded$1(int i) {
        this.$roundSize = i;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        int i = this.$roundSize;
        outline.setRoundRect(0, 0, width, height + i, i);
    }
}
