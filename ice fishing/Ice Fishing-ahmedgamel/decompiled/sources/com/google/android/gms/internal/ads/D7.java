package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class D7 implements AppOpsManager$OnOpActiveChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24342a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24343b;

    public D7(E7 e72) {
        this.f24343b = e72;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z3) {
        switch (this.f24342a) {
            case 0:
                if (z3) {
                    E7 e72 = (E7) this.f24343b;
                    e72.f24542a = System.currentTimeMillis();
                    e72.f24545d = true;
                    return;
                }
                E7 e73 = (E7) this.f24343b;
                long j6 = e73.f24543b;
                long currentTimeMillis = System.currentTimeMillis();
                if (j6 > 0) {
                    long j9 = e73.f24543b;
                    if (currentTimeMillis >= j9) {
                        e73.f24544c = currentTimeMillis - j9;
                    }
                }
                e73.f24545d = false;
                return;
            default:
                C3875sA c3875sA = (C3875sA) this.f24343b;
                synchronized (c3875sA) {
                    try {
                        if (z3) {
                            c3875sA.f33904c = System.currentTimeMillis();
                            c3875sA.f33907f = true;
                        } else {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            long j10 = c3875sA.f33905d;
                            if (j10 > 0 && currentTimeMillis2 >= j10) {
                                c3875sA.f33906e = currentTimeMillis2 - j10;
                            }
                            c3875sA.f33907f = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public D7(C3875sA c3875sA) {
        Objects.requireNonNull(c3875sA);
        this.f24343b = c3875sA;
    }
}
