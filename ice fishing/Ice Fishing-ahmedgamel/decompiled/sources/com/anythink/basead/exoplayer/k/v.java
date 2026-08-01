package com.anythink.basead.exoplayer.k;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final Object f8509a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Integer> f8510b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c, reason: collision with root package name */
    private int f8511c = Integer.MIN_VALUE;

    public static class a extends IOException {
        public a(int i, int i6) {
            super("Priority too low [priority=" + i + ", highest=" + i6 + "]");
        }
    }

    public final void a() {
        synchronized (this.f8509a) {
            this.f8510b.add(0);
            this.f8511c = Math.max(this.f8511c, 0);
        }
    }

    public final void b() {
        synchronized (this.f8509a) {
            while (this.f8511c != 0) {
                try {
                    this.f8509a.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c() {
        synchronized (this.f8509a) {
            this.f8510b.remove(0);
            this.f8511c = this.f8510b.isEmpty() ? Integer.MIN_VALUE : this.f8510b.peek().intValue();
            this.f8509a.notifyAll();
        }
    }

    private boolean b(int i) {
        boolean z3;
        synchronized (this.f8509a) {
            z3 = this.f8511c == i;
        }
        return z3;
    }

    public final void a(int i) {
        synchronized (this.f8509a) {
            try {
                if (this.f8511c != i) {
                    throw new a(i, this.f8511c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
