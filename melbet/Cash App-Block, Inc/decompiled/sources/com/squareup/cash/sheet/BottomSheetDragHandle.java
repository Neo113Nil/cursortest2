package com.squareup.cash.sheet;

import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import android.util.Size;
import com.squareup.cash.ui.BottomSheetHandleConfig;
import com.squareup.util.android.Views;

/* loaded from: classes7.dex */
public final class BottomSheetDragHandle extends PaintDrawable {
    public final int paddedHeight;
    public final Size size;
    public final int topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetDragHandle(Context context, BottomSheetHandleConfig bottomSheetHandleConfig) {
        super(bottomSheetHandleConfig.color);
        context.getClass();
        bottomSheetHandleConfig.getClass();
        int dip = Views.dip(context, bottomSheetHandleConfig.topPadding);
        this.topPadding = dip;
        int dip2 = Views.dip(context, bottomSheetHandleConfig.bottomPadding);
        Size size = bottomSheetHandleConfig.size;
        Size size2 = new Size(Views.dip(context, size.getWidth()), Views.dip(context, size.getHeight()));
        this.size = size2;
        this.paddedHeight = size2.getHeight() + dip + dip2;
        setCornerRadius(Views.dip(context, bottomSheetHandleConfig.cornerRadius));
    }
}
