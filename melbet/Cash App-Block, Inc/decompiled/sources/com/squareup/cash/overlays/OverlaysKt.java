package com.squareup.cash.overlays;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.viewmodels.LayoutUpdate;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class OverlaysKt {
    public static final void WithOverlayLayer(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1277294689);
        int i2 = 0;
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            boolean changed = gapComposer.changed(context);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = getOverlayLayerOrNull(context);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Object obj = (OverlayLayer) rememberedValue;
            if (obj != null) {
                gapComposer.startReplaceGroup(-1523937282);
                composableLambdaImpl.invoke(obj, (Object) gapComposer, (Object) 48);
                gapComposer.end(false);
            } else {
                String str = Build.FINGERPRINT;
                str.getClass();
                if (!StringsKt.contains((CharSequence) str, (CharSequence) "layoutlib", false) && !str.equals("robolectric")) {
                    throw NavAction$$ExternalSyntheticOutline0.m(gapComposer, -1523565623, false, "no overlayLayer found on this context");
                }
                gapComposer.startReplaceGroup(-1523807795);
                FakeOverlayLayerKt.WithFakeOverlayLayer(Expect_jvmKt.rememberComposableLambda(1571984205, new OverlayKt$$ExternalSyntheticLambda0(composableLambdaImpl, 24), gapComposer), gapComposer, 6);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlaysKt$$ExternalSyntheticLambda1(i, i2, composableLambdaImpl);
        }
    }

    public static final void addSetProgressAction(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (LayoutUpdate.access$enabled(semanticsNode)) {
            SemanticsConfiguration semanticsConfiguration = semanticsNode.unmergedConfig;
            Object obj = semanticsConfiguration.props.get(SemanticsActions.SetProgress);
            if (obj == null) {
                obj = null;
            }
            AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
            if (accessibilityAction != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionSetProgress, accessibilityAction.label));
            }
        }
    }

    public static final OverlayLayer getOverlayLayer(View view) {
        view.getClass();
        view.getClass();
        Context context = view.getContext();
        context.getClass();
        OverlayLayer overlayLayerOrNull = getOverlayLayerOrNull(context);
        if (overlayLayerOrNull != null) {
            return overlayLayerOrNull;
        }
        a$$ExternalSyntheticBUOutline0.m$1("no overlayLayer on this view's context");
        return null;
    }

    public static final OverlayLayer getOverlayLayerOrNull(Context context) {
        context.getClass();
        while (!(context instanceof OverlayContextWrapper)) {
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper == null || (context = contextWrapper.getBaseContext()) == null) {
                return null;
            }
        }
        return ((OverlayContextWrapper) context).overlayLayer;
    }
}
