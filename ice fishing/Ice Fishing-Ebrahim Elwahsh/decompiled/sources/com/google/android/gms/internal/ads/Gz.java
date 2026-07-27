package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Gz extends Dw {

    /* renamed from: f, reason: collision with root package name */
    public final Dy f25263f;

    public Gz(Context context, ExecutorService executorService, Dy dy) {
        super(context, executorService, new h3.n(), false);
        this.f25263f = dy;
    }

    @Override // com.google.android.gms.internal.ads.Dw
    public final void b(int i, long j9) {
        ((Hy) this.f25263f).b(i, j9, null, null);
        new h3.n().l(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.Dw
    public final void c(int i, long j9, Exception exc) {
        ((Hy) this.f25263f).b(i, j9, exc, null);
        new h3.n().l(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.Dw
    public final void d(int i, String str) {
        ((Hy) this.f25263f).b(i, -1L, null, str);
        new h3.n().l(Boolean.TRUE);
    }
}
