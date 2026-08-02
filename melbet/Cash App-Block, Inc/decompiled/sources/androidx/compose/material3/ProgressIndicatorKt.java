package androidx.compose.material3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.ArcSplineKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.material3.tokens.ProgressIndicatorTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10;
import bo.app.c7$$ExternalSyntheticLambda6;
import bo.app.y0$$ExternalSyntheticLambda0;
import coil3.Extras;
import com.plaid.internal.EnumC0170g;
import com.squareup.wire.GrpcMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class ProgressIndicatorKt {
    public static final CubicBezierEasing LinearIndeterminateProgressEasing = MotionTokens.EasingEmphasizedAccelerateCubicBezier;
    public static final CubicBezierEasing CircularProgressEasing = MotionTokens.EasingStandardCubicBezier;

    /* renamed from: CircularProgressIndicator-4lLiAd8, reason: not valid java name */
    public static final void m542CircularProgressIndicator4lLiAd8(Modifier modifier, final long j, float f, long j2, int i, float f2, Composer composer, final int i2) {
        GapComposer gapComposer;
        final float f3;
        final long j3;
        final int i3;
        final float f4;
        long j4;
        int i4;
        float f5;
        float f6;
        Modifier modifier2;
        int i5;
        Object obj;
        final long j5;
        Modifier modifier3;
        final float f7;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(333154241);
        int i6 = i2 | 6 | (gapComposer2.changed(j) ? 32 : 16) | 222592;
        if (gapComposer2.shouldExecute(i6 & 1, (74899 & i6) != 74898)) {
            gapComposer2.startDefaults();
            if ((i2 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                j4 = Color.Transparent;
                i4 = i6 & (-7169);
                f5 = 4.0f;
                f6 = 4.0f;
                modifier2 = Modifier.Companion.$$INSTANCE;
                i5 = 1;
            } else {
                gapComposer2.skipToGroupEnd();
                i4 = i6 & (-7169);
                modifier2 = modifier;
                f5 = f;
                j4 = j2;
                i5 = i;
                f6 = f2;
            }
            int i7 = i4;
            gapComposer2.endDefaults();
            final Stroke stroke = new Stroke(((Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(f5), RecyclerView.DECELERATION_RATE, i5, 0, null, 26);
            InfiniteTransition rememberInfiniteTransition = ArcSplineKt.rememberInfiniteTransition(null, gapComposer2, 1);
            long j6 = j4;
            final InfiniteTransition.TransitionAnimationState animateFloat = ArcSplineKt.animateFloat(rememberInfiniteTransition, RecyclerView.DECELERATION_RATE, 1080.0f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.tween$default(6000, 0, EasingKt.LinearEasing, 2), null, 6), null, gapComposer2, 4536, 8);
            final InfiniteTransition.TransitionAnimationState animateFloat2 = ArcSplineKt.animateFloat(rememberInfiniteTransition, RecyclerView.DECELERATION_RATE, 360.0f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.keyframes(new androidx.compose.material.ButtonKt$$ExternalSyntheticLambda2(28)), null, 6), null, gapComposer2, 4536, 8);
            KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig(false);
            keyframesSpecConfig.durationMillis = 6000;
            keyframesSpecConfig.at(Float.valueOf(0.87f), 3000).easing = CircularProgressEasing;
            keyframesSpecConfig.at(Float.valueOf(0.1f), 6000);
            final InfiniteTransition.TransitionAnimationState animateFloat3 = ArcSplineKt.animateFloat(rememberInfiniteTransition, 0.1f, 0.87f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(new KeyframesSpec(keyframesSpecConfig), null, 6), null, gapComposer2, 4536, 8);
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(CanvasKt.progressSemantics(modifier2), 40.0f);
            modifier = modifier2;
            boolean changed = gapComposer2.changed(animateFloat3) | gapComposer2.changed(animateFloat) | gapComposer2.changed(animateFloat2) | gapComposer2.changed(j6) | gapComposer2.changedInstance(stroke) | ((((i7 & 112) ^ 48) > 32 && gapComposer2.changed(j)) || (i7 & 48) == 32);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                j5 = j6;
                f3 = f5;
                modifier3 = m285size3ABfNKs;
                gapComposer = gapComposer2;
                final int i8 = i5;
                f7 = f6;
                obj = new Function1() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        long j7 = j5;
                        Stroke stroke2 = stroke;
                        long j8 = j;
                        DrawScope drawScope = (DrawScope) obj2;
                        float floatValue = ((Number) animateFloat3.getValue()).floatValue() * 360.0f;
                        int i9 = i8;
                        float f8 = f7;
                        if (i9 != 0 && Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) <= Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32))) {
                            f8 += f3;
                        }
                        float mo232toDpu2uoSUM = (f8 / ((float) (drawScope.mo232toDpu2uoSUM(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32))) * 3.141592653589793d))) * 360.0f;
                        float floatValue2 = ((Number) animateFloat2.getValue()).floatValue() + ((Number) animateFloat.getValue()).floatValue();
                        long mo752getCenterF1C5BW0 = drawScope.mo752getCenterF1C5BW0();
                        GrpcMethod drawContext = drawScope.getDrawContext();
                        long m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        try {
                            ((Extras.Key) drawContext.path).m1436rotateUv8p0NA(mo752getCenterF1C5BW0, floatValue2);
                            ProgressIndicatorKt.m546drawCircularIndicator42QJj7c(drawScope, Math.min(floatValue, mo232toDpu2uoSUM) + floatValue, (360.0f - floatValue) - (Math.min(floatValue, mo232toDpu2uoSUM) * 2.0f), j7, stroke2);
                            ProgressIndicatorKt.m546drawCircularIndicator42QJj7c(drawScope, RecyclerView.DECELERATION_RATE, floatValue, j8, stroke2);
                            Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
                            throw th;
                        }
                    }
                };
                gapComposer.updateRememberedValue(obj);
            } else {
                gapComposer = gapComposer2;
                modifier3 = m285size3ABfNKs;
                obj = rememberedValue;
                j5 = j6;
                f3 = f5;
                f7 = f6;
            }
            CanvasKt.Canvas(0, gapComposer, modifier3, (Function1) obj);
            j3 = j5;
            i3 = i5;
            f4 = f7;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            f3 = f;
            j3 = j2;
            i3 = i;
            f4 = f2;
        }
        final Modifier modifier4 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(j, f3, j3, i3, f4, i2) { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda5
                public final /* synthetic */ long f$1;
                public final /* synthetic */ float f$2;
                public final /* synthetic */ long f$3;
                public final /* synthetic */ int f$4;
                public final /* synthetic */ float f$5;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    ProgressIndicatorKt.m542CircularProgressIndicator4lLiAd8(Modifier.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj2, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: CircularProgressIndicator-IyT6zlY, reason: not valid java name */
    public static final void m543CircularProgressIndicatorIyT6zlY(final Function0 function0, Modifier modifier, final long j, float f, long j2, int i, float f2, Composer composer, final int i2) {
        final Modifier modifier2;
        final float f3;
        final long j3;
        final int i3;
        final float f4;
        long value;
        int i4;
        float f5;
        Modifier modifier3;
        int i5;
        final float f6;
        final float f7;
        final long j4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1798883595);
        int i6 = i2 | (gapComposer.changedInstance(function0) ? 4 : 2) | 48 | (gapComposer.changed(j) ? 256 : 128) | 1780736;
        if (gapComposer.shouldExecute(i6 & 1, (599187 & i6) != 599186)) {
            gapComposer.startDefaults();
            if ((i2 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                value = ColorSchemeKt.getValue(ProgressIndicatorTokens.TrackColor, gapComposer);
                i4 = i6 & (-57345);
                f5 = 4.0f;
                modifier3 = Modifier.Companion.$$INSTANCE;
                i5 = 1;
                f6 = 4.0f;
            } else {
                gapComposer.skipToGroupEnd();
                i4 = i6 & (-57345);
                modifier3 = modifier;
                f6 = f;
                value = j2;
                i5 = i;
                f5 = f2;
            }
            gapComposer.endDefaults();
            boolean z = (i4 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (z || rememberedValue == obj) {
                rememberedValue = new y0$$ExternalSyntheticLambda0(3, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            final Function0 function02 = (Function0) rememberedValue;
            final Stroke stroke = new Stroke(((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(f6), RecyclerView.DECELERATION_RATE, i5, 0, null, 26);
            boolean changed = gapComposer.changed(function02);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == obj) {
                rememberedValue2 = new LocalMapKt$$ExternalSyntheticLambda10(5, function02);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SemanticsModifierKt.semantics(modifier3, true, (Function1) rememberedValue2), 40.0f);
            boolean changed2 = gapComposer.changed(function02) | gapComposer.changed(value) | gapComposer.changedInstance(stroke) | ((((i4 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer.changed(j)) || (i4 & MLKEMEngine.KyberPolyBytes) == 256);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == obj) {
                f7 = f5;
                j4 = value;
                final int i7 = i5;
                rememberedValue3 = new Function1() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        DrawScope drawScope = (DrawScope) obj2;
                        float floatValue = ((Number) Function0.this.invoke()).floatValue() * 360.0f;
                        int i8 = i7;
                        float f8 = f7;
                        if (i8 != 0 && Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) <= Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32))) {
                            f8 += f6;
                        }
                        float mo232toDpu2uoSUM = (f8 / ((float) (drawScope.mo232toDpu2uoSUM(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32))) * 3.141592653589793d))) * 360.0f;
                        float min = Math.min(floatValue, mo232toDpu2uoSUM) + 270.0f + floatValue;
                        float min2 = (360.0f - floatValue) - (Math.min(floatValue, mo232toDpu2uoSUM) * 2.0f);
                        long j5 = j4;
                        Stroke stroke2 = stroke;
                        ProgressIndicatorKt.m546drawCircularIndicator42QJj7c(drawScope, min, min2, j5, stroke2);
                        ProgressIndicatorKt.m546drawCircularIndicator42QJj7c(drawScope, 270.0f, floatValue, j, stroke2);
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue3);
            } else {
                f7 = f5;
                j4 = value;
            }
            CanvasKt.Canvas(0, gapComposer, m285size3ABfNKs, (Function1) rememberedValue3);
            f4 = f7;
            f3 = f6;
            j3 = j4;
            modifier2 = modifier3;
            i3 = i5;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            f3 = f;
            j3 = j2;
            i3 = i;
            f4 = f2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(modifier2, j, f3, j3, i3, f4, i2) { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda3
                public final /* synthetic */ Modifier f$1;
                public final /* synthetic */ long f$2;
                public final /* synthetic */ float f$3;
                public final /* synthetic */ long f$4;
                public final /* synthetic */ int f$5;
                public final /* synthetic */ float f$6;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    ProgressIndicatorKt.m543CircularProgressIndicatorIyT6zlY(Function0.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (Composer) obj2, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: LinearProgressIndicator-GJbTh5U, reason: not valid java name */
    public static final void m544LinearProgressIndicatorGJbTh5U(final Function0 function0, Modifier modifier, final long j, long j2, int i, float f, Function1 function1, Composer composer, final int i2) {
        final Modifier modifier2;
        final long j3;
        final int i3;
        final float f2;
        final Function1 function12;
        int i4;
        long j4;
        int i5;
        Modifier modifier3;
        final Function1 function13;
        final float f3;
        Modifier modifier4;
        final int i6;
        Object obj;
        final long j5;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-339970038);
        int i7 = i2 | (gapComposer.changedInstance(function0) ? 4 : 2) | 48 | (gapComposer.changed(j) ? 256 : 128) | 746496;
        if (gapComposer.shouldExecute(i7 & 1, (599187 & i7) != 599186)) {
            gapComposer.startDefaults();
            int i8 = i2 & 1;
            Object obj2 = Composer.Companion.Empty;
            if (i8 == 0 || gapComposer.getDefaultsInvalid()) {
                long value = ColorSchemeKt.getValue(ProgressIndicatorTokens.TrackColor, gapComposer);
                boolean z = (((i7 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer.changed(j)) || (i7 & MLKEMEngine.KyberPolyBytes) == 256;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == obj2) {
                    rememberedValue = new c7$$ExternalSyntheticLambda6(j, 3);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                i4 = i7 & (-3677185);
                j4 = value;
                i5 = 1;
                modifier3 = Modifier.Companion.$$INSTANCE;
                function13 = (Function1) rememberedValue;
                f3 = 4.0f;
            } else {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier;
                j4 = j2;
                f3 = f;
                function13 = function1;
                i4 = i7 & (-3677185);
                i5 = i;
            }
            gapComposer.endDefaults();
            boolean z2 = (i4 & 14) == 4;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == obj2) {
                rememberedValue2 = new y0$$ExternalSyntheticLambda0(4, function0);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            final Function0 function02 = (Function0) rememberedValue2;
            Modifier then = modifier3.then(AccessibilityUtilKt.IncreaseVerticalSemanticsBounds);
            boolean changed = gapComposer.changed(function02);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed || rememberedValue3 == obj2) {
                rememberedValue3 = new LocalMapKt$$ExternalSyntheticLambda10(6, function02);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(SemanticsModifierKt.semantics(then, true, (Function1) rememberedValue3), 240.0f, 4.0f);
            boolean changed2 = gapComposer.changed(function02) | gapComposer.changed(j4) | ((((i4 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer.changed(j)) || (i4 & MLKEMEngine.KyberPolyBytes) == 256) | gapComposer.changed(function13);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue4 == obj2) {
                modifier4 = m287sizeVpY3zN4;
                i6 = i5;
                j5 = j4;
                obj = new Function1() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        DrawScope drawScope = (DrawScope) obj3;
                        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                        int i9 = i6;
                        float f4 = f3;
                        if (i9 != 0 && Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) <= Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32))) {
                            f4 += drawScope.mo232toDpu2uoSUM(intBitsToFloat);
                        }
                        float mo232toDpu2uoSUM = f4 / drawScope.mo232toDpu2uoSUM(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)));
                        float floatValue = ((Number) function02.invoke()).floatValue();
                        float min = Math.min(floatValue, mo232toDpu2uoSUM) + floatValue;
                        if (min <= 1.0f) {
                            ProgressIndicatorKt.m547drawLinearIndicatorqYKTg0g(drawScope, min, 1.0f, j5, intBitsToFloat, i9);
                        }
                        ProgressIndicatorKt.m547drawLinearIndicatorqYKTg0g(drawScope, RecyclerView.DECELERATION_RATE, floatValue, j, intBitsToFloat, i9);
                        function13.invoke(drawScope);
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(obj);
            } else {
                modifier4 = m287sizeVpY3zN4;
                i6 = i5;
                obj = rememberedValue4;
                j5 = j4;
            }
            CanvasKt.Canvas(0, gapComposer, modifier4, (Function1) obj);
            f2 = f3;
            j3 = j5;
            function12 = function13;
            modifier2 = modifier3;
            i3 = i6;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            j3 = j2;
            i3 = i;
            f2 = f;
            function12 = function1;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(modifier2, j, j3, i3, f2, function12, i2) { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda10
                public final /* synthetic */ Modifier f$1;
                public final /* synthetic */ long f$2;
                public final /* synthetic */ long f$3;
                public final /* synthetic */ int f$4;
                public final /* synthetic */ float f$5;
                public final /* synthetic */ Function1 f$6;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    ProgressIndicatorKt.m544LinearProgressIndicatorGJbTh5U(Function0.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (Composer) obj3, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: LinearProgressIndicator-rIrjwxo, reason: not valid java name */
    public static final void m545LinearProgressIndicatorrIrjwxo(Modifier modifier, final long j, long j2, int i, float f, Composer composer, final int i2) {
        final Modifier modifier2;
        final long j3;
        final int i3;
        final float f2;
        long value;
        int i4;
        Modifier modifier3;
        int i5;
        float f3;
        Object obj;
        final int i6;
        Modifier modifier4;
        final float f4;
        int i7;
        long j4;
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(RecyclerView.DECELERATION_RATE);
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(567589233);
        int i8 = i2 | 6 | (gapComposer.changed(j) ? 32 : 16) | 27776;
        if (gapComposer.shouldExecute(i8 & 1, (i8 & 9363) != 9362)) {
            gapComposer.startDefaults();
            if ((i2 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                value = ColorSchemeKt.getValue(ProgressIndicatorTokens.TrackColor, gapComposer);
                i4 = i8 & (-897);
                modifier3 = Modifier.Companion.$$INSTANCE;
                i5 = 1;
                f3 = 4.0f;
            } else {
                gapComposer.skipToGroupEnd();
                value = j2;
                i5 = i;
                f3 = f;
                i4 = i8 & (-897);
                modifier3 = modifier;
            }
            gapComposer.endDefaults();
            InfiniteTransition rememberInfiniteTransition = ArcSplineKt.rememberInfiniteTransition(null, gapComposer, 1);
            KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig(false);
            keyframesSpecConfig.durationMillis = 1750;
            KeyframesSpec.KeyframeEntity at = keyframesSpecConfig.at(valueOf2, 0);
            CubicBezierEasing cubicBezierEasing = LinearIndeterminateProgressEasing;
            at.easing = cubicBezierEasing;
            keyframesSpecConfig.at(valueOf, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
            final long j5 = value;
            boolean z = true;
            final InfiniteTransition.TransitionAnimationState animateFloat = ArcSplineKt.animateFloat(rememberInfiniteTransition, RecyclerView.DECELERATION_RATE, 1.0f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(new KeyframesSpec(keyframesSpecConfig), null, 6), null, gapComposer, 4536, 8);
            KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig2 = new KeyframesSpec.KeyframesSpecConfig(false);
            keyframesSpecConfig2.durationMillis = 1750;
            keyframesSpecConfig2.at(valueOf2, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE).easing = cubicBezierEasing;
            keyframesSpecConfig2.at(valueOf, 1250);
            final InfiniteTransition.TransitionAnimationState animateFloat2 = ArcSplineKt.animateFloat(rememberInfiniteTransition, RecyclerView.DECELERATION_RATE, 1.0f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(new KeyframesSpec(keyframesSpecConfig2), null, 6), null, gapComposer, 4536, 8);
            KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig3 = new KeyframesSpec.KeyframesSpecConfig(false);
            keyframesSpecConfig3.durationMillis = 1750;
            keyframesSpecConfig3.at(valueOf2, 650).easing = cubicBezierEasing;
            keyframesSpecConfig3.at(valueOf, 1500);
            final InfiniteTransition.TransitionAnimationState animateFloat3 = ArcSplineKt.animateFloat(rememberInfiniteTransition, RecyclerView.DECELERATION_RATE, 1.0f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(new KeyframesSpec(keyframesSpecConfig3), null, 6), null, gapComposer, 4536, 8);
            KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig4 = new KeyframesSpec.KeyframesSpecConfig(false);
            keyframesSpecConfig4.durationMillis = 1750;
            keyframesSpecConfig4.at(valueOf2, 900).easing = cubicBezierEasing;
            keyframesSpecConfig4.at(valueOf, 1750);
            final InfiniteTransition.TransitionAnimationState animateFloat4 = ArcSplineKt.animateFloat(rememberInfiniteTransition, RecyclerView.DECELERATION_RATE, 1.0f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(new KeyframesSpec(keyframesSpecConfig4), null, 6), null, gapComposer, 4536, 8);
            Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(CanvasKt.progressSemantics(modifier3.then(AccessibilityUtilKt.IncreaseVerticalSemanticsBounds)), 240.0f, 4.0f);
            boolean changed = gapComposer.changed(animateFloat) | gapComposer.changed(j5) | gapComposer.changed(animateFloat2);
            if ((((i4 & 112) ^ 48) <= 32 || !gapComposer.changed(j)) && (i4 & 48) != 32) {
                z = false;
            }
            boolean changed2 = changed | z | gapComposer.changed(animateFloat3) | gapComposer.changed(animateFloat4);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed2 || rememberedValue == Composer.Companion.Empty) {
                i6 = i5;
                modifier4 = modifier3;
                f4 = f3;
                i7 = 0;
                obj = new Function1() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        long j6;
                        DrawScope drawScope = (DrawScope) obj2;
                        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                        int i9 = i6;
                        float f5 = f4;
                        if (i9 != 0 && Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & drawScope.mo753getSizeNHjbRc())) <= Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32))) {
                            f5 += drawScope.mo232toDpu2uoSUM(intBitsToFloat);
                        }
                        float mo232toDpu2uoSUM = f5 / drawScope.mo232toDpu2uoSUM(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)));
                        State state = animateFloat;
                        float floatValue = ((Number) state.getValue()).floatValue();
                        float f6 = 1.0f - mo232toDpu2uoSUM;
                        long j7 = j5;
                        if (floatValue < f6) {
                            ProgressIndicatorKt.m547drawLinearIndicatorqYKTg0g(drawScope, ((Number) state.getValue()).floatValue() > RecyclerView.DECELERATION_RATE ? ((Number) state.getValue()).floatValue() + mo232toDpu2uoSUM : 0.0f, 1.0f, j7, intBitsToFloat, i9);
                        }
                        long j8 = j7;
                        float floatValue2 = ((Number) state.getValue()).floatValue();
                        State state2 = animateFloat2;
                        float floatValue3 = floatValue2 - ((Number) state2.getValue()).floatValue();
                        long j9 = j;
                        if (floatValue3 > RecyclerView.DECELERATION_RATE) {
                            ProgressIndicatorKt.m547drawLinearIndicatorqYKTg0g(drawScope, ((Number) state.getValue()).floatValue(), ((Number) state2.getValue()).floatValue(), j9, intBitsToFloat, i9);
                            j6 = j9;
                        } else {
                            j6 = j9;
                        }
                        float floatValue4 = ((Number) state2.getValue()).floatValue();
                        State state3 = animateFloat3;
                        if (floatValue4 > mo232toDpu2uoSUM) {
                            ProgressIndicatorKt.m547drawLinearIndicatorqYKTg0g(drawScope, ((Number) state3.getValue()).floatValue() > RecyclerView.DECELERATION_RATE ? ((Number) state3.getValue()).floatValue() + mo232toDpu2uoSUM : 0.0f, ((Number) state2.getValue()).floatValue() < 1.0f ? ((Number) state2.getValue()).floatValue() - mo232toDpu2uoSUM : 1.0f, j8, intBitsToFloat, i9);
                            j8 = j8;
                        }
                        float floatValue5 = ((Number) state3.getValue()).floatValue();
                        State state4 = animateFloat4;
                        if (floatValue5 - ((Number) state4.getValue()).floatValue() > RecyclerView.DECELERATION_RATE) {
                            ProgressIndicatorKt.m547drawLinearIndicatorqYKTg0g(drawScope, ((Number) state3.getValue()).floatValue(), ((Number) state4.getValue()).floatValue(), j6, intBitsToFloat, i9);
                            drawScope = drawScope;
                            intBitsToFloat = intBitsToFloat;
                        }
                        if (((Number) state4.getValue()).floatValue() > mo232toDpu2uoSUM) {
                            ProgressIndicatorKt.m547drawLinearIndicatorqYKTg0g(drawScope, RecyclerView.DECELERATION_RATE, ((Number) state4.getValue()).floatValue() < 1.0f ? ((Number) state4.getValue()).floatValue() - mo232toDpu2uoSUM : 1.0f, j8, intBitsToFloat, i9);
                        }
                        return Unit.INSTANCE;
                    }
                };
                j4 = j5;
                gapComposer.updateRememberedValue(obj);
            } else {
                i6 = i5;
                j4 = j5;
                obj = rememberedValue;
                i7 = 0;
                modifier4 = modifier3;
                f4 = f3;
            }
            CanvasKt.Canvas(i7, gapComposer, m287sizeVpY3zN4, (Function1) obj);
            i3 = i6;
            f2 = f4;
            modifier2 = modifier4;
            j3 = j4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            j3 = j2;
            i3 = i;
            f2 = f;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(j, j3, i3, f2, i2) { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda12
                public final /* synthetic */ long f$1;
                public final /* synthetic */ long f$2;
                public final /* synthetic */ int f$3;
                public final /* synthetic */ float f$4;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    ProgressIndicatorKt.m545LinearProgressIndicatorrIrjwxo(Modifier.this, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj2, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    public static final void m546drawCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - (2.0f * (stroke.width / 2.0f));
        DrawScope.m737drawArcyD3GUKo$default(drawScope, j, f, f2, (Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(r0) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & BodyPartID.bodyIdMax), RecyclerView.DECELERATION_RATE, stroke, 832);
    }

    /* renamed from: drawLinearIndicator-qYKTg0g, reason: not valid java name */
    public static final void m547drawLinearIndicatorqYKTg0g(DrawScope drawScope, float f, float f2, long j, float f3, int i) {
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
        float f4 = intBitsToFloat2 / 2.0f;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f5 = (z ? f : 1.0f - f2) * intBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * intBitsToFloat;
        if (i == 0 || intBitsToFloat2 > intBitsToFloat) {
            drawScope.mo729drawLineNGM6Ib0(j, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f4) & BodyPartID.bodyIdMax), (r23 & 8) != 0 ? 0.0f : f3, (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = intBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f5 > f8) {
            f5 = f8;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (f6 <= f8) {
            f8 = f6;
        }
        if (Math.abs(f2 - f) > RecyclerView.DECELERATION_RATE) {
            drawScope.mo729drawLineNGM6Ib0(j, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f4) & BodyPartID.bodyIdMax), (r23 & 8) != 0 ? 0.0f : f3, (r23 & 16) != 0 ? 0 : i, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
        }
    }
}
