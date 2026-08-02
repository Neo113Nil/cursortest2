package ru.yandex.taxi.logistics.sdk.delivery.cancel.domain;

import com.yandex.delivery.mapper.model.CancelType;
import defpackage.an2;
import defpackage.csb1;
import defpackage.go2;
import defpackage.ho2;
import defpackage.io2;
import defpackage.jv7;
import defpackage.mvg;
import defpackage.nv7;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.delivery.cancel.data.OrderCancelApi;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.CancelTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.Responses$OperationIdResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverycancel.DeliveryCancelRequestDto;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lmv7;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery.cancel.domain.CancelDeliveryOnBackendImpl$getCancellingPollingFlow$1", f = "CancelDeliveryOnBackendImpl.kt", l = {74, HProv.PROV_GOST_2001_DH, 83, HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CancelDeliveryOnBackendImpl$getCancellingPollingFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ CancelType $cancelType;
    final /* synthetic */ String $deliveryId;
    final /* synthetic */ String $requestId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelDeliveryOnBackendImpl$getCancellingPollingFlow$1(b bVar, CancelType cancelType, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$cancelType = cancelType;
        this.$deliveryId = str;
        this.$requestId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CancelDeliveryOnBackendImpl$getCancellingPollingFlow$1 cancelDeliveryOnBackendImpl$getCancellingPollingFlow$1 = new CancelDeliveryOnBackendImpl$getCancellingPollingFlow$1(this.this$0, this.$cancelType, this.$deliveryId, this.$requestId, continuation);
        cancelDeliveryOnBackendImpl$getCancellingPollingFlow$1.L$0 = obj;
        return cancelDeliveryOnBackendImpl$getCancellingPollingFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CancelDeliveryOnBackendImpl$getCancellingPollingFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d4, code lost:
    
        if (r13 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0123, code lost:
    
        if (kotlinx.coroutines.a.i(r10, r12) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b3, code lost:
    
        if (ru.yandex.taxi.logistics.sdk.ui.a.a(r13, r12) == r1) goto L50;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0123 -> B:8:0x009f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CancelTypeDto cancelTypeDto;
        DeliveryCancelRequestDto deliveryCancelRequestDto;
        Ref$LongRef ref$LongRef;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            CancelType cancelType = this.$cancelType;
            bVar.getClass();
            int i2 = cancelType == null ? -1 : nv7.a[cancelType.ordinal()];
            if (i2 == -1) {
                cancelTypeDto = CancelTypeDto.FREE;
            } else if (i2 == 1) {
                cancelTypeDto = CancelTypeDto.FREE;
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                cancelTypeDto = CancelTypeDto.PAID;
            }
            DeliveryCancelRequestDto deliveryCancelRequestDto2 = new DeliveryCancelRequestDto(this.$deliveryId, cancelTypeDto, this.$requestId);
            Ref$LongRef ref$LongRef2 = new Ref$LongRef();
            ref$LongRef2.element = 60000L;
            deliveryCancelRequestDto = deliveryCancelRequestDto2;
            ref$LongRef = ref$LongRef2;
        } else if (i == 1) {
            ref$LongRef = (Ref$LongRef) this.L$2;
            deliveryCancelRequestDto = (DeliveryCancelRequestDto) this.L$1;
            kotlin.b.b(obj);
            an2<Responses$OperationIdResponseDto> a = ((OrderCancelApi) this.this$0.a.get()).a(deliveryCancelRequestDto);
            this.L$0 = vprVar;
            this.L$1 = deliveryCancelRequestDto;
            this.L$2 = ref$LongRef;
            this.label = 2;
            ru.yandex.taxi.logistics.sdk.network.b bVar2 = (ru.yandex.taxi.logistics.sdk.network.b) a;
            obj = bVar2.e(bVar2.a, this);
        } else {
            if (i == 2) {
                ref$LongRef = (Ref$LongRef) this.L$2;
                deliveryCancelRequestDto = (DeliveryCancelRequestDto) this.L$1;
                kotlin.b.b(obj);
                io2 io2Var = (io2) obj;
                if (!(io2Var instanceof ho2)) {
                    if (!(io2Var instanceof go2)) {
                        w511.b();
                        return null;
                    }
                    go2 go2Var = (go2) io2Var;
                    if (csb1.g(go2Var.a)) {
                        jv7 jv7Var = new jv7();
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 3;
                        if (vprVar.emit(jv7Var, this) == coroutineSingletons) {
                        }
                    } else {
                        Long l = go2Var.b.a;
                        if (l != null) {
                            ref$LongRef.element = l.longValue();
                        }
                        long j = ref$LongRef.element;
                        this.L$0 = vprVar;
                        this.L$1 = deliveryCancelRequestDto;
                        this.L$2 = ref$LongRef;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 4;
                    }
                    return coroutineSingletons;
                }
                return zy11Var;
            }
            if (i == 3) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            if (i != 4) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$LongRef = (Ref$LongRef) this.L$2;
            deliveryCancelRequestDto = (DeliveryCancelRequestDto) this.L$1;
            kotlin.b.b(obj);
        }
        AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl = this.this$0.c;
        this.L$0 = vprVar;
        this.L$1 = deliveryCancelRequestDto;
        this.L$2 = ref$LongRef;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 1;
    }
}
