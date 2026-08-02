package androidx.compose.material.pullrefresh;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonKt$$ExternalSyntheticLambda2;
import androidx.compose.material.DefaultElevationOverlay;
import androidx.compose.material.ElevationOverlayKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.MultiParagraph$$ExternalSyntheticLambda0;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.b$$ExternalSyntheticLambda0;
import coil3.Extras;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda8;
import com.squareup.cash.taptopay.views.TapToPayPaymentKt$$ExternalSyntheticLambda3;
import com.squareup.wire.GrpcMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class PullRefreshIndicatorKt {
    public static final RoundedCornerShape SpinnerShape = RoundedCornerShapeKt.CircleShape;
    public static final float ArcRadius = 7.5f;
    public static final float StrokeWidth = 2.5f;
    public static final float ArrowWidth = 10.0f;
    public static final float ArrowHeight = 5.0f;
    public static final float Elevation = 6.0f;
    public static final TweenSpec AlphaTween = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, EasingKt.LinearEasing, 2);

    /* renamed from: CircularArrowIndicator-iJQMabo, reason: not valid java name */
    public static final void m510CircularArrowIndicatoriJQMabo(PullRefreshState pullRefreshState, long j, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer;
        Modifier modifier3;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-486016981);
        int i2 = i | (gapComposer2.changedInstance(pullRefreshState) ? 4 : 2) | (gapComposer2.changed(j) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Object obj = rememberedValue;
            if (rememberedValue == neverEqualPolicy) {
                AndroidPath Path = AndroidPath_androidKt.Path();
                Path.m666setFillTypeoQ8Xj4U(1);
                gapComposer2.updateRememberedValue(Path);
                obj = Path;
            }
            AndroidPath androidPath = (AndroidPath) obj;
            boolean changed = gapComposer2.changed(pullRefreshState);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.derivedStateOf(new PullRefreshState$$ExternalSyntheticLambda0(pullRefreshState, 1));
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Number) ((State) rememberedValue2).getValue()).floatValue(), AlphaTween, null, null, gapComposer2, 48, 28);
            gapComposer = gapComposer2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new ButtonKt$$ExternalSyntheticLambda2(15);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            modifier2 = modifier;
            Modifier semantics = SemanticsModifierKt.semantics(modifier2, false, (Function1) rememberedValue3);
            boolean changedInstance = gapComposer.changedInstance(pullRefreshState) | gapComposer.changed(animateFloatAsState) | ((i2 & 112) == 32) | gapComposer.changedInstance(androidPath);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                modifier3 = semantics;
                MultiParagraph$$ExternalSyntheticLambda0 multiParagraph$$ExternalSyntheticLambda0 = new MultiParagraph$$ExternalSyntheticLambda0(pullRefreshState, animateFloatAsState, j, androidPath, 2);
                gapComposer.updateRememberedValue(multiParagraph$$ExternalSyntheticLambda0);
                rememberedValue4 = multiParagraph$$ExternalSyntheticLambda0;
            } else {
                modifier3 = semantics;
            }
            CanvasKt.Canvas(0, gapComposer, modifier3, (Function1) rememberedValue4);
        } else {
            modifier2 = modifier;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayPaymentKt$$ExternalSyntheticLambda3(i, 1, j, pullRefreshState, modifier2);
        }
    }

    /* renamed from: PullRefreshIndicator-jB83MbM, reason: not valid java name */
    public static final void m511PullRefreshIndicatorjB83MbM(final boolean z, final PullRefreshState pullRefreshState, final Modifier modifier, final long j, final long j2, Composer composer, final int i) {
        int i2;
        Color m;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(308716636);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(pullRefreshState) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(j2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i3 = i2 | 196608;
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            int i4 = i3 & 14;
            boolean changed = (i4 == 4) | gapComposer.changed(pullRefreshState);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Updater.derivedStateOf(new b$$ExternalSyntheticLambda0(z, pullRefreshState, 2));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            State state = (State) rememberedValue;
            DefaultElevationOverlay defaultElevationOverlay = (DefaultElevationOverlay) gapComposer.consume(ElevationOverlayKt.LocalElevationOverlay);
            float f = Elevation;
            if (defaultElevationOverlay == null) {
                gapComposer.startReplaceGroup(1453038224);
                gapComposer.end(false);
                m = null;
            } else {
                gapComposer.startReplaceGroup(323966865);
                m = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, DefaultElevationOverlay.m490apply7g2Lkgo(j, f, gapComposer, ((i3 >> 9) & 14) | 48));
            }
            long j3 = m != null ? m.value : j;
            Modifier graphicsLayer = ColorKt.graphicsLayer(ClipKt.drawWithContent(SizeKt.m285size3ABfNKs(modifier, 40.0f), new ButtonKt$$ExternalSyntheticLambda2(16)), new CachedPageEventFlow$$ExternalSyntheticLambda0(pullRefreshState, 4));
            if (!((Boolean) state.getValue()).booleanValue()) {
                f = RecyclerView.DECELERATION_RATE;
            }
            RoundedCornerShape roundedCornerShape = SpinnerShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ShadowKt.m591shadows4CzXII$default(graphicsLayer, f, roundedCornerShape, true, 24), j3, roundedCornerShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
            }
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            CrossfadeKt.Crossfade(Boolean.valueOf(z), (Modifier) null, AnimatableKt.tween$default(100, 0, null, 6), (String) null, Expect_jvmKt.rememberComposableLambda(1853731063, new PoolListSectionKt$$ExternalSyntheticLambda8(j2, pullRefreshState), gapComposer), gapComposer, i4 | 24960, 10);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    PullRefreshIndicatorKt.m511PullRefreshIndicatorjB83MbM(z, pullRefreshState, modifier, j, j2, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: drawArrow-Bx497Mc, reason: not valid java name */
    public static final void m512drawArrowBx497Mc(DrawScope drawScope, AndroidPath androidPath, Rect rect, long j, float f, ArrowValues arrowValues) {
        androidPath.reset();
        androidPath.moveTo(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        float f2 = ArrowWidth;
        float mo236toPx0680j_4 = drawScope.mo236toPx0680j_4(f2);
        float f3 = arrowValues.scale;
        androidPath.lineTo(mo236toPx0680j_4 * f3, RecyclerView.DECELERATION_RATE);
        androidPath.lineTo((drawScope.mo236toPx0680j_4(f2) * f3) / 2.0f, drawScope.mo236toPx0680j_4(ArrowHeight) * f3);
        float intBitsToFloat = (Float.intBitsToFloat((int) (rect.m633getCenterF1C5BW0() >> 32)) + (Math.min(rect.right - rect.left, rect.bottom - rect.top) / 2.0f)) - ((drawScope.mo236toPx0680j_4(f2) * f3) / 2.0f);
        float mo236toPx0680j_42 = (drawScope.mo236toPx0680j_4(StrokeWidth) / 2.0f) + Float.intBitsToFloat((int) (rect.m633getCenterF1C5BW0() & BodyPartID.bodyIdMax));
        androidPath.m667translatek4lQ0M((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(mo236toPx0680j_42) & BodyPartID.bodyIdMax));
        androidPath.close();
        float f4 = arrowValues.endAngle;
        long mo752getCenterF1C5BW0 = drawScope.mo752getCenterF1C5BW0();
        GrpcMethod drawContext = drawScope.getDrawContext();
        long m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            ((Extras.Key) drawContext.path).m1436rotateUv8p0NA(mo752getCenterF1C5BW0, f4);
            DrawScope.m745drawPathLG529CI$default(drawScope, androidPath, j, f, null, 56);
        } finally {
            Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
        }
    }
}
