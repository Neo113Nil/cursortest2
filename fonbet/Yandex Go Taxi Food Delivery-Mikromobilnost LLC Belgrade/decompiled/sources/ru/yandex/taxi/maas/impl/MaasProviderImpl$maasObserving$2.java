package ru.yandex.taxi.maas.impl;

import android.net.Uri;
import com.yandex.go.address.models.Address;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.cmt;
import defpackage.dqe0;
import defpackage.fmt;
import defpackage.i000;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.maas.api.MaasApi;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isEnabled", "Li000;", "<anonymous>", "(Z)Li000;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.maas.impl.MaasProviderImpl$maasObserving$2", f = "MaasProviderImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MaasProviderImpl$maasObserving$2 extends SuspendLambda implements wls {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaasProviderImpl$maasObserving$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MaasProviderImpl$maasObserving$2 maasProviderImpl$maasObserving$2 = new MaasProviderImpl$maasObserving$2(this.this$0, continuation);
        maasProviderImpl$maasObserving$2.Z$0 = ((Boolean) obj).booleanValue();
        return maasProviderImpl$maasObserving$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((MaasProviderImpl$maasObserving$2) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzs B;
        zzs B2;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Double d = null;
        if (i == 0) {
            b.b(obj);
            if (!z) {
                return i000.c;
            }
            cmt<i000> b = ((MaasApi) this.this$0.h.getValue()).b();
            this.Z$0 = z;
            this.label = 1;
            obj = b.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        i000 i000Var = (i000) ((fmt) obj).a;
        i000.a aVar = i000Var.a;
        if (jl40.l(aVar, i000.a.e)) {
            return i000.c;
        }
        a aVar2 = this.this$0;
        aVar2.getClass();
        String str = aVar.d;
        if (str.length() == 0) {
            return i000Var;
        }
        dqe0 dqe0Var = (dqe0) aVar2.e.b;
        Address e = dqe0Var.e();
        Double valueOf = (e == null || (B2 = e.B()) == null) ? null : Double.valueOf(B2.a);
        Address e2 = dqe0Var.e();
        if (e2 != null && (B = e2.B()) != null) {
            d = Double.valueOf(B.b);
        }
        if (valueOf != null && d != null) {
            str = Uri.parse(str).buildUpon().appendQueryParameter("lat", String.valueOf(valueOf.doubleValue())).appendQueryParameter("lon", String.valueOf(d.doubleValue())).build().toString();
        }
        return new i000(new i000.a(aVar.a, aVar.b, aVar.c, str), i000Var.b);
    }
}
