package com.squareup.cash.overlays;

import android.animation.Animator;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.overlays.OverlayLayer;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class FakeOverlayLayer implements OverlayLayer {
    public final CoroutineScope coroutineScope;
    public final SnapshotStateList sessions;

    public FakeOverlayLayer(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        this.coroutineScope = coroutineScope;
        this.sessions = new SnapshotStateList();
    }

    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1506536700);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            gapComposer.startReplaceGroup(1993485650);
            SnapshotStateList snapshotStateList = this.sessions;
            int size = snapshotStateList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((OverlayLayer.Session) snapshotStateList.get(i2)).getOverlay().Content(gapComposer, 0);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FakeOverlayLayer$$ExternalSyntheticLambda0(this, i);
        }
    }

    @Override // com.squareup.cash.overlays.OverlayLayer
    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // com.squareup.cash.overlays.OverlayLayer
    public final boolean onBack() {
        return false;
    }

    @Override // com.squareup.cash.overlays.OverlayLayer
    public final OverlayLayer.Session show(final Overlay overlay) {
        overlay.getClass();
        OverlayLayer.Session session = new OverlayLayer.Session() { // from class: com.squareup.cash.overlays.FakeOverlayLayer$show$session$1
            @Override // com.squareup.cash.overlays.OverlayLayer.Session
            public final void dismiss() {
                Animator exitAnimator = Overlay.this.exitAnimator();
                exitAnimator.addListener(new CircularProgressDrawable.AnonymousClass2(1, this, this));
                exitAnimator.start();
            }

            @Override // com.squareup.cash.overlays.OverlayLayer.Session
            public final Overlay getOverlay() {
                return Overlay.this;
            }
        };
        this.sessions.add(session);
        overlay.enterAnimator().start();
        return session;
    }
}
