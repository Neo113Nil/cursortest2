package ru.yandex.taxi.persuggest.api;

import com.yandex.go.experiments.api.ExperimentSource;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.hd7;
import defpackage.j3z;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q6r;
import defpackage.tse;
import defpackage.u6r;
import defpackage.udq0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lfmt;", "Lu6r;", "<anonymous>", "(Ltse;)Lfmt;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.persuggest.api.PerSuggestApiImpl$finalSuggest$response$1", f = "PerSuggestApiImpl.kt", l = {102}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PerSuggestApiImpl$finalSuggest$response$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $date;
    final /* synthetic */ j3z $localId;
    final /* synthetic */ q6r $params;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerSuggestApiImpl$finalSuggest$response$1(a aVar, String str, q6r q6rVar, j3z j3zVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$date = str;
        this.$params = q6rVar;
        this.$localId = j3zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PerSuggestApiImpl$finalSuggest$response$1(this.this$0, this.$date, this.$params, this.$localId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PerSuggestApiImpl$finalSuggest$response$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hd7 hd7Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            hd7 b = this.this$0.c.b(ExperimentSource.FINAL_SUGGEST, true);
            cmt<u6r> e = this.this$0.d().e(this.$date, q6r.a(this.$params, b.d), this.$params.a.getTag(), this.$localId);
            this.L$0 = b;
            this.label = 1;
            Object b2 = ru.yandex.taxi.network.api.a.b(e, null, this);
            if (b2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            hd7Var = b;
            obj = b2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hd7Var = (hd7) this.L$0;
            b.b(obj);
        }
        a aVar = this.this$0;
        u6r u6rVar = (u6r) ((fmt) obj).a;
        udq0.P(u6rVar.m, aVar.c, hd7Var);
        return obj;
    }
}
