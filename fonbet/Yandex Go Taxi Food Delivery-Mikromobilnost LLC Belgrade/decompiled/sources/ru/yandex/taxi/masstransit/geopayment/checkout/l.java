package ru.yandex.taxi.masstransit.geopayment.checkout;

import com.yandex.go.payments.domain.l0;
import com.yandex.go.payments.payment.PaymentInfo$PaymentInfoTitle;
import com.yandex.go.payments.ui.PaymentIconInfoType;
import defpackage.bvf0;
import defpackage.by90;
import defpackage.evu0;
import defpackage.f4a0;
import defpackage.gci0;
import defpackage.h0a0;
import defpackage.h211;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kv90;
import defpackage.lea0;
import defpackage.ln30;
import defpackage.lv90;
import defpackage.m020;
import defpackage.m1a0;
import defpackage.mn30;
import defpackage.nn30;
import defpackage.ny61;
import defpackage.o0a0;
import defpackage.oea0;
import defpackage.qd30;
import defpackage.rd30;
import defpackage.t0a0;
import defpackage.u0a0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes6.dex */
public final class l implements qd30 {
    public final u0a0 a;
    public final com.yandex.go.payments.superapp.payment.b b;
    public final i3y c = kotlin.a.a(new m020(17, this));
    public final r0 d;
    public final r0 e;
    public final gci0 f;

    public l(u0a0 u0a0Var, com.yandex.go.payments.superapp.payment.b bVar) {
        this.a = u0a0Var;
        this.b = bVar;
        r0 c = bvf0.c(ln30.a);
        this.d = c;
        this.e = bvf0.c(null);
        this.f = kotlinx.coroutines.flow.e.d(c);
    }

    public final nn30 a(List list, lv90 lv90Var) {
        Object obj;
        f4a0 f4a0Var = null;
        PaymentMethod$Type paymentMethod$Type = lv90Var != null ? lv90Var.a : null;
        if ((paymentMethod$Type == null ? -1 : rd30.a[paymentMethod$Type.ordinal()]) == 1) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                lea0 lea0Var = (lea0) obj;
                if (jl40.l(lea0Var.getId(), lv90Var.b) && lea0Var.c() == PaymentMethod$Type.TRANSPORT_EXTERNAL) {
                    break;
                }
            }
            h211 h211Var = obj instanceof h211 ? (h211) obj : null;
            if (h211Var != null) {
                String str = h211Var.f;
                String str2 = h211Var.d;
                String str3 = h211Var.e;
                com.yandex.go.payments.common.a aVar = (com.yandex.go.payments.common.a) this.a;
                t0a0 d = aVar.d(h211Var);
                if (!evu0.J(str)) {
                    d = aVar.e(PaymentIconInfoType.ICON_TAG, str, d.b);
                }
                m1a0 m1a0Var = new m1a0(str2, str3, d, o0a0.c, null, false, new PaymentInfo$PaymentInfoTitle(h211Var.c, 6));
                kv90 kv90Var = lv90.Companion;
                PaymentMethod$Type paymentMethod$Type2 = PaymentMethod$Type.TRANSPORT_EXTERNAL;
                String str4 = lv90Var.b;
                kv90Var.getClass();
                f4a0Var = new f4a0(m1a0Var, kv90.b(str4, paymentMethod$Type2));
            }
        }
        return new nn30(list, f4a0Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|8|(1:(2:11|12)(2:23|24))(4:25|(1:26)|29|(1:31))|13|(1:14)|17|18|19))|41|6|7|8|(0)(0)|13|(1:14)|17|18|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
    
        r10 = r8.getValue();
        r11 = (defpackage.on30) r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(zzs zzsVar, String str, ContinuationImpl continuationImpl) {
        MtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$1 mtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$1;
        int i;
        Object value;
        List list;
        r0 r0Var;
        Object value2;
        if (continuationImpl instanceof MtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$1) {
            mtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$1 = (MtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$1) continuationImpl;
            int i2 = mtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                MtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$1 mtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$12 = mtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$1;
                Object obj = mtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$12.label;
                i3y i3yVar = this.c;
                r0 r0Var2 = this.d;
                if (i != 0) {
                    kotlin.b.b(obj);
                    do {
                        value = r0Var2.getValue();
                    } while (!r0Var2.k(value, mn30.a));
                    l0 b = ((by90) i3yVar.getValue()).b();
                    h0a0 h0a0Var = new h0a0(zzsVar, null);
                    mtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$12.L$0 = null;
                    mtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$12.L$1 = null;
                    mtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$12.L$2 = null;
                    mtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$12.label = 1;
                    obj = l0.d(b, h0a0Var, str, false, mtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$12, 28);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                list = ((oea0) obj).a;
                r0Var = this.e;
                do {
                    value2 = r0Var.getValue();
                } while (!r0Var.k(value2, list));
                nn30 a = a(list, ((by90) i3yVar.getValue()).b().i("transport_external"));
                r0Var2.getClass();
                r0Var2.m(null, a);
                return zy11.a;
            }
        }
        mtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$1 = new MtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$1(this, continuationImpl);
        MtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$1 mtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$122 = mtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$1;
        Object obj2 = mtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtCheckoutListPaymentMethodsRepositoryImpl$requestListPaymentMethods$122.label;
        i3y i3yVar2 = this.c;
        r0 r0Var22 = this.d;
        if (i != 0) {
        }
        list = ((oea0) obj2).a;
        r0Var = this.e;
        do {
            value2 = r0Var.getValue();
        } while (!r0Var.k(value2, list));
        nn30 a2 = a(list, ((by90) i3yVar2.getValue()).b().i("transport_external"));
        r0Var22.getClass();
        r0Var22.m(null, a2);
        return zy11.a;
    }
}
