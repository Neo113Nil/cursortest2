package com.squareup.cash.formview.components.arcade;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda11;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.formview.components.FormRemoteImageKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda4;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class ArcadeFormUpsellKt {

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormBlocker.Element.UpsellElement.CardLayout.values().length];
            try {
                iArr[FormBlocker.Element.UpsellElement.CardLayout.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormBlocker.Element.UpsellElement.CardLayout.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ArcadeFormUpsell(FormBlocker.Element.UpsellElement upsellElement, Function1 function1, RealImageLoader realImageLoader, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-970344770);
        int i2 = i | (gapComposer.changedInstance(upsellElement) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(realImageLoader) ? 256 : 128) | 3072;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1587542611, new FormRemoteImageKt$$ExternalSyntheticLambda0(realImageLoader, upsellElement, function1), gapComposer), gapComposer, 3072, 7);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyUiFactory$$ExternalSyntheticLambda1(upsellElement, function1, realImageLoader, modifier2, i, 8);
        }
    }

    public static final void CtaTextArrow(int i, Composer composer, Modifier modifier, String str) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1312230648);
        int i2 = (gapComposer2.changed(str) ? 4 : 2) | i | (gapComposer2.changed(modifier) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer = gapComposer2;
            zzacp.m2014InlineIconTextQqsJerU(str, Icons.Next16.painter(gapComposer2), modifier, Strings.getColors(gapComposer2).semantic.icon.standard, null, Strings.getTypography(gapComposer2).labelSmall, Strings.getColors(gapComposer2).semantic.text.standard, null, 0, 0, 0, 0, false, RecyclerView.DECELERATION_RATE, gapComposer, (i2 & 14) | (Painter.$stable << 3) | ((i2 << 3) & 896), 0, 32656);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda4(str, modifier, i, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public static final void HorizontalUpsellContent(FormBlocker.Element.UpsellElement upsellElement, Composer composer, int i) {
        ?? r1;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        Modifier.Companion companion3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1446430843);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(upsellElement) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion4 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion4, 1.0f);
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            String str = null;
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
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14, 1.0f, true);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m);
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
            Strings.getSizes(gapComposer).getClass();
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion4);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            String str2 = upsellElement.title;
            if (str2 == null || StringsKt.isBlank(str2)) {
                str2 = null;
            }
            if (str2 == null) {
                gapComposer.startReplaceGroup(1882447146);
                gapComposer.end(false);
                companion = companion4;
                r1 = 0;
            } else {
                gapComposer.startReplaceGroup(1882447147);
                r1 = 0;
                companion = companion4;
                LazyDslKt.m304MarkdownTextpCuZGqc(str2, null, SizeKt.fillMaxWidth(companion4, 1.0f), Strings.getTypography(gapComposer).labelMedium, Strings.getColors(gapComposer).semantic.text.standard, null, null, null, 0, 0, 0, gapComposer, 432, 2016);
                gapComposer.end(false);
            }
            String str3 = upsellElement.subtitle;
            if (str3 != null && !StringsKt.isBlank(str3)) {
                str = str3;
            }
            String str4 = str;
            if (str4 == null) {
                gapComposer.startReplaceGroup(1882812171);
                gapComposer.end(r1);
                companion2 = companion;
            } else {
                gapComposer.startReplaceGroup(1882812172);
                Modifier.Companion companion5 = companion;
                companion2 = companion5;
                LazyDslKt.m304MarkdownTextpCuZGqc(str4, null, SizeKt.fillMaxWidth(companion5, 1.0f), Strings.getTypography(gapComposer).bodySmall, Strings.getColors(gapComposer).semantic.text.subtle, null, null, null, 0, 10, 0, gapComposer, 805306800, 1504);
                gapComposer.end(r1);
            }
            gapComposer.end(true);
            BlockerAction blockerAction = upsellElement.button_action;
            if (blockerAction == null) {
                gapComposer.startReplaceGroup(949869243);
                gapComposer.end(r1);
                companion3 = companion2;
            } else {
                gapComposer.startReplaceGroup(949869244);
                String str5 = blockerAction.text;
                str5.getClass();
                Strings.getSizes(gapComposer).getClass();
                Modifier.Companion companion6 = companion2;
                companion3 = companion6;
                CtaTextArrow(r1, gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion6, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), str5);
                gapComposer.end(r1);
            }
            gapComposer.end(true);
            Image image = upsellElement.image;
            if (image == null) {
                gapComposer.startReplaceGroup(-322940061);
                gapComposer.end(r1);
            } else {
                gapComposer.startReplaceGroup(-322940060);
                ImageKt.Image(AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(r1, 30, gapComposer, ThemablesKt.urlForTheme(image, gapComposer)), null, SizeKt.m279heightInVpY3zN4$default(SizeKt.m292widthInVpY3zN4$default(companion3, RecyclerView.DECELERATION_RATE, 120.0f, 1), RecyclerView.DECELERATION_RATE, 120.0f, 1), Alignment.Companion.Center, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, null, gapComposer, 28080, 96);
                gapComposer.end(r1);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal$$ExternalSyntheticLambda5(upsellElement, i, 22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final void VerticalUpsellContent(FormBlocker.Element.UpsellElement upsellElement, Function1 function1, Composer composer, int i) {
        FormBlocker.Element.UpsellElement upsellElement2;
        Function1 function12;
        GapComposer gapComposer;
        String str;
        String str2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        Modifier.Companion companion;
        boolean z;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        GapComposer gapComposer2;
        GapComposer gapComposer3;
        ?? r0;
        float f;
        GapComposer gapComposer4;
        boolean z2;
        GapComposer gapComposer5;
        GapComposer gapComposer6 = (GapComposer) composer;
        gapComposer6.startRestartGroup(-2021538976);
        Applier applier = gapComposer6.applier;
        int i2 = i | (gapComposer6.changedInstance(upsellElement) ? 4 : 2) | (gapComposer6.changedInstance(function1) ? 32 : 16);
        if (gapComposer6.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str3 = upsellElement.title;
            if (str3 != null) {
                if (StringsKt.isBlank(str3)) {
                    str3 = null;
                }
                str = str3;
            } else {
                str = null;
            }
            String str4 = upsellElement.subtitle;
            if (str4 != null) {
                if (StringsKt.isBlank(str4)) {
                    str4 = null;
                }
                str2 = str4;
            } else {
                str2 = null;
            }
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer6, 0);
            int hashCode = Long.hashCode(gapComposer6.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer6.currentCompositionLocalScope();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer6, companion2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer6.startReusableNode();
            if (gapComposer6.inserting) {
                gapComposer6.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer6.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer6, columnMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer6, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer6, valueOf, composeUiNode$Companion$SetModifier$17);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer6, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer6, materializeModifier, composeUiNode$Companion$SetModifier$18);
            Strings.getSizes(gapComposer6).getClass();
            DefaultSizes.spacing.getClass();
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer6, 0);
            int hashCode2 = Long.hashCode(gapComposer6.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer6.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer6, companion2);
            gapComposer6.startReusableNode();
            if (gapComposer6.inserting) {
                gapComposer6.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer6.useNode();
            }
            Updater.m576setimpl(gapComposer6, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
            Updater.m576setimpl(gapComposer6, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$16);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer6, composeUiNode$Companion$SetModifier$17, gapComposer6, ownerSnapshotObserver$onCommitAffectingLayout$12);
            Updater.m576setimpl(gapComposer6, materializeModifier2, composeUiNode$Companion$SetModifier$18);
            Image image = upsellElement.image;
            if (image == null) {
                gapComposer6.startReplaceGroup(2143050892);
                gapComposer6.end(false);
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                r0 = 0;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$18;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                gapComposer3 = gapComposer6;
                companion = companion2;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$15;
            } else {
                gapComposer6.startReplaceGroup(2143050893);
                Integer num = upsellElement.image_width;
                int intValue = num != null ? num.intValue() : 0;
                Integer num2 = upsellElement.image_height;
                int intValue2 = num2 != null ? num2.intValue() : 0;
                if (intValue <= 0 || intValue2 <= 0) {
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$18;
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                    GapComposer gapComposer7 = gapComposer6;
                    companion = companion2;
                    z = false;
                    composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$15;
                    gapComposer7.startReplaceGroup(330973540);
                    gapComposer7.end(false);
                    gapComposer2 = gapComposer7;
                } else {
                    gapComposer6.startReplaceGroup(330576337);
                    float f2 = intValue;
                    Modifier aspectRatio = OffsetKt.aspectRatio(f2 / intValue2, SizeKt.m292widthInVpY3zN4$default(new HorizontalAlignElement(Alignment.Companion.CenterHorizontally), RecyclerView.DECELERATION_RATE, f2, 1), false);
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                    z = false;
                    companion = companion2;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$18;
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                    GapComposer gapComposer8 = gapComposer6;
                    composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$15;
                    ImageKt.Image(AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer6, ThemablesKt.urlForTheme(image, gapComposer6)), null, aspectRatio, Alignment.Companion.Center, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, null, gapComposer8, 27696, 96);
                    gapComposer8.end(false);
                    gapComposer2 = gapComposer8;
                }
                gapComposer2.end(z);
                r0 = z;
                gapComposer3 = gapComposer2;
            }
            if (str == null && str2 == null) {
                gapComposer3.startReplaceGroup(2144489262);
                gapComposer3.end(r0);
                f = 1.0f;
                gapComposer5 = gapComposer3;
                z2 = true;
            } else {
                gapComposer3.startReplaceGroup(2143677217);
                Strings.getSizes(gapComposer3).getClass();
                ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer3, r0);
                int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, companion);
                gapComposer3.startReusableNode();
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer3.useNode();
                }
                Updater.m576setimpl(gapComposer3, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$14);
                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$1);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$12, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$13);
                if (str == null) {
                    gapComposer3.startReplaceGroup(-695680526);
                    gapComposer3.end(r0);
                    f = 1.0f;
                    gapComposer4 = gapComposer3;
                } else {
                    gapComposer3.startReplaceGroup(-695680525);
                    f = 1.0f;
                    GapComposer gapComposer9 = gapComposer3;
                    LazyDslKt.m304MarkdownTextpCuZGqc(str, null, SizeKt.fillMaxWidth(companion, 1.0f), Strings.getTypography(gapComposer3).labelMedium, Strings.getColors(gapComposer3).semantic.text.standard, null, null, null, 0, 0, 3, gapComposer9, 432, 992);
                    gapComposer9.end(r0);
                    gapComposer4 = gapComposer9;
                }
                if (str2 == null) {
                    gapComposer4.startReplaceGroup(-695329482);
                    gapComposer4.end(r0);
                } else {
                    gapComposer4.startReplaceGroup(-695329481);
                    LazyDslKt.m304MarkdownTextpCuZGqc(str2, null, SizeKt.fillMaxWidth(companion, f), Strings.getTypography(gapComposer4).bodyMedium, Strings.getColors(gapComposer4).semantic.text.standard, null, null, null, 0, 10, 3, gapComposer4, 805306800, 480);
                    gapComposer4.end(r0);
                }
                z2 = true;
                gapComposer4.end(true);
                gapComposer4.end(r0);
                gapComposer5 = gapComposer4;
            }
            gapComposer5.end(z2);
            upsellElement2 = upsellElement;
            BlockerAction blockerAction = upsellElement2.button_action;
            if (blockerAction == null) {
                gapComposer5.startReplaceGroup(350415860);
                gapComposer5.end(r0);
                function12 = function1;
            } else {
                gapComposer5.startReplaceGroup(350415861);
                ButtonProminence buttonProminence = ButtonProminence.SUBTLE;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, f);
                Strings.getSizes(gapComposer5).getClass();
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                boolean changedInstance = gapComposer5.changedInstance(blockerAction) | ((i2 & 112) == 32 ? true : r0);
                Object rememberedValue = gapComposer5.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    function12 = function1;
                    rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda11(function12, blockerAction, 10);
                    gapComposer5.updateRememberedValue(rememberedValue);
                } else {
                    function12 = function1;
                }
                coil3.size.SizeKt.Button((Function0) rememberedValue, m302paddingqDBjuR0$default, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(930298386, new ArcadeFormUpsellKt$$ExternalSyntheticLambda7(r0, blockerAction), gapComposer5), gapComposer5, 1573248, 56);
                gapComposer5.end(r0);
            }
            gapComposer5.end(true);
            gapComposer = gapComposer5;
        } else {
            upsellElement2 = upsellElement;
            function12 = function1;
            gapComposer6.skipToGroupEnd();
            gapComposer = gapComposer6;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeFormUpsellKt$$ExternalSyntheticLambda2(upsellElement2, function12, i);
        }
    }
}
