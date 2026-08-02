package ru.yandex.taxi.masstransit.geopayment.checkout.network;

import defpackage.cmt;
import defpackage.f6f;
import defpackage.fmt;
import defpackage.h6f;
import defpackage.i3y;
import defpackage.jst;
import defpackage.n6f;
import defpackage.ny61;
import defpackage.on2;
import defpackage.rol0;
import defpackage.s8o;
import defpackage.sib1;
import defpackage.zn1;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CreatePaymentDto$ErrorType;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CreatePaymentResponse;

/* loaded from: classes6.dex */
public final class a {
    public final i3y a;

    public a(on2 on2Var) {
        this.a = kotlin.a.a(new zn1(on2Var, 13));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(n6f n6fVar, ContinuationImpl continuationImpl) {
        CreatePaymentRepository$createPayment$1 createPaymentRepository$createPayment$1;
        int i;
        try {
            if (continuationImpl instanceof CreatePaymentRepository$createPayment$1) {
                createPaymentRepository$createPayment$1 = (CreatePaymentRepository$createPayment$1) continuationImpl;
                int i2 = createPaymentRepository$createPayment$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    createPaymentRepository$createPayment$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = createPaymentRepository$createPayment$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = createPaymentRepository$createPayment$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<CreatePaymentResponse> a = ((MtCreatePaymentApi) this.a.getValue()).a(n6fVar);
                        createPaymentRepository$createPayment$1.L$0 = null;
                        createPaymentRepository$createPayment$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.b(a, null, createPaymentRepository$createPayment$1);
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
                    fmt fmtVar = (fmt) obj;
                    return new h6f((CreatePaymentResponse) fmtVar.a, fmtVar.e.a("X-YaMasstransitRequestId"));
                }
            }
            if (i != 0) {
            }
            fmt fmtVar2 = (fmt) obj;
            return new h6f((CreatePaymentResponse) fmtVar2.a, fmtVar2.e.a("X-YaMasstransitRequestId"));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Error while requesting pay");
            return new f6f(th, CreatePaymentDto$ErrorType.REQUEST_PAY_ERROR, sib1.b(s8o.O(th)));
        }
        createPaymentRepository$createPayment$1 = new CreatePaymentRepository$createPayment$1(this, continuationImpl);
        Object obj2 = createPaymentRepository$createPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = createPaymentRepository$createPayment$1.label;
    }

    public final rol0 b(n6f n6fVar) {
        return new rol0(new CreatePaymentRepository$createPaymentWithPollingFlow$1(this, n6fVar, null));
    }
}
