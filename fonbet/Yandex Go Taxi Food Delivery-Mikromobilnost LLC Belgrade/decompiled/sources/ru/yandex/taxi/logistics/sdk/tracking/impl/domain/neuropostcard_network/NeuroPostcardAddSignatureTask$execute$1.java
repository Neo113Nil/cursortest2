package ru.yandex.taxi.logistics.sdk.tracking.impl.domain.neuropostcard_network;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import defpackage.an2;
import defpackage.go2;
import defpackage.ho2;
import defpackage.io2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t360;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.Responses$EmptyResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverypostcard.PostcardSetTextRequestDto;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lv360;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.domain.neuropostcard_network.NeuroPostcardAddSignatureTask$execute$1", f = "NeuroPostcardAddSignatureTask.kt", l = {29, 35, 40}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class NeuroPostcardAddSignatureTask$execute$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $deliveryId;
    final /* synthetic */ String $text;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeuroPostcardAddSignatureTask$execute$1(a aVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$deliveryId = str;
        this.$text = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NeuroPostcardAddSignatureTask$execute$1 neuroPostcardAddSignatureTask$execute$1 = new NeuroPostcardAddSignatureTask$execute$1(this.this$0, this.$deliveryId, this.$text, continuation);
        neuroPostcardAddSignatureTask$execute$1.L$0 = obj;
        return neuroPostcardAddSignatureTask$execute$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NeuroPostcardAddSignatureTask$execute$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
    
        if (r0.emit(defpackage.u360.a, r8) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a6, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r9 == r1) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.c.a(this.$deliveryId);
            an2<Responses$EmptyResponseDto> a = ((NeuroPostcardApi) this.this$0.a.get()).a(new PostcardSetTextRequestDto(this.$deliveryId, this.$text));
            this.L$0 = vprVar;
            this.L$1 = null;
            this.label = 1;
            obj = ((ru.yandex.taxi.logistics.sdk.network.b) a).c((r9 & 1) != 0 ? Integer.MAX_VALUE : 3, 10000L, MapiClientImpl.RETRIES_TIME_MILLIS, this);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        io2 io2Var = (io2) obj;
        if (io2Var instanceof ho2) {
            this.this$0.c.b(this.$deliveryId);
            this.this$0.b.b();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
        } else {
            if (!(io2Var instanceof go2)) {
                w511.b();
                return null;
            }
            this.this$0.c.b(this.$deliveryId);
            t360 t360Var = new t360(null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
        }
    }
}
