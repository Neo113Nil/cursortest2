package androidx.compose.material;

import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LimitInsets;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.material3.DatePickerDialog_androidKt;
import androidx.compose.material3.DatePickerStateImpl;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutBoundsElement;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.intl.Locale_jvmAndAndroidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.common.FileTypes;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.local.presenters.brand.menu.LocalMenuComboDetailsPresenter;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.ComboSlot;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.analytics.LocalClientCartMenuItemAddedContext;
import app.cash.local.screens.app.MenuItemDetailsQuestion;
import app.cash.local.views.brand.profile.LocalBrandLocationRowKt;
import app.cash.local.views.sheet.MenuPickerSheetKt$$ExternalSyntheticLambda4;
import app.cash.molecule.PlatformKt;
import bo.app.n3$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.ta$$ExternalSyntheticLambda1;
import coil3.RealImageLoader;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzafd;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.maps.android.compose.InputHandlerKt;
import com.nimbusds.jose.JWECryptoParts;
import com.plaid.internal.EnumC0170g;
import com.squareup.address.typeahead.backend.api.AddressState;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.receipts.ReceiptScaffoldSlot;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.views.homesection.LegalSectionKt;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.GenericScaffoldContentScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ScreenScaffoldContentScope;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.blockers.viewmodels.VerifyAliasModel;
import com.squareup.cash.blockers.views.AmountBlockerViewKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.card.onboarding.CardPillTheme;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.globalsearch.views.GlobalSearchCellKt$$ExternalSyntheticLambda6;
import com.squareup.cash.instruments.viewmodels.InstrumentAvatarViewModel;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda13;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.genie.DatePickerViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.moneybot.genie.DatePickerViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.views.markdown.MoneybotMarkdownKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowSheetPeekPosition$FixedHeight;
import com.squareup.cash.payments.views.nearby.NearbyPayRequestViewKt;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.viewmodels.ProfileHeaderViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader;
import com.squareup.cash.savings.views.SavingsScreenHeaderKt;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.sheet.RealSheetState$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.viewmodels.BrandsSearchViewModel;
import com.squareup.cash.shopping.viewmodels.ProductSearchViewModel;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda4;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda6;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda9;
import com.squareup.cash.shopping.views.ProductSearchView;
import com.squareup.cash.shopping.views.ProductSearchViewState;
import com.squareup.cash.shopping.views.ShopErrorKt;
import com.squareup.cash.shopping.views.ShopErrorKt$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.views.search.ShopMessageKt;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActivityBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$FileBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$TextBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel$MessageViewModel$Status$Failed;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt$$ExternalSyntheticLambda11;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda10;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.wallet.viewmodels.CardAppletTileViewModel;
import com.squareup.cash.wallet.views.CardNuxAnimationsKt;
import com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda12;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeState;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Function;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.encoding.AbstractDecoder;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.intellij.markdown.ast.ASTNodeImpl;
import radiography.internal.ComposeLayoutInfoKt;
import xyz.block.genie.state.GenieStateBinding;

/* loaded from: classes3.dex */
public final /* synthetic */ class SwipeToDismissKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ SwipeToDismissKt$$ExternalSyntheticLambda3(Modifier modifier, MutableState mutableState, String str, GenieStateBinding genieStateBinding, TextStyle textStyle, List list) {
        this.$r8$classId = 15;
        this.f$1 = modifier;
        this.f$0 = mutableState;
        this.f$2 = str;
        this.f$3 = genieStateBinding;
        this.f$4 = textStyle;
        this.f$5 = list;
    }

    private final Object invoke$com$squareup$cash$shopping$views$ProductSearchView$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        Function0 function0;
        ProductSearchViewModel productSearchViewModel = (ProductSearchViewModel) this.f$0;
        MutableState mutableState = (MutableState) this.f$1;
        FocusRequester focusRequester = (FocusRequester) this.f$2;
        View view = (View) this.f$4;
        Function1 function1 = (Function1) this.f$3;
        ProductSearchView productSearchView = (ProductSearchView) this.f$5;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            LimitInsets limitInsets = new LimitInsets(Arrangement$End$1.current(gapComposer).systemBars, OffsetKt.Horizontal | 16);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier imePadding = SpacerKt.imePadding(SpacerKt.navigationBarsPadding(OffsetKt.windowInsetsPadding(companion, limitInsets)));
            long j = MooncakeTheme.getColors(gapComposer).background;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(imePadding, j, rectangleShapeKt$RectangleShape$1);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 4.0f));
            String str = ((ProductSearchViewState) mutableState.getValue()).searchText;
            boolean filtersApplied = productSearchViewModel.getFiltersApplied();
            boolean shouldShowFilters = productSearchViewModel.getShouldShowFilters();
            String stringResource = Room.stringResource(gapComposer, R.string.product_search_bar_hint);
            boolean changed = gapComposer.changed(mutableState);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda10(11, mutableState);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean changedInstance = gapComposer.changedInstance(view);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BrandsSearchView$$ExternalSyntheticLambda4(view, 5);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function1 function13 = (Function1) rememberedValue2;
            boolean changed2 = gapComposer.changed(mutableState);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new OverlayKt$$ExternalSyntheticLambda1(19, mutableState);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Function0 function02 = (Function0) rememberedValue3;
            boolean changed3 = gapComposer.changed(function1);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new BrandsSearchView$$ExternalSyntheticLambda6(22, function1);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Function0 function03 = (Function0) rememberedValue4;
            boolean changed4 = gapComposer.changed(function1);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changed4 || rememberedValue5 == neverEqualPolicy) {
                function0 = function02;
                rememberedValue5 = new BrandsSearchView$$ExternalSyntheticLambda6(23, function1);
                gapComposer.updateRememberedValue(rememberedValue5);
            } else {
                function0 = function02;
            }
            ShopErrorKt.ProductSearchToolbar(str, filtersApplied, shouldShowFilters, stringResource, function12, fillMaxWidth, focusRequester, function13, function0, function03, (Function0) rememberedValue5, gapComposer, 1769472);
            GapComposer gapComposer2 = gapComposer;
            SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, 4.0f));
            if (productSearchViewModel instanceof ProductSearchViewModel.Loading) {
                gapComposer2.startReplaceGroup(1497159136);
                ShopErrorKt.ShopLoadingProgress(SizeKt.fillMaxSize(companion, 1.0f), gapComposer2, 6);
                gapComposer2.end(false);
            } else {
                if (!(productSearchViewModel instanceof ProductSearchViewModel.Loaded)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 1497158857, false);
                }
                gapComposer2.startReplaceGroup(-832603560);
                ProductSearchViewModel.Loaded loaded = (ProductSearchViewModel.Loaded) productSearchViewModel;
                if (loaded.error != null) {
                    gapComposer2.startReplaceGroup(-832579132);
                    String stringResource2 = Room.stringResource(gapComposer2, R.string.shop_error_title);
                    String stringResource3 = Room.stringResource(gapComposer2, R.string.shop_search_error_message);
                    String stringResource4 = Room.stringResource(gapComposer2, R.string.shop_retry_button_text);
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 16.0f);
                    boolean changed5 = gapComposer2.changed(function1);
                    Object rememberedValue6 = gapComposer2.rememberedValue();
                    if (changed5 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new BrandsSearchView$$ExternalSyntheticLambda6(24, function1);
                        gapComposer2.updateRememberedValue(rememberedValue6);
                    }
                    ShopErrorKt.ShopError(3072, gapComposer2, m299paddingVpY3zN4, stringResource2, stringResource3, stringResource4, (Function0) rememberedValue6);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-832141691);
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), MooncakeTheme.getColors(gapComposer2).background, rectangleShapeKt$RectangleShape$1);
                    List list = loaded.items;
                    RealImageLoader realImageLoader = (RealImageLoader) productSearchView.imageLoader;
                    Object rememberedValue7 = gapComposer2.rememberedValue();
                    if (rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new RealSheetState$$ExternalSyntheticLambda0(27);
                        gapComposer2.updateRememberedValue(rememberedValue7);
                    }
                    Function1 function14 = (Function1) rememberedValue7;
                    boolean changedInstance2 = gapComposer2.changedInstance(view);
                    Object rememberedValue8 = gapComposer2.rememberedValue();
                    if (changedInstance2 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new BrandsSearchView$$ExternalSyntheticLambda9(view, 2);
                        gapComposer2.updateRememberedValue(rememberedValue8);
                    }
                    ShopMessageKt.ShopHubResultsList(m177backgroundbw27NRU2, list, realImageLoader, function14, (Function0) rememberedValue8, function1, gapComposer2, 3072);
                    gapComposer2 = gapComposer2;
                    gapComposer2.end(false);
                }
                gapComposer2.end(false);
            }
            gapComposer2.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$support$chat$views$transcript$message$compose$MessageFileKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        ChatContentViewModel.MessageViewModel messageViewModel;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        boolean z;
        int i;
        float f;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        String str;
        ChatContentViewModel.MessageViewModel messageViewModel2 = (ChatContentViewModel.MessageViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$3;
        Function1 function12 = (Function1) this.f$1;
        MutableState mutableState = (MutableState) this.f$2;
        BodyViewModel$FileBodyViewModel bodyViewModel$FileBodyViewModel = (BodyViewModel$FileBodyViewModel) this.f$4;
        MutableState mutableState2 = (MutableState) this.f$5;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
        Applier applier = gapComposer.applier;
        if (shouldExecute) {
            BiasAlignment.Horizontal horizontal = Alignment.Companion.End;
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer, 54);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$16);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$17, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$18);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier clip = ClipKt.clip(ImageKt.m177backgroundbw27NRU(rowScopeInstance.weight(1.0f, companion, false), Strings.getColors(gapComposer).semantic.background.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new OverlayKt$$ExternalSyntheticLambda1(22, mutableState);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.wrapContentWidth$default(ImageKt.m183clickableoSLSa3U$default(clip, false, null, null, (Function0) rememberedValue, 15), null, 3), 16.0f);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ChatSurveyKt$$ExternalSyntheticLambda11(15);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m298padding3ABfNKs, true, (Function1) rememberedValue2);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer, 48);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, semantics);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$16);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$17, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$18);
            Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SpacerKt.m298padding3ABfNKs(SizeKt.m285size3ABfNKs(companion, 48.0f), 4.0f), RoundedCornerShapeKt.CircleShape), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape), 8.0f);
            Painter painterResource = Countries.painterResource(R.drawable.icon_document_24, 0, gapComposer);
            String stringResource = Room.stringResource(gapComposer, R.string.support_chat_file_attachment_icon);
            long j = Strings.getColors(gapComposer).semantic.icon.standard;
            ImageKt.Image(painterResource, stringResource, m298padding3ABfNKs2, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable, 56);
            Modifier weight = rowScopeInstance.weight(1.0f, SpacerKt.m300paddingVpY3zN4$default(companion, 8.0f, RecyclerView.DECELERATION_RATE, 2), false);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.Start, gapComposer, 0);
            int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, weight);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$16);
            Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$17, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$18);
            Room.m1165Text25TpFw(2, 1, 0, 0, 1769472, 0, 3994, 0L, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, bodyViewModel$FileBodyViewModel.name, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, bodyViewModel$FileBodyViewModel.description, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            gapComposer.end(true);
            FileTypes fileTypes = messageViewModel2.status;
            boolean z2 = fileTypes instanceof ChatContentViewModel$MessageViewModel$Status$Failed;
            if (z2) {
                gapComposer.startReplaceGroup(1555143200);
                String statusText = MessageFileKt.toStatusText(fileTypes, gapComposer);
                String str2 = messageViewModel2.idempotenceToken;
                boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    str = str2;
                    rememberedValue3 = new TabToolbarsKt$$ExternalSyntheticLambda10(13, mutableState2);
                    gapComposer.updateRememberedValue(rememberedValue3);
                } else {
                    str = str2;
                }
                messageViewModel = messageViewModel2;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                z = z2;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                i = 3;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$16;
                String str3 = str;
                f = 16.0f;
                MessageFileKt.MessageFailedRetryUI(str3, booleanValue, (Function1) rememberedValue3, function1, function12, statusText, false, gapComposer, MLKEMEngine.KyberPolyBytes, 64);
                gapComposer.end(false);
            } else {
                messageViewModel = messageViewModel2;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                z = z2;
                i = 3;
                f = 16.0f;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$16;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                gapComposer.startReplaceGroup(1555549703);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            String statusText2 = MessageFileKt.toStatusText(fileTypes, gapComposer);
            RowMeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(i)), Alignment.Companion.Top, gapComposer, 6);
            int hashCode5 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$14);
            Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier5, composeUiNode$Companion$SetModifier$12);
            ChatContentViewModel.MessageViewModel messageViewModel3 = messageViewModel;
            MessageFileKt.MessageStatus(statusText2, messageViewModel3.status, messageViewModel3.timestamp, ((Boolean) mutableState.getValue()).booleanValue(), z ? SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 44.0f, RecyclerView.DECELERATION_RATE, 11) : SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, 11), gapComposer, 0, 0);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$support$chat$views$transcript$message$compose$MessageTextCustomerKt$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        ChatContentViewModel.MessageViewModel messageViewModel;
        MutableState mutableState;
        boolean z;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        int i;
        ChatContentViewModel.MessageViewModel messageViewModel2 = (ChatContentViewModel.MessageViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$3;
        Function1 function12 = (Function1) this.f$1;
        MutableState mutableState2 = (MutableState) this.f$2;
        BodyViewModel$TextBodyViewModel bodyViewModel$TextBodyViewModel = (BodyViewModel$TextBodyViewModel) this.f$4;
        MutableState mutableState3 = (MutableState) this.f$5;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
        Applier applier = gapComposer.applier;
        if (shouldExecute) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.End, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$16);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$17, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            SimpleLayoutKt.SelectionContainer(Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$18, 1.0f, false), Expect_jvmKt.rememberComposableLambda(708515386, new ActionPillKt$$ExternalSyntheticLambda1(26, mutableState2, bodyViewModel$TextBodyViewModel), gapComposer), gapComposer, 48, 0);
            FileTypes fileTypes = messageViewModel2.status;
            boolean z2 = fileTypes instanceof ChatContentViewModel$MessageViewModel$Status$Failed;
            if (z2) {
                gapComposer.startReplaceGroup(-2095355810);
                String statusText = MessageFileKt.toStatusText(fileTypes, gapComposer);
                String str = messageViewModel2.idempotenceToken;
                boolean booleanValue = ((Boolean) mutableState3.getValue()).booleanValue();
                mutableState = mutableState2;
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda10(17, mutableState3);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function1 function13 = (Function1) rememberedValue;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                i = 3;
                messageViewModel = messageViewModel2;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                z = z2;
                MessageFileKt.MessageFailedRetryUI(str, booleanValue, function13, function1, function12, statusText, false, gapComposer, MLKEMEngine.KyberPolyBytes, 64);
                gapComposer.end(false);
            } else {
                messageViewModel = messageViewModel2;
                mutableState = mutableState2;
                z = z2;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                i = 3;
                gapComposer.startReplaceGroup(-2094949307);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            String statusText2 = MessageFileKt.toStatusText(fileTypes, gapComposer);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(i)), Alignment.Companion.Top, gapComposer, 6);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$1);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            ChatContentViewModel.MessageViewModel messageViewModel3 = messageViewModel;
            MessageFileKt.MessageStatus(statusText2, messageViewModel3.status, messageViewModel3.timestamp, ((Boolean) mutableState.getValue()).booleanValue(), z ? SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 44.0f, RecyclerView.DECELERATION_RATE, 11) : SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11), gapComposer, 0, 0);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$transfers$views$WithdrawViewKt$$ExternalSyntheticLambda12(Object obj, Object obj2) {
        float f;
        long j;
        CellDefaultAccessory label;
        WithdrawViewModel.DepositPreferenceOption depositPreferenceOption = (WithdrawViewModel.DepositPreferenceOption) this.f$0;
        DepositPreference depositPreference = (DepositPreference) this.f$1;
        WithdrawViewModel.ViewAmount.DepositPreferenceStyle depositPreferenceStyle = (WithdrawViewModel.ViewAmount.DepositPreferenceStyle) this.f$2;
        Function1 function1 = (Function1) this.f$3;
        TouchRecorder touchRecorder = (TouchRecorder) this.f$4;
        String str = (String) this.f$5;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        boolean z = false;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            DepositPreference depositPreference2 = depositPreferenceOption.depositPreference;
            boolean z2 = depositPreferenceOption.enabled;
            boolean changed = gapComposer.changed(depositPreference2.ordinal());
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            boolean z3 = depositPreferenceOption.depositPreference == depositPreference;
            MutableState collectIsPressedAsState = Room.collectIsPressedAsState(mutableInteractionSourceImpl, gapComposer, 0);
            if (z3) {
                gapComposer.startReplaceGroup(-76743768);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Object obj3 = DefaultSizes.border.annotationsMap;
                gapComposer.end(false);
                f = 2.0f;
            } else {
                gapComposer.startReplaceGroup(-76741913);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Object obj4 = DefaultSizes.border.annotationsMap;
                gapComposer.end(false);
                f = 1.0f;
            }
            if (((Boolean) collectIsPressedAsState.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(-76737687);
                com.squareup.cash.arcade.Colors colors = (com.squareup.cash.arcade.Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.component.input.border.f186default;
                gapComposer.end(false);
            } else if (z3) {
                gapComposer.startReplaceGroup(-76735318);
                com.squareup.cash.arcade.Colors colors2 = (com.squareup.cash.arcade.Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.component.input.border.selected;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-76733047);
                com.squareup.cash.arcade.Colors colors3 = (com.squareup.cash.arcade.Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors3.component.input.border.f186default;
                gapComposer.end(false);
            }
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj5 = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
            int ordinal = depositPreferenceStyle.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-76723834);
                label = new CellDefaultAccessory.Label(z2 ? new CellDefaultAccessory.AccessoryConfig(new Role(3), z3, z, 8) : new CellDefaultAccessory.AccessoryConfig((Role) null, z, z, 15), Expect_jvmKt.rememberComposableLambda(-135915371, new SliderDefaults$$ExternalSyntheticLambda0(depositPreferenceOption, z3, 11), gapComposer));
                gapComposer.end(false);
            } else {
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -76727005, false);
                }
                gapComposer.startReplaceGroup(-76680641);
                if (z2) {
                    gapComposer.startReplaceGroup(1917884632);
                    label = new CellDefaultAccessory.ButtonCompact(null, ButtonProminence.PROMINENT, false, Expect_jvmKt.rememberComposableLambda(945635846, new ShopErrorKt$$ExternalSyntheticLambda0(str, 9), gapComposer), 13);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1918053861);
                    gapComposer.end(false);
                    label = CellDefaultAccessory.Push.INSTANCE;
                }
                gapComposer.end(false);
            }
            CellDefaultAccessory cellDefaultAccessory = label;
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(ClipKt.clip(Modifier.Companion.$$INSTANCE, m340RoundedCornerShape0680j_4), f, j, m340RoundedCornerShape0680j_4);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1190867500, new WorkViewFactory$$ExternalSyntheticLambda12(10, depositPreferenceOption, depositPreferenceStyle), gapComposer);
            boolean changed2 = gapComposer.changed(function1) | gapComposer.changedInstance(depositPreferenceOption) | gapComposer.changedInstance(touchRecorder);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BasicShieetScope$$ExternalSyntheticLambda10(27, function1, depositPreferenceOption, touchRecorder);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, m178borderxT4_qwU, (Function0) rememberedValue2, false, true, null, null, 0L, cellDefaultAccessory, null, gapComposer, 196614, 1496);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        Color m;
        long j;
        AvatarImage.Remote.Image image;
        long j2;
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i2 = 0;
        i2 = 0;
        i2 = 0;
        Object obj3 = this.f$5;
        Object obj4 = this.f$4;
        Object obj5 = this.f$3;
        Object obj6 = this.f$2;
        Object obj7 = this.f$1;
        Object obj8 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                CardKt.SwipeToDismiss((DismissState) obj8, (Modifier) obj7, (Set) obj6, (Function1) obj5, (ComposableLambdaImpl) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(221569));
                return Unit.INSTANCE;
            case 1:
                LocalMenuComboDetailsPresenter localMenuComboDetailsPresenter = (LocalMenuComboDetailsPresenter) obj8;
                LocationMenu locationMenu = (LocationMenu) obj7;
                MenuItem menuItem = (MenuItem) obj5;
                MutableState mutableState = (MutableState) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                CartEntryWithQuantity.ClientCartEntryWithQuantity clientCartEntryWithQuantity = (CartEntryWithQuantity.ClientCartEntryWithQuantity) obj2;
                ((MenuItemDetailsQuestion) obj).getClass();
                clientCartEntryWithQuantity.getClass();
                LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext = clientCartEntryWithQuantity.analyticsContext;
                localClientCartMenuItemAddedContext.getClass();
                LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData menuItemAddedContextComboData = localClientCartMenuItemAddedContext.comboData;
                menuItemAddedContextComboData.getClass();
                LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.ComboSlotItemContextData comboSlotItemContextData = (LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.ComboSlotItemContextData) menuItemAddedContextComboData;
                String str = comboSlotItemContextData.slotToken;
                int i3 = comboSlotItemContextData.slotSectionIndex;
                CartEntry cartEntry = clientCartEntryWithQuantity.cartEntry;
                for (ComboSlot comboSlot : (ArrayList) obj6) {
                    if (Intrinsics.areEqual(comboSlot.token, str)) {
                        localMenuComboDetailsPresenter.m1214performSelectionr5FUkSU(locationMenu, comboSlot, i3, menuItem.name, cartEntry.menuItemToken, cartEntry.variationToken, cartEntry.modifierSelections, cartEntry.freeTextEntries, mutableState, mutableState2, true);
                        return Unit.INSTANCE;
                    }
                }
                OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                return null;
            case 2:
                ((Integer) obj2).getClass();
                LocalBrandLocationRowKt.m1313FinalCheckedInHeaderLayoutAFY4PWA((String) obj8, (String) obj6, (Modifier) obj7, (Function1) obj5, (Function1) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                InputHandlerKt.InputHandler((Function1) obj5, (Function1) obj8, (Function1) obj7, (Function1) obj6, (Function1) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                AbstractDecoder.MarkdownTable((String) obj8, (ASTNodeImpl) obj7, (TextStyle) obj6, (JWECryptoParts) obj5, (Function6) obj4, (Function6) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ScrollState scrollState = (ScrollState) obj6;
                PaddingValues paddingValues = (PaddingValues) obj5;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj4;
                State state = (State) obj3;
                SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj;
                Constraints constraints = (Constraints) obj2;
                subcomposeMeasureScope.getClass();
                List subcompose = subcomposeMeasureScope.subcompose(ReceiptScaffoldSlot.Footer, new ComposableLambdaImpl(new MenuPickerSheetKt$$ExternalSyntheticLambda4(24, (Function2) obj8, (State) obj7), true, -570356554));
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(subcompose, 10));
                Iterator it = subcompose.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Measurable) it.next()).mo833measureBRTryo0(constraints.value));
                }
                Placeable placeable = (Placeable) CollectionsKt.single((List) arrayList);
                Placeable mo833measureBRTryo0 = ((Measurable) CollectionsKt.single(subcomposeMeasureScope.subcompose(ReceiptScaffoldSlot.Content, new ComposableLambdaImpl(new AvatarsKt$$ExternalSyntheticLambda4(scrollState, paddingValues, subcomposeMeasureScope, placeable, composableLambdaImpl, 3), true, -315221286)))).mo833measureBRTryo0(constraints.value);
                return MeasureScope.layout$default(subcomposeMeasureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new n3$$ExternalSyntheticLambda0(scrollState, placeable, mo833measureBRTryo0, state, 18));
            case 6:
                ((Integer) obj2).getClass();
                ComposeLayoutInfoKt.ReceiptScaffold((Modifier) obj7, (ScrollState) obj8, (PaddingValues) obj6, (ComposableLambdaImpl) obj4, (Function2) obj5, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(199681));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                LegalSectionKt.CreditSectionHeader((Modifier) obj7, (AfterpayAppletHomeContentViewModel.HomeSection.AppletCreditLineType) obj8, (String) obj6, (String) obj5, (String) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                AmountPickerViewModel amountPickerViewModel = (AmountPickerViewModel) obj8;
                ThemeInfo themeInfo = (ThemeInfo) obj6;
                AmountConfig amountConfig = (AmountConfig) obj4;
                Function1 function1 = (Function1) obj5;
                Modifier modifier = (Modifier) obj7;
                Function3 function3 = (Function3) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    boolean z2 = (amountPickerViewModel instanceof AmountPickerViewModel.InitialLoading) || (amountPickerViewModel instanceof AmountPickerViewModel.Loading);
                    boolean changedInstance = gapComposer.changedInstance(amountPickerViewModel);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ContextKt$$ExternalSyntheticLambda1(amountPickerViewModel, 17);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Strings.LoadableFullScreenContent(amountPickerViewModel, z2, null, (Function1) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(1698522074, new SsnViewKt$$ExternalSyntheticLambda7(amountPickerViewModel, themeInfo, amountConfig, function1, modifier, function3), gapComposer), gapComposer, 196608, 20);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Modifier modifier2 = (Modifier) obj7;
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj4;
                com.squareup.cash.arcade.components.ScaffoldState scaffoldState = (com.squareup.cash.arcade.components.ScaffoldState) obj8;
                Function2 function2 = (Function2) obj6;
                ComposableLambdaImpl composableLambdaImpl3 = (ComposableLambdaImpl) obj3;
                ScrollableState scrollableState = (ScrollableState) obj5;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(modifier2, 1.0f);
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
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composableLambdaImpl2.invoke((Object) columnScopeInstance, (Object) gapComposer2, (Object) 6);
                    Modifier then = columnScopeInstance.weight(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), true).then(new LayoutBoundsElement(scaffoldState.contentViewPort));
                    BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, then);
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
                    composableLambdaImpl3.invoke(GenericScaffoldContentScope.INSTANCE, (Object) gapComposer2, (Object) 6);
                    gapComposer2.end(true);
                    if (function2 != null) {
                        gapComposer2.startReplaceGroup(-1800864260);
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                        function2.invoke(gapComposer2, 0);
                        if (scrollableState.getCanScrollForward()) {
                            gapComposer2.startReplaceGroup(25448483);
                            z = true;
                            ModalKt.HorizontalDivider(0, 1, gapComposer2, null);
                            gapComposer2.end(false);
                        } else {
                            z = true;
                            gapComposer2.startReplaceGroup(25491728);
                            gapComposer2.end(false);
                        }
                        gapComposer2.end(z);
                        gapComposer2.end(false);
                    } else {
                        z = true;
                        gapComposer2.startReplaceGroup(-1800692241);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(z);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj8;
                AddressState addressState = (AddressState) obj7;
                MutableState mutableState3 = (MutableState) obj6;
                Function1 function12 = (Function1) obj5;
                TouchRecorder touchRecorder = (TouchRecorder) obj4;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (!animatedContentScopeImpl.$$delegate_0.getTransition().isRunning() && !(addressState instanceof AddressState.Empty) && !(addressState instanceof AddressState.Searching)) {
                        i2 = 1;
                    }
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changedInstance2 = gapComposer3.changedInstance(addressState) | gapComposer3.changed(mutableState3) | gapComposer3.changed(function12) | gapComposer3.changedInstance(touchRecorder) | gapComposer3.changed(delegatingSoftwareKeyboardController);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ta$$ExternalSyntheticLambda1(addressState, function12, touchRecorder, delegatingSoftwareKeyboardController, mutableState3, 6);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth2, buttonProminence, false, i2, null, AmountBlockerViewKt.lambda$487618745, gapComposer3, 1573296, 40);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                VerifyAliasModel verifyAliasModel = (VerifyAliasModel) obj8;
                FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) obj7;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = (DelegatingSoftwareKeyboardController) obj6;
                Function1 function13 = (Function1) obj5;
                MutableState mutableState4 = (MutableState) obj4;
                VerifyAliasModel.ResendCodeButtonState resendCodeButtonState = (VerifyAliasModel.ResendCodeButtonState) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    com.squareup.cash.arcade.Colors colors = (com.squareup.cash.arcade.Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Strings.LoadableFullScreenContent(verifyAliasModel, verifyAliasModel.isLoading, SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1)), null, null, Expect_jvmKt.rememberComposableLambda(1217571649, new SsnViewKt$$ExternalSyntheticLambda7(verifyAliasModel, focusOwnerImpl, delegatingSoftwareKeyboardController2, function13, mutableState4, resendCodeButtonState), gapComposer4), gapComposer4, 196608, 24);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                VisibleKt.ArcadeInfoBlocker((String) obj8, (String) obj7, (AvatarEntry) obj6, (Function0) obj5, (Function0) obj4, (NavigationType) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                String str2 = (String) obj8;
                Function0 function0 = (Function0) obj7;
                com.squareup.protos.cash.ui.Color color = (com.squareup.protos.cash.ui.Color) obj6;
                Image image2 = (Image) obj5;
                Icons icons = (Icons) obj4;
                String str3 = (String) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(Modifier.Companion.$$INSTANCE, false, str2, null, function0, 13);
                    AvatarSize avatarSize = AvatarSize.Size48;
                    if (color == null) {
                        gapComposer5.startReplaceGroup(2000571198);
                        gapComposer5.end(false);
                        m = null;
                    } else {
                        m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer5, 341629219, color, gapComposer5, false);
                    }
                    if (m == null) {
                        gapComposer5.startReplaceGroup(341630911);
                        com.squareup.cash.arcade.Colors colors2 = (com.squareup.cash.arcade.Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                        } else {
                            gapComposer5.startReplaceGroup(-1762997739);
                            gapComposer5.end(false);
                        }
                        j = colors2.semantic.background.subtle;
                        gapComposer5.end(false);
                    } else {
                        gapComposer5.startReplaceGroup(341628865);
                        gapComposer5.end(false);
                        j = m.value;
                    }
                    long j3 = j;
                    if (image2 == null) {
                        gapComposer5.startReplaceGroup(2000714976);
                        gapComposer5.end(false);
                        image = null;
                    } else {
                        gapComposer5.startReplaceGroup(2000714977);
                        image = new AvatarImage.Remote.Image(ThemablesKt.urlForTheme(image2, gapComposer5), false, null, 0L, new GlobalSearchCellKt$$ExternalSyntheticLambda6(1), 62);
                        gapComposer5.end(false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, str3, j3, (String) null, m183clickableoSLSa3U$default, (AvatarImage) image, (Function2) null, (AvatarOverlay) (icons != null ? new AvatarOverlay.LocalIcon(6, 0L, 0L, icons) : null), false, 0L, (Composer) gapComposer5, 3078, 0, 1856);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                GenieStateBinding genieStateBinding = (GenieStateBinding) obj8;
                Modifier modifier3 = (Modifier) obj7;
                TextStyle textStyle = (TextStyle) obj6;
                MutableState mutableState5 = (MutableState) obj5;
                String str4 = (String) obj4;
                DatePickerStateImpl datePickerStateImpl = (DatePickerStateImpl) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    String str5 = (String) genieStateBinding.getValue();
                    Object rememberedValue3 = gapComposer6.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new CashMapViewKt$$ExternalSyntheticLambda2(12, mutableState5);
                        gapComposer6.updateRememberedValue(rememberedValue3);
                    }
                    Modifier m183clickableoSLSa3U$default2 = ImageKt.m183clickableoSLSa3U$default(modifier3, false, null, null, (Function0) rememberedValue3, 15);
                    Object rememberedValue4 = gapComposer6.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new MoneyTabUIKt$$ExternalSyntheticLambda13(18);
                        gapComposer6.updateRememberedValue(rememberedValue4);
                    }
                    MenuKt.OutlinedTextField(str5, (Function1) rememberedValue4, m183clickableoSLSa3U$default2, false, true, textStyle, Expect_jvmKt.rememberComposableLambda(2100809043, new DatePickerViewKt$$ExternalSyntheticLambda4(str4, textStyle, i2), gapComposer6), Expect_jvmKt.rememberComposableLambda(60133938, new DatePickerViewKt$$ExternalSyntheticLambda5(textStyle), gapComposer6), null, null, null, 0, 0, null, null, gapComposer6, 14180400, 8388360);
                    if (((Boolean) mutableState5.getValue()).booleanValue()) {
                        gapComposer6.startReplaceGroup(-189463967);
                        Object rememberedValue5 = gapComposer6.rememberedValue();
                        if (rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new CashMapViewKt$$ExternalSyntheticLambda2(13, mutableState5);
                            gapComposer6.updateRememberedValue(rememberedValue5);
                        }
                        DatePickerDialog_androidKt.m524DatePickerDialogGmEhDVc((Function0) rememberedValue5, Expect_jvmKt.rememberComposableLambda(1952544742, new MoneyUiFactory$$ExternalSyntheticLambda1(datePickerStateImpl, genieStateBinding, mutableState5, textStyle, 24), gapComposer6), null, Expect_jvmKt.rememberComposableLambda(638714856, new HypeWelcomeUIKt$$ExternalSyntheticLambda0(28, mutableState5, textStyle), gapComposer6), null, null, null, Expect_jvmKt.rememberComposableLambda(-1328471683, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(datePickerStateImpl, 20), gapComposer6), gapComposer6, 100666422);
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(-188933495);
                        gapComposer6.end(false);
                    }
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Modifier modifier4 = (Modifier) obj7;
                MutableState mutableState6 = (MutableState) obj8;
                String str6 = (String) obj6;
                GenieStateBinding genieStateBinding2 = (GenieStateBinding) obj5;
                TextStyle textStyle2 = (TextStyle) obj4;
                List list = (List) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode4 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer7, modifier4);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer7.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, maybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    Object rememberedValue6 = gapComposer7.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new CashMapViewKt$$ExternalSyntheticLambda2(14, mutableState6);
                        gapComposer7.updateRememberedValue(rememberedValue6);
                    }
                    MenuKt.TextButton((Function0) rememberedValue6, null, false, null, null, null, Expect_jvmKt.rememberComposableLambda(-837359992, new PoolToastKt$$ExternalSyntheticLambda0(12, (Serializable) str6, (Object) genieStateBinding2, (Object) textStyle2), gapComposer7), gapComposer7, 805306374, 510);
                    boolean booleanValue = ((Boolean) mutableState6.getValue()).booleanValue();
                    Object rememberedValue7 = gapComposer7.rememberedValue();
                    if (rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new CashMapViewKt$$ExternalSyntheticLambda2(15, mutableState6);
                        gapComposer7.updateRememberedValue(rememberedValue7);
                    }
                    androidx.compose.material3.AndroidMenu_androidKt.m516DropdownMenuIlH_yew(booleanValue, (Function0) rememberedValue7, null, 0L, null, null, null, 0L, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(1963322608, new BasicShieetScope$$ExternalSyntheticLambda0(list, genieStateBinding2, textStyle2, mutableState6, 2), gapComposer7), gapComposer7, 48, 2044);
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                MoneybotMarkdownKt.MoneybotMarkdownTable((String) obj8, (ASTNodeImpl) obj7, (TextStyle) obj6, (JWECryptoParts) obj5, (Function5) obj4, (Function6) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                zzafd.OnboardingLandingMedia((String) obj8, (String) obj6, (RealImageLoader) obj4, (Function1) obj5, (Function1) obj3, (Modifier) obj7, (Composer) obj, Updater.updateChangedFlags(196609));
                return Unit.INSTANCE;
            case 18:
                CoreFlowRealSheetState coreFlowRealSheetState = (CoreFlowRealSheetState) obj8;
                Function0 function02 = (Function0) obj6;
                CoreFlowSheetPeekPosition$FixedHeight coreFlowSheetPeekPosition$FixedHeight = (CoreFlowSheetPeekPosition$FixedHeight) obj5;
                Modifier modifier5 = (Modifier) obj7;
                AnimatedVisibilityScope animatedVisibilityScope = (AnimatedVisibilityScope) obj3;
                ComposableLambdaImpl composableLambdaImpl4 = (ComposableLambdaImpl) obj4;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Locale_jvmAndAndroidKt.CoreFlowBasicShieet(coreFlowRealSheetState, function02, coreFlowSheetPeekPosition$FixedHeight, modifier5, animatedVisibilityScope, (SharedTransitionScope) gapComposer8.consume(UiScopeKt.LocalContainerSharedTransitionScope), Expect_jvmKt.rememberComposableLambda(-1095257250, new OverlayKt$$ExternalSyntheticLambda0(composableLambdaImpl4, 27), gapComposer8), gapComposer8, 1572864);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                NearbyPayRequestViewKt.InstrumentInformation((Function0) obj8, (String) obj6, (String) obj5, (InstrumentAvatarViewModel) obj4, (RealImageLoader) obj3, (Modifier) obj7, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj8;
                ProfileHeaderViewModel profileHeaderViewModel = (ProfileHeaderViewModel) obj7;
                Function0 function03 = (Function0) obj6;
                Character ch = (Character) obj5;
                Color color2 = (Color) obj4;
                AvatarImage.Remote.Image image3 = (AvatarImage.Remote.Image) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(Modifier.Companion.$$INSTANCE, mutableInteractionSourceImpl, com.squareup.cash.arcade.theme.RippleKt.m3400rippleYJYuY3k(0L, false, 48.0f, null, gapComposer9, 432, 9), profileHeaderViewModel.isAvatarClickable, null, null, function03, 24);
                    AvatarSize avatarSize2 = AvatarSize.Size64;
                    String valueOf2 = String.valueOf(ch);
                    if (color2 == null) {
                        gapComposer9.startReplaceGroup(1380771033);
                        com.squareup.cash.arcade.Colors colors3 = (com.squareup.cash.arcade.Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                        } else {
                            gapComposer9.startReplaceGroup(-1762997739);
                            gapComposer9.end(false);
                        }
                        j2 = colors3.semantic.background.standard;
                        gapComposer9.end(false);
                    } else {
                        gapComposer9.startReplaceGroup(1380769235);
                        gapComposer9.end(false);
                        j2 = color2.value;
                    }
                    long j4 = j2;
                    Icons icons2 = profileHeaderViewModel.badgeIcon;
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize2, valueOf2, j4, profileHeaderViewModel.avatarContentDescription, m182clickableO2vRcR0$default, (AvatarImage) image3, (Function2) null, (AvatarOverlay) (icons2 != null ? new AvatarOverlay.LocalIcon(14, 0L, 0L, icons2) : null), false, 0L, (Composer) gapComposer9, 6, 0, 1856);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                SavingsScreenViewModel.Content.SavingsScreenElement savingsScreenElement = (SavingsScreenViewModel.Content.SavingsScreenElement) obj8;
                Modifier modifier6 = (Modifier) obj7;
                ScreenScaffoldContentScope screenScaffoldContentScope = (ScreenScaffoldContentScope) obj6;
                Shaker shaker = (Shaker) obj4;
                Function1 function14 = (Function1) obj5;
                Function1 function15 = (Function1) obj3;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader = (SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader) savingsScreenElement;
                    String str7 = savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.pageHeader;
                    if (str7 == null || StringsKt.isBlank(str7)) {
                        gapComposer10.startReplaceGroup(880400348);
                        gapComposer10.end(false);
                    } else {
                        gapComposer10.startReplaceGroup(880398524);
                        modifier6 = ScreenScaffoldKt.markAsScaffoldTitle(modifier6, screenScaffoldContentScope, gapComposer10, 0);
                        gapComposer10.end(false);
                    }
                    SavingsScreenHeaderKt.GoalHeader(savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader, modifier6, shaker, function14, function15, gapComposer10, 0);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                MutableState mutableState7 = (MutableState) obj8;
                FocusRequester focusRequester = (FocusRequester) obj7;
                View view = (View) obj6;
                Function1 function16 = (Function1) obj5;
                BrandsSearchViewModel brandsSearchViewModel = (BrandsSearchViewModel) obj4;
                P2PListView p2PListView = (P2PListView) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                    AndroidWindowInsets androidWindowInsets = Arrangement$End$1.current(gapComposer11).systemBars;
                    int i4 = OffsetKt.Horizontal;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SpacerKt.imePadding(SpacerKt.navigationBarsPadding(OffsetKt.windowInsetsPadding(companion, new LimitInsets(androidWindowInsets, 15 | 16)))), MooncakeTheme.getColors(gapComposer11).background, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer11, 0);
                    int hashCode5 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer11.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer11, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
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
                    Updater.m576setimpl(gapComposer11, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer11, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer11, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer11, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer11, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    SpacerKt.Spacer(gapComposer11, SizeKt.m277height3ABfNKs(companion, 4.0f));
                    String str8 = (String) mutableState7.getValue();
                    String stringResource = Room.stringResource(gapComposer11, R.string.brands_search_bar_hint);
                    boolean changed = gapComposer11.changed(mutableState7);
                    Object rememberedValue8 = gapComposer11.rememberedValue();
                    if (changed || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new TabToolbarsKt$$ExternalSyntheticLambda10(9, mutableState7);
                        gapComposer11.updateRememberedValue(rememberedValue8);
                    }
                    Function1 function17 = (Function1) rememberedValue8;
                    boolean changedInstance3 = gapComposer11.changedInstance(view);
                    Object rememberedValue9 = gapComposer11.rememberedValue();
                    if (changedInstance3 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new BrandsSearchView$$ExternalSyntheticLambda4(view, 0);
                        gapComposer11.updateRememberedValue(rememberedValue9);
                    }
                    Function1 function18 = (Function1) rememberedValue9;
                    boolean changed2 = gapComposer11.changed(mutableState7);
                    Object rememberedValue10 = gapComposer11.rememberedValue();
                    if (changed2 || rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new OverlayKt$$ExternalSyntheticLambda1(18, mutableState7);
                        gapComposer11.updateRememberedValue(rememberedValue10);
                    }
                    Function0 function04 = (Function0) rememberedValue10;
                    boolean changed3 = gapComposer11.changed(function16);
                    Object rememberedValue11 = gapComposer11.rememberedValue();
                    if (changed3 || rememberedValue11 == neverEqualPolicy) {
                        rememberedValue11 = new BrandsSearchView$$ExternalSyntheticLambda6(0, function16);
                        gapComposer11.updateRememberedValue(rememberedValue11);
                    }
                    ShopErrorKt.ShopHubToolbar(str8, stringResource, function17, null, focusRequester, function18, function04, (Function0) rememberedValue11, null, gapComposer11, 24576, EnumC0170g.SDK_ASSET_ICON_PLAID_LOGO_VALUE);
                    SpacerKt.Spacer(gapComposer11, SizeKt.m277height3ABfNKs(companion, 4.0f));
                    if (brandsSearchViewModel instanceof BrandsSearchViewModel.Loading) {
                        gapComposer11.startReplaceGroup(1061024167);
                        ShopErrorKt.ShopLoadingProgress(SizeKt.fillMaxSize(companion, 1.0f), gapComposer11, 6);
                        gapComposer11.end(false);
                    } else {
                        if (!(brandsSearchViewModel instanceof BrandsSearchViewModel.Loaded)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer11, 1061023888, false);
                        }
                        gapComposer11.startReplaceGroup(-1467885711);
                        BrandsSearchViewModel.Loaded loaded = (BrandsSearchViewModel.Loaded) brandsSearchViewModel;
                        if (loaded.error != null) {
                            gapComposer11.startReplaceGroup(-1467861283);
                            String stringResource2 = Room.stringResource(gapComposer11, R.string.shop_error_title);
                            String stringResource3 = Room.stringResource(gapComposer11, R.string.shop_search_error_message);
                            String stringResource4 = Room.stringResource(gapComposer11, R.string.shop_retry_button_text);
                            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 16.0f);
                            boolean changed4 = gapComposer11.changed(function16);
                            Object rememberedValue12 = gapComposer11.rememberedValue();
                            if (changed4 || rememberedValue12 == neverEqualPolicy) {
                                rememberedValue12 = new BrandsSearchView$$ExternalSyntheticLambda6(19, function16);
                                gapComposer11.updateRememberedValue(rememberedValue12);
                            }
                            ShopErrorKt.ShopError(3072, gapComposer11, m299paddingVpY3zN4, stringResource2, stringResource3, stringResource4, (Function0) rememberedValue12);
                            gapComposer11.end(false);
                        } else {
                            gapComposer11.startReplaceGroup(-1467423842);
                            Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), MooncakeTheme.getColors(gapComposer11).background, rectangleShapeKt$RectangleShape$1);
                            List list2 = loaded.items;
                            RealImageLoader realImageLoader = p2PListView.imageLoader;
                            Object rememberedValue13 = gapComposer11.rememberedValue();
                            if (rememberedValue13 == neverEqualPolicy) {
                                rememberedValue13 = new RealSheetState$$ExternalSyntheticLambda0(25);
                                gapComposer11.updateRememberedValue(rememberedValue13);
                            }
                            Function1 function19 = (Function1) rememberedValue13;
                            boolean changedInstance4 = gapComposer11.changedInstance(view);
                            Object rememberedValue14 = gapComposer11.rememberedValue();
                            if (changedInstance4 || rememberedValue14 == neverEqualPolicy) {
                                rememberedValue14 = new BrandsSearchView$$ExternalSyntheticLambda9(view, 0);
                                gapComposer11.updateRememberedValue(rememberedValue14);
                            }
                            ShopMessageKt.ShopHubResultsList(m177backgroundbw27NRU2, list2, realImageLoader, function19, (Function0) rememberedValue14, function16, gapComposer11, 3072);
                            gapComposer11.end(false);
                        }
                        gapComposer11.end(false);
                    }
                    gapComposer11.end(true);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                return invoke$com$squareup$cash$shopping$views$ProductSearchView$$ExternalSyntheticLambda1(obj, obj2);
            case 24:
                ((Integer) obj2).getClass();
                ShopMessageKt.ShopHubResultsList((Modifier) obj7, (List) obj8, (RealImageLoader) obj6, (Function1) obj5, (Function0) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(3073));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                MessageFileKt.MessageBodyActivity((BodyViewModel$ActivityBodyViewModel) obj8, (SupportActivityItemLoader) obj6, (RealImageLoader) obj4, (Function1) obj5, (Modifier) obj7, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(196609));
                return Unit.INSTANCE;
            case 26:
                return invoke$com$squareup$cash$support$chat$views$transcript$message$compose$MessageFileKt$$ExternalSyntheticLambda0(obj, obj2);
            case 27:
                return invoke$com$squareup$cash$support$chat$views$transcript$message$compose$MessageTextCustomerKt$$ExternalSyntheticLambda1(obj, obj2);
            case 28:
                return invoke$com$squareup$cash$transfers$views$WithdrawViewKt$$ExternalSyntheticLambda12(obj, obj2);
            default:
                CardAppletTileViewModel.CardPillViewModel cardPillViewModel = (CardAppletTileViewModel.CardPillViewModel) obj8;
                CardPillTheme cardPillTheme = (CardPillTheme) obj7;
                State state2 = (State) obj6;
                State state3 = (State) obj5;
                State state4 = (State) obj4;
                HazeState hazeState = (HazeState) obj3;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    CrossfadeKt.Crossfade(new Pair(cardPillViewModel, cardPillTheme), BoxScopeInstance.INSTANCE.matchParentSize(), CardNuxAnimationsKt.DEFAULT_REVOLVING_CROSSFADE, (String) null, Expect_jvmKt.rememberComposableLambda(-2013636794, new BasicShieetScope$$ExternalSyntheticLambda0(state2, state3, state4, hazeState, 11), gapComposer12), gapComposer12, 24576, 8);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SwipeToDismissKt$$ExternalSyntheticLambda3(Modifier modifier, ScrollState scrollState, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, Function2 function2, ComposableLambdaImpl composableLambdaImpl2, int i) {
        this.$r8$classId = 6;
        this.f$1 = modifier;
        this.f$0 = scrollState;
        this.f$2 = paddingValues;
        this.f$4 = composableLambdaImpl;
        this.f$3 = function2;
        this.f$5 = composableLambdaImpl2;
    }

    public /* synthetic */ SwipeToDismissKt$$ExternalSyntheticLambda3(int i, int i2, Modifier modifier, Object obj, Object obj2, Object obj3, Object obj4, Function function) {
        this.$r8$classId = i2;
        this.f$1 = modifier;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
        this.f$5 = function;
    }

    public /* synthetic */ SwipeToDismissKt$$ExternalSyntheticLambda3(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, com.squareup.cash.arcade.components.ScaffoldState scaffoldState, Function2 function2, ComposableLambdaImpl composableLambdaImpl2, ScrollableState scrollableState) {
        this.$r8$classId = 9;
        this.f$1 = modifier;
        this.f$4 = composableLambdaImpl;
        this.f$0 = scaffoldState;
        this.f$2 = function2;
        this.f$5 = composableLambdaImpl2;
        this.f$3 = scrollableState;
    }

    public /* synthetic */ SwipeToDismissKt$$ExternalSyntheticLambda3(AmountPickerViewModel amountPickerViewModel, ThemeInfo themeInfo, AmountConfig amountConfig, Function1 function1, Modifier modifier, Function3 function3) {
        this.$r8$classId = 8;
        this.f$0 = amountPickerViewModel;
        this.f$2 = themeInfo;
        this.f$4 = amountConfig;
        this.f$3 = function1;
        this.f$1 = modifier;
        this.f$5 = function3;
    }

    public /* synthetic */ SwipeToDismissKt$$ExternalSyntheticLambda3(VerifyAliasModel verifyAliasModel, FocusOwnerImpl focusOwnerImpl, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, Function1 function1, MutableState mutableState, VerifyAliasModel.ResendCodeButtonState resendCodeButtonState) {
        this.$r8$classId = 11;
        this.f$0 = verifyAliasModel;
        this.f$1 = focusOwnerImpl;
        this.f$2 = delegatingSoftwareKeyboardController;
        this.f$3 = function1;
        this.f$4 = mutableState;
        this.f$5 = resendCodeButtonState;
    }

    public /* synthetic */ SwipeToDismissKt$$ExternalSyntheticLambda3(CoreFlowRealSheetState coreFlowRealSheetState, Function0 function0, CoreFlowSheetPeekPosition$FixedHeight coreFlowSheetPeekPosition$FixedHeight, Modifier modifier, AnimatedVisibilityScope animatedVisibilityScope, ComposableLambdaImpl composableLambdaImpl) {
        this.$r8$classId = 18;
        this.f$0 = coreFlowRealSheetState;
        this.f$2 = function0;
        this.f$3 = coreFlowSheetPeekPosition$FixedHeight;
        this.f$1 = modifier;
        this.f$5 = animatedVisibilityScope;
        this.f$4 = composableLambdaImpl;
    }

    public /* synthetic */ SwipeToDismissKt$$ExternalSyntheticLambda3(BodyViewModel$ActivityBodyViewModel bodyViewModel$ActivityBodyViewModel, SupportActivityItemLoader supportActivityItemLoader, RealImageLoader realImageLoader, Function1 function1, Modifier modifier, Function0 function0, int i) {
        this.$r8$classId = 25;
        this.f$0 = bodyViewModel$ActivityBodyViewModel;
        this.f$2 = supportActivityItemLoader;
        this.f$4 = realImageLoader;
        this.f$3 = function1;
        this.f$1 = modifier;
        this.f$5 = function0;
    }

    public /* synthetic */ SwipeToDismissKt$$ExternalSyntheticLambda3(ChatContentViewModel.MessageViewModel messageViewModel, Function1 function1, Function1 function12, MutableState mutableState, ViewModelKt viewModelKt, MutableState mutableState2, int i) {
        this.$r8$classId = i;
        this.f$0 = messageViewModel;
        this.f$3 = function1;
        this.f$1 = function12;
        this.f$2 = mutableState;
        this.f$4 = viewModelKt;
        this.f$5 = mutableState2;
    }

    public /* synthetic */ SwipeToDismissKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
    }

    public /* synthetic */ SwipeToDismissKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, Object obj4, Function function, Object obj5, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = function;
        this.f$5 = obj5;
    }

    public /* synthetic */ SwipeToDismissKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, Object obj4, Function1 function1, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = obj4;
        this.f$3 = function1;
        this.f$5 = obj5;
    }

    public /* synthetic */ SwipeToDismissKt$$ExternalSyntheticLambda3(String str, String str2, Modifier modifier, Function1 function1, Function1 function12, Function1 function13, int i) {
        this.$r8$classId = 2;
        this.f$0 = str;
        this.f$2 = str2;
        this.f$1 = modifier;
        this.f$3 = function1;
        this.f$4 = function12;
        this.f$5 = function13;
    }

    public /* synthetic */ SwipeToDismissKt$$ExternalSyntheticLambda3(String str, String str2, RealImageLoader realImageLoader, Function1 function1, Function1 function12, Modifier modifier, int i) {
        this.$r8$classId = 17;
        this.f$0 = str;
        this.f$2 = str2;
        this.f$4 = realImageLoader;
        this.f$3 = function1;
        this.f$5 = function12;
        this.f$1 = modifier;
    }

    public /* synthetic */ SwipeToDismissKt$$ExternalSyntheticLambda3(Function0 function0, String str, String str2, InstrumentAvatarViewModel instrumentAvatarViewModel, RealImageLoader realImageLoader, Modifier modifier, int i) {
        this.$r8$classId = 19;
        this.f$0 = function0;
        this.f$2 = str;
        this.f$3 = str2;
        this.f$4 = instrumentAvatarViewModel;
        this.f$5 = realImageLoader;
        this.f$1 = modifier;
    }

    public /* synthetic */ SwipeToDismissKt$$ExternalSyntheticLambda3(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, int i) {
        this.$r8$classId = 3;
        this.f$3 = function1;
        this.f$0 = function12;
        this.f$1 = function13;
        this.f$2 = function14;
        this.f$4 = function15;
        this.f$5 = function16;
    }
}
