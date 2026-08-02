package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.em, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3174em implements InterfaceC3272gc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f30759n;

    /* renamed from: u, reason: collision with root package name */
    public final WeakReference f30760u;

    public /* synthetic */ C3174em(C3282gm c3282gm, int i) {
        this.f30759n = i;
        switch (i) {
            case 1:
                this.f30760u = new WeakReference(c3282gm);
                break;
            default:
                this.f30760u = new WeakReference(c3282gm);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
    public final void e(Object obj, Map map) {
        switch (this.f30759n) {
            case 0:
                C3282gm c3282gm = (C3282gm) this.f30760u.get();
                if (c3282gm != null && "_ac".equals((String) map.get("eventName"))) {
                    c3282gm.f31393A.onAdClicked();
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.gc)).booleanValue()) {
                        C2562El c2562El = c3282gm.f31394B;
                        c2562El.D();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            c2562El.L();
                            break;
                        }
                    }
                }
                break;
            default:
                C3282gm c3282gm2 = (C3282gm) this.f30760u.get();
                if (c3282gm2 != null) {
                    c3282gm2.f31393A.onAdClicked();
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.gc)).booleanValue()) {
                        C2562El c2562El2 = c3282gm2.f31394B;
                        c2562El2.D();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            c2562El2.L();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
