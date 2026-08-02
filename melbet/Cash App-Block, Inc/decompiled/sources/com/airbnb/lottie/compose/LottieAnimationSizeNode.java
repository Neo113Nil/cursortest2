package com.airbnb.lottie.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.util.cash.Countries;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J&\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "width", "", "height", "(II)V", "getHeight", "()I", "setHeight", "(I)V", "getWidth", "setWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", CryptoServicesPermission.CONSTRAINTS, "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LottieAnimationSizeNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private int height;
    private int width;

    public LottieAnimationSizeNode(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return super.maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return super.maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        long Constraints;
        measureScope.getClass();
        measurable.getClass();
        long m1030constrain4WqzIAM = ConstraintsKt.m1030constrain4WqzIAM(j, Countries.IntSize(this.width, this.height));
        if (Constraints.m1024getMaxHeightimpl(j) == Integer.MAX_VALUE && Constraints.m1025getMaxWidthimpl(j) != Integer.MAX_VALUE) {
            int i = (int) (m1030constrain4WqzIAM >> 32);
            int i2 = (this.height * i) / this.width;
            Constraints = ConstraintsKt.Constraints(i, i, i2, i2);
        } else if (Constraints.m1025getMaxWidthimpl(j) != Integer.MAX_VALUE || Constraints.m1024getMaxHeightimpl(j) == Integer.MAX_VALUE) {
            int i3 = (int) (m1030constrain4WqzIAM >> 32);
            int i4 = (int) (m1030constrain4WqzIAM & BodyPartID.bodyIdMax);
            Constraints = ConstraintsKt.Constraints(i3, i3, i4, i4);
        } else {
            int i5 = (int) (m1030constrain4WqzIAM & BodyPartID.bodyIdMax);
            int i6 = (this.width * i5) / this.height;
            Constraints = ConstraintsKt.Constraints(i6, i6, i5, i5);
        }
        final Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(Constraints);
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationSizeNode$measure$1
            {
                super(1);
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                placementScope.getClass();
                placementScope.placeRelative(Placeable.this, 0, 0, RecyclerView.DECELERATION_RATE);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return Unit.INSTANCE;
            }
        });
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return super.minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return super.minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public /* bridge */ /* synthetic */ void onDensityChange() {
    }

    @Override // androidx.compose.ui.node.DelegatableNode
    public /* bridge */ /* synthetic */ void onLayoutDirectionChange() {
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}
