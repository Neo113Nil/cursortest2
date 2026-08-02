package ru.yandex.taxi.polling;

import defpackage.c9z;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.polling.LocationInfoPollingRequestStarter$sendDataOnStart$1", f = "LocationInfoPollingRequestStarter.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class LocationInfoPollingRequestStarter$sendDataOnStart$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationInfoPollingRequestStarter$sendDataOnStart$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LocationInfoPollingRequestStarter$sendDataOnStart$1 locationInfoPollingRequestStarter$sendDataOnStart$1 = new LocationInfoPollingRequestStarter$sendDataOnStart$1(this.this$0, continuation);
        locationInfoPollingRequestStarter$sendDataOnStart$1.L$0 = obj;
        return locationInfoPollingRequestStarter$sendDataOnStart$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationInfoPollingRequestStarter$sendDataOnStart$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            this.L$0 = tseVar;
            this.label = 1;
            obj = dVar.d.h(this);
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
        c9z c9zVar = (c9z) obj;
        zy11 zy11Var = zy11.a;
        if (c9zVar == null) {
            return zy11Var;
        }
        boolean c = c9zVar.c();
        d dVar2 = this.this$0;
        if (!c) {
            dVar2.g.getClass();
            return zy11Var;
        }
        dVar2.g.getClass();
        d.i(this.this$0, tseVar, c9zVar);
        return zy11Var;
    }
}
