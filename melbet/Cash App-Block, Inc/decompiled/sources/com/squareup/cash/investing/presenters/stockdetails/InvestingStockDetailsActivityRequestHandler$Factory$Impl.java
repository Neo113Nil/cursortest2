package com.squareup.cash.investing.presenters.stockdetails;

import com.squareup.cash.appmessages.views.InlineAppMessageView;
import com.squareup.cash.history.payments.presenters.CounterpartyPageRequestHandler;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;

/* loaded from: classes.dex */
public final class InvestingStockDetailsActivityRequestHandler$Factory$Impl {
    public final InlineAppMessageView.MetroFactory delegateFactory;

    public InvestingStockDetailsActivityRequestHandler$Factory$Impl(InlineAppMessageView.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public static CounterpartyPageRequestHandler create$default(InvestingStockDetailsActivityRequestHandler$Factory$Impl investingStockDetailsActivityRequestHandler$Factory$Impl, String str) {
        ActivityClientService activityClientService = (ActivityClientService) investingStockDetailsActivityRequestHandler$Factory$Impl.delegateFactory.staticImageLoader.invoke();
        activityClientService.getClass();
        return new CounterpartyPageRequestHandler(activityClientService, str, 1);
    }
}
