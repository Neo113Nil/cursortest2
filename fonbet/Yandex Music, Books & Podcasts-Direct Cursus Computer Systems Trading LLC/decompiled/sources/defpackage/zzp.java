package defpackage;

import android.os.SystemClock;

/* loaded from: classes4.dex */
public final class zzp {
    public static final zzp b = new zzp(0);
    public final /* synthetic */ int a;

    public /* synthetic */ zzp(int i) {
        this.a = i;
    }

    public final long a() {
        switch (this.a) {
        }
        return SystemClock.elapsedRealtime();
    }

    public final long b() {
        switch (this.a) {
        }
        return System.currentTimeMillis();
    }
}
