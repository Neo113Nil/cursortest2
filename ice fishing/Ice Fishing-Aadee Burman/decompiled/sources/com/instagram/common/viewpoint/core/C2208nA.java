package com.instagram.common.viewpoint.core;

import android.content.Context;
import com.anythink.basead.exoplayer.i.a;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.nA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2208nA implements F6, InterfaceC06715t {
    public int A00;
    public int A01;

    @MetaExoPlayerCustomization("Needed for Meta Custom getAvailableSamples")
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public boolean A0A;
    public final AnonymousClass45 A0B;
    public final F4 A0C;
    public final FW A0D;

    @MetaExoPlayerCustomization("Upstream uses Map. Oculus doesn't play well with these collections")
    public final Map<Integer, Long> A0E;
    public final boolean A0F;
    public static final List<Long> A0L = MetaExoPlayerCustomizedCollections.A03(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
    public static final List<Long> A0G = MetaExoPlayerCustomizedCollections.A03(1400000L, 990000L, 730000L, 510000L, 230000L);
    public static final List<Long> A0H = MetaExoPlayerCustomizedCollections.A03(2100000L, 1400000L, 1000000L, 890000L, 640000L);
    public static final List<Long> A0I = MetaExoPlayerCustomizedCollections.A03(2600000L, 1700000L, 1300000L, 1000000L, 700000L);
    public static final List<Long> A0J = MetaExoPlayerCustomizedCollections.A03(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
    public static final List<Long> A0K = MetaExoPlayerCustomizedCollections.A03(2800000L, 1800000L, 1400000L, 1100000L, 870000L);

    @Deprecated
    public C2208nA() {
        this(null, Collections.emptyMap(), 2000, AnonymousClass45.A00, false);
    }

    public C2208nA(Context context, Map<Integer, Long> initialBitrateEstimates, int i, AnonymousClass45 anonymousClass45, boolean z3) {
        this.A0E = MetaExoPlayerCustomizedCollections.A04(initialBitrateEstimates);
        this.A0C = new F4();
        this.A0D = new FW(i);
        this.A0B = anonymousClass45;
        this.A0F = z3;
        if (context != null) {
            C06414p A03 = C06414p.A03(context);
            this.A00 = A03.A09();
            this.A04 = A00(this.A00);
            A03.A0A(new InterfaceC06394n() { // from class: com.facebook.ads.redexgen.X.nB
                @Override // com.instagram.common.viewpoint.core.InterfaceC06394n
                public final void AF1(int i6) {
                    C2208nA.this.A01(i6);
                }
            });
            return;
        }
        this.A00 = 0;
        this.A04 = A00(0);
    }

    private long A00(int i) {
        Long initialBitrateEstimate = this.A0E.get(Integer.valueOf(i));
        if (initialBitrateEstimate == null) {
            initialBitrateEstimate = this.A0E.get(0);
        }
        if (initialBitrateEstimate == null) {
            initialBitrateEstimate = 1000000L;
        }
        return initialBitrateEstimate.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A01(int i) {
        int sampleElapsedTimeMs;
        if (this.A00 == 0 || this.A0F) {
            if (this.A0A) {
                i = this.A01;
            }
            if (this.A00 == i) {
                return;
            }
            this.A00 = i;
            if (i == 1 || i == 0 || i == 8) {
                return;
            }
            this.A04 = A00(i);
            long A6J = this.A0B.A6J();
            if (this.A03 > 0) {
                long nowMs = A6J - this.A07;
                sampleElapsedTimeMs = (int) nowMs;
            } else {
                sampleElapsedTimeMs = 0;
            }
            A02(sampleElapsedTimeMs, this.A06, this.A04);
            this.A07 = A6J;
            this.A06 = 0L;
            this.A08 = 0L;
            this.A09 = 0L;
            this.A0D.A06();
        }
    }

    private void A02(int i, long j6, long j9) {
        if (i == 0 && j6 == 0 && j9 == this.A05) {
            return;
        }
        this.A05 = j9;
        this.A0C.A00(i, j6, j9);
    }

    public static boolean A04(C06605i c06605i, boolean z3) {
        return z3 && !c06605i.A06(8);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06715t
    public final synchronized void ADK(InterfaceC2336pF interfaceC2336pF, C06605i c06605i, boolean z3, int i) {
        if (A04(c06605i, z3)) {
            this.A06 += i;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06715t
    public final synchronized void AGG(InterfaceC2336pF interfaceC2336pF, C06605i c06605i, boolean z3) {
        if (A04(c06605i, z3)) {
            AbstractC06243y.A08(this.A03 > 0);
            long nowMs = this.A0B.A6J();
            int i = (int) (nowMs - this.A07);
            this.A09 += i;
            this.A08 += this.A06;
            if (i > 0) {
                FW fw = this.A0D;
                int sampleElapsedTimeMs = (int) Math.sqrt(this.A06);
                fw.A07(sampleElapsedTimeMs, (this.A06 * 8000.0f) / i);
                if (this.A09 >= a.f7883f || this.A08 >= 524288) {
                    this.A04 = (long) this.A0D.A05(0.5f);
                }
                int sampleElapsedTimeMs2 = this.A02;
                this.A02 = sampleElapsedTimeMs2 + 1;
                A02(i, this.A06, this.A04);
                this.A07 = nowMs;
                this.A06 = 0L;
            }
            int sampleElapsedTimeMs3 = this.A03;
            this.A03 = sampleElapsedTimeMs3 - 1;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06715t
    public final synchronized void AGH(@MetaExoPlayerCustomization InterfaceC2336pF interfaceC2336pF, C06605i c06605i, boolean z3, boolean z6) {
        if (A04(c06605i, z3)) {
            if (this.A03 == 0) {
                this.A07 = this.A0B.A6J();
            }
            this.A03++;
        }
    }
}
