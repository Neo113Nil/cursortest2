package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.Arrays;
import java.util.HashMap;
import p2.C4835j;

/* loaded from: classes2.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public boolean f28621a;

    /* renamed from: b, reason: collision with root package name */
    public Object f28622b;

    /* renamed from: c, reason: collision with root package name */
    public Object f28623c;

    /* renamed from: d, reason: collision with root package name */
    public Object f28624d;

    /* renamed from: e, reason: collision with root package name */
    public Object f28625e;

    /* renamed from: f, reason: collision with root package name */
    public Object f28626f;

    public synchronized boolean a(Context context) {
        if (!JA.a(context)) {
            return false;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.f28625e = new C4019ut(5, new FA(context));
        } catch (NullPointerException e9) {
            u2.z.k("Error connecting LMD Overlay service");
            C4835j.f39733C.f39743h.d("LastMileDeliveryOverlay.bindLastMileDeliveryService", e9);
        }
        if (((C4019ut) this.f28625e) == null) {
            this.f28621a = false;
            return false;
        }
        if (((t2.n) this.f28626f) == null) {
            this.f28626f = new t2.n(this);
        }
        this.f28621a = true;
        return true;
    }

    public void b(InterfaceC4061vh interfaceC4061vh, BA ba) {
        if (interfaceC4061vh == null) {
            c("adWebview missing", "onLMDShow");
            return;
        }
        this.f28624d = interfaceC4061vh;
        if (!this.f28621a && !a(interfaceC4061vh.getContext())) {
            c("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        boolean booleanValue = ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Vc)).booleanValue();
        String str = ba.f23855b;
        if (booleanValue) {
            this.f28623c = str;
        }
        if (((t2.n) this.f28626f) == null) {
            this.f28626f = new t2.n(this);
        }
        C4019ut c4019ut = (C4019ut) this.f28625e;
        if (c4019ut != null) {
            t2.n nVar = (t2.n) this.f28626f;
            FA fa = (FA) c4019ut.f34603u;
            C2598Hq c2598Hq = fa.f24752a;
            if (c2598Hq == null) {
                FA.f24750c.c("error: %s", "Play Store not found.");
            } else if (FA.c(nVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, str))) {
                c2598Hq.a(new IA(c2598Hq, new RunnableC3865s0(12, fa, ba, nVar), 0));
            }
        }
    }

    public void c(String str, String str2) {
        u2.z.k(str);
        if (((InterfaceC4061vh) this.f28624d) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put(NativeAdvancedJsUtils.f17906p, str2);
            d(hashMap, "onError");
        }
    }

    public void d(HashMap hashMap, String str) {
        AbstractC3413jg.f31273f.execute(new C2.y(14, this, str, hashMap));
    }

    public DA e() {
        String str;
        String str2 = null;
        if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Vc)).booleanValue() || TextUtils.isEmpty((String) this.f28623c)) {
            String str3 = (String) this.f28622b;
            if (str3 != null) {
                str2 = str3;
                str = null;
            } else {
                c("Missing session token and/or appId", "onLMDupdate");
                str = null;
            }
        } else {
            str = (String) this.f28623c;
        }
        return new DA(str2, str);
    }
}
