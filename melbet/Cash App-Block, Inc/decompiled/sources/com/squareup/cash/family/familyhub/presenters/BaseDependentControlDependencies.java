package com.squareup.cash.family.familyhub.presenters;

import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlStatusManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;

/* loaded from: classes6.dex */
public final class BaseDependentControlDependencies {
    public final Analytics analytics;
    public final RealCustomerStore customerStore;
    public final RealDependentControlStatusManager.Factory dependentControlStatusManagerFactory;
    public final RealRouter$Factory$Impl routerFactory;
    public final SessionManager sessionManager;
    public final AndroidStringManager stringManager;

    public BaseDependentControlDependencies(RealCustomerStore realCustomerStore, AndroidStringManager androidStringManager, Analytics analytics, SessionManager sessionManager, RealDependentControlStatusManager.Factory factory, RealRouter$Factory$Impl realRouter$Factory$Impl) {
        this.customerStore = realCustomerStore;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.sessionManager = sessionManager;
        this.dependentControlStatusManagerFactory = factory;
        this.routerFactory = realRouter$Factory$Impl;
    }
}
