package com.squareup.cash.activity.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class SectionHeaderScope {
    public final ActivityFeedEntry.Header entry;
    public final boolean hasDivider;

    public SectionHeaderScope(ActivityFeedEntry.Header header, boolean z) {
        header.getClass();
        this.entry = header;
        this.hasDivider = z;
    }

    public final void DefaultHeader(int i, int i2, Composer composer, Modifier modifier) {
        int i3;
        SectionHeaderScope sectionHeaderScope;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1633793218);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        }
        int i5 = i3 | (gapComposer.changed(this) ? 32 : 16);
        int i6 = 0;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 19) != 18)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Modifier modifier2 = modifier;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1491218566, new SectionHeaderScope$$ExternalSyntheticLambda0(this, i6), gapComposer);
            int i7 = (i5 & 14) | 48 | ((i5 << 3) & 896);
            sectionHeaderScope = this;
            sectionHeaderScope.DefaultHeaderContainer(modifier2, rememberComposableLambda, gapComposer, i7, 0);
            modifier = modifier2;
        } else {
            sectionHeaderScope = this;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(sectionHeaderScope, modifier, i, i2);
        }
    }

    public final void DefaultHeaderContainer(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1068616317);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(this) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (i4 != 0) {
                modifier2 = companion;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            gapComposer.startReplaceGroup(443111491);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier2, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ActivityTabViewKt$$ExternalSyntheticLambda17(7);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m177backgroundbw27NRU, true, (Function1) rememberedValue2);
            boolean z = this.hasDivider;
            if (z) {
                boolean changed = ((i3 & 896) == 256) | gapComposer.changed(density);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new UtilsKt$$ExternalSyntheticLambda0(16, density, this, mutableFloatState);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                semantics = semantics.then(ValueInsets.onGloballyPositioned(companion, (Function1) rememberedValue3));
            }
            gapComposer.end(false);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
            composableLambdaImpl.invoke(new PaddingValuesImpl(16.0f, 8.0f, 16.0f, z ? 7.0f : 8.0f), gapComposer, Integer.valueOf(i3 & 112));
            if (z) {
                gapComposer.startReplaceGroup(322147969);
                ModalKt.HorizontalDivider(0, 0, gapComposer, AlphaKt.alpha(companion, ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue()));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(322222927);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier3 = modifier2;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(this, modifier3, composableLambdaImpl, i, i2, 10);
        }
    }
}
