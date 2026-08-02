package ru.yandex.taxi.view;

import defpackage.fe0;
import defpackage.ge0;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.view.AddFavoritesModalViewPresenter$setKeyBoardState$1", f = "AddFavoritesModalViewPresenter.kt", l = {102}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class AddFavoritesModalViewPresenter$setKeyBoardState$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isShowKeyBoard;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddFavoritesModalViewPresenter$setKeyBoardState$1(c cVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$isShowKeyBoard = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddFavoritesModalViewPresenter$setKeyBoardState$1(this.this$0, this.$isShowKeyBoard, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddFavoritesModalViewPresenter$setKeyBoardState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        boolean z = this.$isShowKeyBoard;
        fe0Var.getClass();
        ge0 a = ge0.a(ge0Var, null, null, null, null, false, z, null, 3583);
        this.label = 1;
        r0Var.emit(a, this);
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
