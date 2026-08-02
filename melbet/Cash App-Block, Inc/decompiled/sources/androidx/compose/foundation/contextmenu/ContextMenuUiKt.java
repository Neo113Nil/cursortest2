package androidx.compose.foundation.contextmenu;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda8;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.pools.views.PoolDescriptionKt$$ExternalSyntheticLambda3;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class ContextMenuUiKt {
    public static final ContextMenuColors DefaultContextMenuColors;

    static {
        SecureFlagPolicy secureFlagPolicy = SecureFlagPolicy.Inherit;
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = AndroidPopup_androidKt.LocalPopupTestTag;
        SecureFlagPolicy secureFlagPolicy2 = SecureFlagPolicy.Inherit;
        SecureFlagPolicy secureFlagPolicy3 = SecureFlagPolicy.Inherit;
        long j = Color.White;
        long j2 = Color.Black;
        DefaultContextMenuColors = new ContextMenuColors(j, j2, j2, Color.m675copywmQWz5c$default(0.38f, j2, 14), Color.m675copywmQWz5c$default(0.38f, j2, 14));
    }

    public static final void ContextMenuColumn(ContextMenuColors contextMenuColors, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-527864079);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(contextMenuColors) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            BiasAlignment.Vertical vertical = ContextMenuSpec.LabelVerticalTextAlignment;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ShadowKt.m591shadows4CzXII$default(modifier, 3.0f, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f), false, 28), contextMenuColors.backgroundColor, ColorKt.RectangleShape);
            IntrinsicSize intrinsicSize = IntrinsicSize.Min;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SpacerKt.m300paddingVpY3zN4$default(OffsetKt.width(m177backgroundbw27NRU), RecyclerView.DECELERATION_RATE, ContextMenuSpec.VerticalPadding, 1), ImageKt.rememberScrollState(gapComposer), false, 14);
            int i3 = (i2 << 3) & 7168;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
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
            Recorder$$ExternalSyntheticOutline1.m(((i3 >> 6) & 112) | 6, composableLambdaImpl, ColumnScopeInstance.INSTANCE, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8((Object) contextMenuColors, modifier, (Function3) composableLambdaImpl, i, 2);
        }
    }

    public static final void ContextMenuColumnBuilder(Modifier modifier, ContextMenuColors contextMenuColors, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        int i4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (gapComposer.changed(contextMenuColors) ? 32 : 16);
        }
        int i7 = i4 | (gapComposer.changedInstance(function1) ? 256 : 128);
        int i8 = 1;
        if (gapComposer.shouldExecute(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            if (i6 != 0) {
                contextMenuColors = DefaultContextMenuColors;
            }
            ContextMenuColumn(contextMenuColors, modifier, Expect_jvmKt.rememberComposableLambda(-250345048, new PagerDefaults$$ExternalSyntheticLambda0(i8, function1, contextMenuColors), gapComposer), gapComposer, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | MLKEMEngine.KyberPolyBytes);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ContextMenuColors contextMenuColors2 = contextMenuColors;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8(modifier2, contextMenuColors2, function1, i, i2);
        }
    }

    public static final void ContextMenuItem(String str, boolean z, ContextMenuColors contextMenuColors, Modifier modifier, Function3 function3, Function0 function0, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Modifier then;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-2001167027);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(contextMenuColors) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(function3) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i3 = i2;
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            BiasAlignment.Vertical vertical = ContextMenuSpec.LabelVerticalTextAlignment;
            float f = ContextMenuSpec.HorizontalPadding;
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 458752) == 131072);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PoolDescriptionKt$$ExternalSyntheticLambda3(z, function0, 1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.m288sizeInqDBjuR0(SizeKt.fillMaxWidth(ImageKt.m183clickableoSLSa3U$default(modifier, z, str, null, (Function0) rememberedValue, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, RecyclerView.DECELERATION_RATE, 2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer2, 54);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
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
            if (function3 == null) {
                gapComposer2.startReplaceGroup(-1597947094);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-1597947093);
                float f2 = ContextMenuSpec.IconSize;
                then = Modifier.Companion.$$INSTANCE.then(new SizeElement((r13 & 1) != 0 ? Float.NaN : f2, (r13 & 2) != 0 ? Float.NaN : RecyclerView.DECELERATION_RATE, (r13 & 4) != 0 ? Float.NaN : f2, (r13 & 8) != 0 ? Float.NaN : f2, false));
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
                function3.invoke(new Color(z ? contextMenuColors.iconColor : contextMenuColors.disabledIconColor), gapComposer2, 0);
                gapComposer2.end(true);
                gapComposer2.end(false);
            }
            long j = z ? contextMenuColors.textColor : contextMenuColors.disabledTextColor;
            BasicTextKt.m347BasicTextRWo7tUw(str, new LayoutWeightElement(1.0f, true), new TextStyle(j, ContextMenuSpec.FontSize, ContextMenuSpec.FontWeight, null, ContextMenuSpec.LetterSpacing, 0L, ContextMenuSpec.LabelHorizontalTextAlignment, 0, ContextMenuSpec.LineHeight, null, 16613240), null, 0, false, 1, 0, null, gapComposer2, (i3 & 14) | 1572864, 952);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda4(str, z, contextMenuColors, modifier, function3, function0, i);
        }
    }
}
