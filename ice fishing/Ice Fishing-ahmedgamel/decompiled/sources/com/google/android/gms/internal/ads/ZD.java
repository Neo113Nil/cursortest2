package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ZD extends HD {

    /* renamed from: A, reason: collision with root package name */
    public P3.a f29635A;

    /* renamed from: B, reason: collision with root package name */
    public ScheduledFuture f29636B;

    @Override // com.google.android.gms.internal.ads.AbstractC3310hD
    public final void f() {
        o(this.f29635A);
        ScheduledFuture scheduledFuture = this.f29636B;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f29635A = null;
        this.f29636B = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3310hD
    public final String g() {
        P3.a aVar = this.f29635A;
        ScheduledFuture scheduledFuture = this.f29636B;
        if (aVar == null) {
            return null;
        }
        String obj = aVar.toString();
        String p9 = D.x.p(new StringBuilder(obj.length() + 14), "inputFuture=[", obj, "]");
        if (scheduledFuture == null) {
            return p9;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return p9;
        }
        int length = p9.length();
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + length + 19 + 4);
        sb.append(p9);
        sb.append(", remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }
}
