package ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.dtb1;
import defpackage.i4f;
import defpackage.is50;
import defpackage.j4f;
import defpackage.js50;
import defpackage.jwh;
import defpackage.k4f;
import defpackage.ks50;
import defpackage.ls50;
import defpackage.ms50;
import defpackage.ns50;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.ps50;
import defpackage.q32;
import defpackage.w511;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes9.dex */
public final class c {
    public final jwh a;
    public final ru.yandex.taxi.logistics.sdk.management.storage.c b;

    public c(jwh jwhVar, ru.yandex.taxi.logistics.sdk.management.storage.c cVar) {
        this.a = jwhVar;
        this.b = cVar;
    }

    public static dtb1 a(ps50 ps50Var) {
        if (!(ps50Var instanceof js50) && !(ps50Var instanceof ms50)) {
            if (ps50Var instanceof ls50) {
                return new i4f(oyr.i(((ls50) ps50Var).a, "backend error code: "));
            }
            if (ps50Var instanceof ks50) {
                return k4f.a;
            }
            if (!(ps50Var instanceof is50) && !(ps50Var instanceof ns50)) {
                w511.b();
                return null;
            }
        }
        return j4f.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Map map, ContinuationImpl continuationImpl) {
        CreateDeliveryAnalyticsReporter$onOrderCreated$1 createDeliveryAnalyticsReporter$onOrderCreated$1;
        int i;
        Map map2;
        q32 q32Var;
        jwh jwhVar;
        String str;
        if (continuationImpl instanceof CreateDeliveryAnalyticsReporter$onOrderCreated$1) {
            createDeliveryAnalyticsReporter$onOrderCreated$1 = (CreateDeliveryAnalyticsReporter$onOrderCreated$1) continuationImpl;
            int i2 = createDeliveryAnalyticsReporter$onOrderCreated$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                createDeliveryAnalyticsReporter$onOrderCreated$1.label = i2 - Integer.MIN_VALUE;
                Object obj = createDeliveryAnalyticsReporter$onOrderCreated$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = createDeliveryAnalyticsReporter$onOrderCreated$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    q32 q32Var2 = new q32("Logistics.order_created");
                    createDeliveryAnalyticsReporter$onOrderCreated$1.L$0 = map;
                    jwh jwhVar2 = this.a;
                    createDeliveryAnalyticsReporter$onOrderCreated$1.L$1 = jwhVar2;
                    createDeliveryAnalyticsReporter$onOrderCreated$1.L$2 = q32Var2;
                    createDeliveryAnalyticsReporter$onOrderCreated$1.L$3 = "is_business_on";
                    createDeliveryAnalyticsReporter$onOrderCreated$1.label = 1;
                    Object a = this.b.a(createDeliveryAnalyticsReporter$onOrderCreated$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    map2 = map;
                    q32Var = q32Var2;
                    jwhVar = jwhVar2;
                    obj = a;
                    str = "is_business_on";
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) createDeliveryAnalyticsReporter$onOrderCreated$1.L$3;
                    q32Var = (q32) createDeliveryAnalyticsReporter$onOrderCreated$1.L$2;
                    jwhVar = (jwh) createDeliveryAnalyticsReporter$onOrderCreated$1.L$1;
                    map2 = (Map) createDeliveryAnalyticsReporter$onOrderCreated$1.L$0;
                    kotlin.b.b(obj);
                }
                q32Var.d(obj, str);
                q32Var.e(map2);
                jwhVar.a(q32Var);
                return zy11.a;
            }
        }
        createDeliveryAnalyticsReporter$onOrderCreated$1 = new CreateDeliveryAnalyticsReporter$onOrderCreated$1(this, continuationImpl);
        Object obj2 = createDeliveryAnalyticsReporter$onOrderCreated$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = createDeliveryAnalyticsReporter$onOrderCreated$1.label;
        if (i != 0) {
        }
        q32Var.d(obj2, str);
        q32Var.e(map2);
        jwhVar.a(q32Var);
        return zy11.a;
    }

    public final void c(dtb1 dtb1Var, String str) {
        String str2;
        q32 q32Var = new q32("Logistics.order_create_failed");
        if (dtb1Var instanceof k4f) {
            str2 = "inconsistency";
        } else if (dtb1Var instanceof j4f) {
            str2 = "general";
        } else {
            if (!(dtb1Var instanceof i4f)) {
                w511.b();
                return;
            }
            str2 = "detailed";
        }
        q32Var.d(str2, "kind");
        q32Var.d(str, AuthSdkActivity.RESPONSE_TYPE_CODE);
        if (dtb1Var instanceof i4f) {
            q32Var.d(((i4f) dtb1Var).c(), DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        }
        this.a.a(q32Var);
    }
}
