package com.squareup.cash.payments.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.squareup.cash.R;
import com.squareup.kotterknife.KotterKnifeKt;
import com.squareup.kotterknife.Lazy;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class BillView extends FrameLayout {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(BillView.class, "availableView", "getAvailableView()Landroid/widget/TextView;", 0), new PropertyReference1Impl(BillView.class, "completeView", "getCompleteView()Landroid/view/View;", 0)};
    public final Lazy availableView$delegate;
    public final Lazy completeView$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.availableView$delegate = KotterKnifeKt.bindView(this, R.id.available);
        this.completeView$delegate = KotterKnifeKt.bindView(this, R.id.complete);
    }

    public final TextView getAvailableView() {
        return (TextView) this.availableView$delegate.getValue(this, $$delegatedProperties[0]);
    }
}
