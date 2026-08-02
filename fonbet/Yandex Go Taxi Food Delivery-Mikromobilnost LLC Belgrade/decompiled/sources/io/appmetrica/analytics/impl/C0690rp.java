package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.b64;
import defpackage.jl40;
import io.appmetrica.analytics.IParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: io.appmetrica.analytics.impl.rp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0690rp {
    public final HashSet a;
    public final HashMap b;
    public final C0604op c;
    public List d;
    public HashMap e;
    public long f;
    public boolean g;
    public long h;
    public final Hh i;
    public final T j;
    public final C0785v4 k;
    public final C0788v7 l;
    public final C0445jb m;
    public final C0417ib n;
    public final Sr o;

    public C0690rp(Hh hh, T t, C0785v4 c0785v4, C0652qf c0652qf, C0788v7 c0788v7, C0445jb c0445jb, C0417ib c0417ib, Sr sr) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = new HashMap();
        this.c = new C0604op();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.i = hh;
        this.j = t;
        this.k = c0785v4;
        this.l = c0788v7;
        this.m = c0445jb;
        this.n = c0417ib;
        this.o = sr;
        a(c0652qf.a(), hh.q());
        a("appmetrica_device_id", hh.j());
        a("appmetrica_device_id_hash", hh.i());
        a(IParamsCallback.YANDEX_MOBILE_METRICA_GET_AD_URL, hh.d());
        a(IParamsCallback.YANDEX_MOBILE_METRICA_REPORT_AD_URL, hh.e());
        b(hh.o());
        a("appmetrica_google_adv_id", hh.l());
        a("appmetrica_huawei_oaid", hh.m());
        a("appmetrica_yandex_adv_id", hh.r());
        c0788v7.a(hh.h());
        c0445jb.a(hh.k());
        this.d = hh.g();
        String i = hh.i((String) null);
        this.e = i != null ? AbstractC0230bq.a(i) : null;
        this.g = hh.a(true);
        this.f = hh.b(0L);
        this.h = hh.n();
        c();
    }

    public final synchronized boolean a(Collection collection) {
        Boolean bool;
        String str;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                IdentifiersResult identifiersResult = (IdentifiersResult) this.b.get(str2);
                if (identifiersResult == null) {
                    identifiersResult = (IdentifiersResult) this.l.c.get(str2);
                }
                if (identifiersResult == null) {
                    C0503lb c0503lb = this.m.b;
                    if (!jl40.l(str2, IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED) || (bool = c0503lb.a) == null) {
                        identifiersResult = null;
                    } else {
                        boolean booleanValue = bool.booleanValue();
                        IdentifierStatus identifierStatus = c0503lb.b;
                        String str3 = c0503lb.c;
                        if (booleanValue) {
                            str = "true";
                        } else {
                            if (booleanValue) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "false";
                        }
                        identifiersResult = new IdentifiersResult(str, identifierStatus, str3);
                    }
                }
                if (IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS.equals(str2)) {
                    if (this.g || a(identifiersResult) || (identifiersResult.id.isEmpty() && !Or.a((Map) this.e))) {
                        return false;
                    }
                } else if (IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED.equals(str2)) {
                    if (identifiersResult == null) {
                        return false;
                    }
                } else if (identifiersResult == null || StringUtils.isNullOrEmpty(identifiersResult.id)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean b() {
        return a(Arrays.asList(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, "appmetrica_device_id_hash", "appmetrica_device_id", IParamsCallback.YANDEX_MOBILE_METRICA_GET_AD_URL, IParamsCallback.YANDEX_MOBILE_METRICA_REPORT_AD_URL, "appmetrica_uuid"));
    }

    public final void c() {
        C0503lb c0503lb;
        Hh d = this.i.i((IdentifiersResult) this.b.get("appmetrica_uuid")).e((IdentifiersResult) this.b.get("appmetrica_device_id")).d((IdentifiersResult) this.b.get("appmetrica_device_id_hash")).a((IdentifiersResult) this.b.get(IParamsCallback.YANDEX_MOBILE_METRICA_GET_AD_URL)).b((IdentifiersResult) this.b.get(IParamsCallback.YANDEX_MOBILE_METRICA_REPORT_AD_URL)).e(this.f).h((IdentifiersResult) this.b.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS)).j(AbstractC0230bq.a((Map) this.e)).f((IdentifiersResult) this.b.get("appmetrica_google_adv_id")).g((IdentifiersResult) this.b.get("appmetrica_huawei_oaid")).j((IdentifiersResult) this.b.get("appmetrica_yandex_adv_id")).b(this.g).c(this.l.d).d(this.h);
        C0445jb c0445jb = this.m;
        synchronized (c0445jb) {
            c0503lb = c0445jb.b;
        }
        d.a(c0503lb);
    }

    public final void b(IdentifiersResult identifiersResult) {
        if (a(identifiersResult)) {
            return;
        }
        this.b.put(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, identifiersResult);
    }

    public final boolean a() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.b.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
        if (!a(identifiersResult) && identifiersResult.id.isEmpty()) {
            return Or.a((Map) this.e);
        }
        return true;
    }

    public final void a(IdentifiersResult identifiersResult, IdentifiersResult identifiersResult2) {
        if (identifiersResult != null) {
            Sr sr = this.o;
            String str = identifiersResult.id;
            sr.getClass();
            if (Sr.a(str)) {
                this.b.put("appmetrica_uuid", identifiersResult);
            }
        }
        String str2 = identifiersResult == null ? null : identifiersResult.id;
        String str3 = identifiersResult2.id;
        if (str2 == null || !(str3 == null || str2.equals(str3))) {
            Cm.a.reportError((str2 == null ? "null_uuid" : "wrong_uuid").concat("_on_client"), b64.l("The only true uuid: ", str2, "; backup uuid: ", str3));
        }
    }

    public static boolean a(IdentifiersResult identifiersResult) {
        return identifiersResult == null || identifiersResult.id == null;
    }

    public final void a(String str, IdentifiersResult identifiersResult) {
        if (identifiersResult == null || StringUtils.isNullOrEmpty(identifiersResult.id)) {
            return;
        }
        this.b.put(str, identifiersResult);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r8.g != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean a(List list) {
        boolean z;
        boolean z2;
        try {
            boolean a = a(kotlin.collections.a.U(list, AbstractC0893yp.a));
            Iterator it = list.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                if (this.a.contains((String) it.next())) {
                    z2 = true;
                    break;
                }
            }
            boolean z3 = AbstractC0893yp.b.currentTimeSeconds() > this.h;
            if (a && !z2 && !z3) {
            }
            z = true;
        } finally {
        }
        return z;
    }

    public C0690rp(Context context, Hh hh) {
        this(hh, new T(), new C0785v4(), V4.l().a(context), new C0788v7(), new C0445jb(), new C0417ib(), new Sr());
    }
}
