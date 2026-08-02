package app.cash.local.views.brand.menu;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.material.IconKt$$ExternalSyntheticLambda0;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda1;
import androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda3;
import androidx.compose.material.TextKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda8;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import app.cash.broadway.ui.compose.FullScreenKt$$ExternalSyntheticLambda0;
import app.cash.local.primitives.MenuCategoryToken;
import app.cash.local.primitives.MenuDiscountSummary;
import app.cash.local.primitives.MenuHours;
import app.cash.local.primitives.MenuItemPreorderingSummary;
import app.cash.local.viewmodels.CartItemCounterViewModel;
import app.cash.local.viewmodels.LocalBottomModalViewModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewModel;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewModel;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewEvent;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewModel;
import app.cash.local.viewmodels.MenuItemAvailability;
import app.cash.local.viewmodels.internal.MenuSelectorOption;
import app.cash.local.viewmodels.toasts.ToastData;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda4;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda17;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda3;
import app.cash.local.views.internal.ExpandableSectionHeaderData;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda3;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda9;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.local.views.internal.LocalViewsKt$$ExternalSyntheticLambda2;
import app.cash.local.views.internal.ProgressBarKt;
import app.cash.local.views.internal.menus.LocalMenuCardKt;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import bo.app.l2$$ExternalSyntheticLambda7;
import bo.app.n$$ExternalSyntheticLambda1;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader$execute$2;
import coil3.RealImageLoader$execute$result$1;
import coil3.intercept.EngineInterceptor$intercept$2;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.ShowNavigationBack;
import com.squareup.cash.arcade.components.input.InputAreaKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.bitcoin.views.map.BitcoinLocationViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.blockers.views.SetPinViewKt$SetPin$3$1$1$1;
import com.squareup.cash.blockers.views.SsnViewKt$SsnContent$3$1$1;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarKt;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScopeInstance;
import com.squareup.cash.collapsingtoolbar.views.ScrollStrategy;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.globalsearch.views.GlobalSearchViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.components.ArcadeBordersKt$$ExternalSyntheticLambda0;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda8;
import com.squareup.cash.music.views.TrackRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.taptopay.views.TapToPayInitiatorNotesKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.widget.amount.AmountDisplayKt$AmountDisplay$1$1;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class LocalCaloriesTextKt {

    /* renamed from: lambda$-1959144146, reason: not valid java name */
    public static final ComposableLambdaImpl f31lambda$1959144146 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(25), false, -1959144146);
    public static final ComposableLambdaImpl lambda$1712296728 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(26), false, 1712296728);

    public static final void CategoryChipsHeader(CollapsingToolbarScopeInstance collapsingToolbarScopeInstance, final Function0 function0, int i, LazyListState lazyListState, List list, Function1 function1, Composer composer, int i2) {
        CollapsingToolbarScopeInstance collapsingToolbarScopeInstance2;
        int i3;
        LazyListState lazyListState2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-653373980);
        if ((i2 & 6) == 0) {
            collapsingToolbarScopeInstance2 = collapsingToolbarScopeInstance;
            i3 = (gapComposer2.changedInstance(collapsingToolbarScopeInstance2) ? 4 : 2) | i2;
        } else {
            collapsingToolbarScopeInstance2 = collapsingToolbarScopeInstance;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= gapComposer2.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            lazyListState2 = lazyListState;
            i3 |= gapComposer2.changed(lazyListState2) ? 2048 : 1024;
        } else {
            lazyListState2 = lazyListState;
        }
        if ((i2 & 24576) == 0) {
            i3 |= gapComposer2.changedInstance(list) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i2) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new PaddingValues() { // from class: app.cash.local.views.brand.menu.LocalBrandLocationMenuViewKt$CategoryChipsHeader$contentPadding$1$1
                    @Override // androidx.compose.foundation.layout.PaddingValues
                    /* renamed from: calculateBottomPadding-D9Ej5fM */
                    public final float mo264calculateBottomPaddingD9Ej5fM() {
                        return 12.0f;
                    }

                    @Override // androidx.compose.foundation.layout.PaddingValues
                    /* renamed from: calculateLeftPadding-u2uoSUM */
                    public final float mo265calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
                        layoutDirection.getClass();
                        return ((Number) Function0.this.invoke()).floatValue() * 16.0f;
                    }

                    @Override // androidx.compose.foundation.layout.PaddingValues
                    /* renamed from: calculateRightPadding-u2uoSUM */
                    public final float mo266calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
                        layoutDirection.getClass();
                        return ((Number) Function0.this.invoke()).floatValue() * 16.0f;
                    }

                    @Override // androidx.compose.foundation.layout.PaddingValues
                    /* renamed from: calculateTopPadding-D9Ej5fM */
                    public final float mo267calculateTopPaddingD9Ej5fM() {
                        return 72.0f;
                    }
                };
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            LocalBrandLocationMenuViewKt$CategoryChipsHeader$contentPadding$1$1 localBrandLocationMenuViewKt$CategoryChipsHeader$contentPadding$1$1 = (LocalBrandLocationMenuViewKt$CategoryChipsHeader$contentPadding$1$1) rememberedValue;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            collapsingToolbarScopeInstance2.getClass();
            Modifier road = CollapsingToolbarScopeInstance.road(fillMaxWidth);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            int i5 = 3;
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new DismissableToastKt$$ExternalSyntheticLambda3(i5, function0);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Modifier layout = ValueInsets.layout(road, (Function3) rememberedValue2);
            boolean z2 = i4 == 32;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new LocalMapKt$$ExternalSyntheticLambda10(7, function0);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(layout, (Function1) rememberedValue3);
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(6.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            boolean changedInstance = gapComposer2.changedInstance(list) | ((i3 & 896) == 256) | ((458752 & i3) == 131072);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new PoolGoalMetKt$$ExternalSyntheticLambda6(list, i, function1, 3);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            gapComposer = gapComposer2;
            LazyDslKt.LazyRow(graphicsLayer, lazyListState2, localBrandLocationMenuViewKt$CategoryChipsHeader$contentPadding$1$1, arrangement$SpacedAligned, null, null, false, null, (Function1) rememberedValue4, gapComposer, ((i3 >> 6) & 112) | 24960, 488);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3(collapsingToolbarScopeInstance2, function0, i, lazyListState, list, function1, i2);
        }
    }

    public static final void CategorySearchBar(CollapsingToolbarScopeInstance collapsingToolbarScopeInstance, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1507511367);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE("", 0L, gapComposer, 6, 2);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue;
            SearchBarKeyboardState rememberSearchBarKeyboardState = SearchBarKt.rememberSearchBarKeyboardState(true, gapComposer);
            Unit unit = Unit.INSTANCE;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SsnViewKt$SsnContent$3$1$1(focusRequester, null, 1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
            SearchBarKt.SearchBar(m382rememberTextFieldStateLepunE, Room.stringResource(gapComposer, R.string.local_views_search_items), rememberSearchBarKeyboardState, SpacerKt.m302paddingqDBjuR0$default(FocusTraversalKt.focusRequester(Modifier.Companion.$$INSTANCE, focusRequester), 8.0f, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12), null, ShowNavigationBack.Always, function0, null, null, null, true, null, gapComposer, ((i2 << 12) & 3670016) | 196608, 6, 7056);
            gapComposer = gapComposer;
            boolean changed = gapComposer.changed(m382rememberTextFieldStateLepunE) | ((i2 & 112) == 32);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new SetPinViewKt$SetPin$3$1$1$1(m382rememberTextFieldStateLepunE, function1, null, 1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, m382rememberTextFieldStateLepunE, (Function2) rememberedValue3);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8(collapsingToolbarScopeInstance, function1, function0, i, 17);
        }
    }

    public static final void ComboSlotOptionAvailability(LocalMenuComboDetailsViewModel.ComboSlotOption.OptionAvailability optionAvailability, Composer composer, int i) {
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-396079040);
        int i2 = i | (gapComposer.changedInstance(optionAvailability) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            boolean z2 = optionAvailability instanceof LocalMenuComboDetailsViewModel.ComboSlotOption.OptionAvailability.Available;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z2) {
                gapComposer.startReplaceGroup(-1315343686);
                String str = ((LocalMenuComboDetailsViewModel.ComboSlotOption.OptionAvailability.Available) optionAvailability).priceAdjustment;
                if (str == null) {
                    gapComposer.startReplaceGroup(-1315343687);
                    gapComposer.end(false);
                    z = false;
                } else {
                    gapComposer.startReplaceGroup(-1315343686);
                    SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 12.0f));
                    TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    z = false;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    gapComposer.end(false);
                }
                gapComposer.end(z);
            } else {
                if (!(optionAvailability instanceof LocalMenuComboDetailsViewModel.ComboSlotOption.OptionAvailability.SoldOut)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1620134767, false);
                }
                gapComposer.startReplaceGroup(-1315069522);
                SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 12.0f));
                String stringResource = Room.stringResource(gapComposer, R.string.local_views_sold_out);
                TextStyle textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.warning, (Composer) gapComposer, (Modifier) null, textStyle2, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HintHandler$$ExternalSyntheticLambda0(optionAvailability, i, 27);
        }
    }

    public static final void ComboSlotOptionImage(LocalImage localImage, Composer composer, int i) {
        String themedUrl;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-403471110);
        int i2 = (gapComposer.changedInstance(localImage) ? 4 : 2) | i;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier clip = ClipKt.clip(Modifier.Companion.$$INSTANCE, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f));
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(ImageKt.m177backgroundbw27NRU(clip, colors.semantic.background.subtle, ColorKt.RectangleShape), 46.0f);
            if (localImage == null) {
                gapComposer.startReplaceGroup(1805907486);
                gapComposer.end(false);
                themedUrl = null;
            } else {
                gapComposer.startReplaceGroup(-1188670909);
                themedUrl = LocalViewsKt.getThemedUrl(localImage, gapComposer);
                gapComposer.end(false);
            }
            LocalMapKt.LocalAsyncImage(m285size3ABfNKs, null, themedUrl, ContentScale.Companion.FillBounds, null, null, lambda$1712296728, gapComposer, 1575936, 50);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalViewsKt$$ExternalSyntheticLambda2(localImage, i, i3);
        }
    }

    public static final void ComboSlotOptionTrailingAccessory(boolean z, LocalMenuComboDetailsViewModel.ComboSlotOption.OptionType optionType, Function0 function0, Composer composer, int i) {
        Painter painter;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1109225094);
        int i2 = i | (gapComposer.changed(z) ? 4 : 2) | (gapComposer.changedInstance(optionType) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (optionType instanceof LocalMenuComboDetailsViewModel.ComboSlotOption.OptionType.Radio) {
            gapComposer.startReplaceGroup(-553454709);
            LocalMapKt.LocalRadio(((LocalMenuComboDetailsViewModel.ComboSlotOption.OptionType.Radio) optionType).selected, null, null, z, function0, gapComposer, ((i2 << 9) & 7168) | ((i2 << 6) & 57344), 6);
            gapComposer.end(false);
        } else {
            if (!(optionType instanceof LocalMenuComboDetailsViewModel.ComboSlotOption.OptionType.Customize)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 813430431, false);
            }
            gapComposer.startReplaceGroup(-553327919);
            gapComposer.startReplaceGroup(813436038);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 24.0f);
            boolean z2 = ((LocalMenuComboDetailsViewModel.ComboSlotOption.OptionType.Customize) optionType).selected;
            if (!z2) {
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                m285size3ABfNKs = m285size3ABfNKs.then(SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.standard, RoundedCornerShapeKt.CircleShape), 5.0f));
            }
            Modifier modifier = m285size3ABfNKs;
            gapComposer.end(false);
            if (z2) {
                gapComposer.startReplaceGroup(-553021205);
                painter = Icons.Check24.painter(gapComposer);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-552966707);
                painter = Icons.Add16.painter(gapComposer);
                gapComposer.end(false);
            }
            if (z) {
                gapComposer.startReplaceGroup(-552806251);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.icon.standard;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-552729867);
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors3.semantic.icon.disabled;
                gapComposer.end(false);
            }
            ImageKt.Image(painter, null, modifier, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 48, 56);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(i, 1, optionType, function0, z);
        }
    }

    public static final void ComboSlotOptionView(LocalMenuComboDetailsViewModel.ComboSlot comboSlot, LocalMenuComboDetailsViewModel.ComboSlotOption comboSlotOption, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        long j;
        long j2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1622788780);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(comboSlot) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(comboSlotOption) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            LocalMenuComboDetailsViewModel.ComboSlotOption.OptionAvailability optionAvailability = comboSlotOption.availability;
            LocalMenuComboDetailsViewModel.ComboSlotOption.OptionType optionType = comboSlotOption.f920type;
            boolean z = optionAvailability instanceof LocalMenuComboDetailsViewModel.ComboSlotOption.OptionAvailability.SoldOut;
            boolean z2 = (z || ((optionType instanceof LocalMenuComboDetailsViewModel.ComboSlotOption.OptionType.Customize) && ((LocalMenuComboDetailsViewModel.ComboSlotOption.OptionType.Customize) optionType).selected)) ? false : true;
            int i3 = i2 & 896;
            boolean changedInstance = (i3 == 256) | gapComposer2.changedInstance(comboSlot) | gapComposer2.changedInstance(comboSlotOption);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new n$$ExternalSyntheticLambda1(18, function1, comboSlot, comboSlotOption);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(SpacerKt.m298padding3ABfNKs(companion, 4.0f), 1.0f);
            Strings.getSizes(gapComposer2).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier clip = ClipKt.clip(fillMaxWidth2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m182clickableO2vRcR0$default(clip, (MutableInteractionSourceImpl) rememberedValue2, RippleKt.m3400rippleYJYuY3k(0L, true, RecyclerView.DECELERATION_RATE, null, gapComposer2, 48, 13), z2, null, null, function0, 24), 12.0f, 16.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m299paddingVpY3zN4);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ComboSlotOptionImage(comboSlotOption.image, gapComposer2, 0);
            SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, 16.0f));
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Center, horizontal, gapComposer2, 6);
            int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, layoutWeightElement);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            String str = comboSlotOption.title;
            TextStyle textStyle = Strings.getTypography(gapComposer2).bodySmall;
            if (z) {
                gapComposer2.startReplaceGroup(-1522573249);
                j = Strings.getColors(gapComposer2).semantic.text.disabled;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-1522496865);
                j = Strings.getColors(gapComposer2).semantic.text.standard;
                gapComposer2.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer2, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            String str2 = comboSlotOption.subtitle;
            if (str2 == null) {
                gapComposer.startReplaceGroup(-1522379004);
                gapComposer.end(false);
            } else {
                re$$ExternalSyntheticOutline0.m(gapComposer, -1522379003, companion, 2.0f, gapComposer);
                TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodySmall, 0L, Room.getSp(12), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213);
                if (z) {
                    gapComposer.startReplaceGroup(825125565);
                    j2 = Strings.getColors(gapComposer).semantic.text.disabled;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(825205855);
                    j2 = Strings.getColors(gapComposer).semantic.text.subtle;
                    gapComposer.end(false);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j2, (Composer) gapComposer, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            gapComposer.end(true);
            ComboSlotOptionAvailability(comboSlotOption.availability, gapComposer, 0);
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 12.0f));
            ComboSlotOptionTrailingAccessory(!z, optionType, function0, gapComposer, 0);
            gapComposer.end(true);
            if ((optionType instanceof LocalMenuComboDetailsViewModel.ComboSlotOption.OptionType.Customize) && ((LocalMenuComboDetailsViewModel.ComboSlotOption.OptionType.Customize) optionType).selected) {
                gapComposer.startReplaceGroup(1520944136);
                Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
                boolean changedInstance2 = gapComposer.changedInstance(comboSlot) | (i3 == 256);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new StatusRunnable$$ExternalSyntheticLambda1(22, function1, comboSlot);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                coil3.size.SizeKt.Button((Function0) rememberedValue3, fillMaxWidth3, null, false, false, null, f31lambda$1959144146, gapComposer, 1572912, 60);
                re$$ExternalSyntheticOutline0.m(companion, 12.0f, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(1521224748);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8((Object) comboSlot, (Object) comboSlotOption, function1, i, 18);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0248  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ComboSlotSection(Modifier modifier, LocalMenuComboDetailsViewModel.ComboSlot comboSlot, Function1 function1, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer;
        LocalMenuComboDetailsViewModel.ComboSlot comboSlot2;
        long j;
        int ordinal;
        long j2;
        int size;
        int i2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1430158235);
        Applier applier = gapComposer2.applier;
        int i3 = i | (gapComposer2.changed(modifier) ? 4 : 2) | (gapComposer2.changedInstance(comboSlot) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer2, 48);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier weight = rowScopeInstance.weight(1.0f, companion, true);
            String str = comboSlot.name;
            LocalMenuComboDetailsViewModel.ComboSlot.ValidationStatus validationStatus = comboSlot.validationStatus;
            gapComposer = gapComposer2;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer2).semantic.text.prominent, (Composer) gapComposer, weight, Strings.getTypography(gapComposer2).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, true, companion, 4.0f, gapComposer);
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 48);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            Modifier weight2 = rowScopeInstance.weight(1.0f, companion, true);
            comboSlot2 = comboSlot;
            String str2 = comboSlot2.subtitleLeading;
            int ordinal2 = validationStatus.ordinal();
            if (ordinal2 != 0 && ordinal2 != 1) {
                if (ordinal2 == 2) {
                    gapComposer.startReplaceGroup(-295337861);
                    j = Strings.getColors(gapComposer).semantic.text.warning;
                    gapComposer.end(false);
                    m1310ComboSlotSubtitleTextuDo3WH8(weight2, str2, j, false, gapComposer, 6, 8);
                    SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 12.0f));
                    String str3 = comboSlot2.subtitleTrailing;
                    ordinal = validationStatus.ordinal();
                    if (ordinal != 0 || ordinal == 1) {
                        gapComposer.startReplaceGroup(-295328326);
                        j2 = Strings.getColors(gapComposer).semantic.text.subtle;
                        gapComposer.end(false);
                    } else if (ordinal == 2) {
                        gapComposer.startReplaceGroup(-295326021);
                        j2 = Strings.getColors(gapComposer).semantic.text.warning;
                        gapComposer.end(false);
                    } else {
                        if (ordinal != 3) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -295332143, false);
                        }
                        gapComposer.startReplaceGroup(-295323909);
                        j2 = Strings.getColors(gapComposer).semantic.text.success;
                        gapComposer.end(false);
                    }
                    m1310ComboSlotSubtitleTextuDo3WH8(null, str3, j2, validationStatus != LocalMenuComboDetailsViewModel.ComboSlot.ValidationStatus.MissingSelection, gapComposer, 6, 1);
                    Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, true, companion, 12.0f, gapComposer);
                    gapComposer.startReplaceGroup(-1953824912);
                    ArrayList arrayList = comboSlot2.options;
                    size = arrayList.size();
                    for (i2 = 0; i2 < size; i2++) {
                        LocalMenuComboDetailsViewModel.ComboSlotOption comboSlotOption = (LocalMenuComboDetailsViewModel.ComboSlotOption) arrayList.get(i2);
                        if (i2 > 0) {
                            gapComposer.startReplaceGroup(99457985);
                            ModalKt.HorizontalDivider(6, 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(99538709);
                            gapComposer.end(false);
                        }
                        ComboSlotOptionView(comboSlot2, comboSlotOption, function1, gapComposer, ((i3 >> 3) & 14) | (i3 & 896));
                    }
                    function12 = function1;
                    gapComposer.end(false);
                    gapComposer.end(true);
                } else if (ordinal2 != 3) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -295344762, false);
                }
            }
            gapComposer.startReplaceGroup(-295340166);
            j = Strings.getColors(gapComposer).semantic.text.subtle;
            gapComposer.end(false);
            m1310ComboSlotSubtitleTextuDo3WH8(weight2, str2, j, false, gapComposer, 6, 8);
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 12.0f));
            String str32 = comboSlot2.subtitleTrailing;
            ordinal = validationStatus.ordinal();
            if (ordinal != 0) {
            }
            gapComposer.startReplaceGroup(-295328326);
            j2 = Strings.getColors(gapComposer).semantic.text.subtle;
            gapComposer.end(false);
            m1310ComboSlotSubtitleTextuDo3WH8(null, str32, j2, validationStatus != LocalMenuComboDetailsViewModel.ComboSlot.ValidationStatus.MissingSelection, gapComposer, 6, 1);
            Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, true, companion, 12.0f, gapComposer);
            gapComposer.startReplaceGroup(-1953824912);
            ArrayList arrayList2 = comboSlot2.options;
            size = arrayList2.size();
            while (i2 < size) {
            }
            function12 = function1;
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer = gapComposer2;
            comboSlot2 = comboSlot;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuKt$$ExternalSyntheticLambda1(modifier, comboSlot2, function12, i, 19);
        }
    }

    /* renamed from: ComboSlotSubtitleText-uDo3WH8, reason: not valid java name */
    public static final void m1310ComboSlotSubtitleTextuDo3WH8(Modifier modifier, String str, long j, boolean z, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        int i4;
        GapComposer gapComposer;
        Modifier modifier3;
        boolean z3;
        GapComposer gapComposer2;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(7484078);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 48;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i | (gapComposer3.changed(modifier2) ? 32 : 16);
        }
        int i6 = i3 | (gapComposer3.changed(str) ? 256 : 128) | (gapComposer3.changed(j) ? 2048 : 1024);
        int i7 = i2 & 8;
        if (i7 != 0) {
            i4 = i6 | 24576;
            z2 = z;
        } else {
            z2 = z;
            i4 = i6 | (gapComposer3.changed(z2) ? 16384 : PKIFailureInfo.certRevoked);
        }
        int i8 = i4;
        if (gapComposer3.shouldExecute(i8 & 1, (i8 & 9361) != 9360)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier modifier4 = i5 != 0 ? companion : modifier2;
            boolean z4 = i7 != 0 ? false : z2;
            if (z4) {
                gapComposer3.startReplaceGroup(-379960696);
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, 11), 14.0f);
                Painter painter = Icons.AlertFill16.painter(gapComposer3);
                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                } else {
                    gapComposer3.startReplaceGroup(-1762997739);
                    gapComposer3.end(false);
                }
                long j2 = colors.semantic.icon.warning;
                gapComposer2 = gapComposer3;
                ImageKt.Image(painter, null, m285size3ABfNKs, null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable | 25008, 40);
                gapComposer2.end(false);
            } else {
                gapComposer2 = gapComposer3;
                gapComposer2.startReplaceGroup(-379699180);
                gapComposer2.end(false);
            }
            int i9 = ((i8 >> 6) & 14) | (i8 & 112) | (i8 & 7168);
            GapComposer gapComposer4 = gapComposer2;
            Modifier modifier5 = modifier4;
            Room.m1165Text25TpFw(0, 0, 0, 0, i9, 0, 4080, j, (Composer) gapComposer4, modifier5, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer4;
            modifier3 = modifier5;
            z3 = z4;
        } else {
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
            z3 = z2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMenuComboDetailsViewKt$$ExternalSyntheticLambda13(modifier3, str, j, z3, i, i2);
        }
    }

    public static final void ExpandingDiscountSection(MenuDiscountSummary menuDiscountSummary, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(419323549);
        int i2 = (gapComposer.changedInstance(menuDiscountSummary) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Icons icons = Icons.DiscountTag16;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            LocalMapKt.LocalExpandableSection(m300paddingVpY3zN4$default, new ExpandableSectionHeaderData(icons, new Color(colors.semantic.icon.success), menuDiscountSummary.name), Expect_jvmKt.rememberComposableLambda(74564344, new SliderDefaults$$ExternalSyntheticLambda3(menuDiscountSummary, 8), gapComposer), LocalMapKt.cardStyle(gapComposer), ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue(), gapComposer, 390);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HintHandler$$ExternalSyntheticLambda0(menuDiscountSummary, i, 26);
        }
    }

    public static final void FreeTextEntryOption(LocalMenuItemDetailsViewModel.ItemModifier.FreeTextEntry freeTextEntry, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1444742837);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(freeTextEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 1;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(new TextFieldState(freeTextEntry.value, 2));
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer2);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue2;
            TextFieldState textFieldState = (TextFieldState) mutableState.getValue();
            int i4 = i2 & 112;
            boolean changedInstance = (i4 == 32) | gapComposer2.changedInstance(freeTextEntry);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                RealImageLoader$execute$2 realImageLoader$execute$2 = new RealImageLoader$execute$2(mutableState, freeTextEntry, function1, null, 13);
                gapComposer2.updateRememberedValue(realImageLoader$execute$2);
                rememberedValue3 = realImageLoader$execute$2;
            }
            Updater.LaunchedEffect(gapComposer2, textFieldState, (Function2) rememberedValue3);
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(FocusTraversalKt.focusRequester(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), focusRequester), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            TextFieldState textFieldState2 = (TextFieldState) mutableState.getValue();
            TextFieldLineLimits.MultiLine multiLine = new TextFieldLineLimits.MultiLine(3, 6);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, 7, (Boolean) null, 119);
            boolean changedInstance2 = gapComposer2.changedInstance(freeTextEntry) | (i4 == 32);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new TapToPayInitiatorNotesKt$$ExternalSyntheticLambda3(function1, freeTextEntry, mutableState, i3);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            gapComposer = gapComposer2;
            InputAreaKt.InputArea(textFieldState2, m300paddingVpY3zN4$default, false, false, false, null, Expect_jvmKt.rememberComposableLambda(1978299155, new PagerDefaults$$ExternalSyntheticLambda0(19, freeTextEntry, mutableState), gapComposer2), "", keyboardOptions, (KeyboardActionHandler) rememberedValue4, multiLine, null, null, null, null, gapComposer, 114819072, 6, 30780);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(freeTextEntry, function1, i, 12);
        }
    }

    public static final void ItemModifier(Modifier modifier, LocalMenuItemDetailsViewModel.ItemModifier itemModifier, Function1 function1, Composer composer, int i) {
        Function1 function12;
        TextStyle textStyle;
        boolean z;
        Modifier.Companion companion;
        float f;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(569941363);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(itemModifier) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier weight = rowScopeInstance.weight(1.0f, companion2, true);
            String title = itemModifier.getTitle();
            TextStyle textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                z = false;
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                textStyle = textStyle2;
            } else {
                textStyle = textStyle2;
                z = false;
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            boolean z2 = z;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors.semantic.text.prominent, (Composer) gapComposer, weight, textStyle, (TextLineBalancing) null, title, (Map) null, (Function1) null, false);
            if (itemModifier.getSubtitle() == null) {
                gapComposer.startReplaceGroup(1025704655);
                OptionalOrRequiredText(itemModifier.isRequired(), itemModifier.getWarn(), gapComposer, 6);
                gapComposer.end(z2);
            } else {
                gapComposer.startReplaceGroup(1025791145);
                gapComposer.end(z2);
            }
            boolean z3 = true;
            gapComposer.end(true);
            String subtitle = itemModifier.getSubtitle();
            if (subtitle == null) {
                gapComposer.startReplaceGroup(916184250);
                gapComposer.end(z2);
                companion = companion2;
                f = 16.0f;
            } else {
                companion = companion2;
                re$$ExternalSyntheticOutline0.m(gapComposer, 916184251, companion, 4.0f, gapComposer);
                Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 48);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                f = 16.0f;
                ModifierListSubtitleText(0, 0, gapComposer, rowScopeInstance.weight(1.0f, companion, true), subtitle, itemModifier.getWarn());
                OptionalOrRequiredText(itemModifier.isRequired(), itemModifier.getWarn(), gapComposer, 6);
                gapComposer.end(true);
                gapComposer.end(z2);
            }
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 12.0f));
            if (itemModifier instanceof LocalMenuItemDetailsViewModel.ItemModifier.FreeTextEntry) {
                gapComposer.startReplaceGroup(916658334);
                int i3 = (i2 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                function12 = function1;
                FreeTextEntryOption((LocalMenuItemDetailsViewModel.ItemModifier.FreeTextEntry) itemModifier, function12, gapComposer, i3);
                gapComposer.end(z2);
            } else {
                function12 = function1;
                if (!(itemModifier instanceof LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 445210681, z2);
                }
                gapComposer.startReplaceGroup(916764540);
                LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList selectFromList = (LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList) itemModifier;
                ArrayList arrayList = selectFromList.options;
                int size = arrayList.size();
                int i4 = z2 ? 1 : 0;
                while (i4 < size) {
                    LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option option = (LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option) arrayList.get(i4);
                    if (i4 > 0) {
                        gapComposer.startReplaceGroup(1724147487);
                        ModalKt.HorizontalDivider(6, z2 ? 1 : 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, f, RecyclerView.DECELERATION_RATE, 2));
                        gapComposer.end(z2);
                    } else {
                        gapComposer.startReplaceGroup(1724235899);
                        gapComposer.end(z2);
                    }
                    m1311SelectFromListOptionSyki4yk(selectFromList.token, option, function12, gapComposer, i2 & 896);
                    i4++;
                    f = 16.0f;
                }
                gapComposer.end(z2);
                z3 = true;
            }
            gapComposer.end(z3);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuKt$$ExternalSyntheticLambda1(modifier, itemModifier, function12, i, 21);
        }
    }

    public static final void LocalBrandLocationMenuView(final Modifier modifier, LocalBrandLocationMenuViewModel localBrandLocationMenuViewModel, final Function1 function1, Composer composer, final int i) {
        int i2;
        LocalBrandLocationMenuViewModel localBrandLocationMenuViewModel2;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        String str;
        MutableState mutableState;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        Object[] objArr;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15;
        NeverEqualPolicy neverEqualPolicy;
        MutableState mutableState2;
        CollapsingToolbarScaffoldState collapsingToolbarScaffoldState;
        boolean z;
        final LocalBrandLocationMenuViewModel localBrandLocationMenuViewModel3 = localBrandLocationMenuViewModel;
        modifier.getClass();
        localBrandLocationMenuViewModel3.getClass();
        List list = localBrandLocationMenuViewModel3.menuCategories;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-73176707);
        Applier applier = gapComposer2.applier;
        int currentMarker = gapComposer2.getCurrentMarker();
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(localBrandLocationMenuViewModel3) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier fillMaxHeight = SizeKt.fillMaxHeight(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxHeight);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$16);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$17);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$18);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$19);
            gapComposer2.startReplaceGroup(-484216612);
            String str2 = localBrandLocationMenuViewModel3.defaultSelectedMenuCategory;
            Object[] objArr2 = {list};
            boolean changedInstance = gapComposer2.changedInstance(localBrandLocationMenuViewModel3);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy2) {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                rememberedValue = new Worker$$ExternalSyntheticLambda0(localBrandLocationMenuViewModel3, 24);
                gapComposer2.updateRememberedValue(rememberedValue);
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
            }
            MutableState mutableState3 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue, gapComposer2, 0);
            if (((Map) mutableState3.getValue()).isEmpty()) {
                gapComposer2.endToMarker(currentMarker);
                endRestartGroup = gapComposer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    function2 = new Function2() { // from class: app.cash.local.views.brand.menu.LocalBrandLocationMenuViewKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i5) {
                                case 0:
                                    LocalCaloriesTextKt.LocalBrandLocationMenuView(modifier, localBrandLocationMenuViewModel3, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    LocalCaloriesTextKt.LocalBrandLocationMenuView(modifier, localBrandLocationMenuViewModel3, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            Object[] objArr3 = new Object[0];
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = new LocalMapKt$$ExternalSyntheticLambda3(18);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState4 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue2, gapComposer2, 48);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy2) {
                rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState5 = (MutableState) rememberedValue3;
            Object[] objArr4 = new Object[0];
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy2) {
                rememberedValue4 = new LocalMapKt$$ExternalSyntheticLambda3(19);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) SaverKt.rememberSaveable(objArr4, (Function0) rememberedValue4, gapComposer2, 48);
            CollapsingToolbarScaffoldState rememberCollapsingToolbarScaffoldState = CollapsingToolbarKt.rememberCollapsingToolbarScaffoldState(gapComposer2);
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer2);
            LazyGridState rememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 3, gapComposer2);
            Boolean bool = (Boolean) mutableState5.getValue();
            bool.getClass();
            Object[] objArr5 = {bool, rememberLazyGridState, (Map) mutableState3.getValue()};
            boolean changed = gapComposer2.changed(rememberLazyGridState) | gapComposer2.changedInstance(localBrandLocationMenuViewModel3) | gapComposer2.changed(mutableState3) | gapComposer2.changed(parcelableSnapshotMutableIntState) | gapComposer2.changed(rememberLazyListState);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed || rememberedValue5 == neverEqualPolicy2) {
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                str = str2;
                mutableState = mutableState4;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$1;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$19;
                objArr = objArr5;
                composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$17;
                neverEqualPolicy = neverEqualPolicy2;
                rememberedValue5 = new NetworkFetcher$doFetch$fetchResult$1(14, mutableState3, mutableState5, rememberLazyGridState, localBrandLocationMenuViewModel3, rememberLazyListState, parcelableSnapshotMutableIntState, (Continuation) null);
                mutableState2 = mutableState5;
                localBrandLocationMenuViewModel3 = localBrandLocationMenuViewModel3;
                parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState;
                gapComposer2.updateRememberedValue(rememberedValue5);
            } else {
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                str = str2;
                mutableState = mutableState4;
                neverEqualPolicy = neverEqualPolicy2;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                mutableState2 = mutableState5;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$1;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$19;
                objArr = objArr5;
                composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$17;
            }
            ProgressBarKt.LaunchedEffectSaveable(objArr, (Function2) rememberedValue5, gapComposer2, 0);
            Object[] objArr6 = {str != null ? new MenuCategoryToken(str) : null};
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new LocalMapKt$$ExternalSyntheticLambda3(20);
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            MutableState mutableState6 = (MutableState) SaverKt.rememberSaveable(objArr6, (Function0) rememberedValue6, gapComposer2, 48);
            MenuCategoryToken menuCategoryToken = str != null ? new MenuCategoryToken(str) : null;
            boolean changedInstance2 = gapComposer2.changedInstance(localBrandLocationMenuViewModel3) | gapComposer2.changed(mutableState6) | gapComposer2.changed(parcelableSnapshotMutableIntState) | gapComposer2.changed(rememberCollapsingToolbarScaffoldState) | gapComposer2.changed(rememberLazyListState) | gapComposer2.changed(rememberLazyGridState);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue7 == neverEqualPolicy) {
                LocalBrandLocationMenuViewModel localBrandLocationMenuViewModel4 = localBrandLocationMenuViewModel3;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState;
                NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$1 = new NetworkFetcher$doFetch$fetchResult$1(15, parcelableSnapshotMutableIntState2, localBrandLocationMenuViewModel4, mutableState6, rememberCollapsingToolbarScaffoldState, rememberLazyListState, rememberLazyGridState, (Continuation) null);
                collapsingToolbarScaffoldState = rememberCollapsingToolbarScaffoldState;
                rememberLazyGridState = rememberLazyGridState;
                parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState2;
                localBrandLocationMenuViewModel3 = localBrandLocationMenuViewModel4;
                gapComposer2.updateRememberedValue(networkFetcher$doFetch$fetchResult$1);
                rememberedValue7 = networkFetcher$doFetch$fetchResult$1;
            } else {
                collapsingToolbarScaffoldState = rememberCollapsingToolbarScaffoldState;
            }
            Updater.LaunchedEffect(list, menuCategoryToken, (Function2) rememberedValue7, gapComposer2);
            Object[] objArr7 = {(Integer) mutableState.getValue()};
            MutableState mutableState7 = mutableState;
            boolean changed2 = gapComposer2.changed(mutableState7) | gapComposer2.changed(parcelableSnapshotMutableIntState) | gapComposer2.changed(collapsingToolbarScaffoldState) | gapComposer2.changed(rememberLazyListState) | gapComposer2.changedInstance(localBrandLocationMenuViewModel3) | gapComposer2.changed(rememberLazyGridState);
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue8 == neverEqualPolicy) {
                LazyGridState lazyGridState = rememberLazyGridState;
                CollapsingToolbarScaffoldState collapsingToolbarScaffoldState2 = collapsingToolbarScaffoldState;
                EngineInterceptor$intercept$2 engineInterceptor$intercept$2 = new EngineInterceptor$intercept$2(mutableState7, mutableState2, collapsingToolbarScaffoldState2, rememberLazyListState, parcelableSnapshotMutableIntState, lazyGridState, localBrandLocationMenuViewModel3, null, 8);
                rememberLazyListState = rememberLazyListState;
                rememberLazyGridState = lazyGridState;
                mutableState7 = mutableState7;
                collapsingToolbarScaffoldState = collapsingToolbarScaffoldState2;
                gapComposer2.updateRememberedValue(engineInterceptor$intercept$2);
                rememberedValue8 = engineInterceptor$intercept$2;
            }
            ProgressBarKt.LaunchedEffectSaveable(objArr7, (Function2) rememberedValue8, gapComposer2, 0);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), true);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            CollapsingToolbarScaffoldState collapsingToolbarScaffoldState3 = collapsingToolbarScaffoldState;
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$13);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$15);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$12, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Object rememberedValue9 = gapComposer2.rememberedValue();
            if (rememberedValue9 == neverEqualPolicy) {
                rememberedValue9 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                gapComposer2.updateRememberedValue(rememberedValue9);
            }
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            ScrollStrategy[] scrollStrategyArr = ScrollStrategy.$VALUES;
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = parcelableSnapshotMutableIntState;
            LazyGridState lazyGridState2 = rememberLazyGridState;
            GlobalSearchViewKt$$ExternalSyntheticLambda0 globalSearchViewKt$$ExternalSyntheticLambda0 = new GlobalSearchViewKt$$ExternalSyntheticLambda0(collapsingToolbarScaffoldState3, localBrandLocationMenuViewModel, function1, (CoroutineScope) rememberedValue9, lazyGridState2, rememberLazyListState, mutableState7, parcelableSnapshotMutableIntState3);
            localBrandLocationMenuViewModel2 = localBrandLocationMenuViewModel;
            CollapsingToolbarKt.CollapsingToolbarScaffold(fillMaxSize, collapsingToolbarScaffoldState3, false, null, Expect_jvmKt.rememberComposableLambda(-175144801, globalSearchViewKt$$ExternalSyntheticLambda0, gapComposer2), Expect_jvmKt.rememberComposableLambda(-1323520876, new LocalViewFactory$$ExternalSyntheticLambda6(6, lazyGridState2, localBrandLocationMenuViewModel2, function1), gapComposer2), gapComposer2, 1769862);
            gapComposer = gapComposer2;
            Modifier align = BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(align, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7);
            ToastData toastData = localBrandLocationMenuViewModel2.showToastData;
            Duration.Companion companion2 = Duration.Companion;
            LocalMapKt.m1318DismissableToastTnuy9kA(m302paddingqDBjuR0$default, toastData, null, new Duration(DurationKt.toDuration(7, DurationUnit.SECONDS)), gapComposer, 0);
            gapComposer.end(true);
            LocalBottomModalViewModel localBottomModalViewModel = localBrandLocationMenuViewModel2.modal;
            if (localBottomModalViewModel == null) {
                gapComposer.startReplaceGroup(-474707519);
                z = false;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-474707518);
                Unit unit = Unit.INSTANCE;
                Object rememberedValue10 = gapComposer.rememberedValue();
                if (rememberedValue10 == neverEqualPolicy) {
                    rememberedValue10 = LocalBrandLocationMenuViewKt$LocalBrandLocationMenuView$1$6$1$1.INSTANCE;
                    gapComposer.updateRememberedValue(rememberedValue10);
                }
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, unit, (PointerInputEventHandler) rememberedValue10);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                LocalMapKt.LocalBottomModal(SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(pointerInput, colors.semantic.background.f1047app, ColorKt.RectangleShape), 16.0f, RecyclerView.DECELERATION_RATE, 2), localBottomModalViewModel, function1, 0, gapComposer, i3 & 896, 8);
                z = false;
                gapComposer.end(false);
            }
            gapComposer.end(z);
            gapComposer.end(true);
        } else {
            localBrandLocationMenuViewModel2 = localBrandLocationMenuViewModel3;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i5 = 1;
            final LocalBrandLocationMenuViewModel localBrandLocationMenuViewModel5 = localBrandLocationMenuViewModel2;
            function2 = new Function2() { // from class: app.cash.local.views.brand.menu.LocalBrandLocationMenuViewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i5;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i52) {
                        case 0:
                            LocalCaloriesTextKt.LocalBrandLocationMenuView(modifier, localBrandLocationMenuViewModel5, function1, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                        default:
                            LocalCaloriesTextKt.LocalBrandLocationMenuView(modifier, localBrandLocationMenuViewModel5, function1, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final void LocalCaloriesText(int i, int i2, Composer composer, Modifier modifier) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-503182083);
        int i3 = i2 | 6 | (gapComposer.changed(i) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            String format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.local_views_item_calories_description)).format(new Object[]{Integer.valueOf(i)});
            format2.getClass();
            boolean changed = gapComposer.changed(format2);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new IconKt$$ExternalSyntheticLambda0(format2, 23);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue);
            String format3 = new MessageFormat(Room.stringResource(gapComposer, R.string.local_views_item_calories)).format(new Object[]{Integer.valueOf(i)});
            format3.getClass();
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer, clearAndSetSemantics, textStyle, (TextLineBalancing) null, format3, (Map) null, (Function1) null, false);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SnackbarHostKt$$ExternalSyntheticLambda3(modifier2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    public static final void LocalDietaryPreferencesSection(Modifier modifier, List list, List list2, Composer composer, int i) {
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        BiasAlignment.Horizontal horizontal;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ?? r4;
        boolean z;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        Modifier.Companion companion;
        Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
        list.getClass();
        list2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-619529978);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(list) ? 32 : 16) | (gapComposer.changedInstance(list2) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, false, null);
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$SpacedAligned, horizontal2, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$17);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$18);
            boolean isEmpty = list.isEmpty();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (isEmpty) {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                horizontal = horizontal2;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                r4 = 0;
                z = true;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                companion = companion2;
                gapComposer.startReplaceGroup(-1320494362);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1320930656);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, gapComposer, 0);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$16);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$17, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$18);
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                companion = companion2;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                z = true;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                horizontal = horizontal2;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_item_dietary_information), (Map) null, (Function1) null, false);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, null, 62), (Map) null, (Function1) null, false);
                gapComposer.end(true);
                r4 = 0;
                gapComposer.end(false);
            }
            if (list2.isEmpty()) {
                gapComposer.startReplaceGroup(-1320014234);
                gapComposer.end(r4);
            } else {
                gapComposer.startReplaceGroup(-1320444762);
                ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, r4);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_item_ingredients_contains), (Map) null, (Function1) null, false);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, CollectionsKt.joinToString$default(list2, ", ", null, null, 0, null, null, 62), (Map) null, (Function1) null, false);
                gapComposer.end(z);
                gapComposer.end(false);
            }
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuKt$$ExternalSyntheticLambda1(modifier, list, list2, i, 18);
        }
    }

    public static final void LocalExpandingDiscountSections(int i, Composer composer, Modifier modifier, List list) {
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1663054694);
        int i2 = (gapComposer.changedInstance(list) ? 32 : 16) | i;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            gapComposer.startReplaceGroup(501621674);
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                ExpandingDiscountSection((MenuDiscountSummary) list.get(i4), gapComposer, 0);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda17(modifier, list, i, i3);
        }
    }

    public static final void LocalExpandingPreorderSection(Modifier modifier, MenuItemPreorderingSummary menuItemPreorderingSummary, Composer composer, int i) {
        menuItemPreorderingSummary.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-448950477);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(menuItemPreorderingSummary) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(modifier, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Icons icons = Icons.Date16;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            LocalMapKt.LocalExpandableSection(m300paddingVpY3zN4$default, new ExpandableSectionHeaderData(icons, new Color(colors.semantic.icon.warning), menuItemPreorderingSummary.title), Expect_jvmKt.rememberComposableLambda(-747227122, new SliderDefaults$$ExternalSyntheticLambda3(menuItemPreorderingSummary, 9), gapComposer), LocalMapKt.cardStyle(gapComposer), ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue(), gapComposer, MLKEMEngine.KyberPolyBytes);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(modifier, menuItemPreorderingSummary, i, 8);
        }
    }

    public static final void LocalMenuComboDetailsView(LocalMenuComboDetailsViewModel localMenuComboDetailsViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        LocalMenuComboDetailsViewModel localMenuComboDetailsViewModel2;
        Function1 function12;
        GapComposer gapComposer;
        Object amountDisplayKt$AmountDisplay$1$1;
        Integer num;
        SnapshotStateMap snapshotStateMap;
        ScrollState scrollState;
        localMenuComboDetailsViewModel.getClass();
        List list = localMenuComboDetailsViewModel.comboSlots;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(301680821);
        Applier applier = gapComposer2.applier;
        int i3 = i & 6;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer2.changed(companion) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(localMenuComboDetailsViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer2);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            int i4 = i2 & 896;
            boolean z = i4 == 256;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (z || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new LocalMenuItemDetailsViewKt$$ExternalSyntheticLambda0(function1, parcelableSnapshotMutableIntState, mutableState, 1);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Function1 function13 = (Function1) rememberedValue3;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new SnapshotStateMap();
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) rememberedValue4;
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer2);
            boolean changed = gapComposer2.changed(list);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed || rememberedValue5 == neverEqualPolicy) {
                Iterator it = list.iterator();
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i5 = -1;
                        break;
                    }
                    Iterator it2 = it;
                    if (((LocalMenuComboDetailsViewModel.ComboSlot) it.next()).validationStatus == LocalMenuComboDetailsViewModel.ComboSlot.ValidationStatus.MissingSelection) {
                        break;
                    }
                    i5++;
                    it = it2;
                }
                rememberedValue5 = Integer.valueOf(i5);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            int intValue = ((Number) rememberedValue5).intValue();
            Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
            Integer valueOf2 = Integer.valueOf(intValue);
            boolean changed2 = (i4 == 256) | gapComposer2.changed(intValue) | gapComposer2.changedInstance(localMenuComboDetailsViewModel) | gapComposer2.changed(rememberScrollState);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue6 == neverEqualPolicy) {
                num = valueOf2;
                amountDisplayKt$AmountDisplay$1$1 = new AmountDisplayKt$AmountDisplay$1$1(intValue, localMenuComboDetailsViewModel, snapshotStateMap2, mutableState, rememberScrollState, function1, (Continuation) null);
                snapshotStateMap = snapshotStateMap2;
                scrollState = rememberScrollState;
                gapComposer2.updateRememberedValue(amountDisplayKt$AmountDisplay$1$1);
            } else {
                amountDisplayKt$AmountDisplay$1$1 = rememberedValue6;
                scrollState = rememberScrollState;
                num = valueOf2;
                snapshotStateMap = snapshotStateMap2;
            }
            Updater.LaunchedEffect(valueOf, num, (Function2) amountDisplayKt$AmountDisplay$1$1, gapComposer2);
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf3 = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf3, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            ScrollState scrollState2 = scrollState;
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), true);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            localMenuComboDetailsViewModel2 = localMenuComboDetailsViewModel;
            function12 = function1;
            LocalMapKt.m1317CollapsingHeaderScaffold_trzpw(SizeKt.fillMaxSize(companion, 1.0f), Expect_jvmKt.rememberComposableLambda(-1345729644, new LocalViewFactory$$ExternalSyntheticLambda4(1, localMenuComboDetailsViewModel, function1), gapComposer2), Expect_jvmKt.rememberComposableLambda(-1169790787, new LocalMenuComboDetailsViewKt$$ExternalSyntheticLambda2(localMenuComboDetailsViewModel, 0), gapComposer2), Expect_jvmKt.rememberComposableLambda(2064965248, new ComposeDialogKt$$ExternalSyntheticLambda12(scrollState2, localMenuComboDetailsViewModel, function1, snapshotStateMap, 7), gapComposer2), CollapsingToolbarKt.rememberCollapsingToolbarScaffoldState(gapComposer2), gapComposer2, 25014);
            gapComposer = gapComposer2;
            Modifier align = BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(align, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7);
            ToastData toastData = localMenuComboDetailsViewModel2.showToastData;
            Duration.Companion companion2 = Duration.Companion;
            LocalMapKt.m1318DismissableToastTnuy9kA(m302paddingqDBjuR0$default, toastData, null, new Duration(DurationKt.toDuration(7, DurationUnit.SECONDS)), gapComposer, 0);
            gapComposer.end(true);
            LocalMapKt.LocalBottomModal(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), localMenuComboDetailsViewModel2.checkoutModal, function13, 0, gapComposer, 6, 8);
            gapComposer.end(true);
        } else {
            localMenuComboDetailsViewModel2 = localMenuComboDetailsViewModel;
            function12 = function1;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(localMenuComboDetailsViewModel2, function12, i);
        }
    }

    public static final void LocalMenuItemDetailsView(Modifier modifier, LocalMenuItemDetailsViewModel localMenuItemDetailsViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Object obj;
        Object realImageLoader$execute$result$1;
        ScrollState scrollState;
        SnapshotStateMap snapshotStateMap;
        Function1 function12;
        LocalMenuItemDetailsViewModel localMenuItemDetailsViewModel2 = localMenuItemDetailsViewModel;
        modifier.getClass();
        localMenuItemDetailsViewModel2.getClass();
        List list = localMenuItemDetailsViewModel2.itemModifiers;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(491906558);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(localMenuItemDetailsViewModel2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer2);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (z || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new LocalMenuItemDetailsViewKt$$ExternalSyntheticLambda0(function1, parcelableSnapshotMutableIntState, mutableState, 0);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Function1 function13 = (Function1) rememberedValue3;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new SnapshotStateMap();
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) rememberedValue4;
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer2);
            boolean changed = gapComposer2.changed(list);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed || rememberedValue5 == neverEqualPolicy) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((LocalMenuItemDetailsViewModel.ItemModifier) obj).getWarn()) {
                            break;
                        }
                    }
                }
                rememberedValue5 = (LocalMenuItemDetailsViewModel.ItemModifier) obj;
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            LocalMenuItemDetailsViewModel.ItemModifier itemModifier = (LocalMenuItemDetailsViewModel.ItemModifier) rememberedValue5;
            Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
            boolean changedInstance = (i3 == 256) | gapComposer2.changedInstance(itemModifier) | gapComposer2.changed(rememberScrollState);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue6 == neverEqualPolicy) {
                scrollState = rememberScrollState;
                realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1(itemModifier, snapshotStateMap2, mutableState, scrollState, function1, null, 18);
                snapshotStateMap = snapshotStateMap2;
                function12 = function1;
                gapComposer2.updateRememberedValue(realImageLoader$execute$result$1);
            } else {
                function12 = function1;
                realImageLoader$execute$result$1 = rememberedValue6;
                snapshotStateMap = snapshotStateMap2;
                scrollState = rememberScrollState;
            }
            Updater.LaunchedEffect(valueOf, itemModifier, (Function2) realImageLoader$execute$result$1, gapComposer2);
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf2 = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf2, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), true);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            SnapshotStateMap snapshotStateMap3 = snapshotStateMap;
            ScrollState scrollState2 = scrollState;
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
            CollapsingToolbarScaffoldState rememberCollapsingToolbarScaffoldState = CollapsingToolbarKt.rememberCollapsingToolbarScaffoldState(gapComposer2);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(543319935, new LocalViewFactory$$ExternalSyntheticLambda4(2, localMenuItemDetailsViewModel2, function12), gapComposer2);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1446118134, new LocalMenuItemDetailsViewKt$$ExternalSyntheticLambda2(localMenuItemDetailsViewModel2, 0), gapComposer2);
            localMenuItemDetailsViewModel2 = localMenuItemDetailsViewModel;
            LocalMapKt.m1317CollapsingHeaderScaffold_trzpw(fillMaxSize2, rememberComposableLambda, rememberComposableLambda2, Expect_jvmKt.rememberComposableLambda(994974739, new ComposeDialogKt$$ExternalSyntheticLambda12(scrollState2, localMenuItemDetailsViewModel, function12, snapshotStateMap3, 8), gapComposer2), rememberCollapsingToolbarScaffoldState, gapComposer2, 25014);
            gapComposer = gapComposer2;
            Modifier align = BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(align, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7);
            ToastData toastData = localMenuItemDetailsViewModel2.showToastData;
            Duration.Companion companion2 = Duration.Companion;
            LocalMapKt.m1318DismissableToastTnuy9kA(m302paddingqDBjuR0$default, toastData, null, new Duration(DurationKt.toDuration(7, DurationUnit.SECONDS)), gapComposer, 0);
            gapComposer.end(true);
            LocalMapKt.LocalBottomModal(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), localMenuItemDetailsViewModel2.checkoutModal, function13, 0, gapComposer, 6, 8);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8((Object) modifier, (Object) localMenuItemDetailsViewModel2, function1, i, 19);
        }
    }

    public static final void MenuCategoryItemCell(Modifier modifier, LocalBrandLocationMenuViewModel.MenuCategory menuCategory, LocalBrandLocationMenuViewModel.MenuCategory.MenuItem menuItem, Function1 function1, Composer composer, int i) {
        int i2;
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(682663149);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changed(modifier) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (gapComposer.changedInstance(menuCategory) ? 32 : 16) | (gapComposer.changedInstance(menuItem) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024);
        byte b = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            CartItemCounterViewModel cartItemCounterViewModel = menuItem.counterModel;
            MenuHours menuHours = menuItem.menuHours;
            CartItemCounterViewModel cartItemCounterViewModel2 = (menuHours == null || menuHours.isAvailableNow()) ? cartItemCounterViewModel : null;
            LocalImage localImage = menuItem.image;
            if (localImage == null) {
                gapComposer.startReplaceGroup(548161067);
                gapComposer.end(false);
                str = null;
            } else {
                gapComposer.startReplaceGroup(-1090696042);
                String themedUrl = LocalViewsKt.getThemedUrl(localImage, gapComposer);
                gapComposer.end(false);
                str = themedUrl;
            }
            Savers_androidKt$$ExternalSyntheticLambda0 savers_androidKt$$ExternalSyntheticLambda0 = new Savers_androidKt$$ExternalSyntheticLambda0(b, 22);
            String str2 = menuItem.label;
            MenuItemAvailability menuItemAvailability = menuItem.availability;
            String str3 = menuItem.discountText;
            boolean z = true;
            boolean z2 = menuItem.isPreorder;
            String str4 = menuItem.description;
            if (str4 == null || StringsKt.isBlank(str4)) {
                str4 = null;
            }
            String str5 = menuItem.counterModel.menuItemToken;
            str5.getClass();
            boolean changed = gapComposer.changed(str5);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            boolean changed2 = gapComposer.changed(delegatingSoftwareKeyboardController);
            if ((i3 & 7168) != 2048) {
                z = false;
            }
            boolean changedInstance = changed2 | z | gapComposer.changedInstance(menuItem) | gapComposer.changedInstance(menuCategory);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                l2$$ExternalSyntheticLambda7 l2__externalsyntheticlambda7 = new l2$$ExternalSyntheticLambda7(delegatingSoftwareKeyboardController, function1, menuItem, menuCategory, 10);
                gapComposer.updateRememberedValue(l2__externalsyntheticlambda7);
                rememberedValue2 = l2__externalsyntheticlambda7;
            }
            LocalMenuCardKt.LocalMenuCard(modifier, cartItemCounterViewModel2, function1, str, savers_androidKt$$ExternalSyntheticLambda0, str2, menuItemAvailability, str3, z2, str4, mutableInteractionSourceImpl, (Function0) rememberedValue2, gapComposer, (i3 & 14) | ((i3 >> 3) & 896), 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(modifier, menuCategory, menuItem, function1, i, 6);
        }
    }

    public static final void ModifierListSubtitleText(int i, int i2, Composer composer, Modifier modifier, String str, boolean z) {
        Modifier modifier2;
        int i3;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1882761383);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i | (gapComposer.changed(modifier2) ? 4 : 2);
        }
        int i5 = i3 | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128);
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            TextStyle textStyle = Strings.getTypography(gapComposer).bodySmall;
            if (z) {
                gapComposer.startReplaceGroup(-1366227409);
                j = Strings.getColors(gapComposer).semantic.text.warning;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1366163952);
                j = Strings.getColors(gapComposer).semantic.text.subtle;
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, ((i5 >> 3) & 14) | ((i5 << 3) & 112), 0, 4080, j, (Composer) gapComposer, modifier3, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinLocationViewKt$$ExternalSyntheticLambda11(modifier2, str, z, i, i2);
        }
    }

    public static final void OptionalOrRequiredText(boolean z, boolean z2, Composer composer, int i) {
        boolean z3;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(293983048);
        int i2 = (gapComposer2.changed(z) ? 32 : 16) | i | (gapComposer2.changed(z2) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
            if (z2) {
                gapComposer2.startReplaceGroup(610765998);
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, 11), 14.0f);
                Painter painter = Icons.AlertFill16.painter(gapComposer2);
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                long j = colors.semantic.icon.warning;
                gapComposer = gapComposer2;
                ImageKt.Image(painter, null, m285size3ABfNKs, null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 25008, 40);
                gapComposer.end(false);
            } else {
                gapComposer = gapComposer2;
                gapComposer.startReplaceGroup(611027514);
                gapComposer.end(false);
            }
            z3 = z2;
            ModifierListSubtitleText(i2 & 896, 1, gapComposer, null, Room.stringResource(gapComposer, z ? R.string.local_views_selection_required : R.string.local_views_selection_optional), z3);
        } else {
            z3 = z2;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeBordersKt$$ExternalSyntheticLambda0(i, z, z3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x02fd, code lost:
    
        if (r2 == r11) goto L81;
     */
    /* renamed from: SelectFromListOption-Syki4yk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1311SelectFromListOptionSyki4yk(String str, LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option option, Function1 function1, Composer composer, int i) {
        final String str2;
        final LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option option2;
        final Function1 function12;
        GapComposer gapComposer;
        boolean z;
        Modifier wrapContentHeight;
        String str3;
        long j;
        LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option.Type type2;
        Modifier.Companion companion;
        RowScopeInstance rowScopeInstance;
        Modifier wrapContentHeight2;
        Object obj;
        boolean z2;
        Object obj2;
        Object obj3;
        Modifier wrapContentHeight3;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-241155436);
        int i2 = i | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changedInstance(option) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            MenuItemAvailability menuItemAvailability = option.availability;
            LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option.Type type3 = option.f921type;
            boolean z3 = !(menuItemAvailability instanceof MenuItemAvailability.SoldOut) && option.enabled;
            LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option.Type.CheckBox checkBox = LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option.Type.CheckBox.INSTANCE;
            boolean equals = type3.equals(checkBox);
            LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option.Type.Radio radio = LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option.Type.Radio.INSTANCE;
            if (equals || type3.equals(radio)) {
                z = z3;
            } else {
                if (!(type3 instanceof LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option.Type.Quantity)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                z = false;
            }
            int i3 = i2 & 896;
            boolean changedInstance = (i3 == 256) | gapComposer2.changedInstance(option);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Object obj4 = rememberedValue;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                StatusRunnable$$ExternalSyntheticLambda1 statusRunnable$$ExternalSyntheticLambda1 = new StatusRunnable$$ExternalSyntheticLambda1(24, function1, option);
                gapComposer2.updateRememberedValue(statusRunnable$$ExternalSyntheticLambda1);
                obj4 = statusRunnable$$ExternalSyntheticLambda1;
            }
            Function0 function0 = (Function0) obj4;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m299paddingVpY3zN4(companion2, 4.0f, 4.0f), 1.0f);
            Strings.getSizes(gapComposer2).getClass();
            Object obj5 = DefaultSizes.border.entries;
            Modifier clip = ClipKt.clip(fillMaxWidth, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            boolean changed = gapComposer2.changed(option.token);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            Object obj6 = rememberedValue2;
            if (changed || rememberedValue2 == neverEqualPolicy) {
                obj6 = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            final int i4 = 0;
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m182clickableO2vRcR0$default(clip, (MutableInteractionSourceImpl) obj6, RippleKt.m3400rippleYJYuY3k(0L, true, RecyclerView.DECELERATION_RATE, null, gapComposer2, 48, 13), z, null, null, function0, 24), 12.0f, 16.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m299paddingVpY3zN4);
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
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            wrapContentHeight = SizeKt.wrapContentHeight(companion2, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            Modifier weight = rowScopeInstance2.weight(1.0f, rowScopeInstance2.align(wrapContentHeight, vertical), true);
            String str4 = option.title;
            TextStyle textStyle = Strings.getTypography(gapComposer2).bodySmall;
            if (z3) {
                str3 = str4;
                gapComposer2.startReplaceGroup(937265003);
                j = Strings.getColors(gapComposer2).semantic.text.standard;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(937196555);
                str3 = str4;
                j = Strings.getColors(gapComposer2).semantic.text.disabled;
                gapComposer2.end(false);
            }
            GapComposer gapComposer3 = gapComposer2;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer3, weight, textStyle, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
            MenuItemAvailability menuItemAvailability2 = option.availability;
            if (menuItemAvailability2 instanceof MenuItemAvailability.Available) {
                gapComposer3.startReplaceGroup(937447469);
                String str5 = ((MenuItemAvailability.Available) menuItemAvailability2).price;
                if (str5 == null) {
                    gapComposer3.startReplaceGroup(937447468);
                    gapComposer3.end(false);
                    type2 = type3;
                    companion = companion2;
                    rowScopeInstance = rowScopeInstance2;
                } else {
                    gapComposer3.startReplaceGroup(937447469);
                    wrapContentHeight3 = SizeKt.wrapContentHeight(companion2, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    type2 = type3;
                    rowScopeInstance = rowScopeInstance2;
                    companion = companion2;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer3).semantic.text.standard, (Composer) gapComposer3, SpacerKt.m302paddingqDBjuR0$default(rowScopeInstance2.align(wrapContentHeight3, vertical), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 11), Strings.getTypography(gapComposer3).bodySmall, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                    gapComposer3.end(false);
                }
                gapComposer3.end(false);
            } else {
                type2 = type3;
                companion = companion2;
                rowScopeInstance = rowScopeInstance2;
                if (!menuItemAvailability2.equals(MenuItemAvailability.SoldOut.INSTANCE)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 168784832, false);
                }
                gapComposer3.startReplaceGroup(937797397);
                wrapContentHeight2 = SizeKt.wrapContentHeight(companion, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer3).semantic.text.warning, (Composer) gapComposer3, SpacerKt.m302paddingqDBjuR0$default(rowScopeInstance.align(wrapContentHeight2, vertical), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 10.0f, RecyclerView.DECELERATION_RATE, 11), Strings.getTypography(gapComposer3).bodySmall, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.local_views_sold_out), (Map) null, (Function1) null, false);
                gapComposer3.end(false);
            }
            LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option.Type type4 = type2;
            if (type4.equals(radio)) {
                gapComposer3.startReplaceGroup(938174729);
                option2 = option;
                LocalMapKt.LocalRadio(option2.selected, rowScopeInstance.align(companion, vertical), null, z3, function0, gapComposer3, 0, 4);
                gapComposer3.end(false);
            } else {
                option2 = option;
                boolean z4 = z3;
                if (type4.equals(checkBox)) {
                    gapComposer3.startReplaceGroup(938393899);
                    Modifier align = rowScopeInstance.align(companion, vertical);
                    boolean z5 = option2.selected;
                    boolean changed2 = gapComposer3.changed(function0);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (!changed2) {
                        obj3 = rememberedValue3;
                    }
                    LocalMapKt$$ExternalSyntheticLambda10 localMapKt$$ExternalSyntheticLambda10 = new LocalMapKt$$ExternalSyntheticLambda10(8, function0);
                    gapComposer3.updateRememberedValue(localMapKt$$ExternalSyntheticLambda10);
                    obj3 = localMapKt$$ExternalSyntheticLambda10;
                    LocalMapKt.UnlabeledLocalCheckbox(z5, (Function1) obj3, align, null, z4, gapComposer3, 0, 8);
                    gapComposer3.end(false);
                } else {
                    if (!(type4 instanceof LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option.Type.Quantity)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 168809990, false);
                    }
                    gapComposer3.startReplaceGroup(938649618);
                    Modifier align2 = rowScopeInstance.align(companion, vertical);
                    LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option.Type.Quantity quantity = (LocalMenuItemDetailsViewModel.ItemModifier.SelectFromList.Option.Type.Quantity) type4;
                    int i5 = quantity.current;
                    int i6 = quantity.max;
                    int i7 = i2 & 14;
                    boolean changedInstance2 = (i7 == 4) | (i3 == 256) | gapComposer3.changedInstance(option2);
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                        str2 = str;
                        function12 = function1;
                        Function0 function02 = new Function0() { // from class: app.cash.local.views.brand.menu.LocalMenuItemDetailsViewKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i4) {
                                    case 0:
                                        function12.invoke(new LocalMenuItemDetailsViewEvent.DecrementModifier(str2, option2.token));
                                        break;
                                    default:
                                        function12.invoke(new LocalMenuItemDetailsViewEvent.IncrementModifier(str2, option2.token));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer3.updateRememberedValue(function02);
                        obj = function02;
                    } else {
                        str2 = str;
                        function12 = function1;
                        obj = rememberedValue4;
                    }
                    Function0 function03 = (Function0) obj;
                    boolean changedInstance3 = (i3 == 256) | (i7 == 4) | gapComposer3.changedInstance(option2);
                    Object rememberedValue5 = gapComposer3.rememberedValue();
                    if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
                        z2 = true;
                        final boolean z6 = true ? 1 : 0;
                        Function0 function04 = new Function0() { // from class: app.cash.local.views.brand.menu.LocalMenuItemDetailsViewKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (z6) {
                                    case 0:
                                        function12.invoke(new LocalMenuItemDetailsViewEvent.DecrementModifier(str2, option2.token));
                                        break;
                                    default:
                                        function12.invoke(new LocalMenuItemDetailsViewEvent.IncrementModifier(str2, option2.token));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer3.updateRememberedValue(function04);
                        obj2 = function04;
                    } else {
                        z2 = true;
                        obj2 = rememberedValue5;
                    }
                    ProgressBarKt.LocalValueStepper(align2, z4, i6, i5, function03, (Function0) obj2, gapComposer3, 0);
                    gapComposer3.end(false);
                    gapComposer3.end(z2);
                    gapComposer = gapComposer3;
                }
            }
            z2 = true;
            str2 = str;
            function12 = function1;
            gapComposer3.end(z2);
            gapComposer = gapComposer3;
        } else {
            str2 = str;
            option2 = option;
            function12 = function1;
            gapComposer2.skipToGroupEnd();
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuKt$$ExternalSyntheticLambda1(str2, option2, function12, i, 20);
        }
    }

    public static final void ToolbarWithMenuSelector(List list, MenuSelectorOption menuSelectorOption, float f, Function0 function0, Function0 function02, Function0 function03, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1611522666);
        int i2 = 2;
        int i3 = i | (gapComposer.changedInstance(list) ? 4 : 2) | (gapComposer.changedInstance(menuSelectorOption) ? 32 : 16) | (gapComposer.changed(f) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024) | (gapComposer.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function03) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            DBUtil.TitleBarSub(Expect_jvmKt.rememberComposableLambda(302461412, new TrackRowKt$$ExternalSyntheticLambda5(f, menuSelectorOption, list, function02), gapComposer), NavigationType.BACK, SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), (DynamicColorConfiguration) null, function0, (Modifier) null, Expect_jvmKt.rememberComposableLambda(34621097, new DismissableToastKt$$ExternalSyntheticLambda3(i2, function03), gapComposer), gapComposer, ((i3 << 3) & 57344) | 1573302, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TooltipBoxKt$$ExternalSyntheticLambda8(list, menuSelectorOption, f, function0, function02, function03, i, 1);
        }
    }
}
