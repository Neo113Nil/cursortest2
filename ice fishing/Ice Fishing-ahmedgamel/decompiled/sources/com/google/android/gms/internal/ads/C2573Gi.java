package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.HashMap;
import java.util.List;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Gi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2573Gi implements InterfaceC2488Bi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25099a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25100b;

    public /* synthetic */ C2573Gi(int i, Object obj) {
        this.f25099a = i;
        this.f25100b = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2488Bi
    public final void a(HashMap hashMap) {
        switch (this.f25099a) {
            case 0:
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Ob)).booleanValue()) {
                    QC.r(ID.s(((C3429jw) this.f25100b).a(true)), Throwable.class, C2556Fi.f24820b, AbstractC3413jg.f31268a);
                    return;
                }
                return;
            case 1:
                String str = (String) hashMap.get("render_in_browser");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    ((Rt) this.f25100b).a(Boolean.parseBoolean(str));
                    return;
                } catch (Exception e9) {
                    throw new IllegalStateException("Invalid render_in_browser state", e9);
                }
            default:
                CookieManager cookieManager = (CookieManager) this.f25100b;
                if (cookieManager == null) {
                    return;
                }
                if (((String) hashMap.get("clear")) == null) {
                    String str2 = (String) hashMap.get("cookie");
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    cookieManager.setCookie((String) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32389v1), str2);
                    return;
                }
                String str3 = (String) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32389v1);
                String cookie = cookieManager.getCookie(str3);
                if (cookie != null) {
                    List q8 = com.bumptech.glide.manager.p.d(new PA(';')).q(cookie);
                    for (int i = 0; i < q8.size(); i++) {
                        String str4 = (String) q8.get(i);
                        com.bumptech.glide.manager.p d2 = com.bumptech.glide.manager.p.d(new PA('='));
                        str4.getClass();
                        AbstractC3070dB abstractC3070dB = (AbstractC3070dB) ((InterfaceC3123eB) d2.f23471w).j(d2, str4);
                        if (!abstractC3070dB.hasNext()) {
                            StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 70);
                            sb.append("position (0) must be less than the number of elements that remained (0)");
                            throw new IndexOutOfBoundsException(sb.toString());
                        }
                        cookieManager.setCookie(str3, String.valueOf((String) abstractC3070dB.next()).concat(String.valueOf((String) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32252g1))));
                    }
                    return;
                }
                return;
        }
    }

    public C2573Gi() {
        this.f25099a = 2;
        C4835j.f39733C.f39741f.getClass();
        this.f25100b = a4.e.l();
    }
}
