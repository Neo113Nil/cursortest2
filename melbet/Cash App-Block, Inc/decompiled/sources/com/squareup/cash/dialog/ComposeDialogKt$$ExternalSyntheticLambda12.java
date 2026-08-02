package com.squareup.cash.dialog;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuPopupPositionProviderKt;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.material.DrawerKt$$ExternalSyntheticLambda1;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda3;
import androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda5;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.tooling.ComposableInvoker;
import androidx.compose.ui.tooling.PreviewActivity;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.badging.backend.RealBadger2$$ExternalSyntheticLambda0;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.local.primitives.MenuItemPreorderingSummary;
import app.cash.local.viewmodels.LocalBrandLocationCheckoutViewModel;
import app.cash.local.viewmodels.LocalCheckoutTipSectionViewModel;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewModel;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewModel;
import app.cash.local.viewmodels.LocalOpenTabCheckoutViewModel;
import app.cash.local.viewmodels.OrderBuilderModel;
import app.cash.local.viewmodels.TipOption;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageViewModel;
import app.cash.local.views.LocalViewFactory$createUi$view$3$1$1$1;
import app.cash.local.views.brand.checkout.CheckoutExpandableReviewRowKt;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt$$ExternalSyntheticLambda8;
import app.cash.local.views.brand.checkout.LocalBrandLocationCheckoutViewKt;
import app.cash.local.views.brand.checkout.LocalOpenTabCheckoutViewKt;
import app.cash.local.views.brand.menu.LocalCaloriesTextKt;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda0;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.map.LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8;
import app.cash.local.views.marketingmessages.MarketingMessageKt;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.j1$$ExternalSyntheticLambda14;
import bo.app.n$$ExternalSyntheticLambda1;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.network.NetworkFetcher$fetch$2;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.braze.Braze$$ExternalSyntheticLambda34;
import com.google.android.gms.dynamite.zzg;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadn;
import com.google.mlkit.common.internal.zzc;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpaySearchViewEvent;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.appmessages.sheet.SheetAppMessageModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Fonts;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.BottomNavigationScope;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.FilterBarKt;
import com.squareup.cash.arcade.components.LazyScaffoldContentScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.input.InputChipGridScope;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel;
import com.squareup.cash.banking.applets.views.BalanceAppletTileKt$$ExternalSyntheticLambda4;
import com.squareup.cash.benefits.applets.viewmodels.Subtitle;
import com.squareup.cash.benefits.components.viewmodels.GreenStatus;
import com.squareup.cash.billssubscriptions.viewmodels.BillsSubscriptionsMerchantListViewModel$Loaded;
import com.squareup.cash.blockers.viewmodels.BirthdayViewModel;
import com.squareup.cash.blockers.viewmodels.CashtagViewModel;
import com.squareup.cash.blockers.viewmodels.InputCardInfoViewModel;
import com.squareup.cash.blockers.viewmodels.ReferralCodeViewModel;
import com.squareup.cash.blockers.views.AmountBlockerViewKt;
import com.squareup.cash.blockers.views.CardState;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.blockers.views.InputCardInfoViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.views.SelectionViewKt$$ExternalSyntheticLambda14;
import com.squareup.cash.blockers.views.SelectionViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.blockers.views.SetNameViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda14;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.blockers.views.VerifyCardViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.boost.db.RewardSlotQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda12;
import com.squareup.cash.card.onboarding.CardPreviewSheet;
import com.squareup.cash.card.onboarding.CardPreviewViewKt;
import com.squareup.cash.card.onboarding.CardPreviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.card.onboarding.CardPreviewViewModel;
import com.squareup.cash.card.onboarding.InteractiveCardView;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.card.onboarding.StylePickerToPreviewKey;
import com.squareup.cash.card.onboarding.StyledCardPerspectiveView;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.card.onboarding.StyledCardViewModelExtKt;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.card.onboarding.core.CardSceneEffectKt;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryScene;
import com.squareup.cash.card.onboarding.core.instancing.GridLayout;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda15;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldScopeInstance;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewModel$Tab;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.core.views.BottomNavigationKt;
import com.squareup.cash.core.views.BottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.discover.promotiondetails.viewmodels.PromotionDetailsViewModel;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.family.applets.views.FamilyAppletTile;
import com.squareup.cash.family.familyhub.viewmodels.FamilyHomeViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestsSection;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.graphics.views.TextureViewFpsTracker;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda14;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.cash.overlays.OverlayLayer;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.franklin.api.CardPresentationStyle;
import com.squareup.protos.franklin.api.HelpItem;
import com.squareup.protos.franklin.api.SelectionOption;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.util.Strings;
import com.squareup.util.compose.ListsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.slf4j.Marker;
import papa.InteractionResult;

/* loaded from: classes6.dex */
public final /* synthetic */ class ComposeDialogKt$$ExternalSyntheticLambda12 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ ComposeDialogKt$$ExternalSyntheticLambda12(Object obj, int i, ComposableLambdaImpl composableLambdaImpl, Function0 function0, Function0 function02) {
        this.$r8$classId = 0;
        this.f$0 = obj;
        this.f$3 = composableLambdaImpl;
        this.f$4 = function0;
        this.f$5 = function02;
    }

    private final Object invoke$com$squareup$cash$afterpayapplet$applets$views$AfterpayAppletTile$$ExternalSyntheticLambda13(Object obj, Object obj2, Object obj3) {
        AfterpayAppletTileViewModel afterpayAppletTileViewModel = (AfterpayAppletTileViewModel) this.f$0;
        TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1 = (TaxesAppletViewsModule$$ExternalSyntheticLambda1) this.f$3;
        FamilyAppletTile familyAppletTile = (FamilyAppletTile) this.f$4;
        AppletTile.AppletTileAppearance appletTileAppearance = (AppletTile.AppletTileAppearance) this.f$5;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (!gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            gapComposer.skipToGroupEnd();
        } else if (afterpayAppletTileViewModel instanceof AfterpayAppletTileViewModel.Loading) {
            gapComposer.startReplaceGroup(1063695871);
            SharedUIKt.m3606LoadingServiceAppletTile942rkJo(Room.stringResource(gapComposer, R.string.afterpay_applet_title), taxesAppletViewsModule$$ExternalSyntheticLambda1, RecyclerView.DECELERATION_RATE, false, gapComposer, 0, 12);
            gapComposer.end(false);
        } else if (afterpayAppletTileViewModel instanceof AfterpayAppletTileViewModel.Installed.CreditState) {
            gapComposer.startReplaceGroup(1063895945);
            familyAppletTile.CreditStateTile((AfterpayAppletTileViewModel.Installed.CreditState) afterpayAppletTileViewModel, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, gapComposer, 0);
            gapComposer.end(false);
        } else if (afterpayAppletTileViewModel instanceof AfterpayAppletTileViewModel.Installed.CreditBreakdown) {
            gapComposer.startReplaceGroup(1064028997);
            familyAppletTile.CreditBreakdownTile((AfterpayAppletTileViewModel.Installed.CreditBreakdown) afterpayAppletTileViewModel, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, gapComposer, 0);
            gapComposer.end(false);
        } else if (afterpayAppletTileViewModel instanceof AfterpayAppletTileViewModel.Installed.CreditDetails) {
            gapComposer.startReplaceGroup(1064163847);
            familyAppletTile.CreditDetailsTile((AfterpayAppletTileViewModel.Installed.CreditDetails) afterpayAppletTileViewModel, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, gapComposer, 0);
            gapComposer.end(false);
        } else if (afterpayAppletTileViewModel instanceof AfterpayAppletTileViewModel.Installed.DefaultState) {
            gapComposer.startReplaceGroup(1064295752);
            familyAppletTile.DefaultStateTile((AfterpayAppletTileViewModel.Installed.DefaultState) afterpayAppletTileViewModel, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, gapComposer, 0);
            gapComposer.end(false);
        } else if (afterpayAppletTileViewModel instanceof AfterpayAppletTileViewModel.Installed.InstalledFailure) {
            gapComposer.startReplaceGroup(1064454503);
            SharedUIKt.FailedAppletTile(0, gapComposer, Room.stringResource(gapComposer, R.string.afterpay_applet_title), taxesAppletViewsModule$$ExternalSyntheticLambda1);
            gapComposer.end(false);
        } else if (afterpayAppletTileViewModel instanceof AfterpayAppletTileViewModel.Uninstalled) {
            gapComposer.startReplaceGroup(1064646827);
            familyAppletTile.UninstalledUI((AfterpayAppletTileViewModel.Uninstalled) afterpayAppletTileViewModel, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, gapComposer, 0);
            gapComposer.end(false);
        } else if (afterpayAppletTileViewModel instanceof AfterpayAppletTileViewModel.Installed.V3Installed) {
            gapComposer.startReplaceGroup(1064772966);
            familyAppletTile.V3InstalledContent((AfterpayAppletTileViewModel.Installed.V3Installed) afterpayAppletTileViewModel, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, gapComposer, 0);
            gapComposer.end(false);
        } else {
            if (!(afterpayAppletTileViewModel instanceof AfterpayAppletTileViewModel.V3Uninstalled)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1142691356, false);
            }
            gapComposer.startReplaceGroup(1064905181);
            familyAppletTile.V3UninstalledContent((AfterpayAppletTileViewModel.V3Uninstalled) afterpayAppletTileViewModel, taxesAppletViewsModule$$ExternalSyntheticLambda1, gapComposer, 0);
            gapComposer.end(false);
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$appmessages$views$sheet$SheetAppMessageView$$ExternalSyntheticLambda11(Object obj, Object obj2, Object obj3) {
        ScrollState scrollState = (ScrollState) this.f$0;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.f$3;
        Function1 function1 = (Function1) this.f$4;
        SheetAppMessageModel.Loaded loaded = (SheetAppMessageModel.Loaded) this.f$5;
        ((Integer) obj3).getClass();
        ((AnimatedVisibilityScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) ((Composer) obj2);
        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda14(12, parcelableSnapshotMutableIntState);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        DimensionKt.ButtonCtaGroup(RulerKt.onSizeChanged(m177backgroundbw27NRU, (Function1) rememberedValue), scrollState.getCanScrollForward(), null, null, Expect_jvmKt.rememberComposableLambda(745063883, new BrandSheetViewKt$$ExternalSyntheticLambda1(26, (Object) loaded, function1), gapComposer), gapComposer, 24576, 12);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$banking$applets$views$BalanceAppletTileKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        NetworkFetcher$fetch$2 networkFetcher$fetch$2 = (NetworkFetcher$fetch$2) this.f$0;
        final BalanceAppletTileViewModel balanceAppletTileViewModel = (BalanceAppletTileViewModel) this.f$3;
        final BalanceAppletTileViewModel.BalanceMovementButtons balanceMovementButtons = (BalanceAppletTileViewModel.BalanceMovementButtons) this.f$4;
        Shaker shaker = (Shaker) this.f$5;
        AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        adaptiveStackScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(adaptiveStackScope) ? 4 : 2;
        }
        final int i = 0;
        final int i2 = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier testTag = TestTagKt.testTag(adaptiveStackScope.horizontalWeight(companion, 1.0f), "balance_applet_add_money_button");
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new AvatarsKt$$ExternalSyntheticLambda2(19);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(testTag, false, (Function1) rememberedValue);
            boolean changed = gapComposer.changed(networkFetcher$fetch$2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BalanceAppletTileKt$$ExternalSyntheticLambda4(networkFetcher$fetch$2, i2);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            SizeKt.ButtonCta((Function0) rememberedValue2, semantics, null, false, false, null, Expect_jvmKt.rememberComposableLambda(1431515325, new Function3() { // from class: com.squareup.cash.banking.applets.views.BalanceAppletTileKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    int i3 = i;
                    BalanceAppletTileViewModel.BalanceMovementButtons balanceMovementButtons2 = balanceMovementButtons;
                    BalanceAppletTileViewModel balanceAppletTileViewModel2 = balanceAppletTileViewModel;
                    switch (i3) {
                        case 0:
                            Composer composer2 = (Composer) obj5;
                            int intValue2 = ((Integer) obj6).intValue();
                            ((RowScope) obj4).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (!gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                gapComposer2.skipToGroupEnd();
                            } else if (balanceAppletTileViewModel2.getBalanceMovementButtons().showMathCta) {
                                gapComposer2.startReplaceGroup(1542827620);
                                Icons icons = Icons.Add24;
                                String str = balanceMovementButtons2.depositButtonText;
                                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1762997739);
                                    gapComposer2.end(false);
                                }
                                Trace.m1191Iconww6aTOc(icons, str, (Modifier) null, colors.component.button.standard.icon.f164default, gapComposer2, 6, 4);
                                gapComposer2.end(false);
                            } else {
                                gapComposer2.startReplaceGroup(1543051905);
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, balanceMovementButtons2.depositButtonText, (Map) null, (Function1) null, false);
                                gapComposer2.end(false);
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj5;
                            int intValue3 = ((Integer) obj6).intValue();
                            ((RowScope) obj4).getClass();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (!gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                gapComposer3.skipToGroupEnd();
                            } else if (balanceAppletTileViewModel2.getBalanceMovementButtons().showMathCta) {
                                gapComposer3.startReplaceGroup(-1159897320);
                                Icons icons2 = Icons.Subtract24;
                                String str2 = balanceMovementButtons2.withdrawButtonText;
                                Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                Trace.m1191Iconww6aTOc(icons2, str2, (Modifier) null, colors2.component.button.standard.icon.f164default, gapComposer3, 6, 4);
                                gapComposer3.end(false);
                            } else {
                                gapComposer3.startReplaceGroup(-1159655582);
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, balanceMovementButtons2.withdrawButtonText, (Map) null, (Function1) null, false);
                                gapComposer3.end(false);
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 1572864, 60);
            Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, horizontalWeight);
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
            Modifier testTag2 = TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), "balance_applet_withdraw_button");
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new AvatarsKt$$ExternalSyntheticLambda2(20);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier semantics2 = SemanticsModifierKt.semantics(testTag2, false, (Function1) rememberedValue3);
            boolean z = !balanceMovementButtons.withdrawVisuallyDisabled;
            boolean changed2 = gapComposer.changed(networkFetcher$fetch$2) | gapComposer.changedInstance(balanceMovementButtons) | gapComposer.changedInstance(shaker);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new CopyCodeKt$$ExternalSyntheticLambda4(8, networkFetcher$fetch$2, balanceMovementButtons, shaker);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            SizeKt.ButtonCta((Function0) rememberedValue4, semantics2, null, false, z, null, Expect_jvmKt.rememberComposableLambda(-1871941705, new Function3() { // from class: com.squareup.cash.banking.applets.views.BalanceAppletTileKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    int i3 = i2;
                    BalanceAppletTileViewModel.BalanceMovementButtons balanceMovementButtons2 = balanceMovementButtons;
                    BalanceAppletTileViewModel balanceAppletTileViewModel2 = balanceAppletTileViewModel;
                    switch (i3) {
                        case 0:
                            Composer composer2 = (Composer) obj5;
                            int intValue2 = ((Integer) obj6).intValue();
                            ((RowScope) obj4).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (!gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                gapComposer2.skipToGroupEnd();
                            } else if (balanceAppletTileViewModel2.getBalanceMovementButtons().showMathCta) {
                                gapComposer2.startReplaceGroup(1542827620);
                                Icons icons = Icons.Add24;
                                String str = balanceMovementButtons2.depositButtonText;
                                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1762997739);
                                    gapComposer2.end(false);
                                }
                                Trace.m1191Iconww6aTOc(icons, str, (Modifier) null, colors.component.button.standard.icon.f164default, gapComposer2, 6, 4);
                                gapComposer2.end(false);
                            } else {
                                gapComposer2.startReplaceGroup(1543051905);
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, balanceMovementButtons2.depositButtonText, (Map) null, (Function1) null, false);
                                gapComposer2.end(false);
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj5;
                            int intValue3 = ((Integer) obj6).intValue();
                            ((RowScope) obj4).getClass();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (!gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                gapComposer3.skipToGroupEnd();
                            } else if (balanceAppletTileViewModel2.getBalanceMovementButtons().showMathCta) {
                                gapComposer3.startReplaceGroup(-1159897320);
                                Icons icons2 = Icons.Subtract24;
                                String str2 = balanceMovementButtons2.withdrawButtonText;
                                Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                Trace.m1191Iconww6aTOc(icons2, str2, (Modifier) null, colors2.component.button.standard.icon.f164default, gapComposer3, 6, 4);
                                gapComposer3.end(false);
                            } else {
                                gapComposer3.startReplaceGroup(-1159655582);
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, balanceMovementButtons2.withdrawButtonText, (Map) null, (Function1) null, false);
                                gapComposer3.end(false);
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 1572864, 44);
            if (balanceMovementButtons.withdrawVisuallyDisabled) {
                gapComposer.startReplaceGroup(-1822533917);
                Modifier matchParentSize = BoxScopeInstance.INSTANCE.matchParentSize();
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new AvatarsKt$$ExternalSyntheticLambda2(21);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(matchParentSize, (Function1) rememberedValue5);
                Unit unit = Unit.INSTANCE;
                boolean changed3 = gapComposer.changed(networkFetcher$fetch$2) | gapComposer.changedInstance(shaker);
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (changed3 || rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = new LocalViewFactory$createUi$view$3$1$1$1(5, networkFetcher$fetch$2, shaker);
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                BoxKt.Box(SuspendingPointerInputFilterKt.pointerInput(clearAndSetSemantics, unit, (PointerInputEventHandler) rememberedValue6), gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1822192762);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$benefits$applets$views$BankingBenefitsAppletTileKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f$0;
        GreenStatus greenStatus = (GreenStatus) this.f$3;
        Subtitle subtitle = (Subtitle) this.f$4;
        Float f = (Float) this.f$5;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            zzadn.CashGreenStatusVisual(str, greenStatus, subtitle, f != null, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$billssubscriptions$views$BillsSubscriptionsMerchantListViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        TextFieldState textFieldState = (TextFieldState) this.f$0;
        SearchBarKeyboardState searchBarKeyboardState = (SearchBarKeyboardState) this.f$3;
        BillsSubscriptionsMerchantListViewModel$Loaded billsSubscriptionsMerchantListViewModel$Loaded = (BillsSubscriptionsMerchantListViewModel$Loaded) this.f$4;
        Function1 function1 = (Function1) this.f$5;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            String stringResource = Room.stringResource(gapComposer, R.string.bills_subscriptions_merchant_list_search_placeholder);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            SearchBarKt.SearchBar(textFieldState, stringResource, searchBarKeyboardState, SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2), null, null, null, null, null, null, false, null, gapComposer, 0, 0, 8176);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            if (billsSubscriptionsMerchantListViewModel$Loaded.categoryFilters.isEmpty()) {
                gapComposer.startReplaceGroup(1796222462);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1795845750);
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(16.0f, RecyclerView.DECELERATION_RATE, 2);
                boolean changedInstance = gapComposer.changedInstance(billsSubscriptionsMerchantListViewModel$Loaded) | gapComposer.changed(function1);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BadgeQueries$$ExternalSyntheticLambda0(18, billsSubscriptionsMerchantListViewModel$Loaded, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                FilterBarKt.FilterBar(null, null, m295PaddingValuesYgX7TsA$default, (Function1) rememberedValue, gapComposer, 0, 3);
                gapComposer.end(false);
            }
            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$blockers$views$BirthdayViewKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        TouchRecorder touchRecorder = (TouchRecorder) this.f$0;
        BirthdayViewModel birthdayViewModel = (BirthdayViewModel) this.f$3;
        Function1 function1 = (Function1) this.f$4;
        MutableState mutableState = (MutableState) this.f$5;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Strings.TouchRecordingLayout(touchRecorder, null, Expect_jvmKt.rememberComposableLambda(-1617933927, new VerifyCheckDepositKt$$ExternalSyntheticLambda14(birthdayViewModel, function1, mutableState, touchRecorder, 6), gapComposer), gapComposer, 392, 2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$blockers$views$CashtagViewKt$$ExternalSyntheticLambda12(Object obj, Object obj2, Object obj3) {
        AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) this.f$0;
        CashtagViewModel cashtagViewModel = (CashtagViewModel) this.f$3;
        Function1 function1 = (Function1) this.f$4;
        MutableState mutableState = (MutableState) this.f$5;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        int i = 0;
        int i2 = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean z = !animatedContentScopeImpl.$$delegate_0.getTransition().isRunning() && cashtagViewModel.lookupViewModel.nextButtonEnabled;
            boolean changed = gapComposer.changed(function1) | gapComposer.changed(mutableState);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashtagViewKt$$ExternalSyntheticLambda13(function1, mutableState, i);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(-1843870712, new CashtagViewKt$$ExternalSyntheticLambda11(cashtagViewModel, i2), gapComposer), gapComposer, 1573296, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$blockers$views$InputCardInfoViewKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        NeverEqualPolicy neverEqualPolicy;
        InputCardInfoViewModel inputCardInfoViewModel = (InputCardInfoViewModel) this.f$0;
        AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) this.f$3;
        Function1 function1 = (Function1) this.f$4;
        CardState cardState = (CardState) this.f$5;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        int i = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            String str = ((InputCardInfoViewModel.Ready) inputCardInfoViewModel).textContent.secondaryButtonText;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (str != null) {
                gapComposer.startReplaceGroup(648313805);
                Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                boolean z = !animatedContentScopeImpl.$$delegate_0.getTransition().isRunning();
                boolean changed = gapComposer.changed(function1);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy2) {
                    rememberedValue = new CashtagViewKt$$ExternalSyntheticLambda6(26, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1009280604, new SetPinViewKt$$ExternalSyntheticLambda7(str, 8), gapComposer);
                neverEqualPolicy = neverEqualPolicy2;
                SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, null, false, z, null, rememberComposableLambda, gapComposer, 1572912, 44);
                gapComposer.end(false);
            } else {
                neverEqualPolicy = neverEqualPolicy2;
                gapComposer.startReplaceGroup(648566982);
                gapComposer.end(false);
            }
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
            boolean z2 = !animatedContentScopeImpl.$$delegate_0.getTransition().isRunning() && ((Boolean) cardState._isSubmittable$delegate.getValue()).booleanValue();
            boolean changed2 = gapComposer.changed(function1) | gapComposer.changed(cardState);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new VerifyCardViewKt$$ExternalSyntheticLambda5(function1, cardState, i);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth2, buttonProminence, false, z2, null, Expect_jvmKt.rememberComposableLambda(-1437512873, new InputCardInfoViewKt$$ExternalSyntheticLambda5(inputCardInfoViewModel, i), gapComposer), gapComposer, 1573296, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$blockers$views$ReferralCodeViewKt$$ExternalSyntheticLambda9(Object obj, Object obj2, Object obj3) {
        NeverEqualPolicy neverEqualPolicy;
        ReferralCodeViewModel referralCodeViewModel = (ReferralCodeViewModel) this.f$0;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) this.f$3;
        Function1 function1 = (Function1) this.f$4;
        MutableState mutableState = (MutableState) this.f$5;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            boolean z = referralCodeViewModel.preventSkipping;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (z) {
                neverEqualPolicy = neverEqualPolicy2;
                gapComposer.startReplaceGroup(1529085977);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1528794360);
                Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                boolean changed = gapComposer.changed(delegatingSoftwareKeyboardController) | gapComposer.changed(function1);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy2) {
                    rememberedValue = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController, function1, 2);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                neverEqualPolicy = neverEqualPolicy2;
                SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, null, false, false, null, AmountBlockerViewKt.f288lambda$1955443415, gapComposer, 1572912, 60);
                gapComposer.end(false);
            }
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
            boolean z2 = referralCodeViewModel.allowSubmission && !StringsKt.isBlank((String) mutableState.getValue());
            boolean changed2 = gapComposer.changed(delegatingSoftwareKeyboardController) | gapComposer.changed(function1) | gapComposer.changed(mutableState);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CopyCodeKt$$ExternalSyntheticLambda4(13, delegatingSoftwareKeyboardController, function1, mutableState);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth2, buttonProminence, false, z2, null, AmountBlockerViewKt.lambda$665671972, gapComposer, 1573296, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$blockers$views$SelectionViewKt$$ExternalSyntheticLambda12(Object obj, Object obj2, Object obj3) {
        GapComposer gapComposer;
        NeverEqualPolicy neverEqualPolicy;
        List list = (List) this.f$0;
        Function1 function1 = (Function1) this.f$3;
        final SelectionOption selectionOption = (SelectionOption) this.f$4;
        final SelectionOption selectionOption2 = (SelectionOption) this.f$5;
        AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        adaptiveStackScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(adaptiveStackScope) ? 4 : 2;
        }
        final int i = 1;
        final int i2 = 0;
        GapComposer gapComposer2 = (GapComposer) composer;
        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            int size = list.size();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (size == 1) {
                gapComposer2.startReplaceGroup(58919979);
                HelpItem helpItem = (HelpItem) list.get(0);
                Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                boolean changedInstance = gapComposer2.changedInstance(helpItem) | gapComposer2.changed(function1);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue == neverEqualPolicy2) {
                    rememberedValue = new SelectionViewKt$$ExternalSyntheticLambda14(helpItem, function1);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1184650437, new SsnViewKt$$ExternalSyntheticLambda2(helpItem, 22), gapComposer2);
                neverEqualPolicy = neverEqualPolicy2;
                SizeKt.ButtonCta((Function0) rememberedValue, horizontalWeight, null, false, false, null, rememberComposableLambda, gapComposer2, 1572864, 60);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            } else {
                gapComposer = gapComposer2;
                neverEqualPolicy = neverEqualPolicy2;
                if (list.size() > 1) {
                    gapComposer.startReplaceGroup(59342881);
                    boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(list);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new BulletinTileKt$$ExternalSyntheticLambda12(19, function1, list);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue2, adaptiveStackScope.horizontalWeight(companion, 1.0f), null, false, false, null, AmountBlockerViewKt.lambda$1465834798, gapComposer, 1572864, 60);
                    gapComposer.end(false);
                } else if (selectionOption != null) {
                    gapComposer.startReplaceGroup(59602692);
                    Modifier horizontalWeight2 = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    boolean changed2 = gapComposer.changed(function1) | gapComposer.changedInstance(selectionOption);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new SelectionViewKt$$ExternalSyntheticLambda8(function1, selectionOption, 1);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue3, horizontalWeight2, null, false, false, null, Expect_jvmKt.rememberComposableLambda(791768013, new Function3() { // from class: com.squareup.cash.blockers.views.SelectionViewKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i3 = i2;
                            SelectionOption selectionOption3 = selectionOption;
                            switch (i3) {
                                case 0:
                                    Composer composer2 = (Composer) obj5;
                                    int intValue2 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        String str = selectionOption3.label;
                                        str.getClass();
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj5;
                                    int intValue3 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer3;
                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        String str2 = selectionOption3.label;
                                        str2.getClass();
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, 1572864, 60);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(59786429);
                    gapComposer.end(false);
                }
            }
            if (selectionOption2 == null) {
                gapComposer.startReplaceGroup(59814948);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(59814949);
                ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                Modifier horizontalWeight3 = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                boolean changed3 = gapComposer.changed(function1) | gapComposer.changedInstance(selectionOption2);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changed3 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new SelectionViewKt$$ExternalSyntheticLambda8(function1, selectionOption2, 2);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                SizeKt.ButtonCta((Function0) rememberedValue4, horizontalWeight3, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1856798234, new Function3() { // from class: com.squareup.cash.blockers.views.SelectionViewKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        int i3 = i;
                        SelectionOption selectionOption3 = selectionOption2;
                        switch (i3) {
                            case 0:
                                Composer composer2 = (Composer) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                ((RowScope) obj4).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    String str = selectionOption3.label;
                                    str.getClass();
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj5;
                                int intValue3 = ((Integer) obj6).intValue();
                                ((RowScope) obj4).getClass();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    String str2 = selectionOption3.label;
                                    str2.getClass();
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 1573248, 56);
                gapComposer.end(false);
            }
        } else {
            gapComposer2.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$blockers$views$SetPinViewKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f$0;
        AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) this.f$3;
        Function1 function1 = (Function1) this.f$4;
        String str2 = (String) this.f$5;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        int i = 0;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (str != null) {
                gapComposer.startReplaceGroup(-701623440);
                Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                boolean z = !animatedContentScopeImpl.$$delegate_0.getTransition().isRunning();
                boolean changed = gapComposer.changed(function1);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new SsnViewKt$$ExternalSyntheticLambda14(10, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, null, false, z, null, Expect_jvmKt.rememberComposableLambda(1665151002, new SetPinViewKt$$ExternalSyntheticLambda7(str, i), gapComposer), gapComposer, 1572912, 44);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-701338488);
                gapComposer.end(false);
            }
            if (str2 != null) {
                gapComposer.startReplaceGroup(-701263995);
                ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                Modifier fillMaxWidth2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                boolean z2 = !animatedContentScopeImpl.$$delegate_0.getTransition().isRunning();
                boolean changed2 = gapComposer.changed(function1);
                Object rememberedValue2 = gapComposer.rememberedValue();
                int i2 = 11;
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new SsnViewKt$$ExternalSyntheticLambda14(11, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth2, buttonProminence, false, z2, null, Expect_jvmKt.rememberComposableLambda(472577681, new SetPinViewKt$$ExternalSyntheticLambda7(str2, i2), gapComposer), gapComposer, 1573296, 40);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-700937720);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$borrow$views$BorrowAmountPickerKt$$ExternalSyntheticLambda8(Object obj, Object obj2, Object obj3) {
        InputChipGridScope inputChipGridScope;
        boolean z;
        AmountSelectorWidgetModel amountSelectorWidgetModel = ((AmountPickerViewModel.Ready) this.f$0).amountSelections;
        Function1 function1 = (Function1) this.f$3;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.f$4;
        MutableState mutableState = (MutableState) this.f$5;
        InputChipGridScope inputChipGridScope2 = (InputChipGridScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        inputChipGridScope2.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(inputChipGridScope2) ? 4 : 2;
        }
        int i = intValue;
        char c = 18;
        boolean z2 = true;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(i & 1, (i & 19) != 18)) {
            String stringResource = Room.stringResource(gapComposer, R.string.borrow_amount_picker_bottom_sheet_input_chip_custom_amount);
            List list = amountSelectorWidgetModel.items;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            int i2 = 0;
            for (Object obj4 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                AmountSelectorWidgetModel.Item item = (AmountSelectorWidgetModel.Item) obj4;
                ArrayList arrayList2 = arrayList;
                boolean z3 = parcelableSnapshotMutableIntState.getIntValue() == i2 ? z2 : false;
                char c2 = c;
                String label = item.getLabel();
                Modifier modifier = Modifier.Companion.$$INSTANCE;
                Modifier weight = inputChipGridScope2.weight(1.0f, modifier, z2);
                int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(amountSelectorWidgetModel.items);
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (i2 == lastIndex) {
                    gapComposer.startReplaceGroup(1107566286);
                    boolean changed = gapComposer.changed(stringResource) | gapComposer.changed(z3);
                    inputChipGridScope = inputChipGridScope2;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new SnackbarHostKt$$ExternalSyntheticLambda5(stringResource, z3);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    modifier = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue);
                    z = false;
                    gapComposer.end(false);
                } else {
                    inputChipGridScope = inputChipGridScope2;
                    z = false;
                    gapComposer.startReplaceGroup(1107806226);
                    gapComposer.end(false);
                }
                Modifier then = weight.then(modifier);
                boolean changed2 = gapComposer.changed(i2) | gapComposer.changed(function1) | gapComposer.changedInstance(item);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    j1$$ExternalSyntheticLambda14 j1__externalsyntheticlambda14 = new j1$$ExternalSyntheticLambda14(i2, function1, item, parcelableSnapshotMutableIntState, mutableState, 1);
                    gapComposer.updateRememberedValue(j1__externalsyntheticlambda14);
                    rememberedValue2 = j1__externalsyntheticlambda14;
                }
                GapComposer gapComposer2 = gapComposer;
                InputChipGridScope inputChipGridScope3 = inputChipGridScope;
                inputChipGridScope3.InputChip(label, then, (String) null, (Function0) rememberedValue2, z3, false, (Composer) gapComposer2, 3670016 & (i << 18), 36);
                arrayList2.add(Unit.INSTANCE);
                stringResource = stringResource;
                c = c2;
                z2 = true;
                arrayList = arrayList2;
                gapComposer = gapComposer2;
                inputChipGridScope2 = inputChipGridScope3;
                i2 = i3;
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$card$onboarding$CardPreviewViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        GapComposer gapComposer;
        MutableState mutableState;
        NeverEqualPolicy neverEqualPolicy;
        State state;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        Function1 function1;
        TextureViewFpsTracker textureViewFpsTracker;
        BiasAlignment biasAlignment;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        final CardPreviewViewModel.Preview preview;
        MutableState mutableState2;
        GapComposer gapComposer2;
        MutableState mutableState3;
        GapComposer gapComposer3;
        BiasAlignment.Vertical vertical;
        boolean z;
        boolean z2;
        float f;
        Modifier.Companion companion;
        MutableState mutableState4;
        Modifier modifier;
        Color m;
        long Color;
        boolean booleanValue;
        boolean z3;
        boolean booleanValue2;
        GapComposer gapComposer4;
        Object obj4;
        Object obj5;
        boolean z4;
        Modifier wrapContentHeight;
        Object obj6;
        boolean booleanValue3;
        Object obj7;
        GapComposer gapComposer5;
        Modifier wrapContentHeight2;
        boolean z5;
        Object m2;
        Object derivedStateOf;
        Object derivedStateOf2;
        CardPreviewViewModel cardPreviewViewModel = (CardPreviewViewModel) this.f$0;
        CardPreviewViewModel cardPreviewViewModel2 = (CardPreviewViewModel) this.f$3;
        Function1 function12 = (Function1) this.f$4;
        TextureViewFpsTracker textureViewFpsTracker2 = (TextureViewFpsTracker) this.f$5;
        UiScope uiScope = (UiScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        BiasAlignment biasAlignment2 = Alignment.Companion.Center;
        uiScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(uiScope) ? 4 : 2;
        }
        GapComposer gapComposer6 = (GapComposer) composer;
        boolean shouldExecute = gapComposer6.shouldExecute(intValue & 1, (intValue & 19) != 18);
        Applier applier = gapComposer6.applier;
        if (shouldExecute) {
            boolean changed = gapComposer6.changed(cardPreviewViewModel);
            Object rememberedValue = gapComposer6.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            Object obj8 = rememberedValue;
            if (changed || rememberedValue == neverEqualPolicy2) {
                obj8 = Recorder$$ExternalSyntheticOutline1.m(cardPreviewViewModel instanceof CardPreviewViewModel.Preview, gapComposer6);
            }
            MutableState mutableState5 = (MutableState) obj8;
            Object rememberedValue2 = gapComposer6.rememberedValue();
            Object obj9 = rememberedValue2;
            if (rememberedValue2 == neverEqualPolicy2) {
                ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer6.updateRememberedValue(mutableStateOf$default);
                obj9 = mutableStateOf$default;
            }
            MutableState mutableState6 = (MutableState) obj9;
            CardPreviewViewModel.Preview preview2 = cardPreviewViewModel2 instanceof CardPreviewViewModel.Preview ? (CardPreviewViewModel.Preview) cardPreviewViewModel2 : null;
            SharedTransitionScope.SharedContentState rememberSharedContentState = uiScope.rememberSharedContentState(StylePickerToPreviewKey.TitleBar, gapComposer6, ((intValue << 3) & 112) | 6);
            boolean isMatchFound = rememberSharedContentState.isMatchFound();
            if (isMatchFound) {
                gapComposer6.startReplaceGroup(1576969755);
                Transition transition = uiScope.$$delegate_0.getTransition();
                TwoWayConverterImpl twoWayConverterImpl = AnimatableKt.FloatToVector;
                boolean isSeeking = transition.isSeeking();
                InteractionResult interactionResult = transition.transitionState;
                if (isSeeking) {
                    z5 = false;
                    m2 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer6, 1666827533, false, interactionResult);
                } else {
                    gapComposer6.startReplaceGroup(1666573488);
                    boolean changed2 = gapComposer6.changed(transition);
                    Object rememberedValue3 = gapComposer6.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy2) {
                        Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                        Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                        Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                        try {
                            Object currentState = interactionResult.getCurrentState();
                            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                            gapComposer6.updateRememberedValue(currentState);
                            rememberedValue3 = currentState;
                        } catch (Throwable th) {
                            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                            throw th;
                        }
                    }
                    gapComposer6.end(false);
                    m2 = rememberedValue3;
                    z5 = false;
                }
                EnterExitState enterExitState = (EnterExitState) m2;
                gapComposer6.startReplaceGroup(-1002884757);
                EnterExitState enterExitState2 = EnterExitState.PreEnter;
                float f2 = enterExitState == enterExitState2 ? -30.0f : RecyclerView.DECELERATION_RATE;
                gapComposer6.end(z5);
                Float valueOf = Float.valueOf(f2);
                boolean changed3 = gapComposer6.changed(transition);
                Object rememberedValue4 = gapComposer6.rememberedValue();
                if (changed3 || rememberedValue4 == neverEqualPolicy2) {
                    derivedStateOf = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(transition, 2));
                    gapComposer6.updateRememberedValue(derivedStateOf);
                } else {
                    derivedStateOf = rememberedValue4;
                }
                EnterExitState enterExitState3 = (EnterExitState) ((State) derivedStateOf).getValue();
                gapComposer6.startReplaceGroup(-1002884757);
                float f3 = enterExitState3 != enterExitState2 ? RecyclerView.DECELERATION_RATE : -30.0f;
                gapComposer6.end(false);
                Float valueOf2 = Float.valueOf(f3);
                boolean changed4 = gapComposer6.changed(transition);
                Object rememberedValue5 = gapComposer6.rememberedValue();
                if (changed4 || rememberedValue5 == neverEqualPolicy2) {
                    derivedStateOf2 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(transition, 3));
                    gapComposer6.updateRememberedValue(derivedStateOf2);
                } else {
                    derivedStateOf2 = rememberedValue5;
                }
                gapComposer6.startReplaceGroup(-985243360);
                mutableState = mutableState5;
                SpringSpec spring$default = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 7);
                gapComposer6.end(false);
                neverEqualPolicy = neverEqualPolicy2;
                state = AnimatableKt.createTransitionAnimation(transition, valueOf, valueOf2, spring$default, twoWayConverterImpl, gapComposer6, 0);
                gapComposer = gapComposer6;
                gapComposer.end(false);
            } else {
                gapComposer = gapComposer6;
                mutableState = mutableState5;
                neverEqualPolicy = neverEqualPolicy2;
                gapComposer.startReplaceGroup(1577074535);
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = Updater.mutableStateOf$default(Float.valueOf(RecyclerView.DECELERATION_RATE));
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                state = (MutableState) rememberedValue6;
                gapComposer.end(false);
            }
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (rememberedValue7 == neverEqualPolicy) {
                rememberedValue7 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue7);
            }
            MutableState mutableState7 = (MutableState) rememberedValue7;
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            CardPreviewViewModel.Preview preview3 = preview2;
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            State state2 = state;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion2);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$14);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
            Integer valueOf3 = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf3, composeUiNode$Companion$SetModifier$16);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$17);
            NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
            GapComposer gapComposer7 = gapComposer;
            MutableState mutableState8 = mutableState6;
            Modifier sharedBounds$default = SharedTransitionScope.sharedBounds$default(uiScope, ZIndexModifierKt.zIndex(companion2, 1.0f), rememberSharedContentState, uiScope, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1);
            NavigationType navigationType = NavigationType.CLOSE;
            boolean changed5 = gapComposer7.changed(function12) | gapComposer7.changedInstance(textureViewFpsTracker2);
            Object rememberedValue8 = gapComposer7.rememberedValue();
            if (changed5 || rememberedValue8 == neverEqualPolicy3) {
                rememberedValue8 = new CardPreviewViewKt$$ExternalSyntheticLambda0(function12, textureViewFpsTracker2, 2);
                gapComposer7.updateRememberedValue(rememberedValue8);
            }
            DBUtil.TitleBarSub((String) null, navigationType, sharedBounds$default, (DynamicColorConfiguration) null, (Function0) rememberedValue8, (Modifier) null, (Function3) null, gapComposer7, 54, 104);
            GapComposer gapComposer8 = gapComposer7;
            Modifier fillMaxSize = androidx.compose.foundation.layout.SizeKt.fillMaxSize(SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, 34.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13).then(new LayoutWeightElement(1.0f, true)), 1.0f);
            BiasAlignment biasAlignment3 = Alignment.Companion.TopStart;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment3, false);
            int hashCode2 = Long.hashCode(gapComposer8.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer8.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer8, fillMaxSize);
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer8.startReusableNode();
            if (gapComposer8.inserting) {
                gapComposer8.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer8.useNode();
            }
            Updater.m576setimpl(gapComposer8, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$14);
            Updater.m576setimpl(gapComposer8, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$15);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer8, composeUiNode$Companion$SetModifier$16, gapComposer8, ownerSnapshotObserver$onCommitAffectingLayout$12);
            Updater.m576setimpl(gapComposer8, materializeModifier2, composeUiNode$Companion$SetModifier$17);
            if (preview3 != null) {
                preview = preview3;
                StyledCardViewModel styledCardViewModel = preview.cardViewModel;
                gapComposer8.startReplaceGroup(-11778998);
                Context context = (Context) gapComposer8.consume(AndroidCompositionLocals_androidKt.LocalContext);
                function1 = function12;
                Object rememberedValue9 = gapComposer8.rememberedValue();
                Object obj10 = rememberedValue9;
                if (rememberedValue9 == neverEqualPolicy3) {
                    ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer8.updateRememberedValue(mutableStateOf$default2);
                    obj10 = mutableStateOf$default2;
                }
                MutableState mutableState9 = (MutableState) obj10;
                biasAlignment = biasAlignment3;
                CardPresentationStyle cardPresentationStyle = preview.presentationStyle;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                CardPresentationStyle cardPresentationStyle2 = CardPresentationStyle.TRUE_3D;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (cardPresentationStyle != cardPresentationStyle2 || ((Boolean) mutableState9.getValue()).booleanValue()) {
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                    textureViewFpsTracker = textureViewFpsTracker2;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    mutableState2 = mutableState7;
                    gapComposer8.startReplaceGroup(-9184732);
                    Object rememberedValue10 = gapComposer8.rememberedValue();
                    Object obj11 = rememberedValue10;
                    if (rememberedValue10 == neverEqualPolicy3) {
                        StyledCardPerspectiveView styledCardPerspectiveView = new StyledCardPerspectiveView(context);
                        styledCardPerspectiveView.setApplyPerspective(true);
                        styledCardPerspectiveView.setInteractive(true);
                        gapComposer8.updateRememberedValue(styledCardPerspectiveView);
                        obj11 = styledCardPerspectiveView;
                    }
                    StyledCardPerspectiveView styledCardPerspectiveView2 = (StyledCardPerspectiveView) obj11;
                    if (styledCardViewModel.theme.background_image == CardTheme.BackgroundImage.DREAM) {
                        gapComposer8.startReplaceGroup(-8886326);
                        booleanValue2 = ((Boolean) mutableState2.getValue()).booleanValue();
                        Boolean valueOf4 = Boolean.valueOf(booleanValue2);
                        boolean changedInstance = gapComposer8.changedInstance(styledCardPerspectiveView2);
                        Object rememberedValue11 = gapComposer8.rememberedValue();
                        Object obj12 = rememberedValue11;
                        if (changedInstance || rememberedValue11 == neverEqualPolicy3) {
                            InteractiveCardView$flingTo$1.AnonymousClass2 anonymousClass2 = new InteractiveCardView$flingTo$1.AnonymousClass2(styledCardPerspectiveView2, mutableState2, (Continuation) null, 26);
                            gapComposer8.updateRememberedValue(anonymousClass2);
                            obj12 = anonymousClass2;
                        }
                        Updater.LaunchedEffect(gapComposer8, valueOf4, (Function2) obj12);
                        Unit unit = Unit.INSTANCE;
                        boolean changedInstance2 = gapComposer8.changedInstance(styledCardPerspectiveView2);
                        Object rememberedValue12 = gapComposer8.rememberedValue();
                        Object obj13 = rememberedValue12;
                        if (changedInstance2 || rememberedValue12 == neverEqualPolicy3) {
                            TemporaryStorage$getDir$2 temporaryStorage$getDir$2 = new TemporaryStorage$getDir$2(styledCardPerspectiveView2, null, 12);
                            gapComposer8.updateRememberedValue(temporaryStorage$getDir$2);
                            obj13 = temporaryStorage$getDir$2;
                        }
                        Updater.LaunchedEffect(gapComposer8, unit, (Function2) obj13);
                        gapComposer8.end(false);
                    } else {
                        gapComposer8.startReplaceGroup(-8584572);
                        gapComposer8.end(false);
                    }
                    Modifier fillMaxSize2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize(boxScopeInstance.align(companion2, biasAlignment2), 1.0f);
                    boolean changedInstance3 = gapComposer8.changedInstance(styledCardPerspectiveView2);
                    Object rememberedValue13 = gapComposer8.rememberedValue();
                    Object obj14 = rememberedValue13;
                    if (changedInstance3 || rememberedValue13 == neverEqualPolicy3) {
                        RewardSlotQueries$$ExternalSyntheticLambda0 rewardSlotQueries$$ExternalSyntheticLambda0 = new RewardSlotQueries$$ExternalSyntheticLambda0(styledCardPerspectiveView2, 26);
                        gapComposer8.updateRememberedValue(rewardSlotQueries$$ExternalSyntheticLambda0);
                        obj14 = rewardSlotQueries$$ExternalSyntheticLambda0;
                    }
                    Function1 function13 = (Function1) obj14;
                    boolean changedInstance4 = gapComposer8.changedInstance(preview);
                    Object rememberedValue14 = gapComposer8.rememberedValue();
                    Object obj15 = rememberedValue14;
                    if (changedInstance4 || rememberedValue14 == neverEqualPolicy3) {
                        final int i = 1;
                        Function1 function14 = new Function1() { // from class: com.squareup.cash.card.onboarding.CardPreviewViewKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj16) {
                                int i2 = i;
                                CardPreviewViewModel.Preview preview4 = preview;
                                switch (i2) {
                                    case 0:
                                        InteractiveCardView interactiveCardView = (InteractiveCardView) obj16;
                                        interactiveCardView.getClass();
                                        ViewParent parent = interactiveCardView.getParent();
                                        parent.getClass();
                                        ((ViewGroup) parent).setClipChildren(false);
                                        interactiveCardView.render(StyledCardViewModelExtKt.toInteractiveCardViewModel(preview4.cardViewModel));
                                        break;
                                    default:
                                        StyledCardPerspectiveView styledCardPerspectiveView3 = (StyledCardPerspectiveView) obj16;
                                        styledCardPerspectiveView3.getClass();
                                        styledCardPerspectiveView3.render(preview4.cardViewModel);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer8.updateRememberedValue(function14);
                        obj15 = function14;
                    }
                    AndroidView_androidKt.AndroidView(function13, fillMaxSize2, (Function1) obj15, gapComposer8, 0, 0);
                    GapComposer gapComposer9 = gapComposer8;
                    z3 = false;
                    gapComposer9.end(false);
                    gapComposer4 = gapComposer9;
                } else {
                    gapComposer8.startReplaceGroup(-11619999);
                    if (preview.disableFilament) {
                        gapComposer8.startReplaceGroup(-11624990);
                        wrapContentHeight2 = androidx.compose.foundation.layout.SizeKt.wrapContentHeight(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion2, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                        Modifier align = boxScopeInstance.align(OffsetKt.aspectRatio(1.0f, wrapContentHeight2, false), biasAlignment2);
                        MutableState rememberUpdatedState = Updater.rememberUpdatedState(StyledCardViewModelExtKt.toInteractiveCardViewModel(styledCardViewModel), gapComposer8);
                        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(new Vector4(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, ((Number) state2.getValue()).floatValue(), RecyclerView.DECELERATION_RATE), gapComposer8);
                        MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(Float.valueOf(25.0f), gapComposer8);
                        MutableState rememberUpdatedState4 = Updater.rememberUpdatedState(Float.valueOf(8.0f), gapComposer8);
                        Object rememberedValue15 = gapComposer8.rememberedValue();
                        Object obj16 = rememberedValue15;
                        if (rememberedValue15 == neverEqualPolicy3) {
                            CashCardKt$$ExternalSyntheticLambda0 cashCardKt$$ExternalSyntheticLambda0 = new CashCardKt$$ExternalSyntheticLambda0(15, mutableState9);
                            gapComposer8.updateRememberedValue(cashCardKt$$ExternalSyntheticLambda0);
                            obj16 = cashCardKt$$ExternalSyntheticLambda0;
                        }
                        Function1 function15 = (Function1) obj16;
                        boolean changedInstance5 = gapComposer8.changedInstance(textureViewFpsTracker2);
                        Object rememberedValue16 = gapComposer8.rememberedValue();
                        Object obj17 = rememberedValue16;
                        if (changedInstance5 || rememberedValue16 == neverEqualPolicy3) {
                            RewardSlotQueries$$ExternalSyntheticLambda0 rewardSlotQueries$$ExternalSyntheticLambda02 = new RewardSlotQueries$$ExternalSyntheticLambda0(textureViewFpsTracker2, 27);
                            gapComposer8.updateRememberedValue(rewardSlotQueries$$ExternalSyntheticLambda02);
                            obj17 = rewardSlotQueries$$ExternalSyntheticLambda02;
                        }
                        CardSceneEffectKt.CardSceneEffect(align, rememberUpdatedState, rememberUpdatedState2, null, null, false, rememberUpdatedState3, rememberUpdatedState4, null, null, null, null, function15, (Function1) obj17, gapComposer8, 0, 7800);
                        GapComposer gapComposer10 = gapComposer8;
                        z3 = false;
                        gapComposer10.end(false);
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                        textureViewFpsTracker = textureViewFpsTracker2;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        mutableState2 = mutableState7;
                        gapComposer5 = gapComposer10;
                    } else {
                        gapComposer8.startReplaceGroup(-10708506);
                        Object rememberedValue17 = gapComposer8.rememberedValue();
                        if (rememberedValue17 == neverEqualPolicy3) {
                            ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                            InteractiveCardView interactiveCardView = new InteractiveCardView(context, null);
                            interactiveCardView.setFpsTracker(textureViewFpsTracker2);
                            interactiveCardView.setOnError(new TabContentViewKt$$ExternalSyntheticLambda1(26, mutableState9));
                            gapComposer8.updateRememberedValue(interactiveCardView);
                            obj4 = interactiveCardView;
                        } else {
                            ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                            obj4 = rememberedValue17;
                        }
                        InteractiveCardView interactiveCardView2 = (InteractiveCardView) obj4;
                        Float valueOf5 = Float.valueOf(((Number) state2.getValue()).floatValue());
                        boolean changedInstance6 = gapComposer8.changedInstance(interactiveCardView2) | gapComposer8.changed(state2);
                        Object rememberedValue18 = gapComposer8.rememberedValue();
                        if (changedInstance6 || rememberedValue18 == neverEqualPolicy3) {
                            textureViewFpsTracker = textureViewFpsTracker2;
                            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                            InteractiveCardView$flingTo$1.AnonymousClass2 anonymousClass22 = new InteractiveCardView$flingTo$1.AnonymousClass2(interactiveCardView2, state2, (Continuation) null, 24);
                            gapComposer8.updateRememberedValue(anonymousClass22);
                            obj5 = anonymousClass22;
                        } else {
                            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                            textureViewFpsTracker = textureViewFpsTracker2;
                            obj5 = rememberedValue18;
                        }
                        Updater.LaunchedEffect(gapComposer8, valueOf5, (Function2) obj5);
                        int i2 = 25;
                        if (styledCardViewModel.theme.background_image == CardTheme.BackgroundImage.DREAM) {
                            gapComposer8.startReplaceGroup(-10257828);
                            booleanValue3 = ((Boolean) mutableState7.getValue()).booleanValue();
                            Boolean valueOf6 = Boolean.valueOf(booleanValue3);
                            boolean changedInstance7 = gapComposer8.changedInstance(interactiveCardView2);
                            Object rememberedValue19 = gapComposer8.rememberedValue();
                            if (changedInstance7 || rememberedValue19 == neverEqualPolicy3) {
                                mutableState2 = mutableState7;
                                InteractiveCardView$flingTo$1.AnonymousClass2 anonymousClass23 = new InteractiveCardView$flingTo$1.AnonymousClass2(interactiveCardView2, (State) mutableState2, (Continuation) null, i2);
                                gapComposer8.updateRememberedValue(anonymousClass23);
                                obj7 = anonymousClass23;
                            } else {
                                mutableState2 = mutableState7;
                                obj7 = rememberedValue19;
                            }
                            Updater.LaunchedEffect(gapComposer8, valueOf6, (Function2) obj7);
                            Unit unit2 = Unit.INSTANCE;
                            boolean changedInstance8 = gapComposer8.changedInstance(interactiveCardView2);
                            Object rememberedValue20 = gapComposer8.rememberedValue();
                            Object obj18 = rememberedValue20;
                            if (changedInstance8 || rememberedValue20 == neverEqualPolicy3) {
                                TemporaryStorage$getDir$2 temporaryStorage$getDir$22 = new TemporaryStorage$getDir$2(interactiveCardView2, null, 11);
                                gapComposer8.updateRememberedValue(temporaryStorage$getDir$22);
                                obj18 = temporaryStorage$getDir$22;
                            }
                            Updater.LaunchedEffect(gapComposer8, unit2, (Function2) obj18);
                            z4 = false;
                            gapComposer8.end(false);
                        } else {
                            mutableState2 = mutableState7;
                            z4 = false;
                            gapComposer8.startReplaceGroup(-9788860);
                            gapComposer8.end(false);
                        }
                        wrapContentHeight = androidx.compose.foundation.layout.SizeKt.wrapContentHeight(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion2, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                        Modifier align2 = boxScopeInstance.align(OffsetKt.aspectRatio(0.8f, wrapContentHeight, z4), biasAlignment2);
                        boolean changedInstance9 = gapComposer8.changedInstance(interactiveCardView2);
                        Object rememberedValue21 = gapComposer8.rememberedValue();
                        Object obj19 = rememberedValue21;
                        if (changedInstance9 || rememberedValue21 == neverEqualPolicy3) {
                            RewardSlotQueries$$ExternalSyntheticLambda0 rewardSlotQueries$$ExternalSyntheticLambda03 = new RewardSlotQueries$$ExternalSyntheticLambda0(interactiveCardView2, i2);
                            gapComposer8.updateRememberedValue(rewardSlotQueries$$ExternalSyntheticLambda03);
                            obj19 = rewardSlotQueries$$ExternalSyntheticLambda03;
                        }
                        Function1 function16 = (Function1) obj19;
                        boolean changedInstance10 = gapComposer8.changedInstance(preview);
                        Object rememberedValue22 = gapComposer8.rememberedValue();
                        if (changedInstance10 || rememberedValue22 == neverEqualPolicy3) {
                            z3 = false;
                            final boolean z6 = false ? 1 : 0;
                            Function1 function17 = new Function1() { // from class: com.squareup.cash.card.onboarding.CardPreviewViewKt$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj162) {
                                    int i22 = z6;
                                    CardPreviewViewModel.Preview preview4 = preview;
                                    switch (i22) {
                                        case 0:
                                            InteractiveCardView interactiveCardView3 = (InteractiveCardView) obj162;
                                            interactiveCardView3.getClass();
                                            ViewParent parent = interactiveCardView3.getParent();
                                            parent.getClass();
                                            ((ViewGroup) parent).setClipChildren(false);
                                            interactiveCardView3.render(StyledCardViewModelExtKt.toInteractiveCardViewModel(preview4.cardViewModel));
                                            break;
                                        default:
                                            StyledCardPerspectiveView styledCardPerspectiveView3 = (StyledCardPerspectiveView) obj162;
                                            styledCardPerspectiveView3.getClass();
                                            styledCardPerspectiveView3.render(preview4.cardViewModel);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer8.updateRememberedValue(function17);
                            obj6 = function17;
                        } else {
                            z3 = false;
                            obj6 = rememberedValue22;
                        }
                        AndroidView_androidKt.AndroidView(function16, align2, (Function1) obj6, gapComposer8, 0, 0);
                        GapComposer gapComposer11 = gapComposer8;
                        gapComposer11.end(z3);
                        gapComposer5 = gapComposer11;
                    }
                    gapComposer5.end(z3);
                    gapComposer4 = gapComposer5;
                }
                gapComposer4.end(z3);
                gapComposer2 = gapComposer4;
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                function1 = function12;
                textureViewFpsTracker = textureViewFpsTracker2;
                biasAlignment = biasAlignment3;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                preview = preview3;
                mutableState2 = mutableState7;
                gapComposer8.startReplaceGroup(-8309788);
                gapComposer8.end(false);
                gapComposer2 = gapComposer8;
            }
            gapComposer2.end(true);
            if (preview != null) {
                StyledCardViewModel styledCardViewModel2 = preview.cardViewModel;
                gapComposer2.startReplaceGroup(-75139680);
                Modifier then = SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13).then(isMatchFound ? AnimatedVisibilityScope.animateEnterExit$default(uiScope, companion2, EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(400, 100, null, 4), 2), ExitTransitionImpl.None, 4) : companion2);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Bottom, horizontal, gapComposer2, 6);
                int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, then);
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = composeUiNode$Companion$SetModifier$1;
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$18);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = composeUiNode$Companion$SetModifier$12;
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$19, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$13);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$110 = composeUiNode$Companion$SetModifier$13;
                Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$110);
                Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion2, 1.0f);
                Strings.getSizes(gapComposer2).getClass();
                zzc zzcVar = DefaultSizes.spacing;
                zzcVar.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                MutableState mutableState10 = mutableState2;
                Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                BiasAlignment.Vertical vertical2 = Alignment.Companion.CenterVertically;
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical2, gapComposer2, 54);
                int hashCode4 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$18);
                Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer2, composeUiNode$Companion$SetModifier$19, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$13);
                GapComposer gapComposer12 = gapComposer2;
                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4024, 0L, (Composer) gapComposer12, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, materializeModifier4, composeUiNode$Companion$SetModifier$110, 1.0f, true), Strings.getTypography(gapComposer2).header, (TextLineBalancing) null, preview.title, (Map) null, (Function1) null, false);
                GapComposer gapComposer13 = gapComposer12;
                if (styledCardViewModel2.theme.background_image == CardTheme.BackgroundImage.DREAM) {
                    gapComposer13.startReplaceGroup(220366339);
                    Trace.m1191Iconww6aTOc(Icons.DeviceTap24, (String) null, SpacerKt.m298padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(companion2, 32.0f), 4.0f), 0L, gapComposer13, 438, 8);
                    Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion2, RecyclerView.DECELERATION_RATE, 8.0f, 1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    vertical = vertical2;
                    int hashCode5 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer13.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer13, m300paddingVpY3zN4$default2);
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer13.startReusableNode();
                    if (gapComposer13.inserting) {
                        gapComposer13.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer13.useNode();
                    }
                    Updater.m576setimpl(gapComposer13, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                    Updater.m576setimpl(gapComposer13, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$18);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer13, composeUiNode$Companion$SetModifier$19, gapComposer13, ownerSnapshotObserver$onCommitAffectingLayout$13);
                    Updater.m576setimpl(gapComposer13, materializeModifier5, composeUiNode$Companion$SetModifier$110);
                    booleanValue = ((Boolean) mutableState10.getValue()).booleanValue();
                    Object rememberedValue23 = gapComposer13.rememberedValue();
                    if (rememberedValue23 == neverEqualPolicy3) {
                        rememberedValue23 = new CashCardKt$$ExternalSyntheticLambda0(14, mutableState10);
                        gapComposer13.updateRememberedValue(rememberedValue23);
                    }
                    ModalKt.Toggle(booleanValue, null, (Function1) rememberedValue23, false, null, gapComposer13, MLKEMEngine.KyberPolyBytes, 26);
                    gapComposer13 = gapComposer13;
                    z2 = true;
                    gapComposer13.end(true);
                    z = false;
                    gapComposer13.end(false);
                } else {
                    vertical = vertical2;
                    z = false;
                    z2 = true;
                    gapComposer13.startReplaceGroup(220998677);
                    gapComposer13.end(false);
                }
                gapComposer13.end(z2);
                String str = preview.appThemeInfo;
                if (str == null) {
                    gapComposer13.startReplaceGroup(-72013257);
                    gapComposer13.end(z);
                    companion = companion2;
                    f = 16.0f;
                } else {
                    gapComposer13.startReplaceGroup(-72013256);
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    f = 16.0f;
                    Strings.getSizes(gapComposer13).getClass();
                    zzcVar.getClass();
                    Modifier m300paddingVpY3zN4$default3 = SpacerKt.m300paddingVpY3zN4$default(m302paddingqDBjuR0$default, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    if (preview.sheet != null) {
                        gapComposer13.startReplaceGroup(293073045);
                        Object rememberedValue24 = gapComposer13.rememberedValue();
                        if (rememberedValue24 == neverEqualPolicy3) {
                            mutableState4 = mutableState8;
                            rememberedValue24 = new TabContentViewKt$$ExternalSyntheticLambda1(27, mutableState4);
                            gapComposer13.updateRememberedValue(rememberedValue24);
                        } else {
                            mutableState4 = mutableState8;
                        }
                        modifier = ImageKt.m183clickableoSLSa3U$default(companion2, false, null, null, (Function0) rememberedValue24, 15);
                        companion = companion2;
                        gapComposer13.end(false);
                    } else {
                        companion = companion2;
                        mutableState4 = mutableState8;
                        gapComposer13.startReplaceGroup(293175097);
                        gapComposer13.end(false);
                        modifier = companion;
                    }
                    Modifier then2 = m300paddingVpY3zN4$default3.then(modifier);
                    mutableState8 = mutableState4;
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer13, 54);
                    int hashCode6 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer13.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer13, then2);
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer13.startReusableNode();
                    if (gapComposer13.inserting) {
                        gapComposer13.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer13.useNode();
                    }
                    Updater.m576setimpl(gapComposer13, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                    Updater.m576setimpl(gapComposer13, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$18);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode6, gapComposer13, composeUiNode$Companion$SetModifier$19, gapComposer13, ownerSnapshotObserver$onCommitAffectingLayout$13);
                    Updater.m576setimpl(gapComposer13, materializeModifier6, composeUiNode$Companion$SetModifier$110);
                    com.squareup.protos.cash.ui.Color color = preview.appThemeInfoColorOverride;
                    if (color == null) {
                        gapComposer13.startReplaceGroup(-1677090928);
                        gapComposer13.end(false);
                        m = null;
                    } else {
                        m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer13, 361542289, color, gapComposer13, false);
                    }
                    if (m != null) {
                        Color = m.value;
                    } else {
                        Integer safeParseColor = com.squareup.util.android.StringsKt.safeParseColor(styledCardViewModel2.theme.card_color, null);
                        safeParseColor.getClass();
                        Color = ColorKt.Color(safeParseColor.intValue());
                    }
                    long j = Color;
                    GapComposer gapComposer14 = gapComposer13;
                    Trace.m1191Iconww6aTOc(Icons.CashAppCustomer16, (String) null, androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(companion, 24.0f), j, gapComposer14, 438, 0);
                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, j, (Composer) gapComposer14, (Modifier) null, Strings.getTypography(gapComposer14).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    gapComposer13 = gapComposer14;
                    gapComposer13.end(true);
                    gapComposer13.end(false);
                }
                gapComposer13.startReplaceGroup(-1803396695);
                float mo231toDpGaN1DYA = (((Density) gapComposer13.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(Strings.getTypography(gapComposer13).bodyMedium.paragraphStyle.lineHeight) * 3.0f) + f;
                gapComposer13.end(false);
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, 44.0f, 5);
                Strings.getSizes(gapComposer13).getClass();
                zzcVar.getClass();
                Modifier clipToBounds = ClipKt.clipToBounds(ImageKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.m279heightInVpY3zN4$default(SpacerKt.m300paddingVpY3zN4$default(m302paddingqDBjuR0$default2, 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, mo231toDpGaN1DYA, 1), ImageKt.rememberScrollState(gapComposer13), false, 14));
                ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer13, 0);
                int hashCode7 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer13.currentCompositionLocalScope();
                Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer13, clipToBounds);
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer13.startReusableNode();
                if (gapComposer13.inserting) {
                    gapComposer13.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer13.useNode();
                }
                Updater.m576setimpl(gapComposer13, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$14);
                Updater.m576setimpl(gapComposer13, currentCompositionLocalScope7, composeUiNode$Companion$SetModifier$18);
                Recorder$$ExternalSyntheticOutline2.m(hashCode7, gapComposer13, composeUiNode$Companion$SetModifier$19, gapComposer13, ownerSnapshotObserver$onCommitAffectingLayout$13);
                Updater.m576setimpl(gapComposer13, materializeModifier7, composeUiNode$Companion$SetModifier$110);
                GapComposer gapComposer15 = gapComposer13;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer13).semantic.text.subtle, (Composer) gapComposer15, (Modifier) null, Strings.getTypography(gapComposer13).bodyMedium, (TextLineBalancing) null, preview.description, (Map) null, (Function1) null, false);
                gapComposer15.end(true);
                CardPreviewViewModel.Preview preview4 = preview;
                mutableState3 = mutableState8;
                preview = preview4;
                DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1031155317, new ComposeDialogKt$$ExternalSyntheticLambda12(preview4, function1, textureViewFpsTracker, mutableState, 24), gapComposer15), gapComposer15, 24576, 15);
                GapComposer gapComposer16 = gapComposer15;
                gapComposer16.end(true);
                gapComposer16.end(false);
                gapComposer3 = gapComposer16;
            } else {
                mutableState3 = mutableState8;
                gapComposer2.startReplaceGroup(-70332758);
                gapComposer2.end(false);
                gapComposer3 = gapComposer2;
            }
            gapComposer3.end(true);
            CardPreviewSheet cardPreviewSheet = (!((Boolean) mutableState3.getValue()).booleanValue() || preview == null) ? null : preview.sheet;
            Object rememberedValue25 = gapComposer3.rememberedValue();
            Object obj20 = rememberedValue25;
            if (rememberedValue25 == neverEqualPolicy3) {
                TabContentViewKt$$ExternalSyntheticLambda1 tabContentViewKt$$ExternalSyntheticLambda1 = new TabContentViewKt$$ExternalSyntheticLambda1(28, mutableState3);
                gapComposer3.updateRememberedValue(tabContentViewKt$$ExternalSyntheticLambda1);
                obj20 = tabContentViewKt$$ExternalSyntheticLambda1;
            }
            CardPreviewViewKt.ThemeInfoBottomSheet(cardPreviewSheet, (Function0) obj20, gapComposer3, 48);
        } else {
            gapComposer6.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$card$onboarding$CardPreviewViewKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        NeverEqualPolicy neverEqualPolicy;
        final CardPreviewViewModel.Preview preview = (CardPreviewViewModel.Preview) this.f$0;
        Function1 function1 = (Function1) this.f$3;
        TextureViewFpsTracker textureViewFpsTracker = (TextureViewFpsTracker) this.f$4;
        MutableState mutableState = (MutableState) this.f$5;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        final int i = 0;
        final int i2 = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            boolean z = preview.isPersonalizable;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (z) {
                gapComposer.startReplaceGroup(-1541874655);
                Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(textureViewFpsTracker);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy2) {
                    rememberedValue = new CardPreviewViewKt$$ExternalSyntheticLambda0(function1, textureViewFpsTracker, 1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                neverEqualPolicy = neverEqualPolicy2;
                SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-384256693, new Function3() { // from class: com.squareup.cash.card.onboarding.CardPreviewViewKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        int i3 = i;
                        CardPreviewViewModel.Preview preview2 = preview;
                        switch (i3) {
                            case 0:
                                Composer composer2 = (Composer) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                ((RowScope) obj4).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    String str = preview2.personalize;
                                    str.getClass();
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj5;
                                int intValue3 = ((Integer) obj6).intValue();
                                ((RowScope) obj4).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, preview2.order, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 1572912, 60);
                gapComposer.end(false);
            } else {
                neverEqualPolicy = neverEqualPolicy2;
                gapComposer.startReplaceGroup(-1541620393);
                gapComposer.end(false);
            }
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
            boolean z2 = preview.available && ((Boolean) mutableState.getValue()).booleanValue();
            boolean changed2 = gapComposer.changed(mutableState) | gapComposer.changed(function1) | gapComposer.changedInstance(textureViewFpsTracker);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                CopyCodeKt$$ExternalSyntheticLambda4 copyCodeKt$$ExternalSyntheticLambda4 = new CopyCodeKt$$ExternalSyntheticLambda4(function1, textureViewFpsTracker, mutableState, false, 18);
                gapComposer.updateRememberedValue(copyCodeKt$$ExternalSyntheticLambda4);
                rememberedValue2 = copyCodeKt$$ExternalSyntheticLambda4;
            }
            SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth2, buttonProminence, false, z2, null, Expect_jvmKt.rememberComposableLambda(825682502, new Function3() { // from class: com.squareup.cash.card.onboarding.CardPreviewViewKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    int i3 = i2;
                    CardPreviewViewModel.Preview preview2 = preview;
                    switch (i3) {
                        case 0:
                            Composer composer2 = (Composer) obj5;
                            int intValue2 = ((Integer) obj6).intValue();
                            ((RowScope) obj4).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                String str = preview2.personalize;
                                str.getClass();
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj5;
                            int intValue3 = ((Integer) obj6).intValue();
                            ((RowScope) obj4).getClass();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, preview2.order, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 1573296, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$card$onboarding$CardStudioViewKt$$ExternalSyntheticLambda7(Object obj, Object obj2, Object obj3) {
        StampState stampState = (StampState) this.f$0;
        PatternStampState patternStampState = (PatternStampState) this.f$3;
        MutableState mutableState = (MutableState) this.f$4;
        MutableState mutableState2 = (MutableState) this.f$5;
        PointF pointF = (PointF) obj;
        Float f = (Float) obj2;
        f.getClass();
        Float f2 = (Float) obj3;
        f2.floatValue();
        pointF.getClass();
        mutableState.setValue(pointF);
        mutableState2.setValue(f);
        stampState.strokeWidth$delegate.setValue(f2);
        patternStampState.strokeWidth$delegate.setValue(f2);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$card$onboarding$core$instancing$CardDesignLibraryEffectKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f$0;
        String str2 = (String) this.f$3;
        MutableState mutableState = (MutableState) this.f$4;
        CardDesignLibraryScene cardDesignLibraryScene = (CardDesignLibraryScene) this.f$5;
        ((Integer) obj3).getClass();
        ((AnimatedVisibilityScope) obj).getClass();
        ZoomLevel zoomLevel = (ZoomLevel) mutableState.getValue();
        GapComposer gapComposer = (GapComposer) ((Composer) obj2);
        boolean changed = gapComposer.changed(mutableState) | gapComposer.changedInstance(cardDesignLibraryScene);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(18, cardDesignLibraryScene, mutableState);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        GridLayout.GridZoomToggle(zoomLevel, str, str2, (Function0) rememberedValue, gapComposer, 0);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$core$views$ArcadeBottomNavigationKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3) {
        String str;
        Badge badge;
        Badge large;
        boolean changed;
        Object rememberedValue;
        List list = (List) this.f$0;
        Integer num = (Integer) this.f$3;
        ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) this.f$4;
        Function1 function1 = (Function1) this.f$5;
        BottomNavigationScope bottomNavigationScope = (BottomNavigationScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        bottomNavigationScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(bottomNavigationScope) ? 4 : 2;
        }
        int i = intValue;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(i & 1, (i & 19) != 18)) {
            int i2 = 0;
            for (Object obj4 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                MainScreensViewModel$Tab mainScreensViewModel$Tab = (MainScreensViewModel$Tab) obj4;
                MainScreensViewModel$Tab.Icon icon = mainScreensViewModel$Tab.icon;
                long j = icon instanceof MainScreensViewModel$Tab.Icon.FullBadge ? ((MainScreensViewModel$Tab.Icon.FullBadge) icon).count : mainScreensViewModel$Tab.badgeCount;
                String str2 = mainScreensViewModel$Tab.tooltipText;
                String str3 = icon instanceof MainScreensViewModel$Tab.Icon.Text ? mainScreensViewModel$Tab.contentAccessibilityText : null;
                boolean z = i2 == num.intValue();
                if (j == 1) {
                    large = Badge.Small.INSTANCE;
                } else if (j > 1) {
                    large = new Badge.Large(j);
                } else {
                    str = str3;
                    badge = null;
                    Modifier provideBounds = BottomNavigationKt.provideBounds(elementBoundsRegistry, mainScreensViewModel$Tab.tooltipTarget);
                    changed = gapComposer.changed(function1) | gapComposer.changedInstance(mainScreensViewModel$Tab);
                    rememberedValue = gapComposer.rememberedValue();
                    if (!changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new BottomNavigationKt$$ExternalSyntheticLambda3(function1, mainScreensViewModel$Tab, 1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    bottomNavigationScope.BottomNavItem(provideBounds, z, badge, null, str2, str, (Function0) rememberedValue, Expect_jvmKt.rememberComposableLambda(-1089924131, new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(0, icon, mainScreensViewModel$Tab), gapComposer), gapComposer, ((i << 24) & 234881024) | 12582912);
                    i2 = i3;
                    function1 = function1;
                }
                Badge badge2 = large;
                str = str3;
                badge = badge2;
                Modifier provideBounds2 = BottomNavigationKt.provideBounds(elementBoundsRegistry, mainScreensViewModel$Tab.tooltipTarget);
                changed = gapComposer.changed(function1) | gapComposer.changedInstance(mainScreensViewModel$Tab);
                rememberedValue = gapComposer.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new BottomNavigationKt$$ExternalSyntheticLambda3(function1, mainScreensViewModel$Tab, 1);
                gapComposer.updateRememberedValue(rememberedValue);
                bottomNavigationScope.BottomNavItem(provideBounds2, z, badge, null, str2, str, (Function0) rememberedValue, Expect_jvmKt.rememberComposableLambda(-1089924131, new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(0, icon, mainScreensViewModel$Tab), gapComposer), gapComposer, ((i << 24) & 234881024) | 12582912);
                i2 = i3;
                function1 = function1;
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$discover$promotiondetails$views$PromotionDetailsViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$0;
        PromotionDetailsViewModel promotionDetailsViewModel = (PromotionDetailsViewModel) this.f$3;
        RealImageLoader realImageLoader = (RealImageLoader) this.f$4;
        CashTreehouseLayout cashTreehouseLayout = (CashTreehouseLayout) this.f$5;
        UiScope uiScope = (UiScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        uiScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(uiScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-562793026, new AvatarsKt$$ExternalSyntheticLambda4(uiScope, function1, promotionDetailsViewModel, realImageLoader, cashTreehouseLayout, 20), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:298:0x09bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x09db  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0a5f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0a8f  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0a9b  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a49  */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v134 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean, int] */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean changed;
        Object rememberedValue;
        String str;
        String replace;
        LocalMenuComboDetailsViewModel localMenuComboDetailsViewModel;
        List list;
        Modifier.Companion companion;
        ?? r0;
        Modifier wrapContentHeight;
        LocalImage localImage;
        List list2;
        Modifier wrapContentHeight2;
        boolean z3;
        Modifier wrapContentHeight3;
        SnapshotStateMap snapshotStateMap;
        LocalMenuItemDetailsViewModel localMenuItemDetailsViewModel;
        List list3;
        Modifier.Companion companion2;
        ?? r02;
        Modifier wrapContentHeight4;
        LocalImage localImage2;
        Modifier wrapContentHeight5;
        boolean z4;
        Modifier wrapContentHeight6;
        SnapshotStateMap snapshotStateMap2;
        float f;
        int i = this.$r8$classId;
        int i2 = 9;
        int i3 = 14;
        Modifier modifier = Modifier.Companion.$$INSTANCE;
        int i4 = 6;
        Object obj4 = Composer.Companion.Empty;
        Object obj5 = this.f$5;
        Continuation continuation = null;
        Object obj6 = this.f$4;
        Object obj7 = this.f$3;
        Object obj8 = this.f$0;
        switch (i) {
            case 0:
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj7;
                Function0 function0 = (Function0) obj6;
                Function0 function02 = (Function0) obj5;
                OverlayLayer overlayLayer = (OverlayLayer) obj;
                ((Integer) obj3).getClass();
                overlayLayer.getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
                MutableState rememberUpdatedState = Updater.rememberUpdatedState(obj8, gapComposer);
                boolean changedInstance = gapComposer.changedInstance(context) | gapComposer.changed(composableLambdaImpl) | gapComposer.changed(rememberUpdatedState) | gapComposer.changed(function0) | gapComposer.changed(function02) | gapComposer.changedInstance(overlayLayer);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == obj4) {
                    Object sliderKt$$ExternalSyntheticLambda3 = new SliderKt$$ExternalSyntheticLambda3((Object) context, (Object) overlayLayer, (Object) composableLambdaImpl, rememberUpdatedState, (Object) function0, (Object) function02, 8);
                    gapComposer.updateRememberedValue(sliderKt$$ExternalSyntheticLambda3);
                    rememberedValue2 = sliderKt$$ExternalSyntheticLambda3;
                }
                Updater.DisposableEffect((Object) null, (Function1) rememberedValue2, gapComposer);
                return Unit.INSTANCE;
            case 1:
                boolean z5 = true;
                Function2 function2 = (Function2) obj8;
                ContextMenuScope contextMenuScope = (ContextMenuScope) obj7;
                Function3 function3 = (Function3) obj5;
                Function0 function03 = (Function0) obj6;
                ContextMenuColors contextMenuColors = (ContextMenuColors) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(contextMenuColors) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    z5 = false;
                }
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, z5)) {
                    String str2 = (String) function2.invoke(gapComposer2, 0);
                    if (StringsKt.isBlank(str2)) {
                        InlineClassHelperKt.throwIllegalStateException("Label must not be blank");
                    }
                    contextMenuScope.getClass();
                    ContextMenuPopupPositionProviderKt.f3lambda$1571120048.invoke(Modifier.Companion.$$INSTANCE, str2, Boolean.TRUE, contextMenuColors, function3, function03, gapComposer2, Integer.valueOf((intValue << 9) & 7168));
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                boolean z6 = true;
                Brush brush = (Brush) obj8;
                LegacyTextFieldState legacyTextFieldState = (LegacyTextFieldState) obj7;
                TextFieldValue textFieldValue = (TextFieldValue) obj6;
                OffsetMapping offsetMapping = (OffsetMapping) obj5;
                Modifier modifier2 = (Modifier) obj;
                ((Integer) obj3).getClass();
                GapComposer gapComposer3 = (GapComposer) ((Composer) obj2);
                gapComposer3.startReplaceGroup(-84507373);
                boolean booleanValue = ((Boolean) gapComposer3.consume(CompositionLocalsKt.LocalCursorBlinkEnabled)).booleanValue();
                boolean changed2 = gapComposer3.changed(booleanValue);
                Object rememberedValue3 = gapComposer3.rememberedValue();
                if (changed2 || rememberedValue3 == obj4) {
                    rememberedValue3 = new CursorAnimationState(booleanValue);
                    gapComposer3.updateRememberedValue(rememberedValue3);
                }
                CursorAnimationState cursorAnimationState = (CursorAnimationState) rememberedValue3;
                if ((brush instanceof SolidColor) && ((SolidColor) brush).value == 16) {
                    z6 = false;
                }
                if (((LazyWindowInfo) ((WindowInfo) gapComposer3.consume(CompositionLocalsKt.LocalWindowInfo))).isWindowFocused() && legacyTextFieldState.getHasFocus() && TextRange.m987getCollapsedimpl(textFieldValue.selection) && z6) {
                    gapComposer3.startReplaceGroup(-707487962);
                    AnnotatedString annotatedString = textFieldValue.annotatedString;
                    TextRange textRange = new TextRange(textFieldValue.selection);
                    boolean changedInstance2 = gapComposer3.changedInstance(cursorAnimationState);
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    if (changedInstance2 || rememberedValue4 == obj4) {
                        rememberedValue4 = new ThumbNode$onAttach$1(cursorAnimationState, continuation, 20);
                        gapComposer3.updateRememberedValue(rememberedValue4);
                    }
                    Updater.LaunchedEffect(annotatedString, textRange, (Function2) rememberedValue4, gapComposer3);
                    boolean changedInstance3 = gapComposer3.changedInstance(cursorAnimationState) | gapComposer3.changedInstance(offsetMapping) | gapComposer3.changed(textFieldValue) | gapComposer3.changedInstance(legacyTextFieldState) | gapComposer3.changed(brush);
                    Object rememberedValue5 = gapComposer3.rememberedValue();
                    if (changedInstance3 || rememberedValue5 == obj4) {
                        rememberedValue5 = new OverlayKt$$ExternalSyntheticLambda3(cursorAnimationState, offsetMapping, textFieldValue, legacyTextFieldState, brush, 3);
                        gapComposer3.updateRememberedValue(rememberedValue5);
                    }
                    modifier = ClipKt.drawWithContent(modifier2, (Function1) rememberedValue5);
                    z = false;
                    gapComposer3.end(false);
                } else {
                    z = false;
                    gapComposer3.startReplaceGroup(-705473241);
                    gapComposer3.end(false);
                }
                gapComposer3.end(z);
                return modifier;
            case 3:
                String str3 = (String) obj8;
                String str4 = (String) obj7;
                Object[] objArr = (Object[]) obj6;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj5;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                int i5 = PreviewActivity.$r8$clinit;
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer2;
                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    Modifier padding = SpacerKt.padding(modifier, paddingValues);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, padding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m574initimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    ComposableInvoker.invokeComposable(str3, str4, gapComposer4, objArr[parcelableSnapshotMutableIntState.getIntValue()]);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                LocalCheckoutTipSectionViewModel localCheckoutTipSectionViewModel = (LocalCheckoutTipSectionViewModel) obj8;
                List list4 = localCheckoutTipSectionViewModel.options;
                Function1 function1 = (Function1) obj7;
                Function1 function12 = (Function1) obj6;
                Function1 function13 = (Function1) obj5;
                ColumnScope columnScope = (ColumnScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                columnScope.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(columnScope) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer3;
                if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    List list5 = list4;
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        Iterator it = list5.iterator();
                        while (it.hasNext()) {
                            if (((TipOption) it.next()).selected) {
                                z2 = false;
                                Object[] objArr2 = new Object[0];
                                changed = gapComposer5.changed(z2);
                                rememberedValue = gapComposer5.rememberedValue();
                                if (!changed || rememberedValue == obj4) {
                                    rememberedValue = new Braze$$ExternalSyntheticLambda34(z2, 1);
                                    gapComposer5.updateRememberedValue(rememberedValue);
                                }
                                MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue, gapComposer5, 0);
                                if (list4.isEmpty()) {
                                    gapComposer5.startReplaceGroup(915673960);
                                    gapComposer5.end(false);
                                } else {
                                    gapComposer5.startReplaceGroup(915279950);
                                    List list6 = localCheckoutTipSectionViewModel.options;
                                    boolean z7 = z2 || ((Boolean) mutableState.getValue()).booleanValue();
                                    boolean changed3 = gapComposer5.changed(mutableState) | gapComposer5.changed(function1);
                                    Object rememberedValue6 = gapComposer5.rememberedValue();
                                    if (changed3 || rememberedValue6 == obj4) {
                                        rememberedValue6 = new CashMapViewKt$$ExternalSyntheticLambda3(function1, mutableState, 1);
                                        gapComposer5.updateRememberedValue(rememberedValue6);
                                    }
                                    Function1 function14 = (Function1) rememberedValue6;
                                    boolean changed4 = gapComposer5.changed(mutableState) | gapComposer5.changed(function12) | gapComposer5.changedInstance(localCheckoutTipSectionViewModel);
                                    Object rememberedValue7 = gapComposer5.rememberedValue();
                                    if (changed4 || rememberedValue7 == obj4) {
                                        rememberedValue7 = new n$$ExternalSyntheticLambda1(17, function12, localCheckoutTipSectionViewModel, mutableState);
                                        gapComposer5.updateRememberedValue(rememberedValue7);
                                    }
                                    CheckoutTipSectionKt.TipOptionsGroup(null, list6, z7, function14, (Function0) rememberedValue7, gapComposer5, 0);
                                    gapComposer5.end(false);
                                }
                                AnimatedContentKt.AnimatedVisibility(columnScope, !((Boolean) mutableState.getValue()).booleanValue() || z2, null, null, null, null, Expect_jvmKt.rememberComposableLambda(124015362, new CheckoutTipSectionKt$$ExternalSyntheticLambda8(localCheckoutTipSectionViewModel, function12, 0), gapComposer5), gapComposer5, (intValue3 & 14) | 1572864, 30);
                                str = localCheckoutTipSectionViewModel.finePrint;
                                if (str == null) {
                                    gapComposer5.startReplaceGroup(915968800);
                                    gapComposer5.end(false);
                                } else {
                                    gapComposer5.startReplaceGroup(915968801);
                                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                                    float f2 = LocalViewsKt.CloseToWhiteBackgroundBorderWidth;
                                    replace = new Regex("^\\* ").replace(str, Marker.ANY_MARKER);
                                    TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer5.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall, 0L, 0L, null, Fonts.CashSans, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183);
                                    Colors colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                                    } else {
                                        gapComposer5.startReplaceGroup(-1762997739);
                                        gapComposer5.end(false);
                                    }
                                    long j = colors.semantic.text.subtle;
                                    boolean changed5 = gapComposer5.changed(function13);
                                    Object rememberedValue8 = gapComposer5.rememberedValue();
                                    if (changed5 || rememberedValue8 == obj4) {
                                        rememberedValue8 = new SwipeToDismissKt$$ExternalSyntheticLambda4(3, function13);
                                        gapComposer5.updateRememberedValue(rememberedValue8);
                                    }
                                    LazyDslKt.m304MarkdownTextpCuZGqc(replace, (Function2) rememberedValue8, m302paddingqDBjuR0$default, m994copyp1EtxEg$default, j, null, null, null, 0, 0, 0, gapComposer5, MLKEMEngine.KyberPolyBytes, 2016);
                                    gapComposer5.end(false);
                                }
                            }
                        }
                    }
                    String str5 = localCheckoutTipSectionViewModel.overrideTip;
                    if (str5 != null && !StringsKt.isBlank(str5)) {
                        z2 = true;
                        Object[] objArr22 = new Object[0];
                        changed = gapComposer5.changed(z2);
                        rememberedValue = gapComposer5.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = new Braze$$ExternalSyntheticLambda34(z2, 1);
                        gapComposer5.updateRememberedValue(rememberedValue);
                        MutableState mutableState2 = (MutableState) SaverKt.rememberSaveable(objArr22, (Function0) rememberedValue, gapComposer5, 0);
                        if (list4.isEmpty()) {
                        }
                        AnimatedContentKt.AnimatedVisibility(columnScope, !((Boolean) mutableState2.getValue()).booleanValue() || z2, null, null, null, null, Expect_jvmKt.rememberComposableLambda(124015362, new CheckoutTipSectionKt$$ExternalSyntheticLambda8(localCheckoutTipSectionViewModel, function12, 0), gapComposer5), gapComposer5, (intValue3 & 14) | 1572864, 30);
                        str = localCheckoutTipSectionViewModel.finePrint;
                        if (str == null) {
                        }
                    }
                    z2 = false;
                    Object[] objArr222 = new Object[0];
                    changed = gapComposer5.changed(z2);
                    rememberedValue = gapComposer5.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new Braze$$ExternalSyntheticLambda34(z2, 1);
                    gapComposer5.updateRememberedValue(rememberedValue);
                    MutableState mutableState22 = (MutableState) SaverKt.rememberSaveable(objArr222, (Function0) rememberedValue, gapComposer5, 0);
                    if (list4.isEmpty()) {
                    }
                    AnimatedContentKt.AnimatedVisibility(columnScope, !((Boolean) mutableState22.getValue()).booleanValue() || z2, null, null, null, null, Expect_jvmKt.rememberComposableLambda(124015362, new CheckoutTipSectionKt$$ExternalSyntheticLambda8(localCheckoutTipSectionViewModel, function12, 0), gapComposer5), gapComposer5, (intValue3 & 14) | 1572864, 30);
                    str = localCheckoutTipSectionViewModel.finePrint;
                    if (str == null) {
                    }
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                LocalBrandLocationCheckoutViewModel localBrandLocationCheckoutViewModel = (LocalBrandLocationCheckoutViewModel) obj8;
                TextFieldState textFieldState = (TextFieldState) obj7;
                TextFieldState textFieldState2 = (TextFieldState) obj6;
                Function1 function15 = (Function1) obj5;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer4;
                if (gapComposer6.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Modifier modifier3 = LocalBrandLocationCheckoutViewKt.SectionItemModifier;
                    OrderBuilderModel.BuyerInfo.UiReady uiReady = localBrandLocationCheckoutViewModel.buyerInfo;
                    String stringResource = Room.stringResource(gapComposer6, R.string.local_views_contact);
                    PaddingValuesImpl paddingValuesImpl = CheckoutExpandableReviewRowKt.CheckoutReviewRowTouchTargetPadding;
                    boolean changed6 = gapComposer6.changed(function15);
                    Object rememberedValue9 = gapComposer6.rememberedValue();
                    if (changed6 || rememberedValue9 == obj4) {
                        rememberedValue9 = new DrawerKt$$ExternalSyntheticLambda1(function15, false, 10);
                        gapComposer6.updateRememberedValue(rememberedValue9);
                    }
                    Function0 function04 = (Function0) rememberedValue9;
                    boolean changed7 = gapComposer6.changed(function15);
                    Object rememberedValue10 = gapComposer6.rememberedValue();
                    if (changed7 || rememberedValue10 == obj4) {
                        rememberedValue10 = new GestureNodeKt$$ExternalSyntheticLambda0(i3, function15);
                        gapComposer6.updateRememberedValue(rememberedValue10);
                    }
                    CheckoutTipSectionKt.CheckoutBuyerInfoSection(uiReady, textFieldState, textFieldState2, function04, (Function1) rememberedValue10, modifier3, stringResource, paddingValuesImpl, false, gapComposer6, 12779520, 256);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                LocalOpenTabCheckoutViewModel localOpenTabCheckoutViewModel = (LocalOpenTabCheckoutViewModel) obj8;
                TextFieldState textFieldState3 = (TextFieldState) obj7;
                TextFieldState textFieldState4 = (TextFieldState) obj6;
                Function1 function16 = (Function1) obj5;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer5;
                if (gapComposer7.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(modifier, 1.0f), RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 8.0f, 5);
                    OrderBuilderModel.BuyerInfo.UiReady uiReady2 = localOpenTabCheckoutViewModel.buyerInfo;
                    String stringResource2 = Room.stringResource(gapComposer7, R.string.local_views_contact);
                    PaddingValuesImpl paddingValuesImpl2 = LocalOpenTabCheckoutViewKt.OpenTabCheckoutInfoTouchTargetPadding;
                    boolean changed8 = gapComposer7.changed(function16);
                    Object rememberedValue11 = gapComposer7.rememberedValue();
                    if (changed8 || rememberedValue11 == obj4) {
                        rememberedValue11 = new DrawerKt$$ExternalSyntheticLambda1(function16, false, 14);
                        gapComposer7.updateRememberedValue(rememberedValue11);
                    }
                    Function0 function05 = (Function0) rememberedValue11;
                    boolean changed9 = gapComposer7.changed(function16);
                    Object rememberedValue12 = gapComposer7.rememberedValue();
                    if (changed9 || rememberedValue12 == obj4) {
                        rememberedValue12 = new GestureNodeKt$$ExternalSyntheticLambda0(21, function16);
                        gapComposer7.updateRememberedValue(rememberedValue12);
                    }
                    CheckoutTipSectionKt.CheckoutBuyerInfoSection(uiReady2, textFieldState3, textFieldState4, function05, (Function1) rememberedValue12, m302paddingqDBjuR0$default2, stringResource2, paddingValuesImpl2, false, gapComposer7, 113442816, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                LocalMenuComboDetailsViewModel localMenuComboDetailsViewModel2 = (LocalMenuComboDetailsViewModel) obj7;
                Function1 function17 = (Function1) obj6;
                SnapshotStateMap snapshotStateMap3 = (SnapshotStateMap) obj5;
                Composer composer6 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((CollapsingToolbarScaffoldScopeInstance) obj).getClass();
                Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion3, (ScrollState) obj8, false, 14);
                Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, composer6, 0);
                GapComposer gapComposer8 = (GapComposer) composer6;
                int hashCode2 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer8.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(composer6, verticalScroll$default);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer9 = (GapComposer) composer6;
                if (gapComposer9.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer9.startReusableNode();
                if (gapComposer9.inserting) {
                    gapComposer9.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer9.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(composer6, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(composer6, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Integer valueOf = Integer.valueOf(hashCode2);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(composer6, valueOf, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(composer6, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(composer6, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                MenuItemPreorderingSummary menuItemPreorderingSummary = localMenuComboDetailsViewModel2.preorderingSummary;
                List list7 = localMenuComboDetailsViewModel2.ingredients;
                List list8 = localMenuComboDetailsViewModel2.dietaryPreferences;
                SnapshotStateMap snapshotStateMap4 = snapshotStateMap3;
                String str6 = localMenuComboDetailsViewModel2.descriptionText;
                LocalImage localImage3 = localMenuComboDetailsViewModel2.image;
                Object obj9 = obj4;
                List list9 = localMenuComboDetailsViewModel2.discountSummaries;
                if (menuItemPreorderingSummary == null) {
                    gapComposer9.startReplaceGroup(-2044396788);
                    gapComposer9.end(false);
                    list = list7;
                    localMenuComboDetailsViewModel = localMenuComboDetailsViewModel2;
                } else {
                    localMenuComboDetailsViewModel = localMenuComboDetailsViewModel2;
                    gapComposer9.startReplaceGroup(-2044396787);
                    list = list7;
                    LocalCaloriesTextKt.LocalExpandingPreorderSection(SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, !list9.isEmpty() ? 8.0f : 20.0f, 7), menuItemPreorderingSummary, composer6, 0);
                    gapComposer9.end(false);
                }
                if (list9.isEmpty()) {
                    companion = companion3;
                    r0 = 0;
                    gapComposer9.startReplaceGroup(-2043843220);
                    gapComposer9.end(false);
                } else {
                    gapComposer9.startReplaceGroup(-2044026771);
                    companion = companion3;
                    LocalCaloriesTextKt.LocalExpandingDiscountSections(6, composer6, SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 20.0f, 7), list9);
                    r0 = 0;
                    gapComposer9.end(false);
                }
                if (localImage3 == null) {
                    gapComposer9.startReplaceGroup(-2043770030);
                    gapComposer9.end(r0);
                } else {
                    gapComposer9.startReplaceGroup(-2043770029);
                    BoxKt.Box(ClipKt.paint$default(ClipKt.clip(OffsetKt.aspectRatio(1.0f, SpacerKt.m302paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, 4.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), r0), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(r0, 30, composer6, LocalViewsKt.getThemedUrl(localImage3, composer6)), null, ContentScale.Companion.Crop, RecyclerView.DECELERATION_RATE, null, 54), composer6, r0);
                    gapComposer9.end(r0);
                }
                if (str6 == null) {
                    gapComposer9.startReplaceGroup(-2043219594);
                    gapComposer9.end(r0);
                    z3 = r0;
                    localImage = localImage3;
                    list2 = list8;
                } else {
                    gapComposer9.startReplaceGroup(-2043219593);
                    if (localImage3 != null) {
                        gapComposer9.startReplaceGroup(-1941089113);
                        SpacerKt.Spacer(composer6, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(companion, 28.0f));
                        gapComposer9.end(r0);
                    } else {
                        gapComposer9.startReplaceGroup(-1941017038);
                        gapComposer9.end(r0);
                    }
                    wrapContentHeight = androidx.compose.foundation.layout.SizeKt.wrapContentHeight(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(wrapContentHeight, 16.0f, 4.0f, 40.0f, RecyclerView.DECELERATION_RATE, 8);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, composer6, r0);
                    localImage = localImage3;
                    list2 = list8;
                    int hashCode3 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(composer6, m302paddingqDBjuR0$default3);
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer9.useNode();
                    }
                    Updater.m576setimpl(composer6, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(composer6, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Request$Priority$EnumUnboxingLocalUtility.m(hashCode3, composer6, composeUiNode$Companion$SetModifier$13, composer6, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(composer6, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    wrapContentHeight2 = androidx.compose.foundation.layout.SizeKt.wrapContentHeight(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    Modifier m302paddingqDBjuR0$default4 = SpacerKt.m302paddingqDBjuR0$default(wrapContentHeight2, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    TextStyle textStyle = ((Typography) gapComposer9.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                    Colors colors2 = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors2.semantic.text.standard, composer6, m302paddingqDBjuR0$default4, textStyle, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
                    gapComposer9.end(true);
                    z3 = false;
                    gapComposer9.end(false);
                }
                if (list2.isEmpty() && list.isEmpty()) {
                    gapComposer9.startReplaceGroup(-2041899892);
                    gapComposer9.end(z3);
                } else {
                    gapComposer9.startReplaceGroup(-2042396729);
                    if (localImage == null && str6 == null) {
                        gapComposer9.startReplaceGroup(-2042264948);
                        gapComposer9.end(z3);
                    } else {
                        gapComposer9.startReplaceGroup(-2042337023);
                        SpacerKt.Spacer(composer6, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(companion, 12.0f));
                        gapComposer9.end(z3);
                    }
                    wrapContentHeight3 = androidx.compose.foundation.layout.SizeKt.wrapContentHeight(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    LocalCaloriesTextKt.LocalDietaryPreferencesSection(SpacerKt.m302paddingqDBjuR0$default(wrapContentHeight3, 16.0f, 4.0f, 40.0f, RecyclerView.DECELERATION_RATE, 8), list2, list, composer6, 6);
                    gapComposer9.end(z3);
                }
                SpacerKt.Spacer(composer6, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(companion, 28.0f));
                gapComposer9.startReplaceGroup(488325978);
                List list10 = localMenuComboDetailsViewModel.comboSlots;
                int size = list10.size();
                int i6 = 0;
                while (i6 < size) {
                    LocalMenuComboDetailsViewModel.ComboSlot comboSlot = (LocalMenuComboDetailsViewModel.ComboSlot) list10.get(i6);
                    SpacerKt.Spacer(composer6, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(companion, i6 == 0 ? 4.0f : 32.0f));
                    boolean changedInstance4 = gapComposer9.changedInstance(comboSlot) | gapComposer9.changed(i6);
                    Object rememberedValue13 = gapComposer9.rememberedValue();
                    Object obj10 = obj9;
                    if (changedInstance4 || rememberedValue13 == obj10) {
                        snapshotStateMap = snapshotStateMap4;
                        rememberedValue13 = new PoolGoalMetKt$$ExternalSyntheticLambda6(comboSlot, i6, snapshotStateMap, 4);
                        gapComposer9.updateRememberedValue(rememberedValue13);
                    } else {
                        snapshotStateMap = snapshotStateMap4;
                    }
                    LocalCaloriesTextKt.ComboSlotSection(ValueInsets.onGloballyPositioned(companion, (Function1) rememberedValue13), comboSlot, function17, composer6, 0);
                    i6++;
                    snapshotStateMap4 = snapshotStateMap;
                    obj9 = obj10;
                }
                gapComposer9.end(false);
                SpacerKt.Spacer(composer6, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(companion, 24.0f));
                gapComposer9.end(true);
                return Unit.INSTANCE;
            case 8:
                LocalMenuItemDetailsViewModel localMenuItemDetailsViewModel2 = (LocalMenuItemDetailsViewModel) obj7;
                Function1 function18 = (Function1) obj6;
                SnapshotStateMap snapshotStateMap5 = (SnapshotStateMap) obj5;
                Composer composer7 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((CollapsingToolbarScaffoldScopeInstance) obj).getClass();
                Modifier.Companion companion4 = Modifier.Companion.$$INSTANCE;
                Modifier verticalScroll$default2 = ImageKt.verticalScroll$default(companion4, (ScrollState) obj8, false, 14);
                Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
                BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, composer7, 0);
                GapComposer gapComposer10 = (GapComposer) composer7;
                int hashCode4 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer10.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(composer7, verticalScroll$default2);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer11 = (GapComposer) composer7;
                if (gapComposer11.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer11.startReusableNode();
                if (gapComposer11.inserting) {
                    gapComposer11.createNode(layoutNode$Companion$Constructor$13);
                } else {
                    gapComposer11.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(composer7, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$15);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(composer7, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$16);
                Integer valueOf2 = Integer.valueOf(hashCode4);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(composer7, valueOf2, composeUiNode$Companion$SetModifier$17);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(composer7, ownerSnapshotObserver$onCommitAffectingLayout$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(composer7, materializeModifier4, composeUiNode$Companion$SetModifier$18);
                MenuItemPreorderingSummary menuItemPreorderingSummary2 = localMenuItemDetailsViewModel2.preorderingSummary;
                List list11 = localMenuItemDetailsViewModel2.ingredients;
                List list12 = localMenuItemDetailsViewModel2.dietaryPreferences;
                SnapshotStateMap snapshotStateMap6 = snapshotStateMap5;
                String str7 = localMenuItemDetailsViewModel2.descriptionText;
                LocalImage localImage4 = localMenuItemDetailsViewModel2.image;
                Object obj11 = obj4;
                List list13 = localMenuItemDetailsViewModel2.discountSummaries;
                if (menuItemPreorderingSummary2 == null) {
                    gapComposer11.startReplaceGroup(-1641794235);
                    gapComposer11.end(false);
                    list3 = list11;
                    localMenuItemDetailsViewModel = localMenuItemDetailsViewModel2;
                } else {
                    localMenuItemDetailsViewModel = localMenuItemDetailsViewModel2;
                    gapComposer11.startReplaceGroup(-1641794234);
                    list3 = list11;
                    LocalCaloriesTextKt.LocalExpandingPreorderSection(SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, !list13.isEmpty() ? 8.0f : 20.0f, 7), menuItemPreorderingSummary2, composer7, 0);
                    gapComposer11.end(false);
                }
                if (list13.isEmpty()) {
                    companion2 = companion4;
                    r02 = 0;
                    gapComposer11.startReplaceGroup(-1641240667);
                    gapComposer11.end(false);
                } else {
                    gapComposer11.startReplaceGroup(-1641424218);
                    companion2 = companion4;
                    LocalCaloriesTextKt.LocalExpandingDiscountSections(6, composer7, SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 20.0f, 7), list13);
                    r02 = 0;
                    gapComposer11.end(false);
                }
                if (localImage4 == null) {
                    gapComposer11.startReplaceGroup(-1641173429);
                    gapComposer11.end(r02);
                } else {
                    gapComposer11.startReplaceGroup(-1641173428);
                    BoxKt.Box(ClipKt.paint$default(ClipKt.clip(OffsetKt.aspectRatio(1.0f, SpacerKt.m302paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion2, 1.0f), 16.0f, 4.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), r02), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(r02, 30, composer7, LocalViewsKt.getThemedUrl(localImage4, composer7)), null, ContentScale.Companion.Crop, RecyclerView.DECELERATION_RATE, null, 54), composer7, r02);
                    gapComposer11.end(r02);
                }
                if (str7 == null) {
                    gapComposer11.startReplaceGroup(-1640628945);
                    gapComposer11.end(r02);
                    z4 = r02;
                    localImage2 = localImage4;
                } else {
                    gapComposer11.startReplaceGroup(-1640628944);
                    if (localImage4 != null) {
                        gapComposer11.startReplaceGroup(722866452);
                        SpacerKt.Spacer(composer7, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(companion2, 28.0f));
                        gapComposer11.end(r02);
                    } else {
                        gapComposer11.startReplaceGroup(722938527);
                        gapComposer11.end(r02);
                    }
                    wrapContentHeight4 = androidx.compose.foundation.layout.SizeKt.wrapContentHeight(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion2, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    Modifier m302paddingqDBjuR0$default5 = SpacerKt.m302paddingqDBjuR0$default(wrapContentHeight4, 16.0f, 4.0f, 40.0f, RecyclerView.DECELERATION_RATE, 8);
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, composer7, r02);
                    localImage2 = localImage4;
                    int hashCode5 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer11.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(composer7, m302paddingqDBjuR0$default5);
                    gapComposer11.startReusableNode();
                    if (gapComposer11.inserting) {
                        gapComposer11.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer11.useNode();
                    }
                    Updater.m576setimpl(composer7, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$15);
                    Updater.m576setimpl(composer7, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$16);
                    Request$Priority$EnumUnboxingLocalUtility.m(hashCode5, composer7, composeUiNode$Companion$SetModifier$17, composer7, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    Updater.m576setimpl(composer7, materializeModifier5, composeUiNode$Companion$SetModifier$18);
                    wrapContentHeight5 = androidx.compose.foundation.layout.SizeKt.wrapContentHeight(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion2, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    Modifier m302paddingqDBjuR0$default6 = SpacerKt.m302paddingqDBjuR0$default(wrapContentHeight5, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    TextStyle textStyle2 = ((Typography) gapComposer11.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                    Colors colors3 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(-1762997739);
                        gapComposer11.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors3.semantic.text.standard, composer7, m302paddingqDBjuR0$default6, textStyle2, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
                    gapComposer11.end(true);
                    z4 = false;
                    gapComposer11.end(false);
                }
                if (list12.isEmpty() && list3.isEmpty()) {
                    gapComposer11.startReplaceGroup(-1639309243);
                    gapComposer11.end(z4);
                } else {
                    gapComposer11.startReplaceGroup(-1639806080);
                    if (localImage2 == null && str7 == null) {
                        gapComposer11.startReplaceGroup(-1639674299);
                        gapComposer11.end(z4);
                    } else {
                        gapComposer11.startReplaceGroup(-1639746374);
                        SpacerKt.Spacer(composer7, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(companion2, 12.0f));
                        gapComposer11.end(z4);
                    }
                    wrapContentHeight6 = androidx.compose.foundation.layout.SizeKt.wrapContentHeight(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion2, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    LocalCaloriesTextKt.LocalDietaryPreferencesSection(SpacerKt.m302paddingqDBjuR0$default(wrapContentHeight6, 16.0f, 4.0f, 40.0f, RecyclerView.DECELERATION_RATE, 8), list12, list3, composer7, 6);
                    gapComposer11.end(z4);
                }
                SpacerKt.Spacer(composer7, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(companion2, 28.0f));
                gapComposer11.startReplaceGroup(362765337);
                List list14 = localMenuItemDetailsViewModel.itemModifiers;
                int size2 = list14.size();
                int i7 = 0;
                while (i7 < size2) {
                    LocalMenuItemDetailsViewModel.ItemModifier itemModifier = (LocalMenuItemDetailsViewModel.ItemModifier) list14.get(i7);
                    SpacerKt.Spacer(composer7, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(companion2, i7 == 0 ? 4.0f : 32.0f));
                    boolean changedInstance5 = gapComposer11.changedInstance(itemModifier);
                    Object rememberedValue14 = gapComposer11.rememberedValue();
                    Object obj12 = obj11;
                    if (changedInstance5 || rememberedValue14 == obj12) {
                        snapshotStateMap2 = snapshotStateMap6;
                        rememberedValue14 = new RealBadger2$$ExternalSyntheticLambda0(16, snapshotStateMap2, itemModifier);
                        gapComposer11.updateRememberedValue(rememberedValue14);
                    } else {
                        snapshotStateMap2 = snapshotStateMap6;
                    }
                    LocalCaloriesTextKt.ItemModifier(ValueInsets.onGloballyPositioned(companion2, (Function1) rememberedValue14), itemModifier, function18, composer7, 0);
                    i7++;
                    snapshotStateMap6 = snapshotStateMap2;
                    obj11 = obj12;
                }
                gapComposer11.end(false);
                SpacerKt.Spacer(composer7, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(companion2, 24.0f));
                gapComposer11.end(true);
                return Unit.INSTANCE;
            case 9:
                MarketingMessageViewModel.OfferPreview offerPreview = (MarketingMessageViewModel.OfferPreview) obj8;
                MarketingMessageViewModel marketingMessageViewModel = (MarketingMessageViewModel) obj7;
                Function1 function19 = (Function1) obj6;
                MutableState mutableState3 = (MutableState) obj5;
                PaddingValues paddingValues2 = (PaddingValues) obj;
                Composer composer8 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                paddingValues2.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer8).changed(paddingValues2) ? 4 : 2;
                }
                GapComposer gapComposer12 = (GapComposer) composer8;
                if (gapComposer12.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    Modifier padding2 = SpacerKt.padding(modifier, paddingValues2);
                    MarketingMessageViewModel.OfferPreview.SheetDetails sheetDetails = offerPreview.sheet;
                    LocalColor localColor = marketingMessageViewModel.backgroundColor;
                    LocalColor localColor2 = marketingMessageViewModel.foregroundColor;
                    LocalImage localImage5 = marketingMessageViewModel.logo;
                    String str8 = marketingMessageViewModel.logoFallbackLetter;
                    Object rememberedValue15 = gapComposer12.rememberedValue();
                    if (rememberedValue15 == obj4) {
                        rememberedValue15 = new TabContentViewKt$$ExternalSyntheticLambda1(i4, mutableState3);
                        gapComposer12.updateRememberedValue(rememberedValue15);
                    }
                    Function0 function06 = (Function0) rememberedValue15;
                    boolean changed10 = gapComposer12.changed(function19);
                    Object rememberedValue16 = gapComposer12.rememberedValue();
                    if (changed10 || rememberedValue16 == obj4) {
                        rememberedValue16 = new BrandSheetViewKt$$ExternalSyntheticLambda0(4, function19);
                        gapComposer12.updateRememberedValue(rememberedValue16);
                    }
                    MarketingMessageKt.MarketingMessageOfferSheetContent(padding2, sheetDetails, localColor, localColor2, localImage5, str8, function06, (Function0) rememberedValue16, gapComposer12, 1572864, 0);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                return invoke$com$squareup$cash$afterpayapplet$applets$views$AfterpayAppletTile$$ExternalSyntheticLambda13(obj, obj2, obj3);
            case 11:
                LazyListState lazyListState = (LazyListState) obj8;
                AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RecentlyViewedCarouselViewModel recentlyViewedCarouselViewModel = (AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RecentlyViewedCarouselViewModel) obj7;
                Function1 function110 = (Function1) obj6;
                SearchBarKeyboardState searchBarKeyboardState = (SearchBarKeyboardState) obj5;
                Composer composer9 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer9;
                if (gapComposer13.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    boolean changedInstance6 = gapComposer13.changedInstance(recentlyViewedCarouselViewModel);
                    Object rememberedValue17 = gapComposer13.rememberedValue();
                    if (changedInstance6 || rememberedValue17 == obj4) {
                        rememberedValue17 = new ContextKt$$ExternalSyntheticLambda1(recentlyViewedCarouselViewModel, i2);
                        gapComposer13.updateRememberedValue(rememberedValue17);
                    }
                    if (((Boolean) ListsKt.rememberLazyListItemVisibility(lazyListState, (Function1) rememberedValue17, gapComposer13).getValue()).booleanValue()) {
                        function110.invoke(AfterpaySearchViewEvent.RecentlyViewedCarouselViewed.INSTANCE);
                    }
                    AfterpaySearchViewKt.RecentlyViewedCarousel(recentlyViewedCarouselViewModel, searchBarKeyboardState, function110, gapComposer13, 0);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                return invoke$com$squareup$cash$appmessages$views$sheet$SheetAppMessageView$$ExternalSyntheticLambda11(obj, obj2, obj3);
            case 13:
                return invoke$com$squareup$cash$banking$applets$views$BalanceAppletTileKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 14:
                return invoke$com$squareup$cash$benefits$applets$views$BankingBenefitsAppletTileKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 15:
                return invoke$com$squareup$cash$billssubscriptions$views$BillsSubscriptionsMerchantListViewKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 16:
                return invoke$com$squareup$cash$blockers$views$BirthdayViewKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 17:
                return invoke$com$squareup$cash$blockers$views$CashtagViewKt$$ExternalSyntheticLambda12(obj, obj2, obj3);
            case 18:
                return invoke$com$squareup$cash$blockers$views$InputCardInfoViewKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 19:
                return invoke$com$squareup$cash$blockers$views$ReferralCodeViewKt$$ExternalSyntheticLambda9(obj, obj2, obj3);
            case 20:
                return invoke$com$squareup$cash$blockers$views$SelectionViewKt$$ExternalSyntheticLambda12(obj, obj2, obj3);
            case 21:
                return invoke$com$squareup$cash$blockers$views$SetPinViewKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 22:
                return invoke$com$squareup$cash$borrow$views$BorrowAmountPickerKt$$ExternalSyntheticLambda8(obj, obj2, obj3);
            case 23:
                return invoke$com$squareup$cash$card$onboarding$CardPreviewViewKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 24:
                return invoke$com$squareup$cash$card$onboarding$CardPreviewViewKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$card$onboarding$CardStudioViewKt$$ExternalSyntheticLambda7(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$card$onboarding$core$instancing$CardDesignLibraryEffectKt$$ExternalSyntheticLambda3(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$core$views$ArcadeBottomNavigationKt$$ExternalSyntheticLambda0(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$discover$promotiondetails$views$PromotionDetailsViewKt$$ExternalSyntheticLambda0(obj, obj2, obj3);
            default:
                FamilyHomeViewModel familyHomeViewModel = (FamilyHomeViewModel) obj8;
                Function1 function111 = (Function1) obj7;
                FamilyPendingRequestsSection familyPendingRequestsSection = (FamilyPendingRequestsSection) obj6;
                LazyScaffoldContentScope lazyScaffoldContentScope = (LazyScaffoldContentScope) obj5;
                Composer composer10 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer10;
                if (gapComposer14.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    if (familyPendingRequestsSection == null) {
                        gapComposer14.startReplaceGroup(1099644429);
                        gapComposer14.end(false);
                        f = 48.0f;
                    } else {
                        gapComposer14.startReplaceGroup(1099645521);
                        ((DefaultSizes) gapComposer14.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        gapComposer14.end(false);
                        f = 16.0f;
                    }
                    FamilyHomeViewKt.m3535FamilyHomeHeader6a0pyJM(familyHomeViewModel, function111, f, ScreenScaffoldKt.markAsScaffoldTitle(modifier, lazyScaffoldContentScope, gapComposer14, 6), gapComposer14, 0);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ComposeDialogKt$$ExternalSyntheticLambda12(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$3 = obj2;
        this.f$4 = obj3;
        this.f$5 = obj4;
    }

    public /* synthetic */ ComposeDialogKt$$ExternalSyntheticLambda12(Function2 function2, ContextMenuScope contextMenuScope, Function3 function3, Function0 function0) {
        this.$r8$classId = 1;
        this.f$0 = function2;
        this.f$3 = contextMenuScope;
        this.f$5 = function3;
        this.f$4 = function0;
    }
}
