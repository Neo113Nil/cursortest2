package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.Arrays;
import java.util.HashMap;
import l.C4659e;
import r2.C4906k;

/* loaded from: classes2.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public boolean f29398a;

    /* renamed from: b, reason: collision with root package name */
    public Object f29399b;

    /* renamed from: c, reason: collision with root package name */
    public Object f29400c;

    /* renamed from: d, reason: collision with root package name */
    public Object f29401d;

    /* renamed from: e, reason: collision with root package name */
    public Object f29402e;

    /* renamed from: f, reason: collision with root package name */
    public Object f29403f;

    public synchronized boolean a(Context context) {
        if (!JA.a(context)) {
            return false;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.f29402e = new C4042ut(5, new FA(context));
        } catch (NullPointerException e9) {
            w2.z.k("Error connecting LMD Overlay service");
            C4906k.f40186C.f40196h.d("LastMileDeliveryOverlay.bindLastMileDeliveryService", e9);
        }
        if (((C4042ut) this.f29402e) == null) {
            this.f29398a = false;
            return false;
        }
        if (((C4659e) this.f29403f) == null) {
            this.f29403f = new C4659e(this);
        }
        this.f29398a = true;
        return true;
    }

    public void b(InterfaceC4084vh interfaceC4084vh, BA ba) {
        if (interfaceC4084vh == null) {
            c("adWebview missing", "onLMDShow");
            return;
        }
        this.f29401d = interfaceC4084vh;
        if (!this.f29398a && !a(interfaceC4084vh.getContext())) {
            c("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Vc)).booleanValue();
        String str = ba.f24626b;
        if (booleanValue) {
            this.f29400c = str;
        }
        if (((C4659e) this.f29403f) == null) {
            this.f29403f = new C4659e(this);
        }
        C4042ut c4042ut = (C4042ut) this.f29402e;
        if (c4042ut != null) {
            C4659e c4659e = (C4659e) this.f29403f;
            FA fa = (FA) c4042ut.f35366u;
            C2618Hq c2618Hq = fa.f25508a;
            if (c2618Hq == null) {
                FA.f25506c.c("error: %s", "Play Store not found.");
            } else if (FA.c(c4659e, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, str))) {
                c2618Hq.a(new IA(c2618Hq, new RunnableC3888s0(12, fa, ba, c4659e), 0));
            }
        }
    }

    public void c(String str, String str2) {
        w2.z.k(str);
        if (((InterfaceC4084vh) this.f29401d) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put(NativeAdvancedJsUtils.f18693p, str2);
            d(hashMap, "onError");
        }
    }

    public void d(HashMap hashMap, String str) {
        AbstractC3436jg.f32060f.execute(new E2.x(14, this, str, hashMap));
    }

    public DA e() {
        String str;
        String str2 = null;
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Vc)).booleanValue() || TextUtils.isEmpty((String) this.f29400c)) {
            String str3 = (String) this.f29399b;
            if (str3 != null) {
                str2 = str3;
                str = null;
            } else {
                c("Missing session token and/or appId", "onLMDupdate");
                str = null;
            }
        } else {
            str = (String) this.f29400c;
        }
        return new DA(str2, str);
    }
}
