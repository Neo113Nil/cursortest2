package com.google.android.gms.internal.ads;

import android.os.Bundle;
import s2.C4949p;

/* loaded from: classes2.dex */
public final class Qs implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final int f27877a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27878b;

    public Qs(int i, int i4) {
        this.f27877a = i;
        this.f27878b = i4;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        int i;
        Bundle bundle = (Bundle) obj;
        int i4 = this.f27877a;
        if (i4 == -1 || (i = this.f27878b) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i4);
        bundle.putInt("crashes_without_flags", i);
        C4949p c4949p = C4949p.f40498g;
        if (s2.r.f40506e.f40509c.f32243j) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
