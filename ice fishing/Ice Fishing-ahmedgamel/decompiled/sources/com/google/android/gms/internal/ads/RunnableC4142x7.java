package com.google.android.gms.internal.ads;

import java.io.IOException;
import o2.C4784b;

/* renamed from: com.google.android.gms.internal.ads.x7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4142x7 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34958n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4196y7 f34959u;

    public /* synthetic */ RunnableC4142x7(C4196y7 c4196y7, int i) {
        this.f34958n = i;
        this.f34959u = c4196y7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34958n) {
            case 0:
                C4196y7 c4196y7 = this.f34959u;
                c4196y7.getClass();
                try {
                    if (c4196y7.f35100f == null && c4196y7.f35101g) {
                        C4784b c4784b = new C4784b(c4196y7.f35095a, 30000L, false);
                        c4784b.d(true);
                        c4196y7.f35100f = c4784b;
                        break;
                    }
                } catch (M2.g | IOException unused) {
                    c4196y7.f35100f = null;
                    return;
                }
                break;
            default:
                AbstractC3569ma.a(this.f34959u.f35095a);
                break;
        }
    }
}
