package com.squareup.cash.core.navigationcontainer;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class IntrinsicHeightReportingView extends FrameLayout {
    public boolean dirty;
    public final StorageLinkQueries$$ExternalSyntheticLambda8 intrinsicHeightCallback;
    public Integer lastWidthMeasureSpec;
    public int maxHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntrinsicHeightReportingView(Context context, StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8) {
        super(context);
        context.getClass();
        this.intrinsicHeightCallback = storageLinkQueries$$ExternalSyntheticLambda8;
        this.maxHeight = Integer.MAX_VALUE;
        this.dirty = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Integer num;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (!this.dirty && (num = this.lastWidthMeasureSpec) != null && i == num.intValue() && mode == 1073741824 && size == getMeasuredHeight() && getMeasuredHeight() <= this.maxHeight) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        this.lastWidthMeasureSpec = Integer.valueOf(i);
        this.dirty = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.maxHeight, PKIFailureInfo.systemUnavail));
        this.intrinsicHeightCallback.invoke(Integer.valueOf(getMeasuredHeight()));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.dirty = true;
        super.requestLayout();
    }

    public final void setMaxHeight(int i) {
        if (this.maxHeight != i) {
            this.maxHeight = i;
            super.requestLayout();
        }
    }
}
