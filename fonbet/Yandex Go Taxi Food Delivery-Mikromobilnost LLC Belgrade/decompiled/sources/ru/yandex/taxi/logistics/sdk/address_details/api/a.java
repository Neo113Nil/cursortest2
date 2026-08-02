package ru.yandex.taxi.logistics.sdk.address_details.api;

import defpackage.czh;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tls;
import defpackage.tpr;
import defpackage.vni;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a implements vni {
    public final /* synthetic */ sls A;
    public final /* synthetic */ wls B;
    public final /* synthetic */ zls a;
    public final /* synthetic */ wls b;
    public final /* synthetic */ zls c;
    public final /* synthetic */ tls w;
    public final /* synthetic */ czh x;
    public final /* synthetic */ tpr y;
    public final /* synthetic */ b z;

    public a(zls zlsVar, wls wlsVar, zls zlsVar2, tls tlsVar, czh czhVar, tpr tprVar, b bVar, sls slsVar, wls wlsVar2) {
        this.a = zlsVar;
        this.b = wlsVar;
        this.c = zlsVar2;
        this.w = tlsVar;
        this.x = czhVar;
        this.y = tprVar;
        this.z = bVar;
        this.A = slsVar;
        this.B = wlsVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AddressDetailsRouter$open$7$1$onDoneButtonClick$1 addressDetailsRouter$open$7$1$onDoneButtonClick$1;
        int i;
        if (continuationImpl instanceof AddressDetailsRouter$open$7$1$onDoneButtonClick$1) {
            addressDetailsRouter$open$7$1$onDoneButtonClick$1 = (AddressDetailsRouter$open$7$1$onDoneButtonClick$1) continuationImpl;
            int i2 = addressDetailsRouter$open$7$1$onDoneButtonClick$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressDetailsRouter$open$7$1$onDoneButtonClick$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addressDetailsRouter$open$7$1$onDoneButtonClick$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressDetailsRouter$open$7$1$onDoneButtonClick$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    addressDetailsRouter$open$7$1$onDoneButtonClick$1.label = 1;
                    if (this.w.invoke(addressDetailsRouter$open$7$1$onDoneButtonClick$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                this.x.dismiss();
                return zy11.a;
            }
        }
        addressDetailsRouter$open$7$1$onDoneButtonClick$1 = new AddressDetailsRouter$open$7$1$onDoneButtonClick$1(this, continuationImpl);
        Object obj2 = addressDetailsRouter$open$7$1$onDoneButtonClick$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressDetailsRouter$open$7$1$onDoneButtonClick$1.label;
        if (i != 0) {
        }
        this.x.dismiss();
        return zy11.a;
    }
}
