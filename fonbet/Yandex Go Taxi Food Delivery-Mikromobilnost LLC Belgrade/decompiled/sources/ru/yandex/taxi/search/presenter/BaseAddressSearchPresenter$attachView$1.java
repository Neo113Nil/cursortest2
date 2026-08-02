package ru.yandex.taxi.search.presenter;

import android.graphics.drawable.Drawable;
import com.yandex.go.coroutines.h;
import defpackage.j61;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.search.presenter.BaseAddressSearchPresenter$attachView$1", f = "BaseAddressSearchPresenter.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class BaseAddressSearchPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ j61 $mvpView;
    Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAddressSearchPresenter$attachView$1(j61 j61Var, f fVar, Continuation continuation) {
        super(2, continuation);
        this.$mvpView = j61Var;
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseAddressSearchPresenter$attachView$1(this.$mvpView, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseAddressSearchPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        j61 j61Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            j61 j61Var2 = this.$mvpView;
            h hVar = this.this$0.E;
            this.L$0 = j61Var2;
            this.label = 1;
            Object a = hVar.a(this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = a;
            j61Var = j61Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j61Var = (j61) this.L$0;
            kotlin.b.b(obj);
        }
        j61Var.M5((Drawable) obj);
        return zy11.a;
    }
}
