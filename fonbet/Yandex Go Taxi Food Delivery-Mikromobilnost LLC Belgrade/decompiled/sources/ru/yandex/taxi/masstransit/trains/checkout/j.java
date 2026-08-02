package ru.yandex.taxi.masstransit.trains.checkout;

import defpackage.cmt;
import defpackage.d240;
import defpackage.db40;
import defpackage.fmt;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.on2;
import defpackage.pa40;
import defpackage.sa40;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.masstransit.trains.checkout.model.CheckoutVersionType;

/* loaded from: classes6.dex */
public final class j {
    public final on2 a;
    public final i3y b = kotlin.a.a(new d240(6, this));

    public j(on2 on2Var) {
        this.a = on2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, db40 db40Var, Map map, ContinuationImpl continuationImpl) {
        MtTrainCheckoutRepositoryImpl$checkoutInfo$1 mtTrainCheckoutRepositoryImpl$checkoutInfo$1;
        int i;
        if (continuationImpl instanceof MtTrainCheckoutRepositoryImpl$checkoutInfo$1) {
            mtTrainCheckoutRepositoryImpl$checkoutInfo$1 = (MtTrainCheckoutRepositoryImpl$checkoutInfo$1) continuationImpl;
            int i2 = mtTrainCheckoutRepositoryImpl$checkoutInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainCheckoutRepositoryImpl$checkoutInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtTrainCheckoutRepositoryImpl$checkoutInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainCheckoutRepositoryImpl$checkoutInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    MtTrainCheckoutApi mtTrainCheckoutApi = (MtTrainCheckoutApi) this.b.getValue();
                    if (str == null || str.length() <= 0) {
                        str = null;
                    }
                    cmt<sa40> a = mtTrainCheckoutApi.a(new pa40(map, str, db40Var != null ? db40.a(db40Var, false, null, 0, 0, 15) : null, CheckoutVersionType.V2.getType()));
                    mtTrainCheckoutRepositoryImpl$checkoutInfo$1.L$0 = null;
                    mtTrainCheckoutRepositoryImpl$checkoutInfo$1.L$1 = null;
                    mtTrainCheckoutRepositoryImpl$checkoutInfo$1.L$2 = null;
                    mtTrainCheckoutRepositoryImpl$checkoutInfo$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.b(a, null, mtTrainCheckoutRepositoryImpl$checkoutInfo$1);
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
                return (fmt) obj;
            }
        }
        mtTrainCheckoutRepositoryImpl$checkoutInfo$1 = new MtTrainCheckoutRepositoryImpl$checkoutInfo$1(this, continuationImpl);
        Object obj2 = mtTrainCheckoutRepositoryImpl$checkoutInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainCheckoutRepositoryImpl$checkoutInfo$1.label;
        if (i != 0) {
        }
        return (fmt) obj2;
    }
}
