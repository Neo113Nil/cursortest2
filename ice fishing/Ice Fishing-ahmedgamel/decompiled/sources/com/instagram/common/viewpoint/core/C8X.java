package com.instagram.common.viewpoint.core;

import android.util.Pair;
import com.anythink.basead.exoplayer.b;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.MlltFrame;

/* renamed from: com.facebook.ads.redexgen.X.8X, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C8X implements InterfaceC2184mF {
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static Pair<Long, Long> A00(long j6, long[] jArr, long[] jArr2) {
        int A0L = C5C.A0L(jArr, j6, true, true);
        long j9 = jArr[A0L];
        long j10 = jArr2[A0L];
        int i = A0L + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j9), Long.valueOf(j10));
        }
        return Pair.create(Long.valueOf(j6), Long.valueOf(((long) ((jArr2[i] - j10) * (jArr[i] == j9 ? 0.0d : (j6 - j9) / (r4 - j9)))) + j10));
    }

    public C8X(long[] jArr, long[] jArr2, long j6) {
        this.A01 = jArr;
        this.A02 = jArr2;
        this.A00 = j6 == b.f7168b ? C5C.A0O(jArr2[jArr2.length - 1]) : j6;
    }

    public static C8X A01(long j6, MlltFrame mlltFrame, long j9) {
        int length = mlltFrame.A03.length;
        int referenceCount = length + 1;
        long[] jArr = new long[referenceCount];
        int referenceCount2 = length + 1;
        long[] jArr2 = new long[referenceCount2];
        jArr[0] = j6;
        jArr2[0] = 0;
        long j10 = 0;
        for (int i = 1; i <= length; i++) {
            int referenceCount3 = i - 1;
            j6 += mlltFrame.A00 + mlltFrame.A03[referenceCount3];
            int referenceCount4 = i - 1;
            j10 += mlltFrame.A01 + mlltFrame.A04[referenceCount4];
            jArr[i] = j6;
            jArr2[i] = j10;
        }
        return new C8X(jArr, jArr2, j9);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2184mF
    public final long A7j() {
        return -1L;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final long A7t() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final HX A91(long j6) {
        Pair<Long, Long> A00 = A00(C5C.A0P(C5C.A0T(j6, 0L, this.A00)), this.A02, this.A01);
        return new HX(new HZ(C5C.A0O(((Long) A00.first).longValue()), ((Long) A00.second).longValue()));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2184mF
    public final long A9H(long j6) {
        Pair<Long, Long> positionAndTimeMs = A00(j6, this.A01, this.A02);
        return C5C.A0O(((Long) positionAndTimeMs.second).longValue());
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final boolean AAj() {
        return true;
    }
}
