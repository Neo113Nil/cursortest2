package ru.yandex.taxi.personalstate.domain.interactor;

import defpackage.j7b0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lj7b0;", "<anonymous>", "(Ltse;)Lj7b0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.personalstate.domain.interactor.RequestPersonalStateInteractor$performLoading$1", f = "RequestPersonalStateInteractor.kt", l = {HProv.PP_BIO_STATISTICA_LEN, HProv.PP_REBOOT}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class RequestPersonalStateInteractor$performLoading$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    final /* synthetic */ List<zzs> $route;
    Object L$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestPersonalStateInteractor$performLoading$1(i iVar, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$id = str;
        this.$route = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequestPersonalStateInteractor$performLoading$1(this.this$0, this.$id, this.$route, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequestPersonalStateInteractor$performLoading$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        i iVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                iVar = this.this$0;
                String str = this.$id;
                List<zzs> list = this.$route;
                ru.yandex.taxi.personalstate.data.remote.b bVar = iVar.c;
                this.L$0 = iVar;
                this.label = 1;
                obj = bVar.a(str, list, this);
                if (obj == coroutineSingletons) {
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j7b0 j7b0Var = (j7b0) this.L$0;
                    kotlin.b.b(obj);
                    return j7b0Var;
                }
                iVar = (i) this.L$0;
                kotlin.b.b(obj);
            }
            j7b0 j7b0Var2 = (j7b0) obj;
            ru.yandex.taxi.personalstate.data.local.a aVar = iVar.d;
            this.L$0 = j7b0Var2;
            this.label = 2;
            return aVar.c(j7b0Var2, this) == coroutineSingletons ? coroutineSingletons : j7b0Var2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.j(th);
            return null;
        }
    }
}
