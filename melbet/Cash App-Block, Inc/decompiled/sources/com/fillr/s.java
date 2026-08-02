package com.fillr;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.paging.PageFetcher$flow$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.size.DimensionKt;
import com.google.android.gms.auth.api.identity.Identity;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.deposits.physical.view.PhysicalDepositViewFactory$$ExternalSyntheticLambda9;
import com.squareup.cash.deposits.physical.view.barcode.PaperMoneyDepositBarcodeViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.deposits.physical.view.barcode.PaperMoneyDepositBarcodeViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeViewModel;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda4;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.features.error.ErrorViewModel$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.success.SuccessContentKt;
import com.stripe.android.financialconnections.features.success.SuccessState;
import com.stripe.android.financialconnections.features.success.SuccessViewModel;
import com.stripe.android.financialconnections.model.Body$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* loaded from: classes6.dex */
public abstract class s {
    public static final void BarcodeFooter(PaperMoneyDepositBarcodeViewModel.Ready ready, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1118352261);
        int i2 = (gapComposer.changedInstance(ready) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            DimensionKt.ButtonCtaGroup(null, false, null, Expect_jvmKt.rememberComposableLambda(-1721602470, new PaperMoneyDepositBarcodeViewKt$$ExternalSyntheticLambda11(ready, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(1656136505, new PaperMoneyDepositBarcodeViewKt$$ExternalSyntheticLambda11(function1, ready), gapComposer), gapComposer, 27648, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaperMoneyDepositBarcodeViewKt$$ExternalSyntheticLambda6(ready, function1, i, i3);
        }
    }

    public static final void BarcodeSection(PaperMoneyDepositBarcodeViewModel paperMoneyDepositBarcodeViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2039790166);
        int i2 = 16;
        int i3 = (gapComposer.changedInstance(paperMoneyDepositBarcodeViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ArcadeThemeKt.ArcadeTheme(ColorsLightKt.colorsLight, null, null, Expect_jvmKt.rememberComposableLambda(1603288117, new TabContentViewKt$$ExternalSyntheticLambda26(colors.isLight, paperMoneyDepositBarcodeViewModel, function1, i2), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PhysicalDepositViewFactory$$ExternalSyntheticLambda9(paperMoneyDepositBarcodeViewModel, function1, i, 3);
        }
    }

    public static final void LoadedBarcodeContent(PaperMoneyDepositBarcodeViewModel.Ready ready, Function1 function1, Composer composer, int i) {
        int i2;
        int i3;
        PaperMoneyDepositBarcodeViewModel.Ready ready2 = ready;
        Function1 function12 = function1;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1293765124);
        Applier applier = gapComposer.applier;
        int i4 = i | (gapComposer.changedInstance(ready2) ? 4 : 2) | (gapComposer.changedInstance(function12) ? 32 : 16);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape));
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
            NavigationType navigationType = NavigationType.BACK;
            boolean z = (i4 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda4(3, function12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(companion, 1.0f), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(-43713167, new ArcadeModal$$ExternalSyntheticLambda5(ready, 3), gapComposer), (Modifier) null, (Function2) null, Expect_jvmKt.rememberComposableLambda(-1226924684, new PaperMoneyDepositBarcodeViewKt$$ExternalSyntheticLambda6(ready, function1), gapComposer), gapComposer, 3078, 6);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(new HorizontalAlignElement(horizontal), 48.0f);
            GetPaperCashDepositBarcodeResponse.Success success = ready.success;
            AsyncImageKt.m1438AsyncImage10Xjiaw(success.title_image_url, null, m277height3ABfNKs, null, null, null, gapComposer, 48, 2040);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            int i5 = i4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
            BarcodeSection(ready, function1, gapComposer, i5);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            if (ready.showDetailRows) {
                gapComposer.startReplaceGroup(-1381050440);
                HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(horizontal);
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(horizontalAlignElement, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                String stringResource = Room.stringResource(gapComposer, R.string.barcode_fee_deposit_limits);
                TextStyle textStyle = Strings.getTypography(gapComposer).sectionTitle;
                gapComposer = gapComposer;
                i3 = i5;
                BiasAlignment.Horizontal horizontal2 = horizontal;
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3832, 0L, (Composer) gapComposer, m300paddingVpY3zN4$default, textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                for (String str : success.detail_rows) {
                    BiasAlignment.Horizontal horizontal3 = horizontal2;
                    HorizontalAlignElement horizontalAlignElement2 = new HorizontalAlignElement(horizontal3);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(horizontalAlignElement2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    TextStyle textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    horizontal2 = horizontal3;
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, colors.semantic.text.standard, (Composer) gapComposer, m300paddingVpY3zN4$default2, textStyle2, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                }
                i2 = 2;
                gapComposer.end(false);
            } else {
                i3 = i5;
                gapComposer = gapComposer;
                i2 = 2;
                gapComposer.startReplaceGroup(-1380254577);
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default3 = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                String str2 = success.detail_text;
                str2.getClass();
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, m300paddingVpY3zN4$default3, Strings.getTypography(gapComposer).bodyXSmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            if (1.0f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            ready2 = ready;
            function12 = function1;
            BarcodeFooter(ready2, function12, gapComposer, i3);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            i2 = 2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaperMoneyDepositBarcodeViewKt$$ExternalSyntheticLambda6(ready2, function12, i, i2);
        }
    }

    public static final void PaperMoneyDepositBarcodeView(PaperMoneyDepositBarcodeViewModel paperMoneyDepositBarcodeViewModel, Function1 function1, Composer composer, int i) {
        paperMoneyDepositBarcodeViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-899281100);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(paperMoneyDepositBarcodeViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1992767103, new PhysicalDepositViewFactory$$ExternalSyntheticLambda9(paperMoneyDepositBarcodeViewModel, function1, i4), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PhysicalDepositViewFactory$$ExternalSyntheticLambda9(paperMoneyDepositBarcodeViewModel, function1, i, i2);
        }
    }

    public static final void SuccessScreen(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1677297867);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = Identity.parentActivity(gapComposer).getViewModel().activityRetainedComponent;
            FinancialConnectionsSessionManifest.Pane pane = SuccessViewModel.PANE;
            daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.getClass();
            ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
            ErrorViewModel$Companion$$ExternalSyntheticLambda0 errorViewModel$Companion$$ExternalSyntheticLambda0 = new ErrorViewModel$Companion$$ExternalSyntheticLambda0(daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl, 12);
            ReflectionFactory reflectionFactory = Reflection.factory;
            chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(SuccessViewModel.class), errorViewModel$Companion$$ExternalSyntheticLambda0);
            InitializerViewModelFactory build = chunkIndexMerger.build();
            ViewModelStoreOwner current = LocalViewModelStoreOwner.getCurrent(gapComposer);
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            SuccessViewModel successViewModel = (SuccessViewModel) ((FinancialConnectionsViewModel) ViewModelKt.viewModel(reflectionFactory.getOrCreateKotlinClass(SuccessViewModel.class), current, build, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, gapComposer));
            MutableState collectAsState = StateFlowsComposeKt.collectAsState(successViewModel.stateFlow, gapComposer);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new Body$$ExternalSyntheticLambda0(12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(true, (Function0) rememberedValue, gapComposer, 54, 0);
            Async async = ((SuccessState) collectAsState.getValue()).completeSession;
            Async async2 = ((SuccessState) collectAsState.getValue()).payload;
            boolean changedInstance = gapComposer.changedInstance(successViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                PageFetcher$flow$1.AnonymousClass2.AnonymousClass1 anonymousClass1 = new PageFetcher$flow$1.AnonymousClass2.AnonymousClass1(0, successViewModel, SuccessViewModel.class, "onDoneClick", "onDoneClick()Lkotlinx/coroutines/Job;", 8, 6);
                gapComposer.updateRememberedValue(anonymousClass1);
                rememberedValue2 = anonymousClass1;
            }
            SuccessContentKt.SuccessContent(async, async2, (Function0) rememberedValue2, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PhoneNumberController$$ExternalSyntheticLambda5(i, 18);
        }
    }

    public static Element a(Node node, String str) {
        String namespaceURI;
        for (Node firstChild = node.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() == 1 && (namespaceURI = firstChild.getNamespaceURI()) != null && namespaceURI.equals("http://www.w3.org/2001/XMLSchema") && firstChild.getLocalName().equals(str)) {
                return (Element) firstChild;
            }
        }
        return null;
    }

    public static Element b(String str, Element element) {
        String namespaceURI;
        for (Node nextSibling = element.getNextSibling(); nextSibling != null; nextSibling = nextSibling.getNextSibling()) {
            if (nextSibling.getNodeType() == 1 && (namespaceURI = nextSibling.getNamespaceURI()) != null && namespaceURI.equals("http://www.w3.org/2001/XMLSchema") && nextSibling.getLocalName().equals(str)) {
                return (Element) nextSibling;
            }
        }
        return null;
    }

    public static Element c(Element element) {
        String namespaceURI;
        for (Node nextSibling = element.getNextSibling(); nextSibling != null; nextSibling = nextSibling.getNextSibling()) {
            if (nextSibling.getNodeType() == 1 && (namespaceURI = nextSibling.getNamespaceURI()) != null && namespaceURI.equals("http://www.w3.org/2001/XMLSchema")) {
                return (Element) nextSibling;
            }
        }
        return null;
    }

    public static Element a(String str, Element element) {
        for (Node nextSibling = element.getNextSibling(); nextSibling != null; nextSibling = nextSibling.getNextSibling()) {
            if (nextSibling.getNodeType() == 1 && nextSibling.getNodeName().equals(str)) {
                return (Element) nextSibling;
            }
        }
        return null;
    }

    public static Element b(Node node, String str) {
        String namespaceURI;
        for (Node firstChild = node.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() == 1 && (namespaceURI = firstChild.getNamespaceURI()) != null && namespaceURI.equals(str)) {
                return (Element) firstChild;
            }
        }
        return null;
    }
}
