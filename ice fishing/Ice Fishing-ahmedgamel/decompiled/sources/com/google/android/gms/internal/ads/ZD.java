package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ZD extends HD {

    /* renamed from: A, reason: collision with root package name */
    public N3.a f28855A;

    /* renamed from: B, reason: collision with root package name */
    public ScheduledFuture f28856B;

    @Override // com.google.android.gms.internal.ads.AbstractC3287hD
    public final void f() {
        o(this.f28855A);
        ScheduledFuture scheduledFuture = this.f28856B;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f28855A = null;
        this.f28856B = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3287hD
    public final String g() {
        N3.a aVar = this.f28855A;
        ScheduledFuture scheduledFuture = this.f28856B;
        if (aVar == null) {
            return null;
        }
        String obj = aVar.toString();
        String s9 = D.y.s(new StringBuilder(obj.length() + 14), "inputFuture=[", obj, "]");
        if (scheduledFuture == null) {
            return s9;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return s9;
        }
        int length = s9.length();
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + length + 19 + 4);
        sb.append(s9);
        sb.append(", remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }
}
