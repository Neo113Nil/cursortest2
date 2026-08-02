package app.cash.local.views;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.material.DrawerKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.screen.Screen;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.inputfieldtext.composeui.TextFieldStateInputFieldText;
import app.cash.local.viewmodels.LocalBrandLocationHoursContentModel;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.viewmodels.LocalCashBalanceViewModel;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewModel;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewModel;
import app.cash.local.viewmodels.ToolbarModel;
import app.cash.local.viewmodels.sheet.EducationalSheetModelList;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import app.cash.local.views.brand.profile.LocalBrandLocationRowKt;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda28;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda0;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.sheet.LoyaltySheetKt;
import app.cash.local.views.toolbar.LocalToolbarKt;
import app.cash.local.views.wallet.LocalHomeViewKt;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda45;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda6;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.Modifier$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.q2$$ExternalSyntheticLambda8;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.LocalImageLoaderKt;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.fillr.s;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.plaid.internal.EnumC0170g;
import com.squareup.address.typeahead.views.AddressModel;
import com.squareup.address.typeahead.views.AddressTypeaheadKt;
import com.squareup.address.typeahead.views.AddressTypeaheadState;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.views.SectionHeaderScope;
import com.squareup.cash.advertising.views.AdUiFactory;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.bindings.timeline.TimelineProtoBindingKt;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.components.list.ListUnorderedItem;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda2;
import com.squareup.cash.benefits.viewmodels.BenefitsHomeViewModel;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.SendStablecoinModel;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.bitcoin.views.exchange.BitcoinExchangeViewKt;
import com.squareup.cash.bitcoin.views.stablecoin.SendStablecoinViewKt;
import com.squareup.cash.blockers.views.SetPinViewKt$SetPin$3$1$1$1;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.borrow.views.BorrowUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.borrow.views.LoanDetailsSheetKt;
import com.squareup.cash.borrow.views.LoanDetailsSheetState;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.card.onboarding.DisclosureView$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.DisclosureViewKt;
import com.squareup.cash.card.onboarding.DisclosureViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.card.onboarding.DisclosureViewModel;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda6;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackKt$spacedBetween$1;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositManualFormCompletionViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositUpdateManualFormDetailsViewModel;
import com.squareup.cash.directdeposit.views.directdeposit.DirectDepositFormErrorKt;
import com.squareup.cash.directdeposit.views.directdeposit.DirectDepositUpdateManualFormDetailsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.earnings.views.home.EarningsHeaderKt$$ExternalSyntheticLambda2;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorViewModel;
import com.squareup.cash.family.requestsponsorship.views.SelectSponsorViewKt;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda3;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import com.squareup.cash.instruments.views.InstrumentCellKt;
import com.squareup.cash.investing.components.ArcadeBordersKt;
import com.squareup.cash.investing.components.InvestingStockSelectionView$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryFilterViewModel;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.tabs.views.SharedToolbarSwipeScope;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalText;
import com.squareup.protos.franklin.api.DisclosureBlocker;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.internal.Tags;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalViewFactory$$ExternalSyntheticLambda4 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ LocalViewFactory$$ExternalSyntheticLambda4(SendStablecoinModel sendStablecoinModel, Function1 function1) {
        this.$r8$classId = 17;
        this.f$0 = sendStablecoinModel;
        this.f$1 = function1;
    }

    private final Object invoke$app$cash$local$views$wallet$TabContentViewKt$$ExternalSyntheticLambda43(Object obj, Object obj2, Object obj3, Object obj4) {
        Modifier.Companion companion;
        int i;
        int i2;
        LocalHomeViewModel.TabContent.Widget.LocalCashIncentive localCashIncentive = (LocalHomeViewModel.TabContent.Widget.LocalCashIncentive) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((ColumnScope) obj).getClass();
        ((PaddingValues) obj2).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new AdaptiveStackKt$spacedBetween$1(24.0f), Alignment.Companion.Start, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Color color = null;
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
            LocalImage localImage = localCashIncentive.heroImage;
            if (localImage == null) {
                gapComposer.startReplaceGroup(27900650);
                gapComposer.end(false);
                companion = companion2;
            } else {
                gapComposer.startReplaceGroup(27900651);
                Modifier clip = ClipKt.clip(SizeKt.fillMaxWidth(companion2, 1.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(30.0f));
                LocalColor localColor = localImage.placeholder_color;
                if (localColor == null) {
                    gapComposer.startReplaceGroup(-1842418144);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(356209153);
                    color = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, LocalViewsKt.toComposeColor(localColor, gapComposer, 0));
                }
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, color != null ? color.value : Color.Unspecified, ColorKt.RectangleShape);
                Float ratio = LocalViewsKt.getRatio(localImage);
                companion = companion2;
                LocalMapKt.LocalAsyncImage(m177backgroundbw27NRU, OffsetKt.aspectRatio(ratio != null ? ratio.floatValue() : 1.0f, companion2, false), LocalViewsKt.getThemedUrl(localImage, gapComposer), ContentScale.Companion.Fit, Alignment.Companion.Center, null, null, gapComposer, 27648, 96);
                gapComposer.end(false);
            }
            String str = localCashIncentive.headline;
            if (str == null) {
                gapComposer.startReplaceGroup(28336448);
                gapComposer.end(false);
                i = -1762997739;
                i2 = -1762997026;
            } else {
                gapComposer.startReplaceGroup(28336449);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).headlineLarge;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                i = -1762997739;
                i2 = -1762997026;
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer, fillMaxWidth, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            String str2 = localCashIncentive.body;
            if (str2 == null) {
                gapComposer.startReplaceGroup(28593035);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(28593036);
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                TextStyle textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, i2, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(i);
                    gapComposer.end(false);
                }
                GapComposer gapComposer2 = gapComposer;
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors2.semantic.text.disabled, (Composer) gapComposer2, fillMaxWidth2, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            }
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandSheetViewKt$$ExternalSyntheticLambda0(27, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, m302paddingqDBjuR0$default, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1701270963, new SliderDefaults$$ExternalSyntheticLambda3(localCashIncentive, 28), gapComposer), gapComposer, 1573296, 56);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$app$cash$local$views$wallet$TabContentViewKt$$ExternalSyntheticLambda46(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        Modifier.Companion companion;
        Function1 function1 = (Function1) this.f$0;
        LocalHomeViewModel.TabContent.Widget.PastOrders.PastOrder pastOrder = (LocalHomeViewModel.TabContent.Widget.PastOrders.PastOrder) this.f$1;
        Composer composer = (Composer) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((ColumnScope) obj).getClass();
        ((PaddingValues) obj2).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128);
        Applier applier = gapComposer.applier;
        if (shouldExecute) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            BiasAlignment.Vertical vertical = Alignment.Companion.Top;
            Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier weight = rowScopeInstance.weight(1.0f, companion2, true);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, weight);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelSmall, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_orders), (Map) null, (Function1) null, false);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion2);
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
            String str = pastOrder.brandName;
            int i = pastOrder.itemCount;
            LocalText localText = pastOrder.estimatedPickupCompletionTime;
            String str2 = pastOrder.completedAt;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            GapComposer gapComposer2 = gapComposer;
            if (StringsKt.isBlank(str2)) {
                gapComposer2.startReplaceGroup(-1770196220);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-1770423016);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).bodySmall, (TextLineBalancing) null, " · ".concat(str2), (Map) null, (Function1) null, false);
                gapComposer2 = gapComposer2;
                gapComposer2.end(false);
            }
            Boxes$$ExternalSyntheticOutline1.m(gapComposer2, true, true, true);
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion2, 1.0f), RecyclerView.DECELERATION_RATE, 16.0f, 1), 80.0f, RecyclerView.DECELERATION_RATE, 2);
            RowMeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer2, 54);
            int hashCode4 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer2, m279heightInVpY3zN4$default);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier4, composeUiNode$Companion$SetModifier$14);
            Modifier weight2 = rowScopeInstance.weight(1.0f, companion2, true);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode5 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer2, weight2);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier5, composeUiNode$Companion$SetModifier$14);
            GapComposer gapComposer3 = gapComposer2;
            zzacn.m2012AutoScaleTextZLomxE(2, 0, 0, 1597440, 418, Strings.getColors(gapComposer2).semantic.text.standard, Room.getSp(8), gapComposer3, null, Strings.getTypography(gapComposer2).marketingCardTitleLarge, pastOrder.itemsTitle, null);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, 2.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            RowMeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer3, 0);
            int hashCode6 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer3, m302paddingqDBjuR0$default);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, rowMeasurePolicy4, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode6, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier6, composeUiNode$Companion$SetModifier$14);
            String format2 = new MessageFormat(Room.stringResource(gapComposer3, R.string.local_views_items_count)).format(NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(i), "count"));
            format2.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer3).semantic.text.standard, (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer3).bodySmall, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
            GapComposer gapComposer4 = gapComposer3;
            String str3 = localText != null ? localText.text : null;
            if (str3 == null || StringsKt.isBlank(str3)) {
                z = false;
                gapComposer4.startReplaceGroup(-340040531);
                gapComposer4.end(false);
            } else {
                gapComposer4.startReplaceGroup(-340423970);
                gapComposer4.startReplaceGroup(-1673547427);
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                builder.append(" · ");
                localText.getClass();
                builder.append(LocalViewsKt.toAnnotatedString(localText, gapComposer4));
                AnnotatedString annotatedString = builder.toAnnotatedString();
                gapComposer4.end(false);
                Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer4).semantic.text.subtle, (Composer) gapComposer4, (Modifier) null, annotatedString, Strings.getTypography(gapComposer4).bodySmall, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                gapComposer4 = gapComposer4;
                z = false;
                gapComposer4.end(false);
            }
            gapComposer4.end(true);
            gapComposer4.end(true);
            LocalImage localImage = pastOrder.itemImage;
            if (localImage == null) {
                gapComposer4.startReplaceGroup(1641208762);
                gapComposer4.end(z);
                companion = companion2;
            } else {
                gapComposer4.startReplaceGroup(1641208763);
                companion = companion2;
                Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(16.0f, SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion2, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 80.0f), Strings.getColors(gapComposer4).semantic.background.subtle, 10.0f);
                int min = Math.min(3, i);
                ArrayList arrayList = new ArrayList(min);
                for (int i2 = 0; i2 < min; i2++) {
                    arrayList.add(localImage);
                }
                LocalMapKt.LocalStackedImage(m, arrayList, 0, LocalMapKt.m1323singleImageStackrAjV9yQ(i, gapComposer4), ContentScale.Companion.FillBounds, gapComposer4, 24576, 4);
                gapComposer4.end(false);
            }
            gapComposer4.end(true);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean changed = gapComposer4.changed(function1) | gapComposer4.changedInstance(pastOrder);
            Object rememberedValue = gapComposer4.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TabContentViewKt$$ExternalSyntheticLambda45(function1, pastOrder, 1);
                gapComposer4.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.Button((Function0) rememberedValue, fillMaxWidth2, null, false, false, null, Expect_jvmKt.rememberComposableLambda(1702880845, new SliderDefaults$$ExternalSyntheticLambda3(pastOrder, 29), gapComposer4), gapComposer4, 1572912, 60);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.compose.ui.Modifier] */
    private final Object invoke$app$cash$local$views$wallet$TabContentViewKt$$ExternalSyntheticLambda51(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        long j;
        Function1 function1 = (Function1) this.f$0;
        LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder activeOrder = (LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder) this.f$1;
        Composer composer = (Composer) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((ColumnScope) obj).getClass();
        ((PaddingValues) obj2).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128);
        Applier applier = gapComposer.applier;
        if (shouldExecute) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            BiasAlignment.Vertical vertical = Alignment.Companion.Top;
            Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Color color = null;
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier weight = rowScopeInstance.weight(1.0f, companion, true);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, weight);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelSmall, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_orders), (Map) null, (Function1) null, false);
            String str = activeOrder.metadataText;
            if (str == null) {
                str = activeOrder.brandName;
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TabContentViewKt$$ExternalSyntheticLambda6(1, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, (Function0) rememberedValue, 15);
            BiasAlignment.Vertical vertical2 = Alignment.Companion.CenterVertically;
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical2, gapComposer, 48);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m183clickableoSLSa3U$default);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_all), (Map) null, (Function1) null, false);
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 16.0f);
            Painter painter = Icons.SubtlePush16.painter(gapComposer);
            long j2 = Strings.getColors(gapComposer).semantic.icon.standard;
            ImageKt.Image(painter, null, m285size3ABfNKs, null, ContentScale.Companion.FillBounds, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 25008, 40);
            gapComposer.end(true);
            gapComposer.end(true);
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 28.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 72.0f, RecyclerView.DECELERATION_RATE, 2);
            RowMeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical2, gapComposer, 48);
            int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m279heightInVpY3zN4$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
            LocalHomeViewKt.ActiveOrderDetails(rowScopeInstance.weight(1.0f, companion, true), activeOrder, gapComposer, 0);
            LocalImage localImage = activeOrder.brandImage;
            if (localImage == null) {
                localImage = activeOrder.itemImage;
            }
            if (localImage == null) {
                gapComposer.startReplaceGroup(-1790539439);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1790539438);
                Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 56.0f);
                LocalColor localColor = localImage.placeholder_color;
                if (localColor == null) {
                    gapComposer.startReplaceGroup(1660279403);
                    z = false;
                    gapComposer.end(false);
                } else {
                    z = false;
                    gapComposer.startReplaceGroup(2131767382);
                    color = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, LocalViewsKt.toComposeColor(localColor, gapComposer, 0));
                }
                Color color2 = color;
                if (color2 == null) {
                    gapComposer.startReplaceGroup(2131769900);
                    j = Strings.getColors(gapComposer).semantic.background.subtle;
                    gapComposer.end(z);
                } else {
                    gapComposer.startReplaceGroup(2131766676);
                    gapComposer.end(z);
                    j = color2.value;
                }
                Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(12.0f, m285size3ABfNKs2, j, 8.0f);
                Float ratio = LocalViewsKt.getRatio(localImage);
                LocalMapKt.LocalAsyncImage(m, ratio != null ? OffsetKt.aspectRatio(ratio.floatValue(), companion, z) : companion, LocalViewsKt.getThemedUrl(localImage, gapComposer), ContentScale.Companion.Fit, Alignment.Companion.Center, null, null, gapComposer, 27648, 96);
                gapComposer.end(z);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$activity$views$ActivityEmbeddedViewKt$$ExternalSyntheticLambda17(Object obj, Object obj2, Object obj3, Object obj4) {
        ActivityFeedEntry.Header header = (ActivityFeedEntry.Header) this.f$0;
        Function3 function3 = (Function3) this.f$1;
        LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
        ((Integer) obj2).getClass();
        Composer composer = (Composer) obj3;
        int intValue = ((Integer) obj4).intValue();
        lazyItemScopeImpl.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 131) != 130)) {
            boolean changed = gapComposer.changed(header);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SectionHeaderScope(header, true);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SectionHeaderScope sectionHeaderScope = (SectionHeaderScope) rememberedValue;
            if (function3 == null) {
                gapComposer.startReplaceGroup(-1925380540);
                sectionHeaderScope.DefaultHeader(0, 0, gapComposer, LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, Modifier.Companion.$$INSTANCE));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1925307752);
                function3.invoke(sectionHeaderScope, gapComposer, 0);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$benefits$views$BenefitsHomeViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, Object obj4) {
        Function1 function1 = (Function1) this.f$0;
        BenefitsHomeViewModel benefitsHomeViewModel = (BenefitsHomeViewModel) this.f$1;
        BenefitsHomeViewModel benefitsHomeViewModel2 = (BenefitsHomeViewModel) obj2;
        Composer composer = (Composer) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((AnimatedContentScopeImpl) obj).getClass();
        benefitsHomeViewModel2.getClass();
        int i = 0;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
        GapComposer gapComposer = (GapComposer) composer;
        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Modifier materializeModifier = PlatformKt.materializeModifier(composer, companion);
        ComposeUiNode.Companion.getClass();
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
        GapComposer gapComposer2 = (GapComposer) composer;
        ComposableLambdaImpl composableLambdaImpl = null;
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
        Updater.m576setimpl(composer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
        Updater.m576setimpl(composer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
        Updater.m576setimpl(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
        Updater.m575reconcileimpl(composer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
        Updater.m576setimpl(composer, materializeModifier, ComposeUiNode.Companion.SetModifier);
        BenefitsHomeViewKt.BenefitsHomeContent((BenefitsHomeViewModel.Content) benefitsHomeViewModel2, function1, null, composer, (intValue >> 3) & 14);
        BenefitsHomeViewModel.Content content = benefitsHomeViewModel instanceof BenefitsHomeViewModel.Content ? (BenefitsHomeViewModel.Content) benefitsHomeViewModel : null;
        BenefitsHomeViewModel.Content.StickyCtaViewModel stickyCtaViewModel = content != null ? content.stickyCtaViewModel : null;
        if (stickyCtaViewModel == null) {
            gapComposer2.startReplaceGroup(-626473252);
            gapComposer2.end(false);
        } else {
            gapComposer2.startReplaceGroup(-626473251);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier align = BoxScopeInstance.INSTANCE.align(ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, ColorKt.RectangleShape), Alignment.Companion.BottomCenter);
            String str = stickyCtaViewModel.disclaimer;
            if (str == null) {
                gapComposer2.startReplaceGroup(1369126512);
            } else {
                gapComposer2.startReplaceGroup(1369126513);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1056875314, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str, i), composer);
            }
            gapComposer2.end(false);
            DimensionKt.ButtonCtaGroup(align, true, null, composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(634434277, new BankingDialogKt$$ExternalSyntheticLambda2(17, function1, stickyCtaViewModel), composer), composer, 24624, 4);
            gapComposer2.end(false);
        }
        gapComposer2.end(true);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$borrow$views$BorrowUiFactory$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        BorrowUiFactory borrowUiFactory = (BorrowUiFactory) this.f$0;
        ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) this.f$1;
        Function1 function1 = (Function1) obj2;
        Composer composer = (Composer) obj3;
        int intValue = ((Integer) obj4).intValue();
        function1.getClass();
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((GapComposer) composer).changed(obj) : ((GapComposer) composer).changedInstance(obj) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((GapComposer) composer).changedInstance(function1) ? 32 : 16;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
            Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(borrowUiFactory.imageLoader), LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime(borrowUiFactory.vibrator)}, Expect_jvmKt.rememberComposableLambda(724902972, new BorrowUiFactory$$ExternalSyntheticLambda1(composableLambdaImpl, obj, function1, 0), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$borrow$views$LoanDetailsSheetKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, Object obj4) {
        BorrowHomeOverlayViewModel.LoanDetails loanDetails = (BorrowHomeOverlayViewModel.LoanDetails) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        LoanDetailsSheetState loanDetailsSheetState = (LoanDetailsSheetState) obj2;
        Composer composer = (Composer) obj3;
        ((Integer) obj4).getClass();
        ((AnimatedContentScopeImpl) obj).getClass();
        loanDetailsSheetState.getClass();
        int ordinal = loanDetailsSheetState.ordinal();
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (ordinal == 0) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(1077344433);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
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
            gapComposer.startReplaceGroup(377319396);
            Iterator it = loanDetails.rows.iterator();
            while (it.hasNext()) {
                LoanDetailsSheetKt.DetailRow((BorrowAppletLoanHistoryTile.Data.Loan.Details.Row) it.next(), function1, null, gapComposer, 0);
            }
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, false);
        } else {
            if (ordinal != 1) {
                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, -1212174267, false);
            }
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(1077558705);
            Timeline timeline = loanDetails.timeline;
            boolean changed = gapComposer2.changed(function1);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda1(11, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            TimelineProtoBindingKt.Timeline(timeline, (Function1) rememberedValue, SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7), 1.0f), null, gapComposer2, MLKEMEngine.KyberPolyBytes, 8);
            gapComposer2.end(false);
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$card$onboarding$DisclosureViewKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Function1 function1 = (Function1) this.f$0;
        ScrollState scrollState = (ScrollState) this.f$1;
        DisclosureViewModel disclosureViewModel = (DisclosureViewModel) obj2;
        Composer composer = (Composer) obj3;
        ((Integer) obj4).getClass();
        ((AnimatedVisibilityScope) obj).getClass();
        disclosureViewModel.getClass();
        Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, composer, 0);
        GapComposer gapComposer = (GapComposer) composer;
        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
        Modifier materializeModifier = PlatformKt.materializeModifier(composer, Modifier.Companion.$$INSTANCE);
        ComposeUiNode.Companion.getClass();
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
        GapComposer gapComposer2 = (GapComposer) composer;
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
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
        Updater.m576setimpl(composer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
        Updater.m576setimpl(composer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
        Integer valueOf = Integer.valueOf(hashCode);
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
        Updater.m576setimpl(composer, valueOf, composeUiNode$Companion$SetModifier$13);
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
        Updater.m575reconcileimpl(composer, ownerSnapshotObserver$onCommitAffectingLayout$1);
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
        Updater.m576setimpl(composer, materializeModifier, composeUiNode$Companion$SetModifier$14);
        NavigationType navigationType = NavigationType.CLOSE;
        boolean changed = gapComposer2.changed(function1);
        Object rememberedValue = gapComposer2.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new DisclosureView$$ExternalSyntheticLambda1(27, function1);
            gapComposer2.updateRememberedValue(rememberedValue);
        }
        Composer composer2 = composer;
        DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, composer2, 54, 108);
        Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), scrollState, false, 14);
        ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, composer2, 0);
        int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
        Modifier materializeModifier2 = PlatformKt.materializeModifier(composer2, verticalScroll$default);
        gapComposer2.startReusableNode();
        if (gapComposer2.inserting) {
            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
        } else {
            gapComposer2.useNode();
        }
        Updater.m576setimpl(composer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
        Updater.m576setimpl(composer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
        Request$Priority$EnumUnboxingLocalUtility.m(hashCode2, composer2, composeUiNode$Companion$SetModifier$13, composer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
        Updater.m576setimpl(composer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
        DBUtil.SpacerWithinSectionMedium(0, 1, composer2, null);
        String str = disclosureViewModel.headLineText;
        List list = disclosureViewModel.lineItemList;
        Countries.PageHeader(str, (Modifier) null, CanvasKt.lambda$1173387045, (String) null, composer2, MLKEMEngine.KyberPolyBytes, 10);
        DBUtil.SpacerBetweenSectionLarge(0, 1, composer2, null);
        if (list.isEmpty()) {
            i = 0;
            gapComposer2.startReplaceGroup(-933342574);
            gapComposer2.end(false);
        } else {
            gapComposer2.startReplaceGroup(-933772141);
            List<DisclosureBlocker.LineItem> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (DisclosureBlocker.LineItem lineItem : list2) {
                String str2 = lineItem.title_text;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList.add(new ListUnorderedItem(str2, null, lineItem.detail_text, null, 10));
            }
            ListUnorderedKt.ListUnordered(Tags.toImmutableList(arrayList), (Modifier) null, (ListUnorderedState) null, ListUnorderedProminence.Standard, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, composer2, 3072, 54);
            composer2 = composer2;
            i = 0;
            DBUtil.SpacerBetweenSectionLarge(0, 1, composer2, null);
            gapComposer2.end(false);
        }
        DisclosureViewKt.DisclosureMarkdownText(disclosureViewModel.descriptionText, function1, composer2, i);
        DBUtil.SpacerBetweenSectionLarge(i, 1, composer2, null);
        Composer composer3 = composer2;
        ListUnorderedKt.ListUnordered((Modifier) null, (ListUnorderedState) null, ListUnorderedProminence.Standard, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(463927414, new DisclosureViewKt$$ExternalSyntheticLambda4(disclosureViewModel, i), composer2), composer3, 196992, 27);
        DBUtil.SpacerBetweenSectionLarge(i, 1, composer3, null);
        DisclosureViewKt.DisclosureMarkdownText(disclosureViewModel.footerText, function1, composer3, i);
        DBUtil.SpacerBetweenSectionLarge(i, 1, composer3, null);
        gapComposer2.end(true);
        DimensionKt.ButtonCtaGroup(null, scrollState.getCanScrollForward(), null, null, Expect_jvmKt.rememberComposableLambda(-542795708, new CheckDepositAmountKt$$ExternalSyntheticLambda6(10, (Object) disclosureViewModel, (Object) function1), composer3), composer3, 24576, 13);
        gapComposer2.end(true);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$core$navigationcontainer$UiContainerKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) this.f$0;
        SharedToolbarSwipeScope sharedToolbarSwipeScope = (SharedToolbarSwipeScope) this.f$1;
        Modifier modifier = (Modifier) obj;
        Composer composer = (Composer) obj3;
        int intValue = ((Integer) obj4).intValue();
        modifier.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(modifier) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 131) != 130)) {
            gapComposer.startReplaceGroup(266727425);
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (sharedToolbarSwipeScope != null) {
                boolean changed = gapComposer.changed(sharedToolbarSwipeScope);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda12(sharedToolbarSwipeScope, 27);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                modifier = modifier.then(ColorKt.graphicsLayer(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue));
            }
            gapComposer.end(false);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new FlowStarter$$ExternalSyntheticLambda0(8);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer, SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue2), (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$deposits$physical$view$barcode$PaperMoneyDepositBarcodeViewKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, Object obj4) {
        PaperMoneyDepositBarcodeViewModel paperMoneyDepositBarcodeViewModel = (PaperMoneyDepositBarcodeViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj3;
        ((Integer) obj4).intValue();
        ((AnimatedContentScopeImpl) obj).getClass();
        ((PaperMoneyDepositBarcodeViewModel) obj2).getClass();
        if (Intrinsics.areEqual(paperMoneyDepositBarcodeViewModel, PaperMoneyDepositBarcodeViewModel.Loading.INSTANCE)) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-1889328133);
            gapComposer.end(false);
            a$$ExternalSyntheticBUOutline0.m$3("Loading should be handled by LoadableContent");
            return null;
        }
        if (!(paperMoneyDepositBarcodeViewModel instanceof PaperMoneyDepositBarcodeViewModel.Ready)) {
            throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, -1889329122, false);
        }
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(-1889325007);
        s.LoadedBarcodeContent((PaperMoneyDepositBarcodeViewModel.Ready) paperMoneyDepositBarcodeViewModel, function1, gapComposer2, 0);
        gapComposer2.end(false);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$directdeposit$views$directdeposit$DirectDepositManualFormCompletionKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, Object obj4) {
        DirectDepositManualFormCompletionViewModel directDepositManualFormCompletionViewModel = (DirectDepositManualFormCompletionViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj3;
        ((Integer) obj4).getClass();
        ((AnimatedContentScopeImpl) obj).getClass();
        ((DirectDepositManualFormCompletionViewModel) obj2).getClass();
        if (directDepositManualFormCompletionViewModel instanceof DirectDepositManualFormCompletionViewModel.Success) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(29113846);
            DirectDepositFormErrorKt.SuccessContent(function1, gapComposer, 0);
            gapComposer.end(false);
        } else if (directDepositManualFormCompletionViewModel instanceof DirectDepositManualFormCompletionViewModel.Error) {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(902626382);
            String stringResource = Room.stringResource(gapComposer2, R.string.direct_deposit_manual_completion_error_title);
            String stringResource2 = Room.stringResource(gapComposer2, R.string.direct_deposit_manual_completion_error_desc);
            boolean changed = gapComposer2.changed(function1);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new EarningsHeaderKt$$ExternalSyntheticLambda2(10, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            boolean changed2 = gapComposer2.changed(function1);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new EarningsHeaderKt$$ExternalSyntheticLambda2(11, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            DirectDepositFormErrorKt.ErrorContent(stringResource, stringResource2, function0, (Function0) rememberedValue2, gapComposer2, 0);
            gapComposer2.end(false);
        } else {
            if (!(directDepositManualFormCompletionViewModel instanceof DirectDepositManualFormCompletionViewModel.Loading)) {
                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, 29112001, false);
            }
            GapComposer gapComposer3 = (GapComposer) composer;
            gapComposer3.startReplaceGroup(29132579);
            gapComposer3.end(false);
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$directdeposit$views$directdeposit$DirectDepositUpdateManualFormDetailsKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, Object obj4) {
        DirectDepositUpdateManualFormDetailsViewModel directDepositUpdateManualFormDetailsViewModel = (DirectDepositUpdateManualFormDetailsViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj3;
        ((Integer) obj4).getClass();
        ((AnimatedContentScopeImpl) obj).getClass();
        ((DirectDepositUpdateManualFormDetailsViewModel) obj2).getClass();
        if (directDepositUpdateManualFormDetailsViewModel instanceof DirectDepositUpdateManualFormDetailsViewModel.Content) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-179501612);
            DirectDepositFormErrorKt.ScrollableContentScaffold(Expect_jvmKt.rememberComposableLambda(628706665, new ErrorView$$ExternalSyntheticLambda3(2, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(1691895274, new DirectDepositUpdateManualFormDetailsKt$$ExternalSyntheticLambda4(directDepositUpdateManualFormDetailsViewModel, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(1053740075, new DirectDepositUpdateManualFormDetailsKt$$ExternalSyntheticLambda4(function1, directDepositUpdateManualFormDetailsViewModel), gapComposer), Modifier.Companion.$$INSTANCE, null, gapComposer, 438, 16);
            gapComposer.end(false);
        } else if (Intrinsics.areEqual(directDepositUpdateManualFormDetailsViewModel, DirectDepositUpdateManualFormDetailsViewModel.Error.INSTANCE)) {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(-176811928);
            String stringResource = Room.stringResource(gapComposer2, R.string.direct_deposit_update_form_error_title);
            String stringResource2 = Room.stringResource(gapComposer2, R.string.direct_deposit_update_form_error_desc);
            boolean changed = gapComposer2.changed(function1);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new EarningsHeaderKt$$ExternalSyntheticLambda2(23, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            boolean changed2 = gapComposer2.changed(function1);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new EarningsHeaderKt$$ExternalSyntheticLambda2(24, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            DirectDepositFormErrorKt.ErrorContent(stringResource, stringResource2, function0, (Function0) rememberedValue2, gapComposer2, 0);
            gapComposer2.end(false);
        } else {
            if (!Intrinsics.areEqual(directDepositUpdateManualFormDetailsViewModel, DirectDepositUpdateManualFormDetailsViewModel.Loading.INSTANCE)) {
                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, 686944341, false);
            }
            GapComposer gapComposer3 = (GapComposer) composer;
            gapComposer3.startReplaceGroup(687048402);
            gapComposer3.end(false);
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$family$requestsponsorship$views$SelectSponsorViewKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, Object obj4) {
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f$0;
        SelectSponsorViewModel selectSponsorViewModel = (SelectSponsorViewModel) obj2;
        int intValue = ((Integer) obj4).intValue();
        ((AnimatedContentScopeImpl) obj).getClass();
        selectSponsorViewModel.getClass();
        SelectSponsorViewKt.SelectSponsorContent((SelectSponsorViewModel.SelectSponsor) selectSponsorViewModel, (TextFieldState) ref$ObjectRef.element, new Modifier$$ExternalSyntheticLambda0(4, ref$ObjectRef), (Function1) this.f$1, (Composer) obj3, (intValue >> 3) & 14);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$instruments$views$SelectPaymentInstrumentViewKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3, Object obj4) {
        SelectPaymentInstrumentViewModel selectPaymentInstrumentViewModel = (SelectPaymentInstrumentViewModel) this.f$0;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.f$1;
        int intValue = ((Integer) obj2).intValue();
        Composer composer = (Composer) obj3;
        int intValue2 = ((Integer) obj4).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        if ((intValue2 & 48) == 0) {
            intValue2 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
            SelectPaymentInstrumentViewModel.PaymentInstrument paymentInstrument = (SelectPaymentInstrumentViewModel.PaymentInstrument) selectPaymentInstrumentViewModel.instruments.get(intValue);
            gapComposer.startReplaceGroup(-1111094696);
            List list = selectPaymentInstrumentViewModel.instruments;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(InstrumentCellKt.toCell((SelectPaymentInstrumentViewModel.PaymentInstrument) it.next(), gapComposer));
            }
            gapComposer.end(false);
            InstrumentCellViewModel instrumentCellViewModel = (InstrumentCellViewModel) arrayList.get(intValue);
            if (paymentInstrument instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.NewInstrument) {
                gapComposer.startReplaceGroup(-83481571);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-84062015);
                boolean z = parcelableSnapshotMutableIntState.getIntValue() == intValue;
                boolean changed = gapComposer.changed(parcelableSnapshotMutableIntState) | ((intValue2 & 112) == 32);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new q2$$ExternalSyntheticLambda8(intValue, parcelableSnapshotMutableIntState, 13);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                InstrumentCellKt.m3578InstrumentRowjM_yU8I(null, instrumentCellViewModel, null, z, null, (Function0) rememberedValue, gapComposer, 0, 21);
                String amountExceededMessage = paymentInstrument.getAmountExceededMessage();
                if (amountExceededMessage == null) {
                    gapComposer.startReplaceGroup(-83836553);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-83836552);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    ListUnorderedKt.ListUnordered(Tags.persistentListOf(new ListUnorderedItem(amountExceededMessage, Icons.InformationOutline16, null, null, 12)), SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 16.0f, 1), (ListUnorderedState) null, ListUnorderedProminence.Subtle, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, gapComposer, 3072, 52);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$investing$components$InvestingStockSelectionView$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, Object obj4) {
        Function1 function1 = (Function1) this.f$0;
        P2PListView p2PListView = (P2PListView) this.f$1;
        InvestingStockSelectionViewModel investingStockSelectionViewModel = (InvestingStockSelectionViewModel) obj2;
        Composer composer = (Composer) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((AnimatedVisibilityScope) obj).getClass();
        investingStockSelectionViewModel.getClass();
        InvestingStockSelectionViewModel.Loaded loaded = (InvestingStockSelectionViewModel.Loaded) investingStockSelectionViewModel;
        GapComposer gapComposer = (GapComposer) composer;
        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        ArcadeBordersKt.CollapsingHeader(loaded, SpacerKt.imePadding(SpacerKt.navigationBarsPadding(SpacerKt.statusBarsPadding(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape)))), function1, Expect_jvmKt.rememberComposableLambda(1947019818, new InvestingStockSelectionView$$ExternalSyntheticLambda0(investingStockSelectionViewModel, p2PListView, function1), composer), composer, ((intValue >> 3) & 14) | 3072);
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$investing$components$InvestingStockSelectionViewKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        TextFieldState m382rememberTextFieldStateLepunE;
        CharSequence value;
        InvestingStockSelectionViewModel.Loaded loaded = (InvestingStockSelectionViewModel.Loaded) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        ((Integer) obj2).getClass();
        Composer composer = (Composer) obj3;
        int intValue = ((Integer) obj4).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
            InvestingStockSelectionViewModel.Loaded.Searching searching = loaded instanceof InvestingStockSelectionViewModel.Loaded.Searching ? (InvestingStockSelectionViewModel.Loaded.Searching) loaded : null;
            InputFieldText searchText = searching != null ? searching.getSearchText() : null;
            if (searchText instanceof TextFieldStateInputFieldText) {
                gapComposer.startReplaceGroup(1493719818);
                gapComposer.end(false);
                m382rememberTextFieldStateLepunE = ((TextFieldStateInputFieldText) searchText).textFieldState;
            } else {
                gapComposer.startReplaceGroup(-948192826);
                gapComposer.startMovableGroup(1493721453, searchText);
                if (searchText == null || (value = searchText.getValue()) == null || (str = value.toString()) == null) {
                    str = "";
                }
                m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(str, 0L, gapComposer, 0, 2);
                gapComposer.end(false);
                gapComposer.end(false);
            }
            TextFieldState textFieldState = m382rememberTextFieldStateLepunE;
            CharSequence charSequence = textFieldState.getValue$foundation().text;
            boolean changed = gapComposer.changed(textFieldState) | gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SetPinViewKt$SetPin$3$1$1$1(textFieldState, function1, null, 8);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, charSequence, (Function2) rememberedValue);
            String searchBarPlaceholderText = loaded.getSearchBarPlaceholderText();
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            SearchBarKt.SearchBar(textFieldState, searchBarPlaceholderText, SearchBarKt.rememberSearchBarKeyboardState(false, gapComposer), ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape), null, null, null, null, null, null, true, null, gapComposer, 0, 6, 7152);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ComposableLambdaImpl composableLambdaImpl;
        BiasAlignment biasAlignment;
        ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1;
        boolean z;
        boolean z2;
        Color m;
        boolean z3;
        Modifier.Companion companion;
        List list;
        ComposableLambdaImpl composableLambdaImpl2;
        int i = this.$r8$classId;
        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
        Object obj5 = Composer.Companion.Empty;
        Object obj6 = this.f$1;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                LocalViewFactory localViewFactory = (LocalViewFactory) obj7;
                Function4 function4 = (Function4) obj6;
                Function1 function1 = (Function1) obj2;
                Composer composer = (Composer) obj3;
                int intValue = ((Integer) obj4).intValue();
                obj.getClass();
                function1.getClass();
                int i2 = (intValue & 6) == 0 ? intValue | ((intValue & 8) == 0 ? ((GapComposer) composer).changed(obj) : ((GapComposer) composer).changedInstance(obj) ? 4 : 2) : intValue;
                if ((intValue & 48) == 0) {
                    i2 |= ((GapComposer) composer).changedInstance(function1) ? 32 : 16;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(localViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(1219218663, new LocalViewFactory$$ExternalSyntheticLambda7(function4, obj, function1, 0), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                LocalMenuComboDetailsViewModel localMenuComboDetailsViewModel = (LocalMenuComboDetailsViewModel) obj7;
                Function1 function12 = (Function1) obj6;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                Composer composer2 = (Composer) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(floatValue) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 131) != 130)) {
                    ToolbarModel toolbarModel = new ToolbarModel(localMenuComboDetailsViewModel.itemName);
                    float f = floatValue < 0.1f ? 0.0f : floatValue;
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed = gapComposer2.changed(function12);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == obj5) {
                        rememberedValue = new DrawerKt$$ExternalSyntheticLambda1(function12, false, 18);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    LocalToolbarKt.m1333LocalToolbarflo8M7A(null, toolbarModel, navigationType, (Function0) rememberedValue, f, null, gapComposer2, MLKEMEngine.KyberPolyBytes, 73);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                LocalMenuItemDetailsViewModel localMenuItemDetailsViewModel = (LocalMenuItemDetailsViewModel) obj7;
                Function1 function13 = (Function1) obj6;
                float floatValue2 = ((Float) obj).floatValue();
                float floatValue3 = ((Float) obj2).floatValue();
                Composer composer3 = (Composer) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                int i3 = (intValue3 & 6) == 0 ? intValue3 | (((GapComposer) composer3).changed(floatValue2) ? 4 : 2) : intValue3;
                if ((intValue3 & 48) == 0) {
                    i3 |= ((GapComposer) composer3).changed(floatValue3) ? 32 : 16;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterStart, false);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, companion3);
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
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    ToolbarModel toolbarModel2 = new ToolbarModel(localMenuItemDetailsViewModel.itemName);
                    float f2 = floatValue2 < 0.1f ? RecyclerView.DECELERATION_RATE : floatValue2;
                    NavigationType navigationType2 = NavigationType.CLOSE;
                    boolean changed2 = gapComposer3.changed(function13);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changed2 || rememberedValue2 == obj5) {
                        rememberedValue2 = new DrawerKt$$ExternalSyntheticLambda1(function13, false, 19);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    LocalToolbarKt.m1333LocalToolbarflo8M7A(null, toolbarModel2, navigationType2, (Function0) rememberedValue2, f2, null, gapComposer3, MLKEMEngine.KyberPolyBytes, 73);
                    String str = localMenuItemDetailsViewModel.comboName;
                    if (str == null) {
                        gapComposer3.startReplaceGroup(-1440961285);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(-1440961284);
                        Modifier alpha = AlphaKt.alpha(OffsetKt.m273offsetVpY3zN4$default(SpacerKt.m302paddingqDBjuR0$default(companion3, 60.0f, 10.0f, 40.0f, RecyclerView.DECELERATION_RATE, 8), RecyclerView.DECELERATION_RATE, -((1.0f - floatValue3) * 32.0f), 1), floatValue3);
                        TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                        Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                        } else {
                            gapComposer3.startReplaceGroup(-1762997739);
                            gapComposer3.end(false);
                        }
                        Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4016, colors.semantic.text.subtle, (Composer) gapComposer3, alpha, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        gapComposer3.end(false);
                    }
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                LocalBrandLocationHoursContentModel localBrandLocationHoursContentModel = (LocalBrandLocationHoursContentModel) obj7;
                ImmutableList immutableList = (ImmutableList) obj6;
                Function0 function0 = (Function0) obj2;
                Composer composer4 = (Composer) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                ((BoxScope) obj).getClass();
                function0.getClass();
                if ((intValue4 & 48) == 0) {
                    intValue4 |= ((GapComposer) composer4).changedInstance(function0) ? 32 : 16;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    LocalBrandLocationRowKt.DropdownAnchor((intValue4 << 3) & 896, gapComposer4, localBrandLocationHoursContentModel.selectedDropdownOption.title, function0, immutableList.size() > 1);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                LocalBrandProfileViewModel localBrandProfileViewModel = (LocalBrandProfileViewModel) obj7;
                Function1 function14 = (Function1) obj6;
                float floatValue4 = ((Float) obj).floatValue();
                float floatValue5 = ((Float) obj2).floatValue();
                Composer composer5 = (Composer) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                int i4 = (intValue5 & 6) == 0 ? intValue5 | (((GapComposer) composer5).changed(floatValue4) ? 4 : 2) : intValue5;
                if ((intValue5 & 48) == 0) {
                    i4 |= ((GapComposer) composer5).changed(floatValue5) ? 32 : 16;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
                    LocalBrandProfileViewModel.Content content = (LocalBrandProfileViewModel.Content) localBrandProfileViewModel;
                    int i5 = i4 << 3;
                    LocalBrandLocationRowKt.LocalBrandProfileCollapsedToolbar(SizeKt.fillMaxWidth(companion2, 1.0f), floatValue4, floatValue5, content.name, content.moreOptionsMenuModel, function14, gapComposer5, (i5 & 112) | 6 | (i5 & 896));
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                LocalCashBalanceViewModel localCashBalanceViewModel = (LocalCashBalanceViewModel) obj7;
                Function1 function15 = (Function1) obj6;
                float floatValue6 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                Composer composer6 = (Composer) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer6).changed(floatValue6) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 131) != 130)) {
                    Colors colors2 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                    } else {
                        gapComposer6.startReplaceGroup(-1762997739);
                        gapComposer6.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion2, colors2.semantic.background.f1047app, ColorKt.RectangleShape);
                    ToolbarModel toolbarModel3 = new ToolbarModel(CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{Room.stringResource(gapComposer6, R.string.local_views_local_widget_local_cash), localCashBalanceViewModel.balanceText}), " ", null, null, 0, null, null, 62));
                    float f3 = floatValue6 < 0.1f ? RecyclerView.DECELERATION_RATE : floatValue6;
                    NavigationType navigationType3 = NavigationType.BACK;
                    LocalCashBalanceViewModel.Activity activity = localCashBalanceViewModel.activity;
                    if (activity == null || !activity.canManageCards) {
                        gapComposer6.startReplaceGroup(424035457);
                        gapComposer6.end(false);
                        composableLambdaImpl = null;
                    } else {
                        gapComposer6.startReplaceGroup(423764176);
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1863153211, new BrandSheetViewKt$$ExternalSyntheticLambda6(6, function15), gapComposer6);
                        gapComposer6.end(false);
                        composableLambdaImpl = rememberComposableLambda;
                    }
                    boolean changed3 = gapComposer6.changed(function15);
                    Object rememberedValue3 = gapComposer6.rememberedValue();
                    if (changed3 || rememberedValue3 == obj5) {
                        rememberedValue3 = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(8, function15);
                        gapComposer6.updateRememberedValue(rememberedValue3);
                    }
                    LocalToolbarKt.m1333LocalToolbarflo8M7A(m177backgroundbw27NRU, toolbarModel3, navigationType3, (Function0) rememberedValue3, f3, composableLambdaImpl, gapComposer6, MLKEMEngine.KyberPolyBytes, 8);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                EducationalSheetModelList educationalSheetModelList = (EducationalSheetModelList) obj2;
                Composer composer7 = (Composer) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                educationalSheetModelList.getClass();
                LoyaltySheetKt.preloadImages(educationalSheetModelList, composer7, (intValue7 >> 3) & 14);
                LoyaltySheetKt.EducationalSheetColumn(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 32.0f, RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, 8), educationalSheetModelList, (Function1) obj7, (RealSheetState) obj6, composer7, intValue7 & 112);
                return Unit.INSTANCE;
            case 7:
                LocalHomeViewModel.TabContent.Widget.LocalCash localCash = (LocalHomeViewModel.TabContent.Widget.LocalCash) obj7;
                Function1 function16 = (Function1) obj6;
                Composer composer8 = (Composer) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                BiasAlignment biasAlignment2 = Alignment.Companion.Center;
                BiasAlignment.Vertical vertical = Alignment.Companion.Bottom;
                ((ColumnScope) obj).getClass();
                ((PaddingValues) obj2).getClass();
                GapComposer gapComposer7 = (GapComposer) composer8;
                boolean shouldExecute = gapComposer7.shouldExecute(intValue8 & 1, (intValue8 & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128);
                Applier applier = gapComposer7.applier;
                if (shouldExecute) {
                    Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(48.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$SpacedAligned, horizontal, gapComposer7, 6);
                    int hashCode2 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer7.currentCompositionLocalScope();
                    Modifier.Companion companion4 = Modifier.Companion.$$INSTANCE;
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer7, companion4);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer7.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer7, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer7, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceBetween;
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$Center$1, Alignment.Companion.Top, gapComposer7, 6);
                    int hashCode3 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer7, companion4);
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer7, composeUiNode$Companion$SetModifier$13, gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer7, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    if (!(((double) 1.0f) > 0.0d)) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer7, 0);
                    int hashCode4 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer7, layoutWeightElement);
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer7, composeUiNode$Companion$SetModifier$13, gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer7, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    Room.m1165Text25TpFw(0, 0, 0, 5, 48, 0, 3824, Strings.getColors(gapComposer7).semantic.text.standard, (Composer) gapComposer7, SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion4, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, 7), Strings.getTypography(gapComposer7).labelSmall, (TextLineBalancing) null, Room.stringResource(gapComposer7, R.string.local_views_local_widget_local_cash), (Map) null, (Function1) null, false);
                    zzacn.m2012AutoScaleTextZLomxE(1, 5, 0, 1597488, MLKEMEngine.KyberPolyBytes, Strings.getColors(gapComposer7).semantic.text.standard, Room.getSp(8), gapComposer7, SizeKt.fillMaxWidth(companion4, 1.0f), Strings.getTypography(gapComposer7).numeralSmall, localCash.amountAsString, null);
                    gapComposer7.end(true);
                    int ordinal = localCash.checkIn.ordinal();
                    ContentScale$Companion$Fit$1 contentScale$Companion$Fit$12 = ContentScale.Companion.Fit;
                    if (ordinal == 0) {
                        gapComposer7.startReplaceGroup(1900681511);
                        Modifier m289sizeInqDBjuR0$default = SizeKt.m289sizeInqDBjuR0$default(SpacerKt.m302paddingqDBjuR0$default(new VerticalAlignElement(vertical), 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 48.0f, 44.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12);
                        long j = Strings.getColors(gapComposer7).semantic.border.subtle;
                        Strings.getSizes(gapComposer7).getClass();
                        Object obj8 = DefaultSizes.border.entries;
                        biasAlignment = biasAlignment2;
                        Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(m289sizeInqDBjuR0$default, 1.0f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f));
                        boolean changed4 = gapComposer7.changed(function16);
                        Object rememberedValue4 = gapComposer7.rememberedValue();
                        if (changed4 || rememberedValue4 == obj5) {
                            rememberedValue4 = new BrandSheetViewKt$$ExternalSyntheticLambda0(28, function16);
                            gapComposer7.updateRememberedValue(rememberedValue4);
                        }
                        Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m183clickableoSLSa3U$default(m178borderxT4_qwU, false, null, null, (Function0) rememberedValue4, 15), 16.0f, 10.0f);
                        RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$Center$1, Alignment.Companion.CenterVertically, gapComposer7, 54);
                        int hashCode5 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer7.currentCompositionLocalScope();
                        Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer7, m299paddingVpY3zN4);
                        gapComposer7.startReusableNode();
                        if (gapComposer7.inserting) {
                            gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer7.useNode();
                        }
                        Updater.m576setimpl(gapComposer7, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer7, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer7, composeUiNode$Companion$SetModifier$13, gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer7, materializeModifier5, composeUiNode$Companion$SetModifier$14);
                        contentScale$Companion$Fit$1 = contentScale$Companion$Fit$12;
                        ImageKt.Image(Countries.painterResource(Strings.getColors(gapComposer7).isLight ? 2131232827 : 2131232826, 0, gapComposer7), null, SizeKt.m285size3ABfNKs(companion4, 24.0f), null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, null, gapComposer7, Painter.$stable | 25008, 104);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer7).semantic.text.standard, (Composer) gapComposer7, SpacerKt.m302paddingqDBjuR0$default(companion4, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), Strings.getTypography(gapComposer7).buttonCompact, (TextLineBalancing) null, Room.stringResource(gapComposer7, R.string.local_views_linked), (Map) null, (Function1) null, false);
                        z = true;
                        gapComposer7.end(true);
                        z2 = false;
                        gapComposer7.end(false);
                    } else {
                        if (ordinal != 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer7, 338406164, false);
                        }
                        gapComposer7.startReplaceGroup(1902114021);
                        Modifier clip = ClipKt.clip(ImageKt.m178borderxT4_qwU(SizeKt.m285size3ABfNKs(new VerticalAlignElement(vertical), 64.0f), 1.0f, Strings.getColors(gapComposer7).surface.money.applet.data.inactive.border, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f)), RoundedCornerShapeKt.CircleShape);
                        boolean changed5 = gapComposer7.changed(function16);
                        Object rememberedValue5 = gapComposer7.rememberedValue();
                        if (changed5 || rememberedValue5 == obj5) {
                            rememberedValue5 = new BrandSheetViewKt$$ExternalSyntheticLambda0(29, function16);
                            gapComposer7.updateRememberedValue(rememberedValue5);
                        }
                        Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(clip, false, null, null, (Function0) rememberedValue5, 15);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment2, false);
                        int hashCode6 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer7.currentCompositionLocalScope();
                        Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer7, m183clickableoSLSa3U$default);
                        gapComposer7.startReusableNode();
                        if (gapComposer7.inserting) {
                            gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer7.useNode();
                        }
                        Updater.m576setimpl(gapComposer7, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer7, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode6, gapComposer7, composeUiNode$Companion$SetModifier$13, gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer7, materializeModifier6, composeUiNode$Companion$SetModifier$14);
                        Trace.m1190Iconww6aTOc(Countries.painterResource(R.drawable.local_views_scan_16, 0, gapComposer7), (String) null, SizeKt.m285size3ABfNKs(companion4, 24.0f), Strings.getColors(gapComposer7).semantic.icon.standard, gapComposer7, Painter.$stable | 432, 0);
                        gapComposer7.end(true);
                        z2 = false;
                        gapComposer7.end(false);
                        contentScale$Companion$Fit$1 = contentScale$Companion$Fit$12;
                        biasAlignment = biasAlignment2;
                        z = true;
                    }
                    gapComposer7.end(z);
                    GetNeighborhoodsTabContentResponse.LocalCashExplainer localCashExplainer = localCash.localCashExplainer;
                    if (localCashExplainer == null) {
                        gapComposer7.startReplaceGroup(562686296);
                        gapComposer7.end(z2);
                    } else {
                        gapComposer7.startReplaceGroup(562686297);
                        LocalImage localImage = localCashExplainer.hero_image;
                        if (localImage == null) {
                            gapComposer7.startReplaceGroup(-918848179);
                            gapComposer7.end(z2);
                            z3 = z2;
                        } else {
                            gapComposer7.startReplaceGroup(-918848178);
                            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion4, 22.0f, RecyclerView.DECELERATION_RATE, 2);
                            Float ratio = LocalViewsKt.getRatio(localImage);
                            Modifier aspectRatio = OffsetKt.aspectRatio(ratio != null ? ratio.floatValue() : 1.34f, m300paddingVpY3zN4$default, false);
                            LocalColor localColor = localImage.placeholder_color;
                            if (localColor == null) {
                                gapComposer7.startReplaceGroup(639944385);
                                gapComposer7.end(false);
                                m = null;
                            } else {
                                gapComposer7.startReplaceGroup(851927360);
                                m = Recorder$$ExternalSyntheticOutline1.m(gapComposer7, false, LocalViewsKt.toComposeColor(localColor, gapComposer7, 0));
                            }
                            LocalMapKt.LocalAsyncImage(ImageKt.m177backgroundbw27NRU(aspectRatio, m != null ? m.value : Color.Unspecified, ColorKt.RectangleShape), null, LocalViewsKt.getThemedUrl(localImage, gapComposer7), contentScale$Companion$Fit$1, biasAlignment, null, null, gapComposer7, 27648, 98);
                            z3 = false;
                            gapComposer7.end(false);
                        }
                        String str2 = localCashExplainer.body;
                        if (str2 == null) {
                            gapComposer7.startReplaceGroup(-918436654);
                            gapComposer7.end(z3);
                        } else {
                            gapComposer7.startReplaceGroup(-918436653);
                            Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer7).semantic.text.subtle, (Composer) gapComposer7, SpacerKt.m302paddingqDBjuR0$default(companion4, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), Strings.getTypography(gapComposer7).bodySmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            z3 = false;
                            gapComposer7.end(false);
                        }
                        gapComposer7.end(z3);
                    }
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                LocalHomeViewModel.TabContent.Widget.MarketingMessage marketingMessage = (LocalHomeViewModel.TabContent.Widget.MarketingMessage) obj7;
                Function1 function17 = (Function1) obj6;
                Composer composer9 = (Composer) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                ((ColumnScope) obj).getClass();
                ((PaddingValues) obj2).getClass();
                GapComposer gapComposer8 = (GapComposer) composer9;
                if (gapComposer8.shouldExecute(intValue9 & 1, (intValue9 & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                    boolean changed6 = gapComposer8.changed(function17);
                    Object rememberedValue6 = gapComposer8.rememberedValue();
                    if (changed6 || rememberedValue6 == obj5) {
                        rememberedValue6 = new BrandSheetViewKt$$ExternalSyntheticLambda0(26, function17);
                        gapComposer8.updateRememberedValue(rememberedValue6);
                    }
                    LocalHomeViewKt.MarketingMessageCard(null, marketingMessage, (Function0) rememberedValue6, gapComposer8, 0);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                return invoke$app$cash$local$views$wallet$TabContentViewKt$$ExternalSyntheticLambda43(obj, obj2, obj3, obj4);
            case 10:
                return invoke$app$cash$local$views$wallet$TabContentViewKt$$ExternalSyntheticLambda46(obj, obj2, obj3, obj4);
            case 11:
                return invoke$app$cash$local$views$wallet$TabContentViewKt$$ExternalSyntheticLambda51(obj, obj2, obj3, obj4);
            case 12:
                AddressTypeaheadState addressTypeaheadState = (AddressTypeaheadState) obj7;
                String str3 = (String) obj6;
                AddressModel addressModel = (AddressModel) obj2;
                Composer composer10 = (Composer) obj3;
                int intValue10 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                addressModel.getClass();
                if (addressModel.equals(AddressModel.Initializing.INSTANCE)) {
                    GapComposer gapComposer9 = (GapComposer) composer10;
                    gapComposer9.startReplaceGroup(1396944456);
                    gapComposer9.end(false);
                } else if (addressModel instanceof AddressModel.Condensed) {
                    GapComposer gapComposer10 = (GapComposer) composer10;
                    gapComposer10.startReplaceGroup(1846179291);
                    AddressTypeaheadKt.Condensed((AddressModel.Condensed) addressModel, addressTypeaheadState, str3, null, gapComposer10, (intValue10 >> 3) & 14);
                    gapComposer10.end(false);
                } else {
                    if (!(addressModel instanceof AddressModel.Expanded)) {
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer10, 1846176626, false);
                    }
                    GapComposer gapComposer11 = (GapComposer) composer10;
                    gapComposer11.startReplaceGroup(1846181518);
                    AddressTypeaheadKt.Expanded((AddressModel.Expanded) addressModel, addressTypeaheadState, null, gapComposer11, (intValue10 >> 3) & 14);
                    gapComposer11.end(false);
                }
                return Unit.INSTANCE;
            case 13:
                Function1 function18 = (Function1) obj7;
                AccountDocumentsViewModel accountDocumentsViewModel = (AccountDocumentsViewModel) obj6;
                AccountDocumentsViewModel accountDocumentsViewModel2 = (AccountDocumentsViewModel) obj2;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                accountDocumentsViewModel2.getClass();
                Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
                GapComposer gapComposer12 = (GapComposer) ((Composer) obj3);
                boolean changedInstance = gapComposer12.changedInstance(accountDocumentsViewModel2) | gapComposer12.changed(function18) | gapComposer12.changedInstance(accountDocumentsViewModel);
                Object rememberedValue7 = gapComposer12.rememberedValue();
                if (changedInstance || rememberedValue7 == obj5) {
                    rememberedValue7 = new UtilsKt$$ExternalSyntheticLambda0(13, accountDocumentsViewModel2, function18, accountDocumentsViewModel);
                    gapComposer12.updateRememberedValue(rememberedValue7);
                }
                LazyDslKt.LazyColumn(fillMaxSize, null, null, null, null, null, false, null, (Function1) rememberedValue7, gapComposer12, 6, 510);
                return Unit.INSTANCE;
            case 14:
                return invoke$com$squareup$cash$activity$views$ActivityEmbeddedViewKt$$ExternalSyntheticLambda17(obj, obj2, obj3, obj4);
            case 15:
                return invoke$com$squareup$cash$benefits$views$BenefitsHomeViewKt$$ExternalSyntheticLambda4(obj, obj2, obj3, obj4);
            case 16:
                Function1 function19 = (Function1) obj2;
                int intValue11 = ((Integer) obj4).intValue();
                function19.getClass();
                BitcoinExchangeViewKt.BitcoinExchangeContent((BitcoinTransferViewModel) obj, function19, ((AdUiFactory) obj7).imageLoader, (BitcoinTransferScreen) ((Screen) obj6), (Composer) obj3, intValue11 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 17:
                SendStablecoinModel sendStablecoinModel = (SendStablecoinModel) obj7;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                ((SendStablecoinModel) obj2).getClass();
                sendStablecoinModel.getClass();
                SendStablecoinViewKt.SendStablecoinContent((SendStablecoinModel.Content) sendStablecoinModel, (Function1) obj6, (Composer) obj3, 0);
                return Unit.INSTANCE;
            case 18:
                return invoke$com$squareup$cash$borrow$views$BorrowUiFactory$$ExternalSyntheticLambda0(obj, obj2, obj3, obj4);
            case 19:
                return invoke$com$squareup$cash$borrow$views$LoanDetailsSheetKt$$ExternalSyntheticLambda4(obj, obj2, obj3, obj4);
            case 20:
                return invoke$com$squareup$cash$card$onboarding$DisclosureViewKt$$ExternalSyntheticLambda2(obj, obj2, obj3, obj4);
            case 21:
                return invoke$com$squareup$cash$core$navigationcontainer$UiContainerKt$$ExternalSyntheticLambda5(obj, obj2, obj3, obj4);
            case 22:
                return invoke$com$squareup$cash$deposits$physical$view$barcode$PaperMoneyDepositBarcodeViewKt$$ExternalSyntheticLambda3(obj, obj2, obj3, obj4);
            case 23:
                return invoke$com$squareup$cash$directdeposit$views$directdeposit$DirectDepositManualFormCompletionKt$$ExternalSyntheticLambda1(obj, obj2, obj3, obj4);
            case 24:
                return invoke$com$squareup$cash$directdeposit$views$directdeposit$DirectDepositUpdateManualFormDetailsKt$$ExternalSyntheticLambda1(obj, obj2, obj3, obj4);
            case 25:
                return invoke$com$squareup$cash$family$requestsponsorship$views$SelectSponsorViewKt$$ExternalSyntheticLambda1(obj, obj2, obj3, obj4);
            case 26:
                return invoke$com$squareup$cash$instruments$views$SelectPaymentInstrumentViewKt$$ExternalSyntheticLambda5(obj, obj2, obj3, obj4);
            case 27:
                return invoke$com$squareup$cash$investing$components$InvestingStockSelectionView$$ExternalSyntheticLambda4(obj, obj2, obj3, obj4);
            case 28:
                return invoke$com$squareup$cash$investing$components$InvestingStockSelectionViewKt$$ExternalSyntheticLambda5(obj, obj2, obj3, obj4);
            default:
                InvestingCategoryFilterViewModel investingCategoryFilterViewModel = (InvestingCategoryFilterViewModel) obj7;
                Function1 function110 = (Function1) obj6;
                Composer composer11 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                ((InvestingCategoryFilterViewModel) obj2).getClass();
                if (!(investingCategoryFilterViewModel instanceof InvestingCategoryFilterViewModel.Content)) {
                    a$$ExternalSyntheticBUOutline0.m$3("Model must be loaded to render");
                    return null;
                }
                Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion2, 1.0f);
                Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, composer11, 0);
                GapComposer gapComposer13 = (GapComposer) composer11;
                Modifier.Companion companion5 = companion2;
                int hashCode7 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer13.currentCompositionLocalScope();
                Modifier materializeModifier7 = PlatformKt.materializeModifier(composer11, fillMaxSize2);
                ComposeUiNode.Companion.getClass();
                Function0 function02 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer14 = (GapComposer) composer11;
                if (gapComposer14.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer14.startReusableNode();
                if (gapComposer14.inserting) {
                    gapComposer14.createNode(function02);
                } else {
                    gapComposer14.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(composer11, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$15);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(composer11, currentCompositionLocalScope7, composeUiNode$Companion$SetModifier$16);
                Integer valueOf2 = Integer.valueOf(hashCode7);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(composer11, valueOf2, composeUiNode$Companion$SetModifier$17);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(composer11, ownerSnapshotObserver$onCommitAffectingLayout$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(composer11, materializeModifier7, composeUiNode$Companion$SetModifier$18);
                String stringResource = Room.stringResource(composer11, R.string.investing_components_category_filter_title);
                NavigationType navigationType4 = NavigationType.CLOSE;
                boolean changed7 = gapComposer14.changed(function110);
                Object rememberedValue8 = gapComposer14.rememberedValue();
                if (changed7 || rememberedValue8 == obj5) {
                    rememberedValue8 = new InvestingNewsKt$$ExternalSyntheticLambda0(6, function110);
                    gapComposer14.updateRememberedValue(rememberedValue8);
                }
                DBUtil.TitleBarSub(stringResource, navigationType4, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue8, (Modifier) null, (Function3) null, composer11, 48, 108);
                Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), ImageKt.rememberScrollState(composer11), false, 14);
                ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, composer11, 0);
                int hashCode8 = Long.hashCode(gapComposer14.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope8 = gapComposer14.currentCompositionLocalScope();
                Modifier materializeModifier8 = PlatformKt.materializeModifier(composer11, verticalScroll$default);
                gapComposer14.startReusableNode();
                if (gapComposer14.inserting) {
                    gapComposer14.createNode(function02);
                } else {
                    gapComposer14.useNode();
                }
                Updater.m576setimpl(composer11, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$15);
                Updater.m576setimpl(composer11, currentCompositionLocalScope8, composeUiNode$Companion$SetModifier$16);
                Request$Priority$EnumUnboxingLocalUtility.m(hashCode8, composer11, composeUiNode$Companion$SetModifier$17, composer11, ownerSnapshotObserver$onCommitAffectingLayout$12);
                Updater.m576setimpl(composer11, materializeModifier8, composeUiNode$Companion$SetModifier$18);
                DBUtil.SpacerWithinSectionMedium(0, 1, composer11, null);
                gapComposer14.startReplaceGroup(-1546891828);
                List list2 = ((InvestingCategoryFilterViewModel.Content) investingCategoryFilterViewModel).filterSections;
                int i6 = 0;
                for (Object obj9 : list2) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    InvestingCategoryFilterViewModel.Content.FilterSection filterSection = (InvestingCategoryFilterViewModel.Content.FilterSection) obj9;
                    ViewfinderDefaults.SectionHeader(filterSection.title, (Modifier) null, (String) null, (Function0) null, (String) null, composer11, 0, 30);
                    DBUtil.SpacerWithinSectionMedium(0, 1, composer11, null);
                    gapComposer14.startReplaceGroup(-1546887248);
                    int i8 = 0;
                    for (Object obj10 : filterSection.options) {
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        Object obj11 = (InvestingCategoryFilterViewModel.Content.FilterOption) obj10;
                        if (obj11 instanceof InvestingCategoryFilterViewModel.Content.FilterOption.Checkbox) {
                            gapComposer14.startReplaceGroup(-1465892019);
                            final InvestingCategoryFilterViewModel.Content.FilterOption.Checkbox checkbox = (InvestingCategoryFilterViewModel.Content.FilterOption.Checkbox) obj11;
                            String str4 = checkbox.description;
                            if (str4 == null || str4.length() == 0) {
                                gapComposer14.startReplaceGroup(-1465759587);
                                gapComposer14.end(false);
                                composableLambdaImpl2 = null;
                            } else {
                                gapComposer14.startReplaceGroup(-1465703229);
                                final int i10 = 0;
                                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-55567234, new Function2() { // from class: com.squareup.cash.investing.components.categories.InvestingCategoryFilterKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj12, Object obj13) {
                                        int i11 = i10;
                                        InvestingCategoryFilterViewModel.Content.FilterOption.Checkbox checkbox2 = checkbox;
                                        switch (i11) {
                                            case 0:
                                                Composer composer12 = (Composer) obj12;
                                                int intValue12 = ((Integer) obj13).intValue();
                                                GapComposer gapComposer15 = (GapComposer) composer12;
                                                if (gapComposer15.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                                    String str5 = checkbox2.description;
                                                    str5.getClass();
                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                                                } else {
                                                    gapComposer15.skipToGroupEnd();
                                                }
                                                break;
                                            default:
                                                Composer composer13 = (Composer) obj12;
                                                int intValue13 = ((Integer) obj13).intValue();
                                                GapComposer gapComposer16 = (GapComposer) composer13;
                                                if (gapComposer16.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, checkbox2.title, (Map) null, (Function1) null, false);
                                                } else {
                                                    gapComposer16.skipToGroupEnd();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, composer11);
                                gapComposer14.end(false);
                                composableLambdaImpl2 = rememberComposableLambda2;
                            }
                            CellDefaultAccessory.Checkbox checkbox2 = new CellDefaultAccessory.Checkbox(checkbox.selected);
                            final int i11 = 1;
                            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-194149223, new Function2() { // from class: com.squareup.cash.investing.components.categories.InvestingCategoryFilterKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj12, Object obj13) {
                                    int i112 = i11;
                                    InvestingCategoryFilterViewModel.Content.FilterOption.Checkbox checkbox22 = checkbox;
                                    switch (i112) {
                                        case 0:
                                            Composer composer12 = (Composer) obj12;
                                            int intValue12 = ((Integer) obj13).intValue();
                                            GapComposer gapComposer15 = (GapComposer) composer12;
                                            if (gapComposer15.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                                String str5 = checkbox22.description;
                                                str5.getClass();
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer15.skipToGroupEnd();
                                            }
                                            break;
                                        default:
                                            Composer composer13 = (Composer) obj12;
                                            int intValue13 = ((Integer) obj13).intValue();
                                            GapComposer gapComposer16 = (GapComposer) composer13;
                                            if (gapComposer16.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, checkbox22.title, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer16.skipToGroupEnd();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, composer11);
                            boolean changedInstance2 = gapComposer14.changedInstance(obj11) | gapComposer14.changed(function110) | gapComposer14.changedInstance(filterSection);
                            Object rememberedValue9 = gapComposer14.rememberedValue();
                            if (changedInstance2 || rememberedValue9 == obj5) {
                                rememberedValue9 = new GLSceneScope$$ExternalSyntheticLambda2(21, function110, filterSection, checkbox);
                                gapComposer14.updateRememberedValue(rememberedValue9);
                            }
                            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda3, null, (Function0) rememberedValue9, false, false, composableLambdaImpl2, null, 0L, checkbox2, null, composer11, 6, 1466);
                            gapComposer14.end(false);
                            list = list2;
                            companion = companion5;
                        } else {
                            if (!(obj11 instanceof InvestingCategoryFilterViewModel.Content.FilterOption.Selection)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer14, 368352640, false);
                            }
                            gapComposer14.startReplaceGroup(-1465081555);
                            ((DefaultSizes) gapComposer14.consume(ArcadeThemeKt.LocalSizes)).getClass();
                            DefaultSizes.spacing.getClass();
                            companion = companion5;
                            InvestingCategoryFilterViewModel.Content.FilterOption.Selection selection = (InvestingCategoryFilterViewModel.Content.FilterOption.Selection) obj11;
                            list = list2;
                            InputChipKt.InputDropdown(InputChipKt.rememberDropdownState(composer11), selection.selectedOption, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), false, false, Expect_jvmKt.rememberComposableLambda(-1675066977, new CashMapViewKt$$ExternalSyntheticLambda5(selection, 5), composer11), selection.placeholder, null, Expect_jvmKt.rememberComposableLambda(-75684299, new PoolToastKt$$ExternalSyntheticLambda0(8, selection, function110, filterSection), composer11), composer11, 100859904, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE);
                            DBUtil.SpacerWithinSectionMedium(0, 1, composer11, null);
                            gapComposer14.end(false);
                        }
                        i8 = i9;
                        companion5 = companion;
                        list2 = list;
                    }
                    List list3 = list2;
                    Modifier.Companion companion6 = companion5;
                    gapComposer14.end(false);
                    if (i6 != list3.size() - 1) {
                        gapComposer14.startReplaceGroup(1240130202);
                        DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, composer11, null);
                        gapComposer14.end(false);
                    } else {
                        gapComposer14.startReplaceGroup(1240198340);
                        DBUtil.SpacerWithinSectionMedium(0, 1, composer11, null);
                        gapComposer14.end(false);
                    }
                    i6 = i7;
                    companion5 = companion6;
                    list2 = list3;
                }
                gapComposer14.end(false);
                gapComposer14.end(true);
                DimensionKt.ButtonCtaGroup(null, true, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(2137968375, new MoneyTabBookletKt$$ExternalSyntheticLambda4(17, function110, investingCategoryFilterViewModel), composer11), composer11, 25008, 9);
                gapComposer14.end(true);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ LocalViewFactory$$ExternalSyntheticLambda4(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ LocalViewFactory$$ExternalSyntheticLambda4(DirectDepositUpdateManualFormDetailsViewModel directDepositUpdateManualFormDetailsViewModel, Function1 function1) {
        this.$r8$classId = 24;
        this.f$0 = directDepositUpdateManualFormDetailsViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ LocalViewFactory$$ExternalSyntheticLambda4(Function1 function1, RealSheetState realSheetState) {
        this.$r8$classId = 6;
        this.f$0 = function1;
        this.f$1 = realSheetState;
    }
}
