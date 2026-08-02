package com.squareup.cash.blockers.presenters;

import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class GetFlowLoadingPresenter$MetroFactory {
    public final Provider activityFinisher;
    public final DoubleCheck appService;
    public final Provider flowNavigationHelper;

    public /* synthetic */ GetFlowLoadingPresenter$MetroFactory(Provider provider, DoubleCheck doubleCheck, Factory factory) {
        this.flowNavigationHelper = provider;
        this.appService = doubleCheck;
        this.activityFinisher = factory;
    }

    public /* synthetic */ GetFlowLoadingPresenter$MetroFactory(DoubleCheck doubleCheck, Factory factory, InstanceFactory instanceFactory) {
        this.appService = doubleCheck;
        this.flowNavigationHelper = factory;
        this.activityFinisher = instanceFactory;
    }

    public /* synthetic */ GetFlowLoadingPresenter$MetroFactory(Factory factory, Factory factory2, DoubleCheck doubleCheck) {
        this.flowNavigationHelper = factory;
        this.activityFinisher = factory2;
        this.appService = doubleCheck;
    }
}
