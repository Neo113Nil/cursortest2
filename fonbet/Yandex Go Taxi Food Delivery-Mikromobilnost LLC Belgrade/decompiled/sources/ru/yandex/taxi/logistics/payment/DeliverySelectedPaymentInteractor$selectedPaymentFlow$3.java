package ru.yandex.taxi.logistics.payment;

import com.yandex.go.payments.api.composite.CompositePaymentState;
import com.yandex.go.payments.paymentlist.data.c;
import defpackage.dms;
import defpackage.f89;
import defpackage.fl8;
import defpackage.jl40;
import defpackage.k1a0;
import defpackage.lv90;
import defpackage.mea0;
import defpackage.mrd;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8a0;
import defpackage.qqy;
import defpackage.uma0;
import defpackage.v8a0;
import defpackage.wxc;
import defpackage.xoi;
import defpackage.xxc;
import defpackage.yhi;
import defpackage.yoi;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Llv90;", "payment", "Lmrd;", "compositePaymentStateModel", "", "Llea0;", "<unused var>", "Lzy11;", "Lmea0;", "<anonymous>", "(Lru/yandex/taxi/gopayments/dto/Payment;Lcom/yandex/go/payments/api/composite/CompositePaymentStateModel;Ljava/util/List;V)Lcom/yandex/delivery/mapper/model/PaymentModel;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.payment.DeliverySelectedPaymentInteractor$selectedPaymentFlow$3", f = "DeliverySelectedPaymentInteractor.kt", l = {45}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliverySelectedPaymentInteractor$selectedPaymentFlow$3 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ yoi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliverySelectedPaymentInteractor$selectedPaymentFlow$3(yoi yoiVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = yoiVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        DeliverySelectedPaymentInteractor$selectedPaymentFlow$3 deliverySelectedPaymentInteractor$selectedPaymentFlow$3 = new DeliverySelectedPaymentInteractor$selectedPaymentFlow$3(this.this$0, (Continuation) obj5);
        deliverySelectedPaymentInteractor$selectedPaymentFlow$3.L$0 = (lv90) obj;
        deliverySelectedPaymentInteractor$selectedPaymentFlow$3.L$1 = (mrd) obj2;
        return deliverySelectedPaymentInteractor$selectedPaymentFlow$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PaymentMethod$Type paymentMethod$Type;
        String code;
        Object d;
        String str;
        String str2;
        List list;
        xxc g;
        fl8 a;
        Object obj2;
        lv90 lv90Var = (lv90) this.L$0;
        mrd mrdVar = (mrd) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str3 = null;
        if (i == 0) {
            b.b(obj);
            paymentMethod$Type = lv90Var.a;
            code = paymentMethod$Type != null ? paymentMethod$Type.getCode() : null;
            String str4 = lv90Var.b;
            o8a0 o8a0Var = this.this$0.b;
            this.L$0 = lv90Var;
            this.L$1 = mrdVar;
            this.L$2 = paymentMethod$Type;
            this.L$3 = code;
            this.L$4 = str4;
            this.label = 1;
            d = ((ru.yandex.taxi.order.view.b) o8a0Var).d(paymentMethod$Type, str4, null, null, this);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = str4;
            obj = d;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str5 = (String) this.L$4;
            code = (String) this.L$3;
            paymentMethod$Type = (PaymentMethod$Type) this.L$2;
            b.b(obj);
            str = str5;
        }
        String str6 = code;
        v8a0 v8a0Var = (v8a0) obj;
        if (v8a0Var != null && str6 != null) {
            this.this$0.getClass();
            if (xoi.a[paymentMethod$Type.ordinal()] == 1 || str != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                yoi yoiVar = this.this$0;
                if (str != null) {
                    ListBuilder h = ((c) yoiVar.a).h();
                    ArrayList arrayList = new ArrayList();
                    ListIterator listIterator = h.listIterator(0);
                    while (true) {
                        qqy qqyVar = (qqy) listIterator;
                        if (!qqyVar.hasNext()) {
                            break;
                        }
                        Object next = qqyVar.next();
                        if (next instanceof yhi) {
                            arrayList.add(next);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(((yhi) obj2).a, str)) {
                            break;
                        }
                    }
                    yhi yhiVar = (yhi) obj2;
                    if (yhiVar != null) {
                        str2 = yhiVar.d;
                        if (str2 != null) {
                            linkedHashMap.put("corp_client_type", str2);
                        }
                        if (lv90Var.a == PaymentMethod$Type.CARD && str != null && (a = this.this$0.e.a(str)) != null) {
                            str3 = ((uma0) this.this$0.f).c(a);
                        }
                        String str7 = str3;
                        String str8 = v8a0Var.a;
                        yoi yoiVar2 = this.this$0;
                        f89 f89Var = new f89(22, yoiVar2, v8a0Var, paymentMethod$Type);
                        yoiVar2.getClass();
                        if (mrdVar.a == CompositePaymentState.ENABLED_CHECKED && (g = yoiVar2.c.g()) != null) {
                            wxc wxcVar = g.a;
                            if (!g.a()) {
                                list = Collections.singletonList(new k1a0(wxcVar.b.getCode(), wxcVar.a));
                                return new mea0(str, str6, str8, str7, linkedHashMap, f89Var, list);
                            }
                        }
                        list = EmptyList.a;
                        return new mea0(str, str6, str8, str7, linkedHashMap, f89Var, list);
                    }
                } else {
                    yoiVar.getClass();
                }
                str2 = null;
                if (str2 != null) {
                }
                if (lv90Var.a == PaymentMethod$Type.CARD) {
                    str3 = ((uma0) this.this$0.f).c(a);
                }
                String str72 = str3;
                String str82 = v8a0Var.a;
                yoi yoiVar22 = this.this$0;
                f89 f89Var2 = new f89(22, yoiVar22, v8a0Var, paymentMethod$Type);
                yoiVar22.getClass();
                if (mrdVar.a == CompositePaymentState.ENABLED_CHECKED) {
                    wxc wxcVar2 = g.a;
                    if (!g.a()) {
                    }
                }
                list = EmptyList.a;
                return new mea0(str, str6, str82, str72, linkedHashMap, f89Var2, list);
            }
        }
        return null;
    }
}
