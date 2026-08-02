package com.squareup.cardcustomizations.signature;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class SignaturesKt$detectSignature$2 extends RestrictedSuspendLambda implements Function2 {
    public final /* synthetic */ Function0 $onEndSignature;
    public final /* synthetic */ Function1 $onSignatureChange;
    public final /* synthetic */ Function1 $onStartSignature;
    public int I$0;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignaturesKt$detectSignature$2(Function1 function1, Function1 function12, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.$onStartSignature = function1;
        this.$onSignatureChange = function12;
        this.$onEndSignature = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SignaturesKt$detectSignature$2 signaturesKt$detectSignature$2 = new SignaturesKt$detectSignature$2(this.$onStartSignature, this.$onSignatureChange, this.$onEndSignature, continuation);
        signaturesKt$detectSignature$2.L$0 = obj;
        return signaturesKt$detectSignature$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SignaturesKt$detectSignature$2) create((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if (r14 == r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0070, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0040 -> B:6:0x0043). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            this.L$0 = pointerEventHandlerCoroutine;
            this.I$0 = 1;
            this.label = 1;
            if (TapGestureDetectorKt.awaitFirstDown$default(pointerEventHandlerCoroutine, this, 2) != coroutineSingletons) {
                i = 1;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            SafeTrace.throwOnFailure(obj);
            List<PointerInputChange> list = ((PointerEvent) obj).changes;
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((PointerInputChange) it.next()).isConsumed()) {
                        break;
                    }
                }
            }
            boolean z = false;
            if (i != 0) {
                this.$onStartSignature.invoke(new Offset(((PointerInputChange) CollectionsKt.first(list)).position));
                i = 0;
            } else if (!z) {
                this.$onSignatureChange.invoke(new Offset(((PointerInputChange) CollectionsKt.first(list)).position));
                for (PointerInputChange pointerInputChange : list) {
                    if (!Offset.m622equalsimpl0(PointerEventKt.positionChangeInternal(pointerInputChange, false), 0L)) {
                        pointerInputChange.consume();
                    }
                }
            }
            if (!z) {
                List list3 = list;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        if (((PointerInputChange) it2.next()).pressed) {
                        }
                    }
                }
            }
            this.$onEndSignature.invoke();
            return Unit.INSTANCE;
        }
        i = this.I$0;
        SafeTrace.throwOnFailure(obj);
        this.L$0 = pointerEventHandlerCoroutine;
        this.I$0 = i;
        this.label = 2;
        obj = pointerEventHandlerCoroutine.awaitPointerEvent(PointerEventPass.Main, this);
    }
}
