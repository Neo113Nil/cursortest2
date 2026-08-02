package com.squareup.cash.globalsearch.views;

import android.view.View;
import android.view.ViewGroup;
import app.cash.molecule.PlatformKt;

/* loaded from: classes.dex */
public final class GlobalSearchTransitionFactory$widthProperty$1 extends PlatformKt {
    public final /* synthetic */ int $r8$classId;

    @Override // app.cash.molecule.PlatformKt
    public final float getValue(Object obj) {
        int i;
        switch (this.$r8$classId) {
            case 0:
                View view = (View) obj;
                view.getClass();
                i = view.getLayoutParams().width;
                break;
            default:
                View view2 = (View) obj;
                view2.getClass();
                i = view2.getLayoutParams().height;
                break;
        }
        return i;
    }

    @Override // app.cash.molecule.PlatformKt
    public final void setValue(Object obj, float f) {
        switch (this.$r8$classId) {
            case 0:
                View view = (View) obj;
                view.getClass();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = (int) f;
                view.setLayoutParams(layoutParams);
                view.requestLayout();
                break;
            default:
                View view2 = (View) obj;
                view2.getClass();
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                layoutParams2.height = (int) f;
                view2.setLayoutParams(layoutParams2);
                view2.requestLayout();
                break;
        }
    }
}
