package com.squareup.cash.shopping.views;

import android.content.Context;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.sheet.RealSheetState$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.screens.CashAppPayIncentiveScreen$IncentivePromptSheetScreen;
import com.squareup.cash.shopping.screens.ContinueWithCashAppPaySheetResult;
import com.squareup.cash.shopping.screens.ShoppingInfoSheetScreen;
import com.squareup.cash.shopping.screens.ShoppingScreen$RestrictedItemWarningSheetScreen;
import com.squareup.cash.shopping.sup.screens.CheckoutScreenType;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen;
import com.squareup.cash.shopping.viewmodels.ShoppingViewModel;
import com.squareup.cash.shopping.viewmodels.ShoppingWebViewEvent;
import com.squareup.cash.webview.android.WebViewProvider;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class ShoppingWebContainerView extends ComposeUiView {
    public final boolean afterpayUseCase;
    public final String businessToken;
    public final String customUserAgent;
    public Function1 onEvent;
    public final ShoppingViewFactory$createUi$view$1 shoppingWebBridgeFactory;
    public final WebViewProvider webViewProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingWebContainerView(ShoppingViewFactory$createUi$view$1 shoppingViewFactory$createUi$view$1, String str, String str2, boolean z, WebViewProvider webViewProvider, Context context) {
        super(context);
        context.getClass();
        this.shoppingWebBridgeFactory = shoppingViewFactory$createUi$view$1;
        this.customUserAgent = str;
        this.businessToken = str2;
        this.afterpayUseCase = z;
        this.webViewProvider = webViewProvider;
        this.onEvent = new RealSheetState$$ExternalSyntheticLambda0(29);
    }

    public final void Content(final ShoppingViewModel shoppingViewModel, final Function1 function1, Composer composer, final int i) {
        ShoppingViewModel shoppingViewModel2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-867328690);
        int i3 = (gapComposer.changedInstance(shoppingViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            shoppingViewModel2 = shoppingViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (shoppingViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, shoppingViewModel, function1, i, i4) { // from class: com.squareup.cash.shopping.views.ShoppingWebContainerView$$ExternalSyntheticLambda1
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ ShoppingWebContainerView f$0;
                        public final /* synthetic */ ShoppingViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            ShoppingViewModel shoppingViewModel3 = this.f$1;
                            ShoppingWebContainerView shoppingWebContainerView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    shoppingWebContainerView.Content(shoppingViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    shoppingWebContainerView.Content(shoppingViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            shoppingViewModel2 = shoppingViewModel;
            i2 = i;
            this.onEvent = function1;
            ShoppingWebContainerViewKt.Content(SpacerKt.imePadding(SpacerKt.systemBarsPadding(Modifier.Companion.$$INSTANCE)), shoppingViewModel2, this.customUserAgent, this.businessToken, this.afterpayUseCase, function1, this.webViewProvider, false, this.shoppingWebBridgeFactory, gapComposer, ((i3 << 3) & 112) | ((i3 << 12) & 458752));
            function12 = function1;
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final ShoppingViewModel shoppingViewModel3 = shoppingViewModel2;
            final int i5 = 1;
            final int i6 = i2;
            final Function1 function13 = function12;
            endRestartGroup2.block = new Function2(this, shoppingViewModel3, function13, i6, i5) { // from class: com.squareup.cash.shopping.views.ShoppingWebContainerView$$ExternalSyntheticLambda1
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ ShoppingWebContainerView f$0;
                public final /* synthetic */ ShoppingViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i5;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function132 = this.f$2;
                    ShoppingViewModel shoppingViewModel32 = this.f$1;
                    ShoppingWebContainerView shoppingWebContainerView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            shoppingWebContainerView.Content(shoppingViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            shoppingWebContainerView.Content(shoppingViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.webViewProvider.flushWebView();
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView, com.squareup.cash.ui.DialogResultListener
    public final void onDialogCanceled(Screen screen) {
        screen.getClass();
        if (screen instanceof ShoppingInfoSheetScreen.AfterPayInfoSheetScreen) {
            this.onEvent.invoke(new ShoppingWebViewEvent.InfoSheetViewed((ShoppingInfoSheetScreen) screen));
        }
        if (screen instanceof SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen) {
            CheckoutScreenType checkoutScreenType = ((SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen) screen).screenType;
            if (checkoutScreenType instanceof CheckoutScreenType.ReviewPlan) {
                this.onEvent.invoke(ShoppingWebViewEvent.SingleUsePaymentReviewPlanDismissed.INSTANCE);
            } else if (checkoutScreenType instanceof CheckoutScreenType.CreditLimitExceededWarning) {
                this.onEvent.invoke(ShoppingWebViewEvent.SingleUsePaymentCreditLimitWarningExceededDismissed.INSTANCE);
            } else if (checkoutScreenType instanceof CheckoutScreenType.NonEmptyCartWarning) {
                this.onEvent.invoke(ShoppingWebViewEvent.SingleUsePaymentNonEmptyCartWarningDismissed.INSTANCE);
            } else if (checkoutScreenType instanceof CheckoutScreenType.MinimumSpendRestrictedWarning) {
                this.onEvent.invoke(ShoppingWebViewEvent.SingleUsePaymentMinimumSpendWarningDismissed.INSTANCE);
            } else if (checkoutScreenType instanceof CheckoutScreenType.ConnectionFailedWarning) {
                this.onEvent.invoke(ShoppingWebViewEvent.SingleUsePaymentConnectionFailedWarningDismissed.INSTANCE);
            } else if (checkoutScreenType instanceof CheckoutScreenType.LoanLimitReachedError) {
                this.onEvent.invoke(ShoppingWebViewEvent.SingleUsePaymentLoanLimitReachedWarningDismissed.INSTANCE);
            } else if (checkoutScreenType instanceof CheckoutScreenType.SpendingLimitReachedError) {
                this.onEvent.invoke(ShoppingWebViewEvent.SingleUsePaymentSpendingLimitReachedWarningDismissed.INSTANCE);
            }
        }
        if (screen instanceof ShoppingScreen$RestrictedItemWarningSheetScreen) {
            this.onEvent.invoke(ShoppingWebViewEvent.RestrictedItemWarningDismissed.INSTANCE);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView, com.squareup.cash.ui.DialogResultListener
    public final void onDialogResult(Screen screen, Object obj) {
        screen.getClass();
        if ((screen instanceof CashAppPayIncentiveScreen$IncentivePromptSheetScreen) && (obj instanceof ContinueWithCashAppPaySheetResult)) {
            int ordinal = ((ContinueWithCashAppPaySheetResult) obj).ordinal();
            if (ordinal == 0) {
                this.onEvent.invoke(ShoppingWebViewEvent.PayKitShopViewEvent.CashAppPayContinuePressed.INSTANCE);
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                this.onEvent.invoke(ShoppingWebViewEvent.PayKitShopViewEvent.CashAppPayPromptDismissed.INSTANCE);
            }
        }
        if (screen instanceof SingleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen) {
            if (obj == AlertDialogResult.POSITIVE) {
                this.onEvent.invoke(ShoppingWebViewEvent.SingleUsePaymentCancelDialogConfirmed.INSTANCE);
            } else if (obj == AlertDialogResult.NEGATIVE) {
                this.onEvent.invoke(ShoppingWebViewEvent.SingleUsePaymentCancelDialogDismissed.INSTANCE);
            }
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((ShoppingViewModel) obj, function1, gapComposer, 0);
    }
}
