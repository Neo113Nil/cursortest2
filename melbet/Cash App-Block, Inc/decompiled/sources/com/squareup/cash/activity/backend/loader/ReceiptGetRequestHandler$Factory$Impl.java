package com.squareup.cash.activity.backend.loader;

import com.squareup.cash.activity.backend.ZiplineActivityItemFormatter;
import com.squareup.cash.history.presenters.SkipPaymentPresenter$MetroFactory;
import com.squareup.moshi.Moshi;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;

/* loaded from: classes.dex */
public final class ReceiptGetRequestHandler$Factory$Impl implements DefaultGetRequestHandler$Factory {
    public final SkipPaymentPresenter$MetroFactory delegateFactory;

    public ReceiptGetRequestHandler$Factory$Impl(SkipPaymentPresenter$MetroFactory skipPaymentPresenter$MetroFactory) {
        this.delegateFactory = skipPaymentPresenter$MetroFactory;
    }

    @Override // com.squareup.cash.activity.backend.loader.DefaultGetRequestHandler$Factory
    public final ReceiptGetRequestHandler create() {
        SkipPaymentPresenter$MetroFactory skipPaymentPresenter$MetroFactory = this.delegateFactory;
        ActivityClientService activityClientService = (ActivityClientService) skipPaymentPresenter$MetroFactory.activityEntityManager.getValue();
        ZiplineActivityItemFormatter ziplineActivityItemFormatter = (ZiplineActivityItemFormatter) skipPaymentPresenter$MetroFactory.paymentManager.getValue();
        Moshi moshi = (Moshi) skipPaymentPresenter$MetroFactory.stringManager.lambda.invoke();
        activityClientService.getClass();
        ziplineActivityItemFormatter.getClass();
        moshi.getClass();
        return new ReceiptGetRequestHandler(activityClientService, ziplineActivityItemFormatter, moshi);
    }
}
