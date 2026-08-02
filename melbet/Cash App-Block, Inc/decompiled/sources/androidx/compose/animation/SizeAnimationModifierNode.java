package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.squareup.cash.arcade.components.ToastKt$Toast$8$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class SizeAnimationModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {
    public AnimationSpec animationSpec;
    public boolean lookaheadConstraintsAvailable;
    public long lookaheadSize = -9223372034707292160L;
    public long lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15);
    public final ParcelableSnapshotMutableState animData$delegate = Updater.mutableStateOf$default(null);

    public final class AnimData {
        public final Animatable anim;
        public long startSize;

        public AnimData(Animatable animatable, long j) {
            this.anim = animatable;
            this.startSize = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AnimData) {
                AnimData animData = (AnimData) obj;
                if (this.anim == animData.anim && IntSize.m1055equalsimpl0(this.startSize, animData.startSize)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.startSize) + (this.anim.hashCode() * 31);
        }

        public final String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) IntSize.m1056toStringimpl(this.startSize)) + ')';
        }
    }

    public SizeAnimationModifierNode(AnimationSpec animationSpec) {
        this.animationSpec = animationSpec;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo833measureBRTryo0;
        char c;
        long j2;
        AnimData animData;
        long m1030constrain4WqzIAM;
        AnimData animData2;
        if (measureScope.isLookingAhead()) {
            this.lookaheadConstraints = j;
            this.lookaheadConstraintsAvailable = true;
            mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
        } else {
            mo833measureBRTryo0 = measurable.mo833measureBRTryo0(this.lookaheadConstraintsAvailable ? this.lookaheadConstraints : j);
        }
        final Placeable placeable = mo833measureBRTryo0;
        long j3 = (placeable.height & BodyPartID.bodyIdMax) | (placeable.width << 32);
        if (measureScope.isLookingAhead()) {
            this.lookaheadSize = j3;
            c = ' ';
            m1030constrain4WqzIAM = j3;
            j2 = m1030constrain4WqzIAM;
        } else {
            long j4 = AnimatedContentKt.m137isValidozmzZPI(this.lookaheadSize) ? this.lookaheadSize : j3;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.animData$delegate;
            AnimData animData3 = (AnimData) parcelableSnapshotMutableState.getValue();
            if (animData3 != null) {
                Animatable animatable = animData3.anim;
                c = ' ';
                j2 = j3;
                boolean z = (IntSize.m1055equalsimpl0(j4, ((IntSize) animatable.getValue()).packedValue) || animatable.isRunning()) ? false : true;
                if (!IntSize.m1055equalsimpl0(j4, ((IntSize) animatable.targetValue$delegate.getValue()).packedValue) || z) {
                    animData3.startSize = ((IntSize) animatable.getValue()).packedValue;
                    animData2 = animData3;
                    JobKt.launch$default(getCoroutineScope(), null, null, new ToastKt$Toast$8$1(animData2, j4, this, (Continuation) null, 3), 3);
                } else {
                    animData2 = animData3;
                }
                animData = animData2;
            } else {
                long j5 = j4;
                c = ' ';
                j2 = j3;
                animData = new AnimData(new Animatable(new IntSize(j5), AnimatableKt.IntSizeToVector, new IntSize(4294967297L), 8), j5);
            }
            parcelableSnapshotMutableState.setValue(animData);
            m1030constrain4WqzIAM = ConstraintsKt.m1030constrain4WqzIAM(j, ((IntSize) animData.anim.getValue()).packedValue);
        }
        final int i = (int) (m1030constrain4WqzIAM >> c);
        final int i2 = (int) (m1030constrain4WqzIAM & BodyPartID.bodyIdMax);
        final long j6 = j2;
        return MeasureScope.layout$default(measureScope, i, i2, new Function1(this) { // from class: androidx.compose.animation.SizeAnimationModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                long j7 = (i << 32) | (i2 & BodyPartID.bodyIdMax);
                LayoutDirection layoutDirection = measureScope.getLayoutDirection();
                long j8 = j6;
                float f = (((int) (j7 >> 32)) - ((int) (j8 >> 32))) / 2.0f;
                float f2 = (((int) (j7 & BodyPartID.bodyIdMax)) - ((int) (j8 & BodyPartID.bodyIdMax))) / 2.0f;
                float f3 = layoutDirection == LayoutDirection.Ltr ? -1.0f : (-1.0f) * (-1.0f);
                float f4 = (1.0f - 1.0f) * f2;
                Placeable.PlacementScope.m854place70tqf50$default(placementScope, placeable, (Math.round(f4) & BodyPartID.bodyIdMax) | (Math.round((f3 + 1.0f) * f) << 32));
                return Unit.INSTANCE;
            }
        });
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        this.lookaheadSize = -9223372034707292160L;
        this.lookaheadConstraintsAvailable = false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        super.onReset();
        this.animData$delegate.setValue(null);
    }
}
