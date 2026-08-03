package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: FloatingActionButton.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BC\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ>\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bJ#\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/FabVisibleNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "visible", "", "alignment", "Landroidx/compose/ui/Alignment;", "targetScale", "", "scaleAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "alphaAnimationSpec", "<init>", "(ZLandroidx/compose/ui/Alignment;FLandroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;)V", "scaleAnimatable", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "alphaAnimatable", "updateNode", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class FabVisibleNode extends DelegatingNode implements LayoutModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private Alignment alignment;
    private final Animatable<Float, AnimationVector1D> alphaAnimatable;
    private AnimationSpec<Float> alphaAnimationSpec;
    private final Animatable<Float, AnimationVector1D> scaleAnimatable;
    private AnimationSpec<Float> scaleAnimationSpec;
    private float targetScale;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int maxHeight$ui;
        maxHeight$ui = NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$maxIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s, reason: not valid java name */
            public final MeasureResult mo8513measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                return LayoutModifierNode.this.mo109measure3p2s80s(measureScope, measurable, j);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
        return maxHeight$ui;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int maxWidth$ui;
        maxWidth$ui = NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$maxIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo8513measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                return LayoutModifierNode.this.mo109measure3p2s80s(measureScope, measurable, j);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
        return maxWidth$ui;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int minHeight$ui;
        minHeight$ui = NodeMeasuringIntrinsics.INSTANCE.minHeight$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$minIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo8513measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                return LayoutModifierNode.this.mo109measure3p2s80s(measureScope, measurable, j);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
        return minHeight$ui;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int minWidth$ui;
        minWidth$ui = NodeMeasuringIntrinsics.INSTANCE.minWidth$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$minIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo8513measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                return LayoutModifierNode.this.mo109measure3p2s80s(measureScope, measurable, j);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
        return minWidth$ui;
    }

    public FabVisibleNode(boolean z, Alignment alignment, float f, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2) {
        this.alignment = alignment;
        this.targetScale = f;
        this.scaleAnimationSpec = animationSpec;
        this.alphaAnimationSpec = animationSpec2;
        this.scaleAnimatable = AnimatableKt.Animatable$default(z ? 1.0f : 0.0f, 0.0f, 2, null);
        this.alphaAnimatable = AnimatableKt.Animatable$default(z ? 1.0f : 0.0f, 0.0f, 2, null);
        delegate(DrawModifierKt.CacheDrawModifierNode(new Function1() { // from class: androidx.compose.material3.FabVisibleNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DrawResult _init_$lambda$0;
                _init_$lambda$0 = FabVisibleNode._init_$lambda$0(FabVisibleNode.this, (CacheDrawScope) obj);
                return _init_$lambda$0;
            }
        }));
    }

    public /* synthetic */ FabVisibleNode(boolean z, Alignment alignment, float f, AnimationSpec animationSpec, AnimationSpec animationSpec2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, alignment, f, (i & 8) != 0 ? null : animationSpec, (i & 16) != 0 ? null : animationSpec2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult _init_$lambda$0(FabVisibleNode fabVisibleNode, CacheDrawScope cacheDrawScope) {
        final GraphicsLayer obtainGraphicsLayer = cacheDrawScope.obtainGraphicsLayer();
        final float mo528toPx0680j_4 = cacheDrawScope.mo528toPx0680j_4(Dp.m9732constructorimpl(16));
        float f = 2.0f * mo528toPx0680j_4;
        float intBitsToFloat = Float.intBitsToFloat((int) (cacheDrawScope.m6299getSizeNHjbRc() >> 32)) + f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (cacheDrawScope.m6299getSizeNHjbRc() & 4294967295L)) + f;
        long m9918toIntSizeuvyYCjk = IntSizeKt.m9918toIntSizeuvyYCjk(Size.m6579constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L)));
        long m9918toIntSizeuvyYCjk2 = IntSizeKt.m9918toIntSizeuvyYCjk(cacheDrawScope.m6299getSizeNHjbRc());
        obtainGraphicsLayer.m7484setTopLeftgyyYBs(IntOffset.m9858constructorimpl(((-MathKt.roundToInt(mo528toPx0680j_4)) & 4294967295L) | ((-MathKt.roundToInt(mo528toPx0680j_4)) << 32)));
        obtainGraphicsLayer.setAlpha(fabVisibleNode.alphaAnimatable.getValue().floatValue());
        long j = 1;
        long mo6187alignKFBX0sM = fabVisibleNode.alignment.mo6187alignKFBX0sM(IntSize.m9902constructorimpl((j & 4294967295L) | (j << 32)), m9918toIntSizeuvyYCjk2, cacheDrawScope.getLayoutDirection());
        float m9864getXimpl = IntOffset.m9864getXimpl(mo6187alignKFBX0sM);
        float m9865getYimpl = IntOffset.m9865getYimpl(mo6187alignKFBX0sM);
        obtainGraphicsLayer.m7480setPivotOffsetk4lQ0M(Offset.m6524plusMKHz9U(Offset.m6511constructorimpl((Float.floatToRawIntBits(m9865getYimpl) & 4294967295L) | (Float.floatToRawIntBits(m9864getXimpl) << 32)), Offset.m6511constructorimpl((4294967295L & Float.floatToRawIntBits(mo528toPx0680j_4)) | (Float.floatToRawIntBits(mo528toPx0680j_4) << 32))));
        obtainGraphicsLayer.setScaleX(MathHelpersKt.lerp(fabVisibleNode.targetScale, 1.0f, fabVisibleNode.scaleAnimatable.getValue().floatValue()));
        obtainGraphicsLayer.setScaleY(MathHelpersKt.lerp(fabVisibleNode.targetScale, 1.0f, fabVisibleNode.scaleAnimatable.getValue().floatValue()));
        CacheDrawScope.m6298recordTdoYBX4$default(cacheDrawScope, obtainGraphicsLayer, null, null, m9918toIntSizeuvyYCjk, new Function1() { // from class: androidx.compose.material3.FabVisibleNode$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FabVisibleNode.lambda$0$0$0(mo528toPx0680j_4, (ContentDrawScope) obj);
            }
        }, 3, null);
        return cacheDrawScope.onDrawWithContent(new Function1() { // from class: androidx.compose.material3.FabVisibleNode$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FabVisibleNode.lambda$0$1(GraphicsLayer.this, (ContentDrawScope) obj);
            }
        });
    }

    static final Unit lambda$0$0$0(float f, ContentDrawScope contentDrawScope) {
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        contentDrawScope2.getDrawContext().getTransform().inset(f, f, f, f);
        try {
            contentDrawScope.drawContent();
            float f2 = -f;
            contentDrawScope2.getDrawContext().getTransform().inset(f2, f2, f2, f2);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            float f3 = -f;
            contentDrawScope2.getDrawContext().getTransform().inset(f3, f3, f3, f3);
            throw th;
        }
    }

    static final Unit lambda$0$1(GraphicsLayer graphicsLayer, ContentDrawScope contentDrawScope) {
        GraphicsLayerKt.drawLayer(contentDrawScope, graphicsLayer);
        return Unit.INSTANCE;
    }

    public final void updateNode(boolean visible, Alignment alignment, float targetScale, AnimationSpec<Float> scaleAnimationSpec, AnimationSpec<Float> alphaAnimationSpec) {
        this.alignment = alignment;
        this.targetScale = targetScale;
        this.scaleAnimationSpec = scaleAnimationSpec;
        this.alphaAnimationSpec = alphaAnimationSpec;
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new FabVisibleNode$updateNode$1(this, visible, scaleAnimationSpec, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new FabVisibleNode$updateNode$2(this, visible, alphaAnimationSpec, null), 3, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo109measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        if (this.alphaAnimatable.getValue().floatValue() == 0.0f) {
            return MeasureScope.CC.layout$default(measureScope, 0, 0, null, new Function1() { // from class: androidx.compose.material3.FabVisibleNode$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit measure_3p2s80s$lambda$0;
                    measure_3p2s80s$lambda$0 = FabVisibleNode.measure_3p2s80s$lambda$0((Placeable.PlacementScope) obj);
                    return measure_3p2s80s$lambda$0;
                }
            }, 4, null);
        }
        final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(j);
        return MeasureScope.CC.layout$default(measureScope, mo8285measureBRTryo0.getWidth(), mo8285measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.material3.FabVisibleNode$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit measure_3p2s80s$lambda$1;
                measure_3p2s80s$lambda$1 = FabVisibleNode.measure_3p2s80s$lambda$1(Placeable.this, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$1;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$0(Placeable.PlacementScope placementScope) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$1(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
