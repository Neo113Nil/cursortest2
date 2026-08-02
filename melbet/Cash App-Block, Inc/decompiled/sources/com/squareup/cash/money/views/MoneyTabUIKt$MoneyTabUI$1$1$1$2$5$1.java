package com.squareup.cash.money.views;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.paging.CachedPagingDataKt$cachedIn$5;
import app.cash.local.views.internal.LocalBrandBannerKt$LocalBrandBanner$3$1$1$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda12;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MoneyTabUIKt$MoneyTabUI$1$1$1$2$5$1 implements PointerInputEventHandler {
    public final /* synthetic */ MutableState $isBadgePressed$delegate;
    public final /* synthetic */ int $r8$classId;

    /* renamed from: com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabUI$1$1$1$2$5$1$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2 {
        public final /* synthetic */ MutableState $isBadgePressed$delegate;
        public final /* synthetic */ int $r8$classId;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(MutableState mutableState, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$isBadgePressed$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            MutableState mutableState = this.$isBadgePressed$delegate;
            switch (i) {
                case 0:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(mutableState, continuation, 0);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                default:
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(mutableState, continuation, 1);
                    anonymousClass12.L$0 = obj;
                    return anonymousClass12;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(pointerEventHandlerCoroutine, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        
            if (androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(r0, r9, r8) == r6) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
        
            if (androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(r0, false, r9, r8) == r6) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
        
            if (androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(r0, androidx.compose.ui.input.pointer.PointerEventPass.Main, r8) == r6) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
        
            if (androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r0, r8, 2) == r6) goto L31;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            MutableState mutableState = this.$isBadgePressed$delegate;
            switch (i) {
                case 0:
                    SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = pointerEventHandlerCoroutine;
                        this.label = 1;
                        break;
                    } else if (i2 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else if (i2 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        mutableState.setValue(Boolean.FALSE);
                        break;
                    }
                    mutableState.setValue(Boolean.TRUE);
                    this.L$0 = null;
                    this.label = 2;
                    CachedPagingDataKt$cachedIn$5 cachedPagingDataKt$cachedIn$5 = TapGestureDetectorKt.NoPressGesture;
                    break;
                default:
                    SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine2 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        PointerEventPass pointerEventPass = PointerEventPass.Initial;
                        this.L$0 = pointerEventHandlerCoroutine2;
                        this.label = 1;
                        break;
                    } else if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else if (i3 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        mutableState.setValue(Boolean.FALSE);
                        break;
                    }
                    mutableState.setValue(Boolean.TRUE);
                    PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                    this.L$0 = null;
                    this.label = 2;
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MoneyTabUIKt$MoneyTabUI$1$1$1$2$5$1(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.$isBadgePressed$delegate = mutableState;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 0;
        Continuation continuation2 = null;
        MutableState mutableState = this.$isBadgePressed$delegate;
        switch (i) {
            case 0:
                Object awaitEachGesture = Draggable2DKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(mutableState, continuation2, i2), continuation);
                if (awaitEachGesture != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, new LocalBrandBannerKt$LocalBrandBanner$3$1$1$1(mutableState, continuation2, i2), null, continuation, 11);
                if (detectTapGestures$default != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object awaitEachGesture2 = Draggable2DKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(mutableState, continuation2, 1), continuation);
                if (awaitEachGesture2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object detectDragGestures$default = DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, null, null, new HeroTagViewKt$$ExternalSyntheticLambda12(19, mutableState), continuation, 7);
                if (detectDragGestures$default != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
