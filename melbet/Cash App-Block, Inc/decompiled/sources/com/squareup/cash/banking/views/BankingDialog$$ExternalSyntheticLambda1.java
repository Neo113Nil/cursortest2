package com.squareup.cash.banking.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyListLayoutInfoKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.internal.Utils_androidKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.arcade.values.timeline.ArcadeTimeline2Item;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1$start$2;
import app.cash.broadway.ui.Ui;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.network.NetworkFetcher$fetch$2;
import com.google.mlkit.vision.text.zzc;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.timeline.TimelineItem;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.ArcadeTimeline2Binding;
import com.squareup.cash.arcade.treehouse.TitleBarCoreBinding;
import com.squareup.cash.avatar.components.StackedAvatarsKt;
import com.squareup.cash.banking.applets.views.BalanceAppletTile;
import com.squareup.cash.banking.viewmodels.BalanceHomeViewModel;
import com.squareup.cash.banking.viewmodels.BankingDialogViewModel;
import com.squareup.cash.banking.viewmodels.BenefitsExplanationViewModel;
import com.squareup.cash.banking.viewmodels.BetterOverdraftViewModel;
import com.squareup.cash.banking.viewmodels.OverdraftViewModel;
import com.squareup.cash.banking.viewmodels.RecurringDepositsFirstTimeUserViewModel;
import com.squareup.cash.banking.viewmodels.RecurringDepositsViewModel;
import com.squareup.cash.banking.viewmodels.TransfersViewModel;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewModel;
import com.squareup.cash.benefits.viewmodels.PdsaBenefitsExplainerViewModel$Loaded;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel;
import com.squareup.cash.bitcoin.viewmodels.BitcoinDisplayCurrencyViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.autoinvest.BitcoinHomeAutoInvestWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.balance.BitcoinBalanceWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.toolbar.BitcoinHomeToolbarViewModel;
import com.squareup.cash.bitcoin.views.BitcoinInvoiceEntryView;
import com.squareup.cash.bitcoin.views.applet.BitcoinHomeViewKt;
import com.squareup.cash.bitcoin.views.applet.balance.BitcoinBalanceWidgetKt;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoRecurringPurchaseTileViewModel;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.mooncake.resources.ColorsKt;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.views.TabToolbarsKt;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.widget.StackedAvatarView$TextSize;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda9;
import com.squareup.util.Strings;
import com.squareup.util.coroutines.TakeUntilKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final /* synthetic */ class BankingDialog$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ BankingDialog$$ExternalSyntheticLambda1(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Color color = null;
        int i2 = 2;
        int i3 = 1;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int i4 = BankingDialog.$r8$clinit;
                ((BankingDialog) obj5).Content((BankingDialogViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                CellDefaultAccessory cellDefaultAccessory = (CellDefaultAccessory) obj5;
                Badge badge = (Badge) obj4;
                Function0 function0 = (Function0) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    cellDefaultAccessory.Content(badge, function0, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Function2 function2 = (Function2) obj5;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj4;
                Function0 function02 = (Function0) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (!(((double) 1.0f) > 0.0d)) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, 7);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl, gapComposer2, true);
                    if (function2 != null) {
                        gapComposer2.startReplaceGroup(776193373);
                        SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, 20.0f));
                        Updater.CompositionLocalProvider(new ProvidedValue[]{ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(Strings.getTypography(gapComposer2).bodyMedium), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer2).semantic.text.standard, ArcadeThemeKt.LocalTextColor), Recorder$$ExternalSyntheticOutline2.m(Strings.getColors(gapComposer2).semantic.icon.standard, ArcadeThemeKt.LocalIconColor)}, Expect_jvmKt.rememberComposableLambda(-606438156, new BadgeKt$$ExternalSyntheticLambda2(4, function02, function2), gapComposer2), gapComposer2, 56);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(777321587);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Function1 function1 = (Function1) obj3;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj5;
                TimelineItem timelineItem = (TimelineItem) obj4;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new WalletHomeViewKt$$ExternalSyntheticLambda9(i3, parcelableSnapshotMutableIntState);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    Modifier layout = ValueInsets.layout(fillMaxWidth, (Function3) rememberedValue);
                    boolean changed = gapComposer3.changed(function1);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new LocalShortlinkSheetKt$$ExternalSyntheticLambda0(function1, parcelableSnapshotMutableIntState, i2);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    Modifier onPlaced = RulerKt.onPlaced(layout, (Function1) rememberedValue2);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, onPlaced);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    timelineItem.title.invoke((Object) BoxScopeInstance.INSTANCE, (Object) gapComposer3, (Object) 6);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                LazyListLayoutInfoKt.TimelineVisibleItemRow((Modifier) obj5, (Function1) obj3, (TimelineItem) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                String str = (String) obj5;
                ArcadeTimeline2Item arcadeTimeline2Item = (ArcadeTimeline2Item) obj4;
                ArcadeTimeline2Binding arcadeTimeline2Binding = (ArcadeTimeline2Binding) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i5 = ArcadeTimeline2Binding.$r8$clinit;
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    app.cash.arcade.values.Color color2 = arcadeTimeline2Item.valueColor;
                    if (color2 == null) {
                        gapComposer4.startReplaceGroup(-1864315689);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(1879523434);
                        color = Recorder$$ExternalSyntheticOutline1.m(gapComposer4, false, ColorsKt.toComposeColor(color2, arcadeTimeline2Binding.themeInfo, gapComposer4));
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, color != null ? color.value : Color.Unspecified, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj5;
                TabToolbarInternalViewModel.ProfileButton profileButton = (TabToolbarInternalViewModel.ProfileButton) obj4;
                TitleBarCoreBinding titleBarCoreBinding = (TitleBarCoreBinding) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Ui.EventReceiver eventReceiver = titleBarCoreBinding.eventReceiver;
                    if (eventReceiver == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    }
                    boolean changedInstance = gapComposer5.changedInstance(eventReceiver);
                    Object rememberedValue3 = gapComposer5.rememberedValue();
                    if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                        NetworkFetcher$fetch$2 networkFetcher$fetch$2 = new NetworkFetcher$fetch$2(1, eventReceiver, Ui.EventReceiver.class, "sendEvent", "sendEvent(Ljava/lang/Object;)V", 0, 26);
                        gapComposer5.updateRememberedValue(networkFetcher$fetch$2);
                        rememberedValue3 = networkFetcher$fetch$2;
                    }
                    TabToolbarsKt.m3755ProfileButtonNpZTi58(titleBarActionScope, profileButton, false, null, 0L, false, null, (Function1) ((KFunction) rememberedValue3), gapComposer5, 3072, 58);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                StackedAvatarsKt.StackedAvatars((StackedAvatarViewModel.Single) obj5, (Modifier) obj4, (StackedAvatarView$TextSize) obj3, (Composer) obj, Updater.updateChangedFlags(57));
                return Unit.INSTANCE;
            case 8:
                Navigator navigator = (Navigator) obj;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                navigator.getClass();
                coroutineScope.getClass();
                Presenter.Binding start$default = Presenter.start$default(MoleculePresenterKt.asPresenter$default((MoleculePresenter) ((Function1) obj3).invoke(navigator)), coroutineScope, (LifecycleOwner) obj5);
                return new BalanceAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) start$default).getModels(), new NetworkFetcher$fetch$2(1, start$default, Presenter.Binding.class, "sendEvent", "sendEvent(Ljava/lang/Object;)V", 0, 29), (ElementBoundsRegistry) obj4);
            case 9:
                ((Integer) obj2).getClass();
                ((BalanceHomeView) obj5).Content((BalanceHomeViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                BetterOverdraftViewModel betterOverdraftViewModel = (BetterOverdraftViewModel) obj5;
                Function1 function12 = (Function1) obj3;
                MutableState mutableState = (MutableState) obj4;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Strings.LoadableFullScreenContent(betterOverdraftViewModel, betterOverdraftViewModel instanceof BetterOverdraftViewModel.Loading, null, null, null, Expect_jvmKt.rememberComposableLambda(842621378, new CashtagViewKt$$ExternalSyntheticLambda5(function12, mutableState, i3), gapComposer6), gapComposer6, 196608, 28);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                BankingDialogKt.TurnOffOverdraftConfirmationSheet((BetterOverdraftViewModel.Loaded.TurnOffConfirmationSheet) obj5, (Function0) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                int i6 = OverdraftCoverageSheetView.$r8$clinit;
                ((OverdraftCoverageSheetView) obj5).Content((OverdraftViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                BankingDialogKt.RecurringDepositsFirstTimeUser((Modifier) obj5, (RecurringDepositsFirstTimeUserViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                int i7 = RecurringDepositsView.$r8$clinit;
                ((RecurringDepositsView) obj5).Content((RecurringDepositsViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                int i8 = TransfersView.$r8$clinit;
                ((TransfersView) obj5).Content((TransfersViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                BenefitsHomeViewKt.BenefitsHubExplanation((Modifier) obj5, (BenefitsExplanationViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 17:
                Icons icons = (Icons) obj5;
                Color color3 = (Color) obj4;
                BenefitsHubViewModel.Loaded.BenefitsViewModel.BenefitsRow benefitsRow = (BenefitsHubViewModel.Loaded.BenefitsViewModel.BenefitsRow) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    if (color3 != null) {
                        gapComposer7.startReplaceGroup(-387731236);
                        gapComposer7.end(false);
                        j = color3.value;
                    } else if (benefitsRow.disabled) {
                        gapComposer7.startReplaceGroup(-387728612);
                        Colors colors = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                        } else {
                            gapComposer7.startReplaceGroup(-1762997739);
                            gapComposer7.end(false);
                        }
                        j = colors.semantic.icon.disabled;
                        gapComposer7.end(false);
                    } else {
                        gapComposer7.startReplaceGroup(-387726372);
                        Colors colors2 = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                        } else {
                            gapComposer7.startReplaceGroup(-1762997739);
                            gapComposer7.end(false);
                        }
                        j = colors2.semantic.icon.standard;
                        gapComposer7.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, j, gapComposer7, 48, 4);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                BenefitsHomeViewKt.PdsaBenefitsExplainerSheet((Modifier) obj5, (PdsaBenefitsExplainerViewModel$Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                Utils_androidKt.InstalledUI((BitcoinAppletTileModel.Installed.Loaded) obj5, (AppletTile.AppletTileAppearance) obj4, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                Utils_androidKt.GraphErrorUI((BitcoinAppletTileModel.Installed.GraphError) obj5, (AppletTile.AppletTileAppearance) obj4, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                Modifier modifier = (Modifier) obj5;
                Function1 function13 = (Function1) obj3;
                BitcoinDisplayCurrencyViewModel bitcoinDisplayCurrencyViewModel = (BitcoinDisplayCurrencyViewModel) obj4;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
                    Colors colors3 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                    } else {
                        gapComposer8.startReplaceGroup(-1762997739);
                        gapComposer8.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors3.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer8, 0);
                    int hashCode3 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer8, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer8.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer8, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer8, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    String stringResource = Room.stringResource(gapComposer8, R.string.bitcoin_settings_display_currency);
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed2 = gapComposer8.changed(function13);
                    Object rememberedValue4 = gapComposer8.rememberedValue();
                    if (changed2 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new BenefitsHubViewKt$$ExternalSyntheticLambda4(21, function13);
                        gapComposer8.updateRememberedValue(rememberedValue4);
                    }
                    DBUtil.TitleBarSub(stringResource, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, (Function3) null, gapComposer8, 48, 108);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer8, null);
                    boolean z = bitcoinDisplayCurrencyViewModel instanceof BitcoinDisplayCurrencyViewModel.Loading;
                    Object rememberedValue5 = gapComposer8.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new BenefitsHubViewKt$$ExternalSyntheticLambda2(18);
                        gapComposer8.updateRememberedValue(rememberedValue5);
                    }
                    Strings.LoadableFullScreenContent(bitcoinDisplayCurrencyViewModel, z, null, (Function1) rememberedValue5, null, Expect_jvmKt.rememberComposableLambda(1426245641, new SetPinViewKt$$ExternalSyntheticLambda4(13, function13), gapComposer8), gapComposer8, 199680, 20);
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                int i9 = BitcoinInvoiceEntryView.$r8$clinit;
                ((BitcoinInvoiceEntryView) obj5).Content((Unit) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                BitcoinHomeViewModel bitcoinHomeViewModel = (BitcoinHomeViewModel) obj5;
                Function1 function14 = (Function1) obj3;
                zzc zzcVar = (zzc) obj4;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer9);
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors4 = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors4.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1585498625, new BankingDialogKt$$ExternalSyntheticLambda2(20, (Object) bitcoinHomeViewModel, function14), gapComposer9);
                    boolean changedInstance2 = gapComposer9.changedInstance(bitcoinHomeViewModel) | gapComposer9.changed(function14) | gapComposer9.changedInstance(zzcVar);
                    Object rememberedValue6 = gapComposer9.rememberedValue();
                    if (changedInstance2 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new CaptureCheckFaceKt$$ExternalSyntheticLambda11(i2, bitcoinHomeViewModel, function14, zzcVar);
                        gapComposer9.updateRememberedValue(rememberedValue6);
                    }
                    ScreenScaffoldKt.ScreenScaffoldLazy(systemBarsPadding, rememberLazyListState, null, rememberComposableLambda, null, (Function1) rememberedValue6, gapComposer9, 3072, 20);
                    BitcoinHomeViewKt.HandleScrollEvents(rememberLazyListState, function14, gapComposer9, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                BitcoinHomeViewKt.Toolbar((BitcoinHomeToolbarViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                BitcoinHomeViewKt.AddWidgetView((BitcoinHomeWidgetViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                PathOperation.BitcoinAutoInvestWidgetView((BitcoinHomeAutoInvestWidgetViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                InvestingCryptoRecurringPurchaseTileViewModel investingCryptoRecurringPurchaseTileViewModel = (InvestingCryptoRecurringPurchaseTileViewModel) obj5;
                Modifier modifier2 = (Modifier) obj4;
                Function1 function15 = (Function1) obj3;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    TakeUntilKt.WidgetSectionView(investingCryptoRecurringPurchaseTileViewModel.title, modifier2, null, null, Expect_jvmKt.rememberComposableLambda(37969810, new BankingDialogKt$$ExternalSyntheticLambda2(22, (Object) investingCryptoRecurringPurchaseTileViewModel, function15), gapComposer10), gapComposer10, 196608, 28);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                BitcoinBalanceWidgetKt.BitcoinBalanceWidget((BitcoinBalanceWidgetViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                BitcoinBalanceWidgetKt.BalancePrimaryAmount((String) obj5, (Modifier) obj4, (Long) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BankingDialog$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ BankingDialog$$ExternalSyntheticLambda1(Object obj, Function1 function1, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = function1;
        this.f$1 = obj2;
    }

    public /* synthetic */ BankingDialog$$ExternalSyntheticLambda1(Object obj, Function1 function1, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = function1;
        this.f$1 = obj2;
    }

    public /* synthetic */ BankingDialog$$ExternalSyntheticLambda1(Function1 function1, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$2 = function1;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
