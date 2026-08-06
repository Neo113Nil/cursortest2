package io.appmetrica.analytics.impl;

import A1.C0015p;
import android.content.Context;
import android.text.TextUtils;
import i1.AbstractC0252i;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class Wl {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f5321a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5322b;

    /* renamed from: c, reason: collision with root package name */
    public final Tl f5323c;

    /* renamed from: d, reason: collision with root package name */
    public List f5324d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f5325e;

    /* renamed from: f, reason: collision with root package name */
    public long f5326f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5327g;

    /* renamed from: h, reason: collision with root package name */
    public long f5328h;

    /* renamed from: i, reason: collision with root package name */
    public final Ve f5329i;

    /* renamed from: j, reason: collision with root package name */
    public final P f5330j;

    /* renamed from: k, reason: collision with root package name */
    public final C3 f5331k;

    /* renamed from: l, reason: collision with root package name */
    public final C0865x6 f5332l;

    /* renamed from: m, reason: collision with root package name */
    public final T9 f5333m;

    /* renamed from: n, reason: collision with root package name */
    public final S9 f5334n;

    /* renamed from: o, reason: collision with root package name */
    public final C0676po f5335o;

    public Wl(Context context, Ve ve) {
        this(ve, new P(), new C3(), C0294b4.l().a(context), new C0865x6(), new T9(), new S9(), new C0676po());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r8.f5327g != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean a(List list) {
        boolean z2;
        boolean z3;
        try {
            Set other = AbstractC0338cm.f5767a;
            kotlin.jvm.internal.i.e(list, "<this>");
            kotlin.jvm.internal.i.e(other, "other");
            Set U2 = AbstractC0252i.U(list);
            U2.retainAll(other);
            boolean a2 = a(U2);
            Iterator it = list.iterator();
            while (true) {
                z2 = false;
                if (!it.hasNext()) {
                    z3 = false;
                    break;
                }
                if (this.f5321a.contains((String) it.next())) {
                    z3 = true;
                    break;
                }
            }
            boolean z4 = AbstractC0338cm.f5768b.currentTimeSeconds() > this.f5328h;
            if (a2 && !z3 && !z4) {
            }
            z2 = true;
        } finally {
        }
        return z2;
    }

    public final void b(IdentifiersResult identifiersResult) {
        if (a(identifiersResult)) {
            return;
        }
        this.f5322b.put("appmetrica_clids", identifiersResult);
    }

    public final void c(IdentifiersResult identifiersResult) {
        if (identifiersResult != null) {
            C0676po c0676po = this.f5335o;
            String str = identifiersResult.id;
            c0676po.getClass();
            if (C0676po.a(str)) {
                this.f5322b.put(StartupParamsCallback.APPMETRICA_UUID, identifiersResult);
            }
        }
    }

    public final synchronized boolean b() {
        return a(Arrays.asList("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID));
    }

    public final void c() {
        V9 v9;
        Ve d2 = this.f5329i.i((IdentifiersResult) this.f5322b.get(StartupParamsCallback.APPMETRICA_UUID)).e((IdentifiersResult) this.f5322b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)).d((IdentifiersResult) this.f5322b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)).a((IdentifiersResult) this.f5322b.get("appmetrica_get_ad_url")).b((IdentifiersResult) this.f5322b.get("appmetrica_report_ad_url")).e(this.f5326f).h((IdentifiersResult) this.f5322b.get("appmetrica_clids")).j(Fm.a((Map) this.f5325e)).f((IdentifiersResult) this.f5322b.get("appmetrica_google_adv_id")).g((IdentifiersResult) this.f5322b.get("appmetrica_huawei_oaid")).j((IdentifiersResult) this.f5322b.get("appmetrica_yandex_adv_id")).b(this.f5327g).c(this.f5332l.f7191d).d(this.f5328h);
        T9 t9 = this.f5333m;
        synchronized (t9) {
            v9 = t9.f5102b;
        }
        d2.a(v9).b();
    }

    public Wl(Ve ve, P p2, C3 c3, C0820vd c0820vd, C0865x6 c0865x6, T9 t9, S9 s9, C0676po c0676po) {
        HashSet hashSet = new HashSet();
        this.f5321a = hashSet;
        this.f5322b = new HashMap();
        this.f5323c = new Tl();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.f5329i = ve;
        this.f5330j = p2;
        this.f5331k = c3;
        this.f5332l = c0865x6;
        this.f5333m = t9;
        this.f5334n = s9;
        this.f5335o = c0676po;
        c(c0820vd.a());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID, ve.j());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, ve.i());
        a("appmetrica_get_ad_url", ve.d());
        a("appmetrica_report_ad_url", ve.e());
        b(ve.o());
        a("appmetrica_google_adv_id", ve.l());
        a("appmetrica_huawei_oaid", ve.m());
        a("appmetrica_yandex_adv_id", ve.r());
        c0865x6.a(ve.h());
        t9.a(ve.k());
        this.f5324d = ve.g();
        String i2 = ve.i((String) null);
        this.f5325e = i2 != null ? Fm.a(i2) : null;
        this.f5327g = ve.a(true);
        this.f5326f = ve.b(0L);
        this.f5328h = ve.n();
        c();
    }

    public final boolean a() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f5322b.get("appmetrica_clids");
        if (!a(identifiersResult) && identifiersResult.id.isEmpty()) {
            return AbstractC0572lo.a((Map) this.f5325e);
        }
        return true;
    }

    public static boolean a(IdentifiersResult identifiersResult) {
        return identifiersResult == null || identifiersResult.id == null;
    }

    public final void a(String str, IdentifiersResult identifiersResult) {
        if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.id)) {
            return;
        }
        this.f5322b.put(str, identifiersResult);
    }

    public final synchronized boolean a(Collection collection) {
        Boolean bool;
        String str;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                IdentifiersResult identifiersResult = (IdentifiersResult) this.f5322b.get(str2);
                if (identifiersResult == null) {
                    identifiersResult = (IdentifiersResult) this.f5332l.f7190c.get(str2);
                }
                if (identifiersResult == null) {
                    V9 v9 = this.f5333m.f5102b;
                    if (!kotlin.jvm.internal.i.a(str2, "appmetrica_lib_ssl_enabled") || (bool = v9.f5225a) == null) {
                        identifiersResult = null;
                    } else {
                        boolean booleanValue = bool.booleanValue();
                        IdentifierStatus identifierStatus = v9.f5226b;
                        String str3 = v9.f5227c;
                        if (booleanValue) {
                            str = "true";
                        } else if (!booleanValue) {
                            str = "false";
                        } else {
                            throw new C0015p();
                        }
                        identifiersResult = new IdentifiersResult(str, identifierStatus, str3);
                    }
                }
                if ("appmetrica_clids".equals(str2)) {
                    if (this.f5327g || a(identifiersResult) || (identifiersResult.id.isEmpty() && !AbstractC0572lo.a((Map) this.f5325e))) {
                        return false;
                    }
                } else if ("appmetrica_lib_ssl_enabled".equals(str2)) {
                    if (identifiersResult == null) {
                        return false;
                    }
                } else if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.id)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
