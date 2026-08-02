package ru.yandex.taxi.logistics.sdk.management.delivery_tasks.cancel;

import com.yandex.delivery.mapper.model.CancelType;
import com.yandex.delivery.utils.dialogmanager.api.DialogType;
import com.yandex.delivery.utils.dialogmanager.impl.b;
import defpackage.b64;
import defpackage.iw7;
import defpackage.j2s;
import defpackage.jgz;
import defpackage.jl40;
import defpackage.jv7;
import defpackage.jw7;
import defpackage.jwh;
import defpackage.jxh;
import defpackage.kv7;
import defpackage.kxh;
import defpackage.lv7;
import defpackage.ms10;
import defpackage.mv7;
import defpackage.mxh;
import defpackage.nxh;
import defpackage.ny61;
import defpackage.q32;
import defpackage.qej;
import defpackage.qfi;
import defpackage.rzh0;
import defpackage.sfi;
import defpackage.vej;
import defpackage.w511;
import defpackage.wej;
import defpackage.xkj;
import defpackage.yej;
import defpackage.yuj0;
import defpackage.zej;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.management.deliveries.d;

/* loaded from: classes9.dex */
public final class a {
    public final b a;
    public final yuj0 b;
    public final d c;
    public final ru.yandex.taxi.logistics.sdk.delivery.cancel.domain.b d;
    public final jwh e;
    public final j2s f;
    public final sfi g;

    public a(b bVar, yuj0 yuj0Var, d dVar, ru.yandex.taxi.logistics.sdk.delivery.cancel.domain.b bVar2, jwh jwhVar, j2s j2sVar, sfi sfiVar) {
        this.a = bVar;
        this.b = yuj0Var;
        this.c = dVar;
        this.d = bVar2;
        this.e = jwhVar;
        this.f = j2sVar;
        this.g = sfiVar;
    }

    public static void c(String str) {
        jgz.a.h("a");
        jgz.a(str, new Object[0]);
    }

    public static nxh f(String str, jw7 jw7Var) {
        if (jw7Var.c() == null) {
            StringBuilder v = b64.v("Delivery can't be canceled: ", jw7Var.d(), Extension.FIX_SPACE, jw7Var.a(), ", deliveryId = ");
            v.append(str);
            v.append(" ");
            c(v.toString());
            return kxh.a;
        }
        c("User closed dialog, deliveryId = " + str + ",  " + jw7Var);
        return mxh.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c3, code lost:
    
        if (r20.f.a(r3) == r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        if (r5 == r4) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, CancelType cancelType, Object obj, ContinuationImpl continuationImpl) {
        CancelDeliveryTaskImpl$cancelOnBackend$1 cancelDeliveryTaskImpl$cancelOnBackend$1;
        int i;
        Object obj2;
        Object a;
        mv7 mv7Var;
        String str2 = str;
        if (continuationImpl instanceof CancelDeliveryTaskImpl$cancelOnBackend$1) {
            cancelDeliveryTaskImpl$cancelOnBackend$1 = (CancelDeliveryTaskImpl$cancelOnBackend$1) continuationImpl;
            int i2 = cancelDeliveryTaskImpl$cancelOnBackend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cancelDeliveryTaskImpl$cancelOnBackend$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = cancelDeliveryTaskImpl$cancelOnBackend$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cancelDeliveryTaskImpl$cancelOnBackend$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    cancelDeliveryTaskImpl$cancelOnBackend$1.L$0 = str2;
                    cancelDeliveryTaskImpl$cancelOnBackend$1.L$1 = null;
                    obj2 = obj;
                    cancelDeliveryTaskImpl$cancelOnBackend$1.L$2 = obj2;
                    cancelDeliveryTaskImpl$cancelOnBackend$1.label = 1;
                    a = this.d.a(str2, cancelType, cancelDeliveryTaskImpl$cancelOnBackend$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj3);
                            return mxh.b;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj3);
                        return obj3;
                    }
                    Object obj5 = cancelDeliveryTaskImpl$cancelOnBackend$1.L$2;
                    String str3 = (String) cancelDeliveryTaskImpl$cancelOnBackend$1.L$0;
                    kotlin.b.b(obj3);
                    obj2 = obj5;
                    str2 = str3;
                    a = obj3;
                }
                mv7Var = (mv7) a;
                if (!jl40.l(mv7Var, lv7.a)) {
                    c("Cancellation success, deliveryId = " + str2);
                    e("Logistics.order_cancelled", str2, obj2);
                    this.g.a.g(new qfi(str2));
                    cancelDeliveryTaskImpl$cancelOnBackend$1.L$0 = null;
                    cancelDeliveryTaskImpl$cancelOnBackend$1.L$1 = null;
                    cancelDeliveryTaskImpl$cancelOnBackend$1.L$2 = null;
                    cancelDeliveryTaskImpl$cancelOnBackend$1.L$3 = null;
                    cancelDeliveryTaskImpl$cancelOnBackend$1.label = 2;
                } else {
                    if (mv7Var instanceof jv7) {
                        c("Cancellation failure, deliveryId = " + str2);
                        e("Logistics.order_cancel_failed", str2, obj2);
                        yuj0 yuj0Var = this.b;
                        this.a.b(new qej(null, yuj0Var.a(rzh0.logistics_unknown_error, new Object[0]), null, null, yuj0Var.a(rzh0.logistics_ok_button, new Object[0]), true, null, null, 205));
                        return kxh.a;
                    }
                    if (!(mv7Var instanceof kv7)) {
                        w511.b();
                        return null;
                    }
                    c("Cancellation needs user decision, deliveryId = " + str2);
                    e("Logistics.order_cancel_failed", str2, obj2);
                    jw7 jw7Var = (jw7) ((kv7) mv7Var).a();
                    cancelDeliveryTaskImpl$cancelOnBackend$1.L$0 = null;
                    cancelDeliveryTaskImpl$cancelOnBackend$1.L$1 = null;
                    cancelDeliveryTaskImpl$cancelOnBackend$1.L$2 = null;
                    cancelDeliveryTaskImpl$cancelOnBackend$1.L$3 = null;
                    cancelDeliveryTaskImpl$cancelOnBackend$1.L$4 = null;
                    cancelDeliveryTaskImpl$cancelOnBackend$1.label = 3;
                    Object d = d(str2, jw7Var, obj2, cancelDeliveryTaskImpl$cancelOnBackend$1);
                    if (d != obj4) {
                        return d;
                    }
                }
                return obj4;
            }
        }
        cancelDeliveryTaskImpl$cancelOnBackend$1 = new CancelDeliveryTaskImpl$cancelOnBackend$1(this, continuationImpl);
        Object obj32 = cancelDeliveryTaskImpl$cancelOnBackend$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cancelDeliveryTaskImpl$cancelOnBackend$1.label;
        if (i != 0) {
        }
        mv7Var = (mv7) a;
        if (!jl40.l(mv7Var, lv7.a)) {
        }
        return obj42;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a3, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x0032, B:13:0x00a6, B:20:0x0049, B:21:0x006e, B:23:0x0076, B:25:0x0080, B:29:0x0090, B:31:0x0094, B:32:0x00a9, B:33:0x00ae, B:34:0x00af, B:36:0x0061), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x0032, B:13:0x00a6, B:20:0x0049, B:21:0x006e, B:23:0x0076, B:25:0x0080, B:29:0x0090, B:31:0x0094, B:32:0x00a9, B:33:0x00ae, B:34:0x00af, B:36:0x0061), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, jxh jxhVar, ContinuationImpl continuationImpl) {
        CancelDeliveryTaskImpl$invoke$1 cancelDeliveryTaskImpl$invoke$1;
        Object obj;
        int i;
        d dVar;
        Object obj2;
        Object d;
        try {
            if (continuationImpl instanceof CancelDeliveryTaskImpl$invoke$1) {
                cancelDeliveryTaskImpl$invoke$1 = (CancelDeliveryTaskImpl$invoke$1) continuationImpl;
                int i2 = cancelDeliveryTaskImpl$invoke$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cancelDeliveryTaskImpl$invoke$1.label = i2 - Integer.MIN_VALUE;
                    obj = cancelDeliveryTaskImpl$invoke$1.result;
                    Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = cancelDeliveryTaskImpl$invoke$1.label;
                    dVar = this.c;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        c("Cancel delivery: deliveryId = " + str);
                        cancelDeliveryTaskImpl$invoke$1.L$0 = str;
                        cancelDeliveryTaskImpl$invoke$1.L$1 = jxhVar;
                        cancelDeliveryTaskImpl$invoke$1.label = 1;
                        obj = dVar.d(str, cancelDeliveryTaskImpl$invoke$1);
                        if (obj == obj3) {
                            return obj3;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str = (String) cancelDeliveryTaskImpl$invoke$1.L$0;
                            kotlin.b.b(obj);
                            obj2 = (nxh) obj;
                            return obj2;
                        }
                        jxhVar = (jxh) cancelDeliveryTaskImpl$invoke$1.L$1;
                        str = (String) cancelDeliveryTaskImpl$invoke$1.L$0;
                        kotlin.b.b(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        obj2 = kxh.a;
                        return obj2;
                    }
                    cancelDeliveryTaskImpl$invoke$1.L$0 = str;
                    cancelDeliveryTaskImpl$invoke$1.L$1 = null;
                    cancelDeliveryTaskImpl$invoke$1.label = 2;
                    if (jxhVar instanceof xkj) {
                        xkj xkjVar = (xkj) jxhVar;
                        d = a(str, xkjVar.a(), xkjVar.b(), cancelDeliveryTaskImpl$invoke$1);
                    } else {
                        if (!(jxhVar instanceof ms10)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ms10 ms10Var = (ms10) jxhVar;
                        d = d(str, ms10Var.a(), ms10Var.b(), cancelDeliveryTaskImpl$invoke$1);
                    }
                    obj = d;
                }
            }
            if (i != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } finally {
            dVar.k(str);
        }
        cancelDeliveryTaskImpl$invoke$1 = new CancelDeliveryTaskImpl$invoke$1(this, continuationImpl);
        obj = cancelDeliveryTaskImpl$invoke$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cancelDeliveryTaskImpl$invoke$1.label;
        dVar = this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
    
        if (r6 == r5) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, jw7 jw7Var, Object obj, ContinuationImpl continuationImpl) {
        CancelDeliveryTaskImpl$processCancelMessage$1 cancelDeliveryTaskImpl$processCancelMessage$1;
        int i;
        Object obj2;
        Object a;
        zej zejVar;
        String str2 = str;
        jw7 jw7Var2 = jw7Var;
        if (continuationImpl instanceof CancelDeliveryTaskImpl$processCancelMessage$1) {
            cancelDeliveryTaskImpl$processCancelMessage$1 = (CancelDeliveryTaskImpl$processCancelMessage$1) continuationImpl;
            int i2 = cancelDeliveryTaskImpl$processCancelMessage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cancelDeliveryTaskImpl$processCancelMessage$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = cancelDeliveryTaskImpl$processCancelMessage$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cancelDeliveryTaskImpl$processCancelMessage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    c("Process CancelMessage for deliveryId = " + str2 + Extension.FIX_SPACE + jw7Var2);
                    String d = jw7Var2.d();
                    String a2 = jw7Var2.a();
                    String a3 = jw7Var2.b().a();
                    iw7 c = jw7Var2.c();
                    qej qejVar = new qej(d, a2, a3, c != null ? c.b() : null, null, false, null, DialogType.MODAL, 112);
                    cancelDeliveryTaskImpl$processCancelMessage$1.L$0 = str2;
                    cancelDeliveryTaskImpl$processCancelMessage$1.L$1 = jw7Var2;
                    obj2 = obj;
                    cancelDeliveryTaskImpl$processCancelMessage$1.L$2 = obj2;
                    cancelDeliveryTaskImpl$processCancelMessage$1.label = 1;
                    a = this.a.a(qejVar, cancelDeliveryTaskImpl$processCancelMessage$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj3);
                        return obj3;
                    }
                    Object obj5 = cancelDeliveryTaskImpl$processCancelMessage$1.L$2;
                    jw7Var2 = (jw7) cancelDeliveryTaskImpl$processCancelMessage$1.L$1;
                    String str3 = (String) cancelDeliveryTaskImpl$processCancelMessage$1.L$0;
                    kotlin.b.b(obj3);
                    obj2 = obj5;
                    str2 = str3;
                    a = obj3;
                }
                zejVar = (zej) a;
                if (!jl40.l(zejVar, yej.a)) {
                    return f(str2, jw7Var2);
                }
                boolean l = jl40.l(zejVar, wej.a);
                kxh kxhVar = kxh.a;
                if (!l) {
                    if (jl40.l(zejVar, vej.a)) {
                        return f(str2, jw7Var2);
                    }
                    c("Unsupported dialog response, deliveryId = " + str2);
                    return kxhVar;
                }
                iw7 c2 = jw7Var2.c();
                CancelType a4 = c2 != null ? c2.a() : null;
                if (a4 == null) {
                    c("wtf?!! cancelType of cancel message is null, deliveryId = " + str2);
                    return kxhVar;
                }
                cancelDeliveryTaskImpl$processCancelMessage$1.L$0 = null;
                cancelDeliveryTaskImpl$processCancelMessage$1.L$1 = null;
                cancelDeliveryTaskImpl$processCancelMessage$1.L$2 = null;
                cancelDeliveryTaskImpl$processCancelMessage$1.L$3 = null;
                cancelDeliveryTaskImpl$processCancelMessage$1.L$4 = null;
                cancelDeliveryTaskImpl$processCancelMessage$1.label = 2;
                Object a5 = a(str2, a4, obj2, cancelDeliveryTaskImpl$processCancelMessage$1);
                return a5 == obj4 ? obj4 : a5;
            }
        }
        cancelDeliveryTaskImpl$processCancelMessage$1 = new CancelDeliveryTaskImpl$processCancelMessage$1(this, continuationImpl);
        Object obj32 = cancelDeliveryTaskImpl$processCancelMessage$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cancelDeliveryTaskImpl$processCancelMessage$1.label;
        if (i != 0) {
        }
        zejVar = (zej) a;
        if (!jl40.l(zejVar, yej.a)) {
        }
    }

    public final void e(String str, String str2, Object obj) {
        q32 q32Var = new q32(str);
        q32Var.f(str2);
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            q32Var.e(map);
        }
        this.e.a(q32Var);
    }
}
