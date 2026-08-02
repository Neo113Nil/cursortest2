package com.squareup.cash.borrow.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalContext;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda18;
import app.cash.molecule.PlatformKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.LazyScaffoldContentScope;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.input.InputChipGridScope;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda8;
import com.squareup.cash.bitcoin.viewmodels.BitcoinDepositsViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapErrorViewModel;
import com.squareup.cash.bitcoin.viewmodels.paidinbitcoin.PaidInBitcoinCardUpsellViewModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositCopyViewModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositOptionsViewModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinOnboardingViewModel;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.bitcoin.views.deposits.copy.BitcoinAddressCopySheetViewKt;
import com.squareup.cash.bitcoin.views.keypad.BitcoinKeypadAmountPickerModel;
import com.squareup.cash.bitcoin.views.map.BitcoinLocationViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.bitcoin.views.map.BitcoinMapErrorDialogViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.bitcoin.views.stablecoin.SendStablecoinViewKt;
import com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.ConfirmableOptionViewModel;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.FilesetUploadErrorViewModel;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewModel;
import com.squareup.cash.blockers.viewmodels.InviteFriendsViewModel;
import com.squareup.cash.blockers.viewmodels.OnboardingInternalRouteViewModel;
import com.squareup.cash.blockers.viewmodels.SavingsTransferOptionSelectionViewModel;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel;
import com.squareup.cash.blockers.viewmodels.StatusResultViewModel;
import com.squareup.cash.blockers.views.AmountBlockerViewKt;
import com.squareup.cash.blockers.views.ArcadeFilesetUploadErrorDialogViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.blockers.views.AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.blockers.views.ConfirmableOptionView;
import com.squareup.cash.blockers.views.EarnerEnrollmentBlockerViewKt;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.blockers.views.SsnViewKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.blockers.views.components.VerifyAliasViewKt;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerFooterModel;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerViewEvent;
import com.squareup.cash.borrow.viewmodels.BorrowAmountPickerViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewModel;
import com.squareup.cash.common.composeui.InfoUpsellCtaButtonScope;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.merchant.views.MerchantInfoFeedbackViewKt$$ExternalSyntheticLambda5;
import com.squareup.protos.franklin.common.StatusResultButton;
import com.squareup.scannerview.FlashState;
import com.squareup.scannerview.ScannerView;
import com.squareup.scannerview.ScannerView$$ExternalSyntheticLambda3;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final /* synthetic */ class BorrowHomeKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BorrowHomeKt$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    private final Object invoke$com$squareup$cash$blockers$views$EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        EarnerEnrollmentBlockerViewModel earnerEnrollmentBlockerViewModel = (EarnerEnrollmentBlockerViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        paddingValues.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            EarnerEnrollmentBlockerViewKt.EarnerEnrollmentBlockerContent(earnerEnrollmentBlockerViewModel, function1, true, paddingValues, gapComposer, ((intValue << 9) & 7168) | MLKEMEngine.KyberPolyBytes, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$blockers$views$EarnerEnrollmentCategorySelectionViewKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3) {
        EarnerEnrollmentBlockerViewModel.CategorySelection categorySelection = (EarnerEnrollmentBlockerViewModel.CategorySelection) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 32.0f));
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            SsnViewKt.EarnerEnrollmentCategoryTitle(categorySelection, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer, 0);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 32.0f));
            gapComposer.startReplaceGroup(1148929469);
            for (EarnerEnrollmentBlockerViewModel.CategorySelection.Category category : categorySelection.categories) {
                boolean z = category.category == categorySelection.selectedCategory;
                boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(category);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BulletinTileKt$$ExternalSyntheticLambda12(13, function1, category);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                SsnViewKt.EarnerCategorySelectionRow(category, z, (Function0) rememberedValue, gapComposer, 0);
            }
            gapComposer.end(false);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 32.0f, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$blockers$views$EarnerEnrollmentCategorySelectionViewKt$$ExternalSyntheticLambda8(Object obj, Object obj2, Object obj3) {
        EarnerEnrollmentBlockerViewModel.CategorySelection categorySelection = (EarnerEnrollmentBlockerViewModel.CategorySelection) this.f$0;
        LazyScaffoldContentScope lazyScaffoldContentScope = (LazyScaffoldContentScope) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 32.0f));
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            SsnViewKt.EarnerEnrollmentCategoryTitle(categorySelection, ScreenScaffoldKt.markAsScaffoldTitle(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), lazyScaffoldContentScope, gapComposer, 0), gapComposer, 0);
            Request$Priority$EnumUnboxingLocalUtility.m((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal), companion, 32.0f, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$blockers$views$OnboardingInternalRouteViewKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$1;
        OnboardingInternalRouteViewModel onboardingInternalRouteViewModel = (OnboardingInternalRouteViewModel) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashtagViewKt$$ExternalSyntheticLambda6(27, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1605575621, new SsnViewKt$$ExternalSyntheticLambda2(onboardingInternalRouteViewModel, 20), gapComposer), gapComposer, 1572912, 60);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$blockers$views$SavingsTransferOptionSelectionScreenKt$$ExternalSyntheticLambda7(Object obj, Object obj2, Object obj3) {
        SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel = (SavingsTransferOptionSelectionViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        paddingValues.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
        }
        int i = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Strings.m3984LoadableSheetContentosbwsH8(savingsTransferOptionSelectionViewModel, savingsTransferOptionSelectionViewModel instanceof SavingsTransferOptionSelectionViewModel.Loading, 168.0f, null, null, Expect_jvmKt.rememberComposableLambda(1036202647, new MerchantInfoFeedbackViewKt$$ExternalSyntheticLambda5(paddingValues, function1, i), gapComposer), gapComposer, 196992, 24);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$blockers$views$SetNameViewKt$$ExternalSyntheticLambda8(Object obj, Object obj2, Object obj3) {
        SetNameViewModel setNameViewModel = (SetNameViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            String str = setNameViewModel.footer;
            if (str == null) {
                gapComposer.startReplaceGroup(-1322759095);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1322759094);
                boolean changed = gapComposer.changed(function1);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new SsnViewKt$$ExternalSyntheticLambda12(4, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, null, null, 0L, null, null, new TextLineBalancing(1), 0, 0, 3, gapComposer, 0, 892);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$blockers$views$StatusResultViewKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        StatusResultViewModel statusResultViewModel = (StatusResultViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            StatusResultButton statusResultButton = ((StatusResultViewModel.Ready) statusResultViewModel).secondaryButton;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (statusResultButton == null) {
                gapComposer.startReplaceGroup(-1070751015);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1070751014);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(statusResultButton);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new BulletinTileKt$$ExternalSyntheticLambda12(23, function1, statusResultButton);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-663402865, new SsnViewKt$$ExternalSyntheticLambda2(statusResultButton, 25), gapComposer), gapComposer, 1572912, 60);
                gapComposer.end(false);
            }
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean changed2 = gapComposer.changed(function1) | gapComposer.changedInstance(statusResultViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            int i = 24;
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BulletinTileKt$$ExternalSyntheticLambda12(i, function1, statusResultViewModel);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth2, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-951228921, new SsnViewKt$$ExternalSyntheticLambda2(statusResultViewModel, i), gapComposer), gapComposer, 1573296, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$blockers$views$components$InviteFriendsViewKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        InviteFriendsViewModel inviteFriendsViewModel = (InviteFriendsViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            int ordinal = inviteFriendsViewModel.buttonOrder.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(1573406554);
                VerifyAliasViewKt.SingleButton(inviteFriendsViewModel, function1, gapComposer, 0);
                gapComposer.end(false);
            } else if (ordinal == 1) {
                gapComposer.startReplaceGroup(1573195444);
                VerifyAliasViewKt.PrimaryButtonFirst(inviteFriendsViewModel, function1, gapComposer, 0);
                gapComposer.end(false);
            } else {
                if (ordinal != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 2128956176, false);
                }
                gapComposer.startReplaceGroup(1573304626);
                VerifyAliasViewKt.SecondaryButtonFirst(inviteFriendsViewModel, function1, gapComposer, 0);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$blockers$web$views$WebViewBlockerViewKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        NeverEqualPolicy neverEqualPolicy;
        final WebViewBlockerFooterModel webViewBlockerFooterModel = (WebViewBlockerFooterModel) this.f$0;
        final Function1 function1 = (Function1) this.f$1;
        AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        adaptiveStackScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(adaptiveStackScope) ? 4 : 2;
        }
        final int i = 1;
        final int i2 = 0;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            String str = webViewBlockerFooterModel.secondaryActionText;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (str == null) {
                gapComposer.startReplaceGroup(-92223941);
                gapComposer.end(false);
                neverEqualPolicy = neverEqualPolicy2;
            } else {
                gapComposer.startReplaceGroup(-92223940);
                Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(webViewBlockerFooterModel);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy2) {
                    rememberedValue = new Function0() { // from class: com.squareup.cash.blockers.web.views.WebViewBlockerViewKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i3 = i2;
                            WebViewBlockerFooterModel webViewBlockerFooterModel2 = webViewBlockerFooterModel;
                            Function1 function12 = function1;
                            switch (i3) {
                                case 0:
                                    function12.invoke(new WebViewBlockerViewEvent.FooterButtonClick(webViewBlockerFooterModel2.secondaryActionId, webViewBlockerFooterModel2.isSecondaryEndFlowAction));
                                    break;
                                default:
                                    function12.invoke(new WebViewBlockerViewEvent.FooterButtonClick(webViewBlockerFooterModel2.primaryActionId, webViewBlockerFooterModel2.isPrimaryEndFlowAction));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1805007613, new SetPinViewKt$$ExternalSyntheticLambda7(str, 14), gapComposer);
                neverEqualPolicy = neverEqualPolicy2;
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, horizontalWeight, null, false, false, null, rememberComposableLambda, gapComposer, 1572864, 60);
                gapComposer.end(false);
            }
            String str2 = webViewBlockerFooterModel.primaryActionText;
            if (str2 == null) {
                gapComposer.startReplaceGroup(-91761607);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-91761606);
                ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                Modifier horizontalWeight2 = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                boolean changed2 = gapComposer.changed(function1) | gapComposer.changedInstance(webViewBlockerFooterModel);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new Function0() { // from class: com.squareup.cash.blockers.web.views.WebViewBlockerViewKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i3 = i;
                            WebViewBlockerFooterModel webViewBlockerFooterModel2 = webViewBlockerFooterModel;
                            Function1 function12 = function1;
                            switch (i3) {
                                case 0:
                                    function12.invoke(new WebViewBlockerViewEvent.FooterButtonClick(webViewBlockerFooterModel2.secondaryActionId, webViewBlockerFooterModel2.isSecondaryEndFlowAction));
                                    break;
                                default:
                                    function12.invoke(new WebViewBlockerViewEvent.FooterButtonClick(webViewBlockerFooterModel2.primaryActionId, webViewBlockerFooterModel2.isPrimaryEndFlowAction));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, horizontalWeight2, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1729913626, new SetPinViewKt$$ExternalSyntheticLambda7(str2, 13), gapComposer), gapComposer, 1573248, 56);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$borrow$views$BorrowHomeKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        LazyScaffoldContentScope lazyScaffoldContentScope = (LazyScaffoldContentScope) this.f$1;
        BorrowHomeViewModel borrowHomeViewModel = (BorrowHomeViewModel) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Modifier markAsScaffoldTitle = ScreenScaffoldKt.markAsScaffoldTitle(Modifier.Companion.$$INSTANCE, lazyScaffoldContentScope, gapComposer, 6);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            ViewfinderDefaults.SectionHeader(borrowHomeViewModel.title, SpacerKt.m302paddingqDBjuR0$default(markAsScaffoldTitle, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), (String) null, (Function0) null, (String) null, gapComposer, 0, 28);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier clearAndSetSemantics;
        char c;
        int i = this.$r8$classId;
        int i2 = 28;
        int i3 = 14;
        float f = 1.0f;
        Modifier modifier = Modifier.Companion.$$INSTANCE;
        char c2 = 18;
        Object obj4 = Composer.Companion.Empty;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        boolean z = true;
        switch (i) {
            case 0:
                BorrowHomeViewModel borrowHomeViewModel = (BorrowHomeViewModel) obj6;
                Function1 function1 = (Function1) obj5;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    String str = borrowHomeViewModel.title;
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == obj4) {
                        rememberedValue = new BorrowHomeKt$$ExternalSyntheticLambda3(0, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 48, 108);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                BitcoinDepositsViewModel bitcoinDepositsViewModel = (BitcoinDepositsViewModel) obj6;
                Function1 function12 = (Function1) obj5;
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (!gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    gapComposer2.skipToGroupEnd();
                } else if (bitcoinDepositsViewModel instanceof BitcoinDepositsViewModel.Loaded) {
                    gapComposer2.startReplaceGroup(-1270607834);
                    Icons icons = Icons.NavigationCopy;
                    String stringResource = Room.stringResource(gapComposer2, R.string.bitcoin_qr_code_action);
                    boolean changed2 = gapComposer2.changed(function12);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == obj4) {
                        rememberedValue2 = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(0, function12);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    TransactorKt.IconAction(titleBarActionScope, icons, stringResource, (Function0) rememberedValue2, null, null, null, null, null, null, false, gapComposer2, (intValue2 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-1270388726);
                    gapComposer2.end(false);
                }
                return Unit.INSTANCE;
            case 2:
                BitcoinDepositsViewModel.Loaded loaded = (BitcoinDepositsViewModel.Loaded) obj6;
                Function1 function13 = (Function1) obj5;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (loaded.showAdjustButton) {
                        gapComposer3.startReplaceGroup(442103933);
                        boolean changed3 = gapComposer3.changed(function13);
                        Object rememberedValue3 = gapComposer3.rememberedValue();
                        if (changed3 || rememberedValue3 == obj4) {
                            rememberedValue3 = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(28, function13);
                            gapComposer3.updateRememberedValue(rememberedValue3);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, SizeKt.fillMaxWidth(modifier, 1.0f), null, false, false, null, Expect_jvmKt.rememberComposableLambda(-620218751, new BankingDialogKt$$ExternalSyntheticLambda8(loaded, i2), gapComposer3), gapComposer3, 1572912, 60);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(442323041);
                        gapComposer3.end(false);
                    }
                    if (loaded.showShareButton) {
                        gapComposer3.startReplaceGroup(442366751);
                        boolean changed4 = gapComposer3.changed(function13);
                        Object rememberedValue4 = gapComposer3.rememberedValue();
                        if (changed4 || rememberedValue4 == obj4) {
                            rememberedValue4 = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(29, function13);
                            gapComposer3.updateRememberedValue(rememberedValue4);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue4, SizeKt.fillMaxWidth(modifier, 1.0f), null, false, false, null, BitcoinDepositsViewKt.f259lambda$473990806, gapComposer3, 1572912, 60);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(442614689);
                        gapComposer3.end(false);
                    }
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                BitcoinKeypadAmountPickerModel bitcoinKeypadAmountPickerModel = (BitcoinKeypadAmountPickerModel) obj6;
                Function1 function14 = (Function1) obj5;
                TitleBarActionScope titleBarActionScope2 = (TitleBarActionScope) obj;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                titleBarActionScope2.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer4).changed(titleBarActionScope2) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (!gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    gapComposer4.skipToGroupEnd();
                } else if (bitcoinKeypadAmountPickerModel.showQrCodeScanner) {
                    gapComposer4.startReplaceGroup(-1584250895);
                    Icons icons2 = Icons.NavigationScanQr;
                    String stringResource2 = Room.stringResource(gapComposer4, R.string.bitcoin_toolbar_scanner_title);
                    boolean changed5 = gapComposer4.changed(function14);
                    Object rememberedValue5 = gapComposer4.rememberedValue();
                    if (changed5 || rememberedValue5 == obj4) {
                        rememberedValue5 = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(21, function14);
                        gapComposer4.updateRememberedValue(rememberedValue5);
                    }
                    TransactorKt.IconAction(titleBarActionScope2, icons2, stringResource2, (Function0) rememberedValue5, null, null, null, null, null, null, false, gapComposer4, (intValue4 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                    gapComposer4.end(false);
                } else {
                    gapComposer4.startReplaceGroup(-1584044280);
                    gapComposer4.end(false);
                }
                return Unit.INSTANCE;
            case 4:
                Function1 function15 = (Function1) obj5;
                BitcoinMapErrorViewModel bitcoinMapErrorViewModel = (BitcoinMapErrorViewModel) obj6;
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    boolean changed6 = gapComposer5.changed(function15);
                    Object rememberedValue6 = gapComposer5.rememberedValue();
                    if (changed6 || rememberedValue6 == obj4) {
                        rememberedValue6 = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(29, function15);
                        gapComposer5.updateRememberedValue(rememberedValue6);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue6, null, false, Expect_jvmKt.rememberComposableLambda(6817223, new BitcoinMapErrorDialogViewKt$$ExternalSyntheticLambda2(bitcoinMapErrorViewModel, r15), gapComposer5), gapComposer5, ((intValue5 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                PaidInBitcoinCardUpsellViewModel paidInBitcoinCardUpsellViewModel = (PaidInBitcoinCardUpsellViewModel) obj6;
                Function1 function16 = (Function1) obj5;
                InfoUpsellCtaButtonScope infoUpsellCtaButtonScope = (InfoUpsellCtaButtonScope) obj;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                infoUpsellCtaButtonScope.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer6).changed(infoUpsellCtaButtonScope) ? 4 : 2;
                }
                boolean z2 = false;
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    String str2 = paidInBitcoinCardUpsellViewModel.buttonText;
                    boolean changed7 = gapComposer6.changed(function16);
                    Object rememberedValue7 = gapComposer6.rememberedValue();
                    if (changed7 || rememberedValue7 == obj4) {
                        rememberedValue7 = new BitcoinMapViewKt$$ExternalSyntheticLambda6(11, function16);
                        gapComposer6.updateRememberedValue(rememberedValue7);
                    }
                    Function0 function0 = (Function0) rememberedValue7;
                    str2.getClass();
                    function0.getClass();
                    infoUpsellCtaButtonScope.prominentButton.setValue(new ComposableLambdaImpl(new LocalHomeViewKt$$ExternalSyntheticLambda0(z2, infoUpsellCtaButtonScope, function0, str2, 16), true, 1226384573));
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                StablecoinDepositCopyViewModel stablecoinDepositCopyViewModel = (StablecoinDepositCopyViewModel) obj6;
                Function1 function17 = (Function1) obj5;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer7).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    Modifier padding = SpacerKt.padding(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(modifier, 1.0f), Strings.getColors(gapComposer7).semantic.background.f1047app, ColorKt.RectangleShape), paddingValues);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer7, 0);
                    int hashCode = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer7, padding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer7.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Transformations.SheetHeader(Room.stringResource(gapComposer7, R.string.stablecoin_deposit_copy_title), (Modifier) null, (Function2) null, Room.stringResource(gapComposer7, R.string.stablecoin_deposit_copy_description), gapComposer7, 0, 6);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer7, null);
                    ComposableLambdaImpl composableLambdaImpl = SendStablecoinViewKt.lambda$353661859;
                    String stringResource3 = Room.stringResource(gapComposer7, R.string.stablecoin_deposit_copy_usdc_label);
                    String str3 = stablecoinDepositCopyViewModel.truncatedAddress;
                    boolean changed8 = gapComposer7.changed(function17);
                    Object rememberedValue8 = gapComposer7.rememberedValue();
                    if (changed8 || rememberedValue8 == obj4) {
                        rememberedValue8 = new BitcoinMapViewKt$$ExternalSyntheticLambda6(19, function17);
                        gapComposer7.updateRememberedValue(rememberedValue8);
                    }
                    BitcoinAddressCopySheetViewKt.DepositCopyOption(composableLambdaImpl, stringResource3, str3, (Function0) rememberedValue8, null, gapComposer7, 6);
                    String stringResource4 = Room.stringResource(gapComposer7, R.string.stablecoin_deposit_copy_disclaimer);
                    TextStyle textStyle = Strings.getTypography(gapComposer7).bodyXSmall;
                    long j = Strings.getColors(gapComposer7).semantic.text.subtle;
                    Strings.getSizes(gapComposer7).getClass();
                    DefaultSizes.spacing.getClass();
                    Strings.getSizes(gapComposer7).getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, j, (Composer) gapComposer7, SpacerKt.m299paddingVpY3zN4(modifier, 16.0f, 16.0f), textStyle, (TextLineBalancing) null, stringResource4, (Map) null, (Function1) null, false);
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                StablecoinDepositOptionsViewModel stablecoinDepositOptionsViewModel = (StablecoinDepositOptionsViewModel) obj6;
                Function1 function18 = (Function1) obj5;
                PaddingValues paddingValues2 = (PaddingValues) obj;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                paddingValues2.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer8).changed(paddingValues2) ? 4 : 2;
                }
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                    SendStablecoinViewKt.StablecoinDepositOptionsContent(SpacerKt.padding(modifier, paddingValues2), stablecoinDepositOptionsViewModel, function18, gapComposer8, 0, 0);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Function1 function19 = (Function1) obj5;
                StablecoinOnboardingViewModel stablecoinOnboardingViewModel = (StablecoinOnboardingViewModel) obj6;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean changed9 = gapComposer9.changed(function19);
                    Object rememberedValue9 = gapComposer9.rememberedValue();
                    if (changed9 || rememberedValue9 == obj4) {
                        rememberedValue9 = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(3, function19);
                        gapComposer9.updateRememberedValue(rememberedValue9);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue9, null, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(188337711, new SsnViewKt$$ExternalSyntheticLambda2(stablecoinOnboardingViewModel, 7), gapComposer9), gapComposer9, 1573248, 58);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                BitcoinTransferViewModel.Content.FullScreenContent fullScreenContent = (BitcoinTransferViewModel.Content.FullScreenContent) obj6;
                Function1 function110 = (Function1) obj5;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    ((DefaultSizes) gapComposer10.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(modifier, RecyclerView.DECELERATION_RATE, 16.0f, 1), 1.0f);
                    boolean z3 = !fullScreenContent.hasInvalidAmount;
                    boolean changed10 = gapComposer10.changed(function110);
                    Object rememberedValue10 = gapComposer10.rememberedValue();
                    if (changed10 || rememberedValue10 == obj4) {
                        rememberedValue10 = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(4, function110);
                        gapComposer10.updateRememberedValue(rememberedValue10);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue10, fillMaxWidth, buttonProminence2, false, z3, null, Expect_jvmKt.rememberComposableLambda(-1254082082, new SsnViewKt$$ExternalSyntheticLambda2(fullScreenContent, 8), gapComposer10), gapComposer10, 1573248, 40);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Function1 function111 = (Function1) obj5;
                FilesetUploadErrorViewModel filesetUploadErrorViewModel = (FilesetUploadErrorViewModel) obj6;
                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                modalButtonScope2.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((GapComposer) composer11).changed(modalButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 19) != 18)) {
                    boolean changed11 = gapComposer11.changed(function111);
                    Object rememberedValue11 = gapComposer11.rememberedValue();
                    if (changed11 || rememberedValue11 == obj4) {
                        rememberedValue11 = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(23, function111);
                        gapComposer11.updateRememberedValue(rememberedValue11);
                    }
                    modalButtonScope2.SecondaryModalButton((Function0) rememberedValue11, null, false, Expect_jvmKt.rememberComposableLambda(-2067175025, new ArcadeFilesetUploadErrorDialogViewKt$$ExternalSyntheticLambda4(filesetUploadErrorViewModel, r15), gapComposer11), gapComposer11, ((intValue11 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                FilesetUploadViewModel filesetUploadViewModel = (FilesetUploadViewModel) obj6;
                Function0 function02 = (Function0) obj5;
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                lazyItemScopeImpl.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer12).changed(lazyItemScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 19) != 18)) {
                    Countries.PageHeader(filesetUploadViewModel.title, LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, SizeKt.fillMaxWidth(modifier, 1.0f)), (Function2) null, filesetUploadViewModel.subtitle, gapComposer12, 0, 4);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer12, null);
                    CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(AmountBlockerViewKt.f305lambda$733370204, Expect_jvmKt.rememberComposableLambda(1814579301, new CashtagViewKt$$ExternalSyntheticLambda10(filesetUploadViewModel, 21), gapComposer12), LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, modifier), function02, filesetUploadViewModel.attachButtonEnabled, false, null, null, CellDefaultAccessory.Push.INSTANCE, 0L, gapComposer12, 805306422, 3536);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Function1 function112 = (Function1) obj5;
                final FilesetUploadViewModel.FileViewModel fileViewModel = (FilesetUploadViewModel.FileViewModel) obj6;
                LazyItemScopeImpl lazyItemScopeImpl2 = (LazyItemScopeImpl) obj;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                lazyItemScopeImpl2.getClass();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((GapComposer) composer13).changed(lazyItemScopeImpl2) ? 4 : 2;
                }
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 19) != 18)) {
                    Modifier animateItem$default = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl2, modifier);
                    CellDefaultAccessory.ButtonCompact buttonCompact = new CellDefaultAccessory.ButtonCompact(null, null, true, AmountBlockerViewKt.f309lambda$993692317, 11);
                    final int i4 = r13 ? 1 : 0;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1957067088, new Function2() { // from class: com.squareup.cash.blockers.views.ArcadeFilesetUploadViewKt$$ExternalSyntheticLambda23
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            int i5 = i4;
                            FilesetUploadViewModel.FileViewModel fileViewModel2 = fileViewModel;
                            switch (i5) {
                                case 0:
                                    Composer composer14 = (Composer) obj7;
                                    int intValue14 = ((Integer) obj8).intValue();
                                    GapComposer gapComposer14 = (GapComposer) composer14;
                                    if (gapComposer14.shouldExecute(1 & intValue14, (intValue14 & 3) != 2)) {
                                        AmountBlockerViewKt.Thumbnail(fileViewModel2.thumbnailUri, gapComposer14, 0);
                                    } else {
                                        gapComposer14.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Composer composer15 = (Composer) obj7;
                                    int intValue15 = ((Integer) obj8).intValue();
                                    GapComposer gapComposer15 = (GapComposer) composer15;
                                    if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, fileViewModel2.name, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer15.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer16 = (Composer) obj7;
                                    int intValue16 = ((Integer) obj8).intValue();
                                    GapComposer gapComposer16 = (GapComposer) composer16;
                                    if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, fileViewModel2.subtitle, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer16.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer13);
                    final int i5 = z ? 1 : 0;
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1520004847, new Function2() { // from class: com.squareup.cash.blockers.views.ArcadeFilesetUploadViewKt$$ExternalSyntheticLambda23
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            int i52 = i5;
                            FilesetUploadViewModel.FileViewModel fileViewModel2 = fileViewModel;
                            switch (i52) {
                                case 0:
                                    Composer composer14 = (Composer) obj7;
                                    int intValue14 = ((Integer) obj8).intValue();
                                    GapComposer gapComposer14 = (GapComposer) composer14;
                                    if (gapComposer14.shouldExecute(1 & intValue14, (intValue14 & 3) != 2)) {
                                        AmountBlockerViewKt.Thumbnail(fileViewModel2.thumbnailUri, gapComposer14, 0);
                                    } else {
                                        gapComposer14.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Composer composer15 = (Composer) obj7;
                                    int intValue15 = ((Integer) obj8).intValue();
                                    GapComposer gapComposer15 = (GapComposer) composer15;
                                    if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, fileViewModel2.name, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer15.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer16 = (Composer) obj7;
                                    int intValue16 = ((Integer) obj8).intValue();
                                    GapComposer gapComposer16 = (GapComposer) composer16;
                                    if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, fileViewModel2.subtitle, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer16.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer13);
                    boolean changed12 = gapComposer13.changed(function112) | gapComposer13.changedInstance(fileViewModel);
                    Object rememberedValue12 = gapComposer13.rememberedValue();
                    if (changed12 || rememberedValue12 == obj4) {
                        rememberedValue12 = new BulletinTileKt$$ExternalSyntheticLambda12(9, function112, fileViewModel);
                        gapComposer13.updateRememberedValue(rememberedValue12);
                    }
                    CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, animateItem$default, (Function0) rememberedValue12, false, false, Expect_jvmKt.rememberComposableLambda(-907599977, new Function2() { // from class: com.squareup.cash.blockers.views.ArcadeFilesetUploadViewKt$$ExternalSyntheticLambda23
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            int i52 = r2;
                            FilesetUploadViewModel.FileViewModel fileViewModel2 = fileViewModel;
                            switch (i52) {
                                case 0:
                                    Composer composer14 = (Composer) obj7;
                                    int intValue14 = ((Integer) obj8).intValue();
                                    GapComposer gapComposer14 = (GapComposer) composer14;
                                    if (gapComposer14.shouldExecute(1 & intValue14, (intValue14 & 3) != 2)) {
                                        AmountBlockerViewKt.Thumbnail(fileViewModel2.thumbnailUri, gapComposer14, 0);
                                    } else {
                                        gapComposer14.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Composer composer15 = (Composer) obj7;
                                    int intValue15 = ((Integer) obj8).intValue();
                                    GapComposer gapComposer15 = (GapComposer) composer15;
                                    if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, fileViewModel2.name, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer15.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer16 = (Composer) obj7;
                                    int intValue16 = ((Integer) obj8).intValue();
                                    GapComposer gapComposer16 = (GapComposer) composer16;
                                    if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, fileViewModel2.subtitle, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer16.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer13), null, buttonCompact, 0L, gapComposer13, 12582966, 3440);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                FilesetUploadViewModel filesetUploadViewModel2 = (FilesetUploadViewModel) obj6;
                Function1 function113 = (Function1) obj5;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    String str4 = filesetUploadViewModel2.secondaryButton;
                    if (str4 == null) {
                        gapComposer14.startReplaceGroup(-1717001974);
                        gapComposer14.end(false);
                    } else {
                        gapComposer14.startReplaceGroup(-1717001973);
                        boolean changed13 = gapComposer14.changed(function113);
                        Object rememberedValue13 = gapComposer14.rememberedValue();
                        if (changed13 || rememberedValue13 == obj4) {
                            rememberedValue13 = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(27, function113);
                            gapComposer14.updateRememberedValue(rememberedValue13);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue13, SizeKt.fillMaxWidth(modifier, 1.0f), null, false, false, null, Expect_jvmKt.rememberComposableLambda(1974889572, new SetPinViewKt$$ExternalSyntheticLambda7(str4, 4), gapComposer14), gapComposer14, 1572912, 60);
                        gapComposer14.end(false);
                    }
                    String str5 = filesetUploadViewModel2.primaryButton;
                    if (str5 == null) {
                        gapComposer14.startReplaceGroup(-1716761166);
                        gapComposer14.end(false);
                    } else {
                        gapComposer14.startReplaceGroup(-1716761165);
                        ButtonProminence buttonProminence3 = ButtonProminence.PROMINENT;
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(modifier, 1.0f);
                        boolean z4 = filesetUploadViewModel2.primaryButtonEnabled;
                        boolean changed14 = gapComposer14.changed(function113);
                        Object rememberedValue14 = gapComposer14.rememberedValue();
                        if (changed14 || rememberedValue14 == obj4) {
                            rememberedValue14 = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(28, function113);
                            gapComposer14.updateRememberedValue(rememberedValue14);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue14, fillMaxWidth2, buttonProminence3, false, z4, null, Expect_jvmKt.rememberComposableLambda(164770395, new SetPinViewKt$$ExternalSyntheticLambda7(str5, 5), gapComposer14), gapComposer14, 1573296, 40);
                        gapComposer14.end(false);
                    }
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                AtmPickerAmountBlockerViewModel atmPickerAmountBlockerViewModel = (AtmPickerAmountBlockerViewModel) obj6;
                Function1 function114 = (Function1) obj5;
                PaddingValues paddingValues3 = (PaddingValues) obj;
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                paddingValues3.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((GapComposer) composer15).changed(paddingValues3) ? 4 : 2;
                }
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 19) != 18)) {
                    AmountBlockerViewKt.Content(atmPickerAmountBlockerViewModel, function114, SpacerKt.padding(modifier, paddingValues3), gapComposer15, 0);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                AtmPickerAmountBlockerViewModel.AtmPicker atmPicker = (AtmPickerAmountBlockerViewModel.AtmPicker) obj6;
                Function1 function115 = (Function1) obj5;
                InputChipGridScope inputChipGridScope = (InputChipGridScope) obj;
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                inputChipGridScope.getClass();
                if ((intValue16 & 6) == 0) {
                    intValue16 |= ((GapComposer) composer16).changed(inputChipGridScope) ? 4 : 2;
                }
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 19) != 18)) {
                    String stringResource5 = Room.stringResource(gapComposer16, R.string.atm_picker_keypad_option);
                    ArrayList arrayList = atmPicker.options;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    int i6 = 0;
                    for (Object obj7 : arrayList) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        char c3 = c2;
                        AtmPickerAmountBlockerViewModel.AtmPicker.Option option = (AtmPickerAmountBlockerViewModel.AtmPicker.Option) obj7;
                        Modifier weight = inputChipGridScope.weight(f, modifier, z);
                        boolean z5 = z;
                        if (option instanceof AtmPickerAmountBlockerViewModel.AtmPicker.PresetAmountOption) {
                            gapComposer16.startReplaceGroup(-1172533944);
                            gapComposer16.end(false);
                            clearAndSetSemantics = modifier;
                        } else {
                            if (!Intrinsics.areEqual(option, AtmPickerAmountBlockerViewModel.AtmPicker.KeypadOption.INSTANCE)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer16, -1172535532, false);
                            }
                            gapComposer16.startReplaceGroup(-1172531489);
                            boolean changed15 = gapComposer16.changed(stringResource5);
                            Object rememberedValue15 = gapComposer16.rememberedValue();
                            Object obj8 = rememberedValue15;
                            if (changed15 || rememberedValue15 == obj4) {
                                Object badgeKt$$ExternalSyntheticLambda3 = new BadgeKt$$ExternalSyntheticLambda3(stringResource5, 14);
                                gapComposer16.updateRememberedValue(badgeKt$$ExternalSyntheticLambda3);
                                obj8 = badgeKt$$ExternalSyntheticLambda3;
                            }
                            clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) obj8);
                            gapComposer16.end(false);
                        }
                        Modifier then = weight.then(clearAndSetSemantics);
                        String label = option.getLabel();
                        boolean isEnabled = option.isEnabled();
                        boolean isSelected = option.isSelected();
                        boolean changed16 = gapComposer16.changed(function115) | gapComposer16.changed(i6);
                        Object rememberedValue16 = gapComposer16.rememberedValue();
                        if (changed16 || rememberedValue16 == obj4) {
                            c = 6;
                            rememberedValue16 = new TabContentViewKt$$ExternalSyntheticLambda18(i6, 6, function115);
                            gapComposer16.updateRememberedValue(rememberedValue16);
                        } else {
                            c = 6;
                        }
                        InputChipGridScope inputChipGridScope2 = inputChipGridScope;
                        inputChipGridScope2.InputChip(label, then, (String) null, (Function0) rememberedValue16, isSelected, isEnabled, gapComposer16, (intValue16 << 18) & 3670016, 4);
                        arrayList2.add(Unit.INSTANCE);
                        i6 = i7;
                        inputChipGridScope = inputChipGridScope2;
                        c2 = c3;
                        z = z5 ? 1 : 0;
                        f = 1.0f;
                    }
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                ScannerView scannerView = (ScannerView) obj6;
                MutableState mutableState = (MutableState) obj5;
                TitleBarActionScope titleBarActionScope3 = (TitleBarActionScope) obj;
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                titleBarActionScope3.getClass();
                if ((intValue17 & 6) == 0) {
                    intValue17 |= ((GapComposer) composer17).changed(titleBarActionScope3) ? 4 : 2;
                }
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 19) != 18)) {
                    FlashState flashState = (FlashState) mutableState.getValue();
                    FlashState flashState2 = FlashState.ON;
                    if (flashState == flashState2 || ((FlashState) mutableState.getValue()) == FlashState.OFF) {
                        gapComposer17.startReplaceGroup(-1752717840);
                        Icons icons3 = ((FlashState) mutableState.getValue()) == flashState2 ? Icons.FlashOn24 : Icons.FlashOff24;
                        boolean changedInstance = gapComposer17.changedInstance(scannerView);
                        Object rememberedValue17 = gapComposer17.rememberedValue();
                        if (changedInstance || rememberedValue17 == obj4) {
                            rememberedValue17 = new ScannerView$$ExternalSyntheticLambda3(scannerView, 1);
                            gapComposer17.updateRememberedValue(rememberedValue17);
                        }
                        TransactorKt.IconAction(titleBarActionScope3, icons3, "Toggle flash", (Function0) rememberedValue17, null, null, null, null, null, null, false, gapComposer17, (intValue17 & 14) | MLKEMEngine.KyberPolyBytes, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                        gapComposer17.end(false);
                    } else {
                        gapComposer17.startReplaceGroup(-1752489122);
                        gapComposer17.end(false);
                    }
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Function1 function116 = (Function1) obj5;
                ConfirmableOptionViewModel confirmableOptionViewModel = (ConfirmableOptionViewModel) obj6;
                ModalButtonScope modalButtonScope3 = (ModalButtonScope) obj;
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                int i8 = ConfirmableOptionView.$r8$clinit;
                modalButtonScope3.getClass();
                if ((intValue18 & 6) == 0) {
                    intValue18 |= ((GapComposer) composer18).changed(modalButtonScope3) ? 4 : 2;
                }
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 19) != 18)) {
                    boolean changed17 = gapComposer18.changed(function116);
                    Object rememberedValue18 = gapComposer18.rememberedValue();
                    if (changed17 || rememberedValue18 == obj4) {
                        rememberedValue18 = new CashtagViewKt$$ExternalSyntheticLambda6(6, function116);
                        gapComposer18.updateRememberedValue(rememberedValue18);
                    }
                    modalButtonScope3.PrimaryModalButton((Function0) rememberedValue18, null, false, Expect_jvmKt.rememberComposableLambda(-1162641246, new SsnViewKt$$ExternalSyntheticLambda2(confirmableOptionViewModel, i3), gapComposer18), gapComposer18, ((intValue18 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                return invoke$com$squareup$cash$blockers$views$EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 19:
                return invoke$com$squareup$cash$blockers$views$EarnerEnrollmentCategorySelectionViewKt$$ExternalSyntheticLambda1(obj, obj2, obj3);
            case 20:
                return invoke$com$squareup$cash$blockers$views$EarnerEnrollmentCategorySelectionViewKt$$ExternalSyntheticLambda8(obj, obj2, obj3);
            case 21:
                return invoke$com$squareup$cash$blockers$views$OnboardingInternalRouteViewKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 22:
                return invoke$com$squareup$cash$blockers$views$SavingsTransferOptionSelectionScreenKt$$ExternalSyntheticLambda7(obj, obj2, obj3);
            case 23:
                return invoke$com$squareup$cash$blockers$views$SetNameViewKt$$ExternalSyntheticLambda8(obj, obj2, obj3);
            case 24:
                return invoke$com$squareup$cash$blockers$views$StatusResultViewKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$blockers$views$components$InviteFriendsViewKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$blockers$web$views$WebViewBlockerViewKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 27:
                BorrowAmountPickerViewModel borrowAmountPickerViewModel = (BorrowAmountPickerViewModel) obj;
                Composer composer19 = (Composer) obj2;
                ((Integer) obj3).getClass();
                borrowAmountPickerViewModel.getClass();
                Updater.CompositionLocalProvider((CompositionLocalContext) obj6, Expect_jvmKt.rememberComposableLambda(523503829, new BorrowAmountPickerKt$$ExternalSyntheticLambda3(borrowAmountPickerViewModel, (Function1) obj5, 0, (byte) 0), composer19), composer19, 48);
                return Unit.INSTANCE;
            case 28:
                return invoke$com$squareup$cash$borrow$views$BorrowHomeKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            default:
                Latch$await$2$2 latch$await$2$2 = (Latch$await$2$2) obj6;
                BorrowHomeOverlayViewModel.InfoModal infoModal = (BorrowHomeOverlayViewModel.InfoModal) obj5;
                ModalButtonScope modalButtonScope4 = (ModalButtonScope) obj;
                Composer composer20 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                modalButtonScope4.getClass();
                if ((intValue19 & 6) == 0) {
                    intValue19 |= ((GapComposer) composer20).changed(modalButtonScope4) ? 4 : 2;
                }
                GapComposer gapComposer19 = (GapComposer) composer20;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 19) != 18)) {
                    boolean changed18 = gapComposer19.changed(latch$await$2$2) | gapComposer19.changedInstance(infoModal);
                    Object rememberedValue19 = gapComposer19.rememberedValue();
                    if (changed18 || rememberedValue19 == obj4) {
                        rememberedValue19 = new BulletinTileKt$$ExternalSyntheticLambda12(i2, latch$await$2$2, infoModal);
                        gapComposer19.updateRememberedValue(rememberedValue19);
                    }
                    modalButtonScope4.PrimaryModalButton((Function0) rememberedValue19, null, false, Expect_jvmKt.rememberComposableLambda(403712, new BulletinInfoOverlayKt$$ExternalSyntheticLambda9(infoModal, r15), gapComposer19), gapComposer19, ((intValue19 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BorrowHomeKt$$ExternalSyntheticLambda0(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = obj2;
    }
}
