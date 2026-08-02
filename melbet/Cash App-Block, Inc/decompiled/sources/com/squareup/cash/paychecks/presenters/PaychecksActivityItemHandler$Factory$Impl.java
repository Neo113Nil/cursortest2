package com.squareup.cash.paychecks.presenters;

import app.cash.broadway.navigation.Navigator;
import com.google.mlkit.vision.text.zza;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.appmessages.views.InlineAppMessageView;
import com.squareup.cash.history.presenters.RealActivityReceiptNavigator$MetroFactory;
import com.squareup.cash.integration.analytics.Analytics;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class PaychecksActivityItemHandler$Factory$Impl implements ActivityItemEventHandler.Factory {
    public final InlineAppMessageView.MetroFactory delegateFactory;

    public PaychecksActivityItemHandler$Factory$Impl(InlineAppMessageView.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemEventHandler.Factory
    public final PaychecksActivityItemHandler create(Navigator navigator, Function1 function1) {
        navigator.getClass();
        Analytics analytics = (Analytics) this.delegateFactory.staticImageLoader.invoke();
        zza zzaVar = (zza) RealActivityReceiptNavigator$MetroFactory.INSTANCE.invoke();
        analytics.getClass();
        return new PaychecksActivityItemHandler(navigator, function1, analytics, zzaVar);
    }
}
