package ru.yandex.taxi.logistics.sdk.tracking.impl.ui;

import defpackage.bvq;
import defpackage.fuq;
import defpackage.guq;
import defpackage.mea0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pgz0;
import defpackage.tcc;
import defpackage.w511;
import defpackage.wls;
import defpackage.ziq0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.FeedbackReasonsItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverypaymentcontext.PaymentContextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryfeedback.DeliveryFeedbackRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handlersdefinitions.TipsInfoDto;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbvq;", "it", "Lzy11;", "<anonymous>", "(Lbvq;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.TrackingViewModel$launchFeedbackSending$1", f = "TrackingViewModel.kt", l = {220}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TrackingViewModel$launchFeedbackSending$1 extends SuspendLambda implements wls {
    int I$0;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingViewModel$launchFeedbackSending$1(Continuation continuation, k kVar) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TrackingViewModel$launchFeedbackSending$1 trackingViewModel$launchFeedbackSending$1 = new TrackingViewModel$launchFeedbackSending$1(continuation, this.this$0);
        trackingViewModel$launchFeedbackSending$1.L$0 = obj;
        return trackingViewModel$launchFeedbackSending$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackingViewModel$launchFeedbackSending$1) create((bvq) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        guq guqVar;
        mea0 mea0Var;
        guq guqVar2;
        int i;
        TipsInfoDto tipsInfoDto;
        bvq bvqVar = (bvq) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            int i3 = ((pgz0) this.this$0.z.b.getValue()) != null ? 1 : 0;
            k kVar = this.this$0;
            guqVar = kVar.y;
            if (i3 == 0) {
                mea0Var = null;
                ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.b bVar = guqVar.a;
                ziq0 ziq0Var = bvqVar.f;
                List list = bvqVar.e;
                String str = bvqVar.b;
                i = fuq.a[bvqVar.a.ordinal()];
                if (i != 1) {
                    String str2 = bvqVar.d;
                    r0 r0Var = bVar.b;
                    DeliveryFeedbackRequestDto.TypeDto typeDto = DeliveryFeedbackRequestDto.TypeDto.CANCEL_FEEDBACK;
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new FeedbackReasonsItemDto((String) it.next()));
                    }
                    DeliveryFeedbackRequestDto deliveryFeedbackRequestDto = new DeliveryFeedbackRequestDto(typeDto, str, null, str2, arrayList, null);
                    r0Var.getClass();
                    r0Var.m(null, deliveryFeedbackRequestDto);
                } else if (i == 2) {
                    Integer num = bvqVar.c;
                    String str3 = bvqVar.d;
                    r0 r0Var2 = bVar.b;
                    DeliveryFeedbackRequestDto.TypeDto typeDto2 = DeliveryFeedbackRequestDto.TypeDto.FINAL_ORDER_FEEDBACK;
                    List list3 = list;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new FeedbackReasonsItemDto((String) it2.next()));
                    }
                    if (ziq0Var != null) {
                        tipsInfoDto = new TipsInfoDto(null, ziq0Var.b, ziq0Var.a, mea0Var != null ? new PaymentContextDto(mea0Var.b, mea0Var.a) : null);
                    } else {
                        tipsInfoDto = null;
                    }
                    DeliveryFeedbackRequestDto deliveryFeedbackRequestDto2 = new DeliveryFeedbackRequestDto(typeDto2, str, num, str3, arrayList2, tipsInfoDto);
                    r0Var2.getClass();
                    r0Var2.m(null, deliveryFeedbackRequestDto2);
                } else {
                    if (i != 3) {
                        w511.b();
                        return null;
                    }
                    Integer num2 = bvqVar.c;
                    String str4 = bvqVar.d;
                    r0 r0Var3 = bVar.b;
                    DeliveryFeedbackRequestDto.TypeDto typeDto3 = DeliveryFeedbackRequestDto.TypeDto.REGULAR_ORDER_FEEDBACK;
                    List list4 = list;
                    ArrayList arrayList3 = new ArrayList(tcc.n(list4, 10));
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new FeedbackReasonsItemDto((String) it3.next()));
                    }
                    DeliveryFeedbackRequestDto deliveryFeedbackRequestDto3 = new DeliveryFeedbackRequestDto(typeDto3, str, num2, str4, arrayList3, ziq0Var != null ? new TipsInfoDto(null, ziq0Var.b, ziq0Var.a, null) : null);
                    r0Var3.getClass();
                    r0Var3.m(null, deliveryFeedbackRequestDto3);
                }
                return zy11.a;
            }
            ru.yandex.taxi.logistics.payment.a aVar = kVar.D;
            this.L$0 = null;
            this.L$1 = guqVar;
            this.L$2 = bvqVar;
            this.I$0 = i3;
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.y(aVar.a, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            guqVar2 = guqVar;
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bvqVar = (bvq) this.L$2;
            guqVar2 = (guq) this.L$1;
            kotlin.b.b(obj);
        }
        mea0Var = (mea0) obj;
        guqVar = guqVar2;
        ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.b bVar2 = guqVar.a;
        ziq0 ziq0Var2 = bvqVar.f;
        List list5 = bvqVar.e;
        String str5 = bvqVar.b;
        i = fuq.a[bvqVar.a.ordinal()];
        if (i != 1) {
        }
        return zy11.a;
    }
}
