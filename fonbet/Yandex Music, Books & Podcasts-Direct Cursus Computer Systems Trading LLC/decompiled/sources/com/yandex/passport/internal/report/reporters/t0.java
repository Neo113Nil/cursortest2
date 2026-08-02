package com.yandex.passport.internal.report.reporters;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.verify.domain.DomainVerificationManager;
import android.content.pm.verify.domain.DomainVerificationUserState;
import android.os.Build;
import android.os.Bundle;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.api.a2;
import com.yandex.passport.api.b2;
import com.yandex.passport.api.v2;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.ue;
import defpackage.cg6;
import defpackage.n7w;
import defpackage.nm6;
import defpackage.q5b;
import defpackage.qgg;
import defpackage.su4;
import defpackage.tah;
import defpackage.u75;
import defpackage.uah;
import defpackage.v75;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class t0 extends androidx.core.app.n0 {
    public static final p0 j = new p0(3, 0.0f, 0);
    public final Context b;
    public final com.yandex.passport.internal.core.accounts.k c;
    public final com.yandex.passport.internal.core.accounts.e d;
    public final com.yandex.passport.internal.push.d0 e;
    public final com.yandex.passport.data.network.core.s f;
    public final com.yandex.passport.internal.network.h g;
    public final com.yandex.passport.internal.features.a h;
    public final com.yandex.passport.internal.network.mappers.d i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Context context, com.yandex.passport.internal.core.accounts.k kVar, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.push.d0 d0Var, com.yandex.passport.data.network.core.s sVar, com.yandex.passport.internal.network.h hVar, com.yandex.passport.internal.report.g gVar, com.yandex.passport.internal.features.a aVar, com.yandex.passport.internal.network.mappers.d dVar) {
        super(gVar);
        context.getClass();
        kVar.getClass();
        eVar.getClass();
        d0Var.getClass();
        sVar.getClass();
        hVar.getClass();
        gVar.getClass();
        aVar.getClass();
        dVar.getClass();
        this.b = context;
        this.c = kVar;
        this.d = eVar;
        this.e = d0Var;
        this.f = sVar;
        this.g = hVar;
        this.h = aVar;
        this.i = dVar;
    }

    public static HashMap F(m0 m0Var) {
        return uah.d(new Pair("type", String.valueOf(m0Var.b)), new Pair("environment", String.valueOf(m0Var.c)), new Pair("has_user_info", String.valueOf(m0Var.e)), new Pair("locationId", String.valueOf(m0Var.d)), new Pair("has_stash", String.valueOf(m0Var.f)), new Pair("has_token", String.valueOf(m0Var.g)), new Pair("has_tombstone", String.valueOf(m0Var.h)), new Pair("stash_keys", m0Var.i));
    }

    public static HashMap G(n0 n0Var) {
        return uah.d(new Pair("version", n0Var.b), new Pair("am_manifest_version", n0Var.c.toString()), new Pair("signature_info", n0Var.d));
    }

    public static LinkedHashMap H(a2 a2Var) {
        Set<Map.Entry> entrySet = a2Var.d().entrySet();
        int a = tah.a(v75.o(entrySet, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Map.Entry entry : entrySet) {
            Pair pair = (Pair) entry.getKey();
            String str = (String) entry.getValue();
            String lowerCase = (pair.a + ", " + pair.b).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            linkedHashMap.put(lowerCase, str);
        }
        return linkedHashMap;
    }

    public static Map v(com.yandex.passport.internal.network.e eVar) {
        return uah.e(new Pair("url_source", eVar.b.a), new Pair("url", eVar.a));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:0|1|(2:3|(22:5|6|7|(1:(2:10|11)(2:48|49))(3:50|51|(1:53)(1:54))|12|(1:14)|15|(2:18|16)|19|20|(1:22)(1:47)|23|(2:26|24)|27|28|(6:33|34|(2:36|(1:38)(1:44))(1:45)|39|40|41)|46|34|(0)(0)|39|40|41))|57|6|7|(0)(0)|12|(0)|15|(1:16)|19|20|(0)(0)|23|(1:24)|27|28|(7:30|33|34|(0)(0)|39|40|41)|46|34|(0)(0)|39|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0030, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0149, code lost:
    
        n(com.yandex.passport.internal.report.d0.d, new com.yandex.passport.internal.report.ff(r0), new com.yandex.passport.internal.report.ue(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079 A[Catch: Exception -> 0x0030, LOOP:0: B:16:0x0073->B:18:0x0079, LOOP_END, TryCatch #0 {Exception -> 0x0030, blocks: (B:11:0x002c, B:12:0x004d, B:15:0x006a, B:16:0x0073, B:18:0x0079, B:20:0x0089, B:23:0x009c, B:24:0x00a5, B:26:0x00ab, B:28:0x00bb, B:30:0x00e4, B:34:0x00ec, B:36:0x0113, B:39:0x0121, B:51:0x003d), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab A[Catch: Exception -> 0x0030, LOOP:1: B:24:0x00a5->B:26:0x00ab, LOOP_END, TryCatch #0 {Exception -> 0x0030, blocks: (B:11:0x002c, B:12:0x004d, B:15:0x006a, B:16:0x0073, B:18:0x0079, B:20:0x0089, B:23:0x009c, B:24:0x00a5, B:26:0x00ab, B:28:0x00bb, B:30:0x00e4, B:34:0x00ec, B:36:0x0113, B:39:0x0121, B:51:0x003d), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0113 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:11:0x002c, B:12:0x004d, B:15:0x006a, B:16:0x0073, B:18:0x0079, B:20:0x0089, B:23:0x009c, B:24:0x00a5, B:26:0x00ab, B:28:0x00bb, B:30:0x00e4, B:34:0x00ec, B:36:0x0113, B:39:0x0121, B:51:0x003d), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(cg6 cg6Var) {
        r0 r0Var;
        int i;
        long j2;
        int a;
        int a2;
        Iterator it;
        androidx.core.app.y a3;
        boolean z;
        com.yandex.passport.internal.push.d0 d0Var = this.e;
        if (cg6Var instanceof r0) {
            r0Var = (r0) cg6Var;
            int i2 = r0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r0Var.m = i2 - Integer.MIN_VALUE;
                Object obj = r0Var.k;
                Object obj2 = nm6.a;
                i = r0Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    r0Var.j = currentTimeMillis;
                    r0Var.m = 1;
                    obj = w(r0Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                    j2 = currentTimeMillis;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = r0Var.j;
                    qgg.h0(obj);
                }
                ArrayList x = x();
                HashMap y = y();
                List<m0> list = (List) obj;
                a = tah.a(v75.o(list, 10));
                int i3 = 16;
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                for (m0 m0Var : list) {
                    linkedHashMap.put(m0Var.a, F(m0Var));
                }
                Pair pair = new Pair("accounts", linkedHashMap);
                a2 = tah.a(v75.o(x, 10));
                if (a2 < 16) {
                    i3 = a2;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
                it = x.iterator();
                while (it.hasNext()) {
                    n0 n0Var = (n0) it.next();
                    linkedHashMap2.put(n0Var.a, G(n0Var));
                }
                Pair pair2 = new Pair("applications", linkedHashMap2);
                Pair pair3 = new Pair("authenticators", y);
                Pair pair4 = new Pair("notifications_enabled", Boolean.valueOf(d0Var.a.b.areNotificationsEnabled()));
                a3 = com.yandex.passport.internal.push.q.a(d0Var.a);
                if (a3 != null && a3.c) {
                    z = false;
                    Pair pair5 = new Pair("notifications_group_enabled", Boolean.valueOf(z));
                    Pair pair6 = new Pair("notifications_disabled_channels", d0Var.a());
                    Pair pair7 = new Pair("applinks_verification_status", u());
                    DomainVerificationUserState z2 = z();
                    l(com.yandex.passport.internal.report.e0.d, uah.d(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("applinks_handling_status", z2 == null ? z2.isLinkHandlingAllowed() ? "allowed" : "forbidden" : "unknown"), new Pair("time_spent", new Long(System.currentTimeMillis() - j2))));
                    return Unit.a;
                }
                z = true;
                Pair pair52 = new Pair("notifications_group_enabled", Boolean.valueOf(z));
                Pair pair62 = new Pair("notifications_disabled_channels", d0Var.a());
                Pair pair72 = new Pair("applinks_verification_status", u());
                DomainVerificationUserState z22 = z();
                l(com.yandex.passport.internal.report.e0.d, uah.d(pair, pair2, pair3, pair4, pair52, pair62, pair72, new Pair("applinks_handling_status", z22 == null ? z22.isLinkHandlingAllowed() ? "allowed" : "forbidden" : "unknown"), new Pair("time_spent", new Long(System.currentTimeMillis() - j2))));
                return Unit.a;
            }
        }
        r0Var = new r0(this, cg6Var);
        Object obj3 = r0Var.k;
        Object obj22 = nm6.a;
        i = r0Var.m;
        if (i != 0) {
        }
        ArrayList x2 = x();
        HashMap y2 = y();
        List<m0> list2 = (List) obj3;
        a = tah.a(v75.o(list2, 10));
        int i32 = 16;
        if (a < 16) {
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(a);
        while (r0.hasNext()) {
        }
        Pair pair8 = new Pair("accounts", linkedHashMap3);
        a2 = tah.a(v75.o(x2, 10));
        if (a2 < 16) {
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap(i32);
        it = x2.iterator();
        while (it.hasNext()) {
        }
        Pair pair22 = new Pair("applications", linkedHashMap22);
        Pair pair32 = new Pair("authenticators", y2);
        Pair pair42 = new Pair("notifications_enabled", Boolean.valueOf(d0Var.a.b.areNotificationsEnabled()));
        a3 = com.yandex.passport.internal.push.q.a(d0Var.a);
        if (a3 != null) {
            z = false;
            Pair pair522 = new Pair("notifications_group_enabled", Boolean.valueOf(z));
            Pair pair622 = new Pair("notifications_disabled_channels", d0Var.a());
            Pair pair722 = new Pair("applinks_verification_status", u());
            DomainVerificationUserState z222 = z();
            l(com.yandex.passport.internal.report.e0.d, uah.d(pair8, pair22, pair32, pair42, pair522, pair622, pair722, new Pair("applinks_handling_status", z222 == null ? z222.isLinkHandlingAllowed() ? "allowed" : "forbidden" : "unknown"), new Pair("time_spent", new Long(System.currentTimeMillis() - j2))));
            return Unit.a;
        }
        z = true;
        Pair pair5222 = new Pair("notifications_group_enabled", Boolean.valueOf(z));
        Pair pair6222 = new Pair("notifications_disabled_channels", d0Var.a());
        Pair pair7222 = new Pair("applinks_verification_status", u());
        DomainVerificationUserState z2222 = z();
        l(com.yandex.passport.internal.report.e0.d, uah.d(pair8, pair22, pair32, pair42, pair5222, pair6222, pair7222, new Pair("applinks_handling_status", z2222 == null ? z2222.isLinkHandlingAllowed() ? "allowed" : "forbidden" : "unknown"), new Pair("time_spent", new Long(System.currentTimeMillis() - j2))));
        return Unit.a;
    }

    public final void B(com.yandex.passport.api.q1 q1Var) {
        q1Var.getClass();
        try {
            List q = q1Var.q();
            ArrayList arrayList = new ArrayList(v75.o(q, 10));
            Iterator it = q.iterator();
            while (it.hasNext()) {
                ((com.yandex.passport.api.l) it.next()).getClass();
                v2 v2Var = v2.a;
                String lowerCase = "FCM".toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                arrayList.add(lowerCase);
            }
            Pair pair = new Pair("push_token_providers", CollectionsKt.w0(arrayList));
            Pair pair2 = new Pair("preferred_locale", String.valueOf(q1Var.r()));
            Pair pair3 = new Pair("origin", String.valueOf(q1Var.g()));
            Pair pair4 = new Pair("support_webauthn", Boolean.valueOf(q1Var.x()));
            Pair pair5 = new Pair("is_white_label", Boolean.valueOf(q1Var.isWhiteLabel()));
            Pair pair6 = new Pair("additional_metric_params", q1Var.t());
            Pair pair7 = new Pair("url_override", H(q1Var.z()));
            Set<Map.Entry> entrySet = q1Var.u().entrySet();
            int a = tah.a(v75.o(entrySet, 10));
            if (a < 16) {
                a = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(a);
            for (Map.Entry entry : entrySet) {
                linkedHashMap.put(String.valueOf(((com.yandex.passport.api.u0) entry.getKey()).a), H((a2) entry.getValue()));
            }
            l(com.yandex.passport.internal.report.g0.d, uah.e(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("locations_url_override", linkedHashMap)));
        } catch (Exception e) {
            n(com.yandex.passport.internal.report.f0.d, new ff(e), new ue(e));
        }
    }

    public final void C() {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<Pair> h = u75.h(new Pair(b2.a, com.yandex.passport.internal.flags.n.a), new Pair(b2.c, com.yandex.passport.internal.flags.n.b), new Pair(b2.b, com.yandex.passport.internal.flags.n.c));
            ArrayList g = this.d.a().g();
            ArrayList arrayList = new ArrayList(v75.o(g, 10));
            Iterator it = g.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((com.yandex.passport.internal.l) it.next()).h()));
            }
            Iterator it2 = CollectionsKt.w0(CollectionsKt.z0(arrayList)).iterator();
            while (it2.hasNext()) {
                long longValue = ((Number) it2.next()).longValue();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Pair pair : h) {
                    com.yandex.passport.internal.network.e k = this.g.k(com.yandex.passport.common.core.b.c, (b2) pair.a, Long.valueOf(longValue), (com.yandex.passport.internal.flags.k) pair.b, s0.b);
                    String name = ((b2) pair.a).name();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = name.toLowerCase(locale);
                    lowerCase.getClass();
                    linkedHashMap2.put(lowerCase, v(k));
                }
                com.yandex.passport.internal.network.h hVar = this.g;
                com.yandex.passport.common.core.b bVar = com.yandex.passport.common.core.b.c;
                linkedHashMap2.put("webam_id_yandex", v(hVar.k(bVar, b2.f, Long.valueOf(longValue), com.yandex.passport.internal.flags.n.c, s0.c)));
                linkedHashMap2.put("user_menu_yandex", v(this.g.l(bVar, longValue)));
                linkedHashMap.put(String.valueOf(longValue), linkedHashMap2);
            }
            l(com.yandex.passport.internal.report.h0.d, linkedHashMap);
        } catch (Exception e) {
            n(com.yandex.passport.internal.report.i0.d, new ff(e), new ue(e));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.LinkedHashMap, java.util.Map] */
    public final void D(Throwable th, com.yandex.passport.internal.properties.i0 i0Var) {
        Set entrySet;
        i0Var.getClass();
        Pair pair = new Pair("throwable", th);
        String message = th.getMessage();
        Object obj = "null";
        if (message == null) {
            message = "null";
        }
        Pair pair2 = new Pair("throwable-message", message);
        com.yandex.passport.internal.network.p pVar = i0Var.a;
        Pair pair3 = new Pair("url_override", pVar != null ? H(pVar) : "null");
        Map map = i0Var.b;
        if (map != null && (entrySet = map.entrySet()) != null) {
            Set<Map.Entry> set = entrySet;
            int a = tah.a(v75.o(set, 10));
            if (a < 16) {
                a = 16;
            }
            obj = new LinkedHashMap(a);
            for (Map.Entry entry : set) {
                obj.put(String.valueOf(((com.yandex.passport.api.u0) entry.getKey()).a), H((a2) entry.getValue()));
            }
        }
        l(com.yandex.passport.internal.report.j0.d, uah.e(pair, pair2, pair3, new Pair("locations_url_override", obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.LinkedHashMap, java.util.Map] */
    public final void E(com.yandex.passport.internal.properties.i0 i0Var) {
        Set entrySet;
        i0Var.getClass();
        try {
            com.yandex.passport.internal.network.p pVar = i0Var.a;
            String str = "null";
            Pair pair = new Pair("url_override", pVar != null ? H(pVar) : "null");
            Map map = i0Var.b;
            if (map != null && (entrySet = map.entrySet()) != null) {
                Set<Map.Entry> set = entrySet;
                int a = tah.a(v75.o(set, 10));
                if (a < 16) {
                    a = 16;
                }
                ?? linkedHashMap = new LinkedHashMap(a);
                for (Map.Entry entry : set) {
                    linkedHashMap.put(String.valueOf(((com.yandex.passport.api.u0) entry.getKey()).a), H((a2) entry.getValue()));
                }
                str = linkedHashMap;
            }
            l(com.yandex.passport.internal.report.k0.d, uah.e(pair, new Pair("locations_url_override", str)));
        } catch (Exception e) {
            D(e, i0Var);
        }
    }

    @Override // androidx.core.app.n0
    public final boolean k() {
        com.yandex.passport.internal.features.a aVar = this.h;
        return ((Boolean) aVar.t.getValue(aVar, com.yandex.passport.internal.features.a.J[16])).booleanValue();
    }

    public final LinkedHashMap u() {
        Map<String, Integer> hostToStateMap;
        String[] strArr = {"passport.yango.com", "am.applink.pay.yandex.ru", "passport.yandex.ru", "am.applink.sandbox.pay.yandex.ru", "passport.yandex-team.ru", "passport-rc.yandex.ru"};
        DomainVerificationUserState z = z();
        int a = tah.a(6);
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (int i = 0; i < 6; i++) {
            String str = strArr[i];
            Integer num = (z == null || (hostToStateMap = z.getHostToStateMap()) == null) ? null : hostToStateMap.get(str);
            linkedHashMap.put(str, (num != null && num.intValue() == 0) ? "state_none" : (num != null && num.intValue() == 1) ? "state_selected" : (num != null && num.intValue() == 2) ? "state_verified" : "state_unknown");
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x008d -> B:10:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(cg6 cg6Var) {
        q0 q0Var;
        int i;
        List list;
        com.yandex.passport.internal.d dVar;
        Iterator it;
        com.yandex.passport.common.account.a aVar;
        m0 m0Var;
        if (cg6Var instanceof q0) {
            q0Var = (q0) cg6Var;
            int i2 = q0Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q0Var.q = i2 - Integer.MIN_VALUE;
                Object obj = q0Var.o;
                nm6 nm6Var = nm6.a;
                i = q0Var.q;
                if (i != 0) {
                    ArrayList q = su4.q(obj);
                    com.yandex.passport.internal.d a = this.d.a();
                    list = q;
                    dVar = a;
                    it = a.b().iterator();
                    while (it.hasNext()) {
                    }
                    return list;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                com.yandex.passport.internal.l b = q0Var.n;
                com.yandex.passport.internal.b a2 = q0Var.m;
                it = q0Var.l;
                dVar = q0Var.k;
                list = q0Var.j;
                qgg.h0(obj);
                boolean z = !((Boolean) obj).booleanValue();
                if (b == null) {
                    com.yandex.passport.common.core.f fVar = b.b;
                    String valueOf = String.valueOf(fVar.b);
                    int i3 = b.e.h;
                    String format = i3 == 1 ? "portal" : i3 == 10 ? "phone" : i3 == 12 ? "mail" : i3 == 5 ? "lite" : i3 == 6 ? LegacyAccountType.STRING_SOCIAL : i3 != 7 ? String.format(Locale.US, "undefined [%d]", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1)) : "pdd";
                    com.yandex.passport.common.core.b bVar = fVar.a;
                    String format2 = bVar != com.yandex.passport.common.core.b.c ? bVar != com.yandex.passport.common.core.b.e ? bVar != com.yandex.passport.common.core.b.g ? com.yandex.plus.pay.ui.core.b.B(bVar) ? LegacyAccountType.STRING_TEAM : String.format(Locale.US, "unknown [%s]", Arrays.copyOf(new Object[]{bVar.toString()}, 1)) : "rc" : "testing" : "production";
                    Long l = new Long(b.h());
                    String str = a2.d;
                    boolean z2 = !(str == null || str.length() == 0);
                    String str2 = a2.f;
                    boolean z3 = !(str2 == null || str2.length() == 0);
                    String str3 = a2.b;
                    m0Var = new m0(valueOf, format, format2, l, z2, z3, !(str3 == null || str3.length() == 0), z, n7w.G(b.f.a).keySet());
                } else {
                    String valueOf2 = String.valueOf(a2.c);
                    String str4 = a2.d;
                    boolean z4 = !(str4 == null || str4.length() == 0);
                    String str5 = a2.f;
                    boolean z5 = !(str5 == null || str5.length() == 0);
                    String str6 = a2.b;
                    m0Var = new m0(valueOf2, null, null, null, z4, z5, !(str6 == null || str6.length() == 0), z, q5b.a);
                }
                list.add(m0Var);
                while (it.hasNext()) {
                    a2 = dVar.a((Account) it.next());
                    if (a2 != null) {
                        b = this.i.b(a2);
                        String str7 = (b == null || (aVar = b.d) == null) ? null : aVar.a;
                        q0Var.j = list;
                        q0Var.k = dVar;
                        q0Var.l = it;
                        q0Var.m = a2;
                        q0Var.n = b;
                        q0Var.q = 1;
                        obj = ((com.yandex.passport.internal.network.l) this.f).c(str7, q0Var);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        boolean z6 = !((Boolean) obj).booleanValue();
                        if (b == null) {
                        }
                        list.add(m0Var);
                        while (it.hasNext()) {
                        }
                    }
                }
                return list;
            }
        }
        q0Var = new q0(this, cg6Var);
        Object obj2 = q0Var.o;
        nm6 nm6Var2 = nm6.a;
        i = q0Var.q;
        if (i != 0) {
        }
    }

    public final ArrayList x() {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfo;
        n0 n0Var;
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent();
        intent.setAction("com.yandex.accounts.AccountAuthenticator");
        intent.setPackage(null);
        Context context = this.b;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, RemoteCameraConfig.Mic.BUFFER_SIZE);
        queryIntentServices.getClass();
        Iterator<ResolveInfo> it = queryIntentServices.iterator();
        while (it.hasNext()) {
            String str = it.next().serviceInfo.packageName;
            str.getClass();
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            } catch (PackageManager.NameNotFoundException e) {
                com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Name not found: ".concat(str), e);
                }
                applicationInfo = null;
            }
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str, 8);
            } catch (PackageManager.NameNotFoundException e2) {
                com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Name not found: ".concat(str), e2);
                }
                packageInfo = null;
            }
            p0 p0Var = j;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                int i = bundle.getInt("com.yandex.auth.INTERNAL_VERSION", -1);
                int i2 = bundle.getInt("com.yandex.auth.INTERNAL_BUILD_NUMBER", -1);
                float f = bundle.getFloat("com.yandex.auth.VERSION", -1.0f);
                if (i != -1) {
                    p0Var = new p0(i2, i);
                } else if (f != -1.0f) {
                    p0Var = new p0(2, f, 0);
                }
            }
            if (packageInfo != null) {
                String str2 = packageInfo.packageName;
                str2.getClass();
                byte[] bArr = com.yandex.passport.internal.entities.s.c;
                PackageManager packageManager = context.getPackageManager();
                packageManager.getClass();
                com.yandex.passport.internal.entities.s B = com.yandex.plus.core.network.api.utils.a.B(packageManager, str2);
                n0Var = new n0(str2, String.valueOf(packageInfo.versionName), p0Var, B.d() ? "Yandex" : B.c() ? "Development" : "UNKNOWN");
            } else {
                n0Var = new n0("unknown", "unknown", p0Var, "unknown");
            }
            arrayList.add(n0Var);
        }
        return arrayList;
    }

    public final HashMap y() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.c.d().entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            value.getClass();
            String str2 = (String) value;
            if (kotlin.text.c.v(str, "com.yandex.passport", false)) {
                hashMap.put(str, str2);
            }
        }
        return hashMap;
    }

    public final DomainVerificationUserState z() {
        DomainVerificationManager domainVerificationManager;
        Context context = this.b;
        try {
            if (Build.VERSION.SDK_INT >= 31 && (domainVerificationManager = (DomainVerificationManager) context.getSystemService(DomainVerificationManager.class)) != null) {
                return domainVerificationManager.getDomainVerificationUserState(context.getPackageName());
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
