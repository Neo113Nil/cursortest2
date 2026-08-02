package ru.yandex.taxi.am;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.PassportInitializer$waitWithTimeout$1$1$1", f = "PassportInitializer.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PassportInitializer$waitWithTimeout$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $run;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportInitializer$waitWithTimeout$1$1$1(tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$run = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassportInitializer$waitWithTimeout$1$1$1(this.$run, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PassportInitializer$waitWithTimeout$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        tls tlsVar = this.$run;
        this.label = 1;
        Object invoke = tlsVar.invoke(this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
