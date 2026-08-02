package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.hc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3326hc implements InterfaceC3272gc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31580n;

    /* renamed from: u, reason: collision with root package name */
    public final C2786Ro f31581u;

    public C3326hc(C2786Ro c2786Ro, int i) {
        this.f31580n = i;
        switch (i) {
            case 1:
                R2.w.i(c2786Ro, "The Inspector Manager must not be null");
                this.f31581u = c2786Ro;
                break;
            default:
                R2.w.i(c2786Ro, "The Inspector Manager must not be null");
                this.f31581u = c2786Ro;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
    public final void e(Object obj, Map map) {
        switch (this.f31580n) {
            case 0:
                if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
                    return;
                }
                C2786Ro c2786Ro = this.f31581u;
                String str = (String) map.get("persistentData");
                synchronized (c2786Ro) {
                    c2786Ro.f28046x = str;
                    C4906k.f40186C.f40196h.g().g(c2786Ro.f28046x);
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
                C2786Ro c2786Ro2 = this.f31581u;
                String str2 = (String) map.get("extras");
                synchronized (c2786Ro2) {
                    c2786Ro2.f28037o = str2;
                    c2786Ro2.f28039q = j6;
                    c2786Ro2.m();
                }
                return;
        }
    }
}
