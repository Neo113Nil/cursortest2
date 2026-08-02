package ru.domesticroots.certificatetransparency.loglist;

import defpackage.d5j0;
import defpackage.kwu;
import defpackage.mvg;
import defpackage.nci0;
import defpackage.ny61;
import defpackage.t4j0;
import defpackage.tse;
import defpackage.wls;
import defpackage.ya7;
import defpackage.yf7;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okhttp3.OkHttpClient;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)[B"}, k = 3, mv = {1, 9, 0})
@mvg(c = "ru.domesticroots.certificatetransparency.loglist.LogListDataSourceFactory$createLogListService$1$get$1", f = "LogListDataSourceFactory.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class LogListDataSourceFactory$createLogListService$1$get$1 extends SuspendLambda implements wls {
    final /* synthetic */ OkHttpClient $client;
    final /* synthetic */ long $maxSize;
    final /* synthetic */ String $url;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogListDataSourceFactory$createLogListService$1$get$1(String str, long j, OkHttpClient okHttpClient, Continuation continuation) {
        super(2, continuation);
        this.$url = str;
        this.$maxSize = j;
        this.$client = okHttpClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LogListDataSourceFactory$createLogListService$1$get$1(this.$url, this.$maxSize, this.$client, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LogListDataSourceFactory$createLogListService$1$get$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        t4j0 t4j0Var = new t4j0();
        t4j0Var.a = kwu.h(this.$url);
        ya7 ya7Var = new ya7();
        ya7Var.a = true;
        ya7Var.b = true;
        t4j0Var.b(ya7Var.a());
        t4j0Var.c.a("Max-Size", String.valueOf(this.$maxSize));
        yf7 newCall = this.$client.newCall(new d5j0(t4j0Var));
        this.label = 1;
        Object a = ru.domesticroots.certificatetransparency.internal.loglist.a.a((nci0) newCall, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
