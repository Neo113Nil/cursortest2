package ru.yandex.taxi.utils;

import defpackage.cpe0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.utils.GetImageHelper$executePreloadRequest$1", f = "GetImageHelper.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class GetImageHelper$executePreloadRequest$1 extends SuspendLambda implements wls {
    final /* synthetic */ cpe0 $request;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetImageHelper$executePreloadRequest$1(cpe0 cpe0Var, Continuation continuation) {
        super(2, continuation);
        this.$request = cpe0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetImageHelper$executePreloadRequest$1(this.$request, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetImageHelper$executePreloadRequest$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            cpe0 cpe0Var = this.$request;
            this.label = 1;
            e = a.e(cpe0Var, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            e = ((Result) obj).getValue();
        }
        if (!(e instanceof Result.Failure)) {
            jst.e.getClass();
        }
        Throwable a = Result.a(e);
        if (a != null) {
            if (s8o.C(a)) {
                jst.e.p("ImageNotFound", a);
            } else {
                jst.e.k(a, "Error while pre-loading image");
            }
        }
        return zy11.a;
    }
}
