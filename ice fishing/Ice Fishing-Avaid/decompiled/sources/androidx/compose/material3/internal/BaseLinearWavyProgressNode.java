package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* compiled from: LinearWavyProgressModifiers.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0003\b\"\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020-H\u0016J\b\u0010F\u001a\u00020-H\u0004J\u0010\u0010G\u001a\u00020-2\u0006\u0010H\u001a\u000207H\u0004J\b\u0010I\u001a\u00020JH$J\b\u0010K\u001a\u00020-H$J\b\u0010L\u001a\u00020-H$R&\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R&\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR&\u0010 \u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R&\u0010&\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R&\u0010)\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b*\u0010\"\"\u0004\b+\u0010$R\u0014\u0010/\u001a\u000200X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R(\u00105\u001a\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000208\u0018\u000106X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010=\u001a\u0004\u0018\u000104X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020CX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010E¨\u0006M"}, d2 = {"Landroidx/compose/material3/internal/BaseLinearWavyProgressNode;", "Landroidx/compose/ui/node/DelegatingNode;", "colorParameter", "Landroidx/compose/ui/graphics/Color;", "trackColorParameter", "strokeParameter", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "trackStrokeParameter", "gapSizeParameter", "Landroidx/compose/ui/unit/Dp;", "wavelengthParameter", "waveSpeedParameter", "<init>", "(JJLandroidx/compose/ui/graphics/drawscope/Stroke;Landroidx/compose/ui/graphics/drawscope/Stroke;FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "value", "color", "getColor-0d7_KjU", "()J", "setColor-8_81llA", "(J)V", "J", "trackColor", "getTrackColor-0d7_KjU", "setTrackColor-8_81llA", "stroke", "getStroke", "()Landroidx/compose/ui/graphics/drawscope/Stroke;", "setStroke", "(Landroidx/compose/ui/graphics/drawscope/Stroke;)V", "trackStroke", "getTrackStroke", "setTrackStroke", "gapSize", "getGapSize-D9Ej5fM", "()F", "setGapSize-0680j_4", "(F)V", "F", "wavelength", "getWavelength-D9Ej5fM", "setWavelength-0680j_4", "waveSpeed", "getWaveSpeed-D9Ej5fM", "setWaveSpeed-0680j_4", "onAttach", "", "onDetach", "waveOffset", "Landroidx/compose/runtime/MutableFloatState;", "getWaveOffset", "()Landroidx/compose/runtime/MutableFloatState;", "offsetAnimationJob", "Lkotlinx/coroutines/Job;", "amplitudeAnimatable", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "getAmplitudeAnimatable", "()Landroidx/compose/animation/core/Animatable;", "setAmplitudeAnimatable", "(Landroidx/compose/animation/core/Animatable;)V", "amplitudeAnimationJob", "getAmplitudeAnimationJob", "()Lkotlinx/coroutines/Job;", "setAmplitudeAnimationJob", "(Lkotlinx/coroutines/Job;)V", "progressDrawingCache", "Landroidx/compose/material3/internal/LinearProgressDrawingCache;", "getProgressDrawingCache", "()Landroidx/compose/material3/internal/LinearProgressDrawingCache;", "updateOffsetAnimation", "updateAmplitudeAnimation", "targetAmplitudePx", "getProgressFractions", "", "invalidateDraw", "invalidateDrawCache", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
abstract class BaseLinearWavyProgressNode extends DelegatingNode {
    private Animatable<Float, AnimationVector1D> amplitudeAnimatable;
    private Job amplitudeAnimationJob;
    private long color;
    private float gapSize;
    private Job offsetAnimationJob;
    private final LinearProgressDrawingCache progressDrawingCache;
    private Stroke stroke;
    private long trackColor;
    private Stroke trackStroke;
    private final MutableFloatState waveOffset;
    private float waveSpeed;
    private float wavelength;

    public /* synthetic */ BaseLinearWavyProgressNode(long j, long j2, Stroke stroke, Stroke stroke2, float f, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, stroke, stroke2, f, f2, f3);
    }

    protected abstract float[] getProgressFractions();

    protected abstract void invalidateDraw();

    protected abstract void invalidateDrawCache();

    private BaseLinearWavyProgressNode(long j, long j2, Stroke stroke, Stroke stroke2, float f, float f2, float f3) {
        this.color = j;
        this.trackColor = j2;
        this.stroke = stroke;
        this.trackStroke = stroke2;
        this.gapSize = f;
        this.wavelength = f2;
        this.waveSpeed = f3;
        this.waveOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.progressDrawingCache = new LinearProgressDrawingCache();
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m4745setColor8_81llA(long j) {
        if (Color.m6787equalsimpl0(this.color, j)) {
            return;
        }
        this.color = j;
        invalidateDraw();
    }

    /* renamed from: getTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTrackColor() {
        return this.trackColor;
    }

    /* renamed from: setTrackColor-8_81llA, reason: not valid java name */
    public final void m4747setTrackColor8_81llA(long j) {
        if (Color.m6787equalsimpl0(this.trackColor, j)) {
            return;
        }
        this.trackColor = j;
        invalidateDraw();
    }

    public final Stroke getStroke() {
        return this.stroke;
    }

    public final void setStroke(Stroke stroke) {
        if (Intrinsics.areEqual(this.stroke, stroke)) {
            return;
        }
        this.stroke = stroke;
        invalidateDrawCache();
    }

    public final Stroke getTrackStroke() {
        return this.trackStroke;
    }

    public final void setTrackStroke(Stroke stroke) {
        if (Intrinsics.areEqual(this.trackStroke, stroke)) {
            return;
        }
        this.trackStroke = stroke;
        invalidateDrawCache();
    }

    /* renamed from: getGapSize-D9Ej5fM, reason: not valid java name and from getter */
    public final float getGapSize() {
        return this.gapSize;
    }

    /* renamed from: setGapSize-0680j_4, reason: not valid java name */
    public final void m4746setGapSize0680j_4(float f) {
        if (Dp.m9737equalsimpl0(this.gapSize, f)) {
            return;
        }
        this.gapSize = f;
        invalidateDrawCache();
    }

    /* renamed from: getWavelength-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWavelength() {
        return this.wavelength;
    }

    /* renamed from: setWavelength-0680j_4, reason: not valid java name */
    public final void m4749setWavelength0680j_4(float f) {
        if (Dp.m9737equalsimpl0(this.wavelength, f)) {
            return;
        }
        this.wavelength = f;
        updateOffsetAnimation();
        invalidateDrawCache();
    }

    /* renamed from: getWaveSpeed-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWaveSpeed() {
        return this.waveSpeed;
    }

    /* renamed from: setWaveSpeed-0680j_4, reason: not valid java name */
    public final void m4748setWaveSpeed0680j_4(float f) {
        if (Dp.m9737equalsimpl0(this.waveSpeed, f)) {
            return;
        }
        this.waveSpeed = f;
        updateOffsetAnimation();
        invalidateDrawCache();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateOffsetAnimation();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.amplitudeAnimatable = null;
    }

    protected final MutableFloatState getWaveOffset() {
        return this.waveOffset;
    }

    protected final Animatable<Float, AnimationVector1D> getAmplitudeAnimatable() {
        return this.amplitudeAnimatable;
    }

    protected final void setAmplitudeAnimatable(Animatable<Float, AnimationVector1D> animatable) {
        this.amplitudeAnimatable = animatable;
    }

    protected final Job getAmplitudeAnimationJob() {
        return this.amplitudeAnimationJob;
    }

    protected final void setAmplitudeAnimationJob(Job job) {
        this.amplitudeAnimationJob = job;
    }

    protected final LinearProgressDrawingCache getProgressDrawingCache() {
        return this.progressDrawingCache;
    }

    protected final void updateOffsetAnimation() {
        Job launch$default;
        Job job = this.offsetAnimationJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.offsetAnimationJob = null;
        if (getIsAttached()) {
            float f = 0;
            if (Dp.m9731compareTo0680j_4(this.waveSpeed, Dp.m9732constructorimpl(f)) > 0 && Dp.m9731compareTo0680j_4(this.wavelength, Dp.m9732constructorimpl(f)) > 0) {
                launch$default = BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new BaseLinearWavyProgressNode$updateOffsetAnimation$1(this, RangesKt.coerceAtLeast(Math.round((this.wavelength / this.waveSpeed) * 1000), 50), null), 3, null);
                this.offsetAnimationJob = launch$default;
                return;
            }
            this.waveOffset.setFloatValue(0.0f);
        }
    }

    protected final void updateAmplitudeAnimation(float targetAmplitudePx) {
        Job launch$default;
        Animatable<Float, AnimationVector1D> animatable = this.amplitudeAnimatable;
        if (animatable == null) {
            animatable = AnimatableKt.Animatable$default(targetAmplitudePx, 0.0f, 2, null);
            this.amplitudeAnimatable = animatable;
        }
        if (!getIsAttached() || animatable.getTargetValue().floatValue() == targetAmplitudePx) {
            return;
        }
        Job job = this.amplitudeAnimationJob;
        if (job == null || (job != null && job.isCompleted())) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new BaseLinearWavyProgressNode$updateAmplitudeAnimation$1(animatable, targetAmplitudePx, null), 3, null);
            this.amplitudeAnimationJob = launch$default;
        }
    }
}
