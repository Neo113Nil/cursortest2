package androidx.compose.ui.layout;

import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import app.cash.redwood.Modifier$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class SubcomposeLayoutState {
    public LayoutNodeSubcompositionsState _state;
    public final SubcomposeLayoutState$setRoot$1 setCompositionContext;
    public final SubcomposeLayoutState$setRoot$1 setMeasurePolicy;
    public final SubcomposeLayoutState$setRoot$1 setRoot;
    public final SubcomposeSlotReusePolicy slotReusePolicy;

    public interface PausedPrecomposition {
        PrecomposedSlotHandle apply();

        void cancel();

        boolean isComplete();

        boolean resume(CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0 captureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0);
    }

    public interface PrecomposedSlotHandle {
        void dispose();

        default int getPlaceablesCount() {
            return 0;
        }

        /* renamed from: getSize-YEO4UFw */
        default long mo848getSizeYEO4UFw(int i) {
            return 0L;
        }

        /* renamed from: premeasure-0kLqBqw */
        default void mo849premeasure0kLqBqw(int i, long j) {
        }

        default void traverseDescendants(Modifier$$ExternalSyntheticLambda0 modifier$$ExternalSyntheticLambda0) {
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1] */
    public SubcomposeLayoutState(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.slotReusePolicy = subcomposeSlotReusePolicy;
        final int i = 0;
        this.setRoot = new Function2(this) { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
            public final /* synthetic */ SubcomposeLayoutState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i2 = i;
                SubcomposeLayoutState subcomposeLayoutState = this.this$0;
                switch (i2) {
                    case 0:
                        LayoutNode layoutNode = (LayoutNode) obj;
                        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy2 = subcomposeLayoutState.slotReusePolicy;
                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = layoutNode.subcompositionsState;
                        if (layoutNodeSubcompositionsState == null) {
                            layoutNodeSubcompositionsState = new LayoutNodeSubcompositionsState(layoutNode, subcomposeSlotReusePolicy2);
                            layoutNode.subcompositionsState = layoutNodeSubcompositionsState;
                        }
                        subcomposeLayoutState._state = layoutNodeSubcompositionsState;
                        subcomposeLayoutState.getState().makeSureStateIsConsistent();
                        LayoutNodeSubcompositionsState state = subcomposeLayoutState.getState();
                        if (state.slotReusePolicy != subcomposeSlotReusePolicy2) {
                            state.slotReusePolicy = subcomposeSlotReusePolicy2;
                            state.markActiveNodesAsReused(false);
                            LayoutNode.requestRemeasure$ui$default(state.root, false, 7);
                        }
                        break;
                    case 1:
                        subcomposeLayoutState.getState().compositionContext = (CompositionContext) obj2;
                        break;
                    default:
                        final Function2 function2 = (Function2) obj2;
                        final LayoutNodeSubcompositionsState state2 = subcomposeLayoutState.getState();
                        ((LayoutNode) obj).setMeasurePolicy(new LayoutNode.NoIntrinsicsMeasurePolicy(state2.NoIntrinsicsMessage) { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
                                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = LayoutNodeSubcompositionsState.this;
                                LayoutNodeSubcompositionsState.Scope scope = layoutNodeSubcompositionsState2.scope;
                                scope.layoutDirection = measureScope.getLayoutDirection();
                                scope.density = measureScope.getDensity();
                                scope.fontScale = measureScope.getFontScale();
                                boolean isLookingAhead = measureScope.isLookingAhead();
                                Function2 function22 = function2;
                                if (isLookingAhead || layoutNodeSubcompositionsState2.root.lookaheadRoot == null) {
                                    layoutNodeSubcompositionsState2.currentIndex = 0;
                                    final MeasureResult measureResult = (MeasureResult) function22.invoke(scope, new Constraints(j));
                                    final int i3 = layoutNodeSubcompositionsState2.currentIndex;
                                    final int i4 = 1;
                                    return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1
                                        @Override // androidx.compose.ui.layout.MeasureResult
                                        public final Map getAlignmentLines() {
                                            switch (i4) {
                                            }
                                            return measureResult.getAlignmentLines();
                                        }

                                        @Override // androidx.compose.ui.layout.MeasureResult
                                        public final int getHeight() {
                                            switch (i4) {
                                            }
                                            return measureResult.getHeight();
                                        }

                                        @Override // androidx.compose.ui.layout.MeasureResult
                                        public final Function1 getRulers() {
                                            switch (i4) {
                                            }
                                            return measureResult.getRulers();
                                        }

                                        @Override // androidx.compose.ui.layout.MeasureResult
                                        public final int getWidth() {
                                            switch (i4) {
                                            }
                                            return measureResult.getWidth();
                                        }

                                        @Override // androidx.compose.ui.layout.MeasureResult
                                        public final void placeChildren() {
                                            int i5 = i4;
                                            MeasureResult measureResult2 = measureResult;
                                            int i6 = i3;
                                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState3 = layoutNodeSubcompositionsState2;
                                            switch (i5) {
                                                case 0:
                                                    layoutNodeSubcompositionsState3.currentApproachIndex = i6;
                                                    measureResult2.placeChildren();
                                                    MutableVector mutableVector = layoutNodeSubcompositionsState3.slotIdsOfCompositionsNeededInApproach;
                                                    MutableScatterMap mutableScatterMap = layoutNodeSubcompositionsState3.approachPrecomposeSlotHandleMap;
                                                    long[] jArr = mutableScatterMap.metadata;
                                                    int length = jArr.length - 2;
                                                    if (length >= 0) {
                                                        int i7 = 0;
                                                        while (true) {
                                                            long j2 = jArr[i7];
                                                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i8 = 8 - ((~(i7 - length)) >>> 31);
                                                                for (int i9 = 0; i9 < i8; i9++) {
                                                                    if ((255 & j2) < 128) {
                                                                        int i10 = (i7 << 3) + i9;
                                                                        Object obj3 = mutableScatterMap.keys[i10];
                                                                        SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = (SubcomposeLayoutState.PrecomposedSlotHandle) mutableScatterMap.values[i10];
                                                                        int indexOf = mutableVector.indexOf(obj3);
                                                                        if (indexOf < 0 || indexOf >= layoutNodeSubcompositionsState3.currentApproachIndex) {
                                                                            if (indexOf >= 0) {
                                                                                Object[] objArr = mutableVector.content;
                                                                                Object obj4 = objArr[indexOf];
                                                                                objArr[indexOf] = RulerKt.UnspecifiedSlotId;
                                                                            }
                                                                            if (layoutNodeSubcompositionsState3.precomposeMap.contains(obj3)) {
                                                                                precomposedSlotHandle.dispose();
                                                                            }
                                                                            mutableScatterMap.removeValueAt(i10);
                                                                        }
                                                                    }
                                                                    j2 >>= 8;
                                                                }
                                                                if (i8 != 8) {
                                                                }
                                                            }
                                                            if (i7 != length) {
                                                                i7++;
                                                            }
                                                        }
                                                    }
                                                    layoutNodeSubcompositionsState3.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState3.currentIndex);
                                                    break;
                                                default:
                                                    layoutNodeSubcompositionsState3.currentIndex = i6;
                                                    measureResult2.placeChildren();
                                                    if (layoutNodeSubcompositionsState3.root.lookaheadRoot == null) {
                                                        layoutNodeSubcompositionsState3.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState3.currentIndex);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                }
                                layoutNodeSubcompositionsState2.currentApproachIndex = 0;
                                final MeasureResult measureResult2 = (MeasureResult) function22.invoke(layoutNodeSubcompositionsState2.approachMeasureScope, new Constraints(j));
                                final int i5 = layoutNodeSubcompositionsState2.currentApproachIndex;
                                final int i6 = 0;
                                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1
                                    @Override // androidx.compose.ui.layout.MeasureResult
                                    public final Map getAlignmentLines() {
                                        switch (i6) {
                                        }
                                        return measureResult2.getAlignmentLines();
                                    }

                                    @Override // androidx.compose.ui.layout.MeasureResult
                                    public final int getHeight() {
                                        switch (i6) {
                                        }
                                        return measureResult2.getHeight();
                                    }

                                    @Override // androidx.compose.ui.layout.MeasureResult
                                    public final Function1 getRulers() {
                                        switch (i6) {
                                        }
                                        return measureResult2.getRulers();
                                    }

                                    @Override // androidx.compose.ui.layout.MeasureResult
                                    public final int getWidth() {
                                        switch (i6) {
                                        }
                                        return measureResult2.getWidth();
                                    }

                                    @Override // androidx.compose.ui.layout.MeasureResult
                                    public final void placeChildren() {
                                        int i52 = i6;
                                        MeasureResult measureResult22 = measureResult2;
                                        int i62 = i5;
                                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState3 = layoutNodeSubcompositionsState2;
                                        switch (i52) {
                                            case 0:
                                                layoutNodeSubcompositionsState3.currentApproachIndex = i62;
                                                measureResult22.placeChildren();
                                                MutableVector mutableVector = layoutNodeSubcompositionsState3.slotIdsOfCompositionsNeededInApproach;
                                                MutableScatterMap mutableScatterMap = layoutNodeSubcompositionsState3.approachPrecomposeSlotHandleMap;
                                                long[] jArr = mutableScatterMap.metadata;
                                                int length = jArr.length - 2;
                                                if (length >= 0) {
                                                    int i7 = 0;
                                                    while (true) {
                                                        long j2 = jArr[i7];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                                                            for (int i9 = 0; i9 < i8; i9++) {
                                                                if ((255 & j2) < 128) {
                                                                    int i10 = (i7 << 3) + i9;
                                                                    Object obj3 = mutableScatterMap.keys[i10];
                                                                    SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = (SubcomposeLayoutState.PrecomposedSlotHandle) mutableScatterMap.values[i10];
                                                                    int indexOf = mutableVector.indexOf(obj3);
                                                                    if (indexOf < 0 || indexOf >= layoutNodeSubcompositionsState3.currentApproachIndex) {
                                                                        if (indexOf >= 0) {
                                                                            Object[] objArr = mutableVector.content;
                                                                            Object obj4 = objArr[indexOf];
                                                                            objArr[indexOf] = RulerKt.UnspecifiedSlotId;
                                                                        }
                                                                        if (layoutNodeSubcompositionsState3.precomposeMap.contains(obj3)) {
                                                                            precomposedSlotHandle.dispose();
                                                                        }
                                                                        mutableScatterMap.removeValueAt(i10);
                                                                    }
                                                                }
                                                                j2 >>= 8;
                                                            }
                                                            if (i8 != 8) {
                                                            }
                                                        }
                                                        if (i7 != length) {
                                                            i7++;
                                                        }
                                                    }
                                                }
                                                layoutNodeSubcompositionsState3.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState3.currentIndex);
                                                break;
                                            default:
                                                layoutNodeSubcompositionsState3.currentIndex = i62;
                                                measureResult22.placeChildren();
                                                if (layoutNodeSubcompositionsState3.root.lookaheadRoot == null) {
                                                    layoutNodeSubcompositionsState3.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState3.currentIndex);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                            }
                        });
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i2 = 1;
        this.setCompositionContext = new Function2(this) { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
            public final /* synthetic */ SubcomposeLayoutState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i22 = i2;
                SubcomposeLayoutState subcomposeLayoutState = this.this$0;
                switch (i22) {
                    case 0:
                        LayoutNode layoutNode = (LayoutNode) obj;
                        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy2 = subcomposeLayoutState.slotReusePolicy;
                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = layoutNode.subcompositionsState;
                        if (layoutNodeSubcompositionsState == null) {
                            layoutNodeSubcompositionsState = new LayoutNodeSubcompositionsState(layoutNode, subcomposeSlotReusePolicy2);
                            layoutNode.subcompositionsState = layoutNodeSubcompositionsState;
                        }
                        subcomposeLayoutState._state = layoutNodeSubcompositionsState;
                        subcomposeLayoutState.getState().makeSureStateIsConsistent();
                        LayoutNodeSubcompositionsState state = subcomposeLayoutState.getState();
                        if (state.slotReusePolicy != subcomposeSlotReusePolicy2) {
                            state.slotReusePolicy = subcomposeSlotReusePolicy2;
                            state.markActiveNodesAsReused(false);
                            LayoutNode.requestRemeasure$ui$default(state.root, false, 7);
                        }
                        break;
                    case 1:
                        subcomposeLayoutState.getState().compositionContext = (CompositionContext) obj2;
                        break;
                    default:
                        final Function2 function2 = (Function2) obj2;
                        final LayoutNodeSubcompositionsState state2 = subcomposeLayoutState.getState();
                        ((LayoutNode) obj).setMeasurePolicy(new LayoutNode.NoIntrinsicsMeasurePolicy(state2.NoIntrinsicsMessage) { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
                                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = LayoutNodeSubcompositionsState.this;
                                LayoutNodeSubcompositionsState.Scope scope = layoutNodeSubcompositionsState2.scope;
                                scope.layoutDirection = measureScope.getLayoutDirection();
                                scope.density = measureScope.getDensity();
                                scope.fontScale = measureScope.getFontScale();
                                boolean isLookingAhead = measureScope.isLookingAhead();
                                Function2 function22 = function2;
                                if (isLookingAhead || layoutNodeSubcompositionsState2.root.lookaheadRoot == null) {
                                    layoutNodeSubcompositionsState2.currentIndex = 0;
                                    final MeasureResult measureResult = (MeasureResult) function22.invoke(scope, new Constraints(j));
                                    final int i3 = layoutNodeSubcompositionsState2.currentIndex;
                                    final int i4 = 1;
                                    return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1
                                        @Override // androidx.compose.ui.layout.MeasureResult
                                        public final Map getAlignmentLines() {
                                            switch (i4) {
                                            }
                                            return measureResult.getAlignmentLines();
                                        }

                                        @Override // androidx.compose.ui.layout.MeasureResult
                                        public final int getHeight() {
                                            switch (i4) {
                                            }
                                            return measureResult.getHeight();
                                        }

                                        @Override // androidx.compose.ui.layout.MeasureResult
                                        public final Function1 getRulers() {
                                            switch (i4) {
                                            }
                                            return measureResult.getRulers();
                                        }

                                        @Override // androidx.compose.ui.layout.MeasureResult
                                        public final int getWidth() {
                                            switch (i4) {
                                            }
                                            return measureResult.getWidth();
                                        }

                                        @Override // androidx.compose.ui.layout.MeasureResult
                                        public final void placeChildren() {
                                            int i52 = i4;
                                            MeasureResult measureResult22 = measureResult;
                                            int i62 = i3;
                                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState3 = layoutNodeSubcompositionsState2;
                                            switch (i52) {
                                                case 0:
                                                    layoutNodeSubcompositionsState3.currentApproachIndex = i62;
                                                    measureResult22.placeChildren();
                                                    MutableVector mutableVector = layoutNodeSubcompositionsState3.slotIdsOfCompositionsNeededInApproach;
                                                    MutableScatterMap mutableScatterMap = layoutNodeSubcompositionsState3.approachPrecomposeSlotHandleMap;
                                                    long[] jArr = mutableScatterMap.metadata;
                                                    int length = jArr.length - 2;
                                                    if (length >= 0) {
                                                        int i7 = 0;
                                                        while (true) {
                                                            long j2 = jArr[i7];
                                                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i8 = 8 - ((~(i7 - length)) >>> 31);
                                                                for (int i9 = 0; i9 < i8; i9++) {
                                                                    if ((255 & j2) < 128) {
                                                                        int i10 = (i7 << 3) + i9;
                                                                        Object obj3 = mutableScatterMap.keys[i10];
                                                                        SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = (SubcomposeLayoutState.PrecomposedSlotHandle) mutableScatterMap.values[i10];
                                                                        int indexOf = mutableVector.indexOf(obj3);
                                                                        if (indexOf < 0 || indexOf >= layoutNodeSubcompositionsState3.currentApproachIndex) {
                                                                            if (indexOf >= 0) {
                                                                                Object[] objArr = mutableVector.content;
                                                                                Object obj4 = objArr[indexOf];
                                                                                objArr[indexOf] = RulerKt.UnspecifiedSlotId;
                                                                            }
                                                                            if (layoutNodeSubcompositionsState3.precomposeMap.contains(obj3)) {
                                                                                precomposedSlotHandle.dispose();
                                                                            }
                                                                            mutableScatterMap.removeValueAt(i10);
                                                                        }
                                                                    }
                                                                    j2 >>= 8;
                                                                }
                                                                if (i8 != 8) {
                                                                }
                                                            }
                                                            if (i7 != length) {
                                                                i7++;
                                                            }
                                                        }
                                                    }
                                                    layoutNodeSubcompositionsState3.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState3.currentIndex);
                                                    break;
                                                default:
                                                    layoutNodeSubcompositionsState3.currentIndex = i62;
                                                    measureResult22.placeChildren();
                                                    if (layoutNodeSubcompositionsState3.root.lookaheadRoot == null) {
                                                        layoutNodeSubcompositionsState3.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState3.currentIndex);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                }
                                layoutNodeSubcompositionsState2.currentApproachIndex = 0;
                                final MeasureResult measureResult2 = (MeasureResult) function22.invoke(layoutNodeSubcompositionsState2.approachMeasureScope, new Constraints(j));
                                final int i5 = layoutNodeSubcompositionsState2.currentApproachIndex;
                                final int i6 = 0;
                                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1
                                    @Override // androidx.compose.ui.layout.MeasureResult
                                    public final Map getAlignmentLines() {
                                        switch (i6) {
                                        }
                                        return measureResult2.getAlignmentLines();
                                    }

                                    @Override // androidx.compose.ui.layout.MeasureResult
                                    public final int getHeight() {
                                        switch (i6) {
                                        }
                                        return measureResult2.getHeight();
                                    }

                                    @Override // androidx.compose.ui.layout.MeasureResult
                                    public final Function1 getRulers() {
                                        switch (i6) {
                                        }
                                        return measureResult2.getRulers();
                                    }

                                    @Override // androidx.compose.ui.layout.MeasureResult
                                    public final int getWidth() {
                                        switch (i6) {
                                        }
                                        return measureResult2.getWidth();
                                    }

                                    @Override // androidx.compose.ui.layout.MeasureResult
                                    public final void placeChildren() {
                                        int i52 = i6;
                                        MeasureResult measureResult22 = measureResult2;
                                        int i62 = i5;
                                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState3 = layoutNodeSubcompositionsState2;
                                        switch (i52) {
                                            case 0:
                                                layoutNodeSubcompositionsState3.currentApproachIndex = i62;
                                                measureResult22.placeChildren();
                                                MutableVector mutableVector = layoutNodeSubcompositionsState3.slotIdsOfCompositionsNeededInApproach;
                                                MutableScatterMap mutableScatterMap = layoutNodeSubcompositionsState3.approachPrecomposeSlotHandleMap;
                                                long[] jArr = mutableScatterMap.metadata;
                                                int length = jArr.length - 2;
                                                if (length >= 0) {
                                                    int i7 = 0;
                                                    while (true) {
                                                        long j2 = jArr[i7];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                                                            for (int i9 = 0; i9 < i8; i9++) {
                                                                if ((255 & j2) < 128) {
                                                                    int i10 = (i7 << 3) + i9;
                                                                    Object obj3 = mutableScatterMap.keys[i10];
                                                                    SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = (SubcomposeLayoutState.PrecomposedSlotHandle) mutableScatterMap.values[i10];
                                                                    int indexOf = mutableVector.indexOf(obj3);
                                                                    if (indexOf < 0 || indexOf >= layoutNodeSubcompositionsState3.currentApproachIndex) {
                                                                        if (indexOf >= 0) {
                                                                            Object[] objArr = mutableVector.content;
                                                                            Object obj4 = objArr[indexOf];
                                                                            objArr[indexOf] = RulerKt.UnspecifiedSlotId;
                                                                        }
                                                                        if (layoutNodeSubcompositionsState3.precomposeMap.contains(obj3)) {
                                                                            precomposedSlotHandle.dispose();
                                                                        }
                                                                        mutableScatterMap.removeValueAt(i10);
                                                                    }
                                                                }
                                                                j2 >>= 8;
                                                            }
                                                            if (i8 != 8) {
                                                            }
                                                        }
                                                        if (i7 != length) {
                                                            i7++;
                                                        }
                                                    }
                                                }
                                                layoutNodeSubcompositionsState3.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState3.currentIndex);
                                                break;
                                            default:
                                                layoutNodeSubcompositionsState3.currentIndex = i62;
                                                measureResult22.placeChildren();
                                                if (layoutNodeSubcompositionsState3.root.lookaheadRoot == null) {
                                                    layoutNodeSubcompositionsState3.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState3.currentIndex);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                            }
                        });
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i3 = 2;
        this.setMeasurePolicy = new Function2(this) { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
            public final /* synthetic */ SubcomposeLayoutState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i22 = i3;
                SubcomposeLayoutState subcomposeLayoutState = this.this$0;
                switch (i22) {
                    case 0:
                        LayoutNode layoutNode = (LayoutNode) obj;
                        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy2 = subcomposeLayoutState.slotReusePolicy;
                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = layoutNode.subcompositionsState;
                        if (layoutNodeSubcompositionsState == null) {
                            layoutNodeSubcompositionsState = new LayoutNodeSubcompositionsState(layoutNode, subcomposeSlotReusePolicy2);
                            layoutNode.subcompositionsState = layoutNodeSubcompositionsState;
                        }
                        subcomposeLayoutState._state = layoutNodeSubcompositionsState;
                        subcomposeLayoutState.getState().makeSureStateIsConsistent();
                        LayoutNodeSubcompositionsState state = subcomposeLayoutState.getState();
                        if (state.slotReusePolicy != subcomposeSlotReusePolicy2) {
                            state.slotReusePolicy = subcomposeSlotReusePolicy2;
                            state.markActiveNodesAsReused(false);
                            LayoutNode.requestRemeasure$ui$default(state.root, false, 7);
                        }
                        break;
                    case 1:
                        subcomposeLayoutState.getState().compositionContext = (CompositionContext) obj2;
                        break;
                    default:
                        final Function2 function2 = (Function2) obj2;
                        final LayoutNodeSubcompositionsState state2 = subcomposeLayoutState.getState();
                        ((LayoutNode) obj).setMeasurePolicy(new LayoutNode.NoIntrinsicsMeasurePolicy(state2.NoIntrinsicsMessage) { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
                                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = LayoutNodeSubcompositionsState.this;
                                LayoutNodeSubcompositionsState.Scope scope = layoutNodeSubcompositionsState2.scope;
                                scope.layoutDirection = measureScope.getLayoutDirection();
                                scope.density = measureScope.getDensity();
                                scope.fontScale = measureScope.getFontScale();
                                boolean isLookingAhead = measureScope.isLookingAhead();
                                Function2 function22 = function2;
                                if (isLookingAhead || layoutNodeSubcompositionsState2.root.lookaheadRoot == null) {
                                    layoutNodeSubcompositionsState2.currentIndex = 0;
                                    final MeasureResult measureResult = (MeasureResult) function22.invoke(scope, new Constraints(j));
                                    final int i32 = layoutNodeSubcompositionsState2.currentIndex;
                                    final int i4 = 1;
                                    return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1
                                        @Override // androidx.compose.ui.layout.MeasureResult
                                        public final Map getAlignmentLines() {
                                            switch (i4) {
                                            }
                                            return measureResult.getAlignmentLines();
                                        }

                                        @Override // androidx.compose.ui.layout.MeasureResult
                                        public final int getHeight() {
                                            switch (i4) {
                                            }
                                            return measureResult.getHeight();
                                        }

                                        @Override // androidx.compose.ui.layout.MeasureResult
                                        public final Function1 getRulers() {
                                            switch (i4) {
                                            }
                                            return measureResult.getRulers();
                                        }

                                        @Override // androidx.compose.ui.layout.MeasureResult
                                        public final int getWidth() {
                                            switch (i4) {
                                            }
                                            return measureResult.getWidth();
                                        }

                                        @Override // androidx.compose.ui.layout.MeasureResult
                                        public final void placeChildren() {
                                            int i52 = i4;
                                            MeasureResult measureResult22 = measureResult;
                                            int i62 = i32;
                                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState3 = layoutNodeSubcompositionsState2;
                                            switch (i52) {
                                                case 0:
                                                    layoutNodeSubcompositionsState3.currentApproachIndex = i62;
                                                    measureResult22.placeChildren();
                                                    MutableVector mutableVector = layoutNodeSubcompositionsState3.slotIdsOfCompositionsNeededInApproach;
                                                    MutableScatterMap mutableScatterMap = layoutNodeSubcompositionsState3.approachPrecomposeSlotHandleMap;
                                                    long[] jArr = mutableScatterMap.metadata;
                                                    int length = jArr.length - 2;
                                                    if (length >= 0) {
                                                        int i7 = 0;
                                                        while (true) {
                                                            long j2 = jArr[i7];
                                                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i8 = 8 - ((~(i7 - length)) >>> 31);
                                                                for (int i9 = 0; i9 < i8; i9++) {
                                                                    if ((255 & j2) < 128) {
                                                                        int i10 = (i7 << 3) + i9;
                                                                        Object obj3 = mutableScatterMap.keys[i10];
                                                                        SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = (SubcomposeLayoutState.PrecomposedSlotHandle) mutableScatterMap.values[i10];
                                                                        int indexOf = mutableVector.indexOf(obj3);
                                                                        if (indexOf < 0 || indexOf >= layoutNodeSubcompositionsState3.currentApproachIndex) {
                                                                            if (indexOf >= 0) {
                                                                                Object[] objArr = mutableVector.content;
                                                                                Object obj4 = objArr[indexOf];
                                                                                objArr[indexOf] = RulerKt.UnspecifiedSlotId;
                                                                            }
                                                                            if (layoutNodeSubcompositionsState3.precomposeMap.contains(obj3)) {
                                                                                precomposedSlotHandle.dispose();
                                                                            }
                                                                            mutableScatterMap.removeValueAt(i10);
                                                                        }
                                                                    }
                                                                    j2 >>= 8;
                                                                }
                                                                if (i8 != 8) {
                                                                }
                                                            }
                                                            if (i7 != length) {
                                                                i7++;
                                                            }
                                                        }
                                                    }
                                                    layoutNodeSubcompositionsState3.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState3.currentIndex);
                                                    break;
                                                default:
                                                    layoutNodeSubcompositionsState3.currentIndex = i62;
                                                    measureResult22.placeChildren();
                                                    if (layoutNodeSubcompositionsState3.root.lookaheadRoot == null) {
                                                        layoutNodeSubcompositionsState3.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState3.currentIndex);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                }
                                layoutNodeSubcompositionsState2.currentApproachIndex = 0;
                                final MeasureResult measureResult2 = (MeasureResult) function22.invoke(layoutNodeSubcompositionsState2.approachMeasureScope, new Constraints(j));
                                final int i5 = layoutNodeSubcompositionsState2.currentApproachIndex;
                                final int i6 = 0;
                                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1
                                    @Override // androidx.compose.ui.layout.MeasureResult
                                    public final Map getAlignmentLines() {
                                        switch (i6) {
                                        }
                                        return measureResult2.getAlignmentLines();
                                    }

                                    @Override // androidx.compose.ui.layout.MeasureResult
                                    public final int getHeight() {
                                        switch (i6) {
                                        }
                                        return measureResult2.getHeight();
                                    }

                                    @Override // androidx.compose.ui.layout.MeasureResult
                                    public final Function1 getRulers() {
                                        switch (i6) {
                                        }
                                        return measureResult2.getRulers();
                                    }

                                    @Override // androidx.compose.ui.layout.MeasureResult
                                    public final int getWidth() {
                                        switch (i6) {
                                        }
                                        return measureResult2.getWidth();
                                    }

                                    @Override // androidx.compose.ui.layout.MeasureResult
                                    public final void placeChildren() {
                                        int i52 = i6;
                                        MeasureResult measureResult22 = measureResult2;
                                        int i62 = i5;
                                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState3 = layoutNodeSubcompositionsState2;
                                        switch (i52) {
                                            case 0:
                                                layoutNodeSubcompositionsState3.currentApproachIndex = i62;
                                                measureResult22.placeChildren();
                                                MutableVector mutableVector = layoutNodeSubcompositionsState3.slotIdsOfCompositionsNeededInApproach;
                                                MutableScatterMap mutableScatterMap = layoutNodeSubcompositionsState3.approachPrecomposeSlotHandleMap;
                                                long[] jArr = mutableScatterMap.metadata;
                                                int length = jArr.length - 2;
                                                if (length >= 0) {
                                                    int i7 = 0;
                                                    while (true) {
                                                        long j2 = jArr[i7];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                                                            for (int i9 = 0; i9 < i8; i9++) {
                                                                if ((255 & j2) < 128) {
                                                                    int i10 = (i7 << 3) + i9;
                                                                    Object obj3 = mutableScatterMap.keys[i10];
                                                                    SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = (SubcomposeLayoutState.PrecomposedSlotHandle) mutableScatterMap.values[i10];
                                                                    int indexOf = mutableVector.indexOf(obj3);
                                                                    if (indexOf < 0 || indexOf >= layoutNodeSubcompositionsState3.currentApproachIndex) {
                                                                        if (indexOf >= 0) {
                                                                            Object[] objArr = mutableVector.content;
                                                                            Object obj4 = objArr[indexOf];
                                                                            objArr[indexOf] = RulerKt.UnspecifiedSlotId;
                                                                        }
                                                                        if (layoutNodeSubcompositionsState3.precomposeMap.contains(obj3)) {
                                                                            precomposedSlotHandle.dispose();
                                                                        }
                                                                        mutableScatterMap.removeValueAt(i10);
                                                                    }
                                                                }
                                                                j2 >>= 8;
                                                            }
                                                            if (i8 != 8) {
                                                            }
                                                        }
                                                        if (i7 != length) {
                                                            i7++;
                                                        }
                                                    }
                                                }
                                                layoutNodeSubcompositionsState3.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState3.currentIndex);
                                                break;
                                            default:
                                                layoutNodeSubcompositionsState3.currentIndex = i62;
                                                measureResult22.placeChildren();
                                                if (layoutNodeSubcompositionsState3.root.lookaheadRoot == null) {
                                                    layoutNodeSubcompositionsState3.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState3.currentIndex);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                            }
                        });
                        break;
                }
                return Unit.INSTANCE;
            }
        };
    }

    public final LayoutNodeSubcompositionsState getState() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this._state;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        a$$ExternalSyntheticBUOutline0.m$3("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
