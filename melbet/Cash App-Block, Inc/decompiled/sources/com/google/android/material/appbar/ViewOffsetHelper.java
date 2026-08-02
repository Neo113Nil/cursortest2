package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public final class ViewOffsetHelper {
    public int layoutLeft;
    public int layoutTop;
    public int offsetTop;
    public final View view;

    public ViewOffsetHelper(View view) {
        this.view = view;
    }

    public final void applyOffsets() {
        int i = this.offsetTop;
        View view = this.view;
        int top = i - (view.getTop() - this.layoutTop);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.layoutLeft));
    }

    public final boolean setTopAndBottomOffset(int i) {
        if (this.offsetTop == i) {
            return false;
        }
        this.offsetTop = i;
        applyOffsets();
        return true;
    }
}
