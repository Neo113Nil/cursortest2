package ru.yandex.taxi.logistics.sdk.tracking.impl.rover;

import defpackage.an2;
import defpackage.bhl0;
import defpackage.csb1;
import defpackage.go2;
import defpackage.ho2;
import defpackage.io2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wls;
import defpackage.xgl0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.Responses$OperationIdResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryroveraction.DeliveryRoverActionRequestDto;
import ru.yandex.taxi.logistics.sdk.tracking.impl.rover.data.RoverApi;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lzgl0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.rover.RoverTask$getRoverPollingFlow$1", f = "RoverTask.kt", l = {HProv.ALG_SID_SHA3_256, HProv.ALG_SID_SHA3_384, MSException.ERROR_INVALID_PARAMETER, HProv.PP_CIPHEROID}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class RoverTask$getRoverPollingFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $action;
    final /* synthetic */ String $deliveryId;
    final /* synthetic */ Object $payload;
    final /* synthetic */ String $requestId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ bhl0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoverTask$getRoverPollingFlow$1(String str, String str2, String str3, Object obj, bhl0 bhl0Var, Continuation continuation) {
        super(2, continuation);
        this.$deliveryId = str;
        this.$requestId = str2;
        this.$action = str3;
        this.$payload = obj;
        this.this$0 = bhl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RoverTask$getRoverPollingFlow$1 roverTask$getRoverPollingFlow$1 = new RoverTask$getRoverPollingFlow$1(this.$deliveryId, this.$requestId, this.$action, this.$payload, this.this$0, continuation);
        roverTask$getRoverPollingFlow$1.L$0 = obj;
        return roverTask$getRoverPollingFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RoverTask$getRoverPollingFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00af, code lost:
    
        if (r13 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fe, code lost:
    
        if (kotlinx.coroutines.a.i(r10, r12) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008e, code lost:
    
        if (ru.yandex.taxi.logistics.sdk.ui.a.a(r13, r12) == r1) goto L38;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00fe -> B:8:0x007a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$LongRef ref$LongRef;
        DeliveryRoverActionRequestDto deliveryRoverActionRequestDto;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            DeliveryRoverActionRequestDto deliveryRoverActionRequestDto2 = new DeliveryRoverActionRequestDto(this.$deliveryId, this.$requestId, this.$action, this.$payload);
            ref$LongRef = new Ref$LongRef();
            ref$LongRef.element = 60000L;
            deliveryRoverActionRequestDto = deliveryRoverActionRequestDto2;
        } else if (i == 1) {
            ref$LongRef = (Ref$LongRef) this.L$2;
            deliveryRoverActionRequestDto = (DeliveryRoverActionRequestDto) this.L$1;
            kotlin.b.b(obj);
            an2<Responses$OperationIdResponseDto> a = ((RoverApi) this.this$0.a.get()).a(deliveryRoverActionRequestDto);
            this.L$0 = vprVar;
            this.L$1 = deliveryRoverActionRequestDto;
            this.L$2 = ref$LongRef;
            this.label = 2;
            ru.yandex.taxi.logistics.sdk.network.b bVar = (ru.yandex.taxi.logistics.sdk.network.b) a;
            obj = bVar.e(bVar.a, this);
        } else {
            if (i == 2) {
                ref$LongRef = (Ref$LongRef) this.L$2;
                deliveryRoverActionRequestDto = (DeliveryRoverActionRequestDto) this.L$1;
                kotlin.b.b(obj);
                io2 io2Var = (io2) obj;
                if (!(io2Var instanceof ho2)) {
                    if (!(io2Var instanceof go2)) {
                        w511.b();
                        return null;
                    }
                    go2 go2Var = (go2) io2Var;
                    if (csb1.g(go2Var.a)) {
                        xgl0 xgl0Var = new xgl0(null);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 3;
                        if (vprVar.emit(xgl0Var, this) == coroutineSingletons) {
                        }
                    } else {
                        Long l = go2Var.b.a;
                        if (l != null) {
                            ref$LongRef.element = l.longValue();
                        }
                        long j = ref$LongRef.element;
                        this.L$0 = vprVar;
                        this.L$1 = deliveryRoverActionRequestDto;
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
            deliveryRoverActionRequestDto = (DeliveryRoverActionRequestDto) this.L$1;
            kotlin.b.b(obj);
        }
        AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl = this.this$0.c;
        this.L$0 = vprVar;
        this.L$1 = deliveryRoverActionRequestDto;
        this.L$2 = ref$LongRef;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 1;
    }
}
