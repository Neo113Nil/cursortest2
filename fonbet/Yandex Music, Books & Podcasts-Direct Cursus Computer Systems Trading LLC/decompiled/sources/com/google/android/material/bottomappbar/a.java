package com.google.android.material.bottomappbar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.xk6;
import defpackage.zl6;
import java.lang.ref.WeakReference;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class a implements View.OnLayoutChangeListener {
    public final /* synthetic */ BottomAppBar.Behavior a;

    public a(BottomAppBar.Behavior behavior) {
        this.a = behavior;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        WeakReference weakReference;
        int i9;
        int leftInset;
        int rightInset;
        int bottomInset;
        Rect rect;
        Rect rect2;
        Rect rect3;
        BottomAppBar.Behavior behavior = this.a;
        weakReference = behavior.viewRef;
        BottomAppBar bottomAppBar = (BottomAppBar) weakReference.get();
        if (bottomAppBar != null) {
            int i10 = bottomAppBar.K0;
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    rect = behavior.fabContentRect;
                    floatingActionButton.f(rect);
                    rect2 = behavior.fabContentRect;
                    int height2 = rect2.height();
                    bottomAppBar.J(height2);
                    zl6 zl6Var = floatingActionButton.getShapeAppearanceModel().e;
                    rect3 = behavior.fabContentRect;
                    bottomAppBar.setFabCornerSize(zl6Var.a(new RectF(rect3)));
                    height = height2;
                }
                xk6 xk6Var = (xk6) view.getLayoutParams();
                i9 = behavior.originalBottomMargin;
                if (i9 == 0) {
                    if (bottomAppBar.J0 == 1) {
                        int dimensionPixelOffset = bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2);
                        bottomInset = bottomAppBar.getBottomInset();
                        ((ViewGroup.MarginLayoutParams) xk6Var).bottomMargin = bottomInset + dimensionPixelOffset;
                    }
                    leftInset = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) xk6Var).leftMargin = leftInset;
                    rightInset = bottomAppBar.getRightInset();
                    ((ViewGroup.MarginLayoutParams) xk6Var).rightMargin = rightInset;
                    if (view.getLayoutDirection() == 1) {
                        ((ViewGroup.MarginLayoutParams) xk6Var).leftMargin += i10;
                    } else {
                        ((ViewGroup.MarginLayoutParams) xk6Var).rightMargin += i10;
                    }
                }
                int i11 = BottomAppBar.a1;
                bottomAppBar.I();
                return;
            }
        }
        view.removeOnLayoutChangeListener(this);
    }
}
