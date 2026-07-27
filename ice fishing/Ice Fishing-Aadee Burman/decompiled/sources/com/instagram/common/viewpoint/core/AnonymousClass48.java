package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.48, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass48 {
    public boolean A00;
    public final AnonymousClass45 A01;

    public AnonymousClass48() {
        this(AnonymousClass45.A00);
    }

    public AnonymousClass48(AnonymousClass45 anonymousClass45) {
        this.A01 = anonymousClass45;
    }

    public final synchronized void A00() throws InterruptedException {
        while (!this.A00) {
            wait();
        }
    }

    public final synchronized void A01() {
        boolean z3 = false;
        while (true) {
            boolean wasInterrupted = this.A00;
            if (wasInterrupted) {
                break;
            }
            try {
                wait();
            } catch (InterruptedException unused) {
                z3 = true;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean A02() {
        boolean z3;
        z3 = this.A00;
        this.A00 = false;
        return z3;
    }

    public final synchronized boolean A03() {
        return this.A00;
    }

    public final synchronized boolean A04() {
        if (this.A00) {
            return false;
        }
        this.A00 = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean A05(long j6) throws InterruptedException {
        if (j6 <= 0) {
            return this.A00;
        }
        long nowMs = this.A01.A6J();
        long j9 = nowMs + j6;
        if (j9 < nowMs) {
            A00();
        } else {
            while (!this.A00 && nowMs < j9) {
                long endMs = j9 - nowMs;
                wait(endMs);
                nowMs = this.A01.A6J();
            }
        }
        return this.A00;
    }
}
