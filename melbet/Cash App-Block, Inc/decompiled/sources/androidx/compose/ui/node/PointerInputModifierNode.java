package androidx.compose.ui.node;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.media3.extractor.text.CueEncoder;

/* loaded from: classes.dex */
public interface PointerInputModifierNode extends DelegatableNode {
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    default long mo376getTouchBoundsExpansionRZrCHBk() {
        int i = TouchBoundsExpansion.$r8$clinit;
        return CueEncoder.m1147getNoneRZrCHBk();
    }

    default void interceptOutOfBoundsChildEvents() {
    }

    void onCancelPointerInput();

    default void onDensityChange() {
        onCancelPointerInput();
    }

    /* renamed from: onPointerEvent-H0pRuoY */
    void mo162onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j);

    default void onViewConfigurationChange() {
        onCancelPointerInput();
    }

    default boolean sharePointerInputWithSiblings() {
        return false;
    }
}
