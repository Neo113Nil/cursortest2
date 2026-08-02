package com.squareup.cash.p2pblocking.views;

import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.material.DismissDirection;
import androidx.compose.material.DismissState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextPainterKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.EmbeddedHeaderScope;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.list.ListOrderedKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.viewmodels.plugins.CellActionCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.NavigationCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.PromptButtonListViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.SlotContentViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.SlottedCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.TextCardViewModel;
import com.squareup.cash.moneybot.viewmodels.staticpicker.MoneybotStaticPickerViewModel;
import com.squareup.cash.moneybot.viewmodels.textinput.MoneybotTextInputViewModel;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda8;
import com.squareup.cash.moneybot.views.plugins.SlottedCardKt;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.mooncake.compose_ui.components.LoadingIndicatorPosition;
import com.squareup.cash.nearby.viewmodels.ListSection;
import com.squareup.cash.nearby.viewmodels.NearbyOrderedListsViewModel;
import com.squareup.cash.offers.viewmodels.OffersDetailsSheetViewModelV2;
import com.squareup.cash.offers.viewmodels.OffersGreenStatusViewModel;
import com.squareup.cash.offers.viewmodels.OffersTimelineViewModel$OffersTimelineSheet;
import com.squareup.cash.offers.viewmodels.OffersTimelineViewModelV2;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel;
import com.squareup.cash.offers.views.home.OffersHeroTileKt;
import com.squareup.cash.onboarding.accountpicker.views.AccountPickerViewKt$WhenMappings;
import com.squareup.cash.onboarding.viewmodels.OnboardingLandingViewModel;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PFailureDialogModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PListButtonValues;
import com.squareup.cash.passkeys.viewmodels.PasskeyUpsellViewModel;
import com.squareup.cash.passkeys.views.PasskeyOperationSheetButton;
import com.squareup.cash.paychecks.viewmodels.DistributePaycheckViewModel;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewModel;
import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.paychecks.views.PaycheckDistributionWheel$PlacementConfig;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.protos.cash.shop.rendering.api.HeroSection;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.ScaledSizeKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt___StringsKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class P2PListViewKt$$ExternalSyntheticLambda12 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ P2PListViewKt$$ExternalSyntheticLambda12(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    private final Object invoke$com$squareup$cash$onboarding$accountpicker$views$AccountPickerViewKt$$ExternalSyntheticLambda27(Object obj, Object obj2, Object obj3) {
        long j;
        DismissState dismissState = (DismissState) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16);
        Applier applier = gapComposer.applier;
        if (shouldExecute) {
            ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = dismissState.offsetState;
            DismissDirection dismissDirection = ((Number) parcelableSnapshotMutableFloatState.getValue()).floatValue() == RecyclerView.DECELERATION_RATE ? null : ((Number) parcelableSnapshotMutableFloatState.getValue()).floatValue() > RecyclerView.DECELERATION_RATE ? DismissDirection.StartToEnd : DismissDirection.EndToStart;
            int i = dismissDirection == null ? -1 : AccountPickerViewKt$WhenMappings.$EnumSwitchMapping$0[dismissDirection.ordinal()];
            if (i == 1 || i == 2) {
                gapComposer.startReplaceGroup(638644040);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.text.danger;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(638646405);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.background.f1047app;
                gapComposer.end(false);
            }
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterEnd, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(4.0f, false, new StreamSharing$$ExternalSyntheticLambda1(Alignment.Companion.CenterVertically, 17)), Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Trace.m1191Iconww6aTOc(Icons.Clear24, (String) null, (Modifier) null, Strings.getColors(gapComposer).component.button.destructive.prominent.text.f153default, gapComposer, 54, 4);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).component.button.destructive.prominent.text.f153default, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).buttonCompact, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.account_picker_remove), (Map) null, (Function1) null, false);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$onboarding$views$OnboardingLandingViewKt$$ExternalSyntheticLambda11(Object obj, Object obj2, Object obj3) {
        OnboardingLandingViewModel onboardingLandingViewModel = (OnboardingLandingViewModel) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, onboardingLandingViewModel.ctaText, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$p2pblocking$views$AllowlistSelectionKt$$ExternalSyntheticLambda9(Object obj, Object obj2, Object obj3) {
        AllowlistSelectionViewModel allowlistSelectionViewModel = (AllowlistSelectionViewModel) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            String str = allowlistSelectionViewModel.selectedContactsTitle;
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            ViewfinderDefaults.SectionHeader(str, SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2), (String) null, (Function0) null, (String) null, gapComposer, 0, 28);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$p2pblocking$views$P2PBlockFailureDialogKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        P2PFailureDialogModel p2PFailureDialogModel = (P2PFailureDialogModel) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, p2PFailureDialogModel.dismissButtonText, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$passkeys$views$PasskeyManagementViewKt$$ExternalSyntheticLambda42(Object obj, Object obj2, Object obj3) {
        PasskeyOperationSheetButton passkeyOperationSheetButton = (PasskeyOperationSheetButton) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, passkeyOperationSheetButton.text, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$passkeys$views$PasskeyUpsellViewKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        PasskeyUpsellViewModel passkeyUpsellViewModel = (PasskeyUpsellViewModel) this.f$0;
        ScrollingScaffoldContentScope scrollingScaffoldContentScope = (ScrollingScaffoldContentScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        scrollingScaffoldContentScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(scrollingScaffoldContentScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Countries.PageHeader(passkeyUpsellViewModel.headerText, (Modifier) null, Expect_jvmKt.rememberComposableLambda(1496263197, new SuggestionUiKt$$ExternalSyntheticLambda8(passkeyUpsellViewModel, 22), gapComposer), passkeyUpsellViewModel.detailText, gapComposer, MLKEMEngine.KyberPolyBytes, 2);
            if (passkeyUpsellViewModel.isRegistering) {
                gapComposer.startReplaceGroup(-893603010);
                Modifier weight = scrollingScaffoldContentScope.weight(1.0f, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), true);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, weight);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (gapComposer.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-893462704);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$paychecks$views$ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda10(Object obj, Object obj2, Object obj3) {
        PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleHeaderViewModel benefitsModuleHeaderViewModel = (PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleHeaderViewModel) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, benefitsModuleHeaderViewModel.button.text, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$paychecks$views$ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda20(Object obj, Object obj2, Object obj3) {
        PaychecksHomeViewModel.Content.Section.ArcadeActivity arcadeActivity = (PaychecksHomeViewModel.Content.Section.ArcadeActivity) this.f$0;
        EmbeddedHeaderScope embeddedHeaderScope = (EmbeddedHeaderScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        embeddedHeaderScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(embeddedHeaderScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String str = arcadeActivity.title;
            boolean changedInstance = gapComposer.changedInstance(arcadeActivity);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda5(arcadeActivity, 23);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            embeddedHeaderScope.DefaultHeaderWithoutSpace((intValue << 9) & 7168, 2, gapComposer, str, null, (Function0) rememberedValue);
            String str2 = arcadeActivity.subtitle;
            if (str2 == null) {
                gapComposer.startReplaceGroup(-2136048924);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-2136048923);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                LazyDslKt.m304MarkdownTextpCuZGqc(str2, null, m300paddingVpY3zN4$default, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, colors.semantic.text.subtle, null, null, null, 0, 0, 0, gapComposer, 48, 2016);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$paychecks$views$ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda27(Object obj, Object obj2, Object obj3) {
        PaychecksHomeViewModel.Content.Section.DistributionsNullState distributionsNullState = (PaychecksHomeViewModel.Content.Section.DistributionsNullState) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, distributionsNullState.callToActionButtonText, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$paychecks$views$ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda44(Object obj, Object obj2, Object obj3) {
        PaychecksHomeViewModel.Content.Section.DirectDeposit.PendingDirectDeposit.PendingDirectDepositSheetContent pendingDirectDepositSheetContent = (PaychecksHomeViewModel.Content.Section.DirectDeposit.PendingDirectDeposit.PendingDirectDepositSheetContent) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, pendingDirectDepositSheetContent.buttonText, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$paychecks$views$DistributePaycheckViewKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        DistributePaycheckViewModel.Loaded loaded = (DistributePaycheckViewModel.Loaded) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((BoxScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            HelpSheetViewKt.PaycheckDistributionWheel(loaded.wheelViewModel, PaycheckDistributionWheel$PlacementConfig.ARCADE_DISTRIBUTION_FLOW, null, null, null, null, null, gapComposer, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v30 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        Unit unit;
        boolean z2;
        boolean z3;
        String str;
        ?? r15;
        ComposableLambdaImpl composableLambdaImpl;
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl;
        long j;
        Object valueOf;
        Color m;
        int i = this.$r8$classId;
        Object obj4 = Composer.Companion.Empty;
        int i2 = -1762997739;
        int i3 = -1762997026;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                P2PListButtonValues p2PListButtonValues = (P2PListButtonValues) obj5;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, p2PListButtonValues.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                CellActionCardViewModel.ButtonGroup buttonGroup = (CellActionCardViewModel.ButtonGroup) obj5;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonGroup.primaryButton.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                NavigationCardViewModel navigationCardViewModel = (NavigationCardViewModel) obj5;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(companion2, null, 3);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer3, 48);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, wrapContentSize$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Strings.getSizes(gapComposer3).getClass();
                    DefaultSizes.spacing.getClass();
                    TextViewKt.Avatar(AvatarSize.Size32, AvatarsKt.toAvatarEntry(navigationCardViewModel.avatar, null, gapComposer3, 1), SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11), false, gapComposer3, 6, 24);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer3).semantic.text.standard, (Composer) gapComposer3, (Modifier) new LayoutWeightElement(1.0f, false), Strings.getTypography(gapComposer3).button, (TextLineBalancing) null, navigationCardViewModel.cta, (Map) null, (Function1) null, false);
                    Trace.m1191Iconww6aTOc(Icons.Push24, (String) null, (Modifier) null, Strings.getColors(gapComposer3).semantic.icon.subtle, gapComposer3, 54, 4);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                PromptButtonListViewModel.Button button = (PromptButtonListViewModel.Button) obj5;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                SlottedCardViewModel slottedCardViewModel = (SlottedCardViewModel) obj5;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, 0);
                    int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer5, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer5).semantic.text.standard, (Composer) gapComposer5, SizeKt.fillMaxWidth(companion, 1.0f), Strings.getTypography(gapComposer5).labelMedium, (TextLineBalancing) null, slottedCardViewModel.label, (Map) null, (Function1) null, false);
                    Strings.getSizes(gapComposer5).getClass();
                    Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 16.0f, gapComposer5);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer5).semantic.text.standard, (Composer) gapComposer5, SizeKt.fillMaxWidth(companion, 1.0f), Strings.getTypography(gapComposer5).headlineSmall, (TextLineBalancing) null, slottedCardViewModel.text, (Map) null, (Function1) null, false);
                    SlotContentViewModel slotContentViewModel = slottedCardViewModel.slotContent;
                    if (slotContentViewModel == null) {
                        gapComposer5.startReplaceGroup(867658969);
                        z = false;
                        gapComposer5.end(false);
                        unit = null;
                    } else {
                        z = false;
                        gapComposer5.startReplaceGroup(867658970);
                        SlottedCardKt.SlotContentHost(slotContentViewModel, slottedCardViewModel.animationKey, SizeKt.m279heightInVpY3zN4$default(companion, 252.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer5, MLKEMEngine.KyberPolyBytes);
                        re$$ExternalSyntheticOutline0.m(companion, 24.0f, gapComposer5, false);
                        unit = Unit.INSTANCE;
                    }
                    if (unit == null) {
                        gapComposer5.startReplaceGroup(1136375167);
                        Strings.getSizes(gapComposer5).getClass();
                        SpacerKt.Spacer(gapComposer5, SizeKt.m277height3ABfNKs(companion, 32.0f));
                    } else {
                        gapComposer5.startReplaceGroup(1136367138);
                    }
                    gapComposer5.end(z);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer5).semantic.text.subtle, (Composer) gapComposer5, SizeKt.fillMaxWidth(companion, 1.0f), Strings.getTypography(gapComposer5).bodyMedium, (TextLineBalancing) null, slottedCardViewModel.subtext, (Map) null, (Function1) null, false);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                TemplateCardViewModel.TapBehavior.ButtonGroup.Button button2 = (TemplateCardViewModel.TapBehavior.ButtonGroup.Button) obj5;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (!gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    gapComposer6.skipToGroupEnd();
                } else if (button2.isLoading) {
                    gapComposer6.startReplaceGroup(1346363350);
                    TextStyle textStyle = (TextStyle) gapComposer6.consume(ArcadeThemeKt.LocalTextStyle);
                    if (textStyle == null) {
                        gapComposer6.startReplaceGroup(-1100573765);
                        textStyle = ((Typography) gapComposer6.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                        z2 = false;
                    } else {
                        z2 = false;
                        gapComposer6.startReplaceGroup(-1100574912);
                    }
                    gapComposer6.end(z2);
                    Modifier m3994scaleHeightToTextHeightr9BaKPg = ScaledSizeKt.m3994scaleHeightToTextHeightr9BaKPg(companion, textStyle.paragraphStyle.lineHeight, gapComposer6);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, z2);
                    int hashCode3 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer6, m3994scaleHeightToTextHeightr9BaKPg);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer6.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer6, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer6, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer6, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer6, SizeKt.m285size3ABfNKs(companion, 24.0f));
                    gapComposer6.end(true);
                    gapComposer6.end(false);
                } else {
                    gapComposer6.startReplaceGroup(1346594393);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button2.text, (Map) null, (Function1) null, false);
                    gapComposer6.end(false);
                }
                return Unit.INSTANCE;
            case 6:
                TemplateCardViewModel.Icon icon = (TemplateCardViewModel.Icon) obj5;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode4 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer7, fillMaxSize);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer7.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    if (icon instanceof TemplateCardViewModel.Icon.Avatar) {
                        gapComposer7.startReplaceGroup(783413315);
                        TextViewKt.Avatar(AvatarSize.Size32, AvatarsKt.toAvatarEntry(((TemplateCardViewModel.Icon.Avatar) icon).avatar, null, gapComposer7, 1), null, false, gapComposer7, 6, 28);
                        gapComposer7.end(false);
                    } else if (icon instanceof TemplateCardViewModel.Icon.SavingsGoalIcon) {
                        gapComposer7.startReplaceGroup(783579723);
                        TemplateCardViewModel.Icon.SavingsGoalIcon savingsGoalIcon = (TemplateCardViewModel.Icon.SavingsGoalIcon) icon;
                        VisibleKt.m3496ProgressEmojiIconLzaahlw(savingsGoalIcon.iconId, savingsGoalIcon.progress, SizeKt.m285size3ABfNKs(companion, 32.0f), 2.0f, RecyclerView.DECELERATION_RATE, 0L, 0L, 0L, gapComposer7, 3456, IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                        gapComposer7.end(false);
                    } else {
                        if (!(icon instanceof TemplateCardViewModel.Icon.TransferOptionIcon)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer7, 1964931881, false);
                        }
                        gapComposer7.startReplaceGroup(783829242);
                        z3 = true;
                        TextCardKt.TransferOptionIcon(((TemplateCardViewModel.Icon.TransferOptionIcon) icon).icon, AvatarSize.Size32, true, gapComposer7, 432);
                        gapComposer7.end(false);
                        gapComposer7.end(z3);
                    }
                    z3 = true;
                    gapComposer7.end(z3);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                TextCardViewModel textCardViewModel = (TextCardViewModel) obj5;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                boolean shouldExecute = gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16);
                Applier applier = gapComposer8.applier;
                if (shouldExecute) {
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer8, 48);
                    int hashCode5 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer8, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$15);
                    } else {
                        gapComposer8.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer8, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf2 = Integer.valueOf(hashCode5);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer8, valueOf2, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer8, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer8).semantic.text.standard, (Composer) gapComposer8, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer8, materializeModifier5, composeUiNode$Companion$SetModifier$14, 1.0f, true), Strings.getTypography(gapComposer8).labelMedium, (TextLineBalancing) null, textCardViewModel.text, (Map) null, (Function1) null, false);
                    SpacerKt.Spacer(gapComposer8, SizeKt.m290width3ABfNKs(companion, 12.0f));
                    Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 44.0f), RoundedCornerShapeKt.CircleShape);
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode6 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer8, clip);
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$15);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode6, gapComposer8, composeUiNode$Companion$SetModifier$13, gapComposer8, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer8, materializeModifier6, composeUiNode$Companion$SetModifier$14);
                    ImageKt.Image(Countries.painterResource(TextCardKt.GRADIENT_DRAWABLES[textCardViewModel.gradientIndex], 0, gapComposer8), null, SizeKt.fillMaxSize(companion, 1.0f), null, ContentScale.Companion.Crop, RecyclerView.DECELERATION_RATE, null, gapComposer8, Painter.$stable | 25008, 104);
                    Trace.m1191Iconww6aTOc(Icons.SendArrow24, (String) null, (Modifier) null, Strings.getColors(gapComposer8).semantic.background.inverse, gapComposer8, 54, 4);
                    gapComposer8.end(true);
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                MoneybotStaticPickerViewModel moneybotStaticPickerViewModel = (MoneybotStaticPickerViewModel) obj5;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, moneybotStaticPickerViewModel.cta, (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                MoneybotTextInputViewModel moneybotTextInputViewModel = (MoneybotTextInputViewModel) obj5;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, moneybotTextInputViewModel.cta, (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                TransactorKt.LoadingPlaceholder(SizeKt.fillMaxSize(companion, 1.0f), (LoadingIndicatorPosition) obj5, (Composer) obj2, 6, 0);
                return Unit.INSTANCE;
            case 11:
                NearbyOrderedListsViewModel nearbyOrderedListsViewModel = (NearbyOrderedListsViewModel) obj5;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((ScrollingScaffoldContentScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Countries.PageHeader(nearbyOrderedListsViewModel.title, (Modifier) null, (Function2) null, (String) null, gapComposer11, 0, 14);
                    int i4 = 0;
                    for (Object obj6 : nearbyOrderedListsViewModel.sections) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        ListSection listSection = (ListSection) obj6;
                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer11, null);
                        if (i4 == 0 && listSection.title.length() == 0) {
                            str = listSection.description;
                            if (str == null) {
                                str = nearbyOrderedListsViewModel.description;
                            }
                        } else {
                            str = listSection.description;
                        }
                        if (listSection.title.length() > 0) {
                            gapComposer11.startReplaceGroup(-1096040309);
                            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-865035679, new SuggestionUiKt$$ExternalSyntheticLambda8(listSection, 14), gapComposer11);
                            if (str == null) {
                                gapComposer11.startReplaceGroup(-1095930911);
                                r15 = 0;
                                gapComposer11.end(false);
                                composableLambdaImpl = null;
                            } else {
                                r15 = 0;
                                gapComposer11.startReplaceGroup(-1095930910);
                                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1480614792, new PoolCreateViewKt$$ExternalSyntheticLambda5(str, 19), gapComposer11);
                                gapComposer11.end(false);
                                composableLambdaImpl = rememberComposableLambda2;
                            }
                            ViewfinderDefaults.SectionHeader(rememberComposableLambda, (Modifier) null, (Function2) null, (Function0) null, composableLambdaImpl, gapComposer11, 6, 14);
                            DBUtil.SpacerWithinSectionMedium(r15, 1, gapComposer11, null);
                            gapComposer11.end(r15);
                        } else if (str != null) {
                            gapComposer11.startReplaceGroup(-1095785241);
                            TextStyle textStyle2 = ((Typography) gapComposer11.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                            Colors colors = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer11, i3, gapComposer11, false);
                            } else {
                                gapComposer11.startReplaceGroup(i2);
                                gapComposer11.end(false);
                            }
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer11, SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, ((Dp) gapComposer11.consume(ArcadeThemeKt.LocalScreenMargin)).value, RecyclerView.DECELERATION_RATE, 2), 1.0f), textStyle2, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer11, null);
                            gapComposer11.end(false);
                        } else {
                            gapComposer11.startReplaceGroup(-1095443776);
                            gapComposer11.end(false);
                        }
                        boolean changedInstance = gapComposer11.changedInstance(listSection);
                        Object rememberedValue = gapComposer11.rememberedValue();
                        if (changedInstance || rememberedValue == obj4) {
                            rememberedValue = new Overlay$$ExternalSyntheticLambda0(listSection, 16);
                            gapComposer11.updateRememberedValue(rememberedValue);
                        }
                        ListOrderedKt.ListOrderedStandard(0, 1, gapComposer11, (Modifier) null, (Function1) rememberedValue);
                        i4 = i5;
                        i2 = -1762997739;
                        i3 = -1762997026;
                    }
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                OffersGreenStatusViewModel offersGreenStatusViewModel = (OffersGreenStatusViewModel) obj5;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, offersGreenStatusViewModel.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.Standard.OfferStandardButton offerStandardButton = (OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.Standard.OfferStandardButton) obj5;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    Icons icons = Icons.LinkOut24;
                    ((DefaultSizes) gapComposer13.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Trace.m1191Iconww6aTOc(icons, (String) null, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 11), 0L, gapComposer13, 54, 8);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, offerStandardButton.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton offerDetailsButton = (OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton) obj5;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4092, 0L, (Composer) gapComposer14, SizeKt.fillMaxWidth(companion, 1.0f), (TextStyle) null, (TextLineBalancing) null, ((OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.Standard) offerDetailsButton).primaryButton.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile currentTile = (OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile) obj5;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl2 = (BoxWithConstraintsScopeImpl) obj;
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                boxWithConstraintsScopeImpl2.getClass();
                Density density = boxWithConstraintsScopeImpl2.density;
                int i6 = 1;
                long j2 = boxWithConstraintsScopeImpl2.constraints;
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((GapComposer) composer15).changed(boxWithConstraintsScopeImpl2) ? 4 : 2;
                }
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 19) != 18)) {
                    TextMeasurer rememberTextMeasurer = TextPainterKt.rememberTextMeasurer(gapComposer15);
                    float fontScale = ((Density) gapComposer15.consume(CompositionLocalsKt.LocalDensity)).getFontScale();
                    Object rememberedValue2 = gapComposer15.rememberedValue();
                    if (rememberedValue2 == obj4) {
                        rememberedValue2 = Updater.mutableStateOf$default(Boolean.TRUE);
                        gapComposer15.updateRememberedValue(rememberedValue2);
                    }
                    MutableState mutableState = (MutableState) rememberedValue2;
                    boolean changed = gapComposer15.changed(currentTile.title) | gapComposer15.changed(currentTile.subtitle) | gapComposer15.changed(((Boolean) mutableState.getValue()).booleanValue());
                    Object rememberedValue3 = gapComposer15.rememberedValue();
                    if (changed || rememberedValue3 == obj4) {
                        rememberedValue3 = OffersHeroTileKt.createHeroText(currentTile, ((Boolean) mutableState.getValue()).booleanValue());
                        gapComposer15.updateRememberedValue(rememberedValue3);
                    }
                    String str2 = (String) rememberedValue3;
                    Object rememberedValue4 = gapComposer15.rememberedValue();
                    if (rememberedValue4 == obj4) {
                        rememberedValue4 = currentTile.displayStyle != HeroSection.HeroTile.DisplayStyle.TALL ? new ParcelableSnapshotMutableIntState(2) : new ParcelableSnapshotMutableIntState(3);
                        gapComposer15.updateRememberedValue(rememberedValue4);
                    }
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue4;
                    TextStyle textStyle3 = ((Typography) gapComposer15.consume(ArcadeThemeKt.LocalTypography)).hero;
                    boolean changed2 = gapComposer15.changed(j2) | gapComposer15.changed(str2) | gapComposer15.changed(rememberTextMeasurer);
                    Object rememberedValue5 = gapComposer15.rememberedValue();
                    if (changed2 || rememberedValue5 == obj4) {
                        String str3 = str2;
                        int i7 = 48;
                        boolean z4 = false;
                        while (i7 > 32) {
                            j = j2;
                            TextMeasurer textMeasurer = rememberTextMeasurer;
                            TextLayoutResult m979measurewNUYSr0$default = TextMeasurer.m979measurewNUYSr0$default(textMeasurer, str3, OffersHeroTileKt.m3681copyWithFontSizeMatchingLineHeightgP2Z1ig(textStyle3, i7, fontScale, null), parcelableSnapshotMutableIntState.getIntValue(), boxWithConstraintsScopeImpl2.constraints, 972);
                            str2 = str3;
                            MultiParagraph multiParagraph = m979measurewNUYSr0$default.multiParagraph;
                            if (m979measurewNUYSr0$default.getDidOverflowHeight() && ((Boolean) mutableState.getValue()).booleanValue()) {
                                mutableState.setValue(Boolean.FALSE);
                                str3 = OffersHeroTileKt.createHeroText(currentTile, false);
                            } else {
                                if (m979measurewNUYSr0$default.getDidOverflowHeight()) {
                                    i7 -= 2;
                                } else {
                                    int i8 = multiParagraph.lineCount;
                                    int i9 = i6;
                                    if (i8 <= i9 || z4) {
                                        boxWithConstraintsScopeImpl = boxWithConstraintsScopeImpl2;
                                        valueOf = Integer.valueOf(i7);
                                        gapComposer15.updateRememberedValue(valueOf);
                                    } else {
                                        int i10 = i8 - 1;
                                        int i11 = i9;
                                        int i12 = 0;
                                        while (i12 < i10) {
                                            BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl3 = boxWithConstraintsScopeImpl2;
                                            Character orNull = StringsKt___StringsKt.getOrNull(multiParagraph.getLineEnd(i12, false) - 1, str2);
                                            if (orNull == null || Character.isLetterOrDigit(orNull.charValue()) != i11) {
                                                i12++;
                                                z4 = true;
                                                i11 = 1;
                                                boxWithConstraintsScopeImpl2 = boxWithConstraintsScopeImpl3;
                                            } else {
                                                i7 -= 2;
                                                z4 = false;
                                                i6 = 1;
                                                boxWithConstraintsScopeImpl2 = boxWithConstraintsScopeImpl3;
                                            }
                                        }
                                        str3 = str2;
                                        j2 = j;
                                        rememberTextMeasurer = textMeasurer;
                                        i6 = 1;
                                    }
                                }
                                str3 = str2;
                            }
                            j2 = j;
                            rememberTextMeasurer = textMeasurer;
                        }
                        boxWithConstraintsScopeImpl = boxWithConstraintsScopeImpl2;
                        j = j2;
                        str2 = str3;
                        valueOf = Integer.valueOf(i7);
                        gapComposer15.updateRememberedValue(valueOf);
                    } else {
                        boxWithConstraintsScopeImpl = boxWithConstraintsScopeImpl2;
                        valueOf = rememberedValue5;
                        j = j2;
                    }
                    String str4 = str2;
                    int intValue16 = ((Number) valueOf).intValue();
                    Modifier m288sizeInqDBjuR0 = SizeKt.m288sizeInqDBjuR0(companion, density.mo233toDpu2uoSUM(Constraints.m1027getMinWidthimpl(j)), density.mo233toDpu2uoSUM(Constraints.m1026getMinHeightimpl(j)), boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM(), boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM());
                    StyledText styledText = currentTile.title;
                    com.squareup.protos.cash.ui.Color color = styledText != null ? styledText.text_color : null;
                    if (color == null) {
                        gapComposer15.startReplaceGroup(-1295599329);
                        gapComposer15.end(false);
                        m = null;
                    } else {
                        m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer15, 789490466, color, gapComposer15, false);
                    }
                    BasicTextKt.m347BasicTextRWo7tUw(str4, m288sizeInqDBjuR0, OffersHeroTileKt.m3681copyWithFontSizeMatchingLineHeightgP2Z1ig(textStyle3, intValue16, fontScale, new Color(m != null ? m.value : Color.White)), null, 2, false, parcelableSnapshotMutableIntState.getIntValue(), 0, null, gapComposer15, 24576, 936);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                OffersTimelineViewModel$OffersTimelineSheet offersTimelineViewModel$OffersTimelineSheet = (OffersTimelineViewModel$OffersTimelineSheet) obj5;
                Composer composer16 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(1 & intValue17, (intValue17 & 17) != 16)) {
                    String str5 = offersTimelineViewModel$OffersTimelineSheet.buttonText;
                    Colors colors2 = (Colors) gapComposer16.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer16, -1762997026, gapComposer16, false);
                    } else {
                        gapComposer16.startReplaceGroup(-1762997739);
                        gapComposer16.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors2.component.button.prominent.text.f162default, (Composer) gapComposer16, (Modifier) Modifier.Companion.$$INSTANCE, ((Typography) gapComposer16.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                OffersTimelineViewModelV2 offersTimelineViewModelV2 = (OffersTimelineViewModelV2) obj5;
                Composer composer17 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, offersTimelineViewModelV2.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                return invoke$com$squareup$cash$onboarding$accountpicker$views$AccountPickerViewKt$$ExternalSyntheticLambda27(obj, obj2, obj3);
            case 19:
                return invoke$com$squareup$cash$onboarding$views$OnboardingLandingViewKt$$ExternalSyntheticLambda11(obj, obj2, obj3);
            case 20:
                return invoke$com$squareup$cash$p2pblocking$views$AllowlistSelectionKt$$ExternalSyntheticLambda9(obj, obj2, obj3);
            case 21:
                return invoke$com$squareup$cash$p2pblocking$views$P2PBlockFailureDialogKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 22:
                return invoke$com$squareup$cash$passkeys$views$PasskeyManagementViewKt$$ExternalSyntheticLambda42(obj, obj2, obj3);
            case 23:
                return invoke$com$squareup$cash$passkeys$views$PasskeyUpsellViewKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 24:
                return invoke$com$squareup$cash$paychecks$views$ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda10(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$paychecks$views$ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda20(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$paychecks$views$ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda27(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$paychecks$views$ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda44(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$paychecks$views$DistributePaycheckViewKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            default:
                EditDistributionViewModel.Content content = (EditDistributionViewModel.Content) obj5;
                Composer composer18 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content.primaryAction.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
