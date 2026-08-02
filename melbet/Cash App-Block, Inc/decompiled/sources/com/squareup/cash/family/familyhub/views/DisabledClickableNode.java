package com.squareup.cash.family.familyhub.views;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material.RippleNodeFactory$create$colorProducer$1;
import androidx.compose.material.ripple.AndroidRippleNode;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.RoomDatabase$performClear$1;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final class DisabledClickableNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public boolean enabled;
    public final MutableInteractionSourceImpl interactionSource;
    public Function0 onClick;
    public PressInteraction.Press pressInteraction;

    public DisabledClickableNode(Function0 function0, boolean z) {
        function0.getClass();
        this.enabled = z;
        this.onClick = function0;
        this.interactionSource = new MutableInteractionSourceImpl();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        RippleNodeFactory$create$colorProducer$1 rippleNodeFactory$create$colorProducer$1 = new RippleNodeFactory$create$colorProducer$1(this, 4);
        ArcadeModal$$ExternalSyntheticLambda2 arcadeModal$$ExternalSyntheticLambda2 = new ArcadeModal$$ExternalSyntheticLambda2(this, 22);
        TweenSpec tweenSpec = RippleKt.DefaultTweenSpec;
        delegate(new AndroidRippleNode(this.interactionSource, true, Float.NaN, rippleNodeFactory$create$colorProducer$1, arcadeModal$$ExternalSyntheticLambda2));
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        JobKt.launch$default(getCoroutineScope(), null, null, new GooglePayPresenter$models$1$1(this, null, 23), 3);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo162onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        boolean z;
        pointerEvent.getClass();
        if (!this.enabled && pointerEventPass == PointerEventPass.Initial) {
            for (PointerInputChange pointerInputChange : pointerEvent.changes) {
                boolean changedToDown = PointerEventKt.changedToDown(pointerInputChange);
                long j2 = pointerInputChange.position;
                Continuation continuation = null;
                if (changedToDown) {
                    pointerInputChange.consume();
                    JobKt.launch$default(getCoroutineScope(), null, null, new RealFidesmoClient$observeDeviceState$1(this, pointerInputChange, continuation, 16), 3);
                } else if (PointerEventKt.changedToUp(pointerInputChange)) {
                    pointerInputChange.consume();
                    float f = (int) (j >> 32);
                    float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
                    if (RecyclerView.DECELERATION_RATE <= intBitsToFloat && intBitsToFloat <= f) {
                        float f2 = (int) (j & BodyPartID.bodyIdMax);
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax));
                        if (RecyclerView.DECELERATION_RATE <= intBitsToFloat2 && intBitsToFloat2 <= f2) {
                            z = true;
                            JobKt.launch$default(getCoroutineScope(), null, null, new RoomDatabase$performClear$1(this, z, continuation, 8), 3);
                        }
                    }
                    z = false;
                    JobKt.launch$default(getCoroutineScope(), null, null, new RoomDatabase$performClear$1(this, z, continuation, 8), 3);
                }
            }
        }
    }
}
