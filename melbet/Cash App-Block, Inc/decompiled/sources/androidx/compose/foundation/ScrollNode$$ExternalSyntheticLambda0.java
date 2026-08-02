package androidx.compose.foundation;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class ScrollNode$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ ScrollNode$$ExternalSyntheticLambda0(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Composition composition;
        Composition composition2;
        int i;
        int i2 = this.$r8$classId;
        Object obj2 = this.f$2;
        int i3 = this.f$1;
        Object obj3 = this.f$0;
        switch (i2) {
            case 0:
                ScrollNode scrollNode = (ScrollNode) obj3;
                Placeable placeable = (Placeable) obj2;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                int intValue = scrollNode.state.value$delegate.getIntValue();
                if (intValue < 0) {
                    intValue = 0;
                }
                if (intValue <= i3) {
                    i3 = intValue;
                }
                int i4 = -i3;
                boolean z = scrollNode.isVertical;
                int i5 = z ? 0 : i4;
                int i6 = z ? i4 : 0;
                placementScope.motionFrameOfReferencePlacement = true;
                Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable, i5, i6, RecyclerView.DECELERATION_RATE, 12);
                placementScope.motionFrameOfReferencePlacement = false;
                break;
            default:
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj3;
                MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) obj2;
                Composition composition3 = (Composition) obj;
                if (recomposeScopeImpl.currentToken == i3 && Intrinsics.areEqual(mutableObjectIntMap, recomposeScopeImpl.trackedInstances) && (composition3 instanceof CompositionImpl)) {
                    long[] jArr = mutableObjectIntMap.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j = jArr[i7];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8;
                                int i9 = 8 - ((~(i7 - length)) >>> 31);
                                int i10 = 0;
                                while (i10 < i9) {
                                    if ((255 & j) < 128) {
                                        int i11 = (i7 << 3) + i10;
                                        Object obj4 = mutableObjectIntMap.keys[i11];
                                        boolean z2 = mutableObjectIntMap.values[i11] != i3;
                                        if (z2) {
                                            CompositionImpl compositionImpl = (CompositionImpl) composition3;
                                            i = i8;
                                            MutableScatterMap mutableScatterMap = compositionImpl.observations;
                                            PlatformKt.m1342removeimpl(mutableScatterMap, obj4, recomposeScopeImpl);
                                            composition2 = composition3;
                                            if (obj4 instanceof DerivedSnapshotState) {
                                                DerivedSnapshotState derivedSnapshotState = (DerivedSnapshotState) obj4;
                                                if (!mutableScatterMap.containsKey(derivedSnapshotState)) {
                                                    PlatformKt.m1343removeScopeimpl(compositionImpl.derivedStates, derivedSnapshotState);
                                                }
                                                MutableScatterMap mutableScatterMap2 = recomposeScopeImpl.trackedDependencies;
                                                if (mutableScatterMap2 != null) {
                                                    mutableScatterMap2.remove(obj4);
                                                }
                                            }
                                        } else {
                                            composition2 = composition3;
                                            i = i8;
                                        }
                                        if (z2) {
                                            mutableObjectIntMap.removeValueAt(i11);
                                        }
                                    } else {
                                        composition2 = composition3;
                                        i = i8;
                                    }
                                    j >>= i;
                                    i10++;
                                    i8 = i;
                                    composition3 = composition2;
                                }
                                composition = composition3;
                                if (i9 != i8) {
                                }
                            } else {
                                composition = composition3;
                            }
                            if (i7 != length) {
                                i7++;
                                composition3 = composition;
                            }
                        }
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
