package com.squareup.cash.activity.presenters;

import app.cash.broadway.navigation.Navigator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.OrderActivityItem;
import com.squareup.cash.activity.backend.PaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.loader.PaycheckActivityData;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.presenters.ActivityItemPresenter;
import com.squareup.cash.activity.viewmodels.ActivityItemPresentationContext;
import com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinWidgetPluginProvider;
import com.squareup.cash.moneybot.components.api.ClientRenderablePluginRegistry;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.MapFactory;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes5.dex */
public final class RealActivityItemPresenterFactory implements ActivityItemPresenter.Factory {
    public final Map presenterFactories;

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final MapFactory presenterFactories;

        public /* synthetic */ MetroFactory(MapFactory mapFactory, int i) {
            this.$r8$classId = i;
            this.presenterFactories = mapFactory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            MapFactory mapFactory = this.presenterFactories;
            switch (i) {
                case 0:
                    return new RealActivityItemPresenterFactory((Map) mapFactory.invoke());
                case 1:
                    return new BitcoinWidgetPluginProvider((Map) mapFactory.invoke());
                default:
                    return new ClientRenderablePluginRegistry((Map) mapFactory.invoke());
            }
        }
    }

    public RealActivityItemPresenterFactory(Map map) {
        this.presenterFactories = map;
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemPresenter.Factory
    public final ActivityItemPresenter create(Navigator navigator, ActivityItem activityItem, ActivityItemPresentationContext activityItemPresentationContext, ActivityItemEventHandler.Factory factory, Function1 function1) {
        PaymentHistoryActivityItem.Type type2;
        navigator.getClass();
        activityItem.getClass();
        if (activityItem instanceof FormattedPaymentHistoryActivityItem) {
            type2 = PaymentHistoryActivityItem.Type.FORMATTED_PAYMENT_HISTORY;
        } else {
            if (activityItem instanceof PaymentHistoryActivityItem) {
                a$$ExternalSyntheticBUOutline0.m("Cannot create an item presenter for a PaymentHistoryActivityItem that hasn't been formatted!");
                return null;
            }
            if (activityItem instanceof PaycheckActivityData) {
                type2 = PaymentHistoryActivityItem.Type.PAYCHECKS;
            } else {
                if (!(activityItem instanceof OrderActivityItem)) {
                    throw new UnsupportedOperationException("Unsupported ActivityItem type: " + Reflection.factory.getOrCreateKotlinClass(activityItem.getClass()));
                }
                type2 = PaymentHistoryActivityItem.Type.ORDER;
            }
        }
        Object obj = this.presenterFactories.get(type2);
        if (obj != null) {
            return ((ActivityItemPresenter.Factory) obj).create(navigator, activityItem, activityItemPresentationContext, factory, function1);
        }
        Path$$ExternalSyntheticBUOutline0.m$3(type2, "No presenter factory injected for item type ");
        return null;
    }
}
