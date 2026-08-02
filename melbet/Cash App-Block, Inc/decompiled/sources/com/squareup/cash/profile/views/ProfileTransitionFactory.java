package com.squareup.cash.profile.views;

import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.TransitionFactory;
import app.cash.history.screens.HistoryScreens;
import com.squareup.cash.account.screens.Account;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.favorites.screens.AddFavorites;
import com.squareup.cash.favorites.screens.ListFavorites;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.profile.screens.DocumentsScreen;
import com.squareup.cash.profile.screens.InvestingContactScreen;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.transfers.screens.LinkedAccountsNuxScreen;
import com.squareup.cash.transfers.screens.LinkedAccountsScreen;

/* loaded from: classes.dex */
public final class ProfileTransitionFactory implements TransitionFactory {
    @Override // app.cash.broadway.ui.TransitionFactory
    public final TransitionFactory.Transition createTransition(Screen screen, Screen screen2, boolean z, StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8) {
        screen2.getClass();
        boolean z2 = screen instanceof ProfileScreens.ProfileScreen;
        TransitionFactory.StandardTransition.PushLeft pushLeft = TransitionFactory.StandardTransition.PushLeft.INSTANCE;
        TransitionFactory.StandardTransition.PushRight pushRight = TransitionFactory.StandardTransition.PushRight.INSTANCE;
        if (z2) {
            if (screen2 instanceof InvestingScreens.StockDetails) {
                return pushLeft;
            }
            if (z && (screen2 instanceof HistoryScreens.PaymentReceipt)) {
                return pushRight;
            }
        }
        if (!(screen2 instanceof ProfileScreens.ProfileScreen) || !(screen instanceof InvestingScreens.StockDetails)) {
            boolean z3 = screen instanceof ListFavorites;
            TransitionFactory.StandardTransition.InFromBottom inFromBottom = TransitionFactory.StandardTransition.InFromBottom.INSTANCE;
            if (z3 && (screen2 instanceof AddFavorites)) {
                return inFromBottom;
            }
            boolean z4 = screen instanceof AddFavorites;
            TransitionFactory.StandardTransition.OutToBottom outToBottom = TransitionFactory.StandardTransition.OutToBottom.INSTANCE;
            if (z4 && (screen2 instanceof ListFavorites)) {
                return outToBottom;
            }
            if ((screen instanceof BlockersScreens) && (screen2 instanceof Account)) {
                return outToBottom;
            }
            if (!(screen2 instanceof ProfileScreens.AccountInfoScreen) || !(screen instanceof Account)) {
                if (!(screen instanceof ProfileScreens.AccountInfoScreen) || !z) {
                    if (screen2 instanceof LinkedAccountsNuxScreen) {
                        return inFromBottom;
                    }
                    if (screen instanceof LinkedAccountsNuxScreen) {
                        return outToBottom;
                    }
                    if (!(screen2 instanceof LinkedAccountsScreen) || !(screen instanceof Account)) {
                        if (!(screen instanceof LinkedAccountsScreen) || !z) {
                            if (!(screen2 instanceof ProfileScreens.SecurityScreen) || !(screen instanceof Account)) {
                                boolean z5 = screen instanceof ProfileScreens.SecurityScreen;
                                if (!z5 || !z) {
                                    if (!(screen2 instanceof ProfileScreens.PrivacyScreen) || !(screen instanceof Account)) {
                                        if (!(screen instanceof ProfileScreens.PrivacyScreen) || !z) {
                                            if (!(screen2 instanceof InvestingContactScreen) || !z5) {
                                                if (!(screen instanceof InvestingContactScreen) || !z) {
                                                    if (screen2 instanceof ProfileScreens.UnsupportedSettingScreen) {
                                                        return TransitionFactory.StandardTransition.Immediate.INSTANCE;
                                                    }
                                                    if ((screen instanceof ProfileScreens.UnsupportedSettingScreen) && (screen2 instanceof Account)) {
                                                        return outToBottom;
                                                    }
                                                    if ((screen instanceof ProfileScreens.NotificationsScreen) && ((screen2 instanceof ProfileScreens.ContactMethodDetailsScreen) || (screen2 instanceof ProfileScreens.CategoryListScreen) || (screen2 instanceof ProfileScreens.ChannelListScreen))) {
                                                        return pushLeft;
                                                    }
                                                    if (!(screen2 instanceof ProfileScreens.NotificationsScreen) || (!(screen instanceof ProfileScreens.ContactMethodDetailsScreen) && !(screen instanceof ProfileScreens.CategoryListScreen) && !(screen instanceof ProfileScreens.ChannelListScreen))) {
                                                        if (screen instanceof ProfileScreens.CategoryListScreen) {
                                                            boolean z6 = screen2 instanceof ProfileScreens.CategoryListScreen;
                                                            if (!z6 || !z) {
                                                                if ((screen2 instanceof ProfileScreens.ChannelListScreen) || z6) {
                                                                    return pushLeft;
                                                                }
                                                            }
                                                        }
                                                        if ((screen instanceof ProfileScreens.ChannelListScreen) && (screen2 instanceof ProfileScreens.CategoryListScreen)) {
                                                            return pushRight;
                                                        }
                                                        if (screen2 instanceof DocumentsScreen) {
                                                            return new TransitionFactory.StandardTransition.Push(z);
                                                        }
                                                        if (!(screen instanceof DocumentsScreen)) {
                                                            return null;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return pushRight;
            }
        }
        return pushLeft;
    }
}
