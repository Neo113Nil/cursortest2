package com.squareup.cash.limits.views;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.ViewFactory;
import app.cash.broadway.ui.compose.ComposeUiView;
import coil3.RealImageLoader;
import com.squareup.cash.account.components.AccountUiView;
import com.squareup.cash.buynowpaylater.screens.AfterPayInfoSheetScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPayOrderDetailsScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPayOrderDocumentScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPayOrderHubScreen;
import com.squareup.cash.buynowpaylater.screens.OrderDetailsOverflowActionSheetScreen;
import com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsOverflowSheetView;
import com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsView;
import com.squareup.cash.buynowpaylater.views.AfterPayOrderDocumentView;
import com.squareup.cash.buynowpaylater.views.AfterPayStackableInfoSheetView;
import com.squareup.cash.cashapppay.settings.screens.CashAppPaySettingsScreen;
import com.squareup.cash.cashapppay.settings.screens.ConfirmRemoveLinkedBusinessDialogScreen;
import com.squareup.cash.cashapppay.settings.screens.LinkedBusinessDetailsSheet;
import com.squareup.cash.cashapppay.settings.screens.UnlinkResultScreen;
import com.squareup.cash.cashapppay.settings.views.ConfirmRemoveLinkedBusinessDialog;
import com.squareup.cash.cashapppay.settings.views.UnlinkResultView;
import com.squareup.cash.genericelements.screens.GenericTreeElementsScreen;
import com.squareup.cash.growtools.screens.GrowToolsCompleteActivityScreen;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs;
import com.squareup.cash.limits.screens.LimitsScreen;
import com.squareup.cash.limits.screens.LimitsSectionScreen;
import com.squareup.cash.limits.views.arcade.GroupedLimitsSectionDetailScreen;
import com.squareup.cash.merchant.screens.SquareLoyaltyDetailsScreen;
import com.squareup.cash.merchant.screens.SquareLoyaltySheetScreen;
import com.squareup.cash.merchant.views.SquareLoyaltyDetailsView;
import com.squareup.cash.merchant.views.SquareLoyaltySheetView;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.shopping.views.ProductSearchView;
import com.squareup.cash.stablecoin.screens.StablecoinScreens$StablecoinHome;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class LimitsViewFactory implements ViewFactory {
    public final /* synthetic */ int $r8$classId;
    public final RealImageLoader imageLoader;

    public /* synthetic */ LimitsViewFactory(RealImageLoader realImageLoader, int i) {
        this.$r8$classId = i;
        this.imageLoader = realImageLoader;
    }

    @Override // app.cash.broadway.ui.ViewFactory
    public final ViewFactory.ScreenView createView(Screen screen, Context context, ViewGroup viewGroup) {
        ComposeUiView groupedLimitsSectionDetailScreen;
        ComposeUiView unlinkResultView;
        P2PListView p2PListView;
        int i = this.$r8$classId;
        RealImageLoader realImageLoader = this.imageLoader;
        context.getClass();
        switch (i) {
            case 0:
                if (screen instanceof LimitsScreen) {
                    groupedLimitsSectionDetailScreen = new P2PListView(context, realImageLoader, 18);
                } else {
                    if (!(screen instanceof LimitsSectionScreen)) {
                        return null;
                    }
                    groupedLimitsSectionDetailScreen = new GroupedLimitsSectionDetailScreen(context);
                }
                return new ViewFactory.ScreenView(groupedLimitsSectionDetailScreen, groupedLimitsSectionDetailScreen);
            case 1:
                if (screen instanceof AfterPayOrderHubScreen) {
                    P2PListView p2PListView2 = new P2PListView(context, realImageLoader, 8);
                    return new ViewFactory.ScreenView(p2PListView2, p2PListView2);
                }
                if (screen instanceof AfterPayOrderDetailsScreen) {
                    AfterPayOrderDetailsView afterPayOrderDetailsView = new AfterPayOrderDetailsView(context, realImageLoader);
                    return new ViewFactory.ScreenView(afterPayOrderDetailsView, afterPayOrderDetailsView);
                }
                if (screen instanceof AfterPayInfoSheetScreen) {
                    AfterPayStackableInfoSheetView afterPayStackableInfoSheetView = new AfterPayStackableInfoSheetView(context);
                    return new ViewFactory.ScreenView(afterPayStackableInfoSheetView, afterPayStackableInfoSheetView);
                }
                if (screen instanceof OrderDetailsOverflowActionSheetScreen) {
                    AfterPayOrderDetailsOverflowSheetView afterPayOrderDetailsOverflowSheetView = new AfterPayOrderDetailsOverflowSheetView(context);
                    return new ViewFactory.ScreenView(afterPayOrderDetailsOverflowSheetView, afterPayOrderDetailsOverflowSheetView);
                }
                if (!(screen instanceof AfterPayOrderDocumentScreen)) {
                    return null;
                }
                AfterPayOrderDocumentView afterPayOrderDocumentView = new AfterPayOrderDocumentView(context);
                return new ViewFactory.ScreenView(afterPayOrderDocumentView, afterPayOrderDocumentView);
            case 2:
                if (screen instanceof CashAppPaySettingsScreen) {
                    unlinkResultView = new AccountUiView(context, realImageLoader);
                } else if (screen instanceof LinkedBusinessDetailsSheet) {
                    unlinkResultView = new SquareLoyaltySheetView(context, realImageLoader, 1);
                } else if (screen instanceof ConfirmRemoveLinkedBusinessDialogScreen) {
                    unlinkResultView = new ConfirmRemoveLinkedBusinessDialog(context);
                } else {
                    if (!(screen instanceof UnlinkResultScreen)) {
                        return null;
                    }
                    unlinkResultView = new UnlinkResultView(context);
                }
                return new ViewFactory.ScreenView(unlinkResultView, unlinkResultView);
            case 3:
                if (screen instanceof GenericTreeElementsScreen.GenericTreeElementsFullScreen) {
                    P2PListView p2PListView3 = new P2PListView(context, realImageLoader, 13);
                    return new ViewFactory.ScreenView(p2PListView3, p2PListView3);
                }
                if (!(screen instanceof GenericTreeElementsScreen.GenericTreeElementsSheet)) {
                    return null;
                }
                SquareLoyaltyDetailsView squareLoyaltyDetailsView = new SquareLoyaltyDetailsView(context, realImageLoader, 2);
                return new ViewFactory.ScreenView(squareLoyaltyDetailsView, squareLoyaltyDetailsView);
            case 4:
                if (screen instanceof GrowToolsManagerScreen) {
                    p2PListView = new P2PListView(context, realImageLoader, 15);
                } else {
                    if (!(screen instanceof GrowToolsCompleteActivityScreen)) {
                        return null;
                    }
                    p2PListView = new P2PListView(context, realImageLoader, 14);
                }
                return new ViewFactory.ScreenView(p2PListView, p2PListView);
            case 5:
                if (!(screen instanceof SelectPaymentInstrumentArgs)) {
                    return null;
                }
                SquareLoyaltySheetView squareLoyaltySheetView = new SquareLoyaltySheetView(context, realImageLoader, 3);
                return new ViewFactory.ScreenView(squareLoyaltySheetView, squareLoyaltySheetView);
            case 6:
                if (screen instanceof SquareLoyaltySheetScreen) {
                    SquareLoyaltySheetView squareLoyaltySheetView2 = new SquareLoyaltySheetView(context, realImageLoader, 0);
                    return new ViewFactory.ScreenView(squareLoyaltySheetView2, squareLoyaltySheetView2);
                }
                if (!(screen instanceof SquareLoyaltyDetailsScreen)) {
                    return null;
                }
                SquareLoyaltyDetailsView squareLoyaltyDetailsView2 = new SquareLoyaltyDetailsView(context, realImageLoader, 0);
                return new ViewFactory.ScreenView(squareLoyaltyDetailsView2, squareLoyaltyDetailsView2);
            default:
                if (!(screen instanceof StablecoinScreens$StablecoinHome)) {
                    return null;
                }
                if (((StablecoinScreens$StablecoinHome) screen).equals(StablecoinScreens$StablecoinHome.INSTANCE)) {
                    ProductSearchView productSearchView = new ProductSearchView(context, realImageLoader);
                    return new ViewFactory.ScreenView(productSearchView, productSearchView);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
