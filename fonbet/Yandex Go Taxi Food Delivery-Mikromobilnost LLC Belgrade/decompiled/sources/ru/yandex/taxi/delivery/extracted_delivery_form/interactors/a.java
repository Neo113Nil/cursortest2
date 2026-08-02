package ru.yandex.taxi.delivery.extracted_delivery_form.interactors;

import defpackage.dbi;
import defpackage.jl40;
import defpackage.m1i;
import defpackage.ny61;
import defpackage.qej;
import defpackage.sb0;
import defpackage.sls;
import defpackage.vej;
import defpackage.vsi;
import defpackage.w511;
import defpackage.wej;
import defpackage.xej;
import defpackage.yej;
import defpackage.zej;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a {
    public final vsi a;
    public final com.yandex.delivery.utils.dialogmanager.impl.b b;

    public a(vsi vsiVar, com.yandex.delivery.utils.dialogmanager.impl.b bVar) {
        this.a = vsiVar;
        this.b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r2v7, types: [sls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(dbi dbiVar, sb0 sb0Var, dbi dbiVar2, ContinuationImpl continuationImpl) {
        ApartmentAlertInteractor$showEmptyApartmentPopup$1 apartmentAlertInteractor$showEmptyApartmentPopup$1;
        int i;
        dbi dbiVar3;
        Object obj;
        sls slsVar;
        sls slsVar2;
        zej zejVar;
        if (continuationImpl instanceof ApartmentAlertInteractor$showEmptyApartmentPopup$1) {
            apartmentAlertInteractor$showEmptyApartmentPopup$1 = (ApartmentAlertInteractor$showEmptyApartmentPopup$1) continuationImpl;
            int i2 = apartmentAlertInteractor$showEmptyApartmentPopup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                apartmentAlertInteractor$showEmptyApartmentPopup$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = apartmentAlertInteractor$showEmptyApartmentPopup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = apartmentAlertInteractor$showEmptyApartmentPopup$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    m1i m1iVar = this.a.e;
                    qej qejVar = new qej(m1iVar.a, m1iVar.b, m1iVar.c, m1iVar.d, null, true, null, null, 208);
                    dbiVar3 = dbiVar;
                    apartmentAlertInteractor$showEmptyApartmentPopup$1.L$0 = dbiVar3;
                    apartmentAlertInteractor$showEmptyApartmentPopup$1.L$1 = sb0Var;
                    apartmentAlertInteractor$showEmptyApartmentPopup$1.L$2 = dbiVar2;
                    apartmentAlertInteractor$showEmptyApartmentPopup$1.L$3 = null;
                    apartmentAlertInteractor$showEmptyApartmentPopup$1.L$4 = null;
                    apartmentAlertInteractor$showEmptyApartmentPopup$1.label = 1;
                    Object a = this.b.a(qejVar, apartmentAlertInteractor$showEmptyApartmentPopup$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    slsVar = sb0Var;
                    slsVar2 = dbiVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    slsVar2 = (sls) apartmentAlertInteractor$showEmptyApartmentPopup$1.L$2;
                    slsVar = (sls) apartmentAlertInteractor$showEmptyApartmentPopup$1.L$1;
                    ?? r2 = (sls) apartmentAlertInteractor$showEmptyApartmentPopup$1.L$0;
                    kotlin.b.b(obj2);
                    obj = obj2;
                    dbiVar3 = r2;
                }
                zejVar = (zej) obj;
                if (!jl40.l(zejVar, yej.a)) {
                    slsVar.invoke();
                } else if (jl40.l(zejVar, wej.a)) {
                    slsVar2.invoke();
                } else if (jl40.l(zejVar, vej.a)) {
                    dbiVar3.invoke();
                } else if (!jl40.l(zejVar, xej.a)) {
                    w511.b();
                    return null;
                }
                return zy11.a;
            }
        }
        apartmentAlertInteractor$showEmptyApartmentPopup$1 = new ApartmentAlertInteractor$showEmptyApartmentPopup$1(this, continuationImpl);
        Object obj22 = apartmentAlertInteractor$showEmptyApartmentPopup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = apartmentAlertInteractor$showEmptyApartmentPopup$1.label;
        if (i != 0) {
        }
        zejVar = (zej) obj;
        if (!jl40.l(zejVar, yej.a)) {
        }
        return zy11.a;
    }
}
