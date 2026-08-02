package ru.yandex.taxi.plaque.utils;

import android.view.View;
import defpackage.te20;
import kotlin.Metadata;
import ru.yandex.taxi.plaque.api.models.display.MicroWidgetDrawable;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010¸\u0006\u0000"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lzy11;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MicroWidgetsUtils$applyBackground$$inlined$doOnNextLayout$1 implements View.OnLayoutChangeListener {
    final /* synthetic */ te20 $backgroundSettings$inlined;
    final /* synthetic */ View $view$inlined;

    public MicroWidgetsUtils$applyBackground$$inlined$doOnNextLayout$1(View view, te20 te20Var) {
        this.$view$inlined = view;
        this.$backgroundSettings$inlined = te20Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        view.removeOnLayoutChangeListener(this);
        this.$view$inlined.setBackground(new MicroWidgetDrawable(this.$backgroundSettings$inlined, view.getHeight()));
    }
}
