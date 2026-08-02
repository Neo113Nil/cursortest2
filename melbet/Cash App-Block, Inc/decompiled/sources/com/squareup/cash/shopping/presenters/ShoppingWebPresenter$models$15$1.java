package com.squareup.cash.shopping.presenters;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ShoppingWebPresenter$models$15$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CoroutineScope $scope;
    public final /* synthetic */ MutableState $state$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShoppingWebPresenter$models$15$1(CoroutineScope coroutineScope, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$scope = coroutineScope;
        this.$state$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$state$delegate;
        CoroutineScope coroutineScope = this.$scope;
        switch (i) {
            case 0:
                return new ShoppingWebPresenter$models$15$1(coroutineScope, mutableState, continuation, 0);
            case 1:
                return new ShoppingWebPresenter$models$15$1(coroutineScope, mutableState, continuation, 1);
            default:
                return new ShoppingWebPresenter$models$15$1(coroutineScope, mutableState, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((ShoppingWebPresenter$models$15$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ShoppingWebPresenter$models$15$1) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((ShoppingWebPresenter$models$15$1) create(bool2, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$state$delegate;
        CoroutineScope coroutineScope = this.$scope;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Set set = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                if (((ShoppingWebPresenter.State) mutableState.getValue()).showAutofillSuccessToast) {
                    JobKt.launch$default(coroutineScope, null, null, new HeroCardViewKt$Render$1$8$1.AnonymousClass3(mutableState, null, 14), 3);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope, null, null, new HeroCardViewKt$Render$1$8$1.AnonymousClass3(mutableState, null, 18), 3);
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope, null, null, new HeroCardViewKt$Render$1$8$1.AnonymousClass3(mutableState, null, 20), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
