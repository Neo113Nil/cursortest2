package ru.yandex.video.m3.list_player_manager.impl;

import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerInstanceProvider$release$1", f = "ListYandexPlayerManagerInstanceProvider.kt", l = {548}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ListYandexPlayerManagerInstanceProvider$release$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;

    public ListYandexPlayerManagerInstanceProvider$release$1(Continuation<? super ListYandexPlayerManagerInstanceProvider$release$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new ListYandexPlayerManagerInstanceProvider$release$1(continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((ListYandexPlayerManagerInstanceProvider$release$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        g050 g050Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g050Var = ListYandexPlayerManagerInstanceProvider.mutex;
            this.L$0 = g050Var;
            this.label = 1;
            if (g050Var.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            g050Var2 = g050Var;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g050Var2 = (g050) this.L$0;
            kotlin.b.b(obj);
        }
        try {
            ListYandexPlayerManagerInstanceProvider.INSTANCE = null;
            g050Var2.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var2.d(null);
            throw th;
        }
    }
}
