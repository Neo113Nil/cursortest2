package com.squareup.cash.portfolio.graphs.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.robinhood.spark.SparkView;
import com.squareup.util.android.Views;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class CashSparkView extends SparkView {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CashSparkView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
    }

    @Override // com.robinhood.spark.SparkView
    public final float distanceToSnap() {
        return Views.dip((View) this, 2.0f);
    }

    @Override // com.robinhood.spark.SparkView
    public final void onScrubbed(float f, float f2) {
        ArrayList arrayList = this.xPoints;
        if (new ArrayList(arrayList).isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Float f3 = (Float) CollectionsKt.first((List) arrayList2);
        Float f4 = (Float) CollectionsKt.last((List) arrayList2);
        f3.getClass();
        float floatValue = f3.floatValue();
        f4.getClass();
        float floatValue2 = f4.floatValue();
        float f5 = (floatValue2 - floatValue) / 2.0f;
        float f6 = 0.9f * f5;
        float f7 = (((f <= f5 ? (floatValue2 - f) - f5 : f - f5) / f6) / 0.8f) * 0.2f * f6;
        super.onScrubbed(f <= f5 ? Math.max(floatValue, f - f7) : Math.min(floatValue2, f + f7), f2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashSparkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashSparkView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashSparkView(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
