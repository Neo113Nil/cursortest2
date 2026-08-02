package com.squareup.cash.formview.components;

import android.app.Activity;
import android.content.Context;
import com.squareup.cash.clientrouting.RealRouter;

/* loaded from: classes.dex */
public final class FormView$Factory$Impl {
    public final RealRouter.MetroFactory delegateFactory;

    public FormView$Factory$Impl(RealRouter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final FormView create(Context context) {
        context.getClass();
        RealRouter.MetroFactory metroFactory = this.delegateFactory;
        Activity activity = (Activity) metroFactory.urlRouterFactory.value;
        FormElementViewBuilder$Factory$Impl formElementViewBuilder$Factory$Impl = (FormElementViewBuilder$Factory$Impl) metroFactory.clientRouteRouterFactory.invoke();
        activity.getClass();
        formElementViewBuilder$Factory$Impl.getClass();
        return new FormView(activity, context, formElementViewBuilder$Factory$Impl);
    }
}
