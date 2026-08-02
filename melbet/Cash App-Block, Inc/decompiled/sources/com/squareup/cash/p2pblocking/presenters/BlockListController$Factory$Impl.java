package com.squareup.cash.p2pblocking.presenters;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.blockly.api.BlocklyService;
import com.stripe.hcaptcha.HCaptcha;

/* loaded from: classes.dex */
public final class BlockListController$Factory$Impl {
    public final ProfileCropView.MetroFactory delegateFactory;

    public BlockListController$Factory$Impl(ProfileCropView.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final HCaptcha create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        screen.getClass();
        ProfileCropView.MetroFactory metroFactory = this.delegateFactory;
        BlocklyService blocklyService = (BlocklyService) metroFactory.imageLoader.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.cropResultManager.invoke();
        blocklyService.getClass();
        androidStringManager.getClass();
        return new HCaptcha(blocklyService, androidStringManager, screenNavigator, screen);
    }
}
