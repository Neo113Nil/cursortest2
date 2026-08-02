package androidx.compose.ui.input.pointer;

import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TouchBoundsExpansion;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.platform.AndroidComposeView$focusSearch$searchResult$1;
import androidx.media3.extractor.text.CueEncoder;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public abstract class HoverIconModifierNode extends Modifier.Node implements TraversableNode, PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public boolean cursorInBoundsOfNode;
    public DpTouchBoundsExpansion dpTouchBoundsExpansion;
    public AndroidPointerIconType icon;

    public HoverIconModifierNode(AndroidPointerIconType androidPointerIconType, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
        this.icon = androidPointerIconType;
    }

    public final void displayIcon() {
        AndroidPointerIconType androidPointerIconType;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        DepthSortedSetKt.traverseAncestors(this, new Function1(ref$ObjectRef) { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$findOverridingAncestorNode$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((HoverIconModifierNode) obj).getClass();
                return Boolean.TRUE;
            }
        });
        HoverIconModifierNode hoverIconModifierNode = (HoverIconModifierNode) ref$ObjectRef.element;
        if (hoverIconModifierNode == null || (androidPointerIconType = hoverIconModifierNode.icon) == null) {
            androidPointerIconType = this.icon;
        }
        displayIcon(androidPointerIconType);
    }

    public abstract void displayIcon(PointerIcon pointerIcon);

    public final void displayIconIfDescendantsDoNotHavePriority() {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        DepthSortedSetKt.traverseDescendants(this, new BoundsAnimation$animate$1(ref$BooleanRef, 7));
        if (ref$BooleanRef.element) {
            displayIcon();
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public final long mo376getTouchBoundsExpansionRZrCHBk() {
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.dpTouchBoundsExpansion;
        if (dpTouchBoundsExpansion != null) {
            return dpTouchBoundsExpansion.m869roundToTouchBoundsExpansionTW6G1oQ(DepthSortedSetKt.requireLayoutNode(this).density);
        }
        int i = TouchBoundsExpansion.$r8$clinit;
        return CueEncoder.m1147getNoneRZrCHBk();
    }

    /* renamed from: isRelevantPointerType-uerMTgs, reason: not valid java name */
    public abstract boolean mo798isRelevantPointerTypeuerMTgs(int i);

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        onExit();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        onExit();
        super.onDetach();
    }

    public final void onExit() {
        if (this.cursorInBoundsOfNode) {
            this.cursorInBoundsOfNode = false;
            if (isAttached()) {
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                DepthSortedSetKt.traverseAncestors(this, new AndroidComposeView$focusSearch$searchResult$1(1, ref$ObjectRef));
                HoverIconModifierNode hoverIconModifierNode = (HoverIconModifierNode) ref$ObjectRef.element;
                if (hoverIconModifierNode != null) {
                    hoverIconModifierNode.displayIcon();
                } else {
                    displayIcon(null);
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo162onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.Main) {
            List list = pointerEvent.changes;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (mo798isRelevantPointerTypeuerMTgs(((PointerInputChange) list.get(i)).m818getTypeT8wyACA())) {
                    int i2 = pointerEvent.f858type;
                    if (i2 == 4) {
                        this.cursorInBoundsOfNode = true;
                        displayIconIfDescendantsDoNotHavePriority();
                        return;
                    } else {
                        if (i2 == 5) {
                            onExit();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }
}
