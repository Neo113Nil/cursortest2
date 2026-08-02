package ru.yandex.taxi.logistics.sdk.deliverydashboard.interactors;

import com.yandex.delivery.utils.dialogmanager.ErrorDialogInteractor$requestErrorDialog$2;
import com.yandex.delivery.utils.dialogmanager.ErrorDialogInteractor$requestUnknownErrorDialog$2;
import defpackage.bpc;
import defpackage.cpc;
import defpackage.ehg;
import defpackage.epc;
import defpackage.ny61;
import defpackage.ugg;
import defpackage.w511;
import defpackage.wls;
import defpackage.y6o;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a {
    public final ru.yandex.taxi.logistics.sdk.dashboard.storage.c a;
    public final com.yandex.delivery.utils.dialogmanager.a b;

    public a(ru.yandex.taxi.logistics.sdk.dashboard.storage.c cVar, com.yandex.delivery.utils.dialogmanager.a aVar) {
        this.a = cVar;
        this.b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        if (r13 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0093, code lost:
    
        if (r12 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cpc cpcVar, wls wlsVar, ContinuationImpl continuationImpl) {
        DeliveryDashboardDialogInteractor$handleStatus$1 deliveryDashboardDialogInteractor$handleStatus$1;
        int i;
        Object c;
        Object a;
        wls wlsVar2;
        ehg ehgVar;
        if (continuationImpl instanceof DeliveryDashboardDialogInteractor$handleStatus$1) {
            deliveryDashboardDialogInteractor$handleStatus$1 = (DeliveryDashboardDialogInteractor$handleStatus$1) continuationImpl;
            int i2 = deliveryDashboardDialogInteractor$handleStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryDashboardDialogInteractor$handleStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryDashboardDialogInteractor$handleStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryDashboardDialogInteractor$handleStatus$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Integer num = cpcVar.b;
                    com.yandex.delivery.utils.dialogmanager.a aVar = this.b;
                    if ((num != null && num.intValue() == 403) || (num != null && num.intValue() == 404)) {
                        y6o y6oVar = cpcVar.a;
                        deliveryDashboardDialogInteractor$handleStatus$1.L$0 = null;
                        deliveryDashboardDialogInteractor$handleStatus$1.L$1 = wlsVar;
                        deliveryDashboardDialogInteractor$handleStatus$1.label = 1;
                        a = aVar.a(y6oVar, new ErrorDialogInteractor$requestErrorDialog$2(), deliveryDashboardDialogInteractor$handleStatus$1);
                    } else {
                        deliveryDashboardDialogInteractor$handleStatus$1.L$0 = null;
                        deliveryDashboardDialogInteractor$handleStatus$1.L$1 = wlsVar;
                        deliveryDashboardDialogInteractor$handleStatus$1.label = 4;
                        c = aVar.c(new ErrorDialogInteractor$requestUnknownErrorDialog$2(), deliveryDashboardDialogInteractor$handleStatus$1);
                    }
                }
                if (i == 1) {
                    wlsVar = (wls) deliveryDashboardDialogInteractor$handleStatus$1.L$1;
                    kotlin.b.b(obj);
                    deliveryDashboardDialogInteractor$handleStatus$1.L$0 = null;
                    deliveryDashboardDialogInteractor$handleStatus$1.L$1 = wlsVar;
                    deliveryDashboardDialogInteractor$handleStatus$1.label = 2;
                    if (this.a.a(deliveryDashboardDialogInteractor$handleStatus$1) != coroutineSingletons) {
                        wlsVar2 = wlsVar;
                        ehgVar = new ehg(null);
                        deliveryDashboardDialogInteractor$handleStatus$1.L$0 = null;
                        deliveryDashboardDialogInteractor$handleStatus$1.L$1 = null;
                        deliveryDashboardDialogInteractor$handleStatus$1.label = 3;
                        if (wlsVar2.invoke(ehgVar, deliveryDashboardDialogInteractor$handleStatus$1) != coroutineSingletons) {
                        }
                    }
                }
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            wlsVar = (wls) deliveryDashboardDialogInteractor$handleStatus$1.L$1;
                            kotlin.b.b(obj);
                            deliveryDashboardDialogInteractor$handleStatus$1.L$0 = null;
                            deliveryDashboardDialogInteractor$handleStatus$1.L$1 = null;
                            deliveryDashboardDialogInteractor$handleStatus$1.label = 5;
                            return wlsVar.invoke(ugg.a, deliveryDashboardDialogInteractor$handleStatus$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                        }
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                wlsVar2 = (wls) deliveryDashboardDialogInteractor$handleStatus$1.L$1;
                kotlin.b.b(obj);
                ehgVar = new ehg(null);
                deliveryDashboardDialogInteractor$handleStatus$1.L$0 = null;
                deliveryDashboardDialogInteractor$handleStatus$1.L$1 = null;
                deliveryDashboardDialogInteractor$handleStatus$1.label = 3;
                if (wlsVar2.invoke(ehgVar, deliveryDashboardDialogInteractor$handleStatus$1) != coroutineSingletons) {
                }
            }
        }
        deliveryDashboardDialogInteractor$handleStatus$1 = new DeliveryDashboardDialogInteractor$handleStatus$1(this, continuationImpl);
        Object obj2 = deliveryDashboardDialogInteractor$handleStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryDashboardDialogInteractor$handleStatus$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(bpc bpcVar, wls wlsVar, ContinuationImpl continuationImpl) {
        DeliveryDashboardDialogInteractor$showErrorDialog$1 deliveryDashboardDialogInteractor$showErrorDialog$1;
        Object obj;
        int i;
        Object c;
        if (continuationImpl instanceof DeliveryDashboardDialogInteractor$showErrorDialog$1) {
            deliveryDashboardDialogInteractor$showErrorDialog$1 = (DeliveryDashboardDialogInteractor$showErrorDialog$1) continuationImpl;
            int i2 = deliveryDashboardDialogInteractor$showErrorDialog$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryDashboardDialogInteractor$showErrorDialog$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryDashboardDialogInteractor$showErrorDialog$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryDashboardDialogInteractor$showErrorDialog$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            wlsVar = (wls) deliveryDashboardDialogInteractor$showErrorDialog$1.L$1;
                            kotlin.b.b(obj2);
                        } else if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    kotlin.b.b(obj2);
                    return zy11Var;
                }
                kotlin.b.b(obj2);
                if (bpcVar instanceof cpc) {
                    deliveryDashboardDialogInteractor$showErrorDialog$1.L$0 = null;
                    deliveryDashboardDialogInteractor$showErrorDialog$1.L$1 = null;
                    deliveryDashboardDialogInteractor$showErrorDialog$1.label = 1;
                    if (a((cpc) bpcVar, wlsVar, deliveryDashboardDialogInteractor$showErrorDialog$1) != obj) {
                        return zy11Var;
                    }
                } else {
                    if (!(bpcVar instanceof epc)) {
                        w511.b();
                        return null;
                    }
                    deliveryDashboardDialogInteractor$showErrorDialog$1.L$0 = null;
                    deliveryDashboardDialogInteractor$showErrorDialog$1.L$1 = wlsVar;
                    deliveryDashboardDialogInteractor$showErrorDialog$1.label = 2;
                    c = this.b.c(new ErrorDialogInteractor$requestUnknownErrorDialog$2(), deliveryDashboardDialogInteractor$showErrorDialog$1);
                }
                return obj;
                deliveryDashboardDialogInteractor$showErrorDialog$1.L$0 = null;
                deliveryDashboardDialogInteractor$showErrorDialog$1.L$1 = null;
                deliveryDashboardDialogInteractor$showErrorDialog$1.label = 3;
                if (wlsVar.invoke(ugg.a, deliveryDashboardDialogInteractor$showErrorDialog$1) != obj) {
                    return obj;
                }
            }
        }
        deliveryDashboardDialogInteractor$showErrorDialog$1 = new DeliveryDashboardDialogInteractor$showErrorDialog$1(this, continuationImpl);
        Object obj22 = deliveryDashboardDialogInteractor$showErrorDialog$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryDashboardDialogInteractor$showErrorDialog$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
        deliveryDashboardDialogInteractor$showErrorDialog$1.L$0 = null;
        deliveryDashboardDialogInteractor$showErrorDialog$1.L$1 = null;
        deliveryDashboardDialogInteractor$showErrorDialog$1.label = 3;
        if (wlsVar.invoke(ugg.a, deliveryDashboardDialogInteractor$showErrorDialog$1) != obj) {
        }
    }
}
