package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.hc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3303hc implements InterfaceC3249gc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f30819n;

    /* renamed from: u, reason: collision with root package name */
    public final C2749Qo f30820u;

    public C3303hc(C2749Qo c2749Qo, int i) {
        this.f30819n = i;
        switch (i) {
            case 1:
                P2.w.i(c2749Qo, "The Inspector Manager must not be null");
                this.f30820u = c2749Qo;
                break;
            default:
                P2.w.i(c2749Qo, "The Inspector Manager must not be null");
                this.f30820u = c2749Qo;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
    public final void e(Object obj, Map map) {
        switch (this.f30819n) {
            case 0:
                if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
                    return;
                }
                C2749Qo c2749Qo = this.f30820u;
                String str = (String) map.get("persistentData");
                synchronized (c2749Qo) {
                    c2749Qo.f27102x = str;
                    C4835j.f39730C.f39740h.g().g(c2749Qo.f27102x);
                }
                return;
            default:
                if (map == null || !map.containsKey("extras")) {
                    return;
                }
                long j6 = Long.MAX_VALUE;
                if (map.containsKey("expires")) {
                    try {
                        j6 = Long.parseLong((String) map.get("expires"));
                    } catch (NumberFormatException unused) {
                    }
                }
                C2749Qo c2749Qo2 = this.f30820u;
                String str2 = (String) map.get("extras");
                synchronized (c2749Qo2) {
                    c2749Qo2.f27093o = str2;
                    c2749Qo2.f27095q = j6;
                    c2749Qo2.m();
                }
                return;
        }
    }
}
