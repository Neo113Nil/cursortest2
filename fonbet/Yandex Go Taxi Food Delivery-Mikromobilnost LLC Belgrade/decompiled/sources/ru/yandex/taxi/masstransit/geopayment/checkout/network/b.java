package ru.yandex.taxi.masstransit.geopayment.checkout.network;

import defpackage.bvf0;
import defpackage.cmt;
import defpackage.e3n;
import defpackage.evu0;
import defpackage.flb;
import defpackage.fmt;
import defpackage.ge30;
import defpackage.i3y;
import defpackage.jst;
import defpackage.kp50;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.on2;
import defpackage.pz40;
import defpackage.q8j0;
import defpackage.r6f;
import defpackage.s8o;
import defpackage.sib1;
import defpackage.tlj;
import defpackage.ujb;
import defpackage.vjb;
import defpackage.wjb;
import defpackage.yjb;
import defpackage.zjb;
import defpackage.zn1;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;

/* loaded from: classes6.dex */
public final class b implements ge30 {
    public final i3y a;
    public final r0 b;
    public final r0 c;
    public final r0 d;

    public b(on2 on2Var) {
        this.a = kotlin.a.a(new zn1(on2Var, 27));
        o430 o430Var = e3n.b;
        bvf0.c(new e3n(kp50.T(0.3d, DurationUnit.SECONDS)));
        this.b = bvf0.c(r6f.h);
        this.c = bvf0.c(null);
        this.d = bvf0.c(wjb.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0087 A[Catch: all -> 0x002d, CancellationException -> 0x00ad, TryCatch #2 {CancellationException -> 0x00ad, all -> 0x002d, blocks: (B:11:0x0029, B:12:0x0051, B:13:0x0081, B:15:0x0087, B:18:0x0096, B:23:0x009a, B:25:0x00a0, B:28:0x00a6, B:33:0x003a), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0 A[Catch: all -> 0x002d, CancellationException -> 0x00ad, TryCatch #2 {CancellationException -> 0x00ad, all -> 0x002d, blocks: (B:11:0x0029, B:12:0x0051, B:13:0x0081, B:15:0x0087, B:18:0x0096, B:23:0x009a, B:25:0x00a0, B:28:0x00a6, B:33:0x003a), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6 A[Catch: all -> 0x002d, CancellationException -> 0x00ad, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00ad, all -> 0x002d, blocks: (B:11:0x0029, B:12:0x0051, B:13:0x0081, B:15:0x0087, B:18:0x0096, B:23:0x009a, B:25:0x00a0, B:28:0x00a6, B:33:0x003a), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(flb flbVar, ContinuationImpl continuationImpl) {
        MtCheckoutRepositoryImpl$getCheckoutFromNet$1 mtCheckoutRepositoryImpl$getCheckoutFromNet$1;
        int i;
        try {
            if (continuationImpl instanceof MtCheckoutRepositoryImpl$getCheckoutFromNet$1) {
                mtCheckoutRepositoryImpl$getCheckoutFromNet$1 = (MtCheckoutRepositoryImpl$getCheckoutFromNet$1) continuationImpl;
                int i2 = mtCheckoutRepositoryImpl$getCheckoutFromNet$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mtCheckoutRepositoryImpl$getCheckoutFromNet$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = mtCheckoutRepositoryImpl$getCheckoutFromNet$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mtCheckoutRepositoryImpl$getCheckoutFromNet$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<CheckoutResponse> a = ((MtCheckoutApi) this.a.getValue()).a(flbVar);
                        mtCheckoutRepositoryImpl$getCheckoutFromNet$1.L$0 = flbVar;
                        mtCheckoutRepositoryImpl$getCheckoutFromNet$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.b(a, null, mtCheckoutRepositoryImpl$getCheckoutFromNet$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        flbVar = (flb) mtCheckoutRepositoryImpl$getCheckoutFromNet$1.L$0;
                        kotlin.b.b(obj);
                    }
                    fmt fmtVar = (fmt) obj;
                    String a2 = fmtVar.e.a("X-YaMasstransitRequestId");
                    CheckoutResponse checkoutResponse = (CheckoutResponse) fmtVar.a;
                    q8j0 q8j0Var = new q8j0(flbVar.a, checkoutResponse.f, flbVar.b, flbVar.d, flbVar.e, checkoutResponse.h.d);
                    List list = checkoutResponse.e.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!evu0.J(((tlj) obj2).a)) {
                            arrayList.add(obj2);
                        }
                    }
                    return arrayList.isEmpty() ? new ujb(checkoutResponse, q8j0Var, a2) : new yjb(checkoutResponse, q8j0Var, a2, false);
                }
            }
            if (i != 0) {
            }
            fmt fmtVar2 = (fmt) obj;
            String a22 = fmtVar2.e.a("X-YaMasstransitRequestId");
            CheckoutResponse checkoutResponse2 = (CheckoutResponse) fmtVar2.a;
            q8j0 q8j0Var2 = new q8j0(flbVar.a, checkoutResponse2.f, flbVar.b, flbVar.d, flbVar.e, checkoutResponse2.h.d);
            List list2 = checkoutResponse2.e.b;
            ArrayList arrayList2 = new ArrayList();
            while (r1.hasNext()) {
            }
            if (arrayList2.isEmpty()) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Error while requesting masstransit/payment/checkout");
            return new vjb(th, new q8j0(flbVar.a, flbVar.f, flbVar.b, flbVar.d, flbVar.e, flbVar.i), sib1.b(s8o.O(th)));
        }
        mtCheckoutRepositoryImpl$getCheckoutFromNet$1 = new MtCheckoutRepositoryImpl$getCheckoutFromNet$1(this, continuationImpl);
        Object obj3 = mtCheckoutRepositoryImpl$getCheckoutFromNet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtCheckoutRepositoryImpl$getCheckoutFromNet$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:10:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(flb flbVar, ContinuationImpl continuationImpl) {
        MtCheckoutRepositoryImpl$requestCheckout$1 mtCheckoutRepositoryImpl$requestCheckout$1;
        int i;
        n4u0 n4u0Var;
        Object a;
        if (continuationImpl instanceof MtCheckoutRepositoryImpl$requestCheckout$1) {
            mtCheckoutRepositoryImpl$requestCheckout$1 = (MtCheckoutRepositoryImpl$requestCheckout$1) continuationImpl;
            int i2 = mtCheckoutRepositoryImpl$requestCheckout$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtCheckoutRepositoryImpl$requestCheckout$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtCheckoutRepositoryImpl$requestCheckout$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtCheckoutRepositoryImpl$requestCheckout$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n4u0Var = this.d;
                    Object value = n4u0Var.getValue();
                    mtCheckoutRepositoryImpl$requestCheckout$1.L$0 = flbVar;
                    mtCheckoutRepositoryImpl$requestCheckout$1.L$1 = n4u0Var;
                    mtCheckoutRepositoryImpl$requestCheckout$1.L$2 = value;
                    mtCheckoutRepositoryImpl$requestCheckout$1.L$3 = null;
                    mtCheckoutRepositoryImpl$requestCheckout$1.label = 1;
                    a = a(flbVar, mtCheckoutRepositoryImpl$requestCheckout$1);
                    if (a != obj2) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj3 = mtCheckoutRepositoryImpl$requestCheckout$1.L$2;
                    n4u0 n4u0Var2 = (pz40) mtCheckoutRepositoryImpl$requestCheckout$1.L$1;
                    flb flbVar2 = (flb) mtCheckoutRepositoryImpl$requestCheckout$1.L$0;
                    kotlin.b.b(obj);
                    n4u0 n4u0Var3 = n4u0Var2;
                    r0 r0Var = (r0) n4u0Var3;
                    if (!r0Var.k(obj3, (zjb) obj)) {
                        return zy11.a;
                    }
                    flbVar = flbVar2;
                    n4u0Var = r0Var;
                    Object value2 = n4u0Var.getValue();
                    mtCheckoutRepositoryImpl$requestCheckout$1.L$0 = flbVar;
                    mtCheckoutRepositoryImpl$requestCheckout$1.L$1 = n4u0Var;
                    mtCheckoutRepositoryImpl$requestCheckout$1.L$2 = value2;
                    mtCheckoutRepositoryImpl$requestCheckout$1.L$3 = null;
                    mtCheckoutRepositoryImpl$requestCheckout$1.label = 1;
                    a = a(flbVar, mtCheckoutRepositoryImpl$requestCheckout$1);
                    if (a != obj2) {
                        return obj2;
                    }
                    flbVar2 = flbVar;
                    obj3 = value2;
                    obj = a;
                    n4u0Var3 = n4u0Var;
                    r0 r0Var2 = (r0) n4u0Var3;
                    if (!r0Var2.k(obj3, (zjb) obj)) {
                    }
                }
            }
        }
        mtCheckoutRepositoryImpl$requestCheckout$1 = new MtCheckoutRepositoryImpl$requestCheckout$1(this, continuationImpl);
        Object obj4 = mtCheckoutRepositoryImpl$requestCheckout$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtCheckoutRepositoryImpl$requestCheckout$1.label;
        if (i != 0) {
        }
    }
}
