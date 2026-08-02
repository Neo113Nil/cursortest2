package ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data;

import android.content.Context;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import defpackage.d4;
import defpackage.dxf0;
import defpackage.e4;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kme0;
import defpackage.mme0;
import defpackage.ny61;
import defpackage.p0;
import defpackage.rle0;
import defpackage.tpg;
import defpackage.tpr;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.model.AbandonedCartDeliveredNotificationDto;

/* loaded from: classes5.dex */
public final class a {
    public static final e4 d = new e4();
    public static final kme0 e = new kme0("delivered_notification");
    public static final rle0 f = jl40.I("trigger_communications", new dxf0(new p0(3)), null, null, 12);
    public final Context a;
    public final Moshi b = new Moshi.Builder().build();
    public final i3y c = kotlin.a.a(new d4(0, this));

    public a(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AbandonedCartDataStore$getDeliveredNotification$1 abandonedCartDataStore$getDeliveredNotification$1;
        int i;
        String str;
        Object failure;
        if (continuationImpl instanceof AbandonedCartDataStore$getDeliveredNotification$1) {
            abandonedCartDataStore$getDeliveredNotification$1 = (AbandonedCartDataStore$getDeliveredNotification$1) continuationImpl;
            int i2 = abandonedCartDataStore$getDeliveredNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                abandonedCartDataStore$getDeliveredNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = abandonedCartDataStore$getDeliveredNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = abandonedCartDataStore$getDeliveredNotification$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d.getClass();
                    tpr data = ((tpg) f.getValue(this.a, e4.a[0])).getData();
                    abandonedCartDataStore$getDeliveredNotification$1.label = 1;
                    obj = e.y(data, abandonedCartDataStore$getDeliveredNotification$1);
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
                str = (String) ((mme0) obj).c(e);
                if (str != null) {
                    return null;
                }
                try {
                    failure = (AbandonedCartDeliveredNotificationDto) ((JsonAdapter) this.c.getValue()).fromJson(str);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                return (AbandonedCartDeliveredNotificationDto) (failure instanceof Result.Failure ? null : failure);
            }
        }
        abandonedCartDataStore$getDeliveredNotification$1 = new AbandonedCartDataStore$getDeliveredNotification$1(this, continuationImpl);
        Object obj2 = abandonedCartDataStore$getDeliveredNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = abandonedCartDataStore$getDeliveredNotification$1.label;
        if (i != 0) {
        }
        str = (String) ((mme0) obj2).c(e);
        if (str != null) {
        }
    }

    public final Object b(AbandonedCartDeliveredNotificationDto abandonedCartDeliveredNotificationDto, Continuation continuation) {
        d.getClass();
        Object a = androidx.datastore.preferences.core.b.a((tpg) f.getValue(this.a, e4.a[0]), new AbandonedCartDataStore$saveDeliveredNotification$2(this, abandonedCartDeliveredNotificationDto, null), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }
}
