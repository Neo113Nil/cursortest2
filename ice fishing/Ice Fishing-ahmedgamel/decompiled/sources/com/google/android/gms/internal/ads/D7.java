package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class D7 implements AppOpsManager$OnOpActiveChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25087a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25088b;

    public D7(E7 e72) {
        this.f25088b = e72;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z6) {
        switch (this.f25087a) {
            case 0:
                if (z6) {
                    E7 e72 = (E7) this.f25088b;
                    e72.f25303a = System.currentTimeMillis();
                    e72.f25306d = true;
                    return;
                }
                E7 e73 = (E7) this.f25088b;
                long j6 = e73.f25304b;
                long currentTimeMillis = System.currentTimeMillis();
                if (j6 > 0) {
                    long j9 = e73.f25304b;
                    if (currentTimeMillis >= j9) {
                        e73.f25305c = currentTimeMillis - j9;
                    }
                }
                e73.f25306d = false;
                return;
            default:
                C3898sA c3898sA = (C3898sA) this.f25088b;
                synchronized (c3898sA) {
                    try {
                        if (z6) {
                            c3898sA.f34672c = System.currentTimeMillis();
                            c3898sA.f34675f = true;
                        } else {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            long j10 = c3898sA.f34673d;
                            if (j10 > 0 && currentTimeMillis2 >= j10) {
                                c3898sA.f34674e = currentTimeMillis2 - j10;
                            }
                            c3898sA.f34675f = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public D7(C3898sA c3898sA) {
        Objects.requireNonNull(c3898sA);
        this.f25088b = c3898sA;
    }
}
