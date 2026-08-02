package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import com.connectsdk.service.airplay.PListParser;
import defpackage.x7j;
import io.appmetrica.analytics.IParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Zo {
    public final HashSet a;
    public final HashMap b;
    public final Wo c;
    public List d;
    public HashMap e;
    public long f;
    public boolean g;
    public long h;
    public final C0608rh i;
    public final S j;
    public final C0595r4 k;
    public final C0570q7 l;
    public final C0141bb m;
    public final C0112ab n;
    public final zr o;

    public Zo(C0608rh c0608rh, S s, C0595r4 c0595r4, C0145bf c0145bf, C0570q7 c0570q7, C0141bb c0141bb, C0112ab c0112ab, zr zrVar) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = new HashMap();
        this.c = new Wo();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.i = c0608rh;
        this.j = s;
        this.k = c0595r4;
        this.l = c0570q7;
        this.m = c0141bb;
        this.n = c0112ab;
        this.o = zrVar;
        c(c0145bf.a());
        a("appmetrica_device_id", c0608rh.j());
        a("appmetrica_device_id_hash", c0608rh.i());
        a(IParamsCallback.YANDEX_MOBILE_METRICA_GET_AD_URL, c0608rh.d());
        a(IParamsCallback.YANDEX_MOBILE_METRICA_REPORT_AD_URL, c0608rh.e());
        b(c0608rh.o());
        a("appmetrica_google_adv_id", c0608rh.l());
        a("appmetrica_huawei_oaid", c0608rh.m());
        a("appmetrica_yandex_adv_id", c0608rh.r());
        c0570q7.a(c0608rh.h());
        c0141bb.a(c0608rh.k());
        this.d = c0608rh.g();
        String i = c0608rh.i((String) null);
        this.e = i != null ? Jp.a(i) : null;
        this.g = c0608rh.a(true);
        this.f = c0608rh.b(0L);
        this.h = c0608rh.n();
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
                    C0199db c0199db = this.m.b;
                    if (!Intrinsics.d(str2, IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED) || (bool = c0199db.a) == null) {
                        identifiersResult = null;
                    } else {
                        boolean booleanValue = bool.booleanValue();
                        IdentifierStatus identifierStatus = c0199db.b;
                        String str3 = c0199db.c;
                        if (booleanValue) {
                            str = PListParser.TAG_TRUE;
                        } else {
                            if (booleanValue) {
                                throw new x7j();
                            }
                            str = PListParser.TAG_FALSE;
                        }
                        identifiersResult = new IdentifiersResult(str, identifierStatus, str3);
                    }
                }
                if (IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS.equals(str2)) {
                    if (this.g || a(identifiersResult) || (identifiersResult.id.isEmpty() && !AbstractC0734vr.a((Map) this.e))) {
                        return false;
                    }
                } else if (IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED.equals(str2)) {
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

    public final synchronized boolean b() {
        return a(Arrays.asList(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, "appmetrica_device_id_hash", "appmetrica_device_id", IParamsCallback.YANDEX_MOBILE_METRICA_GET_AD_URL, IParamsCallback.YANDEX_MOBILE_METRICA_REPORT_AD_URL, "appmetrica_uuid"));
    }

    public final void c() {
        C0199db c0199db;
        C0608rh d = this.i.i((IdentifiersResult) this.b.get("appmetrica_uuid")).e((IdentifiersResult) this.b.get("appmetrica_device_id")).d((IdentifiersResult) this.b.get("appmetrica_device_id_hash")).a((IdentifiersResult) this.b.get(IParamsCallback.YANDEX_MOBILE_METRICA_GET_AD_URL)).b((IdentifiersResult) this.b.get(IParamsCallback.YANDEX_MOBILE_METRICA_REPORT_AD_URL)).e(this.f).h((IdentifiersResult) this.b.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS)).j(Jp.a((Map) this.e)).f((IdentifiersResult) this.b.get("appmetrica_google_adv_id")).g((IdentifiersResult) this.b.get("appmetrica_huawei_oaid")).j((IdentifiersResult) this.b.get("appmetrica_yandex_adv_id")).b(this.g).c(this.l.d).d(this.h);
        C0141bb c0141bb = this.m;
        synchronized (c0141bb) {
            c0199db = c0141bb.b;
        }
        d.a(c0199db).b();
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
            return AbstractC0734vr.a((Map) this.e);
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
            boolean a = a(CollectionsKt.U(list, AbstractC0299gp.a));
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
            boolean z3 = AbstractC0299gp.b.currentTimeSeconds() > this.h;
            if (a && !z2 && !z3) {
            }
            z = true;
        } finally {
        }
        return z;
    }

    public final void c(IdentifiersResult identifiersResult) {
        if (identifiersResult != null) {
            zr zrVar = this.o;
            String str = identifiersResult.id;
            zrVar.getClass();
            if (zr.a(str)) {
                this.b.put("appmetrica_uuid", identifiersResult);
            }
        }
    }

    public Zo(Context context, C0608rh c0608rh) {
        this(c0608rh, new S(), new C0595r4(), R4.l().a(context), new C0570q7(), new C0141bb(), new C0112ab(), new zr());
    }
}
