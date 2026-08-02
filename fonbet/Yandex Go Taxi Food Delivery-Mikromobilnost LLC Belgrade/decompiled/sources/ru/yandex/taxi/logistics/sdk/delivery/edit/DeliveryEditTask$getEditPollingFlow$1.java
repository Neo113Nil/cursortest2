package ru.yandex.taxi.logistics.sdk.delivery.edit;

import defpackage.an2;
import defpackage.b7i;
import defpackage.csb1;
import defpackage.go2;
import defpackage.ho2;
import defpackage.io2;
import defpackage.jw40;
import defpackage.kw40;
import defpackage.m6i;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pw21;
import defpackage.rzh0;
import defpackage.s6i;
import defpackage.s9e;
import defpackage.tcc;
import defpackage.u6i;
import defpackage.vpr;
import defpackage.vu70;
import defpackage.w511;
import defpackage.wls;
import defpackage.wu70;
import defpackage.x6i;
import defpackage.xxz;
import defpackage.yuj0;
import defpackage.yxz;
import defpackage.z77;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PhotoInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.Responses$OperationIdResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryedit.DeliveryEditRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit.C2cEditRoutePointDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit.C2cOrderEditInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit.C2cOrderEditPayloadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit.ContactInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit.LpEditDeliveryIntervalDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit.LpEditDestinationInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit.LpOrderEditInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit.LpOrderEditPayloadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit.OrderEditPayloadDto;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "La7i;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery.edit.DeliveryEditTask$getEditPollingFlow$1", f = "DeliveryEditTask.kt", l = {69, 71, HProv.ALG_SID_SHA3_384, 91}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryEditTask$getEditPollingFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ s6i $editInfo;
    final /* synthetic */ Object $editOptions;
    final /* synthetic */ String $requestId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ b7i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryEditTask$getEditPollingFlow$1(b7i b7iVar, s6i s6iVar, String str, Object obj, Continuation continuation) {
        super(2, continuation);
        this.this$0 = b7iVar;
        this.$editInfo = s6iVar;
        this.$requestId = str;
        this.$editOptions = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryEditTask$getEditPollingFlow$1 deliveryEditTask$getEditPollingFlow$1 = new DeliveryEditTask$getEditPollingFlow$1(this.this$0, this.$editInfo, this.$requestId, this.$editOptions, continuation);
        deliveryEditTask$getEditPollingFlow$1.L$0 = obj;
        return deliveryEditTask$getEditPollingFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryEditTask$getEditPollingFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x01bd, code lost:
    
        if (ru.yandex.taxi.logistics.sdk.ui.a.a(r4, r28) != r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x01e0, code lost:
    
        if (r4 == r2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x025e, code lost:
    
        if (kotlinx.coroutines.a.i(r8, r28) == r2) goto L68;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x025e -> B:8:0x0261). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zy11 zy11Var;
        Object obj2;
        OrderEditPayloadDto orderEditPayload_CargoC2CDto;
        Ref$LongRef ref$LongRef;
        DeliveryEditRequestDto deliveryEditRequestDto;
        Object obj3;
        Object obj4;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var2 = zy11.a;
        Object obj5 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            u6i u6iVar = this.this$0.b;
            s6i s6iVar = this.$editInfo;
            String str = this.$requestId;
            Object obj6 = this.$editOptions;
            u6iVar.getClass();
            String str2 = s6iVar.a;
            pw21 pw21Var = s6iVar.b;
            if (pw21Var instanceof wu70) {
                List<yxz> list = ((wu70) pw21Var).f;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (yxz yxzVar : list) {
                    if (!(yxzVar instanceof yxz)) {
                        w511.b();
                        return null;
                    }
                    xxz xxzVar = yxzVar.a;
                    arrayList.add(new LpOrderEditInfoDto.LpOrderEditInfo_DestinationInfoDto(new LpEditDestinationInfoDto(xxzVar != null ? new LpEditDeliveryIntervalDto(xxzVar.a, xxzVar.b) : null)));
                }
                orderEditPayload_CargoC2CDto = new OrderEditPayloadDto.OrderEditPayload_LogisticPlatformDto(new LpOrderEditPayloadDto(arrayList));
                zy11Var = zy11Var2;
                obj2 = null;
            } else {
                if (!(pw21Var instanceof vu70)) {
                    w511.b();
                    return null;
                }
                ArrayList arrayList2 = ((vu70) pw21Var).f;
                ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    z77 z77Var = (z77) it.next();
                    if (!(z77Var instanceof z77)) {
                        Object obj7 = obj5;
                        w511.b();
                        return obj7;
                    }
                    String str3 = z77Var.a;
                    String str4 = z77Var.b;
                    String str5 = z77Var.c;
                    String str6 = z77Var.d;
                    Object obj8 = obj5;
                    String str7 = z77Var.e;
                    String str8 = z77Var.f;
                    zy11 zy11Var3 = zy11Var2;
                    s9e s9eVar = z77Var.g;
                    Iterator it2 = it;
                    ContactInfoDto contactInfoDto = new ContactInfoDto(s9eVar.a, s9eVar.b);
                    ArrayList arrayList4 = z77Var.h;
                    ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
                    for (Iterator it3 = arrayList4.iterator(); it3.hasNext(); it3 = it3) {
                        m6i m6iVar = (m6i) it3.next();
                        arrayList5.add(new PhotoInfoDto(m6iVar.a, m6iVar.b));
                    }
                    arrayList3.add(new C2cOrderEditInfoDto.C2cOrderEditInfo_RoutePointDto(new C2cEditRoutePointDto(str3, str8, arrayList5, str4, str5, str6, str7, contactInfoDto)));
                    obj5 = obj8;
                    zy11Var2 = zy11Var3;
                    it = it2;
                }
                zy11Var = zy11Var2;
                obj2 = obj5;
                orderEditPayload_CargoC2CDto = new OrderEditPayloadDto.OrderEditPayload_CargoC2CDto(new C2cOrderEditPayloadDto(arrayList3));
            }
            DeliveryEditRequestDto deliveryEditRequestDto2 = new DeliveryEditRequestDto(str2, obj6, orderEditPayload_CargoC2CDto, str);
            ref$LongRef = new Ref$LongRef();
            ref$LongRef.element = 60000L;
            deliveryEditRequestDto = deliveryEditRequestDto2;
            AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl = this.this$0.d;
            this.L$0 = vprVar;
            this.L$1 = deliveryEditRequestDto;
            this.L$2 = ref$LongRef;
            Object obj9 = obj2;
            this.L$3 = obj9;
            this.L$4 = obj9;
            this.label = 1;
        } else if (i == 1) {
            ref$LongRef = (Ref$LongRef) this.L$2;
            deliveryEditRequestDto = (DeliveryEditRequestDto) this.L$1;
            kotlin.b.b(obj);
            zy11Var = zy11Var2;
            an2<Responses$OperationIdResponseDto> a = ((DeliveryEditApi) this.this$0.a.get()).a(deliveryEditRequestDto);
            this.L$0 = vprVar;
            this.L$1 = deliveryEditRequestDto;
            this.L$2 = ref$LongRef;
            this.label = 2;
            ru.yandex.taxi.logistics.sdk.network.b bVar = (ru.yandex.taxi.logistics.sdk.network.b) a;
            obj3 = bVar.e(bVar.a, this);
        } else {
            if (i == 2) {
                ref$LongRef = (Ref$LongRef) this.L$2;
                deliveryEditRequestDto = (DeliveryEditRequestDto) this.L$1;
                kotlin.b.b(obj);
                zy11Var = zy11Var2;
                obj3 = obj;
                io2 io2Var = (io2) obj3;
                if (!(io2Var instanceof ho2)) {
                    if (!(io2Var instanceof go2)) {
                        w511.b();
                        return null;
                    }
                    go2 go2Var = (go2) io2Var;
                    if (csb1.g(go2Var.a)) {
                        yuj0 yuj0Var = this.this$0.f;
                        x6i x6iVar = new x6i(new jw40(yuj0Var.a(rzh0.logistics_unknown_error, new Object[0]), null, new kw40(yuj0Var.a(rzh0.logistics_ok_button, new Object[0]), null, null), null, false, null), this.$requestId, this.$editInfo.a);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 3;
                        if (vprVar.emit(x6iVar, this) == coroutineSingletons) {
                        }
                    } else {
                        Long l = go2Var.b.a;
                        if (l != null) {
                            ref$LongRef.element = l.longValue();
                        }
                        long j = ref$LongRef.element;
                        this.L$0 = vprVar;
                        this.L$1 = deliveryEditRequestDto;
                        this.L$2 = ref$LongRef;
                        obj4 = null;
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
                return zy11Var2;
            }
            if (i != 4) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$LongRef = (Ref$LongRef) this.L$2;
            deliveryEditRequestDto = (DeliveryEditRequestDto) this.L$1;
            kotlin.b.b(obj);
            zy11Var = zy11Var2;
            obj4 = null;
            obj2 = obj4;
            AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl2 = this.this$0.d;
            this.L$0 = vprVar;
            this.L$1 = deliveryEditRequestDto;
            this.L$2 = ref$LongRef;
            Object obj92 = obj2;
            this.L$3 = obj92;
            this.L$4 = obj92;
            this.label = 1;
        }
    }
}
