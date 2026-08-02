package com.squareup.cash.offers.views.home;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.pager.PagerScopeImpl;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.navigation.NavDestination;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.common.composeui.CashComposeInsets;
import com.squareup.cash.common.composeui.CashInsetsKt;
import com.squareup.cash.core.navigationcontainer.UiContainer;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.offers.viewmodels.OffersHomeViewModel;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.views.RecipientListViewKt$RecipientListInternal$4$1$1$4$1$1;
import com.squareup.cash.payments.views.composer.ErrorKt;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda41;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.recipients.viewmodels.SectionViewModel;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.transfers.views.LinkedAccountsViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.transfers.views.composer.RecurringReloadConfigurationComposersKt;
import com.squareup.cash.transfers.views.composer.ScheduledReloadConfigurationComposersKt;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardTransitionKt;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.cash.wallet.views.WalletCardSchemeViewKt$$ExternalSyntheticLambda38;
import com.squareup.util.android.ViewGroups$$ExternalSyntheticLambda0;
import com.squareup.util.compose.ListsKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import net.oneformapp.schema.Schema;

/* loaded from: classes6.dex */
public final /* synthetic */ class OffersHomeViewKt$$ExternalSyntheticLambda2 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ OffersHomeViewKt$$ExternalSyntheticLambda2(PaddingValues paddingValues, Function1 function1, Function0 function0, LocalizedMoneyFormatter.Factory factory, RealCashVibrator realCashVibrator) {
        this.$r8$classId = 3;
        this.f$0 = paddingValues;
        this.f$2 = function1;
        this.f$4 = function0;
        this.f$1 = factory;
        this.f$3 = realCashVibrator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6, types: [androidx.compose.ui.Modifier] */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Composer composer;
        GapComposer gapComposer;
        boolean z;
        Modifier.Companion companion;
        int i = this.$r8$classId;
        int i2 = 2;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i3 = 1;
        Object obj5 = this.f$2;
        Object obj6 = this.f$4;
        Object obj7 = this.f$3;
        Object obj8 = this.f$1;
        Object obj9 = this.f$0;
        switch (i) {
            case 0:
                OffersHomeViewModel offersHomeViewModel = (OffersHomeViewModel) obj9;
                ScrollState scrollState = (ScrollState) obj8;
                Function1 function1 = (Function1) obj5;
                TextFieldState textFieldState = (TextFieldState) obj7;
                Function0 function0 = (Function0) obj6;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Composer composer2 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                if (booleanValue) {
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    gapComposer2.startReplaceGroup(-250981776);
                    offersHomeViewModel.searchViewModel.Show(Expect_jvmKt.rememberComposableLambda(-1023502795, new PoolDetailsViewKt$$ExternalSyntheticLambda41(i2, textFieldState, function0), gapComposer2), gapComposer2, 6);
                    gapComposer2.end(false);
                } else {
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    gapComposer3.startReplaceGroup(-250642605);
                    OfferTileKt.OffersHomeListing(null, offersHomeViewModel.browseListingViewModel, offersHomeViewModel.isRefreshing, scrollState, function1, gapComposer3, 0);
                    gapComposer3.end(false);
                }
                return Unit.INSTANCE;
            case 1:
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj9;
                CashComposeInsets cashComposeInsets = (CashComposeInsets) obj8;
                UiContainer uiContainer = (UiContainer) obj5;
                SharedTransitionScope sharedTransitionScope = (SharedTransitionScope) obj7;
                SaveableStateHolder saveableStateHolder = (SaveableStateHolder) obj6;
                AnimatedContentScopeImpl animatedContentScopeImpl2 = (AnimatedContentScopeImpl) obj;
                NavigationModel.Ready.FullScreenLocation fullScreenLocation = (NavigationModel.Ready.FullScreenLocation) obj2;
                Composer composer3 = (Composer) obj3;
                ((Integer) obj4).getClass();
                animatedContentScopeImpl2.getClass();
                fullScreenLocation.getClass();
                AnimatedVisibilityScope animatedVisibilityScope = animatedContentScopeImpl2.$$delegate_0;
                AnimatedContentScopeImpl animatedContentScopeImpl3 = (animatedVisibilityScope.getTransition().isRunning() || animatedVisibilityScope.getTransition().targetState$delegate.getValue() == EnterExitState.PostExit) ? animatedContentScopeImpl2 : null;
                Updater.CompositionLocalProvider(CashInsetsKt.LocalCashInsets.defaultProvidedValue$runtime(cashComposeInsets), Expect_jvmKt.rememberComposableLambda(-1782246674, new AvatarsKt$$ExternalSyntheticLambda4(uiContainer, fullScreenLocation, animatedContentScopeImpl3 == null ? animatedContentScopeImpl : animatedContentScopeImpl3, sharedTransitionScope, saveableStateHolder, 18), composer3), composer3, 56);
                return Unit.INSTANCE;
            case 2:
                SectionViewModel sectionViewModel = (SectionViewModel) obj9;
                Function1 function12 = (Function1) obj5;
                Function1 function13 = (Function1) obj8;
                LazyListState lazyListState = (LazyListState) obj7;
                Function1 function14 = (Function1) obj6;
                int intValue = ((Integer) obj2).intValue();
                Composer composer4 = (Composer) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= ((GapComposer) composer4).changed(intValue) ? 32 : 16;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    RecipientViewModel recipientViewModel = (RecipientViewModel) sectionViewModel.recipients.get(intValue);
                    ErrorKt.RecipientRow(null, function12, function13, recipientViewModel, gapComposer4, 0);
                    boolean changedInstance = gapComposer4.changedInstance(recipientViewModel);
                    Object rememberedValue = gapComposer4.rememberedValue();
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(recipientViewModel, 11);
                        gapComposer4.updateRememberedValue(rememberedValue);
                    }
                    if (((Boolean) ListsKt.rememberLazyListItemVisibility(lazyListState, (Function1) rememberedValue, gapComposer4).getValue()).booleanValue()) {
                        gapComposer4.startReplaceGroup(-1816795781);
                        boolean changed = gapComposer4.changed(function14) | gapComposer4.changedInstance(recipientViewModel);
                        Object rememberedValue2 = gapComposer4.rememberedValue();
                        if (changed || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new RecipientListViewKt$RecipientListInternal$4$1$1$4$1$1(function14, recipientViewModel, null, 1);
                            gapComposer4.updateRememberedValue(rememberedValue2);
                        }
                        Updater.LaunchedEffect(gapComposer4, recipientViewModel, (Function2) rememberedValue2);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(-1816703525);
                        gapComposer4.end(false);
                    }
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                int i4 = 3;
                PaddingValues paddingValues = (PaddingValues) obj9;
                Function1 function15 = (Function1) obj5;
                Function0 function02 = (Function0) obj6;
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) obj8;
                RealCashVibrator realCashVibrator = (RealCashVibrator) obj7;
                RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel = (RecurringReloadConfigurationViewModel) obj;
                float floatValue = ((Float) obj2).floatValue();
                Composer composer5 = (Composer) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                recurringReloadConfigurationViewModel.getClass();
                boolean z2 = recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker;
                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                if (z2) {
                    GapComposer gapComposer5 = (GapComposer) composer5;
                    gapComposer5.startReplaceGroup(244514326);
                    Modifier sheetAlpha = NavDestination.Companion.sheetAlpha(SpacerKt.padding(companion2, paddingValues), floatValue);
                    RecurringReloadConfigurationViewModel.AtmPicker atmPicker = (RecurringReloadConfigurationViewModel.AtmPicker) recurringReloadConfigurationViewModel;
                    boolean changed2 = gapComposer5.changed(function15);
                    Object rememberedValue3 = gapComposer5.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new ScoreHomeKt$$ExternalSyntheticLambda5(28, function15);
                        gapComposer5.updateRememberedValue(rememberedValue3);
                    }
                    Function1 function16 = (Function1) rememberedValue3;
                    boolean changed3 = gapComposer5.changed(function15);
                    Object rememberedValue4 = gapComposer5.rememberedValue();
                    if (changed3 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(19, function15);
                        gapComposer5.updateRememberedValue(rememberedValue4);
                    }
                    RecurringReloadConfigurationComposersKt.AmountPickerContent(sheetAlpha, atmPicker, function16, (Function0) rememberedValue4, function02, gapComposer5, (intValue3 << 3) & 112);
                    gapComposer5.end(false);
                } else if (recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad) {
                    GapComposer gapComposer6 = (GapComposer) composer5;
                    gapComposer6.startReplaceGroup(244534534);
                    Modifier sheetAlpha2 = NavDestination.Companion.sheetAlpha(companion2, floatValue);
                    RecurringReloadConfigurationViewModel.Keypad keypad = (RecurringReloadConfigurationViewModel.Keypad) recurringReloadConfigurationViewModel;
                    boolean changed4 = gapComposer6.changed(function15);
                    Object rememberedValue5 = gapComposer6.rememberedValue();
                    if (changed4 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new ViewGroups$$ExternalSyntheticLambda0(i2, function15);
                        gapComposer6.updateRememberedValue(rememberedValue5);
                    }
                    Function1 function17 = (Function1) rememberedValue5;
                    boolean changed5 = gapComposer6.changed(function15);
                    Object rememberedValue6 = gapComposer6.rememberedValue();
                    if (changed5 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(20, function15);
                        gapComposer6.updateRememberedValue(rememberedValue6);
                    }
                    Function0 function03 = (Function0) rememberedValue6;
                    boolean changed6 = gapComposer6.changed(function15);
                    Object rememberedValue7 = gapComposer6.rememberedValue();
                    if (changed6 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(21, function15);
                        gapComposer6.updateRememberedValue(rememberedValue7);
                    }
                    RecurringReloadConfigurationComposersKt.AmountKeypadContent(sheetAlpha2, keypad, function17, function03, (Function0) rememberedValue7, factory, realCashVibrator, gapComposer6, (intValue3 << 3) & 112);
                    gapComposer6.end(false);
                } else if (recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker) {
                    GapComposer gapComposer7 = (GapComposer) composer5;
                    gapComposer7.startReplaceGroup(244558262);
                    Modifier sheetAlpha3 = NavDestination.Companion.sheetAlpha(SpacerKt.padding(companion2, paddingValues), floatValue);
                    RecurringReloadConfigurationViewModel.AtmPicker atmPicker2 = (RecurringReloadConfigurationViewModel.AtmPicker) recurringReloadConfigurationViewModel;
                    boolean changed7 = gapComposer7.changed(function15);
                    Object rememberedValue8 = gapComposer7.rememberedValue();
                    if (changed7 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new ViewGroups$$ExternalSyntheticLambda0(i4, function15);
                        gapComposer7.updateRememberedValue(rememberedValue8);
                    }
                    Function1 function18 = (Function1) rememberedValue8;
                    boolean changed8 = gapComposer7.changed(function15);
                    Object rememberedValue9 = gapComposer7.rememberedValue();
                    if (changed8 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(22, function15);
                        gapComposer7.updateRememberedValue(rememberedValue9);
                    }
                    RecurringReloadConfigurationComposersKt.AmountPickerContent(sheetAlpha3, atmPicker2, function18, (Function0) rememberedValue9, function02, gapComposer7, (intValue3 << 3) & 112);
                    gapComposer7.end(false);
                } else if (recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad) {
                    GapComposer gapComposer8 = (GapComposer) composer5;
                    gapComposer8.startReplaceGroup(244578536);
                    Modifier sheetAlpha4 = NavDestination.Companion.sheetAlpha(companion2, floatValue);
                    RecurringReloadConfigurationViewModel.Keypad keypad2 = (RecurringReloadConfigurationViewModel.Keypad) recurringReloadConfigurationViewModel;
                    boolean changed9 = gapComposer8.changed(function15);
                    Object rememberedValue10 = gapComposer8.rememberedValue();
                    if (changed9 || rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new ViewGroups$$ExternalSyntheticLambda0(4, function15);
                        gapComposer8.updateRememberedValue(rememberedValue10);
                    }
                    Function1 function19 = (Function1) rememberedValue10;
                    boolean changed10 = gapComposer8.changed(function15);
                    Object rememberedValue11 = gapComposer8.rememberedValue();
                    if (changed10 || rememberedValue11 == neverEqualPolicy) {
                        rememberedValue11 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(23, function15);
                        gapComposer8.updateRememberedValue(rememberedValue11);
                    }
                    Function0 function04 = (Function0) rememberedValue11;
                    boolean changed11 = gapComposer8.changed(function15);
                    Object rememberedValue12 = gapComposer8.rememberedValue();
                    if (changed11 || rememberedValue12 == neverEqualPolicy) {
                        rememberedValue12 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(25, function15);
                        gapComposer8.updateRememberedValue(rememberedValue12);
                    }
                    RecurringReloadConfigurationComposersKt.AmountKeypadContent(sheetAlpha4, keypad2, function19, function04, (Function0) rememberedValue12, factory, realCashVibrator, gapComposer8, (intValue3 << 3) & 112);
                    gapComposer8.end(false);
                } else if (recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectFrequency) {
                    GapComposer gapComposer9 = (GapComposer) composer5;
                    gapComposer9.startReplaceGroup(244601605);
                    ScheduledReloadConfigurationComposersKt.FrequencyPickerContent(SpacerKt.padding(companion2, paddingValues), (RecurringReloadConfigurationViewModel.SelectFrequency) recurringReloadConfigurationViewModel, function15, gapComposer9, (intValue3 << 3) & 112);
                    gapComposer9.end(false);
                } else if (recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectDay) {
                    GapComposer gapComposer10 = (GapComposer) composer5;
                    gapComposer10.startReplaceGroup(244610495);
                    ScheduledReloadConfigurationComposersKt.DayPickerContent(SpacerKt.padding(companion2, paddingValues), (RecurringReloadConfigurationViewModel.SelectDay) recurringReloadConfigurationViewModel, function15, gapComposer10, (intValue3 << 3) & 112);
                    gapComposer10.end(false);
                } else if (recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) {
                    GapComposer gapComposer11 = (GapComposer) composer5;
                    gapComposer11.startReplaceGroup(244620226);
                    Modifier sheetAlpha5 = NavDestination.Companion.sheetAlpha(SpacerKt.padding(companion2, paddingValues), floatValue);
                    RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker selectScheduledAmountAtmPicker = (RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) recurringReloadConfigurationViewModel;
                    boolean changed12 = gapComposer11.changed(function15);
                    Object rememberedValue13 = gapComposer11.rememberedValue();
                    if (changed12 || rememberedValue13 == neverEqualPolicy) {
                        rememberedValue13 = new ScoreHomeKt$$ExternalSyntheticLambda5(29, function15);
                        gapComposer11.updateRememberedValue(rememberedValue13);
                    }
                    Function1 function110 = (Function1) rememberedValue13;
                    boolean changed13 = gapComposer11.changed(function15);
                    Object rememberedValue14 = gapComposer11.rememberedValue();
                    if (changed13 || rememberedValue14 == neverEqualPolicy) {
                        rememberedValue14 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(16, function15);
                        gapComposer11.updateRememberedValue(rememberedValue14);
                    }
                    ScheduledReloadConfigurationComposersKt.ScheduledAmountPickerContent(sheetAlpha5, selectScheduledAmountAtmPicker, function110, (Function0) rememberedValue14, function02, gapComposer11, (intValue3 << 3) & 112);
                    gapComposer11.end(false);
                } else {
                    if (!(recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad)) {
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer5, 244514541, false);
                    }
                    GapComposer gapComposer12 = (GapComposer) composer5;
                    gapComposer12.startReplaceGroup(244640974);
                    Modifier sheetAlpha6 = NavDestination.Companion.sheetAlpha(companion2, floatValue);
                    RecurringReloadConfigurationViewModel.Keypad keypad3 = (RecurringReloadConfigurationViewModel.Keypad) recurringReloadConfigurationViewModel;
                    boolean changed14 = gapComposer12.changed(function15);
                    Object rememberedValue15 = gapComposer12.rememberedValue();
                    if (changed14 || rememberedValue15 == neverEqualPolicy) {
                        rememberedValue15 = new ViewGroups$$ExternalSyntheticLambda0(i3, function15);
                        gapComposer12.updateRememberedValue(rememberedValue15);
                    }
                    Function1 function111 = (Function1) rememberedValue15;
                    boolean changed15 = gapComposer12.changed(function15);
                    Object rememberedValue16 = gapComposer12.rememberedValue();
                    if (changed15 || rememberedValue16 == neverEqualPolicy) {
                        rememberedValue16 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(17, function15);
                        gapComposer12.updateRememberedValue(rememberedValue16);
                    }
                    Function0 function05 = (Function0) rememberedValue16;
                    boolean changed16 = gapComposer12.changed(function15);
                    Object rememberedValue17 = gapComposer12.rememberedValue();
                    if (changed16 || rememberedValue17 == neverEqualPolicy) {
                        rememberedValue17 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(18, function15);
                        gapComposer12.updateRememberedValue(rememberedValue17);
                    }
                    RecurringReloadConfigurationComposersKt.AmountKeypadContent(sheetAlpha6, keypad3, function111, function05, (Function0) rememberedValue17, factory, realCashVibrator, gapComposer12, (intValue3 << 3) & 112);
                    gapComposer12.end(false);
                }
                return Unit.INSTANCE;
            default:
                RealImageLoader realImageLoader = (RealImageLoader) obj9;
                DefaultPagerState defaultPagerState = (DefaultPagerState) obj8;
                ArrayList arrayList = (ArrayList) obj7;
                CardSchemeViewModel.Module.HeroCard heroCard = (CardSchemeViewModel.Module.HeroCard) obj6;
                Function1 function112 = (Function1) obj5;
                int intValue4 = ((Integer) obj2).intValue();
                Composer composer6 = (Composer) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                ((PagerScopeImpl) obj).getClass();
                Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                Modifier fillMaxSize = SizeKt.fillMaxSize(companion3, 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                GapComposer gapComposer13 = (GapComposer) composer6;
                int hashCode = Long.hashCode(gapComposer13.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer13.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(composer6, fillMaxSize);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer14 = (GapComposer) composer6;
                if (gapComposer14.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer14.startReusableNode();
                if (gapComposer14.inserting) {
                    gapComposer14.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer14.useNode();
                }
                Updater.m576setimpl(composer6, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer6, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer6, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer6, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer6, materializeModifier, ComposeUiNode.Companion.SetModifier);
                if (intValue4 == 0) {
                    gapComposer14.startReplaceGroup(1765869236);
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-1261827659, new WalletCardSchemeViewKt$$ExternalSyntheticLambda38(heroCard, function112, i3), composer6), composer6, 56);
                    gapComposer14.end(false);
                    gapComposer = gapComposer14;
                } else {
                    gapComposer14.startReplaceGroup(1766130907);
                    Schema schema = defaultPagerState.scrollPosition;
                    float intValue6 = (intValue4 - ((ParcelableSnapshotMutableIntState) schema.elementTypes).getIntValue()) - ((ParcelableSnapshotMutableFloatState) schema.fieldSortOrder).getFloatValue();
                    CardSchemeViewModel.Module.HeroTag heroTag = (CardSchemeViewModel.Module.HeroTag) arrayList.get(intValue4 - 1);
                    if (intValue4 == ((ParcelableSnapshotMutableIntState) schema.elementTypes).getIntValue()) {
                        gapComposer14.startReplaceGroup(1767281596);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = CardTransitionKt.LocalCardRegistry;
                        gapComposer = gapComposer14;
                        composer = composer6;
                        ?? cardTransition = CardTransitionKt.cardTransition(390, 0, composer, companion3, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(intValue4, "hero-tag:page-"), true);
                        z = false;
                        gapComposer.end(false);
                        companion = cardTransition;
                    } else {
                        composer = composer6;
                        gapComposer = gapComposer14;
                        z = false;
                        gapComposer.startReplaceGroup(1767485266);
                        gapComposer.end(false);
                        companion = companion3;
                    }
                    UtilsKt.Render(heroTag, companion, intValue4, intValue6, false, false, composer, (intValue5 << 3) & 896, 24);
                    gapComposer.end(z);
                }
                gapComposer.end(true);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ OffersHomeViewKt$$ExternalSyntheticLambda2(RealImageLoader realImageLoader, DefaultPagerState defaultPagerState, ArrayList arrayList, CardSchemeViewModel.Module.HeroCard heroCard, Function1 function1) {
        this.$r8$classId = 4;
        this.f$0 = realImageLoader;
        this.f$1 = defaultPagerState;
        this.f$3 = arrayList;
        this.f$4 = heroCard;
        this.f$2 = function1;
    }

    public /* synthetic */ OffersHomeViewKt$$ExternalSyntheticLambda2(SectionViewModel sectionViewModel, Function1 function1, Function1 function12, LazyListState lazyListState, Function1 function13) {
        this.$r8$classId = 2;
        this.f$0 = sectionViewModel;
        this.f$2 = function1;
        this.f$1 = function12;
        this.f$3 = lazyListState;
        this.f$4 = function13;
    }

    public /* synthetic */ OffersHomeViewKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }
}
