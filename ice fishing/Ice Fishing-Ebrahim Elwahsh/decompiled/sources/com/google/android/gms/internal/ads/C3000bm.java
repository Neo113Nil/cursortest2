package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.bm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3000bm implements InterfaceC2990bc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29569n;

    /* renamed from: u, reason: collision with root package name */
    public final WeakReference f29570u;

    public /* synthetic */ C3000bm(C3109dm c3109dm, int i) {
        this.f29569n = i;
        switch (i) {
            case 1:
                this.f29570u = new WeakReference(c3109dm);
                break;
            default:
                this.f29570u = new WeakReference(c3109dm);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
    public final void g(Object obj, Map map) {
        switch (this.f29569n) {
            case 0:
                C3109dm c3109dm = (C3109dm) this.f29570u.get();
                if (c3109dm != null && "_ac".equals((String) map.get("eventName"))) {
                    c3109dm.f30197A.onAdClicked();
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.gc)).booleanValue()) {
                        C2507Cl c2507Cl = c3109dm.f30198B;
                        c2507Cl.C();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            c2507Cl.L();
                            break;
                        }
                    }
                }
                break;
            default:
                C3109dm c3109dm2 = (C3109dm) this.f29570u.get();
                if (c3109dm2 != null) {
                    c3109dm2.f30197A.onAdClicked();
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.gc)).booleanValue()) {
                        C2507Cl c2507Cl2 = c3109dm2.f30198B;
                        c2507Cl2.C();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            c2507Cl2.L();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
