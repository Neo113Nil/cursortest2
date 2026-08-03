package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;

/* compiled from: CircularWavyProgressModifiers.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u001eH\u0014J\b\u0010!\u001a\u00020\u001eH\u0014J\b\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020\u001eH\u0002R\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Landroidx/compose/material3/internal/IndeterminateCircularWavyProgressNode;", "Landroidx/compose/material3/internal/BaseCircularWavyProgressNode;", "colorParameter", "Landroidx/compose/ui/graphics/Color;", "trackColorParameter", "strokeParameter", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "trackStrokeParameter", "gapSizeParameter", "Landroidx/compose/ui/unit/Dp;", "amplitudeParameter", "", "wavelengthParameter", "waveSpeedParameter", "<init>", "(JJLandroidx/compose/ui/graphics/drawscope/Stroke;Landroidx/compose/ui/graphics/drawscope/Stroke;FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "globalRotationAnimatable", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "additionalRotationAnimatable", "progressSweepAnimatable", "indeterminateAnimationsJob", "Lkotlinx/coroutines/Job;", "value", "amplitude", "getAmplitude", "()F", "setAmplitude", "(F)V", "onAttach", "", "onDetach", "invalidateDraw", "invalidateDrawCache", "isDrawingWave", "", "startIndeterminateAnimations", "cacheDrawNode", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class IndeterminateCircularWavyProgressNode extends BaseCircularWavyProgressNode {
    private Animatable<Float, AnimationVector1D> additionalRotationAnimatable;
    private float amplitude;
    private final CacheDrawModifierNode cacheDrawNode;
    private Animatable<Float, AnimationVector1D> globalRotationAnimatable;
    private Job indeterminateAnimationsJob;
    private Animatable<Float, AnimationVector1D> progressSweepAnimatable;

    public /* synthetic */ IndeterminateCircularWavyProgressNode(long j, long j2, Stroke stroke, Stroke stroke2, float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, stroke, stroke2, f, f2, f3, f4);
    }

    private IndeterminateCircularWavyProgressNode(long j, long j2, Stroke stroke, Stroke stroke2, float f, float f2, float f3, float f4) {
        super(j, j2, stroke, stroke2, f, f3, f4, null);
        this.amplitude = RangesKt.coerceIn(f2, 0.0f, 1.0f);
        this.cacheDrawNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new Function1() { // from class: androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DrawResult cacheDrawNode$lambda$0;
                cacheDrawNode$lambda$0 = IndeterminateCircularWavyProgressNode.cacheDrawNode$lambda$0(IndeterminateCircularWavyProgressNode.this, (CacheDrawScope) obj);
                return cacheDrawNode$lambda$0;
            }
        }));
    }

    public final float getAmplitude() {
        return this.amplitude;
    }

    public final void setAmplitude(float f) {
        float coerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f);
        float f2 = this.amplitude;
        if (f2 == coerceIn) {
            return;
        }
        this.amplitude = coerceIn;
        if (coerceIn > 0.0f && f2 == 0.0f) {
            startOffsetAnimation();
        } else if (coerceIn == 0.0f) {
            stopOffsetAnimation();
        }
        this.cacheDrawNode.invalidateDrawCache();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        startIndeterminateAnimations();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.globalRotationAnimatable = null;
        this.additionalRotationAnimatable = null;
        this.progressSweepAnimatable = null;
        setVertexCountForCurrentAnimation(-1);
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressNode
    protected void invalidateDraw() {
        DrawModifierNodeKt.invalidateDraw(this.cacheDrawNode);
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressNode
    protected void invalidateDrawCache() {
        this.cacheDrawNode.invalidateDrawCache();
    }

    @Override // androidx.compose.material3.internal.BaseCircularWavyProgressNode
    protected boolean isDrawingWave() {
        return this.amplitude > 0.0f;
    }

    private final void startIndeterminateAnimations() {
        Job launch$default;
        Job job = this.indeterminateAnimationsJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (getIsAttached() && CoroutineScopeKt.isActive(getCoroutineScope())) {
            Animatable<Float, AnimationVector1D> animatable = this.globalRotationAnimatable;
            if (animatable == null) {
                animatable = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
            }
            this.globalRotationAnimatable = animatable;
            Animatable<Float, AnimationVector1D> animatable2 = this.additionalRotationAnimatable;
            if (animatable2 == null) {
                animatable2 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
            }
            this.additionalRotationAnimatable = animatable2;
            Animatable<Float, AnimationVector1D> animatable3 = this.progressSweepAnimatable;
            if (animatable3 == null) {
                animatable3 = AnimatableKt.Animatable$default(0.1f, 0.0f, 2, null);
            }
            this.progressSweepAnimatable = animatable3;
            launch$default = BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new IndeterminateCircularWavyProgressNode$startIndeterminateAnimations$1(this, null), 3, null);
            this.indeterminateAnimationsJob = launch$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult cacheDrawNode$lambda$0(final IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode, CacheDrawScope cacheDrawScope) {
        boolean z;
        float f;
        Job offsetAnimationJob;
        final float mo528toPx0680j_4 = cacheDrawScope.mo528toPx0680j_4(indeterminateCircularWavyProgressNode.getWavelength());
        final float mo528toPx0680j_42 = cacheDrawScope.mo528toPx0680j_4(indeterminateCircularWavyProgressNode.getGapSize());
        final boolean z2 = Dp.m9731compareTo0680j_4(indeterminateCircularWavyProgressNode.getWaveSpeed(), Dp.m9732constructorimpl((float) 0)) > 0 && indeterminateCircularWavyProgressNode.amplitude > 0.0f;
        CircularShapes circularShapes = indeterminateCircularWavyProgressNode.getCircularShapes();
        long m6299getSizeNHjbRc = cacheDrawScope.m6299getSizeNHjbRc();
        float width = indeterminateCircularWavyProgressNode.getStroke().getWidth();
        float f2 = indeterminateCircularWavyProgressNode.amplitude;
        if (f2 <= 0.0f || f2 >= 1.0f) {
            z = false;
            f = width;
        } else {
            f = width;
            z = true;
        }
        circularShapes.m4768updateCqks5Fs(m6299getSizeNHjbRc, mo528toPx0680j_4, f, z);
        if (indeterminateCircularWavyProgressNode.getVertexCountForCurrentAnimation() != indeterminateCircularWavyProgressNode.getCircularShapes().getCurrentVertexCount().getIntValue()) {
            indeterminateCircularWavyProgressNode.setVertexCountForCurrentAnimation(RangesKt.coerceAtLeast(indeterminateCircularWavyProgressNode.getCircularShapes().getCurrentVertexCount().getIntValue(), 5));
        }
        if (indeterminateCircularWavyProgressNode.amplitude > 0.0f && (indeterminateCircularWavyProgressNode.getOffsetAnimationJob() == null || ((offsetAnimationJob = indeterminateCircularWavyProgressNode.getOffsetAnimationJob()) != null && offsetAnimationJob.isCompleted()))) {
            indeterminateCircularWavyProgressNode.startOffsetAnimation();
        }
        return cacheDrawScope.onDrawWithContent(new Function1() { // from class: androidx.compose.material3.internal.IndeterminateCircularWavyProgressNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit cacheDrawNode$lambda$0$0;
                cacheDrawNode$lambda$0$0 = IndeterminateCircularWavyProgressNode.cacheDrawNode$lambda$0$0(IndeterminateCircularWavyProgressNode.this, z2, mo528toPx0680j_4, mo528toPx0680j_42, (ContentDrawScope) obj);
                return cacheDrawNode$lambda$0$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cacheDrawNode$lambda$0$0(IndeterminateCircularWavyProgressNode indeterminateCircularWavyProgressNode, boolean z, float f, float f2, ContentDrawScope contentDrawScope) {
        Animatable<Float, AnimationVector1D> animatable = indeterminateCircularWavyProgressNode.globalRotationAnimatable;
        float floatValue = animatable != null ? animatable.getValue().floatValue() : 0.0f;
        Animatable<Float, AnimationVector1D> animatable2 = indeterminateCircularWavyProgressNode.additionalRotationAnimatable;
        float floatValue2 = animatable2 != null ? animatable2.getValue().floatValue() : 0.0f;
        Animatable<Float, AnimationVector1D> animatable3 = indeterminateCircularWavyProgressNode.progressSweepAnimatable;
        indeterminateCircularWavyProgressNode.getProgressDrawingCache().m4767updatePathsbLEYqPY(contentDrawScope.mo7294getSizeNHjbRc(), new IndeterminateCircularWavyProgressNode$cacheDrawNode$1$1$1(indeterminateCircularWavyProgressNode), new IndeterminateCircularWavyProgressNode$cacheDrawNode$1$1$2(indeterminateCircularWavyProgressNode), z, 0.0f, animatable3 != null ? animatable3.getValue().floatValue() : 0.1f, indeterminateCircularWavyProgressNode.amplitude, z ? indeterminateCircularWavyProgressNode.getWaveOffsetState().getFloatValue() : 0.0f, f, f2, indeterminateCircularWavyProgressNode.getStroke(), indeterminateCircularWavyProgressNode.getTrackStroke());
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        DrawContext drawContext = contentDrawScope2.getDrawContext();
        long mo7301getSizeNHjbRc = drawContext.mo7301getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform.CC.m7440rotateUv8p0NA$default(drawContext.getTransform(), floatValue + floatValue2 + 90.0f, 0L, 2, null);
            CircularWavyProgressModifiersKt.m4772drawCircularIndicatorRIQooxk(contentDrawScope2, indeterminateCircularWavyProgressNode.getColor(), indeterminateCircularWavyProgressNode.getTrackColor(), indeterminateCircularWavyProgressNode.getStroke(), indeterminateCircularWavyProgressNode.getTrackStroke(), indeterminateCircularWavyProgressNode.getProgressDrawingCache());
            drawContext.getCanvas().restore();
            drawContext.mo7302setSizeuvyYCjk(mo7301getSizeNHjbRc);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo7302setSizeuvyYCjk(mo7301getSizeNHjbRc);
            throw th;
        }
    }
}
