package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.interaction.HoverInteraction$Enter;
import androidx.compose.foundation.interaction.HoverInteraction$Exit;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material.SliderDraggableState$drag$2;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.wallet.TabContentViewKt$clickableWithRippleOnClick$2$1$1;
import com.squareup.cash.storage.RealStorage$temp$1;
import com.squareup.util.task.RepeatOnIntervalTaskRunner$repeatOn$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode, SemanticsModifierNode, TraversableNode, CompositionLocalConsumerModifierNode, ObserverModifierNode, IndirectPointerInputModifierNode, GestureConnection {
    public static final FocusableNode.TraverseKey TraverseKey = new FocusableNode.TraverseKey();
    public long centerOffset;
    public final MutableLongObjectMap currentKeyPressInteractions;
    public StandaloneCoroutine delayJob;
    public boolean enabled;
    public final FocusableNode focusableNode;
    public GestureNode gestureNode;
    public HoverInteraction$Enter hoverInteraction;
    public DelegatableNode indicationNode;
    public IndicationNodeFactory indicationNodeFactory;
    public PressInteraction.Press indirectPointerPressInteraction;
    public MutableInteractionSourceImpl interactionSource;
    public boolean lazilyCreateIndication;
    public IndicationNodeFactory localIndicationNodeFactory;
    public Function0 onClick;
    public String onClickLabel;
    public PressInteraction.Press pressInteraction;
    public Role role;
    public final FocusableNode.TraverseKey traverseKey;
    public boolean useLocalIndication;
    public MutableInteractionSourceImpl userProvidedInteractionSource;

    public AbstractClickableNode(MutableInteractionSourceImpl mutableInteractionSourceImpl, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str, Role role, Function0 function0) {
        this.interactionSource = mutableInteractionSourceImpl;
        this.indicationNodeFactory = indicationNodeFactory;
        this.useLocalIndication = z;
        this.onClickLabel = str;
        this.role = role;
        this.enabled = z2;
        this.onClick = function0;
        this.focusableNode = new FocusableNode(mutableInteractionSourceImpl, 0, new RealStorage$temp$1(1, this, AbstractClickableNode.class, "onFocusChange", "onFocusChange(Z)V", 0, 2));
        MutableLongObjectMap mutableLongObjectMap = LongObjectMapKt.EmptyLongObjectMap;
        this.currentKeyPressInteractions = new MutableLongObjectMap();
        this.centerOffset = 0L;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2 = this.interactionSource;
        this.userProvidedInteractionSource = mutableInteractionSourceImpl2;
        this.lazilyCreateIndication = mutableInteractionSourceImpl2 == null;
        this.traverseKey = TraverseKey;
    }

    public void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Role role = this.role;
        if (role != null) {
            SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver, role.value);
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, this.onClickLabel, new AbstractClickableNode$$ExternalSyntheticLambda0(this, 1));
        if (this.enabled) {
            this.focusableNode.applySemantics(semanticsPropertyReceiver);
        } else {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        applyAdditionalSemantics(semanticsPropertyReceiver);
    }

    public final void disposeInteractions() {
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.interactionSource;
        MutableLongObjectMap mutableLongObjectMap = this.currentKeyPressInteractions;
        if (mutableInteractionSourceImpl != null) {
            PressInteraction.Press press = this.pressInteraction;
            if (press != null) {
                mutableInteractionSourceImpl.tryEmit(new PressInteraction.Cancel(press));
            }
            PressInteraction.Press press2 = this.indirectPointerPressInteraction;
            if (press2 != null) {
                mutableInteractionSourceImpl.tryEmit(new PressInteraction.Cancel(press2));
            }
            HoverInteraction$Enter hoverInteraction$Enter = this.hoverInteraction;
            if (hoverInteraction$Enter != null) {
                mutableInteractionSourceImpl.tryEmit(new HoverInteraction$Exit(hoverInteraction$Enter));
            }
            Object[] objArr = mutableLongObjectMap.values;
            long[] jArr = mutableLongObjectMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                mutableInteractionSourceImpl.tryEmit(new PressInteraction.Cancel((PressInteraction.Press) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
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
        }
        this.pressInteraction = null;
        this.indirectPointerPressInteraction = null;
        this.hoverInteraction = null;
        mutableLongObjectMap.clear();
    }

    /* renamed from: getExtendedTouchPadding-hWWAJMo, reason: not valid java name */
    public final long m157getExtendedTouchPaddinghWWAJMo(long j) {
        long mo237toSizeXkaWNTQ = DepthSortedSetKt.requireLayoutNode(this).density.mo237toSizeXkaWNTQ(((ViewConfiguration) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalViewConfiguration)).mo873getMinimumTouchTargetSizeMYxV2XQ());
        float max = Math.max(RecyclerView.DECELERATION_RATE, Float.intBitsToFloat((int) (mo237toSizeXkaWNTQ >> 32)) - ((int) (j >> 32))) / 2.0f;
        float max2 = Math.max(RecyclerView.DECELERATION_RATE, Float.intBitsToFloat((int) (mo237toSizeXkaWNTQ & BodyPartID.bodyIdMax)) - ((int) (j & BodyPartID.bodyIdMax))) / 2.0f;
        return (Float.floatToRawIntBits(max2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(max) << 32);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object getTraverseKey() {
        return this.traverseKey;
    }

    public final void handlePressInteractionCancel(boolean z) {
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.interactionSource;
        if (mutableInteractionSourceImpl != null) {
            StandaloneCoroutine standaloneCoroutine = this.delayJob;
            Continuation continuation = null;
            if (standaloneCoroutine == null || !standaloneCoroutine.isActive()) {
                PressInteraction.Press press = z ? this.indirectPointerPressInteraction : this.pressInteraction;
                if (press != null) {
                    PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
                    Job job = (Job) getCoroutineScope().getCoroutineContext().get(Job.Key.$$INSTANCE);
                    JobKt.launch$default(getCoroutineScope(), null, null, new SliderDraggableState$drag$2(mutableInteractionSourceImpl, cancel, job != null ? job.invokeOnCompletion(new ClickableKt$$ExternalSyntheticLambda0(12, mutableInteractionSourceImpl, cancel)) : null, continuation, 13), 3);
                }
            } else {
                StandaloneCoroutine standaloneCoroutine2 = this.delayJob;
                if (standaloneCoroutine2 != null) {
                    standaloneCoroutine2.cancel(null);
                }
            }
            if (z) {
                this.indirectPointerPressInteraction = null;
            } else {
                this.pressInteraction = null;
            }
        }
    }

    /* renamed from: handlePressInteractionRelease-3MmeM6k, reason: not valid java name */
    public final void m158handlePressInteractionRelease3MmeM6k(long j, boolean z) {
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.interactionSource;
        if (mutableInteractionSourceImpl != null) {
            StandaloneCoroutine standaloneCoroutine = this.delayJob;
            if (standaloneCoroutine == null || !standaloneCoroutine.isActive()) {
                PressInteraction.Press press = z ? this.indirectPointerPressInteraction : this.pressInteraction;
                if (press != null) {
                    JobKt.launch$default(getCoroutineScope(), null, null, new TabContentViewKt$clickableWithRippleOnClick$2$1$1(press, mutableInteractionSourceImpl, null), 3);
                }
            } else {
                standaloneCoroutine.cancel(null);
                JobKt.launch$default(getCoroutineScope(), null, null, new RepeatOnIntervalTaskRunner$repeatOn$2(standaloneCoroutine, j, mutableInteractionSourceImpl, (Continuation) null, 2), 3);
            }
            if (z) {
                this.indirectPointerPressInteraction = null;
            } else {
                this.pressInteraction = null;
            }
        }
    }

    public final void handlePressInteractionStart(IndirectPointerInputChange indirectPointerInputChange) {
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.interactionSource;
        if (mutableInteractionSourceImpl != null) {
            PressInteraction.Press press = new PressInteraction.Press(indirectPointerInputChange.m770getPositionF1C5BW0());
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            CanvasKt.traverseAncestorGestureConnections(this, new ClickableKt$$ExternalSyntheticLambda0(0, indirectPointerInputChange, ref$BooleanRef));
            Continuation continuation = null;
            if (ref$BooleanRef.element || Clickable_androidKt.isComposeRootInScrollableContainer(this)) {
                this.delayJob = JobKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$1(mutableInteractionSourceImpl, press, this, continuation, 0), 3);
            } else {
                this.indirectPointerPressInteraction = press;
                JobKt.launch$default(getCoroutineScope(), null, null, new TabContentViewKt$clickableWithRippleOnClick$2$1$1(mutableInteractionSourceImpl, press, continuation, 2), 3);
            }
        }
    }

    public final void initializeIndicationAndInteractionSourceIfNeeded() {
        if (this.indicationNode != null) {
            return;
        }
        IndicationNodeFactory indicationNodeFactory = this.useLocalIndication ? this.localIndicationNodeFactory : this.indicationNodeFactory;
        if (indicationNodeFactory != null) {
            if (this.interactionSource == null) {
                this.interactionSource = new MutableInteractionSourceImpl();
            }
            this.focusableNode.update(this.interactionSource);
            MutableInteractionSourceImpl mutableInteractionSourceImpl = this.interactionSource;
            mutableInteractionSourceImpl.getClass();
            DelegatableNode create = indicationNodeFactory.create(mutableInteractionSourceImpl);
            delegate(create);
            this.indicationNode = create;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        onObservedReadsChanged();
        if (!this.lazilyCreateIndication) {
            initializeIndicationAndInteractionSourceIfNeeded();
        }
        if (this.enabled) {
            delegate(this.focusableNode);
        }
    }

    public void onCancelKeyInput() {
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        HoverInteraction$Enter hoverInteraction$Enter;
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.interactionSource;
        if (mutableInteractionSourceImpl != null && (hoverInteraction$Enter = this.hoverInteraction) != null) {
            mutableInteractionSourceImpl.tryEmit(new HoverInteraction$Exit(hoverInteraction$Enter));
        }
        this.hoverInteraction = null;
    }

    /* renamed from: onClickKeyDownEvent-ZmokQxo, reason: not valid java name */
    public abstract boolean mo159onClickKeyDownEventZmokQxo(KeyEvent keyEvent);

    /* renamed from: onClickKeyUpEvent-ZmokQxo, reason: not valid java name */
    public abstract void mo160onClickKeyUpEventZmokQxo(KeyEvent keyEvent);

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        disposeInteractions();
        if (this.userProvidedInteractionSource == null) {
            this.interactionSource = null;
        }
        DelegatableNode delegatableNode = this.indicationNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.indicationNode = null;
        GestureNode gestureNode = this.gestureNode;
        if (gestureNode != null) {
            undelegate(gestureNode);
        }
        this.gestureNode = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007f A[RETURN] */
    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo161onKeyEventZmokQxo(KeyEvent keyEvent) {
        boolean z;
        initializeIndicationAndInteractionSourceIfNeeded();
        long m782getKeyZmokQxo = KeyEventType.m782getKeyZmokQxo(keyEvent);
        boolean z2 = this.enabled;
        int i = 3;
        Continuation continuation = null;
        MutableLongObjectMap mutableLongObjectMap = this.currentKeyPressInteractions;
        int i2 = 0;
        if (!z2 || !KeyEventType.m772equalsimpl0(KeyEventType.m790getTypeZmokQxo(keyEvent), 2) || !ImageKt.m186isEnterZmokQxo(keyEvent)) {
            if (this.enabled && KeyEventType.m772equalsimpl0(KeyEventType.m790getTypeZmokQxo(keyEvent), 1) && ImageKt.m186isEnterZmokQxo(keyEvent)) {
                PressInteraction.Press press = (PressInteraction.Press) mutableLongObjectMap.remove(m782getKeyZmokQxo);
                if (press != null) {
                    if (this.interactionSource != null) {
                        JobKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(this, press, continuation, i), 3);
                    }
                    mo160onClickKeyUpEventZmokQxo(keyEvent);
                }
                if (press != null) {
                    return true;
                }
            }
            return false;
        }
        if (mutableLongObjectMap.containsKey(m782getKeyZmokQxo)) {
            z = false;
        } else {
            PressInteraction.Press press2 = new PressInteraction.Press(this.centerOffset);
            mutableLongObjectMap.set(press2, m782getKeyZmokQxo);
            if (this.interactionSource != null) {
                JobKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(this, press2, continuation, i2), 3);
            }
            z = true;
        }
        if (!mo159onClickKeyDownEventZmokQxo(keyEvent) && !z) {
            return false;
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        if (this.useLocalIndication) {
            DepthSortedSetKt.observeReads(this, new AbstractClickableNode$$ExternalSyntheticLambda0(this, 0));
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public void mo162onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        long j2 = (((j << 32) >> 33) & BodyPartID.bodyIdMax) | ((j >> 33) << 32);
        float f = (int) (j2 >> 32);
        float f2 = (int) (j2 & BodyPartID.bodyIdMax);
        this.centerOffset = (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32);
        initializeIndicationAndInteractionSourceIfNeeded();
        if (this.enabled) {
            if (this.gestureNode == null) {
                GestureNode gestureNode = CanvasKt.gestureNode(this);
                delegate(gestureNode);
                this.gestureNode = gestureNode;
            }
            if (pointerEventPass == PointerEventPass.Main) {
                int i = pointerEvent.f858type;
                Continuation continuation = null;
                if (i == 4) {
                    JobKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$1(this, continuation, 0), 3);
                } else if (i == 5) {
                    JobKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$1(this, continuation, 1), 3);
                }
            }
        }
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo163onPreKeyEventZmokQxo(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if (r3.indicationNode == null) goto L40;
     */
    /* renamed from: updateCommon-O2vRcR0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m164updateCommonO2vRcR0(MutableInteractionSourceImpl mutableInteractionSourceImpl, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str, Role role, Function0 function0) {
        boolean z3;
        DelegatableNode delegatableNode;
        boolean z4 = true;
        if (Intrinsics.areEqual(this.userProvidedInteractionSource, mutableInteractionSourceImpl)) {
            z3 = false;
        } else {
            disposeInteractions();
            this.userProvidedInteractionSource = mutableInteractionSourceImpl;
            this.interactionSource = mutableInteractionSourceImpl;
            z3 = true;
        }
        if (!Intrinsics.areEqual(this.indicationNodeFactory, indicationNodeFactory)) {
            this.indicationNodeFactory = indicationNodeFactory;
            z3 = true;
        }
        if (this.useLocalIndication != z) {
            this.useLocalIndication = z;
            if (z) {
                onObservedReadsChanged();
            }
            z3 = true;
        }
        boolean z5 = this.enabled;
        FocusableNode focusableNode = this.focusableNode;
        if (z5 != z2) {
            if (z2) {
                delegate(focusableNode);
            } else {
                undelegate(focusableNode);
                disposeInteractions();
            }
            DepthSortedSetKt.requireLayoutNode(this).invalidateSemantics$ui();
            this.enabled = z2;
        }
        if (!Intrinsics.areEqual(this.onClickLabel, str)) {
            this.onClickLabel = str;
            DepthSortedSetKt.requireLayoutNode(this).invalidateSemantics$ui();
        }
        if (!Intrinsics.areEqual(this.role, role)) {
            this.role = role;
            DepthSortedSetKt.requireLayoutNode(this).invalidateSemantics$ui();
        }
        this.onClick = function0;
        boolean z6 = this.lazilyCreateIndication;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2 = this.userProvidedInteractionSource;
        if (z6 != (mutableInteractionSourceImpl2 == null)) {
            boolean z7 = mutableInteractionSourceImpl2 == null;
            this.lazilyCreateIndication = z7;
            if (!z7) {
            }
        }
        z4 = z3;
        if (z4 && ((delegatableNode = this.indicationNode) != null || !this.lazilyCreateIndication)) {
            if (delegatableNode != null) {
                undelegate(delegatableNode);
            }
            this.indicationNode = null;
            initializeIndicationAndInteractionSourceIfNeeded();
        }
        focusableNode.update(this.interactionSource);
    }

    public final void handlePressInteractionStart(PointerInputChange pointerInputChange) {
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.interactionSource;
        if (mutableInteractionSourceImpl != null) {
            PressInteraction.Press press = new PressInteraction.Press(pointerInputChange.m816getPositionF1C5BW0());
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            CanvasKt.traverseAncestorGestureConnections(this, new ClickableKt$$ExternalSyntheticLambda0(14, pointerInputChange, ref$BooleanRef));
            int i = 3;
            Continuation continuation = null;
            if (!ref$BooleanRef.element && !Clickable_androidKt.isComposeRootInScrollableContainer(this)) {
                this.pressInteraction = press;
                JobKt.launch$default(getCoroutineScope(), null, null, new TabContentViewKt$clickableWithRippleOnClick$2$1$1(mutableInteractionSourceImpl, press, continuation, i), 3);
            } else {
                this.delayJob = JobKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$1(mutableInteractionSourceImpl, press, this, continuation, 1), 3);
            }
        }
    }
}
