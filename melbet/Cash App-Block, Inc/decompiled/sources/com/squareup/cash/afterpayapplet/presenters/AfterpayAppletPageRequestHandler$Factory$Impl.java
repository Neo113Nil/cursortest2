package com.squareup.cash.afterpayapplet.presenters;

import app.cash.local.worker.LocalActivitySetupTeardown;
import com.squareup.cash.clientsync.readers.RealSyncEntityReader;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;

/* loaded from: classes.dex */
public final class AfterpayAppletPageRequestHandler$Factory$Impl {
    public final LocalActivitySetupTeardown.MetroFactory delegateFactory;

    public AfterpayAppletPageRequestHandler$Factory$Impl(LocalActivitySetupTeardown.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final AfterpayAppletPageRequestHandler create(String str) {
        LocalActivitySetupTeardown.MetroFactory metroFactory = this.delegateFactory;
        RealObservabilityManager realObservabilityManager = (RealObservabilityManager) metroFactory.appForegroundStateProvider.invoke();
        ActivityClientService activityClientService = (ActivityClientService) metroFactory.sessionManager.invoke();
        RealUuidGenerator realUuidGenerator = (RealUuidGenerator) metroFactory.syncValueReader.invoke();
        String str2 = (String) metroFactory.shortlinkHandler.invoke();
        RealSyncEntityReader realSyncEntityReader = (RealSyncEntityReader) metroFactory.ioDispatcher.invoke();
        realObservabilityManager.getClass();
        activityClientService.getClass();
        realUuidGenerator.getClass();
        str2.getClass();
        realSyncEntityReader.getClass();
        return new AfterpayAppletPageRequestHandler(str, realObservabilityManager, activityClientService, realUuidGenerator, str2, realSyncEntityReader);
    }
}
