package com.squareup.cash.arcade.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.AnchoredDraggableElement;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1$start$2;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.MotionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.input.InputAreaKt$InputArea$3$1$2;
import com.squareup.cash.arcade.components.internal.TooltipKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.internal.TooltipState;
import com.squareup.cash.arcade.components.list.ListOrderedKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.avatar.components.BadgedAvatarKt;
import com.squareup.cash.banking.viewmodels.BalanceHomeViewModel;
import com.squareup.cash.banking.viewmodels.BenefitsExplanationViewModel;
import com.squareup.cash.banking.viewmodels.BetterOverdraftViewModel;
import com.squareup.cash.banking.viewmodels.OverdraftViewModel;
import com.squareup.cash.banking.viewmodels.RecurringDepositsFirstTimeUserViewModel;
import com.squareup.cash.banking.viewmodels.TransfersViewModel;
import com.squareup.cash.banking.views.BalanceHomeViewKt;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.banking.views.BankingDialogKt;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda2;
import com.squareup.cash.banking.views.BenefitsLeafletViewKt;
import com.squareup.cash.banking.views.OverdraftCoverageSheetView;
import com.squareup.cash.banking.views.RecurringDepositsFirstTimeUserView;
import com.squareup.cash.banking.views.TransfersView$$ExternalSyntheticLambda0;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ActionableButtonDefault;
import com.squareup.cash.benefits.applets.presenters.BankingBenefitsAppletTilePresenter$Factory$Impl;
import com.squareup.cash.benefits.viewmodels.BenefitsHomeViewModel;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewModel;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt;
import com.squareup.cash.benefits.views.BenefitsHubViewKt;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.family.applets.views.FamilyAppletTile;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.applets.presenters.SavingsAppletTilePresenter$MetroFactory;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.transfers.presenters.LinkedAccountsPresenter;
import com.squareup.preferences.KeyValue;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final /* synthetic */ class BadgeKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BadgeKt$$ExternalSyntheticLambda2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Modifier then;
        long j;
        int i = this.$r8$classId;
        int i2 = 7;
        Color color = null;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i3 = 2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                Room.BadgeInline((Badge) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ((SearchBarKt$InternalSearchBar$1$2$decorator$1) obj4).Decoration((ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 2:
                AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) obj4;
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    boolean changed = gapComposer.changed(anchoredDraggableState);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new SegmentedControlKt$$ExternalSyntheticLambda4(anchoredDraggableState, false ? 1 : 0);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier indication = IndicationKt.indication(ClipKt.clip(OffsetKt.offset(companion, (Function1) rememberedValue), RoundedCornerShapeKt.CircleShape), mutableInteractionSourceImpl, RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 0, 15));
                    Orientation orientation = Orientation.Vertical;
                    then = indication.then(new AnchoredDraggableElement(anchoredDraggableState, Orientation.Horizontal, true, mutableInteractionSourceImpl, true, null));
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(then, colors.component.segmentedControl.button.background.selected, ColorKt.RectangleShape), gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Function3 function3 = (Function3) obj4;
                MutableState mutableState = (MutableState) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (function3 == null) {
                        gapComposer2.startReplaceGroup(1728229515);
                    } else {
                        gapComposer2.startReplaceGroup(-1191176650);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new TabContentViewKt$$ExternalSyntheticLambda1(16, mutableState);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        function3.invoke(new ToastActionScope((Function0) rememberedValue2), gapComposer2, 0);
                    }
                    gapComposer2.end(false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Function0 function0 = (Function0) obj4;
                Function2 function2 = (Function2) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                boolean shouldExecute = gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2);
                Applier applier = gapComposer3.applier;
                if (shouldExecute) {
                    Modifier clip = ClipKt.clip(OffsetKt.m273offsetVpY3zN4$default(SizeKt.wrapContentWidth$default(companion, null, 3), 8.0f, RecyclerView.DECELERATION_RATE, 2), RoundedCornerShapeKt.CircleShape);
                    boolean z = function0 != null;
                    if (function0 == null) {
                        gapComposer3.startReplaceGroup(-1766235764);
                        Object rememberedValue3 = gapComposer3.rememberedValue();
                        if (rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new MotionKt$$ExternalSyntheticLambda0(25);
                            gapComposer3.updateRememberedValue(rememberedValue3);
                        }
                        function0 = (Function0) rememberedValue3;
                    } else {
                        gapComposer3.startReplaceGroup(1328497447);
                    }
                    gapComposer3.end(false);
                    Modifier then2 = SpacerKt.m299paddingVpY3zN4(ImageKt.m183clickableoSLSa3U$default(clip, z, null, null, function0, 14), 8.0f, 2.0f).then(new WithAlignmentLineElement(AlignmentLineKt.FirstBaseline));
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer3, 0);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, then2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    HorizontalAlignmentLine horizontalAlignmentLine = AlignmentLinesKt.FirstLineCenter;
                    WithAlignmentLineElement withAlignmentLineElement = new WithAlignmentLineElement(horizontalAlignmentLine);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, withAlignmentLineElement);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Recorder$$ExternalSyntheticOutline1.m(0, function2, gapComposer3, true);
                    Trace.m1191Iconww6aTOc(Icons.SubtlePush16, (String) null, new WithAlignmentLineElement(horizontalAlignmentLine), 0L, gapComposer3, 54, 8);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ((InputAreaKt$InputArea$3$1$2) obj4).Decoration((ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 6:
                String str = (String) obj4;
                TooltipState tooltipState = (TooltipState) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    boolean changedInstance = gapComposer4.changedInstance(tooltipState);
                    Object rememberedValue4 = gapComposer4.rememberedValue();
                    if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new TooltipKt$$ExternalSyntheticLambda2(tooltipState, i3);
                        gapComposer4.updateRememberedValue(rememberedValue4);
                    }
                    RuntimeHelpersKt.Tooltip(0, gapComposer4, str, (Function0) rememberedValue4);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                ListOrderedKt.ListOrderedSubtle((Modifier) obj3, (ImmutableList) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                Painter painter = (Painter) obj4;
                String str2 = (String) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Trace.m1190Iconww6aTOc(painter, str2, SizeKt.m285size3ABfNKs(companion, 24.0f), ((Color) gapComposer5.consume(ArcadeThemeKt.LocalIconColor)).value, gapComposer5, Painter.$stable | MLKEMEngine.KyberPolyBytes, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                BadgedAvatarKt.DefaultAvatar((Modifier) obj3, (ColorFilter) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                BalanceHomeViewKt.RestrictedBalanceLabel((BalanceHomeViewModel.Loaded.RestrictedBalanceViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                BalanceHomeViewKt.OverdraftPill((BalanceHomeViewModel.OverdraftPillViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                BalanceHomeViewModel.Loaded loaded = (BalanceHomeViewModel.Loaded) obj4;
                Function1 function1 = (Function1) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (!gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    gapComposer6.skipToGroupEnd();
                } else if (loaded.evergreenOverdraftEnabled) {
                    gapComposer6.startReplaceGroup(-1835479014);
                    String str3 = loaded.overdraftBalanceSubtitle;
                    if (str3 == null) {
                        gapComposer6.startReplaceGroup(-1835479015);
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(-1835479014);
                        BalanceHomeViewKt.OverdraftBalanceSubtitle(str3, function1, gapComposer6, 0);
                        gapComposer6.end(false);
                    }
                    gapComposer6.end(false);
                } else {
                    gapComposer6.startReplaceGroup(-1835331330);
                    BalanceHomeViewModel.OverdraftPillViewModel overdraftPillViewModel = loaded.overdraftPillViewModel;
                    if (overdraftPillViewModel == null) {
                        gapComposer6.startReplaceGroup(-1835331331);
                    } else {
                        gapComposer6.startReplaceGroup(-1835331330);
                        BalanceHomeViewKt.OverdraftPill(overdraftPillViewModel, function1, gapComposer6, 0);
                    }
                    gapComposer6.end(false);
                    gapComposer6.end(false);
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                BenefitsLeafletViewKt.ButtonCta((ActionableButtonDefault) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                BankingDialogKt.OverdraftLimitsInfoSheet((BetterOverdraftViewModel.Loaded.OverdraftLimitsInfo) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            case 15:
                Function1 function12 = (Function1) obj4;
                OverdraftViewModel overdraftViewModel = (OverdraftViewModel) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                int i4 = OverdraftCoverageSheetView.$r8$clinit;
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    boolean changed2 = gapComposer7.changed(function12);
                    Object rememberedValue5 = gapComposer7.rememberedValue();
                    if (changed2 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new TransfersView$$ExternalSyntheticLambda0(i2, function12);
                        gapComposer7.updateRememberedValue(rememberedValue5);
                    }
                    SheetKt.Sheet((Function0) rememberedValue5, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1965572093, new BankingDialogKt$$ExternalSyntheticLambda2(13, (Object) overdraftViewModel, function12), gapComposer7), gapComposer7, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                BankingDialogKt.OverdraftUsageMeter((OverdraftViewModel.Loaded.OverdraftUsageViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                RecurringDepositsFirstTimeUserViewModel recurringDepositsFirstTimeUserViewModel = (RecurringDepositsFirstTimeUserViewModel) obj4;
                Function1 function13 = (Function1) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                int i5 = RecurringDepositsFirstTimeUserView.$r8$clinit;
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    BankingDialogKt.RecurringDepositsFirstTimeUser(null, recurringDepositsFirstTimeUserViewModel, function13, gapComposer8, 0);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                BankingDialogKt.BankTransferSegment((TransfersViewModel.BankTransferContent) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                BankingDialogKt.Transfers((TransfersViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                BankingDialogKt.WireTransferSegment((TransfersViewModel.WireTransferContent) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                Navigator navigator = (Navigator) obj;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                navigator.getClass();
                coroutineScope.getClass();
                SavingsAppletTilePresenter$MetroFactory savingsAppletTilePresenter$MetroFactory = ((BankingBenefitsAppletTilePresenter$Factory$Impl) obj4).delegateFactory;
                AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) savingsAppletTilePresenter$MetroFactory.analytics.invoke();
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) savingsAppletTilePresenter$MetroFactory.moneyAnalyticsService.invoke();
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) savingsAppletTilePresenter$MetroFactory.moneyFormatterFactory.invoke();
                RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) savingsAppletTilePresenter$MetroFactory.repository.invoke();
                AndroidStringManager androidStringManager = (AndroidStringManager) savingsAppletTilePresenter$MetroFactory.stringManager.invoke();
                SyncValueReader syncValueReader = (SyncValueReader) savingsAppletTilePresenter$MetroFactory.familyProfileManager.invoke();
                MoneyAnalyticsService moneyAnalyticsService = (MoneyAnalyticsService) savingsAppletTilePresenter$MetroFactory.routerFactory.invoke();
                RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) savingsAppletTilePresenter$MetroFactory.moneyNavigatorHelper.invoke();
                PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl = (PromotedAppletTilePresenter$Factory$Impl) savingsAppletTilePresenter$MetroFactory.featureFlagManager.invoke();
                KeyValue keyValue = (KeyValue) savingsAppletTilePresenter$MetroFactory.promotedAppletTilePresenterFactory.invoke();
                androidDateFormatManager.getClass();
                featureFlagManager.getClass();
                factory.getClass();
                realRouter$Factory$Impl.getClass();
                androidStringManager.getClass();
                syncValueReader.getClass();
                moneyAnalyticsService.getClass();
                realFamilyAccountsManager.getClass();
                promotedAppletTilePresenter$Factory$Impl.getClass();
                keyValue.getClass();
                Presenter.Binding start$default = Presenter.start$default(MoleculePresenterKt.asPresenter$default(new LinkedAccountsPresenter(androidDateFormatManager, featureFlagManager, factory, realRouter$Factory$Impl, androidStringManager, syncValueReader, moneyAnalyticsService, realFamilyAccountsManager, promotedAppletTilePresenter$Factory$Impl, keyValue, navigator)), coroutineScope, (LifecycleOwner) obj3);
                return new FamilyAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) start$default).getModels(), new TaxesAppletViewsModule$$ExternalSyntheticLambda1(start$default, 4), new TaxesAppletViewsModule$$ExternalSyntheticLambda1(start$default, 5), (byte) 0);
            case 22:
                BenefitsExplanationViewModel benefitsExplanationViewModel = (BenefitsExplanationViewModel) obj4;
                Function1 function14 = (Function1) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    BenefitsHomeViewKt.BenefitsHubExplanation(SizeKt.fillMaxSize(companion, 1.0f), benefitsExplanationViewModel, function14, gapComposer9, 6);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                BenefitsHomeViewKt.ActivitySection((BenefitsHomeViewModel.Content.ActivitySection) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                BenefitsHubViewModel benefitsHubViewModel = (BenefitsHubViewModel) obj4;
                Function1 function15 = (Function1) obj3;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    boolean z2 = benefitsHubViewModel instanceof BenefitsHubViewModel.Loading;
                    Object rememberedValue6 = gapComposer10.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new BenefitsHubViewKt$$ExternalSyntheticLambda2(false ? 1 : 0);
                        gapComposer10.updateRememberedValue(rememberedValue6);
                    }
                    Strings.LoadableFullScreenContent(benefitsHubViewModel, z2, null, (Function1) rememberedValue6, null, Expect_jvmKt.rememberComposableLambda(-1815243650, new SetPinViewKt$$ExternalSyntheticLambda4(11, function15), gapComposer10), gapComposer10, 199680, 20);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                BenefitsHubViewModel.Loaded.CommonQuestionsViewModel.QuestionAndAnswer questionAndAnswer = (BenefitsHubViewModel.Loaded.CommonQuestionsViewModel.QuestionAndAnswer) obj4;
                Function1 function16 = (Function1) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    String str4 = questionAndAnswer.answer;
                    TextStyle textStyle = ((Typography) gapComposer11.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    ((DefaultSizes) gapComposer11.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    boolean changed3 = gapComposer11.changed(function16);
                    Object rememberedValue7 = gapComposer11.rememberedValue();
                    if (changed3 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function16, r9, 17);
                        gapComposer11.updateRememberedValue(rememberedValue7);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(str4, (Function2) rememberedValue7, m302paddingqDBjuR0$default, textStyle, 0L, null, null, null, 0, 0, 0, gapComposer11, 0, 2032);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Icons icons = (Icons) obj4;
                BenefitsHubViewModel.Loaded.PageHeaderViewModel pageHeaderViewModel = (BenefitsHubViewModel.Loaded.PageHeaderViewModel) obj3;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    com.squareup.protos.cash.ui.Color color2 = pageHeaderViewModel.icon.tint_color;
                    if (color2 == null) {
                        gapComposer12.startReplaceGroup(861653828);
                        gapComposer12.end(false);
                    } else {
                        color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer12, 304889949, color2, gapComposer12, false);
                    }
                    if (color == null) {
                        gapComposer12.startReplaceGroup(304891451);
                        Colors colors2 = (Colors) gapComposer12.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer12, -1762997026, gapComposer12, false);
                        } else {
                            gapComposer12.startReplaceGroup(-1762997739);
                            gapComposer12.end(false);
                        }
                        j = colors2.semantic.icon.standard;
                        gapComposer12.end(false);
                    } else {
                        gapComposer12.startReplaceGroup(304889250);
                        gapComposer12.end(false);
                        j = color.value;
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, j, gapComposer12, 48, 4);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                BenefitsHubViewKt.BenefitsStatus((BenefitsHubViewModel.Loaded.PageHeaderViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                BenefitsHubViewKt.DefaultPerks((BenefitsHubViewModel.Loaded.DefaultPerksViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                BenefitsHubViewKt.DefaultPerkItem((BenefitsHubViewModel.Loaded.DefaultPerk) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BadgeKt$$ExternalSyntheticLambda2(Modifier modifier, Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = modifier;
        this.f$0 = obj;
    }

    public /* synthetic */ BadgeKt$$ExternalSyntheticLambda2(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
