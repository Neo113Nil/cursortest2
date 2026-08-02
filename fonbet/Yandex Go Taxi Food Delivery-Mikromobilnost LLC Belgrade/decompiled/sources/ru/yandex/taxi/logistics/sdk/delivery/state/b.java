package ru.yandex.taxi.logistics.sdk.delivery.state;

import android.content.Context;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import defpackage.cuh;
import defpackage.dsg;
import defpackage.dxf0;
import defpackage.hwh;
import defpackage.jl40;
import defpackage.kej;
import defpackage.kgx;
import defpackage.kme0;
import defpackage.l7;
import defpackage.m80;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.rle0;
import defpackage.tpg;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.PropertyReference2Impl;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.MultiorderDialogDto;

/* loaded from: classes9.dex */
public final class b implements hwh {
    public static final /* synthetic */ kgx[] e;
    public final Context a;
    public final kej b;
    public final rle0 c = jl40.I("delivery-alerts-data-store", new dxf0(new dsg(10)), null, null, 12);
    public final JsonAdapter d = new Moshi.Builder().add((JsonAdapter.Factory) new m80()).build().adapter(MultiorderDialogDto.class);

    static {
        PropertyReference2Impl propertyReference2Impl = new PropertyReference2Impl(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        qoi0.a.getClass();
        e = new kgx[]{propertyReference2Impl};
    }

    public b(Context context, kej kejVar) {
        this.a = context;
        this.b = kejVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        DeliveryAlertsDataStoreImpl$getAlertsByDeliveryId$1 deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$1;
        int i;
        if (continuationImpl instanceof DeliveryAlertsDataStoreImpl$getAlertsByDeliveryId$1) {
            deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$1 = (DeliveryAlertsDataStoreImpl$getAlertsByDeliveryId$1) continuationImpl;
            int i2 = deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = 6;
                    l7 l7Var = new l7(i3, b(this.a).getData(), new kme0(str), this);
                    deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$1.L$0 = null;
                    deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$1.L$1 = null;
                    deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(l7Var, deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$1);
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
                return (List) obj;
            }
        }
        deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$1 = new DeliveryAlertsDataStoreImpl$getAlertsByDeliveryId$1(this, continuationImpl);
        Object obj2 = deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$1.label;
        if (i != 0) {
        }
        return (List) obj2;
    }

    public final tpg b(Context context) {
        return (tpg) this.c.getValue(context, e[0]);
    }

    public final Object c(cuh cuhVar, Continuation continuation) {
        Object a = androidx.datastore.preferences.core.b.a(b(this.a), new DeliveryAlertsDataStoreImpl$removeAllForDeliveryIdByCondition$2(cuhVar, null), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }
}
