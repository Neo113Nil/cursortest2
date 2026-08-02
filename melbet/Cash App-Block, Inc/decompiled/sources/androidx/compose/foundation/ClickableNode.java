package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes.dex */
public class ClickableNode extends AbstractClickableNode {
    public PointerInputChange downEvent;
    public IndirectPointerInputChange indirectDownEvent;

    public final void cancelInput(boolean z) {
        if (z) {
            this.indirectDownEvent = null;
        } else {
            this.downEvent = null;
        }
        handlePressInteractionCancel(z);
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public final void onCancelIndirectPointerInput() {
        cancelInput(true);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        super.onCancelPointerInput();
        cancelInput(false);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyDownEvent-ZmokQxo */
    public final boolean mo159onClickKeyDownEventZmokQxo(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyUpEvent-ZmokQxo */
    public final void mo160onClickKeyUpEventZmokQxo(KeyEvent keyEvent) {
        this.onClick.invoke();
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public final void onIndirectPointerEvent(HuffmanTreeGroup huffmanTreeGroup, PointerEventPass pointerEventPass) {
        initializeIndicationAndInteractionSourceIfNeeded();
        if (this.enabled && this.gestureNode == null) {
            GestureNode gestureNode = CanvasKt.gestureNode(this);
            delegate(gestureNode);
            this.gestureNode = gestureNode;
        }
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.indirectDownEvent == null) {
                return;
            }
            List changes = huffmanTreeGroup.getChanges();
            int size = changes.size();
            for (int i = 0; i < size; i++) {
                IndirectPointerInputChange indirectPointerInputChange = (IndirectPointerInputChange) ((ArrayList) changes).get(i);
                if (indirectPointerInputChange.isConsumed() && indirectPointerInputChange != this.indirectDownEvent) {
                    cancelInput(true);
                    return;
                }
            }
            return;
        }
        if (this.indirectDownEvent == null) {
            List changes2 = huffmanTreeGroup.getChanges();
            int size2 = changes2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (Draggable2DKt.changedToDownIgnoreConsumed((IndirectPointerInputChange) ((ArrayList) changes2).get(i2))) {
                    IndirectPointerInputChange indirectPointerInputChange2 = (IndirectPointerInputChange) ((ArrayList) huffmanTreeGroup.getChanges()).get(0);
                    indirectPointerInputChange2.consume();
                    this.indirectDownEvent = indirectPointerInputChange2;
                    if (this.enabled) {
                        handlePressInteractionStart(indirectPointerInputChange2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        List changes3 = huffmanTreeGroup.getChanges();
        int size3 = changes3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            IndirectPointerInputChange indirectPointerInputChange3 = (IndirectPointerInputChange) ((ArrayList) changes3).get(i3);
            if (indirectPointerInputChange3.isConsumed() || !indirectPointerInputChange3.getPreviousPressed() || indirectPointerInputChange3.getPressed()) {
                float touchSlop = ((ViewConfiguration) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalViewConfiguration)).getTouchSlop();
                List changes4 = huffmanTreeGroup.getChanges();
                int size4 = changes4.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    IndirectPointerInputChange indirectPointerInputChange4 = (IndirectPointerInputChange) ((ArrayList) changes4).get(i4);
                    long m770getPositionF1C5BW0 = indirectPointerInputChange4.m770getPositionF1C5BW0();
                    IndirectPointerInputChange indirectPointerInputChange5 = this.indirectDownEvent;
                    indirectPointerInputChange5.getClass();
                    boolean z = Math.abs(Offset.m623getDistanceimpl(Offset.m625minusMKHz9U(m770getPositionF1C5BW0, indirectPointerInputChange5.m770getPositionF1C5BW0()))) > touchSlop;
                    if (indirectPointerInputChange4.isConsumed() || z) {
                        cancelInput(true);
                        return;
                    }
                }
                return;
            }
        }
        ((IndirectPointerInputChange) ((ArrayList) huffmanTreeGroup.getChanges()).get(0)).consume();
        if (this.enabled) {
            IndirectPointerInputChange indirectPointerInputChange6 = this.indirectDownEvent;
            indirectPointerInputChange6.getClass();
            m158handlePressInteractionRelease3MmeM6k(indirectPointerInputChange6.m770getPositionF1C5BW0(), true);
            this.onClick.invoke();
        }
        this.indirectDownEvent = null;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode, androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo162onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        boolean isChangedToDown;
        super.mo162onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.downEvent == null) {
                return;
            }
            List list = pointerEvent.changes;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                PointerInputChange pointerInputChange = (PointerInputChange) list.get(i);
                if (pointerInputChange.isConsumed() && pointerInputChange != this.downEvent) {
                    cancelInput(false);
                    return;
                }
            }
            return;
        }
        if (this.downEvent == null) {
            isChangedToDown = TapGestureDetectorKt.isChangedToDown(pointerEvent, true, false);
            if (isChangedToDown) {
                PointerInputChange pointerInputChange2 = (PointerInputChange) pointerEvent.changes.get(0);
                pointerInputChange2.consume();
                this.downEvent = pointerInputChange2;
                if (this.enabled) {
                    handlePressInteractionStart(pointerInputChange2);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = pointerEvent.changes;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!PointerEventKt.changedToUp((PointerInputChange) list2.get(i2))) {
                long m157getExtendedTouchPaddinghWWAJMo = m157getExtendedTouchPaddinghWWAJMo(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    PointerInputChange pointerInputChange3 = (PointerInputChange) list2.get(i3);
                    if (pointerInputChange3.isConsumed() || PointerEventKt.m807isOutOfBoundsjwHxaWs(pointerInputChange3, j, m157getExtendedTouchPaddinghWWAJMo)) {
                        cancelInput(false);
                        return;
                    }
                }
                return;
            }
        }
        ((PointerInputChange) list2.get(0)).consume();
        if (this.enabled) {
            PointerInputChange pointerInputChange4 = this.downEvent;
            pointerInputChange4.getClass();
            m158handlePressInteractionRelease3MmeM6k(pointerInputChange4.m816getPositionF1C5BW0(), false);
            this.onClick.invoke();
        }
        this.downEvent = null;
    }
}
