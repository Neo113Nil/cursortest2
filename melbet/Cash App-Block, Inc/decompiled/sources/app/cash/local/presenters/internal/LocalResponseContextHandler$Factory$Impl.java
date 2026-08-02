package app.cash.local.presenters.internal;

import app.cash.broadway.navigation.Navigator;
import com.caverock.androidsvg.SVG;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.history.analytics.LoadTimeClock;

/* loaded from: classes.dex */
public final class LocalResponseContextHandler$Factory$Impl {
    public final LoadTimeClock.MetroFactory delegateFactory;

    public LocalResponseContextHandler$Factory$Impl(LoadTimeClock.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final SVG create(Navigator navigator) {
        navigator.getClass();
        LoadTimeClock.MetroFactory metroFactory = this.delegateFactory;
        FlowStarter flowStarter = (FlowStarter) metroFactory.clock.invoke();
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory.observabilityManager.invoke();
        flowStarter.getClass();
        blockersDataNavigator.getClass();
        return new SVG(flowStarter, blockersDataNavigator, navigator);
    }
}
