package com.squareup.cash.arcade.components;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class ToastKt$Toast$12$1$1 implements PointerInputEventHandler {
    public static final ToastKt$Toast$12$1$1 INSTANCE = new ToastKt$Toast$12$1$1();

    /* renamed from: com.squareup.cash.arcade.components.ToastKt$Toast$12$1$1$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i, Continuation continuation, int i2) {
            super(i, continuation);
            this.$r8$classId = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            switch (this.$r8$classId) {
                case 0:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation, 0);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                case 1:
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(2, continuation, 1);
                    anonymousClass12.L$0 = obj;
                    return anonymousClass12;
                case 2:
                    AnonymousClass1 anonymousClass13 = new AnonymousClass1(2, continuation, 2);
                    anonymousClass13.L$0 = obj;
                    return anonymousClass13;
                case 3:
                    AnonymousClass1 anonymousClass14 = new AnonymousClass1(2, continuation, 3);
                    anonymousClass14.L$0 = obj;
                    return anonymousClass14;
                default:
                    AnonymousClass1 anonymousClass15 = new AnonymousClass1(2, continuation, 4);
                    anonymousClass15.L$0 = obj;
                    return anonymousClass15;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
                case 0:
                    ((AnonymousClass1) create(pointerEventHandlerCoroutine, continuation)).invokeSuspend(Unit.INSTANCE);
                    break;
                case 1:
                    ((AnonymousClass1) create(pointerEventHandlerCoroutine, continuation)).invokeSuspend(Unit.INSTANCE);
                    break;
            }
            return ((AnonymousClass1) create(pointerEventHandlerCoroutine, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0136 A[LOOP:3: B:79:0x0130->B:81:0x0136, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0124  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x002a -> B:7:0x002e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00e3 -> B:51:0x00e7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0122 -> B:65:0x0126). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 332
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.cash.arcade.components.ToastKt$Toast$12$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        Object awaitPointerEventScope = ((SuspendingPointerInputModifierNodeImpl) pointerInputScope).awaitPointerEventScope(new AnonymousClass1(2, null, 0), continuation);
        return awaitPointerEventScope == CoroutineSingletons.COROUTINE_SUSPENDED ? awaitPointerEventScope : Unit.INSTANCE;
    }
}
