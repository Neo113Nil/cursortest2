package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.live_location;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.yandex.delivery.utils.dialogmanager.api.DialogType;
import defpackage.acu;
import defpackage.b801;
import defpackage.bvf0;
import defpackage.fza0;
import defpackage.fzw;
import defpackage.gri;
import defpackage.gw00;
import defpackage.ike;
import defpackage.j00;
import defpackage.jl40;
import defpackage.jvy;
import defpackage.jwh;
import defpackage.ny61;
import defpackage.qej;
import defpackage.rzh0;
import defpackage.st2;
import defpackage.t701;
import defpackage.tpr;
import defpackage.uzh0;
import defpackage.vej;
import defpackage.w511;
import defpackage.wej;
import defpackage.xej;
import defpackage.yej;
import defpackage.yuj0;
import defpackage.zej;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.logistics.sdk.permissions.api.Permission;

/* loaded from: classes5.dex */
public final class d implements b801 {
    public final j00 a;
    public final com.yandex.delivery.live.location.impl.repository.b b;
    public final jvy c;
    public final jwh d;
    public final ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e e;
    public final fza0 f;
    public final com.yandex.delivery.utils.dialogmanager.impl.b g;
    public final Context h;
    public final yuj0 i;
    public final ike j;
    public final m0 k;
    public final String l = "live-location-key";

    public d(st2 st2Var, j00 j00Var, com.yandex.delivery.live.location.impl.repository.b bVar, jvy jvyVar, jwh jwhVar, ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e eVar, fza0 fza0Var, com.yandex.delivery.utils.dialogmanager.impl.b bVar2, Context context, yuj0 yuj0Var) {
        this.a = j00Var;
        this.b = bVar;
        this.c = jvyVar;
        this.d = jwhVar;
        this.e = eVar;
        this.f = fza0Var;
        this.g = bVar2;
        this.h = context;
        this.i = yuj0Var;
        this.j = bvf0.a(st2Var.c);
        int i = 4;
        this.k = new m0(new fzw(i, new acu(eVar.e, i), this), bVar.b, new LiveLocationStateHolder$widgetModelFlow$2(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r2.a(true, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(d dVar, ContinuationImpl continuationImpl) {
        LiveLocationStateHolder$checkPermissionAndUpdateState$1 liveLocationStateHolder$checkPermissionAndUpdateState$1;
        int i;
        boolean booleanValue;
        dVar.getClass();
        if (continuationImpl instanceof LiveLocationStateHolder$checkPermissionAndUpdateState$1) {
            liveLocationStateHolder$checkPermissionAndUpdateState$1 = (LiveLocationStateHolder$checkPermissionAndUpdateState$1) continuationImpl;
            int i2 = liveLocationStateHolder$checkPermissionAndUpdateState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                liveLocationStateHolder$checkPermissionAndUpdateState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = liveLocationStateHolder$checkPermissionAndUpdateState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = liveLocationStateHolder$checkPermissionAndUpdateState$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fza0 fza0Var = dVar.f;
                    Permission permission = Permission.LOCATION;
                    liveLocationStateHolder$checkPermissionAndUpdateState$1.label = 1;
                    obj = fza0Var.a(permission, liveLocationStateHolder$checkPermissionAndUpdateState$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            dVar.c("DeliveryLiveLocation.Toggle.Switched", gw00.e(new Pair("is_on", Boolean.TRUE)));
                            return zy11Var;
                        }
                        if (i == 3) {
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    liveLocationStateHolder$checkPermissionAndUpdateState$1.Z$0 = booleanValue;
                    liveLocationStateHolder$checkPermissionAndUpdateState$1.label = 3;
                    if (dVar.d(liveLocationStateHolder$checkPermissionAndUpdateState$1) != obj2) {
                        return zy11Var;
                    }
                } else {
                    com.yandex.delivery.live.location.impl.repository.b bVar = dVar.b;
                    liveLocationStateHolder$checkPermissionAndUpdateState$1.Z$0 = booleanValue;
                    liveLocationStateHolder$checkPermissionAndUpdateState$1.label = 2;
                }
                return obj2;
            }
        }
        liveLocationStateHolder$checkPermissionAndUpdateState$1 = new LiveLocationStateHolder$checkPermissionAndUpdateState$1(dVar, continuationImpl);
        Object obj3 = liveLocationStateHolder$checkPermissionAndUpdateState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = liveLocationStateHolder$checkPermissionAndUpdateState$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj3).booleanValue();
        if (booleanValue) {
        }
        return obj22;
    }

    @Override // defpackage.b801
    public final tpr a() {
        return this.k;
    }

    public final void c(String str, Map map) {
        gri griVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object value = this.e.e.a.getValue();
        t701 t701Var = value instanceof t701 ? (t701) value : null;
        Object obj = (t701Var == null || (griVar = t701Var.a) == null) ? null : griVar.i;
        Map map2 = obj instanceof Map ? (Map) obj : null;
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        this.d.a.o(str, null, linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        LiveLocationStateHolder$showPermissionDeniedForeverDialog$1 liveLocationStateHolder$showPermissionDeniedForeverDialog$1;
        int i;
        zej zejVar;
        if (continuationImpl instanceof LiveLocationStateHolder$showPermissionDeniedForeverDialog$1) {
            liveLocationStateHolder$showPermissionDeniedForeverDialog$1 = (LiveLocationStateHolder$showPermissionDeniedForeverDialog$1) continuationImpl;
            int i2 = liveLocationStateHolder$showPermissionDeniedForeverDialog$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                liveLocationStateHolder$showPermissionDeniedForeverDialog$1.label = i2 - Integer.MIN_VALUE;
                Object obj = liveLocationStateHolder$showPermissionDeniedForeverDialog$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = liveLocationStateHolder$showPermissionDeniedForeverDialog$1.label;
                Context context = this.h;
                if (i != 0) {
                    kotlin.b.b(obj);
                    yuj0 yuj0Var = this.i;
                    qej qejVar = new qej(null, yuj0Var.a(uzh0.location_permission_dialog_title, new Object[0]), yuj0Var.a(rzh0.delivery_settings_button, new Object[0]), context.getString(rzh0.logistics_cancel_button), null, false, null, DialogType.MODAL, 113);
                    liveLocationStateHolder$showPermissionDeniedForeverDialog$1.L$0 = null;
                    liveLocationStateHolder$showPermissionDeniedForeverDialog$1.label = 1;
                    obj = this.g.a(qejVar, liveLocationStateHolder$showPermissionDeniedForeverDialog$1);
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
                zejVar = (zej) obj;
                if (!jl40.l(zejVar, yej.a)) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                    if (intent.resolveActivity(context.getPackageManager()) != null) {
                        try {
                            context.startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
                            intent.toString();
                        }
                    }
                } else if (!jl40.l(zejVar, vej.a) && !jl40.l(zejVar, wej.a) && !jl40.l(zejVar, xej.a)) {
                    w511.b();
                    return null;
                }
                return zy11.a;
            }
        }
        liveLocationStateHolder$showPermissionDeniedForeverDialog$1 = new LiveLocationStateHolder$showPermissionDeniedForeverDialog$1(this, continuationImpl);
        Object obj2 = liveLocationStateHolder$showPermissionDeniedForeverDialog$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = liveLocationStateHolder$showPermissionDeniedForeverDialog$1.label;
        Context context2 = this.h;
        if (i != 0) {
        }
        zejVar = (zej) obj2;
        if (!jl40.l(zejVar, yej.a)) {
        }
        return zy11.a;
    }

    @Override // defpackage.b801
    public final String getKey() {
        return this.l;
    }
}
