package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction$Enter;
import androidx.compose.foundation.interaction.HoverInteraction$Exit;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.PointerInputModifierNode;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class HoverableNode extends Modifier.Node implements PointerInputModifierNode {
    public HoverInteraction$Enter hoverInteraction;
    public MutableInteractionSourceImpl interactionSource;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$emitEnter(HoverableNode hoverableNode, ContinuationImpl continuationImpl) {
        HoverableNode$emitEnter$1 hoverableNode$emitEnter$1;
        int i;
        HoverInteraction$Enter hoverInteraction$Enter;
        if (continuationImpl instanceof HoverableNode$emitEnter$1) {
            hoverableNode$emitEnter$1 = (HoverableNode$emitEnter$1) continuationImpl;
            int i2 = hoverableNode$emitEnter$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                hoverableNode$emitEnter$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = hoverableNode$emitEnter$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hoverableNode$emitEnter$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (hoverableNode.hoverInteraction == null) {
                        HoverInteraction$Enter hoverInteraction$Enter2 = new HoverInteraction$Enter();
                        MutableInteractionSourceImpl mutableInteractionSourceImpl = hoverableNode.interactionSource;
                        hoverableNode$emitEnter$1.L$0 = hoverInteraction$Enter2;
                        hoverableNode$emitEnter$1.label = 1;
                        if (mutableInteractionSourceImpl.emit(hoverInteraction$Enter2, hoverableNode$emitEnter$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        hoverInteraction$Enter = hoverInteraction$Enter2;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hoverInteraction$Enter = hoverableNode$emitEnter$1.L$0;
                SafeTrace.throwOnFailure(obj);
                hoverableNode.hoverInteraction = hoverInteraction$Enter;
                return Unit.INSTANCE;
            }
        }
        hoverableNode$emitEnter$1 = new HoverableNode$emitEnter$1(hoverableNode, continuationImpl);
        Object obj2 = hoverableNode$emitEnter$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hoverableNode$emitEnter$1.label;
        if (i != 0) {
        }
        hoverableNode.hoverInteraction = hoverInteraction$Enter;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$emitExit(HoverableNode hoverableNode, ContinuationImpl continuationImpl) {
        HoverableNode$emitExit$1 hoverableNode$emitExit$1;
        int i;
        if (continuationImpl instanceof HoverableNode$emitExit$1) {
            hoverableNode$emitExit$1 = (HoverableNode$emitExit$1) continuationImpl;
            int i2 = hoverableNode$emitExit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                hoverableNode$emitExit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = hoverableNode$emitExit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hoverableNode$emitExit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    HoverInteraction$Enter hoverInteraction$Enter = hoverableNode.hoverInteraction;
                    if (hoverInteraction$Enter != null) {
                        HoverInteraction$Exit hoverInteraction$Exit = new HoverInteraction$Exit(hoverInteraction$Enter);
                        MutableInteractionSourceImpl mutableInteractionSourceImpl = hoverableNode.interactionSource;
                        hoverableNode$emitExit$1.label = 1;
                        if (mutableInteractionSourceImpl.emit(hoverInteraction$Exit, hoverableNode$emitExit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                hoverableNode.hoverInteraction = null;
                return Unit.INSTANCE;
            }
        }
        hoverableNode$emitExit$1 = new HoverableNode$emitExit$1(hoverableNode, continuationImpl);
        Object obj2 = hoverableNode$emitExit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hoverableNode$emitExit$1.label;
        if (i != 0) {
        }
        hoverableNode.hoverInteraction = null;
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        tryEmitExit();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        tryEmitExit();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo162onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.Main) {
            int i = pointerEvent.f858type;
            Continuation continuation = null;
            if (i == 4) {
                JobKt.launch$default(getCoroutineScope(), null, null, new HoverableNode$onPointerEvent$1(this, continuation, 0), 3);
            } else if (i == 5) {
                JobKt.launch$default(getCoroutineScope(), null, null, new HoverableNode$onPointerEvent$1(this, continuation, 1), 3);
            }
        }
    }

    public final void tryEmitExit() {
        HoverInteraction$Enter hoverInteraction$Enter = this.hoverInteraction;
        if (hoverInteraction$Enter != null) {
            this.interactionSource.tryEmit(new HoverInteraction$Exit(hoverInteraction$Enter));
            this.hoverInteraction = null;
        }
    }
}
