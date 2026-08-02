package com.squareup.cash.sheet;

import android.view.GestureDetector;

/* loaded from: classes7.dex */
public final class OutsideBoundsTouchHandler extends GestureDetector.SimpleOnGestureListener {
    public static final int[] fakeIntArray = {0, 0};
    public final BottomSheet layout;
    public final GestureDetector scrollDetector;

    public OutsideBoundsTouchHandler(BottomSheet bottomSheet) {
        this.layout = bottomSheet;
        this.scrollDetector = new GestureDetector(bottomSheet.getContext(), new OutsideBoundsTouchHandler$scrollDetector$1(this, 0));
    }
}
