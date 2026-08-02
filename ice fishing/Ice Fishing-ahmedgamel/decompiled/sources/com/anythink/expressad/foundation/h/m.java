package com.anythink.expressad.foundation.h;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final int f20433a = 10;

    private m() {
    }

    public static final long a() {
        try {
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            if (currentTimeMillis > 0) {
                return (currentTimeMillis / 10) * 10;
            }
        } catch (Exception unused) {
        }
        return 0L;
    }
}
