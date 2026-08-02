package com.squareup.cash.data.blockers;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;

/* loaded from: classes.dex */
public interface BlockersDataNavigator {
    boolean canGoBack(Screen screen, BlockersData blockersData);

    Screen getBack(Screen screen, BlockersData blockersData);

    Screen getNext(Screen screen, BlockersData blockersData);

    Screen getSkip(Screen screen, BlockersData blockersData);
}
