package androidx.compose.material;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.ArcSplineKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.compose.FullScreenKt$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.ClosedFloatRange;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class ProgressIndicatorKt {
    public static final CubicBezierEasing CircularEasing;

    static {
        new CubicBezierEasing(0.2f, RecyclerView.DECELERATION_RATE, 0.8f, 1.0f);
        new CubicBezierEasing(0.4f, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f);
        new CubicBezierEasing(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.65f, 1.0f);
        new CubicBezierEasing(0.1f, RecyclerView.DECELERATION_RATE, 0.45f, 1.0f);
        CircularEasing = new CubicBezierEasing(0.4f, RecyclerView.DECELERATION_RATE, 0.2f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0065  */
    /* renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m496CircularProgressIndicatorLxG7B9w(Modifier modifier, long j, float f, long j2, int i, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        float f2;
        int i5;
        final Modifier modifier3;
        final long j3;
        final float f3;
        final long j4;
        final int i6;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier4;
        int i7;
        float f4;
        long j5;
        int i8;
        final float f5;
        final long j6;
        final long j7;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1119119072);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (gapComposer.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        long j8 = j;
        int i10 = i4 | (((i3 & 2) == 0 && gapComposer.changed(j8)) ? 32 : 16);
        int i11 = i3 & 4;
        if (i11 != 0) {
            i10 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            f2 = f;
            i10 |= gapComposer.changed(f2) ? 256 : 128;
            i5 = i10 | 11264;
            if (gapComposer.shouldExecute(i5 & 1, (i5 & 9363) == 9362)) {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
                j3 = j8;
                f3 = f2;
                j4 = j2;
                i6 = i;
            } else {
                gapComposer.startDefaults();
                if ((i2 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    modifier4 = i9 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if ((i3 & 2) != 0) {
                        j8 = ((Colors) gapComposer.consume(ColorsKt.LocalColors)).m485getPrimary0d7_KjU();
                        i5 &= -113;
                    }
                    if (i11 != 0) {
                        f2 = 4.0f;
                    }
                    i7 = i5 & (-57345);
                    f4 = f2;
                    j5 = Color.Transparent;
                    i8 = 2;
                } else {
                    gapComposer.skipToGroupEnd();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    int i12 = i5 & (-57345);
                    j5 = j2;
                    i7 = i12;
                    modifier4 = modifier2;
                    f4 = f2;
                    i8 = i;
                }
                gapComposer.endDefaults();
                int i13 = i8;
                final Stroke stroke = new Stroke(((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(f4), RecyclerView.DECELERATION_RATE, i13, 0, null, 26);
                InfiniteTransition rememberInfiniteTransition = ArcSplineKt.rememberInfiniteTransition(null, gapComposer, 1);
                TwoWayConverterImpl twoWayConverterImpl = AnimatableKt.IntToVector;
                Drop$$ExternalSyntheticBUOutline0 drop$$ExternalSyntheticBUOutline0 = EasingKt.LinearEasing;
                int i14 = i7;
                final InfiniteTransition.TransitionAnimationState animateValue = ArcSplineKt.animateValue(rememberInfiniteTransition, 0, 5, twoWayConverterImpl, AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.tween$default(6660, 0, drop$$ExternalSyntheticBUOutline0, 2), null, 6), null, gapComposer, 33208, 16);
                final InfiniteTransition.TransitionAnimationState animateFloat = ArcSplineKt.animateFloat(rememberInfiniteTransition, RecyclerView.DECELERATION_RATE, 286.0f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.tween$default(1332, 0, drop$$ExternalSyntheticBUOutline0, 2), null, 6), null, gapComposer, 4536, 8);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = new ButtonKt$$ExternalSyntheticLambda2(10);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                final InfiniteTransition.TransitionAnimationState animateFloat2 = ArcSplineKt.animateFloat(rememberInfiniteTransition, RecyclerView.DECELERATION_RATE, 290.0f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.keyframes((Function1) rememberedValue), null, 6), null, gapComposer, 4536, 8);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ButtonKt$$ExternalSyntheticLambda2(11);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                final InfiniteTransition.TransitionAnimationState animateFloat3 = ArcSplineKt.animateFloat(rememberInfiniteTransition, RecyclerView.DECELERATION_RATE, 290.0f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.keyframes((Function1) rememberedValue2), null, 6), null, gapComposer, 4536, 8);
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(CanvasKt.progressSemantics(modifier4), 40.0f);
                Modifier modifier5 = modifier4;
                boolean changedInstance = ((i14 & 896) == 256) | gapComposer.changedInstance(stroke) | gapComposer.changed(animateValue) | gapComposer.changed(animateFloat2) | gapComposer.changed(animateFloat3) | gapComposer.changed(animateFloat) | ((((i14 & 112) ^ 48) > 32 && gapComposer.changed(j8)) || (i14 & 48) == 32);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                    f5 = f4;
                    j6 = j5;
                    j7 = j8;
                    rememberedValue3 = new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            DrawScope drawScope = (DrawScope) obj;
                            long j9 = j6;
                            Stroke stroke2 = stroke;
                            ProgressIndicatorKt.m498drawCircularIndicator42QJj7c(drawScope, RecyclerView.DECELERATION_RATE, 360.0f, j9, stroke2);
                            float intValue = (((Number) animateValue.getValue()).intValue() * 216.0f) % 360.0f;
                            float floatValue = ((Number) animateFloat2.getValue()).floatValue();
                            State state = animateFloat3;
                            ProgressIndicatorKt.m498drawCircularIndicator42QJj7c(drawScope, ((Number) state.getValue()).floatValue() + ((Number) animateFloat.getValue()).floatValue() + (intValue - 90.0f) + (stroke2.cap == 0 ? RecyclerView.DECELERATION_RATE : ((f5 / 20.0f) * 57.29578f) / 2.0f), Math.max(Math.abs(floatValue - ((Number) state.getValue()).floatValue()), 0.1f), j7, stroke2);
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue3);
                } else {
                    f5 = f4;
                    j6 = j5;
                    j7 = j8;
                }
                CanvasKt.Canvas(0, gapComposer, m285size3ABfNKs, (Function1) rememberedValue3);
                modifier3 = modifier5;
                j4 = j6;
                f3 = f5;
                j3 = j7;
                i6 = i13;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new Function2() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ProgressIndicatorKt.m496CircularProgressIndicatorLxG7B9w(Modifier.this, j3, f3, j4, i6, (Composer) obj, Updater.updateChangedFlags(i2 | 1), i3);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        f2 = f;
        i5 = i10 | 11264;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    public static final void m497LinearProgressIndicator_5eSRE(final float f, Modifier modifier, final long j, final long j2, Composer composer, final int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-531984864);
        int i2 = i | (gapComposer.changed(f) ? 4 : 2) | (gapComposer.changed(j) ? 256 : 128) | (gapComposer.changed(j2) ? 2048 : 1024) | PKIFailureInfo.certRevoked;
        boolean z = true;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            int i3 = i2 & (-57345);
            gapComposer.endDefaults();
            float f2 = f < RecyclerView.DECELERATION_RATE ? 0.0f : f;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            modifier2 = modifier;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SemanticsModifierKt.semantics(ValueInsets.layout(modifier2, new FullScreenKt$$ExternalSyntheticLambda0(7)), true, new ButtonKt$$ExternalSyntheticLambda2(9)), RecyclerView.DECELERATION_RATE, 10.0f, 1);
            Float valueOf = Float.valueOf(f2);
            if (Float.isNaN(f2)) {
                valueOf = null;
            }
            Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(SemanticsModifierKt.semantics(m300paddingVpY3zN4$default, true, new ProgressSemanticsKt$$ExternalSyntheticLambda0(valueOf != null ? valueOf.floatValue() : 0.0f, new ClosedFloatRange(RecyclerView.DECELERATION_RATE, 1.0f), 0)), 240.0f, 4.0f);
            boolean changed = ((((i3 & 7168) ^ 3072) > 2048 && gapComposer.changed(j2)) || (i3 & 3072) == 2048) | gapComposer.changed(0) | gapComposer.changed(f2);
            if ((((i3 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 || !gapComposer.changed(j)) && (i3 & MLKEMEngine.KyberPolyBytes) != 256) {
                z = false;
            }
            boolean z2 = changed | z;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                final float f3 = f2;
                Function1 function1 = new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DrawScope drawScope = (DrawScope) obj;
                        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                        ProgressIndicatorKt.m499drawLinearIndicatorqYKTg0g(1.0f, intBitsToFloat, j2, drawScope);
                        ProgressIndicatorKt.m499drawLinearIndicatorqYKTg0g(f3, intBitsToFloat, j, drawScope);
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(function1);
                rememberedValue = function1;
            }
            CanvasKt.Canvas(0, gapComposer, m287sizeVpY3zN4, (Function1) rememberedValue);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            endRestartGroup.block = new Function2(f, modifier3, j, j2, i) { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda1
                public final /* synthetic */ float f$0;
                public final /* synthetic */ Modifier f$1;
                public final /* synthetic */ long f$2;
                public final /* synthetic */ long f$3;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(49);
                    ProgressIndicatorKt.m497LinearProgressIndicator_5eSRE(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    public static final void m498drawCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - (2.0f * (stroke.width / 2.0f));
        DrawScope.m737drawArcyD3GUKo$default(drawScope, j, f, f2, (Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(r0) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & BodyPartID.bodyIdMax), RecyclerView.DECELERATION_RATE, stroke, 832);
    }

    /* renamed from: drawLinearIndicator-qYKTg0g, reason: not valid java name */
    public static final void m499drawLinearIndicatorqYKTg0g(float f, float f2, long j, DrawScope drawScope) {
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) / 2.0f;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f3 = (z ? RecyclerView.DECELERATION_RATE : 1.0f - f) * intBitsToFloat;
        drawScope.mo729drawLineNGM6Ib0(j, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits((z ? f : 1.0f) * intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax), (r23 & 8) != 0 ? 0.0f : f2, (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
    }
}
