package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;

/* renamed from: com.facebook.ads.redexgen.X.53, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass53 {
    public long A00;
    public long A01;
    public long A02;
    public final ThreadLocal<Long> A03 = new ThreadLocal<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized long A06(long j9) {
        if (j9 == b.f6539b) {
            return b.f6539b;
        }
        if (this.A01 != b.f6539b) {
            long A01 = A01(this.A01);
            long j10 = (4294967296L + A01) / 8589934592L;
            long j11 = ((j10 - 1) * 8589934592L) + j9;
            long j12 = (8589934592L * j10) + j9;
            if (Math.abs(j11 - A01) >= Math.abs(j12 - A01)) {
                j11 = j12;
            }
            j9 = j11;
        }
        return A05(A00(j9));
    }

    public AnonymousClass53(long j9) {
        A07(j9);
    }

    public static long A00(long j9) {
        return (1000000 * j9) / 90000;
    }

    public static long A01(long j9) {
        return (90000 * j9) / 1000000;
    }

    public final synchronized long A02() {
        long j9;
        if (this.A00 != Long.MAX_VALUE && this.A00 != 9223372036854775806L) {
            j9 = this.A00;
        }
        j9 = b.f6539b;
        return j9;
    }

    public final synchronized long A03() {
        long A02;
        if (this.A01 != b.f6539b) {
            A02 = this.A01 + this.A02;
        } else {
            A02 = A02();
        }
        return A02;
    }

    public final synchronized long A04() {
        return this.A02;
    }

    public final synchronized long A05(long j9) {
        long desiredSampleTimestampUs;
        if (j9 == b.f6539b) {
            return b.f6539b;
        }
        if (this.A02 == b.f6539b) {
            if (this.A00 == 9223372036854775806L) {
                desiredSampleTimestampUs = ((Long) AbstractC06233y.A01(this.A03.get())).longValue();
            } else {
                desiredSampleTimestampUs = this.A00;
            }
            this.A02 = desiredSampleTimestampUs - j9;
            notifyAll();
        }
        this.A01 = j9;
        return this.A02 + j9;
    }

    public final synchronized void A07(long j9) {
        this.A00 = j9;
        this.A02 = j9 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.A01 = b.f6539b;
    }
}
