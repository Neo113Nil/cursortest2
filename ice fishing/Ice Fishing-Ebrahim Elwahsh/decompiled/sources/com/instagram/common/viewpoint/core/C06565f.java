package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

@MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
/* renamed from: com.facebook.ads.redexgen.X.5f, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06565f {
    public static byte[] A0A;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public ML A06;
    public String A07;
    public Map<String, String> A08;
    public byte[] A09;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-35, -15, -18, -87, -2, -5, -14, -87, -10, -2, -4, -3, -87, -21, -18, -87, -4, -18, -3, -73};
    }

    public C06565f() {
        this.A01 = 1;
        this.A08 = Collections.emptyMap();
        this.A02 = -1L;
    }

    @MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
    public C06565f(C06595i c06595i) {
        this.A05 = c06595i.A06;
        this.A04 = c06595i.A05;
        this.A01 = c06595i.A01;
        this.A09 = c06595i.A0A;
        this.A08 = c06595i.A09;
        this.A03 = c06595i.A04;
        this.A02 = c06595i.A03;
        this.A07 = c06595i.A08;
        this.A00 = c06595i.A00;
        this.A06 = c06595i.A07;
    }

    public final C06565f A02(int i) {
        this.A00 = i;
        return this;
    }

    public final C06565f A03(long j9) {
        this.A02 = j9;
        return this;
    }

    public final C06565f A04(long j9) {
        this.A03 = j9;
        return this;
    }

    public final C06565f A05(long j9) {
        this.A04 = j9;
        return this;
    }

    public final C06565f A06(Uri uri) {
        this.A05 = uri;
        return this;
    }

    @MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
    public final C06565f A07(ML ml) {
        this.A06 = ml;
        return this;
    }

    public final C06565f A08(String str) {
        this.A07 = str;
        return this;
    }

    @MetaExoPlayerCustomization("D50990955; Ensure that fbDataSpecExtension is not null")
    public final C06595i A09() {
        ML ml;
        AbstractC06233y.A03(this.A05, A00(0, 20, 122));
        Uri uri = this.A05;
        long j9 = this.A04;
        int i = this.A01;
        byte[] bArr = this.A09;
        Map<String, String> map = this.A08;
        long j10 = this.A03;
        long j11 = this.A02;
        String str = this.A07;
        int i4 = this.A00;
        if (this.A06 != null) {
            ml = this.A06;
        } else {
            ml = new ML();
        }
        return new C06595i(uri, j9, i, bArr, map, j10, j11, str, i4, ml);
    }
}
