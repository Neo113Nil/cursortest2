package ru.yandex.taxi.logistics.deliveries.multiorder;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.yandex.delivery.mapper.model.ForwardingId;
import defpackage.a60;
import defpackage.aj7;
import defpackage.avj0;
import defpackage.bvf0;
import defpackage.fjz;
import defpackage.hxx;
import defpackage.jl40;
import defpackage.jst;
import defpackage.kyh0;
import defpackage.m950;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.py31;
import defpackage.qej;
import defpackage.qy31;
import defpackage.rui;
import defpackage.ry31;
import defpackage.siz;
import defpackage.sy31;
import defpackage.thz;
import defpackage.tiz;
import defpackage.tje;
import defpackage.tse;
import defpackage.v7j0;
import defpackage.whz;
import defpackage.xli;
import defpackage.y50;
import defpackage.yej;
import defpackage.yi7;
import defpackage.yvf0;
import defpackage.yxe0;
import defpackage.zej;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.delivery_state.DeliveryStateBaseParams;
import ru.yandex.taxi.logistics.sdk.management.f;

/* loaded from: classes9.dex */
public final class c {
    public final fjz a;
    public final yi7 b;
    public final d c;
    public final zuj0 d;
    public final tse e;
    public final whz f;
    public final yvf0 g;
    public final Context h;
    public final v7j0 i;
    public final y50 j;
    public final oep0 k;
    public final ru.yandex.taxi.logistics.sdk.voiceforwarding.impl.c l = (ru.yandex.taxi.logistics.sdk.voiceforwarding.impl.c) bvf0.u().B0.get();
    public final com.yandex.delivery.utils.dialogmanager.impl.b m = (com.yandex.delivery.utils.dialogmanager.impl.b) bvf0.m().a0.get();
    public final f n = (f) bvf0.u().z0.get();

    public c(fjz fjzVar, yi7 yi7Var, d dVar, zuj0 zuj0Var, tse tseVar, whz whzVar, yvf0 yvf0Var, Context context, v7j0 v7j0Var, y50 y50Var, oep0 oep0Var) {
        this.a = fjzVar;
        this.b = yi7Var;
        this.c = dVar;
        this.d = zuj0Var;
        this.e = tseVar;
        this.f = whzVar;
        this.g = yvf0Var;
        this.h = context;
        this.i = v7j0Var;
        this.j = y50Var;
        this.k = oep0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:11:0x0034, B:12:0x008e, B:14:0x0094, B:18:0x00bf, B:20:0x00c3, B:21:0x00e8, B:23:0x00f0, B:24:0x010d, B:25:0x0112), top: B:10:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:11:0x0034, B:12:0x008e, B:14:0x0094, B:18:0x00bf, B:20:0x00c3, B:21:0x00e8, B:23:0x00f0, B:24:0x010d, B:25:0x0112), top: B:10:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, siz sizVar, ContinuationImpl continuationImpl) {
        LogisticsMultiorderCardController$callViaVoiceForwarding$1 logisticsMultiorderCardController$callViaVoiceForwarding$1;
        int i;
        String str;
        ForwardingId forwardingId;
        sy31 sy31Var;
        zuj0 zuj0Var = cVar.d;
        d dVar = cVar.c;
        if (continuationImpl instanceof LogisticsMultiorderCardController$callViaVoiceForwarding$1) {
            logisticsMultiorderCardController$callViaVoiceForwarding$1 = (LogisticsMultiorderCardController$callViaVoiceForwarding$1) continuationImpl;
            int i2 = logisticsMultiorderCardController$callViaVoiceForwarding$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                logisticsMultiorderCardController$callViaVoiceForwarding$1.label = i2 - Integer.MIN_VALUE;
                Object obj = logisticsMultiorderCardController$callViaVoiceForwarding$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = logisticsMultiorderCardController$callViaVoiceForwarding$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String a = sizVar.a();
                    try {
                        ArrayList arrayList = dVar.e;
                        arrayList.add(xli.a(a));
                        r0 r0Var = dVar.f;
                        Set N0 = kotlin.collections.a.N0(arrayList);
                        r0Var.getClass();
                        r0Var.m(null, N0);
                        ru.yandex.taxi.logistics.sdk.voiceforwarding.impl.c cVar2 = cVar.l;
                        int i3 = thz.b[sizVar.b().ordinal()];
                        if (i3 == 1) {
                            forwardingId = ForwardingId.PERFORMER;
                        } else {
                            if (i3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            forwardingId = ForwardingId.INAPP;
                        }
                        logisticsMultiorderCardController$callViaVoiceForwarding$1.L$0 = null;
                        logisticsMultiorderCardController$callViaVoiceForwarding$1.L$1 = a;
                        logisticsMultiorderCardController$callViaVoiceForwarding$1.label = 1;
                        Object a2 = cVar2.a(a, forwardingId, logisticsMultiorderCardController$callViaVoiceForwarding$1);
                        if (a2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str = a;
                        obj = a2;
                    } catch (Throwable th) {
                        th = th;
                        str = a;
                        ArrayList arrayList2 = dVar.e;
                        arrayList2.remove(xli.a(str));
                        r0 r0Var2 = dVar.f;
                        Set N02 = kotlin.collections.a.N0(arrayList2);
                        r0Var2.getClass();
                        r0Var2.m(null, N02);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) logisticsMultiorderCardController$callViaVoiceForwarding$1.L$1;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        ArrayList arrayList22 = dVar.e;
                        arrayList22.remove(xli.a(str));
                        r0 r0Var22 = dVar.f;
                        Set N022 = kotlin.collections.a.N0(arrayList22);
                        r0Var22.getClass();
                        r0Var22.m(null, N022);
                        throw th;
                    }
                }
                sy31Var = (sy31) obj;
                if (!(sy31Var instanceof ry31)) {
                    ((aj7) cVar.b).b(((ry31) sy31Var).b().a() + "," + ((ry31) sy31Var).a(), false);
                } else if (sy31Var instanceof qy31) {
                    cVar.m.b(new qej(null, ((avj0) zuj0Var).h(kyh0.logistics_voice_forwarding_request_error), ((avj0) zuj0Var).h(kyh0.dialog_common_ok), null, null, false, null, null, 249));
                } else {
                    if (!jl40.l(sy31Var, py31.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jst.e.getClass();
                }
                ArrayList arrayList3 = dVar.e;
                arrayList3.remove(xli.a(str));
                r0 r0Var3 = dVar.f;
                Set N03 = kotlin.collections.a.N0(arrayList3);
                r0Var3.getClass();
                r0Var3.m(null, N03);
                return zy11.a;
            }
        }
        logisticsMultiorderCardController$callViaVoiceForwarding$1 = new LogisticsMultiorderCardController$callViaVoiceForwarding$1(cVar, continuationImpl);
        Object obj2 = logisticsMultiorderCardController$callViaVoiceForwarding$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = logisticsMultiorderCardController$callViaVoiceForwarding$1.label;
        if (i != 0) {
        }
        sy31Var = (sy31) obj2;
        if (!(sy31Var instanceof ry31)) {
        }
        ArrayList arrayList32 = dVar.e;
        arrayList32.remove(xli.a(str));
        r0 r0Var32 = dVar.f;
        Set N032 = kotlin.collections.a.N0(arrayList32);
        r0Var32.getClass();
        r0Var32.m(null, N032);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c cVar, ContinuationImpl continuationImpl) {
        LogisticsMultiorderCardController$showPermissionDeniedForeverDialog$1 logisticsMultiorderCardController$showPermissionDeniedForeverDialog$1;
        Object obj;
        int i;
        Context context = cVar.h;
        if (continuationImpl instanceof LogisticsMultiorderCardController$showPermissionDeniedForeverDialog$1) {
            logisticsMultiorderCardController$showPermissionDeniedForeverDialog$1 = (LogisticsMultiorderCardController$showPermissionDeniedForeverDialog$1) continuationImpl;
            int i2 = logisticsMultiorderCardController$showPermissionDeniedForeverDialog$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                logisticsMultiorderCardController$showPermissionDeniedForeverDialog$1.label = i2 - Integer.MIN_VALUE;
                obj = logisticsMultiorderCardController$showPermissionDeniedForeverDialog$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = logisticsMultiorderCardController$showPermissionDeniedForeverDialog$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    qej qejVar = new qej(null, context.getString(kyh0.logistics_state_phone_calls_permission_dialog_title), context.getString(kyh0.logistics_postcard_editor_camera_permission_dialog_settings), context.getString(kyh0.common_cancel), null, false, null, null, 241);
                    com.yandex.delivery.utils.dialogmanager.impl.b bVar = cVar.m;
                    logisticsMultiorderCardController$showPermissionDeniedForeverDialog$1.L$0 = null;
                    logisticsMultiorderCardController$showPermissionDeniedForeverDialog$1.label = 1;
                    obj = bVar.a(qejVar, logisticsMultiorderCardController$showPermissionDeniedForeverDialog$1);
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
                if (jl40.l((zej) obj, yej.a)) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                    if (intent.resolveActivity(context.getPackageManager()) != null) {
                        a60 a60Var = (a60) cVar.j;
                        a60Var.getClass();
                        try {
                            a60Var.e(HProv.PP_DELETE_SAVED_PASSWD, intent);
                        } catch (ActivityNotFoundException unused) {
                        }
                    }
                }
                return zy11.a;
            }
        }
        logisticsMultiorderCardController$showPermissionDeniedForeverDialog$1 = new LogisticsMultiorderCardController$showPermissionDeniedForeverDialog$1(cVar, continuationImpl);
        obj = logisticsMultiorderCardController$showPermissionDeniedForeverDialog$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = logisticsMultiorderCardController$showPermissionDeniedForeverDialog$1.label;
        if (i != 0) {
        }
        if (jl40.l((zej) obj, yej.a)) {
        }
        return zy11.a;
    }

    public final void c(tiz tizVar, Map map) {
        tje.N(this.e, null, null, new LogisticsMultiorderCardController$onCallClick$1(this, map, tizVar, null), 3);
    }

    public final void d(DeliveryStateBaseParams deliveryStateBaseParams) {
        Map<String, Object> meta = deliveryStateBaseParams.getMeta();
        yxe0.b(this.a.f, meta != null ? meta.toString() : null, "open_tracking_card", null, null, null, null, null, null, null, null, 2044);
        ((pep0) this.k).f((m950) this.g.get(), new rui(deliveryStateBaseParams.getDeliveryId(), deliveryStateBaseParams.getMeta(), deliveryStateBaseParams.getExpansion(), deliveryStateBaseParams.getLocalUuid(), deliveryStateBaseParams.getIsCompleted()), hxx.a);
    }
}
