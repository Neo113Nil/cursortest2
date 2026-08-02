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
    public final synchronized long A06(long j6) {
        if (j6 == b.f7168b) {
            return b.f7168b;
        }
        if (this.A01 != b.f7168b) {
            long A01 = A01(this.A01);
            long j9 = (4294967296L + A01) / 8589934592L;
            long j10 = ((j9 - 1) * 8589934592L) + j6;
            long j11 = (8589934592L * j9) + j6;
            if (Math.abs(j10 - A01) >= Math.abs(j11 - A01)) {
                j10 = j11;
            }
            j6 = j10;
        }
        return A05(A00(j6));
    }

    public AnonymousClass53(long j6) {
        A07(j6);
    }

    public static long A00(long j6) {
        return (1000000 * j6) / 90000;
    }

    public static long A01(long j6) {
        return (90000 * j6) / 1000000;
    }

    public final synchronized long A02() {
        long j6;
        if (this.A00 != Long.MAX_VALUE && this.A00 != 9223372036854775806L) {
            j6 = this.A00;
        }
        j6 = b.f7168b;
        return j6;
    }

    public final synchronized long A03() {
        long A02;
        if (this.A01 != b.f7168b) {
            A02 = this.A01 + this.A02;
        } else {
            A02 = A02();
        }
        return A02;
    }

    public final synchronized long A04() {
        return this.A02;
    }

    public final synchronized long A05(long j6) {
        long desiredSampleTimestampUs;
        if (j6 == b.f7168b) {
            return b.f7168b;
        }
        if (this.A02 == b.f7168b) {
            if (this.A00 == 9223372036854775806L) {
                desiredSampleTimestampUs = ((Long) AbstractC06443y.A01(this.A03.get())).longValue();
            } else {
                desiredSampleTimestampUs = this.A00;
            }
            this.A02 = desiredSampleTimestampUs - j6;
            notifyAll();
        }
        this.A01 = j6;
        return this.A02 + j6;
    }

    public final synchronized void A07(long j6) {
        this.A00 = j6;
        this.A02 = j6 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.A01 = b.f7168b;
    }
}
