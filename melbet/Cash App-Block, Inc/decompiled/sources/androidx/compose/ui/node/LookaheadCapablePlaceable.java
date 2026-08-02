package androidx.compose.ui.node;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OuterPlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.layout.VerticalRuler;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import app.cash.molecule.PlatformKt;
import coil3.ImageLoader$Builder;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public abstract class LookaheadCapablePlaceable extends Placeable implements MotionReferencePlacementDelegate, MeasureScope {
    public ResettableRulerScope _rulerScope;
    public PlaceableResult cachedRulerPlaceableResult;
    public boolean isPlacedUnderMotionFrameOfReference;
    public boolean isPlacingForAlignment;
    public boolean isShallowPlacing;
    public final OuterPlacementScope placementScope = new OuterPlacementScope(this, 1);
    public MutableScatterMap rulerReaders;
    public RulerTrackingMap rulerValues;
    public Function1 rulersLambda;

    public final class ResettableRulerScope implements Density {
        public boolean coordinatesAccessed;
        public long positionOnScreen = 9223372034707292159L;
        public long size = 0;

        public ResettableRulerScope() {
        }

        @Override // androidx.compose.ui.unit.Density
        public final float getDensity() {
            return LookaheadCapablePlaceable.this.getDensity();
        }

        @Override // androidx.compose.ui.unit.Density
        public final float getFontScale() {
            return LookaheadCapablePlaceable.this.getFontScale();
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [byte[], java.io.Serializable] */
        public final void provides(VerticalRuler verticalRuler, float f) {
            LookaheadCapablePlaceable lookaheadCapablePlaceable = LookaheadCapablePlaceable.this;
            RulerTrackingMap rulerTrackingMap = lookaheadCapablePlaceable.rulerValues;
            if (rulerTrackingMap == null) {
                rulerTrackingMap = new RulerTrackingMap();
                lookaheadCapablePlaceable.rulerValues = rulerTrackingMap;
            }
            int indexOf = ArraysKt___ArraysKt.indexOf((VerticalRuler[]) rulerTrackingMap.rulers, verticalRuler);
            if (indexOf >= 0) {
                float[] fArr = (float[]) rulerTrackingMap.values;
                if (fArr[indexOf] != f) {
                    fArr[indexOf] = f;
                    ((byte[]) rulerTrackingMap.accessFlags)[indexOf] = 1;
                    return;
                } else {
                    byte[] bArr = (byte[]) rulerTrackingMap.accessFlags;
                    if (bArr[indexOf] == 2) {
                        bArr[indexOf] = 0;
                        return;
                    }
                    return;
                }
            }
            int i = rulerTrackingMap.size;
            VerticalRuler[] verticalRulerArr = (VerticalRuler[]) rulerTrackingMap.rulers;
            if (i == verticalRulerArr.length) {
                int i2 = i * 2;
                rulerTrackingMap.rulers = (VerticalRuler[]) Arrays.copyOf(verticalRulerArr, i2);
                rulerTrackingMap.values = Arrays.copyOf((float[]) rulerTrackingMap.values, i2);
                rulerTrackingMap.accessFlags = Arrays.copyOf((byte[]) rulerTrackingMap.accessFlags, i2);
            }
            ((VerticalRuler[]) rulerTrackingMap.rulers)[i] = verticalRuler;
            ((byte[]) rulerTrackingMap.accessFlags)[i] = 3;
            ((float[]) rulerTrackingMap.values)[i] = f;
            rulerTrackingMap.size++;
        }
    }

    public static void invalidateAlignmentLinesFromPositionChange(NodeCoordinator nodeCoordinator) {
        LookaheadAlignmentLines lookaheadAlignmentLines;
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.wrapped;
        LayoutNode layoutNode = nodeCoordinator.layoutNode;
        if (!Intrinsics.areEqual(nodeCoordinator2 != null ? nodeCoordinator2.layoutNode : null, layoutNode)) {
            layoutNode.layoutDelegate.measurePassDelegate.alignmentLines.onAlignmentsChanged();
            return;
        }
        AlignmentLinesOwner parentAlignmentLinesOwner = layoutNode.layoutDelegate.measurePassDelegate.getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner == null || (lookaheadAlignmentLines = ((MeasurePassDelegate) parentAlignmentLinesOwner).alignmentLines) == null) {
            return;
        }
        lookaheadAlignmentLines.onAlignmentsChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void addRulerReader(LayoutNode layoutNode, VerticalRuler verticalRuler) {
        char c;
        long j;
        long j2;
        long j3;
        MutableScatterMap mutableScatterMap;
        MutableScatterMap mutableScatterMap2;
        Object obj;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        MutableScatterMap mutableScatterMap3 = this.rulerReaders;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (mutableScatterMap3 != null) {
            Object[] objArr = mutableScatterMap3.values;
            long[] jArr3 = mutableScatterMap3.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = mutableScatterSet.elements;
                                long[] jArr4 = mutableScatterSet.metadata;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    LayoutNode layoutNode2 = (LayoutNode) ((WeakReference) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (layoutNode2 != null) {
                                                        boolean isAttached = layoutNode2.isAttached();
                                                        i4 = i8;
                                                        if (isAttached) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    mutableScatterSet.removeElementAt(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
                mutableScatterMap = this.rulerReaders;
                if (mutableScatterMap != null) {
                    long[] jArr5 = mutableScatterMap.metadata;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j11 = jArr5[i15];
                            if ((((~j11) << c) & j11 & j) != j) {
                                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j11 & j2) < j3) {
                                        int i18 = (i15 << 3) + i17;
                                        if (((MutableScatterSet) mutableScatterMap.values[i18]).isEmpty()) {
                                            mutableScatterMap.removeValueAt(i18);
                                        }
                                    }
                                    j11 >>= 8;
                                }
                                if (i16 != 8) {
                                    break;
                                }
                            }
                            if (i15 == length3) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                    }
                }
                mutableScatterMap2 = this.rulerReaders;
                if (mutableScatterMap2 == null) {
                    mutableScatterMap2 = new MutableScatterMap();
                    this.rulerReaders = mutableScatterMap2;
                }
                obj = mutableScatterMap2.get(verticalRuler);
                if (obj == null) {
                    obj = new MutableScatterSet();
                    mutableScatterMap2.set(verticalRuler, obj);
                }
                ((MutableScatterSet) obj).plusAssign(new WeakReference(layoutNode));
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 255;
        j3 = 128;
        mutableScatterMap = this.rulerReaders;
        if (mutableScatterMap != null) {
        }
        mutableScatterMap2 = this.rulerReaders;
        if (mutableScatterMap2 == null) {
        }
        obj = mutableScatterMap2.get(verticalRuler);
        if (obj == null) {
        }
        ((MutableScatterSet) obj).plusAssign(new WeakReference(layoutNode));
    }

    public abstract int calculateAlignmentLine(AlignmentLine alignmentLine);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: captureRulers-OSxE8f4, reason: not valid java name */
    public final void m878captureRulersOSxE8f4(final PlaceableResult placeableResult, final long j, final long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        LayoutNode layoutNode;
        boolean z2;
        int i;
        char c2;
        long j6;
        ImageLoader$Builder imageLoader$Builder;
        MutableScatterMap mutableScatterMap = this.rulerReaders;
        RulerTrackingMap rulerTrackingMap = this.rulerValues;
        if (rulerTrackingMap == null) {
            rulerTrackingMap = new RulerTrackingMap();
            this.rulerValues = rulerTrackingMap;
        }
        RulerTrackingMap rulerTrackingMap2 = rulerTrackingMap;
        Owner owner = getLayoutNode().owner;
        if (owner != null && (imageLoader$Builder = ((AndroidComposeView) owner).snapshotObserver) != null) {
            ((SnapshotStateObserver) imageLoader$Builder.application).observeReads(placeableResult, OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE$2, new Function0() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$captureRulers$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    LookaheadCapablePlaceable lookaheadCapablePlaceable = LookaheadCapablePlaceable.this;
                    lookaheadCapablePlaceable.getRulerScope().coordinatesAccessed = false;
                    lookaheadCapablePlaceable.getRulerScope().positionOnScreen = j;
                    lookaheadCapablePlaceable.getRulerScope().size = j2;
                    Function1 rulers = placeableResult.result.getRulers();
                    if (rulers != null) {
                        rulers.invoke(lookaheadCapablePlaceable.getRulerScope());
                    }
                    return Unit.INSTANCE;
                }
            });
        }
        boolean isLookingAhead = isLookingAhead();
        MutableScatterSet mutableScatterSet = (MutableScatterSet) rulerTrackingMap2.layoutNodes;
        MutableScatterSet mutableScatterSet2 = (MutableScatterSet) rulerTrackingMap2.newRulers;
        int i2 = rulerTrackingMap2.size;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) rulerTrackingMap2.accessFlags)[i3];
            if (b == 3) {
                VerticalRuler verticalRuler = ((VerticalRuler[]) rulerTrackingMap2.rulers)[i3];
                verticalRuler.getClass();
                mutableScatterSet2.plusAssign(verticalRuler);
            } else if (b != 0 && mutableScatterMap != null) {
                VerticalRuler verticalRuler2 = ((VerticalRuler[]) rulerTrackingMap2.rulers)[i3];
                verticalRuler2.getClass();
                MutableScatterSet mutableScatterSet3 = (MutableScatterSet) mutableScatterMap.remove(verticalRuler2);
                if (mutableScatterSet3 != null) {
                    mutableScatterSet.plusAssign(mutableScatterSet3);
                }
            }
        }
        int i4 = rulerTrackingMap2.size;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) rulerTrackingMap2.accessFlags;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                VerticalRuler[] verticalRulerArr = (VerticalRuler[]) rulerTrackingMap2.rulers;
                verticalRulerArr[i6 - i5] = verticalRulerArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = rulerTrackingMap2.size;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((VerticalRuler[]) rulerTrackingMap2.rulers)[i8] = null;
        }
        rulerTrackingMap2.size -= i5;
        LookaheadCapablePlaceable parent = getParent();
        Object[] objArr = mutableScatterSet2.elements;
        long[] jArr = mutableScatterSet2.metadata;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            VerticalRuler verticalRuler3 = (VerticalRuler) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            LookaheadCapablePlaceable lookaheadCapablePlaceable = parent == null ? this : parent;
                            i = i9;
                            LookaheadCapablePlaceable lookaheadCapablePlaceable2 = lookaheadCapablePlaceable;
                            while (true) {
                                RulerTrackingMap rulerTrackingMap3 = lookaheadCapablePlaceable2.rulerValues;
                                if (rulerTrackingMap3 != null) {
                                    z2 = isLookingAhead;
                                    if (ArraysKt___ArraysKt.contains((VerticalRuler[]) rulerTrackingMap3.rulers, verticalRuler3)) {
                                        break;
                                    }
                                } else {
                                    z2 = isLookingAhead;
                                }
                                LookaheadCapablePlaceable parent2 = lookaheadCapablePlaceable2.getParent();
                                if (parent2 == null) {
                                    break;
                                }
                                lookaheadCapablePlaceable2 = parent2;
                                isLookingAhead = z2;
                            }
                            MutableScatterMap mutableScatterMap2 = lookaheadCapablePlaceable2.rulerReaders;
                            MutableScatterSet mutableScatterSet4 = mutableScatterMap2 != null ? (MutableScatterSet) mutableScatterMap2.remove(verticalRuler3) : null;
                            if (mutableScatterSet4 != null) {
                                lookaheadCapablePlaceable.notifyRulerValueChange(mutableScatterSet4);
                            }
                        } else {
                            z2 = isLookingAhead;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        isLookingAhead = z2;
                    }
                    z = isLookingAhead;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = isLookingAhead;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                isLookingAhead = z;
                i9 = 8;
            }
        } else {
            z = isLookingAhead;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        mutableScatterSet2.clear();
        Object[] objArr2 = mutableScatterSet.elements;
        long[] jArr2 = mutableScatterSet.metadata;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (layoutNode = (LayoutNode) ((WeakReference) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                layoutNode.requestLookaheadRelayout$ui(false);
                            } else {
                                layoutNode.requestRelayout$ui(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        mutableScatterSet.clear();
    }

    public final void captureRulersIfNeeded$ui(MeasureResult measureResult) {
        long j;
        long j2;
        MutableScatterMap mutableScatterMap = this.rulerReaders;
        if (this.isPlacingForAlignment) {
            return;
        }
        Function1 rulers = measureResult.getRulers();
        if (rulers != null) {
            boolean z = this.rulersLambda != rulers;
            if (z || !getRulerScope().coordinatesAccessed) {
                j = 0;
                j2 = 9223372034707292159L;
            } else {
                LayoutCoordinates coordinates = getCoordinates();
                long m1344roundk4lQ0M = PlatformKt.m1344roundk4lQ0M(coordinates.mo842localToScreenMKHz9U(0L));
                long mo838getSizeYbymL2g = coordinates.mo838getSizeYbymL2g();
                j2 = m1344roundk4lQ0M;
                j = mo838getSizeYbymL2g;
                z = (IntOffset.m1047equalsimpl0(m1344roundk4lQ0M, getRulerScope().positionOnScreen) && IntSize.m1055equalsimpl0(mo838getSizeYbymL2g, getRulerScope().size)) ? false : true;
            }
            if (z) {
                PlaceableResult placeableResult = this.cachedRulerPlaceableResult;
                if (placeableResult != null) {
                    placeableResult.result = measureResult;
                } else {
                    placeableResult = new PlaceableResult(measureResult, this);
                    this.cachedRulerPlaceableResult = placeableResult;
                }
                m878captureRulersOSxE8f4(placeableResult, j2, j);
                this.rulersLambda = measureResult.getRulers();
                return;
            }
            return;
        }
        if (mutableScatterMap != null) {
            Object[] objArr = mutableScatterMap.values;
            long[] jArr = mutableScatterMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j3) < 128) {
                                notifyRulerValueChange((MutableScatterSet) objArr[(i << 3) + i3]);
                            }
                            j3 >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            mutableScatterMap.clear();
        }
    }

    @Override // androidx.compose.ui.layout.Placeable
    public final int get(AlignmentLine alignmentLine) {
        int calculateAlignmentLine;
        if (!getHasMeasureResult() || (calculateAlignmentLine = calculateAlignmentLine(alignmentLine)) == Integer.MIN_VALUE) {
            return PKIFailureInfo.systemUnavail;
        }
        boolean z = alignmentLine instanceof VerticalAlignmentLine;
        long j = this.apparentToRealOffset;
        return calculateAlignmentLine + ((int) (z ? j >> 32 : BodyPartID.bodyIdMax & j));
    }

    public abstract LookaheadCapablePlaceable getChild();

    public abstract LayoutCoordinates getCoordinates();

    public abstract boolean getHasMeasureResult();

    public abstract LayoutNode getLayoutNode();

    public abstract MeasureResult getMeasureResult$ui();

    public abstract LookaheadCapablePlaceable getParent();

    /* renamed from: getPosition-nOcc-ac, reason: not valid java name */
    public abstract long mo879getPositionnOccac();

    public final ResettableRulerScope getRulerScope() {
        ResettableRulerScope resettableRulerScope = this._rulerScope;
        if (resettableRulerScope != null) {
            return resettableRulerScope;
        }
        ResettableRulerScope resettableRulerScope2 = new ResettableRulerScope();
        this._rulerScope = resettableRulerScope2;
        return resettableRulerScope2;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult layout(final int i, final int i2, final Map map, final Function1 function1, final Function1 function12) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$layout$1
            @Override // androidx.compose.ui.layout.MeasureResult
            public final Map getAlignmentLines() {
                return map;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final int getHeight() {
                return i2;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final Function1 getRulers() {
                return function1;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final int getWidth() {
                return i;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final void placeChildren() {
                function12.invoke(this.placementScope);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void notifyRulerValueChange(MutableScatterSet mutableScatterSet) {
        LayoutNode layoutNode;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (layoutNode = (LayoutNode) ((WeakReference) objArr[(i << 3) + i3]).get()) != null) {
                        if (isLookingAhead()) {
                            layoutNode.requestLookaheadRelayout$ui(false);
                        } else {
                            layoutNode.requestRelayout$ui(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void replace$ui();

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public final void updatePlacedUnderMotionFrameOfReference(boolean z) {
        LookaheadCapablePlaceable parent = getParent();
        LayoutNode layoutNode = parent != null ? parent.getLayoutNode() : null;
        if (Intrinsics.areEqual(layoutNode, getLayoutNode())) {
            this.isPlacedUnderMotionFrameOfReference = z;
            return;
        }
        if ((layoutNode != null ? layoutNode.layoutDelegate.layoutState : null) != LayoutNode.LayoutState.LayingOut) {
            if ((layoutNode != null ? layoutNode.layoutDelegate.layoutState : null) != LayoutNode.LayoutState.LookaheadLayingOut) {
                return;
            }
        }
        this.isPlacedUnderMotionFrameOfReference = z;
    }
}
