package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.cc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3044cc implements InterfaceC2990bc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29716n;

    /* renamed from: u, reason: collision with root package name */
    public final C2748Qo f29717u;

    public C3044cc(C2748Qo c2748Qo, int i) {
        this.f29716n = i;
        switch (i) {
            case 1:
                O2.w.i(c2748Qo, "The Inspector Manager must not be null");
                this.f29717u = c2748Qo;
                break;
            default:
                O2.w.i(c2748Qo, "The Inspector Manager must not be null");
                this.f29717u = c2748Qo;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
    public final void g(Object obj, Map map) {
        switch (this.f29716n) {
            case 0:
                if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
                    return;
                }
                C2748Qo c2748Qo = this.f29717u;
                String str = (String) map.get("persistentData");
                synchronized (c2748Qo) {
                    c2748Qo.f27239x = str;
                    p2.j.f39798C.f39808h.g().g(c2748Qo.f27239x);
                }
                return;
            default:
                if (map == null || !map.containsKey("extras")) {
                    return;
                }
                long j9 = Long.MAX_VALUE;
                if (map.containsKey("expires")) {
                    try {
                        j9 = Long.parseLong((String) map.get("expires"));
                    } catch (NumberFormatException unused) {
                    }
                }
                C2748Qo c2748Qo2 = this.f29717u;
                String str2 = (String) map.get("extras");
                synchronized (c2748Qo2) {
                    c2748Qo2.f27230o = str2;
                    c2748Qo2.f27232q = j9;
                    c2748Qo2.m();
                }
                return;
        }
    }
}
