package com.squareup.cash.p2pblocking.presenters;

import app.cash.local.worker.LocalActivitySetupTeardown;
import com.google.android.gms.maps.zzai;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.cash.blockly.api.BlocklyService;

/* loaded from: classes.dex */
public final class AllowListController$Factory$Impl {
    public final LocalActivitySetupTeardown.MetroFactory delegateFactory;

    public AllowListController$Factory$Impl(LocalActivitySetupTeardown.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final zzai create() {
        LocalActivitySetupTeardown.MetroFactory metroFactory = this.delegateFactory;
        AegisService aegisService = (AegisService) metroFactory.appForegroundStateProvider.invoke();
        BlocklyService blocklyService = (BlocklyService) metroFactory.sessionManager.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.syncValueReader.invoke();
        Analytics analytics = (Analytics) metroFactory.shortlinkHandler.invoke();
        RealAllowlistRepository realAllowlistRepository = (RealAllowlistRepository) metroFactory.ioDispatcher.invoke();
        aegisService.getClass();
        blocklyService.getClass();
        androidStringManager.getClass();
        analytics.getClass();
        realAllowlistRepository.getClass();
        return new zzai(aegisService, blocklyService, androidStringManager, analytics, realAllowlistRepository);
    }
}
