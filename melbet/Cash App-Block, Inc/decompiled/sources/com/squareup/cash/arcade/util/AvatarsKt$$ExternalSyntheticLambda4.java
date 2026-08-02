package com.squareup.cash.arcade.util;

import android.view.TextureView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.DebugUtils;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.AppBarKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.ui.Ui;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.network.NetworkFetcher$fetch$2;
import com.fillr.e;
import com.google.android.gms.internal.common.zzj;
import com.nimbusds.jose.JWECryptoParts;
import com.plaid.internal.EnumC0170g;
import com.squareup.cardcustomizations.signature.SignaturesKt$Signature$1$1;
import com.squareup.cash.activity.viewmodels.ActivityTabViewModel;
import com.squareup.cash.activity.views.ActivityTabViewKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.afterpayapplet.views.homesection.LegalSectionKt;
import com.squareup.cash.amountslider.TickersAmountCaptionKt;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.RealToastIconScope;
import com.squareup.cash.arcade.components.ScreenScaffoldContentScope;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.avatar.DiagonalAvatarValues;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.internal.InputState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel;
import com.squareup.cash.bitcoin.views.deposits.copy.BitcoinAddressCopySheetViewKt;
import com.squareup.cash.blockers.views.AmountBlockerViewKt;
import com.squareup.cash.blockers.views.BirthdayViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.views.BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3;
import com.squareup.cash.borrow.views.BulletinInfoOverlayKt;
import com.squareup.cash.card.onboarding.CardStudioViewKt;
import com.squareup.cash.card.onboarding.CardStudioViewModel;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.card.onboarding.graphics.scene.CardGridNuxScene;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.cashapppay.viewmodels.GrantViewModel;
import com.squareup.cash.checks.ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.common.composeui.AddedPaddingValues;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.core.navigationcontainer.UiContainer;
import com.squareup.cash.core.navigationcontainer.UiContainerKt;
import com.squareup.cash.core.navigationcontainer.UiContainerKt$BottomSheet$1$sheetScope$1;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.squareup.cash.discover.promotiondetails.viewmodels.PromotionDetailsViewModel;
import com.squareup.cash.discover.promotiondetails.views.PromotionDetailsViewKt$PromotionDetailsUi$1$1$1$1;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.views.home.EarningsHomeKt;
import com.squareup.cash.earningstracker.viewmodels.EarningsTrackerViewModel;
import com.squareup.cash.earningstracker.views.EarningsTrackerViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.family.familyhub.views.FamilyMemberRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.favorites.components.AddFavoritesViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.formview.components.arcade.ArcadeFormCellDefaultElementKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormDateInputView;
import com.squareup.cash.formview.components.arcade.ArcadeFormEmojiPickerKt;
import com.squareup.cash.formview.viewmodels.FormDateInputViewModel;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$2$1$1;
import com.squareup.cash.performance.RealScrollPerformanceTrackerFactory;
import com.squareup.cash.scrubbing.DateScrubber;
import com.squareup.cash.scrubbing.MaskVisualTransformation;
import com.squareup.cash.scrubbing.PersistentMaskVisualTransformation;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda0;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cropview.Edge;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.util.compose.SharedViewEventsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.serialization.descriptors.ContextAwareKt;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes5.dex */
public final /* synthetic */ class AvatarsKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda4(DirectoryListItem.Header header, Modifier modifier, RealImageLoader realImageLoader, PaddingValuesImpl paddingValuesImpl, Ui.EventReceiver eventReceiver, int i) {
        this.$r8$classId = 19;
        this.f$0 = header;
        this.f$2 = modifier;
        this.f$1 = realImageLoader;
        this.f$3 = paddingValuesImpl;
        this.f$4 = eventReceiver;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PromotionDetailsViewModel promotionDetailsViewModel;
        PromotionDetailsViewModel.DetailsPageData.DetailsPageV1 detailsPageV1;
        long j;
        AvatarImage.Remote.Image image;
        ComposableLambdaImpl composableLambdaImpl;
        int i = this.$r8$classId;
        int i2 = 19;
        Modifier modifier = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i3 = 1;
        Object obj3 = this.f$4;
        Object obj4 = this.f$3;
        Object obj5 = this.f$2;
        Object obj6 = this.f$1;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AvatarsKt.DiagonalStackedAvatars((DiagonalAvatarValues) obj7, (StackedAvatarViewModel) obj6, (Modifier) obj5, (AvatarSize) obj4, (Function3) obj3, (Composer) obj, Updater.updateChangedFlags(3079));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ContextAwareKt.MarkdownParagraph((String) obj7, (ASTNodeImpl) obj6, (Modifier) obj5, (TextStyle) obj4, (JWECryptoParts) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ActivityTabViewKt.ActivityFeed((Modifier) obj5, (ActivityTabViewModel) obj7, (Function1) obj6, (LazyListState) obj4, (RealScrollPerformanceTrackerFactory) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 3:
                ScrollState scrollState = (ScrollState) obj7;
                PaddingValues paddingValues = (PaddingValues) obj6;
                SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj5;
                Placeable placeable = (Placeable) obj4;
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(modifier, 1.0f), scrollState, false, 14);
                    PaddingValuesImpl m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, subcomposeMeasureScope.mo233toDpu2uoSUM(placeable.height), 7);
                    paddingValues.getClass();
                    Modifier padding = SpacerKt.padding(verticalScroll$default, new AddedPaddingValues(paddingValues, m297PaddingValuesa9UjIt4$default));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, padding);
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
                    Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl2, gapComposer, true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                LegalSectionKt.RetroCellActivity((Modifier) obj5, (List) obj7, (Function1) obj6, (Function2) obj4, (Function2) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                TickersAmountCaptionKt.ReadyContent((AmountPickerViewModel.Ready) obj7, (AmountConfig) obj6, (Function1) obj4, (Modifier) obj5, (Function3) obj3, (Composer) obj, Updater.updateChangedFlags(65));
                return Unit.INSTANCE;
            case 6:
                AmountPickerViewModel amountPickerViewModel = (AmountPickerViewModel) obj7;
                AmountConfig amountConfig = (AmountConfig) obj6;
                Function1 function1 = (Function1) obj4;
                Modifier modifier2 = (Modifier) obj5;
                Function3 function3 = (Function3) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    TickersAmountCaptionKt.ReadyContent((AmountPickerViewModel.Ready) amountPickerViewModel, amountConfig, function1, modifier2, function3, gapComposer2, 64);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Function3 function32 = (Function3) obj3;
                ComposableLambdaImpl composableLambdaImpl3 = (ComposableLambdaImpl) obj7;
                Function2 function2 = (Function2) obj6;
                Function3 function33 = (Function3) obj5;
                MutableState mutableState = (MutableState) obj4;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (function32 == null) {
                        gapComposer3.startReplaceGroup(-1042081282);
                    } else {
                        gapComposer3.startReplaceGroup(243479139);
                        function32.invoke(RealToastIconScope.INSTANCE, gapComposer3, 6);
                    }
                    gapComposer3.end(false);
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(layoutWeightElement, 8.0f);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m298padding3ABfNKs);
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
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalTextStyle;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                    Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(((Typography) gapComposer3.consume(staticProvidableCompositionLocal)).labelMedium), Expect_jvmKt.rememberComposableLambda(309146515, new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl3, 23), gapComposer3), gapComposer3, 56);
                    Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(((Typography) gapComposer3.consume(staticProvidableCompositionLocal)).bodyMedium), Expect_jvmKt.rememberComposableLambda(1438196348, new ToastKt$$ExternalSyntheticLambda11(false ? 1 : 0, function2), gapComposer3), gapComposer3, 56);
                    gapComposer3.end(true);
                    Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(((Typography) gapComposer3.consume(staticProvidableCompositionLocal)).labelMedium), Expect_jvmKt.rememberComposableLambda(1741775305, new BadgeKt$$ExternalSyntheticLambda2(3, function33, mutableState), gapComposer3), gapComposer3, 56);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                DebugUtils.AvatarCarouselItem((AvatarEntry) obj7, (Function0) obj6, (Modifier) obj5, (String) obj4, (String) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                Trace.TitleBarCore((String) obj7, (Modifier) obj5, (DynamicColorConfiguration) obj6, (Function3) obj3, (Function3) obj4, (Composer) obj, Updater.updateChangedFlags(24577));
                return Unit.INSTANCE;
            case 10:
                Modifier modifier3 = (Modifier) obj5;
                NetworkFetcher$fetch$2 networkFetcher$fetch$2 = (NetworkFetcher$fetch$2) obj7;
                BalanceAppletTileViewModel balanceAppletTileViewModel = (BalanceAppletTileViewModel) obj6;
                BalanceAppletTileViewModel.BalanceMovementButtons balanceMovementButtons = (BalanceAppletTileViewModel.BalanceMovementButtons) obj4;
                Shaker shaker = (Shaker) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    coil3.size.SizeKt.AdaptiveStack(modifier3, null, null, new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), null, null, Expect_jvmKt.rememberComposableLambda(1939055362, new ComposeDialogKt$$ExternalSyntheticLambda12(networkFetcher$fetch$2, balanceAppletTileViewModel, balanceMovementButtons, shaker, 13), gapComposer4), gapComposer4, 1575936, 54);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                BitcoinAddressCopySheetViewKt.DepositCopyOption((ComposableLambdaImpl) obj7, (String) obj6, (String) obj4, (Function0) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 12:
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj7;
                Function1 function12 = (Function1) obj6;
                MutableState mutableState2 = (MutableState) obj5;
                TouchRecorder touchRecorder = (TouchRecorder) obj4;
                MutableState mutableState3 = (MutableState) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
                    boolean z = !animatedContentScopeImpl.$$delegate_0.getTransition().isRunning() && ((Boolean) mutableState3.getValue()).booleanValue();
                    boolean changed = gapComposer5.changed(function12) | gapComposer5.changed(mutableState2) | gapComposer5.changedInstance(touchRecorder);
                    Object rememberedValue = gapComposer5.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new SsnViewKt$$ExternalSyntheticLambda15(function12, touchRecorder, mutableState2, false ? 1 : 0);
                        gapComposer5.updateRememberedValue(rememberedValue);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, z, null, AmountBlockerViewKt.f298lambda$45792793, gapComposer5, 1573296, 40);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                BulletinInfoOverlayKt.BulletinInfoOverlay((BorrowHomeOverlayViewModel.BulletinInfo) obj7, (Latch$await$2$2) obj6, (QuickPayViewKt$QuickPay$1$1$1$2$2$1$1) obj4, (BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                CardStudioViewKt.CardStudio((Modifier) obj5, (Flow) obj7, (CardStudioViewModel.Content) obj6, (Function1) obj4, (ErrorReporter) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                CardStudioViewModelV2 cardStudioViewModelV2 = (CardStudioViewModelV2) obj7;
                CoroutineScope coroutineScope = (CoroutineScope) obj6;
                MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) obj5;
                Function1 function13 = (Function1) obj4;
                MutableState mutableState4 = (MutableState) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (!gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    gapComposer6.skipToGroupEnd();
                } else if (Intrinsics.areEqual(cardStudioViewModelV2, CardStudioViewModelV2.Loading.INSTANCE)) {
                    gapComposer6.startReplaceGroup(1829083917);
                    CardStudioViewV2Kt.LoadingContent(gapComposer6, 0);
                    gapComposer6.end(false);
                } else {
                    if (!(cardStudioViewModelV2 instanceof CardStudioViewModelV2.Content)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer6, -2019208022, false);
                    }
                    gapComposer6.startReplaceGroup(1829186465);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                    Modifier windowInsetsPadding = OffsetKt.windowInsetsPadding(fillMaxSize, Arrangement$End$1.current(gapComposer6).navigationBars);
                    Object rememberedValue2 = gapComposer6.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new CashCardKt$$ExternalSyntheticLambda0(i2, mutableState4);
                        gapComposer6.updateRememberedValue(rememberedValue2);
                    }
                    Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(windowInsetsPadding, (Function1) rememberedValue2);
                    Unit unit = Unit.INSTANCE;
                    boolean changedInstance = gapComposer6.changedInstance(coroutineScope) | gapComposer6.changedInstance(mutableSharedFlow);
                    Object rememberedValue3 = gapComposer6.rememberedValue();
                    if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new SignaturesKt$Signature$1$1(mutableState4, coroutineScope, mutableSharedFlow, i3);
                        gapComposer6.updateRememberedValue(rememberedValue3);
                    }
                    CardStudioViewV2Kt.CardStudioV2Content(SuspendingPointerInputFilterKt.pointerInput(onGloballyPositioned, unit, (PointerInputEventHandler) rememberedValue3), mutableSharedFlow, (CardStudioViewModelV2.Content) cardStudioViewModelV2, function13, gapComposer6, 0, 0);
                    gapComposer6.end(false);
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                FlowsKt.CardGridNux((Modifier) obj5, (ArrayList) obj7, (Engine) obj6, (CardGridNuxScene) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(4615));
                return Unit.INSTANCE;
            case 17:
                RealImageLoader realImageLoader = (RealImageLoader) obj7;
                GrantViewModel grantViewModel = (GrantViewModel) obj6;
                Function1 function14 = (Function1) obj5;
                UiContainerKt$BottomSheet$1$sheetScope$1 uiContainerKt$BottomSheet$1$sheetScope$1 = (UiContainerKt$BottomSheet$1$sheetScope$1) obj4;
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-977301655, new VerifyCheckDepositKt$$ExternalSyntheticLambda14(grantViewModel, function14, factory, uiContainerKt$BottomSheet$1$sheetScope$1, 16), gapComposer7), gapComposer7, 56);
                    boolean changedInstance2 = gapComposer7.changedInstance(grantViewModel) | gapComposer7.changed(function14) | gapComposer7.changedInstance(uiContainerKt$BottomSheet$1$sheetScope$1);
                    Object rememberedValue4 = gapComposer7.rememberedValue();
                    if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new CopyCodeKt$$ExternalSyntheticLambda4(26, grantViewModel, function14, uiContainerKt$BottomSheet$1$sheetScope$1);
                        gapComposer7.updateRememberedValue(rememberedValue4);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue4, gapComposer7, 0, 1);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                UiContainer uiContainer = (UiContainer) obj7;
                NavigationModel.Ready.FullScreenLocation fullScreenLocation = (NavigationModel.Ready.FullScreenLocation) obj6;
                AnimatedContentScopeImpl animatedContentScopeImpl2 = (AnimatedContentScopeImpl) obj5;
                SharedTransitionScope sharedTransitionScope = (SharedTransitionScope) obj4;
                SaveableStateHolder saveableStateHolder = (SaveableStateHolder) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    UiContainerKt.ScreenContent(uiContainer.broadway, fullScreenLocation, animatedContentScopeImpl2, sharedTransitionScope, saveableStateHolder, false, uiContainer.fullScreenBackPressedDispatcher, uiContainer.onLocationReceived, uiContainer.onLocationRemoved, uiContainer.containerErrorReporter, uiContainer.leakDetector, uiContainer.fullScreenBackListener, uiContainer.eventListeners, uiContainer.parentLifecycle, false, null, gapComposer8, 0, 0, 49152);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                MooncakeHeaderViewKt.MooncakeHeaderView((DirectoryListItem.Header) obj7, (Modifier) obj5, (RealImageLoader) obj6, (PaddingValuesImpl) obj4, (Ui.EventReceiver) obj3, (Composer) obj, Updater.updateChangedFlags(3121));
                return Unit.INSTANCE;
            case 20:
                UiScope uiScope = (UiScope) obj7;
                Function1 function15 = (Function1) obj6;
                PromotionDetailsViewModel promotionDetailsViewModel2 = (PromotionDetailsViewModel) obj5;
                RealImageLoader realImageLoader2 = (RealImageLoader) obj4;
                CashTreehouseLayout cashTreehouseLayout = (CashTreehouseLayout) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    boolean changed2 = gapComposer9.changed(uiScope) | gapComposer9.changed(function15);
                    Object rememberedValue5 = gapComposer9.rememberedValue();
                    if (changed2 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new PromotionDetailsViewKt$PromotionDetailsUi$1$1$1$1(uiScope, function15, 0);
                        gapComposer9.updateRememberedValue(rememberedValue5);
                    }
                    DBUtil.BackHandler(false, (Function0) ((KFunction) rememberedValue5), gapComposer9, 0, 1);
                    String sharedElementId = promotionDetailsViewModel2.getSharedElementId();
                    ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0 composableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0 = new ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0(29);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier thenIfSharedEnter = zzj.thenIfSharedEnter(companion, uiScope, sharedElementId, composableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0, gapComposer9, 6);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode3 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer9, thenIfSharedEnter);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer9.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer9.useNode();
                    }
                    Updater.m576setimpl(gapComposer9, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer9, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer9, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer9, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    boolean z2 = promotionDetailsViewModel2 instanceof PromotionDetailsViewModel.Loaded;
                    PromotionDetailsViewModel.Loaded loaded = z2 ? (PromotionDetailsViewModel.Loaded) promotionDetailsViewModel2 : null;
                    PromotionDetailsViewModel.DetailsPageData detailsPageData = loaded != null ? loaded.details : null;
                    if (detailsPageData instanceof PromotionDetailsViewModel.DetailsPageData.DetailsPageV1) {
                        detailsPageV1 = (PromotionDetailsViewModel.DetailsPageData.DetailsPageV1) detailsPageData;
                        promotionDetailsViewModel = promotionDetailsViewModel2;
                    } else {
                        promotionDetailsViewModel = promotionDetailsViewModel2;
                        detailsPageV1 = null;
                    }
                    if (!z2 || detailsPageV1 == null) {
                        gapComposer9.startReplaceGroup(-1936573346);
                        Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                        Colors colors = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                        } else {
                            gapComposer9.startReplaceGroup(-1762997739);
                            gapComposer9.end(false);
                        }
                        SpacerKt.Spacer(gapComposer9, ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors.semantic.background.f1047app, ColorKt.RectangleShape));
                        gapComposer9.end(false);
                    } else {
                        gapComposer9.startReplaceGroup(-1936886415);
                        PromotionDetailsViewModel.Loaded loaded2 = (PromotionDetailsViewModel.Loaded) promotionDetailsViewModel;
                        boolean changed3 = gapComposer9.changed(uiScope) | gapComposer9.changed(function15);
                        Object rememberedValue6 = gapComposer9.rememberedValue();
                        if (changed3 || rememberedValue6 == neverEqualPolicy) {
                            rememberedValue6 = new PromotionDetailsViewKt$PromotionDetailsUi$1$1$1$1(uiScope, function15, 1);
                            gapComposer9.updateRememberedValue(rememberedValue6);
                        }
                        int i4 = CashTreehouseLayout.$r8$clinit;
                        zzj.Content(uiScope, loaded2, detailsPageV1, function15, (Function0) ((KFunction) rememberedValue6), sharedElementId, realImageLoader2, cashTreehouseLayout, gapComposer9, 16777216);
                        gapComposer9.end(false);
                    }
                    gapComposer9.end(true);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                EarningsHomeKt.SectionView((EarningsHomeViewModel.SectionContent) obj7, (EarningsHomeViewModel.SectionContent) obj6, (Function1) obj5, (ScreenScaffoldContentScope) obj4, (LocalizedMoneyFormatter.Factory) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                RealImageLoader realImageLoader3 = (RealImageLoader) obj7;
                EarningsTrackerViewModel earningsTrackerViewModel = (EarningsTrackerViewModel) obj6;
                Function1 function16 = (Function1) obj5;
                MoneyFormatter moneyFormatter = (MoneyFormatter) obj4;
                MoneyFormatter moneyFormatter2 = (MoneyFormatter) obj3;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader3), Expect_jvmKt.rememberComposableLambda(-1301332250, new EarningsTrackerViewKt$$ExternalSyntheticLambda3(earningsTrackerViewModel, function16, moneyFormatter, moneyFormatter2, 0), gapComposer10), gapComposer10, 56);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                AllowanceViewKt.PrivacySection((String) obj7, (String) obj6, (String) obj5, (Integer) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                Function0 function0 = (Function0) obj7;
                Color color = (Color) obj6;
                Image image2 = (Image) obj5;
                Icons icons = (Icons) obj4;
                String str = (String) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    boolean changed4 = gapComposer11.changed(function0);
                    Object rememberedValue7 = gapComposer11.rememberedValue();
                    if (changed4 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new ComposeDialogKt$$ExternalSyntheticLambda10(i2, function0);
                        gapComposer11.updateRememberedValue(rememberedValue7);
                    }
                    Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(Modifier.Companion.$$INSTANCE, false, null, null, (Function0) rememberedValue7, 15);
                    AvatarSize avatarSize = AvatarSize.Size48;
                    androidx.compose.ui.graphics.Color m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer11, -1464736060, color, gapComposer11, false);
                    if (m == null) {
                        gapComposer11.startReplaceGroup(-1464734368);
                        Colors colors2 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                        } else {
                            gapComposer11.startReplaceGroup(-1762997739);
                            gapComposer11.end(false);
                        }
                        j = colors2.semantic.background.subtle;
                        gapComposer11.end(false);
                    } else {
                        gapComposer11.startReplaceGroup(-1464736414);
                        gapComposer11.end(false);
                        j = m.value;
                    }
                    long j2 = j;
                    if (image2 == null) {
                        gapComposer11.startReplaceGroup(1837966175);
                        gapComposer11.end(false);
                        image = null;
                    } else {
                        gapComposer11.startReplaceGroup(1837966176);
                        AvatarImage.Remote.Image image3 = new AvatarImage.Remote.Image(ThemablesKt.urlForTheme(image2, gapComposer11), false, null, 0L, new AddFavoritesViewKt$$ExternalSyntheticLambda15(false ? 1 : 0), 62);
                        gapComposer11.end(false);
                        image = image3;
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, str, j2, (String) null, m183clickableoSLSa3U$default, (AvatarImage) image, (Function2) null, (AvatarOverlay) (icons != null ? new AvatarOverlay.LocalIcon(6, 0L, 0L, icons) : null), false, 0L, (Composer) gapComposer11, 3078, 0, 1856);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Modifier modifier4 = (Modifier) obj5;
                ArrayList arrayList = (ArrayList) obj7;
                Function0 function02 = (Function0) obj6;
                Function1 function17 = (Function1) obj4;
                Function0 function03 = (Function0) obj3;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    KeypadKt.m3641CardIkByU14(modifier4, null, 0L, false, null, null, null, Expect_jvmKt.rememberComposableLambda(-83126847, new BasicShieetScope$$ExternalSyntheticLambda0(arrayList, function02, function17, function03, 1), gapComposer12), gapComposer12, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                ArcadeFormCellDefaultElementKt.ArcadeFormCellDefaultElement((String) obj7, (FormBlocker.Element.CellDefaultElement) obj6, (State) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                Shaker shaker2 = (Shaker) obj7;
                ArcadeFormDateInputView arcadeFormDateInputView = (ArcadeFormDateInputView) obj6;
                FormDateInputViewModel formDateInputViewModel = (FormDateInputViewModel) obj5;
                MutableState mutableState5 = (MutableState) obj4;
                DateScrubber dateScrubber = (DateScrubber) obj3;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Modifier shakeWith = SharedViewEventsKt.shakeWith(SizeKt.fillMaxWidth(modifier, 1.0f), shaker2);
                    FocusRequester focusRequester = arcadeFormDateInputView.focusRequester;
                    FormBlocker.Element.DateInputElement dateInputElement = arcadeFormDateInputView.element;
                    Modifier focusRequester2 = FocusTraversalKt.focusRequester(shakeWith, focusRequester);
                    int i5 = 9;
                    if (Intrinsics.areEqual(dateInputElement.autofill, Boolean.TRUE)) {
                        gapComposer13.startReplaceGroup(-128012843);
                        Object rememberedValue8 = gapComposer13.rememberedValue();
                        if (rememberedValue8 == neverEqualPolicy) {
                            rememberedValue8 = new GpsConfigQueries$$ExternalSyntheticLambda1(i5);
                            gapComposer13.updateRememberedValue(rememberedValue8);
                        }
                        modifier = SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue8);
                        gapComposer13.end(false);
                    } else {
                        gapComposer13.startReplaceGroup(-127913333);
                        gapComposer13.end(false);
                    }
                    Modifier then = focusRequester2.then(modifier);
                    TextFieldValue textFieldValue = (TextFieldValue) mutableState5.getValue();
                    String str2 = dateInputElement.label_text;
                    if (str2 == null) {
                        gapComposer13.startReplaceGroup(-127710284);
                        gapComposer13.end(false);
                        composableLambdaImpl = null;
                    } else {
                        gapComposer13.startReplaceGroup(-127710283);
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-439111197, new FamilyMemberRowKt$$ExternalSyntheticLambda5(str2, 16), gapComposer13);
                        gapComposer13.end(false);
                        composableLambdaImpl = rememberComposableLambda;
                    }
                    MaskVisualTransformation maskVisualTransformation = new MaskVisualTransformation(formDateInputViewModel.formattingMask, new Edge.Companion(i5));
                    String str3 = formDateInputViewModel.hint;
                    Colors colors3 = (Colors) gapComposer13.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                    } else {
                        gapComposer13.startReplaceGroup(-1762997739);
                        gapComposer13.end(false);
                    }
                    PersistentMaskVisualTransformation persistentMaskVisualTransformation = new PersistentMaskVisualTransformation(maskVisualTransformation, str3, colors3.semantic.text.placeholder);
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 3, 0, (Boolean) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                    boolean changed5 = gapComposer13.changed(mutableState5) | gapComposer13.changedInstance(dateScrubber);
                    Object rememberedValue9 = gapComposer13.rememberedValue();
                    if (changed5 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new BirthdayViewKt$$ExternalSyntheticLambda9(dateScrubber, mutableState5, i3);
                        gapComposer13.updateRememberedValue(rememberedValue9);
                    }
                    InputFieldKt.InputField(textFieldValue, (Function1) rememberedValue9, then, (InputState) null, composableLambdaImpl, (Function2) null, (Function2) null, (Function3) null, (String) null, keyboardOptions, (KeyboardActions) null, persistentMaskVisualTransformation, gapComposer13, 805306368, 0, 1512);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                ArcadeFormEmojiPickerKt.Grid((Modifier) obj5, (List) obj7, (Arrangement$SpacedAligned) obj6, (Arrangement$SpacedAligned) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(196657));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ((e) obj7).SceneScope((TextureView) obj6, (CoroutineScope) obj5, (CoroutineScope) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda4(Modifier modifier, Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.$r8$classId = i2;
        this.f$2 = modifier;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda4(Modifier modifier, Serializable serializable, Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$2 = modifier;
        this.f$0 = serializable;
        this.f$1 = obj;
        this.f$3 = obj2;
        this.f$4 = obj3;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda4(AmountPickerViewModel.Ready ready, AmountConfig amountConfig, Function1 function1, Modifier modifier, Function3 function3, int i) {
        this.$r8$classId = 5;
        this.f$0 = ready;
        this.f$1 = amountConfig;
        this.f$3 = function1;
        this.f$2 = modifier;
        this.f$4 = function3;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda4(AmountPickerViewModel amountPickerViewModel, AmountConfig amountConfig, Function1 function1, Modifier modifier, Function3 function3) {
        this.$r8$classId = 6;
        this.f$0 = amountPickerViewModel;
        this.f$1 = amountConfig;
        this.f$3 = function1;
        this.f$2 = modifier;
        this.f$4 = function3;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, Function function, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$4 = function;
        this.f$2 = modifier;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda4(String str, Modifier modifier, DynamicColorConfiguration dynamicColorConfiguration, Function3 function3, Function3 function32, int i) {
        this.$r8$classId = 9;
        this.f$0 = str;
        this.f$2 = modifier;
        this.f$1 = dynamicColorConfiguration;
        this.f$4 = function3;
        this.f$3 = function32;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda4(Function3 function3, ComposableLambdaImpl composableLambdaImpl, Function2 function2, Function3 function32, MutableState mutableState) {
        this.$r8$classId = 7;
        this.f$4 = function3;
        this.f$0 = composableLambdaImpl;
        this.f$1 = function2;
        this.f$2 = function32;
        this.f$3 = mutableState;
    }
}
