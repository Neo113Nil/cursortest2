package androidx.compose.ui.text.intl;

import androidx.camera.core.processing.TargetUtils;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import app.cash.molecule.PlatformKt;
import com.google.mlkit.vision.text.zzb;
import com.squareup.cash.arcade.Motion;
import com.squareup.cash.arcade.MotionKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowBasicShieetScope;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowSheetPeekPosition$FixedHeight;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter$models$1$1;
import com.squareup.cash.sheet.BasicShieetKt$$ExternalSyntheticLambda0;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public abstract class Locale_jvmAndAndroidKt {
    public static final void CoreFlowBasicShieet(CoreFlowRealSheetState coreFlowRealSheetState, Function0 function0, CoreFlowSheetPeekPosition$FixedHeight coreFlowSheetPeekPosition$FixedHeight, Modifier modifier, AnimatedVisibilityScope animatedVisibilityScope, SharedTransitionScope sharedTransitionScope, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        ComposableLambdaImpl composableLambdaImpl2;
        coreFlowRealSheetState.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1743195304);
        int i2 = i | (gapComposer.changed(coreFlowRealSheetState) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changed(coreFlowSheetPeekPosition$FixedHeight) ? 256 : 128) | (gapComposer.changed(modifier) ? 2048 : 1024) | (gapComposer.changedInstance(animatedVisibilityScope) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(sharedTransitionScope) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            gapComposer.startReplaceGroup(-173427318);
            coreFlowRealSheetState.peekPosition$delegate.setValue(coreFlowSheetPeekPosition$FixedHeight);
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            density.getClass();
            coreFlowRealSheetState.density = density;
            SpringSpec steady$default = TargetUtils.steady$default((zzb) ((Motion) gapComposer.consume(MotionKt.LocalMotion)).springs.text);
            coreFlowRealSheetState.enterAnimationSpec = steady$default;
            coreFlowRealSheetState.exitAnimationSpec = steady$default;
            coreFlowRealSheetState.CreateDragAnchorsEffect(gapComposer, 0);
            coreFlowRealSheetState.ProcessQueuedNestedFlingsEffect(gapComposer, 0);
            coreFlowRealSheetState.HandleContentAndImeTransitionsEffect(gapComposer, 0);
            gapComposer.end(false);
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.BottomCenter, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            composableLambdaImpl2 = composableLambdaImpl;
            composableLambdaImpl2.invoke((Object) new CoreFlowBasicShieetScope(coreFlowRealSheetState, animatedVisibilityScope, sharedTransitionScope), (Object) gapComposer, (Object) 48);
            gapComposer.end(true);
            boolean changedInstance = ((i2 & 14) == 4) | gapComposer.changedInstance(animatedVisibilityScope) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PdfPreviewPresenter$models$1$1(coreFlowRealSheetState, animatedVisibilityScope, function0, (Continuation) null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, coreFlowRealSheetState, (Function2) rememberedValue);
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetKt$$ExternalSyntheticLambda0(coreFlowRealSheetState, function0, coreFlowSheetPeekPosition$FixedHeight, modifier, animatedVisibilityScope, sharedTransitionScope, composableLambdaImpl2, i, 14);
        }
    }

    public static final java.util.Locale access$parseLanguageTag(String str) {
        java.util.Locale forLanguageTag = java.util.Locale.forLanguageTag(str);
        if (Intrinsics.areEqual(forLanguageTag.toLanguageTag(), "und")) {
            System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return forLanguageTag;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.CashInReview.deepLinkSpecs;
    }
}
