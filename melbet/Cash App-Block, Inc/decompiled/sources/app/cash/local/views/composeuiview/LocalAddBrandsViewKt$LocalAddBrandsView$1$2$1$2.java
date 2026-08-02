package app.cash.local.views.composeuiview;

import androidx.room.TransactionScope;
import app.cash.local.viewmodels.LocalSearchViewEvent$SearchInput;
import app.cash.local.viewmodels.wallet.BrandCollectionEvent;
import com.squareup.cash.phoneplans.WirelessProviderListViewEvent;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2(Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.$onEvent = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2 localAddBrandsViewKt$LocalAddBrandsView$1$2$1$2 = new LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2(this.$onEvent, continuation, 0);
                localAddBrandsViewKt$LocalAddBrandsView$1$2$1$2.L$0 = obj;
                return localAddBrandsViewKt$LocalAddBrandsView$1$2$1$2;
            case 1:
                LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2 localAddBrandsViewKt$LocalAddBrandsView$1$2$1$22 = new LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2(continuation, this.$onEvent);
                localAddBrandsViewKt$LocalAddBrandsView$1$2$1$22.L$0 = obj;
                return localAddBrandsViewKt$LocalAddBrandsView$1$2$1$22;
            case 2:
                LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2 localAddBrandsViewKt$LocalAddBrandsView$1$2$1$23 = new LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2(this.$onEvent, continuation, 2);
                localAddBrandsViewKt$LocalAddBrandsView$1$2$1$23.L$0 = obj;
                return localAddBrandsViewKt$LocalAddBrandsView$1$2$1$23;
            case 3:
                LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2 localAddBrandsViewKt$LocalAddBrandsView$1$2$1$24 = new LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2(this.$onEvent, continuation, 3);
                localAddBrandsViewKt$LocalAddBrandsView$1$2$1$24.L$0 = obj;
                return localAddBrandsViewKt$LocalAddBrandsView$1$2$1$24;
            case 4:
                LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2 localAddBrandsViewKt$LocalAddBrandsView$1$2$1$25 = new LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2(this.$onEvent, continuation, 4);
                localAddBrandsViewKt$LocalAddBrandsView$1$2$1$25.L$0 = obj;
                return localAddBrandsViewKt$LocalAddBrandsView$1$2$1$25;
            case 5:
                LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2 localAddBrandsViewKt$LocalAddBrandsView$1$2$1$26 = new LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2(this.$onEvent, continuation, 5);
                localAddBrandsViewKt$LocalAddBrandsView$1$2$1$26.L$0 = obj;
                return localAddBrandsViewKt$LocalAddBrandsView$1$2$1$26;
            default:
                LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2 localAddBrandsViewKt$LocalAddBrandsView$1$2$1$27 = new LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2(this.$onEvent, continuation, 6);
                localAddBrandsViewKt$LocalAddBrandsView$1$2$1$27.L$0 = obj;
                return localAddBrandsViewKt$LocalAddBrandsView$1$2$1$27;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2) create((CharSequence) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2) create((TransactionScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2) create((CharSequence) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2) create((CharSequence) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2) create((CharSequence) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2) create((CardSchemeViewModel.Module.HeroCardDetails) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.$onEvent;
        switch (i) {
            case 0:
                CharSequence charSequence = (CharSequence) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new LocalSearchViewEvent$SearchInput(charSequence.toString()));
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TransactionScope transactionScope = (TransactionScope) this.L$0;
                transactionScope.getClass();
                break;
            case 2:
                CharSequence charSequence2 = (CharSequence) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(charSequence2.toString());
                break;
            case 3:
                CharSequence charSequence3 = (CharSequence) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new BrandCollectionEvent.SearchInputChanged(charSequence3.toString()));
                break;
            case 4:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(coroutineScope);
                break;
            case 5:
                CharSequence charSequence4 = (CharSequence) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new WirelessProviderListViewEvent.SearchTextChanged(charSequence4.toString()));
                break;
            default:
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) this.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(heroCardDetails);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2(Function1 function1, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$onEvent = function1;
    }
}
