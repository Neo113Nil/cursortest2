package com.google.android.gms.internal.ads;

import android.os.Bundle;
import q2.C4907p;

/* loaded from: classes2.dex */
public final class Ss implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final int f27630a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27631b;

    public Ss(int i, int i4) {
        this.f27630a = i;
        this.f27631b = i4;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final void b(Object obj) {
        int i;
        Bundle bundle = (Bundle) obj;
        int i4 = this.f27630a;
        if (i4 == -1 || (i = this.f27631b) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i4);
        bundle.putInt("crashes_without_flags", i);
        C4907p c4907p = C4907p.f40108g;
        if (q2.r.f40116e.f40119c.f31018j) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
