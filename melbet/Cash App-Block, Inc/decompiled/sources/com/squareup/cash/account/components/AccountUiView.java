package com.squareup.cash.account.components;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda1;
import com.google.mlkit.vision.text.zzc;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.account.components.AccountUiView;
import com.squareup.cash.account.settings.viewmodels.AccountViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel;
import com.squareup.cash.bitcoin.views.applet.BitcoinHomeView$$ExternalSyntheticLambda0;
import com.squareup.cash.cashapppay.settings.screens.ConfirmRemoveLinkedBusinessDialogScreen;
import com.squareup.cash.cashapppay.settings.viewmodels.BusinessGrantDeleteCancelled;
import com.squareup.cash.cashapppay.settings.viewmodels.BusinessGrantDeleted;
import com.squareup.cash.cashapppay.settings.viewmodels.CashAppPaySettingsViewModel;
import com.squareup.cash.cashapppay.settings.viewmodels.RemoveLinkedBusinessResult$Negative;
import com.squareup.cash.cashapppay.settings.viewmodels.RemoveLinkedBusinessResult$Positive;
import com.squareup.cash.cashapppay.settings.views.UnlinkResultViewKt;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AccountUiView extends ComposeUiView {
    public final /* synthetic */ int $r8$classId = 2;
    public Object elementBoundsRegistry;
    public final RealImageLoader imageLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountUiView(Context context, RealImageLoader realImageLoader, zzc zzcVar) {
        super(context);
        context.getClass();
        this.imageLoader = realImageLoader;
        this.elementBoundsRegistry = zzcVar;
    }

    public void Content(AccountViewModel accountViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-433259810);
        int i2 = (gapComposer.changedInstance(accountViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (accountViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda1(7, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue, gapComposer, 0);
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(756481566, new AccountUiView$$ExternalSyntheticLambda1(accountViewModel, function1, this, 0), gapComposer), gapComposer, 56);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AccountUiView$$ExternalSyntheticLambda1(this, accountViewModel, function1, i);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView, com.squareup.cash.ui.DialogResultListener
    public void onDialogCanceled(Screen screen) {
        switch (this.$r8$classId) {
            case 2:
                screen.getClass();
                if (screen instanceof ConfirmRemoveLinkedBusinessDialogScreen) {
                    Function1 function1 = (Function1) this.elementBoundsRegistry;
                    if (function1 != null) {
                        function1.invoke(new BusinessGrantDeleteCancelled(((ConfirmRemoveLinkedBusinessDialogScreen) screen).businessGrantId));
                        return;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("onEvent");
                        throw null;
                    }
                }
                return;
            default:
                super.onDialogCanceled(screen);
                return;
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView, com.squareup.cash.ui.DialogResultListener
    public void onDialogResult(Screen screen, Object obj) {
        switch (this.$r8$classId) {
            case 2:
                screen.getClass();
                if (screen instanceof ConfirmRemoveLinkedBusinessDialogScreen) {
                    if (Intrinsics.areEqual(obj, RemoveLinkedBusinessResult$Positive.INSTANCE)) {
                        Function1 function1 = (Function1) this.elementBoundsRegistry;
                        if (function1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("onEvent");
                            throw null;
                        }
                        ConfirmRemoveLinkedBusinessDialogScreen confirmRemoveLinkedBusinessDialogScreen = (ConfirmRemoveLinkedBusinessDialogScreen) screen;
                        function1.invoke(new BusinessGrantDeleted(confirmRemoveLinkedBusinessDialogScreen.actionType, confirmRemoveLinkedBusinessDialogScreen.businessGrantId));
                        return;
                    }
                    if (Intrinsics.areEqual(obj, RemoveLinkedBusinessResult$Negative.INSTANCE)) {
                        Function1 function12 = (Function1) this.elementBoundsRegistry;
                        if (function12 != null) {
                            function12.invoke(new BusinessGrantDeleteCancelled(((ConfirmRemoveLinkedBusinessDialogScreen) screen).businessGrantId));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("onEvent");
                            throw null;
                        }
                    }
                    return;
                }
                return;
            default:
                super.onDialogResult(screen, obj);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountUiView(Context context, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        this.imageLoader = realImageLoader;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountUiView(Context context, RealImageLoader realImageLoader, ElementBoundsRegistry elementBoundsRegistry) {
        super(context);
        context.getClass();
        this.imageLoader = realImageLoader;
        this.elementBoundsRegistry = elementBoundsRegistry;
    }

    public void Content(final CashAppPaySettingsViewModel cashAppPaySettingsViewModel, final Function1 function1, Composer composer, final int i) {
        AccountUiView accountUiView;
        CashAppPaySettingsViewModel cashAppPaySettingsViewModel2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(250834798);
        int i3 = (gapComposer.changedInstance(cashAppPaySettingsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            accountUiView = this;
            cashAppPaySettingsViewModel2 = cashAppPaySettingsViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (cashAppPaySettingsViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, cashAppPaySettingsViewModel, function1, i, i4) { // from class: com.squareup.cash.cashapppay.settings.views.CashAppPaySettingsView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ AccountUiView f$0;
                        public final /* synthetic */ CashAppPaySettingsViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            CashAppPaySettingsViewModel cashAppPaySettingsViewModel3 = this.f$1;
                            AccountUiView accountUiView2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    accountUiView2.Content(cashAppPaySettingsViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    accountUiView2.Content(cashAppPaySettingsViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            accountUiView = this;
            cashAppPaySettingsViewModel2 = cashAppPaySettingsViewModel;
            function12 = function1;
            i2 = i;
            accountUiView.elementBoundsRegistry = function12;
            UnlinkResultViewKt.CashAppPaySettings(cashAppPaySettingsViewModel2, function12, accountUiView.imageLoader, gapComposer, i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = i2;
            final Function1 function13 = function12;
            final CashAppPaySettingsViewModel cashAppPaySettingsViewModel3 = cashAppPaySettingsViewModel2;
            final AccountUiView accountUiView2 = accountUiView;
            final int i6 = 1;
            endRestartGroup2.block = new Function2(accountUiView2, cashAppPaySettingsViewModel3, function13, i5, i6) { // from class: com.squareup.cash.cashapppay.settings.views.CashAppPaySettingsView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ AccountUiView f$0;
                public final /* synthetic */ CashAppPaySettingsViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i6;
                    this.f$0 = accountUiView2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function132 = this.f$2;
                    CashAppPaySettingsViewModel cashAppPaySettingsViewModel32 = this.f$1;
                    AccountUiView accountUiView22 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            accountUiView22.Content(cashAppPaySettingsViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            accountUiView22.Content(cashAppPaySettingsViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        switch (this.$r8$classId) {
            case 0:
                Content((AccountViewModel) obj, function1, gapComposer, 0);
                break;
            case 1:
                Content((BitcoinHomeViewModel) obj, function1, gapComposer, 0);
                break;
            default:
                Content((CashAppPaySettingsViewModel) obj, function1, gapComposer, 0);
                break;
        }
    }

    public void Content(BitcoinHomeViewModel bitcoinHomeViewModel, Function1 function1, Composer composer, int i) {
        AccountUiView accountUiView;
        BitcoinHomeViewModel bitcoinHomeViewModel2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2006051177);
        int i3 = (gapComposer.changedInstance(bitcoinHomeViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            accountUiView = this;
            bitcoinHomeViewModel2 = bitcoinHomeViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (bitcoinHomeViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new BitcoinHomeView$$ExternalSyntheticLambda0(this, bitcoinHomeViewModel, function1, i, 0);
                    return;
                }
                return;
            }
            accountUiView = this;
            bitcoinHomeViewModel2 = bitcoinHomeViewModel;
            function12 = function1;
            i2 = i;
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(accountUiView.imageLoader), Expect_jvmKt.rememberComposableLambda(-1992237911, new BitcoinHomeView$$ExternalSyntheticLambda0(bitcoinHomeViewModel2, function12, accountUiView), gapComposer), gapComposer, 56);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            int i4 = i2;
            endRestartGroup2.block = new BitcoinHomeView$$ExternalSyntheticLambda0(accountUiView, bitcoinHomeViewModel2, function12, i4, 2);
        }
    }
}
