package app.cash.local.presenters.cart;

import androidx.compose.runtime.MutableState;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.OpenTabCartOverride;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.presenters.cart.OpenTabAddRoundResult;
import app.cash.local.presenters.cart.OpenTabAddRoundState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardModelView$1$3$4$2;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LocalBrandLocationCartPresenter$models$8$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ LocalCart $activeCart;
    public final /* synthetic */ int $addRoundAttemptId;
    public final /* synthetic */ int $addedItemCount;
    public final /* synthetic */ MutableState $createCartViewModels$delegate;
    public final /* synthetic */ CartBuilder $latestOpenCart;
    public final /* synthetic */ MutableState $loadingResponse$delegate;
    public final /* synthetic */ MutableState $openTabAddRoundState$delegate;
    public final /* synthetic */ String $preSubmitBuyerInfoCartVersion;
    public final /* synthetic */ CoroutineScope $updateCoroutineScope;
    public int label;
    public final /* synthetic */ LocalBrandLocationCartPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrandLocationCartPresenter$models$8$1(LocalBrandLocationCartPresenter localBrandLocationCartPresenter, LocalCart localCart, CartBuilder cartBuilder, int i, String str, int i2, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = localBrandLocationCartPresenter;
        this.$activeCart = localCart;
        this.$latestOpenCart = cartBuilder;
        this.$addRoundAttemptId = i;
        this.$preSubmitBuyerInfoCartVersion = str;
        this.$addedItemCount = i2;
        this.$updateCoroutineScope = coroutineScope;
        this.$createCartViewModels$delegate = mutableState;
        this.$openTabAddRoundState$delegate = mutableState2;
        this.$loadingResponse$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocalBrandLocationCartPresenter$models$8$1(this.this$0, this.$activeCart, this.$latestOpenCart, this.$addRoundAttemptId, this.$preSubmitBuyerInfoCartVersion, this.$addedItemCount, this.$updateCoroutineScope, this.$createCartViewModels$delegate, this.$openTabAddRoundState$delegate, this.$loadingResponse$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LocalBrandLocationCartPresenter$models$8$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        CartBuilder cartBuilder = this.$latestOpenCart;
        LocalCart localCart = this.$activeCart;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            CoroutineScope coroutineScope = this.$updateCoroutineScope;
            LocalBrandLocationCartPresenter localBrandLocationCartPresenter = this.this$0;
            CardModelView$1$3$4$2 cardModelView$1$3$4$2 = new CardModelView$1$3$4$2(1, coroutineScope, localBrandLocationCartPresenter);
            this.label = 1;
            obj = LocalBrandLocationCartPresenter.access$addSelectionsToOpenTab(localBrandLocationCartPresenter, localCart, cartBuilder, cardModelView$1$3$4$2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        OpenTabAddRoundResult openTabAddRoundResult = (OpenTabAddRoundResult) obj;
        boolean z = openTabAddRoundResult instanceof OpenTabAddRoundResult.Failure;
        int i2 = this.$addRoundAttemptId;
        MutableState mutableState = this.$openTabAddRoundState$delegate;
        if (z) {
            this.$createCartViewModels$delegate.setValue(((OpenTabAddRoundResult.Failure) openTabAddRoundResult).errors);
            mutableState.setValue(new OpenTabAddRoundState.Failure(i2));
        } else {
            if (!(openTabAddRoundResult instanceof OpenTabAddRoundResult.Success)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            ((RealCartBuilder) cartBuilder).openTabCartOverrideState.setValue(new OpenTabCartOverride(((OpenTabAddRoundResult.Success) openTabAddRoundResult).updatedCart, this.$preSubmitBuyerInfoCartVersion, localCart.version));
            mutableState.setValue(new OpenTabAddRoundState.Ordered(this.$addedItemCount, i2));
        }
        this.$loadingResponse$delegate.setValue(Boolean.valueOf(false));
        return Unit.INSTANCE;
    }
}
