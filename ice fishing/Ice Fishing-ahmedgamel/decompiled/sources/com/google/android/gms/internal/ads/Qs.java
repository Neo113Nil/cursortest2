package com.google.android.gms.internal.ads;

import android.os.Bundle;
import q2.C4900p;

/* loaded from: classes2.dex */
public final class Qs implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final int f27121a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27122b;

    public Qs(int i, int i6) {
        this.f27121a = i;
        this.f27122b = i6;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        int i;
        Bundle bundle = (Bundle) obj;
        int i6 = this.f27121a;
        if (i6 == -1 || (i = this.f27122b) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i6);
        bundle.putInt("crashes_without_flags", i);
        C4900p c4900p = C4900p.f40199g;
        if (q2.r.f40207e.f40210c.f31466j) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
