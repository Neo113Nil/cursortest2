package defpackage;

import android.os.ConditionVariable;

/* loaded from: classes.dex */
public final class kiq extends Thread {
    public final /* synthetic */ ConditionVariable a;
    public final /* synthetic */ liq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kiq(liq liqVar, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.b = liqVar;
        this.a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            this.a.open();
            liq.m(this.b);
            this.b.b.getClass();
        }
    }
}
