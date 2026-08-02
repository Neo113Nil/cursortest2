package ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain;

import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import androidx.work.ExistingWorkPolicy;
import androidx.work.impl.WorkDatabase;
import com.adjust.sdk.Constants;
import com.yandex.messaging.internal.authorized.chat.notifications.autocancel.CancelNotificationBroadcastReceiver;
import defpackage.a4z;
import defpackage.btx0;
import defpackage.cv8;
import defpackage.g4;
import defpackage.g801;
import defpackage.gw00;
import defpackage.h3y;
import defpackage.h4s;
import defpackage.h7l0;
import defpackage.ht10;
import defpackage.i3f;
import defpackage.j4;
import defpackage.j6s;
import defpackage.jl40;
import defpackage.jx81;
import defpackage.k5c;
import defpackage.lza1;
import defpackage.mng;
import defpackage.mrj;
import defpackage.ny61;
import defpackage.o4;
import defpackage.ong;
import defpackage.p3s;
import defpackage.p6s;
import defpackage.p951;
import defpackage.pux0;
import defpackage.pw2;
import defpackage.pzt0;
import defpackage.q270;
import defpackage.qv0;
import defpackage.r270;
import defpackage.t4s;
import defpackage.t951;
import defpackage.te11;
import defpackage.u1n;
import defpackage.uza;
import defpackage.vng;
import defpackage.vte0;
import defpackage.x8t0;
import defpackage.y2h;
import defpackage.z3z;
import defpackage.z8u0;
import defpackage.zy11;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain.model.AbandonedCartNotificationCancelReason;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

/* loaded from: classes5.dex */
public final class a {
    public final Context a;
    public final cv8 b;
    public final p6s c;
    public final b d;
    public final ht10 e;
    public final ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.b f;
    public final AppVisibilitySubscriptionImpl g;
    public final mrj h;
    public final h3y i;
    public final vte0 j;
    public final te11 k;
    public pzt0 l;

    public a(Context context, cv8 cv8Var, p6s p6sVar, b bVar, ht10 ht10Var, ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.b bVar2, AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl, mrj mrjVar, h3y h3yVar, vte0 vte0Var, te11 te11Var) {
        this.a = context;
        this.b = cv8Var;
        this.c = p6sVar;
        this.d = bVar;
        this.e = ht10Var;
        this.f = bVar2;
        this.g = appVisibilitySubscriptionImpl;
        this.h = mrjVar;
        this.i = h3yVar;
        this.j = vte0Var;
        this.k = te11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        AbandonedCartInteractor$onAttach$1 abandonedCartInteractor$onAttach$1;
        int i;
        j4 j4Var;
        aVar.getClass();
        if (continuationImpl instanceof AbandonedCartInteractor$onAttach$1) {
            abandonedCartInteractor$onAttach$1 = (AbandonedCartInteractor$onAttach$1) continuationImpl;
            int i2 = abandonedCartInteractor$onAttach$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                abandonedCartInteractor$onAttach$1.label = i2 - Integer.MIN_VALUE;
                Object obj = abandonedCartInteractor$onAttach$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = abandonedCartInteractor$onAttach$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t4s t4sVar = aVar.b.a;
                    if (jl40.l(t4sVar != null ? t4sVar.a : null, "abandoned_cart_notification")) {
                        ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.b bVar = aVar.f;
                        abandonedCartInteractor$onAttach$1.label = 1;
                        obj = bVar.a(abandonedCartInteractor$onAttach$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                j4Var = (j4) obj;
                if (j4Var != null) {
                    mrj mrjVar = aVar.h;
                    g4 g4Var = (g4) mrjVar.w;
                    long j = j4Var.b;
                    g4Var.getClass();
                    ((u1n) mrjVar.c).q(kotlin.collections.b.i(new Pair("mode", (String) mrjVar.b), new Pair("delivered_date", DateTimeFormatter.ISO_DATE_TIME.format(Instant.ofEpochMilli(j).atZone(ZoneId.systemDefault())))), "Delivery.TriggerNotifications.Tapped");
                }
                return zy11.a;
            }
        }
        abandonedCartInteractor$onAttach$1 = new AbandonedCartInteractor$onAttach$1(aVar, continuationImpl);
        Object obj2 = abandonedCartInteractor$onAttach$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = abandonedCartInteractor$onAttach$1.label;
        if (i != 0) {
        }
        j4Var = (j4) obj2;
        if (j4Var != null) {
        }
        return zy11.a;
    }

    public final void b(k5c k5cVar) {
        te11 te11Var = this.k;
        this.l = e.H(k5cVar, e.I(new n(new m0(new g801(5, ((p3s) te11Var.a).b("delivery_trigger_communications"), te11Var), this.c.e(), new AbandonedCartInteractor$attach$1(3, null)), new AbandonedCartInteractor$attach$2(this, null)), new AbandonedCartInteractor$attach$3(this, null)));
    }

    public final void c(AbandonedCartNotificationCancelReason abandonedCartNotificationCancelReason) {
        androidx.work.impl.b i = androidx.work.impl.b.i(this.a);
        WorkDatabase workDatabase = i.c;
        btx0 btx0Var = i.d;
        x8t0 x8t0Var = new x8t0(9);
        int i2 = 0;
        Iterable iterable = (Iterable) jx81.r(new i3f(6, ((t951) btx0Var).a, "loadStatusFuture", new z8u0(i2, x8t0Var, workDatabase))).b.get();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!((p951) it.next()).b.a()) {
                    i2 = 1;
                    break;
                }
            }
        }
        i.c("abandoned_cart_notification");
        NotificationManager notificationManager = (NotificationManager) ((Context) this.e.b).getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.cancel(-590988801);
        }
        if (i2 != 0) {
            ((u1n) this.h.c).q(gw00.e(new Pair("cancel_reason", abandonedCartNotificationCancelReason.getAnalyticsName())), "Delivery.TriggerNotifications.Cancelled");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0082 -> B:10:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(List list, j6s j6sVar, ContinuationImpl continuationImpl) {
        AbandonedCartInteractor$handleLocalNotifications$1 abandonedCartInteractor$handleLocalNotifications$1;
        int i;
        Iterator it;
        int i2;
        j6s j6sVar2;
        z3z z3zVar;
        if (continuationImpl instanceof AbandonedCartInteractor$handleLocalNotifications$1) {
            abandonedCartInteractor$handleLocalNotifications$1 = (AbandonedCartInteractor$handleLocalNotifications$1) continuationImpl;
            int i3 = abandonedCartInteractor$handleLocalNotifications$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                abandonedCartInteractor$handleLocalNotifications$1.label = i3 - Integer.MIN_VALUE;
                Object obj = abandonedCartInteractor$handleLocalNotifications$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = abandonedCartInteractor$handleLocalNotifications$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    it = list.iterator();
                    i2 = 0;
                    j6sVar2 = j6sVar;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = abandonedCartInteractor$handleLocalNotifications$1.I$0;
                    Object obj2 = abandonedCartInteractor$handleLocalNotifications$1.L$4;
                    it = (Iterator) abandonedCartInteractor$handleLocalNotifications$1.L$3;
                    j6s j6sVar3 = (j6s) abandonedCartInteractor$handleLocalNotifications$1.L$1;
                    kotlin.b.b(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        j6sVar2 = j6sVar3;
                        z3zVar = (z3z) obj2;
                        vte0 vte0Var = this.j;
                        zy11 zy11Var = zy11.a;
                        if (z3zVar != null) {
                            vte0Var.a.l(null);
                            return zy11Var;
                        }
                        Long k = lza1.k(z3zVar.c);
                        if (k == null) {
                            vte0Var.a.l(null);
                            return zy11Var;
                        }
                        a4z a4zVar = z3zVar.e;
                        String str = a4zVar.a;
                        String str2 = a4zVar.b;
                        long longValue = k.longValue();
                        String str3 = z3zVar.b;
                        if (str3 == null) {
                            h4s h4sVar = (h4s) this.i.get();
                            h4sVar.getClass();
                            List list2 = j6sVar2.c.a;
                            List list3 = j6sVar2.d.a;
                            qv0 qv0Var = (qv0) kotlin.collections.a.R(list2);
                            h7l0 a = qv0Var != null ? h4s.a(qv0Var) : null;
                            qv0 qv0Var2 = (qv0) kotlin.collections.a.b0(kotlin.collections.a.J(list2, 1));
                            h7l0 a2 = qv0Var2 != null ? h4s.a(qv0Var2) : null;
                            qv0 qv0Var3 = (qv0) kotlin.collections.a.R(list3);
                            h7l0 a3 = qv0Var3 != null ? h4s.a(qv0Var3) : null;
                            qv0 qv0Var4 = (qv0) kotlin.collections.a.b0(kotlin.collections.a.J(list3, 1));
                            h7l0 a4 = qv0Var4 != null ? h4s.a(qv0Var4) : null;
                            Map map = j6sVar2.a;
                            if (map.isEmpty()) {
                                map = null;
                            }
                            y2h y2hVar = new y2h(h4sVar.a, a, a2, a3, a4, map != null ? Base64.encodeToString(h4sVar.b.c.toJson(map).getBytes(uza.a), 2) : null);
                            ((pux0) ((pw2) h4sVar.c.a)).getClass();
                            Uri.Builder appendQueryParameter = new Uri.Builder().scheme(pux0.c).authority("delivery_order_form").appendQueryParameter("mode", y2hVar.a);
                            h7l0 h7l0Var = y2hVar.b;
                            if (h7l0Var != null) {
                                appendQueryParameter.appendQueryParameter("src_lat", String.valueOf(h7l0Var.a));
                                appendQueryParameter.appendQueryParameter("src_lon", String.valueOf(h7l0Var.b));
                                String str4 = h7l0Var.d;
                                if (str4 != null && str4.length() != 0) {
                                    appendQueryParameter.appendQueryParameter("src_comment", str4);
                                }
                                String str5 = h7l0Var.c;
                                if (str5 != null && str5.length() != 0) {
                                    appendQueryParameter.appendQueryParameter("src_uri", str5);
                                }
                            }
                            h7l0 h7l0Var2 = y2hVar.c;
                            if (h7l0Var2 != null) {
                                appendQueryParameter.appendQueryParameter("dst_lat", String.valueOf(h7l0Var2.a));
                                appendQueryParameter.appendQueryParameter("dst_lon", String.valueOf(h7l0Var2.b));
                                String str6 = h7l0Var2.d;
                                if (str6 != null && str6.length() != 0) {
                                    appendQueryParameter.appendQueryParameter("dst_comment", str6);
                                }
                                String str7 = h7l0Var2.c;
                                if (str7 != null && str7.length() != 0) {
                                    appendQueryParameter.appendQueryParameter("dest_uri", str7);
                                }
                            }
                            h7l0 h7l0Var3 = y2hVar.d;
                            if (h7l0Var3 != null) {
                                appendQueryParameter.appendQueryParameter("pickup_src_lat", String.valueOf(h7l0Var3.a));
                                appendQueryParameter.appendQueryParameter("pickup_src_lon", String.valueOf(h7l0Var3.b));
                            }
                            h7l0 h7l0Var4 = y2hVar.e;
                            if (h7l0Var4 != null) {
                                appendQueryParameter.appendQueryParameter("pickup_dst_lat", String.valueOf(h7l0Var4.a));
                                appendQueryParameter.appendQueryParameter("pickup_dst_lon", String.valueOf(h7l0Var4.b));
                            }
                            String str8 = y2hVar.f;
                            if (str8 != null) {
                                appendQueryParameter.appendQueryParameter("client_state_64", str8);
                            }
                            appendQueryParameter.appendQueryParameter("input_point", "abandoned_cart_notification");
                            str3 = appendQueryParameter.build().toString();
                        }
                        vte0Var.a.l(new o4(str, str2, str3, z3zVar.f, longValue));
                        return zy11Var;
                    }
                    j6sVar2 = j6sVar3;
                    if (it.hasNext()) {
                        obj2 = null;
                        z3zVar = (z3z) obj2;
                        vte0 vte0Var2 = this.j;
                        zy11 zy11Var2 = zy11.a;
                        if (z3zVar != null) {
                        }
                    } else {
                        obj2 = it.next();
                        abandonedCartInteractor$handleLocalNotifications$1.L$0 = null;
                        abandonedCartInteractor$handleLocalNotifications$1.L$1 = j6sVar2;
                        abandonedCartInteractor$handleLocalNotifications$1.L$2 = null;
                        abandonedCartInteractor$handleLocalNotifications$1.L$3 = it;
                        abandonedCartInteractor$handleLocalNotifications$1.L$4 = obj2;
                        abandonedCartInteractor$handleLocalNotifications$1.L$5 = null;
                        abandonedCartInteractor$handleLocalNotifications$1.I$0 = i2;
                        abandonedCartInteractor$handleLocalNotifications$1.I$1 = 0;
                        abandonedCartInteractor$handleLocalNotifications$1.label = 1;
                        Object b = this.d.b((z3z) obj2, j6sVar2, abandonedCartInteractor$handleLocalNotifications$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        j6sVar3 = j6sVar2;
                        obj = b;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    }
                }
            }
        }
        abandonedCartInteractor$handleLocalNotifications$1 = new AbandonedCartInteractor$handleLocalNotifications$1(this, continuationImpl);
        Object obj3 = abandonedCartInteractor$handleLocalNotifications$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = abandonedCartInteractor$handleLocalNotifications$1.label;
        if (i != 0) {
        }
    }

    public final void e(o4 o4Var) {
        this.j.a.l(null);
        c(AbandonedCartNotificationCancelReason.ANOTHER_PUSH);
        mng mngVar = new mng();
        LinkedHashMap linkedHashMap = mngVar.a;
        linkedHashMap.put(CancelNotificationBroadcastReceiver.NOTIFICATION_ID, "abandoned_cart_notification");
        linkedHashMap.put("title", o4Var.a);
        linkedHashMap.put("body", o4Var.b);
        String str = o4Var.d;
        linkedHashMap.put(Constants.DEEPLINK, str);
        ong a = mngVar.a();
        q270 q270Var = new q270(AbandonedCartNotificationWorker.class);
        q270Var.c.e = a;
        long j = o4Var.c;
        r270 r270Var = (r270) ((q270) q270Var.e(j)).a();
        long I = vng.I() + j;
        androidx.work.impl.b.i(this.a).g("abandoned_cart_notification", ExistingWorkPolicy.REPLACE, Collections.singletonList(r270Var));
        mrj mrjVar = this.h;
        ((g4) mrjVar.w).getClass();
        ((u1n) mrjVar.c).q(kotlin.collections.b.i(new Pair(Constants.DEEPLINK, str), new Pair("mode", (String) mrjVar.b), new Pair(MetaDataField.DATE_FIELD, DateTimeFormatter.ISO_DATE_TIME.format(Instant.ofEpochMilli(I).atZone(ZoneId.systemDefault()))), new Pair("metrica_context", o4Var.e)), "Delivery.TriggerNotifications.Scheduled");
    }
}
