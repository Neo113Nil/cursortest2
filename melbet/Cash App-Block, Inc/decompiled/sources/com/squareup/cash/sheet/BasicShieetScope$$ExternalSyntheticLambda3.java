package com.squareup.cash.sheet;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes7.dex */
public final /* synthetic */ class BasicShieetScope$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BasicShieetScope f$0;

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda3(BasicShieetScope basicShieetScope, int i) {
        this.$r8$classId = i;
        this.f$0 = basicShieetScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        BasicShieetScope basicShieetScope = this.f$0;
        switch (i) {
            case 0:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setAlpha(basicShieetScope.state.isReadyToBeDisplayed() ? 1.0f : RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
            case 1:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope2.getClass();
                reusableGraphicsLayerScope2.setAlpha(((Number) basicShieetScope.state.expandedContentProgress$delegate.getValue()).floatValue());
                return Unit.INSTANCE;
            case 2:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope3 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope3.getClass();
                reusableGraphicsLayerScope3.setAlpha(basicShieetScope.state.getCollapsedContentProgress());
                return Unit.INSTANCE;
            case 3:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope4 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope4.getClass();
                reusableGraphicsLayerScope4.setAlpha(basicShieetScope.state.getCollapsedContentProgress());
                return Unit.INSTANCE;
            case 4:
                ((Density) obj).getClass();
                return new IntOffset(RealSheetStateKt.getOffsetOrNull(basicShieetScope.state.draggableState) != null ? MathKt__MathJVMKt.roundToInt(r3.floatValue()) & BodyPartID.bodyIdMax : 0L);
            default:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                basicShieetScope.state.contentPositionInWindow$delegate.setValue(new Offset(layoutCoordinates.mo843localToWindowMKHz9U(0L)));
                return Unit.INSTANCE;
        }
    }
}
