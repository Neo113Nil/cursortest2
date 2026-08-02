package com.squareup.cash.sheet;

import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.snapshots.Snapshot$Companion$$ExternalSyntheticLambda0;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.CardTransitionKt$sceneCache$lambda$4$0$$inlined$onDispose$1;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes7.dex */
public final /* synthetic */ class PinnedKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealSheetState f$0;

    public /* synthetic */ PinnedKt$$ExternalSyntheticLambda0(RealSheetState realSheetState, int i) {
        this.$r8$classId = i;
        this.f$0 = realSheetState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        int i = this.$r8$classId;
        RealSheetState realSheetState = this.f$0;
        switch (i) {
            case 0:
                ((Density) obj).getClass();
                Float f = (Float) realSheetState.peekHeightPx$delegate.getValue();
                AnchoredDraggableState anchoredDraggableState = realSheetState.draggableState;
                Float offsetOrNull = RealSheetStateKt.getOffsetOrNull(anchoredDraggableState);
                float positionOf = anchoredDraggableState.getAnchors().positionOf(SheetPosition.Peeking);
                if (offsetOrNull == null || f == null) {
                    j = 0;
                } else {
                    if (positionOf <= f.floatValue()) {
                        positionOf = f.floatValue();
                    }
                    float floatValue = offsetOrNull.floatValue();
                    if (floatValue <= positionOf) {
                        positionOf = floatValue;
                    }
                    j = (-MathKt__MathJVMKt.roundToInt(positionOf)) & BodyPartID.bodyIdMax;
                }
                return new IntOffset(j);
            case 1:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setAlpha(realSheetState.getExpandProgress());
                return Unit.INSTANCE;
            case 2:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope2.getClass();
                reusableGraphicsLayerScope2.setAlpha(realSheetState.getExpandProgress());
                return Unit.INSTANCE;
            case 3:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope3 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope3.getClass();
                reusableGraphicsLayerScope3.setAlpha(realSheetState.getExpandProgress());
                return Unit.INSTANCE;
            case 4:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope4 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope4.getClass();
                reusableGraphicsLayerScope4.setAlpha(1.0f - realSheetState.getExpandProgress());
                return Unit.INSTANCE;
            case 5:
                ((DisposableEffectScope) obj).getClass();
                return new CardTransitionKt$sceneCache$lambda$4$0$$inlined$onDispose$1(realSheetState, 1);
            case 6:
                ((DisposableEffectScope) obj).getClass();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = realSheetState.updateDragAnchors();
                CalloutKt$$ExternalSyntheticLambda0 calloutKt$$ExternalSyntheticLambda0 = new CalloutKt$$ExternalSyntheticLambda0(23, ref$ObjectRef, realSheetState);
                SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
                synchronized (SnapshotKt.lock) {
                    SnapshotKt.applyObservers = CollectionsKt.plus((Collection) SnapshotKt.applyObservers, (Object) calloutKt$$ExternalSyntheticLambda0);
                }
                return new RealSheetState$CreateDragAnchorsEffect$lambda$0$0$$inlined$onDispose$1(new Snapshot$Companion$$ExternalSyntheticLambda0(calloutKt$$ExternalSyntheticLambda0, 1), 0);
            default:
                Float f2 = (Float) obj;
                f2.getClass();
                Function1 function1 = realSheetState.settleWithVelocity;
                if (function1 != null) {
                    function1.invoke(f2);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("settleWithVelocity");
                throw null;
        }
    }
}
