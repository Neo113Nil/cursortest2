package com.squareup.cash.shopping.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.utils.StorageUtil;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.media3.ui.compose.PlayerSurfaceKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.sheet.EducationalSheetKt$$ExternalSyntheticLambda10;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.FilterBarKt;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.list.ListUnorderedItem;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.InfoUpsellKt$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.NavigationIconType;
import com.squareup.cash.profile.views.TaxesPasswordViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda11;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.sharesheet.ShareSheetPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.sheet.BasicShieetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.sheet.RealSheetState$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.shopping.viewmodels.AutofillFooterViewModel;
import com.squareup.cash.shopping.viewmodels.CashAppPayIncentiveSheetViewModel;
import com.squareup.cash.shopping.viewmodels.FooterButtonStyle;
import com.squareup.cash.shopping.viewmodels.PaykitInfoToastViewModel;
import com.squareup.cash.shopping.viewmodels.PillStage;
import com.squareup.cash.shopping.viewmodels.RestrictedItemWarningSheetViewModel;
import com.squareup.cash.shopping.viewmodels.WebNavigationFooterViewModel;
import com.squareup.cash.shopping.viewmodels.WebNavigationHeaderModel;
import com.squareup.cash.shopping.views.search.ShopHubResultsListKt$$ExternalSyntheticLambda14;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda1;
import com.squareup.cash.work.views.you.WorkYouViewKt$$ExternalSyntheticLambda2;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.Tags;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class ShopErrorKt {
    public static final ComposableLambdaImpl lambda$59991484;
    public static final ComposableLambdaImpl lambda$603932591;

    /* renamed from: lambda$-453156434, reason: not valid java name */
    public static final ComposableLambdaImpl f667lambda$453156434 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(7), false, -453156434);

    /* renamed from: lambda$-1213625691, reason: not valid java name */
    public static final ComposableLambdaImpl f666lambda$1213625691 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(8), false, -1213625691);

    static {
        new ComposableLambdaImpl(new ShareSheetPresenter$$ExternalSyntheticLambda0(22), false, 1232167379);
        lambda$603932591 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(9), false, 603932591);
        new ComposableLambdaImpl(new ShareSheetPresenter$$ExternalSyntheticLambda0(23), false, 1102557687);
        lambda$59991484 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(10), false, 59991484);
    }

    public static final void ActionPill(Function0 function0, Pair pair, Composer composer, int i) {
        Pair pair2;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(161175024);
        int i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i | (gapComposer.changedInstance(pair) ? 32 : 16);
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            pair2 = pair;
            CrossfadeKt.Crossfade(pair2, (Modifier) null, AnimatableKt.tween$default(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, null, 6), "AnimatedArcadeActionPill", Expect_jvmKt.rememberComposableLambda(-1597433207, new ActionPillKt$$ExternalSyntheticLambda0(i3, function0), gapComposer), gapComposer, ((i2 >> 3) & 14) | 28032, 2);
        } else {
            pair2 = pair;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ActionPillKt$$ExternalSyntheticLambda1(function0, pair2, i, i3);
        }
    }

    public static final void AutofillFooter(Modifier modifier, AutofillFooterViewModel autofillFooterViewModel, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        autofillFooterViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-529767853);
        int i2 = i | 6 | (gapComposer.changedInstance(autofillFooterViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 16.0f, 8.0f), 1.0f);
            boolean changedInstance = gapComposer.changedInstance(autofillFooterViewModel) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BottomSheet$$ExternalSyntheticLambda3(7, autofillFooterViewModel, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            FilterBarKt.FilterBar(fillMaxWidth, null, null, (Function1) rememberedValue, gapComposer, 0, 6);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda1(modifier2, autofillFooterViewModel, function1, i, 19);
        }
    }

    public static final void AutofillSuccessToast(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Modifier wrapContentHeight;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-191634265);
        Applier applier = gapComposer.applier;
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(wrapContentHeight, Strings.getColors(gapComposer).semantic.background.brand, ColorKt.RectangleShape);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(m177backgroundbw27NRU, 16.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            Painter painter = Icons.CheckFill24.painter(gapComposer);
            long j = Strings.getColors(gapComposer).semantic.icon.inverse;
            ImageKt.Image(painter, null, null, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 48, 60);
            Strings.getSizes(gapComposer).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 8.0f));
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.inverse, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.info_autofilled), (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier2, i, 16);
        }
    }

    public static final void CashAppPayIncentivePromptSheet(CashAppPayIncentiveSheetViewModel cashAppPayIncentiveSheetViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-505219338);
        int i2 = (gapComposer.changedInstance(cashAppPayIncentiveSheetViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandsSearchView$$ExternalSyntheticLambda6(20, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1173985601, new ActionPillKt$$ExternalSyntheticLambda1(5, cashAppPayIncentiveSheetViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(cashAppPayIncentiveSheetViewModel, function1, i, 12);
        }
    }

    public static final void CashAppPayInfoToast(Modifier modifier, PaykitInfoToastViewModel paykitInfoToastViewModel, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(185808206);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (gapComposer.changedInstance(paykitInfoToastViewModel) ? 32 : 16);
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 19) != 18)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            int i6 = (i5 & 14) | 3072;
            Modifier modifier3 = modifier;
            ModalKt.m3381ToastBAHpl2s(modifier3, null, paykitInfoToastViewModel.title, f666lambda$1213625691, paykitInfoToastViewModel.description, null, null, gapComposer, i6, 482);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PlayerSurfaceKt$$ExternalSyntheticLambda2(modifier2, (Object) paykitInfoToastViewModel, i, i2, 15);
        }
    }

    public static final void NavigationButtons(Modifier modifier, Function0 function0, Function0 function02, boolean z, boolean z2, Composer composer, int i) {
        int i2;
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1022222311);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(z2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            String stringResource = Room.stringResource(gapComposer, R.string.action_bar_back);
            String stringResource2 = Room.stringResource(gapComposer, R.string.forward_content_description);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Icons icons = Icons.NavigationPopBack;
            boolean changed = gapComposer.changed(stringResource);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new RealSandboxer$$ExternalSyntheticLambda1(stringResource, 16);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            int i3 = i2 << 3;
            StorageUtil.ButtonIcon(icons, stringResource, function0, SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), z, null, gapComposer, (i3 & 896) | 6 | (i3 & 57344), 32);
            Modifier scale = ScaleKt.scale(companion, -1.0f, 1.0f);
            boolean changed2 = gapComposer.changed(stringResource2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new RealSandboxer$$ExternalSyntheticLambda1(stringResource2, 17);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            StorageUtil.ButtonIcon(icons, stringResource2, function02, SemanticsModifierKt.semantics(scale, false, (Function1) rememberedValue2), z2, null, gapComposer, (i2 & 896) | 6 | (i2 & 57344), 32);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EducationalSheetKt$$ExternalSyntheticLambda10(modifier, function0, function02, z, z2, i);
        }
    }

    public static final void ProductSearchToolbar(final String str, final boolean z, final boolean z2, final String str2, final Function1 function1, final Modifier modifier, final FocusRequester focusRequester, final Function1 function12, final Function0 function0, final Function0 function02, final Function0 function03, Composer composer, final int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1900030589);
        int i2 = i | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changed(z) ? 32 : 16) | (gapComposer2.changed(z2) ? 256 : 128) | (gapComposer2.changed(str2) ? 2048 : 1024) | (gapComposer2.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changedInstance(function12) ? 8388608 : 4194304) | (gapComposer2.changedInstance(function0) ? 67108864 : 33554432) | (gapComposer2.changedInstance(function02) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if (gapComposer2.shouldExecute(i2 & 1, ((306783379 & i2) == 306783378 && ((gapComposer2.changedInstance(function03) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            int i3 = (i2 & 14) | 100663296;
            int i4 = i2 >> 6;
            gapComposer = gapComposer2;
            ShopHubToolbar(str, str2, function1, modifier, focusRequester, function12, function0, function02, Expect_jvmKt.rememberComposableLambda(-1478189774, new ProductSearchViewKt$$ExternalSyntheticLambda0(z2, function03, z), gapComposer2), gapComposer, i3 | (i4 & 112) | (i4 & 896) | 27648 | (458752 & i4) | (3670016 & i4) | (i4 & 29360128), 0);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(str, z, z2, str2, function1, modifier, focusRequester, function12, function0, function02, function03, i) { // from class: com.squareup.cash.shopping.views.ProductSearchViewKt$$ExternalSyntheticLambda1
                public final /* synthetic */ String f$0;
                public final /* synthetic */ boolean f$1;
                public final /* synthetic */ Function0 f$10;
                public final /* synthetic */ boolean f$2;
                public final /* synthetic */ String f$3;
                public final /* synthetic */ Function1 f$4;
                public final /* synthetic */ Modifier f$5;
                public final /* synthetic */ FocusRequester f$6;
                public final /* synthetic */ Function1 f$7;
                public final /* synthetic */ Function0 f$8;
                public final /* synthetic */ Function0 f$9;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1769473);
                    ShopErrorKt.ProductSearchToolbar(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void ShopEmptyView(int i, Composer composer, Modifier modifier, String str, String str2) {
        str.getClass();
        str2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(11176843);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i | (gapComposer.changed(str2) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new RealSheetState$$ExternalSyntheticLambda0(28);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ShopEmptyViewKt$$ExternalSyntheticLambda1(str, str2, 0);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AndroidView_androidKt.AndroidView(function1, modifier, (Function1) rememberedValue2, gapComposer, 54, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkYouViewKt$$ExternalSyntheticLambda2(str, str2, modifier, i, 8);
        }
    }

    public static final void ShopError(int i, Composer composer, Modifier modifier, String str, String str2, String str3, Function0 function0) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1832147394);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changed(str3) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(modifier) ? 2048 : 1024;
        }
        int i3 = i2 | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked);
        int i4 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            Arrangement$Center$1 arrangement$Center$1 = SpacerKt.Center;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape), 24.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Center$1, horizontal, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            TextStyle textStyle = ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).labelMedium;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Room.m1165Text25TpFw(0, 0, 0, 3, (i3 & 14) | 48, 0, 3832, 0L, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, 7), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 3, ((i3 >> 3) & 14) | 48, 0, 3832, 0L, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            coil3.size.SizeKt.ButtonCompact(function0, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(34078380, new ShopErrorKt$$ExternalSyntheticLambda0(str3, i4), gapComposer), gapComposer, ((i3 >> 12) & 14) | 1572864, 62);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShopErrorKt$$ExternalSyntheticLambda1(str, str2, str3, modifier, function0, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShopHubToolbar(String str, String str2, Function1 function1, Modifier modifier, FocusRequester focusRequester, Function1 function12, Function0 function0, Function0 function02, Function2 function2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Function0 function03;
        int i4;
        Function2 function22;
        int i5;
        Modifier modifier3;
        Function2 function23;
        RecomposeScopeImpl endRestartGroup;
        str.getClass();
        str2.getClass();
        function1.getClass();
        focusRequester.getClass();
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(839003952);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= gapComposer.changed(focusRequester) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if ((196608 & i) == 0) {
                i3 |= gapComposer.changedInstance(function12) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            if ((1572864 & i) != 0) {
                function03 = function0;
                i3 |= gapComposer.changedInstance(function03) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            } else {
                function03 = function0;
            }
            if ((12582912 & i) == 0) {
                i3 |= gapComposer.changedInstance(function02) ? 8388608 : 4194304;
            }
            i4 = i2 & 256;
            if (i4 == 0) {
                i3 |= 100663296;
            } else if ((100663296 & i) == 0) {
                function22 = function2;
                i3 |= gapComposer.changedInstance(function22) ? 67108864 : 33554432;
                i5 = i3;
                if (gapComposer.shouldExecute(i5 & 1, (38347923 & i3) != 38347922)) {
                    Modifier modifier4 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    Function2 function24 = i4 != 0 ? null : function22;
                    KeypadKt.m3653Toolbar7ZsnBMk(Expect_jvmKt.rememberComposableLambda(-2139702400, new BasicShieetKt$$ExternalSyntheticLambda0(str, function1, focusRequester, function12, function03, str2, function24), gapComposer), modifier4, NavigationIconType.BACK, 0L, function02, null, gapComposer, ((i5 >> 6) & 112) | 3078 | ((i5 >> 3) & 3670016), EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE);
                    modifier3 = modifier4;
                    function23 = function24;
                } else {
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier2;
                    function23 = function22;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new InfoUpsellKt$$ExternalSyntheticLambda0(str, str2, function1, modifier3, focusRequester, function12, function0, function02, function23, i, i2);
                    return;
                }
                return;
            }
            function22 = function2;
            i5 = i3;
            if (gapComposer.shouldExecute(i5 & 1, (38347923 & i3) != 38347922)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((12582912 & i) == 0) {
        }
        i4 = i2 & 256;
        if (i4 == 0) {
        }
        function22 = function2;
        i5 = i3;
        if (gapComposer.shouldExecute(i5 & 1, (38347923 & i3) != 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void ShopLoadingProgress(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(256456125);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 50.0f));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier, i, 17);
        }
    }

    public static final void WarningSheetContent(RestrictedItemWarningSheetViewModel restrictedItemWarningSheetViewModel, Function1 function1, Composer composer, int i) {
        RestrictedItemWarningSheetViewModel restrictedItemWarningSheetViewModel2;
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1023302914);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(restrictedItemWarningSheetViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
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
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
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
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 27.0f));
            TextViewKt.Avatar(AvatarSize.Size64, new AvatarEntry("", Strings.getColors(gapComposer).semantic.background.danger, null, new AvatarImage.LocalIcon(Icons.Alert32, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE), SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), false, gapComposer, 390, 24);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 12.0f));
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).header, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.restricted_item_warning_sheet_title), (Map) null, (Function1) null, false);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 4.0f));
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.restricted_item_warning_sheet_body), (Map) null, (Function1) null, false);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            restrictedItemWarningSheetViewModel2 = restrictedItemWarningSheetViewModel;
            ListUnorderedKt.ListUnordered(Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.listOf(new ListUnorderedItem(restrictedItemWarningSheetViewModel2.name, Icons.TimeInfinite16, null, null, 8))), (Modifier) null, (ListUnorderedState) null, ListUnorderedProminence.Subtle, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, gapComposer, 3072, 54);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            gapComposer.end(true);
            function12 = function1;
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-336299894, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(20, function12), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
        } else {
            restrictedItemWarningSheetViewModel2 = restrictedItemWarningSheetViewModel;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(restrictedItemWarningSheetViewModel2, function12, i, 13);
        }
    }

    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    public static final void WebNavigationFooter(Modifier modifier, final WebNavigationFooterViewModel webNavigationFooterViewModel, final Function1 function1, final Function0 function0, final Function0 function02, Composer composer, final int i) {
        Function0 function03;
        WebNavigationFooterViewModel webNavigationFooterViewModel2;
        Function1 function12;
        final Modifier modifier2;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        ?? r7;
        boolean z;
        int i2;
        int i3;
        String m;
        boolean z2;
        boolean z3;
        webNavigationFooterViewModel.getClass();
        FooterButtonStyle footerButtonStyle = webNavigationFooterViewModel.buttonStyle;
        function1.getClass();
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(244664891);
        Applier applier = gapComposer2.applier;
        int i4 = i | 6;
        if ((i & 48) == 0) {
            i4 |= gapComposer2.changedInstance(webNavigationFooterViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= gapComposer2.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function03 = function02;
            i4 |= gapComposer2.changedInstance(function03) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            function03 = function02;
        }
        int i5 = i4;
        if (gapComposer2.shouldExecute(i5 & 1, (i5 & 9363) != 9362)) {
            boolean z4 = footerButtonStyle instanceof FooterButtonStyle.FooterButtonStyleV2;
            final Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (!z4) {
                endRestartGroup = gapComposer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i6 = 0;
                    final Function0 function04 = function03;
                    function2 = new Function2() { // from class: com.squareup.cash.shopping.views.WebNavigationFooterKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i6) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    ShopErrorKt.WebNavigationFooter(companion, webNavigationFooterViewModel, function1, function0, function04, (Composer) obj, Updater.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    ShopErrorKt.WebNavigationFooter(companion, webNavigationFooterViewModel, function1, function0, function04, (Composer) obj, Updater.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            webNavigationFooterViewModel2 = webNavigationFooterViewModel;
            function12 = function1;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(companion, 64.0f), 1.0f);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer2, 54);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
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
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            GapComposer gapComposer3 = gapComposer2;
            NavigationButtons(SpacerKt.m302paddingqDBjuR0$default(companion, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), function02, function0, webNavigationFooterViewModel2.canGoBack, webNavigationFooterViewModel2.canGoForward, gapComposer3, ((i5 >> 9) & 112) | 6 | ((i5 >> 3) & 896));
            gapComposer3.startReplaceGroup(-1377033069);
            FooterButtonStyle.FooterButtonStyleV2 footerButtonStyleV2 = (FooterButtonStyle.FooterButtonStyleV2) footerButtonStyle;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(new LayoutWeightElement(1.0f, true), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, 11);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.End, Alignment.Companion.Top, gapComposer3, 6);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m302paddingqDBjuR0$default);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            boolean z5 = (i5 & 896) == 256;
            Object rememberedValue = gapComposer3.rememberedValue();
            if (z5 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandsSearchView$$ExternalSyntheticLambda6(26, function12);
                gapComposer3.updateRememberedValue(rememberedValue);
            }
            Function0 function05 = (Function0) rememberedValue;
            boolean z6 = footerButtonStyleV2 instanceof FooterButtonStyle.FooterButtonStyleV2.IncentiveButton;
            PillStage.Initial initial = PillStage.Initial.INSTANCE;
            PillStage.Confirmed confirmed = PillStage.Confirmed.INSTANCE;
            if (z6) {
                gapComposer3.startReplaceGroup(-1161234385);
                String str = ((FooterButtonStyle.FooterButtonStyleV2.IncentiveButton) footerButtonStyleV2).discountAmount;
                if (initial.equals(confirmed)) {
                    gapComposer3.startReplaceGroup(-1638498952);
                    m = Room.stringResource(R.string.discount_used_info_button_text, new Object[]{str}, gapComposer3);
                    z3 = false;
                    gapComposer3.end(false);
                } else {
                    z3 = false;
                    gapComposer3.startReplaceGroup(-1638394947);
                    m = Room.stringResource(R.string.discount_info_button_text, new Object[]{str}, gapComposer3);
                    gapComposer3.end(false);
                }
                gapComposer3.end(z3);
                r7 = z3;
            } else if (footerButtonStyleV2 instanceof FooterButtonStyle.FooterButtonStyleV2.AffiliateButton) {
                gapComposer3.startReplaceGroup(-1161225873);
                String str2 = ((FooterButtonStyle.FooterButtonStyleV2.AffiliateButton) footerButtonStyleV2).discountAmount;
                if (initial.equals(confirmed)) {
                    gapComposer3.startReplaceGroup(-1638235080);
                    m = Room.stringResource(R.string.discount_used_info_button_text, new Object[]{str2}, gapComposer3);
                    z2 = false;
                    gapComposer3.end(false);
                } else {
                    z2 = false;
                    gapComposer3.startReplaceGroup(-1638131075);
                    m = Room.stringResource(R.string.discount_info_button_text, new Object[]{str2}, gapComposer3);
                    gapComposer3.end(false);
                }
                gapComposer3.end(z2);
                r7 = z2;
            } else {
                r7 = 0;
                if (footerButtonStyleV2 instanceof FooterButtonStyle.FooterButtonStyleV2.AfterPayButton) {
                    m = re$$ExternalSyntheticOutline0.m(gapComposer3, -1161217760, R.string.afterpay_applet_button_text, gapComposer3, false);
                } else {
                    if (!(footerButtonStyleV2 instanceof FooterButtonStyle.FooterButtonStyleV2.SingleUsePaymentButton)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1161235108, false);
                    }
                    gapComposer3.startReplaceGroup(-1637907193);
                    PillStage pillStage = ((FooterButtonStyle.FooterButtonStyleV2.SingleUsePaymentButton) footerButtonStyleV2).pillStage;
                    if (pillStage.equals(initial) || pillStage.equals(PillStage.SUPPillStage.SetUpPlan.INSTANCE) || pillStage.equals(PillStage.Error.INSTANCE)) {
                        z = false;
                        i2 = -1161212159;
                        i3 = R.string.SUP_initial_info_button_text;
                    } else if (pillStage.equals(PillStage.SUPPillStage.PlanDetails.INSTANCE)) {
                        i2 = -1161209498;
                        i3 = R.string.SUP_show_plan_details_button_text;
                        z = false;
                    } else {
                        z = false;
                        if (!pillStage.equals(confirmed)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1161214373, false);
                        }
                        i2 = -1161206786;
                        i3 = R.string.SUP_completed_button_text;
                    }
                    m = re$$ExternalSyntheticOutline0.m(gapComposer3, i2, i3, gapComposer3, z);
                    gapComposer3.end(z);
                    r7 = z;
                }
            }
            ActionPill(function05, new Pair(m, footerButtonStyleV2.getPillStage()), gapComposer3, r7);
            Boxes$$ExternalSyntheticOutline1.m(gapComposer3, true, (boolean) r7, true);
            modifier2 = companion;
            gapComposer = gapComposer3;
        } else {
            GapComposer gapComposer4 = gapComposer2;
            webNavigationFooterViewModel2 = webNavigationFooterViewModel;
            function12 = function1;
            gapComposer4.skipToGroupEnd();
            modifier2 = modifier;
            gapComposer = gapComposer4;
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i7 = 1;
            final WebNavigationFooterViewModel webNavigationFooterViewModel3 = webNavigationFooterViewModel2;
            final Function1 function13 = function12;
            function2 = new Function2() { // from class: com.squareup.cash.shopping.views.WebNavigationFooterKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i7) {
                        case 0:
                            ((Integer) obj2).getClass();
                            ShopErrorKt.WebNavigationFooter(modifier2, webNavigationFooterViewModel3, function13, function0, function02, (Composer) obj, Updater.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            ShopErrorKt.WebNavigationFooter(modifier2, webNavigationFooterViewModel3, function13, function0, function02, (Composer) obj, Updater.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final void WebNavigationHeader(WebNavigationHeaderModel webNavigationHeaderModel, Function1 function1, BasicShieetScope$$ExternalSyntheticLambda10 basicShieetScope$$ExternalSyntheticLambda10, Composer composer, int i) {
        webNavigationHeaderModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1333872943);
        int i2 = (gapComposer.changedInstance(webNavigationHeaderModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(basicShieetScope$$ExternalSyntheticLambda10) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            NavigationType navigationType = NavigationType.CLOSE;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-629205899, new SheetKt$$ExternalSyntheticLambda6(webNavigationHeaderModel, 14), gapComposer);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandsSearchView$$ExternalSyntheticLambda6(27, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(rememberComposableLambda, navigationType, m177backgroundbw27NRU, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-390319088, new ButtonGroupKt$$ExternalSyntheticLambda11(basicShieetScope$$ExternalSyntheticLambda10, 29), gapComposer), gapComposer, 1572918, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda1(webNavigationHeaderModel, function1, basicShieetScope$$ExternalSyntheticLambda10, i, 27);
        }
    }
}
