package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.bE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2974bE extends ID {

    /* renamed from: A, reason: collision with root package name */
    public J3.a f29435A;

    /* renamed from: B, reason: collision with root package name */
    public ScheduledFuture f29436B;

    @Override // com.google.android.gms.internal.ads.AbstractC3354iD
    public final void f() {
        o(this.f29435A);
        ScheduledFuture scheduledFuture = this.f29436B;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f29435A = null;
        this.f29436B = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3354iD
    public final String g() {
        J3.a aVar = this.f29435A;
        ScheduledFuture scheduledFuture = this.f29436B;
        if (aVar == null) {
            return null;
        }
        String obj = aVar.toString();
        String o9 = D.y.o(new StringBuilder(obj.length() + 14), "inputFuture=[", obj, "]");
        if (scheduledFuture == null) {
            return o9;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return o9;
        }
        int length = o9.length();
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + length + 19 + 4);
        sb.append(o9);
        sb.append(", remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }
}
