package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.anythink.basead.exoplayer.b;
import com.facebook.ads.androidx.media3.common.Timeline;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07609m extends Timeline {
    public static byte[] A0D;
    public static final C2389q7 A0E;
    public static final Object A0F;
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C2392qA A07;
    public final C2389q7 A08;
    public final Object A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0D = new byte[]{-79, -57, -52, -59, -54, -61, -82, -61, -48, -57, -51, -62, -78, -57, -53, -61, -54, -57, -52, -61};
    }

    static {
        A01();
        A0F = new Object();
        A0E = new C05962u().A03(A00(0, 20, 44)).A00(Uri.EMPTY).A05();
    }

    public C07609m(long j6, long j9, long j10, long j11, long j12, long j13, long j14, boolean z3, boolean z6, boolean z9, Object obj, C2389q7 c2389q7, C2392qA c2392qA) {
        this.A02 = j6;
        this.A06 = j9;
        this.A00 = j10;
        this.A01 = j11;
        this.A04 = j12;
        this.A05 = j13;
        this.A03 = j14;
        this.A0B = z3;
        this.A0A = z6;
        this.A0C = z9;
        this.A09 = obj;
        this.A08 = (C2389q7) AbstractC06243y.A01(c2389q7);
        this.A07 = c2392qA;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C07609m(long j6, long j9, long j10, long j11, boolean z3, boolean z6, boolean z9, Object obj, C2389q7 c2389q7) {
        this(b.f6382b, b.f6382b, b.f6382b, j6, j9, j10, j11, z3, z6, false, obj, c2389q7, r0);
        C2392qA c2392qA;
        if (z9) {
            c2392qA = c2389q7.A02;
        } else {
            c2392qA = null;
        }
    }

    public C07609m(long j6, boolean z3, boolean z6, boolean z9, Object obj, C2389q7 c2389q7) {
        this(j6, j6, 0L, 0L, z3, z6, z9, obj, c2389q7);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A06() {
        return 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A07() {
        return 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0A(Object obj) {
        return A0F.equals(obj) ? 0 : -1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final C2367pl A0I(int i, C2367pl c2367pl, boolean z3) {
        AbstractC06243y.A00(i, 0, 1);
        return c2367pl.A0F(null, z3 ? A0F : null, 0, this.A01, -this.A05);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final C2365pj A0L(int i, C2365pj c2365pj, long j6) {
        AbstractC06243y.A00(i, 0, 1);
        long j9 = this.A03;
        if (this.A0A && !this.A0C && j6 != 0) {
            if (this.A04 == b.f6382b) {
                j9 = b.f6382b;
            } else {
                j9 += j6;
                if (j9 > this.A04) {
                    j9 = b.f6382b;
                }
            }
        }
        return c2365pj.A07(C2365pj.A0K, this.A08, this.A09, this.A02, this.A06, b.f6382b, this.A0B, this.A0A, null, j9, this.A04, 0, 0, this.A05);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final Object A0M(int i) {
        AbstractC06243y.A00(i, 0, 1);
        return A0F;
    }
}
