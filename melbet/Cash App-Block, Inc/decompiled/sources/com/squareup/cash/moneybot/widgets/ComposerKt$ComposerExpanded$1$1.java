package com.squareup.cash.moneybot.widgets;

import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ComposerKt$ComposerExpanded$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean $autoFocusEnabled;
    public final /* synthetic */ FocusRequester $focusRequester;
    public final /* synthetic */ DelegatingSoftwareKeyboardController $keyboardController;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposerKt$ComposerExpanded$1$1(boolean z, FocusRequester focusRequester, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$autoFocusEnabled = z;
        this.$focusRequester = focusRequester;
        this.$keyboardController = delegatingSoftwareKeyboardController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new ComposerKt$ComposerExpanded$1$1(this.$autoFocusEnabled, this.$focusRequester, this.$keyboardController, continuation, 0);
            case 1:
                return new ComposerKt$ComposerExpanded$1$1(this.$autoFocusEnabled, this.$focusRequester, this.$keyboardController, continuation, 1);
            case 2:
                return new ComposerKt$ComposerExpanded$1$1(this.$autoFocusEnabled, this.$focusRequester, this.$keyboardController, continuation, 2);
            default:
                return new ComposerKt$ComposerExpanded$1$1(this.$autoFocusEnabled, this.$focusRequester, this.$keyboardController, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ComposerKt$ComposerExpanded$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = this.$keyboardController;
        FocusRequester focusRequester = this.$focusRequester;
        boolean z = this.$autoFocusEnabled;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (z) {
                    FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
                    if (delegatingSoftwareKeyboardController != null) {
                        delegatingSoftwareKeyboardController.show();
                    }
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (z) {
                    FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
                    if (delegatingSoftwareKeyboardController != null) {
                        delegatingSoftwareKeyboardController.show();
                    }
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (z) {
                    FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
                    if (delegatingSoftwareKeyboardController != null) {
                        delegatingSoftwareKeyboardController.show();
                    }
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (z) {
                    FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
                    if (delegatingSoftwareKeyboardController != null) {
                        delegatingSoftwareKeyboardController.show();
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
