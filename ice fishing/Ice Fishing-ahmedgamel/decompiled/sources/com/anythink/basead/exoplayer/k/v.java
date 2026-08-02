package com.anythink.basead.exoplayer.k;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final Object f9295a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Integer> f9296b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c, reason: collision with root package name */
    private int f9297c = Integer.MIN_VALUE;

    public static class a extends IOException {
        public a(int i, int i4) {
            super("Priority too low [priority=" + i + ", highest=" + i4 + "]");
        }
    }

    public final void a() {
        synchronized (this.f9295a) {
            this.f9296b.add(0);
            this.f9297c = Math.max(this.f9297c, 0);
        }
    }

    public final void b() {
        synchronized (this.f9295a) {
            while (this.f9297c != 0) {
                try {
                    this.f9295a.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c() {
        synchronized (this.f9295a) {
            this.f9296b.remove(0);
            this.f9297c = this.f9296b.isEmpty() ? Integer.MIN_VALUE : this.f9296b.peek().intValue();
            this.f9295a.notifyAll();
        }
    }

    private boolean b(int i) {
        boolean z6;
        synchronized (this.f9295a) {
            z6 = this.f9297c == i;
        }
        return z6;
    }

    public final void a(int i) {
        synchronized (this.f9295a) {
            try {
                if (this.f9297c != i) {
                    throw new a(i, this.f9297c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
