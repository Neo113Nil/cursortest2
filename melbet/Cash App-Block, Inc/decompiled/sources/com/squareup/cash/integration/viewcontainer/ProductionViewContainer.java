package com.squareup.cash.integration.viewcontainer;

import com.squareup.cash.support.screenshot.RealScreenshotManager;
import com.squareup.cash.support.screenshot.ScreenshotEventReceiver$Factory$Impl;
import com.squareup.util.android.AndroidToaster;

/* loaded from: classes.dex */
public final class ProductionViewContainer {
    public final ScreenshotEventReceiver$Factory$Impl screenshotEventReceiverFactory;
    public final RealScreenshotManager screenshotManager;
    public final AndroidToaster toaster;

    public ProductionViewContainer(RealScreenshotManager realScreenshotManager, ScreenshotEventReceiver$Factory$Impl screenshotEventReceiver$Factory$Impl, AndroidToaster androidToaster) {
        this.screenshotManager = realScreenshotManager;
        this.screenshotEventReceiverFactory = screenshotEventReceiver$Factory$Impl;
        this.toaster = androidToaster;
    }
}
