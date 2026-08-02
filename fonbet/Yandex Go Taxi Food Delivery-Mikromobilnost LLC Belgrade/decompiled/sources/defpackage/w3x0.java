package defpackage;

import android.os.SystemClock;

/* loaded from: classes10.dex */
public class w3x0 implements c7z0 {
    @Override // defpackage.c7z0
    public final long c() {
        return SystemClock.elapsedRealtimeNanos() / 1000;
    }

    @Override // defpackage.c7z0
    public final long d() {
        return System.nanoTime() / 1000;
    }
}
