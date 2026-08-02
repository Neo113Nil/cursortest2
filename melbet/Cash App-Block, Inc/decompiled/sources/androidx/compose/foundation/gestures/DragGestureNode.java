package androidx.compose.foundation.gestures;

import androidx.biometric.BiometricPrompt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.GestureConnection;
import androidx.compose.foundation.GestureNode;
import androidx.compose.foundation.gestures.DragDetectionState$AwaitDown;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction$Cancel;
import androidx.compose.foundation.interaction.DragInteraction$Start;
import androidx.compose.foundation.interaction.DragInteraction$Stop;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.VelocityKt;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.Channel;
import okhttp3.internal.http1.HeadersReader;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.brotli.dec.HuffmanTreeGroup;
import papa.PapaEvent;
import papa.SafeTrace;

/* loaded from: classes.dex */
public abstract class DragGestureNode extends DelegatingNode implements PointerInputModifierNode, IndirectPointerInputModifierNode, CompositionLocalConsumerModifierNode, GestureConnection {
    public DragDetectionState$AwaitDown _awaitDownState;
    public DragDetectionState$AwaitGesturePickup _awaitGesturePickupState;
    public DragDetectionState$AwaitTouchSlop _awaitTouchSlopState;
    public DragDetectionState$Dragging _draggingState;
    public Function1 canDrag;
    public BufferedChannel channel;
    public Draggable2DKt currentDragState;
    public DragInteraction$Start dragInteraction;
    public boolean enabled;
    public GestureNode gestureNode;
    public IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector;
    public MutableInteractionSourceImpl interactionSource;
    public boolean isListeningForEvents;
    public boolean isListeningForPointerInputEvents;
    public Orientation orientationLock;
    public HeadersReader touchSlopDetector;
    public BiometricPrompt velocityTracker;
    public long previousPositionOnScreen = 9205357640488583168L;
    public long nodeOffset = 0;

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DragDetectionState$AwaitDown.AwaitTouchSlop.values().length];
            try {
                DragDetectionState$AwaitDown.AwaitTouchSlop awaitTouchSlop = DragDetectionState$AwaitDown.AwaitTouchSlop.Yes;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DragGestureNode(Function1 function1, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, Orientation orientation) {
        this.orientationLock = orientation;
        this.canDrag = function1;
        this.enabled = z;
        this.interactionSource = mutableInteractionSourceImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$processDragCancel(DragGestureNode dragGestureNode, ContinuationImpl continuationImpl) {
        DragGestureNode$processDragCancel$1 dragGestureNode$processDragCancel$1;
        int i;
        if (continuationImpl instanceof DragGestureNode$processDragCancel$1) {
            dragGestureNode$processDragCancel$1 = (DragGestureNode$processDragCancel$1) continuationImpl;
            int i2 = dragGestureNode$processDragCancel$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                dragGestureNode$processDragCancel$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = dragGestureNode$processDragCancel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dragGestureNode$processDragCancel$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    DragInteraction$Start dragInteraction$Start = dragGestureNode.dragInteraction;
                    if (dragInteraction$Start != null) {
                        MutableInteractionSourceImpl mutableInteractionSourceImpl = dragGestureNode.interactionSource;
                        if (mutableInteractionSourceImpl != null) {
                            DragInteraction$Cancel dragInteraction$Cancel = new DragInteraction$Cancel(dragInteraction$Start);
                            dragGestureNode$processDragCancel$1.label = 1;
                            if (mutableInteractionSourceImpl.emit(dragInteraction$Cancel, dragGestureNode$processDragCancel$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    dragGestureNode.onDragStopped(new DragEvent.DragStopped(0L, false));
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                dragGestureNode.dragInteraction = null;
                dragGestureNode.onDragStopped(new DragEvent.DragStopped(0L, false));
                return Unit.INSTANCE;
            }
        }
        dragGestureNode$processDragCancel$1 = new DragGestureNode$processDragCancel$1(dragGestureNode, continuationImpl);
        Object obj2 = dragGestureNode$processDragCancel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dragGestureNode$processDragCancel$1.label;
        if (i != 0) {
        }
        dragGestureNode.dragInteraction = null;
        dragGestureNode.onDragStopped(new DragEvent.DragStopped(0L, false));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r2.emit(r5, r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.foundation.interaction.DragInteraction$Start, androidx.compose.foundation.interaction.Interaction] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$processDragStart(DragGestureNode dragGestureNode, DragEvent.DragStarted dragStarted, ContinuationImpl continuationImpl) {
        DragGestureNode$processDragStart$1 dragGestureNode$processDragStart$1;
        int i;
        MutableInteractionSourceImpl mutableInteractionSourceImpl;
        DragEvent.DragStarted dragStarted2;
        DragInteraction$Start dragInteraction$Start;
        DragInteraction$Start dragInteraction$Start2;
        if (continuationImpl instanceof DragGestureNode$processDragStart$1) {
            dragGestureNode$processDragStart$1 = (DragGestureNode$processDragStart$1) continuationImpl;
            int i2 = dragGestureNode$processDragStart$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                dragGestureNode$processDragStart$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = dragGestureNode$processDragStart$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dragGestureNode$processDragStart$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    DragInteraction$Start dragInteraction$Start3 = dragGestureNode.dragInteraction;
                    if (dragInteraction$Start3 != null && (r2 = dragGestureNode.interactionSource) != null) {
                        DragInteraction$Cancel dragInteraction$Cancel = new DragInteraction$Cancel(dragInteraction$Start3);
                        dragGestureNode$processDragStart$1.L$0 = dragStarted;
                        dragGestureNode$processDragStart$1.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dragInteraction$Start = dragGestureNode$processDragStart$1.L$1;
                        dragStarted2 = dragGestureNode$processDragStart$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        dragInteraction$Start2 = dragInteraction$Start;
                        dragStarted = dragStarted2;
                        dragGestureNode.dragInteraction = dragInteraction$Start2;
                        dragGestureNode.mo192onDragStartedk4lQ0M(dragStarted.m205getStartPointF1C5BW0());
                        return Unit.INSTANCE;
                    }
                    dragStarted = dragGestureNode$processDragStart$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ?? r8 = new Interaction() { // from class: androidx.compose.foundation.interaction.DragInteraction$Start
                };
                mutableInteractionSourceImpl = dragGestureNode.interactionSource;
                dragInteraction$Start2 = r8;
                if (mutableInteractionSourceImpl != 0) {
                    dragGestureNode$processDragStart$1.L$0 = dragStarted;
                    dragGestureNode$processDragStart$1.L$1 = r8;
                    dragGestureNode$processDragStart$1.label = 2;
                    if (mutableInteractionSourceImpl.emit(r8, dragGestureNode$processDragStart$1) != coroutineSingletons) {
                        dragStarted2 = dragStarted;
                        dragInteraction$Start = r8;
                        dragInteraction$Start2 = dragInteraction$Start;
                        dragStarted = dragStarted2;
                    }
                    return coroutineSingletons;
                }
                dragGestureNode.dragInteraction = dragInteraction$Start2;
                dragGestureNode.mo192onDragStartedk4lQ0M(dragStarted.m205getStartPointF1C5BW0());
                return Unit.INSTANCE;
            }
        }
        dragGestureNode$processDragStart$1 = new DragGestureNode$processDragStart$1(dragGestureNode, continuationImpl);
        Object obj2 = dragGestureNode$processDragStart$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dragGestureNode$processDragStart$1.label;
        if (i != 0) {
        }
        ?? r82 = new Interaction() { // from class: androidx.compose.foundation.interaction.DragInteraction$Start
        };
        mutableInteractionSourceImpl = dragGestureNode.interactionSource;
        dragInteraction$Start2 = r82;
        if (mutableInteractionSourceImpl != 0) {
        }
        dragGestureNode.dragInteraction = dragInteraction$Start2;
        dragGestureNode.mo192onDragStartedk4lQ0M(dragStarted.m205getStartPointF1C5BW0());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$processDragStop(DragGestureNode dragGestureNode, DragEvent.DragStopped dragStopped, ContinuationImpl continuationImpl) {
        DragGestureNode$processDragStop$1 dragGestureNode$processDragStop$1;
        int i;
        if (continuationImpl instanceof DragGestureNode$processDragStop$1) {
            dragGestureNode$processDragStop$1 = (DragGestureNode$processDragStop$1) continuationImpl;
            int i2 = dragGestureNode$processDragStop$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                dragGestureNode$processDragStop$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = dragGestureNode$processDragStop$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dragGestureNode$processDragStop$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    DragInteraction$Start dragInteraction$Start = dragGestureNode.dragInteraction;
                    if (dragInteraction$Start != null) {
                        MutableInteractionSourceImpl mutableInteractionSourceImpl = dragGestureNode.interactionSource;
                        if (mutableInteractionSourceImpl != null) {
                            DragInteraction$Stop dragInteraction$Stop = new DragInteraction$Stop(dragInteraction$Start);
                            dragGestureNode$processDragStop$1.L$0 = dragStopped;
                            dragGestureNode$processDragStop$1.label = 1;
                            if (mutableInteractionSourceImpl.emit(dragInteraction$Stop, dragGestureNode$processDragStop$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    dragGestureNode.onDragStopped(dragStopped);
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dragStopped = dragGestureNode$processDragStop$1.L$0;
                SafeTrace.throwOnFailure(obj);
                dragGestureNode.dragInteraction = null;
                dragGestureNode.onDragStopped(dragStopped);
                return Unit.INSTANCE;
            }
        }
        dragGestureNode$processDragStop$1 = new DragGestureNode$processDragStop$1(dragGestureNode, continuationImpl);
        Object obj2 = dragGestureNode$processDragStop$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dragGestureNode$processDragStop$1.label;
        if (i != 0) {
        }
        dragGestureNode.dragInteraction = null;
        dragGestureNode.onDragStopped(dragStopped);
        return Unit.INSTANCE;
    }

    /* renamed from: moveToAwaitTouchSlopState-aWI9W7U$default, reason: not valid java name */
    public static void m214moveToAwaitTouchSlopStateaWI9W7U$default(DragGestureNode dragGestureNode, PointerInputChange pointerInputChange, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        DragDetectionState$AwaitTouchSlop dragDetectionState$AwaitTouchSlop = dragGestureNode._awaitTouchSlopState;
        if (dragDetectionState$AwaitTouchSlop == null) {
            dragDetectionState$AwaitTouchSlop = new DragDetectionState$AwaitTouchSlop();
            dragGestureNode._awaitTouchSlopState = dragDetectionState$AwaitTouchSlop;
        }
        dragDetectionState$AwaitTouchSlop.setInitialDown(pointerInputChange);
        dragDetectionState$AwaitTouchSlop.m202setPointerId0FcD4WY(j);
        HeadersReader headersReader = dragGestureNode.touchSlopDetector;
        Orientation orientation = dragGestureNode.orientationLock;
        if (headersReader == null) {
            dragGestureNode.touchSlopDetector = new HeadersReader(orientation, 2);
        } else {
            headersReader.setOrientation(orientation);
            HeadersReader headersReader2 = dragGestureNode.touchSlopDetector;
            if (headersReader2 != null) {
                headersReader2.m4326resetk4lQ0M(j2);
            }
        }
        dragDetectionState$AwaitTouchSlop.setVerifyConsumptionInFinalPass(false);
        dragGestureNode.currentDragState = dragDetectionState$AwaitTouchSlop;
    }

    public final void disposeInteractionSource$1() {
        DragInteraction$Start dragInteraction$Start = this.dragInteraction;
        if (dragInteraction$Start != null) {
            MutableInteractionSourceImpl mutableInteractionSourceImpl = this.interactionSource;
            if (mutableInteractionSourceImpl != null) {
                mutableInteractionSourceImpl.tryEmit(new DragInteraction$Cancel(dragInteraction$Start));
            }
            this.dragInteraction = null;
        }
    }

    public abstract Object drag(DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1, DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$12);

    @Override // androidx.compose.foundation.GestureConnection
    public final boolean isInterested(PointerInputChange pointerInputChange) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            return this.enabled;
        }
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            if (this.touchSlopDetector == null) {
                this.touchSlopDetector = new HeadersReader(this.orientationLock, 2);
            }
            float touchSlop = ((ViewConfiguration) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalViewConfiguration)).getTouchSlop();
            long positionChange = PointerEventKt.positionChange(pointerInputChange);
            HeadersReader headersReader = this.touchSlopDetector;
            if (headersReader == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Touch slop detector not initialized.");
                return false;
            }
            if (!Offset.m622equalsimpl0(headersReader.m4323getPostSlopOffsetqto3Fdw(touchSlop, positionChange, false), 9205357640488583168L) && headersReader.m4324isDeltaAtAngleOfInterestk4lQ0M(positionChange)) {
                return true;
            }
        }
        return false;
    }

    public final void moveToAwaitDownState() {
        DragDetectionState$AwaitDown dragDetectionState$AwaitDown = this._awaitDownState;
        if (dragDetectionState$AwaitDown == null) {
            dragDetectionState$AwaitDown = new DragDetectionState$AwaitDown();
            this._awaitDownState = dragDetectionState$AwaitDown;
        }
        dragDetectionState$AwaitDown.setAwaitTouchSlop(DragDetectionState$AwaitDown.AwaitTouchSlop.NotInitialized);
        dragDetectionState$AwaitDown.setConsumedOnInitial(false);
        this.currentDragState = dragDetectionState$AwaitDown;
    }

    /* renamed from: moveToAwaitGesturePickupState-rnUCldI, reason: not valid java name */
    public final void m215moveToAwaitGesturePickupStaternUCldI(PointerInputChange pointerInputChange, long j, HeadersReader headersReader) {
        DragDetectionState$AwaitGesturePickup dragDetectionState$AwaitGesturePickup = this._awaitGesturePickupState;
        if (dragDetectionState$AwaitGesturePickup == null) {
            dragDetectionState$AwaitGesturePickup = new DragDetectionState$AwaitGesturePickup();
            this._awaitGesturePickupState = dragDetectionState$AwaitGesturePickup;
        }
        dragDetectionState$AwaitGesturePickup.setInitialDown(pointerInputChange);
        dragDetectionState$AwaitGesturePickup.m200setPointerId0FcD4WY(j);
        headersReader.headerLimit = 0L;
        this.currentDragState = dragDetectionState$AwaitGesturePickup;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public final void onCancelIndirectPointerInput() {
        IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.indirectPointerInputDragCycleDetector;
        if (indirectPointerInputDragCycleDetector != null) {
            indirectPointerInputDragCycleDetector.resetDragDetectionState();
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        if (this.isListeningForPointerInputEvents) {
            moveToAwaitDownState();
            if (this.isListeningForEvents) {
                requireChannel().mo1159trySendJP2dKIU(DragEvent.DragCancelled.INSTANCE);
            }
            this.velocityTracker = null;
        }
        this.isListeningForPointerInputEvents = false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.isListeningForEvents = false;
        disposeInteractionSource$1();
        this.nodeOffset = 0L;
        GestureNode gestureNode = this.gestureNode;
        if (gestureNode != null) {
            undelegate(gestureNode);
        }
        this.gestureNode = null;
    }

    public final void onDragEvent(DragEvent dragEvent) {
        if ((dragEvent instanceof DragEvent.DragStarted) && !this.isListeningForEvents) {
            this.isListeningForEvents = true;
            startListeningForEvents();
        }
        requireChannel().mo1159trySendJP2dKIU(dragEvent);
    }

    /* renamed from: onDragStarted-k-4lQ0M */
    public abstract void mo192onDragStartedk4lQ0M(long j);

    public abstract void onDragStopped(DragEvent.DragStopped dragStopped);

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public final void onIndirectPointerEvent(HuffmanTreeGroup huffmanTreeGroup, PointerEventPass pointerEventPass) {
        if (this.gestureNode == null) {
            GestureNode gestureNode = CanvasKt.gestureNode(this);
            delegate(gestureNode);
            this.gestureNode = gestureNode;
        }
        if (this.enabled) {
            if (this.indirectPointerInputDragCycleDetector == null) {
                this.indirectPointerInputDragCycleDetector = new IndirectPointerInputDragCycleDetector(this);
            }
            IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.indirectPointerInputDragCycleDetector;
            if (indirectPointerInputDragCycleDetector != null) {
                indirectPointerInputDragCycleDetector.processIndirectPointerInputEvent(huffmanTreeGroup, pointerEventPass);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v38, types: [androidx.compose.foundation.gestures.DragDetectionState$Dragging] */
    /* JADX WARN: Type inference failed for: r3v15, types: [androidx.compose.foundation.gestures.DragDetectionState$Dragging] */
    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo162onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        Object obj;
        Object obj2;
        long m4323getPostSlopOffsetqto3Fdw;
        Object obj3;
        boolean isChangedToDown;
        boolean z = true;
        this.isListeningForPointerInputEvents = true;
        if (this.gestureNode == null) {
            GestureNode gestureNode = CanvasKt.gestureNode(this);
            delegate(gestureNode);
            this.gestureNode = gestureNode;
        }
        if (this.enabled) {
            if (this.currentDragState == null) {
                DragDetectionState$AwaitDown dragDetectionState$AwaitDown = this._awaitDownState;
                if (dragDetectionState$AwaitDown == null) {
                    dragDetectionState$AwaitDown = new DragDetectionState$AwaitDown();
                    this._awaitDownState = dragDetectionState$AwaitDown;
                }
                this.currentDragState = dragDetectionState$AwaitDown;
            }
            Draggable2DKt draggable2DKt = this.currentDragState;
            if (draggable2DKt == null) {
                a$$ExternalSyntheticBUOutline0.m$3("currentDragState should not be null");
                return;
            }
            int i = 0;
            if (draggable2DKt instanceof DragDetectionState$AwaitDown) {
                DragDetectionState$AwaitDown dragDetectionState$AwaitDown2 = (DragDetectionState$AwaitDown) draggable2DKt;
                if (pointerEvent.changes.isEmpty()) {
                    return;
                }
                isChangedToDown = TapGestureDetectorKt.isChangedToDown(pointerEvent, false, false);
                if (isChangedToDown) {
                    PointerInputChange pointerInputChange = (PointerInputChange) CollectionsKt.first(pointerEvent.changes);
                    DragDetectionState$AwaitDown.AwaitTouchSlop awaitTouchSlop = WhenMappings.$EnumSwitchMapping$0[dragDetectionState$AwaitDown2.getAwaitTouchSlop().ordinal()] == 1 ? !startDragImmediately() ? DragDetectionState$AwaitDown.AwaitTouchSlop.Yes : DragDetectionState$AwaitDown.AwaitTouchSlop.No : dragDetectionState$AwaitDown2.getAwaitTouchSlop();
                    dragDetectionState$AwaitDown2.setAwaitTouchSlop(awaitTouchSlop);
                    if (pointerEventPass == PointerEventPass.Initial && awaitTouchSlop == DragDetectionState$AwaitDown.AwaitTouchSlop.No) {
                        pointerInputChange.consume();
                        dragDetectionState$AwaitDown2.setConsumedOnInitial(true);
                    }
                    if (pointerEventPass == PointerEventPass.Main) {
                        if (awaitTouchSlop == DragDetectionState$AwaitDown.AwaitTouchSlop.Yes) {
                            m214moveToAwaitTouchSlopStateaWI9W7U$default(this, pointerInputChange, pointerInputChange.m815getIdJ3iCeTQ(), 0L, 12);
                            return;
                        }
                        if (dragDetectionState$AwaitDown2.getConsumedOnInitial()) {
                            m217sendDragStart0AR0LA0(pointerInputChange, pointerInputChange, 0L);
                            m216sendDragEventUv8p0NA(0L, pointerInputChange);
                            long m815getIdJ3iCeTQ = pointerInputChange.m815getIdJ3iCeTQ();
                            DragDetectionState$Dragging dragDetectionState$Dragging = this._draggingState;
                            DragDetectionState$Dragging dragDetectionState$Dragging2 = dragDetectionState$Dragging;
                            if (dragDetectionState$Dragging == null) {
                                ?? r3 = new Draggable2DKt() { // from class: androidx.compose.foundation.gestures.DragDetectionState$Dragging
                                    public long pointerId = Long.MAX_VALUE;

                                    /* renamed from: getPointerId-J3iCeTQ, reason: not valid java name */
                                    public final long m203getPointerIdJ3iCeTQ() {
                                        return this.pointerId;
                                    }

                                    /* renamed from: setPointerId-0FcD4WY, reason: not valid java name */
                                    public final void m204setPointerId0FcD4WY(long j2) {
                                        this.pointerId = j2;
                                    }
                                };
                                this._draggingState = r3;
                                dragDetectionState$Dragging2 = r3;
                            }
                            dragDetectionState$Dragging2.m204setPointerId0FcD4WY(m815getIdJ3iCeTQ);
                            this.currentDragState = dragDetectionState$Dragging2;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            Object obj4 = null;
            if (!(draggable2DKt instanceof DragDetectionState$AwaitTouchSlop)) {
                if (draggable2DKt instanceof DragDetectionState$AwaitGesturePickup) {
                    DragDetectionState$AwaitGesturePickup dragDetectionState$AwaitGesturePickup = (DragDetectionState$AwaitGesturePickup) draggable2DKt;
                    if (pointerEventPass != PointerEventPass.Final) {
                        return;
                    }
                    List list = pointerEvent.changes;
                    List list2 = list;
                    int size = list2.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        if (((PointerInputChange) list.get(i2)).isConsumed()) {
                            z = false;
                            break;
                        }
                        i2++;
                    }
                    int size2 = list2.size();
                    while (true) {
                        if (i >= size2) {
                            break;
                        }
                        if (!((PointerInputChange) list.get(i)).getPressed()) {
                            i++;
                        } else if (!list.isEmpty()) {
                            if (z) {
                                long m816getPositionF1C5BW0 = ((PointerInputChange) CollectionsKt.first(list)).m816getPositionF1C5BW0();
                                PointerInputChange initialDown = dragDetectionState$AwaitGesturePickup.getInitialDown();
                                initialDown.getClass();
                                long m625minusMKHz9U = Offset.m625minusMKHz9U(m816getPositionF1C5BW0, initialDown.m816getPositionF1C5BW0());
                                PointerInputChange initialDown2 = dragDetectionState$AwaitGesturePickup.getInitialDown();
                                if (initialDown2 != null) {
                                    m214moveToAwaitTouchSlopStateaWI9W7U$default(this, initialDown2, dragDetectionState$AwaitGesturePickup.m199getPointerIdJ3iCeTQ(), m625minusMKHz9U, 8);
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
                if (!(draggable2DKt instanceof DragDetectionState$Dragging)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                DragDetectionState$Dragging dragDetectionState$Dragging3 = (DragDetectionState$Dragging) draggable2DKt;
                if (pointerEventPass != PointerEventPass.Main) {
                    return;
                }
                long m203getPointerIdJ3iCeTQ = dragDetectionState$Dragging3.m203getPointerIdJ3iCeTQ();
                List list3 = pointerEvent.changes;
                int size3 = list3.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = list3.get(i3);
                    if (PointerId.m812equalsimpl0(((PointerInputChange) obj).m815getIdJ3iCeTQ(), m203getPointerIdJ3iCeTQ)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
                if (pointerInputChange2 == null) {
                    return;
                }
                boolean changedToUpIgnoreConsumed = PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2);
                Object obj5 = DragEvent.DragCancelled.INSTANCE;
                if (!changedToUpIgnoreConsumed) {
                    if (pointerInputChange2.isConsumed()) {
                        requireChannel().mo1159trySendJP2dKIU(obj5);
                        return;
                    } else {
                        if (Offset.m623getDistanceimpl(PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange2)) == RecyclerView.DECELERATION_RATE) {
                            return;
                        }
                        m216sendDragEventUv8p0NA(PointerEventKt.positionChange(pointerInputChange2), pointerInputChange2);
                        pointerInputChange2.consume();
                        return;
                    }
                }
                List list4 = pointerEvent.changes;
                int size4 = list4.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size4) {
                        break;
                    }
                    Object obj6 = list4.get(i4);
                    if (((PointerInputChange) obj6).getPressed()) {
                        obj4 = obj6;
                        break;
                    }
                    i4++;
                }
                PointerInputChange pointerInputChange3 = (PointerInputChange) obj4;
                if (pointerInputChange3 != null) {
                    dragDetectionState$Dragging3.m204setPointerId0FcD4WY(pointerInputChange3.m815getIdJ3iCeTQ());
                    return;
                }
                if (pointerInputChange2.isConsumed() || !PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    requireChannel().mo1159trySendJP2dKIU(obj5);
                } else {
                    MoveBitcoinViewKt.addPointerInputChange(requireVelocityTracker(), pointerInputChange2);
                    float maximumFlingVelocity = ((ViewConfiguration) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalViewConfiguration)).getMaximumFlingVelocity();
                    long m11calculateVelocityAH228Gc = requireVelocityTracker().m11calculateVelocityAH228Gc(VelocityKt.Velocity(maximumFlingVelocity, maximumFlingVelocity));
                    requireVelocityTracker().resetTracking();
                    requireChannel().mo1159trySendJP2dKIU(new DragEvent.DragStopped(DraggableKt.m222toValidVelocityTH1AsA0(m11calculateVelocityAH228Gc), false));
                    this.isListeningForPointerInputEvents = false;
                }
                moveToAwaitDownState();
                return;
            }
            DragDetectionState$AwaitTouchSlop dragDetectionState$AwaitTouchSlop = (DragDetectionState$AwaitTouchSlop) draggable2DKt;
            if (pointerEventPass == PointerEventPass.Initial) {
                return;
            }
            List list5 = pointerEvent.changes;
            List list6 = list5;
            int size5 = list6.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    obj2 = null;
                    break;
                }
                obj2 = list5.get(i5);
                if (PointerId.m812equalsimpl0(((PointerInputChange) obj2).m815getIdJ3iCeTQ(), dragDetectionState$AwaitTouchSlop.m201getPointerIdJ3iCeTQ())) {
                    break;
                } else {
                    i5++;
                }
            }
            PointerInputChange pointerInputChange4 = (PointerInputChange) obj2;
            if (pointerInputChange4 == null) {
                int size6 = list6.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list5.get(i6);
                    if (((PointerInputChange) obj3).getPressed()) {
                        break;
                    } else {
                        i6++;
                    }
                }
                pointerInputChange4 = (PointerInputChange) obj3;
                if (pointerInputChange4 == null) {
                    moveToAwaitDownState();
                    return;
                }
                dragDetectionState$AwaitTouchSlop.m202setPointerId0FcD4WY(pointerInputChange4.m815getIdJ3iCeTQ());
            }
            if (pointerEventPass == PointerEventPass.Main) {
                if (pointerInputChange4.isConsumed()) {
                    PointerInputChange initialDown3 = dragDetectionState$AwaitTouchSlop.getInitialDown();
                    if (initialDown3 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long m201getPointerIdJ3iCeTQ = dragDetectionState$AwaitTouchSlop.m201getPointerIdJ3iCeTQ();
                    HeadersReader headersReader = this.touchSlopDetector;
                    if (headersReader == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    m215moveToAwaitGesturePickupStaternUCldI(initialDown3, m201getPointerIdJ3iCeTQ, headersReader);
                } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                    int size7 = list6.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size7) {
                            break;
                        }
                        Object obj7 = list5.get(i7);
                        if (((PointerInputChange) obj7).getPressed()) {
                            obj4 = obj7;
                            break;
                        }
                        i7++;
                    }
                    PointerInputChange pointerInputChange5 = (PointerInputChange) obj4;
                    if (pointerInputChange5 == null) {
                        moveToAwaitDownState();
                    } else {
                        dragDetectionState$AwaitTouchSlop.m202setPointerId0FcD4WY(pointerInputChange5.m815getIdJ3iCeTQ());
                    }
                } else {
                    float m212pointerSlopE8SPZFQ = DragGestureDetectorKt.m212pointerSlopE8SPZFQ((ViewConfiguration) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalViewConfiguration), pointerInputChange4.m818getTypeT8wyACA());
                    HeadersReader headersReader2 = this.touchSlopDetector;
                    if (headersReader2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Touch slop detector not initialized.");
                        return;
                    }
                    m4323getPostSlopOffsetqto3Fdw = headersReader2.m4323getPostSlopOffsetqto3Fdw(m212pointerSlopE8SPZFQ, PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange4), true);
                    if ((9223372034707292159L & m4323getPostSlopOffsetqto3Fdw) != 9205357640488583168L) {
                        boolean isInterested = isInterested(pointerInputChange4);
                        GestureConnection parentGestureConnection = CanvasKt.getParentGestureConnection(this);
                        boolean z2 = parentGestureConnection != null && parentGestureConnection.isInterested(pointerInputChange4);
                        if (isInterested || !z2) {
                            pointerInputChange4.consume();
                            PointerInputChange initialDown4 = dragDetectionState$AwaitTouchSlop.getInitialDown();
                            initialDown4.getClass();
                            m217sendDragStart0AR0LA0(initialDown4, pointerInputChange4, m4323getPostSlopOffsetqto3Fdw);
                            m216sendDragEventUv8p0NA(m4323getPostSlopOffsetqto3Fdw, pointerInputChange4);
                            long m815getIdJ3iCeTQ2 = pointerInputChange4.m815getIdJ3iCeTQ();
                            DragDetectionState$Dragging dragDetectionState$Dragging4 = this._draggingState;
                            DragDetectionState$Dragging dragDetectionState$Dragging5 = dragDetectionState$Dragging4;
                            if (dragDetectionState$Dragging4 == null) {
                                ?? r1 = new Draggable2DKt() { // from class: androidx.compose.foundation.gestures.DragDetectionState$Dragging
                                    public long pointerId = Long.MAX_VALUE;

                                    /* renamed from: getPointerId-J3iCeTQ, reason: not valid java name */
                                    public final long m203getPointerIdJ3iCeTQ() {
                                        return this.pointerId;
                                    }

                                    /* renamed from: setPointerId-0FcD4WY, reason: not valid java name */
                                    public final void m204setPointerId0FcD4WY(long j2) {
                                        this.pointerId = j2;
                                    }
                                };
                                this._draggingState = r1;
                                dragDetectionState$Dragging5 = r1;
                            }
                            dragDetectionState$Dragging5.m204setPointerId0FcD4WY(m815getIdJ3iCeTQ2);
                            this.currentDragState = dragDetectionState$Dragging5;
                        } else {
                            dragDetectionState$AwaitTouchSlop.setVerifyConsumptionInFinalPass(true);
                        }
                    } else {
                        dragDetectionState$AwaitTouchSlop.setVerifyConsumptionInFinalPass(true);
                    }
                }
            }
            if (pointerEventPass == PointerEventPass.Final && dragDetectionState$AwaitTouchSlop.getVerifyConsumptionInFinalPass()) {
                if (!pointerInputChange4.isConsumed()) {
                    dragDetectionState$AwaitTouchSlop.setVerifyConsumptionInFinalPass(false);
                    return;
                }
                PointerInputChange initialDown5 = dragDetectionState$AwaitTouchSlop.getInitialDown();
                if (initialDown5 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long m201getPointerIdJ3iCeTQ2 = dragDetectionState$AwaitTouchSlop.m201getPointerIdJ3iCeTQ();
                HeadersReader headersReader3 = this.touchSlopDetector;
                if (headersReader3 != null) {
                    m215moveToAwaitGesturePickupStaternUCldI(initialDown5, m201getPointerIdJ3iCeTQ2, headersReader3);
                } else {
                    a$$ExternalSyntheticBUOutline0.m$3("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
    }

    public final Channel requireChannel() {
        BufferedChannel bufferedChannel = this.channel;
        if (bufferedChannel != null) {
            return bufferedChannel;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Events channel not initialized.");
        return null;
    }

    public final BiometricPrompt requireVelocityTracker() {
        BiometricPrompt biometricPrompt = this.velocityTracker;
        if (biometricPrompt != null) {
            return biometricPrompt;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Velocity Tracker not initialized.");
        return null;
    }

    /* renamed from: sendDragEvent-Uv8p0NA, reason: not valid java name */
    public final void m216sendDragEventUv8p0NA(long j, PointerInputChange pointerInputChange) {
        long mo842localToScreenMKHz9U = DepthSortedSetKt.requireLayoutCoordinates(getNode()).mo842localToScreenMKHz9U(0L);
        if (!Offset.m622equalsimpl0(this.previousPositionOnScreen, 9205357640488583168L) && !Offset.m622equalsimpl0(mo842localToScreenMKHz9U, this.previousPositionOnScreen)) {
            this.nodeOffset = Offset.m626plusMKHz9U(this.nodeOffset, Offset.m625minusMKHz9U(mo842localToScreenMKHz9U, this.previousPositionOnScreen));
        }
        this.previousPositionOnScreen = mo842localToScreenMKHz9U;
        MoveBitcoinViewKt.m3421addPointerInputChange0AR0LA0(requireVelocityTracker(), pointerInputChange, this.nodeOffset);
        requireChannel().mo1159trySendJP2dKIU(new DragEvent.DragDelta(j, false));
    }

    /* renamed from: sendDragStart-0AR0LA0, reason: not valid java name */
    public final void m217sendDragStart0AR0LA0(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j) {
        if (this.velocityTracker == null) {
            this.velocityTracker = new BiometricPrompt(20);
        }
        MoveBitcoinViewKt.addPointerInputChange(requireVelocityTracker(), pointerInputChange);
        long m625minusMKHz9U = Offset.m625minusMKHz9U(pointerInputChange2.m816getPositionF1C5BW0(), j);
        this.nodeOffset = 0L;
        if (((Boolean) this.canDrag.invoke(PointerType.m827boximpl(pointerInputChange.m818getTypeT8wyACA()))).booleanValue()) {
            if (!this.isListeningForEvents) {
                if (this.channel == null) {
                    this.channel = PapaEvent.Channel$default(Integer.MAX_VALUE, null, null, 6);
                }
                startListeningForEvents();
            }
            this.previousPositionOnScreen = DepthSortedSetKt.requireLayoutCoordinates(this).mo842localToScreenMKHz9U(0L);
            requireChannel().mo1159trySendJP2dKIU(new DragEvent.DragStarted(m625minusMKHz9U));
        }
    }

    public abstract boolean startDragImmediately();

    public final void startListeningForEvents() {
        this.isListeningForEvents = true;
        if (this.channel == null) {
            this.channel = PapaEvent.Channel$default(Integer.MAX_VALUE, null, null, 6);
        }
        JobKt.launch$default(getCoroutineScope(), null, null, new DragGestureNode$startListeningForEvents$1(this, null), 3);
    }

    public final void update(Function1 function1, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, Orientation orientation, boolean z2) {
        this.canDrag = function1;
        boolean z3 = true;
        if (this.enabled != z) {
            this.enabled = z;
            if (!z) {
                disposeInteractionSource$1();
                this.indirectPointerInputDragCycleDetector = null;
            }
            z2 = true;
        }
        if (!Intrinsics.areEqual(this.interactionSource, mutableInteractionSourceImpl)) {
            disposeInteractionSource$1();
            this.interactionSource = mutableInteractionSourceImpl;
        }
        if (this.orientationLock != orientation) {
            this.orientationLock = orientation;
        } else {
            z3 = z2;
        }
        if (z3) {
            if (this.isListeningForPointerInputEvents) {
                moveToAwaitDownState();
                if (this.isListeningForEvents) {
                    requireChannel().mo1159trySendJP2dKIU(DragEvent.DragCancelled.INSTANCE);
                }
                this.velocityTracker = null;
            }
            IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.indirectPointerInputDragCycleDetector;
            if (indirectPointerInputDragCycleDetector != null) {
                indirectPointerInputDragCycleDetector.resetDragDetectionState();
            }
        }
    }

    @Override // androidx.compose.foundation.GestureConnection
    public final boolean isInterested(IndirectPointerInputChange indirectPointerInputChange) {
        return Draggable2DKt.changedToDownIgnoreConsumed(indirectPointerInputChange) && this.enabled;
    }
}
