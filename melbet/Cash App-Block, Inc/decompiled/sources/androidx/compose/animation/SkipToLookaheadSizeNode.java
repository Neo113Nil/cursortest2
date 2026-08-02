package androidx.compose.animation;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.time.Duration;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class SkipToLookaheadSizeNode extends Modifier.Node implements LayoutModifierNode {
    public final ParcelableSnapshotMutableState isEnabled$delegate;
    public Constraints lookaheadConstraints;
    public long lookaheadSize = -9223372034707292160L;
    public final ParcelableSnapshotMutableState scaleToBounds$delegate;

    public SkipToLookaheadSizeNode(ScaleToBoundsImpl scaleToBoundsImpl, Function0 function0) {
        this.scaleToBounds$delegate = Updater.mutableStateOf$default(scaleToBoundsImpl);
        this.isEnabled$delegate = Updater.mutableStateOf$default(function0);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimatedContentKt.m137isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.maxIntrinsicHeight(i) : (int) (this.lookaheadSize & BodyPartID.bodyIdMax);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimatedContentKt.m137isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.maxIntrinsicWidth(i) : (int) (this.lookaheadSize >> 32);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo833measureBRTryo0;
        if (measureScope.isLookingAhead()) {
            this.lookaheadConstraints = new Constraints(j);
        }
        if (!((Boolean) ((Function0) this.isEnabled$delegate.getValue()).invoke()).booleanValue()) {
            Placeable mo833measureBRTryo02 = measurable.mo833measureBRTryo0(j);
            return MeasureScope.layout$default(measureScope, mo833measureBRTryo02.width, mo833measureBRTryo02.height, new SkipToLookaheadSizeNode$measure$1$1(mo833measureBRTryo02, 0));
        }
        if (measureScope.isLookingAhead()) {
            mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
            this.lookaheadSize = (mo833measureBRTryo0.width << 32) | (mo833measureBRTryo0.height & BodyPartID.bodyIdMax);
        } else {
            Constraints constraints = this.lookaheadConstraints;
            constraints.getClass();
            mo833measureBRTryo0 = measurable.mo833measureBRTryo0(constraints.value);
        }
        final Placeable placeable = mo833measureBRTryo0;
        final long m1030constrain4WqzIAM = ConstraintsKt.m1030constrain4WqzIAM(j, this.lookaheadSize);
        return MeasureScope.layout$default(measureScope, (int) (m1030constrain4WqzIAM >> 32), (int) (m1030constrain4WqzIAM & BodyPartID.bodyIdMax), new Function1() { // from class: androidx.compose.animation.SkipToLookaheadSizeNode$measure$2

            /* renamed from: androidx.compose.animation.SkipToLookaheadSizeNode$measure$2$1, reason: invalid class name */
            public final class AnonymousClass1 extends Lambda implements Function1 {
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ long $resolvedScale;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ AnonymousClass1(long j, int i) {
                    super(1);
                    this.$r8$classId = i;
                    this.$resolvedScale = j;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i = this.$r8$classId;
                    long j = this.$resolvedScale;
                    switch (i) {
                        case 0:
                            ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                            reusableGraphicsLayerScope.setScaleX(Float.intBitsToFloat((int) (j >> 32)));
                            reusableGraphicsLayerScope.setScaleY(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
                            reusableGraphicsLayerScope.m711setTransformOrigin__ExYCQ(ColorKt.TransformOrigin(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
                            return Unit.INSTANCE;
                        default:
                            Long l = (Long) obj;
                            if (l == null) {
                                a$$ExternalSyntheticBUOutline0.m$1("Start the timer with startTimer before calling addTime");
                                return null;
                            }
                            Duration.Companion companion = Duration.Companion;
                            if (j > 0) {
                                return Long.valueOf(Duration.m4167getInWholeMillisecondsimpl(j) + l.longValue());
                            }
                            a$$ExternalSyntheticBUOutline0.m$3("Cannot call addTime with a negative duration");
                            return null;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                long floatToRawIntBits;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                SkipToLookaheadSizeNode skipToLookaheadSizeNode = SkipToLookaheadSizeNode.this;
                ScaleToBoundsImpl scaleToBoundsImpl = (ScaleToBoundsImpl) skipToLookaheadSizeNode.scaleToBounds$delegate.getValue();
                int i = 0;
                if (scaleToBoundsImpl == null) {
                    placementScope.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                } else {
                    ContentScale contentScale = scaleToBoundsImpl.contentScale;
                    long j2 = skipToLookaheadSizeNode.lookaheadSize;
                    int i2 = (int) (j2 >> 32);
                    long j3 = m1030constrain4WqzIAM;
                    if (i2 == 0 || ((int) (j2 & BodyPartID.bodyIdMax)) == 0) {
                        floatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & BodyPartID.bodyIdMax);
                        int i3 = ScaleFactor.$r8$clinit;
                    } else {
                        floatToRawIntBits = contentScale.mo832computeScaleFactorH7hwNQA(Countries.m3991toSizeozmzZPI(j2), Countries.m3991toSizeozmzZPI(j3));
                    }
                    long roundToInt = (MathKt__MathJVMKt.roundToInt(Float.intBitsToFloat((int) (floatToRawIntBits & BodyPartID.bodyIdMax)) * ((int) (skipToLookaheadSizeNode.lookaheadSize & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (MathKt__MathJVMKt.roundToInt(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) * ((int) (skipToLookaheadSizeNode.lookaheadSize >> 32))) << 32);
                    float f = (((int) (j3 >> 32)) - ((int) (roundToInt >> 32))) / 2.0f;
                    float f2 = (((int) (j3 & BodyPartID.bodyIdMax)) - ((int) (roundToInt & BodyPartID.bodyIdMax))) / 2.0f;
                    float f3 = (1.0f + (measureScope.getLayoutDirection() == LayoutDirection.Ltr ? 0.0f : (-1.0f) * RecyclerView.DECELERATION_RATE)) * f;
                    long round = (Math.round((1.0f + RecyclerView.DECELERATION_RATE) * f2) & BodyPartID.bodyIdMax) | (Math.round(f3) << 32);
                    Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, (int) (round >> 32), (int) (round & BodyPartID.bodyIdMax), new AnonymousClass1(floatToRawIntBits, i), 4);
                }
                return Unit.INSTANCE;
            }
        });
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimatedContentKt.m137isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.minIntrinsicHeight(i) : (int) (this.lookaheadSize & BodyPartID.bodyIdMax);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimatedContentKt.m137isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.minIntrinsicWidth(i) : (int) (this.lookaheadSize >> 32);
    }
}
