package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class tjj {
    public final long[] b;
    public final boolean[] c;
    public volatile boolean d;
    public volatile boolean f;
    public final ReentrantLock a = new ReentrantLock();
    public final ReentrantLock e = new ReentrantLock();

    public tjj(int i) {
        this.b = new long[i];
        this.c = new boolean[i];
    }
}
