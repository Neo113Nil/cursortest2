package ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.ui;

import com.yandex.delivery.utils.dialogmanager.ErrorDialogInteractor$requestUnknownErrorDialog$2;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.dpc;
import defpackage.dwo;
import defpackage.fpc;
import defpackage.fwo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.ExtendStoragePeriodDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryeditoptions.DeliveryOptionsRequestDto;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.ui.ExtendExpirationDateViewModel$fetchContent$1", f = "ExtendExpirationDateViewModel.kt", l = {56, 65, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ExtendExpirationDateViewModel$fetchContent$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $requestId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtendExpirationDateViewModel$fetchContent$1(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExtendExpirationDateViewModel$fetchContent$1(this.this$0, this.$requestId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExtendExpirationDateViewModel$fetchContent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (r9 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r10 == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        pz40 pz40Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            fwo fwoVar = cVar.x;
            String str = cVar.b.a;
            String str2 = this.$requestId;
            DeliveryOptionsRequestDto.PayloadDto.Payload_StoragePeriodDto payload_StoragePeriodDto = new DeliveryOptionsRequestDto.PayloadDto.Payload_StoragePeriodDto(new ExtendStoragePeriodDto());
            this.label = 1;
            obj = ((ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.data.a) fwoVar).b(str, str2, payload_StoragePeriodDto, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    pz40Var = (pz40) this.L$1;
                    kotlin.b.b(obj);
                    ((r0) pz40Var).l(obj);
                    return zy11.a;
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        fpc fpcVar = (fpc) obj;
        if (fpcVar instanceof dpc) {
            dwo dwoVar = (dwo) ((dpc) fpcVar).a;
            if (dwoVar.a != null) {
                c cVar2 = this.this$0;
                r0 r0Var = cVar2.C;
                ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.data.b bVar = cVar2.B;
                this.L$0 = null;
                this.L$1 = r0Var;
                this.label = 2;
                obj = bVar.c(dwoVar, this);
                if (obj != coroutineSingletons) {
                    pz40Var = r0Var;
                    ((r0) pz40Var).l(obj);
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        this.this$0.c.a.dismiss();
        com.yandex.delivery.utils.dialogmanager.a aVar = this.this$0.A;
        this.L$0 = null;
        this.label = 3;
        c = aVar.c(new ErrorDialogInteractor$requestUnknownErrorDialog$2(), this);
    }
}
