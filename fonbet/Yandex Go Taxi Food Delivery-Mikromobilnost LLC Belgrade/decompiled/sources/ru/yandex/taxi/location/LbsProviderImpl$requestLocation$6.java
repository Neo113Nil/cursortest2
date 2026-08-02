package ru.yandex.taxi.location;

import android.location.Location;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q7y;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/location/Location;", "it", "Lzy11;", "<anonymous>", "(Landroid/location/Location;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.location.LbsProviderImpl$requestLocation$6", f = "LbsProviderImpl.kt", l = {MSException.ERROR_BUSY}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class LbsProviderImpl$requestLocation$6 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LbsProviderImpl$requestLocation$6(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LbsProviderImpl$requestLocation$6 lbsProviderImpl$requestLocation$6 = new LbsProviderImpl$requestLocation$6(this.this$0, continuation);
        lbsProviderImpl$requestLocation$6.L$0 = obj;
        return lbsProviderImpl$requestLocation$6;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LbsProviderImpl$requestLocation$6) create((Location) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Location location = (Location) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.location.lbs.b bVar = this.this$0.e;
            this.L$0 = location;
            this.label = 1;
            obj = bVar.e(this);
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
        if (!((Boolean) obj).booleanValue()) {
            g gVar = this.this$0;
            q7y q7yVar = gVar.b;
            if (location == null) {
                q7yVar.getClass();
            } else {
                q7yVar.getClass();
            }
            gVar.o = location;
            gVar.k.l.set(location != null);
        }
        return zy11.a;
    }
}
