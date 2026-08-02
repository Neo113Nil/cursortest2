package com.squareup.cash.maps.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.util.cash.Countries;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class ClusterItemKt {
    public static final Lazy supportsHardware$delegate = LazyKt.lazy(new ClusterItemKt$$ExternalSyntheticLambda0(0));

    public static final void ClusterItem(int i, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i2) {
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1219616862);
        if ((i2 & 6) == 0) {
            i3 = (gapComposer.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            String stringResource = Room.stringResource(gapComposer, i);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(companion, 57.0f, 68.0f);
            boolean changed = gapComposer.changed(stringResource);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ClusterItemKt$$ExternalSyntheticLambda3(stringResource, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m287sizeVpY3zN4, true, (Function1) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier align = boxScopeInstance.align(fillMaxSize, biasAlignment);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ImageKt.Image(Countries.painterResource(colors.isLight ? R.drawable.map_marker_background : R.drawable.map_marker_background_dark, 0, gapComposer), null, align, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 48, 120);
            composableLambdaImpl.invoke(boxScopeInstance, gapComposer, Integer.valueOf((i3 & 112) | 6));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ClusterItemKt$$ExternalSyntheticLambda2(i, i2, composableLambdaImpl);
        }
    }

    public static final void ClusterItem(String str, int i, int i2, Composer composer, int i3) {
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1737192312);
        int i4 = (gapComposer.changed(str) ? 4 : 2) | i3 | (gapComposer.changed(i) ? 32 : 16) | (gapComposer.changed(i2) ? 256 : 128);
        int i5 = 0;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            ClusterItem(i2, Expect_jvmKt.rememberComposableLambda(1794590222, new ClusterItemKt$$ExternalSyntheticLambda1(str, i, i5), gapComposer), gapComposer, ((i4 >> 6) & 14) | 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ClusterItemKt$$ExternalSyntheticLambda2(str, i, i2, i3);
        }
    }
}
