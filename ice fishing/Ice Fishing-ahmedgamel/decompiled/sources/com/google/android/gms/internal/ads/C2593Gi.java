package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.HashMap;
import java.util.List;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Gi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2593Gi implements InterfaceC2508Bi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25886a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25887b;

    public /* synthetic */ C2593Gi(int i, Object obj) {
        this.f25886a = i;
        this.f25887b = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2508Bi
    public final void a(HashMap hashMap) {
        switch (this.f25886a) {
            case 0:
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ob)).booleanValue()) {
                    QC.r(ID.s(((C3506kw) this.f25887b).a(true)), Throwable.class, C2576Fi.f25609b, AbstractC3436jg.f32055a);
                    return;
                }
                return;
            case 1:
                String str = (String) hashMap.get("render_in_browser");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    ((Rt) this.f25887b).a(Boolean.parseBoolean(str));
                    return;
                } catch (Exception e9) {
                    throw new IllegalStateException("Invalid render_in_browser state", e9);
                }
            default:
                CookieManager cookieManager = (CookieManager) this.f25887b;
                if (cookieManager == null) {
                    return;
                }
                if (((String) hashMap.get("clear")) == null) {
                    String str2 = (String) hashMap.get("cookie");
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    cookieManager.setCookie((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33169v1), str2);
                    return;
                }
                String str3 = (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33169v1);
                String cookie = cookieManager.getCookie(str3);
                if (cookie != null) {
                    List q8 = com.bumptech.glide.manager.o.d(new PA(';')).q(cookie);
                    for (int i = 0; i < q8.size(); i++) {
                        String str4 = (String) q8.get(i);
                        com.bumptech.glide.manager.o d9 = com.bumptech.glide.manager.o.d(new PA('='));
                        str4.getClass();
                        AbstractC3093dB abstractC3093dB = (AbstractC3093dB) ((InterfaceC3146eB) d9.f24256w).j(d9, str4);
                        if (!abstractC3093dB.hasNext()) {
                            StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 70);
                            sb.append("position (0) must be less than the number of elements that remained (0)");
                            throw new IndexOutOfBoundsException(sb.toString());
                        }
                        cookieManager.setCookie(str3, String.valueOf((String) abstractC3093dB.next()).concat(String.valueOf((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33032g1))));
                    }
                    return;
                }
                return;
        }
    }

    public C2593Gi() {
        this.f25886a = 2;
        C4906k.f40186C.f40194f.getClass();
        this.f25887b = O2.i.q();
    }
}
