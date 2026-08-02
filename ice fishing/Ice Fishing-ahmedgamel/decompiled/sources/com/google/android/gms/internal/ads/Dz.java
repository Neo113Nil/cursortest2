package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Dz extends Cw {

    /* renamed from: f, reason: collision with root package name */
    public final Cy f25269f;

    public Dz(Context context, ExecutorService executorService, Cy cy) {
        super(context, executorService, new l3.m(), false);
        this.f25269f = cy;
    }

    @Override // com.google.android.gms.internal.ads.Cw
    public final void b(int i, long j6) {
        ((Gy) this.f25269f).a(i, j6, null, null);
        new l3.m().l(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.Cw
    public final void c(int i, long j6, Exception exc) {
        ((Gy) this.f25269f).a(i, j6, exc, null);
        new l3.m().l(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.Cw
    public final void d(int i, String str) {
        ((Gy) this.f25269f).a(i, -1L, null, str);
        new l3.m().l(Boolean.TRUE);
    }
}
