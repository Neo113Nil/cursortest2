package app.cash.redwood.compose;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import com.squareup.cash.moneybot.views.home.ParticleGridRenderer;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* loaded from: classes3.dex */
public final class HostFocusDirectorKt$depthFirst$1 extends RestrictedSuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $this_depthFirst;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HostFocusDirectorKt$depthFirst$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$this_depthFirst = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$this_depthFirst;
        switch (i) {
            case 0:
                HostFocusDirectorKt$depthFirst$1 hostFocusDirectorKt$depthFirst$1 = new HostFocusDirectorKt$depthFirst$1((List) obj2, continuation, 0);
                hostFocusDirectorKt$depthFirst$1.L$0 = obj;
                return hostFocusDirectorKt$depthFirst$1;
            case 1:
                HostFocusDirectorKt$depthFirst$1 hostFocusDirectorKt$depthFirst$12 = new HostFocusDirectorKt$depthFirst$1((AndroidEdgeEffectOverscrollEffect) obj2, continuation, 1);
                hostFocusDirectorKt$depthFirst$12.L$0 = obj;
                return hostFocusDirectorKt$depthFirst$12;
            case 2:
                HostFocusDirectorKt$depthFirst$1 hostFocusDirectorKt$depthFirst$13 = new HostFocusDirectorKt$depthFirst$1((TextFieldSelectionState) obj2, continuation, 2);
                hostFocusDirectorKt$depthFirst$13.L$0 = obj;
                return hostFocusDirectorKt$depthFirst$13;
            case 3:
                HostFocusDirectorKt$depthFirst$1 hostFocusDirectorKt$depthFirst$14 = new HostFocusDirectorKt$depthFirst$1((PointerEventPass) obj2, continuation, 3);
                hostFocusDirectorKt$depthFirst$14.L$0 = obj;
                return hostFocusDirectorKt$depthFirst$14;
            default:
                HostFocusDirectorKt$depthFirst$1 hostFocusDirectorKt$depthFirst$15 = new HostFocusDirectorKt$depthFirst$1((ParticleGridRenderer) obj2, continuation, 4);
                hostFocusDirectorKt$depthFirst$15.L$0 = obj;
                return hostFocusDirectorKt$depthFirst$15;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((HostFocusDirectorKt$depthFirst$1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((HostFocusDirectorKt$depthFirst$1) create((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                ((HostFocusDirectorKt$depthFirst$1) create((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 3:
                return ((HostFocusDirectorKt$depthFirst$1) create((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                ((HostFocusDirectorKt$depthFirst$1) create((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002c -> B:7:0x0030). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d7 -> B:35:0x00db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0134 -> B:47:0x0138). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.cash.redwood.compose.HostFocusDirectorKt$depthFirst$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
