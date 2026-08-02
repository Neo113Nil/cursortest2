package com.squareup.cash.payments.views.nearby;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.list.ListOrderedKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.instruments.viewmodels.InstrumentAvatarViewModel;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.paychecks.views.PaycheckCircles$$ExternalSyntheticLambda4;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.screens.NearbyAvatarInfo;
import com.squareup.cash.payments.screens.NearbyPayer;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestHelpViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPayersSheetViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPaymentKeypadViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPaymentsInfoViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPeopleOverflowSheetViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPermissionsPromptSheetViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPerson;
import com.squareup.cash.payments.views.NoteRequiredViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.payments.views.WarningDialogViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.payments.views.composer.ReviewPaymentKt$$ExternalSyntheticLambda11;
import com.squareup.cash.payments.views.personalization.ActionMenuKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pdf.view.PdfPreviewView$$ExternalSyntheticLambda1;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.pools.applets.views.PoolsAppletTileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda1;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda4;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda8;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class NearbyPayRequestViewKt {
    public static final ComposableLambdaImpl lambda$546355482 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(9), false, 546355482);

    /* renamed from: lambda$-986712738, reason: not valid java name */
    public static final ComposableLambdaImpl f561lambda$986712738 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(10), false, -986712738);
    public static final ComposableLambdaImpl lambda$1778855481 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda4(21), false, 1778855481);
    public static final ComposableLambdaImpl lambda$493131426 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda4(22), false, 493131426);
    public static final ComposableLambdaImpl lambda$1516075516 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(11), false, 1516075516);

    /* renamed from: lambda$-1922241637, reason: not valid java name */
    public static final ComposableLambdaImpl f559lambda$1922241637 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(12), false, -1922241637);

    /* renamed from: lambda$-769038046, reason: not valid java name */
    public static final ComposableLambdaImpl f560lambda$769038046 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(13), false, -769038046);

    public static final void InstrumentInformation(Function0 function0, String str, String str2, InstrumentAvatarViewModel instrumentAvatarViewModel, RealImageLoader realImageLoader, Modifier modifier, Composer composer, int i) {
        String str3 = str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(666207170);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(function0) ? 4 : 2) | (gapComposer.changed(str3) ? 32 : 16) | (gapComposer.changed(str2) ? 256 : 128) | (gapComposer.changed(instrumentAvatarViewModel) ? 2048 : 1024) | (gapComposer.changedInstance(realImageLoader) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(modifier) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f);
            Modifier clip = ClipKt.clip(modifier, m340RoundedCornerShape0680j_4);
            Strings.getSizes(gapComposer).getClass();
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(clip, 1.0f, Strings.getColors(gapComposer).semantic.border.standard, m340RoundedCornerShape0680j_4);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 0, 15);
            String stringResource = Room.stringResource(gapComposer, R.string.instrument_selector_accessibility_hint);
            Role role = new Role(0);
            boolean z = (i2 & 14) == 4;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ToViewKt$$ExternalSyntheticLambda2(16, function0);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m182clickableO2vRcR0$default(m178borderxT4_qwU, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, stringResource, role, (Function0) rememberedValue2, 4), 10.0f);
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer, 48);
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
            if (instrumentAvatarViewModel != null) {
                gapComposer.startReplaceGroup(1677824024);
                ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(230770406, new ReviewPaymentKt$$ExternalSyntheticLambda11(realImageLoader, instrumentAvatarViewModel, 2), gapComposer), gapComposer, 6);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1678043132);
                gapComposer.end(false);
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
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
            str3 = str;
            String upperCase = str3.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelXSmall, (TextLineBalancing) null, upperCase, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            if (str2.length() > 0) {
                gapComposer.startReplaceGroup(1838962049);
                Room.m1165Text25TpFw(0, 1, 0, 0, ((i2 >> 6) & 14) | 1572864, 0, 4018, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelXSmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1839151366);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            if (instrumentAvatarViewModel == null || (instrumentAvatarViewModel.fallbackIcon instanceof InstrumentAvatarViewModel.FallbackIcon.Add)) {
                gapComposer.startReplaceGroup(1678779196);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1678646392);
                Trace.m1191Iconww6aTOc(Icons.Expand24, (String) null, (Modifier) null, Strings.getColors(gapComposer).semantic.text.standard, gapComposer, 54, 4);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SwipeToDismissKt$$ExternalSyntheticLambda3(function0, str3, str2, instrumentAvatarViewModel, realImageLoader, modifier, i);
        }
    }

    public static final void NearbyPayRequestHelpContent(NearbyPayRequestHelpViewModel nearbyPayRequestHelpViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(195923227);
        int i2 = (gapComposer.changedInstance(nearbyPayRequestHelpViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Transformations.SheetHeader(nearbyPayRequestHelpViewModel.title, (Modifier) null, (Function2) null, nearbyPayRequestHelpViewModel.subtitle, gapComposer, 0, 6);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            boolean changedInstance = gapComposer.changedInstance(nearbyPayRequestHelpViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(nearbyPayRequestHelpViewModel, 13);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ListOrderedKt.ListOrderedStandard(0, 1, gapComposer, (Modifier) null, (Function1) rememberedValue);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-2131845981, new NearbyPayRequestHelpViewKt$$ExternalSyntheticLambda1(function1, nearbyPayRequestHelpViewModel), gapComposer), gapComposer, 24576, 15);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewView$$ExternalSyntheticLambda1((Object) nearbyPayRequestHelpViewModel, function1, (Object) modifier, i, 14);
        }
    }

    public static final void NearbyPayRequestHelpView(NearbyPayRequestHelpViewModel nearbyPayRequestHelpViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        nearbyPayRequestHelpViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1740889862);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(nearbyPayRequestHelpViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new WarningDialogViewKt$$ExternalSyntheticLambda5(25, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SheetKt.Sheet((Function0) rememberedValue, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1982252369, new NearbyPayRequestHelpViewKt$$ExternalSyntheticLambda1(nearbyPayRequestHelpViewModel, function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(nearbyPayRequestHelpViewModel, function1, i, i3);
        }
    }

    public static final void NearbyPayRequestTitleBar(NearbyPayRequestViewModel nearbyPayRequestViewModel, Function1 function1, Composer composer, int i) {
        nearbyPayRequestViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1823369455);
        int i2 = (gapComposer.changedInstance(nearbyPayRequestViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-2008264873, new NearbyPayRequestViewKt$$ExternalSyntheticLambda1(nearbyPayRequestViewModel, function1, i3, r3), gapComposer);
            NavigationType navigationType = NavigationType.CLOSE;
            r3 = (i2 & 112) == 32 ? (byte) 1 : (byte) 0;
            Object rememberedValue = gapComposer.rememberedValue();
            if (r3 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ActionMenuKt$$ExternalSyntheticLambda0(1, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(rememberComposableLambda, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-311809678, new PdfPreviewViewKt$$ExternalSyntheticLambda4(5, function1), gapComposer), gapComposer, 1572918, 44);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NearbyPayRequestViewKt$$ExternalSyntheticLambda1(nearbyPayRequestViewModel, function1, i);
        }
    }

    public static final void NearbyPayRequestView(Function1 function1, NearbyPayRequestViewModel nearbyPayRequestViewModel, RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, Composer composer, int i) {
        int i2;
        function1.getClass();
        nearbyPayRequestViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1280594457);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(nearbyPayRequestViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(realCashVibrator) ? 2048 : 1024;
        }
        byte b = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new WarningDialogViewKt$$ExternalSyntheticLambda5(27, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime(realCashVibrator)}, Expect_jvmKt.rememberComposableLambda(1009211097, new NearbyPayRequestViewKt$$ExternalSyntheticLambda1(nearbyPayRequestViewModel, function1, b, b), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(function1, nearbyPayRequestViewModel, realImageLoader, realCashVibrator, i, 2);
        }
    }

    public static final void NearbyPayerRow(NearbyPayer nearbyPayer, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-337592771);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(nearbyPayer) ? 4 : 2) | i;
        byte b = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(Expect_jvmKt.rememberComposableLambda(1876956895, new NearbyPayersSheetViewKt$$ExternalSyntheticLambda7(nearbyPayer, b, b), gapComposer), Expect_jvmKt.rememberComposableLambda(1911780832, new NearbyPayersSheetViewKt$$ExternalSyntheticLambda7(nearbyPayer, i2, b), gapComposer), null, null, null, false, false, Expect_jvmKt.rememberComposableLambda(2120724454, new NearbyPayersSheetViewKt$$ExternalSyntheticLambda7(nearbyPayer, 3, b), gapComposer), null, new CellDefaultAccessory.Label(nearbyPayer.amountFormatted, 0), 0L, null, gapComposer, 12582966, 0, 3452);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NearbyPayersSheetViewKt$$ExternalSyntheticLambda7(nearbyPayer, i);
        }
    }

    public static final void NearbyPayersSheetContent(NearbyPayersSheetViewModel nearbyPayersSheetViewModel, Modifier modifier, Composer composer, int i) {
        NearbyPayersSheetViewModel nearbyPayersSheetViewModel2 = nearbyPayersSheetViewModel;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1974769761);
        int i2 = i | (gapComposer.changedInstance(nearbyPayersSheetViewModel2) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape);
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
            String str = nearbyPayersSheetViewModel2.headerText;
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).header;
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            nearbyPayersSheetViewModel2 = nearbyPayersSheetViewModel;
            boolean changedInstance = gapComposer.changedInstance(nearbyPayersSheetViewModel2);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(nearbyPayersSheetViewModel2, 14);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.LazyColumn(null, null, null, null, null, null, false, null, (Function1) rememberedValue, gapComposer, 0, 511);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewViewKt$$ExternalSyntheticLambda0(nearbyPayersSheetViewModel2, modifier, i, 7);
        }
    }

    public static final void NearbyPayersSheetView(Function1 function1, NearbyPayersSheetViewModel nearbyPayersSheetViewModel, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        function1.getClass();
        nearbyPayersSheetViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1071454807);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(nearbyPayersSheetViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-1643442409, new NearbyPayersSheetViewKt$$ExternalSyntheticLambda0(function1, nearbyPayersSheetViewModel, i3), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(function1, (Object) nearbyPayersSheetViewModel, (Object) realImageLoader, i, 21);
        }
    }

    public static final void NearbyPaymentKeypadView(NearbyPaymentKeypadViewModel nearbyPaymentKeypadViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        String m;
        int i3;
        NeverEqualPolicy neverEqualPolicy;
        nearbyPaymentKeypadViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1252742090);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(nearbyPaymentKeypadViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            RecipientViewModel.Avatar avatar = nearbyPaymentKeypadViewModel.recipient.avatar;
            Object obj = null;
            RecipientViewModel.Avatar.PhotoImageAvatar photoImageAvatar = avatar instanceof RecipientViewModel.Avatar.PhotoImageAvatar ? (RecipientViewModel.Avatar.PhotoImageAvatar) avatar : null;
            Image image = photoImageAvatar != null ? photoImageAvatar.photoImage : null;
            if (image == null) {
                gapComposer.startReplaceGroup(-1468498018);
                gapComposer.end(false);
                m = null;
            } else {
                m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer, -1294296893, image, gapComposer, false);
            }
            boolean changed = gapComposer.changed(m);
            Object rememberedValue = gapComposer.rememberedValue();
            int i4 = 10;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy2) {
                if (m != null) {
                    i3 = 10;
                    neverEqualPolicy = neverEqualPolicy2;
                    obj = new AvatarImage.Remote.Image(m, false, null, 0L, new SheetKt$$ExternalSyntheticLambda8(m, i4), 62);
                } else {
                    i3 = 10;
                    neverEqualPolicy = neverEqualPolicy2;
                }
                gapComposer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
                i3 = 10;
                neverEqualPolicy = neverEqualPolicy2;
            }
            AvatarImage.Remote.Image image2 = (AvatarImage.Remote.Image) obj;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ActionMenuKt$$ExternalSyntheticLambda0(i3, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue2, gapComposer, 0, 1);
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(451416310, new NearbyPaymentKeypadViewKt$$ExternalSyntheticLambda2(function1, nearbyPaymentKeypadViewModel, image2, realImageLoader, 0), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(nearbyPaymentKeypadViewModel, function1, realImageLoader, i, 22);
        }
    }

    public static final void NearbyPaymentsInfoView(Function1 function1, NearbyPaymentsInfoViewModel nearbyPaymentsInfoViewModel, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        function1.getClass();
        nearbyPaymentsInfoViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1831237207);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(nearbyPaymentsInfoViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(1489919209, new NearbyPaymentsInfoViewKt$$ExternalSyntheticLambda0(function1, nearbyPaymentsInfoViewModel, i3), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(function1, (Object) nearbyPaymentsInfoViewModel, (Object) realImageLoader, i, 23);
        }
    }

    public static final void NearbyPeopleOverflowSheetContent(NearbyPeopleOverflowSheetViewModel nearbyPeopleOverflowSheetViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-826672961);
        int i2 = i | (gapComposer.changedInstance(nearbyPeopleOverflowSheetViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m177backgroundbw27NRU, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).header, (TextLineBalancing) null, nearbyPeopleOverflowSheetViewModel.title, (Map) null, (Function1) null, false);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            boolean changedInstance = gapComposer.changedInstance(nearbyPeopleOverflowSheetViewModel) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new OpenSourceKt$$ExternalSyntheticLambda11(7, nearbyPeopleOverflowSheetViewModel, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.LazyColumn(null, null, null, null, null, null, false, null, (Function1) rememberedValue, gapComposer, 0, 511);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewView$$ExternalSyntheticLambda1((Object) nearbyPeopleOverflowSheetViewModel, function1, (Object) modifier, i, 15);
        }
    }

    public static final void NearbyPeopleOverflowSheetView(Function1 function1, NearbyPeopleOverflowSheetViewModel nearbyPeopleOverflowSheetViewModel, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        function1.getClass();
        nearbyPeopleOverflowSheetViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1801951652);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(nearbyPeopleOverflowSheetViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-2144121244, new NearbyPeopleOverflowSheetViewKt$$ExternalSyntheticLambda0(function1, nearbyPeopleOverflowSheetViewModel, i3), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(function1, (Object) nearbyPeopleOverflowSheetViewModel, (Object) realImageLoader, i, 24);
        }
    }

    public static final void NearbyPermissionsPromptSheetContent(NearbyPermissionsPromptSheetViewModel.Ready ready, Function1 function1, Modifier modifier, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1352778283);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(ready) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(ready.heroImage, gapComposer), null, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 240.0f), null, ContentScale.Companion.FillWidth, null, gapComposer, 1573296, 1976);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            String str = ready.title;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            TextStyle textStyle = ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).header;
            gapComposer = gapComposer;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium, (TextLineBalancing) null, ready.body, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            function12 = function1;
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(2001425757, new ProfileKt$$ExternalSyntheticLambda1(15, (Object) ready, function12), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewView$$ExternalSyntheticLambda1((Object) ready, function12, (Object) modifier, i, 16);
        }
    }

    public static final void NearbyPermissionsPromptSheetView(Function1 function1, NearbyPermissionsPromptSheetViewModel nearbyPermissionsPromptSheetViewModel, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        function1.getClass();
        nearbyPermissionsPromptSheetViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1031658643);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(nearbyPermissionsPromptSheetViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-1128937811, new NearbyPermissionsPromptSheetViewKt$$ExternalSyntheticLambda0(function1, nearbyPermissionsPromptSheetViewModel, i3), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(function1, (Object) nearbyPermissionsPromptSheetViewModel, (Object) realImageLoader, i, 25);
        }
    }

    public static final void NearbyPersonRow(final NearbyPerson nearbyPerson, Function0 function0, Function0 function02, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1747960055);
        int i2 = i | (gapComposer2.changedInstance(nearbyPerson) ? 4 : 2) | (gapComposer2.changedInstance(function0) ? 32 : 16) | (gapComposer2.changedInstance(function02) ? 256 : 128) | (gapComposer2.changed(modifier) ? 2048 : 1024);
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer = gapComposer2;
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(Expect_jvmKt.rememberComposableLambda(246436903, new PdfPreviewViewKt$$ExternalSyntheticLambda0(9, function02, nearbyPerson), gapComposer2), Expect_jvmKt.rememberComposableLambda(549324294, new Function2() { // from class: com.squareup.cash.payments.views.nearby.NearbyPeopleOverflowSheetViewKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    NearbyPerson nearbyPerson2 = nearbyPerson;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, nearbyPerson2.name, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, nearbyPerson2.cashtag, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), modifier, function0, null, false, false, Expect_jvmKt.rememberComposableLambda(-1928318656, new Function2() { // from class: com.squareup.cash.payments.views.nearby.NearbyPeopleOverflowSheetViewKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    NearbyPerson nearbyPerson2 = nearbyPerson;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, nearbyPerson2.name, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, nearbyPerson2.cashtag, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), null, CellDefaultAccessory.Push.INSTANCE, 0L, null, gapComposer, ((i2 >> 3) & 896) | 817889334 | ((i2 << 6) & 7168), 0, 3440);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(nearbyPerson, function0, function02, modifier, i, 12);
        }
    }

    public static final void PayerOverlay(NearbyPayRequestViewModel nearbyPayRequestViewModel, Function0 function0, boolean z, List list, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1396290663);
        int i2 = i | (gapComposer.changedInstance(nearbyPayRequestViewModel) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128) | (gapComposer.changed(z) ? 2048 : 1024) | (gapComposer.changedInstance(list) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = (nearbyPayRequestViewModel instanceof NearbyPayRequestViewModel.Ready) && z && !list.isEmpty();
            Modifier align = BoxScopeInstance.INSTANCE.align(Modifier.Companion.$$INSTANCE, Alignment.Companion.BottomCenter);
            TweenSpec tween$default = AnimatableKt.tween$default(400, 0, null, 6);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new SvgDecoder$$ExternalSyntheticLambda0(1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            EnterTransitionImpl plus = EnterExitTransitionKt.slideInVertically(tween$default, (Function1) rememberedValue).plus(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(400, 0, null, 6), 2));
            TweenSpec tween$default2 = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SvgDecoder$$ExternalSyntheticLambda0(1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AnimatedContentKt.AnimatedVisibility(z2, align, plus, EnterExitTransitionKt.slideOutVertically(tween$default2, (Function1) rememberedValue2).plus(EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), 2)), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-49204287, new ProfileKt$$ExternalSyntheticLambda1(11, nearbyPayRequestViewModel, function0), gapComposer), (Composer) gapComposer, 200064, 16);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda0(nearbyPayRequestViewModel, function0, z, list, i, 27);
        }
    }

    /* renamed from: PersonFoundAvatar-jHo2IpA, reason: not valid java name */
    public static final void m3710PersonFoundAvatarjHo2IpA(final NearbyPerson nearbyPerson, final long j, final float f, final float f2, final float f3, final Function0 function0, final String str, Composer composer, final int i) {
        long j2;
        String m;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-935499410);
        int i2 = i | (gapComposer.changedInstance(nearbyPerson) ? 32 : 16) | (gapComposer.changed(j) ? 256 : 128) | (gapComposer.changed(f) ? 2048 : 1024) | (gapComposer.changed(f2) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(f3) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changed(str) ? 8388608 : 4194304);
        if (gapComposer.shouldExecute(i2 & 1, (4793489 & i2) != 4793488)) {
            final float mo236toPx0680j_4 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(90.0f);
            boolean changed = ((i2 & 7168) == 2048) | ((i2 & 896) == 256) | gapComposer.changed(mo236toPx0680j_4);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new Function1() { // from class: com.squareup.cash.payments.views.nearby.NearbyPayRequestViewKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((Density) obj).getClass();
                        return new IntOffset((((int) (Float.intBitsToFloat((int) (r0 & BodyPartID.bodyIdMax)) - (f / 2.0f))) & BodyPartID.bodyIdMax) | (((int) (Float.intBitsToFloat((int) (j >> 32)) - (mo236toPx0680j_4 / 2.0f))) << 32));
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier scale = ScaleKt.scale(AlphaKt.alpha(OffsetKt.offset(companion, (Function1) rememberedValue), f2), f3, f3);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new PoolDetailsViewKt$$ExternalSyntheticLambda3(5);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier semantics = SemanticsModifierKt.semantics(scale, true, (Function1) rememberedValue2);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(semantics, (MutableInteractionSourceImpl) rememberedValue3, null, false, str, new Role(0), function0, 4);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m182clickableO2vRcR0$default);
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
            AvatarSize avatarSize = AvatarSize.Size64;
            NearbyAvatarInfo nearbyAvatarInfo = nearbyPerson.avatar;
            Character ch = nearbyAvatarInfo.monogram;
            String valueOf = ch != null ? String.valueOf(ch.charValue()) : null;
            if (valueOf == null) {
                valueOf = "";
            }
            Color forTheme = ThemablesKt.forTheme(nearbyAvatarInfo.accentColor, gapComposer);
            if (forTheme == null) {
                gapComposer.startReplaceGroup(-220775766);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors.semantic.background.subtle;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-220778215);
                gapComposer.end(false);
                j2 = forTheme.value;
            }
            Image image = nearbyAvatarInfo.image;
            if (image == null) {
                gapComposer.startReplaceGroup(1745942608);
                gapComposer.end(false);
                m = null;
            } else {
                m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer, -220773935, image, gapComposer, false);
            }
            TextViewKt.m3613AvatarB_rZmmc(avatarSize, valueOf, j2, (String) null, ZIndexModifierKt.zIndex(companion, 1.0f), (AvatarImage) (m != null ? new AvatarImage.Remote.Image(m, false, null, 0L, new SheetKt$$ExternalSyntheticLambda8(m, 7), 62) : null), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer, 27654, 0, 1984);
            gapComposer = gapComposer;
            String str2 = nearbyPerson.name;
            Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            m3711StrokedText3IgeMak(MLKEMEngine.KyberPolyBytes, colors2.semantic.background.f1047app, gapComposer, SizeKt.m290width3ABfNKs(companion, 90.0f), str2);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(j, f, f2, f3, function0, str, i) { // from class: com.squareup.cash.payments.views.nearby.NearbyPayRequestViewKt$$ExternalSyntheticLambda25
                public final /* synthetic */ long f$2;
                public final /* synthetic */ float f$3;
                public final /* synthetic */ float f$4;
                public final /* synthetic */ float f$5;
                public final /* synthetic */ Function0 f$6;
                public final /* synthetic */ String f$7;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(7);
                    NearbyPayRequestViewKt.m3710PersonFoundAvatarjHo2IpA(NearbyPerson.this, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: StrokedText-3IgeMak, reason: not valid java name */
    public static final void m3711StrokedText3IgeMak(int i, long j, Composer composer, Modifier modifier, String str) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1493668355);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(j) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j2 = colors.semantic.text.standard;
            float mo236toPx0680j_4 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(16.0f);
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
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, 0L, null, null, 0L, null, 0L, null, null, new Stroke(mo236toPx0680j_4, RecyclerView.DECELERATION_RATE, 1, 1, null, 18), 0, 0L, null, null, 0, 16760831);
            Object rememberedValue = gapComposer.rememberedValue();
            int i3 = 6;
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PoolDetailsViewKt$$ExternalSyntheticLambda3(i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            int i4 = (i2 & 14) | 1769472;
            Room.m1165Text25TpFw(2, 2, 0, 3, i4 | ((i2 << 6) & 7168), 0, 3728, j, (Composer) gapComposer, SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue), m994copyp1EtxEg$default, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(2, 2, 0, 3, i4, 0, 3730, j2, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NearbyPayRequestViewKt$$ExternalSyntheticLambda34(j, str, modifier, i);
        }
    }
}
