package com.squareup.cash.blockers.views;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class SsnViewKt$SsnContent$3$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ FocusRequester $focusRequester;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SsnViewKt$SsnContent$3$1$1(FocusRequester focusRequester, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$focusRequester = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new SsnViewKt$SsnContent$3$1$1(this.$focusRequester, continuation, 0);
            case 1:
                return new SsnViewKt$SsnContent$3$1$1(this.$focusRequester, continuation, 1);
            case 2:
                return new SsnViewKt$SsnContent$3$1$1(this.$focusRequester, continuation, 2);
            case 3:
                return new SsnViewKt$SsnContent$3$1$1(this.$focusRequester, continuation, 3);
            case 4:
                return new SsnViewKt$SsnContent$3$1$1(this.$focusRequester, continuation, 4);
            case 5:
                return new SsnViewKt$SsnContent$3$1$1(this.$focusRequester, continuation, 5);
            case 6:
                return new SsnViewKt$SsnContent$3$1$1(this.$focusRequester, continuation, 6);
            case 7:
                return new SsnViewKt$SsnContent$3$1$1(this.$focusRequester, continuation, 7);
            case 8:
                return new SsnViewKt$SsnContent$3$1$1(this.$focusRequester, continuation, 8);
            case 9:
                return new SsnViewKt$SsnContent$3$1$1(this.$focusRequester, continuation, 9);
            default:
                return new SsnViewKt$SsnContent$3$1$1(this.$focusRequester, continuation, 10);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((SsnViewKt$SsnContent$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        FocusRequester focusRequester = this.$focusRequester;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
                break;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
                break;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
                break;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
                break;
            default:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
                break;
        }
        return Unit.INSTANCE;
    }
}
