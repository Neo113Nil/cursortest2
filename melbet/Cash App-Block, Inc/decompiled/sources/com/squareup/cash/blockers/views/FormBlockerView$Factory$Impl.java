package com.squareup.cash.blockers.views;

import android.app.Activity;
import android.content.Context;
import com.squareup.cash.blockers.views.FormBlockerView;
import com.squareup.cash.formview.components.FormElementViewBuilder$Factory$Impl;

/* loaded from: classes.dex */
public final class FormBlockerView$Factory$Impl {
    public final FormBlockerView.MetroFactory delegateFactory;

    public FormBlockerView$Factory$Impl(FormBlockerView.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final FormBlockerView create(Context context) {
        context.getClass();
        FormBlockerView.MetroFactory metroFactory = this.delegateFactory;
        Activity activity = (Activity) metroFactory.activity.value;
        FormElementViewBuilder$Factory$Impl formElementViewBuilder$Factory$Impl = (FormElementViewBuilder$Factory$Impl) metroFactory.formElementViewBuilderFactory.value;
        activity.getClass();
        formElementViewBuilder$Factory$Impl.getClass();
        return new FormBlockerView(activity, context, formElementViewBuilder$Factory$Impl);
    }
}
