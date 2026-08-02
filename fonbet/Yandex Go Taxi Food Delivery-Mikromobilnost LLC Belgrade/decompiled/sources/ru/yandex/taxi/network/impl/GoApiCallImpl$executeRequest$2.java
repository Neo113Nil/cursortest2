package ru.yandex.taxi.network.impl;

import defpackage.d5j0;
import defpackage.dvw;
import defpackage.fmt;
import defpackage.j18;
import defpackage.jl40;
import defpackage.kvj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o7j0;
import defpackage.oeu;
import defpackage.sl7;
import defpackage.t4j0;
import defpackage.tse;
import defpackage.wls;
import defpackage.yf7;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.yandex.taxi.network.api.models.GoCheckException;
import ru.yandex.taxi.network.api.models.GoParsingException;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Ltse;", "Lfmt;", "<anonymous>", "(Ltse;)Lfmt;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.network.impl.GoApiCallImpl$executeRequest$2", f = "GoApiCallImpl.kt", l = {165, 232, 175}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class GoApiCallImpl$executeRequest$2 extends SuspendLambda implements wls {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoApiCallImpl$executeRequest$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GoApiCallImpl$executeRequest$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GoApiCallImpl$executeRequest$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        if (r5 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009e, code lost:
    
        if (r2 == r1) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        yf7 newCall;
        Object s;
        kvj0 kvj0Var;
        a aVar;
        yf7 yf7Var;
        long j;
        Object obj3;
        kvj0 kvj0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar2 = this.this$0;
                this.label = 1;
                aVar2.getClass();
                o7j0 o7j0Var = (o7j0) get_context().get(o7j0.b);
                Map f = o7j0Var != null ? o7j0Var.a : kotlin.collections.b.f();
                d5j0 k = aVar2.c.k();
                obj2 = k;
                if (!f.isEmpty()) {
                    t4j0 b = k.b();
                    for (Map.Entry entry : f.entrySet()) {
                        b.d((String) entry.getKey(), (String) entry.getValue());
                    }
                    obj2 = new d5j0(b);
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = this.J$0;
                        aVar = (a) this.L$3;
                        kvj0Var = (kvj0) this.L$2;
                        yf7Var = (yf7) this.L$1;
                        b.b(obj);
                        Response c = aVar.c.c(kvj0Var);
                        d5j0 d5j0Var = kvj0Var.a;
                        Pair pair = new Pair(c, new Long(System.currentTimeMillis() - j));
                        Response response = (Response) pair.getFirst();
                        long longValue = ((Number) pair.getSecond()).longValue();
                        obj3 = response.b;
                        kvj0Var2 = response.a;
                        this.this$0.f.g(yf7Var, kvj0Var, longValue);
                        this.this$0.g.set(d5j0Var.c.a("Authorization"));
                        if (kvj0Var2.w == 204 && jl40.l(this.this$0.a, zy11.class)) {
                            obj3 = zy11.a;
                        }
                        Object obj4 = obj3;
                        if (kvj0Var2.J || obj4 == null) {
                            throw new HttpException(response);
                        }
                        return new fmt(obj4, kvj0Var2.w, kvj0Var.c, new oeu(d5j0Var.c.e()), new oeu(kvj0Var2.y.e()), longValue, kvj0Var.E, kvj0Var.F);
                    }
                    newCall = (yf7) this.L$1;
                    b.b(obj);
                    s = obj;
                    kvj0 kvj0Var3 = (kvj0) s;
                    a aVar3 = this.this$0;
                    long currentTimeMillis = System.currentTimeMillis();
                    this.L$0 = null;
                    this.L$1 = newCall;
                    this.L$2 = kvj0Var3;
                    this.L$3 = aVar3;
                    this.J$0 = currentTimeMillis;
                    this.label = 3;
                    if (a.b(aVar3, kvj0Var3, this) != coroutineSingletons) {
                        kvj0Var = kvj0Var3;
                        aVar = aVar3;
                        yf7Var = newCall;
                        j = currentTimeMillis;
                        Response c2 = aVar.c.c(kvj0Var);
                        d5j0 d5j0Var2 = kvj0Var.a;
                        Pair pair2 = new Pair(c2, new Long(System.currentTimeMillis() - j));
                        Response response2 = (Response) pair2.getFirst();
                        long longValue2 = ((Number) pair2.getSecond()).longValue();
                        obj3 = response2.b;
                        kvj0Var2 = response2.a;
                        this.this$0.f.g(yf7Var, kvj0Var, longValue2);
                        this.this$0.g.set(d5j0Var2.c.a("Authorization"));
                        if (kvj0Var2.w == 204) {
                            obj3 = zy11.a;
                        }
                        Object obj42 = obj3;
                        if (kvj0Var2.J) {
                        }
                        throw new HttpException(response2);
                    }
                    return coroutineSingletons;
                }
                b.b(obj);
                obj2 = obj;
            }
            newCall = this.this$0.b.newCall((d5j0) obj2);
            this.this$0.f.e(newCall);
            this.L$0 = null;
            this.L$1 = newCall;
            this.label = 2;
            j18 j18Var = new j18(1, dvw.b(this));
            j18Var.u();
            j18Var.w(new sl7(newCall, 1));
            j18Var.resumeWith(newCall.execute());
            s = j18Var.s();
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        } catch (Exception e) {
            if (e instanceof GoCheckException) {
                throw e;
            }
            throw new GoParsingException(e);
        }
    }
}
