package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.profile.presenters.AddAliasPresenter;

/* loaded from: classes.dex */
public final class FilesetUploadOptionsPresenter$Factory$Impl {
    public final AddAliasPresenter create(BlockersScreens.FilesetUploadOptionsBottomSheet filesetUploadOptionsBottomSheet, BetterNavigator.ScreenNavigator screenNavigator) {
        return new AddAliasPresenter(filesetUploadOptionsBottomSheet, screenNavigator);
    }
}
