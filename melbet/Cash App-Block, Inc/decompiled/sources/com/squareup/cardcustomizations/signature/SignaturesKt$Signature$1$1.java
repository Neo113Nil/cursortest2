package com.squareup.cardcustomizations.signature;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import app.cash.local.views.LocalViewFactory$createUi$view$3$1$1$1;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import bo.app.xg$$ExternalSyntheticLambda9;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryScene;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.components.custom.order.GraphState;
import com.squareup.cash.investing.components.custom.order.PriceWidgetState;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda5;
import com.squareup.cash.transfers.views.WithdrawViewKt$WithdrawAmountView$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes5.dex */
public final class SignaturesKt$Signature$1$1 implements PointerInputEventHandler {
    public final /* synthetic */ Object $fadingStrokes$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $signatureState;
    public final /* synthetic */ Object $stateListener;

    public SignaturesKt$Signature$1$1(CardDesignLibraryScene cardDesignLibraryScene, MutableState mutableState, MutableState mutableState2) {
        this.$r8$classId = 2;
        this.$stateListener = cardDesignLibraryScene;
        this.$fadingStrokes$delegate = mutableState;
        this.$signatureState = mutableState2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.$signatureState;
        Object obj2 = this.$stateListener;
        Object obj3 = this.$fadingStrokes$delegate;
        switch (i) {
            case 0:
                SignatureStateListener signatureStateListener = (SignatureStateListener) obj2;
                SignatureState signatureState = (SignatureState) obj;
                Object awaitEachGesture = Draggable2DKt.awaitEachGesture(pointerInputScope, new SignaturesKt$detectSignature$2(new CombinedModifier$$ExternalSyntheticLambda0(11, signatureStateListener, signatureState), new xg$$ExternalSyntheticLambda9(signatureState, 22), new CopyCodeKt$$ExternalSyntheticLambda4(2, signatureStateListener, signatureState, (MutableState) obj3), null), continuation);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (awaitEachGesture != coroutineSingletons) {
                    awaitEachGesture = Unit.INSTANCE;
                }
                if (awaitEachGesture != coroutineSingletons) {
                    break;
                }
                break;
            case 1:
                Object awaitPointerEventScope = ((SuspendingPointerInputModifierNodeImpl) pointerInputScope).awaitPointerEventScope(new LocalViewFactory$createUi$view$3$1$1$1.AnonymousClass1((MutableState) obj3, (CoroutineScope) obj2, (MutableSharedFlow) obj, null, 6), continuation);
                if (awaitPointerEventScope != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object awaitEachGesture2 = Draggable2DKt.awaitEachGesture(pointerInputScope, new CardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1((CardDesignLibraryScene) obj2, (MutableState) obj3, (MutableState) obj, null), continuation);
                if (awaitEachGesture2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object detectDragGestures$default = DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, new InviteContactsBodyKt$$ExternalSyntheticLambda5(8, (Function1) obj2), null, new SkipPaymentView$$ExternalSyntheticLambda1(23, (PriceWidgetState) obj, (GraphState) obj3), continuation, 6);
                if (detectDragGestures$default != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object awaitPointerEventScope2 = ((SuspendingPointerInputModifierNodeImpl) pointerInputScope).awaitPointerEventScope(new LocalViewFactory$createUi$view$3$1$1$1.AnonymousClass1((FocusRequester) obj2, (View) obj, (Context) obj3, null, 8), continuation);
                if (awaitPointerEventScope2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object coroutineScope = JobKt.coroutineScope(new WithdrawViewKt$WithdrawAmountView$1$1(pointerInputScope, (MutableState) obj3, (MutableState) obj2, (MutableSharedFlow) obj, null, 5), continuation);
                if (coroutineScope != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SignaturesKt$Signature$1$1(MutableState mutableState, Object obj, MutableSharedFlow mutableSharedFlow, int i) {
        this.$r8$classId = i;
        this.$fadingStrokes$delegate = mutableState;
        this.$stateListener = obj;
        this.$signatureState = mutableSharedFlow;
    }

    public /* synthetic */ SignaturesKt$Signature$1$1(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.$stateListener = obj;
        this.$signatureState = obj2;
        this.$fadingStrokes$delegate = obj3;
    }
}
