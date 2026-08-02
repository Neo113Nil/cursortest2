package ru.yandex.taxi.logistics.sdk.tracking.impl.domain.neuropostcard_network;

import defpackage.an2;
import defpackage.csb1;
import defpackage.go2;
import defpackage.ho2;
import defpackage.io2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t360;
import defpackage.u360;
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
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.Responses$EmptyResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverypostcard.PostcardSubmitRequestDto;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lv360;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.domain.neuropostcard_network.NeuroPostcardSubmitTask$getNeuroPostcardPollingFlow$1", f = "NeuroPostcardSubmitTask.kt", l = {HProv.ALG_SID_SHA3_256, HProv.ALG_SID_SHA3_384, HProv.ALG_SID_NO_HASH, HProv.PP_CIPHEROID, 99}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class NeuroPostcardSubmitTask$getNeuroPostcardPollingFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $deliveryId;
    final /* synthetic */ boolean $shouldTerminateOnSuccess;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeuroPostcardSubmitTask$getNeuroPostcardPollingFlow$1(e eVar, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$deliveryId = str;
        this.$shouldTerminateOnSuccess = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NeuroPostcardSubmitTask$getNeuroPostcardPollingFlow$1 neuroPostcardSubmitTask$getNeuroPostcardPollingFlow$1 = new NeuroPostcardSubmitTask$getNeuroPostcardPollingFlow$1(this.this$0, this.$deliveryId, this.$shouldTerminateOnSuccess, continuation);
        neuroPostcardSubmitTask$getNeuroPostcardPollingFlow$1.L$0 = obj;
        return neuroPostcardSubmitTask$getNeuroPostcardPollingFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NeuroPostcardSubmitTask$getNeuroPostcardPollingFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0094, code lost:
    
        if (ru.yandex.taxi.logistics.sdk.ui.a.a(r14, r13) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b6, code lost:
    
        if (r14 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0135, code lost:
    
        if (kotlinx.coroutines.a.i(r11, r13) == r1) goto L44;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0135 -> B:9:0x0080). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$LongRef ref$LongRef;
        PostcardSubmitRequestDto postcardSubmitRequestDto;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.f.a(this.$deliveryId);
            PostcardSubmitRequestDto postcardSubmitRequestDto2 = new PostcardSubmitRequestDto(this.$deliveryId);
            ref$LongRef = new Ref$LongRef();
            ref$LongRef.element = 60000L;
            postcardSubmitRequestDto = postcardSubmitRequestDto2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                        } else {
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ref$LongRef = (Ref$LongRef) this.L$2;
                            postcardSubmitRequestDto = (PostcardSubmitRequestDto) this.L$1;
                            kotlin.b.b(obj);
                        }
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ref$LongRef = (Ref$LongRef) this.L$2;
                postcardSubmitRequestDto = (PostcardSubmitRequestDto) this.L$1;
                kotlin.b.b(obj);
                io2 io2Var = (io2) obj;
                if (io2Var instanceof ho2) {
                    this.this$0.f.b(this.$deliveryId);
                    this.this$0.e.b();
                    if (this.$shouldTerminateOnSuccess) {
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 3;
                        if (vprVar.emit(u360.a, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11Var;
                }
                if (!(io2Var instanceof go2)) {
                    w511.b();
                    return null;
                }
                go2 go2Var = (go2) io2Var;
                if (csb1.g(go2Var.a)) {
                    this.this$0.f.b(this.$deliveryId);
                    t360 t360Var = new t360(null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 4;
                    if (vprVar.emit(t360Var, this) != coroutineSingletons) {
                        return zy11Var;
                    }
                } else {
                    Long l = go2Var.b.a;
                    if (l != null) {
                        ref$LongRef.element = l.longValue();
                    }
                    long j = ref$LongRef.element;
                    this.L$0 = vprVar;
                    this.L$1 = postcardSubmitRequestDto;
                    this.L$2 = ref$LongRef;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 5;
                }
                return coroutineSingletons;
            }
            ref$LongRef = (Ref$LongRef) this.L$2;
            postcardSubmitRequestDto = (PostcardSubmitRequestDto) this.L$1;
            kotlin.b.b(obj);
            an2<Responses$EmptyResponseDto> b = ((NeuroPostcardApi) this.this$0.a.get()).b(postcardSubmitRequestDto);
            this.L$0 = vprVar;
            this.L$1 = postcardSubmitRequestDto;
            this.L$2 = ref$LongRef;
            this.label = 2;
            ru.yandex.taxi.logistics.sdk.network.b bVar = (ru.yandex.taxi.logistics.sdk.network.b) b;
            obj = bVar.e(bVar.a, this);
        }
        AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl = this.this$0.c;
        this.L$0 = vprVar;
        this.L$1 = postcardSubmitRequestDto;
        this.L$2 = ref$LongRef;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 1;
    }
}
