package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Fi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2555Fi implements InterfaceC2470Ai {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25006a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25007b;

    public /* synthetic */ C2555Fi(int i, Object obj) {
        this.f25006a = i;
        this.f25007b = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2470Ai
    public final void a(HashMap hashMap) {
        switch (this.f25006a) {
            case 0:
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ob)).booleanValue()) {
                    C3686oN.v(JD.s(((C3550lw) this.f25007b).a(true)), Throwable.class, C2538Ei.f24790b, AbstractC3212fg.f30738a);
                    return;
                }
                return;
            case 1:
                String str = (String) hashMap.get("render_in_browser");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    ((Tt) this.f25007b).a(Boolean.parseBoolean(str));
                    return;
                } catch (Exception e6) {
                    throw new IllegalStateException("Invalid render_in_browser state", e6);
                }
            default:
                CookieManager cookieManager = (CookieManager) this.f25007b;
                if (cookieManager == null) {
                    return;
                }
                if (((String) hashMap.get("clear")) == null) {
                    String str2 = (String) hashMap.get("cookie");
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    cookieManager.setCookie((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31808v1), str2);
                    return;
                }
                String str3 = (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31808v1);
                String cookie = cookieManager.getCookie(str3);
                if (cookie != null) {
                    List r9 = com.bumptech.glide.manager.o.d(new TA(';')).r(cookie);
                    for (int i = 0; i < r9.size(); i++) {
                        String str4 = (String) r9.get(i);
                        com.bumptech.glide.manager.o d2 = com.bumptech.glide.manager.o.d(new TA('='));
                        str4.getClass();
                        AbstractC3298hB abstractC3298hB = (AbstractC3298hB) ((InterfaceC3352iB) d2.f23625w).g(d2, str4);
                        if (!abstractC3298hB.hasNext()) {
                            StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 70);
                            sb.append("position (0) must be less than the number of elements that remained (0)");
                            throw new IndexOutOfBoundsException(sb.toString());
                        }
                        cookieManager.setCookie(str3, String.valueOf((String) abstractC3298hB.next()).concat(String.valueOf((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31670g1))));
                    }
                    return;
                }
                return;
        }
    }

    public C2555Fi() {
        this.f25006a = 2;
        p2.j.f39798C.f39806f.getClass();
        this.f25007b = W3.e.x();
    }
}
