package com.google.android.gms.internal.ads;

import java.io.IOException;
import q2.C4870b;

/* renamed from: com.google.android.gms.internal.ads.x7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4165x7 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35739n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4219y7 f35740u;

    public /* synthetic */ RunnableC4165x7(C4219y7 c4219y7, int i) {
        this.f35739n = i;
        this.f35740u = c4219y7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35739n) {
            case 0:
                C4219y7 c4219y7 = this.f35740u;
                c4219y7.getClass();
                try {
                    if (c4219y7.f35886f == null && c4219y7.f35887g) {
                        C4870b c4870b = new C4870b(c4219y7.f35881a, 30000L, false);
                        c4870b.d(true);
                        c4219y7.f35886f = c4870b;
                        break;
                    }
                } catch (O2.g | IOException unused) {
                    c4219y7.f35886f = null;
                    return;
                }
                break;
            default:
                AbstractC3592ma.a(this.f35740u.f35881a);
                break;
        }
    }
}
