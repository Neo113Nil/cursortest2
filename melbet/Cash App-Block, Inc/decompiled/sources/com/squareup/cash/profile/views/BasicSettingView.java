package com.squareup.cash.profile.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.squareup.cash.R;
import com.squareup.kotterknife.KotterKnifeKt;
import com.squareup.kotterknife.Lazy;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class BasicSettingView extends FrameLayout {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(BasicSettingView.class, "rootView", "getRootView()Landroid/view/ViewGroup;", 0), new PropertyReference1Impl(BasicSettingView.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), new PropertyReference1Impl(BasicSettingView.class, "descriptionView", "getDescriptionView()Landroid/widget/TextView;", 0)};
    public final Lazy descriptionView$delegate;
    public final Lazy rootView$delegate;
    public final Lazy titleView$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.rootView$delegate = KotterKnifeKt.bindView(this, R.id.basic_setting_container);
        this.titleView$delegate = KotterKnifeKt.bindView(this, R.id.title);
        this.descriptionView$delegate = KotterKnifeKt.bindView(this, R.id.description);
        View.inflate(context, R.layout.basic_setting, this);
    }

    public final void setDescription(CharSequence charSequence) {
        KProperty[] kPropertyArr = $$delegatedProperties;
        KProperty kProperty = kPropertyArr[2];
        Lazy lazy = this.descriptionView$delegate;
        ((TextView) lazy.getValue(this, kProperty)).setText(charSequence);
        ((TextView) lazy.getValue(this, kPropertyArr[2])).setVisibility((charSequence == null || StringsKt.isBlank(charSequence)) ? 8 : 0);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        KProperty[] kPropertyArr = $$delegatedProperties;
        ((TextView) this.titleView$delegate.getValue(this, kPropertyArr[1])).setEnabled(z);
        ((TextView) this.descriptionView$delegate.getValue(this, kPropertyArr[2])).setEnabled(z);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        ((ViewGroup) this.rootView$delegate.getValue(this, $$delegatedProperties[0])).setOnClickListener(onClickListener);
    }

    public final void setTitle(CharSequence charSequence) {
        ((TextView) this.titleView$delegate.getValue(this, $$delegatedProperties[1])).setText(charSequence);
    }

    public final void setDescription(int i) {
        setDescription(getContext().getString(i));
    }
}
