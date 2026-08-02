package ru.yandex.taxi.settings.main;

import defpackage.d240;
import defpackage.f600;
import defpackage.hxx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.tse;
import defpackage.vn51;
import defpackage.wls;
import defpackage.yn5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.settings.main.NativeMenuPresenter$onYangoBusinessSelected$1", f = "NativeMenuPresenter.kt", l = {485}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class NativeMenuPresenter$onYangoBusinessSelected$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeMenuPresenter$onYangoBusinessSelected$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NativeMenuPresenter$onYangoBusinessSelected$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NativeMenuPresenter$onYangoBusinessSelected$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.business.impl.domain.g gVar = (com.yandex.go.business.impl.domain.g) this.this$0.Z.get();
            this.label = 1;
            obj = gVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        f600 f600Var = (f600) this.this$0.F.get();
        f600Var.f();
        f fVar = this.this$0;
        ((pep0) fVar.I).f(new yn5(4, (com.yandex.go.business.impl.router.b) fVar.P.get(), new d240(8, f600Var)), new vn51((String) obj), hxx.a);
        return zy11.a;
    }
}
