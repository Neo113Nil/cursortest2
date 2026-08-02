package app.cash.local.views;

import android.content.Context;
import android.util.Size;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.muxer.Media3MuxerImpl$$ExternalSyntheticLambda1;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material.AppBarKt$$ExternalSyntheticLambda4;
import androidx.compose.material.DrawerKt$$ExternalSyntheticLambda1;
import androidx.compose.material.FadeInFadeOutState;
import androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.RoomDatabase$performClear$1;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import app.cash.badging.backend.RealBadger2$$ExternalSyntheticLambda0;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$3;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.local.viewmodels.CouponSection;
import app.cash.local.viewmodels.CurbsidePickupCarViewModel;
import app.cash.local.viewmodels.GiftCardInputState;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import app.cash.local.viewmodels.LocalBrandLocationCheckoutViewModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewModel;
import app.cash.local.viewmodels.LocalTextsKt;
import app.cash.local.viewmodels.ToolbarModel;
import app.cash.local.viewmodels.VehicleColorOption;
import app.cash.local.viewmodels.VehicleTypeOption;
import app.cash.local.viewmodels.map.BrandCollectionMapViewModel;
import app.cash.local.viewmodels.pos.LocalPosCheckInViewModel;
import app.cash.local.viewmodels.sheet.EducationalSheetModelList;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import app.cash.local.views.brand.checkout.CheckoutCouponSectionKt$$ExternalSyntheticLambda6;
import app.cash.local.views.brand.checkout.CheckoutFulfillmentSectionKt;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import app.cash.local.views.brand.checkout.CurbsidePickupCarSheetKt;
import app.cash.local.views.brand.checkout.CurbsidePickupCarSheetKt$$ExternalSyntheticLambda7;
import app.cash.local.views.brand.checkout.GiftCardInputTransformation;
import app.cash.local.views.brand.checkout.GiftCardOutputTransformation;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.fulfillment.FulfillmentRadioCellKt;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda28;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda9;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda0;
import app.cash.local.views.pos.LocalPosCheckInViewKt$$ExternalSyntheticLambda5;
import app.cash.local.views.toolbar.LocalToolbarKt;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda0;
import app.cash.zipline.CallResult;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import bo.app.n$$ExternalSyntheticLambda0;
import bo.app.q2$$ExternalSyntheticLambda8;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImagePainter;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda4;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountToDoKt;
import com.squareup.cash.account.components.AccountToDoKt$$ExternalSyntheticLambda0;
import com.squareup.cash.account.settings.viewmodels.AccountViewModel;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.viewmodels.ActivityTabViewModel;
import com.squareup.cash.activity.viewmodels.ItemAccessory;
import com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda28;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda4;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda9;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.EmbeddedHeaderScope;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda3;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletPurchasesEmbeddedViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpaySearchViewEvent;
import com.squareup.cash.afterpayapplet.views.AfterpayAppletPurchasesEmbeddedViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda43;
import com.squareup.cash.agents.applets.viewmodels.AgentsAppletTileViewModel;
import com.squareup.cash.agents.applets.viewmodels.AgentsHomeViewModel;
import com.squareup.cash.agents.applets.views.AgentsHomeViewKt;
import com.squareup.cash.amountchooser.views.AtmPickerGridKt$$ExternalSyntheticLambda4;
import com.squareup.cash.amountchooser.views.AtmPickerGridKt$WhenMappings;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.appmessages.AppMessageImage;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import com.squareup.cash.appmessages.InlineAppMessageViewModel;
import com.squareup.cash.appmessages.views.InlineAppMessageKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.BadgePlacement;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.components.LazyScaffoldContentScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.ShowNavigationBack;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.input.InputChipGridScope;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.blockers.views.SetPinViewKt$SetPin$3$1$1$1;
import com.squareup.cash.cashapplite.views.KycAppletTile;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldScopeInstance;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScopeInstance;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarState;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.maps.engine.providers.GoogleMapEngineProvider;
import com.squareup.cash.maps.engine.providers.MapEngineProviderKt;
import com.squareup.cash.marketing.components.CardUpsellKt;
import com.squareup.cash.marketing.components.TooltipState;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$2$1;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalText;
import com.squareup.util.Strings;
import com.squareup.util.compose.ListsKt;
import com.squareup.util.compose.TransitionsKt;
import com.stripe.android.model.parsers.WalletJsonParser;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.savings.action.SavingsAction;
import string.TrimMode;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalViewFactory$$ExternalSyntheticLambda6 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ LocalViewFactory$$ExternalSyntheticLambda6(EducationalSheetModelList educationalSheetModelList, Function1 function1, RealSheetState realSheetState) {
        this.$r8$classId = 13;
        this.f$0 = educationalSheetModelList;
        this.f$2 = function1;
        this.f$1 = realSheetState;
    }

    private final Object invoke$app$cash$local$views$map$BrandCollectionSheetViewKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        float f;
        float f2;
        BrandCollectionModel brandCollectionModel = (BrandCollectionModel) this.f$0;
        TextFieldState textFieldState = (TextFieldState) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        paddingValues.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            float mo267calculateTopPaddingD9Ej5fM = paddingValues.mo267calculateTopPaddingD9Ej5fM();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, mo267calculateTopPaddingD9Ej5fM, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            String str = brandCollectionModel.title;
            if (str == null) {
                gapComposer.startReplaceGroup(2047634041);
                gapComposer.end(false);
                f = 16.0f;
                f2 = 0.0f;
            } else {
                gapComposer.startReplaceGroup(2047634042);
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 2.0f, 7);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).pageTitle;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.semantic.text.standard;
                f = 16.0f;
                f2 = RecyclerView.DECELERATION_RATE;
                Room.m1165Text25TpFw(0, 1, 0, 0, 1572912, 0, 4016, j, (Composer) gapComposer, m302paddingqDBjuR0$default2, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            String str2 = brandCollectionModel.caption;
            if (str2 == null) {
                gapComposer.startReplaceGroup(2047941902);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(2047941903);
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, f, f2, 2);
                TextStyle textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                GapComposer gapComposer2 = gapComposer;
                Room.m1165Text25TpFw(0, 1, 0, 0, 1572912, 0, 4016, colors2.semantic.text.subtle, (Composer) gapComposer2, m300paddingVpY3zN4$default, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            }
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer);
            }
            SearchBarKt.SearchBar(textFieldState, Room.stringResource(gapComposer, R.string.local_views_search), SearchBarKt.rememberSearchBarKeyboardState(true, gapComposer), FocusTraversalKt.focusRequester(SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(companion, f, f2, 2), RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), (FocusRequester) rememberedValue), null, ShowNavigationBack.Never, null, null, null, null, true, null, gapComposer, 196608, 6, 7120);
            boolean changed = gapComposer.changed(textFieldState) | gapComposer.changed(function1);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SetPinViewKt$SetPin$3$1$1$1(textFieldState, function1, null, 3);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, textFieldState, (Function2) rememberedValue2);
            ModalKt.HorizontalDivider(6, 0, gapComposer, SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, 28.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13));
            PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, 16.0f, 1);
            boolean changedInstance = gapComposer.changedInstance(brandCollectionModel) | gapComposer.changed(function1);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new RealBadger2$$ExternalSyntheticLambda0(29, brandCollectionModel, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            GapComposer gapComposer3 = gapComposer;
            LazyDslKt.LazyColumn(companion, null, m295PaddingValuesYgX7TsA$default, null, null, null, false, null, (Function1) rememberedValue3, gapComposer3, 390, 506);
            gapComposer3.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$app$cash$local$views$pos$LocalPosCheckInViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3) {
        boolean z;
        Object obj4;
        Object obj5;
        float f;
        Modifier modifier = (Modifier) this.f$0;
        Function1 function1 = (Function1) this.f$2;
        LocalPosCheckInViewModel localPosCheckInViewModel = (LocalPosCheckInViewModel) this.f$1;
        UiScope uiScope = (UiScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        uiScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(uiScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18);
        Applier applier = gapComposer.applier;
        if (shouldExecute) {
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(modifier, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
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
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj6 = Composer.Companion.Empty;
            if (rememberedValue == obj6) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj6) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            if (TransitionsKt.isVisibleAndSettled(uiScope.$$delegate_0.getTransition()) && ((Boolean) mutableState2.getValue()).booleanValue() && ((SurfaceRequest) mutableState.getValue()) != null) {
                gapComposer.startReplaceGroup(2040334127);
                SurfaceRequest surfaceRequest = (SurfaceRequest) mutableState.getValue();
                surfaceRequest.getClass();
                TrimMode.CameraXViewfinder(surfaceRequest, null, gapComposer, 221232);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(2040510238);
                gapComposer.end(false);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ToolbarModel toolbarModel = new ToolbarModel("");
            NavigationType navigationType = NavigationType.CLOSE;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed || rememberedValue3 == obj6) {
                rememberedValue3 = new BrandSheetViewKt$$ExternalSyntheticLambda0(11, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            LocalToolbarKt.m1333LocalToolbarflo8M7A(companion, toolbarModel, navigationType, (Function0) rememberedValue3, RecyclerView.DECELERATION_RATE, null, gapComposer, 196998, 72);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == obj6) {
                rememberedValue4 = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState3 = (MutableState) rememberedValue4;
            if (localPosCheckInViewModel.canStartCamera) {
                z = false;
                gapComposer.startReplaceGroup(388800567);
                Object rememberedValue5 = gapComposer.rememberedValue();
                Object obj7 = rememberedValue5;
                if (rememberedValue5 == obj6) {
                    Preview m102build = new Preview.Builder(0).m102build();
                    m102build.setSurfaceProvider(new LocalPosCheckInViewKt$$ExternalSyntheticLambda5(mutableState));
                    gapComposer.updateRememberedValue(m102build);
                    obj7 = m102build;
                }
                gapComposer.end(false);
                obj4 = (Preview) obj7;
            } else {
                gapComposer.startReplaceGroup(388763087);
                z = false;
                gapComposer.end(false);
                obj4 = null;
            }
            if (localPosCheckInViewModel.canStartCamera) {
                gapComposer.startReplaceGroup(389143954);
                Object rememberedValue6 = gapComposer.rememberedValue();
                Object obj8 = rememberedValue6;
                if (rememberedValue6 == obj6) {
                    Preview.Builder builder = new Preview.Builder(1);
                    builder.mMutableConfig.insertOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, new ResolutionSelector(AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY, new ResolutionStrategy(3, new Size(1500, 1500))));
                    builder.setBackpressureStrategy();
                    ImageAnalysis build = builder.build();
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    UtilsKt$$ExternalSyntheticLambda1 utilsKt$$ExternalSyntheticLambda1 = new UtilsKt$$ExternalSyntheticLambda1(3, function1);
                    LocalPosCheckInViewKt$$ExternalSyntheticLambda5 localPosCheckInViewKt$$ExternalSyntheticLambda5 = new LocalPosCheckInViewKt$$ExternalSyntheticLambda5(mutableState3);
                    CallResult callResult = new CallResult();
                    callResult.result = utilsKt$$ExternalSyntheticLambda1;
                    callResult.serviceNames = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Worker$$ExternalSyntheticLambda0(localPosCheckInViewKt$$ExternalSyntheticLambda5, 27));
                    build.setAnalyzer(newSingleThreadExecutor, callResult);
                    gapComposer.updateRememberedValue(build);
                    obj8 = build;
                }
                Object obj9 = (ImageAnalysis) obj8;
                z = false;
                gapComposer.end(false);
                obj5 = obj9;
            } else {
                gapComposer.startReplaceGroup(389067631);
                gapComposer.end(z);
                obj5 = null;
            }
            Object applicationContext = ((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext)).getApplicationContext();
            Object obj10 = (LifecycleOwner) gapComposer.consume(LocalLifecycleOwnerKt.LocalLifecycleOwner);
            Boolean valueOf2 = Boolean.valueOf(localPosCheckInViewModel.canStartCamera);
            boolean changedInstance = gapComposer.changedInstance(localPosCheckInViewModel) | gapComposer.changed(z) | gapComposer.changedInstance(applicationContext) | gapComposer.changedInstance(obj10) | gapComposer.changedInstance(obj4) | gapComposer.changedInstance(obj5);
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue7 == obj6) {
                f = 1.0f;
                Object ziplineLoader$load$2 = new ZiplineLoader$load$2(localPosCheckInViewModel, applicationContext, obj10, obj4, obj5, mutableState3, mutableState, (Continuation) null, 8);
                gapComposer.updateRememberedValue(ziplineLoader$load$2);
                rememberedValue7 = ziplineLoader$load$2;
            } else {
                f = 1.0f;
            }
            Updater.LaunchedEffect(obj10, valueOf2, (Function2) rememberedValue7, gapComposer);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(OffsetKt.aspectRatio(f, SpacerKt.m298padding3ABfNKs(companion, 24.0f), false), f);
            Strings.getSizes(gapComposer).getClass();
            Object obj11 = DefaultSizes.border.annotationsMap;
            BoxKt.Box(ClipKt.clip(ImageKt.m178borderxT4_qwU(fillMaxWidth, 2.0f, Strings.getColors(gapComposer).semantic.border.standard, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f)), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f)), gapComposer, 0);
            ArcadeThemeKt.ArcadeTheme(ColorsLightKt.colorsLight, null, null, Expect_jvmKt.rememberComposableLambda(-1630636381, new LocalMapKt$$ExternalSyntheticLambda9(28, localPosCheckInViewModel, mutableState2), gapComposer), gapComposer, 3072, 6);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$app$cash$local$views$wallet$LocalBrandCollectionWidgetKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f$0;
        BrandCollectionModel brandCollectionModel = (BrandCollectionModel) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, 11);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            TextStyle textStyle = ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).sectionTitle;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer, m302paddingqDBjuR0$default, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            String str2 = brandCollectionModel.primaryCtaButtonLabel;
            if (str2 == null) {
                gapComposer.startReplaceGroup(41949973);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(41949974);
                Role role = new Role(0);
                boolean changedInstance = gapComposer.changedInstance(brandCollectionModel) | gapComposer.changed(function1);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new n$$ExternalSyntheticLambda0(7, brandCollectionModel, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                zzacp.m2014InlineIconTextQqsJerU(str2, Icons.SubtlePush16.painter(gapComposer), ImageKt.m183clickableoSLSa3U$default(companion, false, null, role, (Function0) rememberedValue, 11), 0L, null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodySmall, 0L, null, 0, 0, 0, 0, false, RecyclerView.DECELERATION_RATE, gapComposer, Painter.$stable << 3, 0, 32728);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$app$cash$local$views$wallet$TabContentViewKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3) {
        LocalHomeViewModel.TabContent tabContent = (LocalHomeViewModel.TabContent) this.f$0;
        Function1 function1 = (Function1) this.f$2;
        String str = (String) this.f$1;
        TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        titleBarActionScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(titleBarActionScope) ? 4 : 2;
        }
        int i = 0;
        GapComposer gapComposer = (GapComposer) composer;
        if (!gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (tabContent.addBrandsVisible) {
            gapComposer.startReplaceGroup(552175280);
            TransactorKt.CustomAction(titleBarActionScope, null, null, Expect_jvmKt.rememberComposableLambda(-1527554033, new TabContentViewKt$$ExternalSyntheticLambda11(function1, str, i), gapComposer), gapComposer, (intValue & 14) | 3072, 3);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(552677883);
            gapComposer.end(false);
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$account$components$AccountUiViewKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) this.f$0;
        Function1 function1 = (Function1) this.f$2;
        AccountViewModel accountViewModel = (AccountViewModel) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((FlowRowScope) obj).getClass();
        int i = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            String stringResource = Room.stringResource(gapComposer, R.string.account_ui_choose_account_button);
            boolean changed = gapComposer.changed(stringResource);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj4 = Composer.Companion.Empty;
            if (changed || rememberedValue == obj4) {
                rememberedValue = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(stringResource, 13);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier modifier = Modifier.Companion.$$INSTANCE;
            Modifier testTag = TestTagKt.testTag(SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue), "choose_an_account_button");
            if (elementBoundsRegistry != null) {
                modifier = WalletJsonParser.provideBounds(elementBoundsRegistry, ElementBoundsRegistry.Element.AccountSettingsCashtagDropdown);
            }
            Modifier then = testTag.then(modifier);
            boolean changed2 = gapComposer.changed(function1);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == obj4) {
                rememberedValue2 = new AccountToDoKt$$ExternalSyntheticLambda0(7, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            coil3.size.SizeKt.ButtonDropdown((Function0) rememberedValue2, then, false, null, Expect_jvmKt.rememberComposableLambda(-1092877259, new BalanceFeedKt$$ExternalSyntheticLambda9(accountViewModel, i), gapComposer), gapComposer, 24576, 12);
            boolean changed3 = gapComposer.changed(function1);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue3 == obj4) {
                rememberedValue3 = new AccountToDoKt$$ExternalSyntheticLambda0(8, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue3, null, null, false, false, null, AccountToDoKt.f101lambda$1205309351, gapComposer, 1572864, 62);
            if (accountViewModel.headerViewModel.showAddQrToHomeScreenButton) {
                gapComposer.startReplaceGroup(866219198);
                boolean changed4 = gapComposer.changed(function1);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changed4 || rememberedValue4 == obj4) {
                    rememberedValue4 = new AccountToDoKt$$ExternalSyntheticLambda0(9, function1);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue4, null, null, false, false, null, AccountToDoKt.f109lambda$371947618, gapComposer, 1572864, 62);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(866391217);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$activity$views$ActivityItemViewKt$$ExternalSyntheticLambda31(Object obj, Object obj2, Object obj3) {
        Function0 function0 = (Function0) this.f$0;
        ItemAccessory.PortraitImage portraitImage = (ItemAccessory.PortraitImage) this.f$1;
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) this.f$2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        BiasAlignment biasAlignment = Alignment.Companion.Center;
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(booleanValue) ? 4 : 2;
        }
        int i = 1;
        GapComposer gapComposer = (GapComposer) composer;
        boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18);
        Applier applier = gapComposer.applier;
        if (shouldExecute) {
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Color color = null;
            if (booleanValue) {
                gapComposer.startReplaceGroup(-127487184);
                Strings.getSizes(gapComposer).getClass();
                Object obj4 = DefaultSizes.border.entries;
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m275defaultMinSizeVpY3zN4(ClipKt.clip(companion, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f)), 80.0f, 32.0f), Strings.getColors(gapComposer).semantic.background.subtle, rectangleShapeKt$RectangleShape$1);
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                Strings.getSizes(gapComposer).getClass();
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m177backgroundbw27NRU, 16.0f, 4.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, portraitImage.amount, (Map) null, (Function1) null, false);
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-126760451);
                Strings.getSizes(gapComposer).getClass();
                Object obj5 = DefaultSizes.border.entries;
                Modifier m275defaultMinSizeVpY3zN4 = SizeKt.m275defaultMinSizeVpY3zN4(ClipKt.clip(companion, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f)), 80.0f, 32.0f);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(m275defaultMinSizeVpY3zN4, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m3400rippleYJYuY3k(0L, true, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 13), false, null, null, function0, 28);
                boolean changedInstance = gapComposer.changedInstance(portraitImage);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ActivityItemViewKt$$ExternalSyntheticLambda28(portraitImage, i);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Modifier semantics = SemanticsModifierKt.semantics(m182clickableO2vRcR0$default, false, (Function1) rememberedValue2);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, semantics);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ImageKt.Image(asyncImagePainter, null, boxScopeInstance.matchParentSize(), null, ContentScale.Companion.Crop, RecyclerView.DECELERATION_RATE, null, gapComposer, 24624, 104);
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(boxScopeInstance.matchParentSize(), Color.m675copywmQWz5c$default(0.1f, Strings.getColors(gapComposer).base.constantBlack, 14), rectangleShapeKt$RectangleShape$1), gapComposer, 0);
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                Strings.getSizes(gapComposer).getClass();
                Modifier m299paddingVpY3zN42 = SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 4.0f);
                String str = portraitImage.amount;
                TextStyle textStyle = Strings.getTypography(gapComposer).labelMedium;
                ColorModel colorModel = portraitImage.textColor;
                if (colorModel == null) {
                    gapComposer.startReplaceGroup(-253123361);
                    gapComposer.end(false);
                } else {
                    color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -285259934, colorModel, gapComposer, false);
                }
                Color color2 = color;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, color2 != null ? color2.value : Color.White, (Composer) gapComposer, m299paddingVpY3zN42, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(true);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$activity$views$ActivityTabViewKt$$ExternalSyntheticLambda29(Object obj, Object obj2, Object obj3) {
        ActivityTabViewModel activityTabViewModel = (ActivityTabViewModel) this.f$0;
        ActivityFeedEntry.InlineAppMessageV2 inlineAppMessageV2 = (ActivityFeedEntry.InlineAppMessageV2) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        lazyItemScopeImpl.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj4 = Composer.Companion.Empty;
            if (rememberedValue == obj4) {
                rememberedValue = new MutableTransitionState(Boolean.TRUE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableTransitionState mutableTransitionState = (MutableTransitionState) rememberedValue;
            InlineAppMessageV2ViewModel.Ready ready = activityTabViewModel.dismissedInlineMessage;
            Continuation continuation = null;
            boolean z = !Intrinsics.areEqual(ready != null ? ready.messageToken : null, inlineAppMessageV2.appMessage.messageToken);
            Boolean valueOf = Boolean.valueOf(z);
            boolean changedInstance = gapComposer.changedInstance(mutableTransitionState) | gapComposer.changed(z);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == obj4) {
                rememberedValue2 = new RealBadger2$scheduleBadgeClearingWork$3(mutableTransitionState, z, continuation, 3);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            SpacerKt.Spacer(gapComposer, LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, SizeKt.m277height3ABfNKs(companion, 24.0f)));
            TooltipState rememberTooltipState = CardUpsellKt.rememberTooltipState(gapComposer);
            Object value = mutableTransitionState.currentState$delegate.getValue();
            Boolean valueOf2 = Boolean.valueOf(activityTabViewModel.showInlineMessageTooltip);
            boolean changedInstance2 = gapComposer.changedInstance(mutableTransitionState) | gapComposer.changedInstance(activityTabViewModel) | gapComposer.changed(rememberTooltipState);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == obj4) {
                Object setNameViewKt$SetName$2$1 = new SetNameViewKt$SetName$2$1(mutableTransitionState, activityTabViewModel, rememberTooltipState, continuation, 2);
                gapComposer.updateRememberedValue(setNameViewKt$SetName$2$1);
                rememberedValue3 = setNameViewKt$SetName$2$1;
            }
            Updater.LaunchedEffect(value, valueOf2, (Function2) rememberedValue3, gapComposer);
            String stringResource = Room.stringResource(gapComposer, R.string.inline_message_dismiss_tooltip);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.End;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue4 = gapComposer.rememberedValue();
            int i = 19;
            if (changed || rememberedValue4 == obj4) {
                rememberedValue4 = new BalanceFeedKt$$ExternalSyntheticLambda4(19, function1);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            CardUpsellKt.m3598TooltipBoxiHT50w(null, stringResource, rememberTooltipState, horizontal, RecyclerView.DECELERATION_RATE, (Function0) rememberedValue4, Expect_jvmKt.rememberComposableLambda(-2023794564, new LocalViewFactory$$ExternalSyntheticLambda6(i, mutableTransitionState, inlineAppMessageV2, function1), gapComposer), gapComposer, 1575936, 17);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$activity$views$ActivityTabViewKt$$ExternalSyntheticLambda40(Object obj, Object obj2, Object obj3) {
        MutableTransitionState mutableTransitionState = (MutableTransitionState) this.f$0;
        ActivityFeedEntry.InlineAppMessageV2 inlineAppMessageV2 = (ActivityFeedEntry.InlineAppMessageV2) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((BoxScope) obj).getClass();
        int i = 16;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            InlineAppMessageV2ViewModel.Ready ready = inlineAppMessageV2.appMessage;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda1(i, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Threads.InlineAppMessageV2(mutableTransitionState, ready, (Function1) rememberedValue, null, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$afterpayapplet$views$AfterpayAppletPurchasesEmbeddedViewKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        ComposableLambdaImpl composableLambdaImpl;
        Function0 function0;
        AfterpayAppletPurchasesEmbeddedViewModel.EmbeddedActivitySection embeddedActivitySection = (AfterpayAppletPurchasesEmbeddedViewModel.EmbeddedActivitySection) this.f$0;
        Function1 function1 = (Function1) this.f$2;
        AfterpayAppletPurchasesEmbeddedViewModel.EmbeddedActivitySection embeddedActivitySection2 = (AfterpayAppletPurchasesEmbeddedViewModel.EmbeddedActivitySection) this.f$1;
        EmbeddedHeaderScope embeddedHeaderScope = (EmbeddedHeaderScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        embeddedHeaderScope.getClass();
        boolean z = embeddedHeaderScope.hasMore;
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(embeddedHeaderScope) ? 4 : 2;
        }
        int i = 0;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            if (embeddedActivitySection.activitiesViewModel.feedEntries.isEmpty()) {
                gapComposer.startReplaceGroup(-1747891102);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1747955489);
                DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1910489671, new AfterpayAppletPurchasesEmbeddedViewKt$$ExternalSyntheticLambda8(embeddedActivitySection2, i), gapComposer);
            if (z) {
                gapComposer.startReplaceGroup(-1747603918);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(338014230, new AfterpayAppletPurchasesEmbeddedViewKt$$ExternalSyntheticLambda8(embeddedActivitySection2, 3), gapComposer);
                gapComposer.end(false);
                composableLambdaImpl = rememberComposableLambda2;
            } else {
                gapComposer.startReplaceGroup(-1747304520);
                gapComposer.end(false);
                composableLambdaImpl = null;
            }
            if (z) {
                gapComposer.startReplaceGroup(-1747201321);
                boolean changed = gapComposer.changed(function1);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ReceiptUiKt$$ExternalSyntheticLambda3(23, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                gapComposer.end(false);
                function0 = (Function0) rememberedValue;
            } else {
                gapComposer.startReplaceGroup(-1747121992);
                gapComposer.end(false);
                function0 = null;
            }
            ViewfinderDefaults.SectionHeader(rememberComposableLambda, (Modifier) null, composableLambdaImpl, function0, (Function2) null, gapComposer, 6, 18);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$afterpayapplet$views$AfterpaySearchViewKt$$ExternalSyntheticLambda13(Object obj, Object obj2, Object obj3) {
        LazyListState lazyListState = (LazyListState) this.f$0;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.f$1;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Unit unit = Unit.INSTANCE;
            boolean changed = gapComposer.changed(lazyListState);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoneyTabUIKt$MoneyTabLoaded$2$1(lazyListState, null, 3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo233toDpu2uoSUM(parcelableSnapshotMutableIntState2.getIntValue() + parcelableSnapshotMutableIntState.getIntValue())));
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$afterpayapplet$views$AfterpaySearchViewKt$$ExternalSyntheticLambda15(Object obj, Object obj2, Object obj3) {
        LazyListState lazyListState = (LazyListState) this.f$0;
        AfterpaySearchViewModel.CategoryTilesSectionViewModel categoryTilesSectionViewModel = (AfterpaySearchViewModel.CategoryTilesSectionViewModel) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            boolean changedInstance = gapComposer.changedInstance(categoryTilesSectionViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ContextKt$$ExternalSyntheticLambda1(categoryTilesSectionViewModel, 10);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            if (((Boolean) ListsKt.rememberLazyListItemVisibility(lazyListState, (Function1) rememberedValue, gapComposer).getValue()).booleanValue()) {
                function1.invoke(new AfterpaySearchViewEvent.SectionViewed(categoryTilesSectionViewModel.id));
            }
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            SavingsAction.Action.AfterpayCategoriesSection(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), categoryTilesSectionViewModel, null, function1, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$afterpayapplet$views$AfterpaySearchViewKt$$ExternalSyntheticLambda23(Object obj, Object obj2, Object obj3) {
        String str;
        LazyListState lazyListState = (LazyListState) this.f$0;
        AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.SectionViewModel sectionViewModel = (AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.SectionViewModel) this.f$1;
        String str2 = sectionViewModel.title;
        Function1 function1 = (Function1) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        int i = 0;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            boolean changedInstance = gapComposer.changedInstance(sectionViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ContextKt$$ExternalSyntheticLambda1(sectionViewModel, 11);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            if (((Boolean) ListsKt.rememberLazyListItemVisibility(lazyListState, (Function1) rememberedValue, gapComposer).getValue()).booleanValue()) {
                function1.invoke(new AfterpaySearchViewEvent.SectionViewed(sectionViewModel.id));
            }
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            if (StringsKt.isBlank(str2) && ((str = sectionViewModel.subtitle) == null || StringsKt.isBlank(str))) {
                gapComposer.startReplaceGroup(-428348959);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(i);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                m302paddingqDBjuR0$default = SemanticsModifierKt.clearAndSetSemantics(m302paddingqDBjuR0$default, (Function1) rememberedValue2);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-428249294);
                gapComposer.end(false);
            }
            ViewfinderDefaults.SectionHeader(str2, m302paddingqDBjuR0$default, (String) null, (Function0) null, sectionViewModel.subtitle, gapComposer, 0, 12);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$afterpayapplet$views$AfterpaySearchViewKt$$ExternalSyntheticLambda28(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$2;
        final AfterpaySearchViewModel.FilterBottomSheetViewModel filterBottomSheetViewModel = (AfterpaySearchViewModel.FilterBottomSheetViewModel) this.f$0;
        MutableState mutableState = (MutableState) this.f$1;
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
            boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(filterBottomSheetViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda5(23, function1, filterBottomSheetViewModel);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, adaptiveStackScope.horizontalWeight(companion, 1.0f), null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1478760356, new Function3() { // from class: com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    int i3 = i;
                    AfterpaySearchViewModel.FilterBottomSheetViewModel filterBottomSheetViewModel2 = filterBottomSheetViewModel;
                    switch (i3) {
                        case 0:
                            Composer composer2 = (Composer) obj5;
                            int intValue2 = ((Integer) obj6).intValue();
                            ((RowScope) obj4).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, filterBottomSheetViewModel2.resetButtonText, (Map) null, (Function1) null, false);
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
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, filterBottomSheetViewModel2.applyButtonText, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 1572864, 60);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean z = ((String) mutableState.getValue()) != null;
            Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
            boolean changed2 = gapComposer.changed(function1) | gapComposer.changedInstance(filterBottomSheetViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CopyCodeKt$$ExternalSyntheticLambda4(function1, filterBottomSheetViewModel, mutableState, false, 5);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, horizontalWeight, buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(2009034515, new Function3() { // from class: com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    int i3 = i2;
                    AfterpaySearchViewModel.FilterBottomSheetViewModel filterBottomSheetViewModel2 = filterBottomSheetViewModel;
                    switch (i3) {
                        case 0:
                            Composer composer2 = (Composer) obj5;
                            int intValue2 = ((Integer) obj6).intValue();
                            ((RowScope) obj4).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, filterBottomSheetViewModel2.resetButtonText, (Map) null, (Function1) null, false);
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
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, filterBottomSheetViewModel2.applyButtonText, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 1573248, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$agents$applets$views$AgentsAppletTile$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        AgentsAppletTileViewModel agentsAppletTileViewModel = (AgentsAppletTileViewModel) this.f$0;
        KycAppletTile kycAppletTile = (KycAppletTile) this.f$1;
        TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1 = (TaxesAppletViewsModule$$ExternalSyntheticLambda1) kycAppletTile.onClick;
        AppletTile.AppletTileAppearance appletTileAppearance = (AppletTile.AppletTileAppearance) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (!gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            gapComposer.skipToGroupEnd();
        } else if (agentsAppletTileViewModel instanceof AgentsAppletTileViewModel.Loading) {
            gapComposer.startReplaceGroup(975861930);
            SharedUIKt.m3606LoadingServiceAppletTile942rkJo(((AgentsAppletTileViewModel.Loading) agentsAppletTileViewModel).title, taxesAppletViewsModule$$ExternalSyntheticLambda1, RecyclerView.DECELERATION_RATE, appletTileAppearance.useRedesignedTiles, gapComposer, 0, 4);
            gapComposer.end(false);
        } else if (agentsAppletTileViewModel instanceof AgentsAppletTileViewModel.Installed) {
            gapComposer.startReplaceGroup(975868394);
            kycAppletTile.InstalledUI((AgentsAppletTileViewModel.Installed) agentsAppletTileViewModel, appletTileAppearance, gapComposer, 0);
            gapComposer.end(false);
        } else if (agentsAppletTileViewModel instanceof AgentsAppletTileViewModel.Uninstalled) {
            gapComposer.startReplaceGroup(975870931);
            kycAppletTile.UninstalledUI((AgentsAppletTileViewModel.Uninstalled) agentsAppletTileViewModel, gapComposer, 0);
            gapComposer.end(false);
        } else {
            if (!(agentsAppletTileViewModel instanceof AgentsAppletTileViewModel.Failure)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 975860581, false);
            }
            gapComposer.startReplaceGroup(975872661);
            SharedUIKt.FailedAppletTile(0, gapComposer, ((AgentsAppletTileViewModel.Failure) agentsAppletTileViewModel).title, taxesAppletViewsModule$$ExternalSyntheticLambda1);
            gapComposer.end(false);
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$agents$applets$views$AgentsHomeViewKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        AgentsHomeViewModel agentsHomeViewModel = (AgentsHomeViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$2;
        LazyScaffoldContentScope lazyScaffoldContentScope = (LazyScaffoldContentScope) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            String str = agentsHomeViewModel.title;
            String str2 = agentsHomeViewModel.createButtonText;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda1(5, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AgentsHomeViewKt.AgentsHomeHeader(0, gapComposer, ScreenScaffoldKt.markAsScaffoldTitle(Modifier.Companion.$$INSTANCE, lazyScaffoldContentScope, gapComposer, 6), str, str2, (Function0) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    private final Object invoke$com$squareup$cash$amountchooser$views$AtmPickerGridKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3) {
        InputChipGridScope inputChipGridScope;
        boolean z;
        boolean z2;
        Modifier modifier;
        boolean z3;
        List list = (List) this.f$0;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        InputChipGridScope inputChipGridScope2 = (InputChipGridScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        inputChipGridScope2.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(inputChipGridScope2) ? 4 : 2;
        }
        int i = intValue;
        ?? r9 = 0;
        boolean z4 = true;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(i & 1, (i & 19) != 18)) {
            int i2 = 0;
            for (Object obj4 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                AmountSelectorWidgetModel.Item item = (AmountSelectorWidgetModel.Item) obj4;
                boolean changed = gapComposer.changed(parcelableSnapshotMutableIntState) | gapComposer.changed(i2) | gapComposer.changed(function1) | gapComposer.changedInstance(item);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new Media3MuxerImpl$$ExternalSyntheticLambda1(i2, function1, item, parcelableSnapshotMutableIntState, 1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                AmountSelectorWidgetModel.Item.Icon icon = item.getIcon();
                Icons icons = (icon == null ? -1 : AtmPickerGridKt$WhenMappings.$EnumSwitchMapping$0[icon.ordinal()]) == z4 ? Icons.Pending24 : null;
                Modifier weight = inputChipGridScope2.weight(1.0f, Modifier.Companion.$$INSTANCE, z4);
                if (icons != null) {
                    gapComposer.startReplaceGroup(139284283);
                    boolean z5 = parcelableSnapshotMutableIntState.getIntValue() == i2 ? z4 : r9;
                    boolean isEnabled = item.isEnabled();
                    String accessibilityHint = item.getAccessibilityHint();
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1670636501, new AtmPickerGridKt$$ExternalSyntheticLambda4(r9, icons, item), gapComposer);
                    inputChipGridScope = inputChipGridScope2;
                    z = r9;
                    GapComposer gapComposer2 = gapComposer;
                    z2 = z4;
                    inputChipGridScope.InputChip((3670016 & (i << 18)) | 6, 0, gapComposer2, rememberComposableLambda, weight, accessibilityHint, function0, z5, isEnabled);
                    gapComposer = gapComposer2;
                    gapComposer.end(z);
                } else {
                    inputChipGridScope = inputChipGridScope2;
                    z = r9;
                    z2 = z4;
                    gapComposer.startReplaceGroup(140025803);
                    String label = item.getLabel();
                    if (parcelableSnapshotMutableIntState.getIntValue() == i2) {
                        modifier = weight;
                        z3 = z2;
                    } else {
                        modifier = weight;
                        z3 = z;
                    }
                    inputChipGridScope.InputChip(label, modifier, item.getAccessibilityHint(), function0, z3, item.isEnabled(), gapComposer, (i << 18) & 3670016, 0);
                    gapComposer.end(z);
                }
                r9 = z;
                z4 = z2;
                inputChipGridScope2 = inputChipGridScope;
                i2 = i3;
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$appmessages$views$InlineAppMessageKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3) {
        InlineAppMessageViewModel.Ready ready = (InlineAppMessageViewModel.Ready) this.f$0;
        AppMessageImage appMessageImage = (AppMessageImage) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        ColumnScope columnScope = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        columnScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(columnScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            InlineAppMessageKt.ImageHeader(columnScope, ready.messageToken, appMessageImage, function1, null, gapComposer, intValue & 14);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        float f;
        Throwable th;
        boolean z2;
        Object obj4;
        ComposableLambdaImpl composableLambdaImpl;
        boolean z3;
        Composer composer;
        boolean z4;
        Modifier wrapContentHeight;
        int i = this.$r8$classId;
        float f2 = RecyclerView.DECELERATION_RATE;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i2 = 19;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj5 = this.f$2;
        Object obj6 = this.f$1;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                LocalViewFactory localViewFactory = (LocalViewFactory) obj7;
                BrandCollectionMapViewModel brandCollectionMapViewModel = (BrandCollectionMapViewModel) obj6;
                Function1 function1 = (Function1) obj5;
                Modifier modifier = (Modifier) obj;
                Composer composer2 = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                modifier.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer2).changed(modifier) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer2;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    Updater.CompositionLocalProvider(MapEngineProviderKt.LocalMapEngineProvider.defaultProvidedValue$runtime((GoogleMapEngineProvider) localViewFactory.mapEngineProvider), Expect_jvmKt.rememberComposableLambda(-1742480333, new LocalViewFactory$$ExternalSyntheticLambda8(modifier, brandCollectionMapViewModel, function1, 0, (byte) 0), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ArrayList arrayList = (ArrayList) obj7;
                FadeInFadeOutState fadeInFadeOutState = (FadeInFadeOutState) obj6;
                String str = (String) obj5;
                Function2 function2 = (Function2) obj;
                Composer composer3 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer3).changedInstance(function2) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer3;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    int i3 = ListUtilsKt.fastFilterNotNull(arrayList).size() != 1 ? 75 : 0;
                    TweenSpec tweenSpec = new TweenSpec(150, i3, EasingKt.LinearEasing);
                    boolean changedInstance = gapComposer2.changedInstance(null) | gapComposer2.changedInstance(fadeInFadeOutState);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    Object obj8 = rememberedValue;
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        Worker$$ExternalSyntheticLambda0 worker$$ExternalSyntheticLambda0 = new Worker$$ExternalSyntheticLambda0(fadeInFadeOutState, 3);
                        gapComposer2.updateRememberedValue(worker$$ExternalSyntheticLambda0);
                        obj8 = worker$$ExternalSyntheticLambda0;
                    }
                    Function0 function0 = (Function0) obj8;
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    Object obj9 = rememberedValue2;
                    if (rememberedValue2 == neverEqualPolicy) {
                        Animatable Animatable = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                        gapComposer2.updateRememberedValue(Animatable);
                        obj9 = Animatable;
                    }
                    Animatable animatable = (Animatable) obj9;
                    boolean changedInstance2 = gapComposer2.changedInstance(animatable) | gapComposer2.changed(true) | gapComposer2.changedInstance(tweenSpec) | gapComposer2.changed(function0);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                        z = true;
                        f = 0.01f;
                        RoomDatabase$performClear$1.AnonymousClass1 anonymousClass1 = new RoomDatabase$performClear$1.AnonymousClass1(animatable, z, tweenSpec, function0, (Continuation) null, 3);
                        gapComposer2.updateRememberedValue(anonymousClass1);
                        rememberedValue3 = anonymousClass1;
                    } else {
                        f = 0.01f;
                        z = true;
                    }
                    Updater.LaunchedEffect((Composer) gapComposer2, (Object) true, (Function2) rememberedValue3);
                    AnimationState animationState = animatable.internalState;
                    TweenSpec tweenSpec2 = new TweenSpec(150, i3, EasingKt.FastOutSlowInEasing);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    Object obj10 = rememberedValue4;
                    if (rememberedValue4 == neverEqualPolicy) {
                        Animatable Animatable2 = AnimatableKt.Animatable(0.8f, f);
                        gapComposer2.updateRememberedValue(Animatable2);
                        obj10 = Animatable2;
                    }
                    Animatable animatable2 = (Animatable) obj10;
                    Boolean valueOf = Boolean.valueOf(z);
                    boolean changedInstance3 = gapComposer2.changedInstance(animatable2) | gapComposer2.changed(z) | gapComposer2.changedInstance(tweenSpec2);
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
                        RoomDatabase$performClear$1 roomDatabase$performClear$1 = new RoomDatabase$performClear$1(animatable2, z, tweenSpec2, (Continuation) null, 3);
                        th = null;
                        gapComposer2.updateRememberedValue(roomDatabase$performClear$1);
                        rememberedValue5 = roomDatabase$performClear$1;
                    } else {
                        th = null;
                    }
                    Updater.LaunchedEffect(gapComposer2, valueOf, (Function2) rememberedValue5);
                    AnimationState animationState2 = animatable2.internalState;
                    Modifier m686graphicsLayerAp8cVGQ$default = ColorKt.m686graphicsLayerAp8cVGQ$default(Modifier.Companion.$$INSTANCE, ((Number) animationState2.value$delegate.getValue()).floatValue(), ((Number) animationState2.value$delegate.getValue()).floatValue(), ((Number) animationState.value$delegate.getValue()).floatValue(), RecyclerView.DECELERATION_RATE, null, 131064);
                    boolean changed = gapComposer2.changed(z) | gapComposer2.changed(str) | gapComposer2.changedInstance(th);
                    Object rememberedValue6 = gapComposer2.rememberedValue();
                    if (changed || rememberedValue6 == neverEqualPolicy) {
                        z2 = false;
                        SnackbarHostKt$$ExternalSyntheticLambda5 snackbarHostKt$$ExternalSyntheticLambda5 = new SnackbarHostKt$$ExternalSyntheticLambda5(str, false ? 1 : 0, z);
                        gapComposer2.updateRememberedValue(snackbarHostKt$$ExternalSyntheticLambda5);
                        obj4 = snackbarHostKt$$ExternalSyntheticLambda5;
                    } else {
                        z2 = false;
                        obj4 = rememberedValue6;
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(m686graphicsLayerAp8cVGQ$default, z2, (Function1) obj4);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z2);
                    int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer2);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, semantics);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw th;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer2.inserting || !Intrinsics.areEqual(gapComposer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer2, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                    }
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline1.m(intValue2 & 14, function2, gapComposer2, true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                CouponSection couponSection = (CouponSection) obj7;
                TextFieldState textFieldState = (TextFieldState) obj6;
                Function1 function12 = (Function1) obj5;
                Composer composer4 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer4;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    String str2 = couponSection.inputPlaceholder;
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, 7, (Boolean) null, 119);
                    String str3 = couponSection.errorMessage;
                    boolean z5 = str3 != null;
                    if (str3 == null) {
                        gapComposer3.startReplaceGroup(-1053604220);
                        gapComposer3.end(false);
                        composableLambdaImpl = null;
                    } else {
                        gapComposer3.startReplaceGroup(-1053604219);
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1611244137, new LocalHomeViewKt$$ExternalSyntheticLambda1(str3, 1), gapComposer3);
                        gapComposer3.end(false);
                        composableLambdaImpl = rememberComposableLambda;
                    }
                    boolean changed2 = gapComposer3.changed(textFieldState) | gapComposer3.changed(function12);
                    Object rememberedValue7 = gapComposer3.rememberedValue();
                    if (changed2 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new CheckoutCouponSectionKt$$ExternalSyntheticLambda6(0, textFieldState, function12);
                        gapComposer3.updateRememberedValue(rememberedValue7);
                    }
                    InputFieldKt.InputField(textFieldState, fillMaxWidth, false, false, z5, null, null, null, composableLambdaImpl, str2, keyboardOptions, (KeyboardActionHandler) rememberedValue7, null, null, null, null, gapComposer3, 48, 6, 61676);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                GiftCardInputState giftCardInputState = (GiftCardInputState) obj7;
                TextFieldState textFieldState2 = (TextFieldState) obj6;
                final Function0 function02 = (Function0) obj5;
                Composer composer5 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer5;
                if (!gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    gapComposer4.skipToGroupEnd();
                } else if (giftCardInputState == null) {
                    gapComposer4.startReplaceGroup(1348673857);
                    gapComposer4.end(false);
                } else {
                    String str4 = giftCardInputState.errorMessage;
                    gapComposer4.startReplaceGroup(1348673858);
                    final boolean z6 = (StringsKt.isBlank(textFieldState2.getValue$foundation().text) || giftCardInputState.isLoading) ? false : true;
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer4, 48);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, fillMaxWidth2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer4, materializeModifier2, ComposeUiNode.Companion.SetModifier, 1.0f, true);
                    String stringResource = Room.stringResource(gapComposer4, R.string.local_views_enter_gift_card_code);
                    KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, 8, 7, (Boolean) null, 115);
                    boolean z7 = str4 != null;
                    ComposableLambdaImpl composableLambdaImpl2 = str4 != null ? CheckoutTipSectionKt.lambda$1884546764 : null;
                    boolean changed3 = gapComposer4.changed(z6) | gapComposer4.changed(function02);
                    Object rememberedValue8 = gapComposer4.rememberedValue();
                    if (changed3 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new KeyboardActionHandler() { // from class: app.cash.local.views.brand.checkout.CheckoutGiftCardSectionKt$$ExternalSyntheticLambda6
                            @Override // androidx.compose.foundation.text.input.KeyboardActionHandler
                            public final void onKeyboardAction(q2$$ExternalSyntheticLambda8 q2__externalsyntheticlambda8) {
                                if (z6) {
                                    function02.invoke();
                                }
                            }
                        };
                        gapComposer4.updateRememberedValue(rememberedValue8);
                    }
                    InputFieldKt.InputField(textFieldState2, m, false, false, z7, null, null, composableLambdaImpl2, null, stringResource, keyboardOptions2, (KeyboardActionHandler) rememberedValue8, GiftCardInputTransformation.INSTANCE, GiftCardOutputTransformation.INSTANCE, null, null, gapComposer4, 0, 3462, 49516);
                    coil3.size.SizeKt.Button(function02, SpacerKt.m302paddingqDBjuR0$default(companion2, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), null, false, z6, null, CheckoutTipSectionKt.f30lambda$911498430, gapComposer4, 1572912, 44);
                    gapComposer4.end(true);
                    if (str4 == null) {
                        gapComposer4.startReplaceGroup(24932376);
                        z3 = false;
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(24932377);
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                        Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                        } else {
                            gapComposer4.startReplaceGroup(-1762997739);
                            gapComposer4.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.danger, (Composer) gapComposer4, m302paddingqDBjuR0$default, ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).bodySmall, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                        z3 = false;
                        gapComposer4.end(false);
                    }
                    gapComposer4.end(z3);
                }
                return Unit.INSTANCE;
            case 4:
                final Function1 function13 = (Function1) obj5;
                TextFieldState textFieldState3 = (TextFieldState) obj7;
                final CurbsidePickupCarViewModel curbsidePickupCarViewModel = (CurbsidePickupCarViewModel) obj6;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer6 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer6).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer6;
                boolean shouldExecute = gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18);
                Applier applier = gapComposer5.applier;
                if (shouldExecute) {
                    Modifier padding = SpacerKt.padding(SizeKt.fillMaxWidth(companion, 1.0f), paddingValues);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer5, 0);
                    int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer5, padding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer5.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$13);
                    Integer valueOf2 = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer5, valueOf2, composeUiNode$Companion$SetModifier$14);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer5, materializeModifier3, composeUiNode$Companion$SetModifier$15);
                    Transformations.SheetHeader(Room.stringResource(gapComposer5, R.string.local_views_vehicle_description_title), (Modifier) null, (Function2) null, (String) null, gapComposer5, 0, 14);
                    SpacerKt.Spacer(gapComposer5, SizeKt.m277height3ABfNKs(companion, 16.0f));
                    final int i4 = 0;
                    CurbsidePickupCarSheetKt.VehicleChipSection(Room.stringResource(gapComposer5, R.string.local_views_vehicle_color_section_title), null, Expect_jvmKt.rememberComposableLambda(-1262240138, new Function3() { // from class: app.cash.local.views.brand.checkout.CurbsidePickupCarSheetKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj11, Object obj12, Object obj13) {
                            int i5 = i4;
                            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                            int i6 = 0;
                            Function1 function14 = function13;
                            CurbsidePickupCarViewModel curbsidePickupCarViewModel2 = curbsidePickupCarViewModel;
                            switch (i5) {
                                case 0:
                                    FlowRowScope flowRowScope = (FlowRowScope) obj11;
                                    Composer composer7 = (Composer) obj12;
                                    int intValue6 = ((Integer) obj13).intValue();
                                    flowRowScope.getClass();
                                    if ((intValue6 & 6) == 0) {
                                        intValue6 |= ((GapComposer) composer7).changed(flowRowScope) ? 4 : 2;
                                    }
                                    GapComposer gapComposer6 = (GapComposer) composer7;
                                    if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                                        List list = curbsidePickupCarViewModel2.colorOptions;
                                        int size = list.size();
                                        while (i6 < size) {
                                            VehicleColorOption vehicleColorOption = (VehicleColorOption) list.get(i6);
                                            Modifier weight = flowRowScope.weight(1.0f, companion3, true);
                                            boolean areEqual = Intrinsics.areEqual(vehicleColorOption, curbsidePickupCarViewModel2.selectedColor);
                                            boolean changed4 = gapComposer6.changed(function14) | gapComposer6.changedInstance(vehicleColorOption);
                                            Object rememberedValue9 = gapComposer6.rememberedValue();
                                            if (changed4 || rememberedValue9 == neverEqualPolicy2) {
                                                rememberedValue9 = new StatusRunnable$$ExternalSyntheticLambda1(19, function14, vehicleColorOption);
                                                gapComposer6.updateRememberedValue(rememberedValue9);
                                            }
                                            CurbsidePickupCarSheetKt.VehicleChip(3072, gapComposer6, Expect_jvmKt.rememberComposableLambda(-1970477733, new HintHandler$$ExternalSyntheticLambda0(vehicleColorOption, 23), gapComposer6), weight, (Function0) rememberedValue9, areEqual);
                                            i6++;
                                        }
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    FlowRowScope flowRowScope2 = (FlowRowScope) obj11;
                                    Composer composer8 = (Composer) obj12;
                                    int intValue7 = ((Integer) obj13).intValue();
                                    flowRowScope2.getClass();
                                    if ((intValue7 & 6) == 0) {
                                        intValue7 |= ((GapComposer) composer8).changed(flowRowScope2) ? 4 : 2;
                                    }
                                    GapComposer gapComposer7 = (GapComposer) composer8;
                                    if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                                        List list2 = curbsidePickupCarViewModel2.typeOptions;
                                        int size2 = list2.size();
                                        while (i6 < size2) {
                                            VehicleTypeOption vehicleTypeOption = (VehicleTypeOption) list2.get(i6);
                                            Modifier weight2 = flowRowScope2.weight(1.0f, companion3, true);
                                            boolean areEqual2 = Intrinsics.areEqual(vehicleTypeOption, curbsidePickupCarViewModel2.selectedType);
                                            boolean changed5 = gapComposer7.changed(function14) | gapComposer7.changedInstance(vehicleTypeOption);
                                            Object rememberedValue10 = gapComposer7.rememberedValue();
                                            if (changed5 || rememberedValue10 == neverEqualPolicy2) {
                                                rememberedValue10 = new StatusRunnable$$ExternalSyntheticLambda1(20, function14, vehicleTypeOption);
                                                gapComposer7.updateRememberedValue(rememberedValue10);
                                            }
                                            CurbsidePickupCarSheetKt.VehicleChip(3072, gapComposer7, Expect_jvmKt.rememberComposableLambda(-2054596431, new HintHandler$$ExternalSyntheticLambda0(vehicleTypeOption, 22), gapComposer7), weight2, (Function0) rememberedValue10, areEqual2);
                                            i6++;
                                        }
                                    } else {
                                        gapComposer7.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer5), gapComposer5, MLKEMEngine.KyberPolyBytes);
                    SpacerKt.Spacer(gapComposer5, SizeKt.m277height3ABfNKs(companion, 24.0f));
                    final int i5 = 1;
                    CurbsidePickupCarSheetKt.VehicleChipSection(Room.stringResource(gapComposer5, R.string.local_views_vehicle_type_section_title), null, Expect_jvmKt.rememberComposableLambda(1157431007, new Function3() { // from class: app.cash.local.views.brand.checkout.CurbsidePickupCarSheetKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj11, Object obj12, Object obj13) {
                            int i52 = i5;
                            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                            int i6 = 0;
                            Function1 function14 = function13;
                            CurbsidePickupCarViewModel curbsidePickupCarViewModel2 = curbsidePickupCarViewModel;
                            switch (i52) {
                                case 0:
                                    FlowRowScope flowRowScope = (FlowRowScope) obj11;
                                    Composer composer7 = (Composer) obj12;
                                    int intValue6 = ((Integer) obj13).intValue();
                                    flowRowScope.getClass();
                                    if ((intValue6 & 6) == 0) {
                                        intValue6 |= ((GapComposer) composer7).changed(flowRowScope) ? 4 : 2;
                                    }
                                    GapComposer gapComposer6 = (GapComposer) composer7;
                                    if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                                        List list = curbsidePickupCarViewModel2.colorOptions;
                                        int size = list.size();
                                        while (i6 < size) {
                                            VehicleColorOption vehicleColorOption = (VehicleColorOption) list.get(i6);
                                            Modifier weight = flowRowScope.weight(1.0f, companion3, true);
                                            boolean areEqual = Intrinsics.areEqual(vehicleColorOption, curbsidePickupCarViewModel2.selectedColor);
                                            boolean changed4 = gapComposer6.changed(function14) | gapComposer6.changedInstance(vehicleColorOption);
                                            Object rememberedValue9 = gapComposer6.rememberedValue();
                                            if (changed4 || rememberedValue9 == neverEqualPolicy2) {
                                                rememberedValue9 = new StatusRunnable$$ExternalSyntheticLambda1(19, function14, vehicleColorOption);
                                                gapComposer6.updateRememberedValue(rememberedValue9);
                                            }
                                            CurbsidePickupCarSheetKt.VehicleChip(3072, gapComposer6, Expect_jvmKt.rememberComposableLambda(-1970477733, new HintHandler$$ExternalSyntheticLambda0(vehicleColorOption, 23), gapComposer6), weight, (Function0) rememberedValue9, areEqual);
                                            i6++;
                                        }
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    FlowRowScope flowRowScope2 = (FlowRowScope) obj11;
                                    Composer composer8 = (Composer) obj12;
                                    int intValue7 = ((Integer) obj13).intValue();
                                    flowRowScope2.getClass();
                                    if ((intValue7 & 6) == 0) {
                                        intValue7 |= ((GapComposer) composer8).changed(flowRowScope2) ? 4 : 2;
                                    }
                                    GapComposer gapComposer7 = (GapComposer) composer8;
                                    if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                                        List list2 = curbsidePickupCarViewModel2.typeOptions;
                                        int size2 = list2.size();
                                        while (i6 < size2) {
                                            VehicleTypeOption vehicleTypeOption = (VehicleTypeOption) list2.get(i6);
                                            Modifier weight2 = flowRowScope2.weight(1.0f, companion3, true);
                                            boolean areEqual2 = Intrinsics.areEqual(vehicleTypeOption, curbsidePickupCarViewModel2.selectedType);
                                            boolean changed5 = gapComposer7.changed(function14) | gapComposer7.changedInstance(vehicleTypeOption);
                                            Object rememberedValue10 = gapComposer7.rememberedValue();
                                            if (changed5 || rememberedValue10 == neverEqualPolicy2) {
                                                rememberedValue10 = new StatusRunnable$$ExternalSyntheticLambda1(20, function14, vehicleTypeOption);
                                                gapComposer7.updateRememberedValue(rememberedValue10);
                                            }
                                            CurbsidePickupCarSheetKt.VehicleChip(3072, gapComposer7, Expect_jvmKt.rememberComposableLambda(-2054596431, new HintHandler$$ExternalSyntheticLambda0(vehicleTypeOption, 22), gapComposer7), weight2, (Function0) rememberedValue10, areEqual2);
                                            i6++;
                                        }
                                    } else {
                                        gapComposer7.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer5), gapComposer5, MLKEMEngine.KyberPolyBytes);
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(Request$Priority$EnumUnboxingLocalUtility.m(companion, 24.0f, gapComposer5, companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer5, 0);
                    int hashCode3 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer5, m300paddingVpY3zN4$default);
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$13);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer5, composeUiNode$Companion$SetModifier$14, gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer5, materializeModifier4, composeUiNode$Companion$SetModifier$15);
                    String stringResource2 = Room.stringResource(gapComposer5, R.string.local_views_vehicle_note_section_title);
                    TextStyle textStyle = ((Typography) gapComposer5.consume(ArcadeThemeKt.LocalTypography)).labelSmall;
                    Colors colors2 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.prominent, (Composer) gapComposer5, (Modifier) null, textStyle, (TextLineBalancing) null, stringResource2, (Map) null, (Function1) null, false);
                    InputFieldKt.InputField(textFieldState3, Request$Priority$EnumUnboxingLocalUtility.m(companion, 16.0f, gapComposer5, companion, 1.0f), false, false, false, null, null, null, null, Room.stringResource(gapComposer5, R.string.local_views_vehicle_note_placeholder), null, null, null, null, null, null, gapComposer5, 48, 0, 65020);
                    Request$Priority$EnumUnboxingLocalUtility.m(gapComposer5, true, companion, 40.0f, gapComposer5);
                    boolean changed4 = gapComposer5.changed(function13) | gapComposer5.changed(textFieldState3);
                    Object rememberedValue9 = gapComposer5.rememberedValue();
                    if (changed4 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new CurbsidePickupCarSheetKt$$ExternalSyntheticLambda7(0, textFieldState3, function13);
                        gapComposer5.updateRememberedValue(rememberedValue9);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue9, SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), ButtonProminence.PROMINENT, false, (curbsidePickupCarViewModel.selectedColor == null || curbsidePickupCarViewModel.selectedType == null || (!curbsidePickupCarViewModel.hasSelectionChanges && Intrinsics.areEqual(textFieldState3.getValue$foundation().text.toString(), curbsidePickupCarViewModel.initialNote))) ? false : true, null, CheckoutTipSectionKt.lambda$1066122275, gapComposer5, 1573296, 40);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                LocalBrandLocationCartViewModel.Fulfillment fulfillment = (LocalBrandLocationCartViewModel.Fulfillment) obj7;
                LocalBrandLocationCheckoutViewModel localBrandLocationCheckoutViewModel = (LocalBrandLocationCheckoutViewModel) obj6;
                Function1 function14 = (Function1) obj5;
                Composer composer7 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer7;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    List list = localBrandLocationCheckoutViewModel.availableFulfillmentTypes;
                    boolean changed5 = gapComposer6.changed(function14);
                    Object rememberedValue10 = gapComposer6.rememberedValue();
                    if (changed5 || rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new DrawerKt$$ExternalSyntheticLambda1(function14, false, 6);
                        gapComposer6.updateRememberedValue(rememberedValue10);
                    }
                    Function0 function03 = (Function0) rememberedValue10;
                    boolean changed6 = gapComposer6.changed(function14);
                    Object rememberedValue11 = gapComposer6.rememberedValue();
                    if (changed6 || rememberedValue11 == neverEqualPolicy) {
                        rememberedValue11 = new DrawerKt$$ExternalSyntheticLambda1(function14, false, 7);
                        gapComposer6.updateRememberedValue(rememberedValue11);
                    }
                    Function0 function04 = (Function0) rememberedValue11;
                    boolean changed7 = gapComposer6.changed(function14);
                    Object rememberedValue12 = gapComposer6.rememberedValue();
                    if (changed7 || rememberedValue12 == neverEqualPolicy) {
                        rememberedValue12 = new DrawerKt$$ExternalSyntheticLambda1(function14, false, 8);
                        gapComposer6.updateRememberedValue(rememberedValue12);
                    }
                    Function0 function05 = (Function0) rememberedValue12;
                    boolean changed8 = gapComposer6.changed(function14);
                    Object rememberedValue13 = gapComposer6.rememberedValue();
                    if (changed8 || rememberedValue13 == neverEqualPolicy) {
                        rememberedValue13 = new DrawerKt$$ExternalSyntheticLambda1(function14, false, 9);
                        gapComposer6.updateRememberedValue(rememberedValue13);
                    }
                    Function0 function06 = (Function0) rememberedValue13;
                    boolean changed9 = gapComposer6.changed(function14);
                    Object rememberedValue14 = gapComposer6.rememberedValue();
                    if (changed9 || rememberedValue14 == neverEqualPolicy) {
                        rememberedValue14 = new GestureNodeKt$$ExternalSyntheticLambda0(13, function14);
                        gapComposer6.updateRememberedValue(rememberedValue14);
                    }
                    CheckoutFulfillmentSectionKt.CheckoutFulfillmentSection(m302paddingqDBjuR0$default2, fulfillment, list, function03, function04, function05, function06, (Function1) rememberedValue14, gapComposer6, 6);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                LazyGridState lazyGridState = (LazyGridState) obj7;
                LocalBrandLocationMenuViewModel localBrandLocationMenuViewModel = (LocalBrandLocationMenuViewModel) obj6;
                Function1 function15 = (Function1) obj5;
                ((Integer) obj3).getClass();
                ((CollapsingToolbarScaffoldScopeInstance) obj).getClass();
                Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                GridCells.Fixed fixed = new GridCells.Fixed(2);
                PaddingValuesImpl m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(12.0f, RecyclerView.DECELERATION_RATE, 12.0f, 16.0f, 2);
                Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(2.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                Arrangement$SpacedAligned arrangement$SpacedAligned2 = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                GapComposer gapComposer7 = (GapComposer) ((Composer) obj2);
                boolean changedInstance4 = gapComposer7.changedInstance(localBrandLocationMenuViewModel) | gapComposer7.changed(function15);
                Object rememberedValue15 = gapComposer7.rememberedValue();
                if (changedInstance4 || rememberedValue15 == neverEqualPolicy) {
                    rememberedValue15 = new RealBadger2$$ExternalSyntheticLambda0(15, localBrandLocationMenuViewModel, function15);
                    gapComposer7.updateRememberedValue(rememberedValue15);
                }
                LazyGridDslKt.LazyVerticalGrid(fixed, fillMaxSize, lazyGridState, m297PaddingValuesa9UjIt4$default, arrangement$SpacedAligned2, arrangement$SpacedAligned, null, false, null, (Function1) rememberedValue15, gapComposer7, 1772592, 912);
                return Unit.INSTANCE;
            case 7:
                LocalBrandLocationCartViewModel.Fulfillment fulfillment2 = (LocalBrandLocationCartViewModel.Fulfillment) obj7;
                LocalBrandLocationCartViewModel localBrandLocationCartViewModel = (LocalBrandLocationCartViewModel) obj6;
                Function1 function16 = (Function1) obj5;
                Composer composer8 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    LocalBrandLocationCartViewKt.FulfillmentSectionItem(fulfillment2, localBrandLocationCartViewModel.availableFulfillmentTypes, function16, gapComposer8, 0);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                LocalBrandLocationCartViewModel.Fulfillment fulfillment3 = (LocalBrandLocationCartViewModel.Fulfillment) obj7;
                LocalFulfillment.SchedulingDetails.SchedulingMode schedulingMode = (LocalFulfillment.SchedulingDetails.SchedulingMode) obj6;
                Function1 function17 = (Function1) obj5;
                Composer composer9 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer9, 0);
                GapComposer gapComposer9 = (GapComposer) composer9;
                int hashCode4 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer9.currentCompositionLocalScope();
                Modifier materializeModifier5 = PlatformKt.materializeModifier(composer9, fillMaxWidth3);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer10 = (GapComposer) composer9;
                if (gapComposer10.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer10.startReusableNode();
                if (gapComposer10.inserting) {
                    gapComposer10.createNode(layoutNode$Companion$Constructor$14);
                } else {
                    gapComposer10.useNode();
                }
                Updater.m576setimpl(composer9, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer9, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer9, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer9, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer9, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                SpacerKt.Spacer(composer9, SizeKt.m277height3ABfNKs(companion, 16.0f));
                if (fulfillment3.getCanFulfillAsap()) {
                    gapComposer10.startReplaceGroup(-858314194);
                    Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion, 1.0f);
                    String stringResource3 = Room.stringResource(composer9, R.string.local_views_asap);
                    LocalText estimatedCompletionAsap = fulfillment3.getEstimatedCompletionAsap();
                    boolean z8 = schedulingMode == LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_ASAP;
                    boolean changed10 = gapComposer10.changed(function17);
                    Object rememberedValue16 = gapComposer10.rememberedValue();
                    if (changed10 || rememberedValue16 == neverEqualPolicy) {
                        rememberedValue16 = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(27, function17);
                        gapComposer10.updateRememberedValue(rememberedValue16);
                    }
                    FulfillmentRadioCellKt.FulfillmentRadioCell(fillMaxWidth4, stringResource3, estimatedCompletionAsap, null, z8, null, (Function0) rememberedValue16, composer9, 6, 40);
                    composer = composer9;
                    gapComposer10.end(false);
                } else {
                    composer = composer9;
                    gapComposer10.startReplaceGroup(-857970156);
                    gapComposer10.end(false);
                }
                Modifier fillMaxWidth5 = SizeKt.fillMaxWidth(companion, 1.0f);
                String stringResource4 = Room.stringResource(composer, R.string.local_views_later);
                LocalText estimatedCompletionScheduled = fulfillment3.getEstimatedCompletionScheduled();
                if (estimatedCompletionScheduled == null) {
                    gapComposer10.startReplaceGroup(-1413140613);
                    estimatedCompletionScheduled = LocalTextsKt.toLocalText(Room.stringResource(composer, R.string.local_views_schedule_this_order));
                    z4 = false;
                } else {
                    z4 = false;
                    gapComposer10.startReplaceGroup(-1413144178);
                }
                gapComposer10.end(z4);
                LocalText localText = estimatedCompletionScheduled;
                String stringResource5 = Room.stringResource(composer, R.string.local_views_schedule_this_order_change);
                LocalFulfillment.SchedulingDetails.SchedulingMode schedulingMode2 = LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_SCHEDULED;
                String str5 = schedulingMode == schedulingMode2 ? stringResource5 : null;
                boolean z9 = schedulingMode == schedulingMode2;
                boolean changed11 = gapComposer10.changed(function17);
                Object rememberedValue17 = gapComposer10.rememberedValue();
                if (changed11 || rememberedValue17 == neverEqualPolicy) {
                    rememberedValue17 = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(28, function17);
                    gapComposer10.updateRememberedValue(rememberedValue17);
                }
                FulfillmentRadioCellKt.FulfillmentRadioCell(fillMaxWidth5, stringResource4, localText, str5, z9, null, (Function0) rememberedValue17, composer, 6, 32);
                gapComposer10.end(true);
                return Unit.INSTANCE;
            case 9:
                TextFieldState textFieldState4 = (TextFieldState) obj7;
                SearchBarKeyboardState searchBarKeyboardState = (SearchBarKeyboardState) obj6;
                Function1 function18 = (Function1) obj5;
                Composer composer10 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((LazyGridItemScopeImpl) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer10;
                if (gapComposer11.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    String stringResource6 = Room.stringResource(gapComposer11, R.string.local_views_search_brands);
                    ShowNavigationBack showNavigationBack = ShowNavigationBack.Never;
                    boolean changed12 = gapComposer11.changed(function18);
                    Object rememberedValue18 = gapComposer11.rememberedValue();
                    if (changed12 || rememberedValue18 == neverEqualPolicy) {
                        rememberedValue18 = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(5, function18);
                        gapComposer11.updateRememberedValue(rememberedValue18);
                    }
                    SearchBarKt.SearchBar(textFieldState4, stringResource6, searchBarKeyboardState, Modifier.Companion.$$INSTANCE, null, showNavigationBack, (Function0) rememberedValue18, null, null, null, true, null, gapComposer11, 199680, 6, 7056);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                CollapsingToolbarScaffoldState collapsingToolbarScaffoldState = (CollapsingToolbarScaffoldState) obj7;
                ComposableLambdaImpl composableLambdaImpl3 = (ComposableLambdaImpl) obj6;
                ComposableLambdaImpl composableLambdaImpl4 = (ComposableLambdaImpl) obj5;
                Composer composer11 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((CollapsingToolbarScopeInstance) obj).getClass();
                float intValue9 = collapsingToolbarScaffoldState.toolbarState.minHeightState$delegate.getIntValue();
                CollapsingToolbarState collapsingToolbarState = collapsingToolbarScaffoldState.toolbarState;
                float intValue10 = collapsingToolbarState.maxHeightState$delegate.getIntValue();
                float intValue11 = collapsingToolbarState.height$delegate.getIntValue();
                float f3 = intValue9 * 3.0f;
                boolean z10 = intValue10 >= f3;
                float f4 = z10 ? intValue9 * 2.0f : (intValue10 * 2.0f) / 3.0f;
                if (!z10) {
                    f3 = intValue10;
                }
                float coerceIn = RangesKt___RangesKt.coerceIn((intValue11 - f4) / (f3 - f4), RecyclerView.DECELERATION_RATE, 1.0f);
                if (intValue9 > RecyclerView.DECELERATION_RATE) {
                    float f5 = z10 ? 2.5f * intValue9 : (intValue10 * 5.0f) / 6.0f;
                    f2 = RangesKt___RangesKt.coerceIn((intValue11 - f5) / (intValue9 - f5), RecyclerView.DECELERATION_RATE, 1.0f);
                }
                Modifier road = CollapsingToolbarScopeInstance.road(AlphaKt.alpha(companion, coerceIn));
                BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                GapComposer gapComposer12 = (GapComposer) composer11;
                int hashCode5 = Long.hashCode(gapComposer12.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer12.currentCompositionLocalScope();
                Modifier materializeModifier6 = PlatformKt.materializeModifier(composer11, road);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer13 = (GapComposer) composer11;
                if (gapComposer13.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer13.startReusableNode();
                if (gapComposer13.inserting) {
                    gapComposer13.createNode(layoutNode$Companion$Constructor$15);
                } else {
                    gapComposer13.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(composer11, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$16);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(composer11, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$17);
                Integer valueOf3 = Integer.valueOf(hashCode5);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(composer11, valueOf3, composeUiNode$Companion$SetModifier$18);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(composer11, ownerSnapshotObserver$onCommitAffectingLayout$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(composer11, materializeModifier6, composeUiNode$Companion$SetModifier$19);
                composableLambdaImpl3.invoke((Object) composer11, (Object) 0);
                gapComposer13.end(true);
                wrapContentHeight = SizeKt.wrapContentHeight(companion, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                float f6 = f2;
                int hashCode6 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer13.currentCompositionLocalScope();
                Modifier materializeModifier7 = PlatformKt.materializeModifier(composer11, wrapContentHeight);
                gapComposer13.startReusableNode();
                if (gapComposer13.inserting) {
                    gapComposer13.createNode(layoutNode$Companion$Constructor$15);
                } else {
                    gapComposer13.useNode();
                }
                Updater.m576setimpl(composer11, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$16);
                Updater.m576setimpl(composer11, currentCompositionLocalScope7, composeUiNode$Companion$SetModifier$17);
                Request$Priority$EnumUnboxingLocalUtility.m(hashCode6, composer11, composeUiNode$Companion$SetModifier$18, composer11, ownerSnapshotObserver$onCommitAffectingLayout$12);
                Updater.m576setimpl(composer11, materializeModifier7, composeUiNode$Companion$SetModifier$19);
                composableLambdaImpl4.invoke((Object) Float.valueOf(f6), (Object) Float.valueOf(coerceIn), (Object) composer11, (Object) 0);
                gapComposer13.end(true);
                return Unit.INSTANCE;
            case 11:
                return invoke$app$cash$local$views$map$BrandCollectionSheetViewKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 12:
                return invoke$app$cash$local$views$pos$LocalPosCheckInViewKt$$ExternalSyntheticLambda0(obj, obj2, obj3);
            case 13:
                EducationalSheetModelList educationalSheetModelList = (EducationalSheetModelList) obj7;
                Function1 function19 = (Function1) obj5;
                RealSheetState realSheetState = (RealSheetState) obj6;
                PaddingValues paddingValues2 = (PaddingValues) obj;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                paddingValues2.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer12).changed(paddingValues2) ? 4 : 2;
                }
                boolean z11 = (intValue12 & 19) != 18;
                int i6 = intValue12 & 1;
                GapComposer gapComposer14 = (GapComposer) composer12;
                if (!gapComposer14.shouldExecute(i6, z11)) {
                    gapComposer14.skipToGroupEnd();
                } else if (educationalSheetModelList == null) {
                    gapComposer14.startReplaceGroup(-1782727891);
                    Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(SpacerKt.padding(companion, paddingValues2), 1.0f), 500.0f, RecyclerView.DECELERATION_RATE, 2);
                    MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode7 = Long.hashCode(gapComposer14.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope8 = gapComposer14.currentCompositionLocalScope();
                    Modifier materializeModifier8 = PlatformKt.materializeModifier(gapComposer14, m279heightInVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$16 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer14.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer14.startReusableNode();
                    if (gapComposer14.inserting) {
                        gapComposer14.createNode(layoutNode$Companion$Constructor$16);
                    } else {
                        gapComposer14.useNode();
                    }
                    Updater.m576setimpl(gapComposer14, maybeCachedBoxMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer14, currentCompositionLocalScope8, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer14, Integer.valueOf(hashCode7), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer14, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer14, materializeModifier8, ComposeUiNode.Companion.SetModifier);
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer14, null);
                    gapComposer14.end(true);
                    gapComposer14.end(false);
                } else {
                    gapComposer14.startReplaceGroup(-1782496724);
                    Modifier padding2 = SpacerKt.padding(companion, paddingValues2);
                    BiasAlignment biasAlignment2 = Alignment.Companion.CenterStart;
                    Object rememberedValue19 = gapComposer14.rememberedValue();
                    if (rememberedValue19 == neverEqualPolicy) {
                        rememberedValue19 = new Yoga$$ExternalSyntheticLambda0(19);
                        gapComposer14.updateRememberedValue(rememberedValue19);
                    }
                    Function1 function110 = (Function1) rememberedValue19;
                    Object rememberedValue20 = gapComposer14.rememberedValue();
                    if (rememberedValue20 == neverEqualPolicy) {
                        rememberedValue20 = new Yoga$$ExternalSyntheticLambda0(20);
                        gapComposer14.updateRememberedValue(rememberedValue20);
                    }
                    AnimatedContentKt.AnimatedContent(educationalSheetModelList, padding2, function110, biasAlignment2, null, (Function1) rememberedValue20, Expect_jvmKt.rememberComposableLambda(1509166416, new LocalViewFactory$$ExternalSyntheticLambda4(function19, realSheetState), gapComposer14), gapComposer14, 1772928, 16);
                    gapComposer14.end(false);
                }
                return Unit.INSTANCE;
            case 14:
                return invoke$app$cash$local$views$wallet$LocalBrandCollectionWidgetKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 15:
                return invoke$app$cash$local$views$wallet$TabContentViewKt$$ExternalSyntheticLambda3(obj, obj2, obj3);
            case 16:
                return invoke$com$squareup$cash$account$components$AccountUiViewKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 17:
                return invoke$com$squareup$cash$activity$views$ActivityItemViewKt$$ExternalSyntheticLambda31(obj, obj2, obj3);
            case 18:
                return invoke$com$squareup$cash$activity$views$ActivityTabViewKt$$ExternalSyntheticLambda29(obj, obj2, obj3);
            case 19:
                return invoke$com$squareup$cash$activity$views$ActivityTabViewKt$$ExternalSyntheticLambda40(obj, obj2, obj3);
            case 20:
                return invoke$com$squareup$cash$afterpayapplet$views$AfterpayAppletPurchasesEmbeddedViewKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 21:
                return invoke$com$squareup$cash$afterpayapplet$views$AfterpaySearchViewKt$$ExternalSyntheticLambda13(obj, obj2, obj3);
            case 22:
                return invoke$com$squareup$cash$afterpayapplet$views$AfterpaySearchViewKt$$ExternalSyntheticLambda15(obj, obj2, obj3);
            case 23:
                return invoke$com$squareup$cash$afterpayapplet$views$AfterpaySearchViewKt$$ExternalSyntheticLambda23(obj, obj2, obj3);
            case 24:
                return invoke$com$squareup$cash$afterpayapplet$views$AfterpaySearchViewKt$$ExternalSyntheticLambda28(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$agents$applets$views$AgentsAppletTile$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$agents$applets$views$AgentsHomeViewKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$amountchooser$views$AtmPickerGridKt$$ExternalSyntheticLambda1(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$appmessages$views$InlineAppMessageKt$$ExternalSyntheticLambda0(obj, obj2, obj3);
            default:
                Badge badge = (Badge) obj7;
                BadgePlacement badgePlacement = (BadgePlacement) obj6;
                ComposableLambdaImpl composableLambdaImpl5 = (ComposableLambdaImpl) obj5;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer13;
                if (gapComposer15.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    Room.BadgeAssetLayout(badge, badgePlacement, null, false, Expect_jvmKt.rememberComposableLambda(-965488041, new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl5, i2), gapComposer15), gapComposer15, 27648, 4);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ LocalViewFactory$$ExternalSyntheticLambda6(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ LocalViewFactory$$ExternalSyntheticLambda6(Object obj, Function1 function1, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = function1;
        this.f$1 = obj2;
    }

    public /* synthetic */ LocalViewFactory$$ExternalSyntheticLambda6(Function1 function1, TextFieldState textFieldState, CurbsidePickupCarViewModel curbsidePickupCarViewModel) {
        this.$r8$classId = 4;
        this.f$2 = function1;
        this.f$0 = textFieldState;
        this.f$1 = curbsidePickupCarViewModel;
    }

    public /* synthetic */ LocalViewFactory$$ExternalSyntheticLambda6(Function1 function1, AfterpaySearchViewModel.FilterBottomSheetViewModel filterBottomSheetViewModel, MutableState mutableState) {
        this.$r8$classId = 24;
        this.f$2 = function1;
        this.f$0 = filterBottomSheetViewModel;
        this.f$1 = mutableState;
    }
}
