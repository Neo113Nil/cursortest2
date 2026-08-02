package ru.yandex.taxi.delivery.extracted_delivery_form.interactors.unitedsummary;

import defpackage.avj0;
import defpackage.ini;
import defpackage.kyh0;
import defpackage.nvi;
import defpackage.ny61;
import defpackage.ovi;
import defpackage.vpr;
import defpackage.vsi;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ovi b;

    public a(vpr vprVar, ovi oviVar) {
        this.a = vprVar;
        this.b = oviVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryUnitedSummaryStateInteractor$stateFlow$$inlined$map$1$2$1 deliveryUnitedSummaryStateInteractor$stateFlow$$inlined$map$1$2$1;
        int i;
        String str;
        if (continuation instanceof DeliveryUnitedSummaryStateInteractor$stateFlow$$inlined$map$1$2$1) {
            deliveryUnitedSummaryStateInteractor$stateFlow$$inlined$map$1$2$1 = (DeliveryUnitedSummaryStateInteractor$stateFlow$$inlined$map$1$2$1) continuation;
            int i2 = deliveryUnitedSummaryStateInteractor$stateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryUnitedSummaryStateInteractor$stateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryUnitedSummaryStateInteractor$stateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryUnitedSummaryStateInteractor$stateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ini iniVar = (ini) obj;
                    ovi oviVar = this.b;
                    vsi vsiVar = oviVar.a;
                    String str2 = vsiVar.a;
                    String str3 = vsiVar.b;
                    String str4 = iniVar.a;
                    String str5 = iniVar.d;
                    boolean z = iniVar.b;
                    String str6 = iniVar.c;
                    if (str5 == null || str5.length() == 0) {
                        if (str6.length() <= 0) {
                            str6 = ((avj0) oviVar.c.b).h(kyh0.summary_confirm);
                        }
                        str = str6;
                    } else {
                        str = str5;
                    }
                    boolean z2 = iniVar.e;
                    nvi nviVar = new nvi(str2, str3, str4, z, iniVar.j, str, str5 == null || str5.length() == 0, z2, iniVar.f, iniVar.g, iniVar.h, iniVar.i, iniVar.k, iniVar.l);
                    deliveryUnitedSummaryStateInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
                    deliveryUnitedSummaryStateInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
                    deliveryUnitedSummaryStateInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
                    deliveryUnitedSummaryStateInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
                    deliveryUnitedSummaryStateInteractor$stateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(nviVar, deliveryUnitedSummaryStateInteractor$stateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        deliveryUnitedSummaryStateInteractor$stateFlow$$inlined$map$1$2$1 = new DeliveryUnitedSummaryStateInteractor$stateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = deliveryUnitedSummaryStateInteractor$stateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryUnitedSummaryStateInteractor$stateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
