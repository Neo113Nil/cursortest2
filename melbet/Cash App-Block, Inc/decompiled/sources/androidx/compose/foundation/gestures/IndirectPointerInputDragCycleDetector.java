package androidx.compose.foundation.gestures;

import androidx.biometric.BiometricPrompt;
import androidx.collection.MutableLongList;
import androidx.collection.MutableObjectList;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.VelocityKt;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.paging.CachedPagingDataKt$cachedIn$5;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import okhttp3.internal.http1.HeadersReader;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes3.dex */
public final class IndirectPointerInputDragCycleDetector {
    public IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown _awaitDownState;
    public IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup _awaitGesturePickupState;
    public IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop _awaitTouchSlopState;
    public IndirectPointerInputDragCycleDetector$DragDetectionState$Dragging _draggingState;
    public Draggable2DKt currentDragState;
    public final DragGestureNode node;
    public long nodeOffset;
    public final Sniffer offsetSmoother;
    public long previousPositionOnScreen = 9205357640488583168L;
    public HeadersReader touchSlopDetector;
    public final Sniffer touchSmooth;
    public BiometricPrompt velocityTracker;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.AwaitTouchSlop.values().length];
            try {
                IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.AwaitTouchSlop awaitTouchSlop = IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.AwaitTouchSlop.Yes;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IndirectPointerInputDragCycleDetector(DragGestureNode dragGestureNode) {
        this.node = dragGestureNode;
        Sniffer sniffer = new Sniffer((byte) 0, 2, (boolean) (0 == true ? 1 : 0));
        sniffer.scratch = new MutableObjectList();
        this.touchSmooth = sniffer;
        Sniffer sniffer2 = new Sniffer((byte) (0 == true ? 1 : 0), 3, (boolean) (0 == true ? 1 : 0));
        sniffer2.scratch = new MutableLongList();
        this.offsetSmoother = sniffer2;
        this.nodeOffset = 0L;
    }

    /* renamed from: moveToAwaitTouchSlopState-aWI9W7U$default, reason: not valid java name */
    public static void m223moveToAwaitTouchSlopStateaWI9W7U$default(IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector, IndirectPointerInputChange indirectPointerInputChange, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        DragGestureNode dragGestureNode = indirectPointerInputDragCycleDetector.node;
        IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop = indirectPointerInputDragCycleDetector._awaitTouchSlopState;
        if (indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop == null) {
            indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop = new IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop();
            indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop.initialDown = null;
            indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop.pointerId = Long.MAX_VALUE;
            indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop.verifyConsumptionInFinalPass = false;
            indirectPointerInputDragCycleDetector._awaitTouchSlopState = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop;
        }
        indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop.initialDown = indirectPointerInputChange;
        indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop.pointerId = j;
        HeadersReader headersReader = indirectPointerInputDragCycleDetector.touchSlopDetector;
        Orientation orientation = dragGestureNode.orientationLock;
        if (headersReader == null) {
            indirectPointerInputDragCycleDetector.touchSlopDetector = new HeadersReader(orientation, 2);
        } else {
            headersReader.source = orientation;
            headersReader.headerLimit = j2;
        }
        indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop.verifyConsumptionInFinalPass = false;
        indirectPointerInputDragCycleDetector.currentDragState = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop;
    }

    public final void moveToAwaitDownState() {
        IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown = this._awaitDownState;
        if (indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown == null) {
            IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.AwaitTouchSlop awaitTouchSlop = IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.AwaitTouchSlop.NotInitialized;
            indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown = new IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown();
            indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.awaitTouchSlop = awaitTouchSlop;
            indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.consumedOnInitial = false;
            this._awaitDownState = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;
        }
        indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.awaitTouchSlop = IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.AwaitTouchSlop.NotInitialized;
        indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.consumedOnInitial = false;
        this.currentDragState = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;
    }

    /* renamed from: moveToAwaitGesturePickupState-rnUCldI, reason: not valid java name */
    public final void m224moveToAwaitGesturePickupStaternUCldI(IndirectPointerInputChange indirectPointerInputChange, long j, HeadersReader headersReader) {
        IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup indirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup = this._awaitGesturePickupState;
        if (indirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup == null) {
            indirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup = new IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup();
            indirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup.initialDown = null;
            indirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup.pointerId = Long.MAX_VALUE;
            this._awaitGesturePickupState = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup;
        }
        indirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup.initialDown = indirectPointerInputChange;
        indirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup.pointerId = j;
        headersReader.headerLimit = 0L;
        this.currentDragState = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    public final void processIndirectPointerInputEvent(HuffmanTreeGroup huffmanTreeGroup, PointerEventPass pointerEventPass) {
        IndirectPointerInputChange indirectPointerInputChange;
        Object obj;
        IndirectPointerInputChange indirectPointerInputChange2;
        int i = huffmanTreeGroup.alphabetSize;
        ArrayList arrayList = (ArrayList) huffmanTreeGroup.codes;
        if (this.currentDragState == null) {
            IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown = this._awaitDownState;
            if (indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown == null) {
                IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.AwaitTouchSlop awaitTouchSlop = IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.AwaitTouchSlop.NotInitialized;
                indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown = new IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown();
                indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.awaitTouchSlop = awaitTouchSlop;
                indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.consumedOnInitial = false;
                this._awaitDownState = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;
            }
            this.currentDragState = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;
        }
        Draggable2DKt draggable2DKt = this.currentDragState;
        if (draggable2DKt == null) {
            a$$ExternalSyntheticBUOutline0.m$3("currentDragState should not be null");
            return;
        }
        boolean z = draggable2DKt instanceof IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;
        DragGestureNode dragGestureNode = this.node;
        boolean z2 = true;
        if (z) {
            IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown2 = (IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown) draggable2DKt;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!Draggable2DKt.changedToDownIgnoreConsumed((IndirectPointerInputChange) arrayList.get(i2))) {
                    return;
                }
            }
            IndirectPointerInputChange indirectPointerInputChange3 = (IndirectPointerInputChange) CollectionsKt.first((List) arrayList);
            IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.AwaitTouchSlop awaitTouchSlop2 = WhenMappings.$EnumSwitchMapping$0[indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown2.awaitTouchSlop.ordinal()] == 1 ? !dragGestureNode.startDragImmediately() ? IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.AwaitTouchSlop.Yes : IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.AwaitTouchSlop.No : indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown2.awaitTouchSlop;
            indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown2.awaitTouchSlop = awaitTouchSlop2;
            if (pointerEventPass == PointerEventPass.Initial && awaitTouchSlop2 == IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.AwaitTouchSlop.No) {
                indirectPointerInputChange3.isConsumed = true;
                indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown2.consumedOnInitial = true;
            }
            if (pointerEventPass == PointerEventPass.Main) {
                if (awaitTouchSlop2 == IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.AwaitTouchSlop.Yes) {
                    m223moveToAwaitTouchSlopStateaWI9W7U$default(this, indirectPointerInputChange3, indirectPointerInputChange3.id, 0L, 12);
                    return;
                }
                if (indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown2.consumedOnInitial) {
                    m226sendDragStart3f7A7Is(indirectPointerInputChange3, indirectPointerInputChange3, new IndirectPointerEventPrimaryDirectionalMotionAxis(i), 0L);
                    m225sendDragEventEu1f8Dk(indirectPointerInputChange3, new IndirectPointerEventPrimaryDirectionalMotionAxis(i), 0L);
                    long j = indirectPointerInputChange3.id;
                    IndirectPointerInputDragCycleDetector$DragDetectionState$Dragging indirectPointerInputDragCycleDetector$DragDetectionState$Dragging = this._draggingState;
                    if (indirectPointerInputDragCycleDetector$DragDetectionState$Dragging == null) {
                        indirectPointerInputDragCycleDetector$DragDetectionState$Dragging = new IndirectPointerInputDragCycleDetector$DragDetectionState$Dragging();
                        indirectPointerInputDragCycleDetector$DragDetectionState$Dragging.pointerId = Long.MAX_VALUE;
                        this._draggingState = indirectPointerInputDragCycleDetector$DragDetectionState$Dragging;
                    }
                    indirectPointerInputDragCycleDetector$DragDetectionState$Dragging.pointerId = j;
                    this.currentDragState = indirectPointerInputDragCycleDetector$DragDetectionState$Dragging;
                    return;
                }
                return;
            }
            return;
        }
        IndirectPointerInputChange indirectPointerInputChange4 = null;
        if (!(draggable2DKt instanceof IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop)) {
            if (draggable2DKt instanceof IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup) {
                IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup indirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup = (IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup) draggable2DKt;
                if (pointerEventPass != PointerEventPass.Final) {
                    return;
                }
                int size2 = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    if (((IndirectPointerInputChange) arrayList.get(i3)).isConsumed) {
                        z2 = false;
                        break;
                    }
                    i3++;
                }
                int size3 = arrayList.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        break;
                    }
                    if (!((IndirectPointerInputChange) arrayList.get(i4)).pressed) {
                        i4++;
                    } else if (!arrayList.isEmpty()) {
                        if (z2) {
                            long m221primaryAxisPosition_bfSUIo = Draggable2DKt.m221primaryAxisPosition_bfSUIo((IndirectPointerInputChange) CollectionsKt.first((List) arrayList), dragGestureNode.orientationLock, new IndirectPointerEventPrimaryDirectionalMotionAxis(i));
                            IndirectPointerInputChange indirectPointerInputChange5 = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup.initialDown;
                            indirectPointerInputChange5.getClass();
                            long m625minusMKHz9U = Offset.m625minusMKHz9U(m221primaryAxisPosition_bfSUIo, Draggable2DKt.m221primaryAxisPosition_bfSUIo(indirectPointerInputChange5, dragGestureNode.orientationLock, new IndirectPointerEventPrimaryDirectionalMotionAxis(i)));
                            IndirectPointerInputChange indirectPointerInputChange6 = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup.initialDown;
                            if (indirectPointerInputChange6 != null) {
                                m223moveToAwaitTouchSlopStateaWI9W7U$default(this, indirectPointerInputChange6, indirectPointerInputDragCycleDetector$DragDetectionState$AwaitGesturePickup.pointerId, m625minusMKHz9U, 8);
                                return;
                            } else {
                                a$$ExternalSyntheticBUOutline0.m$3("AwaitGesturePickup.initialDown was not initialized.");
                                return;
                            }
                        }
                        return;
                    }
                }
                moveToAwaitDownState();
                return;
            }
            if (!(draggable2DKt instanceof IndirectPointerInputDragCycleDetector$DragDetectionState$Dragging)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            IndirectPointerInputDragCycleDetector$DragDetectionState$Dragging indirectPointerInputDragCycleDetector$DragDetectionState$Dragging2 = (IndirectPointerInputDragCycleDetector$DragDetectionState$Dragging) draggable2DKt;
            if (pointerEventPass != PointerEventPass.Main) {
                return;
            }
            long j2 = indirectPointerInputDragCycleDetector$DragDetectionState$Dragging2.pointerId;
            int size4 = arrayList.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size4) {
                    indirectPointerInputChange = 0;
                    break;
                }
                indirectPointerInputChange = arrayList.get(i5);
                if (PointerId.m812equalsimpl0(((IndirectPointerInputChange) indirectPointerInputChange).id, j2)) {
                    break;
                } else {
                    i5++;
                }
            }
            IndirectPointerInputChange indirectPointerInputChange7 = indirectPointerInputChange;
            if (indirectPointerInputChange7 == null) {
                return;
            }
            boolean access$changedToUpIgnoreConsumed = Draggable2DKt.access$changedToUpIgnoreConsumed(indirectPointerInputChange7);
            DragEvent.DragCancelled dragCancelled = DragEvent.DragCancelled.INSTANCE;
            if (!access$changedToUpIgnoreConsumed) {
                if (indirectPointerInputChange7.isConsumed) {
                    dragGestureNode.onDragEvent(dragCancelled);
                    return;
                } else {
                    if (Offset.m623getDistanceimpl(Draggable2DKt.m220positionChangeInternalwfG_k4k(indirectPointerInputChange7, dragGestureNode.orientationLock, new IndirectPointerEventPrimaryDirectionalMotionAxis(i), true)) == RecyclerView.DECELERATION_RATE) {
                        return;
                    }
                    m225sendDragEventEu1f8Dk(indirectPointerInputChange7, new IndirectPointerEventPrimaryDirectionalMotionAxis(i), Draggable2DKt.m220positionChangeInternalwfG_k4k(indirectPointerInputChange7, dragGestureNode.orientationLock, new IndirectPointerEventPrimaryDirectionalMotionAxis(i), false));
                    indirectPointerInputChange7.isConsumed = true;
                    return;
                }
            }
            int size5 = arrayList.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    break;
                }
                ?? r9 = arrayList.get(i6);
                if (((IndirectPointerInputChange) r9).pressed) {
                    indirectPointerInputChange4 = r9;
                    break;
                }
                i6++;
            }
            IndirectPointerInputChange indirectPointerInputChange8 = indirectPointerInputChange4;
            if (indirectPointerInputChange8 != null) {
                indirectPointerInputDragCycleDetector$DragDetectionState$Dragging2.pointerId = indirectPointerInputChange8.id;
                return;
            }
            if (indirectPointerInputChange7.isConsumed || !Draggable2DKt.access$changedToUpIgnoreConsumed(indirectPointerInputChange7)) {
                dragGestureNode.onDragEvent(dragCancelled);
            } else {
                Draggable2DKt.m218access$addIndirectPointerInputChangeQf4Zb88(requireVelocityTracker(), indirectPointerInputChange7, dragGestureNode.orientationLock, new IndirectPointerEventPrimaryDirectionalMotionAxis(i), this.touchSmooth, this.nodeOffset);
                float maximumFlingVelocity = ((ViewConfiguration) DepthSortedSetKt.currentValueOf(dragGestureNode, CompositionLocalsKt.LocalViewConfiguration)).getMaximumFlingVelocity();
                long m11calculateVelocityAH228Gc = requireVelocityTracker().m11calculateVelocityAH228Gc(VelocityKt.Velocity(maximumFlingVelocity, maximumFlingVelocity));
                requireVelocityTracker().resetTracking();
                dragGestureNode.onDragEvent(new DragEvent.DragStopped(DraggableKt.m222toValidVelocityTH1AsA0(m11calculateVelocityAH228Gc), true));
            }
            moveToAwaitDownState();
            return;
        }
        IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop = (IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop) draggable2DKt;
        if (pointerEventPass == PointerEventPass.Initial) {
            return;
        }
        int size6 = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size6) {
                obj = null;
                break;
            }
            obj = arrayList.get(i7);
            if (PointerId.m812equalsimpl0(((IndirectPointerInputChange) obj).id, indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop.pointerId)) {
                break;
            } else {
                i7++;
            }
        }
        IndirectPointerInputChange indirectPointerInputChange9 = (IndirectPointerInputChange) obj;
        if (indirectPointerInputChange9 == null) {
            int size7 = arrayList.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size7) {
                    indirectPointerInputChange2 = 0;
                    break;
                }
                indirectPointerInputChange2 = arrayList.get(i8);
                if (((IndirectPointerInputChange) indirectPointerInputChange2).pressed) {
                    break;
                } else {
                    i8++;
                }
            }
            indirectPointerInputChange9 = indirectPointerInputChange2;
            if (indirectPointerInputChange9 == null) {
                moveToAwaitDownState();
                return;
            }
            indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop.pointerId = indirectPointerInputChange9.id;
        }
        IndirectPointerInputChange indirectPointerInputChange10 = indirectPointerInputChange9;
        if (pointerEventPass == PointerEventPass.Main) {
            if (indirectPointerInputChange10.isConsumed) {
                IndirectPointerInputChange indirectPointerInputChange11 = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop.initialDown;
                if (indirectPointerInputChange11 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j3 = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop.pointerId;
                HeadersReader headersReader = this.touchSlopDetector;
                if (headersReader == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("AwaitTouchSlop.touchSlopDetector was not initialized");
                    return;
                }
                m224moveToAwaitGesturePickupStaternUCldI(indirectPointerInputChange11, j3, headersReader);
            } else if (Draggable2DKt.access$changedToUpIgnoreConsumed(indirectPointerInputChange10)) {
                int size8 = arrayList.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size8) {
                        break;
                    }
                    ?? r5 = arrayList.get(i9);
                    if (((IndirectPointerInputChange) r5).pressed) {
                        indirectPointerInputChange4 = r5;
                        break;
                    }
                    i9++;
                }
                IndirectPointerInputChange indirectPointerInputChange12 = indirectPointerInputChange4;
                if (indirectPointerInputChange12 == null) {
                    moveToAwaitDownState();
                } else {
                    indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop.pointerId = indirectPointerInputChange12.id;
                }
            } else {
                ViewConfiguration viewConfiguration = (ViewConfiguration) DepthSortedSetKt.currentValueOf(dragGestureNode, CompositionLocalsKt.LocalViewConfiguration);
                float f = DragGestureDetectorKt.mouseToTouchSlopRatio;
                float touchSlop = viewConfiguration.getTouchSlop();
                HeadersReader headersReader2 = this.touchSlopDetector;
                if (headersReader2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Touch slop detector not initialized.");
                    return;
                }
                long m4323getPostSlopOffsetqto3Fdw = headersReader2.m4323getPostSlopOffsetqto3Fdw(touchSlop, Draggable2DKt.m220positionChangeInternalwfG_k4k(indirectPointerInputChange10, dragGestureNode.orientationLock, new IndirectPointerEventPrimaryDirectionalMotionAxis(i), true), true);
                if ((9223372034707292159L & m4323getPostSlopOffsetqto3Fdw) != 9205357640488583168L) {
                    indirectPointerInputChange10.isConsumed = true;
                    IndirectPointerInputChange indirectPointerInputChange13 = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop.initialDown;
                    indirectPointerInputChange13.getClass();
                    m226sendDragStart3f7A7Is(indirectPointerInputChange13, indirectPointerInputChange10, new IndirectPointerEventPrimaryDirectionalMotionAxis(i), m4323getPostSlopOffsetqto3Fdw);
                    m225sendDragEventEu1f8Dk(indirectPointerInputChange10, new IndirectPointerEventPrimaryDirectionalMotionAxis(i), m4323getPostSlopOffsetqto3Fdw);
                    long j4 = indirectPointerInputChange10.id;
                    IndirectPointerInputDragCycleDetector$DragDetectionState$Dragging indirectPointerInputDragCycleDetector$DragDetectionState$Dragging3 = this._draggingState;
                    if (indirectPointerInputDragCycleDetector$DragDetectionState$Dragging3 == null) {
                        indirectPointerInputDragCycleDetector$DragDetectionState$Dragging3 = new IndirectPointerInputDragCycleDetector$DragDetectionState$Dragging();
                        indirectPointerInputDragCycleDetector$DragDetectionState$Dragging3.pointerId = Long.MAX_VALUE;
                        this._draggingState = indirectPointerInputDragCycleDetector$DragDetectionState$Dragging3;
                    }
                    indirectPointerInputDragCycleDetector$DragDetectionState$Dragging3.pointerId = j4;
                    this.currentDragState = indirectPointerInputDragCycleDetector$DragDetectionState$Dragging3;
                } else {
                    indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop.verifyConsumptionInFinalPass = true;
                }
            }
        }
        if (pointerEventPass == PointerEventPass.Final && indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop.verifyConsumptionInFinalPass) {
            if (!indirectPointerInputChange10.isConsumed) {
                indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop.verifyConsumptionInFinalPass = false;
                return;
            }
            IndirectPointerInputChange indirectPointerInputChange14 = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop.initialDown;
            if (indirectPointerInputChange14 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("AwaitTouchSlop.initialDown was not initialized");
                return;
            }
            long j5 = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitTouchSlop.pointerId;
            HeadersReader headersReader3 = this.touchSlopDetector;
            if (headersReader3 != null) {
                m224moveToAwaitGesturePickupStaternUCldI(indirectPointerInputChange14, j5, headersReader3);
            } else {
                a$$ExternalSyntheticBUOutline0.m$3("AwaitTouchSlop.touchSlopDetector was not initialized");
            }
        }
    }

    public final BiometricPrompt requireVelocityTracker() {
        BiometricPrompt biometricPrompt = this.velocityTracker;
        if (biometricPrompt != null) {
            return biometricPrompt;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Velocity Tracker not initialized.");
        return null;
    }

    public final void resetDragDetectionState() {
        moveToAwaitDownState();
        DragGestureNode dragGestureNode = this.node;
        if (dragGestureNode.isListeningForEvents) {
            dragGestureNode.onDragEvent(DragEvent.DragCancelled.INSTANCE);
        }
        this.velocityTracker = null;
        Sniffer sniffer = this.offsetSmoother;
        sniffer.peekLength = 0;
        ((MutableLongList) sniffer.scratch)._size = 0;
    }

    /* renamed from: sendDragEvent-Eu1f8Dk, reason: not valid java name */
    public final void m225sendDragEventEu1f8Dk(IndirectPointerInputChange indirectPointerInputChange, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, long j) {
        DragGestureNode dragGestureNode = this.node;
        long mo842localToScreenMKHz9U = DepthSortedSetKt.requireLayoutCoordinates(dragGestureNode).mo842localToScreenMKHz9U(0L);
        if (!Offset.m622equalsimpl0(this.previousPositionOnScreen, 9205357640488583168L) && !Offset.m622equalsimpl0(mo842localToScreenMKHz9U, this.previousPositionOnScreen)) {
            this.nodeOffset = Offset.m626plusMKHz9U(this.nodeOffset, Offset.m625minusMKHz9U(mo842localToScreenMKHz9U, this.previousPositionOnScreen));
        }
        this.previousPositionOnScreen = mo842localToScreenMKHz9U;
        Orientation orientation = dragGestureNode.orientationLock;
        orientation.getClass();
        CachedPagingDataKt$cachedIn$5 cachedPagingDataKt$cachedIn$5 = DraggableKt.NoOpOnDragStarted;
        if (Math.abs(Float.intBitsToFloat((int) (orientation == Orientation.Vertical ? j & BodyPartID.bodyIdMax : j >> 32))) > 2.0f) {
            Draggable2DKt.m218access$addIndirectPointerInputChangeQf4Zb88(requireVelocityTracker(), indirectPointerInputChange, dragGestureNode.orientationLock, indirectPointerEventPrimaryDirectionalMotionAxis, this.touchSmooth, this.nodeOffset);
            Sniffer sniffer = this.offsetSmoother;
            MutableLongList mutableLongList = (MutableLongList) sniffer.scratch;
            int i = mutableLongList._size;
            if (i == 3) {
                int i2 = sniffer.peekLength;
                sniffer.peekLength = i2 + 1;
                if (i2 < 0 || i2 >= i) {
                    Path$$ExternalSyntheticBUOutline0.m("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = mutableLongList.content;
                    long j2 = jArr[i2];
                    jArr[i2] = j;
                }
            } else {
                mutableLongList.add(j);
            }
            if (sniffer.peekLength == 3) {
                sniffer.peekLength = 0;
            }
            long[] jArr2 = mutableLongList.content;
            int i3 = mutableLongList._size;
            float f = RecyclerView.DECELERATION_RATE;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                f2 += Float.intBitsToFloat((int) (jArr2[i4] >> 32));
            }
            int i5 = mutableLongList._size;
            float f3 = f2 / i5;
            long[] jArr3 = mutableLongList.content;
            for (int i6 = 0; i6 < i5; i6++) {
                f += Float.intBitsToFloat((int) (jArr3[i6] & BodyPartID.bodyIdMax));
            }
            dragGestureNode.onDragEvent(new DragEvent.DragDelta((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f / mutableLongList._size) & BodyPartID.bodyIdMax), true));
        }
    }

    /* renamed from: sendDragStart-3f7A7Is, reason: not valid java name */
    public final void m226sendDragStart3f7A7Is(IndirectPointerInputChange indirectPointerInputChange, IndirectPointerInputChange indirectPointerInputChange2, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, long j) {
        if (this.velocityTracker == null) {
            this.velocityTracker = new BiometricPrompt(20);
        }
        this.nodeOffset = 0L;
        BiometricPrompt requireVelocityTracker = requireVelocityTracker();
        DragGestureNode dragGestureNode = this.node;
        Draggable2DKt.m218access$addIndirectPointerInputChangeQf4Zb88(requireVelocityTracker, indirectPointerInputChange, dragGestureNode.orientationLock, indirectPointerEventPrimaryDirectionalMotionAxis, this.touchSmooth, this.nodeOffset);
        long m625minusMKHz9U = Offset.m625minusMKHz9U(Draggable2DKt.m221primaryAxisPosition_bfSUIo(indirectPointerInputChange2, dragGestureNode.orientationLock, indirectPointerEventPrimaryDirectionalMotionAxis), j);
        if (((Boolean) dragGestureNode.canDrag.invoke(new PointerType(1))).booleanValue()) {
            this.previousPositionOnScreen = DepthSortedSetKt.requireLayoutCoordinates(dragGestureNode).mo842localToScreenMKHz9U(0L);
            dragGestureNode.onDragEvent(new DragEvent.DragStarted(m625minusMKHz9U));
        }
        Sniffer sniffer = this.offsetSmoother;
        sniffer.peekLength = 0;
        ((MutableLongList) sniffer.scratch)._size = 0;
    }
}
