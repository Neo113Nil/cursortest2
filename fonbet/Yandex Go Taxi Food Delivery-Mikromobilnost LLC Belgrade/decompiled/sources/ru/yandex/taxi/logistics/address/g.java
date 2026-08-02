package ru.yandex.taxi.logistics.address;

import defpackage.a0t;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class g {
    public final po21 a;

    public g(po21 po21Var) {
        this.a = po21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        DeliveryUserLocationRepositoryImpl$getCurrentLocation$1 deliveryUserLocationRepositoryImpl$getCurrentLocation$1;
        int i;
        if (continuationImpl instanceof DeliveryUserLocationRepositoryImpl$getCurrentLocation$1) {
            deliveryUserLocationRepositoryImpl$getCurrentLocation$1 = (DeliveryUserLocationRepositoryImpl$getCurrentLocation$1) continuationImpl;
            int i2 = deliveryUserLocationRepositoryImpl$getCurrentLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryUserLocationRepositoryImpl$getCurrentLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryUserLocationRepositoryImpl$getCurrentLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryUserLocationRepositoryImpl$getCurrentLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    deliveryUserLocationRepositoryImpl$getCurrentLocation$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.a).h(deliveryUserLocationRepositoryImpl$getCurrentLocation$1);
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
                mo21 mo21Var = (mo21) obj;
                return new a0t(mo21Var.a, mo21Var.b, mo21Var.c);
            }
        }
        deliveryUserLocationRepositoryImpl$getCurrentLocation$1 = new DeliveryUserLocationRepositoryImpl$getCurrentLocation$1(this, continuationImpl);
        Object obj2 = deliveryUserLocationRepositoryImpl$getCurrentLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryUserLocationRepositoryImpl$getCurrentLocation$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj2;
        return new a0t(mo21Var2.a, mo21Var2.b, mo21Var2.c);
    }
}
