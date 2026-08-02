package ru.yandex.taxi.view;

import defpackage.avj0;
import defpackage.fe0;
import defpackage.ge0;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.view.AddFavoritesModalViewPresenter$showErrorMessage$1", f = "AddFavoritesModalViewPresenter.kt", l = {HProv.PP_HANDLE_COUNT}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class AddFavoritesModalViewPresenter$showErrorMessage$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $errorMessage;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddFavoritesModalViewPresenter$showErrorMessage$1(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$errorMessage = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddFavoritesModalViewPresenter$showErrorMessage$1(this.this$0, this.$errorMessage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddFavoritesModalViewPresenter$showErrorMessage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        r0 r0Var = cVar.J;
        fe0 fe0Var = cVar.y;
        ge0 ge0Var = (ge0) r0Var.getValue();
        String str = this.$errorMessage;
        if (str == null) {
            str = ((avj0) this.this$0.E).h(kyh0.common_unknown_error);
        }
        fe0Var.getClass();
        ge0 a = ge0.a(ge0Var, null, null, null, null, false, false, str, 2047);
        this.label = 1;
        r0Var.emit(a, this);
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
