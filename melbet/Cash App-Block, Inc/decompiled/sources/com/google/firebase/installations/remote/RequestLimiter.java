package com.google.firebase.installations.remote;

import com.google.firebase.installations.Utils;
import com.google.mlkit.common.internal.zzb;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class RequestLimiter {
    public int attemptCount;
    public long nextRequestTime;

    /* renamed from: utils, reason: collision with root package name */
    public final Utils f1009utils;

    public RequestLimiter() {
        if (zzb.singleton == null) {
            Pattern pattern = Utils.API_KEY_FORMAT;
            zzb.singleton = new zzb(10);
        }
        zzb zzbVar = zzb.singleton;
        if (Utils.singleton == null) {
            Utils.singleton = new Utils(zzbVar);
        }
        this.f1009utils = Utils.singleton;
    }

    public final synchronized boolean isRequestAllowed() {
        boolean z;
        if (this.attemptCount != 0) {
            this.f1009utils.clock.getClass();
            z = System.currentTimeMillis() > this.nextRequestTime;
        }
        return z;
    }

    public final synchronized void setNextRequestTime(int i) {
        long min;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.attemptCount = 0;
            }
            return;
        }
        this.attemptCount++;
        synchronized (this) {
            if (i != 429 && (i < 500 || i >= 600)) {
                min = 86400000;
                this.f1009utils.clock.getClass();
                this.nextRequestTime = System.currentTimeMillis() + min;
            }
            double pow = Math.pow(2.0d, this.attemptCount);
            this.f1009utils.getClass();
            min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), 1800000.0d);
            this.f1009utils.clock.getClass();
            this.nextRequestTime = System.currentTimeMillis() + min;
        }
        return;
    }
}
