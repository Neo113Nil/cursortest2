package ru.yandex.taxi.logistics.sdk.delivery_launch.domain;

import defpackage.m0i;
import defpackage.mvg;
import defpackage.n0i;
import defpackage.ny61;
import defpackage.o0i;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.TypedConfigsDto;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/TypedConfigsDto$ItemsDto;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery_launch.domain.DeliveryConfigInteractorImpl$getOrFetchConfigItemFlow$1", f = "DeliveryConfigInteractor.kt", l = {HProv.ALG_SID_SHA3_224, HProv.ALG_SID_SHA3_384}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryConfigInteractorImpl$getOrFetchConfigItemFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $name;
    final /* synthetic */ m0i $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryConfigInteractorImpl$getOrFetchConfigItemFlow$1(a aVar, m0i m0iVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$params = m0iVar;
        this.$name = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryConfigInteractorImpl$getOrFetchConfigItemFlow$1 deliveryConfigInteractorImpl$getOrFetchConfigItemFlow$1 = new DeliveryConfigInteractorImpl$getOrFetchConfigItemFlow$1(this.this$0, this.$params, this.$name, continuation);
        deliveryConfigInteractorImpl$getOrFetchConfigItemFlow$1.L$0 = obj;
        return deliveryConfigInteractorImpl$getOrFetchConfigItemFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryConfigInteractorImpl$getOrFetchConfigItemFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (r8.b(r2, r7) == r1) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            Map map = (Map) ((o0i) this.this$0.b).a.getValue();
            if ((map != null ? (TypedConfigsDto) map.get(this.$params) : null) == null) {
                a aVar = this.this$0;
                m0i m0iVar = this.$params;
                this.L$0 = vprVar;
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        n0i n0iVar = this.this$0.b;
        String str = this.$name;
        m0i m0iVar2 = this.$params;
        r0 r0Var = ((o0i) n0iVar).a;
        this.L$0 = null;
        this.label = 2;
        e.w(vprVar);
        Object collect = r0Var.collect(new ru.yandex.taxi.logistics.sdk.delivery_launch.data.a(vprVar, m0iVar2, str), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
