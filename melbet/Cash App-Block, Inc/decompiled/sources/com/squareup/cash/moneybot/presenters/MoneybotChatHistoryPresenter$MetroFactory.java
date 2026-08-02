package com.squareup.cash.moneybot.presenters;

import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.e2ee.trifle.RealTrifleService;
import com.squareup.cash.moneybot.backend.real.managers.RealChatManager;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;

/* loaded from: classes.dex */
public final class MoneybotChatHistoryPresenter$MetroFactory {
    public final Provider chatManager;
    public final DoubleCheck chatMessagesCache;
    public final DoubleCheck todayDateTimeFormatter;
    public final Provider userSessionPager;

    public MoneybotChatHistoryPresenter$MetroFactory(RealChatManager.MetroFactory metroFactory, RealTrifleService.MetroFactory metroFactory2, DoubleCheck doubleCheck, DoubleCheck doubleCheck2) {
        this.chatManager = metroFactory;
        this.userSessionPager = metroFactory2;
        this.todayDateTimeFormatter = doubleCheck;
        this.chatMessagesCache = doubleCheck2;
    }

    public MoneybotChatHistoryPresenter$MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealBrazeManager.MetroFactory metroFactory, TreehouseFlows.MetroFactory metroFactory2) {
        this.todayDateTimeFormatter = doubleCheck;
        this.chatMessagesCache = doubleCheck2;
        this.chatManager = metroFactory;
        this.userSessionPager = metroFactory2;
    }
}
