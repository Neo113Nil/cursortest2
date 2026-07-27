package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3098dm implements InterfaceC3249gc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29843n;

    /* renamed from: u, reason: collision with root package name */
    public final WeakReference f29844u;

    public /* synthetic */ C3098dm(C3205fm c3205fm, int i) {
        this.f29843n = i;
        switch (i) {
            case 1:
                this.f29844u = new WeakReference(c3205fm);
                break;
            default:
                this.f29844u = new WeakReference(c3205fm);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
    public final void e(Object obj, Map map) {
        switch (this.f29843n) {
            case 0:
                C3205fm c3205fm = (C3205fm) this.f29844u.get();
                if (c3205fm != null && "_ac".equals((String) map.get("eventName"))) {
                    c3205fm.f30420A.onAdClicked();
                    if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.gc)).booleanValue()) {
                        C2525Dl c2525Dl = c3205fm.f30421B;
                        c2525Dl.J();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            c2525Dl.M();
                            break;
                        }
                    }
                }
                break;
            default:
                C3205fm c3205fm2 = (C3205fm) this.f29844u.get();
                if (c3205fm2 != null) {
                    c3205fm2.f30420A.onAdClicked();
                    if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.gc)).booleanValue()) {
                        C2525Dl c2525Dl2 = c3205fm2.f30421B;
                        c2525Dl2.J();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            c2525Dl2.M();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
