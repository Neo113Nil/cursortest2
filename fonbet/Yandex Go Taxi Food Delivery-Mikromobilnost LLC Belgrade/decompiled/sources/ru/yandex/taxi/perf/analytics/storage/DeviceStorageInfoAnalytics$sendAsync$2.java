package ru.yandex.taxi.perf.analytics.storage;

import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.storage.StorageManager;
import defpackage.bju0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zbj;
import defpackage.zy11;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.q;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.perf.analytics.storage.DeviceStorageInfoAnalytics$sendAsync$2", f = "DeviceStorageInfoAnalytics.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class DeviceStorageInfoAnalytics$sendAsync$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ zbj this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceStorageInfoAnalytics$sendAsync$2(zbj zbjVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zbjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeviceStorageInfoAnalytics$sendAsync$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeviceStorageInfoAnalytics$sendAsync$2 deviceStorageInfoAnalytics$sendAsync$2 = (DeviceStorageInfoAnalytics$sendAsync$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deviceStorageInfoAnalytics$sendAsync$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        bju0 bju0Var = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Context context = this.this$0.a;
        if (((StorageManager) context.getApplicationContext().getSystemService("storage")) == null) {
            jst.e.getClass();
        } else {
            if (((StorageStatsManager) context.getApplicationContext().getSystemService("storagestats")) == null) {
                jst.e.getClass();
            } else {
                try {
                    UUID uuid = StorageManager.UUID_DEFAULT;
                    bju0Var = new bju0(r10.getTotalBytes(uuid) / 1.073741824E9d, r10.getFreeBytes(uuid) / 1.073741824E9d);
                } catch (IOException e) {
                    jst.e.k(e, "Failed to get storage device info");
                }
            }
        }
        if (bju0Var != null) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("total_space", String.format("%.2f", Arrays.copyOf(new Object[]{new Double(bju0Var.a)}, 1)));
                linkedHashMap.put("free_space", String.format("%.2f", Arrays.copyOf(new Object[]{new Double(bju0Var.b)}, 1)));
                ((q) this.this$0.c).h("performance.DeviceStorageInfo", linkedHashMap);
            } catch (Throwable th) {
                jst.e.k(th, "Unable to explore device storage info");
            }
        }
        return zy11.a;
    }
}
